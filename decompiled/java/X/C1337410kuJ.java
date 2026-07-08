package X;

import Y.ALAdapterS16S0100000_20;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import tikcast.api.anchor_data.FinishEncourageGiftGallery;

/* JADX INFO: renamed from: X.0kuJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1337410kuJ extends AbstractC1337430kuL {
    public FinishEncourageGiftGallery LJIJ;
    public C16F5 LJIJI;
    public C1295960jpS LJIJJ;

    @Override // X.AbstractC1337430kuL, X.InterfaceC20482815Cw
    public final long LJFF() {
        return 1750L;
    }

    @Override // X.AbstractC1337430kuL, X.InterfaceC20482815Cw
    public final void LJI() {
        try {
            C1295960jpS c1295960jpS = this.LJIJJ;
            if (c1295960jpS != null) {
                c1295960jpS.pauseAnimation();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        super.LJI();
    }

    @Override // X.AbstractC1337430kuL
    public final void LJIILIIL() {
        C1295960jpS c1295960jpS = this.LJIJJ;
        if (c1295960jpS != null) {
            C1296260jpw.LIZ(c1295960jpS);
        }
        C16F5 c16f5 = this.LJIJI;
        if (c16f5 != null) {
            C786410Ut5.LLJJJJ(c16f5, 0);
        }
    }

    @Override // X.AbstractC1337430kuL
    public final void LJIILJJIL() {
        View view = this.LIZ;
        if (view == null) {
            return;
        }
        AnimatorSet animatorSetLJIIJ = AbstractC1337430kuL.LJIIJ(view);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animatorSetLJIIJ);
        animatorSet.addListener(new ALAdapterS16S0100000_20(this, 4));
        this.LIZIZ = animatorSet;
        animatorSet.start();
    }

    @Override // X.InterfaceC20482815Cw
    public final AbstractC1337320kuA getContainerType() {
        return C1337340kuC.LIZJ;
    }

    @Override // X.InterfaceC20482815Cw
    public final View LJIIIIZZ(Context context, ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.gho, viewGroup, false);
        this.LJIJI = (C16F5) viewTd.findViewById(R.id.zv0);
        this.LJIJJ = (C1295960jpS) viewTd.findViewById(R.id.nrx);
        this.LIZ = viewTd;
        C786410Ut5.T4(viewTd, 0.0f);
        return viewTd;
    }

    @Override // X.AbstractC1337430kuL, X.InterfaceC20482815Cw
    public final void LIZIZ(int i, int i2, Object obj) {
        FinishEncourageGiftGallery finishEncourageGiftGallery;
        String str;
        String str2;
        String str3;
        super.LIZIZ(i, i2, obj);
        if ((obj instanceof FinishEncourageGiftGallery) && (finishEncourageGiftGallery = (FinishEncourageGiftGallery) obj) != null) {
            this.LJIJ = finishEncourageGiftGallery;
            C1295960jpS c1295960jpS = this.LJIJJ;
            String str4 = "";
            if (c1295960jpS != null) {
                int i3 = finishEncourageGiftGallery.classType;
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 != 4) {
                                str2 = "";
                                if (i3 != 1) {
                                    if (i3 != 2) {
                                        if (i3 != 3) {
                                            if (i3 != 4) {
                                                str3 = "";
                                            }
                                        }
                                    }
                                }
                                C1143680frq.LJIILL(c1295960jpS, str2, str3, false, new C1339360kxS(this, 0));
                            } else {
                                str2 = "tiktok_live_broadcast_demand_11";
                            }
                            str3 = "ttlive_finish_encourage_gift_gallery_d_weak.zip";
                            C1143680frq.LJIILL(c1295960jpS, str2, str3, false, new C1339360kxS(this, 0));
                        } else {
                            str2 = "tiktok_live_broadcast_demand_10";
                        }
                        str3 = "ttlive_finish_encourage_gift_gallery_c_weak.zip";
                        C1143680frq.LJIILL(c1295960jpS, str2, str3, false, new C1339360kxS(this, 0));
                    } else {
                        str2 = "tiktok_live_broadcast_demand_9";
                    }
                    str3 = "ttlive_finish_encourage_gift_gallery_b_weak.zip";
                    C1143680frq.LJIILL(c1295960jpS, str2, str3, false, new C1339360kxS(this, 0));
                } else {
                    str2 = "tiktok_live_broadcast_demand_13";
                }
                str3 = "ttlive_finish_encourage_gift_gallery_a_weak.zip";
                C1143680frq.LJIILL(c1295960jpS, str2, str3, false, new C1339360kxS(this, 0));
            }
            FinishEncourageGiftGallery finishEncourageGiftGallery2 = this.LJIJ;
            if (finishEncourageGiftGallery2 != null && (str = finishEncourageGiftGallery2.finishTitle) != null) {
                str4 = str;
            }
            C16F5 c16f5 = this.LJIJI;
            if (c16f5 != null) {
                C786410Ut5.LLJJJJ(c16f5, 8);
            }
            C16F5 c16f52 = this.LJIJI;
            if (c16f52 != null) {
                c16f52.setTextSize(1, this.LJI);
            }
            Typeface typefaceLJIIJJI = LJIIJJI();
            C16F5 c16f53 = this.LJIJI;
            if (c16f53 != null) {
                c16f53.setTypeface(typefaceLJIIJJI);
            }
            C16F5 c16f54 = this.LJIJI;
            if (c16f54 != null) {
                c16f54.setText(str4);
            }
        }
    }
}
