package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.commercialize.log.FeedRawAdLogUtilsImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.message.content.TextContentKt;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0lc0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1364500lc0 implements InterfaceC1362900lZQ {
    public final Context LIZ;
    public final InterfaceC1364520lc2 LIZIZ;
    public final InterfaceC1362720lZ8 LIZJ;

    @Override // X.InterfaceC1362900lZQ
    public final void LJIIIZ() {
    }

    @Override // X.InterfaceC1362600lYw
    public final void LJIILIIL() {
        this.LIZJ.F8(new C1366410lf5());
    }

    public static final Aweme LJIILJJIL(SharePackage sharePackage) {
        Bundle bundle = sharePackage.extras;
        String str = "";
        String string = bundle.getString("aid", "");
        if (string != null) {
            str = string;
        }
        return ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILZ(str);
    }

    public static Aweme LJIILL(SharePackage sharePackage) {
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
        InterfaceC1364520lc2 interfaceC1364520lc2 = this.LIZIZ;
        if (interfaceC1364520lc2 != null) {
            interfaceC1364520lc2.LJIILIIL(sharePackage);
        }
    }

    @Override // X.InterfaceC1362600lYw
    public final void LIZIZ(HashMap<String, String> map) {
        InterfaceC1364520lc2 interfaceC1364520lc2 = this.LIZIZ;
        if (interfaceC1364520lc2 != null) {
            interfaceC1364520lc2.LIZIZ(map);
        }
    }

    @Override // X.InterfaceC1362600lYw
    public final void LIZLLL(HashMap<String, String> map) {
        InterfaceC1364520lc2 interfaceC1364520lc2 = this.LIZIZ;
        if (interfaceC1364520lc2 != null) {
            interfaceC1364520lc2.LIZLLL(map);
        }
    }

    @Override // X.InterfaceC1362600lYw
    public final void LJ(HashMap<String, String> map) {
        InterfaceC1364520lc2 interfaceC1364520lc2 = this.LIZIZ;
        if (interfaceC1364520lc2 != null) {
            interfaceC1364520lc2.LJ(map);
        }
    }

    @Override // X.InterfaceC1362600lYw
    public final void LJFF(SharePackage sharePackage) {
        InterfaceC1364520lc2 interfaceC1364520lc2 = this.LIZIZ;
        if (interfaceC1364520lc2 != null) {
            interfaceC1364520lc2.LJIIL(sharePackage);
        }
    }

    @Override // X.InterfaceC1362600lYw
    public final void LJI(SharePackage sharePackage) {
        InterfaceC1364520lc2 interfaceC1364520lc2 = this.LIZIZ;
        if (interfaceC1364520lc2 != null) {
            interfaceC1364520lc2.LJII(sharePackage);
        }
    }

    @Override // X.InterfaceC1362600lYw
    public final boolean LJIIIIZZ(SharePackage sharePackage) {
        Aweme awemeLJIILL = LJIILL(sharePackage);
        if (awemeLJIILL != null && C1017070cZd.LJJLIL(awemeLJIILL)) {
            Activity activityLJFF = C2214201BlK.LJFF();
            if (activityLJFF != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(activityLJFF);
                c1389890mGx.LJIIIZ(2131824739);
                c1389890mGx.LJIIJJI();
            }
            return false;
        }
        InterfaceC1364520lc2 interfaceC1364520lc2 = this.LIZIZ;
        if (interfaceC1364520lc2 != null) {
            interfaceC1364520lc2.LJIIJ();
        }
        return true;
    }

    @Override // X.InterfaceC1362600lYw
    public final void LJIIJJI(SharePackage sharePackage) {
        InterfaceC1364520lc2 interfaceC1364520lc2 = this.LIZIZ;
        if (interfaceC1364520lc2 != null) {
            interfaceC1364520lc2.LJIIIZ();
        }
    }

    @Override // X.InterfaceC1362600lYw
    public final void LJIIL(SharePackage sharePackage) {
        boolean z;
        Activity activityLIZIZ;
        Activity activityLIZ;
        if ((Intrinsics.LJFF(sharePackage.itemType, "live") || Intrinsics.LJFF(sharePackage.itemType, "multi_live")) && !Intrinsics.LJFF(sharePackage.extras.getString("cancel_live_toast", ""), "1")) {
            String string = sharePackage.extras.getString("live_referral_key");
            if (string != null && !a0.LJJJIL(string)) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
                if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
                    C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                    String textByStarlingKey = TextContentKt.getTextByStarlingKey("live_referral_share_successfully_toast", activityLIZ);
                    if (textByStarlingKey == null) {
                        textByStarlingKey = activityLIZ.getString(R.string.kgw);
                    }
                    c1389890mGx.LJIIJ(textByStarlingKey);
                    c1389890mGx.LJIIJJI();
                }
            } else {
                Activity activityLJFF = C2214201BlK.LJFF();
                if (activityLJFF != null) {
                    C1389890mGx c1389890mGx2 = new C1389890mGx(activityLJFF);
                    c1389890mGx2.LJIIIZ(R.string.kgw);
                    c1389890mGx2.LJIIJJI();
                }
            }
        }
        this.LIZJ.F8(new C1366410lf5());
        Bundle bundle = sharePackage.extras;
        if (Intrinsics.LJFF(bundle.getString("is_star"), "1")) {
            C0OC0 c0oc0 = C0OC0.LIZ;
            String string2 = bundle.getString("author_id", "");
            String string3 = bundle.getString("sec_author_id", "");
            c0oc0.getClass();
            C0OC0.LIZ(3, string2, string3, null);
        }
        InterfaceC1364520lc2 interfaceC1364520lc2 = this.LIZIZ;
        if (interfaceC1364520lc2 != null) {
            interfaceC1364520lc2.LJIIIIZZ(sharePackage);
        }
    }

    @Override // X.InterfaceC1362600lYw
    public final void LIZJ(Dialog dialog, SharePackage sharePackage) {
        InterfaceC1364520lc2 interfaceC1364520lc2 = this.LIZIZ;
        if (interfaceC1364520lc2 != null) {
            interfaceC1364520lc2.LJFF(dialog);
        }
    }

    @Override // X.InterfaceC1362600lYw
    public final void LJII(Dialog dialog, SharePackage sharePackage) {
        InterfaceC1364520lc2 interfaceC1364520lc2 = this.LIZIZ;
        if (interfaceC1364520lc2 != null) {
            interfaceC1364520lc2.LJI(dialog);
        }
    }

    @Override // X.InterfaceC1362600lYw
    public final void LJIIJ(SharePackage sharePackage, String str) {
        AwemeRawAd awemeRawAdLJJIJL;
        Aweme awemeLJIILL = LJIILL(sharePackage);
        if (((awemeLJIILL != null || (C1017070cZd.LLILII(LJIILJJIL(sharePackage)) && (awemeLJIILL = LJIILJJIL(sharePackage)) != null)) && AwemeExtKt.isAdTraffic(awemeLJIILL)) || C1017070cZd.LLILII(awemeLJIILL)) {
            FeedRawAdLogUtilsImpl.LIZIZ().LIZ(this.LIZ, awemeLJIILL);
            if (!C1017070cZd.LLILII(awemeLJIILL)) {
                if (awemeLJIILL != null) {
                    awemeRawAdLJJIJL = awemeLJIILL.getAwemeRawAd();
                } else {
                    awemeRawAdLJJIJL = null;
                }
            } else {
                awemeRawAdLJJIJL = C1017070cZd.LJJIJL(awemeLJIILL);
            }
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "share", awemeRawAdLJJIJL);
            c1022820ciuLIZLLL.LIZIZ(C1019100ccu.LIZLLL(awemeLJIILL), "anchor_id");
            c1022820ciuLIZLLL.LIZIZ(C1019100ccu.LJ(awemeLJIILL), "room_id");
            c1022820ciuLIZLLL.LJIIIIZZ();
        }
        InterfaceC1364520lc2 interfaceC1364520lc2 = this.LIZIZ;
        if (interfaceC1364520lc2 != null) {
            interfaceC1364520lc2.LJIIJJI(sharePackage, str);
        }
        if (Intrinsics.LJFF(str, "chat_merge")) {
            if (sharePackage.extras.getBoolean("close_by_repost")) {
                this.LIZJ.F8(new C1366420lf6());
            } else {
                LJIILIIL();
            }
        }
    }

    public C1364500lc0(Context context, InterfaceC1364520lc2 interfaceC1364520lc2, InterfaceC1362720lZ8 interfaceC1362720lZ8) {
        this.LIZ = context;
        this.LIZIZ = interfaceC1364520lc2;
        this.LIZJ = interfaceC1362720lZ8;
    }
}
