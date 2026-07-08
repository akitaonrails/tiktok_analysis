package X;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.api.revenue.strategy.touchpoint.model.GiftPanelItemMetaData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import u4.q0;
import webcast.data.TPText;

/* JADX INFO: renamed from: X.0fQm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1126900fQm extends AbstractC1126560fQE {
    public final View LLLILZ;
    public final String LLLILZJ;
    public final String LLLILZLLLI;
    public Spannable LLLIZZ;
    public Spannable LLLJ;
    public Spannable LLLJIL;

    @Override // X.AbstractC1126560fQE
    public final void h6() {
        q0.LJIJ(this.LLLILZ, new C1151960g5C(this, 5));
    }

    @Override // X.AbstractC1126560fQE
    public final String R5() {
        return this.LLLILZJ;
    }

    public C1126900fQm(View view) {
        super(view);
        this.LLLILZ = view;
        this.LLLILZJ = "LiveGiftRevenueTouchPointViewHolder";
        String strLJIJI = C497740JfY.LJIJI(2131840820);
        this.LLLILZLLLI = strLJIJI == null ? "" : strLJIJI;
    }

    @Override // X.AbstractC1126560fQE
    public final void N5(AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI, DataChannel dataChannel, int i) {
        Boolean boolValueOf;
        GiftPanelItemMetaData giftPanelItemMetaData;
        ImageModel imageModel;
        SpannableStringBuilder spannableStringBuilderLIZLLL;
        SpannableStringBuilder spannableStringBuilderLIZLLL2;
        SpannableStringBuilder spannableStringBuilderLIZLLL3;
        super.N5(abstractC1126600fQI, dataChannel, i);
        if (abstractC1126600fQI instanceof C1127220fRI) {
            C1127220fRI c1127220fRI = (C1127220fRI) abstractC1126600fQI;
            GiftPanelItemMetaData giftPanelItemMetaData2 = c1127220fRI.LJJIFFI.item;
            if (giftPanelItemMetaData2 != null) {
                TPText tPText = giftPanelItemMetaData2.title;
                if (tPText != null && (spannableStringBuilderLIZLLL3 = C1143850fs7.LIZLLL(C1143850fs7.LIZ, tPText)) != null) {
                    this.LLLIZZ = spannableStringBuilderLIZLLL3;
                }
                TPText tPText2 = giftPanelItemMetaData2.subTitle;
                if (tPText2 != null && (spannableStringBuilderLIZLLL2 = C1143850fs7.LIZLLL(C1143850fs7.LIZ, tPText2)) != null) {
                    this.LLLJ = spannableStringBuilderLIZLLL2;
                }
                TPText tPText3 = giftPanelItemMetaData2.btContent;
                if (tPText3 != null && (spannableStringBuilderLIZLLL = C1143850fs7.LIZLLL(C1143850fs7.LIZ, tPText3)) != null) {
                    this.LLLJIL = spannableStringBuilderLIZLLL;
                }
            }
            InterfaceC1126960fQs interfaceC1126960fQs = c1127220fRI.LJJII;
            if (interfaceC1126960fQs != null) {
                interfaceC1126960fQs.LIZ();
            }
        }
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI2 = this.LLJJLIIIJLLLLLLLZ;
        ImageModel imageModel2 = null;
        if (abstractC1126600fQI2 != null) {
            boolValueOf = Boolean.valueOf(abstractC1126600fQI2.LIZJ);
        } else {
            boolValueOf = null;
        }
        boolean zLJJJI = C500260Jjc.LJJJI(boolValueOf);
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI3 = this.LLJJLIIIJLLLLLLLZ;
        if ((abstractC1126600fQI3 instanceof C1127220fRI) && (giftPanelItemMetaData = ((C1127220fRI) abstractC1126600fQI3).LJJIFFI.item) != null && (imageModel = giftPanelItemMetaData.icon) != null) {
            imageModel2 = imageModel;
        }
        if (zLJJJI) {
            C500260Jjc.LJIILIIL(this.LLJILLL);
            C500260Jjc.LLFFF(this.LLJJI);
            if (imageModel2 != null) {
                C0JSS.LIZLLL(this.LLJJI, imageModel2);
            }
        } else {
            C500260Jjc.LLFFF(this.LLJILLL);
            C500260Jjc.LJIILIIL(this.LLJJI);
            if (imageModel2 != null) {
                C0JSS.LIZLLL(this.LLJILLL, imageModel2);
            }
        }
        C16F5 c16f5 = this.LLJJIII;
        if (c16f5 != null) {
            C500260Jjc.LLFFF(c16f5);
        }
        if (zLJJJI) {
            C16F5 c16f52 = this.LLJJIII;
            if (c16f52 != null) {
                c16f52.setText(this.LLLIZZ);
            }
        } else {
            C16F5 c16f53 = this.LLJJIII;
            if (c16f53 != null) {
                c16f53.setText(this.LLLJ);
            }
        }
        C16F5 c16f54 = this.LLJIJIL;
        if (c16f54 != null) {
            c16f54.setText(this.LLLIZZ);
        }
        C16F5 c16f55 = this.LLJJJJ;
        if (c16f55 != null) {
            c16f55.setText(this.LLLJIL);
        }
    }
}
