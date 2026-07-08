package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.onthisday.OnThisDayTiktokMediaModel;

/* JADX INFO: renamed from: X.0Krp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C530830Krp {
    public static final Uri LIZ(OnThisDayTiktokMediaModel onThisDayTiktokMediaModel) {
        Uri uri;
        boolean z;
        Object c098200Yq;
        if (onThisDayTiktokMediaModel.loadSource == EnumC538220L8y.PHOTO_PICKER) {
            String str = onThisDayTiktokMediaModel.mediaPickerAbsolutePath;
            if (str != null && str.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                String str2 = onThisDayTiktokMediaModel.mediaPickerAbsolutePath;
                if (str2 == null) {
                    return Uri.EMPTY;
                }
                try {
                    c098200Yq = Uri.fromFile(new C0VSJ(str2));
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                Uri uri2 = (Uri) c098200Yq;
                if (uri2 != null) {
                    return uri2;
                }
                return Uri.EMPTY;
            }
            return C2471909mP.LJIILIIL(onThisDayTiktokMediaModel.LJFF());
        }
        String str3 = onThisDayTiktokMediaModel.thumbnail;
        if (str3 == null || (uri = UriProtector.parse(str3)) == null) {
            return Uri.EMPTY;
        }
        return uri;
    }

    public static final boolean LIZIZ(OnThisDayTiktokMediaModel onThisDayTiktokMediaModel) {
        if (onThisDayTiktokMediaModel == null || onThisDayTiktokMediaModel.isPoster <= 0) {
            return false;
        }
        return true;
    }
}
