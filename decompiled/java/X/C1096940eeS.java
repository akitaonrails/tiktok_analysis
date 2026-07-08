package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0eeS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.game.points.PointsShortTouchViewModel$doContinueUpdateDurationTask$1", f = "PointsShortTouchViewModel.kt", l = {349, 359}, m = "invokeSuspend")
public final class C1096940eeS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1096990eeX LLILLL;
    public final /* synthetic */ Room LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1096940eeS(C1096990eeX c1096990eeX, Room room, InterfaceC1364105Vn<? super C1096940eeS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1096990eeX;
        this.LLILZ = room;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1096940eeS c1096940eeS = new C1096940eeS(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1096940eeS.LLILLJJLI = obj;
        return c1096940eeS;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r8 = "PointsShortTouchViewModel@559d.doContinueUpdateDurationTask$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r9.LL
            r7 = 1
            r5 = 2
            if (r0 == 0) goto L30
            if (r0 == r7) goto L79
            if (r0 != r5) goto L9c
            java.lang.Object r4 = r9.LLILLJJLI
            X.01wk r4 = (X.InterfaceC497601wk) r4
            X.C155000ia.LIZIZ(r10)
        L1a:
            com.bytedance.android.livesdk.game.model.GuessTaskPackInfo r10 = (com.bytedance.android.livesdk.game.model.GuessTaskPackInfo) r10
            if (r10 == 0) goto L2a
            X.0eeX r1 = r9.LLILLL
            boolean r0 = X.C2296808zG.LJI(r4)
            if (r0 == 0) goto L2a
            r0 = 0
            r1.LIZIZ(r10, r0)
        L2a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L30:
            X.C155000ia.LIZIZ(r10)
            java.lang.Object r4 = r9.LLILLJJLI
            X.01wk r4 = (X.InterfaceC497601wk) r4
            boolean r0 = X.C2296808zG.LJI(r4)
            if (r0 != 0) goto L43
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L43:
            X.0eeX r0 = r9.LLILLL
            X.01GW r0 = r0.LLILLJJLI
            java.lang.Object r3 = r0.getValue()
            X.0eeU r3 = (X.InterfaceC1096960eeU) r3
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r9.LLILZ
            java.lang.String r2 = r0.getIdStr()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r5)
            java.lang.Integer r0 = X.C2286608xc.LJ(r7)
            r1.add(r0)
            java.lang.Integer r0 = X.C2286608xc.LJ(r5)
            r1.add(r0)
            X.0eeW r0 = new X.0eeW
            r0.<init>(r2, r1)
            r9.LLILLJJLI = r4
            r9.LL = r7
            kotlinx.coroutines.flow.b r10 = r3.LIZ(r0)
            if (r10 != r6) goto L80
            X.C1C7U.LIZIZ(r8)
            return r6
        L79:
            java.lang.Object r4 = r9.LLILLJJLI
            X.01wk r4 = (X.InterfaceC497601wk) r4
            X.C155000ia.LIZIZ(r10)
        L80:
            X.01Wa r10 = (X.InterfaceC346201Wa) r10
            X.0ee5 r2 = new X.0ee5
            r0 = 0
            r2.<init>(r0)
            X.09r7 r1 = new X.09r7
            r0 = 0
            r1.<init>(r2, r10, r0)
            r9.LLILLJJLI = r4
            r9.LL = r5
            java.lang.Object r10 = X.C09IC.LJIJI(r1, r9)
            if (r10 != r6) goto L1a
            X.C1C7U.LIZIZ(r8)
            return r6
        L9c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1096940eeS.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
