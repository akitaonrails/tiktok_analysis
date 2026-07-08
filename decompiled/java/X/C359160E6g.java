package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;

/* JADX INFO: renamed from: X.0E6g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C359160E6g {
    public static final boolean LIZ(NLEModel nLEModel) {
        NLETrack mainTrack = nLEModel.getMainTrack();
        if (mainTrack == null) {
            return false;
        }
        if (mainTrack.hasExtra("ep_stick_point_switch")) {
            return Boolean.parseBoolean(mainTrack.getExtra("ep_stick_point_switch"));
        }
        if (!nLEModel.hasExtra("stick_point_on_off_key")) {
            return false;
        }
        return Boolean.parseBoolean(nLEModel.getExtra("stick_point_on_off_key"));
    }
}
