package X;

import Y.AfS8S0401000_18;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.favorites.service.IFavoriteRevisitAppDiffProtocol;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.0gbN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1171910gbN {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final C01GW LJFF;
    public C11JF LJI;
    public final C01GW LJII;

    public final void LIZIZ() {
        C11JF c11jf = this.LJI;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LJI = null;
        if (EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJJI(this);
        }
    }

    public final void LIZJ(C19EG c19eg) {
        int iLIZIZ;
        int iLIZIZ2;
        boolean z;
        View viewFindViewById = c19eg.getWindow().getDecorView().findViewById(R.id.viewpager);
        View decorView = c19eg.getWindow().getDecorView();
        Rect rect = new Rect();
        decorView.getGlobalVisibleRect(rect);
        Rect rect2 = new Rect();
        viewFindViewById.getGlobalVisibleRect(rect2);
        if (Intrinsics.LJFF(this.LIZJ, "graphic_detail")) {
            iLIZIZ = rect.bottom - rect2.bottom;
            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(49));
        } else {
            iLIZIZ = (rect.bottom - rect2.bottom) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60));
            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        }
        int i = iLIZIZ + iLIZIZ2;
        C013C c013c = new C013C();
        C118300cf c118300cf = new C118300cf();
        C1171300gaO c1171300gaO = new C1171340gaS().LLILLL;
        boolean z2 = this.LIZLLL;
        if (this.LIZ != null) {
            z = true;
        } else {
            z = false;
        }
        c1171300gaO.u0(0L, null, true, null, null, true, z2, z).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS8S0401000_18(c013c, c118300cf, this, c19eg, i, 1), new C09JN() { // from class: X.0gbK
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("FeedRevisitPopupToast@d7e3.showAt$2");
                C1C7U.LIZIZ("FeedRevisitPopupToast@d7e3.showAt$2");
            }
        });
    }

    public final SmartRoute LIZ(Context context, int i, String str) {
        if (this.LJ) {
            IFavoriteRevisitAppDiffProtocol.LIZ.getClass();
            C1171950gbR.LIZ().LIZJ();
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://user/profile/");
            smartRouteBuildRoute.withParam("from_scene", String.valueOf(i));
            smartRouteBuildRoute.withParam("favorite_auto_landing_method", str);
            return smartRouteBuildRoute;
        }
        C1171950gbR c1171950gbR = IFavoriteRevisitAppDiffProtocol.LIZ;
        SmartRoute smartRouteBuildRoute2 = SmartRouter.buildRoute(context, "//main");
        smartRouteBuildRoute2.addFlags(536870912);
        smartRouteBuildRoute2.addFlags(67108864);
        smartRouteBuildRoute2.withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "USER");
        smartRouteBuildRoute2.withParam("favorite_auto_landing_method", str);
        smartRouteBuildRoute2.withParam("profile_from_scene", String.valueOf(i));
        smartRouteBuildRoute2.withParam("profile_landing_tab", 8);
        c1171950gbR.getClass();
        C1171950gbR.LIZ().LIZLLL();
        return smartRouteBuildRoute2;
    }

    public /* synthetic */ C1171910gbN(String str, String str2, String str3, boolean z, boolean z2) {
        this(str, str2, str3, null, z, z2);
    }

    public C1171910gbN(String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = z;
        this.LJ = z2;
        this.LJFF = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(137));
        this.LJII = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(136));
    }
}
