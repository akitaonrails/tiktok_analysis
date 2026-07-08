package X;

import com.ss.android.ugc.aweme.portrait.model.AIPortraitImageUploadResult;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitImageUploadState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lhy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.portrait.generate.component.AIPortraitGenerationLogicComponent$uploadPhotoAndSubmitWorkflow$1$uploadResult$1", f = "AIPortraitGenerationLogicComponent.kt", l = {}, m = "invokeSuspend")
public final class C550200Lhy extends C09AX implements Function2<AIPortraitImageUploadResult, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ Object LL;

    public C550200Lhy(InterfaceC1364105Vn<? super C550200Lhy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C550200Lhy c550200Lhy = new C550200Lhy(interfaceC1364105Vn);
        c550200Lhy.LL = obj;
        return c550200Lhy;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("AIPortraitGenerationLogicComponent@d404.uploadPhotoAndSubmitWorkflow$1$uploadResult$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (((AIPortraitImageUploadResult) this.LL).state != AIPortraitImageUploadState.UPLOADING) {
            z = true;
        } else {
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("AIPortraitGenerationLogicComponent@d404.uploadPhotoAndSubmitWorkflow$1$uploadResult$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AIPortraitImageUploadResult aIPortraitImageUploadResult, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(aIPortraitImageUploadResult, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
