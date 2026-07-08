package X;

import X.AbstractC1396950mSL;
import android.view.MotionEvent;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS422S0200000_21;
import kotlin.jvm.internal.AwS42S0200100_21;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0mSf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public abstract class AbstractC1397150mSf<T extends AbstractC1396950mSL> implements InterfaceC1396870mSD, InterfaceC1396970mSN {
    public InterfaceC1384330m7z LIZ;
    public InterfaceC1396800mS6 LIZIZ;
    public C1396790mS5 LIZJ;
    public C1384750m8f LIZLLL;
    public int LJFF;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public final LinkedList<AbstractC1396720mRy<AbstractC1384320m7y>> LJ = new LinkedList<>();
    public final CopyOnWriteArrayList<T> LJI = new CopyOnWriteArrayList<>();
    public final LinkedList<AbstractC1396720mRy<AbstractC1384320m7y>> LJII = new LinkedList<>();

    public void LJFF() {
    }

    public abstract void LJI();

    public abstract boolean LJII(long j, AbstractC1396720mRy<AbstractC1384320m7y> abstractC1396720mRy);

    public abstract C1396790mS5 LJIIIIZZ();

    @Override // X.InterfaceC1396870mSD
    public List<AbstractC1396720mRy<AbstractC1384320m7y>> LJ() {
        new AwS565S0100000_21(this, 1371).invoke();
        return this.LJ;
    }

    @Override // X.InterfaceC1396870mSD
    public final void LJIILIIL() {
        new AwS565S0100000_21(this, 1370).invoke();
    }

    public InterfaceC1397010mSR LIZLLL(MotionEvent motionEvent) {
        Iterator<T> it2 = this.LJI.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            T next = it2.next();
            if (motionEvent.getY() <= next.LJIIIIZZ + next.LJII) {
                if (motionEvent.getY() < next.LJIIIIZZ || !next.onTouchEvent(motionEvent)) {
                    break;
                }
                return next;
            }
        }
        return null;
    }

    @Override // X.InterfaceC1396870mSD
    public void LJIILJJIL(AbstractC1396720mRy<AbstractC1384320m7y> abstractC1396720mRy) {
        this.LIZ.LJJIIJZLJL(1001, abstractC1396720mRy.LJ(), null);
        new AwS422S0200000_21(this, abstractC1396720mRy, 97).invoke();
    }

    @Override // X.InterfaceC1396870mSD
    public void LJJI(Function1<? super AbstractC1384320m7y, Boolean> function1) {
        new AwS422S0200000_21(this, function1, 96).invoke();
    }

    @Override // X.InterfaceC1396870mSD
    public void LIZ(int i, int i2) {
        this.LJIIIIZZ = i;
        this.LJIIIZ = i2;
        LJI();
    }

    @Override // X.InterfaceC1396870mSD
    public final void LJIJJ(InterfaceC1384330m7z interfaceC1384330m7z, C1396890mSF c1396890mSF) {
        this.LIZ = interfaceC1384330m7z;
        this.LIZIZ = c1396890mSF;
        this.LIZLLL = interfaceC1384330m7z.getConfig();
        this.LIZJ = LJIIIIZZ();
    }

    @Override // X.InterfaceC1396870mSD
    public void LJJIJIL(long j, List<? extends AbstractC1396720mRy<AbstractC1384320m7y>> list) {
        new AwS42S0200100_21(this, list, j, 0).invoke();
    }

    @Override // X.InterfaceC1396870mSD
    public int LIZJ(long j, boolean z, boolean z2) {
        new C1397180mSi(this, j, z, z2).invoke();
        return this.LJFF;
    }
}
