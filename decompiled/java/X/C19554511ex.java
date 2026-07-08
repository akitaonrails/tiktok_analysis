package X;

import Y.ARunnableS27S0210000_29;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.creative.model.SoundEffect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: renamed from: X.11ex, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19554511ex extends C19554411ew {
    public final InterfaceC19554711ez LJI;
    public final int LJII;
    public final ARunnableS27S0210000_29 LJIIIIZZ;
    public final C01GW LJIIIZ;
    public RecyclerView LJIIJ;

    @Override // X.C19554411ew, X.InterfaceC19555911fB
    public final void clear() {
        RecyclerView recyclerView = this.LJIIJ;
        if (recyclerView != null) {
            HandlerHook.viewRemoveCallbacks(recyclerView, this.LJIIIIZZ);
        }
        super.clear();
    }

    @Override // X.C19554411ew, X.InterfaceC19555911fB
    public final void refresh() {
        RecyclerView recyclerView = this.LJIIJ;
        if (recyclerView != null) {
            HandlerHook.viewRemoveCallbacks(recyclerView, this.LJIIIIZZ);
        }
        this.LJI.notifyDataSetChanged();
    }

    @Override // X.C19554411ew, X.InterfaceC19555911fB
    public final void release() {
        RecyclerView recyclerView = this.LJIIJ;
        if (recyclerView != null) {
            HandlerHook.viewRemoveCallbacks(recyclerView, this.LJIIIIZZ);
        }
    }

    @Override // X.C19554411ew
    public final InterfaceC19554711ez LIZJ() {
        return this.LJI;
    }

    @Override // X.C19554411ew
    public final void LIZ(ArrayList<SoundEffect> arrayList) {
        RecyclerView recyclerView = this.LJIIJ;
        if (recyclerView != null) {
            HandlerHook.viewRemoveCallbacks(recyclerView, this.LJIIIIZZ);
        }
        super.LIZ(arrayList);
    }

    @Override // X.C19554411ew
    public final void LIZIZ(RecyclerView recyclerView) {
        super.LIZIZ(recyclerView);
        this.LJIIJ = recyclerView;
    }

    @Override // X.C19554411ew
    public final void LIZLLL(ArrayList<SoundEffect> arrayList) {
        if (arrayList.size() <= this.LJII) {
            super.LIZLLL(arrayList);
            return;
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator<SoundEffect> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(C19554811f0.LIZ(it2.next()));
        }
        this.LIZIZ.clear();
        this.LIZIZ.addAll(arrayList2);
        List<C19556311fF> listSubList = C13BV.INSTANCE;
        int i = this.LJII;
        List listSubList2 = arrayList2;
        if (i > 1) {
            int size = arrayList2.size();
            listSubList2 = arrayList2;
            if (i <= size) {
                listSubList = arrayList2.subList(0, this.LJII - 1);
                listSubList2 = arrayList2.subList(this.LJII - 1, arrayList2.size());
            }
        }
        this.LJI.LJLI(listSubList);
        ((ArrayList) this.LJIIIIZZ.l0).clear();
        ((ArrayList) this.LJIIIIZZ.l0).addAll(listSubList2);
        ARunnableS27S0210000_29 aRunnableS27S0210000_29 = this.LJIIIIZZ;
        aRunnableS27S0210000_29.z2 = false;
        RecyclerView recyclerView = this.LJIIJ;
        if (recyclerView != null) {
            HandlerHook.viewRemoveCallbacks(recyclerView, aRunnableS27S0210000_29);
        }
        RecyclerView recyclerView2 = this.LJIIJ;
        if (recyclerView2 != null) {
            HandlerHook.viewPostDelay(recyclerView2, this.LJIIIIZZ, C19554811f0.LIZIZ);
        }
    }

    public C19554511ex(C19556111fD c19556111fD, int i) {
        super(c19556111fD);
        this.LJI = c19556111fD;
        this.LJII = i;
        this.LJIIIIZZ = new ARunnableS27S0210000_29(this, 1);
        this.LJIIIZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(288));
    }
}
