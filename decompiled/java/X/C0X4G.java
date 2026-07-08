package X;

import android.app.Activity;

/* JADX INFO: renamed from: X.0X4G, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X4G implements C09JN<C0X4A> {
    public boolean LL;
    public boolean LLILLJJLI = true;
    public boolean LLILLL;

    @Override // X.C09JN
    public final void accept(C0X4A c0x4a) {
        Activity activity;
        C1C7U.LIZ("LiveBubbleTrigger@35c7.mainActivityCreateSubscriber$1");
        C0X4A c0x4a2 = c0x4a;
        if (c0x4a2 != null) {
            activity = c0x4a2.LIZ;
        } else {
            activity = null;
        }
        if (activity instanceof InterfaceC1603190roz) {
            C0X4H.LIZ.getClass();
            String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onMainCreate, loginUid=");
            sbLIZ.append(curUserId);
            sbLIZ.append(", isCold=");
            sbLIZ.append(this.LLILLJJLI);
            sbLIZ.append(", isWarm=");
            sbLIZ.append(this.LL);
            sbLIZ.append(", isSwitch=");
            sbLIZ.append(this.LLILLL);
            C2188811AlT.LIZIZ(sbLIZ);
            if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                if (this.LL) {
                    C0X4H.LIZ(2);
                } else if (this.LLILLL) {
                    C0X4H.LIZ(3);
                }
            }
            this.LLILLJJLI = false;
            this.LL = false;
            this.LLILLL = false;
            C0X4H.LJ.LL = true;
        }
        C1C7U.LIZIZ("LiveBubbleTrigger@35c7.mainActivityCreateSubscriber$1");
    }
}
