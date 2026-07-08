package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05HN, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.read.instantvop.InstantVoiceCloneView$initFragments$2$startOverClick$1", f = "InstantVoiceCloneView.kt", l = {515, 522}, m = "invokeSuspend")
public final class C05HN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C11VM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05HN(C11VM c11vm, InterfaceC1364105Vn<? super C05HN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c11vm;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05HN(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            java.lang.String r6 = "InstantVoiceCloneView@888c.initFragments$2$startOverClick$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r7.LL
            r4 = 0
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L32
            if (r0 == r2) goto L48
            if (r0 != r3) goto Lb1
            X.C155000ia.LIZIZ(r8)
        L17:
            X.11VM r0 = r7.LLILLJJLI
            r0.LIZIZ()
            X.11VM r1 = r7.LLILLJJLI
            java.lang.String r0 = "record_page"
            r1.LJ(r0)
            X.11VM r0 = r7.LLILLJJLI
            com.ss.android.ugc.gamora.editor.sticker.read.instantvop.InstantCloneRecordFragment r0 = r0.LLJJI
            if (r0 == 0) goto L2c
            r0.NR()
        L2c:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L32:
            X.C155000ia.LIZIZ(r8)
            X.1DFB r1 = X.C0PEM.LIZJ
            X.05Ed r0 = new X.05Ed
            r0.<init>(r4)
            r7.LL = r2
            java.lang.Object r8 = X.C23250099c.LJI(r7, r1, r0)
            if (r8 != r5) goto L4b
            X.C1C7U.LIZIZ(r6)
            return r5
        L48:
            X.C155000ia.LIZIZ(r8)
        L4b:
            java.lang.Number r8 = (java.lang.Number) r8
            int r1 = r8.intValue()
            com.mammon.audiosdk.enums.SAMICoreVopState r0 = com.mammon.audiosdk.enums.SAMICoreVopState.COMPLETED
            int r0 = r0.getValue()
            if (r1 != r0) goto L99
            X.11VM r3 = r7.LLILLJJLI
            r3.getClass()
            android.content.Context r0 = r3.getContext()
            X.0mTM r2 = new X.0mTM
            r2.<init>(r0)
            r0 = 0
            r2.LJII = r0
            android.content.Context r1 = r3.getContext()
            r0 = 2131858334(0x7f11939e, float:1.9350453E38)
            java.lang.String r0 = r1.getString(r0)
            r2.LJI(r0)
            android.content.Context r1 = r3.getContext()
            r0 = 2131858333(0x7f11939d, float:1.9350451E38)
            java.lang.String r0 = r1.getString(r0)
            r2.LIZIZ(r0)
            kotlin.jvm.internal.AwS581S0100000_2 r1 = new kotlin.jvm.internal.AwS581S0100000_2
            r0 = 540(0x21c, float:7.57E-43)
            r1.<init>(r3, r0)
            X.C985403tE.LIZ(r2, r1)
            X.0mTF r0 = new X.0mTF
            r0.<init>(r2)
            r0.LIZLLL()
            goto L2c
        L99:
            X.11VM r0 = r7.LLILLJJLI
            r0.LJIIIZ()
            X.1DFB r1 = X.C0PEM.LIZJ
            X.05Ee r0 = new X.05Ee
            r0.<init>(r4)
            r7.LL = r3
            java.lang.Object r0 = X.C23250099c.LJI(r7, r1, r0)
            if (r0 != r5) goto L17
            X.C1C7U.LIZIZ(r6)
            return r5
        Lb1:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05HN.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
