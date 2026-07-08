package X;

import Y.ACListenerS141S0100000_6;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.service.service.IDMGeckoCommonChannelManager;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0HYy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C443060HYy extends RecyclerView.ViewHolder {
    public final InterfaceC450890HmB LL;

    public C443060HYy(View view, InterfaceC450890HmB interfaceC450890HmB) {
        boolean z;
        String strLJ;
        super(view);
        this.LL = interfaceC450890HmB;
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zp);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
        this.itemView.setBackground(c384050F3z.LIZ(view.getContext()));
        TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.auo);
        C454640HsE c454640HsE = IMStickerApi.LIZ;
        IIMSocialAvatarService imSocialAvatarService = c454640HsE.LIZIZ().getImSocialAvatarService();
        if (imSocialAvatarService != null) {
            tuxTextView.setText(imSocialAvatarService.LIZLLL().getStrId());
            tuxTextView.setTuxFont(51);
        }
        C786410Ut5.I7(new ACListenerS141S0100000_6(this, 85), this.itemView);
        C786410Ut5.a9((TuxIconView) this.itemView.findViewById(R.id.brh), new ACListenerS141S0100000_6(this, 86));
        if (c454640HsE.LIZIZ().getImSocialAvatarService().LIZLLL() == C0HZ0.SOCIAL_AVATAR) {
            z = true;
        } else {
            z = false;
        }
        if (z && C435330H5f.LIZ()) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C443050HYx(this, null), 3);
        } else {
            IDMGeckoCommonChannelManager iDMGeckoCommonChannelManager = (IDMGeckoCommonChannelManager) PluggableExtentionKt.pluggableSpiForReal(IDMGeckoCommonChannelManager.class);
            if (iDMGeckoCommonChannelManager != null && (strLJ = iDMGeckoCommonChannelManager.LJ(z)) != null) {
                C1331670kl3 c1331670kl3LJII = C1331660kl2.LJII(new C0VSJ(strLJ));
                C1332130kln.LIZJ(c1331670kl3LJII, C06TB.STABLE_STICKER);
                c1331670kl3LJII.LJJ((InterfaceC1334290kpH) this.itemView.findViewById(R.id.nl0));
                C786410Ut5.h3(c1331670kl3LJII);
            }
        }
        if (C435330H5f.LIZ()) {
            View view2 = this.itemView;
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
                C786410Ut5.W5(view2, layoutParams);
                View viewFindViewById = this.itemView.findViewById(R.id.nl0);
                if (viewFindViewById != null) {
                    ViewGroup.LayoutParams layoutParams2 = viewFindViewById.getLayoutParams();
                    if (layoutParams2 != null) {
                        layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(104));
                        layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                        C786410Ut5.W5(viewFindViewById, layoutParams2);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }
}
