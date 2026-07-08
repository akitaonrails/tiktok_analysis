package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VT1, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VT1 implements InterfaceC1481930ofP {
    public final int LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public boolean LJFF;
    public FileChannel LJI;
    public MappedByteBuffer LJII;
    public boolean LJ = true;
    public final HashMap<String, HashMap<String, String>> LJIIIIZZ = new HashMap<>();
    public int LIZ = 0;

    @Override // X.InterfaceC1481930ofP
    public final void LIZ() {
        if (this.LJII == null) {
            return;
        }
        this.LJFF = false;
        LJIIJ(false);
        MappedByteBuffer mappedByteBuffer = this.LJII;
        if (mappedByteBuffer != null) {
            mappedByteBuffer.rewind();
        }
    }

    public final HashMap<String, HashMap<String, String>> LIZLLL() {
        MappedByteBuffer map;
        if (this.LJFF || !this.LJ || TextUtils.isEmpty(this.LIZLLL)) {
            this.LJ = this.LJ && TextUtils.isEmpty(this.LIZLLL);
            return null;
        }
        try {
            FileChannel channel = new RandomAccessFile(this.LIZLLL, "rw").getChannel();
            this.LJI = channel;
            map = channel.map(FileChannel.MapMode.READ_WRITE, 0L, this.LIZIZ);
            this.LJII = map;
        } catch (IOException | IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            this.LJ = false;
        }
        if (map == null) {
            this.LJ = false;
            return null;
        }
        map.load();
        if (LJIIIZ(LJFF())) {
            this.LJFF = true;
        } else {
            this.LJFF = false;
            MappedByteBuffer mappedByteBuffer = this.LJII;
            if (mappedByteBuffer != null) {
                mappedByteBuffer.rewind();
            }
        }
        return this.LJIIIIZZ;
    }

    public final JSONObject LJ() {
        JSONObject jSONObject = new JSONObject();
        if (this.LJII != null && LJI() >= 128) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 128; i++) {
                try {
                    byte b = this.LJII.get();
                    sb.append((char) b);
                    if (b == 125) {
                        break;
                    }
                } catch (IndexOutOfBoundsException | JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            return new JSONObject(sb.toString());
        }
        return jSONObject;
    }

    public final String LJFF() {
        if (this.LJII == null || this.LJI == null) {
            this.LJ = false;
            return null;
        }
        byte[] bArr = new byte[2];
        try {
            LJII(0);
            this.LJII.get(bArr, 0, 2);
            return new String(bArr);
        } catch (IndexOutOfBoundsException | BufferUnderflowException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final int LJI() {
        MappedByteBuffer mappedByteBuffer = this.LJII;
        if (mappedByteBuffer == null) {
            return -1;
        }
        return mappedByteBuffer.remaining();
    }

    public static String LJIIIIZZ(JSONObject jSONObject) {
        String strJ3 = C786410Ut5.J3(jSONObject);
        StringBuilder sb = new StringBuilder(strJ3);
        for (int iMin = Math.min(strJ3.length(), 128); iMin < 128; iMin += 10) {
            sb.append("0000000000");
        }
        return sb.toString();
    }

    @Override // X.InterfaceC1481930ofP
    public final boolean LIZJ(C0VT3 c0vt3) {
        int i = C0VT2.LIZ[c0vt3.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            return this.LJFF;
        }
        return this.LJ;
    }

    public final int LJII(int i) {
        MappedByteBuffer mappedByteBuffer = this.LJII;
        if (mappedByteBuffer != null && i >= 0) {
            int iPosition = mappedByteBuffer.position();
            this.LJII.position(i);
            return iPosition;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0102, code lost:
    
        r12.LJIIIIZZ.put(r7, r6);
        r2 = true;
        r8 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIIZ(java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0VT1.LJIIIZ(java.lang.String):boolean");
    }

    public final void LJIIJ(boolean z) {
        String str;
        if (this.LJII == null) {
            return;
        }
        int iLJII = LJII(2);
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        try {
            this.LJII.put(str.getBytes(), 0, Math.min(str.length(), 1));
        } catch (IndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (iLJII > 2) {
            LJII(iLJII);
        }
    }

    public C0VT1(String str, int i) {
        this.LIZLLL = str;
        this.LIZIZ = i;
        if (!TextUtils.isEmpty("01")) {
            this.LIZJ = "01";
        } else {
            this.LIZJ = "01";
        }
    }

    public final boolean LJIIJJI(String str, boolean z) {
        int i;
        boolean z2 = false;
        if (!TextUtils.isEmpty(str) && this.LIZ >= 0 && this.LJII != null) {
            int iLJII = LJII(3);
            if (LJI() < 128) {
                return false;
            }
            JSONObject jSONObject = new JSONObject();
            if (z) {
                i = this.LIZ - 1;
            } else {
                i = this.LIZ + 1;
            }
            this.LIZ = i;
            try {
                jSONObject.put("sid", str);
                jSONObject.put("num", this.LIZ);
                this.LJII.put(LJIIIIZZ(jSONObject).getBytes(), 0, 128);
                z2 = true;
            } catch (IndexOutOfBoundsException | BufferUnderflowException | JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (iLJII > 3) {
                LJII(iLJII);
            }
        }
        return z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0130  */
    @Override // X.InterfaceC1481930ofP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(java.lang.String r10, java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0VT1.LIZIZ(java.lang.String, java.lang.String, java.lang.String):void");
    }
}
