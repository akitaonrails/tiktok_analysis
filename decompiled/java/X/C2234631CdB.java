package X;

import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicCrossLinker;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1CdB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2234631CdB extends C09AY implements Function1<LinkMicCrossLinker, C967180bHA> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2234631CdB(String str) {
        super(1);
        this.LL = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C967180bHA invoke(LinkMicCrossLinker linkMicCrossLinker) {
        return linkMicCrossLinker.LJLJI(this.LL);
    }
}
