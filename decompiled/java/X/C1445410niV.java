package X;

import Y.ACListenerS156S0100000_22;
import Y.AObserverS218S0100000_14;
import Y.ARunnableS13S1200000_8;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.ArrayMap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.adaptation.PublishPreviewScene;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.AltTextChangeStatus;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.EditPostCheckResult;
import com.ss.android.ugc.aweme.creative.model.EditPostModel;
import com.ss.android.ugc.aweme.creative.model.MicroAppModel;
import com.ss.android.ugc.aweme.creative.model.draft.DraftInfoModel;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.poi.PoiPublishInfoModel;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.creative.model.publish.PostPageModel;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.editpost.BizExpiration;
import com.ss.android.ugc.aweme.editpost.EditPostBizPermissionStruct;
import com.ss.android.ugc.aweme.editpost.EditPostPermission;
import com.ss.android.ugc.aweme.editpost.EditPostResponse;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInfoKt;
import com.ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.infosticker.StickerChallenge;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.PoiReTagInfo;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.services.publish.AVPublishContentType;
import com.ss.android.ugc.aweme.services.publish.EditPostMobParam;
import com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo;
import com.ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.ss.android.ugc.aweme.services.publish.IAVPublishPageUIRefactorService;
import com.ss.android.ugc.aweme.services.publish.MobParam;
import com.ss.android.ugc.aweme.services.publish.PublishOutput;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.PublishBottomPanelViewModel;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.editpost.EditPostedVideoPublishActivity;
import com.ss.android.ugc.aweme.shortvideo.editpost.SceneWrapperFragment;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.ss.android.ugc.aweme.shortvideo.transition.VideoCoverBitmapHolder;
import com.ss.android.ugc.aweme.shortvideo.ui.ImagePublishPreviewScene;
import com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewScene;
import com.ss.android.ugc.aweme.shortvideo.ui.scene.ImagePublishPreviewViewPagerScene;
import com.ss.android.ugc.aweme.sticker.data.AutocaptionType;
import com.ss.android.ugc.aweme.sticker.data.CaptionStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.Utterance;
import com.ss.android.ugc.aweme.textsticker.TextStickerChallenges;
import com.ss.android.ugc.aweme.topic.ITopicCommonService;
import com.ss.android.ugc.aweme.topic.TopicCommonService;
import com.ss.android.ugc.aweme.utils.KeyBoardMonitor;
import com.zhiliaoapp.musically.R;
import irm.AkS59S0200000_21;
import irm.AkS90S0100000_22;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS388S0200000_22;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.Intrinsics;
import lth.o;

/* JADX INFO: renamed from: X.0niV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1445410niV extends Scene implements InterfaceC856870XjR, InterfaceC856920XjW {
    public final boolean LLJI;
    public View LLJIJIL;
    public C856850XjP LLJILJIL;
    public C857730Xkp LLJILJILJ;
    public LinearLayout LLJILLL;
    public C127K LLJJ;
    public LinearLayout LLJJI;
    public RelativeLayout LLJJIII;
    public View LLJJIJI;
    public C117U LLJJIJIIJIL;
    public C1322110kVd LLJJIJIL;
    public TuxTextView LLJJJ;
    public TuxTextView LLJJJIL;
    public TuxTextView LLJJJJ;
    public View LLJJJJJIL;
    public C197039127h LLJJJJLIIL;
    public TuxTextView LLJJL;
    public C0ZI0 LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;
    public TuxTextView LLJLIL;
    public ViewGroup LLJLILLLLZIIL;
    public C1318700kQ8 LLJLL;
    public C1002460cC4 LLJLLIL;
    public VideoPublishEditModel LLJLLL;
    public VideoCoverBitmapHolder LLJZ;
    public boolean LLJZIJLIL;
    public C1445640nis LLL;
    public EnumC1445450niZ LLLF;
    public View LLLFF;
    public int LLLFFI;
    public boolean LLLFZ;
    public boolean LLLI;
    public boolean LLLII;
    public C11VI LLLIIII;
    public HashMap<Integer, Boolean> LLLIIIIL;
    public final C01GW LLLIIIL;
    public PublishBottomPanelViewModel LLLIIL;
    public List<C0WIY<Class<?>, IAVPublishExtension<?>>> LLLIILIL;
    public View LLLIL;
    public C214848196g LLLILZ;
    public C0QB7 LLLILZJ;
    public View LLLILZLLLI;
    public SceneWrapperFragment LLLIZZ;
    public boolean LLLJ;
    public boolean LLLJIL;
    public C1430970nLD LLLJL;
    public final C01GW LLLL;
    public DialogC1390150mHN LLLLII;
    public float LLLLIIIILLL;

    public C1445410niV() {
        this(false);
    }

    @Override // X.InterfaceC856870XjR
    public final LifecycleOwner LJJJJ() {
        return this;
    }

    @Override // X.InterfaceC856920XjW
    public final void LLJILLL() {
    }

    public static final boolean LLLLLLLZIL() {
        IAVPublishPageUIRefactorService iAVPublishPageUIRefactorService = (IAVPublishPageUIRefactorService) PluggableExtentionKt.pluggableSpi$default(IAVPublishPageUIRefactorService.class, false, false, false, 14, null);
        if (iAVPublishPageUIRefactorService == null) {
            return false;
        }
        return iAVPublishPageUIRefactorService.enableRemoveHashTagLoading();
    }

    public final void LLLIILIL() {
        ArrayList<InteractionTagUserInfo> tagUserList;
        VideoPublishEditModel videoPublishEditModel = this.LLJLLL;
        if (videoPublishEditModel == null) {
            return;
        }
        if (videoPublishEditModel.getTagUserList() != null) {
            ArrayList arrayList = new ArrayList();
            VideoPublishEditModel videoPublishEditModel2 = this.LLJLLL;
            if (videoPublishEditModel2 == null || (tagUserList = videoPublishEditModel2.getTagUserList()) == null) {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            Iterator<InteractionTagUserInfo> it2 = tagUserList.iterator();
            while (it2.hasNext()) {
                arrayList.add(InteractionTagInfoKt.toMutualUser(it2.next()));
            }
            if (arrayList.size() > 0) {
                C0QB7 c0qb7 = this.LLLILZJ;
                if (c0qb7 == null) {
                    c0qb7 = null;
                }
                C786410Ut5.u1(c0qb7, 0);
                C0QB7 c0qb72 = this.LLLILZJ;
                (c0qb72 != null ? c0qb72 : null).LIZ(new MutualStruct(0, arrayList.size(), arrayList, 0), 4);
                return;
            }
        }
        C0QB7 c0qb73 = this.LLLILZJ;
        C786410Ut5.u1(c0qb73 != null ? c0qb73 : null, 8);
    }

    public final INetworkStateService LLLILZ() {
        return (INetworkStateService) this.LLLIIIL.getValue();
    }

    public final long LLLILZLLLI() {
        CreativeModel creativeModel;
        EditPostModel editPostModel;
        Long lValueOf;
        VideoPublishEditModel videoPublishEditModel = this.LLJLLL;
        if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (editPostModel = creativeModel.editPostModel) != null && (lValueOf = Long.valueOf(editPostModel.getAwemeCreateTime())) != null) {
            return C1443230nez.LIZJ(lValueOf.longValue());
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final DialogC1389620mGW LLLJ() {
        return (DialogC1389620mGW) this.LLLL.getValue();
    }

    public final void LLLLJ() {
        String str;
        VideoPublishEditModel videoPublishEditModel;
        CreativeModel creativeModel;
        EditPostModel editPostModel;
        List<PhotoModeImageUrlModel> imageList;
        Activity activity = this.mActivity;
        if (activity != null) {
            LLLIL(activity);
        }
        C1440930nbH c1440930nbH = C857150Xjt.LIZIZ;
        if (c1440930nbH == null || (str = c1440930nbH.LIZ) == null || (videoPublishEditModel = this.LLJLLL) == null || (creativeModel = videoPublishEditModel.creativeModel) == null || (editPostModel = creativeModel.editPostModel) == null || (imageList = editPostModel.getImageList()) == null) {
            return;
        }
        C1445720nj0 c1445720nj0 = new C1445720nj0(str);
        (C568750MSj.LIZIZ(this.LLJLLL) ? new C1445540nii(c1445720nj0) : new C1445550nij(c1445720nj0)).invoke(imageList, new InterfaceC1445690nix() { // from class: X.0niW
            @Override // X.InterfaceC1445690nix
            public final void onFailed() {
                C1445410niV c1445410niV = this.LIZ;
                c1445410niV.LLLJIL = false;
                c1445410niV.LLLLLLL();
            }

            @Override // X.InterfaceC1445690nix
            public final void onProgress(float f) {
                C1445410niV c1445410niV = this.LIZ;
                c1445410niV.LLLJIL = true;
                c1445410niV.LLLLIIIILLL = f;
                DialogC1390150mHN dialogC1390150mHN = c1445410niV.LLLLII;
                if (dialogC1390150mHN != null) {
                    dialogC1390150mHN.LJJLL(f, false);
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0041  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x00a4  */
            @Override // X.InterfaceC1445690nix
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onSuccess(java.util.List<com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo> r35) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 1081
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1445420niW.onSuccess(java.util.List):void");
            }

            @Override // X.InterfaceC1445690nix
            public final void LIZ(int i, String str2) {
                onFailed();
            }
        });
    }

    public final void LLLLJI() {
        String str;
        List<Utterance> list;
        List<AutocaptionType> list2;
        AutocaptionType autocaptionType;
        String str2;
        final String str3;
        final String str4;
        List<String> urlList;
        Activity activity = this.mActivity;
        if (activity != null) {
            LLLIL(activity);
        }
        C1440930nbH c1440930nbH = C857150Xjt.LIZIZ;
        if (c1440930nbH == null || (str = c1440930nbH.LIZ) == null) {
            return;
        }
        VideoPublishEditModel videoPublishEditModel = this.LLJLLL;
        if (videoPublishEditModel != null && videoPublishEditModel.getMainBusinessContext() != null) {
            VideoPublishEditModel videoPublishEditModel2 = this.LLJLLL;
            if (videoPublishEditModel2 != null) {
                CreativeModel creativeModel = videoPublishEditModel2.creativeModel;
                if (creativeModel != null) {
                    if (creativeModel.inlineCaptionModel == null) {
                        if (videoPublishEditModel2 != null) {
                        }
                    }
                }
                C1429890nJT mainBusinessContext = videoPublishEditModel2.getMainBusinessContext();
                if (mainBusinessContext != null) {
                    List<InteractStickerStruct> listLJI = C1429860nJQ.LJI(mainBusinessContext, 11, EnumC1428480nHC.TRACK_PAGE_EDIT);
                    if (listLJI != null && !listLJI.isEmpty() && ListProtector.get(listLJI, 0) != null) {
                        InteractStickerStruct interactStickerStruct = (InteractStickerStruct) ListProtector.get(listLJI, 0);
                        if (interactStickerStruct.getCaptionStruct() != null && !C086I.LIZIZ(interactStickerStruct.getCaptionStruct().autoCaptions) && (((list = interactStickerStruct.getCaptionStruct().utterances) == null || list.isEmpty()) && (list2 = interactStickerStruct.getCaptionStruct().autoCaptions) != null && (autocaptionType = (AutocaptionType) C13LP.LJJJLZIJ(0, list2)) != null && (str2 = autocaptionType.language) != null && str2.length() != 0 && (str3 = (String) C1445750nj3.LJIIIZ.getValue()) != null && str3.length() != 0)) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(str);
                            sbLIZ.append('_');
                            sbLIZ.append(str2);
                            sbLIZ.append(".json");
                            final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(str3);
                            sbLIZ2.append(File.separator);
                            sbLIZ2.append(strLIZIZ);
                            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                            if (!C2286708xd.LIZJ(strLIZIZ2)) {
                                List list3 = interactStickerStruct.getCaptionStruct().autoCaptions;
                                if (list3 == null) {
                                    list3 = C13BV.INSTANCE;
                                }
                                Iterator it2 = list3.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    AutocaptionType autocaptionType2 = (AutocaptionType) it2.next();
                                    if (Intrinsics.LJFF(autocaptionType2.language, str2)) {
                                        UrlModel urlModel = autocaptionType2.url;
                                        if (urlModel == null || (urlList = urlModel.getUrlList()) == null || (str4 = (String) C13LP.LJJJLZIJ(0, urlList)) == null) {
                                            str4 = "";
                                        }
                                        if (str4.length() != 0) {
                                            C1445750nj3 c1445750nj3 = C1445750nj3.LIZ;
                                            C1445750nj3.LJIIIIZZ = new AwS388S0200000_22(this, interactStickerStruct, 275);
                                            C15O7.LIZJ(new Callable() { // from class: X.0nj5
                                                @Override // java.util.concurrent.Callable
                                                public final Object call() {
                                                    C1C7U.LIZ("DownloadEditPostVideoManager@f4bd.downloadCaptionInBackground$1");
                                                    AbstractC2199801B7q abstractC2199801B7qWith = DownloadServiceManager.INSTANCE.getDownloadService().with(str4);
                                                    abstractC2199801B7qWith.LJ = str3;
                                                    abstractC2199801B7qWith.LIZJ = strLIZIZ;
                                                    abstractC2199801B7qWith.LJII = 1;
                                                    abstractC2199801B7qWith.LJJ = true;
                                                    abstractC2199801B7qWith.LJIIJJI = C1445750nj3.LJIIJ;
                                                    Integer numValueOf = Integer.valueOf(abstractC2199801B7qWith.LIZJ());
                                                    C1C7U.LIZIZ("DownloadEditPostVideoManager@f4bd.downloadCaptionInBackground$1");
                                                    return numValueOf;
                                                }
                                            });
                                        }
                                    }
                                }
                            } else {
                                LLLLLJIL(interactStickerStruct.getCaptionStruct(), strLIZIZ2);
                            }
                        }
                    }
                }
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1445400niU(this, str, null), 3);
    }

    public final void LLLLLLL() {
        DialogC1390150mHN dialogC1390150mHN = this.LLLLII;
        if (dialogC1390150mHN == null || !dialogC1390150mHN.isShowing() || this.mActivity == null) {
            return;
        }
        DialogC1390150mHN dialogC1390150mHN2 = this.LLLLII;
        if (dialogC1390150mHN2 != null) {
            dialogC1390150mHN2.dismiss();
            C785410UrT.LIZ(dialogC1390150mHN2);
        }
        EnumC1445450niZ enumC1445450niZ = this.LLLF;
        if (enumC1445450niZ == EnumC1445450niZ.CLICK_PREVIEW || enumC1445450niZ == EnumC1445450niZ.CLICK_PREVIEW_WITHOUT_IMAGE) {
            Activity activity = this.mActivity;
            if (activity == null) {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(2131833457);
            C1390380mHk.LIZ(activity, 2022, creativeToastBuilder);
            return;
        }
        if (enumC1445450niZ == EnumC1445450niZ.CLICK_SELECT_COVER) {
            Activity activity2 = this.mActivity;
            if (activity2 == null) {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
            creativeToastBuilder2.messageRes(2131833458);
            C1390380mHk.LIZ(activity2, 2022, creativeToastBuilder2);
            return;
        }
        if (enumC1445450niZ == EnumC1445450niZ.CLICK_EDIT) {
            Activity activity3 = this.mActivity;
            if (activity3 == null) {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            CreativeToastBuilder creativeToastBuilder3 = new CreativeToastBuilder();
            creativeToastBuilder3.messageRes(2131849117);
            C1390380mHk.LIZ(activity3, 2022, creativeToastBuilder3);
        }
    }

    public final boolean LLLLLLZ() {
        C0ZI0 c0zi0 = this.LLJJLIIIJLLLLLLLZ;
        if (c0zi0 == null) {
            c0zi0 = null;
        }
        int size = c0zi0.getMentionVideoIdList().size();
        if (size > 3) {
            C19EG fragmentActivity = getFragmentActivity();
            if (fragmentActivity != null) {
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.isCenterToast(C859340XnQ.LIZIZ());
                creativeToastBuilder.messageRes(2131830014);
                C1390380mHk.LIZ(fragmentActivity, 2018, creativeToastBuilder);
            }
            return true;
        }
        if (size != 3) {
            return false;
        }
        C19EG fragmentActivity2 = getFragmentActivity();
        if (fragmentActivity2 != null) {
            CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
            creativeToastBuilder2.isCenterToast(C859340XnQ.LIZIZ());
            creativeToastBuilder2.messageRes(2131830013);
            C1390380mHk.LIZ(fragmentActivity2, 2018, creativeToastBuilder2);
        }
        return true;
    }

    public final void LLLLZ() {
        Activity activity = this.mActivity;
        if (activity == null || !C0XF1.LIZLLL(activity) || LLLILZ().isFakeNetwork()) {
            return;
        }
        DialogC1390150mHN dialogC1390150mHN = this.LLLLII;
        if (dialogC1390150mHN != null) {
            C786410Ut5.K4(dialogC1390150mHN);
            return;
        }
        Activity activity2 = this.mActivity;
        if (activity2 == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        DialogC1390150mHN dialogC1390150mHN2 = new DialogC1390150mHN(activity2);
        Activity activity3 = this.mActivity;
        dialogC1390150mHN2.LJJLJLI(activity3 != null ? activity3.getString(R.string.txr) : null);
        dialogC1390150mHN2.LJJLL(this.LLLLIIIILLL, false);
        dialogC1390150mHN2.LJJLJ(false);
        dialogC1390150mHN2.LJJLIIJ(true);
        C786410Ut5.K4(dialogC1390150mHN2);
        this.LLLLII = dialogC1390150mHN2;
    }

    public final void LLLLZIL() {
        if (this.LLLII) {
            if (this.LLLJIL) {
                return;
            }
            LLLLJ();
            return;
        }
        Activity activity = this.mActivity;
        if (activity != null) {
            LLLIL(activity);
        }
        C1445750nj3 c1445750nj3 = C1445750nj3.LIZ;
        if (C1445750nj3.LJFF || C1445750nj3.LJI) {
            return;
        }
        C1445750nj3.LJI = true;
        AbstractC2199801B7q abstractC2199801B7q = C1445750nj3.LIZIZ;
        if (abstractC2199801B7q != null) {
            abstractC2199801B7q.LIZJ();
        }
    }

    @Override // X.InterfaceC856870XjR
    public final C19EG getFragmentActivity() {
        Activity activity = this.mActivity;
        if (activity instanceof C19EG) {
            return (C19EG) activity;
        }
        return null;
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        C19EG c19eg;
        Fragment fragmentLJJJJZ;
        VideoPublishEditModel videoPublishEditModel = this.LLJLLL;
        if (videoPublishEditModel != null) {
            C565950MHp.LIZIZ(videoPublishEditModel, videoPublishEditModel.creativeModel.postPageModel.isCoverBitmapSet);
        }
        super.onDestroyView();
        Activity activity = this.mActivity;
        if ((activity instanceof EditPostedVideoPublishActivity) && (c19eg = (C19EG) activity) != null && (fragmentLJJJJZ = c19eg.getSupportFragmentManager().LJJJJZ(R.id.iiv)) != null) {
            C19EH c19ehLJIIJ = c19eg.getSupportFragmentManager().LJIIJ();
            c19ehLJIIJ.LJIIZILJ(fragmentLJJJJZ);
            c19ehLJIIJ.LJIIIZ();
        }
        List<C0WIY<Class<?>, IAVPublishExtension<?>>> list = this.LLLIILIL;
        if (list != null) {
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                IAVPublishExtension iAVPublishExtension = (IAVPublishExtension) ((C0WIY) it2.next()).LIZIZ;
                if (iAVPublishExtension != null) {
                    iAVPublishExtension.onDestroy();
                }
            }
        }
        C117U c117u = this.LLJJIJIIJIL;
        if (c117u == null) {
            c117u = null;
        }
        C11JF c11jf = c117u.LLJLLL;
        if (c11jf != null && !c11jf.isDisposed()) {
            c117u.LLJLLL.dispose();
        }
        if (C298640BnC.LIZ()) {
            C214848196g c214848196g = this.LLLILZ;
            (c214848196g != null ? c214848196g : null).LJIILLIIL();
        }
    }

    public final String LLLIZZ() {
        return (C0C64.LJIILLIIL().LJIJ(31744, 0, "optimize_photo_mode_post_page_description", true) <= 0 || !this.LLLII) ? getString(2131848273) : getString(C305330Bxz.LIZ());
    }

    public final void LLLLLJLJLL() {
        Scene next;
        Function0<Unit> function0;
        NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(this);
        if (navigationSceneLIZ == null) {
            return;
        }
        Iterator<Scene> it2 = navigationSceneLIZ.getSceneList().iterator();
        do {
            next = null;
            if (!it2.hasNext()) {
                break;
            } else {
                next = it2.next();
            }
        } while (!(next instanceof C1445410niV));
        if (!(next instanceof C1445410niV) || next == null) {
            return;
        }
        for (Scene scene : C13LP.LJLJJLL(navigationSceneLIZ.getSceneList().subList(navigationSceneLIZ.getSceneList().indexOf(next) + 1, navigationSceneLIZ.getSceneList().size()))) {
            if ((scene instanceof ImagePublishPreviewScene) && (function0 = ((ImagePublishPreviewScene) scene).LLJLLL) != null) {
                function0.invoke();
            }
            navigationSceneLIZ.remove(scene);
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
        View view = this.LLLIL;
        if (view == null) {
            view = null;
        }
        C786410Ut5.LJLLLLLL(8, view);
        List<C0WIY<Class<?>, IAVPublishExtension<?>>> list = this.LLLIILIL;
        if (list != null) {
            Iterator<C0WIY<Class<?>, IAVPublishExtension<?>>> it2 = list.iterator();
            while (it2.hasNext()) {
                IAVPublishExtension<?> iAVPublishExtension = it2.next().LIZIZ;
                if (iAVPublishExtension != null) {
                    iAVPublishExtension.onResume();
                }
            }
        }
        C214848196g c214848196g = this.LLLILZ;
        (c214848196g != null ? c214848196g : null).LJIIZILJ();
    }

    @Override // X.InterfaceC856870XjR
    public final Fragment getFragment() {
        return this.LLLIZZ;
    }

    public C1445410niV(boolean z) {
        this.LLJI = z;
        this.LLLF = EnumC1445450niZ.NO_CLICK;
        this.LLLIIIL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(586));
        C0CHQ.LIZ().getRegionService();
        C20186013yc.LIZIZ().booleanValue();
        this.LLLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1472));
    }

    @Override // X.InterfaceC856870XjR
    public final String LL(int i) {
        return getString(i);
    }

    public final void LLLII(View view) {
        Activity activity;
        RelativeLayout.LayoutParams layoutParams;
        RelativeLayout.LayoutParams layoutParams2;
        SettingsManager.LIZLLL().getClass();
        if (!SettingsManager.LIZ("large_font_post_edit_fix_enabled", true) || (activity = this.mActivity) == null) {
            return;
        }
        int iLIZJ = (int) C12ES.LIZJ(42.0f, activity);
        int iLIZJ2 = (int) C12ES.LIZJ(44.0f, activity);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.gpt);
        if (tuxTextView != null) {
            ViewGroup.LayoutParams layoutParams3 = tuxTextView.getLayoutParams();
            if ((layoutParams3 instanceof RelativeLayout.LayoutParams) && (layoutParams2 = (RelativeLayout.LayoutParams) layoutParams3) != null) {
                layoutParams2.height = -2;
                tuxTextView.setMinHeight(iLIZJ);
                C786410Ut5.R6(tuxTextView, layoutParams2);
            }
        }
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.sg9);
        if (frameLayout != null) {
            ViewGroup.LayoutParams layoutParams4 = frameLayout.getLayoutParams();
            if ((layoutParams4 instanceof RelativeLayout.LayoutParams) && (layoutParams = (RelativeLayout.LayoutParams) layoutParams4) != null) {
                layoutParams.height = -2;
                frameLayout.setMinimumHeight(iLIZJ2);
                C786410Ut5.a6(frameLayout, layoutParams);
            }
        }
        View viewFindViewById = view.findViewById(R.id.sgr);
        if (viewFindViewById != null) {
            ViewGroup.LayoutParams layoutParams5 = viewFindViewById.getLayoutParams();
            if (layoutParams5 != null) {
                layoutParams5.height = -2;
            }
            viewFindViewById.setMinimumHeight(iLIZJ2);
        }
    }

    public final void LLLIL(Activity activity) {
        if (!C0XF1.LIZLLL(activity)) {
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(2131833464);
            C1390380mHk.LIZ(activity, 2022, creativeToastBuilder);
        } else if (LLLILZ().isWeakNetwork()) {
            CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
            creativeToastBuilder2.messageRes(2131833468);
            C1390380mHk.LIZ(activity, 2022, creativeToastBuilder2);
        } else {
            if (!LLLILZ().isFakeNetwork()) {
                return;
            }
            CreativeToastBuilder creativeToastBuilder3 = new CreativeToastBuilder();
            creativeToastBuilder3.messageRes(2131833462);
            C1390380mHk.LIZ(activity, 2022, creativeToastBuilder3);
        }
    }

    public final void LLLLIILL(View view) {
        if (this.LLLI) {
            return;
        }
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.ds9);
        this.LLJJJ = tuxTextView;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        Activity activity = this.mActivity;
        if (activity != null) {
            tuxTextView.setText(activity.getString(2131833456));
            C786410Ut5.O7((FrameLayout) view.findViewById(R.id.ds8), new C1466570oGd(this, 33));
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0091  */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLIL(android.view.View r13) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1445410niV.LLLLIL(android.view.View):void");
    }

    public final void LLLLILI(View view) {
        TuxTextView tuxTextView;
        this.LLJJJIL = (TuxTextView) view.findViewById(R.id.f5h);
        if (C1447250nlT.LIZIZ() && (tuxTextView = this.LLJJJIL) != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 0);
        }
    }

    public final void LLLLL(View view) {
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.gr0);
        this.LLJJJJ = tuxTextView;
        if (tuxTextView != null) {
            C786410Ut5.h9(tuxTextView, new ACListenerS156S0100000_22(this, 50));
        }
        C337180DJs.LIZJ(this.LLJJJJ);
    }

    public final void LLLLLIL(View view) {
        C190N c190n = C190N.LIZIZ;
        if (c190n.LIZJ(true) && this.LLJLLL != null) {
            C127K c127k = (C127K) view.findViewById(R.id.vof);
            C786410Ut5.LLZLL(c127k, 0);
            int iLIZIZ = c190n.LIZIZ();
            if (iLIZIZ != 2 && iLIZIZ != 3) {
                if (iLIZIZ != 4) {
                    c127k.setTitle(getString(2131849592));
                } else {
                    c127k.setTitle(getString(2131849591));
                }
            } else {
                c127k.setTitle(getString(2131849590));
            }
            C11G4 c11g4 = (C11G4) c127k.getAccessory();
            if (c11g4 != null) {
                c11g4.LJIILL(new ACListenerS156S0100000_22(this, 51));
            }
            C0QB7 c0qb7 = (C0QB7) view.findViewById(R.id.vob);
            this.LLLILZJ = c0qb7;
            C19EG c19eg = null;
            if (c0qb7 == null) {
                c0qb7 = null;
            }
            c0qb7.LIZJ((int) C12ES.LIZJ(28.0f, o.LIZ), (int) C12ES.LIZJ(20.0f, o.LIZ));
            LLLIILIL();
            if (c190n.LIZIZ() < 2) {
                this.LLLILZLLLI = view.findViewById(R.id.voe);
                Activity activity = this.mActivity;
                if (activity instanceof C19EG) {
                    c19eg = (C19EG) activity;
                }
                c190n.LJFF(c19eg, new AwS566S0100000_22(this, 1033));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:179:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x041d A[PHI: r21
      0x041d: PHI (r21v8 int) = (r21v1 int), (r21v9 int), (r21v9 int), (r21v9 int), (r21v9 int) binds: [B:280:0x041a, B:291:0x0430, B:293:0x0436, B:295:0x043c, B:624:0x041d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0422 A[PHI: r21 r22
      0x0422: PHI (r21v7 int) = (r21v2 int), (r21v2 int), (r21v2 int), (r21v2 int), (r21v8 int) binds: [B:303:0x045b, B:305:0x0461, B:307:0x0467, B:618:0x0422, B:283:0x041f] A[DONT_GENERATE, DONT_INLINE]
      0x0422: PHI (r22v6 int) = (r22v1 int), (r22v1 int), (r22v1 int), (r22v1 int), (r22v7 int) binds: [B:303:0x045b, B:305:0x0461, B:307:0x0467, B:618:0x0422, B:283:0x041f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x042c A[EDGE_INSN: B:289:0x042a->B:290:0x042c BREAK  A[LOOP:4: B:263:0x03df->B:569:0x03df], PHI: r21
      0x042c: PHI (r21v9 int) = (r21v1 int), (r21v10 int) binds: [B:280:0x041a, B:289:0x042a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0457 A[EDGE_INSN: B:301:0x0455->B:302:0x0457 BREAK  A[LOOP:14: B:297:0x0442->B:626:?], PHI: r21 r22
      0x0457: PHI (r21v2 int) = (r21v8 int), (r21v9 int) binds: [B:283:0x041f, B:301:0x0455] A[DONT_GENERATE, DONT_INLINE]
      0x0457: PHI (r22v1 int) = (r22v7 int), (r22v8 int) binds: [B:283:0x041f, B:301:0x0455] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x04a3 A[EDGE_INSN: B:318:0x04a1->B:319:0x04a3 BREAK  A[LOOP:13: B:309:0x046d->B:621:0x046d], PHI: r21 r22 r24
      0x04a3: PHI (r21v3 int) = (r21v2 int), (r21v7 int) binds: [B:318:0x04a1, B:286:0x0424] A[DONT_GENERATE, DONT_INLINE]
      0x04a3: PHI (r22v2 int) = (r22v1 int), (r22v6 int) binds: [B:318:0x04a1, B:286:0x0424] A[DONT_GENERATE, DONT_INLINE]
      0x04a3: PHI (r24v2 int) = (r24v1 int), (r24v6 int) binds: [B:318:0x04a1, B:286:0x0424] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:482:0x072a  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x0814  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLLLJ(final boolean r35) {
        /*
            Method dump skipped, instruction units count: 2132
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1445410niV.LLLLLLJ(boolean):void");
    }

    public final void LLLLLLLLL(Intent intent) {
        if (intent != null) {
            C0ZIK c0zik = (C0ZIK) intent.getSerializableExtra("chainInfo");
            C0ZIQ c0ziq = (C0ZIQ) intent.getSerializableExtra("mention_video_Info_with_subtype");
            C0ZI0 c0zi0 = null;
            if (c0zik != null && !LLLLLLZ()) {
                C0ZI0 c0zi02 = this.LLJJLIIIJLLLLLLLZ;
                if (c0zi02 != null) {
                    c0zi0 = c0zi02;
                }
                c0zi0.LJIILIIL(c0zik, "");
                return;
            }
            if (c0ziq == null || LLLLLLZ()) {
                return;
            }
            C0ZIO c0zio = C0ZIO.LIZ;
            C0ZI0 c0zi03 = this.LLJJLIIIJLLLLLLLZ;
            if (c0zi03 != null) {
                c0zi0 = c0zi03;
            }
            c0zio.getClass();
            C0ZIO.LJFF(c0zi0, c0ziq);
        }
    }

    public final void LLLLLLZZ(boolean z) throws Throwable {
        ArrayList arrayListLIZ;
        C856850XjP c856850XjP = this.LLJILJIL;
        if (c856850XjP == null) {
            c856850XjP = null;
        }
        c856850XjP.LJIIZILJ();
        C214848196g c214848196g = this.LLLILZ;
        if (c214848196g == null) {
            c214848196g = null;
        }
        C0I7D c0i7d = c214848196g.LJIILL;
        if (c0i7d != null) {
            C0DSM.LIZ(c0i7d);
        }
        VideoPublishEditModel videoPublishEditModel = this.LLJLLL;
        if (videoPublishEditModel != null) {
            C856850XjP c856850XjP2 = this.LLJILJIL;
            if (c856850XjP2 == null) {
                c856850XjP2 = null;
            }
            videoPublishEditModel.setTitle(c856850XjP2.LJII(true));
            VideoPublishEditModel videoPublishEditModel2 = this.LLJLLL;
            if (videoPublishEditModel2 != null) {
                C214848196g c214848196g2 = this.LLLILZ;
                if (c214848196g2 == null) {
                    c214848196g2 = null;
                }
                videoPublishEditModel2.setHeading(c214848196g2.LJI());
                C856850XjP c856850XjP3 = this.LLJILJIL;
                if (c856850XjP3 == null) {
                    c856850XjP3 = null;
                }
                List<TextExtraStruct> listLJJIJIL = c856850XjP3.LIZIZ.LJJIJIL(c856850XjP3.LJIIJJI, true);
                if (listLJJIJIL != null && (arrayListLIZ = C19881612qc.LIZ(C19881612qc.LIZLLL(listLJJIJIL, new C858720XmQ()))) != null) {
                    VideoPublishEditModel videoPublishEditModel3 = this.LLJLLL;
                    if (videoPublishEditModel3 != null) {
                        videoPublishEditModel3.setStructList(arrayListLIZ);
                        return;
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void LLLLLZ(View view) {
        int i;
        this.LLJL = (TuxTextView) view.findViewById(R.id.b_6);
        this.LLJLIL = (TuxTextView) view.findViewById(R.id.b_5);
        this.LLJJL = (TuxTextView) view.findViewById(R.id.afg);
        TuxTextView tuxTextView = this.LLJL;
        TuxTextView tuxTextView2 = null;
        C214848196g c214848196g = null;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        tuxTextView.setTuxFont(62);
        TuxTextView tuxTextView3 = this.LLJLIL;
        if (tuxTextView3 == null) {
            tuxTextView3 = null;
        }
        tuxTextView3.setTuxFont(62);
        TuxTextView tuxTextView4 = this.LLJJL;
        if (tuxTextView4 == null) {
            tuxTextView4 = null;
        }
        tuxTextView4.setTuxFont(62);
        if (this.LLLII) {
            i = R.drawable.ar4;
        } else {
            i = R.drawable.ar5;
        }
        TuxTextView tuxTextView5 = this.LLJL;
        if (tuxTextView5 == null) {
            tuxTextView5 = null;
        }
        tuxTextView5.setBackgroundResource(i);
        TuxTextView tuxTextView6 = this.LLJLIL;
        if (tuxTextView6 == null) {
            tuxTextView6 = null;
        }
        tuxTextView6.setBackgroundResource(i);
        TuxTextView tuxTextView7 = this.LLJJL;
        if (tuxTextView7 == null) {
            tuxTextView7 = null;
        }
        tuxTextView7.setBackgroundResource(i);
        if (((ISearchService) ServiceManager.get().getService(ISearchService.class)).LLZLI().disableHashtagSearch) {
            TuxTextView tuxTextView8 = this.LLJL;
            if (tuxTextView8 == null) {
                tuxTextView8 = null;
            }
            C786410Ut5.LLLLZLL(tuxTextView8, 8);
        }
        if (((ISearchService) ServiceManager.get().getService(ISearchService.class)).LLZLI().disableAtUserSearch) {
            TuxTextView tuxTextView9 = this.LLJLIL;
            if (tuxTextView9 == null) {
                tuxTextView9 = null;
            }
            C786410Ut5.LLLLZLL(tuxTextView9, 8);
        }
        if (this.LLLI) {
            C214848196g c214848196g2 = this.LLLILZ;
            if (c214848196g2 != null) {
                c214848196g = c214848196g2;
            }
            c214848196g.LJIL();
            return;
        }
        TuxTextView tuxTextView10 = this.LLJLIL;
        if (tuxTextView10 == null) {
            tuxTextView10 = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) tuxTextView10.getLayoutParams();
        Activity activity = this.mActivity;
        if (activity != null) {
            marginLayoutParams.setMarginEnd((int) activity.getResources().getDimension(R.dimen.ad4));
            TuxTextView tuxTextView11 = this.LLJLIL;
            if (tuxTextView11 == null) {
                tuxTextView11 = null;
            }
            C786410Ut5.R6(tuxTextView11, marginLayoutParams);
            TuxTextView tuxTextView12 = this.LLJJL;
            if (tuxTextView12 == null) {
                tuxTextView12 = null;
            }
            C786410Ut5.LLLLZLL(tuxTextView12, 0);
            Activity activity2 = this.mActivity;
            if (activity2 == null) {
                return;
            }
            TuxTextView tuxTextView13 = this.LLJLIL;
            if (tuxTextView13 == null) {
                tuxTextView13 = null;
            }
            C0ZIO c0zio = C0ZIO.LIZ;
            tuxTextView13.setCompoundDrawablesRelative(C0ZIO.LIZIZ(c0zio, activity2, R.raw.icon_at, 0, 12), null, null, null);
            TuxTextView tuxTextView14 = this.LLJL;
            if (tuxTextView14 == null) {
                tuxTextView14 = null;
            }
            tuxTextView14.setCompoundDrawablesRelative(C0ZIO.LIZIZ(c0zio, activity2, R.raw.icon_number, 0, 12), null, null, null);
            TuxTextView tuxTextView15 = this.LLJJL;
            if (tuxTextView15 == null) {
                tuxTextView15 = null;
            }
            tuxTextView15.setCompoundDrawablesRelative(C0ZIO.LIZIZ(c0zio, activity2, R.raw.icon_play_circle, 0, 12), null, null, null);
            int iLJIIJ = C12ES.LJIIJ(this.mActivity) - ((int) C12ES.LIZJ(46.0f, this.mActivity));
            TuxTextView tuxTextView16 = this.LLJJL;
            if (tuxTextView16 == null) {
                tuxTextView16 = null;
            }
            int i2 = iLJIIJ / 3;
            tuxTextView16.setMaxWidth(i2);
            TuxTextView tuxTextView17 = this.LLJL;
            if (tuxTextView17 == null) {
                tuxTextView17 = null;
            }
            tuxTextView17.setMaxWidth(i2);
            TuxTextView tuxTextView18 = this.LLJLIL;
            if (tuxTextView18 == null) {
                tuxTextView18 = null;
            }
            tuxTextView18.setMaxWidth(i2);
            IAVPublishPageUIRefactorService iAVPublishPageUIRefactorService = (IAVPublishPageUIRefactorService) PluggableExtentionKt.pluggableSpi$default(IAVPublishPageUIRefactorService.class, false, false, false, 14, null);
            if (iAVPublishPageUIRefactorService != null && iAVPublishPageUIRefactorService.enableLargeMentionAndHashTagBtn()) {
                TuxTextView tuxTextView19 = this.LLJL;
                if (tuxTextView19 == null) {
                    tuxTextView19 = null;
                }
                tuxTextView19.setTuxFont(42);
                TuxTextView tuxTextView20 = this.LLJL;
                if (tuxTextView20 == null) {
                    tuxTextView20 = null;
                }
                LLLLLLLLLL(-1.0f, 32.0f, tuxTextView20);
                TuxTextView tuxTextView21 = this.LLJL;
                if (tuxTextView21 == null) {
                    tuxTextView21 = null;
                }
                tuxTextView21.setBackgroundResource(R.drawable.aqn);
                TuxTextView tuxTextView22 = this.LLJLIL;
                if (tuxTextView22 == null) {
                    tuxTextView22 = null;
                }
                tuxTextView22.setTuxFont(42);
                TuxTextView tuxTextView23 = this.LLJLIL;
                if (tuxTextView23 == null) {
                    tuxTextView23 = null;
                }
                LLLLLLLLLL(-1.0f, 32.0f, tuxTextView23);
                TuxTextView tuxTextView24 = this.LLJLIL;
                if (tuxTextView24 != null) {
                    tuxTextView2 = tuxTextView24;
                }
                tuxTextView2.setBackgroundResource(R.drawable.aqn);
                return;
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void LLLLLZL(String str) {
        String strLIZIZ;
        C1322110kVd c1322110kVd = this.LLJJIJIL;
        String videoCoverPath = null;
        if (c1322110kVd == null) {
            c1322110kVd = null;
        }
        VideoPublishEditModel videoPublishEditModel = this.LLJLLL;
        if (videoPublishEditModel != null) {
            strLIZIZ = C1429320nIY.LIZIZ(videoPublishEditModel);
        } else {
            strLIZIZ = null;
        }
        if ((!C1429320nIY.LIZJ(this.LLJLLL) || !C2286708xd.LIZJ(strLIZIZ)) && !C0MH8.LIZ.LJ(this.LLJLLL, -1)) {
            if (C889340Yui.LIZ()) {
                C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("setThumbImageWithUri: decode branch, uri=");
                sbLIZ.append(str);
                sbLIZ.append(", videoCoverPath=");
                VideoPublishEditModel videoPublishEditModel2 = this.LLJLLL;
                if (videoPublishEditModel2 != null) {
                    videoCoverPath = videoPublishEditModel2.getVideoCoverPath();
                }
                sbLIZ.append(videoCoverPath);
                sbLIZ.append(", customPath=");
                sbLIZ.append(strLIZIZ);
                c1437510nVlLJJLIIIJ.LIZ("EditPostPublishScene", C2188811AlT.LIZIZ(sbLIZ));
            }
            if (str == null) {
                return;
            }
            HandlerHook.viewPost(c1322110kVd, new ARunnableS13S1200000_8(c1322110kVd, str, this, 4));
            return;
        }
        if (C889340Yui.LIZ()) {
            C1437510nVl c1437510nVlLJJLIIIJ2 = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("setThumbImageWithUri: helper branch, uri=");
            sbLIZ2.append(str);
            sbLIZ2.append(", videoCoverPath=");
            VideoPublishEditModel videoPublishEditModel3 = this.LLJLLL;
            if (videoPublishEditModel3 != null) {
                videoCoverPath = videoPublishEditModel3.getVideoCoverPath();
            }
            sbLIZ2.append(videoCoverPath);
            sbLIZ2.append(", customPath=");
            sbLIZ2.append(strLIZIZ);
            c1437510nVlLJJLIIIJ2.LIZ("EditPostPublishScene", C2188811AlT.LIZIZ(sbLIZ2));
        }
        VideoPublishEditModel videoPublishEditModel4 = this.LLJLLL;
        if (videoPublishEditModel4 != null) {
            C1443990ngD.LJIIJJI(videoPublishEditModel4, c1322110kVd, getFragmentActivity(), null, this);
        }
    }

    public static boolean LLLLLILLIL(EditPostPermission editPostPermission, List list) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(((EnumC1379590m0L) it2.next()).getValue()));
        }
        List<EditPostBizPermissionStruct> list2 = editPostPermission.bizPermission;
        if (list2 == null) {
            return false;
        }
        ArrayList arrayList2 = new ArrayList();
        for (EditPostBizPermissionStruct editPostBizPermissionStruct : list2) {
            if (arrayList.contains(Integer.valueOf(editPostBizPermissionStruct.bizType))) {
                arrayList2.add(editPostBizPermissionStruct);
            }
        }
        if (!arrayList2.isEmpty()) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                if (((EditPostBizPermissionStruct) it3.next()).bizStatus != C0JMD.SHOW.getValue()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void LLLIIIIL(C1322110kVd c1322110kVd, UrlModel urlModel) {
        if (urlModel != null) {
            C857150Xjt c857150Xjt = C857150Xjt.LIZ;
            c1322110kVd.getHeight();
            c857150Xjt.getClass();
            C1324750kZt.LJIIIIZZ(c1322110kVd, urlModel, null, new C1466980oHI(this, 1));
            VideoPublishEditModel videoPublishEditModel = this.LLJLLL;
            if (videoPublishEditModel != null) {
                C565950MHp.LIZ(videoPublishEditModel);
            }
        }
    }

    public final void LLLJL(boolean z, Integer num) {
        C1002460cC4 c1002460cC4 = this.LLJLLIL;
        C1002460cC4 c1002460cC42 = null;
        if (c1002460cC4 == null) {
            c1002460cC4 = null;
        }
        c1002460cC4.setInterceptTouchEvent(!z);
        if (z) {
            TuxTextView tuxTextView = this.LLJJJJ;
            if (tuxTextView != null) {
                C337180DJs.LIZJ(tuxTextView);
            }
            C1002460cC4 c1002460cC43 = this.LLJLLIL;
            if (c1002460cC43 == null) {
                c1002460cC43 = null;
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1002460cC43);
            c1002460cC43.setAlpha(1.0f);
            C1002460cC4 c1002460cC44 = this.LLJLLIL;
            if (c1002460cC44 == null) {
                c1002460cC44 = null;
            }
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(c1002460cC44);
            }
            c1002460cC44.setOnClickListener(null);
            C1002460cC4 c1002460cC45 = this.LLJLLIL;
            if (c1002460cC45 != null) {
                c1002460cC42 = c1002460cC45;
            }
            c1002460cC42.setDescendantFocusability(131072);
            return;
        }
        TuxTextView tuxTextView2 = this.LLJJJJ;
        if (tuxTextView2 != null) {
            C337180DJs.LIZ(tuxTextView2);
        }
        C1002460cC4 c1002460cC46 = this.LLJLLIL;
        if (c1002460cC46 == null) {
            c1002460cC46 = null;
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1002460cC46);
        c1002460cC46.setAlpha(0.34f);
        C1002460cC4 c1002460cC47 = this.LLJLLIL;
        if (c1002460cC47 == null) {
            c1002460cC47 = null;
        }
        c1002460cC47.setDescendantFocusability(393216);
        C1002460cC4 c1002460cC48 = this.LLJLLIL;
        if (c1002460cC48 != null) {
            c1002460cC42 = c1002460cC48;
        }
        C786410Ut5.I7(new AkS59S0200000_21(num, this, 8), c1002460cC42);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [X.0nic] */
    public final void LLLLIIIILLL(final View view, Bundle bundle) throws Throwable {
        SceneWrapperFragment sceneWrapperFragment;
        EditPostPermission editPostPermission;
        C855530XhH c855530XhH;
        C214848196g c214848196g;
        C214848196g c214848196g2;
        UrlModel videoCoverAddr;
        List<AVChallenge> readTextChallenges;
        C856850XjP c856850XjP;
        EditPostBizPermissionStruct editPostBizPermissionStruct;
        C197039127h c197039127h;
        C197039127h c197039127h2;
        CreativeModel creativeModel;
        EditPostModel editPostModel;
        EditPostPermission editPostPermission2;
        List<EditPostBizPermissionStruct> list;
        EditPostBizPermissionStruct next;
        MicroAppModel microAppModel;
        MobParam mobParam;
        MusicBuzModel musicBuzModel;
        PoiData originPoiData;
        EditPostPermission editPostPermission3;
        Integer awemeType;
        String awemeId;
        String str;
        PoiReTagInfo poiReTagInfo;
        PoiPublishInfoModel poiPublishInfoModel;
        CreativeModel creativeModel2;
        EditPostModel editPostModel2;
        CreativeModel creativeModel3;
        EditPostModel editPostModel3;
        String str2;
        CreativeModel creativeModel4;
        EditPostModel editPostModel4;
        CreativeModel creativeModel5;
        EditPostModel editPostModel5;
        CreativeModel creativeModel6;
        EditPostModel editPostModel6;
        CreativeModel creativeModel7;
        EditPostModel editPostModel7;
        CreativeModel creativeModel8;
        String str3;
        VideoPublishEditModel videoPublishEditModel;
        CreativeModel creativeModel9;
        PostPageModel postPageModel;
        CreativeModel creativeModel10;
        PostPageModel postPageModel2;
        Collection<AVChallenge> collectionInfoStickerChallenges;
        Collection<AVChallenge> collectionInfoStickerChallenges2;
        CreativeModel creativeModel11;
        CreativeModel creativeModel12;
        EditPostModel editPostModel8;
        CreativeModel creativeModel13;
        EditPostModel editPostModel9;
        MutableLiveData<C890640Ywo> mutableLiveData;
        Integer numLIZJ;
        CreativeModel creativeModel14;
        EditPostModel editPostModel10;
        EditPostedVideoPublishActivity editPostedVideoPublishActivity;
        this.LLJIJIL = view.findViewById(R.id.gr6);
        this.LLLIIL = (PublishBottomPanelViewModel) new ViewModelProvider(this).get(PublishBottomPanelViewModel.class);
        if (!C568750MSj.LIZIZ(this.LLJLLL)) {
            View view2 = this.LLJIJIL;
            if (view2 == null) {
                view2 = null;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view2.getLayoutParams();
            int iLIZJ = ((int) C12ES.LIZJ(52.0f, this.mActivity)) + 1;
            Activity activity = this.mActivity;
            if (activity != null) {
                layoutParams.topMargin = iLIZJ + ScreenUtils.getStatusBarHeight(activity);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        C856320XiY c856320XiY = new C856320XiY(view);
        ViewOnScrollChangeListenerC855440Xh8 viewOnScrollChangeListenerC855440Xh8 = c856320XiY.LIZLLL;
        if (viewOnScrollChangeListenerC855440Xh8 != null) {
            ((View) c856320XiY.LIZIZ.getValue()).setOnScrollChangeListener(viewOnScrollChangeListenerC855440Xh8);
        }
        new AwS566S0100000_22(this, 1035);
        ((C856320XiY) new AwS566S0100000_22(c856320XiY, 1036).invoke()).LIZJ.add(new C855340Xgy());
        View viewFindViewById = view.findViewById(R.id.kwg);
        this.LLLIL = viewFindViewById;
        if (viewFindViewById == null) {
            viewFindViewById = null;
        }
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.0nid
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
            }
        }, viewFindViewById);
        View view3 = this.LLLIL;
        if (view3 == null) {
            view3 = null;
        }
        C786410Ut5.LJLLLLLL(8, view3);
        VideoPublishEditModel videoPublishEditModel2 = this.LLJLLL;
        if (videoPublishEditModel2 != null) {
            C214848196g c214848196g3 = new C214848196g(videoPublishEditModel2, this, view, new InterfaceC214845196d() { // from class: X.0nic
                @Override // X.InterfaceC214845196d
                public final void LIZ() {
                }

                @Override // X.InterfaceC214845196d
                public final boolean LIZIZ() {
                    return false;
                }

                @Override // X.InterfaceC214845196d
                public final void LIZJ(int i) {
                }

                @Override // X.InterfaceC214845196d
                public final void LIZLLL() {
                }

                @Override // X.InterfaceC214845196d
                public final void LJ(C1322110kVd c1322110kVd, int i) throws Throwable {
                    this.LIZ.LLLLLLIL(i, c1322110kVd);
                }
            }, new AwS566S0100000_22(this, 1034));
            this.LLLILZ = c214848196g3;
            c214848196g3.LJII(view);
            ExtensionDataRepo extensionDataRepo = (ExtensionDataRepo) C1659670tI5.LIZ(this).get(ExtensionDataRepo.class);
            Activity activity2 = this.mActivity;
            if (!(activity2 instanceof EditPostedVideoPublishActivity) || (editPostedVideoPublishActivity = (EditPostedVideoPublishActivity) activity2) == null || (sceneWrapperFragment = editPostedVideoPublishActivity.LLJ) == null) {
                sceneWrapperFragment = null;
            }
            this.LLLIZZ = sceneWrapperFragment;
            LLLLLIL(view);
            LLLLIL(view);
            this.LLJJI = (LinearLayout) view.findViewById(R.id.mex);
            this.LLJJIII = (RelativeLayout) view.findViewById(R.id.sg2);
            this.LLJLILLLLZIIL = (ViewGroup) view.findViewById(R.id.jh0);
            this.LLJJLIIIJLLLLLLLZ = (C0ZI0) view.findViewById(R.id.guf);
            this.LLJJIJIL = (C1322110kVd) view.findViewById(R.id.kbf);
            this.LLJLL = (C1318700kQ8) view.findViewById(R.id.sgc);
            this.LLJLLIL = (C1002460cC4) view.findViewById(R.id.gp8);
            this.LLJJJJJIL = view.findViewById(R.id.sg9);
            C197039127h c197039127h3 = (C197039127h) view.findViewById(R.id.sgr);
            this.LLJJJJLIIL = c197039127h3;
            if (c197039127h3 != null) {
                c197039127h3.setBackgroundRadius(200);
            }
            LLLII(view);
            this.LLJILLL = (LinearLayout) view.findViewById(R.id.hif);
            this.LLJJ = (C127K) view.findViewById(R.id.ay8);
            TextView textView = (TextView) view.findViewById(R.id.gpt);
            if (textView == null) {
                textView = null;
            }
            Activity activity3 = this.mActivity;
            if (activity3 != null) {
                VideoPublishEditModel videoPublishEditModel3 = this.LLJLLL;
                if (videoPublishEditModel3 != null && (creativeModel14 = videoPublishEditModel3.creativeModel) != null && (editPostModel10 = creativeModel14.editPostModel) != null) {
                    editPostPermission = editPostModel10.getEditPostPermission();
                } else {
                    editPostPermission = null;
                }
                textView.setText(LLLLLL(activity3, editPostPermission));
                View view4 = this.LLJJJJJIL;
                if (view4 == null) {
                    view4 = null;
                }
                C786410Ut5.I7(new AkS90S0100000_22(this, 28), view4);
                int i = C20094413jq.LJIIZILJ;
                View view5 = this.LLJJJJJIL;
                if (view5 == null) {
                    view5 = null;
                }
                C1397760mTe c1397760mTe = new C1397760mTe();
                c1397760mTe.LIZIZ = EnumC1397840mTm.BUTTON;
                c1397760mTe.LIZJ = null;
                C20094813ju.LIZ(view5, c1397760mTe.LIZ());
                LLLLLZ(view);
                C0ZI0 c0zi0 = this.LLJJLIIIJLLLLLLLZ;
                if (c0zi0 == null) {
                    c0zi0 = null;
                }
                c0zi0.requestFocus();
                if (Build.VERSION.SDK_INT >= 28) {
                    C0ZI0 c0zi02 = this.LLJJLIIIJLLLLLLLZ;
                    if (c0zi02 == null) {
                        c0zi02 = null;
                    }
                    c0zi02.setFallbackLineSpacing(false);
                }
                C857480XkQ c857480XkQLIZ = new C856430Xij(new AwS558S0100000_14(this, 1553), new C858450Xlz(new C857960XlC(true, C855550XhJ.LIZ()))).LIZ();
                if (this.LLLII) {
                    c855530XhH = new C855520XhG(this.LLLI);
                } else {
                    c855530XhH = new C855530XhH();
                }
                C19EG c19eg = (C19EG) requireActivity();
                VideoPublishEditModel videoPublishEditModel4 = this.LLJLLL;
                if (videoPublishEditModel4 != null) {
                    C214848196g c214848196g4 = this.LLLILZ;
                    if (c214848196g4 == null) {
                        c214848196g4 = null;
                    }
                    this.LLJILJILJ = new C857730Xkp(c19eg, videoPublishEditModel4, c855530XhH, c857480XkQLIZ, c214848196g4);
                    C0ZI0 c0zi03 = this.LLJJLIIIJLLLLLLLZ;
                    if (c0zi03 == null) {
                        c0zi03 = null;
                    }
                    c0zi03.setHint(LLLIZZ());
                    Activity activity4 = this.mActivity;
                    if (activity4 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1p, activity4)) != null) {
                        int iIntValue = numLIZJ.intValue();
                        C0ZI0 c0zi04 = this.LLJJLIIIJLLLLLLLZ;
                        if (c0zi04 == null) {
                            c0zi04 = null;
                        }
                        c0zi04.setHintTextColor(iIntValue);
                    }
                    if (this.LLLII) {
                        LinearLayout linearLayout = this.LLJJI;
                        if (linearLayout == null) {
                            linearLayout = null;
                        }
                        C426750GoL.LJIIL(linearLayout, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), null, null, 29);
                        RelativeLayout relativeLayout = this.LLJJIII;
                        if (relativeLayout == null) {
                            relativeLayout = null;
                        }
                        C426750GoL.LJIIL(relativeLayout, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), null, null, 29);
                    }
                    C0ZI0 c0zi05 = this.LLJJLIIIJLLLLLLLZ;
                    if (c0zi05 == null) {
                        c0zi05 = null;
                    }
                    TuxTextView tuxTextView = this.LLJL;
                    if (tuxTextView == null) {
                        tuxTextView = null;
                    }
                    TuxTextView tuxTextView2 = this.LLJLIL;
                    if (tuxTextView2 == null) {
                        tuxTextView2 = null;
                    }
                    TuxTextView tuxTextView3 = this.LLJJL;
                    if (tuxTextView3 == null) {
                        tuxTextView3 = null;
                    }
                    C856850XjP c856850XjP2 = new C856850XjP(this, c0zi05, tuxTextView, tuxTextView2, tuxTextView3, 1, this.LLJLLL, this);
                    this.LLJILJIL = c856850XjP2;
                    C214848196g c214848196g5 = this.LLLILZ;
                    if (c214848196g5 == null) {
                        c214848196g = null;
                    } else {
                        c214848196g = c214848196g5;
                    }
                    c856850XjP2.LJJ = c214848196g;
                    if (c214848196g5 == null) {
                        c214848196g2 = null;
                    } else {
                        c214848196g2 = c214848196g5;
                    }
                    c856850XjP2.LJJI = c214848196g2;
                    if (c214848196g5 == null) {
                        c214848196g5 = null;
                    }
                    c214848196g5.LJJJJL = new AwS593S0100000_14(this, 310);
                    RelativeLayout relativeLayout2 = this.LLJJIII;
                    if (relativeLayout2 == null) {
                        relativeLayout2 = null;
                    }
                    C786410Ut5.x3(relativeLayout2.getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC913970ZtL(this, 3));
                    if (this.LLLII) {
                        this.LLLJL = new C1430970nLD(this.LLJLLL);
                        LLLLJ();
                    } else {
                        LLLLJI();
                    }
                    this.LLLIIIIL = TopicCommonService.LIZJ().LIZIZ();
                    KeyBoardMonitor keyBoardMonitor = new KeyBoardMonitor(this);
                    C0ZI0 c0zi06 = this.LLJJLIIIJLLLLLLLZ;
                    if (c0zi06 == null) {
                        c0zi06 = null;
                    }
                    keyBoardMonitor.LIZ(c0zi06, new InterfaceC459810I1j() { // from class: X.0Xjq
                        @Override // X.InterfaceC459810I1j
                        public final void V3() {
                        }

                        @Override // X.InterfaceC459810I1j
                        public final void ub() {
                            View viewFindViewById2;
                            View viewFindViewById3;
                            HashMap<Integer, Boolean> map;
                            View viewFindViewById4 = view.findViewById(R.id.hif);
                            if (viewFindViewById4 == null || (viewFindViewById2 = viewFindViewById4.findViewById(R.id.rvl)) == null || (viewFindViewById3 = viewFindViewById2.findViewById(R.id.k1_)) == null) {
                                return;
                            }
                            C0ZI0 c0zi07 = this.LLJJLIIIJLLLLLLLZ;
                            if (c0zi07 == null) {
                                c0zi07 = null;
                            }
                            if (C2204961BRm.p(c0zi07, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhmcbMnZwSGu628qylbxLrjLD8GB77mX1dla2pGRg=", null)) == null || (map = this.LLLIIIIL) == null || !(!map.isEmpty())) {
                                return;
                            }
                            ITopicCommonService iTopicCommonServiceLIZJ = TopicCommonService.LIZJ();
                            C0ZI0 c0zi08 = this.LLJJLIIIJLLLLLLLZ;
                            if (c0zi08 == null) {
                                c0zi08 = null;
                            }
                            String strValueOf = String.valueOf(C2204961BRm.p(c0zi08, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhmcbMnZwSGu628qylbxLrjLD8GB77mX1dla2pGRg=", null)));
                            HashMap<Integer, Boolean> map2 = this.LLLIIIIL;
                            if (map2 != null) {
                                iTopicCommonServiceLIZJ.LIZ(viewFindViewById3, strValueOf, map2);
                            } else {
                                "Required value was null.".toString();
                                throw new IllegalArgumentException("Required value was null.");
                            }
                        }
                    });
                    VideoPublishEditModel videoPublishEditModel5 = this.LLJLLL;
                    if (videoPublishEditModel5 != null) {
                        String creationId = videoPublishEditModel5.getCreationId();
                        C856850XjP c856850XjP3 = this.LLJILJIL;
                        if (c856850XjP3 == null) {
                            c856850XjP3 = null;
                        }
                        C117U c117u = new C117U(creationId, c856850XjP3, view, this, this.LLJLLL);
                        this.LLJJIJIIJIL = c117u;
                        c117u.LLJZIJLIL = LLLLLLLZIL();
                        PublishBottomPanelViewModel publishBottomPanelViewModel = this.LLLIIL;
                        if (publishBottomPanelViewModel != null && (mutableLiveData = publishBottomPanelViewModel.LL) != null) {
                            mutableLiveData.observe(this, new AObserverS218S0100000_14(this, 36));
                        }
                        SceneWrapperFragment sceneWrapperFragment2 = this.LLLIZZ;
                        if (sceneWrapperFragment2 != null) {
                            C856850XjP c856850XjP4 = this.LLJILJIL;
                            if (c856850XjP4 == null) {
                                c856850XjP4 = null;
                            }
                            C11VI c11vi = new C11VI(sceneWrapperFragment2, c856850XjP4, view, this);
                            c11vi.LIZ();
                            this.LLLIIII = c11vi;
                            C856850XjP c856850XjP5 = this.LLJILJIL;
                            if (c856850XjP5 == null) {
                                c856850XjP5 = null;
                            }
                            VideoPublishEditModel videoPublishEditModel6 = this.LLJLLL;
                            if (videoPublishEditModel6 != null) {
                                c856850XjP5.LJIILIIL(C1428470nHB.LJJZZI(videoPublishEditModel6));
                                C1322110kVd c1322110kVd = this.LLJJIJIL;
                                if (c1322110kVd == null) {
                                    c1322110kVd = null;
                                }
                                c1322110kVd.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                C1447470nlp.LIZIZ(c1322110kVd, C12ES.LIZJ(10, c1322110kVd.getContext()));
                                C1322110kVd c1322110kVd2 = this.LLJJIJIL;
                                if (c1322110kVd2 == null) {
                                    c1322110kVd2 = null;
                                }
                                VideoPublishEditModel videoPublishEditModel7 = this.LLJLLL;
                                if (videoPublishEditModel7 != null && (creativeModel13 = videoPublishEditModel7.creativeModel) != null && (editPostModel9 = creativeModel13.editPostModel) != null) {
                                    videoCoverAddr = editPostModel9.getVideoCoverAddr();
                                } else {
                                    videoCoverAddr = null;
                                }
                                LLLIIIIL(c1322110kVd2, videoCoverAddr);
                                C1322110kVd c1322110kVd3 = this.LLJJIJIL;
                                if (c1322110kVd3 == null) {
                                    c1322110kVd3 = null;
                                }
                                C786410Ut5.q9(c1322110kVd3, new C1466570oGd(this, 32));
                                LLLLIILL(view);
                                LLLLILI(view);
                                LLLILZ().observerNetworkChange(new C0CSC() { // from class: X.0niY
                                    @Override // X.C0CSC
                                    public final void LIZ(EnumC325100Com enumC325100Com) {
                                        CreativeModel creativeModel15;
                                        EditPostModel editPostModel11;
                                        int i2 = C325180Cou.LIZ[enumC325100Com.ordinal()];
                                        if (i2 != 1 && i2 != 2) {
                                            return;
                                        }
                                        C1445410niV c1445410niV = this.LIZ;
                                        if (c1445410niV.LLLFZ || c1445410niV.LLJZIJLIL) {
                                            return;
                                        }
                                        C1322110kVd c1322110kVd4 = c1445410niV.LLJJIJIL;
                                        UrlModel videoCoverAddr2 = null;
                                        if (c1322110kVd4 == null) {
                                            c1322110kVd4 = null;
                                        }
                                        VideoPublishEditModel videoPublishEditModel8 = c1445410niV.LLJLLL;
                                        if (videoPublishEditModel8 != null && (creativeModel15 = videoPublishEditModel8.creativeModel) != null && (editPostModel11 = creativeModel15.editPostModel) != null) {
                                            videoCoverAddr2 = editPostModel11.getVideoCoverAddr();
                                        }
                                        c1445410niV.LLLIIIIL(c1322110kVd4, videoCoverAddr2);
                                    }
                                });
                                VideoPublishEditModel videoPublishEditModel8 = this.LLJLLL;
                                if (videoPublishEditModel8 != null) {
                                    TextStickerChallenges textStickerChallenges = videoPublishEditModel8.getTextStickerChallenges();
                                    if (textStickerChallenges == null || (readTextChallenges = textStickerChallenges.getReadTextChallenges()) == null) {
                                        readTextChallenges = C13BV.INSTANCE;
                                    }
                                    C857730Xkp c857730Xkp = this.LLJILJILJ;
                                    if (c857730Xkp == null) {
                                        c857730Xkp = null;
                                    }
                                    c857730Xkp.LJIIIIZZ("edit_post");
                                    C856850XjP c856850XjP6 = this.LLJILJIL;
                                    if (c856850XjP6 == null) {
                                        c856850XjP6 = null;
                                    }
                                    VideoPublishEditModel videoPublishEditModel9 = this.LLJLLL;
                                    if (videoPublishEditModel9 != null) {
                                        c856850XjP6.LJIIIZ(videoPublishEditModel9);
                                        C856850XjP c856850XjP7 = this.LLJILJIL;
                                        if (c856850XjP7 == null) {
                                            c856850XjP7 = null;
                                        }
                                        if (!c856850XjP7.LJIL.LIZ()) {
                                            C856850XjP c856850XjP8 = this.LLJILJIL;
                                            if (c856850XjP8 == null) {
                                                c856850XjP8 = null;
                                            }
                                            c856850XjP8.LJIJ();
                                        }
                                        C214848196g c214848196g6 = this.LLLILZ;
                                        if (c214848196g6 == null) {
                                            c214848196g6 = null;
                                        }
                                        C856850XjP c856850XjP9 = this.LLJILJIL;
                                        if (c856850XjP9 == null) {
                                            c856850XjP9 = null;
                                        }
                                        int iLJFF = c856850XjP9.LJFF();
                                        C857730Xkp c857730Xkp2 = this.LLJILJILJ;
                                        if (c857730Xkp2 == null) {
                                            c857730Xkp2 = null;
                                        }
                                        c214848196g6.LJIILL(iLJFF, c857730Xkp2.LIZJ.LIZIZ() + C855380Xh2.LIZ);
                                        ArrayList arrayList = new ArrayList();
                                        VideoPublishEditModel videoPublishEditModel10 = this.LLJLLL;
                                        if (videoPublishEditModel10 != null) {
                                            List<AVChallenge> list2 = videoPublishEditModel10.challenges;
                                            if (list2 != null) {
                                                arrayList.addAll(list2);
                                            }
                                            arrayList.addAll(readTextChallenges);
                                            C856850XjP c856850XjP10 = this.LLJILJIL;
                                            if (c856850XjP10 == null) {
                                                c856850XjP10 = null;
                                            }
                                            ((HashSet) c856850XjP10.LIZIZ.LLJLILLLLZIIL).clear();
                                            C856850XjP c856850XjP11 = this.LLJILJIL;
                                            if (c856850XjP11 == null) {
                                                c856850XjP11 = null;
                                            }
                                            c856850XjP11.LIZ(arrayList);
                                            VideoPublishEditModel videoPublishEditModel11 = this.LLJLLL;
                                            if (videoPublishEditModel11 != null && (creativeModel11 = videoPublishEditModel11.creativeModel) != null && creativeModel11.editPostModel != null) {
                                                if (videoPublishEditModel11 != null && (creativeModel12 = videoPublishEditModel11.creativeModel) != null && (editPostModel8 = creativeModel12.editPostModel) != null) {
                                                    C857730Xkp c857730Xkp3 = this.LLJILJILJ;
                                                    if (c857730Xkp3 == null) {
                                                        c857730Xkp3 = null;
                                                    }
                                                    editPostModel8.setBackupMarkUpText(c857730Xkp3.LJFF());
                                                    C857730Xkp c857730Xkp4 = this.LLJILJILJ;
                                                    if (c857730Xkp4 == null) {
                                                        c857730Xkp4 = null;
                                                    }
                                                    editPostModel8.setAvTextExtraForBackUp(C1443230nez.LIZLLL(c857730Xkp4.LIZLLL.LIZ(false).LIZ()));
                                                } else {
                                                    "Required value was null.".toString();
                                                    throw new IllegalArgumentException("Required value was null.");
                                                }
                                            }
                                            VideoPublishEditModel videoPublishEditModel12 = this.LLJLLL;
                                            if (videoPublishEditModel12 != null) {
                                                if (videoPublishEditModel12.getStickerChallenge() != null) {
                                                    VideoPublishEditModel videoPublishEditModel13 = this.LLJLLL;
                                                    if (videoPublishEditModel13 != null) {
                                                        StickerChallenge stickerChallenge = videoPublishEditModel13.getStickerChallenge();
                                                        if (stickerChallenge != null && (collectionInfoStickerChallenges = stickerChallenge.infoStickerChallenges()) != null && !collectionInfoStickerChallenges.isEmpty()) {
                                                            VideoPublishEditModel videoPublishEditModel14 = this.LLJLLL;
                                                            if (videoPublishEditModel14 != null) {
                                                                StickerChallenge stickerChallenge2 = videoPublishEditModel14.getStickerChallenge();
                                                                if (stickerChallenge2 == null || (collectionInfoStickerChallenges2 = stickerChallenge2.infoStickerChallenges()) == null) {
                                                                    collectionInfoStickerChallenges2 = C13BV.INSTANCE;
                                                                }
                                                                ArrayList arrayList2 = new ArrayList();
                                                                VideoPublishEditModel videoPublishEditModel15 = this.LLJLLL;
                                                                if (videoPublishEditModel15 != null) {
                                                                    List<AVChallenge> list3 = videoPublishEditModel15.challenges;
                                                                    if (list3 != null && !list3.isEmpty()) {
                                                                        ArrayList arrayList3 = new ArrayList();
                                                                        for (Object obj : collectionInfoStickerChallenges2) {
                                                                            if (this.LLJLLL != null) {
                                                                                if (!r4.challenges.contains(obj)) {
                                                                                    arrayList3.add(obj);
                                                                                }
                                                                            } else {
                                                                                "Required value was null.".toString();
                                                                                throw new IllegalArgumentException("Required value was null.");
                                                                            }
                                                                        }
                                                                        arrayList2.addAll(arrayList3);
                                                                    } else {
                                                                        arrayList2.addAll(collectionInfoStickerChallenges2);
                                                                    }
                                                                    C856850XjP c856850XjP12 = this.LLJILJIL;
                                                                    if (c856850XjP12 == null) {
                                                                        c856850XjP12 = null;
                                                                    }
                                                                    c856850XjP12.LIZ(arrayList2);
                                                                } else {
                                                                    "Required value was null.".toString();
                                                                    throw new IllegalArgumentException("Required value was null.");
                                                                }
                                                            } else {
                                                                "Required value was null.".toString();
                                                                throw new IllegalArgumentException("Required value was null.");
                                                            }
                                                        }
                                                    } else {
                                                        "Required value was null.".toString();
                                                        throw new IllegalArgumentException("Required value was null.");
                                                    }
                                                }
                                                C856850XjP c856850XjP13 = this.LLJILJIL;
                                                if (c856850XjP13 == null) {
                                                    c856850XjP13 = null;
                                                }
                                                c856850XjP13.LIZIZ.LJJJI(true);
                                                C856850XjP c856850XjP14 = this.LLJILJIL;
                                                if (c856850XjP14 == null) {
                                                    c856850XjP = null;
                                                } else {
                                                    c856850XjP = c856850XjP14;
                                                }
                                                c856850XjP.LJIIZILJ = true;
                                                if (c856850XjP14 == null) {
                                                    c856850XjP14 = null;
                                                }
                                                c856850XjP14.getClass();
                                                if (C856850XjP.LJIIJ() && (videoPublishEditModel = this.LLJLLL) != null && (creativeModel9 = videoPublishEditModel.creativeModel) != null && (postPageModel = creativeModel9.postPageModel) != null && !postPageModel.isHashtagLimitToastShown) {
                                                    C856850XjP c856850XjP15 = this.LLJILJIL;
                                                    if (c856850XjP15 == null) {
                                                        c856850XjP15 = null;
                                                    }
                                                    c856850XjP15.getClass();
                                                    int iLJI = C856850XjP.LJI();
                                                    C856850XjP c856850XjP16 = this.LLJILJIL;
                                                    if (c856850XjP16 == null) {
                                                        c856850XjP16 = null;
                                                    }
                                                    if (c856850XjP16.LJIIIIZZ() > iLJI) {
                                                        C856850XjP c856850XjP17 = this.LLJILJIL;
                                                        if (c856850XjP17 == null) {
                                                            c856850XjP17 = null;
                                                        }
                                                        c856850XjP17.LJIILL();
                                                        VideoPublishEditModel videoPublishEditModel16 = this.LLJLLL;
                                                        if (videoPublishEditModel16 != null && (creativeModel10 = videoPublishEditModel16.creativeModel) != null && (postPageModel2 = creativeModel10.postPageModel) != null) {
                                                            postPageModel2.isHashtagLimitToastShown = true;
                                                        }
                                                    }
                                                }
                                                VideoPublishEditModel videoPublishEditModel17 = this.LLJLLL;
                                                if (videoPublishEditModel17 == null) {
                                                    return;
                                                }
                                                Pair<Integer, Integer> pairLJIIJJI = C580270MpN.LJIIJJI(videoPublishEditModel17);
                                                pairLJIIJJI.getFirst().intValue();
                                                pairLJIIJJI.getSecond().intValue();
                                                List<C0WIY<Class<?>, IAVPublishExtension<?>>> list4 = this.LLLIILIL;
                                                if (list4 != null) {
                                                    for (C0WIY c0wiy : (ArrayList) list4) {
                                                        IAVPublishExtension iAVPublishExtension = (IAVPublishExtension) c0wiy.LIZIZ;
                                                        if (iAVPublishExtension != null) {
                                                            SceneWrapperFragment sceneWrapperFragment3 = this.LLLIZZ;
                                                            if (sceneWrapperFragment3 != null) {
                                                                AVPublishContentType aVPublishContentType = AVPublishContentType.Video;
                                                                VideoPublishEditModel videoPublishEditModel18 = this.LLJLLL;
                                                                if (videoPublishEditModel18 != null) {
                                                                    PublishOutput publishOutputLJJLIIIJL = C1416310mxZ.LJJLIIIJL(videoPublishEditModel18);
                                                                    VideoPublishEditModel videoPublishEditModel19 = this.LLJLLL;
                                                                    if (videoPublishEditModel19 != null) {
                                                                        microAppModel = videoPublishEditModel19.getMicroAppModel();
                                                                    } else {
                                                                        microAppModel = null;
                                                                    }
                                                                    VideoPublishEditModel videoPublishEditModel20 = this.LLJLLL;
                                                                    if (videoPublishEditModel20 != null) {
                                                                        if (!this.LLJI) {
                                                                            str3 = "edit_post";
                                                                        } else {
                                                                            str3 = "inbox";
                                                                        }
                                                                        mobParam = C1428470nHB.LJII(videoPublishEditModel20, "edit_post_page", str3, String.valueOf(LLLILZLLLI()));
                                                                    } else {
                                                                        mobParam = new MobParam(null, null, null, "", "", false, "", "", null, null, null, null, null, null, null, null);
                                                                    }
                                                                    boolean z = this.LLLII;
                                                                    VideoPublishEditModel videoPublishEditModel21 = this.LLJLLL;
                                                                    if (videoPublishEditModel21 != null && (creativeModel8 = videoPublishEditModel21.creativeModel) != null) {
                                                                        musicBuzModel = creativeModel8.musicBuzModel;
                                                                    } else {
                                                                        musicBuzModel = null;
                                                                    }
                                                                    AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(musicBuzModel);
                                                                    VideoPublishEditModel videoPublishEditModel22 = this.LLJLLL;
                                                                    if (videoPublishEditModel22 != null && (creativeModel7 = videoPublishEditModel22.creativeModel) != null && (editPostModel7 = creativeModel7.editPostModel) != null) {
                                                                        originPoiData = editPostModel7.getOriginPoiData();
                                                                    } else {
                                                                        originPoiData = null;
                                                                    }
                                                                    VideoPublishEditModel videoPublishEditModel23 = this.LLJLLL;
                                                                    if (videoPublishEditModel23 != null && (creativeModel6 = videoPublishEditModel23.creativeModel) != null && (editPostModel6 = creativeModel6.editPostModel) != null) {
                                                                        editPostPermission3 = editPostModel6.getEditPostPermission();
                                                                    } else {
                                                                        editPostPermission3 = null;
                                                                    }
                                                                    VideoPublishEditModel videoPublishEditModel24 = this.LLJLLL;
                                                                    if (videoPublishEditModel24 != null && (creativeModel5 = videoPublishEditModel24.creativeModel) != null && (editPostModel5 = creativeModel5.editPostModel) != null) {
                                                                        awemeType = editPostModel5.getAwemeType();
                                                                    } else {
                                                                        awemeType = null;
                                                                    }
                                                                    VideoPublishEditModel videoPublishEditModel25 = this.LLJLLL;
                                                                    if (videoPublishEditModel25 != null && (creativeModel4 = videoPublishEditModel25.creativeModel) != null && (editPostModel4 = creativeModel4.editPostModel) != null) {
                                                                        awemeId = editPostModel4.getAwemeId();
                                                                    } else {
                                                                        awemeId = null;
                                                                    }
                                                                    C1440930nbH c1440930nbH = C857150Xjt.LIZIZ;
                                                                    if (c1440930nbH != null) {
                                                                        str = c1440930nbH.LIZIZ;
                                                                    } else {
                                                                        str = null;
                                                                    }
                                                                    String str4 = "";
                                                                    if (str == null) {
                                                                        str = "";
                                                                    }
                                                                    if (c1440930nbH != null && (str2 = c1440930nbH.LIZ) != null) {
                                                                        str4 = str2;
                                                                    }
                                                                    EditPostMobParam editPostMobParam = new EditPostMobParam(awemeType, awemeId, str, str4, String.valueOf(LLLILZLLLI()));
                                                                    Context sceneContext = getSceneContext();
                                                                    VideoPublishEditModel videoPublishEditModel26 = this.LLJLLL;
                                                                    if (videoPublishEditModel26 != null && (creativeModel3 = videoPublishEditModel26.creativeModel) != null && (editPostModel3 = creativeModel3.editPostModel) != null) {
                                                                        poiReTagInfo = editPostModel3.getPoiReTagInfo();
                                                                    } else {
                                                                        poiReTagInfo = null;
                                                                    }
                                                                    VideoPublishEditModel videoPublishEditModel27 = this.LLJLLL;
                                                                    if (videoPublishEditModel27 != null && (creativeModel2 = videoPublishEditModel27.creativeModel) != null && (editPostModel2 = creativeModel2.editPostModel) != null) {
                                                                        poiPublishInfoModel = editPostModel2.getPoiPublishInfoModel();
                                                                    } else {
                                                                        poiPublishInfoModel = null;
                                                                    }
                                                                    iAVPublishExtension.onCreate(sceneWrapperFragment3, view, this, bundle, aVPublishContentType, publishOutputLJJLIIIJL, new ExtensionMisc(null, null, microAppModel, null, extensionDataRepo, mobParam, false, z, aVMusicExtractAVMusic, false, originPoiData, editPostPermission3, editPostMobParam, sceneContext, poiReTagInfo, poiPublishInfoModel, null), new IAVPublishExtension.Callback() { // from class: X.0YyF
                                                                        @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension.Callback
                                                                        public final void onECUpdateBC(boolean z2, boolean z3, int i2) {
                                                                        }

                                                                        @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension.Callback
                                                                        public final void onECUpdateBO(boolean z2, boolean z3) {
                                                                        }

                                                                        @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension.Callback
                                                                        public final void onGameBCToggleStateUpdate(String str5) {
                                                                        }

                                                                        @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension.Callback
                                                                        public final List<String> getValidHashTagList() {
                                                                            List<String> listLJIJI;
                                                                            C1445410niV c1445410niV = this.LIZ;
                                                                            VideoPublishEditModel videoPublishEditModel28 = c1445410niV.LLJLLL;
                                                                            if (videoPublishEditModel28 == null) {
                                                                                return C13BV.INSTANCE;
                                                                            }
                                                                            C856850XjP c856850XjP18 = c1445410niV.LLJILJIL;
                                                                            if (c856850XjP18 != null && c856850XjP18.LIZIZ != null) {
                                                                                return C1428470nHB.LJIJI(C857770Xkt.LIZ(c856850XjP18.LJII(false), C13BV.INSTANCE));
                                                                            }
                                                                            List<AVTextExtraStruct> structList = videoPublishEditModel28.getStructList();
                                                                            return (structList == null || (listLJIJI = C1428470nHB.LJIJI(structList)) == null) ? C13BV.INSTANCE : listLJIJI;
                                                                        }

                                                                        @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension.Callback
                                                                        public final void onReplaceSoundClickFromAnchorPanel() {
                                                                            IAVPublishExtension.Callback.DefaultImpls.onReplaceSoundClickFromAnchorPanel(this);
                                                                        }
                                                                    }, null);
                                                                    IAVPublishExtension iAVPublishExtension2 = (IAVPublishExtension) c0wiy.LIZIZ;
                                                                    Context contextRequireSceneContext = requireSceneContext();
                                                                    LinearLayout linearLayout2 = this.LLJILLL;
                                                                    if (linearLayout2 == null) {
                                                                        linearLayout2 = null;
                                                                    }
                                                                    View viewOnCreateOptionView = iAVPublishExtension2.onCreateOptionView(contextRequireSceneContext, linearLayout2, null);
                                                                    LinearLayout linearLayout3 = this.LLJILLL;
                                                                    if (linearLayout3 == null) {
                                                                        linearLayout3 = null;
                                                                    }
                                                                    linearLayout3.addView(viewOnCreateOptionView);
                                                                    IAVPublishExtension iAVPublishExtension3 = (IAVPublishExtension) c0wiy.LIZIZ;
                                                                    SceneWrapperFragment sceneWrapperFragment4 = this.LLLIZZ;
                                                                    if (sceneWrapperFragment4 != null) {
                                                                        iAVPublishExtension3.onBindOptionView(sceneWrapperFragment4, viewOnCreateOptionView);
                                                                    } else {
                                                                        "Required value was null.".toString();
                                                                        throw new IllegalArgumentException("Required value was null.");
                                                                    }
                                                                } else {
                                                                    "Required value was null.".toString();
                                                                    throw new IllegalArgumentException("Required value was null.");
                                                                }
                                                            } else {
                                                                "Required value was null.".toString();
                                                                throw new IllegalArgumentException("Required value was null.");
                                                            }
                                                        }
                                                    }
                                                }
                                                VideoPublishEditModel videoPublishEditModel28 = this.LLJLLL;
                                                if (videoPublishEditModel28 != null && (creativeModel = videoPublishEditModel28.creativeModel) != null && (editPostModel = creativeModel.editPostModel) != null && (editPostPermission2 = editPostModel.getEditPostPermission()) != null && (list = editPostPermission2.bizPermission) != null) {
                                                    Iterator<EditPostBizPermissionStruct> it2 = list.iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            next = it2.next();
                                                            if (next.bizType == EnumC1379590m0L.ALT_TEXT.getValue()) {
                                                                break;
                                                            }
                                                        } else {
                                                            next = null;
                                                            break;
                                                        }
                                                    }
                                                    editPostBizPermissionStruct = next;
                                                } else {
                                                    editPostBizPermissionStruct = null;
                                                }
                                                VideoPublishEditModel videoPublishEditModel29 = this.LLJLLL;
                                                if (videoPublishEditModel29 != null && C1428470nHB.LJJZZI(videoPublishEditModel29) && editPostBizPermissionStruct != null && editPostBizPermissionStruct.bizStatus == C0JMD.SHOW.getValue()) {
                                                    C127K c127k = this.LLJJ;
                                                    if (c127k != null) {
                                                        C786410Ut5.LLZLL(c127k, 0);
                                                        c127k.setTitle(getString(2131826465));
                                                        c127k.setSubtitle(getString(2131826464));
                                                        C11G4 c11g4 = new C11G4(c127k.getContext(), null);
                                                        c11g4.LJIILL(new ACListenerS156S0100000_22(this, 49));
                                                        c127k.setAccessory(c11g4);
                                                        C419910GdJ c419910GdJ = new C419910GdJ();
                                                        c419910GdJ.LIZ = R.raw.icon_alt_text;
                                                        c127k.setIcon(c419910GdJ);
                                                    }
                                                } else {
                                                    C127K c127k2 = this.LLJJ;
                                                    if (c127k2 != null) {
                                                        C786410Ut5.LLZLL(c127k2, 8);
                                                    }
                                                }
                                                IAVPublishPageUIRefactorService iAVPublishPageUIRefactorService = (IAVPublishPageUIRefactorService) PluggableExtentionKt.pluggableSpi$default(IAVPublishPageUIRefactorService.class, false, false, false, 14, null);
                                                if (iAVPublishPageUIRefactorService != null && iAVPublishPageUIRefactorService.enableLargePostBtn() && (c197039127h2 = this.LLJJJJLIIL) != null) {
                                                    c197039127h2.setBackgroundResource(R.drawable.bnl);
                                                }
                                                IAVPublishPageUIRefactorService iAVPublishPageUIRefactorService2 = (IAVPublishPageUIRefactorService) PluggableExtentionKt.pluggableSpi$default(IAVPublishPageUIRefactorService.class, false, false, false, 14, null);
                                                if (iAVPublishPageUIRefactorService2 != null && iAVPublishPageUIRefactorService2.enableRefactorPublishIcon() && this.mActivity != null && (c197039127h = this.LLJJJJLIIL) != null) {
                                                    c197039127h.setButtonStartIcon(Integer.valueOf(R.raw.icon_arrow_up_circle_fill));
                                                }
                                                if (C568750MSj.LIZIZ(this.LLJLLL)) {
                                                    LLLLL(view);
                                                    return;
                                                }
                                                return;
                                            }
                                            "Required value was null.".toString();
                                            throw new IllegalArgumentException("Required value was null.");
                                        }
                                        "Required value was null.".toString();
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                    "Required value was null.".toString();
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                                "Required value was null.".toString();
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void LLLLLJIL(CaptionStruct captionStruct, String str) {
        List<Utterance> list;
        if (str == null || str.length() == 0 || !C2286708xd.LIZJ(str)) {
            C0CNO.LIZLLL(0L, new AwS558S0100000_14(this, 1552));
            return;
        }
        try {
            CaptionStruct captionStruct2 = (CaptionStruct) new Gson().LJFF(new C0VSF(str), CaptionStruct.class);
            if (captionStruct2 != null) {
                list = captionStruct2.utterances;
            } else {
                list = null;
            }
            captionStruct.setUtterances(list);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C0CNO.LIZLLL(0L, new AwS558S0100000_14(this, 1552));
        }
    }

    public final String LLLLLL(Activity activity, EditPostPermission editPostPermission) {
        int i;
        Integer numValueOf = null;
        if (editPostPermission == null) {
            return null;
        }
        if (LLLLLILLIL(editPostPermission, C1697810uHb.LJIILJJIL(EnumC1379590m0L.TEXT, EnumC1379590m0L.COVER))) {
            if (C568750MSj.LIZIZ(this.LLJLLL)) {
                i = 2131821436;
            } else {
                i = 2131833455;
            }
            Resources resources = activity.getResources();
            Object[] objArr = new Object[1];
            for (BizExpiration bizExpiration : (BizExpiration[]) C303700BvM.LIZIZ.getValue()) {
                if (bizExpiration.bizType == EnumC1379590m0L.TEXT.getValue() || bizExpiration.bizType == EnumC1379590m0L.COVER.getValue()) {
                    numValueOf = Integer.valueOf(bizExpiration.expirationDay);
                    break;
                }
            }
            objArr[0] = numValueOf;
            return resources.getString(i, objArr);
        }
        if (!LLLLLILLIL(editPostPermission, C1697810uHb.LJIILJJIL(EnumC1379590m0L.POI))) {
            return null;
        }
        Resources resources2 = activity.getResources();
        Object[] objArr2 = new Object[1];
        BizExpiration[] bizExpirationArr = (BizExpiration[]) C303700BvM.LIZIZ.getValue();
        int length = bizExpirationArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            BizExpiration bizExpiration2 = bizExpirationArr[i2];
            if (bizExpiration2.bizType == EnumC1379590m0L.POI.getValue()) {
                numValueOf = Integer.valueOf(bizExpiration2.expirationDay);
                break;
            }
            i2++;
        }
        objArr2[0] = numValueOf;
        return resources2.getString(2131844840, objArr2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [X.12Bh, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r17v1, types: [com.ss.android.ugc.aweme.base.model.UrlModel] */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    public final void LLLLLLIL(int i, View view) throws Throwable {
        String strLJJIJL;
        String creationId;
        String storyShootEntrance;
        String strLJIILIIL;
        int i2;
        String str;
        Bitmap bitmapCopy;
        EditPostedVideoPublishActivity editPostedVideoPublishActivity;
        String anchorText;
        CreativeModel creativeModel;
        EditPostModel editPostModel;
        CreativeModel creativeModel2;
        EditPostModel editPostModel2;
        CreativeModel creativeModel3;
        EditPostModel editPostModel3;
        String anchorText2;
        UrlModel anchorUrlModel;
        CreativeModel creativeModel4;
        EditPostModel editPostModel4;
        CreativeModel creativeModel5;
        EditPostModel editPostModel5;
        EditPostModel editPostModel6;
        String anchorText3;
        UrlModel anchorUrlModel2;
        CreativeModel creativeModel6;
        EditPostModel editPostModel7;
        CreativeModel creativeModel7;
        EditPostModel editPostModel8;
        EditPostModel editPostModel9;
        Bitmap bitmapLJ;
        C1447460nlo c1447460nlo;
        String strLJIILL;
        AVETParameter avetParameter;
        CreativeModel creativeModel8;
        PostPageModel postPageModel;
        CreativeModel creativeModel9;
        C854860XgC c854860XgC;
        VideoPublishEditModel videoPublishEditModel = this.LLJLLL;
        if (videoPublishEditModel != null && (creativeModel9 = videoPublishEditModel.creativeModel) != null && (c854860XgC = creativeModel9.transientPostPageModel) != null) {
            c854860XgC.LIZ = System.currentTimeMillis();
        }
        VideoPublishEditModel videoPublishEditModel2 = this.LLJLLL;
        if (videoPublishEditModel2 != null && (creativeModel8 = videoPublishEditModel2.creativeModel) != null && (postPageModel = creativeModel8.postPageModel) != null) {
            postPageModel.previewEnterFrom = "edit_post_page";
        }
        C857150Xjt c857150Xjt = C857150Xjt.LIZ;
        C0LAB c0lab = new C0LAB();
        VideoPublishEditModel videoPublishEditModel3 = this.LLJLLL;
        String str2 = "";
        if (videoPublishEditModel3 == null) {
            strLJJIJL = "";
        } else {
            strLJJIJL = C1428520nHG.LJJIJL(videoPublishEditModel3);
        }
        c0lab.LJ("original_resolution", strLJJIJL);
        VideoPublishEditModel videoPublishEditModel4 = this.LLJLLL;
        String str3 = "mModel is null";
        if (videoPublishEditModel4 == null) {
            creationId = "mModel is null";
        } else {
            creationId = videoPublishEditModel4.getCreationId();
        }
        c0lab.LJ("creation_id", creationId);
        c0lab.LJ("enter_from", "edit_post_page");
        VideoPublishEditModel videoPublishEditModel5 = this.LLJLLL;
        if (videoPublishEditModel5 != null) {
            str3 = videoPublishEditModel5.mShootWay;
        }
        c0lab.LJ("shoot_way", str3);
        VideoPublishEditModel videoPublishEditModel6 = this.LLJLLL;
        if (videoPublishEditModel6 == null || (avetParameter = videoPublishEditModel6.getAvetParameter()) == null || (storyShootEntrance = avetParameter.getStoryShootEntrance()) == null) {
            storyShootEntrance = "";
        }
        c0lab.LJ("shoot_entrance", storyShootEntrance);
        VideoPublishEditModel videoPublishEditModel7 = this.LLJLLL;
        if (videoPublishEditModel7 == null) {
            strLJIILIIL = "";
        } else {
            strLJIILIIL = C1428470nHB.LJIILIIL(videoPublishEditModel7);
        }
        c0lab.LJ("content_source", strLJIILIIL);
        VideoPublishEditModel videoPublishEditModel8 = this.LLJLLL;
        if (videoPublishEditModel8 != null && (strLJIILL = C1428470nHB.LJIILL(videoPublishEditModel8)) != null) {
            str2 = strLJIILL;
        }
        c0lab.LJ("content_type", str2);
        VideoPublishEditModel videoPublishEditModel9 = this.LLJLLL;
        int permission = 0;
        if (videoPublishEditModel9 != null && videoPublishEditModel9.creativeModel.draftInfoModel.isDraft) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        c0lab.LIZ(i2, "is_draft");
        c0lab.LJ("route", "1");
        c0lab.LJ("after_post", "1");
        VideoPublishEditModel videoPublishEditModel10 = this.LLJLLL;
        if (videoPublishEditModel10 != null && C1428470nHB.LJJZZI(videoPublishEditModel10)) {
            str = "preview_feed";
        } else {
            str = "preview_video";
        }
        c0lab.LJ("preview_tab_name", str);
        c857150Xjt.getClass();
        C857150Xjt.LIZ(c0lab);
        VideoPublishEditModel videoPublishEditModel11 = this.LLJLLL;
        if (videoPublishEditModel11 == null) {
            return;
        }
        C580270MpN.LIZIZ(videoPublishEditModel11, c0lab, true);
        c0lab.LJ("is_from_top_entrance", CardStruct.IStatusCode.DEFAULT);
        VideoPublishEditModel videoPublishEditModel12 = this.LLJLLL;
        if (videoPublishEditModel12 == null) {
            return;
        }
        C1445630nir.LIZ(videoPublishEditModel12, c0lab);
        C20684815ws.LJIILLIIL("click_preview_entrance", c0lab.LIZ);
        if (!this.LLLJ) {
            this.LLLF = EnumC1445450niZ.CLICK_PREVIEW;
            this.LLLFF = view;
            this.LLLFFI = i;
            LLLLZ();
            LLLLZIL();
            return;
        }
        float fFloatValue = 0.0f;
        Float fValueOf = Float.valueOf(0.0f);
        ?? anchorUrlModel3 = 0;
        anchorUrlModel3 = 0;
        anchorUrlModel3 = 0;
        if (view.getOutlineProvider() instanceof C1447460nlo) {
            ViewOutlineProvider outlineProvider = view.getOutlineProvider();
            if ((outlineProvider instanceof C1447460nlo) && (c1447460nlo = (C1447460nlo) outlineProvider) != null) {
                fValueOf = c1447460nlo.LIZ;
            } else {
                fValueOf = null;
            }
        }
        C1447470nlp.LIZIZ(view, 0.0f);
        view.buildDrawingCache(true);
        try {
            bitmapLJ = C842150X1x.LJ(view, true, CertProviderManagerKt.findCert("bpea-get_video_cover", 1476435971));
        } catch (C838130WuJ e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (bitmapLJ != null) {
            bitmapCopy = bitmapLJ.copy(Bitmap.Config.RGB_565, false);
        } else {
            bitmapCopy = null;
        }
        view.destroyDrawingCache();
        if (fValueOf != null) {
            fFloatValue = fValueOf.floatValue();
        }
        C1447470nlp.LIZIZ(view, fFloatValue);
        this.LLJZ = new VideoCoverBitmapHolder();
        Lifecycle lifecycle = getLifecycle();
        VideoCoverBitmapHolder videoCoverBitmapHolder = this.LLJZ;
        if (videoCoverBitmapHolder != null) {
            lifecycle.addObserver(videoCoverBitmapHolder);
            if (this.LLJZ != null) {
                VideoCoverBitmapHolder.LL = bitmapCopy;
            }
            C0ZI0 c0zi0 = this.LLJJLIIIJLLLLLLLZ;
            if (c0zi0 == null) {
                c0zi0 = null;
            }
            c0zi0.setShouldDisableTrim(true);
            LLLLLLZZ(true);
            Activity activity = this.mActivity;
            if ((activity instanceof EditPostedVideoPublishActivity) && (editPostedVideoPublishActivity = (EditPostedVideoPublishActivity) activity) != null) {
                if (this.LLLII) {
                    view.setTransitionName("transition_name_thumbnail");
                    C0SQV c0sqv = new C0SQV();
                    ArrayMap arrayMap = new ArrayMap();
                    arrayMap.put("transition_name_thumbnail", c0sqv);
                    AnonymousClass1915 anonymousClass1915 = new AnonymousClass1915(arrayMap);
                    if (C855120Xgc.LIZ()) {
                        VideoPublishEditModel videoPublishEditModel13 = this.LLJLLL;
                        if (videoPublishEditModel13 != null) {
                            CreativeModel creativeModel10 = videoPublishEditModel13.creativeModel;
                            if (creativeModel10 != null && (editPostModel9 = creativeModel10.editPostModel) != null) {
                                anchorText3 = editPostModel9.getAnchorText();
                            } else {
                                anchorText3 = null;
                            }
                            VideoPublishEditModel videoPublishEditModel14 = this.LLJLLL;
                            if (videoPublishEditModel14 != null && (creativeModel7 = videoPublishEditModel14.creativeModel) != null && (editPostModel8 = creativeModel7.editPostModel) != null) {
                                anchorUrlModel2 = editPostModel8.getAnchorUrlModel();
                            } else {
                                anchorUrlModel2 = null;
                            }
                            VideoPublishEditModel videoPublishEditModel15 = this.LLJLLL;
                            if (videoPublishEditModel15 != null && (creativeModel6 = videoPublishEditModel15.creativeModel) != null && (editPostModel7 = creativeModel6.editPostModel) != null) {
                                permission = editPostModel7.getPermission();
                            }
                            String str4 = C1443560nfW.LIZIZ;
                            AwS566S0100000_22 awS566S0100000_22 = new AwS566S0100000_22(this, 1040);
                            AwS566S0100000_22 awS566S0100000_222 = new AwS566S0100000_22(view, 1041);
                            C856850XjP c856850XjP = this.LLJILJIL;
                            if (c856850XjP == null) {
                                c856850XjP = null;
                            }
                            editPostedVideoPublishActivity.LLJIJIL = new ImagePublishPreviewViewPagerScene(videoPublishEditModel13, anchorText3, anchorUrlModel2, permission, str4, i, awS566S0100000_22, awS566S0100000_222, c856850XjP.LIZIZ.getPureHashtagLength());
                        } else {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    } else {
                        VideoPublishEditModel videoPublishEditModel16 = this.LLJLLL;
                        if (videoPublishEditModel16 != null) {
                            CreativeModel creativeModel11 = videoPublishEditModel16.creativeModel;
                            if (creativeModel11 != null && (editPostModel6 = creativeModel11.editPostModel) != null) {
                                anchorText2 = editPostModel6.getAnchorText();
                            } else {
                                anchorText2 = null;
                            }
                            VideoPublishEditModel videoPublishEditModel17 = this.LLJLLL;
                            if (videoPublishEditModel17 != null && (creativeModel5 = videoPublishEditModel17.creativeModel) != null && (editPostModel5 = creativeModel5.editPostModel) != null) {
                                anchorUrlModel = editPostModel5.getAnchorUrlModel();
                            } else {
                                anchorUrlModel = null;
                            }
                            VideoPublishEditModel videoPublishEditModel18 = this.LLJLLL;
                            if (videoPublishEditModel18 != null && (creativeModel4 = videoPublishEditModel18.creativeModel) != null && (editPostModel4 = creativeModel4.editPostModel) != null) {
                                permission = editPostModel4.getPermission();
                            }
                            String str5 = C1443560nfW.LIZIZ;
                            AwS566S0100000_22 awS566S0100000_223 = new AwS566S0100000_22(this, 1042);
                            AwS566S0100000_22 awS566S0100000_224 = new AwS566S0100000_22(view, 1043);
                            C856850XjP c856850XjP2 = this.LLJILJIL;
                            if (c856850XjP2 == null) {
                                c856850XjP2 = null;
                            }
                            editPostedVideoPublishActivity.LLJIJIL = new ImagePublishPreviewScene(videoPublishEditModel16, anchorText2, anchorUrlModel, permission, str5, i, awS566S0100000_223, awS566S0100000_224, false, c856850XjP2.LIZIZ.getPureHashtagLength(), anchorUrlModel3, anchorUrlModel3, anchorUrlModel3, true, 7168);
                        } else {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    }
                    C857730Xkp c857730Xkp = this.LLJILJILJ;
                    if (c857730Xkp == null) {
                        c857730Xkp = null;
                    }
                    VideoPublishEditModel videoPublishEditModel19 = this.LLJLLL;
                    if (videoPublishEditModel19 != null) {
                        c857730Xkp.LJIIL(videoPublishEditModel19);
                        PublishPreviewScene publishPreviewScene = editPostedVideoPublishActivity.LLJIJIL;
                        C569760MWg c569760MWg = new C569760MWg();
                        c569760MWg.LIZJ = anonymousClass1915;
                        editPostedVideoPublishActivity.LLLLZLL(publishPreviewScene, c569760MWg.LIZ());
                        return;
                    }
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
                view.setTransitionName("transition_name_thumbnail");
                TuxTextView tuxTextView = this.LLJJJ;
                if (tuxTextView == null) {
                    tuxTextView = null;
                }
                tuxTextView.setTransitionName("transition_name_choose_cover");
                C0SQV c0sqv2 = new C0SQV();
                ArrayMap arrayMap2 = new ArrayMap();
                arrayMap2.put("transition_name_thumbnail", c0sqv2);
                arrayMap2.put("transition_name_choose_cover", c0sqv2);
                AnonymousClass1915 anonymousClass19152 = new AnonymousClass1915(arrayMap2);
                VideoPublishEditModel videoPublishEditModel20 = this.LLJLLL;
                if (videoPublishEditModel20 != null && (creativeModel3 = videoPublishEditModel20.creativeModel) != null && (editPostModel3 = creativeModel3.editPostModel) != null) {
                    anchorText = editPostModel3.getAnchorText();
                } else {
                    anchorText = null;
                }
                VideoPublishEditModel videoPublishEditModel21 = this.LLJLLL;
                if (videoPublishEditModel21 != null && (creativeModel2 = videoPublishEditModel21.creativeModel) != null && (editPostModel2 = creativeModel2.editPostModel) != null) {
                    anchorUrlModel3 = editPostModel2.getAnchorUrlModel();
                }
                VideoPublishEditModel videoPublishEditModel22 = this.LLJLLL;
                if (videoPublishEditModel22 != null && (creativeModel = videoPublishEditModel22.creativeModel) != null && (editPostModel = creativeModel.editPostModel) != null) {
                    permission = editPostModel.getPermission();
                }
                VEVideoPublishPreviewScene vEVideoPublishPreviewScene = new VEVideoPublishPreviewScene(videoPublishEditModel20, anchorText, anchorUrlModel3, null, permission, C1443560nfW.LIZIZ, new AwS566S0100000_22(this, 1044));
                editPostedVideoPublishActivity.LLJIJIL = vEVideoPublishPreviewScene;
                C569760MWg c569760MWg2 = new C569760MWg();
                c569760MWg2.LIZJ = anonymousClass19152;
                editPostedVideoPublishActivity.LLLLZLL(vEVideoPublishPreviewScene, c569760MWg2.LIZ());
                return;
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00e3  */
    @Override // com.bytedance.scene.Scene
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r13, android.os.Bundle r14) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 844
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1445410niV.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void LLLLLLLLLL(float f, float f2, View view) {
        Context context;
        if (view != null && (context = view.getContext()) != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = (int) C12ES.LIZJ(32.0f, context);
            C786410Ut5.W5(view, layoutParams);
        }
    }

    public final void LLLLII(C492380JSq c492380JSq, boolean z, EditPostCheckResult editPostCheckResult) throws Throwable {
        EditPostCheckResult editPostCheckResult2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        int i;
        int i2;
        int i3;
        int i4;
        int size;
        int i5;
        int altTextAdded;
        int altTextEdited;
        CreativeModel creativeModel;
        EditPostModel editPostModel;
        AltTextChangeStatus altTextChangeStatusIsChangeAltText;
        CreativeModel creativeModel2;
        EditPostModel editPostModel2;
        AltTextChangeStatus altTextChangeStatusIsChangeAltText2;
        CreativeModel creativeModel3;
        EditPostModel editPostModel3;
        AltTextChangeStatus altTextChangeStatusIsChangeAltText3;
        CreativeModel creativeModel4;
        ImageAlbumData imageAlbumData;
        List<SingleImageData> imageList;
        CreativeModel creativeModel5;
        EditPostModel editPostModel4;
        List<PhotoModeImageUrlModel> imageList2;
        CreativeModel creativeModel6;
        EditPostModel editPostModel5;
        AltTextChangeStatus altTextChangeStatusIsChangeAltText4;
        CreativeModel creativeModel7;
        EditPostModel editPostModel6;
        AltTextChangeStatus altTextChangeStatusIsChangeAltText5;
        CreativeModel creativeModel8;
        EditPostModel editPostModel7;
        AltTextChangeStatus altTextChangeStatusIsChangeAltText6;
        CreativeModel creativeModel9;
        ImageAlbumData imageAlbumData2;
        List<SingleImageData> imageList3;
        CreativeModel creativeModel10;
        EditPostModel editPostModel8;
        PoiData poiData;
        VideoPublishEditModel videoPublishEditModel;
        CreativeModel creativeModel11;
        DraftInfoModel draftInfoModel;
        CreativeInfo creativeInfo;
        VideoPublishEditModel videoPublishEditModel2;
        String videoCoverPath;
        C786410Ut5.LJIIJ(LLLJ());
        if (this.LLJZIJLIL && (videoPublishEditModel2 = this.LLJLLL) != null && videoPublishEditModel2.getVideoCoverPath() != null) {
            EditPostResponse editPostResponse = c492380JSq.LIZ;
            VideoPublishEditModel videoPublishEditModel3 = this.LLJLLL;
            if (videoPublishEditModel3 != null && (videoCoverPath = videoPublishEditModel3.getVideoCoverPath()) != null) {
                editPostResponse.setLocalCoverPath(videoCoverPath);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        int altTextDeleted = 0;
        if (C297360Bl8.LIZ() && (videoPublishEditModel = this.LLJLLL) != null && (creativeModel11 = videoPublishEditModel.creativeModel) != null && (draftInfoModel = creativeModel11.draftInfoModel) != null && draftInfoModel.isPublishedDraft && (creativeInfo = videoPublishEditModel.getCreativeInfo()) != null) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1439130nYN(creativeInfo, this, c492380JSq, null), 3);
        }
        Activity activity = this.mActivity;
        if (activity != null) {
            Intent intent = new Intent();
            intent.putExtra("edit_post_response", c492380JSq.LIZ);
            if (editPostCheckResult instanceof Serializable) {
                editPostCheckResult2 = editPostCheckResult;
            } else {
                editPostCheckResult2 = null;
            }
            intent.putExtra("edit_post_check_result", (Serializable) editPostCheckResult2);
            C2204961BRm.LJIIL(-1, activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhmcbMnZwSGu628qylbxLrjLD8GB77mX1dla2pGRg=", null));
            C857150Xjt c857150Xjt = C857150Xjt.LIZ;
            C0LAB c0lab = new C0LAB();
            c857150Xjt.getClass();
            C857150Xjt.LIZIZ(c0lab);
            String str8 = "1";
            if (z) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c0lab.LJ("repub_from_preview", str);
            if (editPostCheckResult.isTitleChanged()) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c0lab.LJ("title_edited", str2);
            if (editPostCheckResult.isHashtagEdited()) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            c0lab.LJ("hashtags_edited", str3);
            if (editPostCheckResult.isAtFriendEdited()) {
                str4 = "1";
            } else {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            c0lab.LJ("at_friends_edited", str4);
            if (editPostCheckResult.isMentionVideoEdited()) {
                str5 = "1";
            } else {
                str5 = CardStruct.IStatusCode.DEFAULT;
            }
            c0lab.LJ("refer_to_videos_edited", str5);
            if (editPostCheckResult.isCoverEdited()) {
                str6 = "1";
            } else {
                str6 = CardStruct.IStatusCode.DEFAULT;
            }
            c0lab.LJ("cover_edited", str6);
            c0lab.LIZIZ(LLLILZLLLI(), "after_post_days");
            VideoPublishEditModel videoPublishEditModel4 = this.LLJLLL;
            if (videoPublishEditModel4 == null || (creativeModel10 = videoPublishEditModel4.creativeModel) == null || (editPostModel8 = creativeModel10.editPostModel) == null || (poiData = editPostModel8.getPoiData()) == null || (str7 = poiData.poiId) == null) {
                str7 = "";
            }
            c0lab.LJ("poi_id", str7);
            if (!editPostCheckResult.isHeadingChanged()) {
                str8 = CardStruct.IStatusCode.DEFAULT;
            }
            c0lab.LJ("heading_edited", str8);
            c0lab.LIZ(C1568130quR.LIZ() ? 1 : 0, "screen_reader_enabled");
            VideoPublishEditModel videoPublishEditModel5 = this.LLJLLL;
            if (videoPublishEditModel5 != null && (creativeModel9 = videoPublishEditModel5.creativeModel) != null && (imageAlbumData2 = creativeModel9.imageAlbumModel) != null && (imageList3 = imageAlbumData2.getImageList()) != null && !imageList3.isEmpty()) {
                Iterator<SingleImageData> it2 = imageList3.iterator();
                while (it2.hasNext()) {
                    if (it2.next().getSrcImageInfo().getAltText() != null) {
                        i = 1;
                        break;
                    }
                }
                i = 0;
            } else {
                i = 0;
            }
            c0lab.LIZ(i, "has_alt_text");
            VideoPublishEditModel videoPublishEditModel6 = this.LLJLLL;
            if (videoPublishEditModel6 != null && (creativeModel8 = videoPublishEditModel6.creativeModel) != null && (editPostModel7 = creativeModel8.editPostModel) != null && (altTextChangeStatusIsChangeAltText6 = editPostModel7.isChangeAltText()) != null && altTextChangeStatusIsChangeAltText6.getAltTextAdded() == 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            c0lab.LIZ(i2 ^ 1, "add_alternative_text");
            VideoPublishEditModel videoPublishEditModel7 = this.LLJLLL;
            if (videoPublishEditModel7 != null && (creativeModel7 = videoPublishEditModel7.creativeModel) != null && (editPostModel6 = creativeModel7.editPostModel) != null && (altTextChangeStatusIsChangeAltText5 = editPostModel6.isChangeAltText()) != null && altTextChangeStatusIsChangeAltText5.getAltTextEdited() == 0) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            c0lab.LIZ(i3 ^ 1, "edit_alternative_text");
            VideoPublishEditModel videoPublishEditModel8 = this.LLJLLL;
            if (videoPublishEditModel8 != null && (creativeModel6 = videoPublishEditModel8.creativeModel) != null && (editPostModel5 = creativeModel6.editPostModel) != null && (altTextChangeStatusIsChangeAltText4 = editPostModel5.isChangeAltText()) != null && altTextChangeStatusIsChangeAltText4.getAltTextDeleted() == 0) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            c0lab.LIZ(i4 ^ 1, "delete_alternative_text");
            VideoPublishEditModel videoPublishEditModel9 = this.LLJLLL;
            if (videoPublishEditModel9 != null && (creativeModel5 = videoPublishEditModel9.creativeModel) != null && (editPostModel4 = creativeModel5.editPostModel) != null && (imageList2 = editPostModel4.getImageList()) != null) {
                size = imageList2.size();
            } else {
                size = 0;
            }
            c0lab.LIZ(size, "num_photos");
            VideoPublishEditModel videoPublishEditModel10 = this.LLJLLL;
            if (videoPublishEditModel10 != null && (creativeModel4 = videoPublishEditModel10.creativeModel) != null && (imageAlbumData = creativeModel4.imageAlbumModel) != null && (imageList = imageAlbumData.getImageList()) != null && !imageList.isEmpty()) {
                Iterator<SingleImageData> it3 = imageList.iterator();
                i5 = 0;
                while (it3.hasNext()) {
                    if (it3.next().getSrcImageInfo().getAltText() != null && (i5 = i5 + 1) < 0) {
                        C1697810uHb.LJIJ();
                        throw null;
                    }
                }
            } else {
                i5 = 0;
            }
            c0lab.LIZ(i5, "num_photos_alt_text");
            VideoPublishEditModel videoPublishEditModel11 = this.LLJLLL;
            if (videoPublishEditModel11 != null && (creativeModel3 = videoPublishEditModel11.creativeModel) != null && (editPostModel3 = creativeModel3.editPostModel) != null && (altTextChangeStatusIsChangeAltText3 = editPostModel3.isChangeAltText()) != null) {
                altTextAdded = altTextChangeStatusIsChangeAltText3.getAltTextAdded();
            } else {
                altTextAdded = 0;
            }
            c0lab.LIZ(altTextAdded, "num_photos_alt_text_add");
            VideoPublishEditModel videoPublishEditModel12 = this.LLJLLL;
            if (videoPublishEditModel12 != null && (creativeModel2 = videoPublishEditModel12.creativeModel) != null && (editPostModel2 = creativeModel2.editPostModel) != null && (altTextChangeStatusIsChangeAltText2 = editPostModel2.isChangeAltText()) != null) {
                altTextEdited = altTextChangeStatusIsChangeAltText2.getAltTextEdited();
            } else {
                altTextEdited = 0;
            }
            c0lab.LIZ(altTextEdited, "num_photos_alt_text_edit");
            VideoPublishEditModel videoPublishEditModel13 = this.LLJLLL;
            if (videoPublishEditModel13 != null && (creativeModel = videoPublishEditModel13.creativeModel) != null && (editPostModel = creativeModel.editPostModel) != null && (altTextChangeStatusIsChangeAltText = editPostModel.isChangeAltText()) != null) {
                altTextDeleted = altTextChangeStatusIsChangeAltText.getAltTextDeleted();
            }
            c0lab.LIZ(altTextDeleted, "num_photos_alt_text_delete");
            C1445640nis c1445640nis = this.LLL;
            if (c1445640nis != null) {
                C1445630nir.LIZIZ(c0lab, c1445640nis);
            }
            C20684815ws.LJIILLIIL("republish_success", c0lab.LIZ);
            activity.finish();
        }
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        VideoPublishEditModel videoPublishEditModel;
        View viewTd;
        VideoPublishEditModel videoPublishEditModel2;
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            videoPublishEditModel = (VideoPublishEditModel) bundle2.getSerializable("args");
        } else {
            videoPublishEditModel = null;
        }
        this.LLJLLL = videoPublishEditModel;
        Activity activity = this.mActivity;
        if (activity != null && activity.getIntent() != null && (videoPublishEditModel2 = this.LLJLLL) != null) {
            Activity activity2 = this.mActivity;
            if (activity2 != null) {
                Parcelable parcelableExtra = activity2.getIntent().getParcelableExtra("creative_model");
                if (parcelableExtra != null) {
                    videoPublishEditModel2.creativeModel = (CreativeModel) parcelableExtra;
                    VideoPublishEditModel videoPublishEditModel3 = this.LLJLLL;
                    if (videoPublishEditModel3 != null) {
                        videoPublishEditModel3.refreshOldFieldIfNeeded();
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        VideoPublishEditModel videoPublishEditModel4 = this.LLJLLL;
        if (videoPublishEditModel4 != null && C1428470nHB.LJJZZI(videoPublishEditModel4)) {
            setTheme(R.style.mx);
        }
        if (C568750MSj.LIZIZ(this.LLJLLL)) {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.eoj, viewGroup, false);
        } else {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.eoi, viewGroup, false);
        }
        this.LLJIJIL = viewTd;
        if (viewTd == null) {
            return null;
        }
        return viewTd;
    }
}
