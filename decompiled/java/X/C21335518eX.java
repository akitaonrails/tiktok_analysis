package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AwS22S0410000_32;
import kotlin.jvm.internal.AwS433S0200000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18eX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21335518eX extends AbstractC21333318eB<C21335618eY> implements InterfaceC21339118f7, InterfaceC21334718eP {
    public boolean A;
    public C21337618es B;
    public C21337618es C;
    public int D;
    public int E;
    public CharSequence F;
    public CharSequence G;
    public float H;
    public TextPaint I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f224J;
    public String K;
    public TextUtils.TruncateAt L;
    public boolean LLZZJLIL;
    public Object LLZZLLIL;
    public List<C21333618eE> LLZZZIL;
    public List<C21333618eE> LLZZZZ;
    public int M;
    public Layout.Alignment N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f225O;
    public boolean P;
    public boolean Q;
    public int R;
    public int S;
    public Layout T;
    public GestureDetector U;
    public final C01GW a;
    public final C01GW b;
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
    public Float q;
    public Float r;
    public Float s;
    public Integer t;
    public boolean u;
    public List<? extends InterfaceC21337118en> v;
    public int w;
    public CharSequence x;
    public boolean y;
    public List<? extends InterfaceC21337118en> z;

    @Override // X.InterfaceC21334718eP
    public final AbstractC21333318eB<?> LJII() {
        return this;
    }

    @Override // X.AbstractC21333318eB
    public final int LJJJIL() {
        return 0;
    }

    @Override // X.AbstractC21333318eB
    public final int LJJJJ() {
        return 0;
    }

    @Override // X.AbstractC21333318eB
    public final C21339618fC LJJJZ() {
        C21339618fC c21339618fCLJ = C21333518eD.LJ(this, true);
        c21339618fCLJ.setBaselineFunction(this);
        return c21339618fCLJ;
    }

    @Override // X.AbstractC21333318eB
    public final void LJJLIIIJLLLLLLLZ(String str) {
    }

    @Override // X.AbstractC21333318eB
    public final void LJJLJLI(String str) {
    }

    public final void LJZ() {
        this.T = null;
        this.R = 0;
        this.S = 0;
    }

    @Override // X.AbstractC21333318eB
    public final void LJJLIIIJJIZ() {
        if (!this.LLLZ) {
            if (getView().isLayoutRequested()) {
                return;
            }
            getView().requestLayout();
        } else {
            if (this.LLLZIL) {
                return;
            }
            this.LLLZIL = true;
            AbstractC21332518e3<?> abstractC21332518e3 = this.LLILZ;
            if (abstractC21332518e3 != null) {
                abstractC21332518e3.LJJLIIIJJIZ();
            }
            if (LLIIII()) {
                LJZ();
            }
            LJJJJJL();
        }
    }

    public final void LJLLL() {
        List<? extends InterfaceC21337118en> list = this.v;
        if (list != null) {
            Iterator<? extends InterfaceC21337118en> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().LJ();
            }
        }
        List<? extends InterfaceC21337118en> list2 = this.z;
        if (list2 != null) {
            Iterator<? extends InterfaceC21337118en> it3 = list2.iterator();
            while (it3.hasNext()) {
                it3.next().LJ();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [android.text.StaticLayout] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.text.BoringLayout] */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.text.Layout] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [android.text.BoringLayout$Metrics] */
    /* JADX WARN: Type inference failed for: r0v9, types: [android.text.BoringLayout$Metrics] */
    /* JADX WARN: Type inference failed for: r15v1, types: [android.text.TextUtils$TruncateAt] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.text.Layout LJLLLL() {
        /*
            r19 = this;
            r1 = r19
            android.text.Layout r0 = r1.T
            if (r0 == 0) goto L7
            return r0
        L7:
            int r8 = r1.f224J
            if (r8 >= 0) goto Lc
            r8 = 0
        Lc:
            java.lang.CharSequence r0 = r1.G
            r3 = 1
            if (r0 == 0) goto L1c
            int r0 = r0.length()
            if (r0 == 0) goto L1c
            r2 = 0
        L18:
            r0 = 0
            if (r2 == 0) goto L1e
            return r0
        L1c:
            r2 = 1
            goto L18
        L1e:
            java.lang.CharSequence r6 = r1.G
            int r5 = r1.M
            if (r5 != r3) goto L33
            boolean r2 = r1.P
            if (r2 != 0) goto L3e
            boolean r2 = r1.Q
            if (r2 != 0) goto L3e
            android.text.TextPaint r2 = r1.I     // Catch: java.lang.NullPointerException -> L35
            android.text.BoringLayout$Metrics r12 = android.text.BoringLayout.isBoring(r6, r2)     // Catch: java.lang.NullPointerException -> L35
            goto L3f
        L33:
            r12 = r0
            goto L3f
        L35:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)
            java.lang.String r2 = "MynaTextLayoutBuilder#isBoringLayout happen an exception"
            X.C1325860kbg.LJFF(r3, r2)
        L3e:
            r12 = r0
        L3f:
            if (r12 == 0) goto L5e
            android.text.TextPaint r7 = r1.I     // Catch: java.lang.Throwable -> L52
            android.text.Layout$Alignment r9 = r1.N     // Catch: java.lang.Throwable -> L52
            r10 = 1065353216(0x3f800000, float:1.0)
            r11 = 0
            r13 = 0
            android.text.TextUtils$TruncateAt r14 = r1.L     // Catch: java.lang.Throwable -> L52
            r4 = r12
            r15 = r8
            android.text.BoringLayout r0 = android.text.BoringLayout.make(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L55
            goto Lbc
        L52:
            r3 = move-exception
            r4 = r12
            goto L56
        L55:
            r3 = move-exception
        L56:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)
            r2 = 2
            LJLLJ(r1, r3, r4, r2)
            goto Lbc
        L5e:
            if (r6 != 0) goto L63
            java.lang.String r9 = ""
            goto L64
        L63:
            r9 = r6
        L64:
            if (r6 == 0) goto L67
            goto L69
        L67:
            r10 = 0
            goto L6d
        L69:
            int r10 = r6.length()     // Catch: java.lang.IndexOutOfBoundsException -> L8b java.lang.Throwable -> Lb4
        L6d:
            android.text.TextPaint r11 = r1.I     // Catch: java.lang.IndexOutOfBoundsException -> L8b java.lang.Throwable -> Lb4
            android.text.Layout$Alignment r13 = r1.N     // Catch: java.lang.IndexOutOfBoundsException -> L8b java.lang.Throwable -> Lb4
            r14 = 0
            boolean r2 = r1.Q     // Catch: java.lang.IndexOutOfBoundsException -> L8b java.lang.Throwable -> Lb4
            if (r2 != 0) goto L79
            android.text.TextUtils$TruncateAt r2 = r1.L     // Catch: java.lang.IndexOutOfBoundsException -> L8b java.lang.Throwable -> Lb4
            goto L7a
        L79:
            r2 = r0
        L7a:
            r3 = 6
            r5 = r5
            r12 = r8
            r15 = r2
            r16 = r8
            r17 = r5
            r18 = r14
            android.text.StaticLayout r0 = X.C431580Gw8.LIZ(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch: java.lang.IndexOutOfBoundsException -> L89 java.lang.Throwable -> La5
            goto Lbc
        L89:
            r4 = move-exception
            goto L8e
        L8b:
            r4 = move-exception
            r3 = 6
            r5 = r5
        L8e:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r4)
            boolean r2 = r6 instanceof java.lang.String
            if (r2 != 0) goto Lb0
            kotlin.jvm.internal.AwS611S0100000_32 r3 = new kotlin.jvm.internal.AwS611S0100000_32
            r2 = 378(0x17a, float:5.3E-43)
            r3.<init>(r4, r2)
            X.C1168400gVi.LIZIZ(r3)
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Exception -> La7
            r5 = r5
            goto L5e
        La5:
            r2 = move-exception
            goto Lb6
        La7:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)
            r2 = 4
            LJLLJ(r1, r3, r0, r2)
            goto Lbc
        Lb0:
            LJLLJ(r1, r4, r0, r3)
            goto Lbc
        Lb4:
            r2 = move-exception
            r3 = 6
        Lb6:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            LJLLJ(r1, r2, r0, r3)
        Lbc:
            r2 = 1
            r1.f225O = r2
            r1.T = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21335518eX.LJLLLL():android.text.Layout");
    }

    public final void LJZL() {
        if (this.f225O) {
            TextPaint textPaint = new TextPaint(this.I);
            textPaint.set(this.I);
            this.I = textPaint;
            this.f225O = false;
        }
    }

    public final void LL() {
        List<? extends InterfaceC21337118en> list = this.v;
        if (list != null) {
            Iterator<? extends InterfaceC21337118en> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().LJFF();
            }
        }
        List<? extends InterfaceC21337118en> list2 = this.z;
        if (list2 != null) {
            Iterator<? extends InterfaceC21337118en> it3 = list2.iterator();
            while (it3.hasNext()) {
                it3.next().LJFF();
            }
        }
    }

    public final int LLFFF() {
        return Math.round(this.LLILZLL.getLayoutBorder(EnumC1321440kUY.LEFT));
    }

    public final int LLFII() {
        return Math.round(this.LLILZLL.getLayoutPadding(EnumC1321440kUY.LEFT)) + LLFFF();
    }

    public final int LLFZ() {
        return Math.round(this.LLILZLL.getLayoutPadding(EnumC1321440kUY.TOP)) + LLFFF();
    }

    public final C21337618es LLI() {
        C21337618es c21337618es = this.C;
        if (c21337618es != null) {
            return c21337618es;
        }
        C21337618es c21337618es2 = new C21337618es(0);
        this.C = c21337618es2;
        return c21337618es2;
    }

    public final C21337618es LLIFFJFJJ() {
        C21337618es c21337618es = this.B;
        if (c21337618es != null) {
            return c21337618es;
        }
        C21337618es c21337618es2 = new C21337618es(0);
        this.B = c21337618es2;
        return c21337618es2;
    }

    public final boolean LLIIII() {
        List<? extends InterfaceC21337118en> list;
        List<? extends InterfaceC21337118en> list2 = this.v;
        if (list2 == null || list2.isEmpty()) {
            return (!this.A || (list = this.z) == null || list.isEmpty()) ? false : true;
        }
        return true;
    }

    @Override // X.AbstractC21333318eB
    public final void LJJII() {
        super.LJJII();
        LL();
    }

    @Override // X.AbstractC21333318eB
    public final void LJJLI() {
        LJJLIIIJL();
        LL();
    }

    public final void LJLLILLLL() {
        LJZL();
        Float f = this.q;
        Float f2 = this.r;
        Float f3 = this.s;
        Integer num = this.t;
        if (f == null || f2 == null || f3 == null || num == null) {
            this.I.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        } else {
            this.I.setShadowLayer(f3.floatValue(), f.floatValue(), f2.floatValue(), num.intValue());
        }
        this.T = null;
        LJJJJJL();
    }

    public final int LLII() {
        return LLFZ() + Math.round(this.LLILZLL.getLayoutPadding(EnumC1321440kUY.BOTTOM)) + LLFFF();
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

    @Override // X.AbstractC21333318eB
    public final void LJJL() {
        LJLLL();
    }

    public C21335518eX(C21325918cz c21325918cz) {
        super(c21325918cz);
        this.a = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(299));
        this.b = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
        this.c = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(298));
        TextPaint textPaint = new TextPaint(1);
        this.I = textPaint;
        this.K = "flex-start";
        this.M = 1;
        this.N = Layout.Alignment.ALIGN_NORMAL;
        textPaint.density = this.LL.LIZ.LIZ.getResources().getDisplayMetrics().density;
        this.I.setColor(-15329245);
        this.I.setTextSize(C1337970kvD.LJFF(Float.valueOf(14.0f), c21325918cz.LJIIJ()));
    }

    @Override // X.InterfaceC21339118f7
    public final float LJIIIZ(float f) {
        TextUtils.TruncateAt truncateAt;
        Layout layoutLJLLLL = LJLLLL();
        if (layoutLJLLLL != null) {
            int iLIZ = 0;
            int lineBaseline = layoutLJLLLL.getLineBaseline(0);
            int iRound = Math.round(f);
            String str = this.K;
            int iRound2 = Math.round(this.LLILZLL.getBorder(EnumC1321440kUY.LEFT));
            int iRound3 = Math.round(this.LLILZLL.getPadding(EnumC1321440kUY.TOP).LIZ) + iRound2;
            int iRound4 = (iRound - iRound3) - (Math.round(this.LLILZLL.getPadding(EnumC1321440kUY.BOTTOM).LIZ) + iRound2);
            int i = this.M;
            Layout layoutLJLLLL2 = LJLLLL();
            if (layoutLJLLLL2 != null) {
                if (!this.Q) {
                    truncateAt = this.L;
                } else {
                    truncateAt = null;
                }
                iLIZ = C1318120kPC.LIZ(layoutLJLLLL2, i, truncateAt);
            }
            if (iLIZ >= iRound4) {
                iLIZ = iRound4;
            }
            int iHashCode = str.hashCode();
            if (iHashCode != -1364013995) {
                if (iHashCode != -46581362) {
                    if (iHashCode == 1742952711 && str.equals("flex-end")) {
                        iRound3 = (iRound3 + iRound4) - iLIZ;
                    }
                } else {
                    str.equals("flex-start");
                }
            } else if (str.equals("center")) {
                iRound3 += (iRound4 - iLIZ) / 2;
            }
            return lineBaseline + iRound3;
        }
        return -1.0f;
    }

    @Override // X.AbstractC21333318eB
    public final void LJJ(Canvas canvas) {
        C1337990kvF.LIZJ(this, canvas, new AwS433S0200000_32(canvas, this, 83));
    }

    @Override // X.AbstractC21333318eB
    public final boolean LJJIIJ(Drawable drawable) {
        if (LLIIIILZ(drawable)) {
            return true;
        }
        return super.LJJIIJ(drawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0360 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03c3 A[PHI: r2
      0x03c3: PHI (r2v13 ??) = (r2v12 ??), (r2v12 ??), (r2v12 ??), (r2v21 ??) binds: [B:205:0x0346, B:207:0x034e, B:208:0x0350, B:242:0x03c3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0191  */
    /* JADX WARN: Type inference failed for: r0v80, types: [X.18es, android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r0v96, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v97, types: [android.graphics.drawable.Drawable$Callback] */
    /* JADX WARN: Type inference failed for: r0v98 */
    /* JADX WARN: Type inference failed for: r1v20, types: [X.18en] */
    /* JADX WARN: Type inference failed for: r23v0, types: [X.18eB, X.18eX] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21, types: [X.18es, android.text.SpannableStringBuilder, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    @Override // X.AbstractC21333318eB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJZI(java.util.Map<java.lang.String, ? extends java.lang.Object> r24) {
        /*
            Method dump skipped, instruction units count: 965
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21335518eX.LJJJJZI(java.util.Map):void");
    }

    @Override // X.AbstractC21333318eB
    public final View LJJJLZIJ(Context context) {
        C21335618eY c21335618eY = new C21335618eY(context);
        c21335618eY.setViewManager(this);
        return c21335618eY;
    }

    @Override // X.AbstractC21333318eB
    public final void LJJLIIIJILLIZJL(Map<String, ? extends Object> map) {
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            String key = entry.getKey();
            if (Intrinsics.LJFF(key, "text")) {
                if (!Intrinsics.LJFF(this.LLZZLLIL, value)) {
                    this.LLZZLLIL = value;
                    this.LLZZJLIL = true;
                }
            } else if (Intrinsics.LJFF(key, "line") && (!Intrinsics.LJFF(this.l, value))) {
                this.l = value;
                int iLJ = C1337850kv1.LJ(1, value);
                if (iLJ <= 0) {
                    iLJ = Integer.MAX_VALUE;
                }
                this.M = iLJ;
                this.T = null;
                LJJLIIIJJIZ();
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:190:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    @Override // X.AbstractC21333318eB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLIIIJJI(java.util.Map<java.lang.String, ? extends java.lang.Object> r12) {
        /*
            Method dump skipped, instruction units count: 974
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21335518eX.LJJLIIIJJI(java.util.Map):void");
    }

    @Override // X.AbstractC21333318eB
    public final void LJJZZI(List<C1337880kv4> list) {
        C1337990kvF.LJIIIIZZ(this, C1337850kv1.LIZJ(list));
    }

    public final boolean LLIIIILZ(Drawable drawable) {
        List<? extends InterfaceC21337118en> list = this.v;
        if (list != null) {
            Iterator<? extends InterfaceC21337118en> it2 = list.iterator();
            while (it2.hasNext()) {
                if (it2.next().LIZ() == drawable) {
                    return true;
                }
            }
        }
        List<? extends InterfaceC21337118en> list2 = this.z;
        if (list2 != null) {
            Iterator<? extends InterfaceC21337118en> it3 = list2.iterator();
            while (it3.hasNext()) {
                if (it3.next().LIZ() == drawable) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC21334718eP
    public final void addView(View view) {
        getView().addView(view);
    }

    @Override // X.InterfaceC21334718eP
    public final boolean LJFF(Canvas canvas, View view) {
        return getView().LIZ(canvas, view);
    }

    @Override // X.AbstractC21333318eB
    public final void LJJZ(String str, boolean z) {
        C1168270gVV.LIZ.getClass();
        if (C1168270gVV.LJI()) {
            super.LJJZ(str, z);
        }
    }

    @Override // X.AbstractC21333318eB
    public final void LJJZZIII(List<C1337880kv4> list, C1337880kv4 c1337880kv4) {
        this.LLILZLL.setBorder(EnumC1321440kUY.ALL, c1337880kv4.LIZ);
        C1337990kvF.LJIIIIZZ(this, C1337850kv1.LIZJ(list));
    }

    public final int LJLLLLLL(int i, int i2) {
        int i3 = this.R;
        if (i3 != 0 && i3 == i2) {
            return i3;
        }
        CharSequence charSequence = this.G;
        if (i != 1073741824) {
            int iCeil = this.S;
            if (iCeil == 0) {
                iCeil = 0;
                if (charSequence != null && charSequence.length() != 0) {
                    iCeil = (int) Math.ceil(Layout.getDesiredWidth(charSequence, this.I));
                }
                this.S = iCeil;
            }
            if (i != Integer.MIN_VALUE || iCeil <= i2) {
                i2 = iCeil;
            }
        }
        if (this.f224J != i2) {
            this.f224J = i2;
            this.T = null;
        }
        this.R = i2;
        return i2;
    }

    public final C21338018ew LLFF(MotionEvent motionEvent, Spannable spannable) {
        if (spannable == null) {
            return null;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int iLLFII = x - LLFII();
        int iLLFZ = y - LLFZ();
        Layout layout = this.T;
        if (layout == null) {
            return null;
        }
        int iU3 = C786410Ut5.U3(layout, layout.getLineForVertical(iLLFZ), iLLFII);
        return (C21338018ew) C13LQ.LJJIIZ(0, spannable.getSpans(iU3, iU3, C21338018ew.class));
    }

    public final int LJLZ(int i, int i2, int i3) {
        int iLIZ;
        TextUtils.TruncateAt truncateAt;
        int i4 = this.M;
        if (i2 == 1073741824) {
            return i;
        }
        Layout layoutLJLLLL = LJLLLL();
        if (layoutLJLLLL != null) {
            if (!this.Q) {
                truncateAt = this.L;
            } else {
                truncateAt = null;
            }
            iLIZ = C1318120kPC.LIZ(layoutLJLLLL, i4, truncateAt);
        } else {
            iLIZ = 0;
        }
        int i5 = iLIZ + i3;
        if (i2 == Integer.MIN_VALUE) {
            return Math.min(i, i5);
        }
        return i5;
    }

    public final C21337218eo LJZI(C21337618es c21337618es, List<C21333618eE> list, float f) {
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

    /* JADX WARN: Removed duplicated region for block: B:36:0x0068 A[PHI: r3 r14
      0x0068: PHI (r3v2 java.util.Map<java.lang.String, ? extends java.lang.Object>) = 
      (r3v1 java.util.Map<java.lang.String, ? extends java.lang.Object>)
      (r3v3 java.util.Map<java.lang.String, ? extends java.lang.Object>)
      (r3v3 java.util.Map<java.lang.String, ? extends java.lang.Object>)
      (r3v3 java.util.Map<java.lang.String, ? extends java.lang.Object>)
     binds: [B:57:0x00f5, B:33:0x0060, B:35:0x0066, B:54:0x00f1] A[DONT_GENERATE, DONT_INLINE]
      0x0068: PHI (r14v4 long) = (r14v2 long), (r14v2 long), (r14v2 long), (r14v6 long) binds: [B:57:0x00f5, B:33:0x0060, B:35:0x0066, B:54:0x00f1] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long LLF(java.util.List<X.C21333618eE> r25, java.util.List<com.tiktok.myna.render.render.MynaElement> r26, java.util.Map<java.lang.String, ? extends java.lang.Object> r27) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21335518eX.LLF(java.util.List, java.util.List, java.util.Map):long");
    }

    public final void LLIIIJ(SpannableStringBuilder spannableStringBuilder, boolean z, List<? extends InterfaceC21337118en> list) {
        boolean z2;
        Drawable.Callback view;
        List<? extends InterfaceC21337118en> list2 = this.z;
        this.x = spannableStringBuilder;
        this.y = z;
        this.z = list;
        if (list != null) {
            for (InterfaceC21337118en interfaceC21337118en : list) {
                if (this.LLLZ) {
                    view = this;
                } else {
                    view = getView();
                }
                interfaceC21337118en.LIZIZ(this, view);
                interfaceC21337118en.LJ();
            }
        }
        if (list2 != null) {
            Iterator<? extends InterfaceC21337118en> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().LJFF();
            }
        }
        if (this.w != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 != this.Q) {
            this.Q = z2;
            this.T = null;
        }
        if (z2 && spannableStringBuilder != null && spannableStringBuilder.length() != 0) {
            LLIFFJFJJ().clear();
            LLIFFJFJJ().append("...").append((CharSequence) spannableStringBuilder);
        }
    }

    public static void LJLLJ(C21335518eX c21335518eX, Throwable th, BoringLayout.Metrics metrics, int i) {
        boolean z;
        BoringLayout.Metrics metrics2 = metrics;
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        Integer numValueOf = null;
        if ((i & 4) != 0) {
            metrics2 = null;
        }
        Typeface typeface = c21335518eX.I.getTypeface();
        if (Build.VERSION.SDK_INT >= 28 && typeface != null) {
            numValueOf = Integer.valueOf(typeface.getWeight());
        }
        C1325860kbg.LIZIZ(th, new AwS22S0410000_32(c21335518eX, z, metrics2, typeface, numValueOf, 0), C2097608Jq.LJ());
    }

    @Override // X.AbstractC21333318eB
    public final long LJJJJZ(float f, EnumC1321460kUa enumC1321460kUa, float f2, EnumC1321460kUa enumC1321460kUa2) {
        LLD(View.MeasureSpec.makeMeasureSpec(Math.round(f), AbstractC21333318eB.LJLLI(enumC1321460kUa)), View.MeasureSpec.makeMeasureSpec(Math.round(f2), AbstractC21333318eB.LJLLI(enumC1321460kUa2)), 0, 0);
        return C1321430kUX.LIZ(this.D, this.E);
    }

    @Override // X.AbstractC21333318eB
    public final void LJJLIIIIJ(int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        if (this.D != i5 || this.E != i4 - i2) {
            LLD(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), View.MeasureSpec.makeMeasureSpec(i4 - i2, 1073741824), LLFII() + Math.round(this.LLILZLL.getLayoutPadding(EnumC1321440kUY.RIGHT)) + LLFFF(), LLII());
        }
        if (this.LLLZ) {
            LJLJLLL(i, i2, i3, i4);
        } else {
            getView().LIZIZ(this.D, this.E);
            getView().layout(i, i2, i3, i4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0172 A[EDGE_INSN: B:77:0x0172->B:67:0x0172 BREAK  A[LOOP:1: B:52:0x012d->B:79:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[LOOP:1: B:52:0x012d->B:79:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLD(int r23, int r24, int r25, int r26) {
        /*
            Method dump skipped, instruction units count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21335518eX.LLD(int, int, int, int):void");
    }
}
