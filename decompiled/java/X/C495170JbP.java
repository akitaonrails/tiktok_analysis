package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import com.bytedance.android.livesdk.chatroom.api.AuditInfo;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: X.0JbP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C495170JbP {
    public Long LIZ;
    public Integer LIZIZ;
    public boolean LIZJ;
    public String LIZLLL;
    public String LJ;
    public Long LJFF;
    public final AuditInfo LJI;
    public String LJII;
    public Bitmap LJIIIIZZ;

    public C495170JbP() {
        this(null, null, null, false, null, null, null, null, 511);
    }

    public final Bitmap LIZ() {
        Bitmap bitmap = this.LJIIIIZZ;
        if (bitmap != null && bitmap.isRecycled()) {
            C0K8F c0k8f = C0K8F.LIZ;
            String str = this.LJII;
            c0k8f.getClass();
            byte[] bArrDecode = Base64.decode(str, 0);
            this.LJIIIIZZ = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        }
        return this.LJIIIIZZ;
    }

    public final void LIZIZ(Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        C0K8F.LIZ.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("");
        sbLIZ.append(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0));
        this.LJII = C2188811AlT.LIZIZ(sbLIZ);
        this.LJIIIIZZ = bitmap;
    }

    public C495170JbP(Long l, Bitmap bitmap, Integer num, boolean z, String str, String str2, Long l2, AuditInfo auditInfo, int i) {
        l = (i & 1) != 0 ? null : l;
        bitmap = (i & 2) != 0 ? null : bitmap;
        num = (i & 4) != 0 ? null : num;
        z = (i & 8) != 0 ? false : z;
        str = (i & 16) != 0 ? null : str;
        str2 = (i & 32) != 0 ? null : str2;
        l2 = (i & 64) != 0 ? null : l2;
        auditInfo = (i & 128) != 0 ? null : auditInfo;
        String str3 = (i & 256) != 0 ? "" : null;
        this.LIZ = l;
        this.LIZIZ = num;
        this.LIZJ = z;
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = l2;
        this.LJI = auditInfo;
        this.LJII = str3;
        LIZIZ(bitmap);
    }
}
