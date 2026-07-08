package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.RefundableSampleModule;

/* JADX INFO: renamed from: X.030e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7730030e extends AbstractC756202xM {
    public final RefundableSampleModule LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;

    public C7730030e() {
        this(null);
    }

    @Override // X.AbstractC756202xM, X.AbstractC723102s1
    public final String getGroupId() {
        return this.LLIZ;
    }

    @Override // X.AbstractC756202xM, X.AbstractC723102s1
    public final String getItemId() {
        return this.LLIZLLLIL;
    }

    public C7730030e(RefundableSampleModule refundableSampleModule) {
        this.LLILZLL = refundableSampleModule;
        this.LLIZ = "refundable_sample_module";
        this.LLIZLLLIL = "refundable_sample_item";
    }

    @Override // X.AbstractC723102s1, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return interfaceC1891350zJl instanceof C7730030e;
    }
}
