package X;

import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicCrossLinker;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1Cch, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2234331Cch extends C09AY implements Function1<LinkMicCrossLinker, Boolean> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ boolean LLILLJJLI = false;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2234331Cch(String str) {
        super(1);
        this.LL = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(LinkMicCrossLinker linkMicCrossLinker) {
        return Boolean.valueOf(linkMicCrossLinker.LLIL(this.LL, this.LLILLJJLI));
    }
}
