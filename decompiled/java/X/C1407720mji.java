package X;

import android.util.LruCache;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.i18n.location.api.LocationData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.GuitarBundle;
import com.ss.android.ugc.aweme.poi.PokerBundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0mji, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1407720mji extends C09AY implements Function0<Unit> {
    public final /* synthetic */ TokenCert LL;
    public final /* synthetic */ TokenCert LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ C1407660mjc LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1407720mji(TokenCert tokenCert, TokenCert tokenCert2, long j, C1407660mjc c1407660mjc, int i) {
        super(0);
        this.LL = tokenCert;
        this.LLILLJJLI = tokenCert2;
        this.LLILLL = j;
        this.LLILZ = c1407660mjc;
        this.LLILZIL = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1207450hWh c1207450hWh = C1207450hWh.LIZ;
        TokenCert tokenCert = this.LL;
        TokenCert tokenCert2 = this.LLILLJJLI;
        final C1407660mjc c1407660mjc = this.LLILZ;
        final int i = this.LLILZIL;
        c1207450hWh.LJIIL("poi", "location_services", tokenCert, tokenCert2, new InterfaceC687820QyS() { // from class: X.0mjf
            @Override // X.InterfaceC687820QyS
            public final void LIZ(LocationData locationData) {
                try {
                    GuitarBundle guitarBundle = new GuitarBundle(locationData.latitude, locationData.longitude);
                    PokerBundle pokerBundleLIZ = C1205940hUG.LIZ(locationData);
                    C1407660mjc c1407660mjc2 = c1407660mjc;
                    long j = i;
                    double d = guitarBundle.longitude;
                    double d2 = guitarBundle.latitude;
                    c1407660mjc2.getClass();
                    C1411250mpP.LIZIZ(c1407660mjc2, j, C786410Ut5.J3(C1407660mjc.LJ(d, d2, 0)));
                    LruCache<String, PokerBundle> lruCache = C1407700mjg.LIZ;
                    Double dValueOf = Double.valueOf(guitarBundle.longitude);
                    Double dValueOf2 = Double.valueOf(guitarBundle.latitude);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(dValueOf);
                    sbLIZ.append(',');
                    sbLIZ.append(dValueOf2);
                    C1407700mjg.LIZ.put(C08HM.LIZJ(C2188811AlT.LIZIZ(sbLIZ)), pokerBundleLIZ);
                    C1407660mjc.LIZJ = true;
                } catch (IllegalAccessException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1407660mjc c1407660mjc3 = c1407660mjc;
                    int i2 = i;
                    c1407660mjc3.getClass();
                    C201955140j.LJI("EffectGuitarHandler", e);
                    C1411250mpP.LIZIZ(c1407660mjc3, i2, C786410Ut5.J3(C1407660mjc.LJ(0.0d, 0.0d, 3)));
                }
            }

            @Override // X.InterfaceC687820QyS
            public final void onError(int i2, String str) {
                C1407660mjc c1407660mjc2 = c1407660mjc;
                int i3 = i;
                c1407660mjc2.getClass();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(i2);
                sbLIZ.append(' ');
                sbLIZ.append(str);
                C201955140j.LJFF("EffectGuitarHandler", C2188811AlT.LIZIZ(sbLIZ));
                C1411250mpP.LIZIZ(c1407660mjc2, i3, C786410Ut5.J3(C1407660mjc.LJ(0.0d, 0.0d, 3)));
            }
        }, Long.valueOf(this.LLILLL));
        return Unit.LIZ;
    }
}
