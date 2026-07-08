package X;

import com.ss.android.ugc.aweme.base.MainBusinessAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.ViewPagerScrollAngleComponent;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qy8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1570420qy8 extends C09AY implements Function0<C1570430qy9> {
    public final /* synthetic */ ViewPagerScrollAngleComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1570420qy8(ViewPagerScrollAngleComponent viewPagerScrollAngleComponent) {
        super(0);
        this.LL = viewPagerScrollAngleComponent;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0qy9] */
    @Override // kotlin.jvm.functions.Function0
    public final C1570430qy9 invoke() {
        final ViewPagerScrollAngleComponent viewPagerScrollAngleComponent = this.LL;
        return new InterfaceC21604319gn() { // from class: X.0qy9
            @Override // X.InterfaceC21604319gn
            public final void LIZIZ(JSONObject jSONObject) throws JSONException {
                String enterFrom;
                Aweme awemeLJIIIIZZ;
                String str;
                IViewPagerComponentAbility iViewPagerComponentAbilityMb = viewPagerScrollAngleComponent.Mb();
                Integer numValueOf = null;
                if (iViewPagerComponentAbilityMb != null && (awemeLJIIIIZZ = iViewPagerComponentAbilityMb.LJIIIIZZ()) != null) {
                    jSONObject.put("from_group_id", awemeLJIIIIZZ.getAid());
                    jSONObject.put("from_aweme_type", awemeLJIIIIZZ.getAwemeType());
                    CardInsertInfo cardInsertInfo = awemeLJIIIIZZ.getCardInsertInfo();
                    if (cardInsertInfo != null && Integer.valueOf(cardInsertInfo.getCardType()) != null) {
                        CardInsertInfo cardInsertInfo2 = awemeLJIIIIZZ.getCardInsertInfo();
                        if (cardInsertInfo2 != null) {
                            numValueOf = Integer.valueOf(cardInsertInfo2.getCardType());
                        }
                        jSONObject.put("from_card_type", numValueOf);
                    }
                    jSONObject.put("from_pic_cnt", C735370Ssx.LJIILL(awemeLJIIIIZZ));
                    if (AwemeExtKt.isAdTraffic(awemeLJIIIIZZ)) {
                        str = "1";
                    } else {
                        str = CardStruct.IStatusCode.DEFAULT;
                    }
                    jSONObject.put("from_is_ad", str);
                    jSONObject.put("from_author_id", AwemeExtKt.getAuthorUid(awemeLJIIIIZZ));
                }
                MainBusinessAbility mainBusinessAbilityOo = viewPagerScrollAngleComponent.Oo();
                if (mainBusinessAbilityOo == null || (enterFrom = mainBusinessAbilityOo.getEnterFrom()) == null) {
                    enterFrom = "";
                }
                jSONObject.put("enter_from", enterFrom);
                jSONObject.put("scroll_container", "fyp_vertical");
            }

            @Override // X.InterfaceC21604319gn
            public final void LIZ(JSONObject jSONObject, float f, float f2, float f3, float f4) throws JSONException {
                String enterFrom;
                Aweme awemeLJIIIIZZ;
                IViewPagerComponentAbility iViewPagerComponentAbilityMb = viewPagerScrollAngleComponent.Mb();
                if (iViewPagerComponentAbilityMb != null && (awemeLJIIIIZZ = iViewPagerComponentAbilityMb.LJIIIIZZ()) != null) {
                    jSONObject.put("to_group_id", awemeLJIIIIZZ.getAid());
                    jSONObject.put("to_aweme_type", awemeLJIIIIZZ.getAwemeType());
                    jSONObject.put("to_author_id", AwemeExtKt.getAuthorUid(awemeLJIIIIZZ));
                }
                MainBusinessAbility mainBusinessAbilityOo = viewPagerScrollAngleComponent.Oo();
                if (mainBusinessAbilityOo == null || (enterFrom = mainBusinessAbilityOo.getEnterFrom()) == null) {
                    enterFrom = "";
                }
                jSONObject.put("to_page", enterFrom);
                viewPagerScrollAngleComponent.So(jSONObject, f, f2, f3);
            }
        };
    }
}
