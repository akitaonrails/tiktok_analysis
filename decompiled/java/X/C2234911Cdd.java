package X;

import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicCrossLinker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1Cdd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2234911Cdd extends C09AY implements Function1<LinkMicCrossLinker, Unit> {
    public final /* synthetic */ C2234371Ccl LL;
    public final /* synthetic */ C969140bKK LLILLJJLI;
    public final /* synthetic */ InterfaceC968200bIo LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2234911Cdd(C2234371Ccl c2234371Ccl, C969140bKK c969140bKK, C966240bFe c966240bFe) {
        super(1);
        this.LL = c2234371Ccl;
        this.LLILLJJLI = c969140bKK;
        this.LLILLL = c966240bFe;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LinkMicCrossLinker linkMicCrossLinker) {
        this.LL.LIZ.LLJJJIL(this.LLILLJJLI, this.LLILLL);
        return Unit.LIZ;
    }
}
