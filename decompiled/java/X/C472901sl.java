package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01sl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocols.bottomanchors.keyframe.SearchKeyframeOptDir3PanelCell$bind$1", f = "SearchKeyframeOptDir3PanelAssem.kt", l = {90}, m = "invokeSuspend")
public final class C472901sl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C434820H3g LLILLJJLI;
    public final /* synthetic */ C473201so LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C472901sl(C434820H3g c434820H3g, C473201so c473201so, InterfaceC1364105Vn<? super C472901sl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c434820H3g;
        this.LLILLL = c473201so;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C472901sl(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r5 = "SearchKeyframeOptDir3PanelCell@db90.bind$1"
            X.C1C7U.LIZ(r5)
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r6.LL
            r4 = 0
            r1 = 1
            if (r0 == 0) goto L43
            if (r0 != r1) goto L60
            X.C155000ia.LIZIZ(r7)
        L14:
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
        L16:
            X.01so r0 = r6.LLILLL
            int r1 = r0.getBindingAdapterPosition()
            r0 = -1
            if (r1 == r0) goto L5a
            X.01so r3 = r6.LLILLL
            X.0H3g r1 = r3.LLILLL
            X.0H3g r0 = r6.LLILLJJLI
            if (r1 != r0) goto L5a
            if (r7 == 0) goto L3d
            android.view.View r2 = r3.itemView
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r1 = X.C2107308Nj.LIZ
            X.01sk r0 = new X.01sk
            r0.<init>(r7, r3, r4)
            X.C948503nH.LIZLLL(r2, r1, r0)
        L37:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        L3d:
            X.0EpL r0 = r3.LL
            r0.setImageDrawable(r4)
            goto L37
        L43:
            X.C155000ia.LIZIZ(r7)
            X.0H3g r0 = r6.LLILLJJLI
            X.0957<android.graphics.Bitmap> r0 = r0.LIZIZ
            if (r0 == 0) goto L58
            r6.LL = r1
            java.lang.Object r7 = r0.LJLIIIL(r6)
            if (r7 != r2) goto L14
            X.C1C7U.LIZIZ(r5)
            return r2
        L58:
            r7 = r4
            goto L16
        L5a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        L60:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C472901sl.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
