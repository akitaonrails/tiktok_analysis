package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0FKs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C388400FKs {
    public static final List<String> LIZ = C1697810uHb.LJIIJJI("mention", "dividing_line", "auto_caption", "text_font", "text_color", "text_style", "text_alignment", "tts", "text_motion");
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1269));

    public static List LIZ() {
        Object c098200Yq;
        C01GW c01gw = LIZIZ;
        if (((String) c01gw.getValue()).length() == 0) {
            return LIZ;
        }
        try {
            c098200Yq = (List) C08JS.LIZIZ().LJIIIIZZ((String) c01gw.getValue(), new TypeToken<List<? extends String>>() { // from class: X.0FKt
            }.getType());
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        List list = (List) c098200Yq;
        return list == null ? LIZ : list;
    }
}
