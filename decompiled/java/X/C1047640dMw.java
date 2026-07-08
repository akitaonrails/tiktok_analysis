package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.component.danmaku.model.Danmu;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.AwS630S0100000_16;

/* JADX INFO: renamed from: X.0dMw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1047640dMw {
    public final Context LIZ;
    public final List<Danmu> LIZIZ;
    public final C1044630dI5 LIZJ;
    public final C1044700dIC LIZLLL;
    public final Function1<Long, Unit> LJ;
    public final C1396830mS9 LJFF;
    public long LJI;
    public C1044610dI3 LJII;
    public final long LJIIIIZZ;

    public final void LIZ(float f) {
        if (f <= 0.0f) {
            return;
        }
        long j = (long) (this.LJIIIIZZ / f);
        if (j < 1) {
            j = 1;
        }
        C1384750m8f c1384750m8f = this.LJFF.LIZIZ;
        if (c1384750m8f.LJFF.LIZ == j && c1384750m8f.LIZLLL.LJ == ((int) (100 * f))) {
            return;
        }
        c1384750m8f.LIZLLL.LIZ((int) (f * 100));
        this.LJFF.LIZIZ.LJFF.LIZLLL(j);
        this.LJFF.LJJIIZI();
    }

    public C1047640dMw(Context context, List list, C1044630dI5 c1044630dI5, C1044700dIC c1044700dIC, AwS595S0100000_16 awS595S0100000_16) {
        this.LIZ = context;
        this.LIZIZ = list;
        this.LIZJ = c1044630dI5;
        this.LIZLLL = c1044700dIC;
        this.LJ = awS595S0100000_16;
        C1396830mS9 c1396830mS9 = new C1396830mS9();
        c1396830mS9.LJJIZ(C13LE.LIZ(C1397160mSg.class));
        c1396830mS9.LJIILL(new InterfaceC1396920mSI() { // from class: X.0mRl
            @Override // X.InterfaceC1396920mSI
            public final int LIZIZ() {
                return 2001;
            }

            @Override // X.InterfaceC1396920mSI
            public final AbstractC1396720mRy<? extends AbstractC1384320m7y> LIZ() {
                return new AbstractC1396720mRy<AbstractC1044720dIE>() { // from class: X.0mRd
                    public static final int LLJJIJIIJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                    public static final int LLJJIJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
                    public final C444890HcV LLJILLL;
                    public final Paint LLJJ;
                    public final RectF LLJJI;
                    public Layout LLJJIII;
                    public CharSequence LLJJIJI;

                    @Override // X.AbstractC1396720mRy, X.InterfaceC1396460mRY
                    public final int LIZ(float f, float f2) {
                        return 1;
                    }

                    @Override // X.AbstractC1396720mRy
                    public final int LJFF() {
                        return 2001;
                    }

                    {
                        C444890HcV c444890HcV = new C444890HcV();
                        c444890HcV.setAntiAlias(true);
                        c444890HcV.setDither(true);
                        this.LLJILLL = c444890HcV;
                        this.LLJJ = new Paint(5);
                        this.LLJJI = new RectF();
                    }

                    @Override // X.AbstractC1396720mRy
                    public final void LJJII() {
                        super.LJJII();
                        this.LLJJIJI = null;
                        this.LLJJIII = null;
                        this.LLJILLL.reset();
                    }

                    @Override // X.AbstractC1396720mRy
                    public final void LJIL(C1384750m8f c1384750m8f) {
                        String string;
                        boolean z;
                        int iIntValue;
                        int i;
                        float f;
                        int i2;
                        CharSequence charSequence;
                        Integer num;
                        CharSequence charSequence2;
                        AbstractC1044720dIE abstractC1044720dIE = (AbstractC1044720dIE) this.LL;
                        if (abstractC1044720dIE != null && (charSequence2 = abstractC1044720dIE.LJIIJJI) != null) {
                            string = charSequence2.toString();
                        } else {
                            string = null;
                        }
                        CharSequence charSequence3 = "";
                        if (string == null) {
                            string = "";
                        }
                        if (string.length() == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        float f2 = 0.0f;
                        if (z) {
                            this.LLJJIJI = null;
                            this.LLJJIII = null;
                            this.LLILZIL = 0.0f;
                            this.LLILZLL = 0.0f;
                            return;
                        }
                        this.LLJILLL.setAntiAlias(true);
                        this.LLJILLL.setDither(true);
                        this.LLJILLL.setStyle(Paint.Style.FILL);
                        C444890HcV c444890HcV = this.LLJILLL;
                        if (abstractC1044720dIE != null && (num = abstractC1044720dIE.LJIIL) != null) {
                            iIntValue = num.intValue();
                        } else {
                            iIntValue = c1384750m8f.LJ.LIZIZ;
                        }
                        c444890HcV.setColor(iIntValue);
                        C444890HcV c444890HcV2 = this.LLJILLL;
                        if (abstractC1044720dIE != null) {
                            i = abstractC1044720dIE.LJIJI;
                        } else {
                            i = 42;
                        }
                        c444890HcV2.LIZ(i);
                        if (abstractC1044720dIE != null) {
                            f = abstractC1044720dIE.LJIIZILJ;
                        } else {
                            f = 0.0f;
                        }
                        float fLIZIZ = C418440Gaw.LIZIZ(Float.valueOf(f));
                        if (abstractC1044720dIE != null) {
                            f2 = abstractC1044720dIE.LJIJ;
                        }
                        float fLIZIZ2 = C418440Gaw.LIZIZ(Float.valueOf(f2));
                        Math.ceil(this.LLJILLL.getFontMetrics().bottom - this.LLJILLL.getFontMetrics().top);
                        C1052760dVC c1052760dVC = (C1052760dVC) this.LL;
                        if (c1052760dVC != null && (charSequence = c1052760dVC.LJIIJJI) != null) {
                            charSequence3 = charSequence;
                        }
                        Pattern pattern = C439870HMr.LIZ;
                        int iCeil = (int) Math.ceil(Layout.getDesiredWidth(charSequence3, this.LLJILLL));
                        if (iCeil < 1) {
                            iCeil = 1;
                        }
                        StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(charSequence3, 0, charSequence3.length(), this.LLJILLL, iCeil).setAlignment(Layout.Alignment.ALIGN_NORMAL).setIncludePad(true).setMaxLines(1).build();
                        this.LLJJIJI = charSequence3;
                        this.LLJJIII = staticLayoutBuild;
                        if (abstractC1044720dIE != null && abstractC1044720dIE.LJI()) {
                            i2 = LLJJIJIL + LLJJIJIIJIL;
                        } else {
                            i2 = 0;
                        }
                        float f3 = 2;
                        this.LLILZIL = staticLayoutBuild.getLineWidth(0) + (fLIZIZ * f3) + i2;
                        this.LLILZLL = staticLayoutBuild.getHeight() + (fLIZIZ2 * f3);
                    }

                    @Override // X.AbstractC1396720mRy
                    public final void LJJI(C1384750m8f c1384750m8f) {
                        Integer numValueOf;
                        Integer numValueOf2;
                        int iIntValue;
                        AbstractC1044720dIE abstractC1044720dIE = (AbstractC1044720dIE) this.LL;
                        if (abstractC1044720dIE != null) {
                            AwS417S0200000_16 awS417S0200000_16 = abstractC1044720dIE.LJIILLIIL;
                            if (awS417S0200000_16 != null) {
                                iIntValue = ((Number) awS417S0200000_16.invoke()).intValue();
                            } else {
                                iIntValue = abstractC1044720dIE.LJIILL;
                            }
                            abstractC1044720dIE.LJIILL = iIntValue;
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onShow: id -> ");
                        AbstractC1044720dIE abstractC1044720dIE2 = (AbstractC1044720dIE) this.LL;
                        Integer numValueOf3 = null;
                        if (abstractC1044720dIE2 != null) {
                            numValueOf = Integer.valueOf(abstractC1044720dIE2.LJIILJJIL);
                        } else {
                            numValueOf = null;
                        }
                        sbLIZ.append(numValueOf);
                        sbLIZ.append(", type -> ");
                        AbstractC1044720dIE abstractC1044720dIE3 = (AbstractC1044720dIE) this.LL;
                        if (abstractC1044720dIE3 != null) {
                            numValueOf2 = Integer.valueOf(abstractC1044720dIE3.LJFF());
                        } else {
                            numValueOf2 = null;
                        }
                        sbLIZ.append(numValueOf2);
                        sbLIZ.append(", displayCount -> ");
                        AbstractC1044720dIE abstractC1044720dIE4 = (AbstractC1044720dIE) this.LL;
                        if (abstractC1044720dIE4 != null) {
                            numValueOf3 = Integer.valueOf(abstractC1044720dIE4.LJIILL);
                        }
                        sbLIZ.append(numValueOf3);
                        C2188811AlT.LIZIZ(sbLIZ);
                    }

                    @Override // X.AbstractC1396720mRy
                    public final void LJIJI(AbstractC1384320m7y abstractC1384320m7y, C1384750m8f c1384750m8f) {
                        int iIntValue;
                        AbstractC1044720dIE abstractC1044720dIE = (AbstractC1044720dIE) abstractC1384320m7y;
                        this.LLJILLL.setAntiAlias(true);
                        this.LLJILLL.setDither(true);
                        this.LLJILLL.setStyle(Paint.Style.FILL);
                        C444890HcV c444890HcV = this.LLJILLL;
                        Integer num = abstractC1044720dIE.LJIIL;
                        if (num != null) {
                            iIntValue = num.intValue();
                        } else {
                            iIntValue = c1384750m8f.LJ.LIZIZ;
                        }
                        c444890HcV.setColor(iIntValue);
                        this.LLJILLL.LIZ(abstractC1044720dIE.LJIJI);
                    }

                    @Override // X.AbstractC1396720mRy
                    public final void LJIJJ(Canvas canvas, C1384750m8f c1384750m8f) {
                        Layout layout;
                        CharSequence charSequence;
                        AbstractC1044720dIE abstractC1044720dIE = (AbstractC1044720dIE) this.LL;
                        if (abstractC1044720dIE != null && (layout = this.LLJJIII) != null && (charSequence = this.LLJJIJI) != null && charSequence.length() != 0) {
                            float fLIZIZ = C418440Gaw.LIZIZ(Float.valueOf(abstractC1044720dIE.LJIIZILJ));
                            float fLIZIZ2 = C418440Gaw.LIZIZ(Float.valueOf(abstractC1044720dIE.LJIJ));
                            RectF rectF = this.LLJJI;
                            float f = this.LLILLJJLI;
                            float f2 = this.LLILLL;
                            rectF.set(f, f2, this.LLILZIL + f, this.LLILZLL + f2);
                            if (abstractC1044720dIE.LJII()) {
                                this.LLJJ.setColor(abstractC1044720dIE.LJIJJLI);
                                RectF rectF2 = this.LLJJI;
                                float f3 = abstractC1044720dIE.LJIJJ;
                                canvas.drawRoundRect(rectF2, f3, f3, this.LLJJ);
                            }
                            canvas.save();
                            canvas.translate(this.LLILLJJLI + fLIZIZ, this.LLILLL + fLIZIZ2);
                            layout.draw(canvas);
                            canvas.restore();
                            if (abstractC1044720dIE.LJI()) {
                                C419910GdJ c419910GdJ = new C419910GdJ();
                                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                                c419910GdJ.LIZLLL = Integer.valueOf(abstractC1044720dIE.LJIL);
                                c419910GdJ.LIZ = R.raw.icon_chevron_right_offset_ltr;
                                C844470XAv.LIZ.getClass();
                                TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(C844470XAv.LIZ());
                                float f4 = (this.LLILLJJLI + this.LLILZIL) - fLIZIZ;
                                int i = LLJJIJIIJIL;
                                float f5 = i;
                                int i2 = (int) (f4 - f5);
                                int i3 = (int) (this.LLILLL + ((this.LLILZLL - f5) / 2.0f));
                                tuxIconDrawableLIZ.setBounds(i2, i3, i2 + i, i + i3);
                                tuxIconDrawableLIZ.draw(canvas);
                            }
                        }
                    }
                };
            }
        });
        C1385090m9D c1385090m9D = c1396830mS9.LIZIZ.LIZLLL;
        c1385090m9D.LJIILIIL = true;
        c1385090m9D.LJFF = AFwS252S0000000_16.get$arr$(657);
        c1385090m9D.LJIILJJIL.LIZ(1102);
        c1396830mS9.LIZIZ.LIZLLL.LJIIIZ = new AwS630S0100000_16(this, 105);
        c1396830mS9.LIZIZ.LJFF.LIZ(c1044700dIC.LIZ);
        c1396830mS9.LIZIZ.LJFF.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c1044700dIC.LIZLLL)));
        c1396830mS9.LIZIZ.LJFF.LIZJ(C418440Gaw.LIZIZ(Float.valueOf(c1044700dIC.LJ)));
        c1396830mS9.LIZIZ.LJFF.LIZLLL(c1044700dIC.LIZIZ);
        C1384510m8H c1384510m8H = c1396830mS9.LIZIZ.LJFF;
        float fLIZIZ = C418440Gaw.LIZIZ(Float.valueOf(c1044700dIC.LIZJ));
        int i = (c1384510m8H.LJFF > fLIZIZ ? 1 : (c1384510m8H.LJFF == fLIZIZ ? 0 : -1));
        c1384510m8H.LJFF = fLIZIZ < ((float) 0) ? 24.0f : fLIZIZ;
        c1384510m8H.LJIIJJI.LIZ(1405);
        C1384510m8H c1384510m8H2 = c1396830mS9.LIZIZ.LJFF;
        int i2 = c1044700dIC.LIZ * 4;
        int i3 = i2 * 3;
        i2 = i3 >= i2 ? i3 : i2;
        int i4 = c1384510m8H2.LJI;
        c1384510m8H2.LJI = i2 < 0 ? 8 : i2;
        c1384510m8H2.LJIIJJI.LIZ(1406);
        C1384510m8H c1384510m8H3 = c1396830mS9.LIZIZ.LJFF;
        long j = c1044700dIC.LIZIZ * ((long) 2);
        int i5 = (c1384510m8H3.LJII > j ? 1 : (c1384510m8H3.LJII == j ? 0 : -1));
        c1384510m8H3.LJII = j <= 0 ? 4000L : j;
        c1384510m8H3.LJIIJJI.LIZ(1407);
        C1384510m8H c1384510m8H4 = c1396830mS9.LIZIZ.LJFF;
        boolean zLIZLLL = C426750GoL.LIZLLL(context);
        if (c1384510m8H4.LJIIJ != zLIZLLL) {
            c1384510m8H4.LJIIJ = zLIZLLL;
            c1384510m8H4.LJIIJJI.LIZ(1410);
        }
        c1396830mS9.LIZIZ.LJFF.LJIIIZ = AFwS252S0000000_16.get$arr$(658);
        this.LJFF = c1396830mS9;
        this.LJI = -1L;
        this.LJIIIIZZ = c1044700dIC.LIZIZ;
    }
}
