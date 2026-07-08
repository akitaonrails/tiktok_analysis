package X;

import android.content.Context;
import java.util.Locale;

/* JADX INFO: renamed from: X.14Lq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20250814Lq implements InterfaceC20251114Lt {
    public final /* synthetic */ InterfaceC20251114Lt LIZ;
    public final /* synthetic */ Context LIZIZ;
    public final /* synthetic */ Locale LIZJ;
    public final /* synthetic */ String LIZLLL;

    @Override // X.InterfaceC20251114Lt
    public final void A() {
        if (this.LIZ != null) {
            C20250614Lo.LIZIZ(this.LIZIZ, this.LIZLLL, this.LIZJ);
            this.LIZ.A();
        }
    }

    public C20250814Lq(InterfaceC20251114Lt interfaceC20251114Lt, Context context, Locale locale, String str) {
        this.LIZ = interfaceC20251114Lt;
        this.LIZIZ = context;
        this.LIZJ = locale;
        this.LIZLLL = str;
    }
}
