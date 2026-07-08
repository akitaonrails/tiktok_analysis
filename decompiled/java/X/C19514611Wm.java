package X;

import android.content.Context;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.11Wm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19514611Wm {
    public final Cert LIZ;
    public final ArrayList<String> LIZIZ = new ArrayList<>();
    public final List<AbstractC19515011Wq> LIZJ = new ArrayList();
    public WeakReference<InterfaceC19514411Wk> LIZLLL;
    public WeakReference<Context> LJ;
    public InterfaceC19515111Wr LJFF;
    public Map<String, String> LJI;

    public final void LIZIZ() {
        InterfaceC19514411Wk interfaceC19514411Wk;
        WeakReference<InterfaceC19514411Wk> weakReference = this.LIZLLL;
        if (weakReference != null && (interfaceC19514411Wk = weakReference.get()) != null) {
            interfaceC19514411Wk.o();
        }
        InterfaceC19515111Wr interfaceC19515111Wr = this.LJFF;
        if (interfaceC19515111Wr != null) {
            interfaceC19515111Wr.onCanceled();
        }
        ((ArrayList) this.LIZJ).clear();
    }

    public final void LIZJ() {
        InterfaceC19514411Wk interfaceC19514411Wk;
        String[] strArr;
        if (!((ArrayList) this.LIZJ).isEmpty()) {
            AbstractC19515011Wq abstractC19515011Wq = (AbstractC19515011Wq) ListProtector.remove(this.LIZJ, 0);
            C19514611Wm c19514611Wm = abstractC19515011Wq.LIZ;
            if (c19514611Wm == null || (strArr = (String[]) new ArrayList(c19514611Wm.LIZIZ).toArray(new String[0])) == null) {
                strArr = new String[0];
            }
            abstractC19515011Wq.LIZ(c19514611Wm, (String[]) Arrays.copyOf(strArr, strArr.length));
            return;
        }
        WeakReference<InterfaceC19514411Wk> weakReference = this.LIZLLL;
        if (weakReference != null && (interfaceC19514411Wk = weakReference.get()) != null) {
            interfaceC19514411Wk.nA();
        }
        if (C1562740qlk.LIZ) {
            Iterator<AbstractC19515011Wq> it2 = C19514711Wn.LIZJ.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ = null;
            }
            Iterator<AbstractC19515011Wq> it3 = C19514711Wn.LIZLLL.iterator();
            while (it3.hasNext()) {
                it3.next().LIZ = null;
            }
            Iterator<AbstractC19515011Wq> it4 = C19514711Wn.LJ.iterator();
            while (it4.hasNext()) {
                it4.next().LIZ = null;
            }
        }
    }

    public C19514611Wm(Cert cert) {
        this.LIZ = cert;
    }

    public final void LIZ(AbstractC19515011Wq abstractC19515011Wq) {
        abstractC19515011Wq.LIZ = this;
        if (abstractC19515011Wq instanceof AbstractC838380Wui) {
            ListProtector.add(this.LIZJ, 0, abstractC19515011Wq);
        } else {
            ((ArrayList) this.LIZJ).add(abstractC19515011Wq);
        }
    }
}
