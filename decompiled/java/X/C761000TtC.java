package X;

import com.bytedance.android.live.effect.bgeffect.BgEffectViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TtC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.bgeffect.BgEffectViewModel$checkCategoryUpdate$1", f = "BgEffectViewModel.kt", l = {37, 42, BaseNotice.RECOMMEND_LIVE}, m = "invokeSuspend")
public final class C761000TtC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BgEffectViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C761000TtC(BgEffectViewModel bgEffectViewModel, InterfaceC1364105Vn<? super C761000TtC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bgEffectViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C761000TtC(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r8 = r19
            java.lang.String r11 = "BgEffectViewModel@1cd8.checkCategoryUpdate$1"
            X.C1C7U.LIZ(r11)
            java.lang.Object r6 = X.C099R.LJFF()
            r7 = r18
            int r0 = r7.LL
            java.lang.String r5 = "multi"
            r4 = 3
            r1 = 2
            r10 = 1
            java.lang.String r3 = "shared_bg"
            if (r0 == 0) goto L31
            if (r0 == r10) goto L44
            if (r0 == r1) goto L6d
            if (r0 != r4) goto Lab
            X.C155000ia.LIZIZ(r8)
        L21:
            java.lang.String r0 = "BgEffectViewModel checkCategoryUpdate emit task finish (remoteEffectList)"
            X.C20441214yg.LIZIZ(r3, r0)
        L26:
            java.lang.String r0 = "BgEffectViewModel fetchLatestMultiEffect loadFromRemote finish (cache invalied)"
            X.C20441214yg.LIZIZ(r3, r0)
        L2b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r11)
            return r0
        L31:
            X.C155000ia.LIZIZ(r8)
            com.bytedance.android.live.effect.bgeffect.BgEffectViewModel r0 = r7.LLILLJJLI
            X.0UMA r0 = r0.LLJJIJIIJIL
            r7.LL = r10
            java.lang.Object r8 = r0.LJIILIIL(r5, r7)
            if (r8 != r6) goto L47
            X.C1C7U.LIZIZ(r11)
            return r6
        L44:
            X.C155000ia.LIZIZ(r8)
        L47:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r0 = r8.booleanValue()
            if (r0 == 0) goto L2b
            java.lang.String r0 = "BgEffectViewModel fetchLatestMultiEffect loadFromRemote start (cache invalied)"
            X.C20441214yg.LIZIZ(r3, r0)
            com.bytedance.android.live.effect.bgeffect.BgEffectViewModel r0 = r7.LLILLJJLI
            X.0UMA r12 = r0.LLJJIJIIJIL
            java.lang.String r13 = "multi"
            r15 = 0
            r7.LL = r1
            java.lang.String r14 = ""
            r16 = r15
            r17 = r7
            java.lang.Object r8 = r12.LJII(r13, r14, r15, r16, r17)
            if (r8 != r6) goto L70
            X.C1C7U.LIZIZ(r11)
            return r6
        L6d:
            X.C155000ia.LIZIZ(r8)
        L70:
            X.0U8u r8 = (X.C767500U8u) r8
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            com.bytedance.android.live.effect.bgeffect.BgEffectViewModel r2 = r7.LLILLJJLI
            java.lang.String r1 = "multi"
            java.util.List<com.bytedance.android.livesdkapi.depend.model.LiveEffect> r0 = r8.LIZ
            r8 = 0
            r2.getClass()
            com.bytedance.android.live.effect.bgeffect.BgEffectViewModel.aR2(r1, r0, r10, r8)
            r9.addAll(r0)
            boolean r0 = r9.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L26
            java.lang.String r0 = "BgEffectViewModel checkCategoryUpdate emit task start (remoteEffectList)"
            X.C20441214yg.LIZIZ(r3, r0)
            com.bytedance.android.live.effect.bgeffect.BgEffectViewModel r0 = r7.LLILLJJLI
            X.1DDr r2 = r0.LLILLL
            X.01gM r1 = new X.01gM
            r0 = 12
            r1.<init>(r5, r9, r8, r0)
            r7.LL = r4
            java.lang.Object r0 = r2.emit(r1, r7)
            if (r0 != r6) goto L21
            X.C1C7U.LIZIZ(r11)
            return r6
        Lab:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C761000TtC.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
