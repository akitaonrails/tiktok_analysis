package X;

import android.net.Uri;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS547S0100000_3;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.07uF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2010907uF {
    public static final /* synthetic */ int LIZLLL = 0;
    public final Uri LIZ;
    public String LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZ(EnumC452301pR.NONE, new AwS547S0100000_3(this, 22));

    public final String toString() {
        C2217391BqT c2217391BqT = new C2217391BqT(this) { // from class: X.07uG
            @Override // X.C2217391BqT, X.AbstractC2217321BqM, X.InterfaceC2217311BqL
            public final Object get() {
                return ((C2010907uF) this.receiver).LIZIZ;
            }

            @Override // X.C2217391BqT, X.AbstractC2217321BqM, X.InterfaceC2217291BqJ
            public final void set(Object obj) {
                ((C2010907uF) this.receiver).LIZIZ = (String) obj;
            }
        };
        Object objValueOf = c2217391BqT.get();
        if (objValueOf == null) {
            Uri.Builder builderBuildUpon = this.LIZ.buildUpon();
            builderBuildUpon.clearQuery();
            for (Map.Entry entry : ((Map) this.LIZJ.getValue()).entrySet()) {
                Iterator it2 = ((Iterable) entry.getValue()).iterator();
                while (it2.hasNext()) {
                    builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) it2.next());
                }
            }
            objValueOf = String.valueOf(builderBuildUpon);
            c2217391BqT.set(objValueOf);
        }
        return (String) objValueOf;
    }

    public final String LIZ(String str) {
        List list = (List) ((Map) this.LIZJ.getValue()).get(str);
        if (list != null) {
            return (String) C13LP.LJJJLL(list);
        }
        return null;
    }

    public final void LIZIZ(Object obj) {
        if (obj == null || ((Map) this.LIZJ.getValue()).containsKey("_ec_start_time")) {
            return;
        }
        String string = obj.toString();
        if (a0.LJJJIL(string)) {
            return;
        }
        ((Map) this.LIZJ.getValue()).put("_ec_start_time", Collections.singletonList(string));
        this.LIZIZ = null;
    }

    public C2010907uF(Uri uri, String str) {
        this.LIZ = uri;
        this.LIZIZ = str;
    }

    public final void LIZJ(String str, Object obj) {
        String string;
        if (obj != null) {
            string = obj.toString();
        } else {
            string = null;
        }
        String strLIZ = C1521105xR.LIZ(string);
        if (strLIZ == null) {
            return;
        }
        ((Map) this.LIZJ.getValue()).put(str, Collections.singletonList(strLIZ));
        this.LIZIZ = null;
    }
}
