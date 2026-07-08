package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicAssertSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicRustMonitorConfigSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0k3M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.linkcore.tracker.TrackerImpl$realSendEvent$proxySender$1$doLogSend$1", f = "TrackerImpl.kt", l = {240}, m = "invokeSuspend")
public final class C1304580k3M extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ C1304590k3N LLILLL;
    public final /* synthetic */ Map<String, String> LLILZ;
    public final /* synthetic */ C945340ahw LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ InterfaceC315080CWs LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1304580k3M(long j, C1304590k3N c1304590k3N, Map<String, String> map, C945340ahw c945340ahw, String str, String str2, InterfaceC315080CWs interfaceC315080CWs, InterfaceC1364105Vn<? super C1304580k3M> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = c1304590k3N;
        this.LLILZ = map;
        this.LLILZIL = c945340ahw;
        this.LLILZLL = str;
        this.LLIZ = str2;
        this.LLIZLLLIL = interfaceC315080CWs;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1304580k3M(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLIZIZ;
        C1C7U.LIZ("TrackerImpl@989c.realSendEvent$proxySender$1$doLogSend$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                long j = this.LLILLJJLI;
                Map<String, String> map = this.LLILZ;
                C315060CWq c315060CWq = new C315060CWq(this.LLIZLLLIL, this.LLILZIL, this.LLILZLL, this.LLIZ, map, null);
                this.LL = 1;
                if (C099A.LIZIZ(j, c315060CWq, this) == objLJFF) {
                    C1C7U.LIZIZ("TrackerImpl@989c.realSendEvent$proxySender$1$doLogSend$1");
                    return objLJFF;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1304590k3N c1304590k3N = this.LLILLL;
            Map<String, String> map2 = this.LLILZ;
            c1304590k3N.getClass();
            if (e instanceof C094W) {
                strLIZIZ = "[TrackerErr] downgrade because sender timed out";
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[TrackerErr] downgrade because failed: ");
                sbLIZ.append(e);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            IllegalStateException illegalStateException = new IllegalStateException(strLIZIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("call tracker native error: ");
            sbLIZ2.append(illegalStateException.getMessage());
            C939210aY3.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2), "CallException");
            if (C1304630k3R.LIZIZ && LinkMicAssertSetting.INSTANCE.enable()) {
                throw new AssertionError(illegalStateException);
            }
            if (LinkMicRustMonitorConfigSetting.INSTANCE.canReport()) {
                C1304660k3U.LIZ.LIZIZ(520, "call tracker error", illegalStateException, null);
            }
            InterfaceC315080CWs interfaceC315080CWs = c1304590k3N.LJFF;
            if (interfaceC315080CWs != null) {
                interfaceC315080CWs.LIZJ(map2);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TrackerImpl@989c.realSendEvent$proxySender$1$doLogSend$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
