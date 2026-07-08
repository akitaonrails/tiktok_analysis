package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.common.model.ContinuousLoadingAwemeList;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS95S1200000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Pk8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C653460Pk8 implements InterfaceC650320Pf4<FollowStatus> {
    public static final HashMap<Object, ContinuousLoadingAwemeList> LIZJ = new HashMap<>();
    public final LifecycleOwner LIZ;
    public final InterfaceC653510PkD LIZIZ;

    public final ContinuousLoadingAwemeList LIZJ() {
        LifecycleOwner lifecycleOwner;
        Object objLLFZ = this.LIZIZ.LLFZ();
        if (objLLFZ == null) {
            return null;
        }
        HashMap<Object, ContinuousLoadingAwemeList> map = LIZJ;
        ContinuousLoadingAwemeList continuousLoadingAwemeList = map.get(objLLFZ);
        if (continuousLoadingAwemeList == null) {
            List<Aweme> awemeList = this.LIZIZ.getAwemeList();
            ArrayList arrayList = awemeList != null ? new ArrayList(awemeList) : new ArrayList();
            continuousLoadingAwemeList = new ContinuousLoadingAwemeList();
            continuousLoadingAwemeList.awemeList = arrayList;
            continuousLoadingAwemeList.cursor = arrayList.size();
            continuousLoadingAwemeList.hasMore = 1;
            map.put(objLLFZ, continuousLoadingAwemeList);
            if (((Number) C18121077v.LIZ.getValue()).intValue() == 0 && (lifecycleOwner = this.LIZ) != null) {
                C357001a4.LIZ(lifecycleOwner, new AwS554S0100000_10(objLLFZ, 1315));
            }
        }
        return continuousLoadingAwemeList;
    }

    @Override // X.InterfaceC650320Pf4
    public final Class<FollowStatus> LIZ() {
        return FollowStatus.class;
    }

    @Override // X.InterfaceC650320Pf4
    public final void LIZIZ(FollowStatus followStatus) {
        FollowStatus followStatus2 = followStatus;
        Iterator<T> it2 = LIZJ.entrySet().iterator();
        while (it2.hasNext()) {
            List<Aweme> list = ((ContinuousLoadingAwemeList) ((Map.Entry) it2.next()).getValue()).awemeList;
            if (list != null) {
                Iterator<Aweme> it3 = list.iterator();
                while (it3.hasNext()) {
                    User author = it3.next().getAuthor();
                    if (author != null && Intrinsics.LJFF(followStatus2.getUserId(), author.getUid())) {
                        author.setFollowStatus(followStatus2.getFollowStatus());
                    }
                }
            }
        }
    }

    public C653460Pk8(LifecycleOwner lifecycleOwner, InterfaceC653510PkD interfaceC653510PkD) {
        this.LIZ = lifecycleOwner;
        this.LIZIZ = interfaceC653510PkD;
        C650300Pf2.LIZLLL.LIZ(this);
    }

    public final List LIZLLL(Aweme aweme, List list) {
        int size;
        int i;
        Iterator it2 = list.iterator();
        int i2 = -1;
        int i3 = 0;
        while (true) {
            List<Aweme> listLJI = null;
            if (it2.hasNext()) {
                Object next = it2.next();
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    if (Intrinsics.LJFF(aweme.getAid(), ((Aweme) next).getAid())) {
                        i2 = i3;
                    }
                    i3 = i4;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            } else {
                int i5 = i2 + 1;
                InterfaceC653510PkD interfaceC653510PkD = this.LIZIZ;
                if (interfaceC653510PkD != null) {
                    size = interfaceC653510PkD.LJ();
                } else {
                    size = 10;
                }
                if (i5 >= size) {
                    i = i5 - size;
                } else {
                    if (list.size() < size) {
                        size = list.size();
                    }
                    i5 = size;
                    i = 0;
                }
                InterfaceC653510PkD interfaceC653510PkD2 = this.LIZIZ;
                if (interfaceC653510PkD2 != null) {
                    listLJI = interfaceC653510PkD2.LJI();
                }
                ArrayList arrayList = new ArrayList(list.subList(i, i5));
                if (listLJI != null && listLJI.size() > 0) {
                    arrayList.addAll(0, listLJI);
                }
                return arrayList;
            }
        }
    }

    public final void LJ(Context context, Bundle bundle, C653530PkF c653530PkF, View view, Function1<? super ContinuousLoadingAwemeList, Unit> function1, Function1<? super ContinuousLoadingAwemeList, Unit> function12) {
        int size;
        long createTime;
        Aweme aweme;
        Aweme aweme2;
        ContinuousLoadingAwemeList continuousLoadingAwemeListLIZJ = LIZJ();
        if (continuousLoadingAwemeListLIZJ == null) {
            return;
        }
        List<Aweme> list = continuousLoadingAwemeListLIZJ.awemeList;
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        c653530PkF.LIZLLL = size;
        List<Aweme> list2 = continuousLoadingAwemeListLIZJ.awemeList;
        if (list2 != null && (aweme2 = (Aweme) C13LP.LJJLIIIJL(list2)) != null) {
            createTime = aweme2.getCreateTime();
        } else {
            createTime = 0;
        }
        c653530PkF.LJFF = createTime;
        List<Aweme> list3 = continuousLoadingAwemeListLIZJ.awemeList;
        Bundle bundleLJFF = null;
        if (list3 != null) {
            aweme = (Aweme) C13LP.LJJJLZIJ(0, list3);
        } else {
            aweme = null;
        }
        String strLJ = C643200PKs.LJ(aweme);
        C653470Pk9 c653470Pk9 = new C653470Pk9();
        C0PIF.LIZ.getClass();
        String strLJIIIZ = C0PIF.LJIIIZ(view);
        if (strLJIIIZ == null) {
            strLJIIIZ = CardStruct.IStatusCode.DEFAULT;
        }
        String string = bundle.getString(FollowStatusChangeMethod.PARAM_UID);
        c653470Pk9.LLILLL = strLJIIIZ;
        c653470Pk9.LLILZ = string;
        c653470Pk9.LJIILL(continuousLoadingAwemeListLIZJ);
        c653470Pk9.LJIILIIL().LIZ(c653530PkF);
        c653470Pk9.LLILZIL = new AwS95S1200000_10(strLJ, function1, function12, 21);
        C1603960rqE.LIZ = c653470Pk9;
        if (c653530PkF.LJI) {
            C786410Ut5.LJJJI("video_from", "from_search_continuous_play_card", bundle);
        } else {
            C786410Ut5.LJJJI("video_from", "from_search_continuous_loading_card", bundle);
        }
        bundle.putInt("search_detail", C301530Brr.LIZ());
        if (view != null && ((Boolean) C079C.LIZ.getValue()).booleanValue()) {
            bundleLJFF = C1607950rwf.LIZJ(view, view.getWidth() / 2, view.getHeight() / 2, 0, 0).LJFF();
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//aweme/detail");
        smartRouteBuildRoute.withParam(bundle);
        if (bundleLJFF != null) {
            smartRouteBuildRoute.withBundleAnimation(bundleLJFF);
            smartRouteBuildRoute.withParam("activity_has_activity_options", true);
        }
        smartRouteBuildRoute.open();
    }
}
