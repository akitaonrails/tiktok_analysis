package X;

import com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.experiment.aicreation.AICreationGenerateConfigExp;
import com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput;
import java.util.List;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0LQL, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LQL extends C0LSC<PublicTaskInput, Object> {
    public final C01GW LJIJI = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(623));
    public final C01GW LJIJJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 1120));

    @Override // X.C0LTN
    public final String LJJ() {
        return C0LQP.AI_THEATER.getTypeName();
    }

    @Override // X.C0LSC
    public final AICreationGenerateConfigExp.AICreationGenerateConfig LJJLJ() {
        return (AICreationGenerateConfigExp.AICreationGenerateConfig) this.LJIJI.getValue();
    }

    @Override // X.C0LSC
    public final C0LSL LJJLL() {
        return (C0LSL) this.LJIJJ.getValue();
    }

    @Override // X.C0LRR
    public final List<InterfaceC543000LRi<? extends C09JG, ? extends AbsTaskOutput>> LJJJJLI(String str) {
        C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "ai_theater_check_cameo_permission_enable", true, true)) {
            c13dvLIZIZ.add(new C541540LLs(new C541920LNe(), C0LM6.CHECK_CAMEO_PERMISSION));
        }
        c13dvLIZIZ.add(new C0LQC(new C0LSS(), C0LM6.QUOTA));
        c13dvLIZIZ.add(new C541600LLy(new C542870LQv(), C0LM6.IMAGE_PREPROCESS));
        c13dvLIZIZ.add(new C541510LLp(new C541410LLf(), C0LM6.IMAGE_UPLOAD));
        c13dvLIZIZ.add(new C0LNO(new C0LUW(), C0LM6.SERVER));
        c13dvLIZIZ.add(new C0LNP(new C0LV4(), C0LM6.PROGRESS));
        c13dvLIZIZ.add(new C0LML(new C541740LMm(), C0LM6.DOWNLOAD));
        return C1697820uHc.LIZ(c13dvLIZIZ);
    }
}
