package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.lyrax.publisher.LyraxPublisherState;
import com.ss.lyrax.stream.LyraxAudioLocalState;
import com.ss.lyrax.stream.LyraxVideoLocalState;

/* JADX INFO: renamed from: X.0jLu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public /* synthetic */ class C1277640jLu {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;
    public static final /* synthetic */ int[] LIZJ;

    static {
        int[] iArr = new int[LyraxPublisherState.values().length];
        try {
            iArr[LyraxPublisherState.CONNECTING.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[LyraxPublisherState.SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
        int[] iArr2 = new int[LyraxAudioLocalState.values().length];
        try {
            iArr2[LyraxAudioLocalState.FIRST_FRAME_ENCODED.ordinal()] = 1;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr2[LyraxAudioLocalState.FIRST_FRAME_SENT.ordinal()] = 2;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        LIZIZ = iArr2;
        int[] iArr3 = new int[LyraxVideoLocalState.values().length];
        try {
            iArr3[LyraxVideoLocalState.FIRST_FRAME_ENCODED.ordinal()] = 1;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            iArr3[LyraxVideoLocalState.FIRST_FRAME_SENT.ordinal()] = 2;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        LIZJ = iArr3;
    }
}
