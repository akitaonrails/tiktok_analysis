package X;

import android.os.SystemClock;
import com.bytedance.android.starship.StarshipCxxContainer;
import com.bytedance.android.starship.StarshipCxxContainerImpl;
import com.bytedance.android.starship.wrapper.StarshipWrapper2;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0k8z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1308070k8z extends C09AY implements Function0<Unit> {
    public C1308070k8z() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        LoadSoLancet.LIZJ("starship_sdk");
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF("starship_sdk");
        LoadSoLancet.LJ(jUptimeMillis, "starship_sdk");
        LoadSoLancet.LIZLLL(jUptimeMillis, "starship_sdk");
        LoadSoLancet.LIZIZ("starship_sdk");
        StarshipWrapper2.Companion.getClass();
        StarshipWrapper2.runStrategy(0, "", "", 0, 0);
        C1308100k92 c1308100k92 = StarshipCxxContainer.Companion;
        StarshipCxxContainer.Type type = StarshipCxxContainer.Type.STARSHIP_CLIENT;
        c1308100k92.getClass();
        C1308080k90 c1308080k90 = StarshipCxxContainerImpl.Companion;
        StarshipCxxContainerImpl starshipCxxContainerImplLIZ = c1308080k90.LIZ(type);
        C1308110k93 c1308110k93 = C1308060k8y.LJFF;
        c1308110k93.getClass();
        c1308080k90.getClass();
        StarshipCxxContainerImpl.registerDataProvider("TestDataProvider", c1308110k93);
        starshipCxxContainerImplLIZ.registerDataStore(C1308060k8y.LJI);
        return Unit.LIZ;
    }
}
