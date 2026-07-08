package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.component.ReachBottomCacheComponent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizOptExtKt;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: renamed from: X.0Nrc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C607140Nrc extends C607290Nrr {
    public int LIZ = Integer.MIN_VALUE;
    public boolean LIZIZ;
    public final /* synthetic */ ReachBottomCacheComponent LIZJ;

    public C607140Nrc(ReachBottomCacheComponent reachBottomCacheComponent) {
        this.LIZJ = reachBottomCacheComponent;
    }

    @Override // X.C607290Nrr
    public final void LIZ(C607220Nrk c607220Nrk) {
        this.LIZ = 1;
    }

    @Override // X.C607290Nrr
    public final void LIZIZ(C607280Nrq c607280Nrq) {
        this.LIZ = -1;
    }

    @Override // X.C607290Nrr
    public final void LIZJ(C607220Nrk c607220Nrk) {
        List<Aweme> items;
        String str;
        int i;
        int iLJIL;
        Aweme aweme;
        C0S4J c0s4j = ReachBottomCacheComponent.LLJJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("success ");
        sbLIZ.append(c607220Nrk);
        Aweme awemeLJIIIIZZ = null;
        c0s4j.LIZ(C2188811AlT.LIZIZ(sbLIZ), null);
        this.LIZ = 0;
        FeedItemList feedItemList = c607220Nrk.LIZJ;
        if (feedItemList == null || (items = feedItemList.getItems()) == null || items.isEmpty()) {
            return;
        }
        if (!this.LIZIZ && (aweme = (Aweme) ListProtector.get(items, 0)) != null && AwemeBizOptExtKt.getAwemeCacheType(aweme) == 0) {
            this.LIZIZ = true;
        }
        ReachBottomCacheComponent reachBottomCacheComponent = this.LIZJ;
        C607130Nrb c607130Nrb = reachBottomCacheComponent.LLIZLLLIL;
        if (c607130Nrb == null) {
            return;
        }
        IViewPagerComponentAbility iViewPagerComponentAbilityMb = reachBottomCacheComponent.Mb();
        if (iViewPagerComponentAbilityMb != null) {
            awemeLJIIIIZZ = iViewPagerComponentAbilityMb.LJIIIIZZ();
        }
        long jCurrentTimeMillis = 0;
        if (c607130Nrb.LIZIZ >= 0) {
            jCurrentTimeMillis = (System.currentTimeMillis() - c607130Nrb.LIZIZ) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        }
        if (awemeLJIIIIZZ != null && C591470NHt.LIZ(awemeLJIIIIZZ) && !c607130Nrb.LIZLLL) {
            c0s4j.LIZIZ(new AwS553S0100000_9(c607220Nrk, 145));
            C0NH1 c0nh1 = C0NH1.LIZ;
            if (c607220Nrk.LIZ == 0) {
                i = 1;
            } else {
                i = 0;
            }
            IViewPagerComponentAbility iViewPagerComponentAbilityMb2 = this.LIZJ.Mb();
            if (iViewPagerComponentAbilityMb2 != null) {
                iLJIL = iViewPagerComponentAbilityMb2.LJIL();
            } else {
                iLJIL = -1;
            }
            int i2 = c607130Nrb.LIZJ;
            c0nh1.getClass();
            C0NH1.LIZ("golden_house_work", C591500NHw.LIZ(new Pair("is_boot", Integer.valueOf(i)), new Pair("current_index", Integer.valueOf(iLJIL)), new Pair("enter_from", "homepage_hot"), new Pair("golden_house_insert_count", Integer.valueOf(i2)), new Pair("golden_house_video_duration", Long.valueOf(jCurrentTimeMillis))));
        }
        if (!c607130Nrb.LIZLLL) {
            return;
        }
        int i3 = c607220Nrk.LIZ;
        if (i3 != 0) {
            if (i3 != 2) {
                str = "others";
            } else {
                str = "request_done_loadmore";
            }
        } else {
            str = "request_done_init";
        }
        this.LIZJ.fo(items.size(), str);
    }
}
