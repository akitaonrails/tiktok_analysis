package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.08Of, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2109508Of extends C09AY implements Function0<Set<? extends String>> {
    public C2109508Of() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Set<? extends String> invoke() {
        String string;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            C844470XAv.LIZ.getClass();
            Context contextLIZ = C844470XAv.LIZ();
            string = C786410Ut5.V3(contextLIZ.getPackageManager(), contextLIZ.getPackageName(), 128).metaData.getString("com.tiktok.dynamic.apk.fused.modules");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (string != null) {
            if (!(string.length() == 0)) {
                for (String str : a0.LJJLIIIJILLIZJL(string, new String[]{","}, 0, 6)) {
                    if (str.length() > 0) {
                        C01GW c01gw = C08PT.LIZ;
                        if (!(u.LJJIIJZLJL(str, "config.", false) || a0.LJJIIZI(str, ".config.", false))) {
                            linkedHashSet.add(str);
                        }
                    }
                }
                linkedHashSet.remove("base");
                return linkedHashSet;
            }
        }
        return C08CX.INSTANCE;
    }
}
