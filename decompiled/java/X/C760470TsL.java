package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TsL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.sticker.RecentStickerManager$onChange$1$1", f = "RecentStickerManager.kt", l = {49, 54, 57}, m = "invokeSuspend")
public final class C760470TsL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LiveEffect LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C760470TsL(LiveEffect liveEffect, InterfaceC1364105Vn<? super C760470TsL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = liveEffect;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C760470TsL(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0071  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "RecentStickerManager@30a7.onChange$1$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r8.LL
            r4 = 3
            r6 = 2
            r5 = 1
            if (r0 == 0) goto L1e
            if (r0 == r5) goto L55
            if (r0 == r6) goto L90
            if (r0 == r4) goto L90
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1e:
            X.C155000ia.LIZIZ(r9)
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r0 = r8.LLILLJJLI
            boolean r0 = X.C767250U7v.LJ(r0)
            if (r0 == 0) goto L75
            X.0U8T r4 = X.C0U8T.LIZ
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r0 = r8.LLILLJJLI
            java.lang.String r2 = r0.LLILII()
            if (r2 != 0) goto L39
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L39:
            java.lang.String r1 = X.C0UD4.LIZIZ
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r0 = r8.LLILLJJLI
            java.lang.String r0 = r0.LJLL()
            if (r0 != 0) goto L49
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L49:
            r8.LL = r5
            java.lang.Object r9 = r4.LJIIL(r2, r1, r0, r8)
            if (r9 != r3) goto L58
            X.C1C7U.LIZIZ(r7)
            return r3
        L55:
            X.C155000ia.LIZIZ(r9)
        L58:
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r9 = (com.bytedance.android.livesdkapi.depend.model.LiveEffect) r9
            if (r9 == 0) goto L93
            com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel r0 = X.C760480TsM.LIZIZ
            if (r0 == 0) goto L93
            X.1DEK r1 = r0.LLILLJJLI
            if (r1 == 0) goto L93
            X.01Tx r0 = new X.01Tx
            r0.<init>(r9)
            r8.LL = r6
            java.lang.Object r0 = r1.LJIJI(r0, r8)
            if (r0 != r3) goto L93
            X.C1C7U.LIZIZ(r7)
            return r3
        L75:
            com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel r0 = X.C760480TsM.LIZIZ
            if (r0 == 0) goto L93
            X.1DEK r2 = r0.LLILLJJLI
            if (r2 == 0) goto L93
            X.01Tx r1 = new X.01Tx
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r0 = r8.LLILLJJLI
            r1.<init>(r0)
            r8.LL = r4
            java.lang.Object r0 = r2.LJIJI(r1, r8)
            if (r0 != r3) goto L93
            X.C1C7U.LIZIZ(r7)
            return r3
        L90:
            X.C155000ia.LIZIZ(r9)
        L93:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C760470TsL.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
