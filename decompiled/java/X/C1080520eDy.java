package X;

import Y.AUListenerS94S0400000_17;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.KeyEvent;
import com.bytedance.android.live.dynamicstrategy.PublicScreenBackgroundAlphaV2;
import com.bytedance.android.live.setting.LivePublicScreenBgAnimationDurationSetting;
import com.bytedance.android.live.setting.LivePublicScreenBgAnimationSwitchSetting;
import com.bytedance.android.livesdk.dataChannel.PublicScreenVerticalShrinkChannel;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.ElementSpecImplKt;
import com.bytedance.ies.sdk.widgets.GroupableElementSpecImpl;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS383S0200000_17;

/* JADX INFO: renamed from: X.0eDy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1080520eDy extends GroupableElementSpecImpl {
    public boolean LL;
    public float LLILLJJLI;
    public float LLILLL;
    public final long LLILZ;
    public final boolean LLILZIL;
    public Animator LLILZLL;

    public C1080520eDy(AbstractC1080560eE2 abstractC1080560eE2) {
        super(R.id.sfo);
        this.LLILLJJLI = 0.2f;
        this.LLILLL = 0.5f;
        this.LLILZ = LivePublicScreenBgAnimationDurationSetting.INSTANCE.getValidValue();
        boolean value = LivePublicScreenBgAnimationSwitchSetting.INSTANCE.getValue();
        this.LLILZIL = value;
        ElementSpecImplKt.onAttach(this, new AwS383S0200000_17(abstractC1080560eE2, this, 125));
        addSceneObserver(new DataChannelSceneObserver<Boolean, PublicScreenVerticalShrinkChannel>() { // from class: X.0eDx
            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final Class<PublicScreenVerticalShrinkChannel> getType() {
                return PublicScreenVerticalShrinkChannel.class;
            }

            {
                super(true);
            }

            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Boolean bool) {
                this.LIZ.LL = bool.booleanValue();
            }
        });
        if (value) {
            addSceneObserver(new DataChannelSceneObserver<C1080610eE7, PublicScreenBackgroundAlphaV2>() { // from class: X.0eE4
                public static float LIZ(int i) {
                    return ((i >> 24) & 255) / 255.0f;
                }

                @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                public final Class<PublicScreenBackgroundAlphaV2> getType() {
                    return PublicScreenBackgroundAlphaV2.class;
                }

                {
                    super(true);
                }

                @Override // com.bytedance.ies.sdk.widgets.SceneObserver
                public final void dispose(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty) {
                    super.dispose(layeredElementContext, constraintProperty);
                    Animator animator = this.LIZ.LLILZLL;
                    if (animator != null && animator.isRunning()) {
                        animator.cancel();
                    }
                }

                @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C1080610eE7 c1080610eE7) {
                    InterfaceC1080960eEg interfaceC1080960eEg;
                    C1080610eE7 c1080610eE72 = c1080610eE7;
                    if (c1080610eE72.LIZ.length >= 3) {
                        KeyEvent.Callback view = constraintProperty.getView();
                        if ((view instanceof InterfaceC1080960eEg) && (interfaceC1080960eEg = (InterfaceC1080960eEg) view) != null) {
                            C1080520eDy c1080520eDy = this.LIZ;
                            int[] gradientColors = interfaceC1080960eEg.getGradientColors();
                            if (gradientColors != null) {
                                if (gradientColors.length == 2 && LIZ(gradientColors[1]) == c1080610eE72.LIZ[1]) {
                                    return;
                                }
                                if (gradientColors.length == 3 && LIZ(gradientColors[1]) == c1080610eE72.LIZ[1] && LIZ(gradientColors[2]) == c1080610eE72.LIZ[2]) {
                                    return;
                                }
                                ArrayList arrayList = new ArrayList();
                                for (int i : gradientColors) {
                                    arrayList.add(Float.valueOf(LIZ(i)));
                                }
                                List<Float> listLJJZZI = C13LQ.LJJZZI(C13LP.LLI(arrayList));
                                ArrayList arrayList2 = new ArrayList();
                                if (gradientColors.length == 2) {
                                    arrayList2.add(Float.valueOf(LIZ(gradientColors[0])));
                                    arrayList2.add(Float.valueOf(c1080610eE72.LIZ[2]));
                                } else if (gradientColors.length == 3) {
                                    arrayList2.add(Float.valueOf(LIZ(gradientColors[0])));
                                    arrayList2.add(Float.valueOf(c1080610eE72.LIZ[1]));
                                    arrayList2.add(Float.valueOf(c1080610eE72.LIZ[2]));
                                }
                                float[] fArr = c1080610eE72.LIZ;
                                c1080520eDy.LLILLJJLI = fArr[1];
                                c1080520eDy.LLILLL = fArr[2];
                                Animator animator = c1080520eDy.LLILZLL;
                                if (animator != null && animator.isRunning()) {
                                    animator.cancel();
                                }
                                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c1080520eDy.LLILZ);
                                duration.addUpdateListener(new AUListenerS94S0400000_17(arrayList2, this, listLJJZZI, interfaceC1080960eEg, 1));
                                c1080520eDy.LLILZLL = duration;
                                duration.start();
                            }
                        }
                    }
                }
            });
        }
    }
}
