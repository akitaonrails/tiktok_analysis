package X;

import android.graphics.drawable.GradientDrawable;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: renamed from: X.0SKh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C719530SKh {
    public GradientDrawable LIZJ;
    public Integer LIZLLL;
    public Integer LJ;
    public int LJFF;
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(441));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(442));
    public final C0SL1 LJI = new C0SL1();

    public final GradientDrawable LIZ(int i, int i2, String str) {
        GradientDrawable gradientDrawable;
        Integer num;
        Integer num2;
        GradientDrawable gradientDrawable2 = this.LIZJ;
        if (gradientDrawable2 != null && (num = this.LIZLLL) != null && num.intValue() == i && (num2 = this.LJ) != null && num2.intValue() == i2) {
            this.LJFF = 0;
            return gradientDrawable2;
        }
        if (str != null) {
            this.LJI.put(str, new C719540SKi(i, i2));
        }
        if (this.LJFF % 2 == 0) {
            gradientDrawable = (GradientDrawable) this.LIZ.getValue();
        } else {
            gradientDrawable = (GradientDrawable) this.LIZIZ.getValue();
        }
        gradientDrawable.setColors(new int[]{i, i2});
        this.LJFF++;
        this.LIZJ = gradientDrawable;
        this.LIZLLL = Integer.valueOf(i);
        this.LJ = Integer.valueOf(i2);
        return gradientDrawable;
    }
}
