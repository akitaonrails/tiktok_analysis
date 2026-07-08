package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import com.ss.android.ugc.aweme.search.pages.result.common.core.model.SearchCardInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS624S0100000_10;
import kotlin.jvm.internal.AwS659S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PUb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C645630PUb {
    public final Product LIZ;
    public final C655440PnK LIZIZ;
    public final C654590Plx LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final View LJFF;
    public final boolean LJI;
    public final String LJII;
    public final PageFinder LJIIIIZZ;
    public final EnumC657940PrM LJIIIZ;
    public final Context LJIIJ;
    public final Function0<Unit> LJIIJJI;
    public final InterfaceC1631620sYq<Aweme, C653660PkS, SearchCardInfo, Unit> LJIIL;
    public final InterfaceC1631630sYr<Aweme, C654590Plx, EnterRoomConfig, String, Unit> LJIILIIL;
    public final Function2<Aweme, C654590Plx, Unit> LJIILJJIL;
    public final Function0<String> LJIILL;
    public final boolean LJIILLIIL;

    public C645630PUb() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C645630PUb)) {
            return false;
        }
        C645630PUb c645630PUb = (C645630PUb) obj;
        return Intrinsics.LJFF(this.LIZ, c645630PUb.LIZ) && Intrinsics.LJFF(this.LIZIZ, c645630PUb.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c645630PUb.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c645630PUb.LIZLLL) && Intrinsics.LJFF(this.LJ, c645630PUb.LJ) && Intrinsics.LJFF(this.LJFF, c645630PUb.LJFF) && this.LJI == c645630PUb.LJI && Intrinsics.LJFF(this.LJII, c645630PUb.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c645630PUb.LJIIIIZZ) && this.LJIIIZ == c645630PUb.LJIIIZ && Intrinsics.LJFF(this.LJIIJ, c645630PUb.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c645630PUb.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c645630PUb.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c645630PUb.LJIILIIL) && Intrinsics.LJFF(this.LJIILJJIL, c645630PUb.LJIILJJIL) && Intrinsics.LJFF(this.LJIILL, c645630PUb.LJIILL) && this.LJIILLIIL == c645630PUb.LJIILLIIL;
    }

    public final int hashCode() {
        Product product = this.LIZ;
        int iHashCode = (product == null ? 0 : product.hashCode()) * 31;
        C655440PnK c655440PnK = this.LIZIZ;
        int iHashCode2 = (iHashCode + (c655440PnK == null ? 0 : c655440PnK.hashCode())) * 31;
        C654590Plx c654590Plx = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (c654590Plx == null ? 0 : c654590Plx.hashCode())) * 31;
        String str = this.LIZLLL;
        int iHashCode4 = (((((((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + C786410Ut5.Z2(this.LJI)) * 31;
        String str2 = this.LJII;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        PageFinder pageFinder = this.LJIIIIZZ;
        int iHashCode6 = (iHashCode5 + (pageFinder == null ? 0 : pageFinder.hashCode())) * 31;
        EnumC657940PrM enumC657940PrM = this.LJIIIZ;
        int iHashCode7 = (iHashCode6 + (enumC657940PrM == null ? 0 : enumC657940PrM.hashCode())) * 31;
        Context context = this.LJIIJ;
        int iHashCode8 = (iHashCode7 + (context == null ? 0 : context.hashCode())) * 31;
        Function0<Unit> function0 = this.LJIIJJI;
        int iHashCode9 = (iHashCode8 + (function0 == null ? 0 : function0.hashCode())) * 31;
        InterfaceC1631620sYq<Aweme, C653660PkS, SearchCardInfo, Unit> interfaceC1631620sYq = this.LJIIL;
        int iHashCode10 = (iHashCode9 + (interfaceC1631620sYq == null ? 0 : interfaceC1631620sYq.hashCode())) * 31;
        InterfaceC1631630sYr<Aweme, C654590Plx, EnterRoomConfig, String, Unit> interfaceC1631630sYr = this.LJIILIIL;
        int iHashCode11 = (iHashCode10 + (interfaceC1631630sYr == null ? 0 : interfaceC1631630sYr.hashCode())) * 31;
        Function2<Aweme, C654590Plx, Unit> function2 = this.LJIILJJIL;
        int iHashCode12 = (iHashCode11 + (function2 == null ? 0 : function2.hashCode())) * 31;
        Function0<String> function02 = this.LJIILL;
        return ((iHashCode12 + (function02 != null ? function02.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJIILLIIL);
    }

    public final String toString() {
        return "SearchLiveDynamicProductAnchorClickContext(product=" + this.LIZ + ", liveProductData=" + this.LIZIZ + ", topLiveData=" + this.LIZJ + ", livePlayerTag=" + this.LIZLLL + ", entranceForm=" + this.LJ + ", itemView=" + this.LJFF + ", autoOpenProductBag=" + this.LJI + ", btm=" + this.LJII + ", pageFinder=" + this.LJIIIIZZ + ", ecGeneralScene=" + this.LJIIIZ + ", context=" + this.LJIIJ + ", onClickCallback=" + this.LJIIJJI + ", onMobSearchResultClick=" + this.LJIIL + ", onEnterLiveByMultiLiveCard=" + this.LJIILIIL + ", onLongPressFeedBack=" + this.LJIILJJIL + ", getLastFromGroupId=" + this.LJIILL + ", enableLocalProductClickTrack=" + this.LJIILLIIL + ')';
    }

    public C645630PUb(Product product, C655440PnK c655440PnK, C654590Plx c654590Plx, String str, String str2, View view, String str3, PageFinder pageFinder, EnumC657940PrM enumC657940PrM, Context context, AwS554S0100000_10 awS554S0100000_10, AwS659S0100000_10 awS659S0100000_10, InterfaceC1631630sYr interfaceC1631630sYr, AwS624S0100000_10 awS624S0100000_10, Function0 function0, int i) {
        boolean z;
        AwS659S0100000_10 awS659S0100000_102 = awS659S0100000_10;
        AwS554S0100000_10 awS554S0100000_102 = awS554S0100000_10;
        AwS624S0100000_10 awS624S0100000_102 = awS624S0100000_10;
        InterfaceC1631630sYr interfaceC1631630sYr2 = interfaceC1631630sYr;
        Context context2 = (i & 1024) != 0 ? null : context;
        awS554S0100000_102 = (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : awS554S0100000_102;
        awS659S0100000_102 = (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : awS659S0100000_102;
        interfaceC1631630sYr2 = (i & 8192) != 0 ? null : interfaceC1631630sYr2;
        awS624S0100000_102 = (i & 16384) != 0 ? null : awS624S0100000_102;
        Function0 function02 = (32768 & i) == 0 ? function0 : null;
        if ((i & 65536) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.LIZ = product;
        this.LIZIZ = c655440PnK;
        this.LIZJ = c654590Plx;
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = view;
        this.LJI = true;
        this.LJII = str3;
        this.LJIIIIZZ = pageFinder;
        this.LJIIIZ = enumC657940PrM;
        this.LJIIJ = context2;
        this.LJIIJJI = awS554S0100000_102;
        this.LJIIL = awS659S0100000_102;
        this.LJIILIIL = interfaceC1631630sYr2;
        this.LJIILJJIL = awS624S0100000_102;
        this.LJIILL = function02;
        this.LJIILLIIL = z;
    }
}
