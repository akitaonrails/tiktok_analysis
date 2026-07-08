package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.sticker.types.ar.text.ARTextResultModule;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.SoftKeyBoardListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.18jI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21365018jI extends AbstractC1622390sJx implements InterfaceC1159800gHq, InterfaceC1623110sL7 {
    public final C19GS LLILLJJLI;
    public final InterfaceC1624480sNK LLILLL;
    public final InterfaceC21366018jS LLILZ;
    public final Function0<ViewGroup> LLILZIL;
    public final InterfaceC1622330sJr LLILZLL;
    public final InterfaceC1463990oCT LLIZ;
    public final Function0<Integer> LLIZLLLIL;
    public final Function2<String, String, Unit> LLJ;
    public final Function1<Effect, Boolean> LLJI;
    public final Function2<Effect, String, C21366118jT> LLJIJIL;
    public final InterfaceC21358118iB LLJILJIL;
    public final boolean LLJILJILJ;
    public final boolean LLJILLL;
    public final Function1<Effect, Boolean> LLJJ;
    public final Function0<Boolean> LLJJI;
    public boolean LLJJIII;
    public Effect LLJJIJI;
    public final C21365618jO LLJJIJIIJIL;
    public final C560530Lyd<Unit> LLJJIJIL;
    public final ARTextResultModule LLJJJ;

    @Override // X.InterfaceC1159800gHq
    public final void LJI() {
    }

    @Override // X.InterfaceC1159800gHq
    public final void LJIIIZ(View view) {
    }

    @Override // X.AbstractC1622390sJx
    public final void LJJIFFI() {
        this.LLJJIJI = null;
        C21365618jO c21365618jO = this.LLJJIJIIJIL;
        for (int i = 0; i < c21365618jO.LIZ.size(); i++) {
            int iKeyAt = c21365618jO.LIZ.keyAt(i);
            C21365218jK c21365218jK = c21365618jO.LIZ.get(iKeyAt);
            SoftKeyBoardListener softKeyBoardListener = c21365218jK.LIZIZ;
            if (softKeyBoardListener != null) {
                softKeyBoardListener.LIZ();
            }
            c21365218jK.LJ("");
            c21365618jO.LIZ.get(iKeyAt).LJIIIZ = false;
        }
        ViewGroup viewGroupInvoke = this.LLILZIL.invoke();
        if (viewGroupInvoke != null) {
            ArrayList arrayList = new ArrayList();
            int childCount = viewGroupInvoke.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroupInvoke.getChildAt(i2);
                if (childAt instanceof C21359318iN) {
                    arrayList.add(childAt);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C786410Ut5.LJJJLZIJ((View) it2.next(), viewGroupInvoke);
            }
            arrayList.clear();
        }
    }

    @Override // X.InterfaceC1159800gHq
    public final void LIZLLL(EnumC1155090gAF enumC1155090gAF) {
        this.LLJJIII = true;
    }

    @Override // X.InterfaceC1159800gHq
    public final void LJIIZILJ(EnumC1155090gAF enumC1155090gAF) {
        Effect effect;
        this.LLJJIII = false;
        if (enumC1155090gAF == EnumC1155090gAF.AFTER_ANIMATE && (effect = this.LLJJIJI) != null) {
            C21365618jO c21365618jO = this.LLJJIJIIJIL;
            c21365618jO.getClass();
            if (!effect.getTags().contains("AR")) {
                effect.getTags().contains("text2d");
            }
            C21365118jJ c21365118jJ = c21365618jO.LIZIZ;
            C21366118jT c21366118jT = c21365118jJ.LIZLLL;
            if (c21366118jT != null) {
                c21365118jJ.LIZJ = c21366118jT;
                c21365118jJ.LIZLLL = null;
                c21365118jJ.LIZ(c21366118jT);
            }
        }
    }

    @Override // X.AbstractC1622390sJx
    public final boolean LJJI(C1627370sRz c1627370sRz) {
        Effect effect = c1627370sRz.LIZ;
        Function1<Effect, Boolean> function1 = this.LLJI;
        if (function1 != null) {
            return function1.invoke(effect).booleanValue();
        }
        return C1624570sNT.LJI(effect);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    @Override // X.AbstractC1622390sJx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIII(X.C1623370sLX r13, X.C1627370sRz r14) {
        /*
            r12 = this;
            com.ss.android.ugc.effectmanager.effect.model.Effect r11 = r14.LIZ
            r12.LLJJIJI = r11
            X.18jS r1 = r12.LLILZ
            X.19GS r0 = r12.LLILLJJLI
            java.lang.String r0 = X.C838580Wv2.LIZ(r0)
            r1.LJL(r0)
            kotlin.jvm.functions.Function0<android.view.ViewGroup> r0 = r12.LLILZIL
            java.lang.Object r10 = r0.invoke()
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            if (r10 == 0) goto L7a
            X.18jO r9 = r12.LLJJIJIIJIL
            X.0sJr r8 = r12.LLILZLL
            X.19GS r7 = r12.LLILLJJLI
            kotlin.jvm.functions.Function0<java.lang.Integer> r6 = r12.LLIZLLLIL
            boolean r5 = r12.LLJILLL
            r4 = 0
        L24:
            android.util.SparseArray<X.18jK> r0 = r9.LIZ
            int r0 = r0.size()
            if (r4 >= r0) goto L7a
            android.util.SparseArray<X.18jK> r0 = r9.LIZ
            int r2 = r0.keyAt(r4)
            r3 = 1
            if (r5 == 0) goto L60
            X.18iI r1 = new X.18iI
            r1.<init>(r7, r11)
        L3a:
            r1.setTopMarginSupplier(r6)
            r10.addView(r1)
            android.util.SparseArray<X.18jK> r0 = r9.LIZ
            java.lang.Object r2 = r0.get(r2)
            X.18jK r2 = (X.C21365218jK) r2
            r2.LIZJ(r1)
            r2.LJ = r8
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.SoftKeyBoardListener r0 = r2.LIZIZ
            if (r0 == 0) goto L5b
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.SoftKeyBoardListener r1 = r2.LIZIZ
            X.18jL r0 = new X.18jL
            r0.<init>()
            r1.LIZIZ(r0)
        L5b:
            r2.LJIIIZ = r3
            int r4 = r4 + 1
            goto L24
        L60:
            if (r2 == 0) goto L74
            if (r2 == r3) goto L6e
            r0 = 2
            if (r2 == r0) goto L74
            X.18iN r1 = new X.18iN
            r0 = 0
            r1.<init>(r7, r0)
            goto L3a
        L6e:
            X.18iM r1 = new X.18iM
            r1.<init>(r7)
            goto L3a
        L74:
            X.18iL r1 = new X.18iL
            r1.<init>(r7)
            goto L3a
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21365018jI.LJJIII(X.0sLX, X.0sRz):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC1623110sL7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMessageReceived(int r6, int r7, int r8, java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21365018jI.onMessageReceived(int, int, int, java.lang.String):void");
    }

    public C21365018jI(C19GS c19gs, InterfaceC1624480sNK interfaceC1624480sNK, InterfaceC21366018jS interfaceC21366018jS, Function0 function0, InterfaceC1622330sJr interfaceC1622330sJr, Function0 function02, Function2 function2, Function1 function1, Function2 function22, Function0 function03) {
        C0FWM c0fwm = C0FWM.LIZ;
        this.LLILLJJLI = c19gs;
        this.LLILLL = interfaceC1624480sNK;
        this.LLILZ = interfaceC21366018jS;
        this.LLILZIL = function0;
        this.LLILZLL = interfaceC1622330sJr;
        this.LLIZ = c0fwm;
        this.LLIZLLLIL = function02;
        this.LLJ = function2;
        this.LLJI = function1;
        this.LLJIJIL = function22;
        this.LLJILJIL = null;
        this.LLJILJILJ = false;
        this.LLJILLL = false;
        this.LLJJ = null;
        this.LLJJI = function03;
        this.LLJJIJIIJIL = new C21365618jO(c19gs, interfaceC1624480sNK, interfaceC21366018jS, function2, function1, C0EBE.LIZ((View) function0.invoke()));
        this.LLJJIJIL = new C560530Lyd<>();
        this.LLJJJ = (ARTextResultModule) C1659630tI1.LJII((View) function0.invoke(), c19gs, 4).get(ARTextResultModule.class);
    }
}
