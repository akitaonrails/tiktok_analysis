package X;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import iyl.i3;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0tFI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1657940tFI extends AbstractC1651610t55 implements InterfaceC379610EuV {
    public final C1DRG LLILZIL;
    public final int LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1657840tF8
    public final InterfaceC1657880tFC LIZIZ(i3 i3Var) {
        if (i3Var.LLJLILLLLZIIL == EnumC1651310t4b.FIXED) {
            return new C1659230tHN(this.LL, this.LLILZIL, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)), ((Number) this.LLIZLLLIL.getValue()).intValue(), ((Number) this.LLJ.getValue()).intValue(), true);
        }
        if (i3Var.LLILLL.getType() == 1800) {
            final LifecycleOwner lifecycleOwner = this.LL;
            final C1DRG c1drg = this.LLILZIL;
            final int iIntValue = ((Number) this.LLIZ.getValue()).intValue();
            final int iIntValue2 = ((Number) this.LLIZLLLIL.getValue()).intValue();
            final int iIntValue3 = ((Number) this.LLJ.getValue()).intValue();
            return new C1659230tHN(lifecycleOwner, c1drg, iIntValue, iIntValue2, iIntValue3) { // from class: X.0tHQ
                public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLII;
                public final LifecycleOwner LLLFFI;
                public View LLLFZ;
                public final C1664750tQH LLLI;

                static {
                    C2217381BqS c2217381BqS = new C2217381BqS(C1659260tHQ.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
                    C13LE.LIZ.getClass();
                    LLLII = new InterfaceC2217461Bqa[]{c2217381BqS};
                }

                @Override // X.C1659230tHN, X.C1659140tHE, X.InterfaceC1657880tFC
                public final void LIZJ(i3 i3Var2) {
                    View viewFindViewById;
                    super.LIZJ(i3Var2);
                    if (i3Var2.LLILLL.getType() == 1800) {
                        if (C0MDL.LIZ() && !C0C64.LJIILLIIL().LJIIIZ(31744, "studio_ai_alive_icon_default_white", true, false)) {
                            View view = this.LLILZ;
                            if (view != null) {
                                viewFindViewById = view.findViewById(R.id.y7i);
                            } else {
                                viewFindViewById = null;
                            }
                            this.LLLFZ = viewFindViewById;
                            if (viewFindViewById != null) {
                                C786410Ut5.LJLLLLLL(0, viewFindViewById);
                            }
                        }
                        C1664750tQH c1664750tQH = this.LLLI;
                        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLII;
                        if (!C1428470nHB.LLILL((VideoPublishEditModel) c1664750tQH.getValue(this, interfaceC2217461BqaArr[0]))) {
                            C564410MBr c564410MBr = C564410MBr.LIZ;
                            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) this.LLLI.getValue(this, interfaceC2217461BqaArr[0]);
                            c564410MBr.getClass();
                            C564410MBr.LJIIIZ(videoPublishEditModel);
                        }
                    }
                }

                @Override // X.C1659230tHN, X.C1659140tHE, X.AbstractC1659350tHZ
                public final void LJIIJJI(View view) {
                    super.LJIIJJI(view);
                }

                {
                    super(lifecycleOwner, c1drg, iIntValue, iIntValue2, iIntValue3, false);
                    this.LLLFFI = lifecycleOwner;
                    this.LLLI = C1664770tQJ.LIZ(this.LLJL, VideoPublishEditModel.class, null);
                }
            };
        }
        return new C1659230tHN(this.LL, this.LLILZIL, ((Number) this.LLIZ.getValue()).intValue(), ((Number) this.LLIZLLLIL.getValue()).intValue(), ((Number) this.LLJ.getValue()).intValue(), false);
    }

    public C1657940tFI(C1459960o5y c1459960o5y, C1DRG c1drg, int i) {
        super(c1459960o5y);
        this.LLILZIL = c1drg;
        this.LLILZLL = i;
        this.LLIZ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 511));
        this.LLIZLLLIL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2172));
        this.LLJ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2170));
    }
}
