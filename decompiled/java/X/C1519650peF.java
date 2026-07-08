package X;

import com.bytedance.common.wschannel.model.WsChannelMsg;
import kotlin.jvm.internal.AwS571S0100000_27;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0peF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1519650peF implements C0XEZ, InterfaceC486470J5x {
    public static final C1519650peF LL = new C1519650peF();

    @Override // X.InterfaceC486470J5x
    public final void LIZIZ(WsChannelMsg wsChannelMsg) {
        C815730VzH.LIZ(new AwS571S0100000_27(wsChannelMsg, 1165));
    }

    @Override // X.C0XEZ
    public final void LIZ(C821280WJq c821280WJq, JSONObject jSONObject) {
        C20441214yg.LIZIZ("LiveReplyClipMessageListener", c821280WJq.toString());
    }
}
