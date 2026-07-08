package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ReplacementSpan;
import android.view.View;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.api.revenue.strategy.IRevenueStrategyService;
import com.bytedance.android.livesdk.livesetting.revenuestrategy.TpTextFontSizeBugfixSetting;
import com.bytedance.android.livesdkapi.host.IHostFrescoHelper;
import com.bytedance.android.livesdkapi.host.IHostTux;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.Intrinsics;
import ttpobfuscated.e3;
import webcast.data.TPClickableText;
import webcast.data.TPCountDownConfig;
import webcast.data.TPFormat;
import webcast.data.TPTextPiece;
import webcast.data.TPTextPieceImage;
import webcast.data.TouchPointColor;
import webcast.data.TouchPointPadding;

/* JADX INFO: renamed from: X.0fs7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1143850fs7 {
    public static final C1143850fs7 LIZ = new C1143850fs7();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(175));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(176));

    /* JADX WARN: Removed duplicated region for block: B:9:0x0019 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:3:0x0001, B:10:0x001e, B:12:0x0022, B:14:0x002c, B:15:0x0030, B:8:0x0014, B:9:0x0019, B:6:0x000c), top: B:29:0x0001, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZIZ(java.lang.String r3) {
        /*
            r2 = 0
            java.lang.String r1 = "tux:"
            r0 = 1
            boolean r0 = kotlin.text.u.LJJIIJZLJL(r3, r1, r0)     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L19
            if (r3 == 0) goto L19
            java.lang.Class<com.bytedance.android.livesdkapi.host.IHostTux> r0 = com.bytedance.android.livesdkapi.host.IHostTux.class
            X.006A r1 = X.C1161920gLG.LIZJ(r0)     // Catch: java.lang.Throwable -> L13
            goto L1e
        L13:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L38
            r1 = r2
            goto L1e
        L19:
            int r0 = android.graphics.Color.parseColor(r3)     // Catch: java.lang.Throwable -> L38
            goto L30
        L1e:
            com.bytedance.android.livesdkapi.host.IHostTux r1 = (com.bytedance.android.livesdkapi.host.IHostTux) r1     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L19
            android.content.Context r0 = X.C497740JfY.LJII()     // Catch: java.lang.Throwable -> L38
            java.lang.Integer r0 = r1.gA(r0, r3)     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L19
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L38
        L30:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L38
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L38
            goto L44
        L38:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L44:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto L4b
            r2 = r1
        L4b:
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L54
            int r0 = r2.intValue()
            return r0
        L54:
            r0 = 2131103614(0x7f060f7e, float:1.78197E38)
            int r0 = X.C497740JfY.LIZJ(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1143850fs7.LIZIZ(java.lang.String):int");
    }

    public static CharSequence LJI(TPTextPiece tPTextPiece) {
        C1134510fd3 c1134510fd3U21;
        String string;
        int i = tPTextPiece.type;
        if (i != EnumC1143860fs8.CLICK_SPAN.getPieceType() && i != EnumC1143860fs8.COUNT_DOWN_SPAN.getPieceType() && i != EnumC1143860fs8.STRING.getPieceType()) {
            ImageModel imageModel = null;
            if (i == EnumC1143860fs8.DEFAULT_LOCATION.getPieceType()) {
                IRevenueStrategyService iRevenueStrategyServiceLIZIZ = C1126800fQc.LIZIZ();
                if (iRevenueStrategyServiceLIZIZ != null && (c1134510fd3U21 = iRevenueStrategyServiceLIZIZ.u21()) != null && (string = c1134510fd3U21.LIZJ().toString()) != null && string.length() > 0) {
                    return string;
                }
                return tPTextPiece.stringValue;
            }
            if (i == EnumC1143860fs8.IMAGE.getPieceType()) {
                TPTextPieceImage tPTextPieceImage = tPTextPiece.imageValue;
                IHostFrescoHelper iHostFrescoHelper = (IHostFrescoHelper) LIZJ.getValue();
                if (iHostFrescoHelper != null) {
                    if (tPTextPieceImage != null) {
                        imageModel = tPTextPieceImage.image;
                    }
                    String strQh0 = iHostFrescoHelper.qh0(imageModel);
                    if (strQh0 != null && C500260Jjc.LJJIIZ(strQh0)) {
                        return e3.d;
                    }
                    return "";
                }
                return "";
            }
            return "";
        }
        return tPTextPiece.stringValue;
    }

    public static SpannableStringBuilder LIZ(List list, TPFormat tPFormat) {
        String strQh0;
        int iLIZIZ;
        int width;
        Resources resources;
        ImageModel imageModel;
        if (list.isEmpty()) {
            return (SpannableStringBuilder) LIZIZ.getValue();
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            spannableStringBuilder.append(((C1143870fs9) it2.next()).LIZ);
        }
        C1143850fs7 c1143850fs7 = LIZ;
        int length = spannableStringBuilder.length();
        c1143850fs7.getClass();
        LJIIIIZZ(spannableStringBuilder, tPFormat, 0, length);
        if (tPFormat != null) {
            LJII(spannableStringBuilder, tPFormat, 0, spannableStringBuilder.length());
        }
        int i = 0;
        int length2 = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            ImageModel imageModel2 = null;
            if (i >= 0) {
                C1143870fs9 c1143870fs9 = (C1143870fs9) obj;
                CharSequence charSequence = c1143870fs9.LIZ;
                TPTextPiece tPTextPiece = c1143870fs9.LIZIZ;
                int length3 = charSequence.length() + length2;
                int i3 = tPTextPiece.type;
                if (i3 == EnumC1143860fs8.CLICK_SPAN.getPieceType()) {
                    final TPClickableText tPClickableText = (TPClickableText) C13LP.LJJJLL(tPTextPiece.clickSpan);
                    if (tPClickableText != null) {
                        LIZ.getClass();
                        C786410Ut5.o2(spannableStringBuilder, new AbstractC426530Gnz(tPClickableText) { // from class: X.0fsB
                            public final TPClickableText LL;
                            public long LLILLJJLI;

                            {
                                this.LL = tPClickableText;
                            }

                            @Override // android.text.style.ClickableSpan
                            public final void onClick(View view) {
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                if (jCurrentTimeMillis - this.LLILLJJLI > 300) {
                                    this.LLILLJJLI = jCurrentTimeMillis;
                                    C1126800fQc.LIZ.Wy0();
                                    C1143980fsK.LJ(view.getContext(), this.LL.schema);
                                }
                            }

                            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                            public final void updateDrawState(TextPaint textPaint) {
                                super.updateDrawState(textPaint);
                                textPaint.setColor(C497740JfY.LIZJ(R.attr.ezq));
                                textPaint.setUnderlineText(false);
                            }
                        }, length2, length3, 18);
                    }
                    TPFormat tPFormat2 = tPTextPiece.format;
                    if (tPFormat2 != null) {
                        LIZ.getClass();
                        LJIIIIZZ(spannableStringBuilder, tPFormat2, length2, length3);
                        LJII(spannableStringBuilder, tPFormat2, length2, length3);
                    }
                } else if (i3 == EnumC1143860fs8.STRING.getPieceType()) {
                    TPFormat tPFormat3 = tPTextPiece.format;
                    if (tPFormat3 != null) {
                        LIZ.getClass();
                        LJIIIIZZ(spannableStringBuilder, tPFormat3, length2, length3);
                        LJII(spannableStringBuilder, tPFormat3, length2, length3);
                    }
                } else if (i3 == EnumC1143860fs8.DEFAULT_LOCATION.getPieceType()) {
                    TPFormat tPFormat4 = tPTextPiece.format;
                    if (tPFormat4 != null) {
                        LIZ.getClass();
                        LJIIIIZZ(spannableStringBuilder, tPFormat4, length2, length3);
                        LJII(spannableStringBuilder, tPFormat4, length2, length3);
                    }
                    LIZ.getClass();
                    C786410Ut5.o2(spannableStringBuilder, new C1143900fsC(), length2, length3, 18);
                } else if (i3 == EnumC1143860fs8.IMAGE.getPieceType()) {
                    C1143850fs7 c1143850fs72 = LIZ;
                    TPTextPieceImage tPTextPieceImage = tPTextPiece.imageValue;
                    int i4 = length2 + 1;
                    c1143850fs72.getClass();
                    IHostFrescoHelper iHostFrescoHelper = (IHostFrescoHelper) LIZJ.getValue();
                    if (iHostFrescoHelper != null) {
                        if (tPTextPieceImage != null) {
                            imageModel = tPTextPieceImage.image;
                        } else {
                            imageModel = null;
                        }
                        strQh0 = iHostFrescoHelper.qh0(imageModel);
                    } else {
                        strQh0 = null;
                    }
                    if (C500260Jjc.LJJIIZ(strQh0) && strQh0 != null) {
                        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(strQh0);
                        if (tPTextPieceImage != null) {
                            imageModel2 = tPTextPieceImage.image;
                        }
                        if (bitmapDecodeFile != null && !bitmapDecodeFile.isRecycled() && spannableStringBuilder.length() != 0 && length2 >= 0 && length2 <= spannableStringBuilder.length() && length2 <= i4 && imageModel2 != null) {
                            Context contextLJII = C497740JfY.LJII();
                            if (imageModel2.getWidth() != 0 && imageModel2.getHeight() != 0) {
                                width = (int) C497740JfY.LIZIZ(imageModel2.getWidth());
                                iLIZIZ = (int) C497740JfY.LIZIZ(imageModel2.getHeight());
                            } else {
                                iLIZIZ = (int) C497740JfY.LIZIZ(20.0f);
                                if (bitmapDecodeFile.getHeight() > iLIZIZ) {
                                    width = (int) ((iLIZIZ / bitmapDecodeFile.getHeight()) * bitmapDecodeFile.getWidth());
                                } else {
                                    iLIZIZ = bitmapDecodeFile.getHeight();
                                    width = bitmapDecodeFile.getWidth();
                                }
                            }
                            if (contextLJII != null && (resources = contextLJII.getResources()) != null) {
                                BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, bitmapDecodeFile);
                                bitmapDrawable.setBounds(0, 0, width, iLIZIZ);
                                C786410Ut5.o2(spannableStringBuilder, new C416760GVu(bitmapDrawable), length2, i4, 33);
                            }
                        }
                    }
                } else if (i3 == EnumC1143860fs8.COUNT_DOWN_SPAN.getPieceType()) {
                    LIZ.getClass();
                    final TPCountDownConfig tPCountDownConfig = tPTextPiece.countdownConfig;
                    if (tPCountDownConfig != null) {
                        final TPFormat tPFormat5 = tPTextPiece.format;
                        C786410Ut5.o2(spannableStringBuilder, new ReplacementSpan(tPFormat5, tPCountDownConfig) { // from class: X.0fx1
                            public final TPFormat LL;
                            public final TPCountDownConfig LLILLJJLI;
                            public int LLILLL;
                            public float LLILZ;

                            public static C1146900fx2 LIZIZ(long j) {
                                long j2 = 60;
                                return new C1146900fx2(C19990113Jj.LJIJI(j, EnumC19990213Jk.HOURS), C19990113Jj.LJIIJ(j) % j2, C19990113Jj.LJIIJJI(j) % j2, C19990113Jj.LJIJI(j, EnumC19990213Jk.DAYS));
                            }

                            {
                                this.LL = tPFormat5;
                                this.LLILLJJLI = tPCountDownConfig;
                            }

                            public static Paint LIZJ(Paint paint, TPFormat tPFormat6) {
                                boolean z;
                                int color;
                                C006A c006aLIZJ;
                                if (tPFormat6 == null) {
                                    return paint;
                                }
                                String str = tPFormat6.color;
                                boolean z2 = true;
                                if (str.length() > 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                Integer numJJ1 = null;
                                if (!z) {
                                    str = null;
                                }
                                if (str != null) {
                                    C1143850fs7.LIZ.getClass();
                                    color = C1143850fs7.LIZIZ(str);
                                } else {
                                    color = paint.getColor();
                                }
                                String str2 = tPFormat6.tuxFont;
                                if (str2.length() <= 0) {
                                    z2 = false;
                                }
                                if (!z2) {
                                    str2 = null;
                                }
                                if (str2 != null) {
                                    try {
                                        c006aLIZJ = C1161920gLG.LIZJ(IHostTux.class);
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        c006aLIZJ = null;
                                    }
                                    IHostTux iHostTux = (IHostTux) c006aLIZJ;
                                    if (iHostTux != null) {
                                        numJJ1 = iHostTux.JJ1(str2);
                                    }
                                    if (numJJ1 != null) {
                                        int iIntValue = numJJ1.intValue();
                                        C444890HcV c444890HcV = new C444890HcV();
                                        c444890HcV.set(paint);
                                        c444890HcV.LIZ(iIntValue);
                                        c444890HcV.setColor(color);
                                        return c444890HcV;
                                    }
                                }
                                Paint paint2 = new Paint(paint);
                                paint2.setColor(color);
                                paint2.setTypeface(C1119920fFW.LIZIZ(tPFormat6.weight, 100));
                                return paint2;
                            }

                            @Override // android.text.style.ReplacementSpan
                            public final int getSize(Paint paint, CharSequence charSequence2, int i5, int i6, Paint.FontMetricsInt fontMetricsInt) {
                                float fLIZIZ;
                                boolean z;
                                C1146910fx3 c1146910fx3;
                                if (this.LLILLL == 0) {
                                    Paint paintLIZJ = LIZJ(paint, this.LL);
                                    TouchPointPadding touchPointPadding = this.LLILLJJLI.padding;
                                    if (touchPointPadding != null) {
                                        fLIZIZ = C418440Gaw.LIZIZ(Integer.valueOf(touchPointPadding.horizontal));
                                    } else {
                                        fLIZIZ = 0.0f;
                                    }
                                    long jLIZJ = this.LLILLJJLI.endTime - C158B.LIZJ();
                                    if (jLIZJ < 0) {
                                        jLIZJ = 0;
                                    }
                                    long jLJIIIIZZ = C19990313Jl.LJIIIIZZ(jLIZJ, EnumC19990213Jk.SECONDS);
                                    C1146900fx2 c1146900fx2LIZIZ = LIZIZ(jLJIIIIZZ);
                                    if (C19990113Jj.LJIJI(jLJIIIIZZ, EnumC19990213Jk.HOURS) > 24) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (z) {
                                        long j = c1146900fx2LIZIZ.LIZLLL;
                                        String strValueOf = String.valueOf(j);
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append(' ');
                                        sbLIZ.append(C497740JfY.LJIIJJI(2131755618, (int) j));
                                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                        float fMeasureText = paintLIZJ.measureText(strValueOf) + (fLIZIZ * 2.0f);
                                        c1146910fx3 = new C1146910fx3(paint.measureText(strLIZIZ) + fMeasureText, fMeasureText);
                                    } else {
                                        float fMeasureText2 = paintLIZJ.measureText("88:88:88") + (fLIZIZ * 2.0f);
                                        c1146910fx3 = new C1146910fx3(fMeasureText2, fMeasureText2);
                                    }
                                    this.LLILLL = Math.max(C814420VxA.LIZIZ(c1146910fx3.LIZ), this.LLILLL);
                                    this.LLILZ = Math.max(c1146910fx3.LIZIZ, this.LLILZ);
                                }
                                return this.LLILLL;
                            }

                            public final void LIZ(float f, float f2, float f3, float f4, Canvas canvas, Paint paint) {
                                float fMax = Math.max(f4, this.LLILZ);
                                this.LLILZ = fMax;
                                TouchPointColor touchPointColor = this.LLILLJJLI.backgroundColor;
                                if (touchPointColor != null) {
                                    C1143850fs7 c1143850fs73 = C1143850fs7.LIZ;
                                    String str = touchPointColor.light;
                                    c1143850fs73.getClass();
                                    int iLIZIZ2 = C1143850fs7.LIZIZ(str);
                                    float fLIZIZ = C418440Gaw.LIZIZ(Double.valueOf(this.LLILLJJLI.backgroundRadius));
                                    int color = paint.getColor();
                                    paint.setColor(iLIZIZ2);
                                    canvas.drawRoundRect(new RectF(f, f2, fMax + f, f3), fLIZIZ, fLIZIZ, paint);
                                    paint.setColor(color);
                                }
                            }

                            @Override // android.text.style.ReplacementSpan
                            public final void draw(Canvas canvas, CharSequence charSequence2, int i5, int i6, float f, int i7, int i8, int i9, Paint paint) {
                                float fLIZIZ;
                                boolean z;
                                Paint paintLIZJ = LIZJ(paint, this.LL);
                                TouchPointPadding touchPointPadding = this.LLILLJJLI.padding;
                                if (touchPointPadding != null) {
                                    fLIZIZ = C418440Gaw.LIZIZ(Integer.valueOf(touchPointPadding.horizontal));
                                } else {
                                    fLIZIZ = 0.0f;
                                }
                                long jLIZJ = this.LLILLJJLI.endTime - C158B.LIZJ();
                                if (jLIZJ < 0) {
                                    jLIZJ = 0;
                                }
                                long jLJIIIIZZ = C19990313Jl.LJIIIIZZ(jLIZJ, EnumC19990213Jk.SECONDS);
                                C1146900fx2 c1146900fx2LIZIZ = LIZIZ(jLJIIIIZZ);
                                if (C19990113Jj.LJIJI(jLJIIIIZZ, EnumC19990213Jk.HOURS) > 24) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    String strValueOf = String.valueOf(c1146900fx2LIZIZ.LIZLLL);
                                    int i10 = (int) c1146900fx2LIZIZ.LIZLLL;
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append(' ');
                                    sbLIZ.append(C497740JfY.LJIIJJI(2131755618, i10));
                                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                    float fMeasureText = paintLIZJ.measureText(strValueOf) + (2.0f * fLIZIZ);
                                    LIZ(f, i7, i9, fMeasureText, canvas, paint);
                                    float f2 = i8;
                                    canvas.drawText(strValueOf, f + fLIZIZ, f2, paintLIZJ);
                                    canvas.drawText(strLIZIZ, f + fMeasureText, f2, paint);
                                    return;
                                }
                                String strJ4 = C786410Ut5.j4("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(c1146900fx2LIZIZ.LIZ), Long.valueOf(c1146900fx2LIZIZ.LIZIZ), Long.valueOf(c1146900fx2LIZIZ.LIZJ)}, 3));
                                LIZ(f, i7, i9, paintLIZJ.measureText(strJ4) + (2.0f * fLIZIZ), canvas, paint);
                                canvas.drawText(strJ4, f + fLIZIZ, i8, paintLIZJ);
                            }
                        }, length2, length3, 18);
                    }
                } else {
                    EnumC1143860fs8.NORMAL_STRING.getPieceType();
                }
                length2 += charSequence.length();
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return spannableStringBuilder;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.text.SpannableStringBuilder LIZLLL(X.C1143850fs7 r3, webcast.data.TPText r4) {
        /*
            r3.getClass()
            java.lang.String r1 = r4.key
            int r0 = r1.length()
            if (r0 <= 0) goto L42
            r0 = 1
        Lc:
            r3 = 0
            if (r0 == 0) goto L3f
            X.0fNV r0 = X.C1124870fNV.LIZJ()
            r0.getClass()
            java.lang.String r2 = X.C1124870fNV.LIZIZ(r1)
            if (r2 == 0) goto L3f
            boolean r0 = X.C500260Jjc.LJJIIZ(r2)
            if (r0 == 0) goto L3f
        L22:
            java.util.List<webcast.data.TPTextPiece> r1 = r4.pieces
            webcast.data.TPFormat r0 = r4.format
            android.text.SpannableStringBuilder r0 = LJ(r2, r1, r0)
            X.01GW r2 = X.C1143850fs7.LIZIZ
            java.lang.Object r1 = r2.getValue()
            if (r0 != r1) goto L3e
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L44
            java.lang.Object r0 = r2.getValue()
            android.text.SpannableStringBuilder r0 = (android.text.SpannableStringBuilder) r0
        L3e:
            return r0
        L3f:
            java.lang.String r2 = r4.stringValue
            goto L22
        L42:
            r0 = 0
            goto Lc
        L44:
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1143850fs7.LIZLLL(X.0fs7, webcast.data.TPText):android.text.SpannableStringBuilder");
    }

    public static List LJFF(String str, List list) {
        String string;
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (list.isEmpty()) {
            return arrayList;
        }
        StringBuilder sb = new StringBuilder();
        C118300cf c118300cf = new C118300cf();
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            try {
                str = str;
                boolean z2 = true;
                if (i5 < str.length()) {
                    char cCharAt = str.charAt(i5);
                    int i7 = i6 + 1;
                    if (cCharAt != ':') {
                        if (cCharAt != '{') {
                            if (cCharAt != '}') {
                                sb.append(cCharAt);
                            } else {
                                if (i2 != i) {
                                    string = str.subSequence(i2, i6).toString();
                                } else {
                                    string = "string";
                                    i4 = CastIntegerProtector.parseInt(str.subSequence(i3, i6).toString());
                                }
                                if (i4 != i) {
                                    if (sb.length() <= 0) {
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z) {
                                        sb.delete(0, sb.length());
                                    }
                                    LIZ.getClass();
                                    TPTextPiece tPTextPieceLIZJ = LIZJ(i4, string, list);
                                    if (tPTextPieceLIZJ != null) {
                                        arrayList.add(new C1143870fs9(LJI(tPTextPieceLIZJ), tPTextPieceLIZJ));
                                    } else {
                                        C20441214yg.LJ("TPTextParser", "piece result is null !!! ");
                                    }
                                    c118300cf.element--;
                                    i2 = -1;
                                    i4 = -1;
                                } else {
                                    return arrayList;
                                }
                            }
                        } else {
                            int i8 = c118300cf.element + 1;
                            c118300cf.element = i8;
                            if (i8 == 1) {
                                if (sb.length() <= 0) {
                                    z2 = false;
                                }
                                if (z2) {
                                    String string2 = sb.toString();
                                    TPTextPiece tPTextPiece = new TPTextPiece();
                                    tPTextPiece.type = EnumC1143860fs8.NORMAL_STRING.getPieceType();
                                    arrayList.add(new C1143870fs9(string2, tPTextPiece));
                                    sb.setLength(0);
                                }
                                i3 = i7;
                            } else {
                                C470360IcU.LIZ(new AwS561S0100000_17(c118300cf, 391));
                                return arrayList;
                            }
                        }
                    } else {
                        int i9 = c118300cf.element;
                        if (i9 == 0) {
                            sb.append(cCharAt);
                        } else if (i9 == 1) {
                            i4 = CastIntegerProtector.parseInt(str.subSequence(i3, i6).toString());
                            i2 = i7;
                            i3 = -1;
                        } else {
                            C470360IcU.LIZ(new AwS561S0100000_17(c118300cf, 392));
                            return arrayList;
                        }
                    }
                    i5++;
                    i6 = i7;
                    i = -1;
                } else {
                    if (sb.length() <= 0) {
                        z2 = false;
                    }
                    if (z2) {
                        String string3 = sb.toString();
                        TPTextPiece tPTextPiece2 = new TPTextPiece();
                        tPTextPiece2.type = EnumC1143860fs8.NORMAL_STRING.getPieceType();
                        arrayList.add(new C1143870fs9(string3, tPTextPiece2));
                        sb.setLength(0);
                    }
                    return arrayList;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("parsePatternCore: error: ");
                sbLIZ.append(e);
                C20441214yg.LJ("TPTextParser", C2188811AlT.LIZIZ(sbLIZ));
                return C13BV.INSTANCE;
            }
        }
    }

    public static TPTextPiece LIZJ(int i, String str, List list) {
        EnumC1143860fs8 enumC1143860fs8;
        if (i >= 0 && i < list.size() && str.length() != 0 && !list.isEmpty()) {
            TPTextPiece tPTextPiece = (TPTextPiece) ListProtector.get(list, i);
            EnumC1143860fs8[] enumC1143860fs8ArrValues = EnumC1143860fs8.values();
            int length = enumC1143860fs8ArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    enumC1143860fs8 = enumC1143860fs8ArrValues[i2];
                    if (enumC1143860fs8.getPieceType() == tPTextPiece.type) {
                        break;
                    }
                    i2++;
                } else {
                    enumC1143860fs8 = EnumC1143860fs8.UNKNOWN;
                    break;
                }
            }
            if (Intrinsics.LJFF(str, enumC1143860fs8.getTag())) {
                return tPTextPiece;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("wrong tag ");
            sbLIZ.append(str);
            C20441214yg.LJ("TPTextParser", C2188811AlT.LIZIZ(sbLIZ));
        }
        return null;
    }

    public static SpannableStringBuilder LJ(String str, List list, TPFormat tPFormat) {
        boolean z;
        try {
            if (str.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return (SpannableStringBuilder) LIZIZ.getValue();
            }
            if (list.isEmpty()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                C1143850fs7 c1143850fs7 = LIZ;
                int length = spannableStringBuilder.length();
                c1143850fs7.getClass();
                LJIIIIZZ(spannableStringBuilder, tPFormat, 0, length);
                if (tPFormat != null) {
                    LJII(spannableStringBuilder, tPFormat, 0, spannableStringBuilder.length());
                    return spannableStringBuilder;
                }
                return spannableStringBuilder;
            }
            return LIZ(LJFF(str, list), tPFormat);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJI("TPTextParser", e);
            return (SpannableStringBuilder) LIZIZ.getValue();
        }
    }

    public static void LJII(Spannable spannable, TPFormat tPFormat, int i, int i2) {
        Integer numJJ1;
        String str = tPFormat.tuxFont;
        C006A c006aLIZJ = null;
        if (C500260Jjc.LJJIIZ(str) && str != null) {
            try {
                c006aLIZJ = C1161920gLG.LIZJ(IHostTux.class);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            IHostTux iHostTux = (IHostTux) c006aLIZJ;
            if (iHostTux != null && (numJJ1 = iHostTux.JJ1(str)) != null) {
                C786410Ut5.o2(spannable, new C444920HcY(numJJ1.intValue(), false), i, i2, 18);
                if (Unit.LIZ != null) {
                    return;
                }
            }
        }
        int i3 = tPFormat.weight;
        int i4 = tPFormat.fontSize;
        C1119920fFW.LJIIIIZZ(spannable, i, i2, 33, i3);
        if (i4 > 0 && TpTextFontSizeBugfixSetting.INSTANCE.enable()) {
            C786410Ut5.o2(spannable, new AbsoluteSizeSpan(i4, true), i, i2, 33);
        }
    }

    public static void LJIIIIZZ(Spannable spannable, TPFormat tPFormat, int i, int i2) {
        String str;
        if (tPFormat != null && (str = tPFormat.color) != null && C500260Jjc.LJJIIZ(str)) {
            LIZ.getClass();
            C786410Ut5.o2(spannable, new ForegroundColorSpan(LIZIZ(str)), i, i2, 18);
        }
    }
}
