package X;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.frameworks.encryptor.EncryptorUtil;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V4u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C791940V4u {
    public boolean LIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJFF;
    public boolean LJI;
    public InterfaceC792440V6s LJIIJJI;
    public C0V5M LJIILJJIL;
    public C0V5P LJIILL;
    public InterfaceC792020V5c LJIILLIIL;
    public C0V5O LJIIZILJ;
    public C0V5N LJIJI;
    public String LJIJJ;
    public C0VBD LJIL;
    public List<String> LJII = C0V51.LIZ;
    public List<String> LJIIIIZZ = C0V51.LIZJ;
    public List<String> LJIIIZ = C0V51.LJFF;
    public final JSONObject LJIIJ = new JSONObject();
    public final Set<C0V58> LJIIL = new HashSet();
    public long LJIILIIL = 0;
    public final long LJ = 2500;
    public final C0V5W LJIJ = new C0V5X() { // from class: X.0V5W
        @Override // X.C0V5X
        public final byte[] LIZ(int i, byte[] bArr) {
            return EncryptorUtil.LIZIZ(i, bArr);
        }
    };
    public boolean LIZIZ = false;
    public final C804360Vgw LJIJJLI = new InterfaceC794310VDx() { // from class: X.0Vgw
        @Override // X.InterfaceC794310VDx
        public final Enumeration<NetworkInterface> LIZ() {
            return NetworkInterface.getNetworkInterfaces();
        }

        @Override // X.InterfaceC794310VDx
        public final int LIZIZ(Context context) {
            TelephonyManager telephonyManager = (TelephonyManager) C786410Ut5.H2(context, "phone");
            if (telephonyManager != null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    if (!C804370Vgx.LIZ.getAndSet(true)) {
                        C804370Vgx.LIZ().LIZIZ();
                    }
                    int iLIZ = C804370Vgx.LIZ().LIZ();
                    if (C804370Vgx.LIZJ || iLIZ != -1) {
                        return iLIZ;
                    }
                } else {
                    return C2204961BRm.LLIILII(telephonyManager, new C0WZX("dzBzEgAjS8/YVFkiQFyFdhv++N2g8gatBjQpM1SbfOTiGxTm0N88", null));
                }
            }
            return 0;
        }
    };

    public final C791930V4t LIZ() {
        if (TextUtils.isEmpty(this.LJIIJ.optString("aid"))) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("aid");
            sbLIZ.append(" must not be empty");
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (this.LJIIJJI == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("dynamicParams");
            sbLIZ2.append(" must not be null");
            throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ2));
        }
        TextUtils.isEmpty(this.LJIIJ.optString("app_version"));
        TextUtils.isEmpty(this.LJIIJ.optString("update_version_code"));
        TextUtils.isEmpty(this.LJIIJ.optString("device_id"));
        TextUtils.isEmpty(this.LJIIJ.optString("release_build"));
        return new C791930V4t(this);
    }

    public final void LIZIZ(String str, String str2) {
        try {
            this.LJIIJ.put(str, str2);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
