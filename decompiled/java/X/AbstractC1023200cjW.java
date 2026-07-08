package X;

import com.google.gson.Gson;
import com.ss.android.ugc.aweme.AnoleAutomationParamModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cjW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1023200cjW {
    public final Gson LIZ;
    public final ConcurrentHashMap<String, C1023070cjJ> LIZIZ;
    public final ConcurrentHashMap<String, Aweme> LIZJ;
    public final ConcurrentHashMap<String, AwemeRawAd> LIZLLL;
    public final ConcurrentHashMap<String, AnoleAutomationParamModel> LJ;
    public final C603820NmG<String, WeakReference<JSONObject>> LJFF;

    public abstract AbstractC1023090cjL LIZ();

    public AbstractC1023200cjW() {
        C1227904rF.LIZ.getClass();
        this.LIZ = C1227904rF.LIZLLL();
        this.LIZIZ = new ConcurrentHashMap<>();
        this.LIZJ = new ConcurrentHashMap<>();
        this.LIZLLL = new ConcurrentHashMap<>();
        this.LJ = new ConcurrentHashMap<>();
        this.LJFF = new C603820NmG<>(32);
    }

    public final <T> T LIZIZ(Class<T> cls, String str) {
        T t;
        if (Intrinsics.LJFF(cls, Aweme.class)) {
            T t2 = (T) this.LIZJ.get(str);
            if (t2 != null) {
                return t2;
            }
        } else if (Intrinsics.LJFF(cls, AwemeRawAd.class)) {
            T t3 = (T) this.LIZLLL.get(str);
            if (t3 != null) {
                return t3;
            }
        } else if (Intrinsics.LJFF(cls, AnoleAutomationParamModel.class) && (t = (T) this.LJ.get(str)) != null) {
            return t;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0189  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<org.json.JSONObject> LIZJ(X.AbstractC1023220cjY r9, X.C1022420ciG r10) {
        /*
            Method dump skipped, instruction units count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1023200cjW.LIZJ(X.0cjY, X.0ciG):java.util.List");
    }
}
