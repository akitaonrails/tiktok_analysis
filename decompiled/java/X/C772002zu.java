package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;

/* JADX INFO: renamed from: X.02zu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C772002zu extends C035N<C730802tG> implements C030C {
    public final C032I LIZJ;

    @Override // X.C035N
    public final InterfaceC729102sz LJJZ() {
        return new C730802tG(0);
    }

    public C772002zu(C032I c032i) {
        this.LIZJ = c032i;
    }

    @Override // X.C030C
    public final boolean LIZLLL(BillInfoData billInfoData) {
        AnonymousClass0303 anonymousClass0303 = (AnonymousClass0303) this.LIZJ.vr2(AnonymousClass0303.class);
        if (anonymousClass0303 == null || !anonymousClass0303.LIZLLL(billInfoData)) {
            return false;
        }
        return true;
    }
}
