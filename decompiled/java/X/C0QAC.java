package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.model.ImageData;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.model.InsiteImageData;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0QAC, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QAC extends C09AY implements Function1<C0QA9, C0QA9> {
    public final /* synthetic */ List<ImageData> LL;
    public final /* synthetic */ List<Aweme> LLILLJJLI;
    public final /* synthetic */ C0QAG LLILLL;
    public final /* synthetic */ List<Map<?, ?>> LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0QAC(int i, C0QAG c0qag, List list, List list2, List list3, boolean z) {
        super(1);
        this.LL = list;
        this.LLILLJJLI = list2;
        this.LLILLL = c0qag;
        this.LLILZ = list3;
        this.LLILZIL = z;
        this.LLILZLL = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0QA9 invoke(C0QA9 c0qa9) {
        String str;
        C0QA9 c0qa92 = c0qa9;
        LinkedHashMap linkedHashMap = new LinkedHashMap(c0qa92.LLILZIL);
        for (Aweme aweme : this.LLILLJJLI) {
            linkedHashMap.put(aweme.getAid(), aweme);
        }
        List<ImageData> list = this.LL;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (ImageData imageData : list) {
            InsiteImageData insiteImageData = imageData.insiteImage;
            if (insiteImageData != null && (str = insiteImageData.aid) != null) {
                Aweme aweme2 = (Aweme) linkedHashMap.get(str);
                InsiteImageData insiteImageDataCopy = null;
                if (aweme2 != null) {
                    InsiteImageData insiteImageData2 = imageData.insiteImage;
                    if (insiteImageData2 != null) {
                        insiteImageDataCopy = insiteImageData2.copy(insiteImageData2.insiteType, aweme2, insiteImageData2.searchAwemeInfo, insiteImageData2.url, insiteImageData2.cutTime, insiteImageData2.index, insiteImageData2.width, insiteImageData2.height, insiteImageData2.aid, insiteImageData2.imageId);
                    }
                    ImageData imageDataCopy = imageData.copy(imageData.type, imageData.originalUrl, imageData.offsiteImage, insiteImageDataCopy, imageData.brandImage, imageData.aigcImage);
                    if (imageDataCopy != null) {
                        imageData = imageDataCopy;
                    }
                }
            }
            arrayList.add(imageData);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("update hasAwemeData ");
        sbLIZ.append(!this.LLILLJJLI.isEmpty());
        sbLIZ.append(' ');
        sbLIZ.append(this.LLILLL);
        C2188811AlT.LIZIZ(sbLIZ);
        return C0QA9.LIZ(c0qa92, null, !this.LLILLJJLI.isEmpty(), arrayList, this.LLILZ, linkedHashMap, this.LLILZIL, this.LLILZLL, this.LLILLL, C2097608Jq.LJ(), 1);
    }
}
