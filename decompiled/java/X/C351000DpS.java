package X;

import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.ss.ugc.android.editor.core.api.params.EditMedia;

/* JADX INFO: renamed from: X.0DpS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C351000DpS {
    public static final int LIZ(EditMedia editMedia) {
        NLEResType nLEResType;
        if (editMedia.isVideo()) {
            nLEResType = NLEResType.VIDEO;
        } else {
            nLEResType = NLEResType.IMAGE;
        }
        return nLEResType.swigValue();
    }
}
