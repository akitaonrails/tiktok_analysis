package X;

import com.ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.ss.android.ugc.aweme.feed.model.AclType;

/* JADX INFO: renamed from: X.0lqh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1373610lqh extends AbstractC1371000lmU {
    public final ACLCommonShare LLILLJJLI;

    @Override // X.AbstractC1371000lmU, X.AbstractC1376120luk, X.InterfaceC1369790lkX
    public boolean LIZJ() {
        ACLCommonShare aCLCommonShare = this.LLILLJJLI;
        if (aCLCommonShare == null) {
            return super.LIZJ();
        }
        if (aCLCommonShare.getAwemeAclType() == AclType.SHARE_GENERAL) {
            C1373540lqa c1373540lqa = C1373850lr5.LIZ;
            String strKey = this.LL.key();
            c1373540lqa.getClass();
            if (C1373540lqa.LJIIIIZZ(strKey) && aCLCommonShare.getShowType() == 1) {
                return false;
            }
        }
        return aCLCommonShare.getShowType() == 1;
    }

    @Override // X.AbstractC1376120luk, X.InterfaceC1369790lkX
    public final int LJIIJJI() {
        ACLCommonShare aCLCommonShare = this.LLILLJJLI;
        return aCLCommonShare != null ? aCLCommonShare.getCode() : LIZJ() ? 1 : 0;
    }

    @Override // X.AbstractC1376120luk, X.InterfaceC1369790lkX
    public final boolean LJJJLIIL() {
        ACLCommonShare aCLCommonShare = this.LLILLJJLI;
        return aCLCommonShare != null && aCLCommonShare.getCode() == 2;
    }

    public C1373610lqh(InterfaceC1369790lkX interfaceC1369790lkX, ACLCommonShare aCLCommonShare) {
        super(interfaceC1369790lkX);
        this.LLILLJJLI = aCLCommonShare;
    }
}
