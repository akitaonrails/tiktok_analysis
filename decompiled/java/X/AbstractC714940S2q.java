package X;

import Y.AObjectS379S0100000_3;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: renamed from: X.0S2q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC714940S2q {
    public final int LIZ;
    public final ViewGroup.LayoutParams LIZIZ;
    public InterfaceC690390R6f LIZJ;
    public InterfaceC714910S2n LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public int LJI;
    public View LJII;
    public AbstractC714940S2q LJIIIIZZ;
    public List<? extends AbstractC714940S2q> LJIIIZ;
    public final C01GW LJIIJ;

    public AbstractC714940S2q() {
        this(0);
    }

    public boolean LIZ() {
        return this instanceof C0S3M;
    }

    public abstract View LIZIZ(Context context, ViewGroup viewGroup);

    public abstract InterfaceC714910S2n LIZJ();

    public List<AbstractC714940S2q> LIZLLL() {
        return null;
    }

    public void LJ() {
    }

    public /* synthetic */ AbstractC714940S2q(int i) {
        this(-1, null);
    }

    public AbstractC714940S2q(int i, ViewGroup.LayoutParams layoutParams) {
        this.LIZ = i;
        this.LIZIZ = layoutParams;
        this.LJIIJ = C452501pT.LIZIZ(new AObjectS379S0100000_3(this, 9));
    }
}
