package X;

import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicCrossLinker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1CcL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2234111CcL extends C09AY implements Function1<LinkMicCrossLinker, Unit> {
    public final /* synthetic */ C2234371Ccl LL;
    public final /* synthetic */ C2227521CGg LLILLJJLI;
    public final /* synthetic */ String LLILLL = "";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2234111CcL(C2234371Ccl c2234371Ccl, C2227521CGg c2227521CGg) {
        super(1);
        this.LL = c2234371Ccl;
        this.LLILLJJLI = c2227521CGg;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LinkMicCrossLinker linkMicCrossLinker) {
        this.LL.LIZ.LJIJJLI(this.LLILLJJLI, this.LLILLL);
        return Unit.LIZ;
    }
}
