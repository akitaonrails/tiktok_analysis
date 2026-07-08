package X;

import android.content.Context;
import com.bytedance.tux.drawable.TuxIconDrawable;
import java.util.Map;

/* JADX INFO: renamed from: X.0GdJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C419910GdJ {
    public int LIZ;
    public int LIZIZ = -1;
    public int LIZJ = -1;
    public Integer LIZLLL;
    public Integer LJ;
    public boolean LJFF;
    public CharSequence LJI;

    public final C419910GdJ LIZJ() {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = this.LIZ;
        c419910GdJ.LIZIZ = this.LIZIZ;
        c419910GdJ.LIZJ = this.LIZJ;
        c419910GdJ.LIZLLL = this.LIZLLL;
        c419910GdJ.LJ = this.LJ;
        c419910GdJ.LJFF = this.LJFF;
        c419910GdJ.LJI = this.LJI;
        return c419910GdJ;
    }

    public final TuxIconDrawable LIZ(Context context) {
        int iIntValue;
        Integer num;
        Integer numValueOf = Integer.valueOf(this.LIZ);
        if (numValueOf != null) {
            iIntValue = numValueOf.intValue();
            Map<Integer, Integer> map = C00HG.LIZ.get(Integer.valueOf(iIntValue));
            if (map != null && (num = map.get(Integer.valueOf(((Number) C264980Aa0.LIZ.getValue()).intValue()))) != null) {
                iIntValue = num.intValue();
            }
        } else {
            iIntValue = 0;
        }
        TuxIconDrawable tuxIconDrawable = new TuxIconDrawable(context, iIntValue);
        int i = this.LIZIZ;
        if (i >= 0) {
            tuxIconDrawable.LJII(i);
        }
        int i2 = this.LIZJ;
        if (i2 >= 0) {
            tuxIconDrawable.LJ(i2);
        }
        Integer num2 = this.LIZLLL;
        if (num2 != null) {
            tuxIconDrawable.LJFF(num2.intValue());
        }
        Integer num3 = this.LJ;
        if (num3 != null) {
            tuxIconDrawable.LJI(num3.intValue(), context);
        }
        tuxIconDrawable.LIZLLL(this.LJFF);
        tuxIconDrawable.LJIILLIIL = this.LJI;
        return tuxIconDrawable;
    }

    public final C419890GdH LIZIZ(int i, Context context) {
        TuxIconDrawable tuxIconDrawableLIZ = LIZ(context);
        tuxIconDrawableLIZ.setBounds(0, 0, tuxIconDrawableLIZ.LIZJ(), tuxIconDrawableLIZ.LIZIZ());
        return new C419890GdH(tuxIconDrawableLIZ, i);
    }
}
