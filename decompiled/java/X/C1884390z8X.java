package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.android.livesdk.comp.impl.game.partnership.GamePartnershipService;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.commonhost.CommonMixPageActivity;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.gamedetail.GameDetailPageActivity;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0z8X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1884390z8X implements InterfaceC1190804lG {
    public final IGamePartnershipService LIZ;

    public C1884390z8X(GamePartnershipService gamePartnershipService) {
        this.LIZ = gamePartnershipService;
    }

    public static final void LIZIZ(Context context, String str, Map<String, String> map) {
        Object c098200Yq;
        String strLJ;
        try {
            Intent intent = new Intent(context, (Class<?>) CommonMixPageActivity.class);
            intent.putExtra("schema", str);
            if (map == null || (strLJ = C476770Imp.LJ(map)) == null) {
                strLJ = "";
            }
            intent.putExtra("extra", strLJ);
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
            C1701330uNH.LIZ(intent, context);
            C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CV0TNJrjFT+VHxysnisE6FE3ojqb8wEvf58g57QuuBqP81H23v1GX5oDDoKeHrsMM1JM2PL", null));
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C20441214yg.LJFF("GamePartnershipSchemaRouter", "openCommonMixPage error", thM5exceptionOrNullimpl);
        }
    }

    @Override // X.InterfaceC1190804lG
    public final void LIZ(Context context, String str, Map<String, String> map) throws Throwable {
        LIZJ(context, str, map, null);
    }

    public final void LIZJ(Context context, String str, Map<String, String> map, Function1<? super C1881590z41, Unit> function1) throws Throwable {
        HashMap map2;
        Integer numLJIIJJI;
        int iIntValue;
        ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).ensureGameDetailDesign();
        C1119850fFP c1119850fFP = C011Z.LIZ;
        C783420UoG c783420UoG = C783420UoG.LIZJ;
        c1119850fFP.getClass();
        C1119850fFP.LJJIFFI(R.raw.icon_chevron_right_slim_thin_ltr, c783420UoG);
        Uri uri = UriProtector.parse(str);
        if (!u.LJIJI(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "business"), "leaderboard", true) && !a0.LJJIIZI(str, "from_out", false)) {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, Scene.SCENE_SERVICE);
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && (numLJIIJJI = C2095008Iq.LJIIJJI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) != null && (iIntValue = numLJIIJJI.intValue()) >= 0) {
                FragmentManager fragmentManagerLJIL = C520010KaN.LJIL(context, false);
                if (fragmentManagerLJIL == null) {
                    return;
                }
                if (this.LIZ.Je0() != null) {
                    C843920X8s.LIZIZ(context);
                }
                C1881760z4I c1881760z4I = new C1881760z4I(iIntValue, context, a0.LJLJJI(a0.LJLJJI(a0.LJLILLLLZI(str).toString(), '\n'), '\r'), map);
                C1878910yzh.LIZIZ.LIZ(str, map);
                C1881590z41 c1881590z41 = new C1881590z41(context, c1881760z4I);
                if (function1 != null) {
                    function1.invoke(c1881590z41);
                }
                c1881590z41.LJIJJ(fragmentManagerLJIL);
                return;
            }
            C20441214yg.LIZIZ("GamePartnershipSchemaRouter", "scene error");
            return;
        }
        Intent intent = new Intent(context, (Class<?>) GameDetailPageActivity.class);
        intent.putExtra("schema", str);
        if (map != null) {
            map2 = new HashMap(map);
        } else {
            map2 = null;
        }
        intent.putExtra("extra", map2);
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CV0TNJrjFT+VHxysnisE6FE3ojqb8wEvf58g57QuuBqP81H23v1GX5oDDoKeHrsMM1JM2PL", null));
    }
}
