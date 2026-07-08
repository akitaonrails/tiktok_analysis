package X;

import com.bytedance.android.live.dynamicstrategy.TopMaskVisibilityEvent;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.livesdk.dataChannel.FirstFrameChannelEvent;
import com.bytedance.android.livesdk.livesetting.LiveInteractionMaskConfigSetting;
import com.bytedance.android.livesdk.livesetting.LiveTopMaskDefaultShowSetting;
import com.bytedance.android.livesdk.watch.chatroom.portrait.DelayTopMaskForPreviewCardEnter;
import com.bytedance.android.livesdk.watch.chatroom.portrait.TopMaskForceHiddenEvent;
import com.bytedance.android.livesdk.watch.chatroom.portrait.TopMaskShowAfterLayoutVisibleEvent;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.ElementSpecImplKt;
import com.bytedance.ies.sdk.widgets.GroupableElementSpecImpl;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0eBf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1079090eBf extends GroupableElementSpecImpl {
    public final LayeredElementContext LL;
    public int LLILLJJLI;

    @Override // com.bytedance.ies.sdk.widgets.ElementSpecImpl, com.bytedance.ies.sdk.widgets.ElementSpec
    public final void onDispose() {
        ConstraintProperty constraintPropertyById = this.LL.getConstraintPropertyById(R.id.kvx);
        if (constraintPropertyById != null) {
            constraintPropertyById.visibility(0);
        }
    }

    public C1079090eBf(LayeredElementContext layeredElementContext) {
        super(R.id.kvx);
        this.LL = layeredElementContext;
        if (C751980Tee.LIZJ(layeredElementContext.getDataChannel()) == LiveMode.VIDEO) {
            ElementSpecImplKt.onAttach(this, new AwS596S0100000_17(this, 539));
            addSceneObserver(new DataChannelSceneObserver<C0IJ0, TopMaskVisibilityEvent>() { // from class: X.0eBi
                @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                public final Class<TopMaskVisibilityEvent> getType() {
                    return TopMaskVisibilityEvent.class;
                }

                {
                    super(true);
                }

                @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                public final void onEvent(LayeredElementContext layeredElementContext2, ConstraintProperty constraintProperty, C0IJ0 c0ij0) {
                    C0IJ0 c0ij02 = c0ij0;
                    int i = 256;
                    if (c0ij02.LIZ) {
                        C1079090eBf c1079090eBf = this.LIZ;
                        int i2 = C0IJ2.LIZ[c0ij02.LIZIZ.ordinal()];
                        if (i2 != 1) {
                            if (i2 == 2) {
                                i = 1;
                            } else {
                                throw new C1954807lC();
                            }
                        }
                        c1079090eBf.LIZIZ(constraintProperty, i);
                        return;
                    }
                    C1079090eBf c1079090eBf2 = this.LIZ;
                    int i3 = C0IJ2.LIZ[c0ij02.LIZIZ.ordinal()];
                    if (i3 != 1) {
                        if (i3 == 2) {
                            i = 1;
                        } else {
                            throw new C1954807lC();
                        }
                    }
                    c1079090eBf2.LIZ(constraintProperty, i);
                }
            });
            addSceneObserver(new DataChannelSceneObserver<C956380azk, LinkCrossRoomStateChangeEvent>() { // from class: X.0eBg
                @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                public final Class<LinkCrossRoomStateChangeEvent> getType() {
                    return LinkCrossRoomStateChangeEvent.class;
                }

                {
                    super(true);
                }

                @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                public final void onEvent(LayeredElementContext layeredElementContext2, ConstraintProperty constraintProperty, C956380azk c956380azk) {
                    int i = c956380azk.LIZ;
                    if (i == 1) {
                        this.LIZ.LIZIZ(constraintProperty, 16);
                    } else {
                        if (i != 0) {
                            return;
                        }
                        this.LIZ.LIZ(constraintProperty, 16);
                    }
                }
            });
        }
        if (LiveTopMaskDefaultShowSetting.INSTANCE.enable()) {
            ElementSpecImplKt.onAttach(this, new AwS596S0100000_17(this, 540));
            addSceneObserver(new DataChannelSceneObserver<Boolean, FirstFrameChannelEvent>() { // from class: X.0eBc
                @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                public final Class<FirstFrameChannelEvent> getType() {
                    return FirstFrameChannelEvent.class;
                }

                {
                    super(true);
                }

                @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                public final void onEvent(LayeredElementContext layeredElementContext2, ConstraintProperty constraintProperty, Boolean bool) {
                    boolean zBooleanValue = bool.booleanValue();
                    boolean zLJFF = Intrinsics.LJFF(layeredElementContext2.getDataChannel().gg0(DelayTopMaskForPreviewCardEnter.class), Boolean.TRUE);
                    if (zBooleanValue && !zLJFF && LiveInteractionMaskConfigSetting.INSTANCE.enableMaskShowAfterFirstFrame()) {
                        this.LIZ.LIZIZ(constraintProperty, 65536);
                    }
                }
            });
            addSceneObserver(new DataChannelSceneObserver<Boolean, TopMaskShowAfterLayoutVisibleEvent>() { // from class: X.0eBd
                @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                public final Class<TopMaskShowAfterLayoutVisibleEvent> getType() {
                    return TopMaskShowAfterLayoutVisibleEvent.class;
                }

                {
                    super(true);
                }

                @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                public final void onEvent(LayeredElementContext layeredElementContext2, ConstraintProperty constraintProperty, Boolean bool) {
                    bool.booleanValue();
                    if (Intrinsics.LJFF(layeredElementContext2.getDataChannel().gg0(DelayTopMaskForPreviewCardEnter.class), Boolean.TRUE)) {
                        if (!LiveInteractionMaskConfigSetting.INSTANCE.enablePreviewCardEnterMaskSync()) {
                            return;
                        }
                    } else if (!LiveInteractionMaskConfigSetting.INSTANCE.enableMaskShowAfterFirstFrame()) {
                        return;
                    }
                    this.LIZ.LIZIZ(constraintProperty, 65536);
                }
            });
            addSceneObserver(new DataChannelSceneObserver<Boolean, TopMaskForceHiddenEvent>() { // from class: X.0eBe
                @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                public final Class<TopMaskForceHiddenEvent> getType() {
                    return TopMaskForceHiddenEvent.class;
                }

                {
                    super(true);
                }

                @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                public final void onEvent(LayeredElementContext layeredElementContext2, ConstraintProperty constraintProperty, Boolean bool) {
                    if (bool.booleanValue()) {
                        this.LIZ.LIZ(constraintProperty, 1048576);
                    } else {
                        this.LIZ.LIZIZ(constraintProperty, 1048576);
                    }
                }
            });
        }
    }

    public final void LIZ(ConstraintProperty constraintProperty, int i) {
        this.LLILLJJLI = i | this.LLILLJJLI;
        constraintProperty.visibility(4);
    }

    public final void LIZIZ(ConstraintProperty constraintProperty, int i) {
        int i2 = (~i) & this.LLILLJJLI;
        this.LLILLJJLI = i2;
        if (i2 == 0) {
            constraintProperty.visibility(0);
        }
    }
}
