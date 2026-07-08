package X;

import com.ss.android.ugc.aweme.creative.model.edit.EditImageInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ImageSynthesisResult;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0nmE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1447720nmE extends C09AY implements Function1<ImageSynthesisResult, Unit> {
    public final /* synthetic */ Map.Entry<SingleImageData, Integer> LL;
    public final /* synthetic */ AtomicInteger LLILLJJLI;
    public final /* synthetic */ Map<SingleImageData, Integer> LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1447720nmE(Map.Entry<SingleImageData, Integer> entry, AtomicInteger atomicInteger, Map<SingleImageData, Integer> map, String str, boolean z, Function0<Unit> function0) {
        super(1);
        this.LL = entry;
        this.LLILLJJLI = atomicInteger;
        this.LLILLL = map;
        this.LLILZ = str;
        this.LLILZIL = z;
        this.LLILZLL = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ImageSynthesisResult imageSynthesisResult) {
        ImageSynthesisResult imageSynthesisResult2 = imageSynthesisResult;
        EditImageInfo editImageInfo = this.LL.getKey().getEditImageInfo();
        String str = this.LLILZ;
        boolean z = this.LLILZIL;
        editImageInfo.setTempSynthesisPath(str, !C0CHQ.LIZ().LJJIIJZLJL().LIZ());
        editImageInfo.setLocalImageWithEnhance(z);
        editImageInfo.setNeedCompileLocalImage(false);
        this.LL.getKey().getFilterInfo().setNeedRender(false);
        this.LL.getKey().getEditImageInfo().setBitmapWidth(imageSynthesisResult2.getWidth());
        this.LL.getKey().getEditImageInfo().setBitmapHeight(imageSynthesisResult2.getHeight());
        if (this.LLILLJJLI.addAndGet(1) >= this.LLILLL.size()) {
            C0CNO.LIZLLL(0L, new AwS566S0100000_22(this.LLILZLL, (Function0<Boolean>) 949));
        }
        return Unit.LIZ;
    }
}
