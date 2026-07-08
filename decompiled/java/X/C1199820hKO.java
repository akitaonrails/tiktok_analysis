package X;

import com.bytedance.i18n.location.api.LocationData;
import com.ss.android.ugc.aweme.poi.videopublish.PoiPublishExtensionVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS384S0200000_18;

/* JADX INFO: renamed from: X.0hKO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1199820hKO extends C09AY implements Function1<Throwable, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ PoiPublishExtensionVM LLILLJJLI;
    public final /* synthetic */ LocationData LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1199820hKO(boolean z, PoiPublishExtensionVM poiPublishExtensionVM, LocationData locationData, boolean z2, boolean z3, String str) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = poiPublishExtensionVM;
        this.LLILLL = locationData;
        this.LLILZ = z2;
        this.LLILZIL = z3;
        this.LLILZLL = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        Throwable th2 = th;
        if (this.LL) {
            this.LLILLJJLI.zQ2(this.LLILLL, this.LLILZ, this.LLILZIL, true);
        }
        C1200000hKg.LIZIZ(this.LLILZLL).LJJIFFI();
        PoiPublishExtensionVM poiPublishExtensionVM = this.LLILLJJLI;
        poiPublishExtensionVM.setState(new AwS384S0200000_18(th2, poiPublishExtensionVM, 156));
        return Unit.LIZ;
    }
}
