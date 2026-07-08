package X;

import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: renamed from: X.06NA, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06NA extends C06O6<C06OO> {
    public final C1600706On LLILZ;
    public final C1671006gW LLILZIL;
    public final C01GW LLILZLL;
    public final Set<EnumC1596306Mv> LLIZ;
    public final Set<C067L> LLIZLLLIL;

    @Override // X.C06O6
    public final boolean LIZLLL() {
        return true;
    }

    @Override // X.C06O6
    public final C067K LJI() {
        return (C067K) this.LLILZLL.getValue();
    }

    @Override // X.AnonymousClass0684
    public final Set<EnumC1596306Mv> LIZIZ() {
        return this.LLIZ;
    }

    @Override // X.C06O6
    public final Set<C067L> LJII() {
        return this.LLIZLLLIL;
    }

    @Override // X.C06O6
    public final void LJIIIZ(C06OO c06oo) {
        this.LLILZIL.LIZIZ();
    }

    public C06NA(C1600706On c1600706On, C1671006gW c1671006gW) {
        super(c1600706On);
        this.LLILZ = c1600706On;
        this.LLILZIL = c1671006gW;
        this.LLILZLL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 1084));
        this.LLIZ = Collections.singleton(EnumC1596306Mv.PERMISSION_MESSAGE);
        this.LLIZLLLIL = C13LQ.LJLIIL(new C067L[]{C067L.SINGLE, C067L.BUSINESS});
    }

    @Override // X.C06O6
    public final Object LJIIIIZZ(C06OO c06oo, InterfaceC1364105Vn<? super C06OJ> interfaceC1364105Vn) {
        C06AJ c06aj;
        C909290Zln c909290Zln;
        if ((c06oo instanceof C06AJ) && (c06aj = (C06AJ) c06oo) != null) {
            if (!c06oo.LIZ.isDebugMode()) {
                SessionInfo sessionInfo = this.LLILZ.LJI;
                if (C879390Yef.LJFF(sessionInfo.getConversationId()) || (((sessionInfo instanceof C909290Zln) && (c909290Zln = (C909290Zln) sessionInfo) != null && c909290Zln.isTCM()) || C06N7.LIZ(c06aj.LIZLLL))) {
                    return new C06OH("TCM or already acked");
                }
            }
            return C06OI.LIZ;
        }
        return new C06OH("Not top tip message task");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    @Override // X.C06O6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(X.C06OO r6, X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C06NC
            if (r0 == 0) goto L42
            r4 = r7
            X.06NC r4 = (X.C06NC) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L42
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r3 = r4.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILZ
            r0 = 1
            if (r1 == 0) goto L36
            if (r1 != r0) goto L4b
            X.06OO r6 = r4.LL
            X.C155000ia.LIZIZ(r3)
        L24:
            boolean r0 = r6 instanceof X.C06AJ
            if (r0 == 0) goto L48
            X.06AJ r6 = (X.C06AJ) r6
            if (r6 == 0) goto L48
            X.06gW r1 = r5.LLILZIL
            com.ss.android.ugc.aweme.im.message.content.SystemContent r0 = r6.LIZJ
            X.C1670806gU.LIZIZ(r1, r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L36:
            X.C155000ia.LIZIZ(r3)
            r4.LL = r6
            r4.LLILZ = r0
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r0 != r2) goto L24
            return r2
        L42:
            X.06NC r4 = new X.06NC
            r4.<init>(r5, r7)
            goto L12
        L48:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L4b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06NA.LJIIJ(X.06OO, X.05Vn):java.lang.Object");
    }
}
