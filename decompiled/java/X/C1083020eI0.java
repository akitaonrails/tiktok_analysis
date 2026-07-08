package X;

import com.bytedance.android.live.pincard.event.LivePinCardVisibilityChannel;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.ElementSpecImpl;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.bytedance.ies.sdk.widgets.WidgetHiddenChangedSceneObserver;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0eI0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1083020eI0 extends ElementSpecImpl {
    public final AbstractC1080560eE2 LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;

    public C1083020eI0(AbstractC1080560eE2 abstractC1080560eE2) {
        super(R.id.kw5);
        this.LL = abstractC1080560eE2;
        addSceneObserver(new DataChannelSceneObserver<C1088240eQQ, LivePinCardVisibilityChannel>() { // from class: X.0eHz
            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final Class<LivePinCardVisibilityChannel> getType() {
                return LivePinCardVisibilityChannel.class;
            }

            {
                super(true);
            }

            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C1088240eQQ c1088240eQQ) {
                C1083020eI0 c1083020eI0 = this.LIZ;
                c1083020eI0.LLIZ = c1088240eQQ.LIZIZ;
                c1083020eI0.LIZ(constraintProperty);
            }
        });
        addSceneObserver(new WidgetHiddenChangedSceneObserver() { // from class: X.0eI1
            {
                super(R.id.n8i);
            }

            @Override // com.bytedance.ies.sdk.widgets.WidgetHiddenChangedSceneObserver
            public final void onHiddenChanged(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, boolean z) {
                C1083020eI0 c1083020eI0 = this.LIZ;
                c1083020eI0.LLILLJJLI = !z;
                c1083020eI0.LIZ(constraintProperty);
            }
        });
        addSceneObserver(new WidgetHiddenChangedSceneObserver() { // from class: X.0eI2
            {
                super(R.id.f814ule);
            }

            @Override // com.bytedance.ies.sdk.widgets.WidgetHiddenChangedSceneObserver
            public final void onHiddenChanged(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, boolean z) {
                C1083020eI0 c1083020eI0 = this.LIZ;
                c1083020eI0.LLILLL = !z;
                c1083020eI0.LIZ(constraintProperty);
            }
        });
        addSceneObserver(new WidgetHiddenChangedSceneObserver() { // from class: X.0eI3
            {
                super(R.id.ukr);
            }

            @Override // com.bytedance.ies.sdk.widgets.WidgetHiddenChangedSceneObserver
            public final void onHiddenChanged(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, boolean z) {
                C1083020eI0 c1083020eI0 = this.LIZ;
                c1083020eI0.LLILZ = !z;
                c1083020eI0.LIZ(constraintProperty);
            }
        });
        addSceneObserver(new WidgetHiddenChangedSceneObserver() { // from class: X.0eI4
            {
                super(R.id.sup);
            }

            @Override // com.bytedance.ies.sdk.widgets.WidgetHiddenChangedSceneObserver
            public final void onHiddenChanged(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, boolean z) {
                C1083020eI0 c1083020eI0 = this.LIZ;
                c1083020eI0.LLILZIL = !z;
                c1083020eI0.LIZ(constraintProperty);
            }
        });
        addSceneObserver(new WidgetHiddenChangedSceneObserver() { // from class: X.0eI5
            {
                super(R.id.n20);
            }

            @Override // com.bytedance.ies.sdk.widgets.WidgetHiddenChangedSceneObserver
            public final void onHiddenChanged(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, boolean z) {
                C1083020eI0 c1083020eI0 = this.LIZ;
                c1083020eI0.LLILZLL = !z;
                c1083020eI0.LIZ(constraintProperty);
            }
        });
    }

    public final void LIZ(ConstraintProperty constraintProperty) {
        int i = 0;
        if ((this.LLILLJJLI || this.LLILLL || this.LLILZ || this.LLILZIL || this.LLILZLL) && !this.LLIZ) {
            i = this.LL.LJFF;
        }
        constraintProperty.margin(4, i);
        constraintProperty.apply();
    }
}
