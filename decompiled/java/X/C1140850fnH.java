package X;

import android.os.Message;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0fnH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1140850fnH implements InterfaceC1140870fnJ {
    public final List<InterfaceC1140870fnJ> LIZ;
    public final Set<String> LIZIZ;

    public C1140850fnH() {
        this.LIZ = new ArrayList();
        this.LIZIZ = new LinkedHashSet();
    }

    public C1140850fnH(List<? extends InterfaceC1140870fnJ> list) {
        ArrayList arrayList = new ArrayList();
        this.LIZ = arrayList;
        this.LIZIZ = new LinkedHashSet();
        arrayList.addAll(list);
    }

    @Override // X.InterfaceC1140870fnJ
    public final void LIZIZ(EnumC1138990fkH enumC1138990fkH) {
        if (!this.LIZIZ.add("onStop")) {
            return;
        }
        Iterator<InterfaceC1140870fnJ> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ(enumC1138990fkH);
        }
    }

    @Override // X.InterfaceC1140870fnJ
    public final void LIZJ(EnumC1138990fkH enumC1138990fkH) {
        if (!this.LIZIZ.add("onPrepare")) {
            return;
        }
        Iterator<InterfaceC1140870fnJ> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZJ(enumC1138990fkH);
        }
    }

    @Override // X.InterfaceC1140870fnJ
    public final void LIZLLL(EnumC1138990fkH enumC1138990fkH) {
        if (!this.LIZIZ.add("onFirstFrame")) {
            return;
        }
        Iterator<InterfaceC1140870fnJ> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZLLL(enumC1138990fkH);
        }
    }

    @Override // X.InterfaceC1140870fnJ
    public final void LJFF(EnumC1138990fkH enumC1138990fkH) {
        if (!this.LIZIZ.add("onPrepared")) {
            return;
        }
        Iterator<InterfaceC1140870fnJ> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJFF(enumC1138990fkH);
        }
    }

    @Override // X.InterfaceC1140870fnJ
    public final void LJII(EnumC1138990fkH enumC1138990fkH) {
        if (!this.LIZIZ.add("onLoad")) {
            return;
        }
        Iterator<InterfaceC1140870fnJ> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJII(enumC1138990fkH);
        }
    }

    @Override // X.InterfaceC1140870fnJ
    public final void LJIIIIZZ(EnumC1138990fkH enumC1138990fkH) {
        if (!this.LIZIZ.add("onLoaded")) {
            return;
        }
        Iterator<InterfaceC1140870fnJ> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJIIIIZZ(enumC1138990fkH);
        }
    }

    @Override // X.InterfaceC1140870fnJ
    public final void LIZ(EnumC1138990fkH enumC1138990fkH, boolean z) {
        if (!this.LIZIZ.add("onSecondFrame")) {
            return;
        }
        Iterator<InterfaceC1140870fnJ> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(enumC1138990fkH, z);
        }
    }

    @Override // X.InterfaceC1140870fnJ
    public final void LJ(EnumC1138990fkH enumC1138990fkH, Message message) {
        Iterator<InterfaceC1140870fnJ> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJ(enumC1138990fkH, message);
        }
    }

    @Override // X.InterfaceC1140870fnJ
    public final void LJI(EnumC1138990fkH enumC1138990fkH, C1141050fnb c1141050fnb) {
        if (this.LIZIZ.add("onError") && this.LIZIZ.add("onComplete")) {
            Iterator<InterfaceC1140870fnJ> it2 = this.LIZ.iterator();
            while (it2.hasNext()) {
                it2.next().LJI(enumC1138990fkH, c1141050fnb);
            }
        }
    }

    @Override // X.InterfaceC1140870fnJ
    public final void LJIIIZ(EnumC1138990fkH enumC1138990fkH, C1138610fjf c1138610fjf) {
        if (this.LIZIZ.add("onComplete") && this.LIZIZ.add("onError")) {
            Iterator it2 = ((ArrayList) this.LIZ).iterator();
            while (it2.hasNext()) {
                ((InterfaceC1140870fnJ) it2.next()).LJIIIZ(enumC1138990fkH, c1138610fjf);
            }
        }
    }
}
