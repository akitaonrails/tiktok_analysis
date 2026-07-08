package X;

import com.ss.android.ugc.aweme.services.external.ability.IPageToFinish;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.09mJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C2471309mJ implements InterfaceC573150Mdt, InterfaceC1635506an {
    public final /* synthetic */ IPageToFinish LL;

    public C2471309mJ(IPageToFinish iPageToFinish) {
        this.LL = iPageToFinish;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC573150Mdt) && (obj instanceof InterfaceC1635506an)) {
            return Intrinsics.LJFF(getFunctionDelegate(), ((InterfaceC1635506an) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // X.InterfaceC1635506an
    public final InterfaceC1451105m9<?> getFunctionDelegate() {
        return new C2217421BqW(1, this.LL, IPageToFinish.class, "onFinish", "onFinish(Z)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // X.InterfaceC573150Mdt
    public final void onFinish(boolean z) {
        this.LL.onFinish(z);
    }
}
