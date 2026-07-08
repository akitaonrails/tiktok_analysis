package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import com.bytedance.bpea.basics.Cert;
import kotlin.Pair;
import kotlin.jvm.internal.AwS373S0200000_7;
import kotlin.jvm.internal.AwS609S0100000_30;

/* JADX INFO: renamed from: X.13s7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20145713s7 {
    public static ClipData LIZIZ(ClipboardManager clipboardManager, Cert cert) {
        C825940Wae c825940WaeLIZ = LIZ(101803, "clipboard_getClip", cert);
        C837860Wts.LIZ(c825940WaeLIZ, "android/content/ClipboardManager", "getPrimaryClip()Landroid/content/ClipData;", null);
        return (ClipData) C838080WuE.LIZ(c825940WaeLIZ, new AwS609S0100000_30(clipboardManager, 250));
    }

    public static C825940Wae LIZ(int i, String str, Cert cert) {
        return new C825940Wae(cert, str, new String[]{"clipboard"}, Integer.valueOf(EnumC746240TPa.BPEA_ENTRY.getType()), "Collect", i);
    }

    public static void LIZJ(ClipboardManager clipboardManager, ClipData clipData, Cert cert) {
        C825940Wae c825940WaeLIZ = LIZ(101807, "clipboard_setClip", cert);
        C837860Wts.LIZ(c825940WaeLIZ, "android/content/ClipboardManager", "setPrimaryClip(Landroid/content/ClipData;)V", C2097908Jt.LIZJ(new Pair("clipData", clipData)));
        C838080WuE.LIZ(c825940WaeLIZ, new AwS373S0200000_7(clipboardManager, clipData, 75));
    }
}
