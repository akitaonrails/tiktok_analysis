package X;

import android.app.Application;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18DM, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18DM extends C09AY implements Function0<C18G6> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18DM(String str) {
        super(0);
        this.LL = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C18G6 invoke() {
        Application applicationLIZIZ = C18IP.LIZ.LIZIZ();
        if (applicationLIZIZ == null) {
            return null;
        }
        C18G6 c18g6 = new C18G6(applicationLIZIZ, this.LL);
        if (C18EH.LJ) {
            c18g6.LIZIZ.clear();
            c18g6.LIZIZ.apply();
        }
        return c18g6;
    }
}
