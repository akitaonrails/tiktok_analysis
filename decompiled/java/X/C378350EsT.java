package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModelStatus;

/* JADX INFO: renamed from: X.0EsT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public /* synthetic */ class C378350EsT {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EditorProAIGCMediaItemModelStatus.values().length];
        try {
            iArr[EditorProAIGCMediaItemModelStatus.LOADING.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EditorProAIGCMediaItemModelStatus.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
