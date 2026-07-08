package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS230S0300000_21;

/* JADX INFO: renamed from: X.0m1u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public abstract class AbstractC1380560m1u implements InterfaceC1380630m21 {
    public InterfaceC1380630m21 LIZ;
    public final List<InterfaceC1380630m21> LIZIZ = new ArrayList();

    @Override // X.InterfaceC1380630m21
    public final List<InterfaceC1380630m21> LIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1380630m21
    public final void LIZIZ(AwS230S0300000_21 awS230S0300000_21) {
        awS230S0300000_21.invoke(this);
        for (InterfaceC1380630m21 interfaceC1380630m21 : (ArrayList) this.LIZIZ) {
            if (interfaceC1380630m21 != null) {
                interfaceC1380630m21.LIZIZ(awS230S0300000_21);
            }
        }
    }

    public final void LJ(C1380550m1t c1380550m1t, int i) {
        c1380550m1t.LIZ = this;
        if (i == ((ArrayList) this.LIZIZ).size()) {
            ((ArrayList) this.LIZIZ).add(c1380550m1t);
            return;
        }
        if (i < ((ArrayList) this.LIZIZ).size()) {
            ListProtector.set(this.LIZIZ, i, c1380550m1t);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("adoptChild index: ");
        sbLIZ.append(i);
        sbLIZ.append(", children.size: ");
        sbLIZ.append(((ArrayList) this.LIZIZ).size());
        throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
