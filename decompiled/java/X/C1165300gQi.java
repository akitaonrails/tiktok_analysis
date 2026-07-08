package X;

import com.ss.android.ugc.aweme.music.model.FetchSimilarMusicOption;
import com.ss.android.ugc.aweme.music.model.IFetchSimilarMusicCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0gQi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.service.MusicDetailService$findSimilarMusic$1", f = "MusicDetailService.kt", l = {338, 341, 371}, m = "invokeSuspend")
public final class C1165300gQi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ FetchSimilarMusicOption LLILLJJLI;
    public final /* synthetic */ IFetchSimilarMusicCallback LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1165300gQi(FetchSimilarMusicOption fetchSimilarMusicOption, IFetchSimilarMusicCallback iFetchSimilarMusicCallback, InterfaceC1364105Vn<? super C1165300gQi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = fetchSimilarMusicOption;
        this.LLILLL = iFetchSimilarMusicCallback;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1165300gQi(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x016d  */
    /* JADX WARN: Type inference failed for: r0v30, types: [T, java.lang.Object] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r56) {
        /*
            Method dump skipped, instruction units count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1165300gQi.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
