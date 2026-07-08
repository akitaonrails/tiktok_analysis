package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.ies.ugc.aweme.rich.model.GMTBaseModel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import yf9.d;

/* JADX INFO: renamed from: X.0coy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1026580coy<OPEN_APP_PAYLOAD extends d> extends AbstractC1026640cp4<AbstractC1026890cpT> {
    public final AbstractC1026890cpT LJIILL;
    public AbstractC1026860cpQ LJIILLIIL = C1026950cpZ.LIZ;

    public abstract boolean LJIJJLI();

    @Override // X.InterfaceC1026720cpC
    public boolean LJ() {
        Uri uri;
        String scheme;
        String url = getUrl();
        if (url == null || url.length() <= 0 || (uri = UriProtector.parse(url)) == null || (scheme = uri.getScheme()) == null || LJIILIIL().LJIIL(scheme) || Intrinsics.LJFF(scheme, "aweme")) {
            return false;
        }
        String url2 = getUrl();
        if (url2 != null) {
            boolean z = !C13LP.LJLLLLLL(C815510Vyv.LIZ(LJIIJ(), UriProtector.parse(url2)), C13LP.LLIIJI(C815510Vyv.LIZ(LJIIJ(), UriProtector.parse("http://")))).isEmpty();
            boolean z2 = C13LQ.LJJIJIIJI(UriProtector.parse(url2).getScheme(), new String[]{"http", "https", "android-app"}) >= 0;
            ICRouterAdapterDelegate iCRouterAdapterDelegateLJIILIIL = LJIILIIL();
            String strLJIIZILJ = LJIIZILJ();
            String str = LJII().LIZLLL;
            GMTBaseModel gMTBaseModelLJIIJJI = LJIIJJI();
            Pair[] pairArr = new Pair[5];
            pairArr[0] = new Pair("app_url", url2);
            pairArr[1] = new Pair("click_from", Integer.valueOf(LJIIIIZZ()));
            pairArr[2] = new Pair("is_from_jsb", LJII().LJIIJ ? "1" : CardStruct.IStatusCode.DEFAULT);
            pairArr[3] = new Pair("is_app_installed", z ? "1" : CardStruct.IStatusCode.DEFAULT);
            pairArr[4] = new Pair("is_universal_link", z2 ? "1" : CardStruct.IStatusCode.DEFAULT);
            iCRouterAdapterDelegateLJIILIIL.LJIILLIIL(strLJIIZILJ, "deeplink_app_invoked", str, gMTBaseModelLJIIJJI, C2097608Jq.LJIIJ(pairArr));
        }
        if (LJIJJ() instanceof C1026960cpa) {
            LJIILIIL().LJIILLIIL(LJIIZILJ(), "direct_open_app_failed", "", LJIIJJI(), C2097608Jq.LJIIJ(new Pair("app_url", getUrl())));
        }
        AbstractC1026860cpQ abstractC1026860cpQLJIJJ = LJIJJ();
        return Intrinsics.LJFF(abstractC1026860cpQLJIJJ, C1026940cpY.LIZ) || Intrinsics.LJFF(abstractC1026860cpQLJIJJ, C1026930cpX.LIZ);
    }

    public final AbstractC1026860cpQ LJIJJ() {
        String url = getUrl();
        if (url == null || a0.LJJJIL(url)) {
            return C1026960cpa.LIZ;
        }
        if (Intrinsics.LJFF(this.LJIILLIIL, C1026950cpZ.LIZ)) {
            Uri uri = UriProtector.parse(getUrl());
            Context contextLJIIJ = LJIIJ();
            List listLIZ = C815510Vyv.LIZ(contextLJIIJ, UriProtector.parse("http://"));
            List listLIZ2 = C815510Vyv.LIZ(contextLJIIJ, uri);
            this.LJIILLIIL = listLIZ2.isEmpty() ? C1026960cpa.LIZ : (C13LP.LJLLLLLL(listLIZ2, C13LP.LLIIJI(listLIZ)).isEmpty() && (listLIZ.isEmpty() ^ true)) ? C1026930cpX.LIZ : C1026940cpY.LIZ;
        }
        return this.LJIILLIIL;
    }

    public AbstractC1026580coy(AbstractC1026890cpT abstractC1026890cpT) {
        this.LJIILL = abstractC1026890cpT;
    }

    @Override // X.InterfaceC1026720cpC
    public final Object LIZLLL(C1026650cp5 c1026650cp5) {
        String url = getUrl();
        Intent intent = new Intent("android.intent.action.VIEW", UriProtector.parse(url));
        if (LJIJJLI()) {
            intent.putExtra("open_url", url);
        }
        LJIILIIL().LJIILL(intent, EnumC1025640cnS.OPEN_APP);
        C1026670cp7 c1026670cp7LJIJI = LJIJI(intent);
        if (Intrinsics.LJFF(c1026670cp7LJIJI, C1026670cp7.LIZLLL)) {
            LJIILIIL().LJJIIJZLJL(LJIIIIZZ(), LJIIIZ().LIZLLL);
        }
        this.LJIILL.LIZJ().getClass();
        ICRouterAdapterDelegate iCRouterAdapterDelegateLJIILIIL = LJIILIIL();
        String strLJIIZILJ = LJIIZILJ();
        GMTBaseModel gMTBaseModelLJIIJJI = LJIIJJI();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.LJIILL.LIZJ().getClass();
        linkedHashMap.put("app_url", getUrl());
        iCRouterAdapterDelegateLJIILIIL.LJIILLIIL(strLJIIZILJ, "open_url_app", "", gMTBaseModelLJIIJJI, linkedHashMap);
        LJIILJJIL().LJII(LJIIIZ().LIZLLL, Integer.valueOf(LJIIIIZZ()), getUrl(), LJIIJ());
        LJIL(Mp4ScreenVideoLoadTimeout.CONTROL, "deeplink_success_failed", new AwS560S0100000_16(this, (AbstractC1026580coy<AbstractC1026890cpT>) 737));
        LJIL(((long) this.LJIILL.LIZJ().LIZJ) * 1000, "deeplink_opened", new AwS560S0100000_16(this, (AbstractC1026580coy<AbstractC1026890cpT>) 738));
        return c1026670cp7LJIJI;
    }

    public static final void LJIL(long j, String str, Function0<Unit> function0) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ.plus(C23118094a.LIZ())), null, null, new C01MM(str, j, function0, null), 3);
    }
}
