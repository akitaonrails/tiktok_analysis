package X;

import com.ss.android.ugc.aweme.publish.model.UploadImageConfig;
import com.ss.android.ugc.gamora.editor.mixediting.resource.feature.MixEditingFeatureExtractionService;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08vL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.resource.feature.MixEditingFeatureExtractionService$uploadFrames$2$2$updateAuthConfigTask$1", f = "MixEditingFeatureExtractionService.kt", l = {367}, m = "invokeSuspend")
public final class C2272508vL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends UploadImageConfig, ? extends String>>, Object> {
    public int LL;
    public final /* synthetic */ MixEditingFeatureExtractionService LLILLJJLI;
    public final /* synthetic */ C2263508tt LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2272508vL(MixEditingFeatureExtractionService mixEditingFeatureExtractionService, C2263508tt c2263508tt, InterfaceC1364105Vn<? super C2272508vL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = mixEditingFeatureExtractionService;
        this.LLILLL = c2263508tt;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2272508vL(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2272508vL.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends UploadImageConfig, ? extends String>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
