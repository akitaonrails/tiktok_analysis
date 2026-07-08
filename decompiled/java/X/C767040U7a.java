package X;

import com.bytedance.android.live.effect.beauty.data.LiveSmallItemBeautyViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0U7a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.beauty.data.LiveSmallItemBeautyViewModel$fetchAiBeautyUntilEnd$1$2", f = "LiveSmallItemBeautyViewModel.kt", l = {337, 338, 341}, m = "invokeSuspend")
public final class C767040U7a extends C09AX implements Function2<InterfaceC346701Wf<? super Boolean>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ LiveSmallItemBeautyViewModel LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C767040U7a(LiveSmallItemBeautyViewModel liveSmallItemBeautyViewModel, long j, InterfaceC1364105Vn<? super C767040U7a> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = liveSmallItemBeautyViewModel;
        this.LLILZ = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C767040U7a c767040U7a = new C767040U7a(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c767040U7a.LLILLJJLI = obj;
        return c767040U7a;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0079  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x006d -> B:13:0x0035). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.String r11 = "LiveSmallItemBeautyViewModel@ff2.fetchAiBeautyUntilEnd$1$2"
            X.C1C7U.LIZ(r11)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r12.LL
            r3 = 3
            r6 = 2
            r5 = 1
            if (r0 == 0) goto L2e
            if (r0 == r5) goto L5c
            if (r0 == r6) goto L26
            if (r0 != r3) goto L8d
            X.C155000ia.LIZIZ(r13)
        L19:
            java.lang.String r1 = "AIBeauty"
            java.lang.String r0 = "emit break"
            X.C20441214yg.LIZIZ(r1, r0)
        L20:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r11)
            return r0
        L26:
            java.lang.Object r2 = r12.LLILLJJLI
            X.01Wf r2 = (X.InterfaceC346701Wf) r2
            X.C155000ia.LIZIZ(r13)
            goto L35
        L2e:
            X.C155000ia.LIZIZ(r13)
            java.lang.Object r2 = r12.LLILLJJLI
            X.01Wf r2 = (X.InterfaceC346701Wf) r2
        L35:
            long r9 = java.lang.System.currentTimeMillis()
            com.bytedance.android.live.effect.beauty.data.LiveSmallItemBeautyViewModel r8 = r12.LLILLL
            long r0 = r8.LLJJ
            long r9 = r9 - r0
            long r0 = r8.LLJJI
            int r7 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r7 > 0) goto L73
            X.0U7d r1 = r8.LLILZLL
            X.0U7d r0 = X.EnumC767070U7d.ANALYZING
            if (r1 != r0) goto L73
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r12.LLILLJJLI = r2
            r12.LL = r5
            java.lang.Object r0 = r2.emit(r0, r12)
            if (r0 != r4) goto L63
            X.C1C7U.LIZIZ(r11)
            return r4
        L5c:
            java.lang.Object r2 = r12.LLILLJJLI
            X.01Wf r2 = (X.InterfaceC346701Wf) r2
            X.C155000ia.LIZIZ(r13)
        L63:
            long r0 = r12.LLILZ
            r12.LLILLJJLI = r2
            r12.LL = r6
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r12)
            if (r0 != r4) goto L35
            X.C1C7U.LIZIZ(r11)
            return r4
        L73:
            X.0U7d r1 = r8.LLILZLL
            X.0U7d r0 = X.EnumC767070U7d.APPLIED
            if (r1 == r0) goto L20
            r0 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r0 = 0
            r12.LLILLJJLI = r0
            r12.LL = r3
            java.lang.Object r0 = r2.emit(r1, r12)
            if (r0 != r4) goto L19
            X.C1C7U.LIZIZ(r11)
            return r4
        L8d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C767040U7a.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super Boolean> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
