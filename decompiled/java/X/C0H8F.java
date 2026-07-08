package X;

import com.ss.android.ugc.aweme.discover.model.VideoTag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.SearchPhotoHolder;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H8F, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.SearchPhotoHolder$mobShowPartial$1$1", f = "SearchPhotoHolder.kt", l = {}, m = "invokeSuspend")
public final class C0H8F extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SearchPhotoHolder LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0H8F(SearchPhotoHolder searchPhotoHolder, InterfaceC1364105Vn<? super C0H8F> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = searchPhotoHolder;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0H8F(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String englishTitle;
        String aid;
        Video video;
        VideoTag videoTag;
        C1C7U.LIZ("SearchPhotoHolder@59ba.mobShowPartial$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C653660PkS c653660PkSL3 = this.LL.l3();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SearchPhotoHolder searchPhotoHolder = this.LL;
        Aweme aweme = searchPhotoHolder.LL;
        if (aweme == null || (video = aweme.getVideo()) == null || (videoTag = video.getVideoTag()) == null || (englishTitle = videoTag.getEnglishTitle()) == null) {
            englishTitle = "";
        }
        linkedHashMap.put("video_tag", englishTitle);
        linkedHashMap.put("anchor_outreach_type", CardStruct.IStatusCode.DEFAULT);
        linkedHashMap.putAll(searchPhotoHolder.q6());
        SearchPhotoHolder searchPhotoHolder2 = this.LL;
        C659360Pte.LIZLLL(searchPhotoHolder2.itemView, searchPhotoHolder2.LL, c653660PkSL3, linkedHashMap);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("photo mobShowPartial posted, aid=");
        Aweme aweme2 = this.LL.LL;
        if (aweme2 != null) {
            aid = aweme2.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        C2188811AlT.LIZIZ(sbLIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchPhotoHolder@59ba.mobShowPartial$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
