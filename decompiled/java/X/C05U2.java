package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05U2, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.slowmo.EffectPanelKt$detectTapGestures$2$1", f = "EffectPanel.kt", l = {447, 449}, m = "invokeSuspend")
public final class C05U2 extends C09AW implements Function2<C05ZT, InterfaceC1364105Vn<? super Unit>, Object> {
    public EnumC20065813fE LLILLJJLI;
    public C20066813fO LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ Function1<C1378605aS, Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C05U2(Function1<? super C1378605aS, Unit> function1, InterfaceC1364105Vn<? super C05U2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05U2 c05u2 = new C05U2(this.LLILZLL, interfaceC1364105Vn);
        c05u2.LLILZIL = obj;
        return c05u2;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00ad -> B:7:0x001f). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.String r13 = "EffectPanelKt@e9c9.detectTapGestures$2$1"
            X.C1C7U.LIZ(r13)
            java.lang.Object r8 = X.C099R.LJFF()
            int r0 = r14.LLILZ
            r9 = 2
            r7 = 0
            r6 = 1
            if (r0 == 0) goto L7c
            if (r0 == r6) goto L95
            if (r0 != r9) goto Lb3
            X.13fO r5 = r14.LLILLL
            X.13fE r4 = r14.LLILLJJLI
            java.lang.Object r10 = r14.LLILZIL
            X.05ZT r10 = (X.C05ZT) r10
            X.C155000ia.LIZIZ(r15)
        L1f:
            X.13fT r15 = (X.C20067313fT) r15
            java.util.List<X.13fO> r0 = r15.LIZ
            int r0 = r0.size()
            if (r0 != r6) goto L57
            java.util.List<X.13fO> r0 = r15.LIZ
            java.lang.Object r11 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r7)
            X.13fO r11 = (X.C20066813fO) r11
            long r2 = r11.LIZ
            long r0 = r5.LIZ
            boolean r0 = X.C05U1.LIZ(r2, r0)
            if (r0 == 0) goto L4b
            boolean r0 = r11.LIZLLL
            if (r0 != 0) goto L4b
            kotlin.jvm.functions.Function1<X.05aS, kotlin.Unit> r3 = r14.LLILZLL
            long r0 = r11.LIZJ
            X.05aS r2 = new X.05aS
            r2.<init>(r0)
            r3.invoke(r2)
        L4b:
            java.util.List<X.13fO> r1 = r15.LIZ
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L5d
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L5d
        L57:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r13)
            return r0
        L5d:
            java.util.Iterator r12 = r1.iterator()
        L61:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L57
            java.lang.Object r11 = r12.next()
            X.13fO r11 = (X.C20066813fO) r11
            long r2 = r11.LIZ
            long r0 = r5.LIZ
            boolean r0 = X.C05U1.LIZ(r2, r0)
            if (r0 == 0) goto L61
            boolean r0 = r11.LIZLLL
            if (r0 == 0) goto L61
            goto La1
        L7c:
            X.C155000ia.LIZIZ(r15)
            java.lang.Object r10 = r14.LLILZIL
            X.05ZT r10 = (X.C05ZT) r10
            X.13fE r4 = X.EnumC20065813fE.Main
            r14.LLILZIL = r10
            r14.LLILLJJLI = r4
            r14.LLILZ = r6
            java.lang.Object r15 = X.C1374405Zm.LIZIZ(r10, r7, r4, r14)
            if (r15 != r8) goto L9e
            X.C1C7U.LIZIZ(r13)
            return r8
        L95:
            X.13fE r4 = r14.LLILLJJLI
            java.lang.Object r10 = r14.LLILZIL
            X.05ZT r10 = (X.C05ZT) r10
            X.C155000ia.LIZIZ(r15)
        L9e:
            X.13fO r15 = (X.C20066813fO) r15
            r5 = r15
        La1:
            r14.LLILZIL = r10
            r14.LLILLJJLI = r4
            r14.LLILLL = r5
            r14.LLILZ = r9
            java.lang.Object r15 = r10.LJJIJIL(r4, r14)
            if (r15 != r8) goto L1f
            X.C1C7U.LIZIZ(r13)
            return r8
        Lb3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05U2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C05ZT c05zt, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c05zt, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
