package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CaptionModel;

/* JADX INFO: renamed from: X.15zE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public /* synthetic */ class C20699415zE {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[CaptionModel.NoCaptionReasonEnum.values().length];
        try {
            iArr[CaptionModel.NoCaptionReasonEnum.CLA_NO_CAPTION_REASON_NOT_AUTHORIZED.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[CaptionModel.NoCaptionReasonEnum.CLA_NO_CAPTION_REASON_SPEECH_UNRECOGNIZED.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[CaptionModel.NoCaptionReasonEnum.CLA_NO_CAPTION_REASON_LANG_NOT_SUPPORTED.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[CaptionModel.NoCaptionReasonEnum.CLA_NO_CAPTION_REASON_BEING_GENERATED.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        LIZ = iArr;
    }
}
