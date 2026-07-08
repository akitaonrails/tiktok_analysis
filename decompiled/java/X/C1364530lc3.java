package X;

import Y.ACListenerS155S0100000_21;
import Y.ARunnableS121S0100000_21;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.commercialize.log.FeedRawAdLogUtilsImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.message.content.TextContentKt;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0lc3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1364530lc3 implements InterfaceC1362900lZQ {
    public final C1364540lc4 LIZ;
    public InterfaceC1364550lc5 LIZIZ;
    public final boolean LIZJ;

    @Override // X.InterfaceC1362900lZQ
    public final void LJIIIZ() {
        InterfaceC1364550lc5 interfaceC1364550lc5 = this.LIZIZ;
        if (interfaceC1364550lc5 == null) {
            interfaceC1364550lc5 = null;
        }
        List<IMContact> listLIZLLL = interfaceC1364550lc5.LIZLLL();
        LJIILL(listLIZLLL == null || listLIZLLL.isEmpty());
    }

    @Override // X.InterfaceC1362600lYw
    public final void LJIILIIL() {
        C786410Ut5.LIZIZ(this.LIZ.LIZIZ);
    }

    public C1364530lc3(C1364540lc4 c1364540lc4) {
        boolean z;
        View viewFindViewById;
        this.LIZ = c1364540lc4;
        if (!c1364540lc4.LJFF.extras.getBoolean("comment_direct_share") && !c1364540lc4.LJFF.extras.getBoolean("show_edit_send_direct_im_share")) {
            z = false;
        } else {
            z = true;
        }
        this.LIZJ = z;
        View viewFindViewById2 = c1364540lc4.LIZIZ.findViewById(R.id.yg_);
        if (viewFindViewById2 != null) {
            C786410Ut5.I7(new ACListenerS155S0100000_21(this, 0), viewFindViewById2);
        }
        HandlerHook.viewPost(c1364540lc4.LIZJ, new ARunnableS121S0100000_21(this, 2));
        Dialog dialog = c1364540lc4.LIZIZ;
        if (dialog != null && (dialog instanceof DialogC1389100mFg) && (viewFindViewById = ((C19GU) dialog).findViewById(R.id.fpl)) != null) {
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(viewFindViewById);
            bottomSheetBehaviorFrom.setPeekHeight(viewFindViewById.getHeight());
            bottomSheetBehaviorFrom.setSkipCollapsed(true);
        }
        if (z) {
            C786410Ut5.LJLLLLLL(8, c1364540lc4.LJ);
        }
    }

    public static final Aweme LJIILJJIL(SharePackage sharePackage) {
        Bundle bundle = sharePackage.extras;
        String str = "";
        String string = bundle.getString("aid", "");
        if (string != null) {
            str = string;
        }
        return ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).Er(str);
    }

    @Override // X.InterfaceC1362600lYw
    public final void LIZ(SharePackage sharePackage) {
        InterfaceC1364520lc2 interfaceC1364520lc2 = this.LIZ.LJI;
        if (interfaceC1364520lc2 != null) {
            interfaceC1364520lc2.LJIILIIL(sharePackage);
        }
    }

    @Override // X.InterfaceC1362600lYw
    public final void LIZIZ(HashMap<String, String> map) {
        InterfaceC1364520lc2 interfaceC1364520lc2 = this.LIZ.LJI;
        if (interfaceC1364520lc2 != null) {
            interfaceC1364520lc2.LIZIZ(map);
        }
    }

    @Override // X.InterfaceC1362600lYw
    public final void LIZLLL(HashMap<String, String> map) {
        InterfaceC1364520lc2 interfaceC1364520lc2 = this.LIZ.LJI;
        if (interfaceC1364520lc2 != null) {
            interfaceC1364520lc2.LIZLLL(map);
        }
    }

    @Override // X.InterfaceC1362600lYw
    public final void LJ(HashMap<String, String> map) {
        InterfaceC1364520lc2 interfaceC1364520lc2 = this.LIZ.LJI;
        if (interfaceC1364520lc2 != null) {
            interfaceC1364520lc2.LJ(map);
        }
    }

    @Override // X.InterfaceC1362600lYw
    public final void LJFF(SharePackage sharePackage) {
        InterfaceC1364520lc2 interfaceC1364520lc2 = this.LIZ.LJI;
        if (interfaceC1364520lc2 != null) {
            interfaceC1364520lc2.LJIIL(sharePackage);
        }
    }

    @Override // X.InterfaceC1362600lYw
    public final void LJI(SharePackage sharePackage) {
        InterfaceC1364520lc2 interfaceC1364520lc2 = this.LIZ.LJI;
        if (interfaceC1364520lc2 != null) {
            interfaceC1364520lc2.LJII(sharePackage);
        }
    }

    @Override // X.InterfaceC1362600lYw
    public final boolean LJIIIIZZ(SharePackage sharePackage) {
        C1389890mGx c1389890mGx;
        Aweme awemeLJIILJJIL = LJIILJJIL(sharePackage);
        if (awemeLJIILJJIL != null && C1017070cZd.LJJLIL(awemeLJIILJJIL)) {
            Context context = this.LIZ.LIZ;
            if (context instanceof Activity) {
                c1389890mGx = new C1389890mGx((Activity) context);
            } else {
                c1389890mGx = new C1389890mGx(this.LIZ.LIZJ);
            }
            c1389890mGx.LJIIIZ(2131824739);
            c1389890mGx.LJIIJJI();
            return false;
        }
        InterfaceC1364520lc2 interfaceC1364520lc2 = this.LIZ.LJI;
        if (interfaceC1364520lc2 != null) {
            interfaceC1364520lc2.LJIIJ();
        }
        return true;
    }

    @Override // X.InterfaceC1362600lYw
    public final void LJIIJJI(SharePackage sharePackage) {
        InterfaceC1364520lc2 interfaceC1364520lc2 = this.LIZ.LJI;
        if (interfaceC1364520lc2 != null) {
            interfaceC1364520lc2.LJIIIZ();
        }
    }

    @Override // X.InterfaceC1362600lYw
    public final void LJIIL(SharePackage sharePackage) {
        boolean z;
        String string;
        C1389890mGx c1389890mGx;
        if (Intrinsics.LJFF(sharePackage.itemType, "live") || Intrinsics.LJFF(sharePackage.itemType, "multi_live")) {
            String string2 = sharePackage.extras.getString("live_referral_key");
            if (string2 != null && !a0.LJJJIL(string2)) {
                z = false;
            } else {
                z = true;
            }
            if (!(!z) || (string = TextContentKt.getTextByStarlingKey("live_referral_share_successfully_toast", this.LIZ.LIZ)) == null) {
                string = this.LIZ.LIZ.getString(R.string.kgw);
            }
            Context context = this.LIZ.LIZ;
            if (context instanceof Activity) {
                c1389890mGx = new C1389890mGx((Activity) context);
            } else {
                c1389890mGx = new C1389890mGx(this.LIZ.LIZJ);
            }
            c1389890mGx.LJIIJ(string);
            c1389890mGx.LJIIJJI();
        }
        C786410Ut5.LIZIZ(this.LIZ.LIZIZ);
        Bundle bundle = sharePackage.extras;
        if (Intrinsics.LJFF(bundle.getString("is_star"), "1")) {
            C0OC0 c0oc0 = C0OC0.LIZ;
            String string3 = bundle.getString("author_id", "");
            String string4 = bundle.getString("sec_author_id", "");
            c0oc0.getClass();
            C0OC0.LIZ(3, string3, string4, null);
        }
        InterfaceC1364520lc2 interfaceC1364520lc2 = this.LIZ.LJI;
        if (interfaceC1364520lc2 != null) {
            interfaceC1364520lc2.LJIIIIZZ(sharePackage);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0026, code lost:
    
        if (r1.getVisibility() == 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0028, code lost:
    
        r0 = r4.LIZ.LIZIZ.getWindow();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:
    
        if (r0 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        r0 = r0.getDecorView();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0036, code lost:
    
        if (r0 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        if (r0.getWidth() != android.content.res.Resources.getSystem().getDisplayMetrics().widthPixels) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        r4.LIZ.LIZIZ.setCancelable(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
    
        if (r5 == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
    
        r0 = r4.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0055, code lost:
    
        if (r0 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0058, code lost:
    
        r0.LIZIZ();
        r0 = r4.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        if (r0 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0060, code lost:
    
        r0 = r0.LJ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0064, code lost:
    
        if (r0 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0066, code lost:
    
        X.C786410Ut5.LJLLLLLL(8, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0069, code lost:
    
        X.C786410Ut5.LJLLLLLL(0, r4.LIZ.LJ);
        X.C786410Ut5.LJLZ(0, r4.LIZ.LIZJ);
        X.C786410Ut5.LJLZ(0, r4.LIZ.LIZLLL);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007e, code lost:
    
        r0 = r4.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0080, code lost:
    
        if (r0 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0082, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0083, code lost:
    
        r0.LIZ(r5);
        r0 = r4.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0088, code lost:
    
        if (r0 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008a, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008b, code lost:
    
        r0.LJFF();
        r0 = r4.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0090, code lost:
    
        if (r0 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0092, code lost:
    
        r3 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0093, code lost:
    
        r3.LIZJ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0096, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0097, code lost:
    
        r0 = r4.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0099, code lost:
    
        if (r0 != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x009b, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x009c, code lost:
    
        r0 = r0.LJ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a0, code lost:
    
        if (r0 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a2, code lost:
    
        X.C786410Ut5.LJLLLLLL(0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a5, code lost:
    
        X.C786410Ut5.LJLZ(8, r4.LIZ.LIZLLL);
        X.C786410Ut5.LJLZ(8, r4.LIZ.LIZJ);
        X.C786410Ut5.LJLLLLLL(8, r4.LIZ.LJ);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
    
        if (r1.getVisibility() != 0) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILL(boolean r5) {
        /*
            r4 = this;
            X.0lc5 r0 = r4.LIZIZ
            r3 = 0
            if (r0 != 0) goto L6
            r0 = r3
        L6:
            android.view.View r1 = r0.LJ()
            boolean r0 = r4.LIZJ
            r2 = 0
            if (r0 != 0) goto L20
            if (r5 == 0) goto L22
            int r0 = r1.getVisibility()
            if (r0 == 0) goto L28
        L17:
            X.0lc5 r0 = r4.LIZIZ
            if (r0 == 0) goto L1c
            r3 = r0
        L1c:
            r3.LIZJ()
            return
        L20:
            if (r5 != 0) goto L17
        L22:
            int r0 = r1.getVisibility()
            if (r0 == 0) goto L17
        L28:
            X.0lc4 r0 = r4.LIZ
            android.app.Dialog r0 = r0.LIZIZ
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L4f
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L4f
            int r1 = r0.getWidth()
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.widthPixels
            if (r1 != r0) goto L4f
            X.0lc4 r0 = r4.LIZ
            android.app.Dialog r0 = r0.LIZIZ
            r0.setCancelable(r5)
        L4f:
            r1 = 8
            if (r5 == 0) goto L97
            X.0lc5 r0 = r4.LIZIZ
            if (r0 != 0) goto L58
            r0 = r3
        L58:
            r0.LIZIZ()
            X.0lc5 r0 = r4.LIZIZ
            if (r0 != 0) goto L60
            r0 = r3
        L60:
            android.view.View r0 = r0.LJ()
            if (r0 == 0) goto L69
            X.C786410Ut5.LJLLLLLL(r1, r0)
        L69:
            X.0lc4 r0 = r4.LIZ
            android.view.View r0 = r0.LJ
            X.C786410Ut5.LJLLLLLL(r2, r0)
            X.0lc4 r0 = r4.LIZ
            android.view.ViewGroup r0 = r0.LIZJ
            X.C786410Ut5.LJLZ(r2, r0)
            X.0lc4 r0 = r4.LIZ
            android.view.ViewGroup r0 = r0.LIZLLL
            X.C786410Ut5.LJLZ(r2, r0)
        L7e:
            X.0lc5 r0 = r4.LIZIZ
            if (r0 != 0) goto L83
            r0 = r3
        L83:
            r0.LIZ(r5)
            X.0lc5 r0 = r4.LIZIZ
            if (r0 != 0) goto L8b
            r0 = r3
        L8b:
            r0.LJFF()
            X.0lc5 r0 = r4.LIZIZ
            if (r0 == 0) goto L93
            r3 = r0
        L93:
            r3.LIZJ()
            return
        L97:
            X.0lc5 r0 = r4.LIZIZ
            if (r0 != 0) goto L9c
            r0 = r3
        L9c:
            android.view.View r0 = r0.LJ()
            if (r0 == 0) goto La5
            X.C786410Ut5.LJLLLLLL(r2, r0)
        La5:
            X.0lc4 r0 = r4.LIZ
            android.view.ViewGroup r0 = r0.LIZLLL
            X.C786410Ut5.LJLZ(r1, r0)
            X.0lc4 r0 = r4.LIZ
            android.view.ViewGroup r0 = r0.LIZJ
            X.C786410Ut5.LJLZ(r1, r0)
            X.0lc4 r0 = r4.LIZ
            android.view.View r0 = r0.LJ
            X.C786410Ut5.LJLLLLLL(r1, r0)
            goto L7e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1364530lc3.LJIILL(boolean):void");
    }

    @Override // X.InterfaceC1362600lYw
    public final void LIZJ(Dialog dialog, SharePackage sharePackage) {
        InterfaceC1364520lc2 interfaceC1364520lc2 = this.LIZ.LJI;
        if (interfaceC1364520lc2 != null) {
            interfaceC1364520lc2.LJFF(dialog);
        }
    }

    @Override // X.InterfaceC1362600lYw
    public final void LJII(Dialog dialog, SharePackage sharePackage) {
        InterfaceC1364520lc2 interfaceC1364520lc2 = this.LIZ.LJI;
        if (interfaceC1364520lc2 != null) {
            interfaceC1364520lc2.LJI(dialog);
        }
    }

    @Override // X.InterfaceC1362600lYw
    public final void LJIIJ(SharePackage sharePackage, String str) {
        InterfaceC20673515v3 interfaceC20673515v3K4;
        Aweme awemeLJIILJJIL = LJIILJJIL(sharePackage);
        if ((awemeLJIILJJIL != null && AwemeExtKt.isAdTraffic(awemeLJIILJJIL)) || C1017070cZd.LLILII(awemeLJIILJJIL)) {
            AwemeRawAd awemeRawAd = null;
            if (sharePackage.extras.getBoolean("is_share_live", false)) {
                ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
                if (iLiveOuterService != null && (interfaceC20673515v3K4 = iLiveOuterService.k4()) != null && interfaceC20673515v3K4.LJLIL() != null) {
                    C0IXW.LIZ("live_ad", "live_share", null, null);
                }
            } else {
                FeedRawAdLogUtilsImpl.LIZIZ().LIZ(this.LIZ.LIZ, awemeLJIILJJIL);
                if (awemeLJIILJJIL != null) {
                    awemeRawAd = awemeLJIILJJIL.getAwemeRawAd();
                }
                C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "share", awemeRawAd);
                c1022820ciuLIZLLL.LIZIZ(C1019100ccu.LIZLLL(awemeLJIILJJIL), "anchor_id");
                c1022820ciuLIZLLL.LIZIZ(C1019100ccu.LJ(awemeLJIILJJIL), "room_id");
                c1022820ciuLIZLLL.LJIIIIZZ();
            }
        }
        InterfaceC1364520lc2 interfaceC1364520lc2 = this.LIZ.LJI;
        if (interfaceC1364520lc2 != null) {
            interfaceC1364520lc2.LJIIJJI(sharePackage, str);
        }
        if (Intrinsics.LJFF(str, "chat_merge")) {
            C786410Ut5.LIZIZ(this.LIZ.LIZIZ);
        }
    }
}
