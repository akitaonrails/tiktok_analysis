package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import java.util.Map;

/* JADX INFO: renamed from: X.0zNt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1893910zNt extends AbstractC1893900zNs {
    @Override // X.InterfaceC19271510aP
    public final String getName() {
        return "params_parse_handler";
    }

    public C1893910zNt(InterfaceC1879420z0W interfaceC1879420z0W) {
        super(interfaceC1879420z0W);
    }

    @Override // X.InterfaceC19271510aP
    public final boolean LIZIZ(int i, String str) {
        Map map;
        String strLIZIZ = C018G.LIZIZ(str, "schema_type");
        String strLIZIZ2 = C018G.LIZIZ(str, "object_id");
        int i2 = 0;
        if (TextUtils.isEmpty(strLIZIZ)) {
            return false;
        }
        if (TextUtils.isEmpty(strLIZIZ2)) {
            if (CastIntegerProtector.parseInt(strLIZIZ) != 50) {
                return false;
            }
            strLIZIZ2 = "schema_raw_url";
        }
        try {
            i2 = CastIntegerProtector.parseInt(strLIZIZ);
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        this.LIZ = C1900270zY9.LIZ(i2, strLIZIZ2);
        if (i2 == 1) {
            C844470XAv.LIZ.getClass();
            if (((IMainService) ServiceManager.get().getService(IMainService.class)).openAppLinkHandlerV2ActivityClass(C844470XAv.LIZ(), str, "QrCode").booleanValue()) {
                return true;
            }
        }
        InterfaceC1879420z0W interfaceC1879420z0W = this.LIZIZ;
        try {
            map = (Map) new Gson().LJIIIIZZ(C018G.LIZIZ(str, "meta_params"), new TypeToken<Map<String, ? extends Object>>() { // from class: X.00W9
            }.getType());
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            map = null;
        }
        return interfaceC1879420z0W.LIZ(i2, strLIZIZ2, str, map);
    }
}
