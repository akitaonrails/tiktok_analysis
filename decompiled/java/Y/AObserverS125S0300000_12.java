package Y;

import X.C0VSP;
import X.C1123980fM4;
import X.C1209950haj;
import X.C1292030jj7;
import X.C1294250jmh;
import X.C1294720jnS;
import X.C1295960jpS;
import X.C1308910kAL;
import X.C1331100kk8;
import X.C1602160rnK;
import X.C19EG;
import X.C2188811AlT;
import X.C259800zU;
import X.C444380Hbg;
import X.C447180HgC;
import X.C470480Icg;
import X.C497740JfY;
import X.C500260Jjc;
import X.C756080TlG;
import X.C756800TmQ;
import X.C770530UKl;
import X.C770580UKq;
import X.C785000Uqo;
import X.C785010Uqp;
import X.C785020Uqq;
import X.C785040Uqs;
import X.C785060Uqu;
import X.C786310Usv;
import X.C786320Usw;
import X.C786410Ut5;
import X.InterfaceC1124060fMC;
import X.InterfaceC447210HgF;
import X.InterfaceC770540UKm;
import X.InterfaceC784990Uqn;
import X.InterfaceC785110Uqz;
import android.animation.Animator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.slot.BottomLeftSlotVisibilityChannel;
import com.bytedance.android.live.slot.BottomLeftSlotWidget;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.live.slot.LiveShopAddPermissionBusinessSetting;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewBaseSlotWidget;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.livesetting.AnchorFixPreviewPromoteShowErrorSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.panel.RecommendFeedFragmentPanel;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.live.slot.SlotsBottomSheetDialog;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.zip.ZipInputStream;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes13.dex */
public class AObserverS125S0300000_12 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
            case 2:
                onChanged$2(this, obj);
                break;
            case 3:
                onChanged$3(this, obj);
                break;
            case 4:
                onChanged$4(this, obj);
                break;
            case 5:
                onChanged$5(this, obj);
                break;
            case 6:
                onChanged$6(this, obj);
                break;
            case 7:
                onChanged$7(this, obj);
                break;
            case 8:
                onChanged$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onChanged$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onChanged$10(this, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onChanged$11(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onChanged$12(this, obj);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onChanged$13(this, obj);
                break;
            case 14:
                onChanged$14(this, obj);
                break;
            case 15:
                onChanged$15(this, obj);
                break;
            case 16:
                onChanged$16(this, obj);
                break;
        }
    }

    public static final void onChanged$0(AObserverS125S0300000_12 aObserverS125S0300000_12, Object obj) {
        Boolean bool = (Boolean) obj;
        DataChannel dataChannel = ((BottomLeftSlotWidget) aObserverS125S0300000_12.l2).dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(BottomLeftSlotVisibilityChannel.class, bool);
        }
        Boolean bool2 = Boolean.TRUE;
        String strLIZ = "";
        if (bool2.equals(((IIconSlot.SlotViewModel) aObserverS125S0300000_12.l0).LL.getValue())) {
            ((BottomLeftSlotWidget) aObserverS125S0300000_12.l2).z1(((C1123980fM4) aObserverS125S0300000_12.l1).LIZIZ, bool.booleanValue());
            if (bool2.equals(bool)) {
                ((C1123980fM4) aObserverS125S0300000_12.l1).LIZIZ.onExposure("during_live");
            }
            if (bool2.equals(bool)) {
                strLIZ = ((C1123980fM4) aObserverS125S0300000_12.l1).LIZIZ.LIZ();
            }
            C470480Icg.LIZJ(strLIZ);
            return;
        }
        for (Object obj2 : (PriorityBlockingQueue) ((BottomLeftSlotWidget) aObserverS125S0300000_12.l2).LLJI) {
            IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) ((HashMap) ((BottomLeftSlotWidget) aObserverS125S0300000_12.l2).LLJIJIL).get(obj2);
            if (((C1123980fM4) aObserverS125S0300000_12.l1) != obj2 && Boolean.TRUE.equals(slotViewModel.LL.getValue())) {
                slotViewModel.LL.postValue(Boolean.FALSE);
            }
        }
        MutableLiveData<Boolean> mutableLiveData = ((IIconSlot.SlotViewModel) aObserverS125S0300000_12.l0).LL;
        Boolean bool3 = Boolean.TRUE;
        mutableLiveData.setValue(bool3);
        ((BottomLeftSlotWidget) aObserverS125S0300000_12.l2).z1(((C1123980fM4) aObserverS125S0300000_12.l1).LIZIZ, bool.booleanValue());
        ((BottomLeftSlotWidget) aObserverS125S0300000_12.l2).B1(((C1123980fM4) aObserverS125S0300000_12.l1).LIZIZ, (IIconSlot.SlotViewModel) aObserverS125S0300000_12.l0);
        if (bool3.equals(bool)) {
            ((C1123980fM4) aObserverS125S0300000_12.l1).LIZIZ.onExposure("during_live");
        }
        if (bool3.equals(bool)) {
            strLIZ = ((C1123980fM4) aObserverS125S0300000_12.l1).LIZIZ.LIZ();
        }
        C470480Icg.LIZJ(strLIZ);
    }

    public static final void onChanged$1(AObserverS125S0300000_12 aObserverS125S0300000_12, Object obj) {
        boolean z;
        String strLIZ;
        Boolean bool = (Boolean) obj;
        DataChannel dataChannel = ((BottomLeftSlotWidget) aObserverS125S0300000_12.l2).dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(BottomLeftSlotVisibilityChannel.class, bool);
        }
        Boolean bool2 = Boolean.TRUE;
        if (bool2.equals(((IIconSlot.SlotViewModel) aObserverS125S0300000_12.l0).LL.getValue())) {
            ((BottomLeftSlotWidget) aObserverS125S0300000_12.l2).z1(((C1123980fM4) aObserverS125S0300000_12.l1).LIZIZ, bool.booleanValue());
            if (bool2.equals(bool)) {
                ((C1123980fM4) aObserverS125S0300000_12.l1).LIZIZ.onExposure("during_live");
            }
            if (bool2.equals(bool)) {
                strLIZ = ((C1123980fM4) aObserverS125S0300000_12.l1).LIZIZ.LIZ();
            } else {
                strLIZ = "";
            }
            C470480Icg.LIZJ(strLIZ);
        }
        boolean z2 = true;
        if (bool2.equals(bool) && !bool2.equals(((IIconSlot.SlotViewModel) aObserverS125S0300000_12.l0).LL.getValue())) {
            z = true;
        } else {
            z = false;
        }
        if (!bool2.equals(bool) && bool2.equals(((IIconSlot.SlotViewModel) aObserverS125S0300000_12.l0).LL.getValue())) {
            ((IIconSlot.SlotViewModel) aObserverS125S0300000_12.l0).LL.setValue(Boolean.FALSE);
        } else {
            z2 = false;
        }
        Iterator it2 = ((PriorityBlockingQueue) ((BottomLeftSlotWidget) aObserverS125S0300000_12.l2).LLJI).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C1123980fM4 c1123980fM4 = (C1123980fM4) it2.next();
            IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) ((HashMap) ((BottomLeftSlotWidget) aObserverS125S0300000_12.l2).LLJIJIL).get(c1123980fM4);
            int i = c1123980fM4.LIZ;
            C1123980fM4 c1123980fM42 = (C1123980fM4) aObserverS125S0300000_12.l1;
            if (i <= c1123980fM42.LIZ && c1123980fM42 != c1123980fM4) {
                if (z && Boolean.TRUE.equals(slotViewModel.LL.getValue())) {
                    break;
                }
                if (z2) {
                    Boolean bool3 = Boolean.TRUE;
                    if (!bool3.equals(slotViewModel.LL.getValue()) && bool3.equals(slotViewModel.LLILZ.getValue())) {
                        slotViewModel.LL.setValue(bool3);
                        ((BottomLeftSlotWidget) aObserverS125S0300000_12.l2).A1(((C1123980fM4) aObserverS125S0300000_12.l1).LIZIZ);
                        ((BottomLeftSlotWidget) aObserverS125S0300000_12.l2).B1(c1123980fM4.LIZIZ, slotViewModel);
                        c1123980fM4.LIZIZ.onExposure("during_live");
                        C470480Icg.LIZJ(c1123980fM4.LIZIZ.LIZ());
                        break;
                    }
                } else {
                    continue;
                }
            } else if (c1123980fM42 == c1123980fM4) {
                if (z) {
                    ((IIconSlot.SlotViewModel) aObserverS125S0300000_12.l0).LL.setValue(Boolean.TRUE);
                }
            } else if (z && Boolean.TRUE.equals(((IIconSlot.SlotViewModel) aObserverS125S0300000_12.l0).LL.getValue())) {
                slotViewModel.LL.setValue(Boolean.FALSE);
            } else if (z2) {
                Boolean bool4 = Boolean.TRUE;
                if (!bool4.equals(slotViewModel.LL.getValue()) && bool4.equals(slotViewModel.LLILZ.getValue())) {
                    slotViewModel.LL.setValue(bool4);
                    ((BottomLeftSlotWidget) aObserverS125S0300000_12.l2).A1(((C1123980fM4) aObserverS125S0300000_12.l1).LIZIZ);
                    ((BottomLeftSlotWidget) aObserverS125S0300000_12.l2).B1(c1123980fM4.LIZIZ, slotViewModel);
                    c1123980fM4.LIZIZ.onExposure("during_live");
                    C470480Icg.LIZJ(c1123980fM4.LIZIZ.LIZ());
                    break;
                }
            } else {
                continue;
            }
        }
        if (!z) {
            return;
        }
        if (Boolean.TRUE.equals(((IIconSlot.SlotViewModel) aObserverS125S0300000_12.l0).LL.getValue())) {
            ((BottomLeftSlotWidget) aObserverS125S0300000_12.l2).A1(((C1123980fM4) aObserverS125S0300000_12.l1).LIZIZ);
            ((C1123980fM4) aObserverS125S0300000_12.l1).LIZIZ.onExposure("during_live");
            C470480Icg.LIZJ(((C1123980fM4) aObserverS125S0300000_12.l1).LIZIZ.LIZ());
            ((BottomLeftSlotWidget) aObserverS125S0300000_12.l2).B1(((C1123980fM4) aObserverS125S0300000_12.l1).LIZIZ, (IIconSlot.SlotViewModel) aObserverS125S0300000_12.l0);
        }
    }

    public static final void onChanged$10(AObserverS125S0300000_12 aObserverS125S0300000_12, Object obj) {
        String str;
        Context context;
        IIconSlot iIconSlot;
        Animator.AnimatorListener animatorListenerLIZ;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (((Boolean) ((C785060Uqu) aObserverS125S0300000_12.l0).LLILZIL.getValue()).booleanValue() && !TextUtils.isEmpty(((IIconSlot.SlotViewModel) aObserverS125S0300000_12.l1).LLJLL)) {
            str = ((IIconSlot.SlotViewModel) aObserverS125S0300000_12.l1).LLJLL;
        } else {
            str = ((IIconSlot.SlotViewModel) aObserverS125S0300000_12.l1).LLJLILLLLZIIL;
        }
        if (((Boolean) ((C785060Uqu) aObserverS125S0300000_12.l0).LLILZIL.getValue()).booleanValue()) {
            ((IIconSlot.SlotViewModel) aObserverS125S0300000_12.l1).getClass();
        }
        IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) aObserverS125S0300000_12.l1;
        Integer num = slotViewModel.LLJLLIL;
        boolean z = false;
        if (!Intrinsics.LJFF(slotViewModel.LLILZ.getValue(), Boolean.TRUE) || (TextUtils.isEmpty(str) && num == null)) {
            C1295960jpS c1295960jpS = ((C785060Uqu) aObserverS125S0300000_12.l0).LLJI;
            if (c1295960jpS != null) {
                c1295960jpS.cancelAnimation();
                C786410Ut5.LLD(8, c1295960jpS);
            }
            ImageView imageView = ((C785060Uqu) aObserverS125S0300000_12.l0).LLJ;
            if (imageView != null) {
                C786410Ut5.LJZI(0, imageView);
                return;
            }
            return;
        }
        if (!zBooleanValue) {
            C1295960jpS c1295960jpS2 = ((C785060Uqu) aObserverS125S0300000_12.l0).LLJI;
            if (c1295960jpS2 != null) {
                c1295960jpS2.cancelAnimation();
                C786410Ut5.LLD(8, c1295960jpS2);
            }
            ImageView imageView2 = ((C785060Uqu) aObserverS125S0300000_12.l0).LLJ;
            if (imageView2 == null) {
                return;
            }
            C786410Ut5.LJZI(0, imageView2);
            return;
        }
        C785060Uqu c785060Uqu = (C785060Uqu) aObserverS125S0300000_12.l0;
        C1295960jpS c1295960jpS3 = c785060Uqu.LLJI;
        if (c1295960jpS3 == null) {
            return;
        }
        IIconSlot.SlotViewModel slotViewModel2 = (IIconSlot.SlotViewModel) aObserverS125S0300000_12.l1;
        InterfaceC1124060fMC interfaceC1124060fMC = (InterfaceC1124060fMC) aObserverS125S0300000_12.l2;
        if (c1295960jpS3.isAnimating()) {
            c1295960jpS3.cancelAnimation();
        }
        C786410Ut5.LLD(0, c1295960jpS3);
        if (num != null) {
            c1295960jpS3.setAnimation(num.intValue());
        } else if (!a0.LJJIIZI(str, "http", false) && !a0.LJJIIZI(str, "https", false)) {
            if (a0.LJJIIZI(str, "zip", false)) {
                if (slotViewModel2 != null) {
                    try {
                        String str2 = slotViewModel2.LLJLILLLLZIIL;
                        if (str2 != null) {
                            C1295960jpS c1295960jpS4 = c785060Uqu.LLJI;
                            if (c1295960jpS4 != null) {
                                context = c1295960jpS4.getContext();
                            } else {
                                context = null;
                            }
                            C1292030jj7<C1294720jnS> c1292030jj7LJIILIIL = C1294250jmh.LJIILIIL(context, new ZipInputStream(new C0VSP(str2)), null);
                            c1292030jj7LJIILIIL.LIZIZ(new C786310Usv(c785060Uqu, slotViewModel2, 1));
                            c1292030jj7LJIILIIL.LIZ(new C786320Usw(c785060Uqu, 1));
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1295960jpS c1295960jpS5 = c785060Uqu.LLJI;
                        if (c1295960jpS5 != null) {
                            C786410Ut5.LLD(8, c1295960jpS5);
                        }
                        ImageView imageView3 = c785060Uqu.LLJ;
                        if (imageView3 != null) {
                            C786410Ut5.LJZI(0, imageView3);
                        }
                    }
                }
                z = true;
            } else {
                slotViewModel2.getClass();
                c1295960jpS3.setImageAssetsFolder(null);
                c1295960jpS3.setAnimation(str);
            }
        } else {
            c1295960jpS3.setAnimationFromUrl(str, null);
        }
        c1295960jpS3.removeAllAnimatorListeners();
        c1295960jpS3.removeAllLottieOnCompositionLoadedListener();
        c1295960jpS3.addAnimatorListener(c785060Uqu.LLJJJJ);
        Object objLLILZLL = interfaceC1124060fMC.LLILZLL();
        if ((objLLILZLL instanceof IIconSlot) && (iIconSlot = (IIconSlot) objLLILZLL) != null && (animatorListenerLIZ = iIconSlot.LIZ()) != null) {
            c1295960jpS3.addAnimatorListener(animatorListenerLIZ);
        }
        c1295960jpS3.setFailureListener(new C786310Usv(c1295960jpS3, c785060Uqu, 0));
        if (z) {
            return;
        }
        c1295960jpS3.playAnimation();
    }

    public static final void onChanged$11(AObserverS125S0300000_12 aObserverS125S0300000_12, Object obj) {
        Object objGg0;
        Map<String, Object> dataContainer;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (!C500260Jjc.LJJIJIIJIL(((IIconSlot.SlotViewModel) aObserverS125S0300000_12.l0).LL.getValue())) {
            DataChannel dataChannel = ((PreviewBaseSlotWidget) aObserverS125S0300000_12.l1).dataChannel;
            Map<String, Object> dataContainer2 = null;
            if (dataChannel != null) {
                objGg0 = dataChannel.gg0(LiveModeChannel.class);
            } else {
                objGg0 = null;
            }
            if (C500260Jjc.LJJJI(Boolean.valueOf(zBooleanValue)) && objGg0 == LiveMode.THIRD_PARTY && ((IIconSlot.SlotViewModel) aObserverS125S0300000_12.l0).LLLFFI.booleanValue()) {
                ((PreviewBaseSlotWidget) aObserverS125S0300000_12.l1).hide();
                return;
            }
            if (C500260Jjc.LJJJI(Boolean.valueOf(zBooleanValue))) {
                C770530UKl c770530UKl = ((PreviewBaseSlotWidget) aObserverS125S0300000_12.l1).LLILZIL;
                if (c770530UKl != null) {
                    int visibility = c770530UKl.getVisibility();
                    c770530UKl.setVisibility(0);
                    C1602160rnK.LIZIZ(visibility, 0, c770530UKl);
                }
                ((InterfaceC1124060fMC) aObserverS125S0300000_12.l2).onExposure("before_live");
                HashMap map = new HashMap();
                PreviewBaseSlotWidget previewBaseSlotWidget = (PreviewBaseSlotWidget) aObserverS125S0300000_12.l1;
                if (!previewBaseSlotWidget.LLIZ) {
                    InterfaceC770540UKm interfaceC770540UKm = previewBaseSlotWidget.LLILZ;
                    if (interfaceC770540UKm != null) {
                        dataContainer = interfaceC770540UKm.getDataContainer();
                    } else {
                        dataContainer = null;
                    }
                    long jLIZ = C770580UKq.LIZ("param_live_slot_start_time_long", dataContainer);
                    InterfaceC770540UKm interfaceC770540UKm2 = ((PreviewBaseSlotWidget) aObserverS125S0300000_12.l1).LLILZ;
                    if (interfaceC770540UKm2 != null) {
                        dataContainer2 = interfaceC770540UKm2.getDataContainer();
                    }
                    long jLIZ2 = C770580UKq.LIZ("param_live_slot_api_end_time_long", dataContainer2);
                    if (jLIZ > 0 && jLIZ2 > 0) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(jLIZ2 - jLIZ);
                        sbLIZ.append("");
                        map.put("request_time", C2188811AlT.LIZIZ(sbLIZ));
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(SystemClock.uptimeMillis() - jLIZ);
                        sbLIZ2.append("");
                        map.put("all_time", C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    C770580UKq.LIZLLL((InterfaceC1124060fMC) aObserverS125S0300000_12.l2, map);
                }
                C770580UKq.LIZIZ((InterfaceC1124060fMC) aObserverS125S0300000_12.l2, map);
                PreviewBaseSlotWidget previewBaseSlotWidget2 = (PreviewBaseSlotWidget) aObserverS125S0300000_12.l1;
                previewBaseSlotWidget2.LLIZ = true;
                previewBaseSlotWidget2.show();
                return;
            }
            C770530UKl c770530UKl2 = ((PreviewBaseSlotWidget) aObserverS125S0300000_12.l1).LLILZIL;
            if (c770530UKl2 != null) {
                int visibility2 = c770530UKl2.getVisibility();
                c770530UKl2.setVisibility(8);
                C1602160rnK.LIZIZ(visibility2, 8, c770530UKl2);
            }
            if (AnchorFixPreviewPromoteShowErrorSetting.INSTANCE.enable()) {
                ((PreviewBaseSlotWidget) aObserverS125S0300000_12.l1).hide();
            }
            C770580UKq.LIZIZ((InterfaceC1124060fMC) aObserverS125S0300000_12.l2, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onChanged$12(AObserverS125S0300000_12 aObserverS125S0300000_12, Object obj) {
        ((C259800zU) aObserverS125S0300000_12.l0).element = obj;
        if (obj != 0) {
            C259800zU c259800zU = (C259800zU) aObserverS125S0300000_12.l1;
            MediatorLiveData mediatorLiveData = (MediatorLiveData) aObserverS125S0300000_12.l2;
            T t = c259800zU.element;
            if (t != 0) {
                mediatorLiveData.setValue(new Pair(obj, t));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onChanged$13(AObserverS125S0300000_12 aObserverS125S0300000_12, Object obj) {
        ((C259800zU) aObserverS125S0300000_12.l0).element = obj;
        T t = ((C259800zU) aObserverS125S0300000_12.l1).element;
        if (t != 0) {
            MediatorLiveData mediatorLiveData = (MediatorLiveData) aObserverS125S0300000_12.l2;
            if (obj != 0) {
                mediatorLiveData.setValue(new Pair(t, obj));
            }
        }
    }

    public static final void onChanged$14(AObserverS125S0300000_12 aObserverS125S0300000_12, Object obj) {
        final C785000Uqo c785000Uqo = (C785000Uqo) aObserverS125S0300000_12.l0;
        InterfaceC1124060fMC interfaceC1124060fMC = (InterfaceC1124060fMC) aObserverS125S0300000_12.l1;
        IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) aObserverS125S0300000_12.l2;
        C785040Uqs c785040Uqs = (C785040Uqs) obj;
        c785000Uqo.getClass();
        if (c785040Uqs == null) {
            C770580UKq.LIZIZ(interfaceC1124060fMC, null);
            return;
        }
        List<String> list = c785040Uqs.LIZ;
        final ArrayList arrayList = new ArrayList();
        int size = ((ArrayList) C785000Uqo.LLJJIII).size();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) ListProtector.get(list, i);
            int size2 = arrayList.size();
            if (size2 >= size) {
                break;
            }
            if (str != null) {
                C1331100kk8 c1331100kk8LIZLLL = C1331100kk8.LIZLLL((int) C497740JfY.LIZIZ(4.0f));
                Context context = c785000Uqo.LLILLJJLI;
                if (context != null) {
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ee, context);
                    if (numLIZJ != null) {
                        c1331100kk8LIZLLL.LJFF = numLIZJ.intValue();
                    }
                    c1331100kk8LIZLLL.LJFF((int) C497740JfY.LIZIZ(1.0f));
                }
                C785010Uqp c785010Uqp = (C785010Uqp) ListProtector.get(C785000Uqo.LLJJIII, size2);
                arrayList.add(new C444380Hbg(str, c785010Uqp.LIZ, c785010Uqp.LIZIZ, c1331100kk8LIZLLL, c785010Uqp.LIZJ, c785010Uqp.LIZLLL));
            }
        }
        final String str2 = c785040Uqs.LIZIZ;
        final long j = slotViewModel.LLJLIL;
        final InterfaceC784990Uqn interfaceC784990Uqn = slotViewModel.LLL;
        final InterfaceC785110Uqz interfaceC785110Uqz = slotViewModel.LLLF;
        C447180HgC c447180HgC = new C447180HgC(slotViewModel);
        c785000Uqo.LLJJI = c447180HgC;
        c447180HgC.LIZIZ(arrayList, new InterfaceC447210HgF() { // from class: X.0Ur5
            @Override // X.InterfaceC447210HgF
            public final void LLJJIJIIJIL() {
            }

            @Override // X.InterfaceC447210HgF
            public final void LLJJIJIL(List<Bitmap> list2) {
                if (list2.size() != arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    C444380Hbg c444380Hbg = (C444380Hbg) ListProtector.get(arrayList, i2);
                    arrayList2.add(new C0H0I(new BitmapDrawable((Bitmap) ListProtector.get(list2, i2)), c444380Hbg.LIZIZ, c444380Hbg.LIZJ, c444380Hbg.LIZLLL, c444380Hbg.LJFF, c444380Hbg.LJI));
                }
                C1113800f5e c1113800f5e = C1113800f5e.LIZ;
                final LiveIconView liveIconView = c785000Uqo.LLILZLL;
                AbstractC785200Ur8<C0H0I, C0H0H> abstractC785200Ur8 = new AbstractC785200Ur8<C0H0I, C0H0H>(liveIconView) { // from class: X.0Ur7
                    @Override // X.AbstractC785200Ur8
                    public final C0H0H LJI(Context context2) {
                        return new C0H0H(context2);
                    }
                };
                abstractC785200Ur8.LJJIIJZLJL = arrayList2;
                abstractC785200Ur8.LJIJJ = str2;
                abstractC785200Ur8.LJIILL = new C786300Usu(interfaceC784990Uqn, 16);
                abstractC785200Ur8.LJIILLIIL = new C786290Ust(interfaceC785110Uqz, 10);
                abstractC785200Ur8.LJIIIIZZ = j;
                abstractC785200Ur8.LJIIIZ = true;
                c1113800f5e.LJ(new C785210Ur9(abstractC785200Ur8), EnumC1120860fH2.BOTTOM_LEFT_ICON_CLICK_GUIDE, c785000Uqo.LLJJ);
            }
        });
    }

    public static final void onChanged$15(AObserverS125S0300000_12 aObserverS125S0300000_12, Object obj) {
        if (!((SlotsBottomSheetDialog) aObserverS125S0300000_12.l2).isDetached()) {
            if (Boolean.TRUE.equals(obj)) {
                C756080TlG c756080TlG = (C756080TlG) aObserverS125S0300000_12.l0;
                InterfaceC1124060fMC interfaceC1124060fMC = (InterfaceC1124060fMC) ((Map.Entry) aObserverS125S0300000_12.l1).getKey();
                if (!((ArrayList) c756080TlG.LLILZ).contains(interfaceC1124060fMC)) {
                    int iLIZIZ = C756800TmQ.LIZIZ(interfaceC1124060fMC.LIZ());
                    int size = ((ArrayList) c756080TlG.LLILZ).size();
                    int size2 = ((ArrayList) c756080TlG.LLILZ).size();
                    int i = 0;
                    while (true) {
                        if (i >= size2) {
                            break;
                        }
                        if (iLIZIZ < C756800TmQ.LIZIZ(((InterfaceC1124060fMC) ListProtector.get(c756080TlG.LLILZ, i)).LIZ())) {
                            size = i;
                            break;
                        }
                        i++;
                    }
                    ListProtector.add(c756080TlG.LLILZ, size, interfaceC1124060fMC);
                    c756080TlG.notifyDataSetChanged();
                }
                ((InterfaceC1124060fMC) ((Map.Entry) aObserverS125S0300000_12.l1).getKey()).onExposure("before_live_dialog_item");
                return;
            }
            C756080TlG c756080TlG2 = (C756080TlG) aObserverS125S0300000_12.l0;
            ((ArrayList) c756080TlG2.LLILZ).remove(((Map.Entry) aObserverS125S0300000_12.l1).getKey());
            c756080TlG2.notifyDataSetChanged();
        }
    }

    public static final void onChanged$16(AObserverS125S0300000_12 aObserverS125S0300000_12, Object obj) {
        RecommendFeedFragmentPanel recommendFeedFragmentPanel;
        C1209950haj c1209950haj;
        FeedRecommendFragment feedRecommendFragment = (FeedRecommendFragment) aObserverS125S0300000_12.l0;
        ScrollSwitchStateManager scrollSwitchStateManager = (ScrollSwitchStateManager) aObserverS125S0300000_12.l1;
        C19EG c19eg = (C19EG) aObserverS125S0300000_12.l2;
        Integer num = (Integer) obj;
        feedRecommendFragment.getClass();
        if (num != null && !TextUtils.equals(scrollSwitchStateManager.CQ2(num.intValue()), "page_feed") && (c1209950haj = (recommendFeedFragmentPanel = feedRecommendFragment.LLIZLLLIL).LLLF) != null) {
            c1209950haj.LIZJ(c19eg, recommendFeedFragmentPanel.LJIIIIZZ(), 0L, 0L);
        }
    }

    public static final void onChanged$2(AObserverS125S0300000_12 aObserverS125S0300000_12, Object obj) {
        String strLIZ;
        Boolean bool = (Boolean) obj;
        Boolean bool2 = Boolean.TRUE;
        if (bool2.equals(((IIconSlot.SlotViewModel) aObserverS125S0300000_12.l0).LL.getValue())) {
            ((BottomLeftSlotWidget) aObserverS125S0300000_12.l2).z1((InterfaceC1124060fMC) aObserverS125S0300000_12.l1, bool.booleanValue());
            if (bool2.equals(bool)) {
                ((InterfaceC1124060fMC) aObserverS125S0300000_12.l1).onExposure("during_live");
            }
            if (bool2.equals(bool)) {
                strLIZ = ((InterfaceC1124060fMC) aObserverS125S0300000_12.l1).LIZ();
            } else {
                strLIZ = "";
            }
            C470480Icg.LIZJ(strLIZ);
        }
    }

    public static final void onChanged$3(AObserverS125S0300000_12 aObserverS125S0300000_12, Object obj) {
        Boolean bool = (Boolean) obj;
        DataChannel dataChannel = ((BottomLeftSlotWidget) aObserverS125S0300000_12.l2).dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(BottomLeftSlotVisibilityChannel.class, bool);
        }
        Boolean bool2 = Boolean.TRUE;
        String strLIZ = "";
        if (bool2.equals(((IIconSlot.SlotViewModel) aObserverS125S0300000_12.l0).LL.getValue())) {
            ((BottomLeftSlotWidget) aObserverS125S0300000_12.l2).z1(((C1123980fM4) aObserverS125S0300000_12.l1).LIZIZ, bool.booleanValue());
            if (bool2.equals(bool)) {
                ((C1123980fM4) aObserverS125S0300000_12.l1).LIZIZ.onExposure("during_live");
            }
            if (bool2.equals(bool)) {
                strLIZ = ((C1123980fM4) aObserverS125S0300000_12.l1).LIZIZ.LIZ();
            }
            C470480Icg.LIZJ(strLIZ);
            return;
        }
        Iterator it2 = ((PriorityBlockingQueue) ((BottomLeftSlotWidget) aObserverS125S0300000_12.l2).LLJI).iterator();
        while (true) {
            if (it2.hasNext()) {
                Object next = it2.next();
                IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) ((HashMap) ((BottomLeftSlotWidget) aObserverS125S0300000_12.l2).LLJIJIL).get(next);
                if (((C1123980fM4) aObserverS125S0300000_12.l1) != next && Boolean.TRUE.equals(slotViewModel.LL.getValue())) {
                    break;
                }
            } else {
                ((IIconSlot.SlotViewModel) aObserverS125S0300000_12.l0).LL.setValue(Boolean.TRUE);
                break;
            }
        }
        Boolean bool3 = Boolean.TRUE;
        if (!bool3.equals(((IIconSlot.SlotViewModel) aObserverS125S0300000_12.l0).LL.getValue())) {
            return;
        }
        ((BottomLeftSlotWidget) aObserverS125S0300000_12.l2).z1(((C1123980fM4) aObserverS125S0300000_12.l1).LIZIZ, bool.booleanValue());
        if (bool3.equals(bool)) {
            ((C1123980fM4) aObserverS125S0300000_12.l1).LIZIZ.onExposure("during_live");
        }
        if (bool3.equals(bool)) {
            strLIZ = ((C1123980fM4) aObserverS125S0300000_12.l1).LIZIZ.LIZ();
        }
        C470480Icg.LIZJ(strLIZ);
    }

    public static final void onChanged$4(AObserverS125S0300000_12 aObserverS125S0300000_12, Object obj) {
        List<String> list;
        final BottomLeftSlotWidget bottomLeftSlotWidget = (BottomLeftSlotWidget) aObserverS125S0300000_12.l0;
        InterfaceC1124060fMC interfaceC1124060fMC = (InterfaceC1124060fMC) aObserverS125S0300000_12.l1;
        IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) aObserverS125S0300000_12.l2;
        C785040Uqs c785040Uqs = (C785040Uqs) obj;
        List<C785020Uqq> list2 = BottomLeftSlotWidget.LLJJIJIIJIL;
        bottomLeftSlotWidget.getClass();
        if (c785040Uqs != null && c785040Uqs.LIZIZ != null && (list = c785040Uqs.LIZ) != null) {
            final ArrayList arrayList = new ArrayList();
            int size = ((ArrayList) BottomLeftSlotWidget.LLJJIJIIJIL).size();
            for (int i = 0; i < list.size(); i++) {
                String str = (String) ListProtector.get(list, i);
                int size2 = arrayList.size();
                if (size2 >= size) {
                    break;
                }
                if (str != null) {
                    C1331100kk8 c1331100kk8LIZLLL = C1331100kk8.LIZLLL((int) C497740JfY.LIZIZ(4.0f));
                    Context context = bottomLeftSlotWidget.context;
                    if (context != null) {
                        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ee, context);
                        if (numLIZJ != null) {
                            c1331100kk8LIZLLL.LJFF = numLIZJ.intValue();
                        }
                        c1331100kk8LIZLLL.LJFF((int) C497740JfY.LIZIZ(1.0f));
                    }
                    C785020Uqq c785020Uqq = (C785020Uqq) ListProtector.get(BottomLeftSlotWidget.LLJJIJIIJIL, size2);
                    arrayList.add(new C444380Hbg(str, c785020Uqq.LIZ, c785020Uqq.LIZIZ, c1331100kk8LIZLLL, c785020Uqq.LIZJ, c785020Uqq.LIZLLL));
                }
            }
            final String str2 = c785040Uqs.LIZIZ;
            final long j = slotViewModel.LLJLIL;
            final InterfaceC784990Uqn interfaceC784990Uqn = slotViewModel.LLL;
            final InterfaceC785110Uqz interfaceC785110Uqz = slotViewModel.LLLF;
            C447180HgC c447180HgC = new C447180HgC(slotViewModel);
            bottomLeftSlotWidget.LLJJI = c447180HgC;
            c447180HgC.LIZIZ(arrayList, new InterfaceC447210HgF() { // from class: X.0Ur4
                @Override // X.InterfaceC447210HgF
                public final void LLJJIJIIJIL() {
                }

                @Override // X.InterfaceC447210HgF
                public final void LLJJIJIL(List<Bitmap> list3) {
                    if (list3.size() != arrayList.size()) {
                        return;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        C444380Hbg c444380Hbg = (C444380Hbg) ListProtector.get(arrayList, i2);
                        arrayList2.add(new C0H0I(new BitmapDrawable((Bitmap) ListProtector.get(list3, i2)), c444380Hbg.LIZIZ, c444380Hbg.LIZJ, c444380Hbg.LIZLLL, c444380Hbg.LJFF, c444380Hbg.LJI));
                    }
                    C1113800f5e c1113800f5e = C1113800f5e.LIZ;
                    C785180Ur6 c785180Ur6 = new C785180Ur6(bottomLeftSlotWidget.LLILLJJLI);
                    c785180Ur6.LJJIIJZLJL = arrayList2;
                    c785180Ur6.LJIJJ = str2;
                    c785180Ur6.LJIILL = new C786300Usu(interfaceC784990Uqn, 2);
                    c785180Ur6.LJIILLIIL = new C786290Ust(interfaceC785110Uqz, 2);
                    c785180Ur6.LJIIIIZZ = j;
                    c785180Ur6.LJIIIZ = true;
                    c1113800f5e.LJ(new C785210Ur9(c785180Ur6), EnumC1120860fH2.BOTTOM_LEFT_ICON_CLICK_GUIDE, bottomLeftSlotWidget.dataChannel);
                }
            });
            return;
        }
        C770580UKq.LIZIZ(interfaceC1124060fMC, null);
    }

    public static final void onChanged$5(AObserverS125S0300000_12 aObserverS125S0300000_12, Object obj) {
        InterfaceC1124060fMC<?, ?, ?> interfaceC1124060fMC;
        boolean z;
        Boolean bool = (Boolean) obj;
        String strLIZ = "";
        if (LiveShopAddPermissionBusinessSetting.INSTANCE.isEnabled()) {
            boolean z2 = true;
            if (bool.booleanValue() && !Intrinsics.LJFF(((IIconSlot.SlotViewModel) aObserverS125S0300000_12.l0).LL.getValue(), Boolean.TRUE)) {
                z = true;
            } else {
                z = false;
            }
            if (bool.booleanValue() || !Intrinsics.LJFF(((IIconSlot.SlotViewModel) aObserverS125S0300000_12.l0).LL.getValue(), Boolean.TRUE)) {
                z2 = false;
            }
            if (z) {
                ((IIconSlot.SlotViewModel) aObserverS125S0300000_12.l0).LL.setValue(Boolean.TRUE);
            } else if (z2) {
                InterfaceC1124060fMC<?, ?, ?> interfaceC1124060fMC2 = (InterfaceC1124060fMC) aObserverS125S0300000_12.l1;
                if (interfaceC1124060fMC2 != null) {
                    ((C785060Uqu) aObserverS125S0300000_12.l2).LJI(interfaceC1124060fMC2, false);
                    C470480Icg.LIZJ("");
                }
                ((IIconSlot.SlotViewModel) aObserverS125S0300000_12.l0).LL.setValue(Boolean.FALSE);
            }
        }
        if (Intrinsics.LJFF(((IIconSlot.SlotViewModel) aObserverS125S0300000_12.l0).LL.getValue(), Boolean.TRUE) && (interfaceC1124060fMC = (InterfaceC1124060fMC) aObserverS125S0300000_12.l1) != null) {
            ((C785060Uqu) aObserverS125S0300000_12.l2).LJI(interfaceC1124060fMC, bool.booleanValue());
            if (bool.booleanValue()) {
                interfaceC1124060fMC.onExposure("during_live");
            }
            if (bool.booleanValue()) {
                strLIZ = interfaceC1124060fMC.LIZ();
            }
            C470480Icg.LIZJ(strLIZ);
        }
    }

    public static final void onChanged$6(AObserverS125S0300000_12 aObserverS125S0300000_12, Object obj) {
        InterfaceC1124060fMC<?, ?, ?> interfaceC1124060fMC;
        IIconSlot.SlotViewModel slotViewModel;
        MutableLiveData<Boolean> mutableLiveData;
        Boolean bool = (Boolean) obj;
        DataChannel dataChannel = ((C785060Uqu) aObserverS125S0300000_12.l0).LLILLL;
        if (dataChannel == null) {
            dataChannel = null;
        }
        dataChannel.zW(BottomLeftSlotVisibilityChannel.class, bool);
        String strLIZ = "";
        if (Intrinsics.LJFF(((IIconSlot.SlotViewModel) aObserverS125S0300000_12.l1).LL.getValue(), Boolean.TRUE)) {
            InterfaceC1124060fMC<?, ?, ?> interfaceC1124060fMC2 = ((C1123980fM4) aObserverS125S0300000_12.l2).LIZIZ;
            if (interfaceC1124060fMC2 != null) {
                ((C785060Uqu) aObserverS125S0300000_12.l0).LJI(interfaceC1124060fMC2, bool.booleanValue());
                if (bool.booleanValue()) {
                    interfaceC1124060fMC2.onExposure("during_live");
                }
                if (bool.booleanValue()) {
                    strLIZ = interfaceC1124060fMC2.LIZ();
                    strLIZ.toString();
                }
                C470480Icg.LIZJ(strLIZ);
                return;
            }
            return;
        }
        Iterator it2 = ((PriorityBlockingQueue) ((C785060Uqu) aObserverS125S0300000_12.l0).LLJJIJI).iterator();
        while (true) {
            if (it2.hasNext()) {
                Object next = it2.next();
                if (!Intrinsics.LJFF((C1123980fM4) aObserverS125S0300000_12.l2, next) && (slotViewModel = (IIconSlot.SlotViewModel) ((LinkedHashMap) ((C785060Uqu) aObserverS125S0300000_12.l0).LLJJIJIIJIL).get(next)) != null && (mutableLiveData = slotViewModel.LL) != null && Intrinsics.LJFF(mutableLiveData.getValue(), Boolean.TRUE)) {
                    break;
                }
            } else {
                ((IIconSlot.SlotViewModel) aObserverS125S0300000_12.l1).LL.setValue(Boolean.TRUE);
                break;
            }
        }
        if (!Intrinsics.LJFF(((IIconSlot.SlotViewModel) aObserverS125S0300000_12.l1).LL.getValue(), Boolean.TRUE) || (interfaceC1124060fMC = ((C1123980fM4) aObserverS125S0300000_12.l2).LIZIZ) == null) {
            return;
        }
        ((C785060Uqu) aObserverS125S0300000_12.l0).LJI(interfaceC1124060fMC, bool.booleanValue());
        if (bool.booleanValue()) {
            interfaceC1124060fMC.onExposure("during_live");
        }
        if (bool.booleanValue()) {
            strLIZ = interfaceC1124060fMC.LIZ();
            strLIZ.toString();
        }
        C470480Icg.LIZJ(strLIZ);
    }

    public static final void onChanged$7(AObserverS125S0300000_12 aObserverS125S0300000_12, Object obj) {
        IIconSlot.SlotViewModel slotViewModel;
        Boolean bool = (Boolean) obj;
        DataChannel dataChannel = ((C785060Uqu) aObserverS125S0300000_12.l0).LLILLL;
        if (dataChannel == null) {
            dataChannel = null;
        }
        dataChannel.zW(BottomLeftSlotVisibilityChannel.class, bool);
        String strLIZ = "";
        if (Intrinsics.LJFF(((IIconSlot.SlotViewModel) aObserverS125S0300000_12.l1).LL.getValue(), Boolean.TRUE)) {
            InterfaceC1124060fMC<?, ?, ?> interfaceC1124060fMC = ((C1123980fM4) aObserverS125S0300000_12.l2).LIZIZ;
            if (interfaceC1124060fMC != null) {
                ((C785060Uqu) aObserverS125S0300000_12.l0).LJI(interfaceC1124060fMC, bool.booleanValue());
                if (bool.booleanValue()) {
                    interfaceC1124060fMC.onExposure("during_live");
                }
                if (bool.booleanValue()) {
                    strLIZ = interfaceC1124060fMC.LIZ();
                    strLIZ.toString();
                }
                C470480Icg.LIZJ(strLIZ);
                return;
            }
            return;
        }
        for (Object obj2 : (PriorityBlockingQueue) ((C785060Uqu) aObserverS125S0300000_12.l0).LLJJIJI) {
            if (!Intrinsics.LJFF((C1123980fM4) aObserverS125S0300000_12.l2, obj2) && (slotViewModel = (IIconSlot.SlotViewModel) ((LinkedHashMap) ((C785060Uqu) aObserverS125S0300000_12.l0).LLJJIJIIJIL).get(obj2)) != null && Intrinsics.LJFF(slotViewModel.LL.getValue(), Boolean.TRUE)) {
                slotViewModel.LL.postValue(Boolean.FALSE);
            }
        }
        ((IIconSlot.SlotViewModel) aObserverS125S0300000_12.l1).LL.setValue(Boolean.TRUE);
        InterfaceC1124060fMC<?, ?, ?> interfaceC1124060fMC2 = ((C1123980fM4) aObserverS125S0300000_12.l2).LIZIZ;
        if (interfaceC1124060fMC2 == null) {
            return;
        }
        C785060Uqu c785060Uqu = (C785060Uqu) aObserverS125S0300000_12.l0;
        IIconSlot.SlotViewModel slotViewModel2 = (IIconSlot.SlotViewModel) aObserverS125S0300000_12.l1;
        c785060Uqu.LJI(interfaceC1124060fMC2, bool.booleanValue());
        c785060Uqu.LJII(interfaceC1124060fMC2, slotViewModel2);
        if (bool.booleanValue()) {
            interfaceC1124060fMC2.onExposure("during_live");
        }
        if (bool.booleanValue()) {
            strLIZ = interfaceC1124060fMC2.LIZ();
            strLIZ.toString();
        }
        C470480Icg.LIZJ(strLIZ);
    }

    public static final void onChanged$8(AObserverS125S0300000_12 aObserverS125S0300000_12, Object obj) {
        boolean z;
        boolean z2;
        InterfaceC1124060fMC<?, ?, ?> interfaceC1124060fMC;
        MutableLiveData<Boolean> mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2;
        MutableLiveData<Boolean> mutableLiveData3;
        MutableLiveData<Boolean> mutableLiveData4;
        InterfaceC1124060fMC<?, ?, ?> interfaceC1124060fMC2;
        String strLIZ;
        Boolean bool = (Boolean) obj;
        DataChannel dataChannel = ((C785060Uqu) aObserverS125S0300000_12.l0).LLILLL;
        if (dataChannel == null) {
            dataChannel = null;
        }
        dataChannel.zW(BottomLeftSlotVisibilityChannel.class, bool);
        Boolean value = ((IIconSlot.SlotViewModel) aObserverS125S0300000_12.l1).LL.getValue();
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.LJFF(value, bool2) && (interfaceC1124060fMC2 = ((C1123980fM4) aObserverS125S0300000_12.l2).LIZIZ) != null) {
            ((C785060Uqu) aObserverS125S0300000_12.l0).LJI(interfaceC1124060fMC2, bool.booleanValue());
            if (bool.booleanValue()) {
                interfaceC1124060fMC2.onExposure("during_live");
            }
            if (bool.booleanValue()) {
                strLIZ = interfaceC1124060fMC2.LIZ();
                strLIZ.toString();
            } else {
                strLIZ = "";
            }
            C470480Icg.LIZJ(strLIZ);
        }
        if (bool.booleanValue() && !Intrinsics.LJFF(((IIconSlot.SlotViewModel) aObserverS125S0300000_12.l1).LL.getValue(), bool2)) {
            z = true;
        } else {
            z = false;
        }
        if (!bool.booleanValue() && Intrinsics.LJFF(((IIconSlot.SlotViewModel) aObserverS125S0300000_12.l1).LL.getValue(), bool2)) {
            z2 = true;
            ((IIconSlot.SlotViewModel) aObserverS125S0300000_12.l1).LL.setValue(Boolean.FALSE);
        } else {
            z2 = false;
        }
        Iterator it2 = ((PriorityBlockingQueue) ((C785060Uqu) aObserverS125S0300000_12.l0).LLJJIJI).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C1123980fM4 c1123980fM4 = (C1123980fM4) it2.next();
            IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) ((LinkedHashMap) ((C785060Uqu) aObserverS125S0300000_12.l0).LLJJIJIIJIL).get(c1123980fM4);
            int i = c1123980fM4.LIZ;
            C1123980fM4 c1123980fM42 = (C1123980fM4) aObserverS125S0300000_12.l2;
            if (i <= c1123980fM42.LIZ && !Intrinsics.LJFF(c1123980fM42, c1123980fM4)) {
                if (z && slotViewModel != null && (mutableLiveData4 = slotViewModel.LL) != null && Intrinsics.LJFF(mutableLiveData4.getValue(), Boolean.TRUE)) {
                    break;
                }
                if (z2 && slotViewModel != null && ((mutableLiveData3 = slotViewModel.LL) == null || (!Intrinsics.LJFF(mutableLiveData3.getValue(), Boolean.TRUE) && slotViewModel != null))) {
                    MutableLiveData<Boolean> mutableLiveData5 = slotViewModel.LLILZ;
                    if (mutableLiveData5 != null && Intrinsics.LJFF(mutableLiveData5.getValue(), Boolean.TRUE)) {
                        MutableLiveData<Boolean> mutableLiveData6 = slotViewModel.LL;
                        if (mutableLiveData6 != null) {
                            mutableLiveData6.setValue(Boolean.TRUE);
                        }
                        InterfaceC1124060fMC<?, ?, ?> interfaceC1124060fMC3 = ((C1123980fM4) aObserverS125S0300000_12.l2).LIZIZ;
                        if (interfaceC1124060fMC3 != null) {
                            ((C785060Uqu) aObserverS125S0300000_12.l0).LJI(interfaceC1124060fMC3, true);
                        }
                        InterfaceC1124060fMC<?, ?, ?> interfaceC1124060fMC4 = c1123980fM4.LIZIZ;
                        ((C785060Uqu) aObserverS125S0300000_12.l0).LJII(interfaceC1124060fMC4, slotViewModel);
                        interfaceC1124060fMC4.onExposure("during_live");
                        C470480Icg.LIZJ(interfaceC1124060fMC4.LIZ());
                    }
                }
            } else if (Intrinsics.LJFF((C1123980fM4) aObserverS125S0300000_12.l2, c1123980fM4)) {
                if (z) {
                    ((IIconSlot.SlotViewModel) aObserverS125S0300000_12.l1).LL.setValue(Boolean.TRUE);
                }
            } else if (z && Intrinsics.LJFF(((IIconSlot.SlotViewModel) aObserverS125S0300000_12.l1).LL.getValue(), Boolean.TRUE)) {
                if (slotViewModel != null && (mutableLiveData2 = slotViewModel.LL) != null) {
                    mutableLiveData2.setValue(Boolean.FALSE);
                }
            } else if (z2 && slotViewModel != null && ((mutableLiveData = slotViewModel.LL) == null || (!Intrinsics.LJFF(mutableLiveData.getValue(), Boolean.TRUE) && slotViewModel != null))) {
                MutableLiveData<Boolean> mutableLiveData7 = slotViewModel.LLILZ;
                if (mutableLiveData7 != null && Intrinsics.LJFF(mutableLiveData7.getValue(), Boolean.TRUE)) {
                    MutableLiveData<Boolean> mutableLiveData8 = slotViewModel.LL;
                    if (mutableLiveData8 != null) {
                        mutableLiveData8.setValue(Boolean.TRUE);
                    }
                    InterfaceC1124060fMC<?, ?, ?> interfaceC1124060fMC5 = ((C1123980fM4) aObserverS125S0300000_12.l2).LIZIZ;
                    if (interfaceC1124060fMC5 != null) {
                        ((C785060Uqu) aObserverS125S0300000_12.l0).LJI(interfaceC1124060fMC5, true);
                    }
                    InterfaceC1124060fMC<?, ?, ?> interfaceC1124060fMC6 = c1123980fM4.LIZIZ;
                    ((C785060Uqu) aObserverS125S0300000_12.l0).LJII(interfaceC1124060fMC6, slotViewModel);
                    interfaceC1124060fMC6.onExposure("during_live");
                    C470480Icg.LIZJ(interfaceC1124060fMC6.LIZ());
                }
            }
        }
        if (!z) {
            return;
        }
        if (Intrinsics.LJFF(((IIconSlot.SlotViewModel) aObserverS125S0300000_12.l1).LL.getValue(), Boolean.TRUE) && (interfaceC1124060fMC = ((C1123980fM4) aObserverS125S0300000_12.l2).LIZIZ) != null) {
            C785060Uqu c785060Uqu = (C785060Uqu) aObserverS125S0300000_12.l0;
            IIconSlot.SlotViewModel slotViewModel2 = (IIconSlot.SlotViewModel) aObserverS125S0300000_12.l1;
            c785060Uqu.LJI(interfaceC1124060fMC, true);
            interfaceC1124060fMC.onExposure("during_live");
            c785060Uqu.LJII(interfaceC1124060fMC, slotViewModel2);
            String strLIZ2 = interfaceC1124060fMC.LIZ();
            strLIZ2.toString();
            C470480Icg.LIZJ(strLIZ2);
        }
    }

    public static final void onChanged$9(AObserverS125S0300000_12 aObserverS125S0300000_12, Object obj) {
        boolean z;
        String strLIZ;
        Boolean bool = (Boolean) obj;
        DataChannel dataChannel = ((C785060Uqu) aObserverS125S0300000_12.l0).LLILLL;
        if (dataChannel == null) {
            dataChannel = null;
        }
        dataChannel.zW(BottomLeftSlotVisibilityChannel.class, bool);
        if (bool.booleanValue() && !Intrinsics.LJFF(((IIconSlot.SlotViewModel) aObserverS125S0300000_12.l1).LL.getValue(), Boolean.TRUE)) {
            z = true;
        } else {
            z = false;
        }
        if (!bool.booleanValue() && Intrinsics.LJFF(((IIconSlot.SlotViewModel) aObserverS125S0300000_12.l1).LL.getValue(), Boolean.TRUE)) {
            ((IIconSlot.SlotViewModel) aObserverS125S0300000_12.l1).LL.setValue(Boolean.FALSE);
        } else if (z) {
            ((IIconSlot.SlotViewModel) aObserverS125S0300000_12.l1).LL.setValue(Boolean.TRUE);
        }
        InterfaceC1124060fMC<?, ?, ?> interfaceC1124060fMC = ((C1123980fM4) aObserverS125S0300000_12.l2).LIZIZ;
        if (interfaceC1124060fMC != null) {
            C785060Uqu c785060Uqu = (C785060Uqu) aObserverS125S0300000_12.l0;
            IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) aObserverS125S0300000_12.l1;
            c785060Uqu.LJI(interfaceC1124060fMC, bool.booleanValue());
            if (bool.booleanValue()) {
                interfaceC1124060fMC.onExposure("during_live");
            }
            String strLIZ2 = "";
            if (!bool.booleanValue()) {
                strLIZ = "";
            } else {
                strLIZ = interfaceC1124060fMC.LIZ();
                strLIZ.toString();
            }
            C470480Icg.LIZJ(strLIZ);
            c785060Uqu.LJII(interfaceC1124060fMC, slotViewModel);
            if (bool.booleanValue()) {
                strLIZ2 = interfaceC1124060fMC.LIZ();
                strLIZ2.toString();
            }
            C470480Icg.LIZJ(strLIZ2);
        }
    }

    public AObserverS125S0300000_12(BottomLeftSlotWidget bottomLeftSlotWidget, IIconSlot.SlotViewModel slotViewModel, InterfaceC1124060fMC interfaceC1124060fMC, int i) {
        this.$t = i;
        if (2 - i != 0) {
            this.l0 = bottomLeftSlotWidget;
            this.l1 = interfaceC1124060fMC;
            this.l2 = slotViewModel;
        } else {
            this.l2 = bottomLeftSlotWidget;
            this.l0 = slotViewModel;
            this.l1 = interfaceC1124060fMC;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AObserverS125S0300000_12(com.bytedance.android.live.slot.IIconSlot.SlotViewModel r2, com.bytedance.android.live.slot.IIconSlot.SlotViewModel r3, X.InterfaceC1124060fMC<?, ?, ?> r4, X.C785060Uqu r5) {
        /*
            r1 = this;
            r1.$t = r5
            int r5 = 5 - r5
            if (r5 == 0) goto L11
            r0 = r1
            r0.l0 = r4
            r0.l1 = r2
            r0.l2 = r3
        Ld:
            r0.<init>()
            return
        L11:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
            r0.l2 = r4
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS125S0300000_12.<init>(com.bytedance.android.live.slot.IIconSlot$SlotViewModel, X.0fMC, X.0Uqu, int):void");
    }

    public AObserverS125S0300000_12(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj3;
        this.l2 = obj;
    }
}
