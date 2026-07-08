package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.gamora.editor.mixediting.resource.feature.MixEditingFeatureExtractionService;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08tV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.resource.feature.MixEditingFeatureExtractionService$getAllFramesFlow$1", f = "MixEditingFeatureExtractionService.kt", l = {687, 698}, m = "invokeSuspend")
public final class C2261108tV extends C09AX implements Function2<C094D<? super Pair<? extends List<? extends Bitmap>, ? extends String>>, InterfaceC1364105Vn<? super Unit>, Object> {
    public C118300cf LL;
    public Object LLILLJJLI;
    public C2263508tt LLILLL;
    public C2268608ui LLILZ;
    public Object LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public /* synthetic */ Object LLJ;
    public final /* synthetic */ C2268608ui LLJI;
    public final /* synthetic */ List<C2262608tk> LLJIJIL;
    public final /* synthetic */ MixEditingFeatureExtractionService LLJILJIL;
    public final /* synthetic */ String LLJILJILJ;
    public final /* synthetic */ C2263508tt LLJILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2261108tV(MixEditingFeatureExtractionService mixEditingFeatureExtractionService, C2263508tt c2263508tt, C2268608ui c2268608ui, String str, List list, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJI = c2268608ui;
        this.LLJIJIL = list;
        this.LLJILJIL = mixEditingFeatureExtractionService;
        this.LLJILJILJ = str;
        this.LLJILLL = c2263508tt;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2268608ui c2268608ui = this.LLJI;
        List<C2262608tk> list = this.LLJIJIL;
        C2261108tV c2261108tV = new C2261108tV(this.LLJILJIL, this.LLJILLL, c2268608ui, this.LLJILJILJ, list, interfaceC1364105Vn);
        c2261108tV.LLJ = obj;
        return c2261108tV;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014d  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [X.00cf, X.08tt, X.08ui, java.lang.Object, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00a8 -> B:39:0x0104). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00c0 -> B:31:0x00df). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2261108tV.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C094D<? super Pair<? extends List<? extends Bitmap>, ? extends String>> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c094d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
