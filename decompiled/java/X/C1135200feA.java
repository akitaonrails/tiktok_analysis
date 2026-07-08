package X;

import com.bytedance.android.livesdk.fastgift.foldable.LiveFastGiftSendWidget;
import com.bytedance.android.widget.Widget;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0feA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class C1135200feA extends C2217421BqW implements Function0<Unit> {
    public C1135200feA(Object obj) {
        super(0, obj, LiveFastGiftSendWidget.class, "hide", "hide()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ((Widget) this.receiver).hide();
        return Unit.LIZ;
    }
}
