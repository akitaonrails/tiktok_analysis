package X;

import com.ss.android.ugc.aweme.slash.component.BaseSlashReusedComponent;
import com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent;

/* JADX INFO: renamed from: X.0gh4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1175440gh4 {
    public static void LIZ(BaseSlashSlotAssemComponent baseSlashSlotAssemComponent, String str, String str2, int i) {
        String str3 = str2;
        if ((i & 2) != 0) {
            str3 = null;
        }
        if (baseSlashSlotAssemComponent.getParent() instanceof BaseSlashReusedComponent) {
            C1192290h8F.LIZ(baseSlashSlotAssemComponent.getParent(), str, str3, false, null, null, 16);
        } else {
            C1192290h8F.LIZ(baseSlashSlotAssemComponent, str, str3, false, null, null, 16);
        }
    }
}
