package Y;

import X.C0Q7E;
import X.C0Q7J;
import X.C0QPW;
import X.C0QPX;
import X.C0R4M;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13LP;
import X.C14NX;
import X.C1558520qew;
import X.C15O7;
import X.C1C7U;
import X.C2095008Iq;
import X.C2211751BhN;
import X.C641310PDl;
import X.C647500PaW;
import X.C647720Pas;
import X.C653690PkV;
import X.C671040QTu;
import X.C673200Qas;
import X.C674650QdD;
import X.C680370QmR;
import X.C681730Qod;
import X.C786410Ut5;
import X.EnumC674680QdG;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.ecommerce.search.searchbar.asr.EcSearchBarAsrHelper;
import com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel;
import com.ss.android.ugc.aweme.music.model.MusicSearchHistory;
import com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleContainerAbility;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.search.pages.choosemusic.sug.core.ui.SearchMusicSugFragment;
import com.ss.android.ugc.aweme.search.pages.choosemusic.sug.core.viewmodel.MusicSugViewModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class ARunnableS15S1100000_10 implements Runnable {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                run$10(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("parse_cost", ((C0Q7J) this.l1).LJ);
            jSONObject.put("view_draw_cost", ((C0Q7J) this.l1).LIZLLL);
            jSONObject.put("netLogId", ((C0Q7J) this.l1).LIZ);
            jSONObject.put("cost", ((C0Q7J) this.l1).LJFF);
            jSONObject.put("type", ((C0Q7J) this.l1).LJI);
            ((C0Q7J) this.l1).getClass();
            jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, 0);
            ((C0Q7J) this.l1).getClass();
            jSONObject.put("pull_count", 0);
            ((C0Q7J) this.l1).getClass();
            jSONObject.put("pull_cost", 0L);
            ((C0Q7J) this.l1).getClass();
            jSONObject.put("hit_cache", 0);
            AppLogNewUtils.onEventV3("search_bot_monitor", jSONObject);
            C0Q7E.LIZ.remove(this.s0);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LIZ$1() {
        MusicSugViewModel musicSugViewModel = ((SearchMusicSugFragment) this.l1).LLILZ;
        if (musicSugViewModel != null) {
            String str = this.s0;
            musicSugViewModel.LLILLJJLI.LIZ = C681730Qod.LJIILIIL().LJFF();
            C673200Qas c673200Qas = musicSugViewModel.LLILLJJLI;
            List<? extends MusicSearchHistory> list = c673200Qas.LIZ;
            MusicSearchHistory[] musicSearchHistoryArr = list != null ? (MusicSearchHistory[]) ((ArrayList) list).toArray(new MusicSearchHistory[0]) : null;
            if (!Arrays.equals(musicSearchHistoryArr, c673200Qas.LIZIZ)) {
                JSONArray jSONArray = new JSONArray();
                if (musicSearchHistoryArr != null) {
                    for (MusicSearchHistory musicSearchHistory : musicSearchHistoryArr) {
                        jSONArray.put(musicSearchHistory.keyword);
                    }
                }
                c673200Qas.LIZIZ = musicSearchHistoryArr;
                c673200Qas.LIZJ = Uri.encode(jSONArray.toString());
            }
            String str2 = c673200Qas.LIZJ;
            Integer num = ComplianceServiceProvider.LJI().LJJII() ? 1 : null;
            C0QPW.LIZ.getClass();
            C0QPX.LIZIZ.LIZLLL(str, "music_create", str2, num).LJ(new C0R4M(musicSugViewModel, 3), C15O7.LJIIIIZZ, null);
        }
    }

    public final void LIZ$2() {
        Integer numLJIIJJI;
        Uri uri = UriProtector.parse(this.s0);
        C647500PaW c647500PaW = C647500PaW.LIZ;
        String str = this.s0;
        c647500PaW.getClass();
        String strLJIIJ = C647500PaW.LJIIJ(str, true);
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "preload_inflate");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
        }
        if (a0.LJJJIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
            C647720Pas.LIZ.getClass();
            String str2 = (String) ((Map) C647720Pas.LIZJ.getValue()).get(strLJIIJ);
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = str2 != null ? str2 : "";
        }
        if (a0.LJJJIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter) || Intrinsics.LJFF(((ConcurrentHashMap) C647500PaW.LJIIIZ.getValue()).get(strLJIIJ), strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
            return;
        }
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, new String[]{","}, 0, 6);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = listLJJLIIIJILLIZJL.iterator();
        while (it2.hasNext()) {
            List listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL((String) it2.next(), new String[]{"_num"}, 0, 6);
            Object objLJJJJZI = C13LP.LJJJJZI(listLJJLIIIJILLIZJL2);
            String str3 = (String) C13LP.LJJLIIIJL(listLJJLIIIJILLIZJL2);
            int iIntValue = (str3 == null || (numLJIIJJI = C2095008Iq.LJIIJJI(str3)) == null) ? 1 : numLJIIJJI.intValue();
            Integer num = C647500PaW.LIZLLL.get(objLJJJJZI);
            if (num != null) {
                linkedHashMap.put(Integer.valueOf(num.intValue()), Integer.valueOf(iIntValue));
            }
        }
        Context context = (Context) this.l1;
        if (context != null) {
            C647500PaW.LIZ.getClass();
            ((ConcurrentHashMap) C647500PaW.LJIIIZ.getValue()).put(strLJIIJ, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            C653690PkV.LIZ.getClass();
            C653690PkV.LIZJ(context, linkedHashMap);
        }
    }

    public static final void run$0(ARunnableS15S1100000_10 aRunnableS15S1100000_10) {
        boolean zLIZ;
        C1C7U.LIZ("SearchBotMonitor@e9d9.end$1$1");
        try {
            aRunnableS15S1100000_10.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchBotMonitor@e9d9.end$1$1");
    }

    public static final void run$1(ARunnableS15S1100000_10 aRunnableS15S1100000_10) {
        boolean zLIZ;
        C1C7U.LIZ("SearchMusicSugFragment@def0.openSearchSug$1");
        try {
            aRunnableS15S1100000_10.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchMusicSugFragment@def0.openSearchSug$1");
    }

    public static final void run$10(ARunnableS15S1100000_10 aRunnableS15S1100000_10) {
        boolean zLIZ;
        C1C7U.LIZ("SearchMiddlePageSnapshotter@a219.preloadLatestSnapshotBitmap$1");
        try {
            C680370QmR c680370QmR = C680370QmR.LIZ;
            Bitmap bitmapLJ = C680370QmR.LJ((Context) aRunnableS15S1100000_10.l1, aRunnableS15S1100000_10.s0);
            if (bitmapLJ != null) {
                c680370QmR.LJIIIIZZ(bitmapLJ, aRunnableS15S1100000_10.s0);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchMiddlePageSnapshotter@a219.preloadLatestSnapshotBitmap$1");
    }

    public static final void run$2(ARunnableS15S1100000_10 aRunnableS15S1100000_10) {
        boolean zLIZ;
        C1C7U.LIZ("SparkLitePreLayoutHelper@fd49.preInflateSearchElements$3");
        try {
            aRunnableS15S1100000_10.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SparkLitePreLayoutHelper@fd49.preInflateSearchElements$3");
    }

    public static final void run$3(ARunnableS15S1100000_10 aRunnableS15S1100000_10) {
        boolean zLIZ;
        C1C7U.LIZ("TakoRefreshAction@34c2.processEvent$1$1");
        try {
            INimbleContainerAbility iNimbleContainerAbility = (INimbleContainerAbility) C1558520qew.LIZ(((C14NX) aRunnableS15S1100000_10.l1).LIZIZ(), INimbleContainerAbility.class, null);
            if (iNimbleContainerAbility != null) {
                iNimbleContainerAbility.jE1(aRunnableS15S1100000_10.s0);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakoRefreshAction@34c2.processEvent$1$1");
    }

    public static final void run$4(ARunnableS15S1100000_10 aRunnableS15S1100000_10) {
        C671040QTu c671040QTu = (C671040QTu) aRunnableS15S1100000_10.l1;
        String str = aRunnableS15S1100000_10.s0;
        c671040QTu.getClass();
        C1C7U.LIZ("EcSearchSugViewHolder@c1f4.bindImage$1L");
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
        c1331670kl3LJIIIZ.LJJ(c671040QTu.LLJILJIL);
        c1331670kl3LJIIIZ.LIZLLL("EcSearchSugViewHolder");
        C786410Ut5.h3(c1331670kl3LJIIIZ);
        C1C7U.LIZIZ("EcSearchSugViewHolder@c1f4.bindImage$1L");
    }

    public static final void run$5(ARunnableS15S1100000_10 aRunnableS15S1100000_10) {
        boolean zLIZ;
        C1C7U.LIZ("InboxSkylightWidgetV2@8936.rerankSkylight$3$1$1");
        try {
            C641310PDl.LIZ(aRunnableS15S1100000_10.s0, ((SkylightListViewModel) aRunnableS15S1100000_10.l1).LLJJIJI);
            C2211751BhN.LJ(C2211751BhN.LJIIIZ(), false);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InboxSkylightWidgetV2@8936.rerankSkylight$3$1$1");
    }

    public static final void run$6(ARunnableS15S1100000_10 aRunnableS15S1100000_10) {
        boolean zLIZ;
        C1C7U.LIZ("InboxSkylightWidgetV2@8936.rerankSkylight$1$1$1");
        try {
            C641310PDl.LIZ(aRunnableS15S1100000_10.s0, ((SkylightListViewModel) aRunnableS15S1100000_10.l1).LLJJIJI);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InboxSkylightWidgetV2@8936.rerankSkylight$1$1$1");
    }

    public static final void run$7(ARunnableS15S1100000_10 aRunnableS15S1100000_10) {
        boolean zLIZ;
        C1C7U.LIZ("InboxSkylightWidgetV2@8936.rerankSkylight$2");
        try {
            C641310PDl.LIZ(aRunnableS15S1100000_10.s0, ((SkylightListViewModel) aRunnableS15S1100000_10.l1).LLJJIJI);
            C2211751BhN.LJ(C2211751BhN.LJIIIZ(), false);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InboxSkylightWidgetV2@8936.rerankSkylight$2");
    }

    public static final void run$8(ARunnableS15S1100000_10 aRunnableS15S1100000_10) {
        boolean zLIZ;
        C1C7U.LIZ("RefreshAction@4e36.processEvent$1$1");
        try {
            INimbleContainerAbility iNimbleContainerAbility = (INimbleContainerAbility) C1558520qew.LIZ(((C14NX) aRunnableS15S1100000_10.l1).LIZIZ(), INimbleContainerAbility.class, null);
            if (iNimbleContainerAbility != null) {
                iNimbleContainerAbility.jE1(aRunnableS15S1100000_10.s0);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RefreshAction@4e36.processEvent$1$1");
    }

    public static final void run$9(ARunnableS15S1100000_10 aRunnableS15S1100000_10) {
        boolean zLIZ;
        C1C7U.LIZ("EcSearchBarAsrHelper@e2cc.scheduleFinishSoonRunnable$runnable$1");
        try {
            if (Intrinsics.LJFF(aRunnableS15S1100000_10.s0, ((EcSearchBarAsrHelper) aRunnableS15S1100000_10.l1).LIZLLL)) {
                EcSearchBarAsrHelper ecSearchBarAsrHelper = (EcSearchBarAsrHelper) aRunnableS15S1100000_10.l1;
                ecSearchBarAsrHelper.LIZLLL(new C674650QdD(EnumC674680QdG.FINISH_SOON, ecSearchBarAsrHelper.LJ));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EcSearchBarAsrHelper@e2cc.scheduleFinishSoonRunnable$runnable$1");
    }

    public ARunnableS15S1100000_10(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
