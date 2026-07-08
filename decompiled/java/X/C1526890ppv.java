package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.bytedance.sync.settings.SettingsV4;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ppv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1526890ppv implements InterfaceC596980NbE {
    public static final C1526910ppx LLILZIL = new AbstractC1526380pp6<C1526890ppv>() { // from class: X.0ppx
        @Override // X.AbstractC1526380pp6
        public final C1526890ppv LIZ(Object[] objArr) {
            return new C1526890ppv((Context) objArr[0]);
        }
    };
    public final Context LL;
    public final C1526900ppw LLILLJJLI = new AbstractC1526380pp6<InterfaceC1525970poR>() { // from class: X.0ppw
        @Override // X.AbstractC1526380pp6
        public final InterfaceC1525970poR LIZ(Object[] objArr) {
            String string;
            SettingsV4 settingsV4 = new SettingsV4();
            try {
                SharedPreferences sharedPreferencesLIZIZ = LIZIZ(new Object[0]);
                if (sharedPreferencesLIZIZ != null && (string = sharedPreferencesLIZIZ.getString("server_settings", null)) != null) {
                    InterfaceC1525970poR interfaceC1525970poR = (InterfaceC1525970poR) new Gson().LJII(string, SettingsV4.class);
                    if (interfaceC1525970poR != null) {
                        return interfaceC1525970poR;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("create settings err: ");
                sbLIZ.append(th);
                C1527890prX.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            }
            return settingsV4;
        }
    };
    public final C1526880ppu LLILLL;
    public final List<InterfaceC596980NbE> LLILZ;

    public final boolean LIZ() {
        SharedPreferences sharedPreferencesLIZIZ = LIZIZ(new Object[0]);
        if (sharedPreferencesLIZIZ != null) {
            return sharedPreferencesLIZIZ.getBoolean("sync_enable", true);
        }
        return true;
    }

    public final InterfaceC1525970poR LIZIZ() {
        return LIZIZ(new Object[0]);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0ppw] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0pp6, X.0ppu] */
    public C1526890ppv(Context context) {
        ?? r1 = new AbstractC1526380pp6<SharedPreferences>() { // from class: X.0ppu
            @Override // X.AbstractC1526380pp6
            public final SharedPreferences LIZ(Object[] objArr) {
                try {
                    return C810670Vr7.LIZJ(this.LIZIZ.LL, 0, "byte_sync_settings");
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    return null;
                }
            }
        };
        this.LLILLL = r1;
        this.LLILZ = new ArrayList();
        this.LL = context;
        r1.LIZIZ(new Object[0]);
    }

    public static C1526890ppv LIZJ(Context context) {
        return LLILZIL.LIZIZ(context);
    }

    public final void LIZLLL(boolean z) {
        SharedPreferences sharedPreferencesLIZIZ = LIZIZ(new Object[0]);
        if (sharedPreferencesLIZIZ != null) {
            sharedPreferencesLIZIZ.edit().putBoolean("sync_enable", z).commit();
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sp is null when set enable ");
        sbLIZ.append(z);
        C1527890prX.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC596980NbE
    public final void LJ(C1525630pnt c1525630pnt) {
        String str = null;
        try {
            byte[] bArr = c1525630pnt.LIZ;
            if (bArr == null) {
                C1526710ppd.LIZJ().LIZIZ(null, "data is null");
                return;
            }
            String str2 = new String(bArr);
            try {
                new JSONObject(str2);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("update local settings : ");
                sbLIZ.append(str2);
                C1527890prX.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                SharedPreferences sharedPreferencesLIZIZ = LIZIZ(new Object[0]);
                if (sharedPreferencesLIZIZ != null) {
                    sharedPreferencesLIZIZ.edit().putString("server_settings", str2).apply();
                }
                synchronized (this.LLILZ) {
                    try {
                        int size = ((ArrayList) this.LLILZ).size();
                        InterfaceC596980NbE[] interfaceC596980NbEArr = new InterfaceC596980NbE[size];
                        ((ArrayList) this.LLILZ).toArray(interfaceC596980NbEArr);
                        for (int i = 0; i < size; i++) {
                            interfaceC596980NbEArr[i].LJ(c1525630pnt);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            } catch (Exception e) {
                e = e;
                str = str2;
                TryCatchGuardChecker.doCheck(e);
                C1526710ppd.LIZJ().LIZIZ(str, Log.getStackTraceString(e));
            }
        } catch (Exception e2) {
            e = e2;
        }
    }
}
