package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0El9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C373810El9 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C373720El0 LL;
    public final /* synthetic */ C0E48 LLILLJJLI;
    public final /* synthetic */ NLETrackSlot LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C373810El9(C373720El0 c373720El0, C0E48 c0e48, NLETrackSlot nLETrackSlot, int i, boolean z) {
        super(0);
        this.LL = c373720El0;
        this.LLILLJJLI = c0e48;
        this.LLILLL = nLETrackSlot;
        this.LLILZ = i;
        this.LLILZIL = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.LL.T2().LIZJ) {
            InterfaceC351350Dq1 interfaceC351350Dq1LLFII = this.LLILLJJLI.LLFII();
            NLETrackSlot nLETrackSlot = this.LLILLL;
            InterfaceC353240Dt4 interfaceC353240Dt4Ie = this.LLILLJJLI.Ie();
            interfaceC351350Dq1LLFII.LJIL(nLETrackSlot, interfaceC353240Dt4Ie != null ? interfaceC353240Dt4Ie.LJFF() : null, this.LLILZ, !this.LLILZIL, null, null, EnumC356070Dxd.DONE, null);
            C373720El0 c373720El0 = this.LL;
            c373720El0.U5(c373720El0.T2().LIZIZ);
        }
        return Unit.LIZ;
    }
}
