package X;

import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0YER, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YER {
    public static final /* synthetic */ int LJI = 0;
    public final InterfaceC869500Y9c LIZ;
    public final Function0<InterfaceC868170Y3z> LIZIZ;
    public final Function0<Boolean> LIZJ;
    public final Function0<C870830YEf> LIZLLL;
    public final C0Y8P LJ;
    public final C868780Y6i LJFF;

    public final void LIZ(int i, boolean z, Map map, int i2) {
        int[] iArrLJ;
        if (!this.LIZJ.invoke().booleanValue() || (iArrLJ = C870740YDw.LJ(this.LIZLLL.invoke())) == null) {
            return;
        }
        C0YF6 c0yf6 = this.LIZLLL.invoke().LJJLIIIIJ.LIZ;
        if (c0yf6.LIZ || ((z && c0yf6.LIZJ) || !this.LJ.LIZ(i, i2, map))) {
            if (i == -2) {
                for (int i3 : iArrLJ) {
                    if (i3 != -1) {
                        this.LIZIZ.invoke().LLIIJLIL(i3, i2, null, map, z);
                    }
                }
                return;
            }
            if (C13LQ.LJJIJ(i, iArrLJ) >= 0) {
                this.LIZIZ.invoke().LLIIJLIL(i, i2, null, map, z);
                return;
            }
            return;
        }
        C868780Y6i c868780Y6i = this.LJFF;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getMsgByUser, intercept for inbox ");
        sbLIZ.append(i);
        C868780Y6i.LJIILJJIL(c868780Y6i, "InboxManager", C2188811AlT.LIZIZ(sbLIZ), 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0YER(InterfaceC869500Y9c interfaceC869500Y9c, Function0<? extends InterfaceC868170Y3z> function0, Function0<Boolean> function02, Function0<C870830YEf> function03, C0Y8P c0y8p, C868780Y6i c868780Y6i) {
        this.LIZ = interfaceC869500Y9c;
        this.LIZIZ = function0;
        this.LIZJ = function02;
        this.LIZLLL = function03;
        this.LJ = c0y8p;
        this.LJFF = c868780Y6i;
    }
}
