package X;

import com.bytedance.android.livesdk.broadcast.preview.widget.startlive.PreviewStartLiveWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0URQ, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class C0URQ extends C2217421BqW implements Function0<Unit> {
    public C0URQ(Object obj) {
        super(0, obj, PreviewStartLiveWidget.class, "onGoLiveFail", "onGoLiveFail()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ((PreviewStartLiveWidget) this.receiver).Q1();
        return Unit.LIZ;
    }
}
