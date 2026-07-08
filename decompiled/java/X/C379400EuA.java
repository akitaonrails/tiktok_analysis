package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0EuA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C379400EuA extends AbstractC1643540ss4 {
    public final VideoPublishEditModel LIZLLL;
    public final int LJ;
    public Function0<Unit> LJFF;
    public Function0<Unit> LJI;

    @Override // X.InterfaceC1630950sXl
    public final void LIZ(Effect effect) {
        if (effect == null) {
            return;
        }
        LIZLLL(effect);
    }

    @Override // X.AbstractC1643540ss4
    public final void LIZIZ(Effect effect) {
        C1413450msx c1413450msx = C1413450msx.LIZ;
        VideoPublishEditModel videoPublishEditModel = this.LIZLLL;
        int i = this.LJ;
        c1413450msx.getClass();
        C0LAB c0labLIZJ = C1413450msx.LIZJ(videoPublishEditModel, effect, i);
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZ("cancel_remove_effect", c0labLIZJ.LIZ);
    }

    @Override // X.AbstractC1643540ss4
    public final void LIZJ(Effect effect) {
        C1413450msx c1413450msx = C1413450msx.LIZ;
        VideoPublishEditModel videoPublishEditModel = this.LIZLLL;
        int i = this.LJ;
        c1413450msx.getClass();
        C0LAB c0labLIZJ = C1413450msx.LIZJ(videoPublishEditModel, effect, i);
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZ("cancel_report_and_remove_effect", c0labLIZJ.LIZ);
    }

    @Override // X.AbstractC1643540ss4
    public final void LJ(Effect effect) {
        C1413450msx c1413450msx = C1413450msx.LIZ;
        VideoPublishEditModel videoPublishEditModel = this.LIZLLL;
        int i = this.LJ;
        c1413450msx.getClass();
        C0LAB c0labLIZJ = C1413450msx.LIZJ(videoPublishEditModel, effect, i);
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZ("remove_effect", c0labLIZJ.LIZ);
    }

    @Override // X.AbstractC1643540ss4
    public final void LJFF(Effect effect) {
        C1413450msx c1413450msx = C1413450msx.LIZ;
        VideoPublishEditModel videoPublishEditModel = this.LIZLLL;
        int i = this.LJ;
        c1413450msx.getClass();
        C0LAB c0labLIZJ = C1413450msx.LIZJ(videoPublishEditModel, effect, i);
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZ("report_effect", c0labLIZJ.LIZ);
    }

    @Override // X.AbstractC1643540ss4
    public final void LJI(Effect effect) {
        C1413450msx c1413450msx = C1413450msx.LIZ;
        VideoPublishEditModel videoPublishEditModel = this.LIZLLL;
        int i = this.LJ;
        c1413450msx.getClass();
        C0LAB c0labLIZJ = C1413450msx.LIZJ(videoPublishEditModel, effect, i);
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZ("confirm_remove_effect", c0labLIZJ.LIZ);
        C379420EuC c379420EuC = new C379420EuC();
        String effectId = effect.getEffectId();
        String currentUserID = C0CHQ.LIZ().getAccountService().getCurrentUserID();
        Keva keva = c379420EuC.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("block_editing_sticker_list_");
        sbLIZ.append(currentUserID);
        Set setLJLIIIL = C13LQ.LJLIIIL(keva.getStringArray(C2188811AlT.LIZIZ(sbLIZ), new String[0]));
        setLJLIIIL.add(effectId);
        Keva keva2 = c379420EuC.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("block_editing_sticker_list_");
        sbLIZ2.append(currentUserID);
        keva2.storeStringArray(C2188811AlT.LIZIZ(sbLIZ2), (String[]) setLJLIIIL.toArray(new String[0]));
        Function0<Unit> function0 = this.LJFF;
        if (function0 != null) {
            function0.invoke();
        }
        Function0<Unit> function02 = this.LJI;
        if (function02 != null) {
            function02.invoke();
        }
        C2341909Fp.LIZ("remove_effect_success", C1413450msx.LIZJ(this.LIZLLL, effect, this.LJ).LIZ);
    }

    public C379400EuA(C19EG c19eg, VideoPublishEditModel videoPublishEditModel, C19A3 c19a3) {
        super(c19eg, c19a3);
        this.LIZLLL = videoPublishEditModel;
        this.LJ = 0;
    }
}
