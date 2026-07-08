package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OSPPageModuleConfig;

/* JADX INFO: renamed from: X.02xM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC756202xM extends AbstractC723102s1 {
    public final String LL = "";
    public final String LLILLJJLI = "";
    public OSPPageModuleConfig LLILLL;
    public int LLILZ;
    public int LLILZIL;

    public final int LIZ() {
        OSPPageModuleConfig oSPPageModuleConfig = this.LLILLL;
        if (oSPPageModuleConfig != null) {
            return oSPPageModuleConfig.groupId;
        }
        return 0;
    }

    @Override // X.AbstractC723102s1
    public String getGroupId() {
        return this.LL;
    }

    @Override // X.AbstractC723102s1
    public String getItemId() {
        return this.LLILLJJLI;
    }
}
