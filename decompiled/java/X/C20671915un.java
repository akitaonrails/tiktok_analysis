package X;

import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.15un, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20671915un extends C09AY implements Function1<AbstractC738140SxQ, Unit> {
    public final /* synthetic */ C20671715ul LL;
    public final /* synthetic */ Assembler LLILLJJLI;
    public final /* synthetic */ int[] LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ InnerPushMessage LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20671915un(C20671715ul c20671715ul, Assembler assembler, int[] iArr, boolean z, InnerPushMessage innerPushMessage) {
        super(1);
        this.LL = c20671715ul;
        this.LLILLJJLI = assembler;
        this.LLILLL = iArr;
        this.LLILZ = z;
        this.LLILZIL = innerPushMessage;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AbstractC738140SxQ abstractC738140SxQ) {
        C19290510dT.LIZLLL("InnerPushAssemWindow", "[assembleMainPartsWithGlobalCustomAssem], no new custom assem");
        this.LL.LJJIJIIJI(true);
        if (abstractC738140SxQ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[show], existed old assem = ");
            sbLIZ.append(abstractC738140SxQ);
            sbLIZ.append(", remove it");
            C19290510dT.LIZLLL("InnerPushAssemWindow", C2188811AlT.LIZIZ(sbLIZ));
            AssemSupervisor assemSupervisorLJJIJIL = this.LL.LJJIJIL();
            if (assemSupervisorLJJIJIL != null) {
                assemSupervisorLJJIJIL.LJIIIZ(null, C13LE.LIZ(abstractC738140SxQ.getClass()));
            }
            this.LL.LJJIJLIJ();
        }
        C20671715ul c20671715ul = this.LL;
        Assembler assembler = this.LLILLJJLI;
        int[] iArr = this.LLILLL;
        c20671715ul.LJJIIJZLJL(assembler, this.LLILZIL, this.LLILZ, iArr);
        return Unit.LIZ;
    }
}
