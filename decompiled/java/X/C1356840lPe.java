package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.comment.likelist.model.LikeListResponse;
import com.ss.android.ugc.aweme.comment.likelist.viewmodel.LikeListVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0lPe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1356840lPe {
    public static LikeListVM LIZ(Fragment fragment, C19EG c19eg) {
        IDetailFeedSafService iDetailFeedSafService;
        Fragment fragmentLIZLLL;
        Object objLJIILLIIL = SAFExtensionKt.LJIILLIIL(c19eg);
        if ((objLJIILLIIL instanceof Fragment) && (iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null)) != null && (fragmentLIZLLL = iDetailFeedSafService.LIZLLL((Fragment) objLJIILLIIL)) != null) {
            LikeListVM likeListVM = (LikeListVM) ViewModelProviders.of(fragmentLIZLLL).get(LikeListVM.class);
            if (likeListVM.LL == null) {
                likeListVM.LL = new LikeListVM.BubbleBridge(likeListVM, fragmentLIZLLL);
            }
            return likeListVM;
        }
        LikeListVM likeListVM2 = (LikeListVM) ViewModelProviders.of(c19eg).get(LikeListVM.class);
        if (likeListVM2.LL == null) {
            LifecycleOwner lifecycleOwner = fragment;
            if (fragment == null) {
                lifecycleOwner = c19eg;
            }
            likeListVM2.LL = new LikeListVM.BubbleBridge(likeListVM2, lifecycleOwner);
        }
        return likeListVM2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        if (r8 == null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LIZJ(java.lang.String r7, java.util.List r8) {
        /*
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.C0XQ7.LJFF()
            X.0XPy r0 = (X.AbstractC848400XPy) r0
            com.ss.android.ugc.aweme.profile.model.User r6 = r0.getCurUser()
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.awemeservice.api.IAwemeService> r0 = com.ss.android.ugc.aweme.awemeservice.api.IAwemeService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r0 = (com.ss.android.ugc.aweme.awemeservice.api.IAwemeService) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r0.LLILZ(r7)
            r4 = 0
            if (r8 == 0) goto L3d
            java.util.Iterator r3 = r8.iterator()
        L21:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L3d
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.ss.android.ugc.aweme.profile.model.User r0 = (com.ss.android.ugc.aweme.profile.model.User) r0
            java.lang.String r1 = r0.getUid()
            java.lang.String r0 = r6.getUid()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L21
            r4 = r2
        L3d:
            r1 = 1
            if (r5 == 0) goto L5c
            int r0 = r5.getUserDigg()
            if (r0 != r1) goto L50
            if (r4 != 0) goto L4e
            if (r8 == 0) goto L5e
            r8.add(r6)
        L4d:
            return r8
        L4e:
            if (r5 == 0) goto L5c
        L50:
            int r0 = r5.getUserDigg()
            if (r0 != 0) goto L5c
            if (r4 == 0) goto L5c
            r8.remove(r4)
            return r8
        L5c:
            if (r8 != 0) goto L4d
        L5e:
            X.13BV r0 = X.C13BV.INSTANCE
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1356840lPe.LIZJ(java.lang.String, java.util.List):java.util.List");
    }

    public static void LIZIZ(String str, long j, LikeListResponse likeListResponse) throws JSONException {
        long diggCount;
        String str2;
        IAwemeService iAwemeService = (IAwemeService) ServiceManager.get().getService(IAwemeService.class);
        Aweme awemeLLILZ = iAwemeService.LLILZ(str);
        if (awemeLLILZ != null) {
            AwemeStatistics statistics = awemeLLILZ.getStatistics();
            int i = 1;
            if (statistics != null && statistics.getDiggCount() == j) {
                return;
            }
            if (likeListResponse != null) {
                JSONObject jSONObject = new JSONObject();
                AwemeStatistics statistics2 = awemeLLILZ.getStatistics();
                if (statistics2 != null) {
                    diggCount = statistics2.getDiggCount();
                } else {
                    diggCount = 0;
                }
                if (diggCount <= j) {
                    i = 2;
                }
                jSONObject.put("flag", i);
                jSONObject.put("like_count", diggCount);
                jSONObject.put("list_count", j);
                jSONObject.put("video_create_time", awemeLLILZ.getCreateTime());
                jSONObject.put("video_elapsed_time", (System.currentTimeMillis() / 1000) - awemeLLILZ.getCreateTime());
                BaseResponse.ServerTimeExtra serverTimeExtra = likeListResponse.extra;
                String str3 = "";
                if (serverTimeExtra == null || (str2 = serverTimeExtra.logid) == null) {
                    str2 = "";
                }
                jSONObject.put("list_logid", str2);
                String requestId = awemeLLILZ.getRequestId();
                if (requestId != null) {
                    str3 = requestId;
                }
                jSONObject.put("video_logid", str3);
                C20684815ws.LJIJ("like_count_inconformity", jSONObject);
            }
            iAwemeService.ur(j, str);
            C730120SkU c730120SkU = new C730120SkU(str, j, awemeLLILZ.getUserDigg(), EnumC730430Skz.LIST);
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("notifyLikeCountChange, post event=");
            sbLIZ.append(c730120SkU);
            C1720106oR.LJI("LikeListVM", C2188811AlT.LIZIZ(sbLIZ));
            C1440005kM.LIZ(c730120SkU);
        }
    }
}
