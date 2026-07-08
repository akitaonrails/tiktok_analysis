package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.feed.platform.popup.dynamic.DynamicPopupInfo;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: X.15qU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class RunnableC20645215qU implements Runnable {
    public final /* synthetic */ C20644815qQ LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ InterfaceC20646115qd LLILZLL;

    public RunnableC20645215qU(C20644815qQ c20644815qQ, String str, boolean z, String str2, boolean z2, InterfaceC20646115qd interfaceC20646115qd) {
        this.LL = c20644815qQ;
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = str2;
        this.LLILZIL = z2;
        this.LLILZLL = interfaceC20646115qd;
    }

    public final void LIZ() {
        C20644815qQ c20644815qQ = this.LL;
        ReentrantLock reentrantLock = c20644815qQ.LJII;
        String str = this.LLILLJJLI;
        boolean z = this.LLILLL;
        String str2 = this.LLILZ;
        boolean z2 = this.LLILZIL;
        InterfaceC20646115qd interfaceC20646115qd = this.LLILZLL;
        reentrantLock.lock();
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("callbackLoadFail: ");
            sbLIZ.append(str);
            sbLIZ.append(", info=");
            sbLIZ.append(c20644815qQ.LIZ.LIZ());
            sbLIZ.append(", status=");
            sbLIZ.append(c20644815qQ.LIZLLL.ordinal());
            C20589415hU.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            if (!z && c20644815qQ.LIZLLL != EnumC20574215f2.LLILLL) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("callbackLoadFail: duplicate fail, info=");
                sbLIZ2.append(c20644815qQ.LIZ.LIZ());
                C20589415hU.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
                reentrantLock.unlock();
                return;
            }
            C1877490yxP c1877490yxP = C1877490yxP.LIZ;
            EnumC20645715qZ enumC20645715qZ = EnumC20645715qZ.LOAD;
            DynamicPopupInfo dynamicPopupInfo = c20644815qQ.LIZ;
            String str3 = dynamicPopupInfo.popupKey;
            String str4 = dynamicPopupInfo.triggerId;
            String str5 = dynamicPopupInfo.LIZ;
            String str6 = dynamicPopupInfo.triggerTiming;
            c1877490yxP.getClass();
            C1877490yxP.LIZ(enumC20645715qZ, str, str3, str4, str5, str6, str2);
            EnumC20574215f2 enumC20574215f2 = c20644815qQ.LIZLLL;
            c20644815qQ.LIZLLL = EnumC20574215f2.LLILLJJLI;
            if (enumC20574215f2 == EnumC20574215f2.LL) {
                C20645115qT c20645115qT = c20644815qQ.LJI;
                if (c20645115qT != null) {
                    c20645115qT.LJIIL();
                }
            } else {
                if (z2) {
                    c20644815qQ.LIZJ(str);
                }
                if (interfaceC20646115qd != null) {
                    interfaceC20646115qd.LIZIZ();
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("FeedPopupSparkManager@3661.callbackLoadFail$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FeedPopupSparkManager@3661.callbackLoadFail$1");
    }
}
