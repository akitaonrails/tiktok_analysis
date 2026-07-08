package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.draft.DraftInfoModel;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0M55, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C0M55 extends C2217421BqW implements Function1<C570700MZw, Boolean> {
    public static final C0M55 LL = new C0M55();

    public C0M55() {
        super(1, C570700MZw.class, "canText2ImageDirect2Publish", "canText2ImageDirect2Publish()Z", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(C570700MZw c570700MZw) {
        String str;
        DraftInfoModel draftInfoModel;
        C570700MZw c570700MZw2 = c570700MZw;
        boolean zLJJJJ = false;
        if (C1428470nHB.LLIIIILZ(c570700MZw2.LIZIZ) && !c570700MZw2.LIZIZ.isFromCrash()) {
            if (c570700MZw2.LIZLLL == 3) {
                zLJJJJ = true;
            } else {
                C0M2U.LIZ.getClass();
                List<String> list = C0M2U.LIZLLL;
                CreativeModel creativeModel = c570700MZw2.LIZIZ.creativeModel;
                if (creativeModel != null && (draftInfoModel = creativeModel.draftInfoModel) != null) {
                    str = draftInfoModel.saveDraftScene;
                } else {
                    str = null;
                }
                zLJJJJ = C13LP.LJJJJ(str, list);
            }
        }
        return Boolean.valueOf(zLJJJJ);
    }
}
