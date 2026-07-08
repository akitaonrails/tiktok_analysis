package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0lmz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler$handle$1$preHandleShareJob$1", f = "BaseChannelShareHandler.kt", l = {58}, m = "invokeSuspend")
public final class C1371310lmz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public final /* synthetic */ BaseChannelShareHandler<T> LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ BaseSharePackage LLILZ;
    public final /* synthetic */ InterfaceC1369790lkX LLILZIL;
    public final /* synthetic */ View LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1371310lmz(BaseChannelShareHandler<T> baseChannelShareHandler, Context context, BaseSharePackage baseSharePackage, InterfaceC1369790lkX interfaceC1369790lkX, View view, InterfaceC1364105Vn<? super C1371310lmz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = baseChannelShareHandler;
        this.LLILLL = context;
        this.LLILZ = baseSharePackage;
        this.LLILZIL = interfaceC1369790lkX;
        this.LLILZLL = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1371310lmz(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type X.05Vn to X.0lmz for r9v1 'this'  X.05Vn
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // njp.a
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r3 = "BaseChannelShareHandler@1053.handle$1$preHandleShareJob$1"
            X.C1C7U.LIZ(r3)
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r9.LL
            r0 = 1
            if (r1 == 0) goto L17
            if (r1 != r0) goto L30
            X.C155000ia.LIZIZ(r10)
        L13:
            X.C1C7U.LIZIZ(r3)
            return r10
        L17:
            X.C155000ia.LIZIZ(r10)
            com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler<T> r4 = r9.LLILLJJLI
            android.content.Context r5 = r9.LLILLL
            com.ss.android.ugc.aweme.share.base.model.BaseSharePackage r6 = r9.LLILZ
            X.0lkX r7 = r9.LLILZIL
            android.view.View r8 = r9.LLILZLL
            r9.LL = r0
            java.lang.Object r10 = r4.LJIILIIL(r5, r6, r7, r8, r9)
            if (r10 != r2) goto L13
            X.C1C7U.LIZIZ(r3)
            return r2
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1371310lmz.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
