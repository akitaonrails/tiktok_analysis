package X;

import Y.ACListenerS155S0100000_21;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS600S0100000_21;
import org.json.JSONObject;
import u4.q0;

/* JADX INFO: renamed from: X.0lbT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1364170lbT extends RecyclerView.ViewHolder implements InterfaceC1363770lap {
    public static final /* synthetic */ int LLJJJJ = 0;
    public SharePanelViewModel LL;
    public final InterfaceC1362600lYw LLILLJJLI;
    public final EnumC1364050lbH LLILLL;
    public final TextView LLILZ;
    public final SmartAvatarImageView LLILZIL;
    public final C0HZQ LLILZLL;
    public final TuxIconView LLIZ;
    public final View LLIZLLLIL;
    public final C426770GoN LLJ;
    public C1363190lZt LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public AnonymousClass0956 LLJILJILJ;
    public AnonymousClass0956 LLJILLL;
    public AnonymousClass0956 LLJJ;
    public final C1364290lbf LLJJI;
    public final C1361580lXI LLJJIII;
    public int LLJJIJI;
    public final C2252331DDr LLJJIJIIJIL;
    public final C414301jJ LLJJIJIL;
    public final C1402260mau LLJJJ;
    public final C414301jJ LLJJJIL;

    @Override // X.InterfaceC1363770lap
    public final void onAttachedToWindow() {
        String str;
        C1362500lYm bbDetailInfo;
        HashMap<String, String> map = new HashMap<>();
        C1363190lZt c1363190lZt = this.LLJI;
        if (c1363190lZt == null || (bbDetailInfo = c1363190lZt.getBbDetailInfo()) == null || (str = bbDetailInfo.LIZ) == null) {
            str = "";
        }
        map.put("to_user_id", str);
        map.put("rank_index", String.valueOf(this.LLJJIJI));
        map.put("icon_type", "bulletin_board");
        InterfaceC1362600lYw interfaceC1362600lYw = this.LLILLJJLI;
        if (interfaceC1362600lYw != null) {
            interfaceC1362600lYw.LIZLLL(map);
        }
    }

    @Override // X.InterfaceC1363770lap
    public final void onDetachedFromWindow() {
        C1364290lbf c1364290lbf = this.LLJJI;
        if (c1364290lbf != null) {
            c1364290lbf.LIZLLL();
        }
    }

    public final void I5(int i, IMContact iMContact, SharePanelViewModel sharePanelViewModel) {
        C1363190lZt c1363190lZt;
        int i2;
        if ((iMContact instanceof C1363190lZt) && (c1363190lZt = (C1363190lZt) iMContact) != null) {
            this.LLJI = c1363190lZt;
            this.LLJJIJI = i;
            iMContact.displayPosition = sharePanelViewModel.LJIIJJI().indexOf(iMContact);
            C1363190lZt c1363190lZt2 = (C1363190lZt) iMContact;
            C1362500lYm bbDetailInfo = c1363190lZt2.getBbDetailInfo();
            if (bbDetailInfo == null) {
                return;
            }
            this.LLILZ.setText(bbDetailInfo.LIZIZ);
            String str = bbDetailInfo.LIZJ;
            if (str != null) {
                C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZJ(str));
                c1331670kl3LJIIIIZZ.LJJ(this.LLILZIL);
                C786410Ut5.h3(c1331670kl3LJIIIIZZ);
            }
            this.LLJJIII.LIZ(iMContact, "SHARE_PANEL", AFwS209S0000000_21.get$arr$(631));
            this.LL = sharePanelViewModel;
            this.LLJJIJIIJIL.LIZJ(iMContact);
            C426770GoN c426770GoN = this.LLJ;
            if (c1363190lZt2.isFirstShow()) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            C786410Ut5.LJLLLLLL(i2, c426770GoN);
            q0.LJIJ(this.itemView, new C1402420mbA(this, 9));
            AnonymousClass0956 anonymousClass0956 = this.LLJILJILJ;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LLJILJILJ = C23250099c.LIZLLL(this.LL.LLJL, null, null, new C1364200lbW(this, null), 3);
            AnonymousClass0956 anonymousClass09562 = this.LLJILLL;
            if (anonymousClass09562 != null) {
                anonymousClass09562.LIZIZ(null);
            }
            this.LLJILLL = C23250099c.LIZLLL(this.LL.LLJL, null, null, new C1364190lbV(this, null), 3);
            AnonymousClass0956 anonymousClass09563 = this.LLJJ;
            if (anonymousClass09563 != null) {
                anonymousClass09563.LIZIZ(null);
            }
            this.LLJJ = C23250099c.LIZLLL(this.LL.LLJL, null, null, new C1364210lbX(this, null), 3);
            C1364290lbf c1364290lbf = this.LLJJI;
            if (c1364290lbf != null) {
                c1364290lbf.LIZIZ(iMContact, this.LL, this.LLJJIJIIJIL, null);
            }
        }
    }

    public C1364170lbT(View view, SharePanelViewModel sharePanelViewModel, boolean z, int i, boolean z2, int i2, int i3, InterfaceC1362600lYw interfaceC1362600lYw, EnumC1364050lbH enumC1364050lbH) {
        Bundle bundle;
        TuxTextView tuxTextView;
        LinearLayout.LayoutParams layoutParams;
        Bundle bundle2;
        super(view);
        this.LL = sharePanelViewModel;
        this.LLILLJJLI = interfaceC1362600lYw;
        this.LLILLL = enumC1364050lbH;
        this.LLJJIII = new C1361580lXI();
        this.LLJJIJI = -1;
        String string = null;
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(1, 0, null, 6);
        this.LLJJIJIIJIL = c2252331DDrLIZIZ;
        C1402260mau c1402260mau = new C1402260mau(c2252331DDrLIZIZ, this, 0);
        this.LLJJIJIL = new C414301jJ(c2252331DDrLIZIZ, c1402260mau, new C1364180lbU(this, null));
        this.LLJJJ = new C1402260mau(c2252331DDrLIZIZ, this, 1);
        this.LLJJJIL = new C414301jJ(c2252331DDrLIZIZ, c1402260mau, new C1364220lbY(null));
        view.getLayoutParams().width = i;
        TextView textView = (TextView) view.findViewById(R.id.p0w);
        this.LLILZ = textView;
        textView.setImportantForAccessibility(2);
        SmartAvatarImageView smartAvatarImageView = (SmartAvatarImageView) view.findViewById(R.id.biz);
        this.LLILZIL = smartAvatarImageView;
        smartAvatarImageView.setImportantForAccessibility(2);
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.cz_);
        this.LLIZ = tuxIconView;
        tuxIconView.setImportantForAccessibility(2);
        C0HZQ c0hzq = (C0HZQ) view.findViewById(R.id.jgi);
        this.LLILZLL = c0hzq;
        if (c0hzq != null) {
            textView.setLabelFor(c0hzq.getId());
        }
        c0hzq.setImportantForAccessibility(2);
        View viewFindViewById = view.findViewById(R.id.jgh);
        this.LLIZLLLIL = viewFindViewById;
        viewFindViewById.setImportantForAccessibility(2);
        C1428310nGv.LJII(this.LLIZLLLIL, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))));
        this.LLJ = (C426770GoN) view.findViewById(R.id.czh);
        SharePackage sharePackage = this.LL.LL;
        if (sharePackage != null && (bundle2 = sharePackage.extras) != null) {
            ArrayList<JSONObject> arrayList = C1369870lkf.LIZ;
            Integer numLJFF = C1369870lkf.LJFF(bundle2, "key_sheet_background_color");
            if (numLJFF != null) {
                int iIntValue = numLJFF.intValue();
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZ = Integer.valueOf(iIntValue);
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
                viewFindViewById.setBackground(c384050F3z.LIZ(view.getContext()));
            }
        }
        C1362230lYL c1362230lYL = this.LL.LLJI;
        if (c1362230lYL != null) {
            view.getLayoutParams().width = c1362230lYL.LJIIJJI;
            smartAvatarImageView.getLayoutParams().width = c1362230lYL.LJIIL;
            smartAvatarImageView.getLayoutParams().height = c1362230lYL.LJIIL;
            if ((textView instanceof TuxTextView) && (tuxTextView = (TuxTextView) textView) != null) {
                ViewGroup.LayoutParams layoutParams2 = tuxTextView.getLayoutParams();
                if ((layoutParams2 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams2) != null) {
                    layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                } else {
                    layoutParams = null;
                }
                C786410Ut5.R6(tuxTextView, layoutParams);
                TuxTextView tuxTextView2 = (TuxTextView) textView;
                tuxTextView2.setTextColorRes(R.attr.a1h);
                Integer num = c1362230lYL.LJIIZILJ;
                if (num != null) {
                    tuxTextView2.setTuxFont(num.intValue());
                }
            }
        } else {
            if (z) {
                view.getLayoutParams().width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(62));
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) textView.getLayoutParams();
                layoutParams3.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                C786410Ut5.g6(this.LLILZ, layoutParams3);
            }
            if (z2) {
                int dimensionPixelOffset = view.getContext().getResources().getDimensionPixelOffset(R.dimen.a2s);
                smartAvatarImageView.getLayoutParams().height = dimensionPixelOffset;
                smartAvatarImageView.getLayoutParams().width = dimensionPixelOffset;
            }
        }
        textView.setMaxLines(i2);
        Integer numLIZJ = C1308910kAL.LIZJ(i3, textView.getContext());
        if (numLIZJ != null) {
            textView.setTextColor(numLIZJ.intValue());
        }
        C2211751BhN.LIZ(view, this.LLJJIII);
        AwS600S0100000_21 awS600S0100000_21 = new AwS600S0100000_21(this, 389);
        C786410Ut5.G9(smartAvatarImageView, new ACListenerS155S0100000_21(awS600S0100000_21, 262));
        C786410Ut5.T7(textView, new ACListenerS155S0100000_21(awS600S0100000_21, 262));
        C786410Ut5.b9(c0hzq, new ACListenerS155S0100000_21(awS600S0100000_21, 262));
        SharePackage sharePackage2 = this.LL.LL;
        if (sharePackage2 != null && (bundle = sharePackage2.extras) != null) {
            string = bundle.getString("panel_source");
        }
        int iLIZLLL = C1369210ljb.LIZLLL(string);
        if (z) {
            C01GW c01gw = C1367480lgo.LIZ;
            if (C1367480lgo.LIZIZ(this.LL.LL)) {
                if (iLIZLLL == 1) {
                    this.LLJJI = new C1364290lbf(view.getContext(), this.LL);
                }
                C1364290lbf c1364290lbf = this.LLJJI;
                if (c1364290lbf != null) {
                    c1364290lbf.LIZJ((ViewGroup) view, this.LL.LLJI);
                }
            }
        }
    }
}
