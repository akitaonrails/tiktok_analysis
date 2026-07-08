package X;

import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: renamed from: X.06k2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1692806k2 extends C06O6<C06OO> {
    public final C1600706On LLILZ;
    public final C06OC LLILZIL;
    public final Set<EnumC1596306Mv> LLILZLL;
    public final Set<C067L> LLIZ;

    public final boolean LJIIL() {
        EnumC899300ZPs state;
        C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(this.LLILZ.LJFF, ChatRoomScope.class);
        Object ability = c0qsjLIZJ != null ? c0qsjLIZJ.getAbility(InterfaceC1693006k4.class) : null;
        InterfaceC1693006k4 interfaceC1693006k4 = (InterfaceC1693006k4) (ability instanceof InterfaceC1693006k4 ? ability : null);
        return (interfaceC1693006k4 == null || (state = interfaceC1693006k4.getState()) == null || !state.isLoadingOrPreview()) ? false : true;
    }

    @Override // X.C06O6
    public final boolean LIZLLL() {
        return LJIIL();
    }

    @Override // X.AnonymousClass0684
    public final Set<EnumC1596306Mv> LIZIZ() {
        return this.LLILZLL;
    }

    @Override // X.C06O6
    public final C067K LJI() {
        return this.LLILZIL;
    }

    @Override // X.C06O6
    public final Set<C067L> LJII() {
        return this.LLIZ;
    }

    public C1692806k2(C1600706On c1600706On) {
        super(c1600706On);
        this.LLILZ = c1600706On;
        this.LLILZIL = new C06OC(R.layout.cjt);
        this.LLILZLL = Collections.singleton(EnumC1596306Mv.GROUP_PREVIEW_BOTTOM_BAR);
        this.LLIZ = Collections.singleton(C067L.GROUP);
    }

    @Override // X.C06O6
    public final Object LJIIIIZZ(C06OO c06oo, InterfaceC1364105Vn<? super C06OJ> interfaceC1364105Vn) {
        if (c06oo.LIZ.isDebugMode()) {
            return C06OI.LIZ;
        }
        if (LJIIL() && this.LLILZ.LJI.getPreviewConfig() != null) {
            return C06OI.LIZ;
        }
        return new C06OH("preview bottom bar not valid");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    @Override // X.C06O6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(X.C06OO r6, X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C1692906k3
            if (r0 == 0) goto L39
            r4 = r7
            X.06k3 r4 = (X.C1692906k3) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L39
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILLL
            r0 = 1
            if (r1 == 0) goto L2f
            if (r1 != r0) goto L56
            X.C155000ia.LIZIZ(r3)
        L22:
            X.06On r0 = r5.LLILZ
            com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo r0 = r0.LJI
            com.ss.android.ugc.aweme.im.chatroom.api.model.PreviewConfig r1 = r0.getPreviewConfig()
            if (r1 != 0) goto L3f
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2f:
            X.C155000ia.LIZIZ(r3)
            r4.LLILLL = r0
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r0 != r2) goto L22
            return r2
        L39:
            X.06k3 r4 = new X.06k3
            r4.<init>(r5, r7)
            goto L12
        L3f:
            android.view.View r2 = r5.LLILLL
            boolean r0 = r2 instanceof X.C1706506mF
            if (r0 == 0) goto L53
            X.06mF r2 = (X.C1706506mF) r2
            if (r2 == 0) goto L53
            com.ss.android.ugc.aweme.im.chatroom.api.model.PreviewJoinButtonState r1 = r1.joinButtonState
            X.0i7g r0 = new X.0i7g
            r0.<init>(r5)
            r2.e0(r1, r0)
        L53:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L56:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1692806k2.LJIIJ(X.06OO, X.05Vn):java.lang.Object");
    }
}
