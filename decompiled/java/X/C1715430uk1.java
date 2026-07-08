package X;

import com.ss.android.ugc.aweme.verify.ocr.OCRVerifyViewModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uk1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1715430uk1 {
    public static boolean LIZ(String str) {
        if (Intrinsics.LJFF(str, "use_photos")) {
            boolean z = OCRVerifyViewModel.LLJI;
            OCRVerifyViewModel.LLJI = true;
            return z;
        }
        if (Intrinsics.LJFF(str, "verify_now")) {
            boolean z2 = OCRVerifyViewModel.LLJIJIL;
            OCRVerifyViewModel.LLJIJIL = true;
            return z2;
        }
        return false;
    }
}
