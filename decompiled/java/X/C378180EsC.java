package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AICreateStylizedType;

/* JADX INFO: renamed from: X.0EsC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public /* synthetic */ class C378180EsC {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[AICreateStylizedType.values().length];
        try {
            iArr[AICreateStylizedType.STYLIZED_I2V.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[AICreateStylizedType.STYLIZED_FL2V.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
