package X;

import Y.ARunnableS25S1100000_20;
import Y.ARunnableS89S0200000_20;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.serval.svg.SVGRender;
import java.util.Map;
import kotlin.jvm.internal.AFwS208S0000000_20;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0kUc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1321480kUc extends AbstractC21333318eB<C417480GYo> {
    public static final float b = C1337970kvD.LIZJ(14);
    public C1DX7 LLZZJLIL;
    public final C01GW LLZZLLIL;
    public String LLZZZIL;
    public int LLZZZZ;
    public int a;

    public final boolean LJLLL() {
        String str = this.LLZZZIL;
        if (str == null || a0.LJJJIL(str)) {
            return false;
        }
        int iLJJIJ = LJJIJ(this.LLJILJIL);
        int iLJJIIJZLJL = LJJIIJZLJL(this.LLJILJILJ);
        if (iLJJIJ <= 0 || iLJJIIJZLJL <= 0) {
            return false;
        }
        if (this.LLZZZZ == iLJJIJ && this.a == iLJJIIJZLJL) {
            return false;
        }
        this.LLZZZZ = iLJJIJ;
        this.a = iLJJIIJZLJL;
        return true;
    }

    public C1321480kUc(C21325918cz c21325918cz) {
        super(c21325918cz);
        float f = b;
        this.LLZZJLIL = new C1DX7(f, f);
        this.LLZZLLIL = C452501pT.LIZIZ(AFwS208S0000000_20.get$arr$(53));
    }

    @Override // X.AbstractC21333318eB
    public final View LJJJLZIJ(Context context) {
        return new C417480GYo(context);
    }

    @Override // X.AbstractC21333318eB
    public final void LJJLIIIJILLIZJL(Map<String, ? extends Object> map) {
        String str;
        boolean z = false;
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (Intrinsics.LJFF("content", key) && (value instanceof String) && !Intrinsics.LJFF(this.LLZZZIL, value)) {
                String str2 = (String) value;
                z = true;
                if (str2 != null && !a0.LJJJIL(str2)) {
                    if (!Intrinsics.LJFF(this.LLZZZIL, str2)) {
                        this.LLZZZIL = str2;
                        if (LJLLL() && (str = this.LLZZZIL) != null) {
                            C1168270gVV.LIZ.getClass();
                            C1168270gVV.LIZLLL().execute(new ARunnableS25S1100000_20(this, str, 14));
                        }
                    }
                } else if (this.LLZZZIL != null) {
                    this.LLZZZIL = null;
                    this.LLZZZZ = 0;
                    this.a = 0;
                    C742060T8y.LIZ(new ARunnableS89S0200000_20((Object) null, this, 93));
                }
            }
        }
        if (!z) {
            LJLLJ(C2097608Jq.LJ());
        }
    }

    @Override // X.AbstractC21333318eB
    public final void LJJLIIIJJI(Map<String, ? extends Object> map) {
        LJLLJ(map);
    }

    public final void LJLLJ(Map<String, ? extends Object> map) {
        float fFloatValue;
        float fFloatValue2;
        String str;
        Float f;
        Float f2;
        String str2 = this.LLZZZIL;
        if (str2 != null && !a0.LJJJIL(str2)) {
            Object obj = map.get("fontSize");
            if ((obj instanceof Float) && (f2 = (Float) obj) != null) {
                fFloatValue = f2.floatValue();
            } else {
                fFloatValue = b;
            }
            Object obj2 = map.get("lineHeight");
            if ((obj2 instanceof Float) && (f = (Float) obj2) != null) {
                fFloatValue2 = f.floatValue();
            } else {
                fFloatValue2 = b;
            }
            C1DX7 c1dx7 = new C1DX7(fFloatValue, fFloatValue2);
            if (!Intrinsics.LJFF(this.LLZZJLIL, c1dx7) || this.LLZZZZ <= 0 || this.a <= 0) {
                synchronized (this) {
                    try {
                        this.LLZZJLIL = c1dx7;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                if (LJLLL() && (str = this.LLZZZIL) != null) {
                    C1168270gVV.LIZ.getClass();
                    C1168270gVV.LIZLLL().execute(new ARunnableS25S1100000_20(this, str, 14));
                }
            }
        }
    }

    public final Drawable LJLLILLLL(String str, int i, int i2, C1DX7 c1dx7) {
        Object obj;
        Map<String, Object> mapLJIIIZ;
        C1168270gVV.LIZ.getClass();
        InterfaceC1168280gVW interfaceC1168280gVW = C1168270gVV.LIZJ;
        if (interfaceC1168280gVW != null && (mapLJIIIZ = interfaceC1168280gVW.LJIIIZ()) != null) {
            obj = mapLJIIIZ.get("enable_serval_svg");
        } else {
            obj = null;
        }
        if (((Boolean) obj).booleanValue()) {
            return new C1312420kG0(((SVGRender) this.LLZZLLIL.getValue()).renderPicture(str, new Rect(0, 0, i, i2)));
        }
        return new C1312410kFz(C2257191DWj.LIZJ(str), c1dx7, null);
    }
}
