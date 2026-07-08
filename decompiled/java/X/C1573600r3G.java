package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.series.feed.model.MyListSceneEnum;

/* JADX INFO: renamed from: X.0r3G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public /* synthetic */ class C1573600r3G {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[MyListSceneEnum.values().length];
        try {
            iArr[MyListSceneEnum.MY_LIST_SCENE_COLLECTION_HISTORY.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[MyListSceneEnum.MY_LIST_SCENE_COLLECTION_FAVOURITE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
