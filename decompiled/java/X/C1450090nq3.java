package X;

import com.bytedance.ies.cutsame.util.Size;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.edit.ImageEditModel;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0nq3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1450090nq3 {
    public final VideoPublishEditModel LIZ;
    public final HashMap<String, NLEModel> LIZIZ = new HashMap<>();
    public boolean LIZJ;
    public Function0<Unit> LIZLLL;

    public C1450090nq3(VideoPublishEditModel videoPublishEditModel) {
        this.LIZ = videoPublishEditModel;
    }

    public final String LIZ(String str) {
        CreativeModel creativeModel;
        ImageEditModel imageEditModel;
        HashMap<String, String> map;
        VideoPublishEditModel videoPublishEditModel = this.LIZ;
        if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (imageEditModel = creativeModel.imageEditModel) != null && (map = imageEditModel.map) != null) {
            return map.get(str);
        }
        return null;
    }

    public final void LIZLLL(String str, String str2) {
        CreativeModel creativeModel;
        ImageEditModel imageEditModel;
        HashMap<String, String> map;
        VideoPublishEditModel videoPublishEditModel = this.LIZ;
        if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (imageEditModel = creativeModel.imageEditModel) != null && (map = imageEditModel.map) != null) {
            map.put(str, str2);
        }
    }

    public final void LJ(NLEModel nLEModel, String str) {
        if (nLEModel == null) {
            this.LIZIZ.remove(str);
        } else {
            this.LIZIZ.put(str, nLEModel);
        }
    }

    public final NLEModel LIZIZ(String str, String str2, SingleImageData singleImageData, Size size, boolean z, int i) {
        NLEModel nLEModel = this.LIZIZ.get(str);
        if (nLEModel == null) {
            this.LIZIZ.put(str, new C1449920npm(singleImageData, str2, size, z, i).LIZIZ());
            NLEModel nLEModel2 = this.LIZIZ.get(str);
            if (nLEModel2 != null) {
                return nLEModel2;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        return nLEModel;
    }
}
