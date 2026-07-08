package X;

import com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0SF9, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SF9 {
    public final VideoDescVM LIZ;
    public final Function1<C0S64, Unit> LIZIZ;
    public final Function0<Unit> LIZJ;
    public final Function2<Aweme, C0S5S, Unit> LIZLLL;
    public C718840SHq LJ;
    public Iterable<? extends C0SJL<C719000SIg>> LJFF;
    public C0SJF LJI;
    public C0SJF LJII;
    public C0S76 LJIIIIZZ;
    public boolean LJIIIZ;

    public final boolean LIZ() {
        if (this.LJIIIZ) {
            return C294320BgE.LIZ() || this.LJIIIIZZ != null;
        }
        return false;
    }

    public C0SF9(VideoDescVM videoDescVM, Function1 function1, C0SFA c0sfa, C718940SIa c718940SIa) {
        this.LIZ = videoDescVM;
        this.LIZIZ = function1;
        this.LIZJ = c0sfa;
        this.LIZLLL = c718940SIa;
    }
}
