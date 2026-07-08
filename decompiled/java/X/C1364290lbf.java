package X;

import Y.ACListenerS155S0100000_21;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IShareMessageToastHelper;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.aweme.tako.ITakoService;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lbf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1364290lbf implements InterfaceC1364320lbi {
    public final Context LIZ;
    public SharePanelViewModel LIZIZ;
    public ViewGroup LIZJ;
    public TuxTextView LIZLLL;
    public TuxTextView LJ;
    public TuxTextView LJFF;
    public View LJI;
    public IMContact LJII;
    public C05YC<IMContact> LJIIIIZZ;
    public C0ZE7 LJIIIZ;

    public final C1364300lbg LIZLLL() {
        C1364300lbg c1364300lbg;
        ViewGroup viewGroup = this.LIZJ;
        Object tag = viewGroup != null ? viewGroup.getTag(R.id.xg) : null;
        if (!(tag instanceof C1364300lbg) || (c1364300lbg = (C1364300lbg) tag) == null) {
            c1364300lbg = new C1364300lbg(this.LIZ, this.LIZIZ, this);
            ViewGroup viewGroup2 = this.LIZJ;
            if (viewGroup2 != null) {
                viewGroup2.setTag(R.id.xg, c1364300lbg);
            }
        }
        return c1364300lbg;
    }

    public final void LJ() {
        Bundle bundle;
        SharePackage sharePackage = this.LIZIZ.LL;
        if (sharePackage == null || (bundle = sharePackage.extras) == null) {
            return;
        }
        bundle.putBoolean("lpp_im_clicked", true);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [X.0lbh] */
    public final void LJFF() {
        SharePackage sharePackage;
        Bundle bundle;
        int iIndexOf = this.LIZIZ.LJIIJJI().indexOf(this.LJII);
        SharePackage sharePackage2 = this.LIZIZ.LL;
        if (sharePackage2 != null && (bundle = sharePackage2.extras) != null) {
            bundle.putInt("rank_num", iIndexOf);
        }
        final C1364300lbg c1364300lbgLIZLLL = LIZLLL();
        final IMContact iMContact = c1364300lbgLIZLLL.LIZLLL;
        if (iMContact == null || (sharePackage = c1364300lbgLIZLLL.LIZIZ.LL) == null) {
            return;
        }
        final C1364280lbe c1364280lbe = new C1364280lbe(iMContact, sharePackage);
        final ?? r2 = new InterfaceC1362600lYw() { // from class: X.0lbh
            @Override // X.InterfaceC1362600lYw
            public final void LIZIZ(HashMap<String, String> map) {
            }

            @Override // X.InterfaceC1362600lYw
            public final void LIZJ(Dialog dialog, SharePackage sharePackage3) {
            }

            @Override // X.InterfaceC1362600lYw
            public final void LIZLLL(HashMap<String, String> map) {
            }

            @Override // X.InterfaceC1362600lYw
            public final void LJ(HashMap<String, String> map) {
            }

            @Override // X.InterfaceC1362600lYw
            public final void LJFF(SharePackage sharePackage3) {
            }

            @Override // X.InterfaceC1362600lYw
            public final void LJI(SharePackage sharePackage3) {
            }

            @Override // X.InterfaceC1362600lYw
            public final void LJII(Dialog dialog, SharePackage sharePackage3) {
            }

            @Override // X.InterfaceC1362600lYw
            public final boolean LJIIIIZZ(SharePackage sharePackage3) {
                return true;
            }

            @Override // X.InterfaceC1362600lYw
            public final void LJIIJ(SharePackage sharePackage3, String str) {
            }

            @Override // X.InterfaceC1362600lYw
            public final void LJIIJJI(SharePackage sharePackage3) {
            }

            @Override // X.InterfaceC1362600lYw
            public final void LJIIL(SharePackage sharePackage3) {
            }

            @Override // X.InterfaceC1362600lYw
            public final void LJIILIIL() {
            }

            @Override // X.InterfaceC1362600lYw
            public final void LIZ(SharePackage sharePackage3) {
                iMContact.setShareSuccess(true);
                c1364300lbgLIZLLL.LIZJ.LIZ(iMContact, true);
                if (!(iMContact instanceof C1363710laj)) {
                    C1364590lc9 c1364590lc9 = C1364590lc9.LIZ;
                    List listSingletonList = Collections.singletonList(c1364300lbgLIZLLL.LIZLLL);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    InterfaceC1493505sz interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
                    c1364590lc9.getClass();
                    C1364590lc9.LIZLLL(sharePackage3, "", listSingletonList, jCurrentTimeMillis, interfaceC1493505szLIZIZ, -1);
                }
            }
        };
        final Context context = c1364300lbgLIZLLL.LIZ;
        new Runnable(r2, context) { // from class: X.0lbd
            public final InterfaceC1362600lYw LL;
            public final Context LLILLJJLI;

            public final void LIZ() {
                Bundle bundle2;
                Bundle bundle3;
                if (!(this.LLILLL.LIZIZ instanceof C1363710laj)) {
                    IMSharePanelApi.LIZ.getClass();
                    InterfaceC1365380ldQ shareService = C1599690rjL.LIZ().getShareService();
                    C1364280lbe c1364280lbe2 = this.LLILLL;
                    shareService.LJJJ(c1364280lbe2.LIZ, "", Collections.singletonList(c1364280lbe2.LIZIZ), this.LL, 1, null, null, null, false, null, C2097608Jq.LJ());
                    return;
                }
                if (((ITakoService) ServiceManager.get().getService(ITakoService.class)).LJJIJIIJI(this.LLILLJJLI)) {
                    SharePackage sharePackage3 = this.LLILLL.LIZ;
                    String string = null;
                    String string2 = (sharePackage3 == null || (bundle3 = sharePackage3.extras) == null) ? null : bundle3.getString("aid");
                    SharePackage sharePackage4 = this.LLILLL.LIZ;
                    if (sharePackage4 != null && (bundle2 = sharePackage4.extras) != null) {
                        string = bundle2.getString("event_type");
                    }
                    C1364620lcC.LJIJJLI(C1364620lcC.LIZ, string, string2, "long_press");
                    SharePackage sharePackage5 = this.LLILLL.LIZ;
                    Aweme awemeLJJIJIL = C621180OYa.LIZ.LJJIJIL(sharePackage5);
                    if (awemeLJJIJIL != null) {
                        String string3 = sharePackage5.extras.getString("event_type");
                        if (string3 == null) {
                            string3 = "";
                        }
                        sharePackage5.extras.getString("aid");
                        ((ITakoService) ServiceManager.get().getService(ITakoService.class)).LJJLJLI(new C1388100mE4(awemeLJJIJIL, sharePackage5, string3, EnumC1373490lqV.LONG_PRESS));
                    }
                    InterfaceC1362600lYw interfaceC1362600lYw = this.LL;
                    if (interfaceC1362600lYw != null) {
                        interfaceC1362600lYw.LIZ(this.LLILLL.LIZ);
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("UndoableShareTaskV2$ShareMessageTask@b802.run");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("UndoableShareTaskV2$ShareMessageTask@b802.run");
            }

            {
                this.LL = r2;
                this.LLILLJJLI = context;
            }
        }.run();
        if (iMContact instanceof C1363710laj) {
            return;
        }
        C1367430lgj c1367430lgj = C1367430lgj.LIZ;
        IMContact iMContact2 = c1364300lbgLIZLLL.LIZLLL;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C0I0B c0i0b = C0I0B.LJFF;
        InterfaceC1493505sz interfaceC1493505szLIZIZ = c0i0b.LIZIZ();
        InterfaceC1493505sz interfaceC1493505szLIZIZ2 = c0i0b.LIZIZ();
        c1367430lgj.getClass();
        C1367430lgj.LIZLLL(sharePackage, iMContact2, false, "", jCurrentTimeMillis, interfaceC1493505szLIZIZ, interfaceC1493505szLIZIZ2);
    }

    public C1364290lbf(Context context, SharePanelViewModel sharePanelViewModel) {
        this.LIZ = context;
        this.LIZIZ = sharePanelViewModel;
    }

    @Override // X.InterfaceC1364320lbi
    public final void LIZ(IMContact iMContact, boolean z) {
        String strYs;
        if (!Intrinsics.LJFF(LIZLLL().LIZLLL, iMContact)) {
            return;
        }
        View view = this.LJI;
        if (view != null) {
            C339190DRl.LIZIZ(view);
        }
        TuxTextView tuxTextView = this.LJFF;
        if (tuxTextView != null) {
            C339190DRl.LIZLLL(tuxTextView);
        }
        TuxTextView tuxTextView2 = this.LIZLLL;
        if (tuxTextView2 != null) {
            C339190DRl.LIZIZ(tuxTextView2);
        }
        TuxTextView tuxTextView3 = this.LJ;
        if (tuxTextView3 != null) {
            C339190DRl.LIZIZ(tuxTextView3);
        }
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_chevron_right_offset_fill_ltr;
        c419910GdJ.LIZLLL = C1308910kAL.LIZJ(R.attr.a04, this.LIZ);
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.LIZ.getResources().getString(2131828597));
        spannableStringBuilder.append((CharSequence) "*");
        int length = spannableStringBuilder.length();
        C786410Ut5.q2(spannableStringBuilder, c419910GdJ.LIZIZ(2, this.LIZ), length - 1, length, 17);
        TuxTextView tuxTextView4 = this.LJFF;
        if (tuxTextView4 != null) {
            tuxTextView4.setText(spannableStringBuilder);
        }
        if (z) {
            Fragment fragment = this.LIZIZ.LLJLLIL;
            if (fragment == null) {
                return;
            }
            IShareMessageToastHelper iShareMessageToastHelper = (IShareMessageToastHelper) PluggableExtentionKt.pluggableSpi$default(IShareMessageToastHelper.class, false, false, false, 14, null);
            if (iShareMessageToastHelper != null) {
                String nickName = iMContact.getNickName();
                if (nickName == null) {
                    nickName = "";
                }
                strYs = iShareMessageToastHelper.ys(nickName);
            } else {
                strYs = null;
            }
            C1389890mGx c1389890mGx = new C1389890mGx(fragment);
            c1389890mGx.LJIIJ(strYs);
            c1389890mGx.LJFF(R.raw.icon_tick_circle_fill);
            c1389890mGx.LJII(R.attr.a1h);
            c1389890mGx.LJIIJJI();
        }
        C05YC<IMContact> c05yc = this.LJIIIIZZ;
        if (c05yc != null) {
            c05yc.LIZJ(iMContact);
        }
    }

    public final void LIZJ(ViewGroup viewGroup, C1362230lYL c1362230lYL) {
        this.LIZJ = viewGroup;
        View viewFindViewById = viewGroup.findViewById(R.id.bi2).findViewById(R.id.ka6);
        this.LJI = viewFindViewById;
        if ((viewFindViewById instanceof TuxIconView) && viewFindViewById != null && c1362230lYL != null) {
            viewFindViewById.getLayoutParams().width = c1362230lYL.LJIIL;
            viewFindViewById.getLayoutParams().height = c1362230lYL.LJIIL;
        }
        View view = this.LJI;
        if (view != null) {
            C339190DRl.LIZIZ(view);
        }
        TuxTextView tuxTextView = (TuxTextView) viewGroup.findViewById(R.id.ka5);
        this.LJFF = tuxTextView;
        if (tuxTextView != null) {
            C339190DRl.LIZIZ(tuxTextView);
        }
        this.LIZLLL = (TuxTextView) viewGroup.findViewById(R.id.p0w);
        this.LJ = (TuxTextView) viewGroup.findViewById(R.id.p0x);
        C786410Ut5.I7(new ACListenerS155S0100000_21(this, 272), viewGroup.findViewById(R.id.biz));
        TuxTextView tuxTextView2 = this.LIZLLL;
        if (tuxTextView2 != null) {
            C786410Ut5.h9(tuxTextView2, new ACListenerS155S0100000_21(this, 273));
        }
        TuxTextView tuxTextView3 = this.LJFF;
        if (tuxTextView3 != null) {
            C786410Ut5.h9(tuxTextView3, new ACListenerS155S0100000_21(this, 274));
        }
        ViewGroup viewGroup2 = this.LIZJ;
        if (viewGroup2 != null) {
            C786410Ut5.K7(viewGroup2, null);
        }
    }

    public final void LIZIZ(IMContact iMContact, SharePanelViewModel sharePanelViewModel, C2252331DDr c2252331DDr, C0ZE7 c0ze7) {
        this.LJII = iMContact;
        this.LIZIZ = sharePanelViewModel;
        this.LJIIIIZZ = c2252331DDr;
        this.LJIIIZ = c0ze7;
        LIZLLL().LIZLLL = iMContact;
        if (iMContact.isShareSuccess()) {
            LIZ(iMContact, false);
            return;
        }
        if (!Intrinsics.LJFF(LIZLLL().LIZLLL, iMContact)) {
            return;
        }
        View view = this.LJI;
        if (view != null) {
            C339190DRl.LIZIZ(view);
        }
        TuxTextView tuxTextView = this.LJFF;
        if (tuxTextView != null) {
            C339190DRl.LIZIZ(tuxTextView);
        }
        TuxTextView tuxTextView2 = this.LIZLLL;
        if (tuxTextView2 == null) {
            return;
        }
        C339190DRl.LIZLLL(tuxTextView2);
    }
}
