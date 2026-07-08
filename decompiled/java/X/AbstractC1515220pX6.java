package X;

import com.bytedance.bpea.net3rd.impl.BPEADebugInterceptor;
import com.bytedance.bpea.net3rd.impl.BPEAVerifyInterceptor;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0pX6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1515220pX6 implements InterfaceC846390XIf {
    public final String LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public final List<C09S8> LJ = new ArrayList();
    public final List<AbstractC2343909Gj> LJFF = new ArrayList();

    public abstract C0X8S LJI(List<? extends InterfaceC1904907d9> list);

    public final C0X8S LJFF() {
        return LJI(C839620Wwi.LIZJ ? C1697810uHb.LJIIJJI(new BPEAVerifyInterceptor(this.LIZLLL), BPEADebugInterceptor.LL) : Collections.singletonList(new BPEAVerifyInterceptor(this.LIZLLL)));
    }

    public AbstractC1515220pX6(String str) {
        this.LIZ = str;
    }

    @Override // X.InterfaceC846390XIf
    public final AbstractC1515220pX6 LIZ(boolean z) {
        this.LIZIZ = z;
        return this;
    }

    @Override // X.InterfaceC846390XIf
    public final AbstractC1515220pX6 LIZIZ(boolean z) {
        this.LIZLLL = z;
        return this;
    }

    @Override // X.InterfaceC846390XIf
    public final AbstractC1515220pX6 LIZJ(AbstractC2343909Gj abstractC2343909Gj) {
        ListProtector.add(this.LJFF, 0, abstractC2343909Gj);
        return this;
    }

    @Override // X.InterfaceC846390XIf
    public final AbstractC1515220pX6 LIZLLL(boolean z) {
        this.LIZJ = z;
        return this;
    }

    public final AbstractC1515220pX6 LJ(C09S8 c09s8) {
        ((ArrayList) this.LJ).add(c09s8);
        return this;
    }
}
