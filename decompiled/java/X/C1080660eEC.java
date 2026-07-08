package X;

import Y.ALAdapterS12S0200000_17;
import Y.ALAdapterS13S0100000_17;
import Y.AUListenerS266S0100000_17;
import android.animation.ValueAnimator;
import com.bytedance.android.livesdk.dataChannel.CommentOrMessageData;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.ElementSpecImpl;
import com.bytedance.ies.sdk.widgets.ElementSpecImplKt;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.bytedance.ies.sdk.widgets.RxBusSceneObserver;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS254S0000000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0eEC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1080660eEC extends ElementSpecImpl {
    public final C1080530eDz LL;
    public ValueAnimator LLILLJJLI;

    public C1080660eEC(C1080530eDz c1080530eDz) {
        super(R.id.kwe);
        this.LL = c1080530eDz;
        ElementSpecImplKt.onAttach(this, AFwS254S0000000_17.get$arr$(129));
        addSceneObserver(new RxBusSceneObserver<C473120Igw>() { // from class: X.0eE8
            public Boolean LIZ;

            @Override // com.bytedance.ies.sdk.widgets.RxBusSceneObserver
            public final Class<C473120Igw> getType() {
                return C473120Igw.class;
            }

            @Override // com.bytedance.ies.sdk.widgets.SceneObserver
            public final void dispose(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty) {
                super.dispose(layeredElementContext, constraintProperty);
                ValueAnimator valueAnimator = this.LIZIZ.LLILLJJLI;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                this.LIZIZ.getClass();
                constraintProperty.margin(7, this.LIZIZ.LL.LJIIL);
                constraintProperty.apply();
                this.LIZ = null;
            }

            @Override // com.bytedance.ies.sdk.widgets.RxBusSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C473120Igw c473120Igw) {
                C473120Igw c473120Igw2 = c473120Igw;
                if (C1080800eEQ.LIZIZ(layeredElementContext.getDataChannel()) && c473120Igw2.LIZIZ == 1) {
                    boolean z = c473120Igw2.LIZ.get(1, false);
                    boolean z2 = !z;
                    if (!Intrinsics.LJFF(this.LIZ, Boolean.valueOf(z2))) {
                        this.LIZ = Boolean.valueOf(z2);
                        C1080660eEC c1080660eEC = this.LIZIZ;
                        if (c1080660eEC.LLILLJJLI == null) {
                            ValueAnimator valueAnimator = new ValueAnimator();
                            valueAnimator.setDuration(200L);
                            valueAnimator.addUpdateListener(new AUListenerS266S0100000_17(constraintProperty, 63));
                            c1080660eEC.LLILLJJLI = valueAnimator;
                        }
                        ValueAnimator valueAnimator2 = this.LIZIZ.LLILLJJLI;
                        if (valueAnimator2 != null) {
                            valueAnimator2.cancel();
                            valueAnimator2.removeAllListeners();
                            if (!z) {
                                valueAnimator2.setIntValues(constraintProperty.margin(7), ((C1080530eDz) layeredElementContext).LJIIL);
                                valueAnimator2.addListener(new ALAdapterS12S0200000_17(constraintProperty, layeredElementContext, 16));
                            } else {
                                valueAnimator2.setIntValues(constraintProperty.margin(7), 0);
                                valueAnimator2.addListener(new ALAdapterS13S0100000_17(constraintProperty, 43));
                            }
                            valueAnimator2.start();
                        }
                        C784440Upu.LIZ().LIZIZ(new C463520IFq(z2, true));
                    }
                }
            }
        });
        addSceneObserver(new DataChannelSceneObserver<Boolean, CommentOrMessageData>() { // from class: X.0eE9
            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final Class<CommentOrMessageData> getType() {
                return CommentOrMessageData.class;
            }

            {
                super(true);
            }

            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Boolean bool) {
                bool.booleanValue();
                if (C1080800eEQ.LIZIZ(this.LIZ.LL.getDataChannel())) {
                    boolean z = !C1080800eEQ.LIZ();
                    if (z) {
                        constraintProperty.margin(7, this.LIZ.LL.LJIIL);
                        constraintProperty.apply();
                    } else {
                        constraintProperty.margin(7, 0);
                        constraintProperty.apply();
                    }
                    C784440Upu.LIZ().LIZIZ(new C463520IFq(z, false));
                }
            }
        });
    }
}
