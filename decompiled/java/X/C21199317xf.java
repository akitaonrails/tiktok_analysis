package X;

import android.content.Context;
import com.bytedance.android.live.slot.IFrameSlot;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.common.settings.AnchorPinCardConfig;
import java.util.Map;

/* JADX INFO: renamed from: X.17xf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21199317xf extends AbstractC21194217wq {
    public final Context LLLLIIL;
    public final C21198917xb LLLLIILL;
    public final C21203717yN LLLLIILLL;

    @Override // X.AbstractC21194217wq
    public final boolean LJJIL() {
        return true;
    }

    @Override // X.AbstractC21194217wq
    public final boolean LJJJIL() {
        return false;
    }

    @Override // X.AbstractC21194217wq
    public final void LJJIFFI() {
        IFrameSlot.SlotViewModel slotViewModel = this.LLJIJIL;
        if (slotViewModel != null) {
            C21207817z2.LIZIZ(slotViewModel, false);
        }
        C1440005kM.LIZ(new C083G(1));
    }

    @Override // X.AbstractC21194217wq
    public final /* bridge */ /* synthetic */ AbstractC21198617xY LJJIJIIJI() {
        return this.LLLLIILLL;
    }

    @Override // X.AbstractC21194217wq
    public final AbstractC21196217xA LJJIJLIJ() {
        return this.LLLLIILL;
    }

    @Override // X.InterfaceC1124060fMC
    public final Enum LLJ() {
        return EnumC1124020fM8.SLOT_LIVE_BOTTOM_POP_L2_ANCHOR;
    }

    public C21199317xf(Context context) {
        super(context, false);
        this.LLLLIIL = context;
        C21198917xb c21198917xb = new C21198917xb(this, this.LLJI);
        this.LLLLIILL = c21198917xb;
        C21203717yN c21203717yN = new C21203717yN(context, c21198917xb.LJII, this.LLJI);
        c21203717yN.LLILZLL = this;
        this.LLLLIILLL = c21203717yN;
    }

    @Override // X.AbstractC21194217wq, X.AbstractC21206817ys
    public final boolean LJJ(Map<String, Object> map) {
        return super.LJJ(map);
    }

    @Override // X.AbstractC21194217wq
    public final boolean LJJII(int i) {
        if (1 == ((AnchorPinCardConfig) C21201217xy.LIZIZ.getValue()).show) {
            return true;
        }
        return false;
    }
}
