package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchIntentKeyFrameAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H7W, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchIntentKeyFrameAssem$bindExpandedContent$5", f = "SearchIntentKeyFrameAssem.kt", l = {275}, m = "invokeSuspend")
public final class C0H7W extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public C0H81 LLILLL;
    public SearchIntentKeyFrameAssem LLILZ;
    public Aweme LLILZIL;
    public Object LLILZLL;
    public Object LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public final /* synthetic */ SearchIntentKeyFrameAssem LLJI;
    public final /* synthetic */ Aweme LLJIJIL;
    public final /* synthetic */ C0H81 LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0H7W(SearchIntentKeyFrameAssem searchIntentKeyFrameAssem, Aweme aweme, C0H81 c0h81, InterfaceC1364105Vn<? super C0H7W> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJI = searchIntentKeyFrameAssem;
        this.LLJIJIL = aweme;
        this.LLJILJIL = c0h81;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0H7W(this.LLJI, this.LLJIJIL, this.LLJILJIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Path cross not found for [B:35:0x00e1, B:39:0x0107], limit reached: 55 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00b9 -> B:6:0x002f). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0H7W.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
