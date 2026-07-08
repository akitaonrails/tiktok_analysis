package X;

import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0yRk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel$handleOnBoarding$1", f = "MessageViewModel.kt", l = {3250}, m = "invokeSuspend")
public final class C1857860yRk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ List<TakoVideoItem> LLILLJJLI;
    public final /* synthetic */ MessageViewModel LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1857860yRk(List<TakoVideoItem> list, MessageViewModel messageViewModel, String str, String str2, InterfaceC1364105Vn<? super C1857860yRk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = messageViewModel;
        this.LLILZ = str;
        this.LLILZIL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1857860yRk(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c A[PHI: r8 r9
      0x006c: PHI (r8v2 java.lang.String) = (r8v1 java.lang.String), (r8v5 java.lang.String), (r8v5 java.lang.String), (r8v5 java.lang.String) binds: [B:36:0x0069, B:21:0x0045, B:23:0x0049, B:25:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x006c: PHI (r9v1 java.lang.String) = (r9v0 java.lang.String), (r9v4 java.lang.String), (r9v4 java.lang.String), (r9v4 java.lang.String) binds: [B:36:0x0069, B:21:0x0045, B:23:0x0049, B:25:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.String r4 = "MessageViewModel@9229.handleOnBoarding$1"
            X.C1C7U.LIZ(r4)
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r12.LL
            r2 = 1
            if (r0 == 0) goto L19
            if (r0 != r2) goto L72
            X.C155000ia.LIZIZ(r13)
        L13:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r4)
            return r0
        L19:
            X.C155000ia.LIZIZ(r13)
            java.util.List<com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem> r0 = r12.LLILLJJLI
            r11 = 0
            if (r0 == 0) goto L70
            java.lang.Object r3 = X.C13LP.LJJJLL(r0)
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem r3 = (com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem) r3
        L27:
            com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel r0 = r12.LLILLL
            X.0yae r5 = r0.LLJJJJ
            if (r5 == 0) goto L13
            java.lang.String r6 = r12.LLILZ
            java.lang.String r7 = r12.LLILZIL
            if (r3 == 0) goto L67
            java.lang.String r8 = r3.awemeId
            com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage r0 = r3.cover
            if (r0 == 0) goto L68
            java.util.List<java.lang.String> r0 = r0.urlList
            if (r0 == 0) goto L68
            java.lang.Object r9 = X.C13LP.LJJJLL(r0)
            java.lang.String r9 = (java.lang.String) r9
        L43:
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoUserItem r0 = r3.user
            if (r0 == 0) goto L6c
            com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage r0 = r0.avatar
            if (r0 == 0) goto L6c
            java.util.List<java.lang.String> r0 = r0.urlList
            if (r0 == 0) goto L6c
            java.lang.Object r10 = X.C13LP.LJJJLL(r0)
            java.lang.String r10 = (java.lang.String) r10
        L55:
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoUserItem r0 = r3.user
            if (r0 == 0) goto L5b
            java.lang.String r11 = r0.nickname
        L5b:
            r12.LL = r2
            java.lang.Object r0 = r5.LJIIZILJ(r6, r7, r8, r9, r10, r11, r12)
            if (r0 != r1) goto L13
            X.C1C7U.LIZIZ(r4)
            return r1
        L67:
            r8 = r11
        L68:
            r9 = r11
            if (r3 == 0) goto L6c
            goto L43
        L6c:
            r10 = r11
            if (r3 == 0) goto L5b
            goto L55
        L70:
            r3 = r11
            goto L27
        L72:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1857860yRk.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
