package X;

import Y.AkS492S0100000_33;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS151S0201000_33;
import kotlin.jvm.internal.AwS170S0101000_33;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: renamed from: X.1AIf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2177071AIf implements InterfaceC2177261AIy {
    public final Context LIZ;
    public final C1246110iX3 LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final float LJ;
    public final float LJFF;
    public final int LJI;
    public final int LJII;
    public final boolean LJIIIIZZ;
    public final EnumC2177131AIl LJIIIZ;
    public final boolean LJIIJ;
    public final boolean LJIIJJI;
    public final boolean LJIIL;
    public final int LJIILJJIL;
    public final C01GW LJIILLIIL;
    public final C01GW LJIL;
    public final C01GW LJJI;
    public final C01GW LJJIFFI;
    public final C1607010rv9 LJJIIJZLJL;
    public final int LJJIIZ;
    public final int LJJIIZI;
    public boolean LJJIJIIJI;
    public long LJJIJIIJIL;
    public final C01GW LJIILIIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4146));
    public final int LJIILL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
    public final C01GW LJIIZILJ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4144));
    public final C01GW LJIJ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4140));
    public final C01GW LJIJI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4145));
    public final C01GW LJIJJ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4149));
    public final C01GW LJIJJLI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4147));
    public final C01GW LJJ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4148));
    public final C01GW LJJII = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4141));
    public final C01GW LJJIII = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4142));
    public final C01GW LJJIIJ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4143));
    public long LJJIJ = Long.MAX_VALUE;
    public String LJJIJIL = "complete";

    @Override // X.InterfaceC2177261AIy
    public final Bitmap LIZ() {
        return (Bitmap) this.LJJIIJ.getValue();
    }

    @Override // X.InterfaceC2177261AIy
    public final C11NZ<Bitmap> LIZIZ() {
        this.LJJIJIL = "incomplete";
        this.LJJIJ = System.nanoTime();
        this.LJJIJIIJI = false;
        this.LJJIJIIJIL = 0L;
        if (this.LJIIJ) {
            C2177171AIp c2177171AIp = C2177171AIp.LIZ;
            Bitmap bitmap = C2177171AIp.LIZIZ.get(LJIILJJIL());
            if (bitmap != null) {
                this.LJJIJIIJI = true;
                this.LJJIJIL = "complete";
                LJIILL("separate");
                return C11NZ.LJJJJZ(bitmap);
            }
        }
        return C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.1AIg
            @Override // X.InterfaceC1478005qU
            public final void subscribe(C09AJ<Bitmap> c09aj) {
                C1C7U.LIZ("AvatarUnionImpl@257a.drawSeparately$2");
                int iLJI = this.LIZ.LJI();
                C2177071AIf c2177071AIf = this.LIZ;
                final ArrayList arrayList = new ArrayList(iLJI);
                for (int i = 0; i < iLJI; i++) {
                    arrayList.add(c2177071AIf.LJIIIIZZ());
                }
                final C118300cf c118300cf = new C118300cf();
                final C118300cf c118300cf2 = new C118300cf();
                final Object obj = new Object();
                List list = (List) this.LIZ.LJIILIIL.getValue();
                final C2177071AIf c2177071AIf2 = this.LIZ;
                final int i2 = 0;
                for (Object obj2 : list) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        if (obj2 instanceof Bitmap) {
                            synchronized (obj) {
                                try {
                                    c118300cf.element++;
                                    arrayList.set(i2, obj2);
                                    Bitmap bitmapLJFF = c2177071AIf2.LJFF(arrayList);
                                    c09aj.onNext(bitmapLJFF);
                                    int i4 = c118300cf2.element + 1;
                                    c118300cf2.element = i4;
                                    if (i4 == c2177071AIf2.LJI()) {
                                        if (c118300cf.element == c2177071AIf2.LJI() && c2177071AIf2.LJIIJ) {
                                            C2177171AIp.LIZ.LIZ(bitmapLJFF, c2177071AIf2.LJIILJJIL());
                                        }
                                        c2177071AIf2.LJJIJIL = "incomplete";
                                        c09aj.onComplete();
                                    }
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                        } else if (obj2 instanceof UrlModel) {
                            c2177071AIf2.getClass();
                            final C19482611Ke c19482611Ke = (C19482611Ke) c09aj;
                            AbstractC19484711Kz.LJII(new C2177111AIj((UrlModel) obj2, c2177071AIf2, System.currentTimeMillis())).LJJIJIIJI(C11S5.LIZ()).LJJ(C11S5.LIZIZ).LJJIIJZLJL(new C09JN() { // from class: X.1AIh
                                @Override // X.C09JN
                                public final void accept(Object obj3) {
                                    C1C7U.LIZ("AvatarUnionImpl@257a.drawSeparately$2$1$d$1");
                                    Object obj4 = obj;
                                    C118300cf c118300cf3 = c118300cf;
                                    List<Bitmap> list2 = arrayList;
                                    int i5 = i2;
                                    C2177071AIf c2177071AIf3 = c2177071AIf2;
                                    C09AJ<Bitmap> c09aj2 = c19482611Ke;
                                    C118300cf c118300cf4 = c118300cf2;
                                    synchronized (obj4) {
                                        try {
                                            if (obj3 != null) {
                                                c118300cf3.element++;
                                                list2.set(i5, obj3);
                                            } else {
                                                list2.set(i5, c2177071AIf3.LJIIIIZZ());
                                            }
                                            Bitmap bitmapLJFF2 = c2177071AIf3.LJFF(list2);
                                            c09aj2.onNext(bitmapLJFF2);
                                            int i6 = c118300cf4.element + 1;
                                            c118300cf4.element = i6;
                                            if (i6 == c2177071AIf3.LJI()) {
                                                if (c118300cf3.element == c2177071AIf3.LJI() && c2177071AIf3.LJIIJ) {
                                                    C2177171AIp.LIZ.LIZ(bitmapLJFF2, c2177071AIf3.LJIILJJIL());
                                                }
                                                c2177071AIf3.LJJIJIL = "complete";
                                                c09aj2.onComplete();
                                            }
                                        } catch (Throwable th2) {
                                            TryCatchGuardChecker.doCheck(th2);
                                            throw th2;
                                        }
                                    }
                                    C1C7U.LIZIZ("AvatarUnionImpl@257a.drawSeparately$2$1$d$1");
                                }
                            });
                        }
                        i2 = i3;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                C1C7U.LIZIZ("AvatarUnionImpl@257a.drawSeparately$2");
            }
        }).LJL(C11S5.LIZIZ).LJJIJL(new C2189721Amw(this, 3));
    }

    @Override // X.InterfaceC2177261AIy
    public final Bitmap LIZJ() {
        C2177171AIp c2177171AIp = C2177171AIp.LIZ;
        Bitmap bitmap = C2177171AIp.LIZIZ.get(LJIILJJIL());
        if (bitmap != null) {
            return bitmap;
        }
        return null;
    }

    @Override // X.InterfaceC2177261AIy
    public final C11NZ<Bitmap> LIZLLL() {
        this.LJJIJIL = "incomplete";
        this.LJJIJ = System.nanoTime();
        this.LJJIJIIJI = false;
        this.LJJIJIIJIL = 0L;
        if (!(this.LIZJ > 0)) {
            "Failed requirement.".toString();
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.LJJIIJZLJL.LIZ < 0) {
            "Failed requirement.".toString();
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.LIZLLL <= 0) {
            "Failed requirement.".toString();
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.LJ < 0.0f) {
            "Failed requirement.".toString();
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.LJFF < 0.0f) {
            "Failed requirement.".toString();
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.LJIIJ) {
            C2177171AIp c2177171AIp = C2177171AIp.LIZ;
            Bitmap bitmap = C2177171AIp.LIZIZ.get(LJIILJJIL());
            if (bitmap != null) {
                this.LJJIJIIJI = true;
                this.LJJIJIL = "complete";
                LJIILL("overall");
                return C11NZ.LJJJJZ(bitmap);
            }
        }
        List list = (List) this.LJIILIIL.getValue();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (Object obj : list) {
            arrayList.add(obj instanceof UrlModel ? AbstractC19484711Kz.LJII(new C2177111AIj((UrlModel) obj, this, System.currentTimeMillis())).LJJIJIIJI(C11S5.LIZ()) : obj instanceof Bitmap ? AbstractC19484711Kz.LJIJJLI(obj) : AbstractC19484711Kz.LJIILLIIL(new NullPointerException("Source is neither UrlModel nor Bitmap")));
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((AbstractC19484711Kz) it2.next()).LJJIJLIJ());
        }
        return C11NZ.LJLL(arrayList2, new AkS492S0100000_33(this, 0)).LJL(C11S5.LIZIZ).LJJIJL(new C2189721Amw(this, 2));
    }

    public final int LJI() {
        return ((Number) this.LJIJ.getValue()).intValue();
    }

    public final List<C2177191AIr> LJII() {
        return (List) this.LJJII.getValue();
    }

    public final Bitmap LJIIIIZZ() {
        return (Bitmap) this.LJJIII.getValue();
    }

    public final int LJIIIZ() {
        return ((Number) this.LJJI.getValue()).intValue();
    }

    public final int LJIIJ() {
        return ((Number) this.LJIJI.getValue()).intValue();
    }

    public final int LJIIJJI() {
        return ((Number) this.LJIJJLI.getValue()).intValue();
    }

    public final String LJIILJJIL() {
        return (String) this.LJJ.getValue();
    }

    public final Bitmap LJFF(List<Bitmap> list) {
        int iIntValue;
        int iIntValue2;
        Paint.Align align;
        int iIntValue3;
        int iIntValue4;
        int iIntValue5;
        int iIntValue6;
        int iLJI;
        int iIntValue7;
        long jNanoTime = System.nanoTime();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((Number) this.LJJIFFI.getValue()).intValue(), LJIIIZ(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        int iLJI2 = LJI();
        for (int i = 0; i < iLJI2; i++) {
            if (i < LJII().size()) {
                C1607010rv9 c1607010rv9 = this.LJJIIJZLJL;
                if (this.LJIIJJI) {
                    iLJI = i;
                } else {
                    iLJI = (LJI() - 1) - i;
                }
                c1607010rv9.LJI = iLJI;
                if (i < list.size()) {
                    LJ(canvas, (Bitmap) ListProtector.get(list, i), (C2177191AIr) ListProtector.get(LJII(), i));
                }
                C2177191AIr c2177191AIr = (C2177191AIr) ListProtector.get(LJII(), i);
                int i2 = this.LJJIIJZLJL.LIZJ;
                if (i2 > 0) {
                    float f = this.LJJIIZI - (i2 / 2.0f);
                    if (f > 0.0f) {
                        Paint paint = new Paint();
                        paint.setAntiAlias(true);
                        paint.setStyle(Paint.Style.STROKE);
                        paint.setStrokeWidth(this.LJJIIJZLJL.LIZJ);
                        Integer numLIZ = this.LJJIIJZLJL.LIZ();
                        if (numLIZ != null) {
                            Integer numLIZJ = C1308910kAL.LIZJ(numLIZ.intValue(), this.LIZ);
                            if (numLIZJ != null) {
                                iIntValue7 = numLIZJ.intValue();
                            } else {
                                iIntValue7 = 0;
                            }
                            paint.setColor(iIntValue7);
                        }
                        Matrix matrix = new Matrix();
                        double d = 2.0f;
                        matrix.setTranslate(c2177191AIr.LIZ - (f / ((float) Math.sqrt(d))), c2177191AIr.LIZIZ - (f / ((float) Math.sqrt(d))));
                        Shader shaderLIZIZ = this.LJJIIJZLJL.LIZIZ();
                        if (shaderLIZIZ != null) {
                            shaderLIZIZ.setLocalMatrix(matrix);
                            paint.setShader(shaderLIZIZ);
                        }
                        canvas.drawCircle(c2177191AIr.LIZ, c2177191AIr.LIZIZ, f, paint);
                    }
                }
            }
        }
        int i3 = C2177121AIk.LIZ[this.LJIIIZ.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 3 && LJIIJJI() != -1) {
                    int iLJIIJJI = LJIIJJI();
                    C2177191AIr c2177191AIr2 = (C2177191AIr) C13LP.LJJLIIIJJI(LJII());
                    Paint paint2 = new Paint();
                    paint2.setAntiAlias(true);
                    Integer numLIZJ2 = C1308910kAL.LIZJ(this.LJI, this.LIZ);
                    if (numLIZJ2 != null) {
                        iIntValue5 = numLIZJ2.intValue();
                    } else {
                        iIntValue5 = 0;
                    }
                    paint2.setColor(iIntValue5);
                    paint2.setStyle(Paint.Style.FILL);
                    canvas.drawCircle(c2177191AIr2.LIZ, c2177191AIr2.LIZIZ, this.LJJIIZ, paint2);
                    String strLJIIL = LJIIL(iLJIIJJI);
                    int iLJIILIIL = LJIILIIL(iLJIIJJI);
                    Typeface typefaceLIZIZ = C1697580uHE.LIZIZ(0.0f, 500, 17.0f, 0.0f, Float.valueOf(16.0f), 0.0f, 0, null, 224);
                    Paint textPaint = new TextPaint();
                    textPaint.setAntiAlias(true);
                    float f2 = iLJIILIIL;
                    textPaint.setTextSize(f2);
                    Integer numLIZJ3 = C1308910kAL.LIZJ(this.LJII, this.LIZ);
                    if (numLIZJ3 != null) {
                        iIntValue6 = numLIZJ3.intValue();
                    } else {
                        iIntValue6 = 0;
                    }
                    textPaint.setColor(iIntValue6);
                    textPaint.setTextAlign(Paint.Align.CENTER);
                    textPaint.setTypeface(typefaceLIZIZ);
                    textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
                    canvas.drawText(strLJIIL, c2177191AIr2.LIZ, c2177191AIr2.LIZIZ + (f2 / 3.0f), textPaint);
                }
            } else if (LJIIJ() > 0) {
                int iLJIIJJI2 = LJIIJJI();
                int i4 = this.LJJIIZI * 2;
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i4, i4, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                String strLJIIL2 = LJIIL(iLJIIJJI2);
                int iLJIILIIL2 = LJIILIIL(iLJIIJJI2);
                Paint paint3 = new Paint();
                paint3.setAntiAlias(true);
                paint3.setStyle(Paint.Style.FILL);
                Integer numLIZJ4 = C1308910kAL.LIZJ(this.LJI, this.LIZ);
                if (numLIZJ4 != null) {
                    iIntValue3 = numLIZJ4.intValue();
                } else {
                    iIntValue3 = 0;
                }
                paint3.setColor(iIntValue3);
                float f3 = i4;
                canvas2.drawRect(0.0f, 0.0f, f3, f3, paint3);
                Typeface typefaceLIZIZ2 = C1697580uHE.LIZIZ(0.0f, 500, 17.0f, 0.0f, Float.valueOf(16.0f), 0.0f, 0, null, 224);
                TextPaint textPaint2 = new TextPaint();
                textPaint2.setAntiAlias(true);
                float f4 = iLJIILIIL2;
                textPaint2.setTextSize(f4);
                Integer numLIZJ5 = C1308910kAL.LIZJ(this.LJII, this.LIZ);
                if (numLIZJ5 != null) {
                    iIntValue4 = numLIZJ5.intValue();
                } else {
                    iIntValue4 = 0;
                }
                textPaint2.setColor(iIntValue4);
                textPaint2.setTextAlign(Paint.Align.CENTER);
                textPaint2.setTypeface(typefaceLIZIZ2);
                textPaint2.setStyle(Paint.Style.FILL);
                float f5 = this.LJJIIZI;
                canvas2.drawText(strLJIIL2, f5, (f4 / 3.0f) + f5, textPaint2);
                LJ(canvas, bitmapCreateBitmap2, (C2177191AIr) C13LP.LJJLIIIJJI(LJII()));
            }
        } else if (LJIIJ() > 0) {
            String strLJIIL3 = LJIIL(LJIIJJI());
            if (this.LJIIJJI == this.LJIIIIZZ) {
                iIntValue = (((C2177191AIr) C13LP.LJJLIIIJJI(LJII())).LIZ + ((Number) this.LJIILLIIL.getValue()).intValue()) - this.LJIILL;
            } else {
                iIntValue = (((C2177191AIr) C13LP.LJJLIIIJJI(LJII())).LIZ - ((Number) this.LJIILLIIL.getValue()).intValue()) + this.LJIILL;
            }
            int i5 = ((C2177191AIr) C13LP.LJJLIIIJJI(LJII())).LIZIZ;
            Typeface typefaceLIZIZ3 = C1697580uHE.LIZIZ(0.0f, 500, 17.0f, 0.0f, Float.valueOf(16.0f), 0.0f, 0, null, 224);
            C444890HcV c444890HcV = new C444890HcV();
            c444890HcV.setAntiAlias(true);
            Integer numLIZJ6 = C1308910kAL.LIZJ(this.LJII, this.LIZ);
            if (numLIZJ6 != null) {
                iIntValue2 = numLIZJ6.intValue();
            } else {
                iIntValue2 = 0;
            }
            c444890HcV.setColor(iIntValue2);
            if (this.LJIIIIZZ == this.LJIIJJI) {
                align = Paint.Align.RIGHT;
            } else {
                align = Paint.Align.LEFT;
            }
            c444890HcV.setTextAlign(align);
            c444890HcV.setTypeface(typefaceLIZIZ3);
            c444890HcV.setStyle(Paint.Style.FILL);
            c444890HcV.LIZ(61);
            canvas.drawText(strLJIIL3, iIntValue, (i5 + ((c444890HcV.descent() - c444890HcV.ascent()) / 2)) - c444890HcV.descent(), c444890HcV);
        }
        this.LJJIJIIJIL += System.nanoTime() - jNanoTime;
        return bitmapCreateBitmap;
    }

    public final String LJIIL(int i) {
        String str;
        if (this.LJIIIIZZ) {
            str = "%d+";
        } else {
            str = "+%d";
        }
        Object[] objArr = new Object[1];
        if (i > 99) {
            i = 99;
        } else if (i < 1) {
            i = 1;
        }
        objArr[0] = Integer.valueOf(i);
        return C786410Ut5.j4(str, Arrays.copyOf(objArr, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJIILIIL(int r5) {
        /*
            r4 = this;
            r0 = 10
            if (r5 < 0) goto L1f
            if (r5 >= r0) goto L15
            int r0 = r4.LJJIIZI
            double r2 = (double) r0
            r0 = 4608533498688228557(0x3ff4cccccccccccd, double:1.3)
            double r2 = r2 * r0
            float r0 = r4.LJFF
            double r0 = (double) r0
            double r2 = r2 * r0
            int r0 = (int) r2
            return r0
        L15:
            r0 = 100
            if (r5 >= r0) goto L1f
            int r0 = r4.LJJIIZI
            float r1 = (float) r0
            float r0 = r4.LJFF
            goto L24
        L1f:
            int r0 = r4.LJJIIZI
            float r1 = (float) r0
            float r0 = r4.LJFF
        L24:
            float r1 = r1 * r0
            int r0 = (int) r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2177071AIf.LJIILIIL(int):int");
    }

    public final void LJIILL(String str) {
        long jNanoTime = System.nanoTime();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("draw_method", str);
        c2344009Gk.LIZLLL(jNanoTime - this.LJJIJ, "total_draw_time");
        c2344009Gk.LIZLLL(this.LJJIJIIJIL, "internal_draw_time");
        c2344009Gk.LJ(Boolean.valueOf(this.LJJIJIIJI), "hit_cache");
        c2344009Gk.LIZJ(C2177171AIp.LIZIZ.size(), "cache_occupancy");
        c2344009Gk.LIZJ(this.LIZJ, "config_avatar_width");
        c2344009Gk.LIZJ(this.LJJIIJZLJL.LIZ, "config_stroke_width");
        c2344009Gk.LIZJ(this.LIZLLL, "config_max_circle_num");
        c2344009Gk.LIZIZ(this.LJ, "config_circle_interval");
        c2344009Gk.LIZIZ(this.LJFF, "config_text_size_scale");
        c2344009Gk.LIZJ(this.LJI, "config_number_circle_bg_color");
        c2344009Gk.LIZJ(this.LJII, "config_number_circle_text_color");
        c2344009Gk.LJ(Boolean.valueOf(this.LJIIIIZZ), "config_is_rtl");
        c2344009Gk.LJ(Boolean.valueOf(this.LJIIJ), "config_enable_cache");
        c2344009Gk.LIZJ(LJI(), "avatar_circle_num");
        c2344009Gk.LIZJ(LJIIJ(), "number_circle_num");
        c2344009Gk.LIZJ(LJIIJJI(), "plus_number");
        c2344009Gk.LJIIIIZZ("draw_result", this.LJJIJIL);
        C20684815ws.LJIILLIIL("avatar_union_draw", c2344009Gk.LIZ);
    }

    public final void LJ(Canvas canvas, Bitmap bitmap, C2177191AIr c2177191AIr) {
        int iIntValue;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        canvas.drawCircle(c2177191AIr.LIZ, c2177191AIr.LIZIZ, this.LJJIIZI, paint);
        Integer num = this.LJJIIJZLJL.LIZIZ;
        if (num != null) {
            int color = paint.getColor();
            paint.setStyle(Paint.Style.FILL);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
            Integer numLIZJ = C1308910kAL.LIZJ(num.intValue(), this.LIZ);
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            paint.setColor(iIntValue);
            canvas.drawCircle(c2177191AIr.LIZ, c2177191AIr.LIZIZ, this.LJJIIZI, paint);
            paint.setColor(color);
        }
        int i = this.LIZJ;
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i, true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmapCreateScaledBitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        bitmapShader.getLocalMatrix(matrix);
        int i2 = c2177191AIr.LIZ;
        int i3 = this.LJJIIZ;
        matrix.setTranslate(i2 - i3, c2177191AIr.LIZIZ - i3);
        bitmapShader.setLocalMatrix(matrix);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        paint.setShader(bitmapShader);
        canvas.drawCircle(c2177191AIr.LIZ, c2177191AIr.LIZIZ, this.LJJIIZ, paint);
    }

    public C2177071AIf(Context context, C1246110iX3 c1246110iX3, int i, int i2, Integer num, int i3, Integer num2, Shader shader, int i4, float f, float f2, int i5, int i6, boolean z, EnumC2177131AIl enumC2177131AIl, boolean z2, boolean z3, boolean z4, Map<Integer, ? extends InterfaceC1600660rku> map) {
        this.LIZ = context;
        this.LIZIZ = c1246110iX3;
        this.LIZJ = i;
        this.LIZLLL = i4;
        this.LJ = f;
        this.LJFF = f2;
        this.LJI = i5;
        this.LJII = i6;
        this.LJIIIIZZ = z;
        this.LJIIIZ = enumC2177131AIl;
        this.LJIIJ = z2;
        this.LJIIJJI = z3;
        this.LJIIL = z4;
        this.LJIILJJIL = i * 2;
        this.LJIILLIIL = C452501pT.LIZIZ(new AwS170S0101000_33(i2, this, 10));
        this.LJIL = C452501pT.LIZIZ(new AwS151S0201000_33(this, i2, num, 0));
        this.LJJI = C452501pT.LIZIZ(new AwS170S0101000_33(i2, this, 8));
        this.LJJIFFI = C452501pT.LIZIZ(new AwS170S0101000_33(i2, this, 9));
        this.LJJIIJZLJL = new C1607010rv9(i2, num, i3, num2, shader, map);
        int i7 = i / 2;
        this.LJJIIZ = i7;
        this.LJJIIZI = i7 + i2;
    }
}
