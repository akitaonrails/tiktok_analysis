package X;

import com.google.gson.n;
import com.ss.android.ugc.aweme.sidebar.model.SideBarRootComponentConfig;
import com.ss.android.ugc.aweme.sidebar.model.SideBarSectionComponentConfig;
import java.util.List;

/* JADX INFO: renamed from: X.0rET, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1580550rET {
    public static final boolean LIZ(SideBarRootComponentConfig sideBarRootComponentConfig) {
        String type;
        n nVarLIZIZ;
        List<SideBarSectionComponentConfig> list = sideBarRootComponentConfig.sections;
        boolean z = false;
        if (list == null) {
            return false;
        }
        if (!list.isEmpty()) {
            for (SideBarSectionComponentConfig sideBarSectionComponentConfig : list) {
                String id = sideBarSectionComponentConfig.getId();
                if (id == null || id.length() == 0 || (type = sideBarSectionComponentConfig.getType()) == null || type.length() == 0 || (nVarLIZIZ = sideBarSectionComponentConfig.LIZIZ()) == null || nVarLIZIZ.size() == 0 || nVarLIZIZ.LJJIIZ("title") == null) {
                    z = true;
                    break;
                }
            }
        }
        return !z;
    }
}
