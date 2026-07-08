package X;

import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioLauncher;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0HQ4, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HQ4 {
    public static List LIZ(String str, List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            arrayList.add(new Pair(0, list));
        }
        return C1697810uHb.LJIIJJI(new MixStudioLauncher.IdDropdownConfiguration(Collections.singletonList(new Pair(0, Collections.singletonList(str))), arrayList, 0), new MixStudioLauncher.IdDropdownConfiguration(C13BV.INSTANCE, Collections.singletonList(new Pair(1, Collections.singletonList(str))), 0));
    }
}
