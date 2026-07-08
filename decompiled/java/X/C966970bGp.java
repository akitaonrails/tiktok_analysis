package X;

import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicRtcDispatcher;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bGp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C966970bGp extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1276910jKj LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C966970bGp(C1276910jKj c1276910jKj, String str) {
        super(0);
        this.LL = c1276910jKj;
        this.LLILLJJLI = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        LinkMicRtcDispatcher linkMicRtcDispatcher = this.LL.LLJJLIIIJLLLLLLLZ;
        if (linkMicRtcDispatcher != null) {
            linkMicRtcDispatcher.LJFF(this.LLILLJJLI);
        }
        if (this.LL.LLILZ.LJIILIIL()) {
            C966020bFI c966020bFI = this.LL.LLILZ;
            c966020bFI.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("leaveRtcRoom token:");
            sbLIZ.append("AuxStream");
            C20441214yg.LIZIZ("RustLinker", C2188811AlT.LIZIZ(sbLIZ));
            c966020bFI.LJ().LJJJLIIL();
        }
        return Unit.LIZ;
    }
}
