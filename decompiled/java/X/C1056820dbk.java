package X;

import android.os.Handler;
import com.ss.android.ugc.tiktok.commercialize.dispatcher.impl.settings.CommonDispatchConfigModel;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0dbk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1056820dbk implements InterfaceC1057220dcO {
    public final InterfaceC1057010dc3 LIZ;
    public int LIZIZ;
    public RunnableC1056830dbl LJFF;
    public final C01GW LIZJ = C452501pT.LIZIZ(new C1056940dbw());
    public final AtomicBoolean LIZLLL = new AtomicBoolean(false);
    public final C01GW LJ = C452501pT.LIZIZ(new C1056930dbv());
    public final C01GW LJI = C452501pT.LIZIZ(new C1056950dbx());
    public final AtomicBoolean LJII = new AtomicBoolean(true);

    public final void LIZIZ() {
        RunnableC1056830dbl runnableC1056830dbl = this.LJFF;
        if (runnableC1056830dbl != null) {
            Handler handler = (Handler) this.LJ.getValue();
            Long l = ((CommonDispatchConfigModel) this.LIZJ.getValue()).taskDispatchInterval;
            C786410Ut5.LJLIIL(l != null ? l.longValue() : 3000L, handler, runnableC1056830dbl);
        }
    }

    public C1056820dbk(InterfaceC1057010dc3 interfaceC1057010dc3) {
        this.LIZ = interfaceC1057010dc3;
    }

    @Override // X.InterfaceC1057220dcO
    public final void LIZ(EnumC588020N4m enumC588020N4m, EnumC588020N4m enumC588020N4m2) {
        if (enumC588020N4m == enumC588020N4m2) {
            return;
        }
        int iOrdinal = 0;
        for (AbstractC1056960dby abstractC1056960dby : (List) this.LJI.getValue()) {
            iOrdinal += abstractC1056960dby.LIZIZ().ordinal() * abstractC1056960dby.LIZLLL().getValue();
        }
        this.LIZ.onStateChange(iOrdinal);
        this.LIZIZ = iOrdinal;
    }
}
