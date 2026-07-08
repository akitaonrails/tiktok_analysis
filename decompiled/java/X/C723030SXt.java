package X;

import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.InteractPlayListBottomBarAssem;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0SXt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.InteractPlayListBottomBarAssem$onViewFinishInflate$1$2$1$1$job$1", f = "PlayListBottomBarAssem.kt", l = {332, 333}, m = "invokeSuspend")
public final class C723030SXt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends AbstractC1623806Xk<? extends Unit>, ? extends AbstractC1623806Xk<? extends Unit>>>, Object> {
    public AbstractC1623806Xk LL;
    public int LLILLJJLI;
    public final /* synthetic */ InterfaceC723050SXv LLILLL;
    public final /* synthetic */ InteractPlayListBottomBarAssem LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C723030SXt(InterfaceC723050SXv interfaceC723050SXv, InteractPlayListBottomBarAssem interactPlayListBottomBarAssem, InterfaceC1364105Vn<? super C723030SXt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC723050SXv;
        this.LLILZ = interactPlayListBottomBarAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C723030SXt(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "InteractPlayListBottomBarAssem@6241.onViewFinishInflate$1$2$1$1$job$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r7.LLILLJJLI
            r4 = 0
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L23
            if (r0 == r2) goto L44
            if (r0 != r3) goto L68
            X.06Xk r2 = r7.LL
            X.C155000ia.LIZIZ(r8)
        L19:
            r4 = r8
        L1a:
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r2, r4)
            X.C1C7U.LIZIZ(r6)
            return r0
        L23:
            X.C155000ia.LIZIZ(r8)
            X.0SXv r1 = r7.LLILLL
            if (r1 == 0) goto L42
            com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.InteractPlayListBottomBarAssem r0 = r7.LLILZ
            java.lang.Object r0 = X.C631370Opb.LIZ(r0)
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            r7.LLILLJJLI = r2
            java.lang.Object r8 = r1.ew2(r0, r7)
            if (r8 != r5) goto L47
            X.C1C7U.LIZIZ(r6)
            return r5
        L42:
            r2 = r4
            goto L4a
        L44:
            X.C155000ia.LIZIZ(r8)
        L47:
            r2 = r8
            X.06Xk r2 = (X.AbstractC1623806Xk) r2
        L4a:
            X.0SXv r1 = r7.LLILLL
            if (r1 == 0) goto L1a
            com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.InteractPlayListBottomBarAssem r0 = r7.LLILZ
            java.lang.Object r0 = X.C631370Opb.LIZ(r0)
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            r7.LL = r2
            r7.LLILLJJLI = r3
            java.lang.Object r8 = r1.uk2(r0, r7)
            if (r8 != r5) goto L19
            X.C1C7U.LIZIZ(r6)
            return r5
        L68:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C723030SXt.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends AbstractC1623806Xk<? extends Unit>, ? extends AbstractC1623806Xk<? extends Unit>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
