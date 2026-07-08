package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: X.0cw9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1031030cw9 {
    public static final C1031030cw9 LIZ = new C1031030cw9();

    public static boolean LIZ(Aweme aweme, List list) {
        AwemeRawAd awemeRawAd;
        C2184171Adz.LIZLLL("draw_ad", "receive", aweme.getAwemeRawAd()).LJII();
        List<Aweme> listLJIILJJIL = C1697810uHb.LJIILJJIL(aweme);
        if (list != null && !list.isEmpty() && C729980SkG.LJFF(aweme, list) >= 0) {
            LIZIZ(aweme, (Aweme) ListProtector.get(list, C729980SkG.LJIIJ(aweme, list)));
            if (aweme.isAd() && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.isEnableFilterSameVideo()) {
                ListProtector.remove(listLJIILJJIL, 0);
            }
        }
        C1029590ctp.LJ().LIZLLL().LIZJ(listLJIILJJIL);
        C1022030chd.LJ(listLJIILJJIL, new InterfaceC1022050chf<Object>() { // from class: X.0PIY
            @Override // X.InterfaceC1022050chf
            public final void invoke(Object... objArr) {
                AwemeRawAd awemeRawAd2;
                try {
                    Object obj = objArr[0];
                    String str = null;
                    if (obj instanceof AwemeRawAd) {
                        awemeRawAd2 = (AwemeRawAd) obj;
                    } else {
                        awemeRawAd2 = null;
                    }
                    Object obj2 = objArr[1];
                    if (obj2 instanceof String) {
                        str = (String) obj2;
                    }
                    if (awemeRawAd2 != null && str != null) {
                        InterfaceC1035050d2d interfaceC1035050d2dLIZLLL = C1029590ctp.LIZLLL();
                        C844470XAv.LIZ.getClass();
                        interfaceC1035050d2dLIZLLL.LJIIIZ(C844470XAv.LIZ(), awemeRawAd2, str);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        });
        if (!listLJIILJJIL.isEmpty()) {
            ListIterator<Aweme> listIterator = listLJIILJJIL.listIterator();
            InterfaceC582800MtS interfaceC582800MtSLJI = C1029590ctp.LJI();
            while (listIterator.hasNext()) {
                Aweme next = listIterator.next();
                interfaceC582800MtSLJI.getClass();
                if (C1045220dJ2.LJIIIZ(next) || C1045220dJ2.LJIIIIZZ(next)) {
                    if (C1019620cdk.LIZIZ(3, next)) {
                        C1045220dJ2.LJIIJ(next, null, null, true);
                        if (C1019620cdk.LIZ(next, false)) {
                            listIterator.remove();
                        }
                    } else {
                        C1045220dJ2.LJIIJ(next, C15O7.LJI, null, false);
                    }
                }
            }
        }
        if (listLJIILJJIL.isEmpty()) {
            return false;
        }
        ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILLL(aweme);
        return true;
    }

    public static void LIZIZ(Aweme aweme, Aweme aweme2) {
        AwemeRawAd awemeRawAd;
        String str;
        int i;
        String creativeIdStr;
        if (aweme2 != null && TextUtils.equals(aweme.getAid(), aweme2.getAid())) {
            String creativeIdStr2 = null;
            int i2 = 2;
            if (aweme.isAd()) {
                C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "item_repeat", aweme.getAwemeRawAd());
                if (aweme2.isAd()) {
                    i = 1;
                } else {
                    i = 2;
                }
                c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(i), "filter_reason");
                if (!aweme2.isAd()) {
                    creativeIdStr = "";
                } else {
                    AwemeRawAd awemeRawAd2 = aweme2.getAwemeRawAd();
                    if (awemeRawAd2 != null) {
                        creativeIdStr = awemeRawAd2.getCreativeIdStr();
                    } else {
                        creativeIdStr = null;
                    }
                }
                c1022820ciuLIZLLL.LIZIZ(creativeIdStr, "repeat_cid");
                c1022820ciuLIZLLL.LIZIZ(1, "repeat_type");
                c1022820ciuLIZLLL.LJII();
            }
            if (aweme.isAd() && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.isEnableFilterSameVideo()) {
                if (C1017070cZd.LLL(aweme)) {
                    C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL("draw_ad", "show_failed", aweme.getAwemeRawAd());
                    c1022820ciuLIZLLL2.LIZIZ("8", "ad_show_fail_type");
                    if (!aweme2.isAd()) {
                        creativeIdStr2 = "";
                    } else {
                        AwemeRawAd awemeRawAd3 = aweme2.getAwemeRawAd();
                        if (awemeRawAd3 != null) {
                            creativeIdStr2 = awemeRawAd3.getCreativeIdStr();
                        }
                    }
                    c1022820ciuLIZLLL2.LIZIZ(creativeIdStr2, "repeat_cid");
                    if (C1030680cva.LJ) {
                        str = "1";
                    } else {
                        str = "2";
                    }
                    c1022820ciuLIZLLL2.LIZIZ(str, "awemelaunch");
                    c1022820ciuLIZLLL2.LJII();
                }
                C2344009Gk c2344009Gk = new C2344009Gk();
                if (aweme2.isAd()) {
                    i2 = 1;
                }
                c2344009Gk.LIZJ(i2, "failed_reason");
                c2344009Gk.LJIIIIZZ("group_id", aweme2.getAid());
                C20684815ws.LJIILLIIL("vv_failed", c2344009Gk.LIZ);
            }
        }
    }
}
