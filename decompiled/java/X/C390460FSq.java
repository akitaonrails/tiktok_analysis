package X;

import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0FSq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C390460FSq extends C2217421BqW implements Function1<EnumC1466150oFx, List<? extends C0FTJ<? extends StickerModel>>> {
    public C390460FSq(C390390FSj c390390FSj) {
        super(1, c390390FSj, C390390FSj.class, "getStickerListByType", "getStickerListByType(Lcom/ss/android/ugc/aweme/tools/sticker/core/StickerType;)Ljava/util/List;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final List<? extends C0FTJ<? extends StickerModel>> invoke(EnumC1466150oFx enumC1466150oFx) {
        return ((C390390FSj) this.receiver).LLLLLZ(enumC1466150oFx);
    }
}
