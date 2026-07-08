package X;

import com.ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.12I5, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12I5 {
    public static final /* synthetic */ int LIZ = 0;

    public static final List<BeautyComposerInfo> LIZ(List<BeautyComposerInfo> list) {
        ArrayList arrayList = new ArrayList();
        for (BeautyComposerInfo beautyComposerInfo : list) {
            if (!Intrinsics.LJFF(beautyComposerInfo.nodePath, "EFFECT_ID_TYPE_FILTER")) {
                arrayList.add(beautyComposerInfo);
            }
        }
        return arrayList;
    }
}
