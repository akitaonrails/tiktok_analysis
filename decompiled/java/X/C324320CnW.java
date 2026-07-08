package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CnW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.live.effect.sticker.page.multiguest.MultiGuestStickerHelper$getLiveEffectByResourceId$2", f = "MultiGuestStickerHelper.kt", l = {BaseNotice.RECOMMEND_LIVE, 53}, m = "invokeSuspend")
public final class C324320CnW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Function1<LiveEffect, Unit> LLILLL;
    public final /* synthetic */ LifecycleOwner LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C324320CnW(Function1<? super LiveEffect, Unit> function1, LifecycleOwner lifecycleOwner, String str, InterfaceC1364105Vn<? super C324320CnW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = function1;
        this.LLILZ = lifecycleOwner;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C324320CnW c324320CnW = new C324320CnW(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c324320CnW.LLILLJJLI = obj;
        return c324320CnW;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.String r9 = "MultiGuestStickerHelper@da8a.getLiveEffectByResourceId$2"
            X.C1C7U.LIZ(r9)
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r10.LL
            r8 = 3
            r6 = 2
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L35
            if (r0 == r5) goto L57
            if (r0 != r6) goto L7c
            java.lang.Object r1 = r10.LLILLJJLI
            X.C155000ia.LIZIZ(r11)
        L1a:
            if (r1 == 0) goto L27
            kotlin.jvm.functions.Function1<com.bytedance.android.livesdkapi.depend.model.LiveEffect, kotlin.Unit> r0 = r10.LLILLL
            r0.invoke(r1)
        L21:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r9)
            return r0
        L27:
            if (r11 == 0) goto L2f
            kotlin.jvm.functions.Function1<com.bytedance.android.livesdkapi.depend.model.LiveEffect, kotlin.Unit> r0 = r10.LLILLL
            r0.invoke(r11)
            goto L21
        L2f:
            kotlin.jvm.functions.Function1<com.bytedance.android.livesdkapi.depend.model.LiveEffect, kotlin.Unit> r0 = r10.LLILLL
            r0.invoke(r4)
            goto L21
        L35:
            X.C155000ia.LIZIZ(r11)
            java.lang.Object r3 = r10.LLILLJJLI
            X.01wk r3 = (X.InterfaceC497601wk) r3
            X.0CnY r2 = new X.0CnY
            androidx.lifecycle.LifecycleOwner r1 = r10.LLILZ
            java.lang.String r0 = r10.LLILZIL
            r2.<init>(r1, r0, r4)
            X.099G r0 = X.C23250099c.LIZIZ(r3, r4, r4, r2, r8)
            r10.LLILLJJLI = r3
            r10.LL = r5
            java.lang.Object r11 = r0.LJLIIIL(r10)
            if (r11 != r7) goto L5e
            X.C1C7U.LIZIZ(r9)
            return r7
        L57:
            java.lang.Object r3 = r10.LLILLJJLI
            X.01wk r3 = (X.InterfaceC497601wk) r3
            X.C155000ia.LIZIZ(r11)
        L5e:
            X.0CnX r2 = new X.0CnX
            androidx.lifecycle.LifecycleOwner r1 = r10.LLILZ
            java.lang.String r0 = r10.LLILZIL
            r2.<init>(r1, r0, r4)
            X.099G r0 = X.C23250099c.LIZIZ(r3, r4, r4, r2, r8)
            r10.LLILLJJLI = r11
            r10.LL = r6
            java.lang.Object r0 = r0.LJLIIIL(r10)
            if (r0 != r7) goto L79
            X.C1C7U.LIZIZ(r9)
            return r7
        L79:
            r1 = r11
            r11 = r0
            goto L1a
        L7c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C324320CnW.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
