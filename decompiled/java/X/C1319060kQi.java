package X;

import Y.AsS47S0100000_20;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.tasm.behavior.ui.list.UIList;
import com.lynx.tasm.behavior.ui.view.UIComponent;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0kQi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1319060kQi {
    public final UIList LIZ;
    public final int LIZIZ;
    public final ArrayList<UIComponent> LIZJ = new ArrayList<>();
    public final ArrayList<UIComponent> LIZLLL = new ArrayList<>();
    public final AsS47S0100000_20 LJ;

    public final void LIZJ() {
        C1319030kQf c1319030kQf;
        int i;
        int i2;
        UIList uIList = this.LIZ;
        if (uIList == null || (c1319030kQf = uIList.LLILLL) == null) {
            return;
        }
        JavaOnlyArray javaOnlyArray = c1319030kQf.LLJJIJIL;
        HashMap<String, Integer> map = c1319030kQf.LLJJJ;
        if (javaOnlyArray == null || map == null) {
            return;
        }
        int iLJJJI = uIList.LJJJI();
        int iLJJJJ = this.LIZ.LJJJJ();
        this.LIZLLL.clear();
        this.LIZJ.clear();
        for (int i3 = 1; i3 <= this.LIZIZ; i3++) {
            if (iLJJJI != -1 && (i2 = iLJJJI - i3) >= 0 && i2 < javaOnlyArray.size() && !LIZIZ(javaOnlyArray.getString(i2))) {
                long jLLLI = this.LIZ.LLILLL.LLLI();
                if (LIZLLL(i2)) {
                    this.LIZ.LJJIJIIJI(i2, jLLLI);
                }
            }
            if (iLJJJJ != -1 && (i = iLJJJJ + i3) < javaOnlyArray.size() && i >= 0 && !LIZIZ(javaOnlyArray.getString(i))) {
                long jLLLI2 = this.LIZ.LLILLL.LLLI();
                if (LIZLLL(i)) {
                    this.LIZ.LJJIJIIJI(i, jLLLI2);
                }
            }
        }
    }

    public final boolean LIZIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (int i = 0; i < this.LIZJ.size(); i++) {
            UIComponent uIComponent = (UIComponent) ListProtector.get(this.LIZJ, i);
            if (uIComponent != null && str.equals(uIComponent.LLILLJJLI)) {
                return true;
            }
        }
        for (int i2 = 0; i2 < this.LIZLLL.size(); i2++) {
            UIComponent uIComponent2 = (UIComponent) ListProtector.get(this.LIZLLL, i2);
            if (uIComponent2 != null && str.equals(uIComponent2.LLILLJJLI)) {
                return true;
            }
        }
        return false;
    }

    public final boolean LIZLLL(int i) {
        C1319030kQf c1319030kQf;
        JavaOnlyArray javaOnlyArray;
        UIList uIList = this.LIZ;
        if (uIList != null && (c1319030kQf = uIList.LLILLL) != null && (javaOnlyArray = c1319030kQf.LLJJIJIL) != null) {
            int size = javaOnlyArray.size() - 1;
            if (i >= 0 && i <= size) {
                return true;
            }
        }
        return false;
    }

    public final void LJ(int i) {
        UIList uIList = this.LIZ;
        if (uIList != null && uIList.LLILLL != null && LIZLLL(i)) {
            this.LIZ.LJJIJIIJI(i, this.LIZ.LLILLL.LLLI());
        }
    }

    public C1319060kQi(UIList uIList, int i) {
        T t;
        AsS47S0100000_20 asS47S0100000_20 = new AsS47S0100000_20(this, 0);
        this.LJ = asS47S0100000_20;
        this.LIZ = uIList;
        this.LIZIZ = i;
        if (uIList != null && (t = uIList.mView) != 0) {
            ((RecyclerView) t).addOnScrollListener(asS47S0100000_20);
        }
    }

    public final void LIZ(UIComponent uIComponent, boolean z) {
        UIComponent uIComponent2;
        UIComponent uIComponent3;
        if (this.LIZIZ > 0 && uIComponent != null) {
            if (z) {
                if (this.LIZJ.size() > this.LIZIZ && (uIComponent3 = (UIComponent) ListProtector.remove(this.LIZJ, 0)) != null) {
                    this.LIZ.LLILLL.LLLL(uIComponent3);
                }
                this.LIZJ.add(uIComponent);
                return;
            }
            if (this.LIZLLL.size() > this.LIZIZ && (uIComponent2 = (UIComponent) ListProtector.remove(this.LIZLLL, 0)) != null) {
                this.LIZ.LLILLL.LLLL(uIComponent2);
            }
            this.LIZLLL.add(uIComponent);
        }
    }
}
