package Y;

import X.AbstractC848400XPy;
import X.C09JN;
import X.C0XQ7;
import X.C1161000gJm;
import X.C1161090gJv;
import X.C1161130gJz;
import X.C1163820gOK;
import X.C1167950gUz;
import X.C1169160gWw;
import X.C1389890mGx;
import X.C1440005kM;
import X.C1697810uHb;
import X.C1C7U;
import X.C259800zU;
import X.InterfaceC1160790gJR;
import android.app.Activity;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosManageViewModel;
import com.ss.android.ugc.aweme.mix.services.IMixFeedService;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes19.dex */
public class AfS17S1400000_18 implements C09JN {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$0(AfS17S1400000_18 afS17S1400000_18, Object obj) {
        boolean z;
        int size;
        int i;
        int i2;
        int size2;
        int size3;
        int i3;
        C1C7U.LIZ("MixVideosManageViewModel@b10d.uploadMixChange$1$2");
        if (((BaseResponse) obj).status_code == 0) {
            C1389890mGx c1389890mGx = new C1389890mGx((Activity) afS17S1400000_18.l1);
            c1389890mGx.LIZ(true);
            c1389890mGx.LJIIIZ(2131850554);
            c1389890mGx.LJIIJJI();
            C1440005kM.LIZ(new C1167950gUz("", null, Boolean.FALSE, null, null));
            ((Activity) afS17S1400000_18.l1).finish();
            User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
            IMixFeedService iMixFeedService = (IMixFeedService) ServiceManager.get().getService(IMixFeedService.class);
            Activity activity = (Activity) afS17S1400000_18.l1;
            String str = ((MixVideosManageViewModel) afS17S1400000_18.l2).LLILLJJLI;
            String uid = curUser.getUid();
            String secUid = curUser.getSecUid();
            List<Aweme> list = ((C1163820gOK) afS17S1400000_18.l3).LL;
            if (list != null && list.size() > 0) {
                z = true;
            } else {
                z = false;
            }
            iMixFeedService.LJIJ(activity, "", null, "from_profile_mix_list", "edit_playlist_page", str, uid, secUid, z, null, "", null, "");
            List<Aweme> list2 = ((C1163820gOK) afS17S1400000_18.l3).LL;
            if (list2 != null) {
                size = list2.size();
            } else {
                size = 0;
            }
            List<Aweme> list3 = ((C1163820gOK) afS17S1400000_18.l3).LL;
            if (list3 != null && !list3.isEmpty()) {
                Iterator<Aweme> it2 = list3.iterator();
                i = 0;
                while (it2.hasNext()) {
                    if (it2.next().isSubOnlyVideo() && (i = i + 1) < 0) {
                        C1697810uHb.LJIJ();
                        throw null;
                    }
                }
            } else {
                i = 0;
            }
            MixVideosManageViewModel mixVideosManageViewModel = (MixVideosManageViewModel) afS17S1400000_18.l2;
            if (1 == mixVideosManageViewModel.LLILZ) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            C1169160gWw c1169160gWw = C1169160gWw.LIZ;
            String str2 = mixVideosManageViewModel.LLILLJJLI;
            String str3 = mixVideosManageViewModel.LL;
            String str4 = afS17S1400000_18.s0;
            List<String> list4 = ((C1163820gOK) afS17S1400000_18.l3).LLILLL;
            if (list4 != null) {
                size2 = list4.size();
            } else {
                size2 = 0;
            }
            Integer numValueOf = Integer.valueOf(size2);
            String str5 = (String) ((C259800zU) afS17S1400000_18.l4).element;
            List<String> list5 = ((C1163820gOK) afS17S1400000_18.l3).LLILLJJLI;
            if (list5 != null) {
                size3 = list5.size();
            } else {
                size3 = 0;
            }
            Integer numValueOf2 = Integer.valueOf(size3);
            if (((MixVideosManageViewModel) afS17S1400000_18.l2).LLILZIL) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            Integer numValueOf3 = Integer.valueOf(i3);
            Integer numValueOf4 = Integer.valueOf(i);
            Integer numValueOf5 = Integer.valueOf(size);
            Integer numValueOf6 = Integer.valueOf(i2);
            c1169160gWw.getClass();
            C1169160gWw.LJIILIIL(str2, str3, str4, numValueOf, str5, numValueOf2, numValueOf3, numValueOf4, numValueOf5, numValueOf6);
            if (((C1163820gOK) afS17S1400000_18.l3).LLILLL != null && (!r2.isEmpty())) {
                MixVideosManageViewModel mixVideosManageViewModel2 = (MixVideosManageViewModel) afS17S1400000_18.l2;
                C1169160gWw.LJII(mixVideosManageViewModel2.LL, "edit_playlist_page", mixVideosManageViewModel2.LLILLJJLI, Integer.valueOf(((C1163820gOK) afS17S1400000_18.l3).LLILLL.size()), Integer.valueOf(i), Integer.valueOf(size), Integer.valueOf(i2), "add", String.valueOf(afS17S1400000_18.s0));
            }
            if (((C1163820gOK) afS17S1400000_18.l3).LLILLJJLI != null && (!r2.isEmpty())) {
                MixVideosManageViewModel mixVideosManageViewModel3 = (MixVideosManageViewModel) afS17S1400000_18.l2;
                C1169160gWw.LJIJJLI(mixVideosManageViewModel3.LL, "edit_playlist_page", mixVideosManageViewModel3.LLILLJJLI, String.valueOf(((C259800zU) afS17S1400000_18.l4).element), Integer.valueOf(((C1163820gOK) afS17S1400000_18.l3).LLILLJJLI.size()), Integer.valueOf(i), Integer.valueOf(size), Integer.valueOf(i2));
            }
        }
        C1C7U.LIZIZ("MixVideosManageViewModel@b10d.uploadMixChange$1$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [T, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>] */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [T, java.lang.Object] */
    public static final void accept$1(AfS17S1400000_18 afS17S1400000_18, Object obj) {
        C1C7U.LIZ("RavenDataProcessor@25d7.submitFirstScreenResponse$1$2");
        C1161000gJm c1161000gJm = (C1161000gJm) obj;
        String str = afS17S1400000_18.s0;
        InterfaceC1160790gJR interfaceC1160790gJR = (InterfaceC1160790gJR) afS17S1400000_18.l1;
        C1161090gJv c1161090gJv = (C1161090gJv) ((C259800zU) afS17S1400000_18.l2).element;
        Map<String, ? extends List<String>> map = (Map) ((C259800zU) afS17S1400000_18.l3).element;
        if (map == null) {
            map = C1161130gJz.LIZ;
        }
        Pair pairLIZ = C1161130gJz.LIZ(str, c1161000gJm, interfaceC1160790gJR, c1161090gJv, map);
        if (pairLIZ != null) {
            C259800zU c259800zU = (C259800zU) afS17S1400000_18.l3;
            if (c259800zU.element == 0) {
                c259800zU.element = C1161130gJz.LIZ;
            }
            ((C259800zU) afS17S1400000_18.l2).element = pairLIZ.getSecond();
            ((C259800zU) afS17S1400000_18.l4).element = pairLIZ.getFirst();
        }
        C1C7U.LIZIZ("RavenDataProcessor@25d7.submitFirstScreenResponse$1$2");
    }

    public AfS17S1400000_18(Object obj, Object obj2, Object obj3, String str, Object obj4, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.l3 = obj3;
        this.s0 = str;
        this.l4 = obj4;
    }
}
