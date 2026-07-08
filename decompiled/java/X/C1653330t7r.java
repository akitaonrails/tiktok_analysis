package X;

import com.ss.android.ugc.gamora.celebration.PreloadConfig;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS622S0100000_8;

/* JADX INFO: renamed from: X.0t7r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1653330t7r {
    public final CharSequence LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final InterfaceC1653360t7u LJ;
    public final Function0<Unit> LJFF;
    public final boolean LJI;
    public final Function2<C1295960jpS, Function1<? super Boolean, Unit>, Unit> LJII;
    public final List<PreloadConfig> LJIIIIZZ;
    public final boolean LJIIIZ;

    public C1653330t7r(CharSequence charSequence, String str, String str2, boolean z, InterfaceC1653360t7u interfaceC1653360t7u, Function0 function0, boolean z2, AwS622S0100000_8 awS622S0100000_8, List list, int i) {
        interfaceC1653360t7u = (i & 16) != 0 ? null : interfaceC1653360t7u;
        function0 = (i & 32) != 0 ? null : function0;
        z2 = (i & 64) != 0 ? false : z2;
        awS622S0100000_8 = (i & 128) != 0 ? null : awS622S0100000_8;
        list = (i & 256) != 0 ? C13BV.INSTANCE : list;
        this.LIZ = charSequence;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = z;
        this.LJ = interfaceC1653360t7u;
        this.LJFF = function0;
        this.LJI = z2;
        this.LJII = awS622S0100000_8;
        this.LJIIIIZZ = list;
        this.LJIIIZ = true;
    }
}
