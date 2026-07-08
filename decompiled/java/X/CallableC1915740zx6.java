package X;

import Y.ARunnableS22S1300000_28;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.pns.consent.core.network.BaseResponse;
import com.ss.android.ugc.aweme.pns.consent.core.network.ConsentRecordRequestBody;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0zx6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class CallableC1915740zx6<V> implements Callable {
    public final /* synthetic */ List<C1876860ywO> LL;
    public final /* synthetic */ C1915790zxB LLILLJJLI;
    public final /* synthetic */ InterfaceC1915880zxK LLILLL;
    public final /* synthetic */ String LLILZ;

    public CallableC1915740zx6(InterfaceC1915880zxK interfaceC1915880zxK, C1915790zxB c1915790zxB, String str, List list) {
        this.LL = list;
        this.LLILLJJLI = c1915790zxB;
        this.LLILLL = interfaceC1915880zxK;
        this.LLILZ = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object c098200Yq;
        Object objLJ;
        C1C7U.LIZ("ConsentApiManager@24f3.createConsentRecord$1");
        List<C1876860ywO> list = this.LL;
        final ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (C1876860ywO c1876860ywO : list) {
            arrayList.add(new ConsentRecordRequestBody(c1876860ywO.LIZJ, c1876860ywO.LIZIZ.getI(), c1876860ywO.LIZ, c1876860ywO.LIZLLL, c1876860ywO.LJI));
        }
        try {
            c098200Yq = new Gson().LJIILL(arrayList);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = "";
        }
        String str = (String) c098200Yq;
        if (str.length() > 0) {
            C15O7<BaseResponse> c15o7LIZ = ((InterfaceC1915760zx8) this.LLILLJJLI.LIZLLL.getValue()).LIZ(str, "2.7.4.4", "pns_consent_sdk");
            final C1915790zxB c1915790zxB = this.LLILLJJLI;
            final InterfaceC1915880zxK interfaceC1915880zxK = this.LLILLL;
            final String str2 = this.LLILZ;
            final List<C1876860ywO> list2 = this.LL;
            objLJ = c15o7LIZ.LJ(new InterfaceC2385309Wh() { // from class: X.0zx7
                @Override // X.InterfaceC2385309Wh
                public final Object then(C15O7<BaseResponse> c15o7) {
                    int i;
                    Exception excLJIIJJI;
                    String message;
                    String string;
                    String message2;
                    Object objValueOf;
                    String str3;
                    BaseResponse baseResponseLJIIL;
                    Exception excLJIIJJI2;
                    String message3;
                    String string2;
                    String message4;
                    String str4;
                    C1C7U.LIZ("ConsentApiManager@24f3.createConsentRecord$1$1");
                    BaseResponse baseResponseLJIIL2 = c15o7.LJIIL();
                    if (baseResponseLJIIL2 != null) {
                        i = baseResponseLJIIL2.statusCode;
                    } else {
                        i = -2;
                    }
                    C1915790zxB c1915790zxB2 = c1915790zxB;
                    int i2 = c1915790zxB2.LJFF + 1;
                    c1915790zxB2.LJFF = i2;
                    if (Integer.compare(Integer.MIN_VALUE ^ i2, -2147483645) < 0 && (i == 10035 || i == 20007 || i == 499 || (500 <= i && i < 600))) {
                        objValueOf = Boolean.valueOf(C786410Ut5.LJLIIL(1000L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS22S1300000_28(c1915790zxB, str2, list2, interfaceC1915880zxK, 0)));
                    } else if (c15o7.LJIILJJIL() && c15o7.LJIIL() != null && (baseResponseLJIIL = c15o7.LJIIL()) != null && baseResponseLJIIL.statusCode == 0) {
                        c1915790zxB.LJFF = 0;
                        BaseResponse baseResponseLJIIL3 = c15o7.LJIIL();
                        String str5 = "onSuccess";
                        if ((baseResponseLJIIL3 == null || (message3 = baseResponseLJIIL3.statusMsg) == null) && ((excLJIIJJI2 = c15o7.LJIIJJI()) == null || (message3 = excLJIIJJI2.getMessage()) == null)) {
                            message3 = "onSuccess";
                        }
                        InterfaceC1915880zxK interfaceC1915880zxK2 = interfaceC1915880zxK;
                        if (interfaceC1915880zxK2 != null) {
                            interfaceC1915880zxK2.LIZ(i, message3);
                        }
                        C1915660zwy c1915660zwy = c1915790zxB.LIZIZ;
                        BaseResponse baseResponseLJIIL4 = c15o7.LJIIL();
                        if (baseResponseLJIIL4 == null || (string2 = Integer.valueOf(baseResponseLJIIL4.statusCode).toString()) == null) {
                            string2 = "onSuccess";
                        }
                        BaseResponse baseResponseLJIIL5 = c15o7.LJIIL();
                        if (baseResponseLJIIL5 != null && (str4 = baseResponseLJIIL5.statusMsg) != null) {
                            str5 = str4;
                        } else {
                            Exception excLJIIJJI3 = c15o7.LJIIJJI();
                            if (excLJIIJJI3 != null && (message4 = excLJIIJJI3.getMessage()) != null) {
                                str5 = message4;
                            }
                        }
                        c1915660zwy.LIZ("/consent/api/record/create/v2", string2, str5, str2, arrayList);
                        C1915890zxL c1915890zxL = c1915790zxB.LIZJ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("updateConsentStatus success: statusCode = ");
                        sbLIZ.append(i);
                        sbLIZ.append(", statusMsg = ");
                        sbLIZ.append(message3);
                        C2188811AlT.LIZIZ(sbLIZ);
                        c1915890zxL.getClass();
                        objValueOf = Unit.LIZ;
                    } else {
                        c1915790zxB.LJFF = 0;
                        BaseResponse baseResponseLJIIL6 = c15o7.LJIIL();
                        String str6 = "!it.isCompleted || it.result == null || it.result?.statusCode != 0";
                        if ((baseResponseLJIIL6 == null || (message = baseResponseLJIIL6.statusMsg) == null) && ((excLJIIJJI = c15o7.LJIIJJI()) == null || (message = excLJIIJJI.getMessage()) == null)) {
                            message = "!it.isCompleted || it.result == null || it.result?.statusCode != 0";
                        }
                        InterfaceC1915880zxK interfaceC1915880zxK3 = interfaceC1915880zxK;
                        if (interfaceC1915880zxK3 != null) {
                            interfaceC1915880zxK3.onFailure(i, message);
                        }
                        C1915660zwy c1915660zwy2 = c1915790zxB.LIZIZ;
                        BaseResponse baseResponseLJIIL7 = c15o7.LJIIL();
                        if (baseResponseLJIIL7 == null || (string = Integer.valueOf(baseResponseLJIIL7.statusCode).toString()) == null) {
                            string = "!it.isCompleted || it.result == null || it.result?.statusCode != 0";
                        }
                        BaseResponse baseResponseLJIIL8 = c15o7.LJIIL();
                        if (baseResponseLJIIL8 != null && (str3 = baseResponseLJIIL8.statusMsg) != null) {
                            str6 = str3;
                        } else {
                            Exception excLJIIJJI4 = c15o7.LJIIJJI();
                            if (excLJIIJJI4 != null && (message2 = excLJIIJJI4.getMessage()) != null) {
                                str6 = message2;
                            }
                        }
                        c1915660zwy2.LIZ("/consent/api/record/create/v2", string, str6, str2, arrayList);
                        C1915890zxL c1915890zxL2 = c1915790zxB.LIZJ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("updateConsentStatus fail: statusCode = ");
                        sbLIZ2.append(i);
                        sbLIZ2.append(", statusMsg = ");
                        sbLIZ2.append(message);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        c1915890zxL2.getClass();
                        objValueOf = Unit.LIZ;
                    }
                    C1C7U.LIZIZ("ConsentApiManager@24f3.createConsentRecord$1$1");
                    return objValueOf;
                }
            }, C807400Vlq.LIZ(), null);
        } else {
            InterfaceC1915880zxK interfaceC1915880zxK2 = this.LLILLL;
            if (interfaceC1915880zxK2 != null) {
                interfaceC1915880zxK2.onFailure(-2, "fail to parse records list to json");
            }
            getClass();
            objLJ = Unit.LIZ;
        }
        C1C7U.LIZIZ("ConsentApiManager@24f3.createConsentRecord$1");
        return objLJ;
    }
}
