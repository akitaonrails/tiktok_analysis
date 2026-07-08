package X;

import com.ss.android.ugc.aweme.im.ai.api.bot.IMAIBotInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05uW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.smartreply.chore.SmartReplyBotInfoHelper$getBotInfoFromNetwork$1", f = "SmartReplyBotInfoHelper.kt", l = {46}, m = "invokeSuspend")
public final class C1503005uW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Function2<IMAIBotInfo, InterfaceC1364105Vn<? super Unit>, Object> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1503005uW(Function2<? super IMAIBotInfo, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function2, InterfaceC1364105Vn<? super C1503005uW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1503005uW(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to X.05uW for r6v1 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // njp.a
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r5 = "SmartReplyBotInfoHelper@c7eb.getBotInfoFromNetwork$1"
            X.C1C7U.LIZ(r5)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LL
            r3 = 1
            if (r0 == 0) goto L19
            if (r0 != r3) goto L44
            X.C155000ia.LIZIZ(r7)
        L13:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        L19:
            X.C155000ia.LIZIZ(r7)
            X.061m r2 = X.C15408061m.LIZ
            X.060u r0 = X.C15390060u.LL
            r0.getClass()
            int r1 = X.C15390060u.LLILLJJLI
            X.05vk r0 = X.EnumC1510605vk.NETWORK
            r2.getClass()
            java.util.List r0 = X.C15408061m.LJII(r1, r0)
            if (r0 == 0) goto L42
            java.lang.Object r1 = X.C13LP.LJJJLL(r0)
        L34:
            kotlin.jvm.functions.Function2<com.ss.android.ugc.aweme.im.ai.api.bot.IMAIBotInfo, X.05Vn<? super kotlin.Unit>, java.lang.Object> r0 = r6.LLILLJJLI
            r6.LL = r3
            java.lang.Object r0 = r0.invoke(r1, r6)
            if (r0 != r4) goto L13
            X.C1C7U.LIZIZ(r5)
            return r4
        L42:
            r1 = 0
            goto L34
        L44:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1503005uW.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
