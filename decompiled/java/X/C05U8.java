package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05U8, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1", f = "AndroidOverscroll.android.kt", l = {783, 787}, m = "invokeSuspend")
public final class C05U8 extends C09AW implements Function2<C05ZT, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C20086713ib LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05U8(C20086713ib c20086713ib, InterfaceC1364105Vn<? super C05U8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c20086713ib;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05U8 c05u8 = new C05U8(this.LLILZ, interfaceC1364105Vn);
        c05u8.LLILLL = obj;
        return c05u8;
    }

    /* JADX WARN: Path cross not found for [B:21:0x005c, B:23:0x0064], limit reached: 43 */
    /* JADX WARN: Path cross not found for [B:23:0x0064, B:21:0x005c], limit reached: 43 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00b1 -> B:7:0x0015). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r6 = X.C099R.LJFF()
            int r1 = r12.LLILLJJLI
            r5 = 2
            r0 = 1
            if (r1 == 0) goto L7f
            if (r1 == r0) goto L94
            if (r1 != r5) goto Lb4
            java.lang.Object r4 = r12.LLILLL
            X.05ZT r4 = (X.C05ZT) r4
            X.C155000ia.LIZIZ(r13)
        L15:
            X.13fT r13 = (X.C20067313fT) r13
            java.util.List<X.13fO> r7 = r13.LIZ
            java.util.ArrayList r8 = new java.util.ArrayList
            int r0 = r7.size()
            r8.<init>(r0)
            int r3 = r7.size()
            r2 = 0
        L27:
            if (r2 >= r3) goto L3a
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r7, r2)
            r0 = r1
            X.13fO r0 = (X.C20066813fO) r0
            boolean r0 = r0.LIZLLL
            if (r0 == 0) goto L37
            r8.add(r1)
        L37:
            int r2 = r2 + 1
            goto L27
        L3a:
            X.13ib r11 = r12.LLILZ
            int r10 = r8.size()
            r9 = 0
        L41:
            if (r9 >= r10) goto L57
            java.lang.Object r7 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r8, r9)
            r0 = r7
            X.13fO r0 = (X.C20066813fO) r0
            long r2 = r0.LIZ
            long r0 = r11.LJII
            boolean r0 = X.C05U1.LIZ(r2, r0)
            if (r0 != 0) goto L58
            int r9 = r9 + 1
            goto L41
        L57:
            r7 = 0
        L58:
            X.13fO r7 = (X.C20066813fO) r7
            if (r7 != 0) goto L64
            java.lang.Object r7 = X.C13LP.LJJJLL(r8)
            X.13fO r7 = (X.C20066813fO) r7
            if (r7 == 0) goto L6e
        L64:
            X.13ib r2 = r12.LLILZ
            long r0 = r7.LIZ
            r2.LJII = r0
            long r0 = r7.LIZJ
            r2.LIZIZ = r0
        L6e:
            boolean r0 = r8.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto La7
            X.13ib r2 = r12.LLILZ
            r0 = -1
            r2.LJII = r0
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L7f:
            X.C155000ia.LIZIZ(r13)
            java.lang.Object r4 = r12.LLILLL
            X.05ZT r4 = (X.C05ZT) r4
            r12.LLILLL = r4
            r12.LLILLJJLI = r0
            r1 = 0
            X.13fE r0 = X.EnumC20065813fE.Main
            java.lang.Object r13 = X.C1374405Zm.LIZIZ(r4, r1, r0, r12)
            if (r13 != r6) goto L9b
            return r6
        L94:
            java.lang.Object r4 = r12.LLILLL
            X.05ZT r4 = (X.C05ZT) r4
            X.C155000ia.LIZIZ(r13)
        L9b:
            X.13fO r13 = (X.C20066813fO) r13
            X.13ib r2 = r12.LLILZ
            long r0 = r13.LIZ
            r2.LJII = r0
            long r0 = r13.LIZJ
            r2.LIZIZ = r0
        La7:
            r12.LLILLL = r4
            r12.LLILLJJLI = r5
            X.13fE r0 = X.EnumC20065813fE.Main
            java.lang.Object r13 = r4.LJJIJIL(r0, r12)
            if (r13 != r6) goto L15
            return r6
        Lb4:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05U8.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C05ZT c05zt, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c05zt, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
