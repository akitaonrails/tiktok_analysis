package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.creative.model.GpsConsumingOptModel;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.PoiMobParam;
import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import com.ss.android.ugc.aweme.poi.videopublish.PoiPublishExtensionVM;
import com.ss.android.ugc.aweme.shortvideo.model.PublishExtensionModel;
import java.util.List;
import kotlin.jvm.internal.AwS632S0100000_18;

/* JADX INFO: renamed from: X.0hKv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1200150hKv extends AbstractC1200170hKx {
    public boolean LLIZ;
    public boolean LLIZLLLIL;

    @Override // X.AbstractC1200170hKx
    public final String LIZJ() {
        return "video_post_page";
    }

    @Override // X.AbstractC1200170hKx
    public final boolean LJIIJ() {
        return true;
    }

    @Override // X.AbstractC1200170hKx
    public final boolean LJIIJJI() {
        return true;
    }

    @Override // X.AbstractC1200170hKx
    public final String LJIIL() {
        return "no_retag";
    }

    @Override // X.AbstractC1200170hKx
    public final boolean LJII() {
        InterfaceC19511611Vi interfaceC19511611Vi = this.LLILLL.LLILLJJLI.publishExtensionDataContainer;
        PublishExtensionModel publishExtensionModelFromString = PublishExtensionModel.fromString(interfaceC19511611Vi != null ? interfaceC19511611Vi.LJJZ() : null);
        return (publishExtensionModelFromString == null || publishExtensionModelFromString.poiData == null) ? false : true;
    }

    @Override // X.AbstractC1200170hKx
    public final String LIZLLL() {
        return LJ().getState().LLILLJJLI != null ? "click_poi" : "click_add_location";
    }

    @Override // X.AbstractC1200170hKx
    public final void LJI(String str) {
        boolean z;
        PoiSearchApi.PoiSearchResult poiSearchResult;
        List<PoiData> list;
        if (this.LLIZ) {
            AbstractC1200170hKx.LJIILIIL(this, EnumC1200180hKy.STATUS_POI_IDLE);
            C1200000hKg.LIZIZ(str).start();
            PoiPublishExtensionVM.xQ2(LJ(), this.LLILLJJLI, null, null, str, null, 22);
            this.LLIZ = false;
            return;
        }
        PoiSearchApi.PoiSearchResultWrapper poiSearchResultWrapperLIZ = LJ().getState().LL.LIZ();
        if (poiSearchResultWrapperLIZ != null && (poiSearchResult = poiSearchResultWrapperLIZ.poiSearchResult) != null && (list = poiSearchResult.poiList) != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        PoiPublishExtensionVM poiPublishExtensionVMLJ = LJ();
        EnumC1200290hL9 enumC1200290hL9 = poiPublishExtensionVMLJ.getState().LLILZ;
        if ((enumC1200290hL9 != null && enumC1200290hL9 != poiPublishExtensionVMLJ.LLJIJIL.LIZ()) || z) {
            C1200000hKg.LIZIZ(str).start();
            PoiPublishExtensionVM.xQ2(LJ(), this.LLILLJJLI, null, null, str, null, 22);
        } else {
            AbstractC1200170hKx.LJIILIIL(this, EnumC1200180hKy.STATUS_POI_LIST_SHOW);
        }
    }

    @Override // X.AbstractC1200170hKx
    public final void LJIIIIZZ(String str) {
        String strLJJZ;
        PoiData poiData;
        InterfaceC19511611Vi interfaceC19511611Vi = this.LLILLL.LLILLJJLI.publishExtensionDataContainer;
        String str2 = null;
        if (interfaceC19511611Vi != null) {
            strLJJZ = interfaceC19511611Vi.LJJZ();
        } else {
            strLJJZ = null;
        }
        PublishExtensionModel publishExtensionModelFromString = PublishExtensionModel.fromString(strLJJZ);
        if (publishExtensionModelFromString != null && (poiData = publishExtensionModelFromString.poiData) != null) {
            this.LLIZ = true;
            LJ().yQ2(poiData);
            PoiPublishExtensionVM poiPublishExtensionVMLJ = LJ();
            PoiMobParam poiMobParam = poiData.mobParam;
            if (poiMobParam != null) {
                str2 = poiMobParam.enterMethod;
            }
            poiPublishExtensionVMLJ.LL = str2;
            LJ().LLILLJJLI = poiData.logId;
            LIZ(poiData);
            InterfaceC1199990hKf interfaceC1199990hKfLIZIZ = C1200000hKg.LIZIZ(str);
            interfaceC1199990hKfLIZIZ.LJIJI("use_poi_draft");
            interfaceC1199990hKfLIZIZ.LJJIFFI();
        }
        if (C2524809uw.LIZ) {
            LJIIIZ(this.LLIZ ? 1 : 0);
        } else {
            PoiPublishExtensionVM poiPublishExtensionVMLJ2 = LJ();
            C1200320hLC c1200320hLC = new C2217381BqS() { // from class: X.0hLC
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1199800hKM) obj).LLILLL;
                }
            };
            C1770850wBP c1770850wBP = new C1770850wBP();
            c1770850wBP.LIZ = true;
            C736680Sv4.LJIIIIZZ(this, poiPublishExtensionVMLJ2, c1200320hLC, c1770850wBP, new AwS632S0100000_18(this, 21), 4);
        }
        C1200020hKi c1200020hKi = C1200020hKi.LIZ;
        boolean z = this.LLIZ;
        c1200020hKi.getClass();
        c1200020hKi.LIZJ("add_location_scene_init", new C1200300hLA(z));
        GpsConsumingOptModel gpsConsumingOptModel = this.LLILLL.LLILLJJLI.gpsConsumingOptModel;
        if (!this.LLIZ) {
            PoiPublishExtensionVM.xQ2(LJ(), this.LLILLJJLI, null, null, str, gpsConsumingOptModel, 6);
        }
    }

    public C1200150hKv(Context context, LifecycleOwner lifecycleOwner, C1200260hL6 c1200260hL6) {
        super(context, lifecycleOwner, c1200260hL6);
    }
}
