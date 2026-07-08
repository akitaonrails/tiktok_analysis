package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06AZ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.revamp.common.observer.ChatListInboxResourcePreloadObserver$2", f = "ChatListInboxResourcePreloadObserver.kt", l = {133, 134, 135, 136}, m = "invokeSuspend")
public final class C06AZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1729706pz LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06AZ(C1729706pz c1729706pz, InterfaceC1364105Vn<? super C06AZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1729706pz;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06AZ(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "ChatListInboxResourcePreloadObserver@ee7b.<init>$2"
            X.C1C7U.LIZ(r7)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r8.LL
            r4 = 4
            r6 = 3
            r5 = 2
            r2 = 1
            if (r0 == 0) goto L22
            if (r0 == r2) goto L36
            if (r0 == r5) goto L4a
            if (r0 == r6) goto L5e
            if (r0 != r4) goto L71
            X.C155000ia.LIZIZ(r9)
        L1c:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L22:
            X.C155000ia.LIZIZ(r9)
            X.06pz r0 = r8.LLILLJJLI
            X.0Zlv r1 = r0.LLILLJJLI
            r8.LL = r2
            r0 = 0
            r1.LIZ = r0
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r0 != r3) goto L39
            X.C1C7U.LIZIZ(r7)
            return r3
        L36:
            X.C155000ia.LIZIZ(r9)
        L39:
            X.06pz r0 = r8.LLILLJJLI
            X.0Zlv r0 = r0.LLILLJJLI
            r8.LL = r5
            r0.getClass()
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r0 != r3) goto L4d
            X.C1C7U.LIZIZ(r7)
            return r3
        L4a:
            X.C155000ia.LIZIZ(r9)
        L4d:
            X.06pz r0 = r8.LLILLJJLI
            X.0YtW r0 = r0.LLILLL
            r8.LL = r6
            r0.getClass()
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r0 != r3) goto L61
            X.C1C7U.LIZIZ(r7)
            return r3
        L5e:
            X.C155000ia.LIZIZ(r9)
        L61:
            X.06pz r0 = r8.LLILLJJLI
            X.0YtW r0 = r0.LLILLL
            r8.LL = r4
            kotlin.Unit r0 = r0.LIZLLL()
            if (r0 != r3) goto L1c
            X.C1C7U.LIZIZ(r7)
            return r3
        L71:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06AZ.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
