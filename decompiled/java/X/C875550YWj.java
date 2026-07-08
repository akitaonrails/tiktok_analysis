package X;

import com.bytedance.tts.pigeon.paas.detailpage.component.impl.message.PigeonMessageSenderComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YWj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.tts.pigeon.paas.detailpage.component.impl.message.PigeonMessageSenderComponent$sendMessage$2$1", f = "PigeonMessageSenderComponent.kt", l = {118}, m = "invokeSuspend")
public final class C875550YWj extends C09AX implements Function2<C869590Y9l, InterfaceC1364105Vn<? super C869590Y9l>, Object> {
    public PigeonMessageSenderComponent LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ PigeonMessageSenderComponent LLILZ;
    public final /* synthetic */ C869590Y9l LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C875550YWj(PigeonMessageSenderComponent pigeonMessageSenderComponent, C869590Y9l c869590Y9l, InterfaceC1364105Vn<? super C875550YWj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = pigeonMessageSenderComponent;
        this.LLILZIL = c869590Y9l;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C875550YWj(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0033 -> B:6:0x0019). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "PigeonMessageSenderComponent@7b6b.sendMessage$2$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r7.LLILLL
            r4 = 1
            if (r0 == 0) goto L39
            if (r0 != r4) goto L53
            java.lang.Object r3 = r7.LLILLJJLI
            java.util.Iterator r3 = (java.util.Iterator) r3
            com.bytedance.tts.pigeon.paas.detailpage.component.impl.message.PigeonMessageSenderComponent r2 = r7.LL
            X.C155000ia.LIZIZ(r8)
        L19:
            X.0Y9l r8 = (X.C869590Y9l) r8
        L1b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L4f
            java.lang.Object r1 = r3.next()
            X.0YWr r1 = (X.InterfaceC875630YWr) r1
            com.bytedance.tts.pigeon.GECPigeon r0 = r2.LL
            r7.LL = r2
            r7.LLILLJJLI = r3
            r7.LLILLL = r4
            X.0Y9l r8 = r1.LIZ(r8, r0, r7)
            if (r8 != r5) goto L19
            X.C1C7U.LIZIZ(r6)
            return r5
        L39:
            X.C155000ia.LIZIZ(r8)
            com.bytedance.tts.pigeon.paas.detailpage.component.impl.message.PigeonMessageSenderComponent r0 = r7.LLILZ
            X.01GW r0 = r0.LLIZ
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            X.0Y9l r8 = r7.LLILZIL
            com.bytedance.tts.pigeon.paas.detailpage.component.impl.message.PigeonMessageSenderComponent r2 = r7.LLILZ
            java.util.Iterator r3 = r0.iterator()
            goto L1b
        L4f:
            X.C1C7U.LIZIZ(r6)
            return r8
        L53:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C875550YWj.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C869590Y9l c869590Y9l, InterfaceC1364105Vn<? super C869590Y9l> interfaceC1364105Vn) {
        return ((a) create(c869590Y9l, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
