package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.im.core.common.statusmsg.BusinessCommandMessage;
import com.bytedance.im.core.proto.status_message.StatusMessage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.ai.api.bot.IMAIBotInfo;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.062D, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.bot.repo.AIBotStatusChannelDataSource$onReceiveStatusMessage$1", f = "AIBotStatusChannelDataSource.kt", l = {LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT}, m = "invokeSuspend")
public final class C062D extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C062B LLILLL;
    public final /* synthetic */ BusinessCommandMessage LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C062D(C062B c062b, BusinessCommandMessage businessCommandMessage, InterfaceC1364105Vn<? super C062D> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c062b;
        this.LLILZ = businessCommandMessage;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C062D c062d = new C062D(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c062d.LLILLJJLI = obj;
        return c062d;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C2248961D0s c098200Yq;
        C1C7U.LIZ("AIBotStatusChannelDataSource@12ac.onReceiveStatusMessage$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C062B c062b = this.LLILLL;
            BusinessCommandMessage businessCommandMessage = this.LLILZ;
            synchronized (c062b) {
                try {
                    StatusMessage statusMessage = businessCommandMessage.getStatusMessage();
                    if (statusMessage == null) {
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("AIBotStatusChannelDataSource@12ac.onReceiveStatusMessage$1");
                        return unit;
                    }
                    try {
                        c098200Yq = C2248961D0s.ADAPTER.decode(statusMessage.value);
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    C062E c062e = null;
                    if (C189200o6.m7isFailureimpl(c098200Yq)) {
                        c098200Yq = null;
                    }
                    C2248961D0s c2248961D0s = (C2248961D0s) c098200Yq;
                    if (c2248961D0s == null) {
                        Unit unit2 = Unit.LIZ;
                        C1C7U.LIZIZ("AIBotStatusChannelDataSource@12ac.onReceiveStatusMessage$1");
                        return unit2;
                    }
                    C2257681DYg c2257681DYg = c2248961D0s.bot_info;
                    if (c2257681DYg != null) {
                        c062e = c2257681DYg.status;
                    }
                    Objects.toString(c062e);
                    Objects.toString(c2248961D0s.bot_info);
                    IMAIBotInfo iMAIBotInfoLIZIZ = C062B.LIZIZ(c2248961D0s);
                    AnonymousClass0623 anonymousClass0623 = this.LLILLL.LIZ;
                    List<IMAIBotInfo> listSingletonList = Collections.singletonList(iMAIBotInfoLIZIZ);
                    this.LL = 1;
                    if (anonymousClass0623.LIZLLL(listSingletonList, this) == objLJFF) {
                        C1C7U.LIZIZ("AIBotStatusChannelDataSource@12ac.onReceiveStatusMessage$1");
                        return objLJFF;
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("AIBotStatusChannelDataSource@12ac.onReceiveStatusMessage$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
