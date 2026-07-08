package X;

import com.ss.android.ugc.gamora.editor.mixediting.resource.feature.MixEditingFeatureExtractionService;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08uu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.resource.feature.MixEditingFeatureExtractionService$uploadFrames$2$2", f = "MixEditingFeatureExtractionService.kt", l = {369, 382, 387}, m = "invokeSuspend")
public final class C2269808uu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C2268608ui>, Object> {
    public long LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C2268608ui LLILZ;
    public final /* synthetic */ MixEditingFeatureExtractionService LLILZIL;
    public final /* synthetic */ List<C2262608tk> LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ C2263508tt LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2269808uu(MixEditingFeatureExtractionService mixEditingFeatureExtractionService, C2263508tt c2263508tt, C2268608ui c2268608ui, String str, List list, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c2268608ui;
        this.LLILZIL = mixEditingFeatureExtractionService;
        this.LLILZLL = list;
        this.LLIZ = str;
        this.LLIZLLLIL = c2263508tt;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2268608ui c2268608ui = this.LLILZ;
        MixEditingFeatureExtractionService mixEditingFeatureExtractionService = this.LLILZIL;
        List<C2262608tk> list = this.LLILZLL;
        C2269808uu c2269808uu = new C2269808uu(mixEditingFeatureExtractionService, this.LLIZLLLIL, c2268608ui, this.LLIZ, list, interfaceC1364105Vn);
        c2269808uu.LLILLL = obj;
        return c2269808uu;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d0  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2269808uu.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C2268608ui> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
