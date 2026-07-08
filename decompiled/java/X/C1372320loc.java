package X;

import android.app.Activity;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService;
import com.ss.android.ugc.aweme.longpress.LPPProtocol;
import com.ss.android.ugc.aweme.longpress.LongPressPanelConfig;
import com.ss.android.ugc.aweme.performanceopt.api.PerfMonitorService;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.0loc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1372320loc {
    public final InterfaceC1372340loe LIZ;
    public final HomePageDataViewModel LIZIZ;
    public final DataCenter LIZJ;
    public final Fragment LIZLLL;
    public final int LJ;
    public final int LJFF;

    @C14EU
    public final void onDislikeAwemeEvent(C1372310lob c1372310lob) {
        User author;
        String enterFrom;
        String aid;
        String uid;
        int followStatus;
        String str;
        Boolean boolValueOf;
        Activity activityLIZIZ;
        String str2;
        String aid2;
        Integer numValueOf;
        List<PhotoModeImageUrlModel> imageList;
        LongPressPanelConfig longPressPanelConfig;
        InterfaceC1603190roz interfaceC1603190roz;
        ((PerfMonitorService) ServiceManager.get().getService(PerfMonitorService.class)).LJFF("share_panel");
        if (c1372310lob.LIZIZ == 1 && c1372310lob.LIZ) {
            this.LIZ.ge();
            Aweme aweme = this.LIZIZ.LLJILJILJ;
            if (aweme != null) {
                author = aweme.getAuthor();
            } else {
                author = null;
            }
            if (((IMSAdaptionService) ServiceManager.get().getService(IMSAdaptionService.class)).LIZIZ(C2214201BlK.LJFF())) {
                Object objLIZJ = C487580JAe.LIZJ(this.LIZLLL);
                if (!(objLIZJ instanceof InterfaceC1603190roz) || (interfaceC1603190roz = (InterfaceC1603190roz) objLIZJ) == null || (enterFrom = interfaceC1603190roz.getEnterFrom()) == null) {
                    enterFrom = "homepage_hot";
                }
            } else {
                enterFrom = this.LIZ.getEnterFrom();
            }
            float f = 100;
            int i = (int) ((c1372310lob.LIZJ * f) / this.LJ);
            int i2 = (int) ((c1372310lob.LIZLLL * f) / this.LJFF);
            C19651011uW c19651011uW = C19651011uW.LIZIZ;
            C2277711EDh c2277711EDh = C2277711EDh.LIZIZ;
            C735840Sti c735840Sti = C735840Sti.LIZ;
            C2344009Gk c2344009Gk = new C2344009Gk();
            Aweme aweme2 = this.LIZIZ.LLJILJILJ;
            if (aweme2 != null) {
                aid = aweme2.getAid();
            } else {
                aid = null;
            }
            c2344009Gk.LJIIIIZZ("group_id", aid);
            if (author == null || (uid = author.getUid()) == null) {
                uid = "";
            }
            c2344009Gk.LJIIIIZZ("author_id", uid);
            if (author != null) {
                followStatus = author.getFollowStatus();
            } else {
                followStatus = -1;
            }
            c2344009Gk.LIZJ(followStatus, "follow_status");
            c2344009Gk.LJIIIIZZ("log_pb", C584850Mwl.LIZ.LIZIZ(C735370Ssx.LJIJJ(this.LIZIZ.LLJILJILJ)));
            c2344009Gk.LJIIIIZZ("enter_from", enterFrom);
            c2344009Gk.LIZJ(i, "x");
            c2344009Gk.LIZJ(i2, "y");
            C1379120lza.LIZ.getClass();
            LPPProtocol lPPProtocolLIZ = C1379120lza.LIZ();
            if (lPPProtocolLIZ == null || (longPressPanelConfig = lPPProtocolLIZ.longPressPanelConfig) == null || (str = longPressPanelConfig.panelType) == null) {
                str = "online_version";
            }
            c2344009Gk.LJIIIIZZ("panel_type", str);
            c2344009Gk.LJIIIIZZ("content_type", C735370Ssx.LJFF(this.LIZIZ.LLJILJILJ));
            Aweme aweme3 = this.LIZIZ.LLJILJILJ;
            if (aweme3 != null) {
                boolValueOf = Boolean.valueOf(aweme3.isSubOnlyVideo());
            } else {
                boolValueOf = null;
            }
            c2344009Gk.LJ(boolValueOf, "is_sub_only_video");
            C1359610lU7.LJ(c2344009Gk, this.LIZIZ.LLJILJILJ, null);
            Aweme aweme4 = this.LIZIZ.LLJILJILJ;
            c735840Sti.getClass();
            C735840Sti.LIZIZ(aweme4, c2344009Gk);
            AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
            if (abstractC1387200mCcLIZIZ != null) {
                activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ();
            } else {
                activityLIZIZ = null;
            }
            Object objLIZIZ = C1612650s4F.LIZIZ(c2277711EDh.LJJIIJ(c2277711EDh.LJJIZ(c2344009Gk, C0SUC.LIZ(activityLIZIZ))), this.LIZIZ.LLJILJILJ);
            C2344009Gk c2344009Gk2 = (C2344009Gk) objLIZIZ;
            if (Intrinsics.LJFF(enterFrom, "homepage_nearby")) {
                HashMap<String, String> map = new HashMap<>();
                C1606660rua.LIZIZ.LIZJ(enterFrom, map, this.LIZIZ.LLJILJILJ, false);
                if (!map.isEmpty()) {
                    c2344009Gk2.LJI(map);
                }
            }
            C1367960lha.LIZ.getClass();
            Map mapLJIILJJIL = C1367960lha.LIZ().LJIILJJIL(this.LIZIZ.LLJILJILJ, null);
            if (!mapLJIILJJIL.isEmpty()) {
                c2344009Gk2.LJII(mapLJIILJJIL);
            }
            Aweme aweme5 = this.LIZIZ.LLJILJILJ;
            if (aweme5 != null && aweme5.getAwemeType() == 150) {
                c2344009Gk2.LIZJ(150, "aweme_type");
                PhotoModeImageInfo photoModeImageInfo = this.LIZIZ.LLJILJILJ.getPhotoModeImageInfo();
                if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
                    numValueOf = Integer.valueOf(imageList.size());
                } else {
                    numValueOf = null;
                }
                c2344009Gk2.LJ(numValueOf, "pic_cnt");
            }
            C2344009Gk c2344009Gk3 = (C2344009Gk) c19651011uW.LJIIIZ(this.LIZIZ.LLJILJILJ, objLIZIZ);
            C1357660lQy.LJI(c2344009Gk3, this.LIZIZ.LLJILJILJ);
            C1357660lQy.LJIIIIZZ(c2344009Gk3, this.LIZIZ.LLJILJILJ);
            C1357660lQy.LIZLLL(c2344009Gk3, this.LIZIZ.LLJILJILJ);
            if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk3.getClass();
            c2344009Gk3.LJIIIIZZ("login_type", str2);
            C20684815ws.LJIILLIIL("click_trans_layer", c2344009Gk3.LIZ);
            Aweme aweme6 = this.LIZIZ.LLJILJILJ;
            if (aweme6 != null && (aid2 = aweme6.getAid()) != null) {
                C1360460lVU.LIZIZ.LJJII().LJIILJJIL(aid2);
            }
            C308240C6k.LIZJ(7, "enterDislikeMode event, hide", false);
            this.LIZ.jd(true);
            Aweme aweme7 = this.LIZIZ.LLJILJILJ;
            if (aweme7 == null) {
                Fragment fragment = this.LIZLLL;
                final DialogC1372820lpQ dialogC1372820lpQLIZ = C1372400lok.LIZ(fragment, fragment.requireContext(), aweme7, enterFrom);
                if (c1372310lob.LJFF == 4) {
                    Window window = dialogC1372820lpQLIZ.getWindow();
                    if (window != null) {
                        window.clearFlags(2);
                    }
                    dialogC1372820lpQLIZ.setOnCancelListener(new DialogInterfaceOnCancelListenerC1401970maR(c1372310lob, 0));
                }
                dialogC1372820lpQLIZ.LLJILJILJ.LJIJ = new DialogInterfaceOnDismissListenerC1402050maZ(this.LIZJ, this.LIZLLL, new C1372170loN(dialogC1372820lpQLIZ), 4);
                C786410Ut5.B4(dialogC1372820lpQLIZ);
                C19EG activity = this.LIZLLL.getActivity();
                if (activity != null) {
                    C0SHX.LIZ(activity, null).LJIIJJI("long_press_panel", true, new C0TA1() { // from class: X.0lod
                        @Override // X.C0TA1
                        public final void LIZ() {
                            DialogC1372820lpQ dialogC1372820lpQ = dialogC1372820lpQLIZ;
                            dialogC1372820lpQ.getClass();
                            dialogC1372820lpQ.cancel();
                        }
                    });
                    return;
                }
                return;
            }
            C1440005kM.LIZ(new C739400SzS(i, i2));
        }
    }

    public C1372320loc(InterfaceC1372340loe interfaceC1372340loe, HomePageDataViewModel homePageDataViewModel, String str, DataCenter dataCenter, Fragment fragment) {
        this.LIZ = interfaceC1372340loe;
        this.LIZIZ = homePageDataViewModel;
        this.LIZJ = dataCenter;
        this.LIZLLL = fragment;
        EventBus.LIZLLL().LJIJJ(this);
        C844470XAv.LIZ.getClass();
        this.LJ = C12ES.LJIIJ(C844470XAv.LIZ());
        this.LJFF = C12ES.LJIIIIZZ(C844470XAv.LIZ());
    }
}
