package X;

import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0nSM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractC1435400nSM extends AbstractC1446660nkW {
    public InterfaceC1434300nQa LJ;
    public C1434590nR3 LJFF;

    @Override // X.AbstractC1446660nkW
    public final void LIZ(Object obj, AbstractC1404540mea abstractC1404540mea, int i, int i2) {
    }

    public abstract EnumC1434950nRd LJI();

    public AbstractC1435400nSM(EnumC1434770nRL enumC1434770nRL) {
        super(enumC1434770nRL, (List<? extends Object>) null);
    }

    @Override // X.AbstractC1446660nkW, X.InterfaceC1840230xzJ
    public void onEvent(AbstractC556190Lrd abstractC556190Lrd) {
        super.onEvent(abstractC556190Lrd);
    }

    @Override // X.AbstractC1446660nkW
    public final void LJ(Object obj, C1404610meh c1404610meh) {
        Object obj2;
        Object next;
        Object next2;
        Object next3;
        Object next4;
        Object next5;
        Iterator<Object> it2 = c1404610meh.LIZ.iterator();
        while (true) {
            obj2 = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (next instanceof C1434960nRe) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        boolean z = next instanceof C1434960nRe;
        Iterator<Object> it3 = c1404610meh.LIZ.iterator();
        while (true) {
            if (it3.hasNext()) {
                next2 = it3.next();
                if (next2 instanceof C1434970nRf) {
                    break;
                }
            } else {
                next2 = null;
                break;
            }
        }
        boolean z2 = next2 instanceof C1434970nRf;
        Iterator<Object> it4 = c1404610meh.LIZ.iterator();
        while (true) {
            if (it4.hasNext()) {
                next3 = it4.next();
                if (next3 == null || (next3 instanceof C1404570med)) {
                    break;
                }
            } else {
                next3 = null;
                break;
            }
        }
        boolean z3 = next3 instanceof C1404570med;
        Iterator<Object> it5 = c1404610meh.LIZ.iterator();
        while (true) {
            if (it5.hasNext()) {
                next4 = it5.next();
                if (next4 == null || (next4 instanceof InterfaceC1434300nQa)) {
                    break;
                }
            } else {
                next4 = null;
                break;
            }
        }
        if (!(next4 instanceof InterfaceC1434300nQa)) {
            next4 = null;
        }
        this.LJ = (InterfaceC1434300nQa) next4;
        Iterator<Object> it6 = c1404610meh.LIZ.iterator();
        while (true) {
            if (it6.hasNext()) {
                next5 = it6.next();
                if (next5 instanceof C1434590nR3) {
                    break;
                }
            } else {
                next5 = null;
                break;
            }
        }
        if (next5 instanceof C1434590nR3) {
            obj2 = next5;
        }
        this.LJFF = (C1434590nR3) obj2;
    }

    @Override // X.AbstractC1446660nkW
    public final void LIZJ(Object obj, C1435220nS4 c1435220nS4, int i, int i2) {
        Float fValueOf;
        VideoFileInfo videoFileInfo;
        Float f;
        EnumC995380c0e enumC995380c0e = EnumC995380c0e.FAIL;
        float f2 = i2;
        C1434590nR3 c1434590nR3 = this.LJFF;
        Long lValueOf = null;
        if (c1434590nR3 != null && (f = c1434590nR3.LIZIZ) != null) {
            fValueOf = Float.valueOf(f.floatValue() / 1024);
        } else {
            fValueOf = null;
        }
        C1434590nR3 c1434590nR32 = this.LJFF;
        if (c1434590nR32 != null && (videoFileInfo = c1434590nR32.LIZ) != null) {
            lValueOf = Long.valueOf(videoFileInfo.getDuration());
        }
        LJII(enumC995380c0e, f2, fValueOf, lValueOf);
    }

    public final void LJII(EnumC995380c0e enumC995380c0e, float f, Float f2, Long l) {
        Float fValueOf;
        C1435480nSU c1435480nSU = C1435480nSU.LIZ;
        EnumC1434950nRd enumC1434950nRdLJI = LJI();
        if (l != null) {
            fValueOf = Float.valueOf(l.longValue());
        } else {
            fValueOf = null;
        }
        Float fValueOf2 = Float.valueOf(f);
        C1435410nSN.LIZ.getClass();
        int size = C1435410nSN.LIZJ.size();
        c1435480nSU.getClass();
        C1435480nSU.LIZ(enumC1434950nRdLJI, enumC995380c0e, f2, fValueOf, fValueOf2, size);
    }

    @Override // X.AbstractC1446660nkW
    public final void LJFF(Object obj, Object obj2, boolean z, int i, int i2) {
        Float fValueOf;
        VideoFileInfo videoFileInfo;
        Float f;
        EnumC995380c0e enumC995380c0e = EnumC995380c0e.SUCCESS;
        float f2 = i2;
        C1434590nR3 c1434590nR3 = this.LJFF;
        Long lValueOf = null;
        if (c1434590nR3 != null && (f = c1434590nR3.LIZIZ) != null) {
            fValueOf = Float.valueOf(f.floatValue() / 1024);
        } else {
            fValueOf = null;
        }
        C1434590nR3 c1434590nR32 = this.LJFF;
        if (c1434590nR32 != null && (videoFileInfo = c1434590nR32.LIZ) != null) {
            lValueOf = Long.valueOf(videoFileInfo.getDuration());
        }
        LJII(enumC995380c0e, f2, fValueOf, lValueOf);
    }
}
