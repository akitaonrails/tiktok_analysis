package X;

import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicCrossLinker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1CcX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2234231CcX extends C09AY implements Function1<LinkMicCrossLinker, Unit> {
    public final /* synthetic */ C2234371Ccl LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ EnumC2233251Cax LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2234231CcX(C2234371Ccl c2234371Ccl, long j, int i, EnumC2233251Cax enumC2233251Cax) {
        super(1);
        this.LL = c2234371Ccl;
        this.LLILLJJLI = j;
        this.LLILLL = i;
        this.LLILZ = enumC2233251Cax;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LinkMicCrossLinker linkMicCrossLinker) {
        this.LL.LIZ.LLJLLL(this.LLILLJJLI, this.LLILLL, this.LLILZ);
        return Unit.LIZ;
    }
}
