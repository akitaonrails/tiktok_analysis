package X;

import android.net.Uri;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Kim, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C525220Kim extends C2217421BqW implements Function1<List<? extends Uri>, Unit> {
    public C525220Kim(MvChoosePhotoScene mvChoosePhotoScene) {
        super(1, mvChoosePhotoScene, MvChoosePhotoScene.class, "handlePhotoPickerResult", "handlePhotoPickerResult(Ljava/util/List;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<? extends Uri> list) {
        ((MvChoosePhotoScene) this.receiver).handlePhotoPickerResult(list);
        return Unit.LIZ;
    }
}
