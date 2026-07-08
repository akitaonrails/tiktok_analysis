package X;

import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicCrossLinker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1Cdj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2234971Cdj extends C09AY implements Function1<LinkMicCrossLinker, Unit> {
    public final /* synthetic */ C2234371Ccl LL;
    public final /* synthetic */ C920810a4N LLILLJJLI;
    public final /* synthetic */ InterfaceC968200bIo LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2234971Cdj(C2234371Ccl c2234371Ccl, C920810a4N c920810a4N, C966240bFe c966240bFe) {
        super(1);
        this.LL = c2234371Ccl;
        this.LLILLJJLI = c920810a4N;
        this.LLILLL = c966240bFe;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LinkMicCrossLinker linkMicCrossLinker) {
        this.LL.LIZ.LLIILII(this.LLILLJJLI, this.LLILLL);
        return Unit.LIZ;
    }
}
