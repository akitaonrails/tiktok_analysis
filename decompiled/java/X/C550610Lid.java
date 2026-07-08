package X;

import com.ss.android.ugc.aweme.portrait.model.AIPortraitImageUploadResult;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitImageUploadState;
import com.ss.android.ugc.aweme.portrait.service.AIPortraitFileServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lid, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.portrait.service.AIPortraitFileServiceImpl$uploadImageToImageX$2$1$onNotify$1", f = "AIPortraitFileServiceImpl.kt", l = {186}, m = "invokeSuspend")
public final class C550610Lid extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AIPortraitFileServiceImpl LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C550610Lid(AIPortraitFileServiceImpl aIPortraitFileServiceImpl, String str, String str2, long j, InterfaceC1364105Vn<? super C550610Lid> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = aIPortraitFileServiceImpl;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C550610Lid(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIPortraitFileServiceImpl@545c.uploadImageToImageX$2$1$onNotify$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            AIPortraitFileServiceImpl aIPortraitFileServiceImpl = this.LLILLJJLI;
            AIPortraitImageUploadResult aIPortraitImageUploadResult = new AIPortraitImageUploadResult(this.LLILLL, this.LLILZ, null, C13LZ.LJ((int) this.LLILZIL, 0, 100), AIPortraitImageUploadState.UPLOADING, null);
            this.LL = 1;
            if (aIPortraitFileServiceImpl.LIZ(aIPortraitImageUploadResult, this) == objLJFF) {
                C1C7U.LIZIZ("AIPortraitFileServiceImpl@545c.uploadImageToImageX$2$1$onNotify$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIPortraitFileServiceImpl@545c.uploadImageToImageX$2$1$onNotify$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
