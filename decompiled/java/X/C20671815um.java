package X;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.ss.android.ugc.aweme.innerpush.refactor.assem.BottomSlotAssem;
import com.ss.android.ugc.aweme.innerpush.refactor.assem.LeftAvatarAssem;
import com.ss.android.ugc.aweme.innerpush.refactor.assem.LeftSlotAssem;
import com.ss.android.ugc.aweme.innerpush.refactor.assem.MiddleSlotAssem;
import com.ss.android.ugc.aweme.innerpush.refactor.assem.RightSlotAssem;
import com.ss.android.ugc.aweme.innerpush.refactor.assem.TopSlotAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.15um, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20671815um extends C09AY implements Function1<AbstractC738140SxQ, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ InnerPushMessage LLILLJJLI;
    public final /* synthetic */ C20671715ul LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ Assembler LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20671815um(int i, InnerPushMessage innerPushMessage, C20671715ul c20671715ul, boolean z, Assembler assembler) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = innerPushMessage;
        this.LLILLL = c20671715ul;
        this.LLILZ = z;
        this.LLILZIL = assembler;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AbstractC738140SxQ abstractC738140SxQ) {
        AbstractC738140SxQ abstractC738140SxQ2 = abstractC738140SxQ;
        if (abstractC738140SxQ2 != null) {
            C19290510dT.LIZLLL("InnerPushAssemWindow", "[assembleMainParts], existed old assem");
            if (C13LQ.LJJIJIIJI(C13LE.LIZ(abstractC738140SxQ2.getClass()), new C13IQ[]{C13LE.LIZ(LeftSlotAssem.class), C13LE.LIZ(LeftAvatarAssem.class), C13LE.LIZ(MiddleSlotAssem.class), C13LE.LIZ(RightSlotAssem.class), C13LE.LIZ(TopSlotAssem.class), C13LE.LIZ(BottomSlotAssem.class)}) >= 0) {
                C19290510dT.LIZLLL("InnerPushAssemWindow", "[assembleMainParts], existed platform assem, just update its states");
                int i = this.LL;
                if (i != 4) {
                    if (i != 5) {
                        this.LLILLL.LJJJI(i, this.LLILLJJLI.getUiTemplate(), this.LLILZ);
                    } else {
                        InnerPushUITemplate uiTemplate = this.LLILLJJLI.getUiTemplate();
                        if (uiTemplate != null && uiTemplate.bottomType == 0) {
                            AssemSupervisor assemSupervisorLJJIJIL = this.LLILLL.LJJIJIL();
                            if (assemSupervisorLJJIJIL != null) {
                                C1276604z6.LJ(assemSupervisorLJJIJIL, (ViewGroup) this.LLILLL.LLJJJ.getValue(), abstractC738140SxQ2);
                            }
                            C786410Ut5.LJZ(8, (FrameLayout) this.LLILLL.LLJJJ.getValue());
                        } else {
                            this.LLILLL.LJJJI(this.LL, this.LLILLJJLI.getUiTemplate(), this.LLILZ);
                        }
                    }
                } else {
                    InnerPushUITemplate uiTemplate2 = this.LLILLJJLI.getUiTemplate();
                    if (uiTemplate2 != null && uiTemplate2.topType == 0) {
                        C19290510dT.LIZLLL("InnerPushAssemWindow", "[assembleMainParts] invalid top type, unload assem");
                        AssemSupervisor assemSupervisorLJJIJIL2 = this.LLILLL.LJJIJIL();
                        if (assemSupervisorLJJIJIL2 != null) {
                            C1276604z6.LJ(assemSupervisorLJJIJIL2, (ViewGroup) this.LLILLL.LLJJIJIL.getValue(), abstractC738140SxQ2);
                        }
                        C786410Ut5.LJZ(8, (FrameLayout) this.LLILLL.LLJJIJIL.getValue());
                    } else {
                        this.LLILLL.LJJJI(this.LL, this.LLILLJJLI.getUiTemplate(), this.LLILZ);
                    }
                }
            } else {
                C19290510dT.LIZLLL("InnerPushAssemWindow", "[assembleMainParts], existed non-platform assem, remove it and reassemble platform assem");
                AssemSupervisor assemSupervisorLJJIJIL3 = this.LLILLL.LJJIJIL();
                if (assemSupervisorLJJIJIL3 != null) {
                    C1276604z6.LJ(assemSupervisorLJJIJIL3, this.LLILLL.LJJIJIIJIL(this.LL), abstractC738140SxQ2);
                }
                this.LLILLL.LJJIJ(this.LLILZIL, this.LL, this.LLILLJJLI.getUiTemplate());
            }
        } else {
            C19290510dT.LIZLLL("InnerPushAssemWindow", "[assembleMainParts], no existed assem, just assemble new platform one");
            this.LLILLL.LJJIJ(this.LLILZIL, this.LL, this.LLILLJJLI.getUiTemplate());
        }
        return Unit.LIZ;
    }
}
