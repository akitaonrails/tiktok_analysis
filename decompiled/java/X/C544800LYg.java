package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCOfflineProcessingViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LYg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCOfflineProcessingViewModel$saveDraftWithImageInputOnlyAtomic$2", f = "AIGCOfflineProcessingViewModel.kt", l = {1097, 477, 485}, m = "invokeSuspend")
public final class C544800LYg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC383701eN LL;
    public AIGCOfflineProcessingViewModel LLILLJJLI;
    public Object LLILLL;
    public C0LY8 LLILZ;
    public int LLILZIL;
    public final /* synthetic */ AIGCOfflineProcessingViewModel LLILZLL;
    public final /* synthetic */ ShortVideoContext LLIZ;
    public final /* synthetic */ C0LY8 LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C544800LYg(AIGCOfflineProcessingViewModel aIGCOfflineProcessingViewModel, ShortVideoContext shortVideoContext, C0LY8 c0ly8, InterfaceC1364105Vn<? super C544800LYg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = aIGCOfflineProcessingViewModel;
        this.LLIZ = shortVideoContext;
        this.LLIZLLLIL = c0ly8;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C544800LYg(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b8 A[Catch: all -> 0x00e7, IOException -> 0x00e9, TryCatch #0 {IOException -> 0x00e9, blocks: (B:14:0x0035, B:39:0x00b0, B:41:0x00b8), top: B:59:0x0035 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C544800LYg.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
