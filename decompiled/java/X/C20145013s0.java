package X;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import com.bytedance.bpea.basics.Cert;
import kotlin.Pair;
import kotlin.jvm.internal.AwS4S2400000_13;

/* JADX INFO: renamed from: X.13s0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20145013s0 implements InterfaceC19865712o3 {
    public final ContentResolver LIZ;
    public final Uri LIZIZ;
    public final Cert LIZJ;
    public boolean LIZLLL = true;

    public C20145013s0(ContentResolver contentResolver, Uri uri, Cert cert) {
        this.LIZ = contentResolver;
        this.LIZIZ = uri;
        this.LIZJ = cert;
    }

    @Override // X.InterfaceC19865712o3
    public final Cursor LIZ(String str, String[] strArr, String[] strArr2) throws C838130WuJ {
        if (this.LIZLLL) {
            this.LIZLLL = false;
            ContentResolver contentResolver = this.LIZ;
            Uri uri = this.LIZIZ;
            C825940Wae c825940Wae = new C825940Wae(this.LIZJ, "contentProvider_query", new String[]{C20145513s5.LIZ(uri)}, Integer.valueOf(EnumC746240TPa.BPEA_ENTRY.getType()), "Collect", 240004);
            C837860Wts.LIZ(c825940Wae, "android/content/ContentResolver", "query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", C2097608Jq.LJIIIIZZ(new Pair("uri", uri), new Pair("projection", strArr), new Pair("selection", str), new Pair("selectionArgs", strArr2), new Pair("sortOrder", "sort_key")));
            return (Cursor) C838080WuE.LIZ(c825940Wae, new AwS4S2400000_13(contentResolver, uri, strArr, str, strArr2, 0));
        }
        throw new C838130WuJ(-1, "contentResolver handler state illegal: can not be reused");
    }
}
