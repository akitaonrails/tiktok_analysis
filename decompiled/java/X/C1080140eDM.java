package X;

import Y.ACListenerS152S0100000_17;
import android.view.View;
import com.bytedance.android.livesdk.dataChannel.ProgrammedPinnedAvoidEvent;
import com.bytedance.android.livesdk.revenue.StarCommentPinnedAvoidEvent;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.ElementSpecImpl;
import com.bytedance.ies.sdk.widgets.ElementSpecImplKt;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.bytedance.ies.sdk.widgets.MultiElementSpecImpl;
import com.bytedance.ies.sdk.widgets.MultiElementSpecImplKt;
import com.bytedance.ies.sdk.widgets.RxBusSceneObserver;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: renamed from: X.0eDM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1080140eDM extends MultiElementSpecImpl<C1080140eDM> {
    public final View LIZ;

    public C1080140eDM(AbstractC1080560eE2 abstractC1080560eE2) {
        super(abstractC1080560eE2);
        View viewFindViewById = abstractC1080560eE2.getContainer().findViewById(R.id.kwg);
        C786410Ut5.LJLLLLLL(8, viewFindViewById);
        C786410Ut5.I7(new ACListenerS152S0100000_17(abstractC1080560eE2, 182), viewFindViewById);
        this.LIZ = viewFindViewById;
        MultiElementSpecImplKt.element(this, new ElementSpecImpl() { // from class: X.0eDQ
            {
                int i = C1079590eCT.LIZJ;
                addSceneObserver(new RxBusSceneObserver<C1085120eLO>() { // from class: X.0eDP
                    @Override // com.bytedance.ies.sdk.widgets.RxBusSceneObserver
                    public final Class<C1085120eLO> getType() {
                        return C1085120eLO.class;
                    }

                    @Override // com.bytedance.ies.sdk.widgets.SceneObserver
                    public final void dispose(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty) {
                        super.dispose(layeredElementContext, constraintProperty);
                        constraintProperty.visibility(8);
                    }

                    @Override // com.bytedance.ies.sdk.widgets.RxBusSceneObserver
                    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C1085120eLO c1085120eLO) {
                        if (c1085120eLO.LIZIZ) {
                            constraintProperty.visibility(8);
                        } else {
                            constraintProperty.visibility(0);
                        }
                    }
                });
            }
        });
        MultiElementSpecImplKt.element(this, new C1080990eEj(abstractC1080560eE2));
        MultiElementSpecImplKt.element(this, new C1079290eBz(abstractC1080560eE2));
        ElementSpecImpl elementSpecImpl = new ElementSpecImpl(C1079590eCT.LJIIIIZZ);
        final C118300cf c118300cf = new C118300cf();
        ElementSpecImplKt.onAttach(elementSpecImpl, new AwS596S0100000_17(c118300cf, 680));
        elementSpecImpl.addSceneObserver(new DataChannelSceneObserver<Boolean, StarCommentPinnedAvoidEvent>() { // from class: X.0eDN
            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final Class<StarCommentPinnedAvoidEvent> getType() {
                return StarCommentPinnedAvoidEvent.class;
            }

            {
                super(true);
            }

            @Override // com.bytedance.ies.sdk.widgets.SceneObserver
            public final void dispose(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty) {
                super.dispose(layeredElementContext, constraintProperty);
                constraintProperty.visibility(0);
            }

            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Boolean bool) {
                int i;
                int i2;
                boolean zBooleanValue = bool.booleanValue();
                C118300cf c118300cf2 = c118300cf;
                if (zBooleanValue) {
                    i = c118300cf2.element | 1;
                } else {
                    i = c118300cf2.element & (-2);
                }
                c118300cf2.element = i;
                if (i != 0) {
                    i2 = 8;
                } else {
                    i2 = 0;
                }
                constraintProperty.visibility(i2);
            }
        });
        elementSpecImpl.addSceneObserver(new DataChannelSceneObserver<Boolean, ProgrammedPinnedAvoidEvent>() { // from class: X.0eDO
            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final Class<ProgrammedPinnedAvoidEvent> getType() {
                return ProgrammedPinnedAvoidEvent.class;
            }

            {
                super(true);
            }

            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Boolean bool) {
                int i;
                int i2;
                boolean zBooleanValue = bool.booleanValue();
                C118300cf c118300cf2 = c118300cf;
                if (zBooleanValue) {
                    i = c118300cf2.element | 2;
                } else {
                    i = c118300cf2.element & (-3);
                }
                c118300cf2.element = i;
                if (i != 0) {
                    i2 = 8;
                } else {
                    i2 = 0;
                }
                constraintProperty.visibility(i2);
            }
        });
        registerElement(elementSpecImpl);
    }
}
