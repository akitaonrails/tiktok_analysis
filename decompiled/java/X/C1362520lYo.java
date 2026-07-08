package X;

import Y.ACListenerS124S0200000_21;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0lYo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1362520lYo extends RecyclerView.ViewHolder {
    public static final /* synthetic */ int LLJI = 0;
    public SharePanelViewModel LL;
    public final boolean LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final String LLIZLLLIL;
    public final C1361580lXI LLJ;

    public final C427660Gpo L5() {
        return (C427660Gpo) this.LLILLL.getValue();
    }

    public final TuxIconView N5() {
        return (TuxIconView) this.LLILZ.getValue();
    }

    public final void P5() {
        if (!this.LL.LJIILL().isEmpty()) {
            C786410Ut5.v5(L5(), 0.34f);
            C786410Ut5.B5((TuxTextView) this.LLILZIL.getValue(), 0.34f);
            N5().setImageAlpha(86);
        } else {
            C786410Ut5.v5(L5(), 1.0f);
            C786410Ut5.B5((TuxTextView) this.LLILZIL.getValue(), 1.0f);
            N5().setImageAlpha(255);
        }
    }

    public final void R5(IMContact iMContact) {
        if (!this.LL.LJIILL().isEmpty()) {
            C786410Ut5.I7(null, this.itemView);
            this.itemView.setClickable(false);
        } else {
            C786410Ut5.I7(new ACListenerS124S0200000_21(iMContact, this, 92), this.itemView);
            this.itemView.setClickable(true);
        }
    }

    public final void I5(IMContact iMContact, SharePanelViewModel sharePanelViewModel) {
        UrlModel avatarThumb;
        Integer numLIZJ;
        Number numberValueOf;
        Bundle bundle;
        String str;
        Integer numLIZJ2;
        P5();
        this.LL = sharePanelViewModel;
        User user = sharePanelViewModel.LLJJIJIIJIL;
        if (user != null) {
            avatarThumb = user.getAvatarThumb();
        } else {
            avatarThumb = null;
        }
        boolean z = this.LLILLJJLI;
        int i = R.attr.c5;
        boolean z2 = false;
        if (z) {
            if (avatarThumb != null) {
                C427660Gpo.LJIIJJI(L5(), C438710HIf.LIZ(avatarThumb), false, null, null, false, false, null, null, false, null, 1022);
            } else {
                C427660Gpo.LJIIJJI(L5(), Integer.valueOf(R.raw.icon_color_default_avatar), false, null, null, false, false, null, null, false, null, 1022);
            }
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
            c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
            if (C1608660rxo.LIZ) {
                numLIZJ2 = Integer.valueOf(C1607070rvF.LIZIZ.LJI().LIZJ(N5().getContext()));
            } else {
                numLIZJ2 = C1308910kAL.LIZJ(R.attr.a09, this.itemView.getContext());
            }
            c384050F3z.LIZ = numLIZJ2;
            c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
            c384050F3z.LJFF = Integer.valueOf(R.attr.c5);
            c384050F3z.LIZJ = Float.valueOf(Float.MAX_VALUE);
            Drawable drawableLIZ = c384050F3z.LIZ(this.itemView.getContext());
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_plus_tiny_fill;
            c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(this.itemView.getContext());
            TuxIconView tuxIconViewN5 = N5();
            tuxIconViewN5.setImageDrawable(tuxIconDrawableLIZ);
            tuxIconViewN5.setBackground(drawableLIZ);
            C786410Ut5.LLLLLLZZ(tuxIconViewN5, 0);
            C786410Ut5.Uc(tuxIconViewN5, C418440Gaw.LIZIZ(2));
            C786410Ut5.vd(tuxIconViewN5, C418440Gaw.LIZIZ(2));
            ((TextView) this.LLILZIL.getValue()).setText(this.itemView.getContext().getString(2131847917));
            C786410Ut5.I7(new ACListenerS124S0200000_21(iMContact, this, 93), (View) this.LLILZLL.getValue());
        } else {
            if (avatarThumb != null) {
                C427660Gpo.LJIIJJI(L5(), C438710HIf.LIZ(avatarThumb), false, null, null, false, false, null, null, false, null, 1022);
            } else {
                C427660Gpo.LJIIJJI(L5(), Integer.valueOf(R.raw.icon_color_default_avatar), false, null, null, false, false, null, null, false, null, 1022);
            }
            C419910GdJ c419910GdJ2 = new C419910GdJ();
            c419910GdJ2.LIZ = R.raw.icon_plus_tiny_fill;
            c419910GdJ2.LJ = Integer.valueOf(R.attr.ee);
            c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
            c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
            TuxIconDrawable tuxIconDrawableLIZ2 = c419910GdJ2.LIZ(this.itemView.getContext());
            InterfaceC1366500lfE interfaceC1366500lfE = C1370370llT.LJIIIIZZ;
            if (interfaceC1366500lfE != null && interfaceC1366500lfE.LJIIIZ(this.LL.LL)) {
                z2 = true;
            }
            C384050F3z c384050F3z2 = new C384050F3z();
            c384050F3z2.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22));
            c384050F3z2.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22));
            if (C1608660rxo.LIZ) {
                numLIZJ = Integer.valueOf(C1607070rvF.LIZIZ.LJI().LIZJ(N5().getContext()));
            } else {
                numLIZJ = C1308910kAL.LIZJ(R.attr.a09, this.itemView.getContext());
            }
            c384050F3z2.LIZ = numLIZJ;
            if (z2) {
                numberValueOf = Double.valueOf(2.5d);
            } else {
                numberValueOf = 2;
            }
            c384050F3z2.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(numberValueOf)));
            if (z2) {
                i = R.attr.a1e;
            }
            c384050F3z2.LJFF = Integer.valueOf(i);
            c384050F3z2.LIZJ = Float.valueOf(Float.MAX_VALUE);
            Drawable drawableLIZ2 = c384050F3z2.LIZ(this.itemView.getContext());
            TuxIconView tuxIconViewN52 = N5();
            tuxIconViewN52.setImageDrawable(tuxIconDrawableLIZ2);
            tuxIconViewN52.setBackground(drawableLIZ2);
            C786410Ut5.Uc(tuxIconViewN52, C418440Gaw.LIZIZ(2));
            C786410Ut5.vd(tuxIconViewN52, C418440Gaw.LIZIZ(2));
            R5(iMContact);
            ((TextView) this.LLILZIL.getValue()).setText(this.itemView.getContext().getText(2131847917));
        }
        SharePackage sharePackage = this.LL.LL;
        if (sharePackage != null && (bundle = sharePackage.extras) != null) {
            C786410Ut5.LJJJI("share_to_story_entrance_icon", this.LLIZLLLIL, bundle);
            if (this.LLILLJJLI) {
                str = "long_press";
            } else {
                str = "click_share_button";
            }
            C786410Ut5.LJJJI("share_to_story_enter_method", str, bundle);
        }
        this.LLJ.LIZ(iMContact, "SHARE_PANEL", new AwS565S0100000_21(this, 1571));
    }

    public C1362520lYo(View view, SharePanelViewModel sharePanelViewModel, boolean z) {
        super(view);
        this.LL = sharePanelViewModel;
        this.LLILLJJLI = z;
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LLILLL = C452501pT.LIZ(enumC452301pR, new AwS565S0100000_21(view, 1570));
        this.LLILZ = C452501pT.LIZ(enumC452301pR, new AwS565S0100000_21(view, 1572));
        this.LLILZIL = C452501pT.LIZ(enumC452301pR, new AwS565S0100000_21(view, 1574));
        this.LLILZLL = C452501pT.LIZ(enumC452301pR, new AwS565S0100000_21(view, 1573));
        this.LLIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(629));
        this.LLIZLLLIL = "avatar_story_icon";
        this.LLJ = new C1361580lXI();
        C2211751BhN.LIZ(view, this.LLJ);
    }
}
