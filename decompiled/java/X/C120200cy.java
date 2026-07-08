package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Map;

/* JADX INFO: renamed from: X.00cy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C120200cy {
    public static final C01GW LIZ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(170));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(169));

    public static final int LIZ(String str) {
        Integer num = (Integer) ((Map) LIZIZ.getValue()).get(str);
        if (num != null) {
            return num.intValue();
        }
        return LSPassThroughRecordSizeConfig.DEFAULT;
    }
}
