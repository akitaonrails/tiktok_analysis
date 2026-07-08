package X;

import X.InterfaceC655050Pmh;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchSingleCardTemplateServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Ppa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C656840Ppa<T extends InterfaceC655050Pmh> {
    public C656850Ppb LIZ;
    public C656850Ppb LIZIZ;

    public final void LIZ(Function1<? super C656870Ppd, Unit> function1) {
        C19719912Dl c19719912DlLIZ = SearchSingleCardTemplateServiceImpl.LIZJ().LIZ();
        C656870Ppd c656870Ppd = new C656870Ppd(0);
        if (function1 != null) {
            function1.invoke(c656870Ppd);
        }
        this.LIZIZ = new C656850Ppb(c19719912DlLIZ, c656870Ppd, C1163440gNi.LIZ);
    }

    public static void LIZIZ(C656840Ppa c656840Ppa, C19719912Dl c19719912Dl, C1163440gNi c1163440gNi, int i) {
        if ((i & 4) != 0) {
            c1163440gNi = C1163440gNi.LIZ;
        }
        c656840Ppa.getClass();
        c656840Ppa.LIZ = new C656850Ppb(c19719912Dl, null, c1163440gNi);
    }
}
