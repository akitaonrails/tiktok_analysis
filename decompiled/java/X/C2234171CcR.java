package X;

import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicCrossLinker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1CcR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2234171CcR extends C09AY implements Function1<LinkMicCrossLinker, Unit> {
    public final /* synthetic */ C2234371Ccl LL;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ boolean LLILLJJLI = true;
    public final /* synthetic */ boolean LLILZ = true;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2234171CcR(C2234371Ccl c2234371Ccl, boolean z) {
        super(1);
        this.LL = c2234371Ccl;
        this.LLILLL = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LinkMicCrossLinker linkMicCrossLinker) {
        this.LL.LIZ.LLILIL(this.LLILLJJLI, this.LLILLL, this.LLILZ);
        return Unit.LIZ;
    }
}
