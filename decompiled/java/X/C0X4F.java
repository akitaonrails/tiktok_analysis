package X;

import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0X4F, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X4F implements C09JN<Activity> {
    public boolean LL = true;
    public boolean LLILLJJLI;
    public String LLILLL;

    public C0X4F() {
        C0X4H.LIZ.getClass();
        this.LLILLL = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
    }

    @Override // X.C09JN
    public final void accept(Activity activity) {
        C1C7U.LIZ("LiveBubbleTrigger@35c7.mainActivityResumeSubscriber$1");
        if (activity instanceof InterfaceC1603190roz) {
            C0X4H.LIZ.getClass();
            String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onMainResume, lastLoginUid=");
            sbLIZ.append(this.LLILLL);
            sbLIZ.append(", loginUid=");
            sbLIZ.append(curUserId);
            sbLIZ.append(", isByStart=");
            sbLIZ.append(this.LL);
            sbLIZ.append(", isByLogin=");
            sbLIZ.append(this.LLILLJJLI);
            C2188811AlT.LIZIZ(sbLIZ);
            if (this.LLILLJJLI) {
                C0X4H.LIZ(3);
            } else if (!this.LL && ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                Intrinsics.LJFF(curUserId, this.LLILLL);
            }
            this.LLILLL = curUserId;
            this.LL = false;
            this.LLILLJJLI = false;
        }
        C1C7U.LIZIZ("LiveBubbleTrigger@35c7.mainActivityResumeSubscriber$1");
    }
}
