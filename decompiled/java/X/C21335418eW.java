package X;

import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18eW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21335418eW extends AbstractC21333318eB<C21335718eZ> implements InterfaceC21334718eP {
    public static final /* synthetic */ int v = 0;
    public boolean LLZZJLIL;
    public final C01GW LLZZLLIL;
    public final C01GW LLZZZIL;
    public Object LLZZZZ;
    public List<C21333618eE> a;
    public List<C21333618eE> b;
    public final C01GW c;
    public Object d;
    public Object e;
    public Object f;
    public C1337880kv4 g;
    public C1337880kv4 h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;
    public C1337980kvE m;
    public Object n;
    public Object o;
    public Object p;
    public Object q;
    public Float r;
    public Float s;
    public Float t;
    public Integer u;

    @Override // X.InterfaceC21334718eP
    public final AbstractC21333318eB<?> LJII() {
        return this;
    }

    @Override // X.AbstractC21333318eB
    public final C21339618fC LJJJZ() {
        C21339618fC c21339618fCLJ = C21333518eD.LJ(this, true);
        c21339618fCLJ.setBaselineFunction(new InterfaceC21339118f7(this) { // from class: X.18er
            public final C21335418eW LL;

            {
                this.LL = this;
            }

            @Override // X.InterfaceC21339118f7
            public final float LJIIIZ(float f) {
                return this.LL.getView().getBaseline();
            }
        });
        return c21339618fCLJ;
    }

    @Override // X.AbstractC21333318eB
    public final void LJJLIIIJLLLLLLLZ(String str) {
    }

    @Override // X.AbstractC21333318eB
    public final void LJJLJLI(String str) {
    }

    @Override // X.InterfaceC21334718eP
    public final Object LIZ() {
        return this.j;
    }

    @Override // X.InterfaceC21334718eP
    public final Object LJ() {
        return this.i;
    }

    @Override // X.InterfaceC21334718eP
    public final Object LJI() {
        return this.g;
    }

    @Override // X.InterfaceC21334718eP
    public final Object LJIIIIZZ() {
        return this.k;
    }

    public C21335418eW(C21325918cz c21325918cz) {
        super(c21325918cz);
        this.LLZZLLIL = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(25));
        this.LLZZZIL = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(26));
        this.c = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(24));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009c  */
    /* JADX WARN: Type inference failed for: r0v33, types: [X.18eZ] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [X.18es, android.text.SpannableStringBuilder, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r28v0, types: [X.18eB, X.18eW] */
    @Override // X.AbstractC21333318eB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJZI(java.util.Map<java.lang.String, ? extends java.lang.Object> r29) {
        /*
            Method dump skipped, instruction units count: 990
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21335418eW.LJJJJZI(java.util.Map):void");
    }

    @Override // X.AbstractC21333318eB
    public final void LJJJLIIL(View view) {
        C21335718eZ c21335718eZ = (C21335718eZ) view;
        c21335718eZ.setMaxLine(1);
        c21335718eZ.setFontColor(-15329245);
        c21335718eZ.setFontSize(C1337970kvD.LJFF(Float.valueOf(14.0f), this.LL.LJIIJ()));
        c21335718eZ.setIncludeFontPadding(this.LL.LIZ.LJJII);
        c21335718eZ.setUseFallbackLineSpacing(this.LL.LIZ.LJJIII);
    }

    @Override // X.AbstractC21333318eB
    public final View LJJJLZIJ(Context context) {
        return new C21335718eZ(context);
    }

    @Override // X.AbstractC21333318eB
    public final void LJJLIIIJILLIZJL(Map<String, ? extends Object> map) {
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            String key = entry.getKey();
            if (Intrinsics.LJFF(key, "text")) {
                if (!Intrinsics.LJFF(this.LLZZZZ, value)) {
                    this.LLZZZZ = value;
                    this.LLZZJLIL = true;
                }
            } else if (Intrinsics.LJFF(key, "line") && (!Intrinsics.LJFF(this.l, value))) {
                this.l = value;
                int iLJ = C1337850kv1.LJ(1, value);
                if (iLJ <= 0) {
                    iLJ = Integer.MAX_VALUE;
                }
                getView().setMaxLine(iLJ);
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01cb  */
    @Override // X.AbstractC21333318eB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLIIIJJI(java.util.Map<java.lang.String, ? extends java.lang.Object> r11) {
        /*
            Method dump skipped, instruction units count: 886
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21335418eW.LJJLIIIJJI(java.util.Map):void");
    }

    @Override // X.InterfaceC21334718eP
    public final void addView(View view) {
        getView().addView(view);
    }

    @Override // X.InterfaceC21334718eP
    public final boolean LJFF(Canvas canvas, View view) {
        return getView().LJ(canvas, view);
    }

    public final C21337218eo LJLLILLLL(C21337618es c21337618es, List<C21333618eE> list, float f) {
        C21337618es c21337618es2 = c21337618es;
        if (c21337618es2 == null) {
            c21337618es2 = new C21337618es(0);
        }
        C21329718db c21329718db = new C21329718db();
        int size = list.size();
        ArrayList arrayList = null;
        long j = 0;
        boolean z = false;
        for (int i = 0; i < size; i++) {
            C21333618eE c21333618eE = (C21333618eE) ListProtector.get(list, i);
            c21329718db.LIZ(c21333618eE.LIZ);
            C21337218eo c21337218eoLIZ = c21333618eE.LIZ(this, this.LL, c21329718db);
            j += c21337218eoLIZ.LIZIZ;
            SpannableStringBuilder spannableStringBuilder = c21337218eoLIZ.LIZ;
            if (spannableStringBuilder != null) {
                c21337618es2.append((CharSequence) spannableStringBuilder);
                if (c21337218eoLIZ.LIZJ) {
                    z = true;
                }
                if (c21337218eoLIZ.LIZLLL != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(c21337218eoLIZ.LIZLLL);
                }
                Float f2 = c21337218eoLIZ.LJ;
                if (f2 != null && f2.floatValue() > f) {
                    f = f2.floatValue();
                }
            }
        }
        return new C21337218eo(c21337618es2, j, z, null, Float.valueOf(f), arrayList, 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0060 A[PHI: r17
      0x0060: PHI (r17v4 long) = (r17v2 long), (r17v6 long) binds: [B:18:0x0048, B:20:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long LJLLJ(java.util.List<X.C21333618eE> r28, java.util.List<com.tiktok.myna.render.render.MynaElement> r29, java.util.Map<java.lang.String, ? extends java.lang.Object> r30) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21335418eW.LJLLJ(java.util.List, java.util.List, java.util.Map):long");
    }
}
