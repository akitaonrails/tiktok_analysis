package X;

import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicCrossLinker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1CdV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2234831CdV extends C09AY implements Function1<LinkMicCrossLinker, Unit> {
    public final /* synthetic */ C2234371Ccl LL;
    public final /* synthetic */ C969130bKJ LLILLJJLI;
    public final /* synthetic */ InterfaceC968200bIo LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2234831CdV(C2234371Ccl c2234371Ccl, C969130bKJ c969130bKJ, C966240bFe c966240bFe) {
        super(1);
        this.LL = c2234371Ccl;
        this.LLILLJJLI = c969130bKJ;
        this.LLILLL = c966240bFe;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LinkMicCrossLinker linkMicCrossLinker) {
        this.LL.LIZ.LLJILJIL(this.LLILLJJLI, this.LLILLL);
        return Unit.LIZ;
    }
}
