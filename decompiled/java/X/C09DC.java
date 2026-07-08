package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.s;
import com.ss.android.ugc.effectmanager.common.listener.IJsonConverter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* JADX INFO: renamed from: X.09DC, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09DC implements IJsonConverter {
    public final Gson LIZ;

    public C09DC(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.ss.android.ugc.effectmanager.common.listener.IJsonConverter
    public final <T> String convertObjToJson(T t) {
        if (t == null) {
            return null;
        }
        try {
            return this.LIZ.LJIILL(t);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C13RX c13rx = C13RX.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("JsonConvertImpl toJson fail : ");
            sbLIZ.append(e.toString());
            C201955140j.LJII(c13rx, C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.listener.IJsonConverter
    public final <T> T convertJsonToObj(InputStream inputStream, Class<T> cls) throws Throwable {
        C09CU c09cu;
        C09CU c09cu2 = null;
        try {
            try {
                c09cu = new C09CU(new InputStreamReader(inputStream));
            } catch (s e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            T t = (T) this.LIZ.LJ(c09cu, cls);
            try {
                c09cu.close();
                return t;
            } catch (IOException e2) {
                TryCatchGuardChecker.doCheck(e2);
                return t;
            }
        } catch (s e3) {
            e = e3;
            TryCatchGuardChecker.doCheck(e);
            C13RX c13rx = C13RX.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("JsonConvertImpl convert fail : ");
            sbLIZ.append(e.toString());
            C201955140j.LJII(c13rx, C2188811AlT.LIZIZ(sbLIZ));
            throw e;
        } catch (Throwable th2) {
            th = th2;
            c09cu2 = c09cu;
            TryCatchGuardChecker.doCheck(th);
            if (c09cu2 != null) {
                try {
                    c09cu2.close();
                    throw th;
                } catch (IOException e4) {
                    TryCatchGuardChecker.doCheck(e4);
                    throw th;
                }
            }
            throw th;
        }
    }
}
