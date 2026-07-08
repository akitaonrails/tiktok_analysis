package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0aLa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C931480aLa extends AbstractC960460b6K<C929360aIA, C931490aLb> {
    public final DataChannel LIZIZ;
    public final LifecycleOwner LIZJ;
    public final C931450aLX LIZLLL;
    public final Function1<Boolean, Unit> LJ;
    public boolean LJFF;
    public final C931570aLj LJI = new InterfaceC931560aLi() { // from class: X.0aLj
        @Override // X.InterfaceC931560aLi
        public final void LIZ() {
            this.LIZ.LJFF = true;
        }

        @Override // X.InterfaceC931560aLi
        public final boolean LIZIZ() {
            return this.LIZ.LJFF;
        }
    };

    @Override // X.C0J8P
    /* JADX INFO: renamed from: LJ */
    public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new C931490aLb(C786410Ut5.Td(layoutInflater, R.layout.heb, viewGroup, false), this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJI, this.LJ);
    }

    @Override // X.C0J8P
    public final void LIZLLL(RecyclerView.ViewHolder viewHolder, Object obj, List list) {
        if (list.isEmpty()) {
            LIZJ(viewHolder, obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0aLj] */
    public C931480aLa(DataChannel dataChannel, LifecycleOwner lifecycleOwner, C931450aLX c931450aLX, C921090a4p c921090a4p) {
        this.LIZIZ = dataChannel;
        this.LIZJ = lifecycleOwner;
        this.LIZLLL = c931450aLX;
        this.LJ = c921090a4p;
    }
}
