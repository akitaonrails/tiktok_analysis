package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yOG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1855700yOG extends C09AY implements Function1<TakoMixFeed, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ List<BaseImage> LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1855700yOG(int i, String str, String str2, List list) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = list;
        this.LLILLL = i;
        this.LLILZ = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(TakoMixFeed takoMixFeed) {
        TakoMixFeed takoMixFeed2 = takoMixFeed;
        List<BaseImage> list = takoMixFeed2.images;
        String str = this.LL;
        List<BaseImage> list2 = this.LLILLJJLI;
        int i = this.LLILLL;
        String str2 = this.LLILZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (BaseImage baseImageCopy : list) {
            if (Intrinsics.LJFF(baseImageCopy.uri, str) && Intrinsics.LJFF(baseImageCopy.imageUuid, ((BaseImage) ListProtector.get(list2, i)).imageUuid)) {
                String str3 = str2;
                str2 = str2;
                baseImageCopy = baseImageCopy.copy(str2, baseImageCopy.innerUrlList, baseImageCopy.urlList, baseImageCopy.thumbnailUrlList, baseImageCopy.width, baseImageCopy.height, str3, 100L, baseImageCopy.localCachePath, baseImageCopy.compressedFilePath, baseImageCopy.compressedFileSize, baseImageCopy.imageSource, 3, baseImageCopy.originalFileSize, baseImageCopy.imageUuid, baseImageCopy.stdSize, baseImageCopy.imageSceneType, baseImageCopy.extraInfo);
            }
            arrayList.add(baseImageCopy);
        }
        takoMixFeed2.images = arrayList;
        return Unit.LIZ;
    }
}
