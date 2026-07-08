package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.suggestfollowing.FollowingSuggestConfigProvider;
import com.ss.android.ugc.aweme.profile.model.User;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OVL, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OVL implements InterfaceC1631620sYq<VideoItemParams, Map<String, ? extends Object>, InterfaceC1364105Vn<? super AbstractC1387105bp>, Object>, InterfaceC842703Qz {
    public final /* synthetic */ WeakReference<C704830Rkn> LL;
    public final /* synthetic */ FollowingSuggestConfigProvider LLILLJJLI;

    public C0OVL(FollowingSuggestConfigProvider followingSuggestConfigProvider, WeakReference weakReference) {
        this.LL = weakReference;
        this.LLILLJJLI = followingSuggestConfigProvider;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(VideoItemParams videoItemParams, Map<String, ? extends Object> map, InterfaceC1364105Vn<? super AbstractC1387105bp> interfaceC1364105Vn) {
        Object obj;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Object obj2;
        C704830Rkn c704830Rkn;
        Map<String, Object> map2;
        C704830Rkn c704830Rkn2;
        VideoItemParams videoItemParams2 = videoItemParams;
        if (videoItemParams2 != null) {
            WeakReference<C704830Rkn> weakReference = this.LL;
            FollowingSuggestConfigProvider followingSuggestConfigProvider = this.LLILLJJLI;
            if (weakReference != null && (c704830Rkn2 = weakReference.get()) != null) {
                obj = c704830Rkn2.LJFF.get("follow_status_changed_from_other");
            } else {
                obj = null;
            }
            if (Intrinsics.LJFF(obj, true)) {
                C704830Rkn c704830Rkn3 = weakReference.get();
                if (c704830Rkn3 != null) {
                    c704830Rkn3.LJFF.put("follow_status_changed_from_other", false);
                }
                return C1387305br.LIZIZ;
            }
            BaseFeedPageParams baseFeedPageParams = videoItemParams2.baseFeedPageParams;
            if (baseFeedPageParams != null) {
                str = baseFeedPageParams.eventType;
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(str, "homepage_hot")) {
                if (weakReference != null && (c704830Rkn = weakReference.get()) != null && (map2 = c704830Rkn.LJFF) != null) {
                    obj2 = map2.get("button_type");
                } else {
                    obj2 = null;
                }
                if (!(obj2 instanceof String) || (str2 = (String) obj2) == null) {
                    str2 = "double_button";
                }
            } else {
                str2 = "single_button";
            }
            followingSuggestConfigProvider.getClass();
            FollowingSuggestConfigProvider.LIZ(videoItemParams2, weakReference);
            String str6 = "";
            if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                if (videoItemParams2.fragment != null && videoItemParams2.getAweme() != null) {
                    InterfaceC898260ZLs interfaceC898260ZLsLIZIZ = C1076010e6h.LIZJ.LIZIZ().LIZIZ(videoItemParams2.fragment);
                    User author = videoItemParams2.getAweme().getAuthor();
                    if (author != null) {
                        BaseFeedPageParams baseFeedPageParams2 = videoItemParams2.baseFeedPageParams;
                        if (baseFeedPageParams2 == null || (str5 = baseFeedPageParams2.eventType) == null) {
                            str5 = "";
                        }
                        C0OVM c0ovm = new C0OVM();
                        c0ovm.LIZJ(author.getUid());
                        c0ovm.LIZIZ(author.getSecUid());
                        boolean zIsSecret = author.isSecret();
                        C1252380ihA c1252380ihA = c0ovm.LIZ;
                        c1252380ihA.LJIILIIL = zIsSecret;
                        c1252380ihA.LIZLLL = 1;
                        c0ovm.LIZ.LJIIJJI = author.getFollowerStatus();
                        String accurateRecType = author.getAccurateRecType();
                        C1252380ihA c1252380ihA2 = c0ovm.LIZ;
                        c1252380ihA2.LJIILLIIL = accurateRecType;
                        c1252380ihA2.LJ = 50;
                        c1252380ihA2.LJI = str2;
                        interfaceC898260ZLsLIZIZ.AI2(c0ovm.LIZ(), str5, null);
                    }
                }
            } else {
                C2450909j1.LIZIZ(new AwS553S0100000_9(videoItemParams2, 158));
            }
            Aweme aweme = videoItemParams2.getAweme();
            BaseFeedPageParams baseFeedPageParams3 = videoItemParams2.baseFeedPageParams;
            if (baseFeedPageParams3 != null && (str4 = baseFeedPageParams3.eventType) != null) {
                str6 = str4;
            }
            if ((Intrinsics.LJFF(str6, "others_homepage") || Intrinsics.LJFF(str6, "homepage_hot")) && aweme != null) {
                if (Intrinsics.LJFF(str6, "homepage_hot")) {
                    str3 = "play_3s";
                } else {
                    str3 = "play_30s";
                }
                C01NN.LIZ(aweme.getAid(), AwemeExtKt.getAuthorUid(aweme), str2, str6, str3, "follow");
            }
        }
        return C1387305br.LIZIZ;
    }
}
