package X;

import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qGb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1543430qGb implements InterfaceC1543370qGV {
    public final /* synthetic */ InterfaceC1543380qGW LIZ;
    public final /* synthetic */ Iterator<Map.Entry<String, InterfaceC1543620qGu>> LIZIZ;
    public final /* synthetic */ C1543540qGm LIZJ;
    public final /* synthetic */ C1543190qGD LIZLLL;
    public final /* synthetic */ C1543910qHN LJ;

    @Override // X.InterfaceC1543380qGW
    public final void LIZIZ(Object obj) {
        this.LIZ.LIZIZ(obj);
    }

    @Override // X.InterfaceC1543370qGV
    public final void LIZJ(EnumC993810by7 enumC993810by7) throws JSONException {
        int i = C993820by8.LIZ[enumC993810by7.ordinal()];
        if (i != 1) {
            if (i == 2) {
                if (this.LIZIZ.hasNext()) {
                    InterfaceC1543620qGu value = this.LIZIZ.next().getValue();
                    C1543540qGm c1543540qGm = this.LIZJ;
                    C1543190qGD c1543190qGD = this.LIZLLL;
                    C1543910qHN c1543910qHN = this.LJ;
                    InterfaceC1543380qGW interfaceC1543380qGW = this.LIZ;
                    Iterator<Map.Entry<String, InterfaceC1543620qGu>> it2 = this.LIZIZ;
                    c1543540qGm.getClass();
                    c1543190qGD.LIZLLL.LJIIIIZZ(c1543190qGD, c1543910qHN);
                    value.LIZLLL(c1543910qHN, new C1543430qGb(interfaceC1543380qGW, it2, c1543540qGm, c1543190qGD, c1543910qHN));
                    c1543190qGD.LIZLLL.LJII(c1543190qGD, c1543910qHN);
                    return;
                }
                C1543400qGY.LIZ(this.LIZ);
                return;
            }
            throw new C1954807lC();
        }
        InterfaceC1543380qGW interfaceC1543380qGW2 = this.LIZ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", -1);
        jSONObject.put("data", new JSONObject());
        jSONObject.put("msg", "The URL is not authorized to call this JSBridge method");
        interfaceC1543380qGW2.LIZIZ(jSONObject);
    }

    @Override // X.InterfaceC1543370qGV
    public final void LIZ(Object obj, String str) {
        Iterator<AbstractC1543580qGq> it2 = this.LIZLLL.LJIIJ.iterator();
        while (it2.hasNext()) {
            it2.next().LJIIIZ(obj, str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1543430qGb(InterfaceC1543380qGW interfaceC1543380qGW, Iterator<? extends Map.Entry<String, InterfaceC1543620qGu>> it2, C1543540qGm c1543540qGm, C1543190qGD c1543190qGD, C1543910qHN c1543910qHN) {
        this.LIZ = interfaceC1543380qGW;
        this.LIZIZ = it2;
        this.LIZJ = c1543540qGm;
        this.LIZLLL = c1543190qGD;
        this.LJ = c1543910qHN;
    }
}
