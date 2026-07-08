package X;

import android.util.LongSparseArray;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationResponse;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.13fi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20068813fi {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(AndroidContentCaptureManager androidContentCaptureManager, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        C20071413g8 c20071413g8LIZIZ;
        C20068213fc c20068213fc;
        C1697110uGT c1697110uGT;
        Function1 function1;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            long jKeyAt = longSparseArray.keyAt(i);
            ViewTranslationResponse viewTranslationResponse = (ViewTranslationResponse) longSparseArray.get(jKeyAt);
            if (viewTranslationResponse != null && (value = viewTranslationResponse.getValue("android:text")) != null && (text = value.getText()) != null && (c20071413g8LIZIZ = androidContentCaptureManager.LIZJ().LIZIZ((int) jKeyAt)) != null && (c20068213fc = c20071413g8LIZIZ.LIZ) != null && (c1697110uGT = (C1697110uGT) C20069413fo.LIZ(c20068213fc.LIZLLL, C1694480uCE.LJIIJ)) != null && (function1 = (Function1) c1697110uGT.LIZIZ) != null) {
                function1.invoke(new C1692220u8a(text.toString()));
            }
        }
    }
}
