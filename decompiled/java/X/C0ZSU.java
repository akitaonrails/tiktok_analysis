package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.PictureCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ResolutionComponent;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.ability.PhotoSwapAnimationAbility;
import com.ss.android.ugc.aweme.im.sticker.api.viewmodel.Photo2StickerViewModel;
import com.ss.android.ugc.aweme.im.viewmodel.PanelStateViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS32S0600000_14;

/* JADX INFO: renamed from: X.0ZSU, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZSU {
    public static final C0ZSU LIZ = new C0ZSU();
    public static final ResolutionComponent LIZIZ = new ResolutionComponent(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(162)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(288)));

    public static boolean LIZLLL(C869590Y9l c869590Y9l) {
        if (c869590Y9l.isSuccessStatus()) {
            if (!C0ZDX.LJJJJIZL(c869590Y9l)) {
                if (C0ZOC.LIZ() && C896060ZDg.LJFF(c869590Y9l) != C0ZSW.PHOTO_SWAP_REPLY_MASK) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static ResolutionComponent LJI(ResolutionComponent resolutionComponent) {
        Pair pair;
        float f = resolutionComponent.width / resolutionComponent.height;
        if (f <= 0.5f) {
            pair = new Pair(Float.valueOf(C418440Gaw.LIZIZ(162)), Float.valueOf(C13LZ.LIZLLL(C418440Gaw.LIZIZ(162) / f, C418440Gaw.LIZIZ(162), C418440Gaw.LIZIZ(324))));
        } else if (f <= 1.0f) {
            pair = new Pair(Float.valueOf(C418440Gaw.LIZIZ(162)), Float.valueOf(C13LZ.LIZLLL(C418440Gaw.LIZIZ(162) / f, C418440Gaw.LIZIZ(162), C418440Gaw.LIZIZ(288))));
        } else if (f <= 1.2f) {
            pair = new Pair(Float.valueOf(C418440Gaw.LIZIZ(162)), Float.valueOf(C13LZ.LIZLLL(C418440Gaw.LIZIZ(162) / f, C418440Gaw.LIZIZ(126), C418440Gaw.LIZIZ(162))));
        } else {
            pair = new Pair(Float.valueOf(C418440Gaw.LIZIZ(260)), Float.valueOf(C13LZ.LIZLLL(C418440Gaw.LIZIZ(260) / f, C418440Gaw.LIZIZ(80), C418440Gaw.LIZIZ(162))));
        }
        return new ResolutionComponent((int) ((Number) pair.getFirst()).floatValue(), (int) ((Number) pair.getSecond()).floatValue());
    }

    public static C0ZSV LJII(C869590Y9l c869590Y9l) {
        String strLJ;
        if (!C896400ZEo.LJIIIIZZ(c869590Y9l)) {
            return C0ZSV.NONE;
        }
        BaseTemplate baseTemplateLIZ = C0Z2Z.LIZ(c869590Y9l, BaseTemplate.class);
        if (baseTemplateLIZ != null) {
            strLJ = C896400ZEo.LJ(baseTemplateLIZ);
        } else {
            strLJ = null;
        }
        if (strLJ != null && strLJ.length() != 0) {
            return C0ZSV.NONE;
        }
        String str = c869590Y9l.getLocalExt().get("local_ext_paired_msg_id");
        if (str != null && str.length() != 0) {
            if (C896400ZEo.LJII(c869590Y9l)) {
                if (C0ZDX.LJJJJIZL(c869590Y9l)) {
                    return C0ZSV.PHOTO_SWAP_INITIATE_MASK;
                }
                return C0ZSV.PHOTO_SWAP_REPLY_MASK;
            }
            return C0ZSV.NONE;
        }
        if (C0ZDX.LJJJJIZL(c869590Y9l)) {
            return C0ZSV.PHOTO_SWAP_INITIATE_MASK;
        }
        return C0ZSV.PHOTO_SWAP_REPLY_MASK;
    }

    public static ResolutionComponent LJ(C869590Y9l c869590Y9l, PictureCardTemplate pictureCardTemplate) {
        Object next;
        ResolutionComponent resolutionComponent;
        if (pictureCardTemplate == null) {
            resolutionComponent = LIZIZ;
        } else {
            C912070ZqH c912070ZqH = C912070ZqH.LIZIZ;
            Iterator it2 = ((ArrayList) C13LQ.LJIJI(new ResolutionComponent[]{c912070ZqH.LJIILJJIL().LJ(c869590Y9l, "preview"), c912070ZqH.LJIILJJIL().LJ(c869590Y9l, "full"), pictureCardTemplate.thumbnailComponent.resolution, pictureCardTemplate.imageComponent.resolution})).iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    ResolutionComponent resolutionComponent2 = (ResolutionComponent) next;
                    if (resolutionComponent2.height > 0 && resolutionComponent2.width > 0) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            resolutionComponent = (ResolutionComponent) next;
            if (resolutionComponent == null) {
                resolutionComponent = LIZIZ;
            }
        }
        return LJI(resolutionComponent);
    }

    public static List LJFF(C869590Y9l c869590Y9l, PictureCardTemplate pictureCardTemplate) {
        ImageComponent imageComponent;
        C912070ZqH c912070ZqH = C912070ZqH.LIZIZ;
        String strLIZJ = c912070ZqH.LJIILJJIL().LIZJ(c869590Y9l);
        ImageComponent imageComponent2 = null;
        if (pictureCardTemplate != null) {
            imageComponent = pictureCardTemplate.thumbnailComponent;
            imageComponent2 = pictureCardTemplate.imageComponent;
        } else {
            imageComponent = null;
        }
        return C896400ZEo.LIZ(strLIZJ, imageComponent, imageComponent2, C13LP.LJLIL(c912070ZqH.LJIILJJIL().LJIIJJI(c869590Y9l, "full"), c912070ZqH.LJIILJJIL().LJIIJJI(c869590Y9l, "preview")));
    }

    public static boolean LJIIIIZZ(C869590Y9l c869590Y9l, PhotoSwapAnimationAbility photoSwapAnimationAbility) {
        if (!C896400ZEo.LJIIIZ(c869590Y9l) || C0ZDX.LJJJJIZL(c869590Y9l) || photoSwapAnimationAbility == null) {
            return false;
        }
        return photoSwapAnimationAbility.ct0(c869590Y9l.getIndex(), c869590Y9l.getUuid());
    }

    public static void LJIIIZ(C0I6K c0i6k, C462630ICf c462630ICf) {
        float f;
        float f2;
        float f3;
        float f4;
        if (C426750GoL.LIZLLL(c0i6k.getContext())) {
            f = c462630ICf.LIZ;
            f2 = c462630ICf.LIZIZ;
            f3 = c462630ICf.LIZLLL;
            f4 = c462630ICf.LIZJ;
        } else {
            f = c462630ICf.LIZIZ;
            f2 = c462630ICf.LIZ;
            f3 = c462630ICf.LIZJ;
            f4 = c462630ICf.LIZLLL;
        }
        c0i6k.setStyle(new C07Y7(f, f2, f4, f3));
    }

    public static void LJIIJ(C0I6K c0i6k, C462630ICf c462630ICf) {
        float f;
        float f2;
        float f3;
        float f4;
        if (C426750GoL.LIZLLL(c0i6k.getContext())) {
            f = c462630ICf.LIZIZ;
            f2 = c462630ICf.LIZ;
            f3 = c462630ICf.LIZJ;
            f4 = c462630ICf.LIZLLL;
        } else {
            f = c462630ICf.LIZ;
            f2 = c462630ICf.LIZIZ;
            f3 = c462630ICf.LIZLLL;
            f4 = c462630ICf.LIZJ;
        }
        c0i6k.setStyle(new C07Y7(f, f2, f4, f3));
    }

    public static List LIZ(C19EG c19eg, Fragment fragment, C869590Y9l c869590Y9l, InterfaceC889250YuZ interfaceC889250YuZ, SessionInfo sessionInfo, C0IBF c0ibf, C0ZQI c0zqi, C0ZSY c0zsy, Photo2StickerViewModel photo2StickerViewModel, PanelStateViewModel panelStateViewModel, LifecycleCoroutineScope lifecycleCoroutineScope) {
        ArrayList arrayList = new ArrayList();
        LIZ.getClass();
        arrayList.addAll(c0zqi.LIZIZ(c869590Y9l, LIZLLL(c869590Y9l)));
        if (C457760HxG.LIZIZ(false) && C0ZDX.LJJJJIZL(c869590Y9l) && c869590Y9l.isSuccessStatus() && c869590Y9l.getMsgType() == 1802 && C0BB2.LIZ() && c0zsy.isVESDKReady()) {
            arrayList.add(C1558650qf9.LIZIZ("PHOTO2STICKER", C0ZL0.PHOTO2STICKER, Integer.valueOf(R.raw.icon_scissors_fill), 2131831766, false, new C0ZQL(c19eg, c869590Y9l, interfaceC889250YuZ, c0zqi, c0zsy, photo2StickerViewModel, lifecycleCoroutineScope), 48));
        }
        if (sessionInfo != null && c0ibf != null && C461220I6u.LIZ(c869590Y9l, sessionInfo, c0ibf)) {
            arrayList.add(C457850HxP.LIZ(c19eg, fragment, c869590Y9l, sessionInfo, c0ibf, c0zqi, panelStateViewModel));
            C912070ZqH.LIZIZ.LJFF().LJIIIIZZ(sessionInfo, c0ibf, "quick_live_react", null, "message_long_press", C0I0B.LJFF.LIZIZ());
        }
        return arrayList;
    }

    public static List LIZJ(C19EG c19eg, Fragment fragment, C869590Y9l c869590Y9l, InterfaceC889250YuZ interfaceC889250YuZ, SessionInfo sessionInfo, C0IBF c0ibf, C0ZQI c0zqi, C0ZSY c0zsy, Photo2StickerViewModel photo2StickerViewModel, PanelStateViewModel panelStateViewModel, LifecycleCoroutineScope lifecycleCoroutineScope) {
        ArrayList arrayList = new ArrayList(c0zqi.LIZIZ(c869590Y9l, LIZLLL(c869590Y9l)));
        if (c19eg != null && C457760HxG.LIZIZ(false) && C0ZDX.LJJJJIZL(c869590Y9l) && c869590Y9l.isSuccessStatus() && c869590Y9l.getMsgType() == 1803 && C0BB8.LIZ() && interfaceC889250YuZ != null && lifecycleCoroutineScope != null && c0zsy.isVESDKReady()) {
            arrayList.add(C1558650qf9.LIZIZ("PHOTO2STICKER", C0ZL0.PHOTO2STICKER, Integer.valueOf(R.raw.icon_scissors_fill), 2131831766, false, new AwS32S0600000_14(c19eg, c869590Y9l, interfaceC889250YuZ, c0zqi, photo2StickerViewModel, lifecycleCoroutineScope, 0), 48));
        }
        if (!C0ZDX.LJJJJIZL(c869590Y9l) && sessionInfo != null && c0ibf != null && C461220I6u.LIZ(c869590Y9l, sessionInfo, c0ibf)) {
            arrayList.add(C457850HxP.LIZ(c19eg, fragment, c869590Y9l, sessionInfo, c0ibf, c0zqi, panelStateViewModel));
            C912070ZqH.LIZIZ.LJFF().LJIIIIZZ(sessionInfo, c0ibf, "quick_live_react", null, "message_long_press", C0I0B.LJFF.LIZIZ());
        }
        return arrayList;
    }
}
