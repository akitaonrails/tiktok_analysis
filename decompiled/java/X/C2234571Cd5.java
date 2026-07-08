package X;

import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicCrossLinker;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1Cd5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2234571Cd5 extends C09AY implements Function1<LinkMicCrossLinker, Long> {
    public final /* synthetic */ long LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2234571Cd5(long j) {
        super(1);
        this.LL = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Long invoke(LinkMicCrossLinker linkMicCrossLinker) {
        return Long.valueOf(linkMicCrossLinker.LLJJLIIIJLLLLLLLZ(this.LL));
    }
}
