package X;

import Y.ALAdapterS12S0200000_17;
import Y.AUListenerS266S0100000_17;
import com.bytedance.android.live.setting.LiveCommentPushCardJumpFixSetting;
import com.bytedance.android.livesdk.dataChannel.InputDialogShowingChannel;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.ElementSpecImplKt;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.bytedance.ies.sdk.widgets.WidgetHiddenChangedSceneObserver;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: renamed from: X.0eES, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1080820eES extends C1080860eEW {
    public int LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public boolean LLILZLL;

    public C1080820eES(AbstractC1080560eE2 abstractC1080560eE2) {
        super(abstractC1080560eE2);
        this.LLILZ = 2;
        this.LLILZIL = 4;
        addSceneObserver(new DataChannelSceneObserver<Boolean, InputDialogShowingChannel>() { // from class: X.0eEV
            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final Class<InputDialogShowingChannel> getType() {
                return InputDialogShowingChannel.class;
            }

            {
                super(true);
            }

            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Boolean bool) {
                this.LIZ.LLILZLL = bool.booleanValue();
            }
        });
        addSceneObserver(new WidgetHiddenChangedSceneObserver() { // from class: X.0eET
            {
                super(R.id.ik5);
            }

            @Override // com.bytedance.ies.sdk.widgets.WidgetHiddenChangedSceneObserver
            public final void onHiddenChanged(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, boolean z) {
                if (z) {
                    C1080820eES c1080820eES = this.LIZ;
                    c1080820eES.LIZIZ(c1080820eES.LLILZ);
                } else {
                    C1080820eES c1080820eES2 = this.LIZ;
                    c1080820eES2.LLILLL |= c1080820eES2.LLILZ;
                    c1080820eES2.LIZ().cancel();
                }
            }
        });
        addSceneObserver(new WidgetHiddenChangedSceneObserver() { // from class: X.0eEU
            {
                super(R.id.iq0);
            }

            @Override // com.bytedance.ies.sdk.widgets.WidgetHiddenChangedSceneObserver
            public final void onHiddenChanged(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, boolean z) {
                if (z) {
                    C1080820eES c1080820eES = this.LIZ;
                    c1080820eES.LIZIZ(c1080820eES.LLILZIL);
                } else {
                    C1080820eES c1080820eES2 = this.LIZ;
                    c1080820eES2.LLILLL |= c1080820eES2.LLILZIL;
                    c1080820eES2.LIZ().cancel();
                }
            }
        });
        ElementSpecImplKt.onAttach(this, new AwS596S0100000_17(this, 537));
    }

    public final void LIZIZ(int i) {
        ConstraintProperty constraintPropertyById;
        ConstraintProperty constraintPropertyById2;
        int i2 = (~i) & this.LLILLL;
        this.LLILLL = i2;
        if (i2 == 0 && (constraintPropertyById = this.LL.getConstraintPropertyById(R.id.kw9)) != null && (constraintPropertyById2 = this.LL.getConstraintPropertyById(R.id.cci)) != null && constraintPropertyById.getView().getBottom() > 0) {
            if (LiveCommentPushCardJumpFixSetting.INSTANCE.getValue() && this.LLILZLL) {
                LIZ().cancel();
                constraintPropertyById.removeConstraints(4);
                constraintPropertyById.connect(4, R.id.kwc, 3, this.LL.LIZLLL);
                constraintPropertyById.apply();
                return;
            }
            int bottom = constraintPropertyById2.getView().getBottom() - constraintPropertyById.getView().getBottom();
            int i3 = this.LL.LIZLLL;
            LIZ().cancel();
            LIZ().removeAllUpdateListeners();
            LIZ().removeAllListeners();
            LIZ().setIntValues(bottom, i3);
            constraintPropertyById.removeConstraints(4);
            constraintPropertyById.connect(4, R.id.cci, 3, bottom);
            constraintPropertyById.apply();
            LIZ().addUpdateListener(new AUListenerS266S0100000_17(constraintPropertyById, 127));
            LIZ().addListener(new ALAdapterS12S0200000_17(constraintPropertyById, this, 35));
            LIZ().start();
        }
    }
}
