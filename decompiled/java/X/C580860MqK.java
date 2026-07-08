package X;

import android.view.View;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.live.LiveRecordModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedController;
import com.ss.android.ugc.aweme.sticker.ab.EffectUploadPickerFolderUIExperiment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MqK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C580860MqK extends C19IN {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.C19IN
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(C580860MqK c580860MqK, View view) {
        NavigationScene navigationSceneLIZ;
        Boolean boolValueOf;
        String str;
        int i;
        CreativeModel creativeModel;
        CreativeModel creativeModel2;
        Intrinsics.LJFF(((VideoImageMixedController) c580860MqK.l0).LLILZLL, "end_of_year");
        VideoImageMixedController videoImageMixedController = (VideoImageMixedController) c580860MqK.l0;
        int i2 = videoImageMixedController.LLILZIL;
        if (i2 == 45) {
            InterfaceC524200Kh8 interfaceC524200Kh8 = videoImageMixedController.LLLIIII;
            if (interfaceC524200Kh8 != null) {
                interfaceC524200Kh8.LIZ(videoImageMixedController.LJJJJZI());
                return;
            }
            return;
        }
        if (i2 != 58 && !videoImageMixedController.LLLLZI) {
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).performanceMonitorService().getJatoBoostAbilityForEditPage();
            Boolean boolValueOf2 = null;
            if (EffectUploadPickerFolderUIExperiment.isEnabled() || C522930Kf5.LIZ(((VideoImageMixedController) c580860MqK.l0).LLILZIL)) {
                C21357918i9.LIZLLL = C21357918i9.LIZJ;
                Iterator<TikTokMediaModel> it2 = ((VideoImageMixedController) c580860MqK.l0).LLJJLIIIJLLLLLLLZ.iterator();
                int i3 = 0;
                while (it2.hasNext()) {
                    if (it2.next().selectIndex < 200) {
                        i3 = 1;
                    }
                }
                VideoImageMixedController videoImageMixedController2 = (VideoImageMixedController) c580860MqK.l0;
                ArrayList<TikTokMediaModel> arrayList = videoImageMixedController2.LLJJLIIIJLLLLLLLZ;
                ShortVideoContext shortVideoContext = videoImageMixedController2.LL;
                if (shortVideoContext != null) {
                    boolValueOf = Boolean.valueOf(shortVideoContext.isStoryOrPhotoTab);
                } else {
                    boolValueOf = null;
                }
                List<String> listInvoke = ((VideoImageMixedController) c580860MqK.l0).LLJJJIL.invoke();
                C528230Knd c528230KndInvoke = ((VideoImageMixedController) c580860MqK.l0).LLJILJIL.invoke();
                if (arrayList.size() == 1 && ((MediaModel) C13LP.LJJJJZI(arrayList)).LJIIJJI()) {
                    str = "live";
                } else if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                    str = "photo";
                } else {
                    str = "video";
                }
                C528010KnH c528010KnH = new C528010KnH(0, 0, 0);
                for (TikTokMediaModel tikTokMediaModel : arrayList) {
                    if (tikTokMediaModel.LJI()) {
                        c528010KnH.LIZ++;
                    }
                    if (tikTokMediaModel.LJIIIZ()) {
                        c528010KnH.LIZIZ++;
                    }
                    if (tikTokMediaModel.LJII()) {
                        c528010KnH.LIZJ++;
                    }
                }
                C0LAB c0lab = new C0LAB();
                c0lab.LJ("content_type", str);
                c0lab.LJ("upload_method", "click_button");
                c0lab.LJ("upload_type", "multiple_content");
                c0lab.LJ("upload_tab_name", C13LP.LJJLIIIJ(listInvoke, ",", null, null, 0, null, null, 62));
                c0lab.LJ("creation_id", c528230KndInvoke.LIZIZ);
                c0lab.LIZ(i3, "is_shown_in_picker");
                c0lab.LJFF("is_child_mode", C10EU.LJIIIIZZ());
                c0lab.LJ("shoot_enter_method", c528230KndInvoke.LIZLLL);
                c0lab.LJ("shoot_enter_from", c528230KndInvoke.LIZJ);
                c0lab.LJ("shoot_way", c528230KndInvoke.LIZ);
                c0lab.LIZ(c528230KndInvoke.LJ ? 1 : 0, "is_draft");
                c0lab.LJ("multi_select_status", c528230KndInvoke.LIZ());
                c0lab.LIZ(c528230KndInvoke.LJIIJ ? 1 : 0, "in_detail");
                c0lab.LJ("album_from_page", c528230KndInvoke.LJI);
                c0lab.LJ("album_from_scene", c528230KndInvoke.LJII);
                VideoImageMixedController.LJJIZ(c0lab, c528010KnH);
                C548810Lfj.LIZ(c0lab, "upload_content_next", c528230KndInvoke.LJIILL);
                C523270Kfd.LIZ(c0lab, videoImageMixedController2.LL, arrayList, videoImageMixedController2.LLILZ);
                C527570KmZ c527570KmZ = C527570KmZ.LIZ;
                ShortVideoContext shortVideoContext2 = videoImageMixedController2.LL;
                c527570KmZ.getClass();
                C527570KmZ.LIZ(c0lab, shortVideoContext2, arrayList);
                ShortVideoContext shortVideoContext3 = videoImageMixedController2.LL;
                if (shortVideoContext3 != null && C577420Mkm.LIZ(true, shortVideoContext3)) {
                    if (videoImageMixedController2.LLILZIL == 60) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    c0lab.LIZ(i, "is_alive_shoot_page_side_bar");
                }
                C20684815ws.LJIILLIIL("upload_content_next", c0lab.LIZ);
            }
            ShortVideoContext shortVideoContext4 = ((VideoImageMixedController) c580860MqK.l0).LL;
            if (shortVideoContext4 != null && (creativeModel2 = shortVideoContext4.creativeModel) != null) {
                creativeModel2.autoCutModel = new AutoCutModel(null, null, null, null, 0, 0, false, false, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, 0, null, false, null, 0, 0, null, false, false, null, null, -1, 7, null);
            }
            ShortVideoContext shortVideoContext5 = ((VideoImageMixedController) c580860MqK.l0).LL;
            if (shortVideoContext5 != null && (creativeModel = shortVideoContext5.creativeModel) != null) {
                creativeModel.liveRecordModel = new LiveRecordModel(new ArrayList());
            }
            NavigationScene navigationSceneLIZ2 = C528090KnP.LIZ((View) c580860MqK.l1);
            if (navigationSceneLIZ2 != null) {
                boolValueOf2 = Boolean.valueOf(C523910Kgf.LIZIZ(navigationSceneLIZ2, C526910KlV.class));
            }
            ((VideoImageMixedController) c580860MqK.l0).LJJIIJZLJL(view, false, Intrinsics.LJFF(boolValueOf2, Boolean.TRUE), false, false, false, false);
            return;
        }
        if (videoImageMixedController.LLLLLZL && (navigationSceneLIZ = C528090KnP.LIZ((View) c580860MqK.l1)) != null && C523910Kgf.LIZIZ(navigationSceneLIZ, C526910KlV.class)) {
            NavigationScene navigationSceneLIZ3 = C528090KnP.LIZ((View) c580860MqK.l1);
            if (navigationSceneLIZ3 != null) {
                navigationSceneLIZ3.LLLLLL();
                return;
            }
            return;
        }
        VideoImageMixedController videoImageMixedController3 = (VideoImageMixedController) c580860MqK.l0;
        Function1<? super ArrayList<TikTokMediaModel>, Unit> function1 = videoImageMixedController3.LLLIIIIL;
        if (function1 != null) {
            function1.invoke(videoImageMixedController3.LJJJJZI());
        }
    }

    public static final void LIZ$1(C580860MqK c580860MqK, View view) {
        boolean z;
        C0HZQ c0hzq = ((C528030KnJ) c580860MqK.l0).LLJJLIIIJLLLLLLLZ;
        if (c0hzq != null && c0hzq.isChecked()) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = !z;
        C0HZQ c0hzq2 = ((C528030KnJ) c580860MqK.l0).LLJJLIIIJLLLLLLLZ;
        if (c0hzq2 != null) {
            c0hzq2.setChecked(z2);
        }
        Function1 function1 = (Function1) c580860MqK.l1;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z2));
        }
        if (!z2) {
            C1458370o3P.LIZ.getClass();
            C1458370o3P.LJJII();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C580860MqK(VideoImageMixedController videoImageMixedController, View view, int i) {
        super(1100, 2);
        this.$t = i;
        this.l0 = videoImageMixedController;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C580860MqK(C528030KnJ c528030KnJ, C528030KnJ c528030KnJ2, Function1<? super Boolean, Unit> function1) {
        super(0, 3);
        this.$t = function1;
        this.l0 = c528030KnJ;
        this.l1 = c528030KnJ2;
    }
}
