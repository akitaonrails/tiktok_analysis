package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0BVZ, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0BVZ {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C274130Aol());

    public static final boolean LIZ(int i, C0CIJ c0cij) {
        return ((InterfaceC274140Aom) LIZ.getValue()).LIZ(i, c0cij);
    }

    public static final boolean LIZIZ(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel, boolean z) {
        for (C0CIJ c0cij : C0CIJ.values()) {
            Integer numCanProduceTemplate = c0cij.canProduceTemplate(videoPublishEditModel, nLEModel, z);
            if (numCanProduceTemplate != null && numCanProduceTemplate.intValue() == -1) {
                return true;
            }
        }
        return false;
    }
}
