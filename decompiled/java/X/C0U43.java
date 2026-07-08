package X;

import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0U43, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.LiveEffectDataProvider$fetchDownloadEffectByResourceId$1", f = "LiveEffectDataProvider.kt", l = {870, 872}, m = "invokeSuspend")
public final class C0U43 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public C259800zU LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C259800zU<LiveEffect> LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ C0U45 LLIZ;
    public final /* synthetic */ StickerEffectViewModel LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0U43(C259800zU<LiveEffect> c259800zU, String str, String str2, C0U45 c0u45, StickerEffectViewModel stickerEffectViewModel, InterfaceC1364105Vn<? super C0U43> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c259800zU;
        this.LLILZIL = str;
        this.LLILZLL = str2;
        this.LLIZ = c0u45;
        this.LLIZLLLIL = stickerEffectViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0U43(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "LiveEffectDataProvider@97e.fetchDownloadEffectByResourceId$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r8.LLILLL
            r5 = 2
            r1 = 1
            r4 = 0
            if (r0 == 0) goto L42
            if (r0 == r1) goto L5e
            if (r0 != r5) goto L94
            java.lang.Object r3 = r8.LL
            X.00zU r3 = (X.C259800zU) r3
            X.C155000ia.LIZIZ(r9)
        L1b:
            r3.element = r9
        L1d:
            X.00zU<com.bytedance.android.livesdkapi.depend.model.LiveEffect> r0 = r8.LLILZ
            T r3 = r0.element
            if (r3 != 0) goto L2e
            X.0U45 r0 = r8.LLIZ
            r0.LJ(r4, r4)
        L28:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L2e:
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r3 = (com.bytedance.android.livesdkapi.depend.model.LiveEffect) r3
            X.0U45 r2 = r8.LLIZ
            com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel r1 = r8.LLIZLLLIL
            boolean r0 = X.C766720U5u.LJIILLIIL(r3)
            if (r0 == 0) goto L3e
            r2.LIZ(r3)
            goto L28
        L3e:
            com.bytedance.android.live.effect.datastore.base.BaseEffectViewModel.wQ2(r1, r3, r2)
            goto L28
        L42:
            X.C155000ia.LIZIZ(r9)
            X.0UDQ r2 = new X.0UDQ
            r2.<init>()
            X.00zU<com.bytedance.android.livesdkapi.depend.model.LiveEffect> r3 = r8.LLILZ
            java.lang.String r0 = r8.LLILZIL
            r8.LL = r2
            r8.LLILLJJLI = r3
            r8.LLILLL = r1
            java.lang.Object r9 = r2.LJIIIIZZ(r0, r8)
            if (r9 != r6) goto L67
            X.C1C7U.LIZIZ(r7)
            return r6
        L5e:
            X.00zU r3 = r8.LLILLJJLI
            java.lang.Object r2 = r8.LL
            X.0UDQ r2 = (X.C0UDQ) r2
            X.C155000ia.LIZIZ(r9)
        L67:
            com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse r9 = (com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse) r9
            if (r9 == 0) goto L92
            X.0U5u r1 = X.C766720U5u.LIZ
            java.lang.String r0 = r8.LLILZLL
            r1.getClass()
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r0 = X.C766720U5u.LJIILJJIL(r9, r0)
        L76:
            r3.element = r0
            X.00zU<com.bytedance.android.livesdkapi.depend.model.LiveEffect> r3 = r8.LLILZ
            T r0 = r3.element
            if (r0 != 0) goto L1d
            java.lang.String r1 = r8.LLILZIL
            java.lang.String r0 = r8.LLILZLL
            r8.LL = r3
            r8.LLILLJJLI = r4
            r8.LLILLL = r5
            java.lang.Object r9 = r2.LJIILIIL(r1, r0, r8)
            if (r9 != r6) goto L1b
            X.C1C7U.LIZIZ(r7)
            return r6
        L92:
            r0 = r4
            goto L76
        L94:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0U43.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
