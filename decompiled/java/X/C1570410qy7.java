package X;

import com.ss.android.ugc.aweme.base.MainBusinessAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo;
import com.ss.android.ugc.feed.platform.panel.viewpager.ViewPagerScrollAngleComponent;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qy7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1570410qy7 extends C09AY implements Function0<C1570450qyB> {
    public final /* synthetic */ ViewPagerScrollAngleComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1570410qy7(ViewPagerScrollAngleComponent viewPagerScrollAngleComponent) {
        super(0);
        this.LL = viewPagerScrollAngleComponent;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0qyB] */
    @Override // kotlin.jvm.functions.Function0
    public final C1570450qyB invoke() {
        final ViewPagerScrollAngleComponent viewPagerScrollAngleComponent = this.LL;
        return new InterfaceC21604319gn() { // from class: X.0qyB
            @Override // X.InterfaceC21604319gn
            public final void LIZIZ(JSONObject jSONObject) throws JSONException {
                String enterFrom;
                MainBusinessAbility mainBusinessAbilityOo;
                Aweme awemeLJIIIIZZ;
                String str;
                Integer numValueOf;
                MainBusinessAbility mainBusinessAbilityOo2 = viewPagerScrollAngleComponent.Oo();
                String enterFrom2 = null;
                if (mainBusinessAbilityOo2 != null) {
                    enterFrom = mainBusinessAbilityOo2.getEnterFrom();
                } else {
                    enterFrom = null;
                }
                if (!Intrinsics.LJFF(enterFrom, "homepage_shop_mall") && (mainBusinessAbilityOo = viewPagerScrollAngleComponent.Oo()) != null && (awemeLJIIIIZZ = mainBusinessAbilityOo.LJIIIIZZ()) != null) {
                    jSONObject.put("from_group_id", awemeLJIIIIZZ.getAid());
                    jSONObject.put("from_aweme_type", awemeLJIIIIZZ.getAwemeType());
                    CardInsertInfo cardInsertInfo = awemeLJIIIIZZ.getCardInsertInfo();
                    if (cardInsertInfo != null && Integer.valueOf(cardInsertInfo.getCardType()) != null) {
                        CardInsertInfo cardInsertInfo2 = awemeLJIIIIZZ.getCardInsertInfo();
                        if (cardInsertInfo2 != null) {
                            numValueOf = Integer.valueOf(cardInsertInfo2.getCardType());
                        } else {
                            numValueOf = null;
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
                jSONObject.put("scroll_container", "homepage_top_tab");
                MainBusinessAbility mainBusinessAbilityOo3 = viewPagerScrollAngleComponent.Oo();
                if (mainBusinessAbilityOo3 != null) {
                    enterFrom2 = mainBusinessAbilityOo3.getEnterFrom();
                }
                jSONObject.put("enter_from", enterFrom2);
            }

            @Override // X.InterfaceC21604319gn
            public final void LIZ(JSONObject jSONObject, float f, float f2, float f3, float f4) throws JSONException {
                String enterFrom;
                MainBusinessAbility mainBusinessAbilityOo = viewPagerScrollAngleComponent.Oo();
                if (mainBusinessAbilityOo != null) {
                    enterFrom = mainBusinessAbilityOo.getEnterFrom();
                } else {
                    enterFrom = null;
                }
                jSONObject.put("to_page", enterFrom);
                viewPagerScrollAngleComponent.So(jSONObject, f, f2, f3);
            }
        };
    }
}
