package X;

import androidx.work.ListenableWorker;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0VIM, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VIM extends C0VIL<C0VIM, C0VIS> {
    @Override // X.C0VIL
    public final C0VIL LIZJ() {
        return this;
    }

    @Override // X.C0VIL
    public final AbstractC795370VHz LIZIZ() {
        if (this.LIZ && this.LIZJ.LJIIIZ.LIZJ) {
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }
        return new AbstractC795370VHz(this) { // from class: X.0VIS
            {
                super(this.LIZIZ, this.LIZJ, this.LIZLLL);
            }
        };
    }

    public C0VIM(Class<? extends ListenableWorker> cls, long j, TimeUnit timeUnit) {
        super(cls);
        C0VIG c0vig = this.LIZJ;
        long millis = timeUnit.toMillis(j);
        if (millis < 900000) {
            c0vig.getClass();
            C0VI8 c0vi8LIZ = C0VI8.LIZ();
            C786410Ut5.j4("Interval duration lesser than minimum allowed value; Changed to %s", new Object[]{900000L});
            c0vi8LIZ.getClass();
            millis = 900000;
        }
        c0vig.LIZLLL(millis, millis);
    }

    public C0VIM(Class cls, TimeUnit timeUnit, TimeUnit timeUnit2) {
        super(cls);
        this.LIZJ.LIZLLL(timeUnit.toMillis(15L), timeUnit2.toMillis(30L));
    }
}
