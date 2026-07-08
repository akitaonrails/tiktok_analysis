package X;

import com.bytedance.android.live.effect.bulletin.LiveBoardsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01g5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.board.download.PCSBoardEffectDownloader$fetchAndDownload$1", f = "PCSBoardEffectDownloader.kt", l = {40, 45, 46}, m = "invokeSuspend")
public final class C394301g5 extends C09AX implements Function2<InterfaceC346701Wf<? super C387101ev>, InterfaceC1364105Vn<? super Unit>, Object> {
    public LiveBoardsViewModel LL;
    public C395101gD LLILLJJLI;
    public LiveBoardsViewModel LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C395101gD LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C394301g5(C395101gD c395101gD, InterfaceC1364105Vn<? super C394301g5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = c395101gD;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C394301g5 c394301g5 = new C394301g5(this.LLILZLL, interfaceC1364105Vn);
        c394301g5.LLILZIL = obj;
        return c394301g5;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1  */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.01gh] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.String r9 = "PCSBoardEffectDownloader@226.fetchAndDownload$1"
            X.C1C7U.LIZ(r9)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r10.LLILZ
            r7 = 3
            r8 = 2
            r2 = 1
            if (r0 == 0) goto L1f
            if (r0 == r2) goto Lad
            if (r0 == r8) goto L7c
            if (r0 != r7) goto La5
            X.C155000ia.LIZIZ(r11)
        L19:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r9)
            return r0
        L1f:
            X.C155000ia.LIZIZ(r11)
            java.lang.Object r5 = r10.LLILZIL
            X.01Wf r5 = (X.InterfaceC346701Wf) r5
            X.01gD r0 = r10.LLILZLL
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r1 = r0.LIZ
            if (r1 == 0) goto L3d
            X.01ev r0 = new X.01ev
            r0.<init>(r2, r1)
            r10.LLILZ = r2
            java.lang.Object r0 = r5.emit(r0, r10)
            if (r0 != r6) goto Lb0
            X.C1C7U.LIZIZ(r9)
            return r6
        L3d:
            androidx.lifecycle.ViewModelProvider r4 = new androidx.lifecycle.ViewModelProvider
            X.0UPT r3 = X.C0UPT.LL
            X.01gB r2 = new X.01gB
            X.0U8g r1 = new X.0U8g
            r1.<init>()
            X.01gh r0 = new X.01gh
            r0.<init>()
            r2.<init>(r1, r0)
            r4.<init>(r3, r2)
            java.lang.Class<com.bytedance.android.live.effect.bulletin.LiveBoardsViewModel> r0 = com.bytedance.android.live.effect.bulletin.LiveBoardsViewModel.class
            androidx.lifecycle.ViewModel r4 = r4.get(r0)
            com.bytedance.android.live.effect.bulletin.LiveBoardsViewModel r4 = (com.bytedance.android.live.effect.bulletin.LiveBoardsViewModel) r4
            X.01gD r3 = r10.LLILZLL
            X.1DEK r2 = r4.LLILLJJLI
            X.01gH r1 = new X.01gH
            java.lang.String r0 = "liveboards_2"
            r1.<init>(r0)
            r10.LLILZIL = r5
            r10.LL = r4
            r10.LLILLJJLI = r3
            r10.LLILLL = r4
            r10.LLILZ = r8
            java.lang.Object r0 = r2.LJIJI(r1, r10)
            if (r0 != r6) goto L7a
            X.C1C7U.LIZIZ(r9)
            return r6
        L7a:
            r8 = r4
            goto L89
        L7c:
            com.bytedance.android.live.effect.bulletin.LiveBoardsViewModel r4 = r10.LLILLL
            X.01gD r3 = r10.LLILLJJLI
            com.bytedance.android.live.effect.bulletin.LiveBoardsViewModel r8 = r10.LL
            java.lang.Object r5 = r10.LLILZIL
            X.01Wf r5 = (X.InterfaceC346701Wf) r5
            X.C155000ia.LIZIZ(r11)
        L89:
            X.1DDr r2 = r4.LLILLL
            X.01g4 r1 = new X.01g4
            r0 = 0
            r1.<init>(r5, r4, r3, r0)
            r10.LLILZIL = r8
            r10.LL = r0
            r10.LLILLJJLI = r0
            r10.LLILLL = r0
            r10.LLILZ = r7
            java.lang.Object r0 = X.C09IC.LJIJ(r2, r10, r1)
            if (r0 != r6) goto L19
            X.C1C7U.LIZIZ(r9)
            return r6
        La5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lad:
            X.C155000ia.LIZIZ(r11)
        Lb0:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C394301g5.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super C387101ev> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
