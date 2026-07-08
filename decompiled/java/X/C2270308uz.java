package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.mixediting.IMixEditingFeatureExtractionService;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08uz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.resource.feature.MixEditingFeatureExtractionServiceKt$uploadFramesForMixEditing$1$1$uploadResult$1", f = "MixEditingFeatureExtractionService.kt", l = {1073}, m = "invokeSuspend")
public final class C2270308uz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C2268608ui>, Object> {
    public int LL;
    public final /* synthetic */ List<C2262608tk> LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ VideoPublishEditModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2270308uz(List<C2262608tk> list, String str, VideoPublishEditModel videoPublishEditModel, InterfaceC1364105Vn<? super C2270308uz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = str;
        this.LLILZ = videoPublishEditModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2270308uz(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MixEditingFeatureExtractionServiceKt@6aea.uploadFramesForMixEditing$1$1$uploadResult$1");
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
            IMixEditingFeatureExtractionService iMixEditingFeatureExtractionService = (IMixEditingFeatureExtractionService) PluggableExtentionKt.pluggableSpi$default(IMixEditingFeatureExtractionService.class, false, false, false, 14, null);
            if (iMixEditingFeatureExtractionService != null) {
                List<C2262608tk> list = this.LLILLJJLI;
                String str = this.LLILLL;
                VideoPublishEditModel videoPublishEditModel = this.LLILZ;
                C2263508tt c2263508tt = new C2263508tt(videoPublishEditModel.mShootWay, C1428470nHB.LJIILIIL(videoPublishEditModel), this.LLILZ.getCreationId(), 4);
                this.LL = 1;
                obj = iMixEditingFeatureExtractionService.LJIILL(list, str, c2263508tt, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("MixEditingFeatureExtractionServiceKt@6aea.uploadFramesForMixEditing$1$1$uploadResult$1");
                    return objLJFF;
                }
            } else {
                obj = null;
            }
        }
        C1C7U.LIZIZ("MixEditingFeatureExtractionServiceKt@6aea.uploadFramesForMixEditing$1$1$uploadResult$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C2268608ui> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
