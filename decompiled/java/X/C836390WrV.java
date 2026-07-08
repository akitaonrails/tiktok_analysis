package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.account.oneclicklogin.storage.EncryptedLoginMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0WrV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C836390WrV {
    public final C01GW LIZ = C452501pT.LIZIZ(new C836410WrX());
    public final C14BS LIZIZ = new C14BS("KEY_LOGIN_METHOD_2");

    public final List<EncryptedLoginMethod> LIZ() {
        List<EncryptedLoginMethod> list;
        boolean z = true;
        if (!(this.LIZIZ.LIZIZ.getValue() != null)) {
            return C13BV.INSTANCE;
        }
        String string = ((Keva) this.LIZ.getValue()).getString("OCL_DATA_ENCRYPTED_1", "");
        if (string != null && string.length() != 0) {
            z = false;
        }
        if (z) {
            list = C13BV.INSTANCE;
        } else {
            try {
                list = (List) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), string, new TypeToken<ArrayList<EncryptedLoginMethod>>() { // from class: X.0WrW
                }.getType());
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
                list = C13BV.INSTANCE;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (EncryptedLoginMethod encryptedLoginMethod : list) {
            String strLIZ = this.LIZIZ.LIZ(encryptedLoginMethod.oneClickLoginToken);
            if (strLIZ != null) {
                arrayList.add(EncryptedLoginMethod.LIZ(encryptedLoginMethod, strLIZ, null, null, 33554367));
            }
        }
        return arrayList;
    }

    public final boolean LIZIZ(List<EncryptedLoginMethod> list) {
        if (this.LIZIZ.LIZIZ.getValue() == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (EncryptedLoginMethod encryptedLoginMethod : list) {
            String strLIZIZ = this.LIZIZ.LIZIZ(encryptedLoginMethod.oneClickLoginToken);
            if (strLIZIZ != null) {
                arrayList.add(EncryptedLoginMethod.LIZ(encryptedLoginMethod, strLIZIZ, null, null, 33554367));
            }
        }
        ((Keva) this.LIZ.getValue()).storeString("OCL_DATA_ENCRYPTED_1", GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), arrayList));
        return true;
    }
}
