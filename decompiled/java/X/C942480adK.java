package X;

import Y.AComparatorS34S0000000_15;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import java.util.TreeMap;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: renamed from: X.0adK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C942480adK {
    public final C942530adP LIZ;
    public long LIZIZ;
    public String LIZJ;
    public boolean LJI;
    public boolean LJII;
    public FrameLayout LJIIIZ;
    public View LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public boolean LJIILIIL;
    public final HashSet<String> LJIILJJIL;
    public final TreeMap<Integer, C941300abQ> LJIILL;
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS559S0100000_15(this, 1110));
    public final C01GW LJ = C452501pT.LIZIZ(new AwS559S0100000_15(this, 1109));
    public final TreeMap<String, C941300abQ> LJFF = new TreeMap<>();
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(461));

    public C942480adK(C942530adP c942530adP) {
        this.LIZ = c942530adP;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pageType =  ");
        sbLIZ.append(c942530adP.LIZLLL);
        C20441214yg.LJIIIZ("GameLinkMicFeedHandler", C2188811AlT.LIZIZ(sbLIZ));
        AComparatorS34S0000000_15 aComparatorS34S0000000_15 = new AComparatorS34S0000000_15(21);
        this.LJIILJJIL = new HashSet<>();
        this.LJIILL = new TreeMap<>(aComparatorS34S0000000_15);
    }
}
