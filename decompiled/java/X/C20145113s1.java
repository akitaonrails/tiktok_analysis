package X;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import com.bytedance.bpea.basics.Cert;
import kotlin.jvm.internal.AwS125S0400000_30;

/* JADX INFO: renamed from: X.13s1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20145113s1 {
    public static Cursor LIZ(ContentResolver contentResolver, Uri uri, Cert cert, C2218451BsB c2218451BsB) {
        C825940Wae c825940Wae = new C825940Wae(cert, "contentProvider_query", new String[]{C20145513s5.LIZ(uri)}, Integer.valueOf(EnumC746240TPa.BPEA_ENTRY.getType()), "Collect", 240004);
        c825940Wae.LIZ(Boolean.TRUE, "isPreCheck");
        return (Cursor) C838080WuE.LIZ(c825940Wae, new AwS125S0400000_30(contentResolver, uri, "", cert, c2218451BsB, 6));
    }
}
