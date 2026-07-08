package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.creative.model.SoundEffect;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: renamed from: X.11ew, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19554411ew implements InterfaceC19555911fB {
    public final InterfaceC19554711ez LIZ;
    public int LIZLLL;
    public final ArrayList<C19556311fF> LIZIZ = new ArrayList<>();
    public boolean LIZJ = true;
    public boolean LJ = true;
    public final C01GW LJFF = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(287));

    @Override // X.InterfaceC19555911fB
    public void clear() {
        this.LIZLLL = 0;
        LIZJ().clearData();
        LIZJ().notifyDataSetChanged();
    }

    @Override // X.InterfaceC19555911fB
    public void release() {
    }

    public final boolean LJ() {
        return this.LIZJ || this.LIZLLL == 0;
    }

    @Override // X.InterfaceC19555911fB
    public void refresh() {
        LIZJ().notifyDataSetChanged();
    }

    public InterfaceC19554711ez LIZJ() {
        return this.LIZ;
    }

    public C19554411ew(C19556111fD c19556111fD) {
        this.LIZ = c19556111fD;
    }

    public void LIZ(ArrayList<SoundEffect> arrayList) {
        ArrayList<C19556311fF> arrayList2 = this.LIZIZ;
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator<SoundEffect> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(C19554811f0.LIZ(it2.next()));
        }
        arrayList2.addAll(arrayList3);
        LIZJ().LLJZIJLIL(this.LIZIZ);
        if (this.LJ) {
            LIZJ().resetLoadMoreState();
        }
    }

    public void LIZIZ(RecyclerView recyclerView) {
        LIZJ().LLJ(recyclerView);
    }

    public void LIZLLL(ArrayList<SoundEffect> arrayList) {
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator<SoundEffect> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(C19554811f0.LIZ(it2.next()));
        }
        this.LIZIZ.clear();
        this.LIZIZ.addAll(arrayList2);
        LIZJ().LJLI(arrayList2);
    }
}
