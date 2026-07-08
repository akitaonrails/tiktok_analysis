package Y;

import X.C098200Yq;
import X.C0L3U;
import X.C0MFP;
import X.C1415610mwR;
import X.C1417080myo;
import X.C1417100myq;
import X.C189200o6;
import X.C19EG;
import X.C1C7U;
import X.C418440Gaw;
import X.C524440KhW;
import X.C524460KhY;
import X.C525230Kin;
import X.C540060LGa;
import X.C576610MjT;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC523400Kfq;
import X.InterfaceC576620MjU;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.StoryShootModel;
import com.ss.android.ugc.aweme.creative.model.record.LayoutMediaType;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.autocut.AutoCutProcessViewModel;
import com.ss.android.ugc.aweme.shortvideo.mediaselector.experiments.PrivateAlbumPartialAuthorizationBottomCTAExperiment;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.cut_ui_impl.newplayer.NewCutPlayerActivity;
import com.ss.android.ugc.gamora.recorder.layout.model.LayoutItemMedia;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS157S1100000_8;

/* JADX INFO: loaded from: classes9.dex */
public class ARunnableS27S0110000_8 implements Runnable {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        Unit unit;
        AutoCutProcessViewModel autoCutProcessViewModel;
        C19EG c19eg = (C19EG) this.l0;
        boolean z = this.z1;
        try {
            ViewModelProvider viewModelProviderLIZ = C0L3U.LIZ(c19eg);
            if (viewModelProviderLIZ == null || (autoCutProcessViewModel = (AutoCutProcessViewModel) viewModelProviderLIZ.get(AutoCutProcessViewModel.class)) == null) {
                unit = null;
            } else {
                autoCutProcessViewModel.LLILLJJLI.setValue(Boolean.valueOf(z));
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void LIZ$1() {
        Unit unit;
        AutoCutProcessViewModel autoCutProcessViewModel;
        C19EG c19eg = (C19EG) this.l0;
        boolean z = this.z1;
        try {
            ViewModelProvider viewModelProviderLIZ = C0L3U.LIZ(c19eg);
            if (viewModelProviderLIZ == null || (autoCutProcessViewModel = (AutoCutProcessViewModel) viewModelProviderLIZ.get(AutoCutProcessViewModel.class)) == null) {
                unit = null;
            } else {
                autoCutProcessViewModel.LLILLJJLI.setValue(Boolean.valueOf(z));
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void LIZ$3() {
        ((C0MFP) this.l0).LLLZLL();
        ((C0MFP) this.l0).LLLZIL();
        C0MFP c0mfp = (C0MFP) this.l0;
        boolean z = this.z1;
        c0mfp.getClass();
        int iLIZIZ = C1415610mwR.LIZIZ() - ((((c0mfp.LLLLLLIL().getMeasuredWidth() + ((View) c0mfp.LLLFZ.getValue()).getMeasuredWidth()) + (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) * 2)) + (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)) * 2)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30)));
        if (!z) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL)));
        }
        ((TextView) c0mfp.LLLIIII.getValue()).setMaxWidth(iLIZIZ);
        ((TextView) c0mfp.LLLIIIIL.getValue()).setMaxWidth(iLIZIZ);
        if (((C0MFP) this.l0).LLLLLLJ().getVisibility() != 0) {
            ((C0MFP) this.l0).LLLLLZL(true);
        }
    }

    public final void LIZ$4() {
        if (this.z1) {
            InterfaceC576620MjU interfaceC576620MjUK4 = ((C576610MjT) this.l0).K4();
            List<LayoutItemMedia> listKG2 = ((C576610MjT) this.l0).d5().KG2();
            boolean z = false;
            if (!(listKG2 instanceof Collection) || !listKG2.isEmpty()) {
                Iterator<LayoutItemMedia> it2 = listKG2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (it2.next().mediaType != LayoutMediaType.PHOTO) {
                        z = true;
                        break;
                    }
                }
            }
            interfaceC576620MjUK4.qa2(z);
        }
    }

    public final void LIZ$2() {
        ViewStub viewStub;
        InterfaceC523400Kfq c524460KhY;
        String creationId;
        CreativeModel creativeModel;
        StoryShootModel storyShootModel;
        String creationId2;
        String creationId3;
        CreativeModel creativeModel2;
        StoryShootModel storyShootModel2;
        if (PrivateAlbumPartialAuthorizationBottomCTAExperiment.isEnabled()) {
            viewStub = (ViewStub) ((MvChoosePhotoScene) this.l0).findViewById(R.id.view_stub_sticky_top_notice_v2);
            if (viewStub == null) {
                return;
            }
        } else {
            viewStub = (ViewStub) ((MvChoosePhotoScene) this.l0).findViewById(R.id.view_stub_sticky_top_notice);
            if (viewStub == null) {
                return;
            }
        }
        C540060LGa c540060LGa = C540060LGa.LIZ;
        MvChoosePhotoScene mvChoosePhotoScene = (MvChoosePhotoScene) this.l0;
        String str = mvChoosePhotoScene.shootWay;
        ShortVideoContext shortVideoContext = mvChoosePhotoScene.shortVideoContext;
        c540060LGa.getClass();
        String strLJFF = C540060LGa.LJFF(shortVideoContext, str);
        String strLIZLLL = C540060LGa.LIZLLL(((MvChoosePhotoScene) this.l0).getChooseScene$tools_camera_record_release(), new C525230Kin((MvChoosePhotoScene) this.l0));
        String str2 = "";
        if (this.z1) {
            ShortVideoContext shortVideoContext2 = ((MvChoosePhotoScene) this.l0).shortVideoContext;
            boolean z = ((MvChoosePhotoScene) this.l0).supportStoryStandaloneAlbum() && !((shortVideoContext2 == null || (creativeModel2 = shortVideoContext2.creativeModel) == null || (storyShootModel2 = creativeModel2.storyModel) == null) ? false : storyShootModel2.isStoryEntrance());
            boolean zIsEnabled = PrivateAlbumPartialAuthorizationBottomCTAExperiment.isEnabled();
            ShortVideoContext shortVideoContext3 = ((MvChoosePhotoScene) this.l0).shortVideoContext;
            if (shortVideoContext3 != null && (creationId3 = shortVideoContext3.getCreationId()) != null) {
                str2 = creationId3;
            }
            c524460KhY = new C524460KhY(strLJFF, strLIZLLL, str2, z, zIsEnabled, true);
        } else if (((MvChoosePhotoScene) this.l0).pageWithCameraCell()) {
            MvChoosePhotoScene mvChoosePhotoScene2 = (MvChoosePhotoScene) this.l0;
            int i = mvChoosePhotoScene2.supportFlags;
            ShortVideoContext shortVideoContext4 = mvChoosePhotoScene2.shortVideoContext;
            if (shortVideoContext4 != null && (creationId2 = shortVideoContext4.getCreationId()) != null) {
                str2 = creationId2;
            }
            c524460KhY = new C524440KhW(i, strLJFF, strLIZLLL, str2, new AwS157S1100000_8((MvChoosePhotoScene) this.l0, strLJFF, 1));
        } else {
            ShortVideoContext shortVideoContext5 = ((MvChoosePhotoScene) this.l0).shortVideoContext;
            boolean z2 = ((MvChoosePhotoScene) this.l0).supportStoryStandaloneAlbum() && !((shortVideoContext5 == null || (creativeModel = shortVideoContext5.creativeModel) == null || (storyShootModel = creativeModel.storyModel) == null) ? false : storyShootModel.isStoryEntrance());
            boolean zIsEnabled2 = PrivateAlbumPartialAuthorizationBottomCTAExperiment.isEnabled();
            ShortVideoContext shortVideoContext6 = ((MvChoosePhotoScene) this.l0).shortVideoContext;
            if (shortVideoContext6 != null && (creationId = shortVideoContext6.getCreationId()) != null) {
                str2 = creationId;
            }
            c524460KhY = new C524460KhY(strLJFF, strLIZLLL, str2, z2, zIsEnabled2, false);
        }
        c524460KhY.LIZ((MvChoosePhotoScene) this.l0, viewStub);
        ((MvChoosePhotoScene) this.l0).bannerInitializer = c524460KhY;
    }

    public static final void run$0(ARunnableS27S0110000_8 aRunnableS27S0110000_8) {
        boolean zLIZ;
        C1C7U.LIZ("AutoCutAlbumHelper@9720.startAutoCut$2$onTemplateListLoadFailed$1");
        try {
            aRunnableS27S0110000_8.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AutoCutAlbumHelper@9720.startAutoCut$2$onTemplateListLoadFailed$1");
    }

    public static final void run$1(ARunnableS27S0110000_8 aRunnableS27S0110000_8) {
        boolean zLIZ;
        C1C7U.LIZ("AutoCutEditHelper@aa47.getAutoCutProgressListener$listener$1$onTemplateListLoadFailed$1$1");
        try {
            aRunnableS27S0110000_8.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AutoCutEditHelper@aa47.getAutoCutProgressListener$listener$1$onTemplateListLoadFailed$1$1");
    }

    public static final void run$2(ARunnableS27S0110000_8 aRunnableS27S0110000_8) {
        boolean zLIZ;
        C1C7U.LIZ("MvChoosePhotoScene@c985.triggerPartialMediaAccessNotice$2");
        try {
            aRunnableS27S0110000_8.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MvChoosePhotoScene@c985.triggerPartialMediaAccessNotice$2");
    }

    public static final void run$3(ARunnableS27S0110000_8 aRunnableS27S0110000_8) {
        boolean zLIZ;
        C1C7U.LIZ("AILivePhotoPromptV2Scene@d033.onKeyboardChange$1");
        try {
            C0MFP c0mfp = (C0MFP) aRunnableS27S0110000_8.l0;
            HandlerHook.viewPost(c0mfp.LLLLLLL(), new ARunnableS27S0110000_8(c0mfp, aRunnableS27S0110000_8.z1, 4));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AILivePhotoPromptV2Scene@d033.onKeyboardChange$1");
    }

    public static final void run$4(ARunnableS27S0110000_8 aRunnableS27S0110000_8) {
        boolean zLIZ;
        C1C7U.LIZ("AILivePhotoPromptV2Scene@d033.onKeyboardChange$onAnimationEnd$1");
        try {
            aRunnableS27S0110000_8.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AILivePhotoPromptV2Scene@d033.onKeyboardChange$onAnimationEnd$1");
    }

    public static final void run$5(ARunnableS27S0110000_8 aRunnableS27S0110000_8) {
        boolean zLIZ;
        C1C7U.LIZ("CameraLayoutGridComponent@19bd.createPlayerView$1$1");
        try {
            aRunnableS27S0110000_8.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CameraLayoutGridComponent@19bd.createPlayerView$1$1");
    }

    public static final void run$6(ARunnableS27S0110000_8 aRunnableS27S0110000_8) {
        int i;
        NewCutPlayerActivity newCutPlayerActivity = (NewCutPlayerActivity) aRunnableS27S0110000_8.l0;
        boolean z = aRunnableS27S0110000_8.z1;
        String str = NewCutPlayerActivity._pnsPageId;
        C1C7U.LIZ("NewCutPlayerActivity@18cb.onPlayerPlaying$1L");
        View viewFindViewById = newCutPlayerActivity.findViewById(R.id.lr8);
        newCutPlayerActivity.LLJLILLLLZIIL.getClass();
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        C786410Ut5.LJLLLLLL(i, viewFindViewById);
        newCutPlayerActivity.LLJLILLLLZIIL.LIZ.getClass();
        C1C7U.LIZIZ("NewCutPlayerActivity@18cb.onPlayerPlaying$1L");
    }

    public ARunnableS27S0110000_8(C1417080myo c1417080myo, C19EG c19eg, int i) {
        this.$t = i;
        this.l0 = c19eg;
        this.z1 = true;
    }

    public ARunnableS27S0110000_8(C1417100myq c1417100myq, C19EG c19eg, int i) {
        this.$t = i;
        this.l0 = c19eg;
        this.z1 = true;
    }

    public ARunnableS27S0110000_8(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
