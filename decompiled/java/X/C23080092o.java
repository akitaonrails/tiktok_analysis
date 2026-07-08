package X;

import com.ss.android.ugc.aweme.autopick.api.AutoPickServiceApi;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.092o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene$trackUploadPageMaterial$1", f = "MvChoosePhotoScene.kt", l = {3582}, m = "invokeSuspend")
public final class C23080092o extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MvChoosePhotoScene LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23080092o(MvChoosePhotoScene mvChoosePhotoScene, InterfaceC1364105Vn<? super C23080092o> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = mvChoosePhotoScene;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C23080092o(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MvChoosePhotoScene@c985.trackUploadPageMaterial$1");
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
            String creationId = null;
            AutoPickServiceApi autoPickServiceApi = (AutoPickServiceApi) PluggableExtentionKt.pluggableSpi$default(AutoPickServiceApi.class, false, false, false, 14, null);
            if (autoPickServiceApi != null) {
                ShortVideoContext shortVideoContext = this.LLILLJJLI.shortVideoContext;
                String str = null;
                if (shortVideoContext != null) {
                    creationId = shortVideoContext.getCreationId();
                }
                ShortVideoContext shortVideoContext2 = this.LLILLJJLI.shortVideoContext;
                if (shortVideoContext2 != null) {
                    str = shortVideoContext2.shootWay;
                }
                this.LL = 1;
                if (autoPickServiceApi.LJIIJJI(creationId, str, this) == objLJFF) {
                    C1C7U.LIZIZ("MvChoosePhotoScene@c985.trackUploadPageMaterial$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MvChoosePhotoScene@c985.trackUploadPageMaterial$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
