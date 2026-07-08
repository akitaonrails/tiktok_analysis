package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0nrp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1451190nrp {
    public final VideoPublishEditModel LIZ;
    public final HashMap<String, NLEModel> LIZIZ;
    public final MutableLiveData<Boolean> LIZJ;

    public C1451190nrp() {
        this(null);
    }

    public C1451190nrp(VideoPublishEditModel videoPublishEditModel) {
        this.LIZ = videoPublishEditModel;
        this.LIZIZ = new HashMap<>();
        this.LIZJ = new MutableLiveData<>(Boolean.FALSE);
    }
}
