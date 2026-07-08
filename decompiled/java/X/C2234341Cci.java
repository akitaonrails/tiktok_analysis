package X;

import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicCrossLinker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1Cci, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2234341Cci extends C09AY implements Function1<LinkMicCrossLinker, Unit> {
    public final /* synthetic */ C2234371Ccl LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ String LLILZ = "business_mute_remote_host";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2234341Cci(C2234371Ccl c2234371Ccl, long j, boolean z) {
        super(1);
        this.LL = c2234371Ccl;
        this.LLILLJJLI = j;
        this.LLILLL = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LinkMicCrossLinker linkMicCrossLinker) {
        this.LL.LIZ.LLJJ(this.LLILLJJLI, this.LLILZ, this.LLILLL);
        return Unit.LIZ;
    }
}
