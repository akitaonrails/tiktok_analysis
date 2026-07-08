package X;

import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0nwm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class C1454260nwm extends C2217421BqW implements Function1<SingleImageData, Unit> {
    public C1454260nwm(C1454020nwO c1454020nwO) {
        super(1, c1454020nwO, C1454020nwO.class, "onInsertAiCover", "onInsertAiCover(Lcom/ss/android/ugc/aweme/creative/model/edit/SingleImageData;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SingleImageData singleImageData) {
        ((C1454020nwO) this.receiver).W6(singleImageData);
        return Unit.LIZ;
    }
}
