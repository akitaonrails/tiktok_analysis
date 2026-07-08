package X;

import android.app.Activity;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0X4D, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X4D {
    public static boolean LIZIZ;
    public static final C0X4D LIZ = new C0X4D();
    public static final C0X4E LIZJ = new C0X4B<Activity>() { // from class: X.0X4E
        @Override // X.C0X4B, X.C09JN
        public final void accept(Object obj) {
            C1C7U.LIZ("NoticeCountFetchManager@b197.mainActivityResumeSubscriber$1");
            if (obj instanceof InterfaceC1603190roz) {
                super.accept(obj);
            }
            C1C7U.LIZIZ("NoticeCountFetchManager@b197.mainActivityResumeSubscriber$1");
        }
    };
    public static final C0X48 LIZLLL = new C0X47<C813430VvZ>() { // from class: X.0X48
        @Override // X.C0X47, X.C09JN
        public final void accept(Object obj) {
            AbstractC1387200mCc abstractC1387200mCc;
            C1C7U.LIZ("NoticeCountFetchManager@b197.mainActivityCreateRootPageSubscriber$1");
            C813430VvZ c813430VvZ = (C813430VvZ) obj;
            Object obj2 = null;
            if (c813430VvZ != null && (abstractC1387200mCc = c813430VvZ.LIZ) != null) {
                obj2 = abstractC1387200mCc.LIZ;
            }
            if (obj2 instanceof InterfaceC1603190roz) {
                super.accept(c813430VvZ);
                C0X4D.LJ.LL = true;
            }
            C1C7U.LIZIZ("NoticeCountFetchManager@b197.mainActivityCreateRootPageSubscriber$1");
        }
    };
    public static final C0X4C LJ = new C0X4B<AbstractC1387200mCc>() { // from class: X.0X4C
        @Override // X.C0X4B, X.C09JN
        public final void accept(Object obj) {
            Object obj2;
            C1C7U.LIZ("NoticeCountFetchManager@b197.mainActivityResumeRootPageSubscriber$1");
            AbstractC1387200mCc abstractC1387200mCc = (AbstractC1387200mCc) obj;
            if (abstractC1387200mCc != null) {
                obj2 = abstractC1387200mCc.LIZ;
            } else {
                obj2 = null;
            }
            if (obj2 instanceof InterfaceC1603190roz) {
                super.accept(abstractC1387200mCc);
            }
            C1C7U.LIZIZ("NoticeCountFetchManager@b197.mainActivityResumeRootPageSubscriber$1");
        }
    };

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onLoginStateChangeEvent(C486550J6f c486550J6f) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoginStateChange: ");
        sbLIZ.append(c486550J6f.LIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        C1903780zdo.LJII().LJII();
        IMChatListApi.LJJIII.getClass();
        C890330YwJ.LIZ().LJIIIZ().LIZLLL();
        C1618630sDt.LIZIZ.LJIIIZ(true);
        C19212010Ec.LIZJ.LJLILLLLZI();
        int i2 = c486550J6f.LIZ;
        if (i2 == 0) {
            LJ.LLILLJJLI = true;
        } else {
            if (i2 != 1) {
                return;
            }
            LIZLLL.LLILLL = true;
        }
    }

    public static void LIZ(int i, boolean z) {
        boolean zLJI = MethodIDManager.LJI(137370);
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("query, isDelay=");
        sbLIZ.append(z);
        sbLIZ.append(", source=");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        C1903780zdo.LJII().LJIJI(i, z);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
