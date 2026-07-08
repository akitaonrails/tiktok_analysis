package X;

import com.ss.android.ugc.aweme.infinisticker.b;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0FUt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C391010FUt extends C2217421BqW implements Function1<EnumC1466150oFx, List<? extends C0FTJ<? extends StickerModel>>> {
    public C391010FUt(Object obj) {
        super(1, obj, b.class, "getStickerListByType", "getStickerListByType(Lcom/ss/android/ugc/aweme/tools/sticker/core/StickerType;)Ljava/util/List;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final List<? extends C0FTJ<? extends StickerModel>> invoke(EnumC1466150oFx enumC1466150oFx) {
        return ((b) this.receiver).LLLLLZ(enumC1466150oFx);
    }
}
