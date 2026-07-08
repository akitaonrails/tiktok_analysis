package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.CreativeFlowData;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProEffectInfo;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreResult;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0EWJ, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EWJ extends AbstractC365870EWb {
    public final C554970Lpf LIZ;
    public final InterfaceC1635410sex LIZIZ = C1633850scR.LIZ(C0CHQ.LIZ, null);
    public final Set<String> LIZJ = new LinkedHashSet();

    @Override // X.AbstractC365870EWb
    public final boolean LIZ() {
        return true;
    }

    @Override // X.InterfaceC365900EWe
    public final int LIZIZ() {
        return 25;
    }

    @Override // X.InterfaceC365900EWe
    public final int getPriority() {
        return 1900;
    }

    @Override // X.InterfaceC365900EWe
    public final C554970Lpf getParams() {
        return this.LIZ;
    }

    public C0EWJ(C554970Lpf c554970Lpf) {
        this.LIZ = c554970Lpf;
    }

    @Override // X.InterfaceC365900EWe
    public final Object LIZJ(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        EditorProEffectInfo blendCutoutEffect;
        EditorProModel editorProModel;
        EditorProModel editorProModel2;
        CreativeFlowData creativeFlowData = this.LIZ.LJ.LJJJJIZL.creativeFlowData;
        EditorProEffectInfo blendMaskEffect = null;
        if (creativeFlowData != null && (editorProModel2 = creativeFlowData.getEditorProModel()) != null) {
            blendCutoutEffect = editorProModel2.getBlendCutoutEffect();
        } else {
            blendCutoutEffect = null;
        }
        CreativeFlowData creativeFlowData2 = this.LIZ.LJ.LJJJJIZL.creativeFlowData;
        if (creativeFlowData2 != null && (editorProModel = creativeFlowData2.getEditorProModel()) != null) {
            blendMaskEffect = editorProModel.getBlendMaskEffect();
        }
        if (blendCutoutEffect == null && blendMaskEffect == null) {
            return true;
        }
        LJIIIIZZ(this, blendCutoutEffect);
        LJIIIIZZ(this, blendMaskEffect);
        return Boolean.valueOf(this.LIZJ.isEmpty());
    }

    @Override // X.AbstractC365870EWb, X.InterfaceC365900EWe
    public final Object LIZLLL(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return LIZJ(interfaceC1364105Vn);
    }

    @Override // X.AbstractC365870EWb, X.InterfaceC365900EWe
    public final Map<C0FAO, List<String>> LJ(AwemeDraft awemeDraft) {
        EditorProModel editorProModel;
        EditorProEffectInfo blendMaskEffect;
        String resDir;
        EditorProModel editorProModel2;
        EditorProEffectInfo blendCutoutEffect;
        String resDir2;
        ArrayList arrayList = new ArrayList();
        CreativeFlowData creativeFlowData = awemeDraft.LJJJJIZL.creativeFlowData;
        if (creativeFlowData != null && (editorProModel2 = creativeFlowData.getEditorProModel()) != null && (blendCutoutEffect = editorProModel2.getBlendCutoutEffect()) != null && (resDir2 = blendCutoutEffect.getResDir()) != null && resDir2.length() > 0) {
            arrayList.add(resDir2);
        }
        CreativeFlowData creativeFlowData2 = awemeDraft.LJJJJIZL.creativeFlowData;
        if (creativeFlowData2 != null && (editorProModel = creativeFlowData2.getEditorProModel()) != null && (blendMaskEffect = editorProModel.getBlendMaskEffect()) != null && (resDir = blendMaskEffect.getResDir()) != null && resDir.length() > 0) {
            arrayList.add(resDir);
        }
        if (arrayList.isEmpty()) {
            return C2097608Jq.LJ();
        }
        return C2097908Jt.LIZJ(new Pair(C0FAO.EFFECT, arrayList));
    }

    @Override // X.AbstractC365870EWb
    public final Object LJII(InterfaceC1364105Vn<? super List<DraftFileRestoreResult>> interfaceC1364105Vn) {
        C19EG c19eg;
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DraftCutoutStrokeRestoreHandler ; fileType : ");
        sbLIZ.append(25);
        sbLIZ.append(" ; restore start ...");
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        Context context = this.LIZ.LIZ.get();
        if ((context instanceof C19EG) && (c19eg = (C19EG) context) != null) {
            C1563370qml.LIZ(c19eg, EnumC682280QpW.MAIN, new AwS406S0200000_5(this, c19eg, 138));
        }
        this.LIZIZ.Cg(new ArrayList(this.LIZJ), C2097908Jt.LIZJ(new Pair("panel", "editor_pro_cutout")), new C0EWI(this, c2252611DEt));
        c2252611DEt.LJJII(new AwS584S0100000_5(this, 1031));
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    public static final void LJIIIIZZ(C0EWJ c0ewj, EditorProEffectInfo editorProEffectInfo) {
        Pair<String, String> pairLIZJ;
        String second;
        if (editorProEffectInfo == null) {
            return;
        }
        String resDir = editorProEffectInfo.getResDir();
        String key = editorProEffectInfo.getKey();
        if (resDir != null && resDir.length() != 0 && key != null && key.length() != 0 && (pairLIZJ = C0FGD.LIZJ(key)) != null && (second = pairLIZJ.getSecond()) != null && second.length() != 0 && !C570490MZb.LJ(resDir)) {
            c0ewj.LIZJ.add(second);
        }
    }
}
