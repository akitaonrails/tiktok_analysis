package X;

import com.ss.android.ugc.aweme.creative.model.audio.PreCheckResultModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Xhu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC855920Xhu {
    public final VideoPublishEditModel LIZ;
    public final ArrayList<AbstractC855890Xhr> LIZIZ;

    public AbstractC855890Xhr LIZ() {
        return null;
    }

    public boolean LJ() {
        return this instanceof C855880Xhq;
    }

    public void LJFF() {
    }

    public final ArrayList<Integer> LIZIZ() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Iterator<AbstractC855890Xhr> it2 = LIZLLL().iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(it2.next().LIZIZ()));
        }
        return arrayList;
    }

    public VideoPublishEditModel LIZJ() {
        return this.LIZ;
    }

    public ArrayList<AbstractC855890Xhr> LIZLLL() {
        return this.LIZIZ;
    }

    public void LJI(Map<Integer, PreCheckResultModel> map) {
        AbstractC855890Xhr next;
        if (map == null) {
            if (C895680ZBu.LIZLLL(LIZJ().getCreationId())) {
                Iterator<AbstractC855890Xhr> it2 = LIZLLL().iterator();
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
            PreCheckResultModel preCheckResultModel = (PreCheckResultModel) entry2.getValue();
            Iterator<AbstractC855890Xhr> it3 = LIZLLL().iterator();
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
                abstractC855890Xhr.LJIIIZ = C855940Xhw.LIZ(preCheckResultModel);
                if (preCheckResultModel != null && !preCheckResultModel.detectPass) {
                    C201955140j.LIZJ(C830690WiJ.LIZIZ, "BasePublishAudioCopyrightController -> BasePublishAudioCopyrightHandler -> detectProcessStatus.value = 101");
                    abstractC855890Xhr.LJI.setValue(101);
                } else if (C895680ZBu.LIZLLL(LIZJ().getCreationId())) {
                    abstractC855890Xhr.LJI.setValue(102);
                    C201955140j.LIZJ(C830690WiJ.LIZIZ, "BasePublishAudioCopyrightController -> BasePublishAudioCopyrightHandler -> detectProcessStatus.value = 102");
                } else {
                    abstractC855890Xhr.LJI.setValue(100);
                    C201955140j.LIZJ(C830690WiJ.LIZIZ, "BasePublishAudioCopyrightController -> BasePublishAudioCopyrightHandler -> detectProcessStatus.value = 100");
                }
            }
        }
    }

    public AbstractC855920Xhu(VideoPublishEditModel videoPublishEditModel, ArrayList<AbstractC855890Xhr> arrayList) {
        this.LIZ = videoPublishEditModel;
        this.LIZIZ = arrayList;
    }
}
