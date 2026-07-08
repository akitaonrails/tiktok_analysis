package X;

import android.text.Editable;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS16S0010000_1;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS52S1000000_1;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: renamed from: X.03mj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C945103mj extends AbstractC948303nF implements InterfaceViewOnFocusChangeListenerC946003ms {
    public final C948403nG<C945303ml> LLILZ;
    public final MutableLiveData LLILZIL;
    public final MutableLiveData LLILZLL;
    public C944103mZ LLIZ;
    public final C2252331DDr LLIZLLLIL;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C945103mj() {
        C948403nG<C945303ml> c948403nG = new C948403nG<>(new C945303ml(0));
        this.LLILZ = c948403nG;
        this.LLILZIL = (MutableLiveData) c948403nG.LIZJ.getValue();
        this.LLILZLL = (MutableLiveData) new C948403nG(new C945503mn(0)).LIZJ.getValue();
        this.LLIZLLLIL = C09IR.LIZIZ(0, 0, null, 7);
    }

    @Override // X.AbstractC948303nF
    public final <T> Function1<T, T> LIZ(T t) {
        C944103mZ c944103mZ = this.LLIZ;
        if ((t instanceof C945303ml) && c944103mZ != null) {
            return new AwS367S0200000_1((Object) t, c944103mZ, (C944103mZ) 166);
        }
        return new AwS580S0100000_1(t, 368);
    }

    public final void LJFF(AbstractC944703mf abstractC944703mf) {
        C23250099c.LIZLLL((InterfaceC497601wk) this.LLILLL.getValue(), null, null, new C945203mk(this, abstractC944703mf, null), 3);
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        LIZIZ(this.LLILZ, new AwS16S0010000_1(z, 16));
        C945403mm c945403mm = (C945403mm) this;
        if (z) {
            c945403mm.LIZIZ(c945403mm.LLILZ, new AwS52S1000000_1("", 24));
        } else {
            new AwS580S0100000_1(c945403mm, 494).invoke(c945403mm.LLILZ.LIZ);
        }
        C944103mZ c944103mZ = this.LLIZ;
        if (c944103mZ != null) {
            Iterator it2 = ((ArrayList) c944103mZ.LIZ).iterator();
            while (it2.hasNext()) {
                ((InterfaceC944503md) it2.next()).LIZIZ(z);
            }
        }
    }
}
