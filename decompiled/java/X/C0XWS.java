package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0XWS, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XWS<T> implements InterfaceC1254030ijp {
    public final /* synthetic */ boolean LIZ = false;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ Map<String, String> LIZJ;

    public C0XWS(String str, Map map) {
        this.LIZIZ = str;
        this.LIZJ = map;
    }

    @Override // X.InterfaceC1254030ijp
    public final void LIZ(final C11KY c11ky) {
        AbstractC846040XGw<C846060XGy> abstractC846040XGw = new AbstractC846040XGw<C846060XGy>() { // from class: X.0XWT
            @Override // X.AbstractC846040XGw
            public final void LIZ(C0XGA c0xga) {
                if (c0xga.LIZIZ) {
                    ((C11KY) c11ky).onSuccess(c0xga);
                    return;
                }
                ((C11KY) c11ky).onError(new C0XZJ(c0xga.LJ, null, EnumC852660Xce.LOGIN, EnumC852910Xd3.NONE, null, ""));
            }
        };
        if (this.LIZ) {
            C0XWG.LIZ.getValue().LIZ(this.LIZIZ, this.LIZJ, abstractC846040XGw);
        } else {
            C0XWG.LIZ.getValue().LIZIZ(this.LIZIZ, this.LIZJ, abstractC846040XGw);
        }
    }
}
