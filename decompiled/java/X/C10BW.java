package X;

import androidx.lifecycle.Observer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10BW, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final /* synthetic */ class C10BW implements Observer, InterfaceC1635506an {
    public final /* synthetic */ C10BU LL;

    public C10BW(C10BU c10bu) {
        this.LL = c10bu;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Observer) && (obj instanceof InterfaceC1635506an)) {
            return Intrinsics.LJFF(getFunctionDelegate(), ((InterfaceC1635506an) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // X.InterfaceC1635506an
    public final InterfaceC1451105m9<?> getFunctionDelegate() {
        return new C2217421BqW(1, this.LL, C10BU.class, "onSubPreviewErrorMessage", "onSubPreviewErrorMessage(Lcom/ss/android/ugc/aweme/subscription/preview/models/SubscriptionPublishPreviewErrorMessage;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LL.LLILLJJLI.LIZ);
        if (c19egLIZIZ != null) {
            if (Intrinsics.LJFF(obj, C10C5.LIZ)) {
                C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZIZ);
                c1389890mGx.LJIIIZ(2131830346);
                c1389890mGx.LJIIJJI();
            } else {
                if (Intrinsics.LJFF(obj, C10C3.LIZ)) {
                    C1389890mGx c1389890mGx2 = new C1389890mGx(c19egLIZIZ);
                    c1389890mGx2.LJIIIZ(2131839523);
                    c1389890mGx2.LJIIJJI();
                    return;
                }
                throw new C1954807lC();
            }
        }
    }
}
