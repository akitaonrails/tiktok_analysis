package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yOF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1855690yOF extends C09AY implements Function1<TakoMixFeed, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ List<BaseImage> LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1855690yOF(int i, long j, String str, List list) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = list;
        this.LLILLL = i;
        this.LLILZ = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(TakoMixFeed takoMixFeed) {
        TakoMixFeed takoMixFeed2 = takoMixFeed;
        List<BaseImage> list = takoMixFeed2.images;
        String str = this.LL;
        List<BaseImage> list2 = this.LLILLJJLI;
        int i = this.LLILLL;
        long j = this.LLILZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (BaseImage baseImageCopy : list) {
            if (Intrinsics.LJFF(baseImageCopy.uri, str) && Intrinsics.LJFF(baseImageCopy.imageUuid, ((BaseImage) ListProtector.get(list2, i)).imageUuid)) {
                baseImageCopy = baseImageCopy.copy(baseImageCopy.imageId, baseImageCopy.innerUrlList, baseImageCopy.urlList, baseImageCopy.thumbnailUrlList, baseImageCopy.width, baseImageCopy.height, baseImageCopy.uri, Long.valueOf(j), baseImageCopy.localCachePath, baseImageCopy.compressedFilePath, baseImageCopy.compressedFileSize, baseImageCopy.imageSource, 2, baseImageCopy.originalFileSize, baseImageCopy.imageUuid, baseImageCopy.stdSize, baseImageCopy.imageSceneType, baseImageCopy.extraInfo);
            }
            arrayList.add(baseImageCopy);
        }
        takoMixFeed2.images = arrayList;
        return Unit.LIZ;
    }
}
