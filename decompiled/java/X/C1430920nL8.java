package X;

import com.ss.android.ugc.aweme.creative.model.edit.ImageSynthesisResult;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0nL8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1430920nL8 extends C09AY implements Function2<Integer, ImageSynthesisResult, Unit> {
    public final /* synthetic */ Set<Integer> LL;
    public final /* synthetic */ List<SingleImageData> LLILLJJLI;
    public final /* synthetic */ Function2<ImageSynthesisResult, Integer, Unit> LLILLL;
    public final /* synthetic */ VideoPublishEditModel LLILZ;
    public final /* synthetic */ Function1<List<ImageSynthesisResult>, Unit> LLILZIL;
    public final /* synthetic */ C1432320nNO LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1430920nL8(Set<Integer> set, List<SingleImageData> list, Function2<? super ImageSynthesisResult, ? super Integer, Unit> function2, VideoPublishEditModel videoPublishEditModel, Function1<? super List<ImageSynthesisResult>, Unit> function1, C1432320nNO c1432320nNO) {
        super(2);
        this.LL = set;
        this.LLILLJJLI = list;
        this.LLILLL = function2;
        this.LLILZ = videoPublishEditModel;
        this.LLILZIL = function1;
        this.LLILZLL = c1432320nNO;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, ImageSynthesisResult imageSynthesisResult) {
        int iIntValue = num.intValue();
        C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onItemSynthesisSuccess index = ");
        sbLIZ.append(iIntValue);
        sbLIZ.append(", compiledIndexList = ");
        sbLIZ.append(this.LL);
        c1437510nVlLJJLIIIJ.LIZ("compile", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LL.contains(Integer.valueOf(iIntValue))) {
            C1437510nVl c1437510nVlLJJLIIIJ2 = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onItemSynthesisSuccess, duplicated compile callback, index = ");
            sbLIZ2.append(iIntValue);
            sbLIZ2.append(", totalSize: ");
            sbLIZ2.append(this.LLILLJJLI.size());
            c1437510nVlLJJLIIIJ2.LIZ("compile", C2188811AlT.LIZIZ(sbLIZ2));
        } else {
            this.LL.add(Integer.valueOf(iIntValue));
        }
        Function2<ImageSynthesisResult, Integer, Unit> function2 = this.LLILLL;
        if (function2 != null) {
            function2.invoke(imageSynthesisResult, Integer.valueOf(iIntValue));
        }
        if (this.LL.size() == this.LLILLJJLI.size()) {
            if (C297660Blc.LIZ()) {
                for (SingleImageData singleImageData : this.LLILLJJLI) {
                    ImageSynthesisResult synthesisData = singleImageData.getSynthesisData();
                    if (synthesisData != null) {
                        synthesisData.setKey(singleImageData.getSrcImageInfo().getPath());
                    }
                }
            }
            if (C568750MSj.LIZIZ(this.LLILZ)) {
                for (SingleImageData singleImageData2 : this.LLILLJJLI) {
                    ImageSynthesisResult synthesisData2 = singleImageData2.getSynthesisData();
                    if (synthesisData2 != null) {
                        synthesisData2.setRemoteUri(singleImageData2.getSrcImageInfo().getRemoteUri());
                    }
                }
            }
            Function1<List<ImageSynthesisResult>, Unit> function1 = this.LLILZIL;
            if (function1 != null) {
                List<SingleImageData> list = this.LLILLJJLI;
                ArrayList arrayList = new ArrayList();
                Iterator<SingleImageData> it2 = list.iterator();
                while (it2.hasNext()) {
                    ImageSynthesisResult synthesisData3 = it2.next().getSynthesisData();
                    if (synthesisData3 != null) {
                        arrayList.add(synthesisData3);
                    }
                }
                function1.invoke(arrayList);
            }
            C1432320nNO c1432320nNO = this.LLILZLL;
            ((ArrayList) c1432320nNO.LJFF).clear();
            c1432320nNO.LJ().shutdown();
            ((ArrayList) this.LLILZLL.LJFF).clear();
        }
        return Unit.LIZ;
    }
}
