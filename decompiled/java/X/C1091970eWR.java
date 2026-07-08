package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.widget.LivePreviewBoardTipsViewWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0eWR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1091970eWR extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ C1092150eWj LL;
    public final /* synthetic */ LivePreviewBoardTipsViewWidget LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1091970eWR(C1092150eWj c1092150eWj, LivePreviewBoardTipsViewWidget livePreviewBoardTipsViewWidget) {
        super(1);
        this.LL = c1092150eWj;
        this.LLILLJJLI = livePreviewBoardTipsViewWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        if (bool.booleanValue()) {
            C1092150eWj c1092150eWj = this.LL;
            if (c1092150eWj != null) {
                c1092150eWj.setLifecycleOwner(this.LLILLJJLI.widgetCallback.getFragment());
            }
            C1092150eWj c1092150eWj2 = this.LL;
            if (c1092150eWj2 != null) {
                c1092150eWj2.setDataChannel(this.LLILLJJLI.dataChannel);
            }
        }
        return Unit.LIZ;
    }
}
