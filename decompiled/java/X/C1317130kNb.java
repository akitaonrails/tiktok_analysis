package X;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0kNb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1317130kNb extends AbstractC1317190kNh {
    public final CopyOnWriteArrayList<AbstractC1317190kNh> LIZ = new CopyOnWriteArrayList<>();

    @Override // X.AbstractC1317190kNh
    public final void LIZIZ() {
        Iterator<AbstractC1317190kNh> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ();
        }
    }

    @Override // X.AbstractC1317190kNh
    public final void LIZJ() {
        Iterator<AbstractC1317190kNh> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZJ();
        }
    }

    @Override // X.AbstractC1317190kNh
    public final void LIZLLL() {
        Iterator<AbstractC1317190kNh> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZLLL();
        }
    }

    @Override // X.AbstractC1317190kNh
    public final void LJ() {
        Iterator<AbstractC1317190kNh> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJ();
        }
    }

    @Override // X.AbstractC1317190kNh
    public final void LJI() {
        Iterator<AbstractC1317190kNh> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJI();
        }
    }

    @Override // X.AbstractC1317190kNh
    public final void LJIIIIZZ() {
        Iterator<AbstractC1317190kNh> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJIIIIZZ();
        }
        this.LIZ.clear();
    }

    @Override // X.AbstractC1317190kNh
    public final void LJFF(String str) {
        Iterator<AbstractC1317190kNh> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJFF(str);
        }
    }

    @Override // X.AbstractC1317190kNh
    public final void LJII(C1291190jhl c1291190jhl) {
        Iterator<AbstractC1317190kNh> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJII(c1291190jhl);
        }
    }

    @Override // X.AbstractC1317190kNh
    public final void LJIIIZ(Map<String, Object> map) {
        Iterator<AbstractC1317190kNh> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJIIIZ(map);
        }
    }

    @Override // X.AbstractC1317190kNh
    public final void LIZ(String str, JSONObject jSONObject) {
        Iterator<AbstractC1317190kNh> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(str, jSONObject);
        }
    }

    @Override // X.AbstractC1317190kNh
    public final void LJIIJ(String str, Map map, Map map2) {
        Iterator<AbstractC1317190kNh> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJIIJ(str, map, map2);
        }
    }
}
