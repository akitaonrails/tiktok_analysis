package X;

import Y.AfS147S0200000_11;
import android.content.Context;
import android.text.Layout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.editpost.ClientText;
import com.ss.android.ugc.aweme.ui.layout.FeedContentLayoutInfo;
import com.ss.android.ugc.feed.platform.ab.LowScreenOptimizeAB;
import com.ss.android.ugc.feed.platform.ab.NarrowScreenOptConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0SHk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C718780SHk {
    public static String LJIIZILJ;
    public final Context LIZ;
    public TuxTextView LIZIZ;
    public View LIZJ;
    public C21415018rM LIZLLL;
    public C21415018rM LJ;
    public final C11NJ LJFF = new C11NJ();
    public final int LJI = C1DDC.LLILZLL.LJFF;
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public final int LJIILIIL;
    public final int LJIILJJIL;
    public int LJIILL;
    public final int LJIILLIIL;

    public static int LJ() {
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15));
        if (C300980Bqy.LIZ()) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        }
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        int iLJ = c19252910Tv.LIZLLL().LJIJI().LJJL().LJ(iLIZIZ);
        int iLIZIZ2 = (!C07HF.LIZ() || C693570RIl.LIZ()) ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100)) : 0;
        if (C693570RIl.LIZJ(C1DDC.LLILZLL.LJFF)) {
            NarrowScreenOptConfig narrowScreenOptConfig = (NarrowScreenOptConfig) C693570RIl.LIZIZ.getValue();
            if (narrowScreenOptConfig == null) {
                narrowScreenOptConfig = C693570RIl.LIZJ;
            }
            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(narrowScreenOptConfig.interactPaddingDp)));
        }
        return iLJ + c19252910Tv.LIZLLL().LJIJI().LJJL().LJJIII(iLIZIZ2);
    }

    public final float LIZ() {
        TextPaint paint;
        TuxTextView tuxTextView = this.LIZIZ;
        if (tuxTextView == null || (paint = tuxTextView.getPaint()) == null) {
            return 0.0f;
        }
        return paint.measureText(new C719020SIi(this.LIZ).LIZ);
    }

    public C718780SHk(Context context) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        this.LIZ = context;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ee, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        this.LJII = iIntValue;
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.ef, context);
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        } else {
            iIntValue2 = 0;
        }
        this.LJIIIIZZ = iIntValue2;
        Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.zl, context);
        if (numLIZJ3 != null) {
            iIntValue3 = numLIZJ3.intValue();
        } else {
            iIntValue3 = 0;
        }
        this.LJIIIZ = iIntValue3;
        int i = this.LJII;
        this.LJIIJ = i;
        this.LJIIJJI = i;
        this.LJIIL = R.attr.a1h;
        this.LJIILIIL = 42;
        this.LJIILJJIL = C497820Jfg.LIZIZ(context) - (C693570RIl.LIZ() ? LJ() : (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100))) - (C07HF.LIZ() ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)) : 0));
        this.LJIILL = 7;
        this.LJIILLIIL = 2;
    }

    public final C718800SHm LIZIZ(C0SJF c0sjf) {
        C0SJF c0sjfClone = c0sjf.clone();
        c0sjfClone.LJ();
        c0sjfClone.LIZLLL(new C0SIC(this.LJIIJ, this.LJIIJJI, null));
        C0SIE.LIZLLL(c0sjfClone, this.LIZ, C12ES.LJIIJ(this.LIZ) - LJ(), null, C0SIE.LIZ(c0sjf), null, Integer.valueOf(this.LJIIL));
        Iterator<C0SJL<C719000SIg>> it2 = c0sjfClone.LL.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJIIJ(it2.next().LLIZLLLIL, AFwS243S0000000_11.get$arr$(612), true);
        }
        C718800SHm c718800SHm = new C718800SHm(C0SJF.LIZ(c0sjfClone));
        c718800SHm.LJI = true;
        c718800SHm.LJII = new C719020SIi(this.LIZ);
        c718800SHm.LJIIIZ(this.LJIILIIL);
        c718800SHm.LJIIIIZZ(this.LJIIIZ);
        return c718800SHm;
    }

    public final void LJII(Pair<? extends Layout, ? extends Layout> pair) {
        Layout second = pair.getSecond();
        if (second == null) {
            second = pair.getFirst();
        }
        C21415018rM c21415018rM = this.LJ;
        if (c21415018rM != null) {
            c21415018rM.setTextLayout(second);
        }
    }

    public final C719090SIp LJFF(ViewGroup viewGroup, C718800SHm c718800SHm, Layout layout, boolean z) {
        int i;
        int i2;
        boolean z2;
        int i3;
        int color = ColorProtector.parseColor("#4E000000");
        boolean z3 = C14LC.LJIIIZ;
        boolean z4 = false;
        if (z3 || LowScreenOptimizeAB.LIZ() || (C693570RIl.LIZIZ() && ((i3 = this.LJI) == 1 || i3 == 3))) {
            i = 51;
        } else {
            i = 41;
        }
        int iLLJZIJLIL = C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLILLIZIL().LLJZIJLIL(20, viewGroup);
        if (iLLJZIJLIL <= 0) {
            iLLJZIJLIL = this.LJIILJJIL;
        }
        C444830HcP c444830HcP = new C444830HcP();
        c444830HcP.LJIIJJI(true);
        c444830HcP.LJIILL(iLLJZIJLIL);
        c444830HcP.LIZIZ.LJIIIZ = TextDirectionHeuristics.LOCALE;
        c444830HcP.LJIILJJIL(this.LJIIIIZZ);
        if (!C07AA.LIZ()) {
            c444830HcP.LJIIL(3.0f, 0.0f, 1.0f, color);
        }
        c444830HcP.LJII(i);
        if (!z3 && !LowScreenOptimizeAB.LIZ()) {
            i2 = 15;
        } else {
            i2 = 14;
        }
        c444830HcP.LJIIIIZZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(((double) i2) * 1.3d))));
        c444830HcP.LJIILIIL(c718800SHm.LIZ);
        Layout layoutLIZIZ = c444830HcP.LIZIZ();
        float fLIZ = LIZ();
        ArrayList arrayList = new ArrayList();
        if (layout != null && layout.getLineCount() > 0 && layout.getEllipsisCount(layout.getLineCount() - 1) > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        c718800SHm.LJI(this.LJIILL);
        c718800SHm.LIZLLL(fLIZ);
        if (z || z2) {
            z4 = true;
        }
        c718800SHm.LJIILLIIL = z4;
        C444830HcP c444830HcP2 = new C444830HcP();
        c444830HcP2.LJIIJJI(true);
        c444830HcP2.LJIILL(iLLJZIJLIL);
        c444830HcP2.LIZIZ.LJIIIZ = TextDirectionHeuristics.LOCALE;
        c444830HcP2.LJIILJJIL(this.LJIIIIZZ);
        if (!C07AA.LIZ()) {
            c444830HcP2.LJIIL(3.0f, 0.0f, 1.0f, color);
        }
        c444830HcP2.LJII(i);
        C719090SIp c719090SIpLIZJ = C718800SHm.LIZJ(c718800SHm, c444830HcP2, layoutLIZIZ, arrayList, 4);
        Layout layout2 = c719090SIpLIZJ.LIZIZ;
        if (layout2 == null) {
            if (C0SI6.LIZIZ(layout) || C0SI6.LIZ(layout) || C0SI6.LIZJ(layout, new C719020SIi(this.LIZ).LIZ)) {
                return new C719090SIp(c719090SIpLIZJ.LIZ, null, null);
            }
        } else if (Intrinsics.LJFF(c719090SIpLIZJ.LIZ, layout2)) {
            return new C719090SIp(c719090SIpLIZJ.LIZ, null, null);
        }
        return c719090SIpLIZJ;
    }

    public final Pair<Layout, Layout> LJI(ViewGroup viewGroup, String str, Layout layout, C718800SHm c718800SHm, boolean z) {
        CharSequence charSequence = c718800SHm.LIZ;
        if (charSequence != null && charSequence.length() != 0) {
            C719090SIp c719090SIpLIZJ = C718950SIb.LIZJ(str, layout, new AwS377S0200000_11(this, c718800SHm, 92), new C0SIP(this, viewGroup, c718800SHm, layout, z), AFwS243S0000000_11.get$arr$(613), ((Boolean) C295600BiI.LIZIZ.getValue()).booleanValue(), ((Boolean) C0BUZ.LIZIZ.getValue()).booleanValue());
            return new Pair<>(c719090SIpLIZJ.LIZ, c719090SIpLIZJ.LIZIZ);
        }
        C719090SIp c719090SIpLJFF = LJFF(viewGroup, c718800SHm, layout, z);
        return new Pair<>(c719090SIpLJFF.LIZ, c719090SIpLJFF.LIZIZ);
    }

    public static FeedContentLayoutInfo LIZLLL(Context context, String str, ClientText clientText, boolean z, Float f, int i, boolean z2) {
        String string = LJIIZILJ;
        if (string == null) {
            string = UUID.randomUUID().toString();
        }
        String strLIZ = C719030SIj.LIZ(clientText.markupText);
        List list = clientText.textExtra;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        return C0SMY.LIZIZ(context, new C720110SMn(string, str, C0SJF.LIZ(C719200SJa.LIZJ(strLIZ, list)).toString(), z, f, true, z2, 4914), null, null, i, null, false, false, null, null);
    }

    public final FeedContentLayoutInfo LIZJ(Context context, final C120B c120b, String str, ClientText clientText, boolean z, Float f, int i, final C0SJ9 c0sj9, boolean z2, boolean z3, FeedContentLayoutInfo feedContentLayoutInfo) {
        C21415018rM c21415018rM;
        C21415018rM c21415018rM2;
        boolean z4;
        int iIntValue;
        int iIntValue2;
        FeedContentLayoutInfo feedContentLayoutInfoLIZLLL = feedContentLayoutInfo;
        if (z3) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.av1, context);
            int iIntValue3 = -16777216;
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = -16777216;
            }
            this.LJII = iIntValue;
            this.LJIIIIZZ = iIntValue;
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.av3, context);
            if (numLIZJ2 != null) {
                iIntValue2 = numLIZJ2.intValue();
            } else {
                iIntValue2 = 0;
            }
            this.LJIIIZ = iIntValue2;
            Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.av1, context);
            if (numLIZJ3 != null) {
                iIntValue3 = numLIZJ3.intValue();
            }
            this.LJIIJ = iIntValue3;
            this.LJIIJJI = iIntValue3;
            this.LJIIL = R.attr.av1;
        }
        final String string = LJIIZILJ;
        if (string == null) {
            string = UUID.randomUUID().toString();
        }
        String strLIZ = C719030SIj.LIZ(clientText.markupText);
        List list = clientText.textExtra;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        final C0SJF c0sjfLIZJ = C719200SJa.LIZJ(strLIZ, list);
        String string2 = C0SJF.LIZ(c0sjfLIZJ).toString();
        String str2 = str;
        if (feedContentLayoutInfoLIZLLL == null) {
            str2 = str2;
            feedContentLayoutInfoLIZLLL = LIZLLL(context, str2, clientText, z, f, i, z2);
        }
        this.LJIILL = feedContentLayoutInfoLIZLLL.descriptionLines;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LIZ), R.layout.ea6, c120b, false);
        this.LIZJ = viewTd;
        Layout layoutLIZIZ = null;
        if (viewTd != null) {
            c21415018rM = (C21415018rM) viewTd.findViewById(R.id.title);
        } else {
            c21415018rM = null;
        }
        this.LIZLLL = c21415018rM;
        View view = this.LIZJ;
        if (view != null) {
            c21415018rM2 = (C21415018rM) view.findViewById(R.id.desc);
        } else {
            c21415018rM2 = null;
        }
        this.LJ = c21415018rM2;
        TuxTextView tuxTextView = (TuxTextView) C786410Ut5.Td(C786410Ut5.ne(this.LIZ), R.layout.e_1, c120b, false);
        tuxTextView.setTuxFont(this.LJIILIIL);
        tuxTextView.setTextColor(this.LJIIIZ);
        this.LIZIZ = tuxTextView;
        if (str2 != null && str2.length() != 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z4) {
            C21415018rM c21415018rM3 = this.LIZLLL;
            if (c21415018rM3 != null) {
                C786410Ut5.LJLLLLLL(8, c21415018rM3);
            }
        } else {
            C21415018rM c21415018rM4 = this.LIZLLL;
            if (c21415018rM4 != null) {
                C786410Ut5.LJLLLLLL(0, c21415018rM4);
            }
            int iLLJZIJLIL = C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLILLIZIL().LLJZIJLIL(20, c120b);
            if (iLLJZIJLIL <= 0) {
                iLLJZIJLIL = this.LJIILJJIL;
            }
            C444830HcP c444830HcP = new C444830HcP();
            c444830HcP.LJIILIIL(str2);
            c444830HcP.LJIILL(iLLJZIJLIL);
            c444830HcP.LIZIZ.LJIIIZ = TextDirectionHeuristics.LOCALE;
            c444830HcP.LJIILJJIL(this.LJII);
            c444830HcP.LJII(C1EE2.LIZIZ.LIZ());
            c444830HcP.LIZIZ.LJII = TextUtils.TruncateAt.END;
            c444830HcP.LJIIIZ(this.LJIILLIIL);
            if (string2 != null && !a0.LJJJIL(string2)) {
                layoutLIZIZ = c444830HcP.LIZIZ();
            } else {
                C718800SHm c718800SHm = new C718800SHm(str2);
                c718800SHm.LJI(this.LJIILLIIL);
                c718800SHm.LJI = true;
                c718800SHm.LJII = new C719020SIi(this.LIZ);
                c718800SHm.LJIIIZ(this.LJIILIIL);
                c718800SHm.LIZLLL(LIZ());
                c718800SHm.LJIIIIZZ(this.LJIIIZ);
                C719090SIp c719090SIpLIZJ = C718800SHm.LIZJ(c718800SHm, c444830HcP, null, null, 14);
                layoutLIZIZ = c719090SIpLIZJ.LIZIZ;
                if (layoutLIZIZ == null) {
                    layoutLIZIZ = c719090SIpLIZJ.LIZ;
                }
            }
            C21415018rM c21415018rM5 = this.LIZLLL;
            if (c21415018rM5 != null) {
                c21415018rM5.setTextLayout(layoutLIZIZ);
            }
        }
        if (a0.LJJJIL(string2)) {
            C21415018rM c21415018rM6 = this.LJ;
            if (c21415018rM6 != null) {
                C786410Ut5.LJLLLLLL(8, c21415018rM6);
            }
            View view2 = this.LIZJ;
            if (view2 != null) {
                c0sj9.LIZ(view2);
            }
            return feedContentLayoutInfoLIZLLL;
        }
        C21415018rM c21415018rM7 = this.LJ;
        if (c21415018rM7 != null) {
            C786410Ut5.LJLLLLLL(0, c21415018rM7);
        }
        final C718800SHm c718800SHmLIZIZ = LIZIZ(c0sjfLIZJ);
        final String str3 = str2;
        final Layout layout = layoutLIZIZ;
        final Pair<Layout, Layout> pairLJI = LJI(c120b, str3, layout, c718800SHmLIZIZ, false);
        LJII(pairLJI);
        this.LJFF.LJ();
        this.LJFF.LIZ(AbstractC19484711Kz.LJIJI(new Callable() { // from class: X.0SFG
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v0, types: [T, kotlin.Pair<android.text.Layout, android.text.Layout>] */
            /* JADX WARN: Type inference failed for: r0v1, types: [T, X.0SHm] */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("PhotoFeedPreviewProvider@fdcd.refreshDescLayoutWithHashTagTruncation$1");
                C259800zU c259800zU = new C259800zU();
                c259800zU.element = pairLJI;
                C259800zU c259800zU2 = new C259800zU();
                c259800zU2.element = c718800SHmLIZIZ;
                if (pairLJI.getSecond() == null) {
                    pairLJI.getFirst();
                }
                String str4 = string;
                C0SJF c0sjf = c0sjfLIZJ;
                Pair<Layout, Layout> pair = pairLJI;
                C718780SHk c718780SHk = this;
                ViewGroup viewGroup = c120b;
                String str5 = str3;
                Layout layout2 = layout;
                C0SFO c0sfo = C0SFR.LIZ;
                C0SFR.LIZ(str4, c0sjf, pair.getFirst(), "refreshDesc", c718780SHk.LIZ(), new C0SFH(c718780SHk, viewGroup, str5, layout2, c259800zU2, c259800zU));
                C0SFF c0sff = new C0SFF(((Pair) c259800zU.element).getSecond() != null ? new Pair(pair.getFirst(), ((Pair) c259800zU.element).getSecond()) : (Pair) c259800zU.element, (C718800SHm) c259800zU2.element);
                C1C7U.LIZIZ("PhotoFeedPreviewProvider@fdcd.refreshDescLayoutWithHashTagTruncation$1");
                return c0sff;
            }
        }).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new AfS147S0200000_11(c0sj9, this, 5), new C09JN() { // from class: X.0SI5
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("PhotoFeedPreviewProvider@fdcd.refreshDescLayoutWithHashTagTruncation$3");
                this.LL.LJII(pairLJI);
                C718780SHk c718780SHk = this.LL;
                C0SJ9 c0sj92 = c0sj9;
                View view3 = c718780SHk.LIZJ;
                if (view3 != null) {
                    c0sj92.LIZ(view3);
                }
                C1C7U.LIZIZ("PhotoFeedPreviewProvider@fdcd.refreshDescLayoutWithHashTagTruncation$3");
            }
        }));
        return feedContentLayoutInfoLIZLLL;
    }
}
