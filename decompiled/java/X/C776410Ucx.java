package X;

import Y.AObserverS216S0100000_12;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.broadcast.GameFloatTipsOptimize;
import java.util.Map;

/* JADX INFO: renamed from: X.0Ucx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C776410Ucx implements InterfaceC777850UfH {
    public static final /* synthetic */ int LLJ = 0;
    public final Fragment LL;
    public final InterfaceC778270Ufx LLILLJJLI;
    public final Context LLILLL;
    public DialogC778400UgA LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public final C776400Ucw LLIZLLLIL = new C776400Ucw(this);

    @Override // X.InterfaceC777850UfH
    public final void LJII(AbstractC777950UfR abstractC777950UfR, EnumC778130Ufj enumC778130Ufj) {
    }

    public final void LIZ() {
        DialogC778400UgA dialogC778400UgA;
        DialogC778400UgA dialogC778400UgA2 = this.LLILZ;
        if (dialogC778400UgA2 == null || !dialogC778400UgA2.isShowing() || (dialogC778400UgA = this.LLILZ) == null) {
            return;
        }
        dialogC778400UgA.dismiss();
        C785410UrT.LIZ(dialogC778400UgA);
    }

    public final void LIZIZ() {
        DialogC778400UgA dialogC778400UgA;
        boolean z = false;
        if (!this.LLILZLL && ((dialogC778400UgA = this.LLILZ) == null || !dialogC778400UgA.isShowing())) {
            z = true;
        }
        boolean z2 = !this.LLILZIL;
        if (z) {
            Map<String, Object> map = C1338270kvh.LIZ;
            this.LLILLJJLI.LIZIZ().addToShow(6, this.LL, new AObserverS216S0100000_12(this, 0));
            if (!z2) {
                return;
            }
        } else if (!z2) {
            Map<String, Object> map2 = C1338270kvh.LIZ;
            return;
        }
        LIZJ(this.LLILLL.getString(2131844021), true);
        this.LLILZIL = true;
    }

    @Override // X.InterfaceC777850UfH
    public final void LJI(AbstractC777950UfR abstractC777950UfR) {
        Map<String, Object> map = C1338270kvh.LIZ;
    }

    public C776410Ucx(Fragment fragment, InterfaceC778270Ufx interfaceC778270Ufx) {
        this.LL = fragment;
        this.LLILLJJLI = interfaceC778270Ufx;
        this.LLILLL = fragment.requireContext();
    }

    public final void LIZJ(String str, boolean z) {
        if (GameFloatTipsOptimize.INSTANCE.isExperimentGroup()) {
            if (z) {
                C777840UfG.LJII(new AbstractC777950UfR() { // from class: X.0Uee
                    public final EnumC777930UfP LJ = EnumC777930UfP.PRIORITY_TYPE_P2;
                    public final EnumC777480Ueg LJFF = EnumC777480Ueg.HEADPHONE;
                    public final CharSequence LJI = C497740JfY.LJIJI(2131844021);

                    {
                        this.LIZIZ = new AbstractC777790UfB() { // from class: X.0Uew
                            public final EnumC777770Uf9 LIZ = EnumC777770Uf9.CLOSE;

                            @Override // X.AbstractC777790UfB
                            public final EnumC777770Uf9 LIZ() {
                                return this.LIZ;
                            }
                        };
                    }

                    @Override // X.AbstractC777950UfR
                    public final EnumC777930UfP LIZJ() {
                        return this.LJ;
                    }

                    @Override // X.AbstractC777950UfR
                    public final CharSequence LIZLLL() {
                        return this.LJI;
                    }

                    @Override // X.AbstractC777950UfR
                    public final EnumC777480Ueg LJ() {
                        return this.LJFF;
                    }
                });
                return;
            } else {
                C777840UfG.LIZIZ(EnumC777480Ueg.HEADPHONE);
                return;
            }
        }
        this.LLILLJJLI.LJIIIZ(EnumC778100Ufg.LIVE_TIP_MESSAGE_HEADPHONE.ordinal(), null, str, null, z);
    }
}
