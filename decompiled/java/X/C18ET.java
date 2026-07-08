package X;

import com.bytedance.android.btm.impl.BtmServiceImpl;
import com.bytedance.android.btm.impl.setting.SchemaRulesModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.lazydata.LazyDataBase;

/* JADX INFO: renamed from: X.18ET, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18ET {
    public static boolean LIZJ;
    public static boolean LIZ = true;
    public static SchemaRulesModel LIZIZ = new SchemaRulesModel();
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C18H6());

    public static void LIZ() {
        String strLIZIZ;
        if (BtmServiceImpl.INSTANCE.getOpenPerfOpt()) {
            LIZ = false;
            SchemaRulesModel schemaRulesModel = LIZIZ;
            if (schemaRulesModel instanceof LazyDataBase) {
                C1972007ny.LIZLLL("btm_pattern_config", "btm_pattern_config", schemaRulesModel, "");
            }
            LIZIZ = schemaRulesModel;
            return;
        }
        C18IP c18ip = C18IP.LIZ;
        c18ip.getClass();
        InterfaceC21259418Ho interfaceC21259418Ho = (InterfaceC21259418Ho) C18IP.LJIIIIZZ.getValue(c18ip, C18IP.LIZIZ[5]);
        if (interfaceC21259418Ho == null || (strLIZIZ = interfaceC21259418Ho.LIZIZ()) == null) {
            return;
        }
        try {
            LIZ = false;
            LIZIZ = (SchemaRulesModel) ((Gson) LIZLLL.getValue()).LJII(strLIZIZ, SchemaRulesModel.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C18CE.LIZ.LJFF(1005, "", null, null, false);
        }
    }
}
