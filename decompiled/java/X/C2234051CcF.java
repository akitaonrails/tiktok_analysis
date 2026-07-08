package X;

import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicMultiLinker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1CcF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2234051CcF extends C09AY implements Function0<Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;
    public final /* synthetic */ C2234651CdD LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2234051CcF(boolean z, Function0<Unit> function0, C2234651CdD c2234651CdD, String str) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = function0;
        this.LLILLL = c2234651CdD;
        this.LLILZ = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        if (this.LL) {
            this.LLILLJJLI.invoke();
        } else {
            LinkMicMultiLinker linkMicMultiLinker = this.LLILLL.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LLILLL.hashCode());
            sbLIZ.append('_');
            sbLIZ.append(this.LLILZ);
            linkMicMultiLinker.LJJJZ(new C2234021CcC(C2188811AlT.LIZIZ(sbLIZ), C1282000jSw.LIZ(Intrinsics.LJFF(this.LLILZ, "rtc_error") ? 10011L : 0L), C1AZU.Inner), new C1CMK(this.LLILLJJLI));
        }
        return Unit.LIZ;
    }
}
