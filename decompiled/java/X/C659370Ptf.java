package X;

import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchVideoHolder;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Ptf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchVideoHolder$ecomMobClick$1$1", f = "SearchVideoHolder.kt", l = {}, m = "invokeSuspend")
public final class C659370Ptf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SearchVideoHolder LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C659370Ptf(SearchVideoHolder searchVideoHolder, InterfaceC1364105Vn<? super C659370Ptf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = searchVideoHolder;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C659370Ptf(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        String strLIZ;
        Object obj2;
        Object obj3;
        String ecSearchBoBcLabelText;
        AwemeCommerceStruct commerceVideoAuthInfo;
        TuxIconView tuxIconView;
        C1C7U.LIZ("SearchVideoHolder@6f53.ecomMobClick$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C653660PkS c653660PkSL3 = this.LL.l3();
        Map<String, String> mapU6 = this.LL.U6();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SearchVideoHolder searchVideoHolder = this.LL;
        C659620Pu4 c659620Pu4 = searchVideoHolder.LLLF;
        if (c659620Pu4 != null && c659620Pu4.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        String str = "";
        if (z || ((tuxIconView = searchVideoHolder.LLLIIII) != null && tuxIconView.getVisibility() == 0)) {
            Aweme aweme = searchVideoHolder.LL;
            if (aweme == null) {
                strLIZ = "";
            } else {
                strLIZ = C659360Pte.LIZ(aweme);
            }
            linkedHashMap.put("anchor_info", strLIZ);
        }
        linkedHashMap.put("click_area", "video_card_head");
        String str2 = "1";
        if (Intrinsics.LJFF(searchVideoHolder.LL.getAuthorLive(), true)) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_live_head", obj2);
        if (Intrinsics.LJFF(searchVideoHolder.LL.getAuthorLive(), true)) {
            obj3 = "1";
        } else {
            obj3 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_live", obj3);
        Aweme aweme2 = searchVideoHolder.LL;
        C0H81 c0h81 = null;
        if (aweme2 != null && (commerceVideoAuthInfo = aweme2.getCommerceVideoAuthInfo()) != null) {
            ecSearchBoBcLabelText = commerceVideoAuthInfo.getEcSearchBoBcLabelText();
        } else {
            ecSearchBoBcLabelText = null;
        }
        if (!C294600Bgg.LIZ(ecSearchBoBcLabelText)) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("compliance_certification", str2);
        String str3 = searchVideoHolder.l3().LIZLLL;
        if (str3 != null) {
            str = str3;
        }
        linkedHashMap.put("search_type", str);
        C659520Ptu c659520PtuU7 = searchVideoHolder.U7();
        if (c659520PtuU7 != null) {
            c0h81 = c659520PtuU7.LLILZIL;
        }
        linkedHashMap.putAll(C443030HYv.LIZIZ(c0h81));
        linkedHashMap.putAll(mapU6);
        C654790PmH c654790PmH = new C654790PmH(c653660PkSL3);
        c654790PmH.LJJJIL(this.LL.LL);
        c654790PmH.LJIIZILJ("search_id", c653660PkSL3.LJIIJ);
        c654790PmH.LJIIZILJ("search_keyword", c653660PkSL3.LJFF);
        c654790PmH.LJIJJ(c653660PkSL3.LJIIIIZZ);
        c654790PmH.LJIJI("search_result_id", c653660PkSL3.LJIJI);
        c654790PmH.LJIIZILJ("list_item_id", this.LL.LL.getAid());
        c654790PmH.LJIILLIIL.putAll(linkedHashMap);
        c654790PmH.LJIILJJIL();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchVideoHolder@6f53.ecomMobClick$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
