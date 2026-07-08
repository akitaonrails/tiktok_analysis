package X;

import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.live.liveinteract.api.event.MatchGiftTrayStateEvent;
import com.bytedance.android.live.room.VideoOrientationChangeChannel;
import com.bytedance.android.livesdk.dataChannel.LivePlayContainerViewHeightChangedEvent;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.ElementSpecImpl;
import com.bytedance.ies.sdk.widgets.ElementSpecImplKt;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: renamed from: X.0eGr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1082310eGr extends ElementSpecImpl {
    public final C1082280eGo LL;

    public final void LIZ(ConstraintProperty constraintProperty) {
        constraintProperty.removeConstraints(4);
        constraintProperty.removeConstraints(3);
        C1082280eGo c1082280eGo = this.LL;
        if (c1082280eGo.LJII) {
            constraintProperty.connect(3, 0, 3, c1082280eGo.LJIIJJI);
        } else {
            constraintProperty.connect(4, 0, 4, 0);
        }
        constraintProperty.apply();
    }

    public C1082310eGr(AbstractC1080560eE2 abstractC1080560eE2, final C1082380eGy c1082380eGy) {
        super(R.id.video_bottom_guideline);
        this.LL = new C1082280eGo(abstractC1080560eE2);
        addSceneObserver(new DataChannelSceneObserver<C0IMR, VideoOrientationChangeChannel>() { // from class: X.0eGq
            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final Class<VideoOrientationChangeChannel> getType() {
                return VideoOrientationChangeChannel.class;
            }

            {
                super(true);
            }

            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C0IMR c0imr) {
                this.LIZ.LL.LIZJ(c0imr);
                this.LIZ.LIZ(constraintProperty);
            }
        });
        addSceneObserver(new DataChannelSceneObserver<Integer, LivePlayContainerViewHeightChangedEvent>() { // from class: X.0eGs
            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final Class<LivePlayContainerViewHeightChangedEvent> getType() {
                return LivePlayContainerViewHeightChangedEvent.class;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(true);
            }

            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Integer num) {
                num.intValue();
                C1082310eGr c1082310eGr = this.LIZ;
                C1082280eGo c1082280eGo = c1082310eGr.LL;
                C956380azk c956380azk = c1082280eGo.LJI;
                if (c956380azk != null) {
                    c1082380eGy.getClass();
                    c1082280eGo.LIZ(c956380azk, false, C1082380eGy.LIZ(), false, 0);
                    c1082310eGr.LIZ(constraintProperty);
                }
            }
        });
        addSceneObserver(new DataChannelSceneObserver<C956380azk, LinkCrossRoomStateChangeEvent>() { // from class: X.0eGt
            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final Class<LinkCrossRoomStateChangeEvent> getType() {
                return LinkCrossRoomStateChangeEvent.class;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(true);
            }

            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C956380azk c956380azk) {
                C1082280eGo c1082280eGo = this.LIZ.LL;
                c1082380eGy.getClass();
                c1082280eGo.LIZ(c956380azk, false, C1082380eGy.LIZ(), false, 0);
                this.LIZ.LIZ(constraintProperty);
            }
        });
        addSceneObserver(new DataChannelSceneObserver<C985920blO, MatchGiftTrayStateEvent>() { // from class: X.0eGu
            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final Class<MatchGiftTrayStateEvent> getType() {
                return MatchGiftTrayStateEvent.class;
            }

            {
                super(true);
            }

            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C985920blO c985920blO) {
                C1082310eGr c1082310eGr;
                C1082280eGo c1082280eGo;
                C956380azk c956380azk;
                if (c985920blO.LIZ == EnumC985900blM.END && (c956380azk = (c1082280eGo = (c1082310eGr = this.LIZ).LL).LJI) != null) {
                    c1082280eGo.LIZ(c956380azk, true, true, false, 0);
                    c1082310eGr.LIZ(constraintProperty);
                }
            }
        });
        ElementSpecImplKt.onAttach(this, new AwS596S0100000_17(this, 645));
    }
}
