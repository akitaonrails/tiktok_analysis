package X;

import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS645S0100000_31;

/* JADX INFO: renamed from: X.15m5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20617915m5 {
    public final InterfaceC497601wk LIZ;
    public final Fragment LIZIZ;
    public final Function2<IMContact, Fragment, Unit> LIZJ;
    public final C1231704rr LIZLLL;
    public final Map<String, C20616415lq> LJ;
    public final Object LJFF;
    public AwS575S0100000_31 LJI;

    public final Map<String, EnumC20616515lr> LIZ() {
        LinkedHashMap linkedHashMap;
        synchronized (this.LJFF) {
            try {
                Map<String, C20616415lq> map = this.LJ;
                linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
                for (Object obj : ((LinkedHashMap) map).entrySet()) {
                    linkedHashMap.put(((Map.Entry) obj).getKey(), ((C20616415lq) ((Map.Entry) obj).getValue()).LJI);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return linkedHashMap;
    }

    public C20617915m5(InterfaceC497601wk interfaceC497601wk, Fragment fragment, String str, AwS645S0100000_31 awS645S0100000_31) {
        C1231704rr c1231704rr = new C1231704rr("ContactSelectSend", null, 6);
        this.LIZ = interfaceC497601wk;
        this.LIZIZ = fragment;
        this.LIZJ = awS645S0100000_31;
        this.LIZLLL = c1231704rr;
        this.LJ = new LinkedHashMap();
        this.LJFF = new Object();
    }
}
