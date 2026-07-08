package X;

import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.discover.model.VideoTag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchVideoHolder;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Ptc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchVideoHolder$mobShow$1$1", f = "SearchVideoHolder.kt", l = {}, m = "invokeSuspend")
public final class C659340Ptc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SearchVideoHolder LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C659340Ptc(SearchVideoHolder searchVideoHolder, String str, InterfaceC1364105Vn<? super C659340Ptc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = searchVideoHolder;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C659340Ptc(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String englishTitle;
        String type;
        TuxIconView tuxIconView;
        Object obj2;
        Object obj3;
        String ecSearchBoBcLabelText;
        C0H81 c0h81;
        AwemeCommerceStruct commerceVideoAuthInfo;
        String strLIZ;
        Video video;
        VideoTag videoTag;
        Video video2;
        VideoTag videoTag2;
        C1C7U.LIZ("SearchVideoHolder@6f53.mobShow$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C653660PkS c653660PkSL3 = this.LL.l3();
        int i = c653660PkSL3.LJIILL;
        String str = ((C0PRC) C0Q3E.LIZ(this.LL.itemView).Ph1().LIZJ()).LLIZLLLIL;
        Map<String, String> mapU6 = this.LL.U6();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SearchVideoHolder searchVideoHolder = this.LL;
        Aweme aweme = searchVideoHolder.LL;
        String str2 = "";
        if (aweme == null || (video2 = aweme.getVideo()) == null || (videoTag2 = video2.getVideoTag()) == null || (englishTitle = videoTag2.getEnglishTitle()) == null) {
            englishTitle = "";
        }
        linkedHashMap.put("video_tag", englishTitle);
        Aweme aweme2 = searchVideoHolder.LL;
        C0OBO c0obo = null;
        if (aweme2 != null && (video = aweme2.getVideo()) != null && (videoTag = video.getVideoTag()) != null) {
            type = videoTag.getType();
        } else {
            type = null;
        }
        if (Intrinsics.LJFF(type, EnumC657080Ppy.POI_DISTANCE.getType())) {
            linkedHashMap.put("video_tag", "distance");
        }
        C659620Pu4 c659620Pu4 = searchVideoHolder.LLLF;
        if ((c659620Pu4 != null && c659620Pu4.getVisibility() == 0) || ((tuxIconView = searchVideoHolder.LLLIIII) != null && tuxIconView.getVisibility() == 0)) {
            Aweme aweme3 = searchVideoHolder.LL;
            if (aweme3 == null) {
                strLIZ = "";
            } else {
                strLIZ = C659360Pte.LIZ(aweme3);
            }
            linkedHashMap.put("anchor_info", strLIZ);
        }
        String str3 = "1";
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
        Aweme aweme4 = searchVideoHolder.LL;
        if (aweme4 != null && (commerceVideoAuthInfo = aweme4.getCommerceVideoAuthInfo()) != null) {
            ecSearchBoBcLabelText = commerceVideoAuthInfo.getEcSearchBoBcLabelText();
        } else {
            ecSearchBoBcLabelText = null;
        }
        if (!C294600Bgg.LIZ(ecSearchBoBcLabelText)) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("compliance_certification", str3);
        String str4 = searchVideoHolder.l3().LIZLLL;
        if (str4 != null) {
            str2 = str4;
        }
        linkedHashMap.put("search_type", str2);
        C659520Ptu c659520PtuU7 = searchVideoHolder.U7();
        if (c659520PtuU7 != null) {
            c0h81 = c659520PtuU7.LLILZIL;
        } else {
            c0h81 = null;
        }
        linkedHashMap.putAll(C443030HYv.LIZIZ(c0h81));
        linkedHashMap.putAll(mapU6);
        SearchVideoHolder searchVideoHolder2 = this.LL;
        Aweme aweme5 = searchVideoHolder2.LL;
        String str5 = this.LLILLJJLI;
        View view = searchVideoHolder2.itemView;
        InterfaceC1555100qZQ interfaceC1555100qZQ = (InterfaceC1555100qZQ) searchVideoHolder2.LLJJIJI.getValue();
        if (interfaceC1555100qZQ != null) {
            c0obo = (C0OBO) interfaceC1555100qZQ.getSource();
        }
        C659360Pte.LJ(aweme5, str5, c653660PkSL3, view, c0obo, str, i, linkedHashMap);
        C665580Q8u.LIZIZ.LIZ(c653660PkSL3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchVideoHolder@6f53.mobShow$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
