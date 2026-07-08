package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectLabel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0noT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.effectdiscover.EffectDiscoverSearchResultAdapter$EffectItemViewHolder$doExposeMob$1", f = "EffectDiscoverSearchResultAdapter.kt", l = {}, m = "invokeSuspend")
public final class C1449110noT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1449120noU LL;
    public final /* synthetic */ C1449130noV LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1449110noT(C1449120noU c1449120noU, C1449130noV c1449130noV, int i, InterfaceC1364105Vn<? super C1449110noT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1449120noU;
        this.LLILLJJLI = c1449130noV;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1449110noT(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String strLJJLIIIJ;
        List<String> v2Tags;
        C1C7U.LIZ("EffectDiscoverSearchResultAdapter$EffectItemViewHolder@a957.doExposeMob$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Effect effect = this.LL.LL;
        if (effect != null) {
            C1449130noV c1449130noV = this.LLILLJJLI;
            int i = this.LLILLL + 1;
            c1449130noV.getClass();
            String effectId = effect.getEffectId();
            if (c1449130noV.LLILZIL.LIZ(effectId, "search", CardStruct.IStatusCode.DEFAULT, C1629100sUm.LIZJ(effect), null)) {
                if (!c1449130noV.LLJI) {
                    str = "search";
                } else {
                    str = "recommend";
                }
                C0LAB c0lab = new C0LAB();
                c0lab.LJ("tab_name", "search");
                c0lab.LJ("tab_key", "search");
                c0lab.LJ("shoot_way", c1449130noV.LLILZ);
                c0lab.LJ("search_id", c1449130noV.LLJ);
                c0lab.LJ("creation_id", c1449130noV.LLILLL);
                C1ER1 c1er1 = C1ER1.LIZIZ;
                c0lab.LJ("effect_session_id", c1er1.LJJIIJZLJL().LJIL());
                c0lab.LJ("search_method", str);
                c0lab.LJ("prop_id", effect.getEffectId());
                C1665200tR0.LIZ.getClass();
                c0lab.LIZ(C1665200tR0.LIZJ(effect) ? 1 : 0, "is_met_music_reuse");
                if (C212600rs.LIZ()) {
                    c0lab.LIZ(effect.getFrom_source(), "prop_panel_delivery_source");
                }
                c0lab.LIZ(i, "impr_position");
                c0lab.LJ("enter_from", "video_shoot_page");
                C1934507hv.LIZ(new C566380MJg(c0lab), c1449130noV.LLILZLL.propFromGroupModel, effectId);
                EffectLabel effectLabel = effect.getEffectLabel();
                String str2 = "";
                if (effectLabel == null || (v2Tags = effectLabel.getV2Tags()) == null || (strLJJLIIIJ = C13LP.LJJLIIIJ(v2Tags, ",", null, null, 0, null, null, 62)) == null) {
                    strLJJLIIIJ = "";
                }
                c0lab.LJ("prop_category", strLJJLIIIJ);
                c0lab.LJ("shoot_way", c1449130noV.LLILZ);
                c0lab.LJ("resource_id", effect.getResourceId());
                c0lab.LJ("tab_key", "search");
                String recommend_reason = effect.getRecommend_reason();
                if (recommend_reason == null) {
                    recommend_reason = "";
                }
                c0lab.LJ("prop_panel_model_recall_type", recommend_reason);
                String recommendRuleTags = effect.getRecommendRuleTags();
                if (recommendRuleTags != null) {
                    str2 = recommendRuleTags;
                }
                c0lab.LJ("prop_panel_model_recommend_tags", str2);
                c0lab.LJ("effect_source", String.valueOf(effect.getSource()));
                c0lab.LJ("carousel_open", CardStruct.IStatusCode.DEFAULT);
                C1449130noV.LLLIIIIL(c0lab, effect);
                if (C1449600npG.LJFF(effect)) {
                    C0LXN.LIZ.getClass();
                    C0LXN.LIZIZ(c0lab, effect);
                }
                List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
                C2341909Fp.LIZ("prop_show", c0lab.LIZ);
                c1er1.LJJIIJZLJL().LJIJJ(new C682370Qpf(c1449130noV.LLJ, effect.getEffectId(), effect.getDoc_id(), c1449130noV.LLILLJJLI.C0().LJI(), c1449130noV.LLILLL, str));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EffectDiscoverSearchResultAdapter$EffectItemViewHolder@a957.doExposeMob$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
