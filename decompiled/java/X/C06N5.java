package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: renamed from: X.06N5, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06N5 extends C06O6<C06AH> {
    public final C1600706On LLILZ;
    public final InterfaceC1634606ae LLILZIL;
    public final C06OC LLILZLL;
    public final Set<EnumC1596306Mv> LLIZ;
    public final Set<C067L> LLIZLLLIL;

    @Override // X.C06O6
    public final boolean LIZLLL() {
        return true;
    }

    @Override // X.AnonymousClass0684
    public final Set<EnumC1596306Mv> LIZIZ() {
        return this.LLIZ;
    }

    @Override // X.C06O6
    public final C067K LJI() {
        return this.LLILZLL;
    }

    @Override // X.C06O6
    public final Set<C067L> LJII() {
        return this.LLIZLLLIL;
    }

    public C06N5(C1600706On c1600706On) {
        super(c1600706On);
        this.LLILZ = c1600706On;
        this.LLILZIL = c1600706On.LJIIJJI;
        this.LLILZLL = new C06OC(R.layout.crf);
        this.LLIZ = Collections.singleton(EnumC1596306Mv.SAFE_CONVERSATION);
        this.LLIZLLLIL = C13LQ.LJLIIL(new C067L[]{C067L.SINGLE, C067L.BUSINESS, C067L.GROUP});
    }

    @Override // X.C06O6
    public final void LJIIIZ(C06OO c06oo) {
        C1678606hk c1678606hk;
        View view = this.LLILLL;
        if ((view instanceof C1678606hk) && (c1678606hk = (C1678606hk) view) != null) {
            C1678606hk.LIZ(c1678606hk, 1);
        }
    }

    @Override // X.C06O6
    public final Object LJIIIIZZ(C06OO c06oo, InterfaceC1364105Vn interfaceC1364105Vn) {
        InterfaceC1628806Zi value;
        C06AH c06ah = (C06AH) c06oo;
        if (!c06ah.LIZ.isDebugMode() && C06N7.LIZ(c06ah.LIZJ.noticeCode)) {
            return new C06OH("Already acked");
        }
        if (this.LLILZ.LJI.getShowKeyBoardByDefault() || ((value = this.LLILZIL.LIZLLL().getValue()) != null && value.Ld())) {
            this.LLILZ.LJI.setShowSafeConversationAfterKeyboardDismiss(true);
            return new C06OH("Blocked by keyboard");
        }
        return C06OI.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    @Override // X.C06O6
    /* JADX INFO: renamed from: LJIIL, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(X.C06AH r6, X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C06N6
            if (r0 == 0) goto L50
            r4 = r7
            X.06N6 r4 = (X.C06N6) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L50
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r3 = r4.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILZ
            r0 = 1
            if (r1 == 0) goto L44
            if (r1 != r0) goto L56
            X.06AH r6 = r4.LL
            X.C155000ia.LIZIZ(r3)
        L24:
            X.06On r0 = r5.LLILZ
            com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo r3 = r0.LJI
            android.view.View r2 = r5.LLILLL
            boolean r0 = r2 instanceof X.C1678606hk
            if (r0 == 0) goto L41
            X.06hk r2 = (X.C1678606hk) r2
            if (r2 == 0) goto L41
            com.ss.android.ugc.aweme.im.common.model.IMNoticeMsgStruct r0 = r6.LIZJ
            java.lang.String r1 = r0.noticeCode
            if (r1 != 0) goto L3a
            java.lang.String r1 = ""
        L3a:
            java.lang.String r0 = r3.getConversationId()
            r2.LIZIZ(r3, r1, r0)
        L41:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L44:
            X.C155000ia.LIZIZ(r3)
            r4.LL = r6
            r4.LLILZ = r0
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r0 != r2) goto L24
            return r2
        L50:
            X.06N6 r4 = new X.06N6
            r4.<init>(r5, r7)
            goto L12
        L56:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06N5.LJIIJ(X.06AH, X.05Vn):java.lang.Object");
    }
}
