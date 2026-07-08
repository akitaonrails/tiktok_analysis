package X;

import android.view.View;
import android.widget.LinearLayout;
import iyl.i3;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0tFT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1658050tFT implements InterfaceC1891370zJn {
    public final LinearLayout LL;
    public final C1658040tFS LLILLJJLI;
    public List<i3> LLILLL;
    public List<i3> LLILZ;
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1157));

    @Override // X.InterfaceC1891370zJn
    public final void LJZL(int i, int i2) {
        this.LLILLJJLI.LJZL(i, i2);
    }

    @Override // X.InterfaceC1891370zJn
    public final void LLI(int i, int i2) {
        this.LLILLJJLI.LLI(i, i2);
    }

    @Override // X.InterfaceC1891370zJn
    public final void LLIZLLLIL(int i, int i2) {
        this.LLILLJJLI.LLIZLLLIL(i, i2);
    }

    @Override // X.InterfaceC1891370zJn
    public final void LLJJJJJIL(int i, int i2, Object obj) {
        this.LLILLJJLI.LLJJJJJIL(i, i2, obj);
    }

    public final boolean LIZ() {
        boolean zLIZIZ = this.LLILLJJLI.LIZIZ();
        List<i3> list = this.LLILLL;
        boolean z = list == null || list.isEmpty();
        List<i3> list2 = this.LLILZ;
        boolean z2 = list2 == null || list2.isEmpty();
        if (z ^ z2) {
            if (!z2) {
                this.LL.addView((View) this.LLILZIL.getValue());
                return zLIZIZ;
            }
            C786410Ut5.LJJL((View) this.LLILZIL.getValue(), this.LL);
        }
        return zLIZIZ;
    }

    public C1658050tFT(LinearLayout linearLayout, C1658040tFS c1658040tFS) {
        this.LL = linearLayout;
        this.LLILLJJLI = c1658040tFS;
    }

    public final void LIZIZ(List<i3> list, List<i3> list2) {
        this.LLILLL = list;
        this.LLILZ = list2;
        C1658040tFS c1658040tFS = this.LLILLJJLI;
        c1658040tFS.getClass();
        ArrayList arrayList = new ArrayList(list);
        c1658040tFS.LLJ = arrayList;
        c1658040tFS.LLILZ = list2;
        c1658040tFS.LLIZ = arrayList.isEmpty();
        c1658040tFS.LLIZLLLIL = false;
    }
}
