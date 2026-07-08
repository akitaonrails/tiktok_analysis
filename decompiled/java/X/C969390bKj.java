package X;

import com.bytedance.android.live.core.monitor.PersistenceReporter;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0bKj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C969390bKj {
    public static final /* synthetic */ int LJII = 0;
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Function1<Object, String> LIZLLL;
    public final Function1<Object, JSONObject> LJ;
    public final Function1<Object, JSONObject> LJFF = null;
    public final InterfaceC969400bKk LJI;

    public static String LIZ(String str, String str2, String str3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str2);
        sbLIZ.append('_');
        sbLIZ.append(str3);
        sbLIZ.append("_{");
        sbLIZ.append(str);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C969390bKj(String str, String str2, String str3, Function1 function1, Function1 function12, PersistenceReporter persistenceReporter) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = function1;
        this.LJ = function12;
        this.LJI = persistenceReporter;
    }
}
