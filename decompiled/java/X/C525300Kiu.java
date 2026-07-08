package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Kiu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C525300Kiu extends C2217421BqW implements Function0<List<? extends String>> {
    public C525300Kiu(Object obj) {
        super(0, obj, MvChoosePhotoScene.class, "getSelectTabNameList", "getSelectTabNameList()Ljava/util/List;", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends String> invoke() {
        return ((MvChoosePhotoScene) this.receiver).getSelectTabNameList();
    }
}
