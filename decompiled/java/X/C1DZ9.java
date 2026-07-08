package X;

import android.animation.Animator;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.1DZ9, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final /* synthetic */ class C1DZ9 extends C2217421BqW implements Function2<EnumC2249791D3x, C1DZD, Unit> {
    public C1DZ9(Object obj) {
        super(2, obj, C1DZ6.class, "newState", "newState(Lcom/ss/android/ugc/mediabox/playerui/componnents/control/seekbar/basic/SeekBarState$State;Lcom/ss/android/ugc/mediabox/playerui/componnents/control/seekbar/basic/SeekBarState$Action;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(EnumC2249791D3x enumC2249791D3x, C1DZD c1dzd) {
        EnumC2249791D3x enumC2249791D3x2 = enumC2249791D3x;
        C1DZD c1dzd2 = c1dzd;
        C1DZ6 c1dz6 = (C1DZ6) this.receiver;
        if (c1dz6.LLJI) {
            if (c1dz6.LLJILJIL) {
                Animator animator = c1dz6.LLJJIJIL;
                if (animator != null) {
                    animator.cancel();
                }
                int i = C1DZB.LIZIZ[enumC2249791D3x2.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                c1dz6.LJIIIIZZ(c1dz6.getDragStyleConfig());
                            } else {
                                throw new C1954807lC();
                            }
                        } else {
                            int i2 = C1DZB.LIZ[c1dzd2.ordinal()];
                            if (i2 != 5) {
                                if (i2 == 6 || i2 == 7) {
                                    c1dz6.LJIIIIZZ(c1dz6.getActiveStyleConfig());
                                }
                            } else {
                                HandlerHook.viewRemoveCallbacks(c1dz6, c1dz6.LLJZIJLIL);
                                c1dz6.LJI(c1dz6.getActiveStyleConfig());
                            }
                        }
                    } else {
                        int i3 = C1DZB.LIZ[c1dzd2.ordinal()];
                        if (i3 != 1 && i3 != 2 && i3 != 3) {
                            if (i3 == 4) {
                                c1dz6.LJIIIIZZ(c1dz6.getDefaultStyleConfig());
                            }
                        } else {
                            c1dz6.LJI(c1dz6.getDefaultStyleConfig());
                        }
                    }
                } else {
                    c1dz6.LJI(c1dz6.getFrozenStyleConfig());
                }
            } else {
                c1dz6.LJII(enumC2249791D3x2);
            }
            c1dz6.LLJL.LIZ(c1dz6.LLJZ.LIZJ, enumC2249791D3x2, c1dzd2);
        }
        return Unit.LIZ;
    }
}
