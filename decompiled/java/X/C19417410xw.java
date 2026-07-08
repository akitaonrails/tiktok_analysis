package X;

import Y.ACListenerS163S0100000_29;
import Y.AObserverS189S0200000_29;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.10xw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19417410xw extends C19417510xx {
    public final LifecycleOwner LLJIJIL;
    public final View LLJILJIL;
    public final RemoteImageView LLJILJILJ;
    public final TuxTextView LLJILLL;
    public final View LLJJ;
    public final View LLJJI;

    @Override // X.C19417510xx
    public final void N5() {
    }

    @Override // X.C19417510xx
    public final LifecycleOwner getLifecycleOwner() {
        return this.LLJIJIL;
    }

    @Override // X.C19417510xx
    public final void L5(AnchorPublishStruct anchorPublishStruct) {
        boolean z;
        List<Integer> listLJJIL;
        List<Integer> listLJJIL2;
        IECommerceAnchorService iECommerceAnchorService = (IECommerceAnchorService) PluggableExtentionKt.pluggableSpi$default(IECommerceAnchorService.class, false, false, false, 14, null);
        if (iECommerceAnchorService != null && (listLJJIL2 = iECommerceAnchorService.LJJIL()) != null && listLJJIL2.contains(Integer.valueOf(anchorPublishStruct.type))) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C19417510xx.P5(anchorPublishStruct.type, this.LLJJI);
            if ((!iECommerceAnchorService.LJJJJLL() && anchorPublishStruct.extensionMisc.isImageMode()) || !anchorPublishStruct.enable) {
                C786410Ut5.T4(this.LLJILJIL, 0.34f);
            } else {
                C786410Ut5.T4(this.LLJILJIL, 1.0f);
            }
        } else {
            C786410Ut5.T4(this.LLJILJIL, 1.0f);
        }
        if (anchorPublishStruct.type == EnumC1430380nKG.GET_LEADS.getTYPE() && !anchorPublishStruct.enable) {
            C786410Ut5.T4(this.LLJILJIL, 0.34f);
        }
        if (anchorPublishStruct.type == EnumC1430380nKG.BA_PRODUCT_ANCHOR.getTYPE() && !anchorPublishStruct.enable) {
            C786410Ut5.T4(this.LLJILJIL, 0.34f);
        }
        if (anchorPublishStruct.type == EnumC1430380nKG.PAID_COLLECTION.getTYPE() && !anchorPublishStruct.enable) {
            C786410Ut5.T4(this.LLJILJIL, 0.34f);
        }
        if (iECommerceAnchorService != null && (listLJJIL = iECommerceAnchorService.LJJIL()) != null && listLJJIL.contains(Integer.valueOf(anchorPublishStruct.type))) {
            anchorPublishStruct.extensionMisc.extensionDataRepo.getI18nStarAtlasClosed().observe(this.LLJIJIL, new AObserverS189S0200000_29(anchorPublishStruct, this, 3));
            if (!anchorPublishStruct.enable) {
                C786410Ut5.T4(this.LLJILJIL, 0.34f);
            }
        }
        C1324840ka2.LJFF(this.LLJILJILJ, anchorPublishStruct.icon);
        if (anchorPublishStruct.type == 40) {
            this.LLJILLL.setMaxEms(20);
        }
        this.LLJILLL.setText(anchorPublishStruct.title);
        if (anchorPublishStruct.enable) {
            TuxTextView tuxTextView = this.LLJILLL;
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, this.itemView.getContext());
            if (numLIZJ != null) {
                tuxTextView.setTextColor(numLIZJ.intValue());
            } else {
                return;
            }
        } else {
            TuxTextView tuxTextView2 = this.LLJILLL;
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.ue, this.itemView.getContext());
            if (numLIZJ2 == null) {
                return;
            } else {
                tuxTextView2.setTextColor(numLIZJ2.intValue());
            }
        }
        if (anchorPublishStruct.isNew) {
            C337180DJs.LIZJ(this.LLJJ);
        } else {
            C337180DJs.LIZ(this.LLJJ);
        }
        C786410Ut5.I7(new ACListenerS163S0100000_29(anchorPublishStruct, 185), this.itemView);
    }

    public C19417410xw(View view, LifecycleOwner lifecycleOwner) {
        super(view, lifecycleOwner);
        this.LLJIJIL = lifecycleOwner;
        this.LLJILJIL = this.itemView.findViewById(R.id.b08);
        this.LLJILJILJ = (RemoteImageView) this.itemView.findViewById(R.id.l8d);
        this.LLJILLL = (TuxTextView) this.itemView.findViewById(R.id.z9i);
        this.LLJJ = this.itemView.findViewById(R.id.l0h);
        this.LLJJI = this.itemView.findViewById(R.id.b0k);
    }
}
