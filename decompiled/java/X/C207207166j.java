package X;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.166j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C207207166j extends AbstractC207210166m {
    public Bitmap LJIIIZ;
    public final boolean LJIIJ;
    public final Bitmap.CompressFormat LJIIJJI;
    public final int LJIIL;
    public final String LJIILIIL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BitmapFile: fileName=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(" fileDir=");
        sbLIZ.append(C771370UNr.LIZJ(this));
        sbLIZ.append(" imageUrl=");
        sbLIZ.append(this.LJIILIIL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC207210166m
    public final void LIZ(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) throws JSONException {
        super.LIZ(str, jSONObject, jSONObject2, jSONObject3);
        if (Intrinsics.LJFF(str, "write")) {
            jSONObject3.putOpt("image_url", this.LJIILIIL);
        }
        jSONObject.putOpt("util_type", "bitmap");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C207207166j(String str, EnumC771350UNp enumC771350UNp, Bitmap bitmap, boolean z, Bitmap.CompressFormat compressFormat, int i, int i2) {
        String str2;
        String str3;
        int i3 = i;
        Bitmap.CompressFormat compressFormat2 = compressFormat;
        if ((i2 & 4) != 0) {
            str2 = "";
        } else {
            str2 = null;
        }
        if ((i2 & 8) != 0) {
            str3 = "";
        } else {
            str3 = null;
        }
        this(str, enumC771350UNp, str2, str3, bitmap, z, (i2 & 64) != 0 ? Bitmap.CompressFormat.JPEG : compressFormat2, (i2 & 128) != 0 ? 100 : i3, (i2 & 512) == 0 ? null : "");
    }

    public C207207166j(String str, EnumC771350UNp enumC771350UNp, String str2, String str3, Bitmap bitmap, boolean z, Bitmap.CompressFormat compressFormat, int i, String str4) {
        super(str, enumC771350UNp, str2, str3);
        this.LJIIIZ = bitmap;
        this.LJIIJ = z;
        this.LJIIJJI = compressFormat;
        this.LJIIL = i;
        this.LJIILIIL = str4;
    }
}
