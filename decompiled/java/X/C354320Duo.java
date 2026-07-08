package X;

import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Duo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C354320Duo extends C2217421BqW implements Function1<List<? extends TextStickerData>, Unit> {
    public C354320Duo(C364480EQs c364480EQs) {
        super(1, c364480EQs, C364480EQs.class, "onConfirmFilterWords", "onConfirmFilterWords(Ljava/util/List;)V", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<? extends TextStickerData> list) {
        ((C364480EQs) this.receiver).H5(list);
        return Unit.LIZ;
    }
}
