package X;

import X.AbstractC666100QAu;
import X.InterfaceC614560O8o;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0Sre, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C734560Sre<T extends AbstractC666100QAu, K extends InterfaceC614560O8o> extends C1260870iur<T, K> {
    public List<Object> LLILZ;

    @Override // X.C1260870iur
    public boolean LIZJ(Object... objArr) {
        boolean zLJI = MethodIDManager.LJI(137855);
        this.LLILZ = new ArrayList();
        for (Object obj : objArr) {
            this.LLILZ.add(obj);
        }
        boolean zLIZJ = super.LIZJ(objArr);
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return zLIZJ;
    }
}
