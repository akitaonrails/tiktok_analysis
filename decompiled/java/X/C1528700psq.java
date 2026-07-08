package X;

import java.io.File;
import java.io.InputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0psq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1528700psq extends AbstractC1533800q14 {
    public final File LL;

    @Override // X.AbstractC1533800q14
    public final byte[] LJII() {
        return null;
    }

    @Override // X.AbstractC1533800q14
    public final String toString() {
        return "FileDataProvider";
    }

    @Override // X.AbstractC1533800q14
    public final Integer LIZIZ() {
        return Integer.valueOf((int) this.LL.length());
    }

    @Override // X.AbstractC1533800q14
    public final JSONObject LIZLLL() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("file", this.LL.getAbsolutePath());
        return jSONObject;
    }

    @Override // X.AbstractC1533800q14
    public final boolean LJI() {
        return this.LL.isFile();
    }

    @Override // X.AbstractC1533800q14
    public final File LJIILL() {
        File file = this.LL;
        if (file.isFile()) {
            return file;
        }
        return null;
    }

    @Override // X.AbstractC1533800q14
    public final InputStream LJIILLIIL() {
        return new C0VSP(this.LL);
    }

    public C1528700psq(File file) {
        this.LL = file;
    }
}
