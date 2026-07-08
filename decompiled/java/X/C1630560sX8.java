package X;

import Y.AObserverS227S0100000_25;
import android.view.View;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sX8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1630560sX8 extends RecyclerView.ViewHolder implements InterfaceC1630170sWV {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final MutableLiveData<Boolean> LLILZ;
    public final MutableLiveData<Boolean> LLILZIL;
    public final /* synthetic */ C1630500sX2 LLILZLL;

    @Override // X.InterfaceC1630170sWV
    public final void LLJJIJIL(boolean z) {
        this.LLILZIL.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1630560sX8(C1630500sX2 c1630500sX2, View view) {
        super(view);
        this.LLILZLL = c1630500sX2;
        this.LL = C452501pT.LIZIZ(new AwS569S0100000_25(view, 1159));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS569S0100000_25(this, 1158));
        this.LLILLL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 1160));
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        this.LLILZ = mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>();
        this.LLILZIL = mutableLiveData2;
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        final List listLJIIJJI = C1697810uHb.LJIIJJI(mutableLiveData, mutableLiveData2);
        Iterator it2 = listLJIIJJI.iterator();
        while (it2.hasNext()) {
            mediatorLiveData.addSource((LiveData) it2.next(), new Observer() { // from class: X.00uO
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    List<MutableLiveData<Boolean>> list = listLJIIJJI;
                    boolean z = false;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator<MutableLiveData<Boolean>> it3 = list.iterator();
                        while (it3.hasNext()) {
                            if (it3.next().getValue() == null) {
                                return;
                            }
                        }
                    }
                    MediatorLiveData<Boolean> mediatorLiveData2 = mediatorLiveData;
                    List<MutableLiveData<Boolean>> list2 = listLJIIJJI;
                    if ((list2 instanceof Collection) && list2.isEmpty()) {
                        z = true;
                    } else {
                        Iterator<MutableLiveData<Boolean>> it4 = list2.iterator();
                        while (it4.hasNext()) {
                            if (!Intrinsics.LJFF(it4.next().getValue(), Boolean.TRUE)) {
                                break;
                            }
                        }
                        z = true;
                    }
                    mediatorLiveData2.setValue(Boolean.valueOf(z));
                }
            });
        }
        mediatorLiveData.observeForever(new AObserverS227S0100000_25(this, 148));
    }
}
