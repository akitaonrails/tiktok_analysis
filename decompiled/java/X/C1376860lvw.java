package X;

import Y.ARunnableS90S0200000_21;
import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lvw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1376860lvw implements InterfaceC1370310llN, InterfaceC1370280llK {
    public final C1373800lr0 LL;
    public LinearLayout LLILLJJLI;
    public C1376950lw5 LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(521));
    public final List<TuxTextView> LLILZ = new ArrayList();
    public float LLILZIL = 1.0f;
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1394));

    @Override // X.InterfaceC1370310llN
    public final float LIZLLL() {
        return -1.0f;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJI() {
    }

    @Override // X.InterfaceC1370310llN
    public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
    }

    @Override // X.InterfaceC1370310llN
    public final Integer LJIILJJIL() {
        return null;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJIILL(InterfaceC1362720lZ8 interfaceC1362720lZ8) {
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIJJLI() {
        return 0;
    }

    @Override // X.InterfaceC1370310llN
    public final Integer LJJIJIIJIL() {
        return null;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJIL() {
        return true;
    }

    @Override // X.InterfaceC1370310llN
    public final String LJJIZ() {
        return "";
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJJI(Context context, BaseSharePackage baseSharePackage) {
    }

    @Override // X.InterfaceC1370310llN
    public final Integer LJJJJIZL() {
        return null;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJJJL() {
        return false;
    }

    @Override // X.InterfaceC1370450llb
    public final int LJJJJLI() {
        return 100;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJJLZIJ() {
        return false;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJLIIIJL() {
        return false;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean enable() {
        return true;
    }

    @Override // X.InterfaceC1370310llN
    public final String label() {
        return "";
    }

    @Override // X.InterfaceC1370310llN
    public final int LJII() {
        C1376820lvs c1376820lvs = (C1376820lvs) this.LLJ.getValue();
        return c1376820lvs != null ? c1376820lvs.LIZIZ : this.LL.LIZ.LIZ;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIIIIZZ() {
        C1376820lvs c1376820lvs = (C1376820lvs) this.LLJ.getValue();
        return c1376820lvs != null ? c1376820lvs.LIZ : this.LL.LIZ.LIZ;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJIIIZ() {
        if (!this.LLIZ) {
            return false;
        }
        this.LLIZ = false;
        return true;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJJLIIIJJIZ() {
        return this.LL.LIZ.LIZIZ;
    }

    @Override // X.InterfaceC1370310llN
    public final String key() {
        String str = this.LL.LIZ.LIZJ;
        return str == null ? "" : str;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIIJJI() {
        return !enable() ? 1 : 0;
    }

    @Override // X.InterfaceC1370310llN
    public final C0M7Z LJIIJ() {
        return C0M7Z.LongPress;
    }

    @Override // X.InterfaceC1370310llN
    public final EnumC1216710hld LJJJZ() {
        return EnumC1216710hld.NORMAL;
    }

    public C1376860lvw(C1373800lr0 c1373800lr0) {
        this.LL = c1373800lr0;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJIJJ(TextView textView) {
        C1370320llO.LJ(this, textView);
    }

    public final String LJJ(float f) {
        LinearLayout linearLayout = this.LLILLJJLI;
        boolean z = false;
        if (linearLayout != null && linearLayout.getLayoutDirection() == 1) {
            z = true;
        }
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append((char) 215);
            sbLIZ.append(f);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(f);
        sbLIZ2.append((char) 215);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    @Override // X.InterfaceC1370310llN
    public final int LJJJJ(EnumC1369720lkQ enumC1369720lkQ) {
        return C1370320llO.LIZJ(enumC1369720lkQ);
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJJJI(BaseSharePackage baseSharePackage) {
        if (baseSharePackage != null && baseSharePackage.extras.getBoolean("is_highlight_fast_speed", false)) {
            baseSharePackage.extras.putBoolean("is_highlight_fast_speed", false);
            int i = baseSharePackage.extras.getInt("action_orientation", -1);
            if (i != EnumC1369720lkQ.HORIZONTAL.ordinal() && i != EnumC1369720lkQ.HORIZONTAL_WITH_FILLMODE.ordinal() && i != EnumC1369720lkQ.HORIZONTAL_WITHOUT_FILLMODE.ordinal()) {
                if (i == EnumC1369720lkQ.VERTICAL.ordinal() || i == EnumC1369720lkQ.VERTICAL_WITH_FILLMODE.ordinal()) {
                    this.LLIZLLLIL = true;
                    return;
                }
                return;
            }
            this.LLIZ = true;
        }
    }

    public static void LJFF(TuxTextView tuxTextView, boolean z) {
        int i;
        C384050F3z c384050F3z = new C384050F3z();
        if (z) {
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.p9);
        } else {
            c384050F3z.LIZ = 0;
        }
        tuxTextView.setBackground(c384050F3z.LIZ(tuxTextView.getContext()));
        if (z) {
            i = R.attr.a1h;
        } else {
            i = R.attr.a1k;
        }
        tuxTextView.setTextColorRes(i);
    }

    public static void LJJIIZ(Aweme aweme, SharePackage sharePackage) {
        String string = sharePackage.extras.getString("enter_from", "");
        String str = "long_press";
        if (!Intrinsics.LJFF(sharePackage.extras.getString("panel_source", ""), "long_press")) {
            str = "click_share_button";
        }
        C1386110mAr.LIZ.getClass();
        C1386110mAr.LIZLLL(aweme, string, str);
        C589960NBy.LIZ.getClass();
        C1440005kM.LIZ(new C739410SzT(string, str));
    }

    @Override // X.InterfaceC1370280llK
    public final void LIZIZ(Context context, ViewGroup viewGroup) {
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -1;
            layoutParams.height = -2;
        } else {
            layoutParams = null;
        }
        C786410Ut5.X5(layoutParams, viewGroup);
        LinearLayout linearLayout = this.LLILLJJLI;
        if (linearLayout != null) {
            C786410Ut5.d6(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        }
        LinearLayout linearLayout2 = this.LLILLJJLI;
        if (linearLayout2 != null) {
            C426750GoL.LJIIIZ(linearLayout2, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), false, 16);
        }
        LinearLayout linearLayout3 = this.LLILLJJLI;
        if (linearLayout3 != null) {
            C786410Ut5.LJJJJJL(linearLayout3);
        }
        ((ArrayList) this.LLILZ).clear();
        Typeface typefaceLIZIZ = C1697580uHE.LIZIZ(0.0f, 600, 14.0f, 0.0f, null, 0.0f, 90, null, 153);
        int i = 0;
        for (Object obj : (List) this.LLILLL.getValue()) {
            int i2 = i + 1;
            if (i >= 0) {
                String strLJJ = LJJ(((Number) obj).floatValue());
                TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
                tuxTextView.setTypeface(typefaceLIZIZ);
                tuxTextView.setGravity(17);
                tuxTextView.setText(strLJJ);
                ((ArrayList) this.LLILZ).add(tuxTextView);
                LinearLayout linearLayout4 = this.LLILLJJLI;
                if (linearLayout4 != null) {
                    linearLayout4.addView(tuxTextView, new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), 1.0f));
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJIIZI(View view, BaseSharePackage baseSharePackage) {
        C1379170lzf c1379170lzf;
        String strJ4;
        if (this.LLILLJJLI == null) {
            AbstractC736370SuZ abstractC736370SuZ = this.LL.LIZIZ;
            if (abstractC736370SuZ instanceof C1376910lw1) {
                C1379170lzf c1379170lzf2 = ((C1376910lw1) abstractC736370SuZ).LLILZ;
                LJJIIZ(c1379170lzf2.LL, c1379170lzf2.LLJILJILJ);
                return;
            } else {
                if (!(abstractC736370SuZ instanceof C1376880lvy)) {
                    return;
                }
                C1379170lzf c1379170lzf3 = ((C1376880lvy) abstractC736370SuZ).LLILZ;
                LJJIIZ(c1379170lzf3.LL, c1379170lzf3.LLJILJILJ);
                return;
            }
        }
        float f = this.LLILZIL;
        AbstractC736370SuZ abstractC736370SuZ2 = this.LL.LIZIZ;
        if (abstractC736370SuZ2 instanceof C1376910lw1) {
            c1379170lzf = ((C1376910lw1) abstractC736370SuZ2).LLILZ;
        } else if (!(abstractC736370SuZ2 instanceof C1376880lvy)) {
            return;
        } else {
            c1379170lzf = ((C1376880lvy) abstractC736370SuZ2).LLILZ;
        }
        if (c1379170lzf == null) {
            return;
        }
        String string = c1379170lzf.LLJILJILJ.extras.getString("enter_from", "");
        String str = "long_press";
        if (!Intrinsics.LJFF(c1379170lzf.LLJILJILJ.extras.getString("panel_source", ""), "long_press")) {
            str = "click_share_button";
        }
        C1386110mAr c1386110mAr = C1386110mAr.LIZ;
        Aweme aweme = c1379170lzf.LL;
        c1386110mAr.getClass();
        C1386110mAr.LIZLLL(aweme, string, str);
        Aweme aweme2 = c1379170lzf.LL;
        HashMap map = new HashMap();
        c1386110mAr.getClass();
        C1386110mAr.LIZIZ(f, aweme2, null, string, str, map);
        C589960NBy c589960NBy = C589960NBy.LIZ;
        Aweme aweme3 = c1379170lzf.LL;
        c589960NBy.getClass();
        C589960NBy.LJ(f, aweme3, string, str);
        Context context = c1379170lzf.LLILZIL;
        if (context != null) {
            if (f == 1.0f) {
                strJ4 = context.getResources().getString(2131840502);
            } else {
                String string2 = context.getResources().getString(2131840504);
                if (f == 0.5f) {
                    string2 = context.getResources().getString(2131840505);
                }
                if (f == 1.5f) {
                    string2 = context.getResources().getString(2131840506);
                }
                if (C299550Bof.LIZ() && f == 3.0f) {
                    string2 = context.getResources().getString(2131840507);
                }
                strJ4 = C786410Ut5.j4(context.getResources().getString(2131840503), Arrays.copyOf(new Object[]{string2}, 1));
            }
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
            if (c19egLIZIZ != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZIZ);
                c1389890mGx.LJIIJ(strJ4);
                c1389890mGx.LJIIJJI();
            }
        }
        if (!C299550Bof.LIZ()) {
            return;
        }
        C1386110mAr.LIZIZ = str;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJJJLL(View view, BaseSharePackage baseSharePackage) {
        C1370320llO.LIZ(this, view, baseSharePackage);
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJLIIIIJ(View view, BaseSharePackage baseSharePackage) {
        C1370320llO.LIZIZ(this, view, baseSharePackage);
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJLIIIJILLIZJL(Context context, BaseSharePackage baseSharePackage) {
        C1370320llO.LIZLLL(context, baseSharePackage, this);
    }

    @Override // X.InterfaceC1370280llK
    public final View LIZ(ViewGroup viewGroup, Context context, C1370200llC c1370200llC) {
        if (c1370200llC != null && this.LLILLJJLI == null) {
            LinearLayout linearLayout = new LinearLayout(context);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
            linearLayout.setBackground(c384050F3z.LIZ(context));
            linearLayout.setOrientation(0);
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
            linearLayout.setPadding(iLIZIZ, iLIZIZ, iLIZIZ, iLIZIZ);
            this.LLILLJJLI = linearLayout;
            Typeface typefaceLIZIZ = C1697580uHE.LIZIZ(0.0f, 600, 14.0f, 0.0f, null, 0.0f, 90, null, 153);
            int i = 0;
            for (Object obj : (List) this.LLILLL.getValue()) {
                int i2 = i + 1;
                if (i >= 0) {
                    String strLJJ = LJJ(((Number) obj).floatValue());
                    TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
                    tuxTextView.setTypeface(typefaceLIZIZ);
                    tuxTextView.setText(strLJJ);
                    tuxTextView.setGravity(17);
                    ((ArrayList) this.LLILZ).add(tuxTextView);
                    LinearLayout linearLayout2 = this.LLILLJJLI;
                    if (linearLayout2 != null) {
                        linearLayout2.addView(tuxTextView, new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32))));
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            if (viewGroup != null) {
                viewGroup.addView(this.LLILLJJLI, new FrameLayout.LayoutParams(-2, -2));
            }
        }
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJIJ(ImageView imageView, View view, int i) {
        if (this.LLIZLLLIL) {
            this.LLIZLLLIL = false;
            HandlerHook.viewPost(view, new ARunnableS90S0200000_21(this, view, 54));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    @Override // X.InterfaceC1370280llK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(X.C1370200llC r10, final int r11, final X.InterfaceC1369750lkT r12, final kotlin.jvm.functions.Function0 r13) {
        /*
            r9 = this;
            java.util.List<com.bytedance.tux.input.TuxTextView> r0 = r9.LLILZ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r6 = r0.iterator()
            r10 = 0
        L9:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L67
            java.lang.Object r3 = r6.next()
            int r5 = r10 + 1
            r4 = 0
            if (r10 < 0) goto L63
            com.bytedance.tux.input.TuxTextView r3 = (com.bytedance.tux.input.TuxTextView) r3
            X.01GW r0 = r9.LLILLL
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r10)
            java.lang.Number r0 = (java.lang.Number) r0
            float r2 = r0.floatValue()
            X.0lr0 r0 = r9.LL
            X.0SuZ r1 = r0.LIZIZ
            boolean r0 = r1 instanceof X.C1376910lw1
            if (r0 == 0) goto L5a
            X.0lw1 r1 = (X.C1376910lw1) r1
            X.0lzf r0 = r1.LLILZ
        L38:
            if (r0 == 0) goto L3c
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r0.LL
        L3c:
            X.0NBy r0 = X.C589960NBy.LIZ
            r0.getClass()
            float r0 = X.C589960NBy.LIZJ(r4)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L58
            r0 = 1
        L4a:
            LJFF(r3, r0)
            X.0lvx r7 = new X.0lvx
            r8 = r13
            r7.<init>()
            X.C786410Ut5.h9(r3, r7)
            r10 = r5
            goto L9
        L58:
            r0 = 0
            goto L4a
        L5a:
            boolean r0 = r1 instanceof X.C1376880lvy
            if (r0 == 0) goto L3c
            X.0lvy r1 = (X.C1376880lvy) r1
            X.0lzf r0 = r1.LLILZ
            goto L38
        L63:
            X.C1697810uHb.LJIJI()
            throw r4
        L67:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1376860lvw.LJ(X.0llC, int, X.0lkT, kotlin.jvm.functions.Function0):void");
    }
}
