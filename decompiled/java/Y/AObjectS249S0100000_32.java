package Y;

import X.AnonymousClass1942;
import X.C1295960jpS;
import X.C1388500mEi;
import X.C1451040nra;
import X.C1456890o11;
import X.C15438062q;
import X.C1664680tQA;
import X.C18VZ;
import X.C19223110Ij;
import X.C193Z;
import X.C194L;
import X.C19751912Pt;
import X.C19KL;
import X.C21290818Tq;
import X.C21292518Uh;
import X.C21295818Vo;
import X.C214767193d;
import X.C214775193l;
import X.C214782193s;
import X.C214783193t;
import X.C214785193v;
import X.C214788193y;
import X.C214789193z;
import X.C2188811AlT;
import X.C443120HZe;
import X.C570490MZb;
import X.C786410Ut5;
import X.C861670XrB;
import X.EnumC1778830wOH;
import X.EnumC21294918Vf;
import X.InterfaceC1441305kZ;
import X.InterfaceC21295718Vn;
import X.InterfaceC214787193x;
import android.content.Intent;
import android.os.Vibrator;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenChatRoomModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.tools.data.AIChatPageConfig;
import com.ss.android.ugc.tools.data.AIChatTrackingConfig;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS278S0000000_32;
import kotlin.jvm.internal.AwS10S0020000_32;

/* JADX INFO: loaded from: classes33.dex */
public class AObjectS249S0100000_32 implements InterfaceC1441305kZ {
    public final int $t;
    public Object l0;

    public static final /* synthetic */ void onChanged$6(AObjectS249S0100000_32 aObjectS249S0100000_32, Object obj) {
        ((Function1) aObjectS249S0100000_32.l0).invoke(obj);
    }

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
        }
    }

    public AObjectS249S0100000_32(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onChanged$0(AObjectS249S0100000_32 aObjectS249S0100000_32, Object obj) {
        List list = (List) obj;
        ((C214775193l) aObjectS249S0100000_32.l0).LLJILJIL.clear();
        C214775193l c214775193l = (C214775193l) aObjectS249S0100000_32.l0;
        List<C19223110Ij> list2 = c214775193l.LLJILJIL;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(C214767193d.LIZ((C193Z) it2.next()));
        }
        c214775193l.K4(arrayList);
        list2.addAll(arrayList);
        ((C214775193l) aObjectS249S0100000_32.l0).x5();
    }

    public static final void onChanged$1(AObjectS249S0100000_32 aObjectS249S0100000_32, Object obj) {
        List list = (List) obj;
        ((C214775193l) aObjectS249S0100000_32.l0).LLJILJILJ.clear();
        C214775193l c214775193l = (C214775193l) aObjectS249S0100000_32.l0;
        List<C19223110Ij> list2 = c214775193l.LLJILJILJ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(C214767193d.LIZ((C193Z) it2.next()));
        }
        c214775193l.K4(arrayList);
        list2.addAll(arrayList);
        ((C214775193l) aObjectS249S0100000_32.l0).x5();
    }

    public static final void onChanged$10(AObjectS249S0100000_32 aObjectS249S0100000_32, Object obj) {
        ((C214789193z) aObjectS249S0100000_32.l0).LLJILLL.clear();
        ((C214789193z) aObjectS249S0100000_32.l0).LLJILLL.addAll((Collection) obj);
        C214789193z c214789193z = (C214789193z) aObjectS249S0100000_32.l0;
        InterfaceC214787193x interfaceC214787193x = c214789193z.LLJILJIL;
        if (interfaceC214787193x != null) {
            interfaceC214787193x.LJLIIL(c214789193z.W1());
        }
    }

    public static final void onChanged$11(AObjectS249S0100000_32 aObjectS249S0100000_32, Object obj) {
        ((C214789193z) aObjectS249S0100000_32.l0).LLJJ.clear();
        ((C214789193z) aObjectS249S0100000_32.l0).LLJJ.addAll((Collection) obj);
        C214789193z c214789193z = (C214789193z) aObjectS249S0100000_32.l0;
        InterfaceC214787193x interfaceC214787193x = c214789193z.LLJILJIL;
        if (interfaceC214787193x != null) {
            interfaceC214787193x.LJLIIL(c214789193z.W1());
        }
    }

    public static final void onChanged$12(AObjectS249S0100000_32 aObjectS249S0100000_32, Object obj) {
        boolean z;
        boolean zLIZJ = C1451040nra.LIZJ(((AnonymousClass1942) aObjectS249S0100000_32.l0).O4());
        if (!zLIZJ) {
            z = false;
        } else {
            z = ((AnonymousClass1942) aObjectS249S0100000_32.l0).O4().creativeModel.photoModeTemplateData.postAsTemplateCheckedByUser;
        }
        ((AnonymousClass1942) aObjectS249S0100000_32.l0).O4().creativeModel.photoModeTemplateData.enablePublishAsTemplate = z;
        ((AnonymousClass1942) aObjectS249S0100000_32.l0).i3(new AwS10S0020000_32(zLIZJ, z, 1));
    }

    public static final void onChanged$13(AObjectS249S0100000_32 aObjectS249S0100000_32, Object obj) {
        NavigationScene navigationScene = (NavigationScene) obj;
        if (navigationScene != null) {
            navigationScene.registerChildSceneLifecycleCallbacks((C861670XrB) aObjectS249S0100000_32.l0, false);
        }
    }

    public static final void onChanged$14(AObjectS249S0100000_32 aObjectS249S0100000_32, Object obj) {
        NavigationScene navigationScene = (NavigationScene) obj;
        if (navigationScene != null) {
            navigationScene.registerChildSceneLifecycleCallbacks((C861670XrB) aObjectS249S0100000_32.l0, false);
        }
    }

    public static final void onChanged$15(AObjectS249S0100000_32 aObjectS249S0100000_32, Object obj) {
        NavigationScene navigationScene = (NavigationScene) obj;
        if (navigationScene != null) {
            navigationScene.registerChildSceneLifecycleCallbacks((C861670XrB) aObjectS249S0100000_32.l0, false);
        }
    }

    public static final void onChanged$16(AObjectS249S0100000_32 aObjectS249S0100000_32, Object obj) {
        ((C194L) aObjectS249S0100000_32.l0).LLJJIJIL = ((C1456890o11) obj).LIZ;
    }

    public static final void onChanged$17(AObjectS249S0100000_32 aObjectS249S0100000_32, Object obj) {
        boolean z;
        InterfaceC21295718Vn interfaceC21295718VnT5 = ((C18VZ) aObjectS249S0100000_32.l0).t5();
        if (interfaceC21295718VnT5 != null) {
            if (obj != EnumC21294918Vf.IMAGE_MAXED) {
                z = true;
            } else {
                z = false;
            }
            interfaceC21295718VnT5.yp2(z);
        }
    }

    public static final void onChanged$18(AObjectS249S0100000_32 aObjectS249S0100000_32, Object obj) {
        InterfaceC21295718Vn interfaceC21295718VnT5;
        String str = (String) obj;
        if ((str == null || str.length() == 0) && (interfaceC21295718VnT5 = ((C18VZ) aObjectS249S0100000_32.l0).t5()) != null) {
            interfaceC21295718VnT5.NP1();
        }
    }

    public static final void onChanged$19(AObjectS249S0100000_32 aObjectS249S0100000_32, Object obj) {
        ArrayList<MediaModel> parcelableArrayListExtra;
        AIChatTrackingConfig aIChatTrackingConfig;
        C443120HZe c443120HZe = (C443120HZe) obj;
        int iIntValue = ((Number) c443120HZe.getFirst()).intValue();
        ((Number) c443120HZe.getSecond()).intValue();
        Intent intent = (Intent) c443120HZe.getThird();
        if (iIntValue == 1028) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onActivityResult: ");
            sbLIZ.append(intent);
            C21290818Tq.LIZJ("InputUploadController", C2188811AlT.LIZIZ(sbLIZ));
            Integer num = null;
            if (intent != null && (parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data")) != null) {
                C21292518Uh c21292518Uh = (C21292518Uh) aObjectS249S0100000_32.l0;
                ArrayList<MediaModel> arrayList = new ArrayList(C15438062q.LJIJJ(parcelableArrayListExtra, 10));
                for (MediaModel mediaModel : parcelableArrayListExtra) {
                    AIChatGenChatRoomModel aIChatGenChatRoomModel = c21292518Uh.LIZ.LJ.chatRoomModel;
                    C1388500mEi.LIZIZ(mediaModel);
                    if (!C570490MZb.LJ(C1388500mEi.LIZ(mediaModel))) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("compressedImage failed: ");
                        sbLIZ2.append(C1388500mEi.LIZ(mediaModel));
                        C21290818Tq.LIZJ("InputUploadController", C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    arrayList.add(mediaModel);
                }
                if (!arrayList.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                    for (MediaModel mediaModel2 : arrayList) {
                        arrayList2.add(new C21295818Vo(mediaModel2.id, C1388500mEi.LIZ(mediaModel2), mediaModel2.width, mediaModel2.height, mediaModel2.fileSize, false, (EnumC1778830wOH) null, 224));
                    }
                    C21292518Uh c21292518Uh2 = (C21292518Uh) aObjectS249S0100000_32.l0;
                    AIChatGenChatRoomModel aIChatGenChatRoomModel2 = c21292518Uh2.LIZ.LJ.chatRoomModel;
                    if (aIChatGenChatRoomModel2 != null) {
                        C19751912Pt c19751912Pt = C19751912Pt.LIZ;
                        String str = aIChatGenChatRoomModel2.creationId;
                        int size = arrayList2.size();
                        String str2 = aIChatGenChatRoomModel2.shootWay;
                        String str3 = aIChatGenChatRoomModel2.enterMethod;
                        int i = aIChatGenChatRoomModel2.quota;
                        Boolean bool = aIChatGenChatRoomModel2.isNewUser;
                        AIChatPageConfig aIChatPageConfig = c21292518Uh2.LIZ.LJI;
                        if (aIChatPageConfig != null && (aIChatTrackingConfig = aIChatPageConfig.tracking) != null) {
                            num = aIChatTrackingConfig.awemeType;
                        }
                        c19751912Pt.getClass();
                        C19751912Pt.LIZIZ(str, size, str2, str3, i, bool, num);
                    }
                    ((C21292518Uh) aObjectS249S0100000_32.l0).LJ.invoke(arrayList2);
                    return;
                }
            }
            ((C21292518Uh) aObjectS249S0100000_32.l0).LIZLLL.invoke();
        }
    }

    public static final void onChanged$2(AObjectS249S0100000_32 aObjectS249S0100000_32, Object obj) {
        List list = (List) obj;
        ((C214775193l) aObjectS249S0100000_32.l0).LLJILLL.clear();
        C214775193l c214775193l = (C214775193l) aObjectS249S0100000_32.l0;
        List<C19223110Ij> list2 = c214775193l.LLJILLL;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(C214767193d.LIZ((C193Z) it2.next()));
        }
        c214775193l.K4(arrayList);
        list2.addAll(arrayList);
        ((C214775193l) aObjectS249S0100000_32.l0).x5();
    }

    public static final void onChanged$20(AObjectS249S0100000_32 aObjectS249S0100000_32, Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            bool.booleanValue();
            C19KL c19kl = (C19KL) aObjectS249S0100000_32.l0;
            View view = c19kl.LLJILJILJ;
            if (view != null) {
                if (bool.booleanValue()) {
                    if (view.getVisibility() != 0) {
                        C786410Ut5.LJLLLLLL(0, view);
                        c19kl.LIZIZ(view, true);
                        return;
                    }
                    return;
                }
                if (view.getVisibility() != 0) {
                    return;
                }
                c19kl.LIZIZ(view, false);
            }
        }
    }

    public static final void onChanged$21(AObjectS249S0100000_32 aObjectS249S0100000_32, Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            bool.booleanValue();
            if (bool.booleanValue()) {
                C19KL c19kl = (C19KL) aObjectS249S0100000_32.l0;
                if (!c19kl.LLJJ) {
                    C1295960jpS c1295960jpS = c19kl.LLJILLL;
                    if (c1295960jpS != null) {
                        c1295960jpS.setMinAndMaxProgress(0.0f, 0.32f);
                    }
                    C1295960jpS c1295960jpS2 = c19kl.LLJILLL;
                    if (c1295960jpS2 != null) {
                        c1295960jpS2.playAnimation();
                    }
                    Vibrator vibrator = c19kl.LLJJI;
                    if (vibrator != null) {
                        vibrator.vibrate(10L);
                    }
                    ((C19KL) aObjectS249S0100000_32.l0).LLJJ = true;
                    return;
                }
                return;
            }
            C19KL c19kl2 = (C19KL) aObjectS249S0100000_32.l0;
            if (!c19kl2.LLJJ) {
                return;
            }
            C1295960jpS c1295960jpS3 = c19kl2.LLJILLL;
            if (c1295960jpS3 != null) {
                c1295960jpS3.setMinAndMaxProgress(0.33333334f, 1.0f);
            }
            C1295960jpS c1295960jpS4 = c19kl2.LLJILLL;
            if (c1295960jpS4 != null) {
                c1295960jpS4.playAnimation();
            }
            ((C19KL) aObjectS249S0100000_32.l0).LLJJ = false;
        }
    }

    public static final void onChanged$22(AObjectS249S0100000_32 aObjectS249S0100000_32, Object obj) {
        Integer num = (Integer) obj;
        if (num != null) {
            num.intValue();
            if (num.intValue() == 0) {
                ((C1664680tQA) aObjectS249S0100000_32.l0).LIZLLL(AFwS278S0000000_32.get$arr$(164), true);
                return;
            }
            if (num.intValue() == 1) {
                ((C1664680tQA) aObjectS249S0100000_32.l0).LIZLLL(AFwS278S0000000_32.get$arr$(165), true);
            } else if (num.intValue() == 2) {
                ((C1664680tQA) aObjectS249S0100000_32.l0).LIZLLL(AFwS278S0000000_32.get$arr$(166), true);
            } else {
                if (num.intValue() != 3) {
                    return;
                }
                ((C1664680tQA) aObjectS249S0100000_32.l0).LIZLLL(AFwS278S0000000_32.get$arr$(167), true);
            }
        }
    }

    public static final void onChanged$3(AObjectS249S0100000_32 aObjectS249S0100000_32, Object obj) {
        ((C214783193t) aObjectS249S0100000_32.l0).LLJILLL.clear();
        ((C214783193t) aObjectS249S0100000_32.l0).LLJILLL.addAll((Collection) obj);
        C214783193t c214783193t = (C214783193t) aObjectS249S0100000_32.l0;
        InterfaceC214787193x interfaceC214787193x = c214783193t.LLJ;
        if (interfaceC214787193x != null) {
            interfaceC214787193x.LJLIIL(c214783193t.W1());
        }
    }

    public static final void onChanged$4(AObjectS249S0100000_32 aObjectS249S0100000_32, Object obj) {
        ((C214782193s) aObjectS249S0100000_32.l0).LLJILLL.clear();
        ((C214782193s) aObjectS249S0100000_32.l0).LLJILLL.addAll((Collection) obj);
        C214782193s c214782193s = (C214782193s) aObjectS249S0100000_32.l0;
        InterfaceC214787193x interfaceC214787193x = c214782193s.LLJ;
        if (interfaceC214787193x != null) {
            interfaceC214787193x.LJLIIL(c214782193s.W1());
        }
    }

    public static final void onChanged$5(AObjectS249S0100000_32 aObjectS249S0100000_32, Object obj) {
        ((C214782193s) aObjectS249S0100000_32.l0).LLJJ.clear();
        ((C214782193s) aObjectS249S0100000_32.l0).LLJJ.addAll((Collection) obj);
        C214782193s c214782193s = (C214782193s) aObjectS249S0100000_32.l0;
        InterfaceC214787193x interfaceC214787193x = c214782193s.LLJ;
        if (interfaceC214787193x != null) {
            interfaceC214787193x.LJLIIL(c214782193s.W1());
        }
    }

    public static final void onChanged$7(AObjectS249S0100000_32 aObjectS249S0100000_32, Object obj) {
        ((C214785193v) aObjectS249S0100000_32.l0).LLJJI.clear();
        ((C214785193v) aObjectS249S0100000_32.l0).LLJJI.addAll((Collection) obj);
        C214785193v c214785193v = (C214785193v) aObjectS249S0100000_32.l0;
        InterfaceC214787193x interfaceC214787193x = c214785193v.LLJILLL;
        if (interfaceC214787193x != null) {
            interfaceC214787193x.LJLIIL(c214785193v.K4());
        }
    }

    public static final void onChanged$8(AObjectS249S0100000_32 aObjectS249S0100000_32, Object obj) {
        ((C214788193y) aObjectS249S0100000_32.l0).LLJILJIL.clear();
        ((C214788193y) aObjectS249S0100000_32.l0).LLJILJIL.addAll((Collection) obj);
    }

    public static final void onChanged$9(AObjectS249S0100000_32 aObjectS249S0100000_32, Object obj) {
        ((C214789193z) aObjectS249S0100000_32.l0).LLJILJILJ.clear();
        ((C214789193z) aObjectS249S0100000_32.l0).LLJILJILJ.addAll((Collection) obj);
        C214789193z c214789193z = (C214789193z) aObjectS249S0100000_32.l0;
        InterfaceC214787193x interfaceC214787193x = c214789193z.LLJILJIL;
        if (interfaceC214787193x != null) {
            interfaceC214787193x.LJLIIL(c214789193z.W1());
        }
    }
}
