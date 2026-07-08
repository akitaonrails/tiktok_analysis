package X;

import android.content.res.TypedArray;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS283S0000000_35;
import kotlin.jvm.internal.AwS614S0100000_35;

/* JADX INFO: renamed from: X.1DYy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2257861DYy extends AbstractC2257761DYo {
    public C12KV LIZJ;
    public C12KV LIZLLL;
    public String LJ;
    public String LJFF;

    @Override // X.AbstractC2257761DYo
    public final void LIZ(C12KZ c12kz) {
        String str = null;
        TypedArray typedArrayObtainStyledAttributes = c12kz.getContext().obtainStyledAttributes(null, R$styleable.TuxWheelPicker, R.attr.z9, 0);
        String strXd = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxWheelPicker__tux_hourPickerContentDescription);
        String str2 = "";
        if (strXd == null) {
            strXd = "";
        }
        this.LJ = strXd;
        String strXd2 = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxWheelPicker__tux_minutePickerContentDescription);
        if (strXd2 != null) {
            str2 = strXd2;
        }
        this.LJFF = str2;
        typedArrayObtainStyledAttributes.recycle();
        C786410Ut5.LJJJJLL(c12kz);
        c12kz.LIZIZ();
        C12KV c12kvLIZ = c12kz.LIZ();
        c12kz.LIZIZ();
        C12KV c12kvLIZ2 = c12kz.LIZ();
        c12kz.LIZIZ();
        AbstractC2257761DYo.LIZJ(C1697810uHb.LJIIJJI(c12kvLIZ, c12kvLIZ2), C1697810uHb.LJIILJJIL(new Pair(AFwS283S0000000_35.get$arr$(182), new AwS614S0100000_35(this, 192)), new Pair(AFwS283S0000000_35.get$arr$(183), new AwS614S0100000_35(this, 193))));
        C12KV c12kv = this.LIZJ;
        if (c12kv == null) {
            c12kv = null;
        }
        String str3 = this.LJ;
        if (str3 == null) {
            str3 = null;
        }
        c12kv.setContentDescription(str3);
        C12KV c12kv2 = this.LIZLLL;
        if (c12kv2 == null) {
            c12kv2 = null;
        }
        String str4 = this.LJFF;
        if (str4 != null) {
            str = str4;
        }
        c12kv2.setContentDescription(str);
    }

    @Override // X.AbstractC2257761DYo
    public final void LJIIJJI(C2257781DYq c2257781DYq) {
        C12KV c12kv = this.LIZJ;
        C12KV c12kv2 = null;
        if (c12kv == null) {
            c12kv = null;
        }
        c12kv.setLevel(0);
        C12KV c12kv3 = this.LIZJ;
        if (c12kv3 == null) {
            c12kv3 = null;
        }
        c12kv3.setCallback(c2257781DYq);
        C12KV c12kv4 = this.LIZLLL;
        if (c12kv4 == null) {
            c12kv4 = null;
        }
        c12kv4.setLevel(1);
        C12KV c12kv5 = this.LIZLLL;
        if (c12kv5 != null) {
            c12kv2 = c12kv5;
        }
        c12kv2.setCallback(c2257781DYq);
    }

    @Override // X.AbstractC2257761DYo
    public final long LJIILIIL(int i, long j, Object obj) {
        LJIIIZ().setTimeInMillis(j);
        if (i != 0) {
            if (i == 1) {
                LJIIIZ().set(12, ((Number) obj).intValue());
            }
        } else {
            C1DZ5 c1dz5 = (C1DZ5) obj;
            LJIIJ().setTimeInMillis(c1dz5.LIZIZ);
            LJIIIZ().set(1, LJIIJ().get(1));
            LJIIIZ().set(2, LJIIJ().get(2));
            LJIIIZ().set(5, LJIIJ().get(5));
            LJIIIZ().set(11, c1dz5.LIZ);
        }
        return LJIIIZ().getTimeInMillis();
    }

    @Override // X.AbstractC2257761DYo
    public final long LJII(int i, long j, long j2, long j3) {
        return AbstractC2257761DYo.LIZLLL(LJIIIZ(), j, j2, j3, i);
    }

    @Override // X.AbstractC2257761DYo
    public final void LIZIZ(int i, int i2, long j, long j2, long j3) {
        boolean z;
        LJIIIZ().setTimeInMillis(j3);
        int i3 = 11;
        int i4 = LJIIIZ().get(11);
        int i5 = LJIIIZ().get(12);
        LJIIIZ().setTimeInMillis(j);
        int i6 = LJIIIZ().get(11);
        int i7 = LJIIIZ().get(12);
        LJIIJ().setTimeInMillis(j2);
        int i8 = LJIIJ().get(11);
        int i9 = LJIIJ().get(12);
        if (i < 0) {
            ArrayList<C1DZ5> arrayList = new ArrayList();
            arrayList.add(new C1DZ5(i6, j));
            LJIIIZ().add(11, 1);
            while (true) {
                if (LJIIIZ().before(LJIIJ())) {
                    int i10 = LJIIIZ().get(i3);
                    if (i10 == i6) {
                        z = true;
                        break;
                    } else {
                        arrayList.add(new C1DZ5(i10, LJIIIZ().getTimeInMillis()));
                        LJIIIZ().add(11, 1);
                        i3 = 11;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (((C1DZ5) C13LP.LJJLIIIJJI(arrayList)).LIZ != i8 && !z) {
                arrayList.add(new C1DZ5(i8, LJIIJ().getTimeInMillis()));
            }
            LJIIIZ().setTimeInMillis(j3);
            C12KV c12kv = this.LIZJ;
            if (c12kv == null) {
                c12kv = null;
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            for (C1DZ5 c1dz5 : arrayList) {
                arrayList2.add(new C12KY(c1dz5, String.valueOf(c1dz5.LIZ)));
            }
            c12kv.LIZLLL(arrayList2, null);
            C12KV c12kv2 = this.LIZJ;
            if (c12kv2 == null) {
                c12kv2 = null;
            }
            c12kv2.setCurrentFocusItem$tux_theme_release(new C1DZ5(i4, j3));
        } else if (i >= 1) {
            return;
        }
        LJIIIZ().setTimeInMillis(j3);
        int actualMinimum = LJIIIZ().getActualMinimum(12);
        int actualMaximum = LJIIIZ().getActualMaximum(12);
        if (i4 != i6) {
            i7 = actualMinimum;
        }
        if (i4 != i8) {
            i9 = actualMaximum;
        }
        Pair pairLJIIL = AbstractC2257761DYo.LJIIL(i2, i7, i9, i5);
        C1846520y9S c1846520y9S = (C1846520y9S) pairLJIIL.getFirst();
        int iIntValue = ((Number) pairLJIIL.getSecond()).intValue();
        C12KV c12kv3 = this.LIZLLL;
        if (c12kv3 == null) {
            c12kv3 = null;
        }
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(c1846520y9S, 10));
        Iterator<Integer> it2 = c1846520y9S.iterator();
        while (it2.hasNext()) {
            int iNextInt = ((AbstractC2098408Jy) it2).nextInt();
            arrayList3.add(new C12KY(Integer.valueOf(iNextInt), String.valueOf(iNextInt)));
        }
        C12KV c12kv4 = null;
        c12kv3.LIZLLL(arrayList3, null);
        C12KV c12kv5 = this.LIZLLL;
        if (c12kv5 != null) {
            c12kv4 = c12kv5;
        }
        c12kv4.setCurrentFocusItem$tux_theme_release(Integer.valueOf(iIntValue));
    }
}
