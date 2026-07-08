package X;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.review.gallery.GalleryViewerFragment;
import com.ss.android.ugc.aweme.prop.mobileefffect.EditImageEffectImgCreatorData;
import com.ss.android.ugc.aweme.prop.mobileefffect.edit.EffectEditIconV2Assem;
import com.ss.android.ugc.aweme.prop.mobileefffect.edit.EffectEditV2VM;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffectIcon;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS38S0010000_26;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: renamed from: X.0wJY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class DialogInterfaceOnDismissListenerC1775900wJY implements DialogInterface.OnDismissListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onDismiss$0(this, dialogInterface);
                break;
            case 1:
                onDismiss$1(this, dialogInterface);
                break;
        }
    }

    public static final void onDismiss$0(DialogInterfaceOnDismissListenerC1775900wJY dialogInterfaceOnDismissListenerC1775900wJY, DialogInterface dialogInterface) {
        C19EG activity = ((GalleryViewerFragment) dialogInterfaceOnDismissListenerC1775900wJY.l0).getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
        DialogC1761330vw3 dialogC1761330vw3 = (DialogC1761330vw3) dialogInterfaceOnDismissListenerC1775900wJY.l1;
        ((ArrayList) dialogC1761330vw3.LLJILJILJ).remove(((GalleryViewerFragment) dialogInterfaceOnDismissListenerC1775900wJY.l0).LLLII);
    }

    public static final void onDismiss$1(DialogInterfaceOnDismissListenerC1775900wJY dialogInterfaceOnDismissListenerC1775900wJY, DialogInterface dialogInterface) {
        String str;
        String str2 = TuxSheet._pnsPageId;
        AbstractC343940De4 abstractC343940De4LJIIJJI = C1391190mJ3.LJIIJJI(dialogInterface);
        String str3 = "";
        if (abstractC343940De4LJIIJJI instanceof C455080Hsw) {
            EffectEditIconV2Assem effectEditIconV2Assem = (EffectEditIconV2Assem) dialogInterfaceOnDismissListenerC1775900wJY.l0;
            MobileEffectIcon mobileEffectIcon = (MobileEffectIcon) dialogInterfaceOnDismissListenerC1775900wJY.l1;
            effectEditIconV2Assem.getClass();
            if (mobileEffectIcon != null) {
                EnumC1736950vIj enumC1736950vIjIp = EffectEditIconV2Assem.ip(mobileEffectIcon.scene);
                EffectEditV2VM effectEditV2VMMp = effectEditIconV2Assem.mp();
                String str4 = (String) C13LP.LJJJLL(mobileEffectIcon.list);
                if (str4 != null) {
                    str3 = str4;
                }
                effectEditV2VMMp.yQ2(UriProtector.parse(str3), new EditImageEffectImgCreatorData(mobileEffectIcon.iconAssetId, false, EnumC1737340vJM.NOT_SET, enumC1736950vIjIp, false, EnumC1736080vHK.NO_EDIT.getValue()));
                effectEditIconV2Assem.mp().setState(new AwS38S0010000_26(6));
                return;
            }
            return;
        }
        if (!(abstractC343940De4LJIIJJI instanceof C455070Hsv)) {
            return;
        }
        EffectEditIconV2Assem effectEditIconV2Assem2 = (EffectEditIconV2Assem) dialogInterfaceOnDismissListenerC1775900wJY.l0;
        MobileEffectIcon mobileEffectIcon2 = (MobileEffectIcon) dialogInterfaceOnDismissListenerC1775900wJY.l1;
        effectEditIconV2Assem2.getClass();
        if (mobileEffectIcon2 == null) {
            return;
        }
        EnumC1736950vIj enumC1736950vIjIp2 = EffectEditIconV2Assem.ip(mobileEffectIcon2.scene);
        Context context = effectEditIconV2Assem2.getContext();
        if (context == null) {
            return;
        }
        EffectEditV2VM effectEditV2VMMp2 = effectEditIconV2Assem2.mp();
        NewFaceStickerBean newFaceStickerBean = effectEditIconV2Assem2.kp().effect;
        if (newFaceStickerBean != null && (str = newFaceStickerBean.effectId) != null) {
            str3 = str;
        }
        if (!C1656550tD3.LIZ() || str3.length() == 0) {
            return;
        }
        effectEditV2VMMp2.setState(new AwS605S0100000_26(enumC1736950vIjIp2, 395));
        C23250099c.LIZLLL(effectEditV2VMMp2.getAssemVMScope(), null, null, new C1737100vIy(effectEditV2VMMp2, context, enumC1736950vIjIp2, str3, null), 3);
    }

    public DialogInterfaceOnDismissListenerC1775900wJY(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
