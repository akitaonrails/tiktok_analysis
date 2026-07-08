package X;

import Y.ACListenerS163S0100000_29;
import Y.ARunnableS62S0300000_29;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import avg.f;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.donation.DonationStickerModel;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.internal.AwS573S0100000_29;
import mf.a;

/* JADX INFO: renamed from: X.11im, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19578211im extends AbstractC19588311kP<DonationStickerModel> {
    public C424630Gkv LLILZIL;
    public TextView LLILZLL;
    public TextView LLIZ;
    public TextView LLIZLLLIL;
    public int LLJ;
    public boolean LLJI;
    public DonationStickerModel LLJIJIL;
    public final C01GW LLJILJIL;

    public final void LJFF() {
        TextView textView = this.LLIZ;
        if (textView != null) {
            textView.setText(Keva.getRepo("donation_sticker").getString("donation_match_text", ""));
        }
        findViewById(R.id.cpm).setClickable(false);
    }

    @Override // X.AbstractC19588311kP, X.InterfaceC19592111l1
    public final void LJIIZILJ() {
        View.OnClickListener aCListenerS163S0100000_29 = new ACListenerS163S0100000_29(this, 268);
        if (C1848410yCV.LIZ) {
            aCListenerS163S0100000_29 = new f(aCListenerS163S0100000_29);
        }
        a aVar = new a(aCListenerS163S0100000_29);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
        C2271391DvN.LIZ(this, (C1A5L) C2271381DvM.LJJJJLL.getValue());
    }

    public final InterfaceC19578611iq getInteractStickerClickListener() {
        return (InterfaceC19578611iq) this.LLJILJIL.getValue();
    }

    public C19578211im(Context context) {
        super(0, 14, context, (AttributeSet) null);
        LIZLLL(C19578711ir.LIZ(0, false), null);
        this.LLJ = -1;
        this.LLJILJIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 985));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(com.ss.android.ugc.aweme.tools.sticker.core.donation.DonationStickerModel r5) {
        /*
            r4 = this;
            android.widget.TextView r3 = r4.LLIZLLLIL
            if (r3 != 0) goto L5
            return
        L5:
            int r1 = X.C19583911jh.LIZLLL(r5)
            r0 = 3
            if (r1 == r0) goto Ld
            return
        Ld:
            java.lang.String r0 = r5.getFundraiserGoalDesc()
            boolean r0 = kotlin.text.a0.LJJJIL(r0)
            r1 = 0
            if (r0 == 0) goto L3c
            r2 = 0
        L19:
            r1 = 8
        L1b:
            X.C786410Ut5.LLIL(r3, r1)
            if (r2 == 0) goto L2f
            java.lang.String r0 = r5.getFundraiserGoalDesc()
            java.lang.CharSequence r0 = kotlin.text.a0.LJLIIIL(r0)
            java.lang.String r0 = r0.toString()
            r3.setText(r0)
        L2f:
            android.widget.TextView r1 = r4.LLILZLL
            if (r1 == 0) goto L39
            if (r2 == 0) goto L3a
            r0 = 1
        L36:
            r1.setMaxLines(r0)
        L39:
            return
        L3a:
            r0 = 2
            goto L36
        L3c:
            boolean r0 = r4.LLJI
            if (r0 != 0) goto L4d
            X.11ks r0 = r4.getInteractStickerContainerCommonParam()
            if (r0 == 0) goto L4d
            boolean r2 = r5.getShouldRenderRealtimeOverlay()
        L4a:
            if (r2 == 0) goto L19
            goto L1b
        L4d:
            boolean r2 = X.C306530Bzv.LIZ()
            goto L4a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19578211im.LIZIZ(com.ss.android.ugc.aweme.tools.sticker.core.donation.DonationStickerModel):void");
    }

    public final String LJ(DonationStickerModel donationStickerModel) {
        if (C19583911jh.LIZLLL(donationStickerModel) == 0) {
            return C786410Ut5.j4(getContext().getString(2131832356), Arrays.copyOf(new Object[]{donationStickerModel.getName()}, 1));
        }
        return donationStickerModel.getName();
    }

    public final void LJII(DonationStickerModel donationStickerModel) {
        TextView textView;
        C424630Gkv c424630Gkv = this.LLILZIL;
        if (c424630Gkv == null || (textView = this.LLILZLL) == null) {
            return;
        }
        C1324750kZt.LJIIIZ(c424630Gkv, donationStickerModel.getIconUri(), -1, -1);
        textView.setText(LJ(donationStickerModel));
        LIZIZ(donationStickerModel);
        LJIIIIZZ(donationStickerModel, false);
    }

    public C19578211im(Context context, C19591211ks c19591211ks) {
        super(0, context, (AttributeSet) null, c19591211ks);
        LIZLLL(C19578711ir.LIZ(0, false), null);
        this.LLJ = -1;
        this.LLJILJIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 985));
    }

    @Override // X.AbstractC19588311kP, X.InterfaceC19592111l1
    public final void LIZJ(InteractStickerStruct interactStickerStruct, StickerModel stickerModel) {
        DonationStickerModel donationStickerModel;
        TextView textView;
        this.LLILZ = interactStickerStruct;
        this.LLJI = false;
        this.LLJIJIL = null;
        if ((stickerModel instanceof DonationStickerModel) && (donationStickerModel = (DonationStickerModel) stickerModel) != null) {
            int iLIZLLL = C19583911jh.LIZLLL(donationStickerModel);
            int i = this.LLJ;
            LIZLLL(iLIZLLL, donationStickerModel);
            if (i == this.LLJ) {
                LJI(iLIZLLL, donationStickerModel);
            }
            LJFF();
            C424630Gkv c424630Gkv = this.LLILZIL;
            if (c424630Gkv == null || (textView = this.LLILZLL) == null) {
                return;
            }
            C1324750kZt.LJIIIZ(c424630Gkv, donationStickerModel.getIconUri(), -1, -1);
            textView.setText(LJ(donationStickerModel));
            LIZIZ(donationStickerModel);
            LJIIIIZZ(donationStickerModel, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(int r5, com.ss.android.ugc.aweme.tools.sticker.core.donation.DonationStickerModel r6) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19578211im.LIZLLL(int, com.ss.android.ugc.aweme.tools.sticker.core.donation.DonationStickerModel):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(int r7, com.ss.android.ugc.aweme.tools.sticker.core.donation.DonationStickerModel r8) {
        /*
            r6 = this;
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IUserService> r0 = com.ss.android.ugc.aweme.framework.services.IUserService.class
            r1 = 0
            r4 = 14
            r5 = 0
            r2 = r1
            r3 = r1
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r0, r1, r2, r3, r4, r5)
            com.ss.android.ugc.aweme.framework.services.IUserService r0 = (com.ss.android.ugc.aweme.framework.services.IUserService) r0
            java.lang.String r5 = ""
            if (r0 == 0) goto L18
            java.lang.String r3 = r0.getCurrentUserID()
            if (r3 != 0) goto L19
        L18:
            r3 = r5
        L19:
            X.09Gk r2 = new X.09Gk
            r2.<init>()
            java.lang.String r0 = "donation_sticker_type"
            r2.LIZJ(r7, r0)
            java.lang.String r1 = r8.getFundraiserId()
            java.lang.String r0 = "fundraiser_id"
            r2.LJIIIIZZ(r0, r1)
            boolean r0 = r6.LLJI
            if (r0 == 0) goto L8c
            java.lang.String r1 = "video_edit_page"
        L32:
            java.lang.String r0 = "enter_from"
            r2.LJIIIIZZ(r0, r1)
            X.11ks r0 = r6.getInteractStickerContainerCommonParam()
            if (r0 == 0) goto L50
            X.0RmZ r0 = r0.LJFF
            if (r0 == 0) goto L50
            java.lang.String r0 = r0.LJFF
            if (r0 == 0) goto L50
            java.lang.CharSequence r0 = kotlin.text.a0.LJLIIIL(r0)
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L50
            r5 = r0
        L50:
            int r0 = r5.length()
            r4 = 1
            if (r0 == 0) goto L89
            java.lang.String r1 = "story"
            boolean r0 = kotlin.text.u.LJIJI(r5, r1, r4)
            if (r0 != 0) goto L65
            boolean r0 = kotlin.text.a0.LJJIIZI(r5, r1, r4)
            if (r0 == 0) goto L89
        L65:
            java.lang.String r0 = "enter_method"
            r2.LJIIIIZZ(r0, r1)
            java.lang.String r1 = r8.getName()
            java.lang.String r0 = "ngo_name"
            r2.LJIIIIZZ(r0, r1)
            java.lang.String r0 = "from_user_id"
            r2.LJIIIIZZ(r0, r3)
            java.lang.String r1 = r8.getFundraiserOwnerId()
            java.lang.String r0 = "fundraiser_owner_id"
            r2.LJIIIIZZ(r0, r1)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "donation_sticker_show"
            X.C20684815ws.LJIILLIIL(r0, r1)
            return
        L89:
            java.lang.String r1 = "video"
            goto L65
        L8c:
            X.11ks r0 = r6.getInteractStickerContainerCommonParam()
            if (r0 == 0) goto La8
            X.0RmZ r0 = r0.LJFF
            if (r0 == 0) goto La8
            X.0R60 r0 = r0.LJIIZILJ
            if (r0 == 0) goto La8
            java.lang.String r0 = r0.LIZ
            if (r0 == 0) goto La8
            java.lang.CharSequence r0 = kotlin.text.a0.LJLIIIL(r0)
            java.lang.String r1 = r0.toString()
            if (r1 != 0) goto L32
        La8:
            r1 = r5
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19578211im.LJI(int, com.ss.android.ugc.aweme.tools.sticker.core.donation.DonationStickerModel):void");
    }

    public final void LJIIIIZZ(DonationStickerModel donationStickerModel, boolean z) {
        int iIntValue;
        int iLIZLLL = C19583911jh.LIZLLL(donationStickerModel);
        TextView textView = this.LLILZLL;
        if (textView == null) {
            return;
        }
        if (iLIZLLL != 1 && iLIZLLL != 2) {
            if (iLIZLLL != 3) {
                return;
            } else {
                iIntValue = ((Number) C1919207fS.LJIJI.getValue()).intValue();
            }
        } else {
            iIntValue = ((Number) C1919207fS.LJIJ.getValue()).intValue();
        }
        C19347510mf c19347510mf = new C19347510mf(textView, iIntValue, iLIZLLL, this);
        if (z) {
            c19347510mf.invoke();
        } else {
            HandlerHook.viewPost(textView, new ARunnableS62S0300000_29(textView, c19347510mf, this, 11));
        }
    }
}
