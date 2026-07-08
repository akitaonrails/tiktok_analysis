package X;

import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicCrossLinker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1Ce6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2235201Ce6 extends C09AY implements Function1<LinkMicCrossLinker, Unit> {
    public final /* synthetic */ C969440bKo LL;
    public final /* synthetic */ InterfaceC968200bIo LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2235201Ce6(C969440bKo c969440bKo, C966240bFe c966240bFe) {
        super(1);
        this.LL = c969440bKo;
        this.LLILLJJLI = c966240bFe;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LinkMicCrossLinker linkMicCrossLinker) {
        linkMicCrossLinker.LJIILLIIL(this.LL, this.LLILLJJLI);
        return Unit.LIZ;
    }
}
