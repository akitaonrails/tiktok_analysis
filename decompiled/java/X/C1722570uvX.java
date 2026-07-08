package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0uvX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1722570uvX implements InterfaceC1722680uvi {
    public final C1722580uvY LIZ;
    public final Map<Integer, C1722590uvZ> LIZJ;
    public final C1699650uKZ LIZIZ = new C1699650uKZ();
    public final List<String> LIZLLL = new ArrayList();

    @Override // X.InterfaceC1722680uvi
    public final boolean LIZ() {
        C1699650uKZ c1699650uKZ = this.LIZIZ;
        return c1699650uKZ.LIZ.length() > 0 && c1699650uKZ.LIZIZ.length() > 0;
    }

    public final void LJIIIIZZ() {
        try {
            this.LIZ.close();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.InterfaceC1722680uvi
    public final C1722580uvY LJFF() {
        return this.LIZ;
    }

    public C1722570uvX(C1722580uvY c1722580uvY) {
        this.LIZ = c1722580uvY;
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(1) % 100;
        int i2 = calendar.get(2) + 1;
        int i3 = calendar.get(5);
        byte[] bArr = {0, 0, 0, 1};
        byte[] bArr2 = {8, 64};
        byte[] bArr3 = {2};
        EnumC1723100uwO enumC1723100uwO = EnumC1723100uwO.BINARY;
        EnumC1723100uwO enumC1723100uwO2 = EnumC1723100uwO.NUMERIC;
        this.LIZJ = C2097608Jq.LJIIJ(new Pair(40768, new C1722590uvZ(enumC1723100uwO, new byte[]{66, 0, -16, -13, -1})), new Pair(129, new C1722590uvZ(enumC1723100uwO, bArr)), new Pair(40762, new C1722590uvZ(enumC1723100uwO, bArr)), new Pair(40706, new C1722590uvZ(enumC1723100uwO2, new byte[]{0, 0, 0, 0, 0, 1})), new Pair(40755, new C1722590uvZ(enumC1723100uwO, new byte[]{-32, -7, -52})), new Pair(40730, new C1722590uvZ(enumC1723100uwO2, new byte[]{8, 64})), new Pair(40757, new C1722590uvZ(enumC1723100uwO2, new byte[]{33})), new Pair(24362, new C1722590uvZ(enumC1723100uwO2, bArr2)), new Pair(40764, new C1722590uvZ(enumC1723100uwO2, bArr2)), new Pair(24374, new C1722590uvZ(enumC1723100uwO2, bArr3)), new Pair(40765, new C1722590uvZ(enumC1723100uwO2, bArr3)), new Pair(154, new C1722590uvZ(enumC1723100uwO2, new byte[]{(byte) ((i % 10) | ((i / 10) << 4)), (byte) (((i2 / 10) << 4) | (i2 % 10)), (byte) ((i3 % 10) | ((i3 / 10) << 4))})), new Pair(40759, new C1722590uvZ(enumC1723100uwO, AbstractC19994813Le.Default.nextBytes(4))), new Pair(40806, new C1722590uvZ(enumC1723100uwO, new byte[]{39, -128, 0, 0})), new Pair(40814, new C1722590uvZ(enumC1723100uwO, new byte[]{28, -16, 0, -125})));
    }

    @Override // X.InterfaceC1722680uvi
    public final void LIZIZ(C1722590uvZ c1722590uvZ) {
        this.LIZJ.put(40710, c1722590uvZ);
    }

    @Override // X.InterfaceC1722680uvi
    public final void LIZJ(String str) {
        this.LIZIZ.LIZ = str;
    }

    @Override // X.InterfaceC1722680uvi
    public final void LIZLLL(String str) {
        this.LIZIZ.LIZIZ = str;
    }

    @Override // X.InterfaceC1722680uvi
    public final void LJ(AbstractC1722670uvh<? extends InterfaceC1722700uvk> abstractC1722670uvh) {
        abstractC1722670uvh.LIZJ(this);
    }

    @Override // X.InterfaceC1722680uvi
    public final C1722590uvZ LJI(int i) {
        return (C1722590uvZ) ((LinkedHashMap) this.LIZJ).get(Integer.valueOf(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0073  */
    @Override // X.InterfaceC1722680uvi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.nio.ByteBuffer LJII(byte[] r8) throws java.io.IOException {
        /*
            r7 = this;
            java.util.List<java.lang.String> r2 = r7.LIZLLL
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = ">>> "
            r1.append(r0)
            java.lang.String r0 = X.C2085908Fd.LIZ(r8)
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r2.add(r0)
            X.0uvY r0 = r7.LIZ
            r0.getClass()
            r5 = 0
            android.nfc.tech.IsoDep r0 = r0.LL     // Catch: java.lang.Throwable -> L28
            byte[] r6 = r0.transceive(r8)     // Catch: java.lang.Throwable -> L28
            goto L3c
        L28:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r0)
            if (r0 == 0) goto L7d
            byte[] r6 = new byte[r5]
        L3c:
            java.util.List<java.lang.String> r2 = r7.LIZLLL
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "<<< "
            r1.append(r0)
            java.lang.String r0 = X.C2085908Fd.LIZ(r6)
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r2.add(r0)
            int r0 = r6.length
            r4 = 2
            if (r0 < r4) goto L73
            int r0 = r6.length
            int r0 = r0 - r4
            r3 = r6[r0]
            int r0 = r6.length
            r2 = 1
            int r0 = r0 - r2
            r1 = r6[r0]
            r0 = -112(0xffffffffffffff90, float:NaN)
            if (r3 != r0) goto L73
            if (r1 != 0) goto L73
        L6a:
            if (r2 == 0) goto L75
            int r0 = r6.length
            int r0 = r0 - r4
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r6, r5, r0)
            return r0
        L73:
            r2 = 0
            goto L6a
        L75:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r0 = "APDU response indicates failure"
            r1.<init>(r0)
            throw r1
        L7d:
            X.08jB r0 = new X.08jB
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1722570uvX.LJII(byte[]):java.nio.ByteBuffer");
    }
}
