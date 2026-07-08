package X;

import android.text.TextUtils;
import com.bytedance.globalpayment.iap.state.BaseQueryOrderState;

/* JADX INFO: renamed from: X.0wms, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1794080wms implements InterfaceC1793900wma<C1794140wmy> {
    public final C1794000wmk LIZ;
    public final C1794160wn0 LIZIZ;
    public final /* synthetic */ BaseQueryOrderState LIZJ;

    @Override // X.InterfaceC1793900wma
    public final void LIZ(C1792220wjs c1792220wjs) {
        int i;
        int i2;
        C1794160wn0 c1794160wn0 = this.LIZIZ;
        if (c1794160wn0.LIZ && c1794160wn0.LIZIZ > 0) {
            this.LIZJ.LIZLLL();
        }
        if (c1792220wjs != null) {
            i = c1792220wjs.LIZ;
            i2 = c1792220wjs.LIZIZ;
        } else {
            i = -1;
            i2 = -1;
        }
        if (i == 204) {
            if (i2 != EnumC1794120wmw.Failed.ordinal() && i2 != EnumC1794120wmw.Closed.ordinal() && i2 != EnumC1794120wmw.Expired.ordinal() && i2 != EnumC1794120wmw.Abandoned.ordinal() && i2 != EnumC1794120wmw.SusPended.ordinal() && i2 != EnumC1794120wmw.Preorder.ordinal()) {
                this.LIZ.LJ(false, i2, C1792840wks.LIZJ(c1792220wjs), -1);
            } else {
                this.LIZ.LJ(true, i2, C1792840wks.LIZJ(c1792220wjs), -1);
            }
        } else {
            this.LIZ.LJ(false, -1, C1792840wks.LIZJ(c1792220wjs), -1);
        }
        this.LIZJ.LIZIZ(C1792840wks.LIZJ(c1792220wjs));
    }

    @Override // X.InterfaceC1793900wma
    public final void onSuccess(C1794140wmy c1794140wmy) {
        C1794140wmy c1794140wmy2 = c1794140wmy;
        if (!TextUtils.isEmpty(c1794140wmy2.LIZ)) {
            C1794480wnW c1794480wnW = this.LIZJ.LIZ;
            String str = c1794140wmy2.LIZ;
            c1794480wnW.LJ = str;
            this.LIZ.LIZJ = str;
        }
        this.LIZ.LJ(true, c1794140wmy2.LIZIZ.ordinal(), null, c1794140wmy2.LIZJ);
        this.LIZJ.LIZ.LJIL = true;
        if (this.LIZIZ.LIZ) {
            this.LIZJ.LIZLLL();
        }
        if (!this.LIZJ.LIZ.LJIJJ) {
            this.LIZJ.LIZIZ(new C1792840wks(0, 0, "pay success in QueryOrderStateCallback."));
        }
    }

    public C1794080wms(BaseQueryOrderState baseQueryOrderState, C1794000wmk c1794000wmk, C1794160wn0 c1794160wn0) {
        this.LIZJ = baseQueryOrderState;
        this.LIZ = c1794000wmk;
        this.LIZIZ = c1794160wn0;
        if (!c1794160wn0.LIZ) {
            baseQueryOrderState.LIZLLL();
            return;
        }
        long j = c1794160wn0.LIZIZ;
        if (j <= 0) {
            return;
        }
        baseQueryOrderState.LJI.sendEmptyMessageDelayed(1659, j);
    }
}
