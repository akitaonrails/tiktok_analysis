package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Gk8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C424140Gk8 implements InterfaceC424170GkB {
    @Override // X.InterfaceC424170GkB
    public final InterfaceC428390Gqz LIZ(EnumC429050Gs3 enumC429050Gs3) {
        if (C424150Gk9.LIZ[enumC429050Gs3.ordinal()] == 1) {
            return new InterfaceC428390Gqz() { // from class: X.0Gk7
                public Function1<? super View, Unit> LIZ;
                public C425310Gm1 LIZIZ;

                @Override // X.InterfaceC428390Gqz
                public final void hide() {
                    C1706630uVp.LIZ("StatusView", "hide");
                    C425310Gm1 c425310Gm1 = this.LIZIZ;
                    if (c425310Gm1 != null) {
                        int visibility = c425310Gm1.getVisibility();
                        c425310Gm1.setVisibility(8);
                        C1602160rnK.LIZIZ(visibility, 8, c425310Gm1);
                    }
                }

                @Override // X.InterfaceC428390Gqz
                public final void LIZIZ(EnumC429200GsI enumC429200GsI) {
                    C425310Gm1 c425310Gm1;
                    if (enumC429200GsI == EnumC429200GsI.NoNetwork) {
                        C1706630uVp.LIZ("StatusView", "show");
                        C425310Gm1 c425310Gm12 = this.LIZIZ;
                        if (c425310Gm12 != null) {
                            int visibility = c425310Gm12.getVisibility();
                            c425310Gm12.setVisibility(0);
                            C1602160rnK.LIZIZ(visibility, 0, c425310Gm12);
                        }
                        Function1<? super View, Unit> function1 = this.LIZ;
                        if (function1 != null && (c425310Gm1 = this.LIZIZ) != null) {
                            c425310Gm1.setRetryAction(function1);
                        }
                    }
                }

                @Override // X.InterfaceC428390Gqz
                public final void LIZJ(Function1 function1) {
                    this.LIZ = function1;
                }

                @Override // X.InterfaceC428390Gqz
                public final View LIZ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                    C1706630uVp.LIZ("StatusView", "inflate");
                    C425310Gm1 c425310Gm1 = new C425310Gm1(viewGroup.getContext());
                    this.LIZIZ = c425310Gm1;
                    viewGroup.addView(c425310Gm1);
                    C425310Gm1 c425310Gm12 = this.LIZIZ;
                    if (c425310Gm12 != null) {
                        int visibility = c425310Gm12.getVisibility();
                        c425310Gm12.setVisibility(8);
                        C1602160rnK.LIZIZ(visibility, 8, c425310Gm12);
                    }
                    return this.LIZIZ;
                }
            };
        }
        return new C424120Gk6();
    }
}
