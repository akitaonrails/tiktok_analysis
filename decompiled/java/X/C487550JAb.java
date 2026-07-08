package X;

import com.bytedance.common.wschannel.model.WsChannelMsg;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0JAb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C487550JAb implements InterfaceC486470J5x, C0XEZ {
    public static final C487550JAb LL = new C487550JAb();
    public static boolean LLILLJJLI;
    public static Function1<? super String, Unit> LLILLL;

    @Override // X.C0XEZ
    public final void LIZ(C821280WJq c821280WJq, JSONObject jSONObject) {
    }

    @Override // X.InterfaceC486470J5x
    public final void LIZIZ(WsChannelMsg wsChannelMsg) {
        Function1<? super String, Unit> function1;
        if (wsChannelMsg.LIZ() != null && (function1 = LLILLL) != null) {
            function1.invoke(new String(wsChannelMsg.LIZ(), Charsets.UTF_8));
        }
    }
}
