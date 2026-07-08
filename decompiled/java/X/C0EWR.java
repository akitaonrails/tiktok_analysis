package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.CreativeFlowData;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProEffectInfo;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0EWR, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EWR extends AbstractC365870EWb {
    public final C554970Lpf LIZ;
    public final InterfaceC1635410sex LIZIZ = C1633850scR.LIZ(C0CHQ.LIZ, null);
    public final Set<String> LIZJ = new LinkedHashSet();

    @Override // X.AbstractC365870EWb
    public final boolean LIZ() {
        return true;
    }

    @Override // X.InterfaceC365900EWe
    public final int LIZIZ() {
        return 26;
    }

    @Override // X.InterfaceC365900EWe
    public final int getPriority() {
        return 2000;
    }

    @Override // X.InterfaceC365900EWe
    public final C554970Lpf getParams() {
        return this.LIZ;
    }

    public C0EWR(C554970Lpf c554970Lpf) {
        this.LIZ = c554970Lpf;
    }

    @Override // X.InterfaceC365900EWe
    public final Object LIZJ(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        EditorProModel editorProModel;
        List<EditorProEffectInfo> chromaEffects;
        String key;
        Pair<String, String> pairLIZJ;
        String second;
        CreativeFlowData creativeFlowData = this.LIZ.LJ.LJJJJIZL.creativeFlowData;
        if (creativeFlowData != null && (editorProModel = creativeFlowData.getEditorProModel()) != null && (chromaEffects = editorProModel.getChromaEffects()) != null && !chromaEffects.isEmpty()) {
            for (EditorProEffectInfo editorProEffectInfo : chromaEffects) {
                String resDir = editorProEffectInfo.getResDir();
                if (resDir != null && resDir.length() != 0 && (key = editorProEffectInfo.getKey()) != null && key.length() != 0 && (pairLIZJ = C0FGD.LIZJ(editorProEffectInfo.getKey())) != null && (second = pairLIZJ.getSecond()) != null && second.length() != 0 && !C570490MZb.LJ(editorProEffectInfo.getResDir())) {
                    this.LIZJ.add(second);
                }
            }
            return Boolean.valueOf(this.LIZJ.isEmpty());
        }
        return true;
    }

    @Override // X.AbstractC365870EWb, X.InterfaceC365900EWe
    public final Object LIZLLL(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return LIZJ(interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    @Override // X.AbstractC365870EWb, X.InterfaceC365900EWe
    public final Map<C0FAO, List<String>> LJ(AwemeDraft awemeDraft) {
        ?? arrayList;
        EditorProModel editorProModel;
        List<EditorProEffectInfo> chromaEffects;
        CreativeFlowData creativeFlowData = awemeDraft.LJJJJIZL.creativeFlowData;
        if (creativeFlowData != null && (editorProModel = creativeFlowData.getEditorProModel()) != null && (chromaEffects = editorProModel.getChromaEffects()) != null) {
            arrayList = new ArrayList();
            Iterator<EditorProEffectInfo> it2 = chromaEffects.iterator();
            while (it2.hasNext()) {
                String resDir = it2.next().getResDir();
                if (resDir != null && resDir.length() > 0) {
                    arrayList.add(resDir);
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
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
        sbLIZ.append("DraftChromaKeyRestoreHandler ; fileType : ");
        sbLIZ.append(26);
        sbLIZ.append(" ; restore start ...");
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        Context context = this.LIZ.LIZ.get();
        if ((context instanceof C19EG) && (c19eg = (C19EG) context) != null) {
            C1563370qml.LIZ(c19eg, EnumC682280QpW.MAIN, new AwS406S0200000_5(this, c19eg, 137));
        }
        this.LIZIZ.Cg(new ArrayList(this.LIZJ), C2097908Jt.LIZJ(new Pair("panel", "editor_pro_cutout")), new C0EWQ(this, c2252611DEt));
        c2252611DEt.LJJII(new AwS584S0100000_5(this, 1030));
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }
}
