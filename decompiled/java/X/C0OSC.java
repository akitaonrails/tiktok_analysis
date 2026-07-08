package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.tux.theme.darkmode.TuxImageModel;

/* JADX INFO: renamed from: X.0OSC, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OSC {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(int i, ImageUrlModel imageUrlModel) {
        if (imageUrlModel.getUrls() != null && (!imageUrlModel.getUrls().isEmpty()) && imageUrlModel.getUrls().size() >= i + 1) {
            return (String) ListProtector.get(imageUrlModel.getUrls(), i);
        }
        return null;
    }

    public static Integer LIZIZ(TuxImageModel tuxImageModel, Context context) {
        ImageUrlModel imageUrlModel = tuxImageModel.imageUrlLocal;
        if (imageUrlModel != null && C0OSD.LIZ(imageUrlModel)) {
            C844470XAv.LIZ.getClass();
            if (C0OSD.LIZJ(C844470XAv.LJFF()) >= tuxImageModel.minLocalVersion) {
                try {
                    String strLIZ = LIZ(1, imageUrlModel);
                    if (strLIZ != null) {
                        return C2248361CzK.LJ(context, strLIZ);
                    }
                    return null;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    public static C698190Ra5 LIZJ(Context context, TuxImageModel tuxImageModel) {
        ImageUrlModel imageUrlModel = tuxImageModel.imageUrlLocal;
        C698190Ra5 c698190Ra5LJFF = null;
        if (imageUrlModel == null) {
            return null;
        }
        if (C0OSD.LIZ(imageUrlModel)) {
            C844470XAv.LIZ.getClass();
            if (C0OSD.LIZJ(C844470XAv.LJFF()) >= tuxImageModel.minLocalVersion) {
                try {
                    String strLIZ = LIZ(0, imageUrlModel);
                    if (strLIZ == null) {
                        return null;
                    }
                    c698190Ra5LJFF = C2248361CzK.LJFF(context, strLIZ);
                    return c698190Ra5LJFF;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        return c698190Ra5LJFF;
    }
}
