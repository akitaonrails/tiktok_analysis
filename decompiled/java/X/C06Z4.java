package X;

import com.ss.android.ugc.aweme.im.messagelist.ui.MessageListSubmitListAbilityImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Z4, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.messagelist.ui.MessageListSubmitListAbilityImpl$setSubmitListFromMessageEvent$shouldIntercept$1", f = "MessageListSubmitListAbilityImpl.kt", l = {409}, m = "invokeSuspend")
public final class C06Z4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public C013C LL;
    public InterfaceC904740ZeS LLILLJJLI;
    public Object LLILLL;
    public C013C LLILZ;
    public boolean LLILZIL;
    public int LLILZLL;
    public final /* synthetic */ MessageListSubmitListAbilityImpl LLIZ;
    public final /* synthetic */ InterfaceC904740ZeS LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06Z4(MessageListSubmitListAbilityImpl messageListSubmitListAbilityImpl, InterfaceC904740ZeS interfaceC904740ZeS, InterfaceC1364105Vn<? super C06Z4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = messageListSubmitListAbilityImpl;
        this.LLIZLLLIL = interfaceC904740ZeS;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06Z4(this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004d -> B:6:0x001f). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r8 = "MessageListSubmitListAbilityImpl@4ce5.setSubmitListFromMessageEvent$shouldIntercept$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r9.LLILZLL
            r6 = 1
            if (r0 == 0) goto L4f
            if (r0 != r6) goto L70
            boolean r5 = r9.LLILZIL
            X.013C r1 = r9.LLILZ
            java.lang.Object r4 = r9.LLILLL
            java.util.Iterator r4 = (java.util.Iterator) r4
            X.0ZeS r3 = r9.LLILLJJLI
            X.013C r2 = r9.LL
            X.C155000ia.LIZIZ(r10)
        L1f:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r0 = r10.booleanValue()
            r0 = r0 | r5
            r1.element = r0
            r1 = r2
        L29:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L66
            java.lang.Object r0 = r4.next()
            com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol r0 = (com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol) r0
            boolean r5 = r1.element
            r9.LL = r1
            r9.LLILLJJLI = r3
            r9.LLILLL = r4
            r9.LLILZ = r1
            r9.LLILZIL = r5
            r9.LLILZLL = r6
            java.lang.Object r10 = r0.NX1(r3, r9)
            if (r10 != r7) goto L4d
            X.C1C7U.LIZIZ(r8)
            return r7
        L4d:
            r2 = r1
            goto L1f
        L4f:
            X.C155000ia.LIZIZ(r10)
            X.013C r1 = new X.013C
            r1.<init>()
            com.ss.android.ugc.aweme.im.messagelist.ui.MessageListSubmitListAbilityImpl r0 = r9.LLIZ
            X.0ZeK r0 = r0.LLILLL
            java.util.List r0 = r0.LIZ()
            X.0ZeS r3 = r9.LLIZLLLIL
            java.util.Iterator r4 = r0.iterator()
            goto L29
        L66:
            boolean r0 = r1.element
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.C1C7U.LIZIZ(r8)
            return r0
        L70:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06Z4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
