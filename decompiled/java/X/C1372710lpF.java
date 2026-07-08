package X;

import com.ss.android.ugc.aweme.feed.model.ACLCommonShare;

/* JADX INFO: renamed from: X.0lpF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1372710lpF extends C1370340llQ {
    public final ACLCommonShare LLILLJJLI;

    @Override // X.InterfaceC1370310llN
    public final int LJIIJJI() {
        ACLCommonShare aCLCommonShare = this.LLILLJJLI;
        return aCLCommonShare != null ? aCLCommonShare.getCode() : !enable() ? 1 : 0;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJLIIIJL() {
        ACLCommonShare aCLCommonShare = this.LLILLJJLI;
        if (aCLCommonShare == null || aCLCommonShare.getCode() != 2) {
            return this.LL.LJJLIIIJL();
        }
        return true;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean enable() {
        ACLCommonShare aCLCommonShare = this.LLILLJJLI;
        if (aCLCommonShare == null || aCLCommonShare.getShowType() != 1) {
            return this.LL.enable();
        }
        return false;
    }

    public C1372710lpF(InterfaceC1370310llN interfaceC1370310llN, ACLCommonShare aCLCommonShare) {
        super(interfaceC1370310llN);
        this.LLILLJJLI = aCLCommonShare;
    }
}
