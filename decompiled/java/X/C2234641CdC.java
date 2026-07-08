package X;

import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicCrossLinker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1CdC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2234641CdC extends C09AY implements Function1<LinkMicCrossLinker, Unit> {
    public final /* synthetic */ C2234371Ccl LL;
    public final /* synthetic */ C1CKR LLILLJJLI;
    public final /* synthetic */ InterfaceC968200bIo LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2234641CdC(C2234371Ccl c2234371Ccl, C1CKR c1ckr, InterfaceC968200bIo interfaceC968200bIo) {
        super(1);
        this.LL = c2234371Ccl;
        this.LLILLJJLI = c1ckr;
        this.LLILLL = interfaceC968200bIo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LinkMicCrossLinker linkMicCrossLinker) {
        this.LL.LIZ.LLILLL(this.LLILLJJLI, this.LLILLL);
        return Unit.LIZ;
    }
}
