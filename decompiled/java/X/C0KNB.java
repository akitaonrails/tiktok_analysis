package X;

import com.bytedance.android.livesdk.model.message.PushContractStatusResult;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.0KNB, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KNB implements InterfaceC486470J5x {
    public static boolean LLILLJJLI;
    public static final C0KNB LL = new C0KNB();
    public static final Set<C0KOA> LLILLL = new LinkedHashSet();

    @Override // X.InterfaceC486470J5x
    public final void LIZIZ(WsChannelMsg wsChannelMsg) {
        try {
            C0K51.LJIIJJI(new C0KNF((PushContractStatusResult) C19748512Ol.LIZIZ.LJII(new String(wsChannelMsg.LIZ(), Charsets.UTF_8), PushContractStatusResult.class)));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
