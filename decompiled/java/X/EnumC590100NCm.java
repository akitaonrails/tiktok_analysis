package X;

import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NCm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC590100NCm {
    public static final EnumC590100NCm INS;
    public static final /* synthetic */ EnumC590100NCm[] LLILLL;
    public final C590090NCl LL = new InterfaceC582400Mso() { // from class: X.0NCl
        @Override // X.InterfaceC582400Mso
        public final /* synthetic */ Object LIZ(C581510MrN c581510MrN) {
            return null;
        }

        @Override // X.InterfaceC582400Mso
        public final Object query(String str) {
            FeatureProducer producer = FeatureServiceManager.instance().getProducer("f_performance", 0);
            if (producer == null) {
                return null;
            }
            return producer.getFeature(str, new JSONObject(), "mediabox", (ReturnCode) null);
        }
    };
    public final C590110NCn LLILLJJLI = new C1BC4() { // from class: X.0NCn
        @Override // X.InterfaceC1006670cIr
        public final void LJIIJ(C2189391AmP c2189391AmP, C2189391AmP c2189391AmP2) {
            float f = c2189391AmP.LIZIZ;
            float f2 = c2189391AmP2.LIZIZ;
            if (f != f2) {
                C583130Mtz.LIZ.LIZ(Float.valueOf(f2), "battery_temperature");
            }
        }
    };

    static {
        EnumC590100NCm enumC590100NCm = new EnumC590100NCm();
        INS = enumC590100NCm;
        LLILLL = new EnumC590100NCm[]{enumC590100NCm};
    }

    public static EnumC590100NCm[] values() {
        return (EnumC590100NCm[]) LLILLL.clone();
    }

    public void init() {
        if (C288400BSc.LIZ) {
            C1BCA.LJJIII(this.LLILLJJLI);
            C583140Mu0 c583140Mu0 = C583130Mtz.LIZ;
            C590090NCl c590090NCl = this.LL;
            if (((CopyOnWriteArrayList) c583140Mu0.LIZLLL).contains(c590090NCl)) {
                return;
            }
            ((CopyOnWriteArrayList) c583140Mu0.LIZLLL).add(c590090NCl);
        }
    }

    public static EnumC590100NCm valueOf(String str) {
        return (EnumC590100NCm) C08FF.LIZ(EnumC590100NCm.class, str);
    }
}
