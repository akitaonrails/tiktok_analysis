package com.bytedance.android.live.effect.countdown;

import X.C0U4N;
import X.C0UMB;
import com.bytedance.android.live.effect.datastore.base.BaseEffectViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;

/* JADX INFO: loaded from: classes13.dex */
public final class CountDownEffectViewModel extends BaseEffectViewModel<LiveEffect> {
    public final C0UMB LLILZ;

    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object AQ2(X.InterfaceC1364105Vn<? super java.util.List<? extends com.bytedance.android.livesdkapi.depend.model.LiveEffect>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C0U4K
            if (r0 == 0) goto L5f
            r6 = r8
            X.0U4K r6 = (X.C0U4K) r6
            int r2 = r6.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5f
            int r2 = r2 - r1
            r6.LLILZIL = r2
        L12:
            java.lang.Object r2 = r6.LLILLL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILZIL
            r4 = 1
            if (r0 == 0) goto L30
            if (r0 != r4) goto L65
            java.lang.Object r1 = r6.LLILLJJLI
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r3 = r6.LL
            X.C155000ia.LIZIZ(r2)
        L28:
            X.0U8u r2 = (X.C767500U8u) r2
            java.util.List<com.bytedance.android.livesdkapi.depend.model.LiveEffect> r0 = r2.LIZ
            r1.addAll(r0)
        L2f:
            return r3
        L30:
            X.C155000ia.LIZIZ(r2)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            X.0UMB r0 = r7.LLILZ
            java.lang.String r2 = "countdown"
            X.0U8u r0 = r0.LJJI(r2)
            java.util.List<com.bytedance.android.livesdkapi.depend.model.LiveEffect> r0 = r0.LIZ
            r3.addAll(r0)
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L2f
            X.0UMB r1 = r7.LLILZ
            r6.LL = r3
            r6.LLILLJJLI = r3
            r6.LLILZIL = r4
            java.lang.String r0 = ""
            java.lang.Object r2 = r1.LJIIIZ(r2, r0, r6)
            if (r2 != r5) goto L5c
            return r5
        L5c:
            r1 = r3
            r3 = r1
            goto L28
        L5f:
            X.0U4K r6 = new X.0U4K
            r6.<init>(r7, r8)
            goto L12
        L65:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.countdown.CountDownEffectViewModel.AQ2(X.05Vn):java.lang.Object");
    }

    public CountDownEffectViewModel(C0UMB c0umb, C0U4N c0u4n) {
        super(c0umb, c0u4n);
        this.LLILZ = c0umb;
    }
}
