package X;

import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0L9f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.editcut.CutOptimizedVideoChosenHandler$preFetchMixedAssetPanelInfo$1", f = "CutOptimizedVideoChosenHandler.kt", l = {3187}, m = "invokeSuspend")
public final class C538290L9f extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C118300cf LL;
    public int LLILLJJLI;
    public final /* synthetic */ List<MediaModel> LLILLL;
    public final /* synthetic */ C0L7R LLILZ;
    public final /* synthetic */ ShortVideoContext LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C538290L9f(List<? extends MediaModel> list, C0L7R c0l7r, ShortVideoContext shortVideoContext, String str, InterfaceC1364105Vn<? super C538290L9f> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
        this.LLILZ = c0l7r;
        this.LLILZIL = shortVideoContext;
        this.LLILZLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C538290L9f(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0172 A[PHI: r14
      0x0172: PHI (r14v4 int) = (r14v1 int), (r14v9 int) binds: [B:41:0x016e, B:14:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x019b A[PHI: r13 r14
      0x019b: PHI (r13v4 int) = (r13v1 int), (r13v7 int) binds: [B:54:0x0197, B:17:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x019b: PHI (r14v5 int) = (r14v4 int), (r14v8 int) binds: [B:54:0x0197, B:17:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r65) {
        /*
            Method dump skipped, instruction units count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C538290L9f.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
