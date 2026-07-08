package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0Eq8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C376900Eq8 implements C0EJ4 {
    @Override // X.C0EJ4
    public final Boolean LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        C376890Eq7.LIZ.getClass();
        return C376890Eq7.LJI(videoPublishEditModel);
    }

    @Override // X.C0EJ4
    public final boolean LIZJ(VideoPublishEditModel videoPublishEditModel) {
        C376890Eq7.LIZ.getClass();
        return C376890Eq7.LIZJ(C376890Eq7.LIZIZ(videoPublishEditModel));
    }

    @Override // X.C0EJ4
    public final boolean LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.isSupportCache()) {
            Object obj = C1184304kD.LIZ.get(C1184304kD.LIZ(C376910Eq9.class.getName(), "needToProduceTemplate"));
            if (obj != null) {
                return ((Boolean) obj).booleanValue();
            }
        }
        boolean zLJFF = C376890Eq7.LJFF(C376890Eq7.LIZ, videoPublishEditModel);
        if (videoPublishEditModel.isSupportCache()) {
            String name = C376910Eq9.class.getName();
            Boolean boolValueOf = Boolean.valueOf(zLJFF);
            C1184304kD.LIZ.put(C1184304kD.LIZ(name, "needToProduceTemplate"), boolValueOf);
        }
        return zLJFF;
    }

    @Override // X.C0EJ4
    public final boolean LIZ(VideoPublishEditModel videoPublishEditModel, boolean z) {
        return C376890Eq7.LIZ.LJ(videoPublishEditModel, z);
    }
}
