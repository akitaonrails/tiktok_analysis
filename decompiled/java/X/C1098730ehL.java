package X;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.banner.IBannerService;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdk.livesetting.banner.LiveNewFrameworkBannerSchemaSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.mainframework.LiveBannerPlaceholderSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveNewBannerFontOptSetting;
import com.bytedance.android.livesdk.model.BannerInRoom;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS631S0100000_17;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0ehL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1098730ehL extends AbstractC1098240egY {
    public final long LLJI;
    public C1098740ehM LLJIJIL;

    @Override // X.AbstractC1098240egY
    public final void LJJIIJ() {
        Context context;
        C19EG c19egLJIJJLI;
        String string;
        Object c098200Yq;
        InterfaceC1105930esx interfaceC1105930esx;
        ViewGroup viewGroup;
        if (this.LLIZLLLIL == null || (context = this.LL) == null || (c19egLJIJJLI = C520010KaN.LJIJJLI(context, true)) == null) {
            return;
        }
        String str = this.LLIZLLLIL;
        String value = LiveNewFrameworkBannerSchemaSetting.INSTANCE.getValue();
        boolean z = value.length() > 0;
        String str2 = CardStruct.IStatusCode.DEFAULT;
        if (z) {
            Uri.Builder builderBuildUpon = UriProtector.parse(value).buildUpon();
            builderBuildUpon.appendQueryParameter("hit_downgrade", ((IBannerService) C1161920gLG.LIZJ(IBannerService.class)).qI1() ? "1" : CardStruct.IStatusCode.DEFAULT);
            if (LiveNewBannerFontOptSetting.enable()) {
                str2 = "1";
            }
            builderBuildUpon.appendQueryParameter("live_banner_font_opt", str2);
            string = builderBuildUpon.build().toString();
        } else {
            C1098170egR c1098170egR = new C1098170egR();
            c1098170egR.LJIIIIZZ(str);
            c1098170egR.LIZIZ.authority("lynxview_card");
            c1098170egR.LJFF(true);
            c1098170egR.LJ(0);
            c1098170egR.LJII("bdhm_bid", "tiktok_live_fundamental_banner_container");
            c1098170egR.LJII("spark_perf_biz", "live_top_right_lynx_banner");
            c1098170egR.LJII("hit_downgrade", ((IBannerService) C1161920gLG.LIZJ(IBannerService.class)).qI1() ? "1" : CardStruct.IStatusCode.DEFAULT);
            c1098170egR.LJII("gecko_url_redirection", "1");
            if (LiveNewBannerFontOptSetting.enable()) {
                str2 = "1";
            }
            c1098170egR.LJII("live_banner_font_opt", str2);
            string = c1098170egR.LIZ().toString();
        }
        C1098010egB c1098010egBLIZIZ = C1097990eg9.LIZIZ();
        c1098010egBLIZIZ.LIZ(string, "container_schema");
        try {
            c098200Yq = C1107580evc.LIZJ(UriProtector.parse(string));
            if (c098200Yq == null) {
                c098200Yq = "";
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        c1098010egBLIZIZ.LIZ(C189200o6.m7isFailureimpl(c098200Yq) ? "" : c098200Yq, "container_url");
        c1098010egBLIZIZ.LIZ(2, "is_new_indicator");
        InterfaceC1541990qEH interfaceC1541990qEHBD0 = ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).bD0(c19egLJIJJLI, string, null, "live_top_right_lynx_banner", true, new AwS631S0100000_17(this, 22));
        InterfaceC1105930esx interfaceC1105930esx2 = interfaceC1541990qEHBD0 instanceof InterfaceC1105930esx ? (InterfaceC1105930esx) interfaceC1541990qEHBD0 : null;
        this.LLJ = interfaceC1105930esx2;
        if ((interfaceC1105930esx2 == null || interfaceC1105930esx2.getOptimization() != 0) && (interfaceC1105930esx = this.LLJ) != null) {
            interfaceC1105930esx.LJIILIIL(interfaceC1105930esx.LJIILJJIL());
        }
        if (LiveBannerPlaceholderSetting.INSTANCE.enable()) {
            View viewE1 = interfaceC1541990qEHBD0 != null ? interfaceC1541990qEHBD0.e1() : null;
            if (!(viewE1 instanceof ViewGroup) || (viewGroup = (ViewGroup) viewE1) == null) {
                return;
            }
            C1098740ehM c1098740ehM = new C1098740ehM(viewGroup, new AwS561S0100000_17(this, 299));
            this.LLJIJIL = c1098740ehM;
            c1098740ehM.LIZLLL.add(viewGroup);
            viewGroup.setOnHierarchyChangeListener(c1098740ehM.LJFF);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x00e0  */
    @Override // X.AbstractC1098240egY, X.AbstractC1098270egb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ() throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1098730ehL.LIZJ():void");
    }

    @Override // X.AbstractC1098270egb
    public final void LJIIJ() throws JSONException {
        LJJIII();
    }

    public C1098730ehL(Context context, String str, List<? extends BannerInRoom> list, boolean z, Room room, long j) {
        super(context, str, list, z, room);
        this.LLJI = j;
    }
}
