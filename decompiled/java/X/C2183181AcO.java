package X;

import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicResponseCallback;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1AcO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2183181AcO extends C09AY implements Function1<Throwable, Unit> {
    public final /* synthetic */ LinkMicResponseCallback LL;
    public final /* synthetic */ C2183221AcS LLILLJJLI;
    public final /* synthetic */ C2183171AcN LLILLL;
    public final /* synthetic */ C2183211AcR LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2183181AcO(LinkMicResponseCallback linkMicResponseCallback, C2183221AcS c2183221AcS, C2183171AcN c2183171AcN, C2183211AcR c2183211AcR) {
        super(1);
        this.LL = linkMicResponseCallback;
        this.LLILLJJLI = c2183221AcS;
        this.LLILLL = c2183171AcN;
        this.LLILZ = c2183211AcR;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) throws Exception {
        Object c098200Yq;
        Throwable th2 = th;
        C2183221AcS c2183221AcS = this.LLILLJJLI;
        C2183171AcN c2183171AcN = this.LLILLL;
        C2183211AcR c2183211AcR = this.LLILZ;
        Throwable th3 = null;
        try {
            if (th2 instanceof C501470JlZ) {
                String logId = ((C501470JlZ) th2).getLogId();
                String str = "";
                if (logId == null) {
                    logId = "";
                }
                c2183221AcS.LIZJ = logId;
                InterfaceC2181441AZa interfaceC2181441AZa = c2183171AcN.LL;
                String str2 = c2183171AcN.LLILLJJLI;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("on sendRequest Error: ");
                sbLIZ.append(c2183211AcR);
                sbLIZ.append(", and error is ");
                sbLIZ.append(th2);
                C1AZW.LJI(interfaceC2181441AZa, str2, C2188811AlT.LIZIZ(sbLIZ), null, null);
                long errorCode = ((C501470JlZ) th2).getErrorCode();
                String errorMsg = ((C501470JlZ) th2).getErrorMsg();
                if (errorMsg == null) {
                    errorMsg = "";
                }
                String prompt = ((C501470JlZ) th2).getPrompt();
                if (prompt == null) {
                    prompt = "";
                }
                String alert = ((C501470JlZ) th2).getAlert();
                if (alert == null) {
                    alert = "";
                }
                String extra = ((C501470JlZ) th2).getExtra();
                if (extra != null) {
                    str = extra;
                }
                c2183221AcS.LJ = new C966980bGq(errorCode, errorMsg, prompt, alert, str);
            } else {
                C1862200yYk c1862200yYkLIZ = C1862160yYg.LIZ(th2);
                InterfaceC2181441AZa interfaceC2181441AZa2 = c2183171AcN.LL;
                String str3 = c2183171AcN.LLILLJJLI;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("on sendRequest unknown Error: ");
                sbLIZ2.append(c2183211AcR);
                sbLIZ2.append(", and error is ");
                sbLIZ2.append(c1862200yYkLIZ);
                C1AZW.LJI(interfaceC2181441AZa2, str3, C2188811AlT.LIZIZ(sbLIZ2), null, null);
                long j = c1862200yYkLIZ.LIZIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(c1862200yYkLIZ.LIZ);
                sbLIZ3.append(c1862200yYkLIZ.LIZJ);
                c2183221AcS.LJ = new C966980bGq(j, C2188811AlT.LIZIZ(sbLIZ3), "", "", "");
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th4) {
            TryCatchGuardChecker.doCheck(th4);
            c098200Yq = new C098200Yq(th4);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C2183171AcN c2183171AcN2 = this.LLILLL;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            InterfaceC2181441AZa interfaceC2181441AZa3 = c2183171AcN2.LL;
            String str4 = c2183171AcN2.LLILLJJLI;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("call on Error: ");
            sbLIZ4.append(thM5exceptionOrNullimpl);
            C1AZW.LJI(interfaceC2181441AZa3, str4, C2188811AlT.LIZIZ(sbLIZ4), null, null);
        }
        LinkMicResponseCallback linkMicResponseCallback = this.LL;
        try {
            linkMicResponseCallback.LIZIZ(this.LLILLJJLI);
            C1306420k6K.LIZ(linkMicResponseCallback, null);
            return Unit.LIZ;
        } finally {
            try {
                try {
                } catch (Throwable th5) {
                    while (true) {
                    }
                }
            } catch (Throwable th6) {
            }
        }
    }
}
