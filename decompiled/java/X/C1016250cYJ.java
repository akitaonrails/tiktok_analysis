package X;

import android.content.Context;
import android.view.View;
import com.bytedance.ies.ugc.aweme.rich.model.GMTBaseModel;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.rich.reward.GmtRewardAdModel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0cYJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1016250cYJ {
    public final View LIZ;
    public final Function0<Map<String, Object>> LIZIZ;

    public final void LIZ(boolean z) {
        String str;
        if (z) {
            str = "#99000000";
        } else {
            str = "#99333333";
        }
        View view = this.LIZ;
        if (view != null) {
            TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.tis);
            if (tuxIconView != null) {
                LIZJ(R.raw.icon_flag, tuxIconView, str);
            }
            TuxIconView tuxIconView2 = (TuxIconView) view.findViewById(R.id.tie);
            if (tuxIconView2 != null) {
                LIZJ(R.raw.icon_x_mark, tuxIconView2, str);
            }
            View viewFindViewById = view.findViewById(R.id.tj0);
            if (viewFindViewById != null) {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZ = Integer.valueOf(C190900oN.LIZ(str));
                c384050F3z.LIZJ = Float.valueOf(Float.MAX_VALUE);
                viewFindViewById.setBackground(c384050F3z.LIZ(viewFindViewById.getContext()));
            }
        }
    }

    public final void LIZLLL(boolean z) {
        TuxIconView tuxIconView;
        int i;
        View view = this.LIZ;
        if (view != null && (tuxIconView = (TuxIconView) view.findViewById(R.id.tie)) != null) {
            if (z) {
                i = 0;
            } else {
                i = 4;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView, i);
        }
    }

    public final void LJ(InterfaceC1032120cxu interfaceC1032120cxu) {
        View view;
        TuxIconView tuxIconView;
        C1031810cxP adConfig;
        if ((interfaceC1032120cxu == null || (adConfig = interfaceC1032120cxu.getAdConfig()) == null || !adConfig.LJFF) && (view = this.LIZ) != null && (tuxIconView = (TuxIconView) view.findViewById(R.id.tis)) != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 0);
        }
    }

    public C1016250cYJ(View view, AwS560S0100000_16 awS560S0100000_16) {
        this.LIZ = view;
        this.LIZIZ = awS560S0100000_16;
    }

    public static void LIZJ(int i, TuxIconView tuxIconView, String str) {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ.LIZ = i;
        c419910GdJ.LIZLLL = -1;
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(tuxIconView.getContext());
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZ = Integer.valueOf(C190900oN.LIZ(str));
        c384050F3z.LIZJ = Float.valueOf(Float.MAX_VALUE);
        tuxIconView.setImageDrawable(C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(tuxIconView.getContext())));
    }

    public final void LIZIZ(Context context, String str, InterfaceC1032120cxu interfaceC1032120cxu) {
        Map<String, Object> mapLJ;
        GMTBaseModel gMTBaseModel;
        UrlModel clickTrackUrlList;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("is_lynx", 0);
        linkedHashMap.put("is_anole_cta", "1");
        Function0<Map<String, Object>> function0 = this.LIZIZ;
        if (function0 == null || (mapLJ = function0.invoke()) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.putAll(linkedHashMap);
        linkedHashMap2.putAll(mapLJ);
        interfaceC1032120cxu.handleTap(context, C2097608Jq.LJIIIIZZ(new Pair(EnumC1005430cGr.ENTER_FROM, 70), new Pair(EnumC1005430cGr.REFER, str)), interfaceC1032120cxu.getHostModel());
        HashMap map = new HashMap();
        map.putAll(linkedHashMap2);
        map.putAll(interfaceC1032120cxu.getCustomAdExtraDataParams());
        interfaceC1032120cxu.trackEvent(new C1031480cws("draw_ad", "click", str, map), interfaceC1032120cxu.getHostModel());
        GmtRewardAdModel rewardAdModel = interfaceC1032120cxu.getRewardAdModel();
        if (rewardAdModel != null && (gMTBaseModel = rewardAdModel.awemeRawAd) != null && (clickTrackUrlList = gMTBaseModel.getClickTrackUrlList()) != null) {
            interfaceC1032120cxu.track3rdPartyURL(new C1031380cwi(clickTrackUrlList, "click", 12), interfaceC1032120cxu.getHostModel());
        }
    }
}
