package X;

import android.os.Bundle;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS391S0200000_25;

/* JADX INFO: renamed from: X.0nkm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1446820nkm implements InterfaceC1446830nkn {
    public final List<InterfaceC1446830nkn> LIZ = new ArrayList();

    @Override // X.InterfaceC1446830nkn
    public final void LIZ(String str) {
        Iterator<InterfaceC1446830nkn> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(str);
        }
    }

    @Override // X.InterfaceC1446830nkn
    public final void LJ(int i) {
        Iterator<InterfaceC1446830nkn> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJ(i);
        }
    }

    @Override // X.InterfaceC1446830nkn
    public final void LIZJ(List<? extends Effect> list, List<String> list2, List<Integer> list3) {
        Iterator it2 = ((ArrayList) this.LIZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1446830nkn) it2.next()).LIZJ(list, list2, list3);
        }
    }

    @Override // X.InterfaceC1446830nkn
    public final void LIZIZ(int i, String str, String str2, Bundle bundle, Function1<? super Integer, ? extends Effect> function1) {
        Iterator it2 = ((ArrayList) this.LIZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1446830nkn) it2.next()).LIZIZ(i, str, str2, bundle, function1);
        }
    }

    @Override // X.InterfaceC1446830nkn
    public final void LIZLLL(int i, int i2, String str, String str2, Bundle bundle, AwS391S0200000_25 awS391S0200000_25) {
        Iterator it2 = ((ArrayList) this.LIZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1446830nkn) it2.next()).LIZLLL(i, i2, str, str2, bundle, awS391S0200000_25);
        }
    }
}
