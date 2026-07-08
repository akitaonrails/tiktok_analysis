package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: renamed from: X.06O3, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06O3 extends C06O6<C06OO> {
    public final C1600706On LLILZ;
    public final InterfaceC1634606ae LLILZIL;
    public final C01GW LLILZLL;
    public final C06OC LLIZ;
    public final Set<EnumC1596306Mv> LLIZLLLIL;
    public final Set<C067L> LLJ;

    @Override // X.C06O6
    public final boolean LIZLLL() {
        return true;
    }

    @Override // X.AnonymousClass0684
    public final Set<EnumC1596306Mv> LIZIZ() {
        return this.LLIZLLLIL;
    }

    @Override // X.C06O6
    public final C067K LJI() {
        return this.LLIZ;
    }

    @Override // X.C06O6
    public final Set<C067L> LJII() {
        return this.LLJ;
    }

    public C06O3(C1600706On c1600706On) {
        super(c1600706On);
        this.LLILZ = c1600706On;
        this.LLILZIL = c1600706On.LJIIJJI;
        this.LLILZLL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 1070));
        this.LLIZ = new C06OC(R.layout.cs2);
        this.LLIZLLLIL = Collections.singleton(EnumC1596306Mv.BLOCK);
        this.LLJ = C13LQ.LJLIIL(new C067L[]{C067L.SINGLE, C067L.BUSINESS});
    }

    @Override // X.C06O6
    public final void LJIIIZ(C06OO c06oo) {
        C1600906Op c1600906Op;
        View view = this.LLILLL;
        if ((view instanceof C1600906Op) && (c1600906Op = (C1600906Op) view) != null && c1600906Op.getVisibility() == 0) {
            c1600906Op.LL.LIZ(c1600906Op);
            c1600906Op.LLZLI();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004e  */
    @Override // X.C06O6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(X.C06OO r7, X.InterfaceC1364105Vn<? super X.C06OJ> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C06O5
            if (r0 == 0) goto L4e
            r5 = r8
            X.06O5 r5 = (X.C06O5) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4e
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L2f
            if (r0 != r3) goto L5c
            X.C155000ia.LIZIZ(r1)
        L22:
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r1 = (com.ss.android.ugc.aweme.im.contacts.api.model.IMUser) r1
            if (r1 == 0) goto L54
            boolean r0 = r1.isBlock()
            if (r0 != r3) goto L54
            X.06OI r0 = X.C06OI.LIZ
            return r0
        L2f:
            X.C155000ia.LIZIZ(r1)
            X.06Mv r0 = r7.LIZ
            boolean r0 = r0.isDebugMode()
            if (r0 == 0) goto L3d
            X.06OI r0 = X.C06OI.LIZ
            return r0
        L3d:
            r5.LLILLL = r3
            X.1DFB r2 = X.C0PEM.LIZJ
            X.069h r1 = new X.069h
            r0 = 0
            r1.<init>(r6, r0)
            java.lang.Object r1 = X.C23250099c.LJI(r5, r2, r1)
            if (r1 != r4) goto L22
            return r4
        L4e:
            X.06O5 r5 = new X.06O5
            r5.<init>(r6, r8)
            goto L12
        L54:
            X.06OH r1 = new X.06OH
            java.lang.String r0 = "Not blocked"
            r1.<init>(r0)
            return r1
        L5c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06O3.LJIIIIZZ(X.06OO, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    @Override // X.C06O6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(X.C06OO r8, X.InterfaceC1364105Vn<? super kotlin.Unit> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C06O4
            if (r0 == 0) goto L74
            r6 = r9
            X.06O4 r6 = (X.C06O4) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L74
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r2 = r6.LLILLJJLI
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r4 = 1
            if (r0 == 0) goto L40
            if (r0 != r4) goto L7a
            X.06Op r3 = r6.LL
            X.C155000ia.LIZIZ(r2)
        L24:
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r2 = (com.ss.android.ugc.aweme.im.contacts.api.model.IMUser) r2
            if (r2 == 0) goto L3a
            X.06On r0 = r7.LLILZ
            com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo r1 = r0.LJI
            X.01GW r0 = r7.LLILZLL
            java.lang.Object r0 = r0.getValue()
            X.06Om r0 = (X.C1600606Om) r0
            r3.LLILZLL = r1
            r3.LLIZ = r2
            r3.LLIZLLLIL = r0
        L3a:
            r3.LIZ()
        L3d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L40:
            X.C155000ia.LIZIZ(r2)
            android.view.View r3 = r7.LLILLL
            boolean r0 = r3 instanceof X.C1600906Op
            r2 = 0
            if (r0 == 0) goto L3d
            X.06Op r3 = (X.C1600906Op) r3
            if (r3 == 0) goto L3d
            X.06On r0 = r7.LLILZ
            X.01GW<X.06aE> r0 = r0.LJIIIZ
            java.lang.Object r1 = r0.getValue()
            X.06aB r0 = r3.LL
            java.util.List<X.06aE> r0 = r0.LLILLJJLI
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r1)
            r6.getClass()
            r6.LL = r3
            r6.LLILZ = r4
            X.1DFB r1 = X.C0PEM.LIZJ
            X.069h r0 = new X.069h
            r0.<init>(r7, r2)
            java.lang.Object r2 = X.C23250099c.LJI(r6, r1, r0)
            if (r2 != r5) goto L24
            return r5
        L74:
            X.06O4 r6 = new X.06O4
            r6.<init>(r7, r9)
            goto L12
        L7a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06O3.LJIIJ(X.06OO, X.05Vn):java.lang.Object");
    }
}
