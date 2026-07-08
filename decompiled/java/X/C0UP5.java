package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0UP5, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.playbook.PlaybookViewModel$showPlayBook$1", f = "PlaybookViewModel.kt", l = {201}, m = "invokeSuspend")
public final class C0UP5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0UPF LLILLJJLI;
    public final /* synthetic */ DataChannel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0UP5(C0UPF c0upf, DataChannel dataChannel, InterfaceC1364105Vn<? super C0UP5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0upf;
        this.LLILLL = dataChannel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0UP5(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r5 = "PlaybookViewModel@e436.showPlayBook$1"
            X.C1C7U.LIZ(r5)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LL
            r3 = 1
            java.lang.String r1 = "PlayBookViewModel"
            r2 = 0
            if (r0 == 0) goto L68
            if (r0 != r3) goto La8
            X.C155000ia.LIZIZ(r7)
        L16:
            X.0UP6 r7 = (X.C0UP6) r7
        L18:
            X.0UPF r0 = r6.LLILLJJLI
            long r3 = java.lang.System.currentTimeMillis()
            r0.LJII = r3
            java.lang.StringBuilder r3 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "showPlayBook, result: "
            r3.append(r0)
            r3.append(r7)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r3)
            X.C20441214yg.LIZIZ(r1, r0)
            if (r7 == 0) goto L4d
            webcast.data.multi_guest_play.Playbook r0 = r7.LIZ
            if (r0 == 0) goto L4d
            Y.ARunnableS45S0300000_12 r4 = new Y.ARunnableS45S0300000_12
            com.bytedance.ies.sdk.datachannel.DataChannel r3 = r6.LLILLL
            X.0UPF r1 = r6.LLILLJJLI
            r0 = 18
            r4.<init>(r3, r1, r7, r0)
            X.C0IK5.LIZIZ(r2, r4)
        L47:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        L4d:
            X.0UPF r0 = r6.LLILLJJLI
            X.0UTo r3 = r0.LJ
            if (r3 == 0) goto L62
            if (r7 == 0) goto L5d
            java.lang.Throwable r0 = r7.LJ
            if (r0 == 0) goto L5d
            java.lang.String r2 = r0.getMessage()
        L5d:
            java.lang.String r0 = "show"
            r3.LIZJ(r0, r2)
        L62:
            java.lang.String r0 = "showPlayBook, playbook is null"
            X.C20441214yg.LIZIZ(r1, r0)
            goto L47
        L68:
            X.C155000ia.LIZIZ(r7)
            java.lang.String r0 = "showPlayBook, request is not null"
            X.C20441214yg.LIZIZ(r1, r0)
            X.0UPF r0 = r6.LLILLJJLI
            X.099G r0 = r0.LIZ
            if (r0 == 0) goto L91
            boolean r0 = r0.isCompleted()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L7e:
            boolean r0 = X.C500260Jjc.LJJJI(r0)
            if (r0 == 0) goto L93
            X.0UPF r0 = r6.LLILLJJLI
            X.099G r0 = r0.LIZ
            if (r0 == 0) goto La5
            java.lang.Object r7 = r0.LJJJIL()
            X.0UP6 r7 = (X.C0UP6) r7
            goto L18
        L91:
            r0 = r2
            goto L7e
        L93:
            X.0UPF r0 = r6.LLILLJJLI
            X.099G r0 = r0.LIZ
            if (r0 == 0) goto La5
            r6.LL = r3
            java.lang.Object r7 = r0.LJLIIIL(r6)
            if (r7 != r4) goto L16
            X.C1C7U.LIZIZ(r5)
            return r4
        La5:
            r7 = r2
            goto L18
        La8:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UP5.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
