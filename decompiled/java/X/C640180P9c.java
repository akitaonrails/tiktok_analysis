package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.search.pages.common.theme.activitybg.SearchActivityCardBgController;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0P9c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C640180P9c extends C2217421BqW implements Function2<GlobalDoodleConfig, RecyclerView, Unit> {
    public C640180P9c(Object obj) {
        super(2, obj, SearchActivityCardBgController.class, "processActivityCardBg", "processActivityCardBg(Lcom/ss/android/ugc/aweme/discover/model/GlobalDoodleConfig;Landroidx/recyclerview/widget/RecyclerView;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(GlobalDoodleConfig globalDoodleConfig, RecyclerView recyclerView) {
        ((SearchActivityCardBgController) this.receiver).LIZJ(globalDoodleConfig, recyclerView);
        return Unit.LIZ;
    }
}
