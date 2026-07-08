package X;

import androidx.lifecycle.Observer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10BX, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final /* synthetic */ class C10BX implements Observer, InterfaceC1635506an {
    public final /* synthetic */ C10CC LL;

    public C10BX(C10CC c10cc) {
        this.LL = c10cc;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Observer) && (obj instanceof InterfaceC1635506an)) {
            return Intrinsics.LJFF(getFunctionDelegate(), ((InterfaceC1635506an) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // X.InterfaceC1635506an
    public final InterfaceC1451105m9<?> getFunctionDelegate() {
        return new C2217421BqW(1, this.LL, C10CC.class, "onSubPreviewErrorMessage", "onSubPreviewErrorMessage(Lcom/ss/android/ugc/aweme/subscription/preview/models/SubscriptionPublishPreviewErrorMessage;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        C10CC c10cc = this.LL;
        c10cc.getClass();
        if (Intrinsics.LJFF(obj, C10C5.LIZ)) {
            C1389890mGx c1389890mGx = new C1389890mGx(c10cc.LIZ);
            c1389890mGx.LJIIIZ(2131830346);
            c1389890mGx.LJIIJJI();
        } else {
            if (Intrinsics.LJFF(obj, C10C3.LIZ)) {
                C1389890mGx c1389890mGx2 = new C1389890mGx(c10cc.LIZ);
                c1389890mGx2.LJIIIZ(2131839523);
                c1389890mGx2.LJIIJJI();
                return;
            }
            throw new C1954807lC();
        }
    }
}
