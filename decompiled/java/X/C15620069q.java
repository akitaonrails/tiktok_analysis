package X;

import android.view.View;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.quoted.ui.DefaultQuotedMessageClickHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.069q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.quoted.ui.DefaultQuotedMessageClickHandler$openQuotedStickerPreviewSheet$1", f = "DefaultQuotedMessageClickHandler.kt", l = {422, 426}, m = "invokeSuspend")
public final class C15620069q extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ DefaultQuotedMessageClickHandler LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ View LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15620069q(DefaultQuotedMessageClickHandler defaultQuotedMessageClickHandler, long j, View view, InterfaceC1364105Vn<? super C15620069q> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = defaultQuotedMessageClickHandler;
        this.LLILZ = j;
        this.LLILZIL = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C15620069q c15620069q = new C15620069q(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c15620069q.LLILLJJLI = obj;
        return c15620069q;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (r6 == null) goto L20;
     */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            r14 = this;
            r6 = r15
            java.lang.String r13 = "DefaultQuotedMessageClickHandler@b1e6.openQuotedStickerPreviewSheet$1"
            X.C1C7U.LIZ(r13)
            java.lang.Object r4 = X.C099R.LJFF()
            r5 = r14
            int r0 = r5.LL
            r3 = 2
            r11 = 1
            r2 = 0
            if (r0 == 0) goto L1f
            if (r0 == r11) goto L6c
            if (r0 != r3) goto Lb9
            X.C155000ia.LIZIZ(r6)
        L19:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r13)
            return r0
        L1f:
            X.C155000ia.LIZIZ(r6)
            java.lang.Object r10 = r5.LLILLJJLI
            X.01wk r10 = (X.InterfaceC497601wk) r10
            com.ss.android.ugc.aweme.im.sdk.chat.feature.quoted.ui.DefaultQuotedMessageClickHandler r0 = r5.LLILLL
            com.ss.android.ugc.aweme.im.messagelist.api.ability.MessagePowerListAbility r0 = r0.LIZ()
            if (r0 == 0) goto L53
            java.util.List r6 = r0.vi2()
            if (r6 == 0) goto L53
            long r0 = r5.LLILZ
            java.util.Iterator r12 = r6.iterator()
        L3a:
            boolean r6 = r12.hasNext()
            if (r6 == 0) goto L6a
            java.lang.Object r6 = r12.next()
            r7 = r6
            X.0Y9l r7 = (X.C869590Y9l) r7
            long r8 = r7.getMsgId()
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 != 0) goto L3a
        L4f:
            X.0Y9l r6 = (X.C869590Y9l) r6
            if (r6 != 0) goto L7d
        L53:
            X.1DFB r7 = X.C0PEM.LIZJ
            X.069p r6 = new X.069p
            long r0 = r5.LLILZ
            r6.<init>(r0, r2)
            r5.LLILLJJLI = r10
            r5.LL = r11
            java.lang.Object r6 = X.C23250099c.LJI(r5, r7, r6)
            if (r6 != r4) goto L73
            X.C1C7U.LIZIZ(r13)
            return r4
        L6a:
            r6 = r2
            goto L4f
        L6c:
            java.lang.Object r10 = r5.LLILLJJLI
            X.01wk r10 = (X.InterfaceC497601wk) r10
            X.C155000ia.LIZIZ(r6)
        L73:
            X.0Y9l r6 = (X.C869590Y9l) r6
            if (r6 != 0) goto L7d
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r13)
            return r0
        L7d:
            boolean r0 = X.C2296808zG.LJI(r10)
            if (r0 != 0) goto L89
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r13)
            return r0
        L89:
            java.lang.Class<com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate> r0 = com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate.class
            com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate r1 = X.C0Z2Z.LIZ(r6, r0)
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate
            if (r0 == 0) goto Lc1
            com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate r1 = (com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate) r1
            if (r1 == 0) goto Lc1
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r0 = X.C2107308Nj.LIZ
            X.08pq r0 = r0.LLIILII()
            X.069r r7 = new X.069r
            android.view.View r8 = r5.LLILZIL
            com.ss.android.ugc.aweme.im.sdk.chat.feature.quoted.ui.DefaultQuotedMessageClickHandler r9 = r5.LLILLL
            r12 = 0
            r11 = r1
            r10 = r6
            r7.<init>(r8, r9, r10, r11, r12)
            r5.LLILLJJLI = r2
            r5.LL = r3
            java.lang.Object r0 = X.C23250099c.LJI(r5, r0, r7)
            if (r0 != r4) goto L19
            X.C1C7U.LIZIZ(r13)
            return r4
        Lb9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lc1:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15620069q.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
