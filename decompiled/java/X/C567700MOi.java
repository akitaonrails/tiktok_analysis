package X;

import com.ss.android.ugc.aweme.composer.model.CreationConfigModelCompat;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.ugc.aweme.creation.base.BasicModel;

/* JADX INFO: renamed from: X.0MOi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C567700MOi {
    public final CreationConfigModelCompat LIZ;

    public final CreativeInfo LIZ() {
        String strLIZ;
        BasicModel basic = this.LIZ.getBasic();
        if (basic == null || (strLIZ = basic.getCreationId()) == null) {
            strLIZ = C0DMI.LIZ();
        }
        return new CreativeInfo(strLIZ, 0, null, 6, null);
    }

    public C567700MOi(CreationConfigModelCompat creationConfigModelCompat) {
        this.LIZ = creationConfigModelCompat;
    }
}
