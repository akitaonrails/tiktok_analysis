package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.account.TTAccountInit;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XZY, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XZY implements InterfaceC2204941BRk {
    public static volatile C0XZY LIZIZ;
    public final Context LIZ;

    public static InterfaceC2204941BRk LJI() {
        if (LIZIZ == null) {
            synchronized (C0XZY.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C0XZY();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }

    public C0XZY() {
        TTAccountInit.LIZ();
        this.LIZ = C848000XOk.LIZ();
    }

    @Override // X.InterfaceC2204941BRk
    public final void LJFF(String str, final C851250XaN c851250XaN) {
        final Context context = this.LIZ;
        C846070XGz c846070XGzLIZIZ = C0XV1.LIZIZ(str, null, null, null, null, null);
        c846070XGzLIZIZ.LIZ = C0XH1.LIZ("/2/user/info/");
        final C845960XGo c845960XGoLIZIZ = c846070XGzLIZIZ.LIZIZ();
        new AbstractC845940XGm<C0XZV>(context, c845960XGoLIZIZ, c851250XaN) { // from class: X.0XZa
            public static final /* synthetic */ int LJIIIZ = 0;
            public final C850800XZe LJIIIIZZ = new C0XZU() { // from class: X.0XZe
            };

            @Override // X.AbstractC845940XGm
            public final void LJ(C0XGA c0xga) {
                C0XG9.LIZIZ("2_user_info", this.LIZJ.LIZ("platform"), null, c0xga, null);
            }

            @Override // X.AbstractC845940XGm
            public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
                C0XZS.LIZIZ(this.LJIIIIZZ, jSONObject);
            }

            @Override // X.AbstractC845940XGm
            public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
                C850800XZe c850800XZe = this.LJIIIIZZ;
                C0XO3 c0xo3 = new C0XO3(jSONObject);
                c0xo3.LIZ();
                c850800XZe.LJFF = c0xo3;
            }

            @Override // X.AbstractC845940XGm
            public final C0XGA LJIIJ(boolean z, C845980XGq c845980XGq) {
                C0XZV c0xzvLIZ = C0XZS.LIZ(this.LJIIIIZZ, z);
                if (z) {
                    c0xzvLIZ.LJIIIZ = this.LJIIIIZZ.LJFF;
                    return c0xzvLIZ;
                }
                C850800XZe c850800XZe = this.LJIIIIZZ;
                c0xzvLIZ.LIZLLL = c850800XZe.LIZ;
                c0xzvLIZ.LJFF = c850800XZe.LIZIZ;
                return c0xzvLIZ;
            }
        }.LJIIIZ();
    }

    @Override // X.InterfaceC2204941BRk
    public final void LJ(String str, long j, Map map, final C851270XaP c851270XaP) {
        final Context context = this.LIZ;
        C846070XGz c846070XGzLIZIZ = C0XV1.LIZIZ("facebook", str, String.valueOf(j), null, "597615686992125", map);
        c846070XGzLIZIZ.LIZ = C0XH1.LIZ("/passport/auth/bind/");
        final C845960XGo c845960XGoLJFF = c846070XGzLIZIZ.LJFF();
        new AbstractC845940XGm<C0XZV>(context, c845960XGoLJFF, c851270XaP) { // from class: X.0XZX
            public static final /* synthetic */ int LJIIIZ = 0;
            public final C850770XZb LJIIIIZZ = new C850770XZb();

            @Override // X.AbstractC845940XGm
            public final void LJ(C0XGA c0xga) {
                String str2;
                if (!TextUtils.isEmpty(c0xga.LIZJ)) {
                    if (c0xga.LIZJ.contains(C0XH1.LIZ("/passport/auth/bind_with_mobile/"))) {
                        str2 = "passport_oauth_bind_with_mobile_click";
                    } else {
                        str2 = "passport_oauth_bind_click";
                    }
                    C0XG9.LIZIZ(str2, this.LIZJ.LIZ("platform"), "auth_bind", c0xga, null);
                }
            }

            @Override // X.AbstractC845940XGm
            public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
                C0XZS.LIZIZ(this.LJIIIIZZ, jSONObject);
                C850770XZb c850770XZb = this.LJIIIIZZ;
                c850770XZb.LJIIIZ = jSONObject2;
                c850770XZb.LIZJ = jSONObject.optString("profile_key");
                C850770XZb c850770XZb2 = this.LJIIIIZZ;
                jSONObject.optString("shark_ticket");
                c850770XZb2.getClass();
            }

            @Override // X.AbstractC845940XGm
            public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
                C850770XZb c850770XZb = this.LJIIIIZZ;
                C0XO3 c0xo3 = new C0XO3(jSONObject);
                c0xo3.LIZ();
                c850770XZb.LJFF = c0xo3;
                this.LJIIIIZZ.LJIIIZ = jSONObject;
            }

            @Override // X.AbstractC845940XGm
            public final C0XGA LJIIJ(boolean z, C845980XGq c845980XGq) {
                C0XZV c0xzvLIZ = C0XZS.LIZ(this.LJIIIIZZ, z);
                if (z) {
                    c0xzvLIZ.LJIIIZ = this.LJIIIIZZ.LJFF;
                } else {
                    C850770XZb c850770XZb = this.LJIIIIZZ;
                    c0xzvLIZ.LIZLLL = c850770XZb.LIZ;
                    c0xzvLIZ.LJFF = c850770XZb.LIZIZ;
                    c0xzvLIZ.LJIILIIL = c850770XZb.LIZJ;
                }
                c0xzvLIZ.LJII = this.LJIIIIZZ.LJIIIZ;
                return c0xzvLIZ;
            }
        }.LJIIIZ();
    }

    @Override // X.InterfaceC2204941BRk
    public final void LIZ(String str, String str2, String str3, long j, Map map, C851240XaM c851240XaM) {
        C845550XEz.LIZ = 6;
        C845550XEz.LIZIZ = str2;
        Context context = this.LIZ;
        C846070XGz c846070XGzLIZIZ = C0XV1.LIZIZ(str2, null, String.valueOf(j), str3, str, map);
        c846070XGzLIZIZ.LIZ = C0XH1.LIZ("/passport/auth/login_only/");
        new C0XZZ(context, c846070XGzLIZIZ.LJFF(), c851240XaM).LJIIIZ();
    }

    @Override // X.InterfaceC2204941BRk
    public final void LIZIZ(String str, String str2, String str3, long j, Map map, C851240XaM c851240XaM) {
        C845550XEz.LIZ = 6;
        C845550XEz.LIZIZ = str2;
        Context context = this.LIZ;
        C846070XGz c846070XGzLIZIZ = C0XV1.LIZIZ(str2, null, String.valueOf(j), str3, str, map);
        c846070XGzLIZIZ.LIZ = C0XH1.LIZ("/passport/auth/login/");
        c846070XGzLIZIZ.LIZ();
        new C0XZW(context, c846070XGzLIZIZ.LJFF(), c851240XaM).LJIIIZ();
    }

    @Override // X.InterfaceC2204941BRk
    public final void LIZJ(String str, String str2, String str3, long j, Map map, C851240XaM c851240XaM) {
        C845550XEz.LIZ = 6;
        C845550XEz.LIZIZ = str2;
        Context context = this.LIZ;
        C846070XGz c846070XGzLIZIZ = C0XV1.LIZIZ(str2, str3, String.valueOf(j), null, str, map);
        c846070XGzLIZIZ.LIZ = C0XH1.LIZ("/passport/auth/login_only/");
        new C0XZZ(context, c846070XGzLIZIZ.LJFF(), c851240XaM).LJIIIZ();
    }

    @Override // X.InterfaceC2204941BRk
    public final void LIZLLL(String str, String str2, String str3, long j, Map map, C851240XaM c851240XaM) {
        C845550XEz.LIZ = 6;
        C845550XEz.LIZIZ = str2;
        Context context = this.LIZ;
        C846070XGz c846070XGzLIZIZ = C0XV1.LIZIZ(str2, str3, String.valueOf(j), null, str, map);
        c846070XGzLIZIZ.LIZ = C0XH1.LIZ("/passport/auth/login/");
        c846070XGzLIZIZ.LIZ();
        new C0XZW(context, c846070XGzLIZIZ.LJFF(), c851240XaM).LJIIIZ();
    }
}
