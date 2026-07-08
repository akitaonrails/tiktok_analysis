package X;

import android.util.Base64;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.0wqu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@InterfaceC1294060jmO
public final class C1796580wqu {
    public static final /* synthetic */ int LIZ = 0;

    public static final String LIZ(byte[] bArr) {
        return new String(Base64.encode(bArr, 2), Charsets.UTF_8);
    }
}
