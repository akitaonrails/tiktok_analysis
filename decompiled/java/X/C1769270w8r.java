package X;

import Y.ACListenerS160S0100000_26;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0w8r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1769270w8r {
    public final Context LIZ;
    public final View LIZIZ;
    public final int LIZJ;
    public View LIZLLL;
    public C0P0T LJ;
    public EnumC1769260w8q LJFF;
    public final List<InterfaceC1769680w9W> LJI = new ArrayList();
    public final float LJII = 12.0f;

    public final boolean LIZJ() {
        C0P0T c0p0t = this.LJ;
        return c0p0t != null && c0p0t.isShowing();
    }

    public static String LJ(C1769140w8e c1769140w8e) {
        String str;
        Map<String, Object> map = c1769140w8e.LJII;
        Object obj = null;
        if (map != null) {
            obj = map.get("bubble_text_type");
        }
        if ((obj instanceof String) && (str = (String) obj) != null && str.length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("shop_");
            sbLIZ.append(str);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return "";
    }

    public final void LIZ(InterfaceC1769680w9W interfaceC1769680w9W) {
        ((ArrayList) this.LJI).add(interfaceC1769680w9W);
    }

    public final void LIZIZ(EnumC1769260w8q enumC1769260w8q) {
        String value;
        if (LIZJ()) {
            if (this.LJFF != EnumC1769260w8q.CLICK_BUBBLE) {
                this.LJFF = enumC1769260w8q;
                C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ShopTab Tooltip TooltipCallback hideTooltipifShowing bubbleDisappearType: ");
                EnumC1769260w8q enumC1769260w8q2 = this.LJFF;
                if (enumC1769260w8q2 != null) {
                    value = enumC1769260w8q2.getValue();
                } else {
                    value = null;
                }
                sbLIZ.append(value);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c2341109Fh.getClass();
                C2341109Fh.LIZ(strLIZIZ);
            }
            C0P0T c0p0t = this.LJ;
            if (c0p0t != null) {
                c0p0t.dismiss();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.0vdT, android.view.View] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    public final void LIZLLL(C1769140w8e c1769140w8e) {
        ?? c1749790vdR;
        EnumC1235690iGF enumC1235690iGF;
        int iLIZ;
        int i;
        int iLIZ2;
        String str = c1769140w8e.LIZIZ;
        if (!Intrinsics.LJFF(str, EnumC1768680w7u.SHOP_TAB_BASE_TOOLTIP.getValue()) && !Intrinsics.LJFF(str, EnumC1768680w7u.SHOP_TAB_VOUCHER_TOOLTIP_PRO.getValue()) && Intrinsics.LJFF(str, EnumC1768680w7u.SHOP_TAB_VOUCHER_TOOLTIP.getValue())) {
            c1749790vdR = new C1749800vdS(this.LIZ);
        } else {
            c1749790vdR = new C1749790vdR(this.LIZ);
        }
        c1749790vdR.setContent(c1769140w8e);
        this.LIZLLL = c1749790vdR;
        if (this.LIZJ == EnumC1768630w7p.BOTTOM_TAB.getValue()) {
            enumC1235690iGF = EnumC1235690iGF.TOP;
        } else {
            enumC1235690iGF = EnumC1235690iGF.BOTTOM;
        }
        View view = this.LIZIZ;
        int[] iArr = {0, 0};
        if (C7879035x.LIZLLL()) {
            if (this.LIZJ == EnumC1768630w7p.TOP_TAB.getValue() && (view instanceof TextView)) {
                float fLIZIZ = C0HCL.LIZIZ(((TextView) view).getTextSize(), this.LIZ);
                float fLIZIZ2 = C0HCL.LIZIZ(r4.getMeasuredHeight(), this.LIZ);
                float f = (fLIZIZ2 - fLIZIZ) / 2;
                C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ShopTab Tooltip Offset viewHeight:");
                sbLIZ.append(fLIZIZ2);
                sbLIZ.append(" fontSize:");
                sbLIZ.append(fLIZIZ);
                sbLIZ.append(" diff:");
                sbLIZ.append(f);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c2341109Fh.getClass();
                C2341109Fh.LIZ(strLIZIZ);
                int i2 = iArr[1];
                float f2 = this.LJII;
                if (f < f2) {
                    iLIZ2 = C0HCL.LIZ(f2 - f, this.LIZ);
                } else {
                    iLIZ2 = -C0HCL.LIZ(f - f2, this.LIZ);
                }
                iArr[1] = i2 + iLIZ2;
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } else {
            try {
                if (this.LIZJ == EnumC1768630w7p.TOP_TAB.getValue() && (view instanceof TextView)) {
                    float fLIZIZ3 = C0HCL.LIZIZ(((TextView) view).getTextSize(), this.LIZ);
                    float fLIZIZ4 = C0HCL.LIZIZ(((TextView) view).getMeasuredHeight(), this.LIZ);
                    float f3 = (fLIZIZ4 - fLIZIZ3) / 2;
                    C2341109Fh c2341109Fh2 = C2341109Fh.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("ShopTab Tooltip Offset viewHeight:");
                    sbLIZ2.append(fLIZIZ4);
                    sbLIZ2.append(" fontSize:");
                    sbLIZ2.append(fLIZIZ3);
                    sbLIZ2.append(" diff:");
                    sbLIZ2.append(f3);
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    c2341109Fh2.getClass();
                    C2341109Fh.LIZ(strLIZIZ2);
                    int i3 = iArr[1];
                    float f4 = this.LJII;
                    if (f3 < f4) {
                        iLIZ = C0HCL.LIZ(f4 - f3, this.LIZ);
                    } else {
                        iLIZ = -C0HCL.LIZ(f3 - f4, this.LIZ);
                    }
                    iArr[1] = i3 + iLIZ;
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJ(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        if (c1769140w8e.LJIIJJI == EnumC2003907t7.WHITE_BG_DARK_CONTENT) {
            i = R.attr.zi;
        } else if (Intrinsics.LJFF(c1769140w8e.LJ, Boolean.TRUE)) {
            i = R.attr.e2;
        } else {
            i = R.attr.a0d;
        }
        this.LJFF = EnumC1769260w8q.BEYOND_TIME_LIMIT;
        String strLJ = LJ(c1769140w8e);
        C1391550mJd c1391550mJd = new C1391550mJd(this.LIZ);
        c1391550mJd.LLILLJJLI.LIZIZ = this.LIZIZ;
        c1391550mJd.LIZLLL();
        c1391550mJd.LJIIIIZZ(iArr[0], iArr[1]);
        C1391600mJi c1391600mJi = c1391550mJd.LLILLJJLI;
        c1391600mJi.LIZLLL = enumC1235690iGF;
        c1391600mJi.LJIIZILJ = c1749790vdR;
        c1391550mJd.LJII(i);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        C1391600mJi c1391600mJi2 = c1391550mJd.LLILLJJLI;
        c1391600mJi2.LJIIIIZZ = iLIZIZ;
        c1391600mJi2.LJIJJ = false;
        c1391600mJi2.LJII = c1769140w8e.LJI;
        C1905770zh1.LIZJ(c1391550mJd, strLJ, true, new ACListenerS160S0100000_26(this, 56));
        EnumC1584360rKc enumC1584360rKc = EnumC1584360rKc.MALL;
        C1905770zh1.LIZIZ(c1391550mJd, strLJ, enumC1584360rKc, new AwS570S0100000_26(this, 1396));
        C1905770zh1.LIZ(c1391550mJd, strLJ, enumC1584360rKc, new AwS605S0100000_26(this, 642));
        this.LJ = c1391550mJd.LIZIZ();
        String strLJ2 = LJ(c1769140w8e);
        C1619360sF4 c1619360sF4 = new C1619360sF4(strLJ2, "shop_bubbles", enumC1584360rKc, true, c1769140w8e.LJI, EnumC1619300sEy.SWITCH_TAB, this.LJ, null, 128);
        if (strLJ2.length() > 0 && C295090BhT.LIZ()) {
            C1905750zgz.LIZIZ.LJFF(c1619360sF4, null);
            return;
        }
        C1905750zgz c1905750zgz = C1905750zgz.LIZIZ;
        c1905750zgz.LJIIIIZZ(c1619360sF4);
        c1905750zgz.LJIIIZ(this.LJ, strLJ2);
        C0P0T c0p0t = this.LJ;
        if (c0p0t == null) {
            return;
        }
        c0p0t.show();
    }

    public C1769270w8r(int i, Context context, View view) {
        this.LIZ = context;
        this.LIZIZ = view;
        this.LIZJ = i;
        C2271391DvN.LIZ(this.LIZLLL, (C1A5L) C2271381DvM.LLJLLL.getValue());
    }
}
