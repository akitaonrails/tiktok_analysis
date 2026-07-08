package X;

import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicCrossLinker;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1Cd4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2234561Cd4 extends C09AY implements Function1<LinkMicCrossLinker, Unit> {
    public final /* synthetic */ C2234371Ccl LL;
    public final /* synthetic */ List<String> LLILLJJLI;
    public final /* synthetic */ InterfaceC967450bHb LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2234561Cd4(C2234371Ccl c2234371Ccl, List<String> list, InterfaceC967450bHb interfaceC967450bHb) {
        super(1);
        this.LL = c2234371Ccl;
        this.LLILLJJLI = list;
        this.LLILLL = interfaceC967450bHb;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LinkMicCrossLinker linkMicCrossLinker) {
        this.LL.LIZ.LLJZ(this.LLILLJJLI);
        InterfaceC967450bHb interfaceC967450bHb = this.LLILLL;
        if (interfaceC967450bHb != null) {
            interfaceC967450bHb.LJJL();
        }
        return Unit.LIZ;
    }
}
