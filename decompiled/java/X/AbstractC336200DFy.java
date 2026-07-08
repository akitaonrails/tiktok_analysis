package X;

import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS370S0200000_4;

/* JADX INFO: renamed from: X.0DFy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC336200DFy {
    public final C19EG LIZ;
    public final LinearLayout LIZIZ;
    public List<C0DG0> LIZJ;

    public abstract TextView LIZ();

    public abstract C0DGF LIZIZ(List list, AwS370S0200000_4 awS370S0200000_4);

    public abstract int LIZLLL();

    public abstract void LJ(String str, String str2);

    public boolean LJII(C0D3V c0d3v) {
        return false;
    }

    public int LIZJ() {
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fa  */
    /* JADX WARN: Type inference failed for: r10v4, types: [T, android.view.View, android.view.ViewGroup, android.widget.HorizontalScrollView] */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [T, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(X.C0D3V r31) {
        /*
            Method dump skipped, instruction units count: 1304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC336200DFy.LJFF(X.0D3V):void");
    }

    public final int LJI(int i) {
        TypedValue typedValue = new TypedValue();
        this.LIZ.getTheme().resolveAttribute(i, typedValue, true);
        int i2 = typedValue.type;
        if (28 <= i2 && i2 < 32) {
            return typedValue.data;
        }
        return C446980Hfs.LIZ(this.LIZ, typedValue.resourceId);
    }

    public boolean LJIIIIZZ(C0D3V c0d3v) {
        return c0d3v.skuOptions.isEmpty();
    }

    public AbstractC336200DFy(View view, C19EG c19eg) {
        this.LIZ = c19eg;
        this.LIZIZ = (LinearLayout) view.findViewById(R.id.m7s);
    }
}
