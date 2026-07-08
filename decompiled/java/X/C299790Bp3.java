package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.banner.StandardButtonContainerStruct;
import com.ss.android.ugc.aweme.feed.model.banner.StandardComponentInfo;
import java.util.Map;

/* JADX INFO: renamed from: X.0Bp3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C299790Bp3 {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C299780Bp2());

    public static boolean LIZ() {
        return ((Boolean) LIZ.getValue()).booleanValue();
    }

    public static boolean LIZIZ(Aweme aweme, String str) {
        StandardComponentInfo standardComponentInfo;
        StandardButtonContainerStruct standardButtonContainerStruct;
        if (!((Map) C0BI2.LIZIZ.getValue()).containsKey(str) || aweme == null || (standardComponentInfo = aweme.getStandardComponentInfo()) == null || (standardButtonContainerStruct = standardComponentInfo.buttonContainer) == null || !standardButtonContainerStruct.enableStandardButton || !LIZ()) {
            return false;
        }
        return true;
    }
}
