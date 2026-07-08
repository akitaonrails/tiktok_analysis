package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.broadcast.video.noise.NoiseSuppressionViewModel;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0Uba, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC775560Uba implements InterfaceC1813270xHp<C775600Ube, AbstractC775500UbU, AbstractC1180704jd, NoiseSuppressionViewModel> {
    public final LifecycleOwner LL;
    public C20743716Ff LLILLJJLI;

    public abstract String LIZ();

    public static NoiseSuppressionViewModel LIZIZ() {
        return (NoiseSuppressionViewModel) C0U61.LIZ(new C0UNS()).get(NoiseSuppressionViewModel.class);
    }

    public AbstractC775560Uba(LifecycleOwner lifecycleOwner) {
        this.LL = lifecycleOwner;
    }

    public final void LIZJ(C20743716Ff c20743716Ff) {
        this.LLILLJJLI = c20743716Ff;
        if (c20743716Ff != null) {
            c20743716Ff.setToggleEnabled(false);
            c20743716Ff.setDebounceClickEnabled(true);
            c20743716Ff.setDelayInterval(500L);
            c20743716Ff.setEnabled(false);
            c20743716Ff.setDisabledAlpha(1.0f);
            C1834150xpV.LJIIJ(c20743716Ff, true);
            C500260Jjc.LJLIIIL(500L, c20743716Ff, new AwS591S0100000_12(this, 513));
        }
    }

    @Override // X.InterfaceC1813270xHp
    public final void Xh(InterfaceC775640Ubi interfaceC775640Ubi) {
        C775600Ube c775600Ube = (C775600Ube) interfaceC775640Ubi;
        C20743716Ff c20743716Ff = this.LLILLJJLI;
        if (c20743716Ff != null) {
            c20743716Ff.setChecked(c775600Ube.LIZ);
        }
    }

    @Override // X.InterfaceC1813270xHp
    public final void gn(InterfaceC1180504jb interfaceC1180504jb) {
        AbstractC1180704jd abstractC1180704jd = (AbstractC1180704jd) interfaceC1180504jb;
        if (abstractC1180704jd instanceof C1180604jc) {
            C766270U4b.LIZLLL(((C1180604jc) abstractC1180704jd).LIZ);
            return;
        }
        throw new C1954807lC();
    }
}
