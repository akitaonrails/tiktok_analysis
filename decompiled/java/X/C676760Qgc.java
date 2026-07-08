package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.ecommerce.search.vision.PhotoSearchBaseVM;
import com.ss.android.ugc.aweme.ecommerce.search.vision.background.PhotoSearchBackgroundFragment;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchToolsEnterParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Qgc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C676760Qgc extends C09AY implements Function1<String, Unit> {
    public final /* synthetic */ PhotoSearchBackgroundFragment LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C676760Qgc(PhotoSearchBackgroundFragment photoSearchBackgroundFragment, String str) {
        super(1);
        this.LL = photoSearchBackgroundFragment;
        this.LLILLJJLI = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        PhotoSearchEnterParams photoSearchEnterParams;
        PhotoSearchToolsEnterParams photoSearchToolsEnterParams;
        String str2 = str;
        UrlModel urlModelLIZIZ = C09JS.LIZIZ(str2);
        C675950QfJ.LIZ.getClass();
        C675950QfJ.LIZJ.clear();
        C675950QfJ.LIZLLL.clear();
        PhotoSearchBaseVM photoSearchBaseVM = this.LL.LLILZIL;
        if (photoSearchBaseVM != null && (photoSearchEnterParams = photoSearchBaseVM.LLILLL) != null && (photoSearchToolsEnterParams = photoSearchEnterParams.toolsParams) != null) {
            photoSearchToolsEnterParams.setLocalFilePath(str2);
        }
        PhotoSearchBackgroundFragment photoSearchBackgroundFragment = this.LL;
        PhotoSearchBackgroundFragment.NR(photoSearchBackgroundFragment.LLILLL, urlModelLIZIZ, this.LLILLJJLI, photoSearchBackgroundFragment.LLJILJIL);
        return Unit.LIZ;
    }
}
