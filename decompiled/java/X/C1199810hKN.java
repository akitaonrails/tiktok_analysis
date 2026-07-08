package X;

import com.bytedance.i18n.location.api.LocationData;
import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import com.ss.android.ugc.aweme.poi.videopublish.PoiPublishExtensionVM;
import kotlin.Unit;
import kotlin.jvm.internal.AwS102S1200000_18;

/* JADX INFO: renamed from: X.0hKN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1199810hKN extends C09AY implements InterfaceC1631620sYq<PoiSearchApi.PoiSearchResultWrapper, Long, Long, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ PoiPublishExtensionVM LLILLJJLI;
    public final /* synthetic */ LocationData LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1199810hKN(boolean z, PoiPublishExtensionVM poiPublishExtensionVM, LocationData locationData, boolean z2, boolean z3, String str) {
        super(3);
        this.LL = z;
        this.LLILLJJLI = poiPublishExtensionVM;
        this.LLILLL = locationData;
        this.LLILZ = z2;
        this.LLILZIL = z3;
        this.LLILZLL = str;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(PoiSearchApi.PoiSearchResultWrapper poiSearchResultWrapper, Long l, Long l2) {
        PoiSearchApi.PoiSearchResultWrapper poiSearchResultWrapper2 = poiSearchResultWrapper;
        long jLongValue = l.longValue();
        Long l3 = l2;
        if (this.LL) {
            this.LLILLJJLI.zQ2(this.LLILLL, this.LLILZ, this.LLILZIL, true);
        }
        PoiPublishExtensionVM poiPublishExtensionVM = this.LLILLJJLI;
        poiPublishExtensionVM.LLIZ = jLongValue;
        poiPublishExtensionVM.LLILZ = l3;
        poiPublishExtensionVM.setState(new AwS102S1200000_18(poiSearchResultWrapper2, l3, this.LLILZLL, 2));
        return Unit.LIZ;
    }
}
