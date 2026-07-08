package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0q1i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1534200q1i extends AbstractC1534170q1f {
    public final String LJI;
    public volatile byte[] LJII;

    @Override // X.AbstractC1534170q1f
    public final boolean LJIIIZ() {
        return true;
    }

    @Override // X.AbstractC1534170q1f
    public final void LJIIJJI() {
    }

    @Override // X.AbstractC1534170q1f
    public final JSONObject LJI() throws JSONException {
        JSONObject jSONObjectLJI = super.LJI();
        jSONObjectLJI.put("buffer_size", this.LJII.length);
        return jSONObjectLJI;
    }

    @Override // X.AbstractC1534170q1f
    public final String LJII() {
        return this.LJI;
    }

    @Override // X.AbstractC1534170q1f
    public final byte[] LJIIL() {
        return this.LJII;
    }

    @Override // X.AbstractC1534170q1f
    public final void LIZJ(int i) {
        this.LJII = Arrays.copyOf(this.LJII, i);
        this.LJ = i;
    }

    @Override // X.AbstractC1534170q1f
    public final byte[] LJ(int i) {
        LIZIZ(i);
        if (this.LIZLLL != this.LJII.length) {
            if (this.LIZLLL > this.LJII.length) {
                C1533880q1C.LIZ(this.LJI, "finish", "unexpected count is larger than the size of buf", null, null);
            }
            this.LJII = Arrays.copyOf(this.LJII, this.LIZLLL);
        }
        this.LJ = i;
        return this.LJII;
    }

    @Override // X.AbstractC1534170q1f
    public final int LIZLLL(InputStream inputStream, int i) throws IOException {
        LIZIZ(i);
        int i2 = 0;
        while (this.LIZLLL < this.LJ) {
            int i3 = inputStream.read(this.LJII, this.LIZLLL, this.LJ - this.LIZLLL);
            if (i3 == -1) {
                if (i2 <= 0) {
                    return -1;
                }
                return i2;
            }
            this.LIZLLL += i3;
            i2 += i3;
        }
        return i2;
    }

    @Override // X.AbstractC1534170q1f
    public final boolean LJIIIIZZ(C0VSJ c0vsj, Function1 function1) throws Throwable {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c0vsj.getPath());
        sbLIZ.append("_tmp");
        C0VSJ c0vsj2 = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
        c0vsj2.delete();
        c0vsj.delete();
        C09BH.LJIIIIZZ(c0vsj2, this.LJII);
        if (!((Boolean) function1.invoke(c0vsj2)).booleanValue()) {
            try {
                C189200o6.m2constructorimpl(Boolean.valueOf(c0vsj2.delete()));
                return false;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return false;
            }
        }
        if (c0vsj2.renameTo(c0vsj)) {
            return true;
        }
        throw new IOException("rename file failed");
    }

    @Override // X.AbstractC1534170q1f
    public final void LJIILIIL(int i, byte b) throws JSONException {
        LIZIZ(i);
        LIZ(i, 1);
        this.LJII[this.LIZLLL] = b;
        this.LIZLLL++;
    }

    public C1534200q1i(int i, AbstractC1533800q14 abstractC1533800q14, int i2) {
        this(new byte[i], 0, abstractC1533800q14, i2);
    }

    public C1534200q1i(byte[] bArr, int i, AbstractC1533800q14 abstractC1533800q14, int i2) {
        super(abstractC1533800q14, i2);
        this.LJI = "ContinuousMeta";
        this.LJII = bArr;
        this.LJ = this.LJII.length;
        this.LIZLLL = i;
    }

    @Override // X.AbstractC1534170q1f
    public final void LJIILJJIL(int i, byte[] bArr, int i2, int i3) throws JSONException {
        LIZIZ(i);
        LIZ(i, i3);
        byte[] bArr2 = this.LJII;
        if (i >= 0 && i2 >= 0 && i2 <= bArr.length && i3 >= 0 && (i2 + i3) - bArr.length <= 0) {
            System.arraycopy(bArr, i2, bArr2, this.LIZLLL, i3);
            this.LIZLLL += i3;
            return;
        }
        throw new IndexOutOfBoundsException("index out of bounds");
    }

    @Override // X.AbstractC1534170q1f
    public final void LJIIJ(int i, byte[] bArr, int i2, int i3, C1534670q2T c1534670q2T) throws JSONException {
        LIZ(i, i3);
        System.arraycopy(this.LJII, i, bArr, i2, i3);
    }
}
