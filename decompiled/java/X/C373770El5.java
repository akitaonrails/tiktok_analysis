package X;

import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0El5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C373770El5 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C013C LL;
    public final /* synthetic */ C373740El2 LLILLJJLI;
    public final /* synthetic */ C0E48 LLILLL;
    public final /* synthetic */ NLETrackSlot LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C373770El5(C013C c013c, C373740El2 c373740El2, C0E48 c0e48, NLETrackSlot nLETrackSlot, int i, boolean z) {
        super(0);
        this.LL = c013c;
        this.LLILLJJLI = c373740El2;
        this.LLILLL = c0e48;
        this.LLILZ = nLETrackSlot;
        this.LLILZIL = i;
        this.LLILZLL = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        NLEResourceNode nLEResourceNode;
        if (!this.LL.element) {
            this.LLILLJJLI.n5().ZD();
        }
        C380780EwO c380780EwOVL0 = this.LLILLJJLI.n5().VL0();
        if (c380780EwOVL0 != null) {
            C357270DzZ c357270DzZX5 = this.LLILLJJLI.x5();
            C376300EpA.LIZ("select_stroke", c357270DzZX5 != null ? c357270DzZX5.LJIIJ() : null, c380780EwOVL0.LIZJ, null, null, 24);
            nLEResourceNode = new NLEResourceNode();
            nLEResourceNode.setResourceId(c380780EwOVL0.LJ);
            nLEResourceNode.setResourceFile(c380780EwOVL0.LJFF);
            nLEResourceNode.setExtra("biz_res_id", c380780EwOVL0.LJ);
        } else {
            nLEResourceNode = null;
        }
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII = this.LLILLL.LLFII();
        NLETrackSlot nLETrackSlot = this.LLILZ;
        InterfaceC353240Dt4 interfaceC353240Dt4Ie = this.LLILLL.Ie();
        interfaceC351350Dq1LLFII.LJIL(nLETrackSlot, interfaceC353240Dt4Ie != null ? interfaceC353240Dt4Ie.LJFF() : null, this.LLILZIL, !this.LLILZLL, nLEResourceNode, c380780EwOVL0 != null ? C383430F1p.LIZIZ(c380780EwOVL0) : null, EnumC356070Dxd.DONE, null);
        InterfaceC373920ElK interfaceC373920ElKZ4 = this.LLILLJJLI.Z4();
        interfaceC373920ElKZ4.Ml2(interfaceC373920ElKZ4.c31().LIZJ());
        return Unit.LIZ;
    }
}
