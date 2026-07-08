package X;

import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicCrossLinker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1Cdi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2234961Cdi extends C09AY implements Function1<LinkMicCrossLinker, Unit> {
    public final /* synthetic */ C2234371Ccl LL;
    public final /* synthetic */ C2234021CcC LLILLJJLI;
    public final /* synthetic */ InterfaceC968200bIo LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2234961Cdi(C2234371Ccl c2234371Ccl, C2234021CcC c2234021CcC, C966240bFe c966240bFe) {
        super(1);
        this.LL = c2234371Ccl;
        this.LLILLJJLI = c2234021CcC;
        this.LLILLL = c966240bFe;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LinkMicCrossLinker linkMicCrossLinker) {
        this.LL.LIZ.LJJLIL(this.LLILLJJLI, this.LLILLL);
        return Unit.LIZ;
    }
}
