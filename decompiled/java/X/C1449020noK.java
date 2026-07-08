package X;

import com.ss.android.ugc.aweme.creative.model.PropFromGroupModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0noK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.mob.AVOriginalStickerMobHelper$mobPropShow$1", f = "AVOriginalStickerMobHelper.kt", l = {}, m = "invokeSuspend")
public final class C1449020noK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1449050noN LL;
    public final /* synthetic */ Effect LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ PropFromGroupModel LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1449020noK(C1449050noN c1449050noN, Effect effect, String str, int i, PropFromGroupModel propFromGroupModel, InterfaceC1364105Vn<? super C1449020noK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1449050noN;
        this.LLILLJJLI = effect;
        this.LLILLL = str;
        this.LLILZ = i;
        this.LLILZIL = propFromGroupModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1449020noK(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String strLJIJJLI;
        C1C7U.LIZ("AVOriginalStickerMobHelper@de3d.mobPropShow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1449050noN c1449050noN = this.LL;
        Effect effect = this.LLILLJJLI;
        String str2 = this.LLILLL;
        int i = this.LLILZ;
        PropFromGroupModel propFromGroupModel = this.LLILZIL;
        c1449050noN.getClass();
        if (c1449050noN.LIZIZ.LIZ(effect.getEffectId(), "creator_detail", CardStruct.IStatusCode.DEFAULT, C1629100sUm.LIZJ(effect), effect.getLogId())) {
            HashMap<String, String> mapLJIILL = c1449050noN.LJIILL(effect, str2);
            mapLJIILL.put("tab_name", "creator_detail");
            mapLJIILL.put("prop_selected_from", "other");
            mapLJIILL.put("tab_key", "creator_detail");
            mapLJIILL.put("impr_position", String.valueOf(i));
            String recId = effect.getRecId();
            if (recId == null) {
                recId = CardStruct.IStatusCode.DEFAULT;
            }
            mapLJIILL.put("prop_rec_id", recId);
            if (c1449050noN.LIZ.isStory) {
                str = "story_shoot_page";
            } else {
                str = "video_shoot_page";
            }
            mapLJIILL.put("shoot_page", str);
            ShortVideoContext shortVideoContext = c1449050noN.LIZ;
            if (shortVideoContext.isStory) {
                strLJIJJLI = "story";
            } else {
                strLJIJJLI = shortVideoContext.LJIJJLI();
            }
            mapLJIILL.put("shoot_tab_name", strLJIJJLI);
            mapLJIILL.put("enter_method", "click_personal_board");
            C1665200tR0.LIZ.getClass();
            mapLJIILL.put("is_met_music_reuse", String.valueOf(C1665200tR0.LIZJ(effect) ? 1 : 0));
            mapLJIILL.put("is_original_prop", "1");
            mapLJIILL.put("prop_author_id", effect.getDesignerId());
            mapLJIILL.put("tab_id", "1000002");
            mapLJIILL.put("effect_source", String.valueOf(effect.getSource()));
            if (C212600rs.LIZ()) {
                mapLJIILL.put("prop_panel_delivery_source", String.valueOf(effect.getFrom_source()));
            }
            C0LXN.LIZ.getClass();
            C0LXN.LIZ(effect, mapLJIILL);
            C1448620nng.LIZIZ(new C1449030noL(mapLJIILL), effect.getEffectId(), c1449050noN.LIZ.creativeModel.feedPropPinModel);
            if (propFromGroupModel != null) {
                C1934507hv.LIZ(new C1449040noM(mapLJIILL), propFromGroupModel, effect.getEffectId());
            }
            mapLJIILL.put("is_prop_panel_cache", String.valueOf(effect.is_cached_data() ? 1 : 0));
            C1449260noi.LJ("prop_show", mapLJIILL);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AVOriginalStickerMobHelper@de3d.mobPropShow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
