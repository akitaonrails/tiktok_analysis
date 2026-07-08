package X;

import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01YB, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.component.render.plugin.micemoji.MultiGuestMicSeatEmojiPlugin$updateLinkMicId2PlayerMap$1$keysToRemove$1", f = "MultiGuestMicSeatEmojiPlugin.kt", l = {}, m = "invokeSuspend")
public final class C01YB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends String>>, Object> {
    public final /* synthetic */ Map<String, C942410adD> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01YB(Map<String, C942410adD> map, InterfaceC1364105Vn<? super C01YB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01YB(this.LL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0059 A[PHI: r1
      0x0059: PHI (r1v1 boolean) = (r1v0 boolean), (r1v3 boolean) binds: [B:17:0x0056, B:11:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "MultiGuestMicSeatEmojiPlugin@103b.updateLinkMicId2PlayerMap$1$keysToRemove$1"
            X.C1C7U.LIZ(r7)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r9)
            java.util.Map<java.lang.String, X.0adD> r0 = r8.LL
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r5 = r0.iterator()
        L1a:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L5b
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r4 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            X.0adD r0 = (X.C942410adD) r0
            long r0 = r0.LIZIZ
            com.bytedance.android.live.base.model.user.User r3 = X.C01JX.LJIIIIZZ(r0)
            r2 = 1
            if (r3 == 0) goto L4f
            boolean r0 = X.C930540aK4.LJJII(r3)
            if (r0 != r2) goto L55
            r1 = 1
        L40:
            X.0aJy r0 = X.C930480aJy.LIZ
            r0.getClass()
            boolean r0 = X.C930480aJy.LJIJI(r3)
            if (r0 != r2) goto L59
        L4b:
            if (r1 != 0) goto L1a
            if (r2 != 0) goto L1a
        L4f:
            if (r4 == 0) goto L1a
            r6.add(r4)
            goto L1a
        L55:
            r1 = 0
            if (r3 == 0) goto L59
            goto L40
        L59:
            r2 = 0
            goto L4b
        L5b:
            X.C1C7U.LIZIZ(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01YB.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends String>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
