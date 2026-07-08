package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.cert.token.TokenCert;
import kotlin.jvm.internal.AwS609S0100000_30;

/* JADX INFO: renamed from: X.13s8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20145813s8 {
    public static CharSequence LIZIZ(Context context, Cert cert) {
        ClipboardManager clipboardManager = (ClipboardManager) C786410Ut5.H2(context, "clipboard");
        C825940Wae c825940WaeLIZ = C20145713s7.LIZ(101804, "clipboard_getText", cert);
        C837860Wts.LIZ(c825940WaeLIZ, "android/content/ClipboardManager", "getText()Ljava/lang/CharSequence;", null);
        return (CharSequence) C838080WuE.LIZ(c825940WaeLIZ, new AwS609S0100000_30(clipboardManager, 251));
    }

    public static boolean LIZJ(Context context, TokenCert tokenCert) {
        ClipboardManager clipboardManager = (ClipboardManager) C786410Ut5.H2(context, "clipboard");
        C825940Wae c825940WaeLIZ = C20145713s7.LIZ(101806, "clipboard_hasText", tokenCert);
        C837860Wts.LIZ(c825940WaeLIZ, "android/content/ClipboardManager", "hasText()Z", null);
        return ((Boolean) C838080WuE.LIZ(c825940WaeLIZ, new AwS609S0100000_30(clipboardManager, 252))).booleanValue();
    }

    public static void LIZ(String str, String str2, Context context, Cert cert) {
        C20145713s7.LIZJ((ClipboardManager) C786410Ut5.H2(context, "clipboard"), ClipData.newPlainText(str, str2), cert);
    }
}
