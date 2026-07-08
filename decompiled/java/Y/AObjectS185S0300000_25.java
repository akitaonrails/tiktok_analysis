package Y;

import X.AbstractC1653130t7X;
import X.C05YF;
import X.C0ETY;
import X.C0LZD;
import X.C123100dR;
import X.C1322110kVd;
import X.C1441190nbh;
import X.C1443960ngA;
import X.C1459900o5s;
import X.C1621360sII;
import X.C1638590sk5;
import X.C1647390syH;
import X.C1647580sya;
import X.C1648160szW;
import X.C1650560t3O;
import X.C1650630t3V;
import X.C1650750t3h;
import X.C1650780t3k;
import X.C1650960t42;
import X.C1650980t44;
import X.C1650990t45;
import X.C1651000t46;
import X.C1651010t47;
import X.C1651030t49;
import X.C1653070t7R;
import X.C1653090t7T;
import X.C1653120t7W;
import X.C1656050tCF;
import X.C1656120tCM;
import X.C1660880tK2;
import X.C1660940tK8;
import X.C1663800tOk;
import X.C1664460tPo;
import X.C1697810uHb;
import X.C19A3;
import X.C1DRG;
import X.C201955140j;
import X.C2188811AlT;
import X.C2218171Brj;
import X.C259800zU;
import X.C343070Dcf;
import X.C385670FAf;
import X.C565600MGg;
import X.C577500Mku;
import X.C579830Mof;
import X.EnumC1448590nnd;
import X.EnumC1647570syZ;
import X.EnumC1651770t5L;
import X.InterfaceC1441305kZ;
import X.InterfaceC1624480sNK;
import X.InterfaceC1645840svm;
import X.InterfaceC1646220swO;
import X.InterfaceC1650230t2r;
import X.InterfaceC1650770t3j;
import X.InterfaceC1651080t4E;
import X.InterfaceC1651490t4t;
import android.text.TextUtils;
import com.bytedance.als.h0;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.creative.model.StreamVoiceConversionModel;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.d4;
import com.ss.android.ugc.aweme.shortvideo.edit.audioedit.voicechange.vcstream.svc.SVCTask;
import com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.vesdk.VEAudioCapture;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import duk.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS111S0110000_25;
import kotlin.jvm.internal.AwS265S0000000_25;
import kotlin.jvm.internal.AwS390S0200000_24;
import kotlin.jvm.internal.AwS391S0200000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.AwS76S0210000_25;
import kotlin.jvm.internal.Intrinsics;
import lnn.l;
import lnn.q;

/* JADX INFO: loaded from: classes26.dex */
public class AObjectS185S0300000_25 implements InterfaceC1441305kZ {
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
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onChanged$17(this, obj);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onChanged$18(this, obj);
                break;
            case 19:
                onChanged$19(this, obj);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                onChanged$20(this, obj);
                break;
            case 21:
                onChanged$21(this, obj);
                break;
            case 22:
                onChanged$22(this, obj);
                break;
            case 23:
                onChanged$23(this, obj);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                onChanged$24(this, obj);
                break;
            case 25:
                onChanged$25(this, obj);
                break;
            case 26:
                onChanged$26(this, obj);
                break;
            case 27:
                onChanged$27(this, obj);
                break;
            case 28:
                onChanged$28(this, obj);
                break;
        }
    }

    public static final void onChanged$0(AObjectS185S0300000_25 aObjectS185S0300000_25, Object obj) {
        EnumC1448590nnd enumC1448590nndLIZJ;
        C385670FAf<EnumC1448590nnd> c385670FAfDk;
        if (obj != null) {
            if (C1638590sk5.LIZ.contains(obj)) {
                ((Function1) aObjectS185S0300000_25.l0).invoke(Boolean.FALSE);
                return;
            }
            if (!((ShortVideoContext) aObjectS185S0300000_25.l1).cameraComponentModel.mDurings.isEmpty()) {
                return;
            }
            InterfaceC1646220swO interfaceC1646220swO = (InterfaceC1646220swO) aObjectS185S0300000_25.l2;
            if (interfaceC1646220swO != null && (c385670FAfDk = interfaceC1646220swO.dk()) != null) {
                enumC1448590nndLIZJ = c385670FAfDk.LIZJ();
            } else {
                enumC1448590nndLIZJ = null;
            }
            if (enumC1448590nndLIZJ != EnumC1448590nnd.RATIO_9_16) {
                return;
            }
            ((Function1) aObjectS185S0300000_25.l0).invoke(Boolean.TRUE);
        }
    }

    public static final void onChanged$1(AObjectS185S0300000_25 aObjectS185S0300000_25, Object obj) {
        EnumC1448590nnd enumC1448590nndLIZJ;
        C385670FAf<EnumC1448590nnd> c385670FAfDk;
        C1647390syH c1647390syH = (C1647390syH) obj;
        if (c1647390syH.LIZLLL) {
            CharSequence charSequence = (CharSequence) c1647390syH.LIZIZ;
            if (!C1647580sya.LIZJ(charSequence) && !C1647580sya.LIZLLL(charSequence) && !TextUtils.equals(charSequence, "record_mode_duet") && !TextUtils.equals(charSequence, "AISelf")) {
                if (C1647580sya.LIZIZ(charSequence)) {
                    ((Function1) aObjectS185S0300000_25.l0).invoke(Boolean.TRUE);
                    return;
                }
                if (C1647580sya.LIZ(charSequence)) {
                    if (!((ShortVideoContext) aObjectS185S0300000_25.l1).cameraComponentModel.mDurings.isEmpty()) {
                        return;
                    }
                    ((Function1) aObjectS185S0300000_25.l0).invoke(Boolean.TRUE);
                    return;
                } else {
                    if (!TextUtils.equals(charSequence, EnumC1647570syZ.NEW_BOTTOM_STORY.getTag()) && !TextUtils.equals(charSequence, EnumC1647570syZ.NEW_BOTTOM_DM_CAMERA.getTag())) {
                        return;
                    }
                    InterfaceC1646220swO interfaceC1646220swO = (InterfaceC1646220swO) aObjectS185S0300000_25.l2;
                    if (interfaceC1646220swO != null && (c385670FAfDk = interfaceC1646220swO.dk()) != null) {
                        enumC1448590nndLIZJ = c385670FAfDk.LIZJ();
                    } else {
                        enumC1448590nndLIZJ = null;
                    }
                    if (enumC1448590nndLIZJ != EnumC1448590nnd.RATIO_9_16) {
                        return;
                    }
                    ((Function1) aObjectS185S0300000_25.l0).invoke(Boolean.TRUE);
                    return;
                }
            }
            ((Function1) aObjectS185S0300000_25.l0).invoke(Boolean.FALSE);
        }
    }

    public static final void onChanged$10(AObjectS185S0300000_25 aObjectS185S0300000_25, Object obj) {
        boolean z;
        Integer num = (Integer) obj;
        C1651010t47 c1651010t47 = (C1651010t47) aObjectS185S0300000_25.l0;
        C1DRG c1drg = (C1DRG) aObjectS185S0300000_25.l1;
        C1650560t3O c1650560t3O = (C1650560t3O) aObjectS185S0300000_25.l2;
        if (num != null && num.intValue() == 0) {
            z = false;
        } else {
            z = true;
        }
        c1651010t47.LIZJ(c1drg, c1650560t3O, z);
        ((InterfaceC1651080t4E) ((C1DRG) aObjectS185S0300000_25.l1).LJII(InterfaceC1651080t4E.class, null)).vv();
    }

    public static final void onChanged$11(AObjectS185S0300000_25 aObjectS185S0300000_25, Object obj) {
        ((C1651010t47) aObjectS185S0300000_25.l0).LIZJ((C1DRG) aObjectS185S0300000_25.l1, (C1650560t3O) aObjectS185S0300000_25.l2, false);
    }

    public static final void onChanged$12(AObjectS185S0300000_25 aObjectS185S0300000_25, Object obj) {
        Integer num = (Integer) obj;
        InterfaceC1650230t2r interfaceC1650230t2r = ((C1651010t47) aObjectS185S0300000_25.l0).LIZIZ;
        String strLIZ = null;
        if (interfaceC1650230t2r == null) {
            interfaceC1650230t2r = null;
        }
        if (!interfaceC1650230t2r.Ue()) {
            C1650980t44 c1650980t44LJIIIIZZ = ((C1650560t3O) aObjectS185S0300000_25.l1).LJIIIIZZ();
            if (num == null || num.intValue() == 0) {
                c1650980t44LJIIIIZZ.LLILLL = C577500Mku.LIZJ(num.intValue());
            } else if (num.intValue() == 5) {
                c1650980t44LJIIIIZZ.LLILZLL = false;
            } else if (num.intValue() == 6) {
                c1650980t44LJIIIIZZ.LLILZLL = true;
            } else {
                c1650980t44LJIIIIZZ.LLILLL = C577500Mku.LIZJ(num.intValue());
            }
            int i = c1650980t44LJIIIIZZ.LLILLL;
            if (i == R.raw.icon_camera_flash_fill || i == R.raw.icon_color_flash) {
                strLIZ = ((C1650560t3O) aObjectS185S0300000_25.l1).LIZ(2131824459);
            } else if (i == R.raw.icon_color_flash_slash || i == R.raw.icon_camera_flash_slash_fill) {
                strLIZ = ((C1650560t3O) aObjectS185S0300000_25.l1).LIZ(2131824458);
            }
            c1650980t44LJIIIIZZ.LLJJJ = strLIZ;
            C1651010t47 c1651010t47 = (C1651010t47) aObjectS185S0300000_25.l0;
            C1DRG c1drg = (C1DRG) aObjectS185S0300000_25.l2;
            c1651010t47.getClass();
            C1651010t47.LIZLLL(c1drg, c1650980t44LJIIIIZZ, true);
        }
    }

    public static final void onChanged$13(AObjectS185S0300000_25 aObjectS185S0300000_25, Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            bool.booleanValue();
            if (((C1653090t7T) aObjectS185S0300000_25.l0).LIZIZ != null) {
                if (bool.booleanValue()) {
                    ((AbstractC1653130t7X) aObjectS185S0300000_25.l1).X1((C1653090t7T) aObjectS185S0300000_25.l0);
                    if (Intrinsics.LJFF(((C1653090t7T) aObjectS185S0300000_25.l0).LIZIZ.getTag(), "RecordLiveScene")) {
                        ((AbstractC1653130t7X) aObjectS185S0300000_25.l1).B3(true);
                    }
                    ((C19A3) aObjectS185S0300000_25.l2).show(((C1653090t7T) aObjectS185S0300000_25.l0).LIZIZ);
                    ((C1653090t7T) aObjectS185S0300000_25.l0).LIZIZ.show();
                    return;
                }
                if (Intrinsics.LJFF(((C1653090t7T) aObjectS185S0300000_25.l0).LIZIZ.getTag(), "RecordLiveScene")) {
                    ((AbstractC1653130t7X) aObjectS185S0300000_25.l1).B3(false);
                }
                ((C1653090t7T) aObjectS185S0300000_25.l0).LIZIZ.hide();
                ((C19A3) aObjectS185S0300000_25.l2).hide(((C1653090t7T) aObjectS185S0300000_25.l0).LIZIZ);
            }
        }
    }

    public static final void onChanged$14(AObjectS185S0300000_25 aObjectS185S0300000_25, Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            bool.booleanValue();
            if (((C1653090t7T) aObjectS185S0300000_25.l0).LIZIZ != null) {
                if (bool.booleanValue()) {
                    if (Intrinsics.LJFF(((C1653090t7T) aObjectS185S0300000_25.l0).LIZIZ.getTag(), "RecordLiveScene")) {
                        C565600MGg componentizationConfig = ((C1653120t7W) aObjectS185S0300000_25.l1).getComponentizationConfig();
                        if (componentizationConfig != null && componentizationConfig.LIZ) {
                            InterfaceC1645840svm liveApiComponent = ((C1653120t7W) aObjectS185S0300000_25.l1).getLiveApiComponent();
                            if (liveApiComponent != null) {
                                liveApiComponent.YC2(true, false);
                            }
                        } else {
                            ((C1653120t7W) aObjectS185S0300000_25.l1).getRootScene().LLLLLZ(true, false);
                        }
                    }
                    ((C19A3) aObjectS185S0300000_25.l2).show(((C1653090t7T) aObjectS185S0300000_25.l0).LIZIZ);
                    ((C1653090t7T) aObjectS185S0300000_25.l0).LIZIZ.show();
                    return;
                }
                if (Intrinsics.LJFF(((C1653090t7T) aObjectS185S0300000_25.l0).LIZIZ.getTag(), "RecordLiveScene")) {
                    C565600MGg componentizationConfig2 = ((C1653120t7W) aObjectS185S0300000_25.l1).getComponentizationConfig();
                    if (componentizationConfig2 != null && componentizationConfig2.LIZ) {
                        InterfaceC1645840svm liveApiComponent2 = ((C1653120t7W) aObjectS185S0300000_25.l1).getLiveApiComponent();
                        if (liveApiComponent2 != null) {
                            liveApiComponent2.YC2(false, true);
                        }
                    } else {
                        ((C1653120t7W) aObjectS185S0300000_25.l1).getRootScene().LLLLLZ(false, true);
                    }
                }
                ((C1653090t7T) aObjectS185S0300000_25.l0).LIZIZ.hide();
                ((C19A3) aObjectS185S0300000_25.l2).hide(((C1653090t7T) aObjectS185S0300000_25.l0).LIZIZ);
            }
        }
    }

    public static final void onChanged$15(AObjectS185S0300000_25 aObjectS185S0300000_25, Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            bool.booleanValue();
            if (((C1653090t7T) aObjectS185S0300000_25.l0).LIZIZ != null) {
                if (bool.booleanValue()) {
                    if (Intrinsics.LJFF(((C1653090t7T) aObjectS185S0300000_25.l0).LIZIZ.getTag(), "RecordLiveScene")) {
                        C565600MGg componentizationConfig = ((C1653070t7R) aObjectS185S0300000_25.l1).getComponentizationConfig();
                        if (componentizationConfig != null && componentizationConfig.LIZ) {
                            InterfaceC1645840svm liveApiComponent = ((C1653070t7R) aObjectS185S0300000_25.l1).getLiveApiComponent();
                            if (liveApiComponent != null) {
                                liveApiComponent.YC2(true, false);
                            }
                        } else {
                            TikTokCameraBaseGroupScene rootScene = ((C1653070t7R) aObjectS185S0300000_25.l1).getRootScene();
                            if (rootScene != null) {
                                rootScene.LLLLLZ(true, false);
                            }
                        }
                    }
                    ((C19A3) aObjectS185S0300000_25.l2).show(((C1653090t7T) aObjectS185S0300000_25.l0).LIZIZ);
                    ((C1653090t7T) aObjectS185S0300000_25.l0).LIZIZ.show();
                    return;
                }
                if (Intrinsics.LJFF(((C1653090t7T) aObjectS185S0300000_25.l0).LIZIZ.getTag(), "RecordLiveScene")) {
                    C565600MGg componentizationConfig2 = ((C1653070t7R) aObjectS185S0300000_25.l1).getComponentizationConfig();
                    if (componentizationConfig2 != null && componentizationConfig2.LIZ) {
                        InterfaceC1645840svm liveApiComponent2 = ((C1653070t7R) aObjectS185S0300000_25.l1).getLiveApiComponent();
                        if (liveApiComponent2 != null) {
                            liveApiComponent2.YC2(false, true);
                        }
                    } else {
                        TikTokCameraBaseGroupScene rootScene2 = ((C1653070t7R) aObjectS185S0300000_25.l1).getRootScene();
                        if (rootScene2 != null) {
                            rootScene2.LLLLLZ(false, true);
                        }
                    }
                }
                ((C1653090t7T) aObjectS185S0300000_25.l0).LIZIZ.hide();
                ((C19A3) aObjectS185S0300000_25.l2).hide(((C1653090t7T) aObjectS185S0300000_25.l0).LIZIZ);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [T, com.ss.android.ugc.aweme.shortvideo.edit.audioedit.voicechange.vcstream.svc.SVCTask, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void onChanged$16(AObjectS185S0300000_25 aObjectS185S0300000_25, Object obj) {
        C1656120tCM c1656120tCM = (C1656120tCM) obj;
        boolean zIsFeatureEnabled = ((C1660940tK8) aObjectS185S0300000_25.l0).Cp().isFeatureEnabled();
        Effect effectRT1 = ((C1660940tK8) aObjectS185S0300000_25.l0).Cp().RT1();
        if (C123100dR.LIZ(C1664460tPo.LJIIIIZZ(effectRT1)) && zIsFeatureEnabled) {
            ((VEAudioCapture) aObjectS185S0300000_25.l1).addCaptureListener(((C1660940tK8) aObjectS185S0300000_25.l0).LLJIJIL);
            C1660940tK8 c1660940tK8 = (C1660940tK8) aObjectS185S0300000_25.l0;
            ?? W1 = c1660940tK8.W1(c1660940tK8.LLJ);
            StreamVoiceConversionModel streamVoiceConversionModel = ((C1660940tK8) aObjectS185S0300000_25.l0).getShortVideoContext().creativeModel.streamVoiceConversionModel;
            String effectId = effectRT1.getEffectId();
            String strLIZIZ = C1664460tPo.LIZIZ(effectRT1);
            if (!streamVoiceConversionModel.vcSegmentEffectIdFromMap.containsKey(effectId)) {
                streamVoiceConversionModel.vcSegmentEffectIdFromMap.put(effectId, strLIZIZ);
            }
            W1.LLJJIII = new AwS391S0200000_25((SVCTask) W1, c1656120tCM, 168);
            ((C1660940tK8) aObjectS185S0300000_25.l0).LLJIJIL.LIZIZ = W1;
            W1.LJI(effectRT1, false);
            C1663800tOk.LIZ.LIZ(W1);
            ((C259800zU) aObjectS185S0300000_25.l2).element = W1;
            return;
        }
        ((C259800zU) aObjectS185S0300000_25.l2).element = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onChanged$17(AObjectS185S0300000_25 aObjectS185S0300000_25, Object obj) {
        TimeSpeedModelExtension timeSpeedModelExtension;
        C1441190nbh c1441190nbhLIZIZ = ((C1660940tK8) aObjectS185S0300000_25.l0).getShortVideoContext().cameraComponentModel.LIZIZ();
        if (c1441190nbhLIZIZ.isEmpty()) {
            timeSpeedModelExtension = null;
        } else {
            timeSpeedModelExtension = c1441190nbhLIZIZ.get(c1441190nbhLIZIZ.size() - 1);
        }
        SVCTask sVCTask = (SVCTask) ((C259800zU) aObjectS185S0300000_25.l1).element;
        if (sVCTask != null) {
            SVCTask.LJII(sVCTask);
        }
        SVCTask sVCTask2 = (SVCTask) ((C259800zU) aObjectS185S0300000_25.l1).element;
        if (sVCTask2 != null) {
            sVCTask2.LLJ = timeSpeedModelExtension;
        }
        C2218171Brj c2218171Brj = ((C1660940tK8) aObjectS185S0300000_25.l0).LLJIJIL;
        c2218171Brj.LIZIZ = null;
        ((VEAudioCapture) aObjectS185S0300000_25.l2).removeCaptureListener(c2218171Brj);
    }

    public static final void onChanged$18(AObjectS185S0300000_25 aObjectS185S0300000_25, Object obj) {
        boolean z;
        C1648160szW c1648160szW = (C1648160szW) obj;
        if (C1660880tK2.LIZ().useRedButton && (((ShortVideoContext) aObjectS185S0300000_25.l0).LJJLL() || ((ShortVideoContext) aObjectS185S0300000_25.l0).LJJJJLL())) {
            z = true;
        } else {
            z = false;
        }
        int i = c1648160szW.LIZ;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        C1651030t49.LIZ((InterfaceC1651490t4t) aObjectS185S0300000_25.l1, EnumC1651770t5L.MICROPHONE, false);
                        return;
                    }
                    return;
                }
                C1651030t49.LIZ((InterfaceC1651490t4t) aObjectS185S0300000_25.l1, EnumC1651770t5L.MICROPHONE, true);
                return;
            }
            ((InterfaceC1651490t4t) aObjectS185S0300000_25.l1).LJ(EnumC1651770t5L.MICROPHONE, new AwS76S0210000_25(c1648160szW, z, (C1650960t42) aObjectS185S0300000_25.l2, 1));
            return;
        }
        ((InterfaceC1651490t4t) aObjectS185S0300000_25.l1).LJ(EnumC1651770t5L.MICROPHONE, new AwS604S0100000_25(c1648160szW, 591));
    }

    public static final void onChanged$19(AObjectS185S0300000_25 aObjectS185S0300000_25, Object obj) {
        C1647390syH c1647390syH = (C1647390syH) obj;
        ((InterfaceC1651490t4t) aObjectS185S0300000_25.l0).LIZ(new AwS391S0200000_25((ShortVideoContext) aObjectS185S0300000_25.l2, (C1650960t42) aObjectS185S0300000_25.l1, 208));
        C1650960t42 c1650960t42 = (C1650960t42) aObjectS185S0300000_25.l1;
        Object obj2 = c1647390syH.LIZIZ;
        if (((ArrayList) c1650960t42.LIZLLL).isEmpty()) {
            List<CharSequence> list = c1650960t42.LIZLLL;
            EnumC1647570syZ enumC1647570syZ = EnumC1647570syZ.RECORD_NOW;
            ((ArrayList) list).addAll(C1697810uHb.LJIIJJI(EnumC1647570syZ.RECORD_COMBINE.getTag(), EnumC1647570syZ.RECORD_COMBINE_15.getTag(), EnumC1647570syZ.RECORD_COMBINE_60.getTag(), enumC1647570syZ.getTag(), EnumC1647570syZ.RECORD_LIGHTENING_VIDEO.getTag()));
            c1650960t42.LJ = enumC1647570syZ.getTag();
        }
        if (((ArrayList) c1650960t42.LIZLLL).contains(obj2)) {
            boolean zLJFF = Intrinsics.LJFF(((C1650960t42) aObjectS185S0300000_25.l1).LJ, c1647390syH.LIZIZ);
            C1650960t42 c1650960t422 = (C1650960t42) aObjectS185S0300000_25.l1;
            C1650990t45 c1650990t45 = c1650960t422.LIZ;
            if (c1650990t45.LIZ != zLJFF) {
                c1650990t45.LIZ = zLJFF;
                boolean z = c1650960t422.LIZJ;
                if (z) {
                    c1650990t45.LIZ = false;
                }
                if (c1650990t45.LIZ) {
                    ((InterfaceC1651490t4t) aObjectS185S0300000_25.l0).LIZ(new AwS604S0100000_25(c1650960t422, 594));
                } else {
                    if (z) {
                        return;
                    }
                    ((InterfaceC1651490t4t) aObjectS185S0300000_25.l0).LIZ(new AwS604S0100000_25(c1650960t422, 595));
                }
            }
        }
    }

    public static final void onChanged$2(AObjectS185S0300000_25 aObjectS185S0300000_25, Object obj) {
        if (Intrinsics.LJFF(obj, Boolean.TRUE)) {
            ((C1656050tCF) aObjectS185S0300000_25.l0).LLLFZ.remove((h0) aObjectS185S0300000_25.l1);
            ((C1656050tCF) aObjectS185S0300000_25.l0).H5((C0LZD) aObjectS185S0300000_25.l2);
            ((h0) aObjectS185S0300000_25.l1).LIZIZ(aObjectS185S0300000_25);
        }
    }

    public static final void onChanged$20(AObjectS185S0300000_25 aObjectS185S0300000_25, Object obj) {
        Pair pair = (Pair) obj;
        ((C1650960t42) aObjectS185S0300000_25.l0).LIZ.LIZJ = ((InterfaceC1650230t2r) aObjectS185S0300000_25.l1).St2().getCameraController().LIZLLL();
        C1650990t45 c1650990t45 = ((C1650960t42) aObjectS185S0300000_25.l0).LIZ;
        boolean z = true;
        if (((Number) pair.getFirst()).intValue() != 1) {
            z = false;
        }
        c1650990t45.LIZIZ = z;
        ((InterfaceC1651490t4t) aObjectS185S0300000_25.l2).LIZ(new AwS391S0200000_25((C1650960t42) aObjectS185S0300000_25.l0, (InterfaceC1650230t2r) aObjectS185S0300000_25.l1, 209));
        C1459900o5s c1459900o5s = C1459900o5s.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ToolbarCreatorV2, updateFlash on cameraStateChange.isFrontCamera:");
        sbLIZ.append(((C1650960t42) aObjectS185S0300000_25.l0).LIZ.LIZIZ);
        sbLIZ.append(",torchSupport:");
        sbLIZ.append(((C1650960t42) aObjectS185S0300000_25.l0).LIZ.LIZJ);
        sbLIZ.append(",cameraType:");
        sbLIZ.append(((Number) pair.getFirst()).intValue());
        sbLIZ.append(",openState:");
        sbLIZ.append(((Boolean) pair.getSecond()).booleanValue());
        C201955140j.LIZJ(c1459900o5s, C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void onChanged$21(AObjectS185S0300000_25 aObjectS185S0300000_25, Object obj) {
        boolean z;
        Integer num = (Integer) obj;
        C1650960t42 c1650960t42 = (C1650960t42) aObjectS185S0300000_25.l0;
        InterfaceC1651490t4t interfaceC1651490t4t = (InterfaceC1651490t4t) aObjectS185S0300000_25.l1;
        if (num != null && num.intValue() == 0) {
            z = false;
        } else {
            z = true;
        }
        if (C1651000t46.LIZ(c1650960t42.LIZ)) {
            interfaceC1651490t4t.LJ(EnumC1651770t5L.FLASH, new AwS111S0110000_25(z, c1650960t42, 19));
        }
        if (C343070Dcf.LIZIZ()) {
            InterfaceC1651080t4E interfaceC1651080t4E = (InterfaceC1651080t4E) C579830Mof.LIZ((C1DRG) aObjectS185S0300000_25.l2, InterfaceC1651080t4E.class);
            if (interfaceC1651080t4E != null) {
                interfaceC1651080t4E.vv();
                return;
            }
            return;
        }
        ((InterfaceC1651080t4E) ((C1DRG) aObjectS185S0300000_25.l2).LJII(InterfaceC1651080t4E.class, null)).vv();
    }

    public static final void onChanged$22(AObjectS185S0300000_25 aObjectS185S0300000_25, Object obj) {
        Integer num = (Integer) obj;
        if (!((InterfaceC1650230t2r) aObjectS185S0300000_25.l0).Ue()) {
            ((InterfaceC1651490t4t) aObjectS185S0300000_25.l1).LJ(EnumC1651770t5L.FLASH, new AwS391S0200000_25(num, (C1650960t42) aObjectS185S0300000_25.l2, 212));
        }
    }

    public static final void onChanged$23(AObjectS185S0300000_25 aObjectS185S0300000_25, Object obj) {
        Integer num = (Integer) obj;
        if (num != null) {
            if (num.intValue() == 1) {
                ((SafeHandler) aObjectS185S0300000_25.l0).post(new ARunnableS94S0200000_25((InterfaceC1651490t4t) aObjectS185S0300000_25.l1, (C1650960t42) aObjectS185S0300000_25.l2, 23));
                return;
            } else if (num.intValue() == 2) {
                ((SafeHandler) aObjectS185S0300000_25.l0).post(new ARunnableS94S0200000_25((InterfaceC1651490t4t) aObjectS185S0300000_25.l1, (C1650960t42) aObjectS185S0300000_25.l2, 24));
                return;
            }
        }
        C1651030t49.LIZIZ((InterfaceC1651490t4t) aObjectS185S0300000_25.l1, EnumC1651770t5L.DUET_LAYOUT, false);
    }

    public static final void onChanged$24(AObjectS185S0300000_25 aObjectS185S0300000_25, Object obj) {
        q qVar;
        InterfaceC1624480sNK interfaceC1624480sNKC0;
        p pVarLJJJJIZL;
        Effect effect = (Effect) obj;
        if (effect != null) {
            if (C1621360sII.LIZ() && (qVar = ((l) aObjectS185S0300000_25.l0).LL) != null && (interfaceC1624480sNKC0 = qVar.C0()) != null && (pVarLJJJJIZL = interfaceC1624480sNKC0.LJJJJIZL()) != null && pVarLJJJJIZL.LJ(effect, null)) {
                ((l) aObjectS185S0300000_25.l0).LIZIZ((C1322110kVd) aObjectS185S0300000_25.l1, effect);
                ((l) aObjectS185S0300000_25.l0).LIZ((TuxIconView) aObjectS185S0300000_25.l2, effect);
            } else {
                if (C1621360sII.LIZ()) {
                    return;
                }
                ((l) aObjectS185S0300000_25.l0).LIZIZ((C1322110kVd) aObjectS185S0300000_25.l1, effect);
                ((l) aObjectS185S0300000_25.l0).LIZ((TuxIconView) aObjectS185S0300000_25.l2, effect);
            }
        }
    }

    public static final void onChanged$25(AObjectS185S0300000_25 aObjectS185S0300000_25, Object obj) {
        ((C1650750t3h) aObjectS185S0300000_25.l0).LIZ.LIZIZ = false;
        ArrayList arrayList = new ArrayList();
        arrayList.add(((C1650630t3V) aObjectS185S0300000_25.l1).LJII.getValue());
        InterfaceC1650770t3j interfaceC1650770t3j = (InterfaceC1650770t3j) ((C1DRG) aObjectS185S0300000_25.l2).LJII(InterfaceC1650770t3j.class, null);
        interfaceC1650770t3j.Cl(arrayList);
        interfaceC1650770t3j.jc(C1650750t3h.LIZ());
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$26(Y.AObjectS185S0300000_25 r6, java.lang.Object r7) {
        /*
            java.lang.Object r5 = r6.l0
            X.0t3h r5 = (X.C1650750t3h) r5
            java.lang.Object r0 = r6.l1
            X.0t3V r0 = (X.C1650630t3V) r0
            X.01GW r0 = r0.LJIIIZ
            java.lang.Object r4 = r0.getValue()
            X.0t44 r4 = (X.C1650980t44) r4
            java.lang.Object r0 = r6.l0
            X.0t3h r0 = (X.C1650750t3h) r0
            X.0t2r r0 = r0.LIZIZ
            r2 = 0
            if (r0 != 0) goto L1a
            r0 = r2
        L1a:
            boolean r0 = r0.n()
            r3 = 0
            if (r0 == 0) goto Lbb
            java.lang.Object r0 = r6.l0
            X.0t3h r0 = (X.C1650750t3h) r0
            X.0t2r r0 = r0.LIZIZ
            if (r0 != 0) goto L2a
            r0 = r2
        L2a:
            boolean r0 = r0.KY()
            if (r0 == 0) goto Lbb
            r0 = 0
        L31:
            java.lang.Object r1 = r6.l2
            X.1DRG r1 = (X.C1DRG) r1
            r5.getClass()
            r4.LLILZLL = r0
            if (r0 != 0) goto L41
            r0 = 2130772822(0x7f010356, float:1.7148773E38)
            r4.LLILLL = r0
        L41:
            java.lang.Class<X.0t3j> r0 = X.InterfaceC1650770t3j.class
            java.lang.Object r0 = r1.LJII(r0, r2)
            X.0t3j r0 = (X.InterfaceC1650770t3j) r0
            r0.m2(r4)
            java.lang.Object r1 = r6.l0
            X.0t3h r1 = (X.C1650750t3h) r1
            X.0t3k r0 = r1.LIZ
            X.0t2r r1 = r1.LIZIZ
            if (r1 != 0) goto L57
            r1 = r2
        L57:
            boolean r0 = r0.LIZ
            r1.WE1(r0, r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            kotlin.jvm.internal.AwS390S0200000_24 r1 = new kotlin.jvm.internal.AwS390S0200000_24
            r0 = 95
            r1.<init>(r4, r3, r0)
            java.lang.Object r1 = r6.l2
            X.1DRG r1 = (X.C1DRG) r1
            java.lang.Class<X.0t3j> r0 = X.InterfaceC1650770t3j.class
            java.lang.Object r0 = r1.LJII(r0, r2)
            X.0t3j r0 = (X.InterfaceC1650770t3j) r0
            r0.LLLZ(r4)
            java.lang.Object r1 = r6.l2
            X.1DRG r1 = (X.C1DRG) r1
            java.lang.Class<X.0t3j> r0 = X.InterfaceC1650770t3j.class
            java.lang.Object r0 = r1.LJII(r0, r2)
            X.0t3j r0 = (X.InterfaceC1650770t3j) r0
            r0.Cl(r3)
            java.lang.Object r1 = r6.l2
            X.1DRG r1 = (X.C1DRG) r1
            java.lang.Class<X.0t3j> r0 = X.InterfaceC1650770t3j.class
            java.lang.Object r1 = r1.LJII(r0, r2)
            X.0t3j r1 = (X.InterfaceC1650770t3j) r1
            int r0 = X.C1650750t3h.LIZ()
            r1.jc(r0)
            java.lang.Object r0 = r6.l0
            X.0t3h r0 = (X.C1650750t3h) r0
            X.0t2r r0 = r0.LIZIZ
            if (r0 != 0) goto La7
            r0 = r2
        La7:
            boolean r0 = r0.db()
            if (r0 == 0) goto Lba
            java.lang.Object r0 = r6.l0
            X.0t3h r0 = (X.C1650750t3h) r0
            X.0t2r r0 = r0.LIZIZ
            if (r0 == 0) goto Lb6
            r2 = r0
        Lb6:
            r0 = 5
            r2.CK2(r0)
        Lba:
            return
        Lbb:
            r0 = 1
            goto L31
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObjectS185S0300000_25.onChanged$26(Y.AObjectS185S0300000_25, java.lang.Object):void");
    }

    public static final void onChanged$27(AObjectS185S0300000_25 aObjectS185S0300000_25, Object obj) {
        C1650750t3h c1650750t3h = (C1650750t3h) aObjectS185S0300000_25.l0;
        Object obj2 = ((C1647390syH) obj).LIZIZ;
        if (c1650750t3h.LJI == null) {
            List listLJIIJJI = C1697810uHb.LJIIJJI(EnumC1647570syZ.RECORD_COMBINE.getTag(), EnumC1647570syZ.RECORD_COMBINE_15.getTag(), EnumC1647570syZ.RECORD_COMBINE_60.getTag(), EnumC1647570syZ.PHOTO_SHORT.getTag());
            ArrayList arrayList = new ArrayList();
            Iterator it2 = listLJIIJJI.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
            c1650750t3h.LJI = arrayList;
            EnumC1647570syZ.PHOTO_SHORT.getTag();
        }
        List<? extends CharSequence> list = c1650750t3h.LJI;
        if (list == null) {
            list = null;
        }
        if (list.contains(obj2)) {
            InterfaceC1650230t2r interfaceC1650230t2r = ((C1650750t3h) aObjectS185S0300000_25.l0).LIZIZ;
            if (interfaceC1650230t2r == null) {
                interfaceC1650230t2r = null;
            }
            boolean zUe = interfaceC1650230t2r.Ue();
            C1650750t3h c1650750t3h2 = (C1650750t3h) aObjectS185S0300000_25.l0;
            C1650780t3k c1650780t3k = c1650750t3h2.LIZ;
            InterfaceC1650230t2r interfaceC1650230t2r2 = c1650750t3h2.LIZIZ;
            if (interfaceC1650230t2r2 == null) {
                interfaceC1650230t2r2 = null;
            }
            interfaceC1650230t2r2.WE1(zUe, false);
            c1650780t3k.getClass();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            AwS390S0200000_24 awS390S0200000_24 = new AwS390S0200000_24(arrayList2, (List<C1650980t44>) arrayList3, (List<C1650980t44>) 97);
            arrayList2.add(((C1650630t3V) aObjectS185S0300000_25.l1).LIZJ.getValue());
            ((List) awS390S0200000_24.invoke(Boolean.valueOf(((C1650750t3h) aObjectS185S0300000_25.l0).LIZ.LIZIZ))).add(((C1650630t3V) aObjectS185S0300000_25.l1).LJII.getValue());
            arrayList2.add(((C1650630t3V) aObjectS185S0300000_25.l1).LJI.getValue());
            ((InterfaceC1650770t3j) ((C1DRG) aObjectS185S0300000_25.l2).LJII(InterfaceC1650770t3j.class, null)).LLLZ(arrayList2);
            ((InterfaceC1650770t3j) ((C1DRG) aObjectS185S0300000_25.l2).LJII(InterfaceC1650770t3j.class, null)).Cl(arrayList3);
            ((InterfaceC1650770t3j) ((C1DRG) aObjectS185S0300000_25.l2).LJII(InterfaceC1650770t3j.class, null)).jc(C1650750t3h.LIZ());
        }
    }

    public static final void onChanged$28(AObjectS185S0300000_25 aObjectS185S0300000_25, Object obj) {
        ((C1650750t3h) aObjectS185S0300000_25.l0).LIZ.LIZIZ = true;
        ArrayList arrayList = new ArrayList();
        ShortVideoContext shortVideoContext = ((C1650750t3h) aObjectS185S0300000_25.l0).LIZLLL;
        if (shortVideoContext == null) {
            shortVideoContext = null;
        }
        if (!shortVideoContext.LJJJJLL()) {
            arrayList.add(((C1650630t3V) aObjectS185S0300000_25.l1).LJII.getValue());
        }
        InterfaceC1650770t3j interfaceC1650770t3j = (InterfaceC1650770t3j) ((C1DRG) aObjectS185S0300000_25.l2).LJII(InterfaceC1650770t3j.class, null);
        interfaceC1650770t3j.LLLZ(arrayList);
        interfaceC1650770t3j.jc(C1650750t3h.LIZ());
    }

    public static final void onChanged$3(AObjectS185S0300000_25 aObjectS185S0300000_25, Object obj) {
        if (Intrinsics.LJFF(obj, Boolean.TRUE)) {
            ((C1656050tCF) aObjectS185S0300000_25.l0).LLLFZ.remove((h0) aObjectS185S0300000_25.l1);
            ((C1656050tCF) aObjectS185S0300000_25.l0).M5((Function1) aObjectS185S0300000_25.l2);
            ((h0) aObjectS185S0300000_25.l1).LIZIZ(aObjectS185S0300000_25);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$4(Y.AObjectS185S0300000_25 r6, java.lang.Object r7) {
        /*
            X.0szW r7 = (X.C1648160szW) r7
            java.lang.Object r0 = r6.l0
            X.0t3O r0 = (X.C1650560t3O) r0
            X.0t44 r4 = r0.LJIIJ()
            com.ss.android.ugc.gamora.editor.audioservice.service.experiment.EnableLoudNormAndAlignInDuetConfig r0 = X.C1660880tK2.LIZ()
            boolean r0 = r0.useRedButton
            r3 = 1
            r5 = 0
            if (r0 == 0) goto L74
            java.lang.Object r0 = r6.l1
            X.0t47 r0 = (X.C1651010t47) r0
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r0.LJ
            r1 = 0
            if (r0 != 0) goto L1e
            r0 = r1
        L1e:
            boolean r0 = r0.LJJLL()
            if (r0 != 0) goto L33
            java.lang.Object r0 = r6.l1
            X.0t47 r0 = (X.C1651010t47) r0
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r0.LJ
            if (r0 == 0) goto L2d
            r1 = r0
        L2d:
            boolean r0 = r1.LJJJJLL()
            if (r0 == 0) goto L74
        L33:
            r2 = 1
        L34:
            int r1 = r7.LIZ
            if (r1 == r3) goto L65
            r0 = 2
            if (r1 == r0) goto L55
            r0 = 3
            if (r1 == r0) goto L52
            r0 = 4
            if (r1 != r0) goto L43
            r4.LLILZLL = r5
        L43:
            java.lang.Object r1 = r6.l1
            X.0t47 r1 = (X.C1651010t47) r1
            java.lang.Object r0 = r6.l2
            X.1DRG r0 = (X.C1DRG) r0
            r1.getClass()
            X.C1651010t47.LIZLLL(r0, r4, r3)
            return
        L52:
            r4.LLILZLL = r3
            goto L43
        L55:
            r4.LLJ = r5
            int r0 = X.C577500Mku.LJFF(r1)
            r4.LLILLL = r0
            if (r2 == 0) goto L62
            r5 = 2131100559(0x7f06038f, float:1.7813503E38)
        L62:
            r4.LLILZ = r5
            goto L43
        L65:
            boolean r0 = r4.LLILZLL
            if (r0 == 0) goto L43
            r4.LLJ = r5
            int r0 = X.C577500Mku.LJFF(r1)
            r4.LLILLL = r0
            r4.LLILZ = r5
            goto L43
        L74:
            r2 = 0
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObjectS185S0300000_25.onChanged$4(Y.AObjectS185S0300000_25, java.lang.Object):void");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final void onChanged$5(AObjectS185S0300000_25 aObjectS185S0300000_25, Object obj) {
        String strLJ;
        String strLIZ;
        C1647390syH c1647390syH = (C1647390syH) obj;
        C1650980t44 c1650980t44LJFF = ((C1650560t3O) aObjectS185S0300000_25.l0).LJFF();
        ShortVideoContext shortVideoContext = ((C1651010t47) aObjectS185S0300000_25.l1).LJ;
        ShortVideoContext shortVideoContext2 = null;
        if (shortVideoContext == null) {
            shortVideoContext = null;
        }
        String strLJIJJLI = shortVideoContext.LJIJJLI();
        switch (strLJIJJLI.hashCode()) {
            case 1151385704:
                strLJ = !strLJIJJLI.equals("video_15") ? null : ((C1650560t3O) aObjectS185S0300000_25.l0).LJ(15);
                break;
            case 1151385854:
                strLJ = !strLJIJJLI.equals("video_60") ? null : ((C1650560t3O) aObjectS185S0300000_25.l0).LJ(60);
                break;
            case 1333218597:
                strLJ = !strLJIJJLI.equals("video_180") ? null : ((C1650560t3O) aObjectS185S0300000_25.l0).LJ(180);
                break;
            case 1333223154:
                strLJ = !strLJIJJLI.equals("video_600") ? null : ((C1650560t3O) aObjectS185S0300000_25.l0).LJ(600);
                break;
            default:
                strLJ = null;
                break;
        }
        c1650980t44LJFF.LLJJJ = strLJ;
        C1651010t47 c1651010t47 = (C1651010t47) aObjectS185S0300000_25.l1;
        C1DRG c1drg = (C1DRG) aObjectS185S0300000_25.l2;
        C1650980t44 c1650980t44LJFF2 = ((C1650560t3O) aObjectS185S0300000_25.l0).LJFF();
        c1651010t47.getClass();
        C1651010t47.LIZLLL(c1drg, c1650980t44LJFF2, false);
        C1650980t44 c1650980t44LJIIIZ = ((C1650560t3O) aObjectS185S0300000_25.l0).LJIIIZ();
        if (((C1650560t3O) aObjectS185S0300000_25.l0).LJIIIZ().LLJ) {
            strLIZ = ((C1650560t3O) aObjectS185S0300000_25.l0).LIZ(2131824459);
        } else {
            strLIZ = ((C1650560t3O) aObjectS185S0300000_25.l0).LIZ(2131824458);
        }
        c1650980t44LJIIIZ.LLJJJ = strLIZ;
        C1651010t47 c1651010t472 = (C1651010t47) aObjectS185S0300000_25.l1;
        C1DRG c1drg2 = (C1DRG) aObjectS185S0300000_25.l2;
        C1650980t44 c1650980t44LJIIIZ2 = ((C1650560t3O) aObjectS185S0300000_25.l0).LJIIIZ();
        c1651010t472.getClass();
        C1651010t47.LIZLLL(c1drg2, c1650980t44LJIIIZ2, false);
        C1DRG c1drg3 = (C1DRG) aObjectS185S0300000_25.l2;
        if (C343070Dcf.LIZ()) {
            ((C0ETY) c1drg3.LJII(C0ETY.class, null)).Sd(InterfaceC1651080t4E.class, new AwS265S0000000_25(15));
        } else {
            C05YF c05yf = (C05YF) c1drg3.LJIIL(null, InterfaceC1651080t4E.class);
            if (c05yf != null) {
                ((InterfaceC1651080t4E) c05yf).XI0().notifyDataSetChanged();
            }
        }
        C1651010t47 c1651010t473 = (C1651010t47) aObjectS185S0300000_25.l1;
        Object obj2 = c1647390syH.LIZIZ;
        if (c1651010t473.LJIIIIZZ == null) {
            List listLJIIJJI = C1697810uHb.LJIIJJI(EnumC1647570syZ.RECORD_COMBINE.getTag(), EnumC1647570syZ.RECORD_COMBINE_15.getTag(), EnumC1647570syZ.RECORD_COMBINE_60.getTag(), EnumC1647570syZ.PHOTO_SHORT.getTag(), EnumC1647570syZ.RECORD_LIGHTENING_VIDEO.getTag());
            ArrayList arrayList = new ArrayList();
            Iterator it2 = listLJIIJJI.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
            c1651010t473.LJIIIIZZ = arrayList;
            c1651010t473.LJIIIZ = EnumC1647570syZ.PHOTO_SHORT.getTag();
        }
        List<? extends CharSequence> list = c1651010t473.LJIIIIZZ;
        if (list == null) {
            list = null;
        }
        if (list.contains(obj2)) {
            C1651010t47 c1651010t474 = (C1651010t47) aObjectS185S0300000_25.l1;
            Object obj3 = c1647390syH.LIZIZ;
            String str = c1651010t474.LJIIIZ;
            if (str == null) {
                str = null;
            }
            boolean zLJFF = Intrinsics.LJFF(str, obj3);
            C1651010t47 c1651010t475 = (C1651010t47) aObjectS185S0300000_25.l1;
            C1650990t45 c1650990t45 = c1651010t475.LIZ;
            if (c1650990t45.LIZ != zLJFF) {
                c1650990t45.LIZ = zLJFF;
                if (((Boolean) c1651010t475.LJII.getValue()).booleanValue()) {
                    c1651010t475.LIZ.LIZ = false;
                }
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                C1651010t47 c1651010t476 = (C1651010t47) aObjectS185S0300000_25.l1;
                if (c1651010t476.LIZ.LIZ) {
                    arrayList3.add(((C1650560t3O) aObjectS185S0300000_25.l0).LJIILJJIL());
                    ShortVideoContext shortVideoContext3 = ((C1651010t47) aObjectS185S0300000_25.l1).LJ;
                    if (shortVideoContext3 != null) {
                        shortVideoContext2 = shortVideoContext3;
                    }
                    if (d4.LJJIJIIJI(shortVideoContext2)) {
                        arrayList3.add(((C1650560t3O) aObjectS185S0300000_25.l0).LJIILL());
                    }
                    arrayList3.add(((C1650560t3O) aObjectS185S0300000_25.l0).LJFF());
                } else {
                    if (((Boolean) c1651010t476.LJII.getValue()).booleanValue()) {
                        return;
                    }
                    arrayList2.add(((C1650560t3O) aObjectS185S0300000_25.l0).LJIILJJIL());
                    ShortVideoContext shortVideoContext4 = ((C1651010t47) aObjectS185S0300000_25.l1).LJ;
                    if (shortVideoContext4 != null) {
                        shortVideoContext2 = shortVideoContext4;
                    }
                    if (d4.LJJIJIIJI(shortVideoContext2)) {
                        arrayList2.add(((C1650560t3O) aObjectS185S0300000_25.l0).LJIILL());
                    }
                    arrayList2.add(((C1650560t3O) aObjectS185S0300000_25.l0).LJFF());
                }
                ((List) new AwS390S0200000_24(arrayList2, (List<C1650980t44>) arrayList3, (List<C1650980t44>) 47).invoke(Boolean.valueOf(C1651000t46.LIZ(((C1651010t47) aObjectS185S0300000_25.l1).LIZ)))).add(((C1650560t3O) aObjectS185S0300000_25.l0).LJIIIIZZ());
                C1651010t47 c1651010t477 = (C1651010t47) aObjectS185S0300000_25.l1;
                C1DRG c1drg4 = (C1DRG) aObjectS185S0300000_25.l2;
                c1651010t477.getClass();
                C1651010t47.LIZIZ(c1drg4, arrayList2, arrayList3);
            }
        }
    }

    public static final void onChanged$6(AObjectS185S0300000_25 aObjectS185S0300000_25, Object obj) {
        Boolean bool = (Boolean) obj;
        C1650980t44 c1650980t44LJIIJJI = ((C1650560t3O) aObjectS185S0300000_25.l0).LJIIJJI();
        if (!Intrinsics.LJFF(Boolean.valueOf(c1650980t44LJIIJJI.LLILZLL), bool)) {
            c1650980t44LJIIJJI.LLILZLL = bool.booleanValue();
            C1651010t47 c1651010t47 = (C1651010t47) aObjectS185S0300000_25.l1;
            C1DRG c1drg = (C1DRG) aObjectS185S0300000_25.l2;
            c1651010t47.getClass();
            C1651010t47.LIZLLL(c1drg, c1650980t44LJIIJJI, true);
        }
    }

    public static final void onChanged$7(AObjectS185S0300000_25 aObjectS185S0300000_25, Object obj) {
        Boolean bool = (Boolean) obj;
        C1650980t44 c1650980t44LJIIJJI = ((C1650560t3O) aObjectS185S0300000_25.l0).LJIIJJI();
        if (!Intrinsics.LJFF(Boolean.valueOf(c1650980t44LJIIJJI.LLILZLL), bool) || !Intrinsics.LJFF(Boolean.valueOf(c1650980t44LJIIJJI.LLJJIJI), bool)) {
            c1650980t44LJIIJJI.LLILZLL = bool.booleanValue();
            c1650980t44LJIIJJI.LLJJIJI = bool.booleanValue();
            if (bool.booleanValue()) {
                c1650980t44LJIIJJI.LLJILLL = false;
            }
            C1651010t47 c1651010t47 = (C1651010t47) aObjectS185S0300000_25.l1;
            C1DRG c1drg = (C1DRG) aObjectS185S0300000_25.l2;
            c1651010t47.getClass();
            C1651010t47.LIZLLL(c1drg, c1650980t44LJIIJJI, true);
        }
    }

    public static final void onChanged$8(AObjectS185S0300000_25 aObjectS185S0300000_25, Object obj) {
        Pair pair = (Pair) obj;
        C1651010t47 c1651010t47 = (C1651010t47) aObjectS185S0300000_25.l0;
        C1650990t45 c1650990t45 = c1651010t47.LIZ;
        InterfaceC1650230t2r interfaceC1650230t2r = c1651010t47.LIZIZ;
        InterfaceC1650230t2r interfaceC1650230t2r2 = null;
        if (interfaceC1650230t2r == null) {
            interfaceC1650230t2r = null;
        }
        c1650990t45.LIZJ = interfaceC1650230t2r.St2().getCameraController().LIZLLL();
        C1650990t45 c1650990t452 = ((C1651010t47) aObjectS185S0300000_25.l0).LIZ;
        boolean z = true;
        if (((Number) pair.getFirst()).intValue() != 1) {
            z = false;
        }
        c1650990t452.LIZIZ = z;
        C1650980t44 c1650980t44LJIIJJI = ((C1650560t3O) aObjectS185S0300000_25.l1).LJIIJJI();
        C1650560t3O c1650560t3O = (C1650560t3O) aObjectS185S0300000_25.l1;
        InterfaceC1650230t2r interfaceC1650230t2r3 = ((C1651010t47) aObjectS185S0300000_25.l0).LIZIZ;
        if (interfaceC1650230t2r3 != null) {
            interfaceC1650230t2r2 = interfaceC1650230t2r3;
        }
        c1650980t44LJIIJJI.LLJJJ = c1650560t3O.LJIIL(interfaceC1650230t2r2.Ue());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ((List) new AwS390S0200000_24(arrayList, (List<C1650980t44>) arrayList2, (List<C1650980t44>) 48).invoke(Boolean.valueOf(C1651000t46.LIZ(((C1651010t47) aObjectS185S0300000_25.l0).LIZ)))).add(((C1650560t3O) aObjectS185S0300000_25.l1).LJIIIIZZ());
        C1651010t47 c1651010t472 = (C1651010t47) aObjectS185S0300000_25.l0;
        C1DRG c1drg = (C1DRG) aObjectS185S0300000_25.l2;
        c1651010t472.getClass();
        C1651010t47.LIZIZ(c1drg, arrayList, arrayList2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ToolbarCreator,updateFlash on cameraStateChange.isFrontCamera:");
        sbLIZ.append(((C1651010t47) aObjectS185S0300000_25.l0).LIZ.LIZIZ);
        sbLIZ.append(",torchSupport:");
        sbLIZ.append(((C1651010t47) aObjectS185S0300000_25.l0).LIZ.LIZJ);
        sbLIZ.append(",cameraType:");
        sbLIZ.append(((Number) pair.getFirst()).intValue());
        sbLIZ.append(",openState:");
        sbLIZ.append(((Boolean) pair.getSecond()).booleanValue());
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void onChanged$9(AObjectS185S0300000_25 aObjectS185S0300000_25, Object obj) {
        pyl.q qVar = (pyl.q) obj;
        ShortVideoContext shortVideoContext = ((C1651010t47) aObjectS185S0300000_25.l0).LJ;
        InterfaceC1650230t2r interfaceC1650230t2r = null;
        if (shortVideoContext == null) {
            shortVideoContext = null;
        }
        if (!C1443960ngA.LJIIL(shortVideoContext)) {
            if (qVar.LIZ) {
                InterfaceC1650230t2r interfaceC1650230t2r2 = ((C1651010t47) aObjectS185S0300000_25.l0).LIZIZ;
                if (interfaceC1650230t2r2 == null) {
                    interfaceC1650230t2r2 = null;
                }
                interfaceC1650230t2r2.QK(false);
                ShortVideoContext shortVideoContext2 = ((C1651010t47) aObjectS185S0300000_25.l0).LJ;
                if (shortVideoContext2 == null) {
                    shortVideoContext2 = null;
                }
                shortVideoContext2.isAIEnhanceOn = false;
            }
            C1651010t47 c1651010t47 = (C1651010t47) aObjectS185S0300000_25.l0;
            c1651010t47.LIZ.LIZIZ = qVar.LIZ;
            if (((Boolean) c1651010t47.LJII.getValue()).booleanValue()) {
                c1651010t47.LIZ.LIZ = false;
            }
            C1650980t44 c1650980t44LJIIIIZZ = ((C1650560t3O) aObjectS185S0300000_25.l1).LJIIIIZZ();
            C1651010t47 c1651010t472 = (C1651010t47) aObjectS185S0300000_25.l0;
            C1DRG c1drg = (C1DRG) aObjectS185S0300000_25.l2;
            c1651010t472.getClass();
            C1651010t47.LIZLLL(c1drg, c1650980t44LJIIIIZZ, false);
            C1650980t44 c1650980t44LJIIJJI = ((C1650560t3O) aObjectS185S0300000_25.l1).LJIIJJI();
            c1650980t44LJIIJJI.LLJILLL = qVar.LIZIZ;
            C1650560t3O c1650560t3O = (C1650560t3O) aObjectS185S0300000_25.l1;
            InterfaceC1650230t2r interfaceC1650230t2r3 = ((C1651010t47) aObjectS185S0300000_25.l0).LIZIZ;
            if (interfaceC1650230t2r3 != null) {
                interfaceC1650230t2r = interfaceC1650230t2r3;
            }
            c1650980t44LJIIJJI.LLJJJ = c1650560t3O.LJIIL(interfaceC1650230t2r.Ue());
            C1651010t47 c1651010t473 = (C1651010t47) aObjectS185S0300000_25.l0;
            C1DRG c1drg2 = (C1DRG) aObjectS185S0300000_25.l2;
            c1651010t473.getClass();
            C1651010t47.LIZLLL(c1drg2, c1650980t44LJIIJJI, false);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            new AwS390S0200000_24(arrayList, (List<C1650980t44>) arrayList2, (List<C1650980t44>) 49);
            C1651010t47 c1651010t474 = (C1651010t47) aObjectS185S0300000_25.l0;
            C1DRG c1drg3 = (C1DRG) aObjectS185S0300000_25.l2;
            c1651010t474.getClass();
            C1651010t47.LIZIZ(c1drg3, arrayList, arrayList2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ToolbarCreator,updateFlash onFrontRearChange.isFrontCamera:");
            sbLIZ.append(((C1651010t47) aObjectS185S0300000_25.l0).LIZ.LIZIZ);
            sbLIZ.append(",torchSupport:");
            sbLIZ.append(((C1651010t47) aObjectS185S0300000_25.l0).LIZ.LIZJ);
            C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AObjectS185S0300000_25(X.C1DRG r2, X.C1651010t47 r3, X.C1650560t3O r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            switch(r5) {
                case 4: goto L18;
                case 5: goto L18;
                case 6: goto L18;
                case 7: goto L18;
                case 8: goto L10;
                case 9: goto L10;
                case 10: goto L5;
                case 11: goto L5;
                case 12: goto L10;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
            r0.l2 = r4
        Lc:
            r0.<init>()
            return
        L10:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r4
            r0.l2 = r2
            goto Lc
        L18:
            r0 = r1
            r0.l0 = r4
            r0.l1 = r3
            r0.l2 = r2
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObjectS185S0300000_25.<init>(X.1DRG, X.0t47, X.0t3O, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AObjectS185S0300000_25(X.InterfaceC1650230t2r r2, X.C1650960t42 r3, X.InterfaceC1651490t4t r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            int r5 = 20 - r5
            if (r5 == 0) goto L11
            r0 = r1
            r0.l0 = r2
            r0.l1 = r4
            r0.l2 = r3
        Ld:
            r0.<init>()
            return
        L11:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
            r0.l2 = r4
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObjectS185S0300000_25.<init>(X.0t2r, X.0t42, X.0t4t, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AObjectS185S0300000_25(X.C1660940tK8 r2, X.C1660940tK8 r3, com.ss.android.vesdk.VEAudioCapture r4, X.C259800zU<com.ss.android.ugc.aweme.shortvideo.edit.audioedit.voicechange.vcstream.svc.SVCTask> r5) {
        /*
            r1 = this;
            r1.$t = r5
            int r5 = 16 - r5
            if (r5 == 0) goto L11
            r0 = r1
            r0.l0 = r2
            r0.l1 = r4
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
        throw new UnsupportedOperationException("Method not decompiled: Y.AObjectS185S0300000_25.<init>(X.0tK8, com.ss.android.vesdk.VEAudioCapture, X.00zU, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AObjectS185S0300000_25(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r2, X.C1650960t42 r3, X.InterfaceC1651490t4t r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            int r5 = 18 - r5
            if (r5 == 0) goto L11
            r0 = r1
            r0.l0 = r4
            r0.l1 = r3
            r0.l2 = r2
        Ld:
            r0.<init>()
            return
        L11:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r4
            r0.l2 = r3
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObjectS185S0300000_25.<init>(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext, X.0t42, X.0t4t, int):void");
    }

    public AObjectS185S0300000_25(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj3;
        this.l2 = obj;
    }
}
