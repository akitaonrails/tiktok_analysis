package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tiktok.myna.render.render.MynaElement;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS208S0000000_20;
import kotlin.jvm.internal.AwS421S0200000_20;
import kotlin.jvm.internal.AwS564S0100000_20;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0kUW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1321420kUW extends AbstractC21333318eB<C1321400kUU> implements InterfaceC1321130kU3 {
    public final C1321070kTx LLZZJLIL;
    public Object LLZZLLIL;
    public Object LLZZZIL;
    public int LLZZZZ;
    public int a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;

    public void LJIIJ(C1325710kbR c1325710kbR) {
    }

    @Override // X.AbstractC21333318eB
    public final int LJJJIL() {
        return 0;
    }

    @Override // X.AbstractC21333318eB
    public final int LJJJJ() {
        return 0;
    }

    public void onFailure(Throwable th) {
    }

    @Override // X.AbstractC21333318eB
    public final void LJJL() {
        this.LLZZJLIL.LJI();
    }

    public final int LJLLJ() {
        return Math.round(this.LLILZLL.getLayoutBorder(EnumC1321440kUY.LEFT));
    }

    public final int LJLLLL() {
        return Math.round(this.LLILZLL.getLayoutPadding(EnumC1321440kUY.LEFT)) + LJLLJ();
    }

    public final int LJLLLLLL() {
        return Math.round(this.LLILZLL.getLayoutPadding(EnumC1321440kUY.TOP)) + LJLLJ();
    }

    @Override // X.AbstractC21333318eB
    public final void LJJII() {
        super.LJJII();
        this.LLZZJLIL.LJII();
    }

    @Override // X.AbstractC21333318eB
    public final void LJJLI() {
        LJJLIIIJL();
        this.LLZZJLIL.LJII();
    }

    public final int LJLLL() {
        return LJLLLL() + Math.round(this.LLILZLL.getLayoutPadding(EnumC1321440kUY.RIGHT)) + LJLLJ();
    }

    public final int LJLZ() {
        return LJLLLLLL() + Math.round(this.LLILZLL.getLayoutPadding(EnumC1321440kUY.BOTTOM)) + LJLLJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1321420kUW(X.C21325918cz r7) {
        /*
            r6 = this;
            r6.<init>(r7)
            android.content.Context r5 = r6.LJJIJLIJ()
            X.18d7 r0 = r7.LIZ
            r0.getClass()
            X.18d7 r0 = r7.LIZ
            boolean r4 = r0.LJJIIZI
            X.C21325918cz.LJIILJJIL(r7)
            X.18cz r0 = r6.LL
            X.18d7 r3 = r0.LIZ
            X.0kU1 r0 = r3.LIZLLL()
            r2 = 0
            if (r0 == 0) goto L35
            X.0kU1 r0 = r3.LIZLLL()
        L22:
            X.0kTx r1 = X.C1321060kTw.LIZIZ(r5, r4, r2, r0)
            r6.LLZZJLIL = r1
            r0 = -1
            r6.LLZZZZ = r0
            r6.a = r0
            r0 = 1
            r6.d = r0
            r6.e = r0
            r1.LLJILLL = r6
            return
        L35:
            boolean r0 = r3.LJJIIZ
            if (r0 == 0) goto L51
            X.0gVV r0 = X.C1168270gVV.LIZ
            r0.getClass()
            java.util.concurrent.ConcurrentHashMap r1 = X.C1168270gVV.LJIIIIZZ()
            java.lang.String r0 = r3.LIZIZ
            java.lang.Object r0 = r1.get(r0)
            X.0gVZ r0 = (X.InterfaceC1168310gVZ) r0
            if (r0 == 0) goto L51
            X.0kU1 r0 = r0.LIZJ()
            goto L22
        L51:
            r0 = r2
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1321420kUW.<init>(X.18cz):void");
    }

    @Override // X.AbstractC21333318eB
    public final void LJJ(Canvas canvas) {
        try {
            C1337990kvF.LIZJ(this, canvas, new AwS421S0200000_20(this, canvas, 15));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1325860kbg.LIZIZ(th, new AwS564S0100000_20(th, 53), C2097608Jq.LJ());
        }
    }

    @Override // X.AbstractC21333318eB
    public final boolean LJJIIJ(Drawable drawable) {
        if (Intrinsics.LJFF(this.LLZZJLIL.LJ(), drawable)) {
            return true;
        }
        return super.LJJIIJ(drawable);
    }

    @Override // X.AbstractC21333318eB
    public final void LJJJLL(MynaElement mynaElement) {
        C1321120kU2 c1321120kU2;
        C1321120kU2 c1321120kU22;
        if (!this.LLLZ) {
            C1321070kTx c1321070kTx = this.LLZZJLIL;
            C1321400kUU view = getView();
            C1331070kk5 c1331070kk5LJFF = c1321070kTx.LJFF();
            if (c1331070kk5LJFF != null && (c1321120kU22 = c1331070kk5LJFF.LJ) != null) {
                c1321120kU22.setCallback(view);
                return;
            } else {
                C1325860kbg.LIZIZ(null, AFwS208S0000000_20.get$arr$(100), C2097608Jq.LJ());
                return;
            }
        }
        C1331070kk5 c1331070kk5LJFF2 = this.LLZZJLIL.LJFF();
        if (c1331070kk5LJFF2 != null && (c1321120kU2 = c1331070kk5LJFF2.LJ) != null) {
            c1321120kU2.setCallback(this);
        } else {
            C1325860kbg.LIZIZ(null, AFwS208S0000000_20.get$arr$(100), C2097608Jq.LJ());
        }
        if (!LJJJJL()) {
            return;
        }
        this.LLZZJLIL.LJI();
    }

    @Override // X.AbstractC21333318eB
    public final View LJJJLZIJ(Context context) {
        C1321400kUU c1321400kUU = new C1321400kUU(context);
        c1321400kUU.setViewManager(this);
        return c1321400kUU;
    }

    @Override // X.AbstractC21333318eB
    public void LJJLIIIJILLIZJL(Map<String, ? extends Object> map) {
        String str;
        boolean z = false;
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            if (Intrinsics.LJFF(entry.getKey(), "src") && (!Intrinsics.LJFF(this.LLZZLLIL, value))) {
                this.LLZZLLIL = value;
                z = true;
            }
        }
        if (z) {
            C1321070kTx c1321070kTx = this.LLZZJLIL;
            Object obj = this.LLZZLLIL;
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
            c1321070kTx.LIZIZ(str);
        }
    }

    @Override // X.AbstractC21333318eB
    public final void LJJLIIIJJI(Map<String, ? extends Object> map) {
        boolean z;
        boolean z2;
        InterfaceC1320380kSq interfaceC1320380kSq;
        Iterator<Map.Entry<String, ? extends Object>> it2 = map.entrySet().iterator();
        while (true) {
            z = true;
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry<String, ? extends Object> next = it2.next();
            Object value = next.getValue();
            if (Intrinsics.LJFF(next.getKey(), "scale_type") && (!Intrinsics.LJFF(this.LLZZZIL, value))) {
                this.LLZZZIL = value;
                C1321070kTx c1321070kTx = this.LLZZJLIL;
                if (!(value instanceof String)) {
                    value = null;
                }
                if (Intrinsics.LJFF(value, "center_crop")) {
                    interfaceC1320380kSq = InterfaceC1320380kSq.LJI;
                } else if (Intrinsics.LJFF(value, "fit_xy")) {
                    interfaceC1320380kSq = InterfaceC1320380kSq.LIZ;
                } else {
                    interfaceC1320380kSq = InterfaceC1320380kSq.LIZJ;
                }
                C1331070kk5 c1331070kk5LJFF = c1321070kTx.LJFF();
                if (c1331070kk5LJFF != null) {
                    c1331070kk5LJFF.LJIIZILJ(interfaceC1320380kSq);
                }
            }
        }
        C1337880kv4 c1337880kv4 = this.LLJILJIL;
        C1337880kv4 c1337880kv42 = this.LLJILJILJ;
        if (c1337880kv4 != null && !"auto".equals(c1337880kv4)) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.d = z2;
        if (c1337880kv42 != null && !"auto".equals(c1337880kv42)) {
            z = false;
        }
        this.e = z;
    }

    @Override // X.AbstractC21333318eB
    public final void LJJLIIIJLJLI(C21325918cz c21325918cz) {
        this.LL = c21325918cz;
        C1321070kTx c1321070kTx = this.LLZZJLIL;
        C21325918cz.LJIILJJIL(c21325918cz);
        c1321070kTx.LLJ = null;
    }

    @Override // X.AbstractC21333318eB
    public final void LJJZZI(List<C1337880kv4> list) {
        C1337990kvF.LJIIIIZZ(this, C1337850kv1.LIZJ(list));
    }

    @Override // X.AbstractC21333318eB
    public final void LJLJJL(int i) {
        C1321120kU2 c1321120kU2LJ;
        boolean z;
        super.LJLJJL(i);
        if (this.LLLZ && (c1321120kU2LJ = this.LLZZJLIL.LJ()) != null) {
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            c1321120kU2LJ.setVisible(z, false);
        }
    }

    public void LIZLLL(Drawable drawable, C1323050kX9 c1323050kX9) {
        AbstractC1327750kej abstractC1327750kejLIZLLL = C1321060kTw.LIZLLL(c1323050kX9);
        if (abstractC1327750kejLIZLLL != null) {
            int width = abstractC1327750kejLIZLLL.getWidth();
            int height = abstractC1327750kejLIZLLL.getHeight();
            int i = this.LLZZZZ;
            int i2 = this.a;
            if (i != width || i2 != height) {
                this.LLZZZZ = width;
                this.a = height;
                if (!this.d || !this.e) {
                    float aspectRatio = this.LLILZLL.getAspectRatio();
                    if (!Float.isNaN(aspectRatio) && aspectRatio > 0.0f) {
                        return;
                    }
                    if (!this.d && !this.e) {
                        return;
                    }
                    if (i > 0 && i2 > 0 && height > 0 && width > 0 && i / i2 == width / height) {
                        return;
                    }
                }
                LJJLIIIJJIZ();
            }
        }
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

    @Override // X.AbstractC21333318eB
    public final void LJL(List<?> list, boolean z) {
        super.LJL(list, true);
    }

    @Override // X.AbstractC21333318eB
    public final long LJJJJZ(float f, EnumC1321460kUa enumC1321460kUa, float f2, EnumC1321460kUa enumC1321460kUa2) {
        LJLLILLLL(View.MeasureSpec.makeMeasureSpec(Math.round(f), AbstractC21333318eB.LJLLI(enumC1321460kUa)), View.MeasureSpec.makeMeasureSpec(Math.round(f2), AbstractC21333318eB.LJLLI(enumC1321460kUa2)), 0, 0);
        return C1321430kUX.LIZ(this.b, this.c);
    }

    @Override // X.AbstractC21333318eB
    public final void LJJLIIIIJ(int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (this.b != i5 || this.c != i6) {
            LJLLILLLL(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), View.MeasureSpec.makeMeasureSpec(i6, 1073741824), LJLLL(), LJLZ());
        }
        if (this.LLLZ) {
            LJLJLLL(i, i2, i3, i4);
        } else {
            getView().LIZ(this.b, this.c);
            getView().layout(i, i2, i3, i4);
        }
        C1321120kU2 c1321120kU2LJ = this.LLZZJLIL.LJ();
        if (c1321120kU2LJ != null) {
            int iLJLLL = i5 - LJLLL();
            int iLJLZ = i6 - LJLZ();
            if (iLJLLL > 0 && iLJLZ > 0) {
                c1321120kU2LJ.setBounds(0, 0, iLJLLL, iLJLZ);
            } else {
                c1321120kU2LJ.setBounds(0, 0, 0, 0);
            }
        }
    }

    public final void LJLLILLLL(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        int i5;
        int i6;
        int iRound;
        int iMin;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            z = true;
        } else {
            z = false;
        }
        if (mode2 != 1073741824) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z && !z2) {
            this.b = size;
            this.c = size2;
            return;
        }
        int i7 = this.LLZZZZ;
        if (i7 <= 0) {
            i5 = 1;
        } else {
            i5 = i7;
        }
        int i8 = this.a;
        if (i8 <= 0) {
            i6 = 1;
        } else {
            i6 = i8;
        }
        float f = i7 / i8;
        int i9 = i5 + i3;
        int i10 = i6 + i4;
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            iRound = i9;
        } else {
            iRound = size;
        }
        if (mode2 != Integer.MIN_VALUE && mode2 != 1073741824) {
            iMin = i10;
        } else {
            iMin = size2;
        }
        if (f != 0.0f) {
            float f2 = iRound - i3;
            float f3 = iMin - i4;
            if (Math.abs((f2 / f3) - f) > 1.0E-7d) {
                if (z) {
                    if (!z2) {
                        int iRound2 = Math.round(f3 * f) + i3;
                        if (iRound2 <= iRound) {
                            iRound = iRound2;
                        }
                    } else if (mode == mode2) {
                        if (mode == Integer.MIN_VALUE) {
                            int iMin2 = Math.min(i10, size2);
                            int iRound3 = Math.round((iMin2 - i4) * f) + i3;
                            if (iRound3 <= iRound) {
                                iMin = iMin2;
                                iRound = iRound3;
                            } else {
                                int iMin3 = Math.min(i9, size);
                                int iRound4 = Math.round((iMin3 - i3) / f) + i4;
                                if (iRound4 <= iMin) {
                                    iRound = iMin3;
                                    iMin = iRound4;
                                }
                            }
                        }
                    } else if (mode == Integer.MIN_VALUE) {
                        iRound = Math.min(i9, size);
                        iMin = Math.round((iRound - i3) / f) + i4;
                    } else {
                        iMin = Math.min(i10, size2);
                        iRound = Math.round((iMin - i4) * f) + i3;
                    }
                } else {
                    int iRound5 = Math.round(f2 / f) + i4;
                    if (iRound5 <= iMin) {
                        iMin = iRound5;
                    }
                }
            }
        }
        this.b = iRound;
        this.c = iMin;
    }
}
