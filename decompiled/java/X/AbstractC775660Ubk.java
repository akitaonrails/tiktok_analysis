package X;

import android.text.method.LinkMovementMethod;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.broadcast.stablemode.StableModeViewModel;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0Ubk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC775660Ubk implements InterfaceC1813270xHp<C775720Ubq, AbstractC775780Ubw, AbstractC1180404ja, StableModeViewModel> {
    public final long LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final LifecycleOwner LLILZ;
    public C20743716Ff LLILZIL;
    public C773830UXd LLILZLL;

    public abstract String LIZ();

    public static final StableModeViewModel LIZJ() {
        return (StableModeViewModel) C0U61.LIZ(new C0UNS()).get(StableModeViewModel.class);
    }

    public final void LIZLLL(C16F5 c16f5) {
        if (c16f5 != null) {
            C500260Jjc.LLFFF(c16f5);
            String strLJIJI = C497740JfY.LJIJI(2131855045);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C497740JfY.LJIJI(2131855044));
            sbLIZ.append(" %1$s");
            c16f5.setText(C500260Jjc.LIZLLL(C2188811AlT.LIZIZ(sbLIZ), strLJIJI, new C521520Kco(this, c16f5, 0)));
            c16f5.setLinksClickable(true);
            c16f5.setMovementMethod(LinkMovementMethod.getInstance());
            c16f5.setHighlightColor(0);
        }
    }

    public final void LJ(C20743716Ff c20743716Ff) {
        this.LLILZIL = c20743716Ff;
        if (c20743716Ff != null) {
            c20743716Ff.setToggleEnabled(false);
            c20743716Ff.setDebounceClickEnabled(true);
            c20743716Ff.setDelayInterval(500L);
            c20743716Ff.setEnabled(false);
            c20743716Ff.setDisabledAlpha(1.0f);
            C1834150xpV.LJIIJ(c20743716Ff, true);
            C500260Jjc.LJLIIIL(500L, c20743716Ff, new AwS591S0100000_12(this, 454));
        }
    }

    @Override // X.InterfaceC1813270xHp
    public final void Xh(InterfaceC775640Ubi interfaceC775640Ubi) {
        C775720Ubq c775720Ubq = (C775720Ubq) interfaceC775640Ubi;
        C20743716Ff c20743716Ff = this.LLILZIL;
        if (c20743716Ff != null) {
            c20743716Ff.setChecked(c775720Ubq.LIZ);
        }
    }

    @Override // X.InterfaceC1813270xHp
    public final void gn(InterfaceC1180504jb interfaceC1180504jb) {
        AbstractC1180404ja abstractC1180404ja = (AbstractC1180404ja) interfaceC1180504jb;
        if (abstractC1180404ja instanceof C1180304jZ) {
            abstractC1180404ja.getClass();
            C766270U4b.LIZLLL(0);
            return;
        }
        throw new C1954807lC();
    }

    public AbstractC775660Ubk(long j, String str, String str2, LifecycleOwner lifecycleOwner) {
        this.LL = j;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = lifecycleOwner;
    }
}
