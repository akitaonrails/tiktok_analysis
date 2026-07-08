package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0X4B, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public abstract class C0X4B<T> implements C09JN<T> {
    public boolean LL = true;
    public boolean LLILLJJLI;
    public String LLILLL;

    public C0X4B() {
        C0X4D.LIZ.getClass();
        this.LLILLL = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
    }

    @Override // X.C09JN
    public void accept(T t) {
        C1C7U.LIZ("NoticeCountFetchManager$BaseActivityResumeConsumer@f250.accept");
        C0X4D.LIZ.getClass();
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
            C0X4D.LIZ(11, false);
        } else if (!this.LL && ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() && Intrinsics.LJFF(curUserId, this.LLILLL)) {
            C0X4D.LIZ(5, true);
        }
        this.LLILLL = curUserId;
        this.LL = false;
        this.LLILLJJLI = false;
        C1C7U.LIZIZ("NoticeCountFetchManager$BaseActivityResumeConsumer@f250.accept");
    }
}
