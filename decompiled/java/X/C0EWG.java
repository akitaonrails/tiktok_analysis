package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.creative.model.CreativeFlowData;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProEffectInfo;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0EWG, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public class C0EWG extends AbstractC365860EWa<EffectPointModel> {
    public final C554970Lpf LIZLLL;
    public final int LJ = 2;
    public final int LJFF = 100;

    @Override // X.AbstractC365860EWa
    public final void LJIIJ() {
        getParams().LJ.LJ().removeAll(this.LIZ);
    }

    @Override // X.AbstractC365860EWa
    public List<EffectPointModel> LJIIL() {
        EditorProModel editorProModel;
        List<EditorProEffectInfo> videoSegmentEffects;
        ArrayList arrayList = new ArrayList(getParams().LJ.LJ());
        ArrayList arrayList2 = new ArrayList();
        CopyOnWriteArrayList<EditorProEffectInfo> copyOnWriteArrayList = getParams().LJ.LIZ.editorProDraftModel.effectsInfo;
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(copyOnWriteArrayList, 10));
        for (EditorProEffectInfo editorProEffectInfo : copyOnWriteArrayList) {
            EffectPointModel effectPointModel = new EffectPointModel();
            effectPointModel.setKey(editorProEffectInfo.getKey());
            effectPointModel.setName(editorProEffectInfo.getName());
            effectPointModel.setResDir(editorProEffectInfo.getResDir());
            arrayList3.add(effectPointModel);
        }
        arrayList2.addAll(arrayList3);
        CreativeFlowData creativeFlowData = getParams().LJ.LJJJJIZL.creativeFlowData;
        if (creativeFlowData != null && (editorProModel = creativeFlowData.getEditorProModel()) != null && (videoSegmentEffects = editorProModel.getVideoSegmentEffects()) != null) {
            ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(videoSegmentEffects, 10));
            for (EditorProEffectInfo editorProEffectInfo2 : videoSegmentEffects) {
                EffectPointModel effectPointModel2 = new EffectPointModel();
                effectPointModel2.setKey(editorProEffectInfo2.getKey());
                effectPointModel2.setName(editorProEffectInfo2.getName());
                effectPointModel2.setResDir(editorProEffectInfo2.getResDir());
                arrayList4.add(effectPointModel2);
            }
            arrayList2.addAll(arrayList4);
        }
        arrayList.addAll(arrayList2);
        ArrayList arrayList5 = new ArrayList();
        for (Object obj : arrayList) {
            EffectPointModel effectPointModel3 = (EffectPointModel) obj;
            String key = effectPointModel3.getKey();
            if (key != null && key.length() != 0 && !Intrinsics.LJFF(effectPointModel3.getKey(), "1") && !Intrinsics.LJFF(effectPointModel3.getKey(), "2") && !Intrinsics.LJFF(effectPointModel3.getKey(), "3") && (TextUtils.equals(effectPointModel3.getCategory(), "motion") || !C2354709Kn.LIZIZ(effectPointModel3.getResDir()))) {
                arrayList5.add(obj);
            }
        }
        return arrayList5;
    }

    @Override // X.InterfaceC365900EWe
    public int LIZIZ() {
        return this.LJ;
    }

    @Override // X.InterfaceC365900EWe
    public C554970Lpf getParams() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC365900EWe
    public int getPriority() {
        return this.LJFF;
    }

    public C0EWG(C554970Lpf c554970Lpf) {
        this.LIZLLL = c554970Lpf;
    }

    @Override // X.AbstractC365870EWb, X.InterfaceC365900EWe
    public Object LIZLLL(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return Boolean.valueOf(getParams().LJ.LJ().isEmpty());
    }

    @Override // X.AbstractC365870EWb, X.InterfaceC365900EWe
    public Map<C0FAO, List<String>> LJ(AwemeDraft awemeDraft) {
        EditorProModel editorProModel;
        List<EditorProEffectInfo> videoSegmentEffects;
        ArrayList arrayList = new ArrayList();
        for (EffectPointModel effectPointModel : awemeDraft.LJ()) {
            String resDir = effectPointModel.getResDir();
            if (resDir != null && resDir.length() != 0) {
                arrayList.add(effectPointModel.getResDir());
            }
        }
        Iterator<EditorProEffectInfo> it2 = awemeDraft.LIZ.editorProDraftModel.effectsInfo.iterator();
        while (true) {
            String str = "";
            if (!it2.hasNext()) {
                break;
            }
            EditorProEffectInfo next = it2.next();
            String resDir2 = next.getResDir();
            if (resDir2 != null && resDir2.length() != 0) {
                String resDir3 = next.getResDir();
                if (resDir3 != null) {
                    str = resDir3;
                }
                arrayList.add(str);
            }
        }
        CreativeFlowData creativeFlowData = awemeDraft.LJJJJIZL.creativeFlowData;
        if (creativeFlowData != null && (editorProModel = creativeFlowData.getEditorProModel()) != null && (videoSegmentEffects = editorProModel.getVideoSegmentEffects()) != null) {
            for (EditorProEffectInfo editorProEffectInfo : videoSegmentEffects) {
                String resDir4 = editorProEffectInfo.getResDir();
                if (resDir4 != null && resDir4.length() != 0) {
                    String resDir5 = editorProEffectInfo.getResDir();
                    if (resDir5 == null) {
                        resDir5 = "";
                    }
                    arrayList.add(resDir5);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return C2097608Jq.LJ();
        }
        return C2097908Jt.LIZJ(new Pair(C0FAO.EFFECT, arrayList));
    }

    @Override // X.AbstractC365860EWa
    public final String LJIIJJI(EffectPointModel effectPointModel) {
        return effectPointModel.getKey();
    }

    @Override // X.AbstractC365860EWa
    public final void LJIIIIZZ(Effect effect, EffectPointModel effectPointModel) {
        EffectPointModel effectPointModel2 = effectPointModel;
        List<String> tags = effect.getTags();
        int i = 0;
        if (tags != null) {
            Iterator<String> it2 = tags.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                String next = it2.next();
                if (a0.LJJIIZI(next, "duration: ", false)) {
                    i = CastIntegerProtector.parseInt(next.substring(10));
                    break;
                }
            }
        }
        effectPointModel2.setDuration(i);
        effectPointModel2.setExtra(effect.getExtra());
        effectPointModel2.setKey(effect.getEffectId());
        effectPointModel2.setName(effect.getName());
        effectPointModel2.setResDir(effect.getUnzipPath());
    }
}
