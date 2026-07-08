package X;

import Y.AComparatorS507S0100000_8;
import Y.ARunnableS77S0200000_8;
import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.MetricAffectingSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MFm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C565400MFm extends AbstractC1664490tPr<C557560Ltq, C557510Ltl> {
    public long LLJJJJ;
    public long LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public Integer LLJJLIIIJLLLLLLLZ;
    public Integer LLJL;
    public C557390LtZ LLJLIL;
    public boolean LLJLILLLLZIIL;
    public float LLJLL;
    public float LLJLLIL;
    public long LLJLLL;
    public long LLJZ;
    public long LLJZIJLIL;
    public boolean LLL;
    public ViewTreeObserver LLLF;
    public ViewTreeObserverOnPreDrawListenerC565470MFt LLLFF;
    public ViewOnLayoutChangeListenerC580890MqN LLLFFI;
    public C565430MFp LLLFZ;
    public boolean LLLIILIL;
    public MentionDataItem LLLIL;
    public final C01GW LLJJJIL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(347));
    public final float LLJJL = 8.5f;
    public final C01GW LLLI = C452501pT.LIZIZ(new AwS552S0100000_8(this, 827));
    public final C01GW LLLII = C452501pT.LIZIZ(new AwS552S0100000_8(this, 825));
    public final C01GW LLLIIII = C452501pT.LIZIZ(new AwS552S0100000_8(this, 824));
    public final C01GW LLLIIIIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 823));
    public final C01GW LLLIIIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 826));
    public final C01GW LLLIIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 828));

    public final void LLLLLJIL() {
        C0P0T c0p0tRemove;
        WeakHashMap<View, C0P0T> weakHashMap = C1325340kaq.LLJILJIL;
        C565430MFp c565430MFpLLLLLLIL = LLLLLLIL();
        if (c565430MFpLLLLLLIL != null && (c0p0tRemove = C1325340kaq.LLJILJIL.remove(c565430MFpLLLLLLIL)) != null) {
            c0p0tRemove.dismiss();
        }
        this.LLJJLIIIJLLLLLLLZ = null;
        this.LLJL = null;
        this.LLJLIL = null;
    }

    public final C565430MFp LLLLLL() {
        return (C565430MFp) this.LLLII.getValue();
    }

    public final C565430MFp LLLLLLIL() {
        return (C565430MFp) this.LLLI.getValue();
    }

    public final Set<MentionDataItem> LLLLLLJ() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List<C0M37> listLLLLLLL = LLLLLLL();
        if (listLLLLLLL != null) {
            Iterator<C0M37> it2 = listLLLLLLL.iterator();
            while (it2.hasNext()) {
                MentionDataItem mentionDataItem = it2.next().LL;
                if (mentionDataItem != null) {
                    linkedHashSet.add(mentionDataItem);
                }
            }
        }
        ArrayList arrayList = new ArrayList(LLLLILI().LIZ.LJI);
        C19719512Dh.LIZ(arrayList).remove(this.LLLIL);
        linkedHashSet.addAll(arrayList);
        return linkedHashSet;
    }

    public final void LLLLLLZ() {
        if (LLLLLLZZ(this, "")) {
            return;
        }
        LLLLIL().LIZJ.invoke(Boolean.TRUE, null);
        LLLLIL().LIZ.invoke(new C1279504zZ("", true));
    }

    public final List<C0M37> LLLLLLL() {
        Editable editableLLLZIL;
        Object[] spans;
        List<C0M37> listLJJLIIIIJ;
        C565430MFp c565430MFpLLLLLLIL = LLLLLLIL();
        return (c565430MFpLLLLLLIL == null || (editableLLLZIL = C2204961BRm.LLLZIL(c565430MFpLLLLLLIL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOuhdpbF1SbwsUxMXXUeowuwWHRLEUQJ7nth+wOGTW3757vAAtVTxsme0w==", null))) == null || (spans = editableLLLZIL.getSpans(0, editableLLLZIL.length(), C0M37.class)) == null || (listLJJLIIIIJ = C13LQ.LJJLIIIIJ(new AComparatorS507S0100000_8(editableLLLZIL, 1), spans)) == null) ? C13BV.INSTANCE : listLJJLIIIIJ;
    }

    public final void LLLLLLLLL() {
        View view;
        String str = LLLLILI().LIZ.LJIJJ;
        if (str == null || (view = this.mView) == null) {
            return;
        }
        C1389890mGx c1389890mGx = new C1389890mGx(view);
        c1389890mGx.LJIIJ(str);
        c1389890mGx.LJIIJJI();
    }

    public final void LLLLLLLZIL() {
        C565430MFp c565430MFpLLLLLLIL;
        if (LLLLILI().LIZ.LJIJI && (c565430MFpLLLLLLIL = LLLLLLIL()) != null) {
            HandlerHook.viewPost(c565430MFpLLLLLLIL, new ARunnableS77S0200000_8(c565430MFpLLLLLLIL, this, 24));
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onDestroyView() {
        ViewOnLayoutChangeListenerC580890MqN viewOnLayoutChangeListenerC580890MqN;
        ViewTreeObserverOnPreDrawListenerC565470MFt viewTreeObserverOnPreDrawListenerC565470MFt;
        LLLLLJIL();
        ViewTreeObserver viewTreeObserver = this.LLLF;
        if (viewTreeObserver != null && (viewTreeObserverOnPreDrawListenerC565470MFt = this.LLLFF) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(viewTreeObserverOnPreDrawListenerC565470MFt);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnPreDrawListenerC565470MFt, ViewTreeObserver.OnPreDrawListener.class);
        }
        this.LLLF = null;
        this.LLLFF = null;
        this.LLL = false;
        C565430MFp c565430MFp = this.LLLFZ;
        if (c565430MFp != null && (viewOnLayoutChangeListenerC580890MqN = this.LLLFFI) != null) {
            c565430MFp.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC580890MqN);
        }
        this.LLLFFI = null;
        this.LLLFZ = null;
        super.onDestroyView();
    }

    @Override // X.AbstractC1664490tPr, com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
        if (LLLLILI().LIZ.LIZLLL) {
            LLLLLZL(false);
            return;
        }
        C565430MFp c565430MFpLLLLLLIL = LLLLLLIL();
        if (c565430MFpLLLLLLIL != null) {
            c565430MFpLLLLLLIL.clearFocus();
        }
    }

    public static void LLLLZIL(C565430MFp c565430MFp) {
        Editable editableLLLZIL;
        if (c565430MFp != null && (editableLLLZIL = C2204961BRm.LLLZIL(c565430MFp, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOuhdpbF1SbwsUxMXXUeowuwWHRLEUQJ7nth+wOGTW3757vAAtVTxsme0w==", null))) != null) {
            int i = 0;
            for (Object obj : C13LQ.LJJLIIIIJ(C20085613iQ.LIZ(new AwS587S0100000_8(editableLLLZIL, 552), new AwS587S0100000_8(editableLLLZIL, 553)), editableLLLZIL.getSpans(0, editableLLLZIL.length(), C1325340kaq.class))) {
                int i2 = i + 1;
                if (i >= 0) {
                    C1325340kaq c1325340kaq = (C1325340kaq) obj;
                    String strValueOf = String.valueOf(i2);
                    if (!Intrinsics.LJFF(c1325340kaq.LIZIZ().LJ, strValueOf)) {
                        c1325340kaq.LLJI = strValueOf;
                        c1325340kaq.LL.LIZIZ.postInvalidate();
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }

    public final void LLLLLJLJLL(boolean z) {
        List<? extends MetricAffectingSpan> listLJJLIIIIJ;
        Editable editableLLLZIL;
        Object[] spans;
        List<C0M37> listLLLLLLL = LLLLLLL();
        C565430MFp c565430MFpLLLLLLIL = LLLLLLIL();
        Editable editableLLLZIL2 = null;
        if (c565430MFpLLLLLLIL == null || (editableLLLZIL = C2204961BRm.LLLZIL(c565430MFpLLLLLLIL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOuhdpbF1SbwsUxMXXUeowuwWHRLEUQJ7nth+wOGTW3757vAAtVTxsme0w==", null))) == null || (spans = editableLLLZIL.getSpans(0, editableLLLZIL.length(), MetricAffectingSpan.class)) == null || (listLJJLIIIIJ = C13LQ.LJJLIIIIJ(C20085613iQ.LIZ(new AwS587S0100000_8(editableLLLZIL, 555), new AwS587S0100000_8(editableLLLZIL, 556)), spans)) == null) {
            listLJJLIIIIJ = C13BV.INSTANCE;
        }
        InterfaceC1631630sYr<SpannableString, List<C0M37>, List<? extends MetricAffectingSpan>, Boolean, Unit> interfaceC1631630sYr = LLLLIL().LIZLLL;
        C565430MFp c565430MFpLLLLLLIL2 = LLLLLLIL();
        if (c565430MFpLLLLLLIL2 != null) {
            editableLLLZIL2 = C2204961BRm.LLLZIL(c565430MFpLLLLLLIL2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOuhdpbF1SbwsUxMXXUeowuwWHRLEUQJ7nth+wOGTW3757vAAtVTxsme0w==", null));
        }
        SpannableString spannableString = new SpannableString(editableLLLZIL2);
        if (listLLLLLLL == null) {
            listLLLLLLL = C13BV.INSTANCE;
        }
        if (listLJJLIIIIJ == null) {
            listLJJLIIIIJ = C13BV.INSTANCE;
        }
        interfaceC1631630sYr.invoke(spannableString, listLLLLLLL, listLJJLIIIIJ, Boolean.valueOf(z));
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0MFt, android.view.ViewTreeObserver$OnPreDrawListener] */
    public final void LLLLLLLLLL(final C565430MFp c565430MFp) {
        ViewTreeObserverOnPreDrawListenerC565470MFt viewTreeObserverOnPreDrawListenerC565470MFt;
        ViewOnLayoutChangeListenerC580890MqN viewOnLayoutChangeListenerC580890MqN;
        if (!LLLLILI().LIZ.LJIJI) {
            return;
        }
        if (c565430MFp == null) {
            c565430MFp = LLLLLLIL();
            C565430MFp c565430MFpLLLLLL = LLLLLL();
            if ((c565430MFp == null || c565430MFp.getVisibility() != 0) && ((c565430MFpLLLLLL != null && c565430MFpLLLLLL.getVisibility() == 0) || c565430MFp == null)) {
                c565430MFp = c565430MFpLLLLLL;
                if (c565430MFpLLLLLL == null) {
                    return;
                }
            }
        }
        C565430MFp c565430MFp2 = this.LLLFZ;
        if (c565430MFp2 != c565430MFp) {
            if (c565430MFp2 != null && (viewOnLayoutChangeListenerC580890MqN = this.LLLFFI) != null) {
                c565430MFp2.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC580890MqN);
            }
            ViewOnLayoutChangeListenerC580890MqN viewOnLayoutChangeListenerC580890MqN2 = new ViewOnLayoutChangeListenerC580890MqN(c565430MFp, this, 3);
            this.LLLFFI = viewOnLayoutChangeListenerC580890MqN2;
            this.LLLFZ = c565430MFp;
            c565430MFp.addOnLayoutChangeListener(viewOnLayoutChangeListenerC580890MqN2);
        }
        if (!c565430MFp.isShown() || !c565430MFp.isLaidOut() || this.LLL) {
            return;
        }
        this.LLL = true;
        ViewTreeObserver viewTreeObserver = this.LLLF;
        if (viewTreeObserver != null && (viewTreeObserverOnPreDrawListenerC565470MFt = this.LLLFF) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(viewTreeObserverOnPreDrawListenerC565470MFt);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnPreDrawListenerC565470MFt, ViewTreeObserver.OnPreDrawListener.class);
        }
        this.LLLF = null;
        this.LLLFF = null;
        final ViewTreeObserver viewTreeObserver2 = c565430MFp.getViewTreeObserver();
        this.LLLF = viewTreeObserver2;
        ?? r0 = new ViewTreeObserver.OnPreDrawListener() { // from class: X.0MFt
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                boolean z = false;
                if (!viewTreeObserver2.isAlive()) {
                    C565400MFm c565400MFm = this;
                    c565400MFm.LLL = false;
                    c565400MFm.LLLF = null;
                    c565400MFm.LLLFF = null;
                    return true;
                }
                C786410Ut5.D3(viewTreeObserver2, this);
                C565400MFm c565400MFm2 = this;
                c565400MFm2.LLL = false;
                c565400MFm2.LLLF = null;
                c565400MFm2.LLLFF = null;
                C565430MFp c565430MFp3 = c565430MFp;
                Layout layout = c565430MFp3.getLayout();
                if (layout != null) {
                    int lineCount = layout.getLineCount();
                    if (lineCount < 1) {
                        lineCount = 1;
                    }
                    int lineTop = layout.getLineTop(lineCount);
                    int compoundPaddingTop = c565430MFp3.getCompoundPaddingTop();
                    int compoundPaddingBottom = c565430MFp3.getCompoundPaddingBottom();
                    int iLIZIZ = C814420VxA.LIZIZ((c565430MFp3.getLineHeight() * c565400MFm2.LLJJL) + compoundPaddingTop + compoundPaddingBottom);
                    int iIntValue = ((Number) c565400MFm2.LLJJJIL.getValue()).intValue();
                    if (iLIZIZ < iIntValue) {
                        iLIZIZ = iIntValue;
                    }
                    int iLJ = C13LZ.LJ(lineTop + compoundPaddingTop + compoundPaddingBottom, ((Number) c565400MFm2.LLJJJIL.getValue()).intValue(), iLIZIZ);
                    ViewGroup.LayoutParams layoutParams = c565430MFp3.getLayoutParams();
                    if (layoutParams != null && layoutParams.height != iLJ) {
                        layoutParams.height = iLJ;
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c565430MFp3);
                        c565430MFp3.setLayoutParams(layoutParams);
                        z = true;
                    }
                }
                return !z;
            }
        };
        this.LLLFF = r0;
        C786410Ut5.y3(viewTreeObserver2, r0);
        c565430MFp.invalidate();
    }

    public final void LLLLLZ(boolean z) {
        if (z) {
            LLLLIL().LIZJ.invoke(Boolean.valueOf(z), C13LP.LLIIII(LLLLLLJ()));
        } else {
            LLLLIL().LIZJ.invoke(Boolean.FALSE, null);
        }
    }

    public final void LLLLLZL(boolean z) {
        C565430MFp c565430MFpLLLLLL;
        C565430MFp c565430MFpLLLLLLIL = LLLLLLIL();
        if (c565430MFpLLLLLLIL != null && c565430MFpLLLLLLIL.getVisibility() == 0) {
            c565430MFpLLLLLL = LLLLLLIL();
        } else {
            c565430MFpLLLLLL = LLLLLL();
        }
        if (z) {
            LLLLZ(this, c565430MFpLLLLLL);
        } else if (c565430MFpLLLLLL != null) {
            HandlerHook.viewPostDelay(c565430MFpLLLLLL, new ARunnableS77S0200000_8(c565430MFpLLLLLL, this, 25), 300L);
        }
    }

    public static boolean LLLLLLZZ(C565400MFm c565400MFm, String str) {
        Set<MentionDataItem> setLLLLLLJ = c565400MFm.LLLLLLJ();
        if (setLLLLLLJ.size() >= ((Number) c565400MFm.LLLLILI().LIZ(new C2217381BqS() { // from class: X.0LtW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C557560Ltq) obj).LIZIZ);
            }
        }).LIZJ()).intValue()) {
            c565400MFm.LLLLLZ(true);
            c565400MFm.LLLLIL().LIZ.invoke(new C1279504zZ(str, false));
            return true;
        }
        return false;
    }

    public static final void LLLLZ(C565400MFm c565400MFm, C565430MFp c565430MFp) {
        Activity activity;
        InputMethodManager inputMethodManager;
        if (c565430MFp != null && (activity = c565400MFm.mActivity) != null && (inputMethodManager = (InputMethodManager) activity.getSystemService(InputMethodManager.class)) != null) {
            c565430MFp.requestFocus();
            c565430MFp.setFocusableInTouchMode(true);
            inputMethodManager.showSoftInput(c565430MFp, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    @Override // com.bytedance.scene.Scene
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r11, android.os.Bundle r12) {
        /*
            Method dump skipped, instruction units count: 743
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C565400MFm.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.o2, viewGroup, false);
    }
}
