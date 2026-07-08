package X;

import android.graphics.Bitmap;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS547S0100000_3;

/* JADX INFO: renamed from: X.08vv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2276108vv extends AbstractC2289508y5 {
    public final C2266008uI LJJI;
    public final String LJJIFFI;
    public final String LJJII;
    public final String LJJIII;
    public int LJJIIJ;
    public final C01GW LJJIIJZLJL;

    @Override // X.AbstractC2289508y5
    public final String LJIIJJI() {
        return "layout";
    }

    @Override // X.AbstractC2289508y5
    public final String LJIL() {
        return "LayoutModeUploadFrameTask";
    }

    @Override // X.AbstractC2289508y5
    public final int LJIIIZ() {
        return C2275008vk.LIZ();
    }

    @Override // X.AbstractC2289508y5
    public final String LJFF() {
        return this.LJJIII;
    }

    @Override // X.AbstractC2289508y5
    public final String LJI() {
        return this.LJJII;
    }

    @Override // X.AbstractC2289508y5
    public final String LJII() {
        return this.LJJIFFI;
    }

    @Override // X.AbstractC2289508y5
    public final Object LIZ(InterfaceC1364105Vn interfaceC1364105Vn) {
        if (((Boolean) C2276708w1.LIZ.getValue()).booleanValue()) {
            return LJJII(interfaceC1364105Vn);
        }
        return LJJIFFI(interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIFFI(X.InterfaceC1364105Vn<? super java.lang.String> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C2276508vz
            if (r0 == 0) goto L69
            r5 = r7
            X.08vz r5 = (X.C2276508vz) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L69
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r2 = 1
            if (r0 == 0) goto L3a
            if (r0 != r2) goto L6f
            X.C155000ia.LIZIZ(r4)
        L22:
            java.util.Collection r4 = (java.util.Collection) r4
        L24:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r4)
            int r0 = r6.LJIIIZ()
            java.util.List r1 = X.C476901tP.LIZ(r0, r1)
            java.lang.String r0 = r6.LJ()
            java.lang.String r0 = r6.LJIIZILJ(r0, r1)
            return r0
        L3a:
            X.C155000ia.LIZIZ(r4)
            X.08uI r0 = r6.LJJI
            java.lang.String r0 = r0.LIZ
            boolean r0 = X.C2286708xd.LJIILL(r0)
            if (r0 == 0) goto L58
            X.08uI r0 = r6.LJJI
            java.lang.String r0 = r0.LIZ
            java.util.List r1 = java.util.Collections.singletonList(r0)
            X.08uI r0 = r6.LJJI
            java.lang.String r0 = r0.LIZ
            java.util.List r4 = r6.LJJIIJZLJL(r0, r1)
            goto L24
        L58:
            X.08uI r0 = r6.LJJI
            java.lang.String r1 = r0.LIZ
            int r0 = r6.LJIIIZ()
            r5.LLILLL = r2
            java.lang.Object r4 = r6.LJJIII(r0, r1, r5)
            if (r4 != r3) goto L22
            return r3
        L69:
            X.08vz r5 = new X.08vz
            r5.<init>(r6, r7)
            goto L12
        L6f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2276108vv.LJJIFFI(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJII(X.InterfaceC1364105Vn<? super java.lang.String> r10) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2276108vv.LJJII(X.05Vn):java.lang.Object");
    }

    public final List LJJIIJZLJL(String str, List list) {
        Bitmap bitmapDecodeBitmap;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String str2 = (String) ListProtector.get(list, i);
            C0VSJ c0vsj = new C0VSJ(str2);
            if (c0vsj.exists() && (bitmapDecodeBitmap = BitmapUtils.decodeBitmap(c0vsj)) != null) {
                Pair pairLJJI = LJJI(bitmapDecodeBitmap.getWidth(), bitmapDecodeBitmap.getHeight(), this.LIZIZ);
                Bitmap bitmapLIZIZ = C476901tP.LIZIZ(bitmapDecodeBitmap, ((Number) pairLJJI.getFirst()).intValue(), ((Number) pairLJJI.getSecond()).intValue());
                if (str == null) {
                    if (i >= 0 && i < ((Number) this.LJJIIJZLJL.getValue()).intValue()) {
                        str2 = this.LJJI.LIZ;
                    }
                } else {
                    str2 = str;
                }
                C0VSJ c0vsjLJIJI = LJIJI(bitmapLIZIZ, this.LJJIIJ, str2);
                this.LJJIIJ++;
                bitmapDecodeBitmap.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(bitmapDecodeBitmap);
                bitmapLIZIZ.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(bitmapLIZIZ);
                arrayList.add(c0vsjLJIJI.getAbsolutePath());
            }
        }
        return arrayList;
    }

    public static Pair LJJI(int i, int i2, int i3) {
        if (i > i2) {
            return new Pair(Integer.valueOf(i3), Integer.valueOf((int) (i3 * (i2 / i))));
        }
        return new Pair(Integer.valueOf((int) (i3 * (i / i2))), Integer.valueOf(i3));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIII(int r17, java.lang.String r18, X.InterfaceC1364105Vn r19) {
        /*
            r16 = this;
            r3 = r19
            boolean r0 = r3 instanceof X.C2276408vy
            r9 = r16
            if (r0 == 0) goto L6c
            r7 = r3
            X.08vy r7 = (X.C2276408vy) r7
            int r2 = r7.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6c
            int r2 = r2 - r1
            r7.LLILZ = r2
        L16:
            java.lang.Object r4 = r7.LLILLJJLI
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILZ
            r5 = 1
            if (r0 == 0) goto L35
            if (r0 != r5) goto L72
            long r0 = r7.LL
            X.C155000ia.LIZIZ(r4)
        L28:
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r0
            X.08uI r0 = r9.LJJI
            long r0 = r0.LJI
            r9.LJIILIIL(r2, r0)
            return r4
        L35:
            X.C155000ia.LIZIZ(r4)
            long r0 = java.lang.System.currentTimeMillis()
            X.08uI r2 = r9.LJJI
            long r10 = r2.LJI
            int r14 = r9.LIZIZ
            X.08u3 r8 = new X.08u3
            r15 = 0
            r13 = r18
            r12 = r17
            r8.<init>(r9, r10, r12, r13, r14, r15)
            kotlinx.coroutines.flow.b r3 = X.C09IC.LJ(r8)
            X.1DFB r2 = X.C0PEM.LIZJ
            X.01Wa r4 = X.C09IC.LJIL(r3, r2)
            X.09r7 r3 = new X.09r7
            r2 = 3
            r3.<init>(r9, r4, r2)
            X.05RH r2 = new X.05RH
            r2.<init>(r3)
            r7.LL = r0
            r7.LLILZ = r5
            java.lang.Object r4 = X.C09IC.LJJIL(r2, r7)
            if (r4 != r6) goto L28
            return r6
        L6c:
            X.08vy r7 = new X.08vy
            r7.<init>(r9, r3)
            goto L16
        L72:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2276108vv.LJJIII(int, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0043 -> B:12:0x002e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0052 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIIJ(int r8, java.util.List r9, X.InterfaceC1364105Vn r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof X.C2276208vw
            if (r0 == 0) goto L62
            r6 = r10
            X.08vw r6 = (X.C2276208vw) r6
            int r2 = r6.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L62
            int r2 = r2 - r1
            r6.LLILZLL = r2
        L12:
            java.lang.Object r1 = r6.LLILZ
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILZLL
            r4 = 1
            if (r0 == 0) goto L55
            if (r0 != r4) goto L69
            int r8 = r6.LL
            java.lang.Object r3 = r6.LLILLL
            java.util.Iterator r3 = (java.util.Iterator) r3
            java.lang.Object r2 = r6.LLILLJJLI
            java.util.Collection r2 = (java.util.Collection) r2
            X.C155000ia.LIZIZ(r1)
        L2c:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
        L2e:
            X.C19719612Di.LJJI(r1, r2)
        L31:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L68
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = X.C2286708xd.LIZJ(r1)
            if (r0 != 0) goto L46
            X.13BV r1 = X.C13BV.INSTANCE
            goto L2e
        L46:
            r6.LLILLJJLI = r2
            r6.LLILLL = r3
            r6.LL = r8
            r6.LLILZLL = r4
            java.lang.Object r1 = r7.LJJIII(r8, r1, r6)
            if (r1 != r5) goto L2c
            return r5
        L55:
            X.C155000ia.LIZIZ(r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r9.iterator()
            goto L31
        L62:
            X.08vw r6 = new X.08vw
            r6.<init>(r7, r10)
            goto L12
        L68:
            return r2
        L69:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2276108vv.LJJIIJ(int, java.util.List, X.05Vn):java.lang.Object");
    }

    public C2276108vv(C2266008uI c2266008uI, String str, String str2, String str3) {
        super(c2266008uI);
        this.LJJI = c2266008uI;
        this.LJJIFFI = str;
        this.LJJII = str2;
        this.LJJIII = str3;
        this.LJJIIJZLJL = C452501pT.LIZIZ(new AwS547S0100000_3(this, 165));
    }
}
