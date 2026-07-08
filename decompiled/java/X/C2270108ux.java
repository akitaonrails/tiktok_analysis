package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08ux, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.resource.feature.MixEditingFeatureExtractionServiceKt$uploadFramesForMixEditing$1$1", f = "MixEditingFeatureExtractionService.kt", l = {1072, 1095}, m = "invokeSuspend")
public final class C2270108ux extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C2268608ui>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ VideoPublishEditModel LLILLL;
    public final /* synthetic */ VideoPublishEditModel LLILZ;
    public final /* synthetic */ List<String> LLILZIL;
    public final /* synthetic */ List<C2262608tk> LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2270108ux(VideoPublishEditModel videoPublishEditModel, VideoPublishEditModel videoPublishEditModel2, List<String> list, List<C2262608tk> list2, String str, InterfaceC1364105Vn<? super C2270108ux> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = videoPublishEditModel;
        this.LLILZ = videoPublishEditModel2;
        this.LLILZIL = list;
        this.LLILZLL = list2;
        this.LLIZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2270108ux(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r2v3, types: [T, java.lang.Integer] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2270108ux.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C2268608ui> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
