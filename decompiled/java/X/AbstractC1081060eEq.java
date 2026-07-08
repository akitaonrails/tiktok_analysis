package X;

import Y.AUListenerS266S0100000_17;
import android.animation.ValueAnimator;
import android.view.View;
import com.bytedance.android.live.setting.LiveExtendedScreenUiOptimizeSetting;
import com.bytedance.android.livesdk.dataChannel.HideTitleLayoutEvent;
import com.bytedance.android.livesdk.dataChannel.HideTopThirdViewEvent;
import com.bytedance.android.livesdk.dataChannel.LimitRoomVisibilityData;
import com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenAlpha;
import com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenStatus;
import com.bytedance.android.livesdk.dataChannel.LiveSplashShopScreenAlpha;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.ElementSpecImpl;
import com.bytedance.ies.sdk.widgets.ElementSpecImplKt;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.bytedance.ies.sdk.widgets.MultiElementSpecImplKt;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS254S0000000_17;

/* JADX INFO: renamed from: X.0eEq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1081060eEq extends C1080140eDM {
    public AbstractC1081060eEq(final AbstractC1080560eE2 abstractC1080560eE2) {
        super(abstractC1080560eE2);
        MultiElementSpecImplKt.element(this, new ElementSpecImpl() { // from class: X.0eF2
            {
                int i = C1079430eCD.LIZ;
                addSceneObserver(new DataChannelSceneObserver<Float, LiveExtendedScreenAlpha>() { // from class: X.0eF3
                    public boolean LIZ;

                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final Class<LiveExtendedScreenAlpha> getType() {
                        return LiveExtendedScreenAlpha.class;
                    }

                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Float f) throws Throwable {
                        float fFloatValue = f.floatValue();
                        if (fFloatValue == 1.0f) {
                            this.LIZ = false;
                            constraintProperty.forceHasOverlappingRenderingCompat(true);
                        }
                        if (fFloatValue < constraintProperty.alpha() && !this.LIZ) {
                            this.LIZ = true;
                            constraintProperty.forceHasOverlappingRenderingCompat(false);
                        }
                        constraintProperty.alpha(fFloatValue);
                    }
                });
                addSceneObserver(new DataChannelSceneObserver<EnumC1083260eIO, LiveExtendedScreenStatus>() { // from class: X.0eF1
                    public boolean LIZ;

                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final Class<LiveExtendedScreenStatus> getType() {
                        return LiveExtendedScreenStatus.class;
                    }

                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, EnumC1083260eIO enumC1083260eIO) {
                        int i2 = C1081210eF5.LIZ[enumC1083260eIO.ordinal()];
                        if (i2 != 1) {
                            if (i2 == 2 && !this.LIZ) {
                                this.LIZ = true;
                                layeredElementContext.upElement(R.id.mue);
                                LiveExtendedScreenUiOptimizeSetting liveExtendedScreenUiOptimizeSetting = LiveExtendedScreenUiOptimizeSetting.INSTANCE;
                                if (!liveExtendedScreenUiOptimizeSetting.hideFirstRow(layeredElementContext.getDataChannel()) || C500260Jjc.LJJIZ(layeredElementContext.getDataChannel())) {
                                    layeredElementContext.upElement(R.id.mo8);
                                    layeredElementContext.upElement(R.id.user_info_container);
                                    layeredElementContext.upElement(R.id.ba7);
                                }
                                layeredElementContext.upElement(R.id.n4a);
                                layeredElementContext.upElement(R.id.ye6);
                                layeredElementContext.upElement(R.id.video_animate_container);
                                if (!liveExtendedScreenUiOptimizeSetting.hideSecondRow(layeredElementContext.getDataChannel()) || C500260Jjc.LJJIZ(layeredElementContext.getDataChannel())) {
                                    layeredElementContext.downElement(R.id.j2h);
                                    layeredElementContext.upElement(R.id.sqk);
                                    layeredElementContext.upElement(R.id.sql);
                                    layeredElementContext.upElement(R.id.p4x);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        if (!this.LIZ) {
                            return;
                        }
                        layeredElementContext.downElement(R.id.video_animate_container);
                        LiveExtendedScreenUiOptimizeSetting liveExtendedScreenUiOptimizeSetting2 = LiveExtendedScreenUiOptimizeSetting.INSTANCE;
                        if (!liveExtendedScreenUiOptimizeSetting2.hideFirstRow(layeredElementContext.getDataChannel())) {
                            layeredElementContext.downElement(R.id.mo8);
                            layeredElementContext.downElement(R.id.ba7);
                            layeredElementContext.downElement(R.id.user_info_container);
                        }
                        layeredElementContext.downElement(R.id.n4a);
                        layeredElementContext.downElement(R.id.ye6);
                        if (!liveExtendedScreenUiOptimizeSetting2.hideSecondRow(layeredElementContext.getDataChannel())) {
                            layeredElementContext.downElement(R.id.j2h);
                            layeredElementContext.downElement(R.id.sqk);
                            layeredElementContext.downElement(R.id.sql);
                            layeredElementContext.downElement(R.id.p4x);
                        }
                        layeredElementContext.downElement(R.id.mue);
                        this.LIZ = false;
                    }
                });
            }
        });
        MultiElementSpecImplKt.element(this, new ElementSpecImpl() { // from class: X.0eF8
            {
                int i = C1079430eCD.LIZIZ;
                addSceneObserver(new DataChannelSceneObserver<Float, LiveExtendedScreenAlpha>() { // from class: X.0eF4
                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final Class<LiveExtendedScreenAlpha> getType() {
                        return LiveExtendedScreenAlpha.class;
                    }

                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Float f) {
                        float fFloatValue = f.floatValue();
                        if (!LiveExtendedScreenUiOptimizeSetting.INSTANCE.hideSecondRow(layeredElementContext.getDataChannel())) {
                            if (fFloatValue < 1.0f) {
                                constraintProperty.visibility(0);
                            } else {
                                constraintProperty.visibility(8);
                            }
                            constraintProperty.alpha(1 - fFloatValue);
                        }
                    }
                });
                ElementSpecImplKt.onAttach(this, AFwS254S0000000_17.get$arr$(441));
            }
        });
        MultiElementSpecImplKt.element(this, new ElementSpecImpl() { // from class: X.0eEw
            {
                int i = C1079430eCD.LIZJ;
                addSceneObserver(new DataChannelSceneObserver<Float, LiveSplashShopScreenAlpha>() { // from class: X.0eEr
                    public boolean LIZ;

                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final Class<LiveSplashShopScreenAlpha> getType() {
                        return LiveSplashShopScreenAlpha.class;
                    }

                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Float f) throws Throwable {
                        float fFloatValue = f.floatValue();
                        if (fFloatValue == 1.0f) {
                            this.LIZ = false;
                            constraintProperty.forceHasOverlappingRenderingCompat(true);
                        }
                        if (fFloatValue < constraintProperty.alpha() && !this.LIZ) {
                            this.LIZ = true;
                            constraintProperty.forceHasOverlappingRenderingCompat(false);
                        }
                        constraintProperty.alpha(fFloatValue);
                    }
                });
            }
        });
        MultiElementSpecImplKt.element(this, new ElementSpecImpl() { // from class: X.0eEx
            {
                int i = C1079430eCD.LJFF;
                addSceneObserver(new DataChannelSceneObserver<EnumC1083260eIO, LiveExtendedScreenStatus>() { // from class: X.0eEy
                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final Class<LiveExtendedScreenStatus> getType() {
                        return LiveExtendedScreenStatus.class;
                    }

                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, EnumC1083260eIO enumC1083260eIO) {
                        int i2 = C1081220eF6.LIZ[enumC1083260eIO.ordinal()];
                        if (i2 != 1) {
                            if (i2 == 2) {
                                constraintProperty.visibility(8);
                                return;
                            }
                            return;
                        }
                        constraintProperty.visibility(0);
                    }
                });
            }
        });
        MultiElementSpecImplKt.element(this, new ElementSpecImpl() { // from class: X.0eEz
            {
                int i = C1079430eCD.LJII;
                addSceneObserver(new DataChannelSceneObserver<EnumC1083260eIO, LiveExtendedScreenStatus>() { // from class: X.0eF0
                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final Class<LiveExtendedScreenStatus> getType() {
                        return LiveExtendedScreenStatus.class;
                    }

                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, EnumC1083260eIO enumC1083260eIO) {
                        int i2 = C1081230eF7.LIZ[enumC1083260eIO.ordinal()];
                        if (i2 != 1) {
                            if (i2 == 2) {
                                constraintProperty.visibility(8);
                                return;
                            }
                            return;
                        }
                        constraintProperty.visibility(0);
                    }
                });
            }
        });
        MultiElementSpecImplKt.element(this, new C1080060eDE(abstractC1080560eE2, this.LIZ));
        MultiElementSpecImplKt.element(this, new ElementSpecImpl(abstractC1080560eE2) { // from class: X.0eEo
            {
                super(C1079430eCD.LJ);
                addSceneObserver(new DataChannelSceneObserver<C1081050eEp, HideTitleLayoutEvent>(abstractC1080560eE2) { // from class: X.0eEn
                    public final View LIZ;
                    public ValueAnimator LIZIZ;
                    public boolean LIZJ;

                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final Class<HideTitleLayoutEvent> getType() {
                        return HideTitleLayoutEvent.class;
                    }

                    {
                        super(true);
                        this.LIZ = abstractC1080560eE2.getContainer().findViewById(R.id.w6g);
                    }

                    @Override // com.bytedance.ies.sdk.widgets.SceneObserver
                    public final void dispose(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty) {
                        super.dispose(layeredElementContext, constraintProperty);
                        ValueAnimator valueAnimator = this.LIZIZ;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        this.LIZJ = false;
                        C786410Ut5.LJLLLLLL(8, this.LIZ);
                        constraintProperty.alpha(1.0f);
                    }

                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C1081050eEp c1081050eEp) {
                        int i;
                        C1081050eEp c1081050eEp2 = c1081050eEp;
                        boolean z = this.LIZJ;
                        boolean z2 = c1081050eEp2.LIZ;
                        if (z != z2) {
                            this.LIZJ = z2;
                            if (this.LIZIZ == null) {
                                ValueAnimator valueAnimator = new ValueAnimator();
                                valueAnimator.setDuration(layeredElementContext.getAnimationDuration());
                                this.LIZIZ = valueAnimator;
                            }
                            ValueAnimator valueAnimator2 = this.LIZIZ;
                            if (valueAnimator2 != null) {
                                valueAnimator2.cancel();
                            }
                            ValueAnimator valueAnimator3 = this.LIZIZ;
                            if (valueAnimator3 != null) {
                                valueAnimator3.removeAllUpdateListeners();
                            }
                            int i2 = C1081350eFJ.LIZ[c1081050eEp2.LIZIZ.ordinal()];
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    if (i2 != 3) {
                                        if (i2 != 4) {
                                            if (i2 == 5) {
                                                i = R.id.mu6;
                                            } else {
                                                throw new C1954807lC();
                                            }
                                        } else {
                                            i = R.id.n7j;
                                        }
                                    } else {
                                        i = R.id.mxm;
                                    }
                                } else {
                                    i = R.id.n5o;
                                }
                            } else {
                                i = R.id.mw2;
                            }
                            if (c1081050eEp2.LIZ) {
                                ValueAnimator valueAnimator4 = this.LIZIZ;
                                if (valueAnimator4 != null) {
                                    valueAnimator4.setFloatValues(constraintProperty.alpha(), 0.0f);
                                }
                                layeredElementContext.upElement(i);
                            } else {
                                ValueAnimator valueAnimator5 = this.LIZIZ;
                                if (valueAnimator5 != null) {
                                    valueAnimator5.setFloatValues(constraintProperty.alpha(), 1.0f);
                                }
                                layeredElementContext.downElement(i);
                            }
                            ValueAnimator valueAnimator6 = this.LIZIZ;
                            if (valueAnimator6 != null) {
                                valueAnimator6.addUpdateListener(new AUListenerS266S0100000_17(constraintProperty, 122));
                            }
                            ValueAnimator valueAnimator7 = this.LIZIZ;
                            if (valueAnimator7 != null) {
                                valueAnimator7.start();
                            }
                        }
                    }
                });
            }
        });
        MultiElementSpecImplKt.element(this, new ElementSpecImpl() { // from class: X.0eEv
            {
                int i = C1079430eCD.LIZLLL;
                addSceneObserver(new DataChannelSceneObserver<Boolean, HideTopThirdViewEvent>() { // from class: X.0eEt
                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final Class<HideTopThirdViewEvent> getType() {
                        return HideTopThirdViewEvent.class;
                    }

                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Boolean bool) {
                        if (bool.booleanValue()) {
                            constraintProperty.visibility(4);
                        } else {
                            constraintProperty.visibility(0);
                        }
                    }
                });
            }
        });
        MultiElementSpecImplKt.element(this, new ElementSpecImpl() { // from class: X.0eEu
            {
                int i = C1079430eCD.LJI;
                addSceneObserver(new DataChannelSceneObserver<Boolean, LimitRoomVisibilityData>() { // from class: X.0eEs
                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final Class<LimitRoomVisibilityData> getType() {
                        return LimitRoomVisibilityData.class;
                    }

                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Boolean bool) {
                        if (bool.booleanValue()) {
                            constraintProperty.visibility(0);
                        } else {
                            constraintProperty.visibility(8);
                        }
                    }
                });
            }
        });
    }
}
