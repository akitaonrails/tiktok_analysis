package X;

import android.os.SystemClock;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.Event;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0eOs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1087280eOs<T, M> extends AbstractC1088260eQS<T, M> {
    public final AbstractC1087300eOu<M> LLIZ;

    public abstract T LJIIIIZZ(CopyOnWriteArrayList<C1087320eOw<M>> copyOnWriteArrayList);

    @Override // X.AbstractC1088260eQS, X.AbstractC1088350eQb, X.AbstractC1089300eS8
    public final void release() {
        super.release();
        this.LLIZ.LIZ.clear();
    }

    @Override // X.AbstractC1088260eQS
    public final T LJII(M m) {
        AbstractC1087300eOu<M> abstractC1087300eOu = this.LLIZ;
        abstractC1087300eOu.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C1087320eOw<M> c1087320eOwLIZIZ = abstractC1087300eOu.LIZJ.LIZIZ();
        if (c1087320eOwLIZIZ == null) {
            c1087320eOwLIZIZ = new C1087320eOw<>(jElapsedRealtime, m);
        } else {
            c1087320eOwLIZIZ.LIZ = jElapsedRealtime;
            c1087320eOwLIZIZ.LIZIZ = m;
        }
        abstractC1087300eOu.LIZ.add(c1087320eOwLIZIZ);
        AbstractC1087300eOu<M> abstractC1087300eOu2 = this.LLIZ;
        abstractC1087300eOu2.getClass();
        abstractC1087300eOu2.LIZ(abstractC1087300eOu2.LIZ, SystemClock.elapsedRealtime(), abstractC1087300eOu2.LIZIZ);
        return LJIIIIZZ(abstractC1087300eOu2.LIZ);
    }

    public /* synthetic */ AbstractC1087280eOs(DataChannel dataChannel, AbstractC1084540eKS abstractC1084540eKS, Class cls) {
        this(dataChannel, abstractC1084540eKS, cls, new AbstractC1087300eOu<M>() { // from class: X.0eOt
            @Override // X.AbstractC1087300eOu
            public final void LIZ(List<C1087320eOw<M>> list, long j, long j2) {
                ArrayList<C1087320eOw<M>> arrayList = new ArrayList();
                CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) list;
                for (Object obj : copyOnWriteArrayList) {
                    if (j - ((C1087320eOw) obj).LIZ > j2) {
                        arrayList.add(obj);
                    }
                }
                for (C1087320eOw<M> c1087320eOw : arrayList) {
                    copyOnWriteArrayList.remove(c1087320eOw);
                    c1087320eOw.LIZIZ = null;
                    this.LIZJ.LIZ(c1087320eOw);
                }
            }
        });
    }

    public AbstractC1087280eOs(DataChannel dataChannel, AbstractC1084540eKS<T> abstractC1084540eKS, Class<? extends Event<M>> cls, AbstractC1087300eOu<M> abstractC1087300eOu) {
        super(dataChannel, abstractC1084540eKS, cls);
        this.LLIZ = abstractC1087300eOu;
    }
}
