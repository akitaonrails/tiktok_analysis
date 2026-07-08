package X;

import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mSL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public abstract class AbstractC1396950mSL implements InterfaceC1397040mSU, InterfaceC1397010mSR, InterfaceC1396310mRJ {
    public final C1384750m8f LIZ;
    public AbstractC1396720mRy<AbstractC1384320m7y> LIZLLL;
    public float LJI;
    public float LJII;
    public float LJIIIIZZ;
    public int LJIIIZ;
    public final InterfaceC1384330m7z LJIIJ;
    public final InterfaceC1396870mSD LJIIJJI;
    public final LinkedList<AbstractC1396720mRy<AbstractC1384320m7y>> LIZIZ = new LinkedList<>();
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(523));
    public final RectF LJ = new RectF();
    public final PointF LJFF = new PointF();

    @Override // X.InterfaceC1396310mRJ
    public final void LJJII(C1396940mSK c1396940mSK) {
        switch (c1396940mSK.LIZ) {
            case 1001:
                AbstractC1384320m7y abstractC1384320m7y = c1396940mSK.LIZIZ;
                if (abstractC1384320m7y == null) {
                    return;
                }
                for (AbstractC1396720mRy<AbstractC1384320m7y> abstractC1396720mRy : this.LIZIZ) {
                    if (Intrinsics.LJFF(abstractC1396720mRy.LJ(), abstractC1384320m7y)) {
                        abstractC1396720mRy.LJJIIZ(true);
                        abstractC1396720mRy.LJJIFFI(this.LIZ);
                    }
                }
                return;
            case 1002:
                AbstractC1384320m7y abstractC1384320m7y2 = c1396940mSK.LIZIZ;
                if (abstractC1384320m7y2 == null) {
                    return;
                }
                for (AbstractC1396720mRy<AbstractC1384320m7y> abstractC1396720mRy2 : this.LIZIZ) {
                    if (Intrinsics.LJFF(abstractC1396720mRy2.LJ(), abstractC1384320m7y2)) {
                        abstractC1396720mRy2.LJJIIZ(false);
                        abstractC1396720mRy2.LJJIFFI(this.LIZ);
                    }
                }
                return;
            case 1003:
                AbstractC1384320m7y abstractC1384320m7y3 = c1396940mSK.LIZIZ;
                if (abstractC1384320m7y3 == null) {
                    return;
                }
                for (AbstractC1396720mRy<AbstractC1384320m7y> abstractC1396720mRy3 : this.LIZIZ) {
                    if (Intrinsics.LJFF(abstractC1396720mRy3.LJ(), abstractC1384320m7y3)) {
                        abstractC1396720mRy3.LIZJ(abstractC1384320m7y3, this.LIZ);
                        abstractC1396720mRy3.LJIL(this.LIZ);
                        InterfaceC1384330m7z interfaceC1384330m7z = this.LJIIJ;
                        RectF rectF = this.LJ;
                        rectF.left = abstractC1396720mRy3.LJIILIIL();
                        rectF.top = abstractC1396720mRy3.LJIILJJIL();
                        rectF.right = abstractC1396720mRy3.LJIILIIL() + abstractC1396720mRy3.LJIIL();
                        rectF.bottom = abstractC1396720mRy3.LJIILJJIL() + abstractC1396720mRy3.LJI();
                        interfaceC1384330m7z.LJJIIJZLJL(1002, abstractC1384320m7y3, rectF);
                    }
                }
                return;
            case 1004:
                AbstractC1384320m7y abstractC1384320m7y4 = c1396940mSK.LIZIZ;
                if (abstractC1384320m7y4 == null) {
                    return;
                }
                for (AbstractC1396720mRy<AbstractC1384320m7y> abstractC1396720mRy4 : this.LIZIZ) {
                    if (Intrinsics.LJFF(abstractC1396720mRy4.LJ(), abstractC1384320m7y4)) {
                        LinkedList<AbstractC1396720mRy<AbstractC1384320m7y>> linkedList = this.LIZIZ;
                        if (linkedList != null) {
                            C19719512Dh.LIZ(linkedList).remove(abstractC1396720mRy4);
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
                    }
                }
                return;
            case 1005:
            default:
                return;
            case 1006:
                AbstractC1384320m7y abstractC1384320m7y5 = c1396940mSK.LIZIZ;
                if (abstractC1384320m7y5 == null) {
                    return;
                }
                Iterator<AbstractC1396720mRy<AbstractC1384320m7y>> it2 = this.LIZIZ.iterator();
                while (it2.hasNext() && !Intrinsics.LJFF(it2.next().LJ(), abstractC1384320m7y5)) {
                }
                return;
        }
    }

    @Override // X.InterfaceC1397010mSR
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                AbstractC1396720mRy<AbstractC1384320m7y> abstractC1396720mRy = this.LIZLLL;
                if (abstractC1396720mRy != null) {
                    float fLJIILIIL = abstractC1396720mRy.LJIILIIL();
                    float fLJIILIIL2 = abstractC1396720mRy.LJIILIIL() + abstractC1396720mRy.LJIIL();
                    float x = motionEvent.getX();
                    if (x >= fLJIILIIL && x <= fLJIILIIL2) {
                        LIZIZ(abstractC1396720mRy, motionEvent.getX(), motionEvent.getY(), this.LJIIIZ);
                    }
                    return true;
                }
                this.LIZLLL = null;
                return false;
            }
        } else {
            for (AbstractC1396720mRy<AbstractC1384320m7y> abstractC1396720mRy2 : new C13EO(this.LIZIZ)) {
                if (motionEvent.getX() >= abstractC1396720mRy2.LJIILIIL() && motionEvent.getX() <= abstractC1396720mRy2.LJIILIIL() + abstractC1396720mRy2.LJIIL() && (abstractC1396720mRy2.LJ() == null || !AbstractC1384320m7y.LJ())) {
                    int iLIZ = abstractC1396720mRy2.LIZ(motionEvent.getX(), motionEvent.getY());
                    this.LJIIIZ = iLIZ;
                    if (iLIZ != 0) {
                        this.LIZLLL = abstractC1396720mRy2;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public AbstractC1396950mSL(InterfaceC1384330m7z interfaceC1384330m7z, AbstractC1397150mSf abstractC1397150mSf) {
        this.LJIIJ = interfaceC1384330m7z;
        this.LJIIJJI = abstractC1397150mSf;
        this.LIZ = interfaceC1384330m7z.getConfig();
    }

    public final void LIZIZ(AbstractC1396720mRy<AbstractC1384320m7y> abstractC1396720mRy, float f, float f2, int i) {
        AbstractC1384320m7y abstractC1384320m7yLJ;
        InterfaceC1066480drK interfaceC1066480drKLJJIL = this.LJIIJ.LJJIL();
        if (interfaceC1066480drKLJJIL != null && (abstractC1384320m7yLJ = abstractC1396720mRy.LJ()) != null) {
            RectF rectF = this.LJ;
            rectF.left = abstractC1396720mRy.LJIILIIL();
            rectF.top = abstractC1396720mRy.LJIILJJIL();
            rectF.right = abstractC1396720mRy.LJIILIIL() + abstractC1396720mRy.LJIIL();
            rectF.bottom = abstractC1396720mRy.LJIILJJIL() + abstractC1396720mRy.LJI();
            PointF pointF = this.LJFF;
            pointF.x = f;
            pointF.y = f2;
            interfaceC1066480drKLJJIL.LIZ(abstractC1384320m7yLJ, rectF, pointF, i);
        }
    }
}
