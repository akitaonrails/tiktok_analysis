package X;

import androidx.lifecycle.LiveData;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0sYF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1631250sYF {
    public final InterfaceC1446830nkn LIZ;
    public final InterfaceC1636390sgX LIZIZ;
    public final InterfaceC1463990oCT LIZJ;
    public final InterfaceC1625970sPj LIZLLL;
    public LiveData<EnumC1159860gHw> LJ;
    public Integer LJFF;
    public Integer LJI;
    public C11NZ<Pair<Integer, Integer>> LJII;
    public String LJIIIIZZ;
    public final Function0<Boolean> LJIIIZ;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1631250sYF(InterfaceC1446830nkn interfaceC1446830nkn, InterfaceC1636390sgX interfaceC1636390sgX, InterfaceC1463990oCT interfaceC1463990oCT, AwS566S0100000_22 awS566S0100000_22, int i) {
        String str;
        AwS566S0100000_22 awS566S0100000_222 = awS566S0100000_22;
        InterfaceC1463990oCT interfaceC1463990oCT2 = interfaceC1463990oCT;
        InterfaceC1636390sgX interfaceC1636390sgX2 = interfaceC1636390sgX;
        InterfaceC1446830nkn interfaceC1446830nkn2 = (i & 1) != 0 ? null : interfaceC1446830nkn;
        interfaceC1636390sgX2 = (i & 2) != 0 ? null : interfaceC1636390sgX2;
        interfaceC1463990oCT2 = (i & 4) != 0 ? null : interfaceC1463990oCT2;
        if ((i & 256) != 0) {
            str = "";
        } else {
            str = null;
        }
        this(interfaceC1446830nkn2, interfaceC1636390sgX2, interfaceC1463990oCT2, null, null, null, null, null, str, (i & 512) != 0 ? null : awS566S0100000_222);
    }

    public C1631250sYF(InterfaceC1446830nkn interfaceC1446830nkn, InterfaceC1636390sgX interfaceC1636390sgX, InterfaceC1463990oCT interfaceC1463990oCT, InterfaceC1625970sPj interfaceC1625970sPj, LiveData<EnumC1159860gHw> liveData, Integer num, Integer num2, C11NZ<Pair<Integer, Integer>> c11nz, String str, Function0<Boolean> function0) {
        this.LIZ = interfaceC1446830nkn;
        this.LIZIZ = interfaceC1636390sgX;
        this.LIZJ = interfaceC1463990oCT;
        this.LIZLLL = interfaceC1625970sPj;
        this.LJ = liveData;
        this.LJFF = num;
        this.LJI = num2;
        this.LJII = c11nz;
        this.LJIIIIZZ = str;
        this.LJIIIZ = function0;
    }
}
