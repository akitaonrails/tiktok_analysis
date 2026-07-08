package X;

import com.ss.android.ugc.aweme.creative.model.audio.PreCheckResultModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Xht, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C855910Xht extends AbstractC855920Xhu {
    public final VideoPublishEditModel LIZJ;
    public final ArrayList<AbstractC855890Xhr> LIZLLL;

    @Override // X.AbstractC855920Xhu
    public final AbstractC855890Xhr LIZ() {
        AbstractC855890Xhr next;
        Iterator<AbstractC855890Xhr> it2 = this.LIZLLL.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (next.LIZIZ() == C0FPS.ECOMMERCE.getScene()) {
                break;
            }
        }
        return next;
    }

    @Override // X.AbstractC855920Xhu
    public final boolean LJ() {
        AbstractC855890Xhr abstractC855890XhrLIZ = LIZ();
        return abstractC855890XhrLIZ != null && abstractC855890XhrLIZ.LJ();
    }

    @Override // X.AbstractC855920Xhu
    public final VideoPublishEditModel LIZJ() {
        return this.LIZJ;
    }

    @Override // X.AbstractC855920Xhu
    public final ArrayList<AbstractC855890Xhr> LIZLLL() {
        return this.LIZLLL;
    }

    @Override // X.AbstractC855920Xhu
    public final void LJI(Map<Integer, PreCheckResultModel> map) {
        AbstractC855890Xhr next;
        PreCheckResultModel preCheckResultModel;
        if (map == null) {
            if (C895680ZBu.LIZLLL(this.LIZJ.getCreationId())) {
                Iterator<AbstractC855890Xhr> it2 = this.LIZLLL.iterator();
                while (it2.hasNext()) {
                    it2.next().LJI.setValue(102);
                    C201955140j.LIZJ(C830690WiJ.LIZIZ, "BasePublishAudioCopyrightController -> BasePublishAudioCopyrightHandler -> detectProcessStatus.value = 102");
                }
                return;
            }
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Integer, PreCheckResultModel> entry : map.entrySet()) {
            PreCheckResultModel value = entry.getValue();
            if (value != null && !value.hasShowResult) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            int iIntValue = ((Number) entry2.getKey()).intValue();
            PreCheckResultModel preCheckResultModel2 = (PreCheckResultModel) entry2.getValue();
            Iterator<AbstractC855890Xhr> it3 = this.LIZLLL.iterator();
            while (true) {
                if (it3.hasNext()) {
                    next = it3.next();
                    if (next.LIZIZ() == iIntValue) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            AbstractC855890Xhr abstractC855890Xhr = next;
            if (abstractC855890Xhr != null) {
                abstractC855890Xhr.LJIIIZ = C855940Xhw.LIZ(preCheckResultModel2);
                if (preCheckResultModel2 != null && !preCheckResultModel2.detectPass) {
                    C201955140j.LIZJ(C830690WiJ.LIZIZ, "BasePublishAudioCopyrightController -> BasePublishAudioCopyrightHandler -> detectProcessStatus.value = 101");
                    abstractC855890Xhr.LJI.setValue(101);
                } else if (C895680ZBu.LIZLLL(this.LIZJ.getCreationId())) {
                    abstractC855890Xhr.LJI.setValue(102);
                    C201955140j.LIZJ(C830690WiJ.LIZIZ, "BasePublishAudioCopyrightController -> BasePublishAudioCopyrightHandler -> detectProcessStatus.value = 102");
                } else {
                    HashMap<Integer, PreCheckResultModel> detectResults = this.LIZJ.creativeModel.audioCopyrightDetectModel.getDetectResults();
                    if (detectResults != null && (preCheckResultModel = detectResults.get(Integer.valueOf(iIntValue))) != null) {
                        preCheckResultModel.hasShowResult = true;
                    }
                    C201955140j.LIZJ(C830690WiJ.LIZIZ, "BasePublishAudioCopyrightController -> BasePublishAudioCopyrightHandler -> detectProcessStatus.value = 100");
                }
            }
        }
    }

    public C855910Xht(VideoPublishEditModel videoPublishEditModel, ArrayList<AbstractC855890Xhr> arrayList) {
        super(videoPublishEditModel, arrayList);
        this.LIZJ = videoPublishEditModel;
        this.LIZLLL = arrayList;
    }
}
