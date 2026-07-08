package X;

import Y.ACListenerS163S0100000_29;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.AwS372S0200000_6;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.12Es, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19723212Es extends AbstractC1664490tPr<C19723012Eq, C19723312Et> implements InterfaceC19723812Ey, InterfaceC19722312Ej {
    public SurfaceView LLJLILLLLZIIL;
    public InterfaceC19571111hd LLJLLL;
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 853));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 856));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 854));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 855));
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 859));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 860));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 858));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 857));
    public int LLJLL = 7;
    public final int LLJLLIL = 1;

    public final C19723512Ev LLLLLJLJLL() {
        return (C19723512Ev) this.LLJJJIL.getValue();
    }

    public final C1322110kVd LLLLLL() {
        return (C1322110kVd) this.LLJJJJ.getValue();
    }

    @Override // X.InterfaceC19723812Ey
    public final void LJLJI() {
        LLLLIL().LJI.invoke();
    }

    @Override // X.InterfaceC19722312Ej
    public final SurfaceView LJIJJLI() {
        return this.LLJLILLLLZIIL;
    }

    public static final String LLLLLJIL(int i) {
        int i2 = i / LSPassThroughRecordSizeConfig.DEFAULT;
        return C786410Ut5.k4(Locale.US, "%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i2 / 60), Integer.valueOf(i2 % 60)}, 2));
    }

    @Override // X.InterfaceC19723812Ey
    public final void LJJJJJ(float f) {
        LLLLIL().LJFF.invoke(Float.valueOf(f));
    }

    @Override // X.InterfaceC19723812Ey
    public final void LLL(float f) {
        LLLLIL().LJII.invoke(Float.valueOf(f));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        ViewGroup.LayoutParams layoutParams;
        super.onActivityCreated(bundle);
        TuxNavBar tuxNavBar = (TuxNavBar) this.LLJJJJLIIL.getValue();
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getString(2131837153);
        c0om1.LIZJ = c1250250idj;
        C197020126o c197020126o = new C197020126o();
        c197020126o.LIZJ = true;
        c197020126o.LJII = Integer.valueOf(R.attr.a1j);
        c197020126o.LIZ(new AwS573S0100000_29(this, 861));
        c0om1.LIZIZ(c197020126o);
        tuxNavBar.setNavActions(c0om1);
        C19723512Ev c19723512EvLLLLLJLJLL = LLLLLJLJLL();
        if (c19723512EvLLLLLJLJLL != null) {
            c19723512EvLLLLLJLJLL.setOnScrollListener(this);
        }
        C19723512Ev c19723512EvLLLLLJLJLL2 = LLLLLJLJLL();
        if (c19723512EvLLLLLJLJLL2 != null) {
            c19723512EvLLLLLJLJLL2.setItemCount(this.LLJLL);
        }
        C19723512Ev c19723512EvLLLLLJLJLL3 = LLLLLJLJLL();
        if (c19723512EvLLLLLJLJLL3 != null) {
            c19723512EvLLLLLJLJLL3.setTotalPage(this.LLJLLIL);
        }
        this.LLJLILLLLZIIL = (SurfaceView) findViewById(R.id.rsa);
        LLLLIL().LJ.invoke(this);
        int iLIZLLL = (int) (C11VU.LIZLLL(this.mView.getContext()) * 0.4f);
        C1322110kVd c1322110kVdLLLLLL = LLLLLL();
        if (c1322110kVdLLLLLL != null && (layoutParams = c1322110kVdLLLLLL.getLayoutParams()) != null) {
            layoutParams.height = iLIZLLL;
            C1322110kVd c1322110kVdLLLLLL2 = LLLLLL();
            if (c1322110kVdLLLLLL2 != null) {
                C786410Ut5.c7(c1322110kVdLLLLLL2, layoutParams);
            }
        }
        C1322110kVd c1322110kVdLLLLLL3 = LLLLLL();
        if (c1322110kVdLLLLLL3 != null) {
            c1322110kVdLLLLLL3.setOutlineProvider(new C0ID9(15));
        }
        C1322110kVd c1322110kVdLLLLLL4 = LLLLLL();
        if (c1322110kVdLLLLLL4 != null) {
            c1322110kVdLLLLLL4.setClipToOutline(true);
        }
        View view = (View) this.LLJLIL.getValue();
        if (view != null) {
            view.setOutlineProvider(new C0ID9(16));
        }
        View view2 = (View) this.LLJLIL.getValue();
        if (view2 != null) {
            view2.setClipToOutline(true);
        }
        C197039127h c197039127h = (C197039127h) this.LLJL.getValue();
        if (c197039127h != null) {
            c197039127h.setIconTintColorRes(R.attr.z_);
            c197039127h.setTextColorRes(R.attr.z_);
            int[] iArr = new int[3];
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.cq, c197039127h.getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            iArr[0] = iIntValue;
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.cc, c197039127h.getContext());
            if (numLIZJ2 != null) {
                iIntValue2 = numLIZJ2.intValue();
            } else {
                iIntValue2 = 0;
            }
            iArr[1] = iIntValue2;
            Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.ce, c197039127h.getContext());
            if (numLIZJ3 != null) {
                iIntValue3 = numLIZJ3.intValue();
            } else {
                iIntValue3 = 0;
            }
            iArr[2] = iIntValue3;
            c197039127h.LJJJJL(new AwS372S0200000_6(c197039127h, iArr, 112));
            c197039127h.LJJLI(true);
            C786410Ut5.U8(c197039127h, new ACListenerS163S0100000_29(this, 208));
            C14K9.LJIJJ(c197039127h, new C0TVI() { // from class: X.0DWz
                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view3, C20246014Ju c20246014Ju) {
                    ViewGroup.MarginLayoutParams marginLayoutParams;
                    C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(7);
                    ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
                    if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                        marginLayoutParams.bottomMargin = ((int) C11VU.LIZ(27.0f)) + c20244914JjLIZ.LIZLLL;
                        C786410Ut5.W5(view3, marginLayoutParams);
                    }
                    return c20246014Ju;
                }
            });
        }
        View view3 = (View) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (view3 != null) {
            C786410Ut5.I7(new ACListenerS163S0100000_29(this, 209), view3);
        }
        LLLLLLJ(0, 0);
        AbstractC1664490tPr.LLLLLIL(this, new AwS608S0100000_29(this, 599));
        LLLLIL().LIZ.invoke();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLLLIL(X.InterfaceC19571111hd r11, int r12) {
        /*
            r10 = this;
            X.12Ev r4 = r10.LLLLLJLJLL()
            if (r4 == 0) goto L74
            int r0 = r4.getMeasuredWidth()
            if (r0 != 0) goto L17
            Y.ARunnableS34S0201000_29 r1 = new Y.ARunnableS34S0201000_29
            r0 = 10
            r1.<init>(r10, r12, r11, r0)
            com.bytedance.bpea.transmit.hook.HandlerHook.viewPost(r4, r1)
            return
        L17:
            int r0 = r4.getMeasuredWidth()
            r8 = 7
            if (r0 == 0) goto L7f
            double r2 = (double) r12
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r2 = r2 / r0
            double r0 = java.lang.Math.floor(r2)
            int r9 = (int) r0
            double r0 = (double) r9
            double r2 = r2 - r0
            r0 = 1109917696(0x42280000, float:42.0)
            float r0 = X.C11VU.LIZ(r0)
            int r1 = (int) r0
            r4.setNormalItemWidth(r1)
            r5 = 4599075939470750515(0x3fd3333333333333, double:0.3)
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            r7 = 1
            if (r0 >= 0) goto L7a
            r10.LLJLL = r9
            if (r9 != 0) goto L46
            r10.LLJLL = r7
        L46:
            int r0 = r10.LLJLL
            if (r0 != r7) goto L75
            if (r9 != 0) goto L75
        L4c:
            double r5 = (double) r1
            double r5 = r5 * r2
        L4e:
            int r0 = (int) r5
            if (r0 >= r7) goto L52
            r0 = 1
        L52:
            r4.setLastItemWidth(r0)
            r4.setTotalPage(r7)
        L58:
            int r0 = r10.LLJLL
            if (r0 > 0) goto L5e
            r10.LLJLL = r8
        L5e:
            int r0 = r10.LLJLL
            r4.setItemCount(r0)
            X.0nm3 r3 = new X.0nm3
            int r2 = r10.LLJLLIL
            r1 = 128(0x80, float:1.8E-43)
            r0 = 168(0xa8, float:2.35E-43)
            r3.<init>(r11, r1, r0, r2)
            r4.setAdapter(r3)
            r3.notifyDataSetChanged()
        L74:
            return
        L75:
            double r5 = (double) r1
            double r0 = (double) r7
            double r0 = r0 + r2
            double r5 = r5 * r0
            goto L4e
        L7a:
            int r0 = r9 + 1
            r10.LLJLL = r0
            goto L4c
        L7f:
            r10.LLJLL = r8
            goto L58
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19723212Es.LLLLLLIL(X.11hd, int):void");
    }

    public final void LLLLLLJ(int i, int i2) {
        Context context;
        int iLIZ;
        int iLIZ2;
        String strLLLLLJIL = LLLLLJIL(i);
        String strLLLLLJIL2 = LLLLLJIL(i2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLLLLLJIL);
        sbLIZ.append(" / ");
        sbLIZ.append(strLLLLLJIL2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        View view = (View) this.LLJJJJJIL.getValue();
        if (view != null && (context = view.getContext()) != null) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.a1h, typedValue, true);
            int i3 = typedValue.resourceId;
            if (i3 != 0) {
                iLIZ = C446980Hfs.LIZ(context, i3);
            } else {
                iLIZ = typedValue.data;
            }
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.a1p, typedValue2, true);
            int i4 = typedValue2.resourceId;
            if (i4 != 0) {
                iLIZ2 = C446980Hfs.LIZ(context, i4);
            } else {
                iLIZ2 = typedValue2.data;
            }
            SpannableString spannableString = new SpannableString(strLIZIZ);
            int length = strLLLLLJIL.length();
            C786410Ut5.p2(spannableString, new ForegroundColorSpan(iLIZ), 0, length, 33);
            C786410Ut5.p2(spannableString, new ForegroundColorSpan(iLIZ2), length, strLIZIZ.length(), 33);
            TextView textView = (TextView) this.LLJJJJJIL.getValue();
            if (textView != null) {
                textView.setText(spannableString);
            }
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.bg3, viewGroup, false);
    }
}
