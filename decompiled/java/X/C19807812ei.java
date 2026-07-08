package X;

import android.accounts.AccountManager;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.12ei, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19807812ei extends AbstractC19810712fB {
    public long LIZJ;
    public String LIZLLL;
    public AccountManager LJ;
    public Boolean LJFF;
    public long LJI;

    @Override // X.AbstractC19810712fB
    public final boolean LJII() {
        Calendar calendar = Calendar.getInstance();
        this.LIZJ = TimeUnit.MINUTES.convert(calendar.get(15) + calendar.get(16), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String strT2 = C786410Ut5.t2(locale);
        Locale locale2 = Locale.ENGLISH;
        this.LIZLLL = strT2.toLowerCase(locale2) + "-" + C2204961BRm.g0(locale, new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Bz14/yzxe1dYm0ZJPLqwOID9zPVdd3eEmUDB28GG", new String[]{"016a9"})).toLowerCase(locale2);
        return false;
    }

    public final long LJIIIIZZ() {
        LJFF();
        return this.LIZJ;
    }

    public final String LJIIIZ() {
        LJFF();
        return this.LIZLLL;
    }

    public C19807812ei(C19804712eD c19804712eD) {
        super(c19804712eD);
    }
}
