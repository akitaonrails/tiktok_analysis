package X;

import android.view.View;
import com.bytedance.hybrid.spark.raven.component.BaseComponentData;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.0gLB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1161870gLB implements InterfaceC1161880gLC {
    public final CopyOnWriteArraySet<InterfaceC1161880gLC> LIZ = new CopyOnWriteArraySet<>();

    @Override // X.InterfaceC1161880gLC
    public final void LIZIZ(InterfaceC1161810gL5<?> interfaceC1161810gL5) {
        Iterator<InterfaceC1161880gLC> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ(interfaceC1161810gL5);
        }
    }

    @Override // X.InterfaceC1161880gLC
    public final void LIZJ(InterfaceC1161810gL5<?> interfaceC1161810gL5) {
        Iterator<InterfaceC1161880gLC> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZJ(interfaceC1161810gL5);
        }
    }

    @Override // X.InterfaceC1161880gLC
    public final void LJFF(InterfaceC1161810gL5<?> interfaceC1161810gL5) {
        Iterator<InterfaceC1161880gLC> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJFF(interfaceC1161810gL5);
        }
    }

    @Override // X.InterfaceC1161880gLC
    public final void LIZ(InterfaceC1161810gL5<?> interfaceC1161810gL5, BaseComponentData baseComponentData) {
        Iterator<InterfaceC1161880gLC> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(interfaceC1161810gL5, baseComponentData);
        }
    }

    @Override // X.InterfaceC1161880gLC
    public final void LIZLLL(InterfaceC1161810gL5<?> interfaceC1161810gL5, BaseComponentData baseComponentData) {
        Iterator<InterfaceC1161880gLC> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZLLL(interfaceC1161810gL5, baseComponentData);
        }
    }

    @Override // X.InterfaceC1161880gLC
    public final void LJ(InterfaceC1161810gL5<?> interfaceC1161810gL5, View view) {
        Iterator<InterfaceC1161880gLC> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJ(interfaceC1161810gL5, view);
        }
    }
}
