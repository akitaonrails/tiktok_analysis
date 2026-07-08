package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.18cR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21322518cR implements InterfaceC21323818ce {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public C21321418cG LIZLLL;
    public final C01GW LJ = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(324));
    public long LJFF;
    public long LJI;
    public volatile C21322818cU LJII;
    public boolean LJIIIIZZ;

    public final synchronized void LJFF() {
        LIZJ().clear();
    }

    @Override // X.InterfaceC21323818ce
    public final String LIZ() {
        return C1942607jE.LIZ(this.LIZIZ);
    }

    public final ArrayList<Function2<C21323018cW, C21326518d5, Unit>> LIZJ() {
        return (ArrayList) this.LJ.getValue();
    }

    public final String LIZLLL() {
        String str;
        C21322818cU c21322818cU = this.LJII;
        String lowerCase = (c21322818cU == null || (str = c21322818cU.LIZ) == null) ? null : str.toLowerCase(Locale.ROOT);
        return !Intrinsics.LJFF(lowerCase, "builtin") ? !Intrinsics.LJFF(lowerCase, "gecko") ? !Intrinsics.LJFF(lowerCase, "cdn") ? Intrinsics.LJFF(lowerCase, "memory") ? "MEMORY" : !Intrinsics.LJFF(lowerCase, "assets") ? lowerCase != null ? !u.LJJIIJZLJL(lowerCase, "gecko", false) ? u.LJJIIJZLJL(lowerCase, "cdn", false) ? "CDN" : "OTHER" : "GECKO" : "OTHER" : "BUILTIN" : "CDN" : "GECKO" : "BUILTIN";
    }

    @Override // X.InterfaceC21323818ce
    public final String LIZIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC21323818ce
    public final String bizName() {
        return this.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void LJ(Function2<? super C21323018cW, ? super C21326518d5, Unit> function2) {
        if (LIZJ().contains(function2)) {
            ListProtector.remove(LIZJ(), LIZJ().indexOf(function2));
        }
        LIZJ().add(function2);
    }

    public C21322518cR(String str, String str2, String str3, C21321418cG c21321418cG) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = c21321418cG;
    }
}
