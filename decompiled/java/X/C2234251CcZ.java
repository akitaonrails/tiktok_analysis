package X;

import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicCrossLinker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1CcZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2234251CcZ extends C09AY implements Function1<LinkMicCrossLinker, Unit> {
    public final /* synthetic */ C2234371Ccl LL;
    public final /* synthetic */ C972290bPP LLILLJJLI;
    public final /* synthetic */ InterfaceC968200bIo LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2234251CcZ(C2234371Ccl c2234371Ccl, C972290bPP c972290bPP, InterfaceC968200bIo interfaceC968200bIo) {
        super(1);
        this.LL = c2234371Ccl;
        this.LLILLJJLI = c972290bPP;
        this.LLILLL = interfaceC968200bIo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LinkMicCrossLinker linkMicCrossLinker) {
        this.LL.LIZ.LJJLIIIJ(this.LLILLJJLI, this.LLILLL);
        return Unit.LIZ;
    }
}
