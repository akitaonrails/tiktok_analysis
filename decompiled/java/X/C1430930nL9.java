package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.edit.ImageSynthesisResult;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0nL9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1430930nL9 extends C09AY implements Function1<ImageSynthesisResult, Unit> {
    public final /* synthetic */ List<SingleImageData> LL;
    public final /* synthetic */ C1413340msm LLILLJJLI;
    public final /* synthetic */ C1432320nNO LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Function2<Integer, ImageSynthesisResult, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1430930nL9(List<SingleImageData> list, C1413340msm c1413340msm, C1432320nNO c1432320nNO, String str, Function2<? super Integer, ? super ImageSynthesisResult, Unit> function2) {
        super(1);
        this.LL = list;
        this.LLILLJJLI = c1413340msm;
        this.LLILLL = c1432320nNO;
        this.LLILZ = str;
        this.LLILZIL = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ImageSynthesisResult imageSynthesisResult) {
        ImageSynthesisResult imageSynthesisResultCopy;
        ImageSynthesisResult imageSynthesisResult2 = imageSynthesisResult;
        SingleImageData singleImageData = (SingleImageData) ListProtector.get(this.LL, this.LLILLJJLI.LIZ);
        if (C296170BjD.LIZ()) {
            C1432320nNO c1432320nNO = this.LLILLL;
            String path = imageSynthesisResult2.getPath();
            c1432320nNO.getClass();
            imageSynthesisResultCopy = imageSynthesisResult2.copy(C1432320nNO.LIZJ(path), imageSynthesisResult2.width, imageSynthesisResult2.height, imageSynthesisResult2.compileLevel, imageSynthesisResult2.key, imageSynthesisResult2.duration, imageSynthesisResult2.liveVideo, imageSynthesisResult2.remoteUri, imageSynthesisResult2.watermarkPath);
        } else {
            imageSynthesisResultCopy = imageSynthesisResult2;
        }
        singleImageData.setSynthesisData(imageSynthesisResultCopy);
        C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onItemSynthesisSuccess: ");
        sbLIZ.append(imageSynthesisResult2);
        sbLIZ.append(", index = ");
        sbLIZ.append(this.LLILLJJLI.LIZ);
        sbLIZ.append(" src=");
        sbLIZ.append(this.LLILZ);
        c1437510nVlLJJLIIIJ.LIZ("compile", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILZIL.invoke(Integer.valueOf(this.LLILLJJLI.LIZ), imageSynthesisResult2);
        return Unit.LIZ;
    }
}
