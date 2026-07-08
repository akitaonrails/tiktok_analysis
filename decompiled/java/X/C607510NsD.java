package X;

import android.app.Activity;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0NsD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.report.FollowingMobHelper$mobFollowFeedVideoPlay$1", f = "FollowingMobHelper.kt", l = {}, m = "invokeSuspend")
public final class C607510NsD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C607510NsD(String str, InterfaceC1364105Vn<? super C607510NsD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C607510NsD(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Activity activityLIZIZ;
        C19EG c19egLIZIZ;
        AbstractC1255880imo abstractC1255880imo;
        List items;
        Object next;
        String string;
        String aid;
        C1C7U.LIZ("FollowingMobHelper@f1a2.mobFollowFeedVideoPlay$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C607520NsE c607520NsE = C607520NsE.LIZ;
        String str = this.LL;
        c607520NsE.getClass();
        if (((CopyOnWriteArraySet) C607520NsE.LIZJ.getValue()).contains(str)) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("FollowingMobHelper@f1a2.mobFollowFeedVideoPlay$1");
            return unit;
        }
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(activityLIZIZ)) != null) {
            FeedFollowFragment feedFollowFragment = (FeedFollowFragment) Hox.LLJILJIL.LIZ(c19egLIZIZ).Ki("Following");
            if (feedFollowFragment == null) {
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("FollowingMobHelper@f1a2.mobFollowFeedVideoPlay$1");
                return unit2;
            }
            T t = feedFollowFragment.dS().LIZ;
            if (t != 0) {
                abstractC1255880imo = (AbstractC1255880imo) t.LL;
            } else {
                abstractC1255880imo = null;
            }
            if ((abstractC1255880imo instanceof C1588840rRq) && abstractC1255880imo != null && (items = abstractC1255880imo.getItems()) != null) {
                String str2 = this.LL;
                Iterator it2 = items.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        Aweme aweme = ((C0PLT) next).getAweme();
                        if (aweme != null) {
                            aid = aweme.getAid();
                        } else {
                            aid = null;
                        }
                        if (Intrinsics.LJFF(aid, str2)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                FollowFeed followFeed = (FollowFeed) next;
                if (followFeed != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("source", String.valueOf(followFeed.getSource()));
                    Aweme aweme2 = followFeed.getAweme();
                    if (aweme2 != null && (string = C2286608xc.LJ(aweme2.getAwemeType()).toString()) != null) {
                        linkedHashMap.put("aweme_type", string);
                    }
                    C20684815ws.LJIILLIIL("follow_feed_video_play", linkedHashMap);
                    Unit unit3 = Unit.LIZ;
                    C1C7U.LIZIZ("FollowingMobHelper@f1a2.mobFollowFeedVideoPlay$1");
                    return unit3;
                }
            }
            Unit unit4 = Unit.LIZ;
            C1C7U.LIZIZ("FollowingMobHelper@f1a2.mobFollowFeedVideoPlay$1");
            return unit4;
        }
        Unit unit5 = Unit.LIZ;
        C1C7U.LIZIZ("FollowingMobHelper@f1a2.mobFollowFeedVideoPlay$1");
        return unit5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
