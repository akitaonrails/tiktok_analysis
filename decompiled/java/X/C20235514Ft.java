package X;

import com.ss.android.ugc.aweme.feed.assem.tikbot.TakoAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.tako.mob.ITakoMob;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.14Ft, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.assem.tikbot.TakoAssem$mobEntranceShow$1", f = "TakoAssem.kt", l = {}, m = "invokeSuspend")
public final class C20235514Ft extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ TakoAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20235514Ft(TakoAssem takoAssem, InterfaceC1364105Vn<? super C20235514Ft> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = takoAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20235514Ft(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C2189821An6 c2189821An6;
        String aid;
        BaseFeedPageParams baseFeedPageParams;
        C2189821An6 c2189821An62;
        Aweme aweme;
        BaseFeedPageParams baseFeedPageParams2;
        C1C7U.LIZ("TakoAssem@6e4b.mobEntranceShow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C14TF c14tf = C14TF.LIZIZ;
        ITakoMob iTakoMobLJJJLL = c14tf.LJJJLL();
        VideoItemParams videoItemParams = (VideoItemParams) C631370Opb.LIZ(this.LL);
        String searchId = null;
        if (videoItemParams != null && (baseFeedPageParams2 = videoItemParams.baseFeedPageParams) != null) {
            c2189821An6 = baseFeedPageParams2.param;
        } else {
            c2189821An6 = null;
        }
        String strLIZIZ = c14tf.LJJLJ().LIZIZ(c2189821An6);
        this.LL.LLLIIIL.LIZIZ();
        VideoItemParams videoItemParams2 = (VideoItemParams) C631370Opb.LIZ(this.LL);
        if (videoItemParams2 == null || (aweme = videoItemParams2.getAweme()) == null || (aid = aweme.getAid()) == null) {
            aid = ((C0PM7) C0Q3E.LJI().uF().LIZJ()).LLILZ;
        }
        VideoItemParams videoItemParams3 = (VideoItemParams) C631370Opb.LIZ(this.LL);
        if (videoItemParams3 != null && (baseFeedPageParams = videoItemParams3.baseFeedPageParams) != null && (c2189821An62 = baseFeedPageParams.param) != null) {
            searchId = c2189821An62.getSearchId();
        }
        this.LL.LLLIIIL.LIZIZ();
        this.LL.LLLIIIL.LIZIZ();
        iTakoMobLJJJLL.mobTikbotEntranceShow(strLIZIZ, "icon", aid, searchId, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ((Boolean) C1099204Rq.LIZ.getValue()).booleanValue());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoAssem@6e4b.mobEntranceShow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
