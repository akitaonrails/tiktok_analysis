package X;

import android.os.Bundle;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListActivity;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: renamed from: X.040N, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C040N extends C040L {
    public final AddressListActivity LLJ;

    @Override // X.C040L
    public final void LJI() {
    }

    @Override // X.C040L
    public final void LJII() {
    }

    @Override // X.C040L
    public final void LJIIIIZZ() {
    }

    public C040N(AddressListActivity addressListActivity) {
        super(addressListActivity);
        this.LLJ = addressListActivity;
    }

    @Override // X.C040L
    public final void LJ(Bundle bundle) {
        this.LLJ.setContentView(R.layout.aiu);
        C723850SaN.LIZIZ(this.LLJ, new AwS580S0100000_1(this, 770));
    }

    @Override // X.C040L
    public final boolean Pp(Map<String, String> map) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        AssemSupervisor assemSupervisorLIZLLL = C724240Sb0.LIZLLL(this.LLJ);
        Object obj = null;
        if (assemSupervisorLIZLLL != null && (copyOnWriteArrayList = assemSupervisorLIZLLL.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC990303u1) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((InterfaceC990303u1) next).K4(map)) {
                    obj = next;
                    break;
                }
            }
            InterfaceC990303u1 interfaceC990303u1 = (InterfaceC990303u1) obj;
            if (interfaceC990303u1 != null) {
                return interfaceC990303u1.K4(map);
            }
            return false;
        }
        return false;
    }
}
