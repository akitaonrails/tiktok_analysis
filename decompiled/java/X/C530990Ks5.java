package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Ks5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C530990Ks5 extends C2217421BqW implements Function1<List<? extends TikTokMediaModel>, Unit> {
    public C530990Ks5(C531030Ks9 c531030Ks9) {
        super(1, c531030Ks9, C531030Ks9.class, "onSelectedModelChanged", "onSelectedModelChanged(Ljava/util/List;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<? extends TikTokMediaModel> list) {
        ((C531030Ks9) this.receiver).M5(list);
        return Unit.LIZ;
    }
}
