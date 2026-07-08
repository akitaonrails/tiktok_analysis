package X;

import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;

/* JADX INFO: renamed from: X.0MwY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C584720MwY {
    public static int LIZ(VideoUrlModel videoUrlModel) {
        Integer numValueOf;
        if (videoUrlModel == null) {
            return -1;
        }
        InterfaceC1477220oXo hitBitrate = videoUrlModel.getHitBitrate();
        if (hitBitrate == null || (numValueOf = Integer.valueOf(hitBitrate.getQualityType())) == null) {
            numValueOf = -1;
        }
        return numValueOf.intValue();
    }
}
