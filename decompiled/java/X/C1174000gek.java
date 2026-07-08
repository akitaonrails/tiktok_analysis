package X;

import android.view.View;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.0gek, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1174000gek implements InterfaceC1174010gel {
    public final CopyOnWriteArraySet<InterfaceC1174010gel> LL = new CopyOnWriteArraySet<>();

    @Override // X.InterfaceC1174010gel
    public final void LJFF(InterfaceC1173990gej<?> interfaceC1173990gej) {
        Iterator<InterfaceC1174010gel> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LJFF(interfaceC1173990gej);
        }
    }

    @Override // X.InterfaceC1174010gel
    public final void LJI(InterfaceC1173990gej<?> interfaceC1173990gej) {
        Iterator<InterfaceC1174010gel> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LJI(interfaceC1173990gej);
        }
    }

    @Override // X.InterfaceC1174010gel
    public final void LJII(InterfaceC1173990gej<?> interfaceC1173990gej) {
        Iterator<InterfaceC1174010gel> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LJII(interfaceC1173990gej);
        }
    }

    @Override // X.InterfaceC1174010gel
    public final void LJIIJJI(InterfaceC1173990gej<?> interfaceC1173990gej, BaseComponentData baseComponentData) {
        Iterator<InterfaceC1174010gel> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LJIIJJI(interfaceC1173990gej, baseComponentData);
        }
    }

    @Override // X.InterfaceC1174010gel
    public final void LJJ(InterfaceC1173990gej<?> interfaceC1173990gej, View view) {
        Iterator<InterfaceC1174010gel> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LJJ(interfaceC1173990gej, view);
        }
    }

    @Override // X.InterfaceC1174010gel
    public final void LJJI(InterfaceC1173990gej<?> interfaceC1173990gej, BaseComponentData baseComponentData) {
        Iterator<InterfaceC1174010gel> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LJJI(interfaceC1173990gej, baseComponentData);
        }
    }
}
