package X;

import android.animation.ValueAnimator;
import com.bytedance.android.livesdk.dataChannel.GiftTrayHeightChangeChannel;
import com.bytedance.android.livesdk.dataChannel.GiftTrayPositionChangeEvent;
import com.bytedance.android.livesdk.dataChannel.PublicScreenHeightInsufficient;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveMultiGuestGiftTrayOptSetting;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.ElementSpecImpl;
import com.bytedance.ies.sdk.widgets.ElementSpecImplKt;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: renamed from: X.0eFw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1081740eFw extends ElementSpecImpl {
    public final AbstractC1080560eE2 LL;
    public ConstraintProperty LLILLJJLI;
    public boolean LLILLL;
    public int LLILZ;
    public final C01GW LLILZIL;

    public C1081740eFw(AbstractC1080560eE2 abstractC1080560eE2) {
        super(R.id.j0x);
        this.LL = abstractC1080560eE2;
        this.LLILZIL = C452501pT.LIZIZ(new AwS561S0100000_17(this, 586));
        addSceneObserver(new DataChannelSceneObserver<C1081780eG0, GiftTrayHeightChangeChannel>() { // from class: X.0eFx
            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final Class<GiftTrayHeightChangeChannel> getType() {
                return GiftTrayHeightChangeChannel.class;
            }

            {
                super(true);
            }

            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C1081780eG0 c1081780eG0) {
                Number numberValueOf;
                int i;
                C1081780eG0 c1081780eG02 = c1081780eG0;
                C1081740eFw c1081740eFw = this.LIZ;
                int i2 = 0;
                if (c1081740eFw.LLILLL) {
                    if (c1081780eG02.LIZIZ == 4) {
                        float f = c1081780eG02.LIZ;
                        if (f > 0.0f) {
                            float f2 = C1082470eH7.LIZ;
                            if (C1082470eH7.LIZLLL(c1081740eFw.LL.getDataChannel())) {
                                i = 0;
                            } else {
                                i = this.LIZ.LL.LJFF;
                            }
                            numberValueOf = Float.valueOf(f + i);
                        } else {
                            numberValueOf = 0;
                        }
                    } else {
                        numberValueOf = Float.valueOf(c1081780eG02.LIZ);
                    }
                    int iIntValue = numberValueOf.intValue();
                    C1081740eFw c1081740eFw2 = this.LIZ;
                    int i3 = c1081740eFw2.LLILZ;
                    int i4 = c1081740eFw2.LL.LJFF + iIntValue;
                    if (i3 != i4) {
                        if (iIntValue > 0) {
                            i2 = i4;
                        }
                        c1081740eFw2.LLILZ = i2;
                        c1081740eFw2.LIZ(constraintProperty);
                        return;
                    }
                    return;
                }
                c1081740eFw.LLILZ = 0;
                c1081740eFw.LIZ(constraintProperty);
            }
        });
        addSceneObserver(new DataChannelSceneObserver<Boolean, GiftTrayPositionChangeEvent>() { // from class: X.0eFy
            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final Class<GiftTrayPositionChangeEvent> getType() {
                return GiftTrayPositionChangeEvent.class;
            }

            {
                super(true);
            }

            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Boolean bool) {
                boolean zBooleanValue = bool.booleanValue();
                if (LiveMultiGuestGiftTrayOptSetting.INSTANCE.isSmallTrayOnPublicScreen() && C500260Jjc.LJJIJIIJIL((Boolean) layeredElementContext.getDataChannel().gg0(PublicScreenHeightInsufficient.class))) {
                    C1081740eFw c1081740eFw = this.LIZ;
                    c1081740eFw.LLILZ = 0;
                    c1081740eFw.LLILLL = zBooleanValue;
                    constraintProperty.margin(3, 0);
                    constraintProperty.apply();
                }
            }
        });
        ElementSpecImplKt.onAttach(this, new AwS596S0100000_17(this, 647));
    }

    public final void LIZ(ConstraintProperty constraintProperty) {
        int iMargin = constraintProperty.margin(3);
        ((ValueAnimator) this.LLILZIL.getValue()).cancel();
        ValueAnimator valueAnimator = (ValueAnimator) this.LLILZIL.getValue();
        valueAnimator.setIntValues(iMargin, this.LLILZ);
        valueAnimator.start();
    }
}
