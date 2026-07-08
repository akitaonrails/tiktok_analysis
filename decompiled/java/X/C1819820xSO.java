package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.assems.IntelligentBoardTemplateForYouListAssem;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0xSO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1819820xSO extends C09AY implements Function2<UIAssem, C627660Ojc<InterfaceC1891350zJl>, Unit> {
    public final /* synthetic */ IntelligentBoardTemplateForYouListAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1819820xSO(IntelligentBoardTemplateForYouListAssem intelligentBoardTemplateForYouListAssem) {
        super(2);
        this.LL = intelligentBoardTemplateForYouListAssem;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* bridge */ /* synthetic */ kotlin.Unit invoke(com.bytedance.assem.arch.core.UIAssem r5, X.C627660Ojc<X.InterfaceC1891350zJl> r6) {
        /*
            r4 = this;
            X.0Ojc r6 = (X.C627660Ojc) r6
            X.06Xk<X.0OhC> r0 = r6.LL
            boolean r0 = r0 instanceof X.C1623706Xj
            r2 = 0
            if (r0 == 0) goto Lab
            com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.assems.IntelligentBoardTemplateForYouListAssem r0 = r4.LL
            X.01GW r0 = r0.LLJI
            java.lang.Object r0 = r0.getValue()
            X.16FZ r0 = (X.C16FZ) r0
            if (r0 == 0) goto L18
            X.C786410Ut5.LLLIZZ(r0, r2)
        L18:
            X.06Xk<X.0OhC> r0 = r6.LL
            boolean r0 = r0 instanceof X.C1623606Xi
            r3 = 1
            if (r0 == 0) goto L45
            com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.assems.IntelligentBoardTemplateForYouListAssem r1 = r4.LL
            boolean r0 = r1.LLJILJIL
            if (r0 != 0) goto L45
            r1.LLJILJIL = r3
            com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.assems.vm.IntelligentBoardTemplateForYouListViewModel r0 = r1.ip()
            r0.yQ2(r2)
            com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.assems.IntelligentBoardTemplateForYouListAssem r0 = r4.LL
            X.15jv r0 = r0.Go()
            android.view.ViewTreeObserver r2 = r0.getViewTreeObserver()
            X.0xSP r1 = new X.0xSP
            com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.assems.IntelligentBoardTemplateForYouListAssem r0 = r4.LL
            r1.<init>()
            X.C786410Ut5.x3(r2, r1)
        L42:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L45:
            X.06Xk<X.0OhC> r0 = r6.LLILLL
            boolean r0 = r0 instanceof X.C1623606Xi
            if (r0 == 0) goto L9b
            com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.assems.IntelligentBoardTemplateForYouListAssem r0 = r4.LL
            com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.assems.vm.IntelligentBoardTemplateForYouListViewModel r0 = r0.ip()
            boolean r0 = r0.LLJI
            if (r0 == 0) goto L9b
            com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.assems.IntelligentBoardTemplateForYouListAssem r0 = r4.LL
            com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.assems.vm.IntelligentBoardTemplateForYouListViewModel r0 = r0.ip()
            r0.LLJI = r2
            com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.assems.IntelligentBoardTemplateForYouListAssem r1 = r4.LL
            boolean r0 = r1.LLJILJILJ
            if (r0 != 0) goto L88
            r1.LLJILJILJ = r3
            X.15jv r0 = r1.Go()
            int r1 = r0.getWidth()
            com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.assems.IntelligentBoardTemplateForYouListAssem r0 = r4.LL
            com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.assems.vm.IntelligentBoardTemplateForYouListViewModel r0 = r0.ip()
            int r0 = r0.LLILLL
            int r1 = r1 - r0
            int r2 = r1 / 2
            com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.assems.IntelligentBoardTemplateForYouListAssem r0 = r4.LL
            com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.rv.ScaleAndAlphaLinearLayoutManager r1 = r0.LLJILLL
            if (r1 == 0) goto L42
            com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.assems.vm.IntelligentBoardTemplateForYouListViewModel r0 = r0.ip()
            int r0 = r0.LLJ
            r1.scrollToPositionWithOffset(r0, r2)
            goto L42
        L88:
            X.15jv r0 = r1.Go()
            android.view.ViewTreeObserver r2 = r0.getViewTreeObserver()
            X.0xSQ r1 = new X.0xSQ
            com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.assems.IntelligentBoardTemplateForYouListAssem r0 = r4.LL
            r1.<init>()
            X.C786410Ut5.x3(r2, r1)
            goto L42
        L9b:
            X.06Xk<X.0OhC> r0 = r6.LLILLJJLI
            boolean r0 = r0 instanceof X.C1623606Xi
            if (r0 == 0) goto L42
            com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.assems.IntelligentBoardTemplateForYouListAssem r0 = r4.LL
            X.15jv r0 = r0.Go()
            r0.invalidateItemDecorations()
            goto L42
        Lab:
            com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.assems.IntelligentBoardTemplateForYouListAssem r0 = r4.LL
            X.01GW r0 = r0.LLJI
            java.lang.Object r1 = r0.getValue()
            X.16FZ r1 = (X.C16FZ) r1
            if (r1 == 0) goto L18
            r0 = 8
            X.C786410Ut5.LLLIZZ(r1, r0)
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1819820xSO.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
