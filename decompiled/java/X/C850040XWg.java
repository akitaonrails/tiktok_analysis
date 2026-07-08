package X;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XWg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C850040XWg<T> implements InterfaceC1254030ijp {
    public final /* synthetic */ C0XYD LIZ;
    public final /* synthetic */ boolean LIZIZ = false;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ Map<String, String> LIZLLL;

    public C850040XWg(C0XYD c0xyd, String str, Map map) {
        this.LIZ = c0xyd;
        this.LIZJ = str;
        this.LIZLLL = map;
    }

    @Override // X.InterfaceC1254030ijp
    public final void LIZ(final C11KY c11ky) {
        final C0XYD c0xyd = this.LIZ;
        AbstractC846040XGw<C846060XGy> abstractC846040XGw = new AbstractC846040XGw<C846060XGy>() { // from class: X.0XWf
            @Override // X.AbstractC846040XGw
            public final void LIZ(C0XGA c0xga) {
                C846060XGy c846060XGy = (C846060XGy) c0xga;
                if (c846060XGy.LIZIZ) {
                    ((C11KY) c11ky).onSuccess(c846060XGy);
                    return;
                }
                C0XWW<C846060XGy> c0xww = c11ky;
                C0XYD c0xyd2 = c0xyd;
                int i = c846060XGy.LIZLLL;
                String str = c846060XGy.LJFF;
                EnumC852660Xce enumC852660XceScene = c0xyd2.scene();
                EnumC852910Xd3 enumC852910Xd3LLJJLIIIJLLLLLLLZ = c0xyd2.LLJJLIIIJLLLLLLLZ();
                JSONObject jSONObject = c846060XGy.LJIILJJIL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("detail errorCode=");
                sbLIZ.append(c846060XGy.LJ);
                sbLIZ.append(", detail errorMsg=");
                sbLIZ.append(c846060XGy.LJI);
                ((C11KY) c0xww).onError(new C0XZJ(i, str, enumC852660XceScene, enumC852910Xd3LLJJLIIIJLLLLLLLZ, jSONObject, C2188811AlT.LIZIZ(sbLIZ)));
            }
        };
        this.LIZ.gk(abstractC846040XGw);
        if (this.LIZIZ) {
            this.LIZ.VF().LIZ(this.LIZJ, this.LIZLLL, abstractC846040XGw);
        } else {
            this.LIZ.VF().LIZIZ(this.LIZJ, this.LIZLLL, abstractC846040XGw);
        }
    }
}
