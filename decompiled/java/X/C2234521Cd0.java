package X;

import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicCrossLinker;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1Cd0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2234521Cd0 extends C09AY implements Function1<LinkMicCrossLinker, Integer> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2234521Cd0(String str) {
        super(1);
        this.LL = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Integer invoke(LinkMicCrossLinker linkMicCrossLinker) {
        return Integer.valueOf(C1282000jSw.LJFF(linkMicCrossLinker.LLJJI(this.LL)));
    }
}
