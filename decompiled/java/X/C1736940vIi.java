package X;

import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.prop.mobileefffect.EditImageEffectImgCreatorData;
import com.ss.android.ugc.aweme.prop.mobileefffect.edit.EffectEditIconV2Assem;
import com.ss.android.ugc.aweme.prop.mobileefffect.edit.EffectEditV2VM;
import com.ss.android.ugc.aweme.prop.mobileefffect.hint.EffectIconAutoApplyHintFragment;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffectIcon;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS76S1000000_26;

/* JADX INFO: renamed from: X.0vIi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1736940vIi extends C09AY implements Function2<UIAssem, C291001Au<? extends List<? extends MobileEffectIcon>>, Unit> {
    public final /* synthetic */ EffectEditIconV2Assem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1736940vIi(EffectEditIconV2Assem effectEditIconV2Assem) {
        super(2);
        this.LL = effectEditIconV2Assem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, C291001Au<? extends List<? extends MobileEffectIcon>> c291001Au) {
        boolean z;
        String str;
        boolean z2;
        FragmentManager childFragmentManager;
        MobileEffectIcon mobileEffectIcon;
        MobileEffectIcon mobileEffectIcon2;
        NewFaceStickerBean newFaceStickerBean;
        String str2;
        String string;
        C291001Au<? extends List<? extends MobileEffectIcon>> c291001Au2 = c291001Au;
        if (c291001Au2 != null) {
            List list = (List) c291001Au2.LIZ;
            EffectEditIconV2Assem effectEditIconV2Assem = this.LL;
            effectEditIconV2Assem.getClass();
            if (list != null && !list.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            String str3 = "";
            if (z) {
                EffectEditV2VM effectEditV2VMMp = effectEditIconV2Assem.mp();
                EnumC1736950vIj enumC1736950vIj = EnumC1736950vIj.EFFECT_ICON_FEMALE;
                int[] iArr = C1736890vId.LIZ;
                int i = iArr[enumC1736950vIj.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        effectEditV2VMMp.setState(AFwS268S0000000_26.get$arr$(452));
                    }
                } else {
                    effectEditV2VMMp.setState(AFwS268S0000000_26.get$arr$(451));
                }
                EffectEditV2VM effectEditV2VMMp2 = effectEditIconV2Assem.mp();
                int i2 = iArr[EnumC1736950vIj.EFFECT_ICON_MALE.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        effectEditV2VMMp2.setState(AFwS268S0000000_26.get$arr$(452));
                    }
                } else {
                    effectEditV2VMMp2.setState(AFwS268S0000000_26.get$arr$(451));
                }
            } else {
                ArrayList arrayList = new ArrayList(list);
                int size = arrayList.size();
                List<MobileEffectIcon> listSubList = arrayList;
                if (size > 2) {
                    listSubList = arrayList.subList(0, 2);
                }
                int i3 = 0;
                for (Object obj : listSubList) {
                    int i4 = i3 + 1;
                    if (i3 >= 0) {
                        MobileEffectIcon mobileEffectIcon3 = (MobileEffectIcon) obj;
                        if (i3 == 0) {
                            String str4 = mobileEffectIcon3.scene;
                            if (str4 == null || str4.length() == 0) {
                                mobileEffectIcon3.scene = EnumC1736950vIj.EFFECT_ICON_FEMALE.getTypeVal();
                            }
                        } else if (i3 == 1 && ((str2 = mobileEffectIcon3.scene) == null || str2.length() == 0)) {
                            mobileEffectIcon3.scene = EnumC1736950vIj.EFFECT_ICON_MALE.getTypeVal();
                        }
                        i3 = i4;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                if (listSubList.size() == 1 && ((C1737900vKG.LJIJJ(effectEditIconV2Assem.lp().sdkExtra) || ((newFaceStickerBean = effectEditIconV2Assem.kp().effect) != null && newFaceStickerBean.effectSource == 101)) && (mobileEffectIcon2 = (MobileEffectIcon) C13LP.LJJJLL(listSubList)) != null)) {
                    listSubList.add(new MobileEffectIcon(mobileEffectIcon2.list, EffectEditIconV2Assem.ip(mobileEffectIcon2.scene).getTypeVal(), mobileEffectIcon2.iconAssetId, mobileEffectIcon2.isLokiMaterial));
                }
                if (listSubList.size() == 1 && (mobileEffectIcon = (MobileEffectIcon) C13LP.LJJJLL(listSubList)) != null) {
                    listSubList.add(new MobileEffectIcon(C13BV.INSTANCE, EffectEditIconV2Assem.ip(mobileEffectIcon.scene).getTypeVal(), null, false, 12, null));
                }
                for (MobileEffectIcon mobileEffectIcon4 : listSubList) {
                    EffectEditV2VM effectEditV2VMMp3 = effectEditIconV2Assem.mp();
                    String str5 = (String) C13LP.LJJJLL(mobileEffectIcon4.list);
                    if (str5 == null) {
                        str5 = "";
                    }
                    Uri uri = UriProtector.parse(str5);
                    String str6 = mobileEffectIcon4.iconAssetId;
                    EnumC1737340vJM enumC1737340vJM = EnumC1737340vJM.NOT_SET;
                    C1736960vIk c1736960vIk = EnumC1736950vIj.Companion;
                    String str7 = mobileEffectIcon4.scene;
                    c1736960vIk.getClass();
                    effectEditV2VMMp3.yQ2(uri, new EditImageEffectImgCreatorData(str6, false, enumC1737340vJM, C1736960vIk.LIZIZ(str7), false, EnumC1736080vHK.NO_EDIT.getValue()));
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("key_prefix_apply_dlg_show_");
                NewFaceStickerBean newFaceStickerBean2 = effectEditIconV2Assem.kp().effect;
                if (newFaceStickerBean2 == null || (str = newFaceStickerBean2.effectId) == null) {
                    str = "";
                }
                sbLIZ.append(str);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                boolean z3 = Keva.getRepo("cke_repo_xx").getBoolean(strLIZIZ, false);
                NewFaceStickerBean newFaceStickerBean3 = effectEditIconV2Assem.kp().effect;
                if ((newFaceStickerBean3 != null && newFaceStickerBean3.effectSource == 101) || C1737900vKG.LJIJJ(effectEditIconV2Assem.lp().sdkExtra)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (list.size() == 1 && !z2 && !z3) {
                    MobileEffectIcon mobileEffectIcon5 = (MobileEffectIcon) C13LP.LJJJLL(list);
                    Fragment fragmentLJI = C724240Sb0.LJI(effectEditIconV2Assem);
                    if (fragmentLJI != null && (childFragmentManager = fragmentLJI.getChildFragmentManager()) != null && effectEditIconV2Assem.getContext() != null) {
                        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                        c1390920mIc.LIZ.LLJJIJI = new EffectIconAutoApplyHintFragment();
                        c1390920mIc.LJIIIIZZ(0);
                        TuxSheet tuxSheet = c1390920mIc.LIZ;
                        tuxSheet.LLJJIJIIJIL = true;
                        tuxSheet.LLJLLL = false;
                        tuxSheet.LLJLILLLLZIIL = false;
                        tuxSheet.LLILLJJLI = new DialogInterfaceOnDismissListenerC1775900wJY(effectEditIconV2Assem, mobileEffectIcon5, 1);
                        tuxSheet.show(childFragmentManager, "EffectEditIconV2Assem");
                    }
                    Keva.getRepo("cke_repo_xx").storeBoolean(strLIZIZ, true);
                }
            }
            EffectEditIconV2Assem effectEditIconV2Assem2 = this.LL;
            effectEditIconV2Assem2.getClass();
            if (list != null && !list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (((MobileEffectIcon) next).isLokiMaterial) {
                        if (next != null) {
                            EffectEditV2VM effectEditV2VMMp4 = effectEditIconV2Assem2.mp();
                            Context context = effectEditIconV2Assem2.getContext();
                            if (context != null && (string = context.getString(2131821245)) != null) {
                                str3 = string;
                            }
                            effectEditV2VMMp4.setState(new AwS76S1000000_26(str3, 12));
                        }
                    }
                }
            }
        }
        return Unit.LIZ;
    }
}
