package X;

import android.view.View;
import com.ss.android.ugc.aweme.discover.model.VideoTag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.SearchPhotoHolder;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0PtD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.SearchPhotoHolder$mobShow$1$1", f = "SearchPhotoHolder.kt", l = {}, m = "invokeSuspend")
public final class C659090PtD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SearchPhotoHolder LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C659090PtD(SearchPhotoHolder searchPhotoHolder, String str, InterfaceC1364105Vn<? super C659090PtD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = searchPhotoHolder;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C659090PtD(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C0OBO c0obo;
        C0PCY<C646370PWx> c0pcyWO2;
        InterfaceC1555100qZQ interfaceC1555100qZQ;
        Video video;
        VideoTag videoTag;
        String englishTitle;
        C1C7U.LIZ("SearchPhotoHolder@59ba.mobShow$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C653660PkS c653660PkSL3 = this.LL.l3();
        int i = c653660PkSL3.LJIILL;
        C646000PVm c646000PVm = C650950Pg5.Companion;
        View view = this.LL.itemView;
        c646000PVm.getClass();
        C0PRW c0prwLIZLLL = C646000PVm.LIZLLL(view);
        String str2 = "";
        if (c0prwLIZLLL == null || (str = c0prwLIZLLL.searchKeyword) == null) {
            str = "";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SearchPhotoHolder searchPhotoHolder = this.LL;
        Aweme aweme = searchPhotoHolder.LL;
        if (aweme != null && (video = aweme.getVideo()) != null && (videoTag = video.getVideoTag()) != null && (englishTitle = videoTag.getEnglishTitle()) != null) {
            str2 = englishTitle;
        }
        linkedHashMap.put("video_tag", str2);
        linkedHashMap.put("anchor_outreach_type", CardStruct.IStatusCode.DEFAULT);
        linkedHashMap.putAll(searchPhotoHolder.q6());
        ISearchContextAbility iSearchContextAbilityLIZ = C0Q3E.LIZ(this.LL.itemView);
        if (iSearchContextAbilityLIZ != null && (c0pcyWO2 = iSearchContextAbilityLIZ.wO2()) != null && c0pcyWO2.LIZJ() != null && (interfaceC1555100qZQ = (InterfaceC1555100qZQ) this.LL.LLJJIJI.getValue()) != null) {
            interfaceC1555100qZQ.getSource();
        }
        SearchPhotoHolder searchPhotoHolder2 = this.LL;
        Aweme aweme2 = searchPhotoHolder2.LL;
        String str3 = this.LLILLJJLI;
        View view2 = searchPhotoHolder2.itemView;
        InterfaceC1555100qZQ interfaceC1555100qZQ2 = (InterfaceC1555100qZQ) searchPhotoHolder2.LLJJIJI.getValue();
        if (interfaceC1555100qZQ2 != null) {
            c0obo = (C0OBO) interfaceC1555100qZQ2.getSource();
        } else {
            c0obo = null;
        }
        C659360Pte.LJ(aweme2, str3, c653660PkSL3, view2, c0obo, str, i, linkedHashMap);
        C665580Q8u.LIZIZ.LJIIIZ(c653660PkSL3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchPhotoHolder@59ba.mobShow$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
