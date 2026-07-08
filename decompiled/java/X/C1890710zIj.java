package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0zIj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1890710zIj implements InterfaceC1891370zJn {
    public final Set<String> LL;
    public final List<String> LLILLJJLI;
    public List<InterfaceC1890700zIi> LLILLL = new ArrayList();
    public List<InterfaceC1890700zIi> LLILZ = new ArrayList();

    public C1890710zIj(List list, Set set) {
        this.LL = set;
        this.LLILLJJLI = list;
    }

    @Override // X.InterfaceC1891370zJn
    public final void LJZL(int i, int i2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onInserted: position:");
        sbLIZ.append(i);
        sbLIZ.append(", count:");
        sbLIZ.append(i2);
        C2188811AlT.LIZIZ(sbLIZ);
        int i3 = C2187451AjH.LIZ;
        int i4 = i2 + i;
        while (i < i4) {
            if (i < this.LLILZ.size()) {
                this.LL.add(((InterfaceC1890700zIi) ListProtector.get(this.LLILZ, i)).biz().LIZ);
            }
            i++;
        }
    }

    @Override // X.InterfaceC1891370zJn
    public final void LLI(int i, int i2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMoved: fromPosition:");
        sbLIZ.append(i);
        sbLIZ.append(", toPosition:");
        sbLIZ.append(i2);
        C2188811AlT.LIZIZ(sbLIZ);
        int i3 = C2187451AjH.LIZ;
        if (i < this.LLILLL.size()) {
            this.LL.add(((InterfaceC1890700zIi) ListProtector.get(this.LLILLL, i)).biz().LIZ);
        }
        if (i2 < this.LLILZ.size()) {
            this.LL.add(((InterfaceC1890700zIi) ListProtector.get(this.LLILZ, i2)).biz().LIZ);
        }
    }

    @Override // X.InterfaceC1891370zJn
    public final void LLIZLLLIL(int i, int i2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRemoved: position:");
        sbLIZ.append(i);
        sbLIZ.append(", count:");
        sbLIZ.append(i2);
        C2188811AlT.LIZIZ(sbLIZ);
        int i3 = C2187451AjH.LIZ;
        int i4 = i2 + i;
        while (i < i4) {
            if (i < this.LLILLL.size()) {
                this.LL.add(((InterfaceC1890700zIi) ListProtector.get(this.LLILLL, i)).biz().LIZ);
            }
            i++;
        }
    }

    @Override // X.InterfaceC1891370zJn
    public final void LLJJJJJIL(int i, int i2, Object obj) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onChanged: position:");
        sbLIZ.append(i);
        sbLIZ.append(", count:");
        sbLIZ.append(i2);
        C2188811AlT.LIZIZ(sbLIZ);
        int i3 = C2187451AjH.LIZ;
        int i4 = i2 + i;
        while (i < i4) {
            if (i < this.LLILLL.size()) {
                this.LLILLJJLI.add(((InterfaceC1890700zIi) ListProtector.get(this.LLILLL, i)).biz().LIZ);
            }
            i++;
        }
    }
}
