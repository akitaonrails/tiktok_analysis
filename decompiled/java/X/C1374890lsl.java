package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.ss.android.ugc.aweme.feed.assem.share.quickexternalshare.QuickExternalShareVM;
import com.ss.android.ugc.aweme.model.QuickExternalShareBtnConfig;
import com.ss.android.ugc.aweme.model.ShareBtnFrequencyRule;
import com.ss.android.ugc.aweme.model.ShareBtnFrequencyRuleGroup;
import com.ss.android.ugc.aweme.model.ShareBtnHideRule;
import com.ss.android.ugc.aweme.model.ShareBtnHideRuleGroup;
import com.ss.android.ugc.aweme.model.ShareBtnShowRule;
import com.ss.android.ugc.aweme.model.ShareBtnShowRuleGroup;
import com.ss.android.ugc.aweme.setting.ShareItemOrderBean;
import com.ss.android.ugc.aweme.share.SharePlatform;
import com.ss.android.ugc.aweme.share.SharePlatformLists;
import com.ss.android.ugc.aweme.share.base.model.ShareChannelInfo;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0lsl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1374890lsl {
    public static final void LIZ(List<ShareChannelInfo> list) {
        C1374750lsX.LIZ = list;
        if (list != null) {
            for (ShareChannelInfo shareChannelInfo : list) {
                final String str = shareChannelInfo.channelKey;
                if (shareChannelInfo.iconRes.length() > 0) {
                    C1331660kl2.LJIIIZ(shareChannelInfo.iconRes).LJJII(new AbstractC468201s0() { // from class: X.0lt0
                        @Override // X.InterfaceC1331910klR
                        public final void onFailed(Throwable th) {
                        }

                        @Override // X.InterfaceC1331910klR
                        public final void LIZ(Bitmap bitmap) {
                            if (bitmap != null) {
                                C1374750lsX.LIZIZ.put(str, new BitmapDrawable(bitmap));
                            }
                        }
                    });
                }
                if (shareChannelInfo.squareIconRes.length() > 0) {
                    C1331660kl2.LJIIIZ(shareChannelInfo.squareIconRes).LJJII(new AbstractC468201s0() { // from class: X.0lsv
                        @Override // X.InterfaceC1331910klR
                        public final void onFailed(Throwable th) {
                        }

                        @Override // X.InterfaceC1331910klR
                        public final void LIZ(Bitmap bitmap) {
                            if (bitmap != null) {
                                String str2 = str;
                                Map<String, Drawable> map = C1374750lsX.LIZIZ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(str2);
                                sbLIZ.append("__square_icon");
                                map.put(C2188811AlT.LIZIZ(sbLIZ), new BitmapDrawable(bitmap));
                            }
                        }
                    });
                }
            }
        }
    }

    public static final void LIZIZ(List<ShareItemOrderBean> list) {
        C1374860lsi.LIZJ().LIZJ = list;
    }

    public static final void LIZJ(QuickExternalShareBtnConfig quickExternalShareBtnConfig) {
        List<ShareBtnFrequencyRuleGroup> list;
        List<ShareBtnShowRuleGroup> list2;
        List<ShareBtnHideRuleGroup> list3;
        QuickExternalShareVM.LLILZIL = quickExternalShareBtnConfig;
        if (quickExternalShareBtnConfig != null && (list3 = quickExternalShareBtnConfig.hideRuleGroups) != null) {
            Iterator<ShareBtnHideRuleGroup> it2 = list3.iterator();
            while (it2.hasNext()) {
                for (ShareBtnHideRule shareBtnHideRule : it2.next().hideRules) {
                    QuickExternalShareVM.LLIZ.put(Integer.valueOf(shareBtnHideRule.ruleId), shareBtnHideRule.ruleConfig);
                }
            }
        }
        QuickExternalShareBtnConfig quickExternalShareBtnConfig2 = QuickExternalShareVM.LLILZIL;
        if (quickExternalShareBtnConfig2 != null && (list2 = quickExternalShareBtnConfig2.showRuleGroups) != null) {
            Iterator<ShareBtnShowRuleGroup> it3 = list2.iterator();
            while (it3.hasNext()) {
                for (ShareBtnShowRule shareBtnShowRule : it3.next().showRules) {
                    QuickExternalShareVM.LLIZLLLIL.put(Integer.valueOf(shareBtnShowRule.ruleId), shareBtnShowRule.ruleConfig);
                }
            }
        }
        QuickExternalShareBtnConfig quickExternalShareBtnConfig3 = QuickExternalShareVM.LLILZIL;
        if (quickExternalShareBtnConfig3 != null && (list = quickExternalShareBtnConfig3.frequencyRuleGroups) != null) {
            Iterator<ShareBtnFrequencyRuleGroup> it4 = list.iterator();
            while (it4.hasNext()) {
                for (ShareBtnFrequencyRule shareBtnFrequencyRule : it4.next().frequencyRules) {
                    QuickExternalShareVM.LLILZLL.put(Integer.valueOf(shareBtnFrequencyRule.ruleId), shareBtnFrequencyRule.ruleConfig);
                }
            }
        }
    }

    public static final void LIZLLL(List<ShareItemOrderBean> list) {
        C1374860lsi.LIZJ().LIZIZ = list;
    }

    public static final void LJ(SharePlatformLists sharePlatformLists) {
        C1374580lsG.LIZ.getClass();
        if (C1374580lsG.LIZ()) {
            if (sharePlatformLists == null) {
                C1375150ltB.LIZ.getClass();
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LIZJ(0, "success");
                c2344009Gk.LIZJ(-1002, "error_code");
                c2344009Gk.LJIIIIZZ("error_msg", "");
                c2344009Gk.LJIIIIZZ("entrance", "setting");
                c2344009Gk.LJFF("input_data", "");
                C20684815ws.LJIILLIIL("hit_client_smart_sort", c2344009Gk.LIZ);
                return;
            }
            C1374580lsG.LIZIZ = sharePlatformLists;
        }
    }

    public static final void LJFF(List<SharePlatform> list) {
        C1377830lxV.LIZ.getClass();
        C1377830lxV.LIZJ = list;
    }

    public static final void LJI(List<SharePlatform> list) {
        C1374860lsi.LIZJ().LIZ = list;
        C349180DmW.LIZIZ();
    }
}
