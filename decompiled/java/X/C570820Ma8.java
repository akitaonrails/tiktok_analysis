package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.shortvideo.edit.DraftMusicPermissionCheckApi;
import java.util.List;

/* JADX INFO: renamed from: X.0Ma8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C570820Ma8 {
    public List<DraftMusicPermissionCheckApi.PermissionCheckEntity> LIZ;

    public final String toString() {
        return GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), this.LIZ);
    }
}
