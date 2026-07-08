package X;

import Y.ACListenerS134S0200000_32;
import Y.AObjectS243S0100000_14;
import Y.AObserverS218S0100000_14;
import Y.AfS197S0100000_28;
import android.content.Context;
import android.content.DialogInterface;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.ui.state.LiveState;
import com.bytedance.keva.Keva;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.creative.model.CMPreviewInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.SubOnlyPhotoPreviewInfo;
import com.ss.android.ugc.aweme.publish.privacy.PermissionConfigure;
import com.ss.android.ugc.aweme.publish.privacy.PostBtnConfigure;
import com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS278S0000000_32;
import kotlin.jvm.internal.AwS44S0001000_32;
import kotlin.jvm.internal.AwS44S0010000_32;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1941, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class AnonymousClass1941 extends C193N<InterfaceC855150Xgf, C194A, C214784193u> implements InterfaceC855150Xgf {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public static final int LLJJJJLIIL;
    public final MutableLiveData<Integer> LLIZ;
    public final C11NJ LLIZLLLIL;
    public final InterfaceC1731706qJ LLJ;
    public final InterfaceC1731706qJ LLJI;
    public final InterfaceC1731706qJ LLJIJIL;
    public final InterfaceC1731706qJ LLJILJIL;
    public final InterfaceC1731706qJ LLJILJILJ;
    public final InterfaceC1731706qJ LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final Function0<C194A> LLJJIJIL;
    public final C214784193u LLJJJ;
    public final InterfaceC1738600vLO LLJJJIL;
    public final C10J3 LLJJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AnonymousClass1941.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(AnonymousClass1941.class, "extensionDataRepo", "getExtensionDataRepo()Lcom/ss/android/ugc/aweme/services/publish/ExtensionDataRepo;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(AnonymousClass1941.class, "syncModule", "getSyncModule()Lcom/ss/android/ugc/aweme/shortvideo/BasePublishSyncModule;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(AnonymousClass1941.class, "fragmentActivity", "getFragmentActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(AnonymousClass1941.class, "publishAudioCopyrightHandler", "getPublishAudioCopyrightHandler()Lcom/ss/android/ugc/aweme/shortvideo/audio/copyright/handler/BasePublishAudioCopyrightHandler;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(AnonymousClass1941.class, "moreOptionApiComponent", "getMoreOptionApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/option/more/MoreOptionApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(AnonymousClass1941.class, "pugcTemplateOptionApiComponent", "getPugcTemplateOptionApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/template/PUGCTemplateOptionApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(AnonymousClass1941.class, "collabOptionApiComponent", "getCollabOptionApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/collab/CollabOptionApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(AnonymousClass1941.class, "geoFencingOptionApi", "getGeoFencingOptionApi()Lcom/ss/android/ugc/aweme/shortvideo/component/geofencing/GeoFencingOptionApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS10 = new C2217381BqS(AnonymousClass1941.class, "addToPlaylistOptionApiComponent", "getAddToPlaylistOptionApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/playlist/AddToPlaylistOptionApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS11 = new C2217381BqS(AnonymousClass1941.class, "scheduleOptionApi", "getScheduleOptionApi()Lcom/ss/android/ugc/aweme/shortvideo/component/schedule/ScheduleOptionApiComponent;", 0);
        c09r3.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9, c2217381BqS10, c2217381BqS11};
        LLJJJJLIIL = 8;
    }

    private final void D5() {
        C371780Ehs.LIZ(this.LLIZLLLIL, C19210910Dr.LIZ.LJJLJLI(new AfS197S0100000_28(this, 22)));
    }

    private final InterfaceC214695190j P4() {
        return (InterfaceC214695190j) this.LLJJI.getValue(this, LLJJJJJIL[7]);
    }

    private final C19EG Z4() {
        return (C19EG) this.LLJILJIL.getValue(this, LLJJJJJIL[3]);
    }

    private final InterfaceC857270Xk5 d5() {
        return (InterfaceC857270Xk5) this.LLJJIII.getValue(this, LLJJJJJIL[8]);
    }

    private final InterfaceC855180Xgi n5() {
        return (InterfaceC855180Xgi) this.LLJILLL.getValue(this, LLJJJJJIL[5]);
    }

    private final InterfaceC907240ZiU v5() {
        return (InterfaceC907240ZiU) this.LLJJ.getValue(this, LLJJJJJIL[6]);
    }

    private final InterfaceC855160Xgg x5() {
        return (InterfaceC855160Xgg) this.LLJJIJIIJIL.getValue(this, LLJJJJJIL[10]);
    }

    public final AbstractC855580XhM C5() {
        return (AbstractC855580XhM) this.LLJIJIL.getValue(this, LLJJJJJIL[2]);
    }

    @Override // X.C193N
    public AnonymousClass1931<?, C194A, C214784193u> F4() {
        return new AnonymousClass1931<C10GO, C194A, C214784193u>() { // from class: X.194D
            @Override // X.AnonymousClass1931
            public final AbstractC1738640vLS LJ(Context context, ViewGroup viewGroup) {
                C10FN c10fn = new C10FN(context);
                c10fn.setOrientation(0);
                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c10fn);
                c10fn.setLayoutParams(layoutParams);
                return new C10GO(c10fn);
            }

            @Override // X.AnonymousClass1931
            public final void LIZLLL(AbstractC1738640vLS abstractC1738640vLS, C193X c193x, C1664690tQB c1664690tQB, Object obj) {
                C10GO c10go = (C10GO) abstractC1738640vLS;
                C214784193u c214784193u = (C214784193u) obj;
                LIZ(c1664690tQB.LIZ(new C2217381BqS() { // from class: X.1949
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj2) {
                        return Integer.valueOf(((C194A) obj2).LIZ);
                    }
                }), c10go, Lifecycle.State.STARTED, new AwS611S0100000_32(c10go, 114));
                LIZ(c1664690tQB.LIZ(new C2217381BqS() { // from class: X.0Lve
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj2) {
                        return Boolean.valueOf(((C194A) obj2).LIZIZ);
                    }
                }), c10go, Lifecycle.State.STARTED, new AwS611S0100000_32(c10go, 115));
                LIZ(c1664690tQB.LIZ(new C2217381BqS() { // from class: X.194J
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj2) {
                        return Boolean.valueOf(((C194A) obj2).LIZJ);
                    }
                }), c10go, Lifecycle.State.STARTED, new AwS611S0100000_32(c10go, 116));
                LIZ(c1664690tQB.LIZ(new C2217381BqS() { // from class: X.194C
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj2) {
                        return Boolean.valueOf(((C194A) obj2).LJ);
                    }
                }), c10go, Lifecycle.State.STARTED, new AwS611S0100000_32(c10go, 106));
                LIZ(c1664690tQB.LIZ(new C2217381BqS() { // from class: X.194F
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj2) {
                        return Boolean.valueOf(((C194A) obj2).LIZLLL);
                    }
                }), c10go, Lifecycle.State.STARTED, new AwS611S0100000_32(c10go, 109));
                LIZ(c1664690tQB.LIZ(new C2217381BqS() { // from class: X.194G
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj2) {
                        return Boolean.valueOf(((C194A) obj2).LJFF);
                    }
                }), c10go, Lifecycle.State.STARTED, new AwS611S0100000_32(c10go, 110));
                if (C298670BnF.LIZ()) {
                    LIZ(c1664690tQB.LIZ(new C2217381BqS() { // from class: X.194B
                        @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                        public final Object get(Object obj2) {
                            return ((C194A) obj2).LJI;
                        }
                    }), c10go, Lifecycle.State.STARTED, new AwS611S0100000_32(c10go, 111));
                    LIZ(c1664690tQB.LIZ(new C2217381BqS() { // from class: X.194H
                        @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                        public final Object get(Object obj2) {
                            return Boolean.valueOf(((C194A) obj2).LJII);
                        }
                    }), c10go, Lifecycle.State.STARTED, new AwS611S0100000_32(c10go, 112));
                }
                LIZ(c1664690tQB.LIZ(new C2217381BqS() { // from class: X.194I
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj2) {
                        return Boolean.valueOf(((C194A) obj2).LJIIIIZZ);
                    }
                }), c10go, Lifecycle.State.STARTED, new AwS611S0100000_32(c10go, 113));
                c10go.LL.LIZ(new ACListenerS134S0200000_32(c193x, c214784193u, 8));
            }
        };
    }

    @Override // X.InterfaceC855150Xgf
    public LiveState<Integer> JN2() {
        return H2(new C2217381BqS() { // from class: X.1948
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C194A) obj).LIZ);
            }
        });
    }

    public final InterfaceC856590Xiz O4() {
        return (InterfaceC856590Xiz) this.LLJJIJI.getValue(this, LLJJJJJIL[9]);
    }

    public final ExtensionDataRepo T4() {
        return (ExtensionDataRepo) this.LLJI.getValue(this, LLJJJJJIL[1]);
    }

    @Override // X.InterfaceC855150Xgf
    public int hu0() {
        Integer value = this.LLIZ.getValue();
        return value != null ? value.intValue() : T2().LIZ;
    }

    public final VideoPublishEditModel k5() {
        return (VideoPublishEditModel) this.LLJ.getValue(this, LLJJJJJIL[0]);
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        this.LLIZLLLIL.LJ();
        super.onDestroy();
    }

    public final AbstractC855920Xhu t5() {
        return (AbstractC855920Xhu) this.LLJILJILJ.getValue(this, LLJJJJJIL[4]);
    }

    @Override // X.C193N, X.C193O
    public void Q3() {
        Integer value;
        SubOnlyPhotoPreviewInfo subOnlyPhotoPreviewInfo;
        List<SingleImageData> imageList;
        List<SingleImageData> imageList2;
        if (C859340XnQ.LIZ(k5())) {
            i3(AFwS278S0000000_32.get$arr$(75));
        }
        this.LLIZ.observe(this, new AObjectS243S0100000_14(this, 0));
        C363500EMy c363500EMy = C363500EMy.LIZ;
        VideoPublishEditModel videoPublishEditModelK5 = k5();
        c363500EMy.getClass();
        if (C363500EMy.LJIIJ(videoPublishEditModelK5)) {
            this.LLIZ.setValue(0);
        } else {
            VideoPublishEditModel videoPublishEditModelK52 = k5();
            C298650BnD.LIZ();
            if (C857680Xkk.LIZIZ(videoPublishEditModelK52)) {
                this.LLIZ.setValue(4);
            } else {
                this.LLIZ.setValue(Integer.valueOf(k5().isPrivate));
            }
        }
        C857310Xk9 c857310Xk9 = C857310Xk9.LIZ;
        int iHu0 = hu0();
        c857310Xk9.getClass();
        Keva kevaLIZJ = C857310Xk9.LIZJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initial_permission_enter_publish_page_");
        sbLIZ.append(C857310Xk9.LIZIZ());
        kevaLIZJ.storeInt(C2188811AlT.LIZIZ(sbLIZ), iHu0);
        InterfaceC857270Xk5 interfaceC857270Xk5D5 = d5();
        if (interfaceC857270Xk5D5 != null) {
            interfaceC857270Xk5D5.lA2(new AObserverS218S0100000_14(this, 13));
        }
        i3(new AwS611S0100000_32(this, 107));
        if (C298640BnC.LIZ() && (value = this.LLIZ.getValue()) != null && value.intValue() == 4) {
            VideoPublishEditModel videoPublishEditModelK53 = k5();
            int iLIZJ = C1447940nma.LIZJ(videoPublishEditModelK53);
            ImageAlbumData imageAlbumData = videoPublishEditModelK53.getImageAlbumData();
            int size = (imageAlbumData == null || (imageList2 = imageAlbumData.getImageList()) == null) ? 0 : imageList2.size();
            boolean z = iLIZJ > 0;
            ImageAlbumData imageAlbumData2 = videoPublishEditModelK53.getImageAlbumData();
            SingleImageData singleImageData = null;
            if (imageAlbumData2 != null && (imageList = imageAlbumData2.getImageList()) != null) {
                singleImageData = (SingleImageData) C13LP.LJJJLL(imageList);
            }
            if (iLIZJ == size) {
                C19210610Do.LIZJ(videoPublishEditModelK53);
            } else if (z) {
                if (singleImageData == null || singleImageData.getSubOnlyPhotoPreviewInfo() == null) {
                    C19210610Do.LIZJ(videoPublishEditModelK53);
                } else if (singleImageData != null && (subOnlyPhotoPreviewInfo = singleImageData.getSubOnlyPhotoPreviewInfo()) != null && !subOnlyPhotoPreviewInfo.isPreview()) {
                    C19210610Do.LIZJ(videoPublishEditModelK53);
                }
            }
        }
        D5();
    }

    @Override // X.C193N, X.C193O
    public /* bridge */ /* synthetic */ Object B3() {
        return this.LLJJJ;
    }

    @Override // X.C193N, X.C193O
    public InterfaceC1738600vLO E3() {
        return this.LLJJJIL;
    }

    @Override // X.C193N
    public C10J3 H4() {
        return this.LLJJJJ;
    }

    public C214784193u K4() {
        return this.LLJJJ;
    }

    @Override // X.C193N, X.C193O, X.AbstractC1664470tPp
    public Function0<C194A> o2() {
        return this.LLJJIJIL;
    }

    public AnonymousClass1941(C1DRG c1drg) {
        super(c1drg);
        this.LLIZ = new MutableLiveData<>(0);
        this.LLIZLLLIL = new C11NJ();
        this.LLJ = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJI = C1664770tQJ.LIZ(getDiContainer(), ExtensionDataRepo.class, null);
        this.LLJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), AbstractC855580XhM.class, null);
        this.LLJILJIL = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
        this.LLJILJILJ = C1664770tQJ.LIZ(getDiContainer(), AbstractC855920Xhu.class, null);
        this.LLJILLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC855180Xgi.class, null);
        this.LLJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC907240ZiU.class, null);
        this.LLJJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC214695190j.class, null);
        this.LLJJIII = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC857270Xk5.class, null);
        this.LLJJIJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC856590Xiz.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC855160Xgg.class, null);
        this.LLJJIJIL = new AwS576S0100000_32(this, 286);
        this.LLJJJ = new C214784193u(new AwS576S0100000_32(this, 285));
        this.LLJJJIL = EnumC214771193h.PERMISSION;
        this.LLJJJJ = AnonymousClass1938.LIZ;
    }

    public final void E5(DialogInterface dialogInterface) {
        AbstractC343940De4 abstractC343940De4LJIIJJI;
        InterfaceC907240ZiU interfaceC907240ZiUV5;
        boolean z;
        if (dialogInterface instanceof DialogInterfaceC1444430ngv) {
            abstractC343940De4LJIIJJI = ((DialogInterfaceC1444430ngv) dialogInterface).LL;
        } else {
            String str = TuxSheet._pnsPageId;
            abstractC343940De4LJIIJJI = C1391190mJ3.LJIIJJI(dialogInterface);
        }
        int iHu0 = hu0();
        InterfaceC214695190j interfaceC214695190jP4 = P4();
        if (interfaceC214695190jP4 != null) {
            interfaceC214695190jP4.FR1(iHu0);
        }
        if (C856200XiM.LIZ() && (interfaceC907240ZiUV5 = v5()) != null) {
            if (iHu0 == 0) {
                z = true;
            } else {
                z = false;
            }
            interfaceC907240ZiUV5.gm2(z);
        }
        String str2 = k5().creativeModel.transientPostPageModel.LJJIIJZLJL;
        C0CHQ.LIZ().getPublishService().LJJLIIIJLJLI().getClass();
        if (str2 == null) {
            str2 = "";
        }
        C1403840mdS.LIZLLL(iHu0, "video_post_page", str2, abstractC343940De4LJIIJJI);
        if (iHu0 == 4 && !C855230Xgn.LIZ.getBoolean("has_sov_mark", false)) {
            k5().creativeModel.privacySettingModel.isSubscribeOnly = true;
            if (Intrinsics.LJFF(C1459950o5x.LIZ.getValue(), Boolean.TRUE)) {
                C19EG c19egZ4 = Z4();
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.messageRes(2131839365);
                C1390380mHk.LIZ(c19egZ4, 8001, creativeToastBuilder);
            }
        }
        i3(AFwS278S0000000_32.get$arr$(74));
    }

    public final void H5(int i) {
        i3(new AwS44S0001000_32(i, 0));
    }

    public final void M5(int i) {
        C0CHQ.LIZ().getPublishService().LJJLIIIJLJLI().getClass();
        C1403840mdS.LJFF(k5(), "video_post_page", i, k5().creativeModel.transientPostPageModel.LJJIZ, null);
        boolean z = false;
        if (i == 4) {
            if (C298680BnG.LIZ()) {
                k5().isPrivate = i;
            }
            k5().creativeModel.privacySettingModel.isSubscribeOnly = true;
        } else {
            k5().isPrivate = i;
            k5().creativeModel.privacySettingModel.isSubscribeOnly = false;
        }
        this.LLIZ.setValue(Integer.valueOf(i));
        C0CHQ.LIZ().getPublishService().LJJLIIIJLJLI().getClass();
        Z4();
        C1444610nhD.LIZ(i);
        k5().creativeModel.transientPostPageModel.LJIIIZ = true;
        InterfaceC855180Xgi interfaceC855180XgiN5 = n5();
        if (interfaceC855180XgiN5 != null) {
            interfaceC855180XgiN5.xz();
        }
        if (C376910Eq9.LIZIZ(k5()) && C1441320nbu.LIZIZ()) {
            z = true;
        }
        k5().creativeModel.ugcTemplateData.enablePublishAsTemplate = z;
    }

    public final void N5(CMPreviewInfo cMPreviewInfo) {
        if (!C298640BnC.LIZ()) {
            k5().creativeModel.privacySettingModel.cmPreviewInfo = cMPreviewInfo;
        }
        i3(new AwS611S0100000_32(cMPreviewInfo, 108));
    }

    @Override // X.InterfaceC855150Xgf
    public void Ps1(String str) {
        C1444750nhR.LIZ(wH1(false, str), Z4(), new AnonymousClass1947(this), null, new DialogInterfaceOnDismissListenerC21523619Le(this, 2), getDiContainer());
    }

    @Override // X.InterfaceC855150Xgf
    public void jD2(DialogInterface dialogInterface) {
        E5(dialogInterface);
    }

    @Override // X.InterfaceC855150Xgf
    public void jY0(int i) {
        this.LLIZ.setValue(Integer.valueOf(i));
    }

    @Override // X.InterfaceC855150Xgf
    public void lq(boolean z) {
        i3(new AwS44S0010000_32(z, 7));
    }

    @Override // X.InterfaceC855150Xgf
    public void nw(boolean z) {
        i3(new AwS44S0010000_32(z, 6));
    }

    @Override // X.InterfaceC855150Xgf
    public void setAdvPromotable(boolean z) {
        i3(new AwS44S0010000_32(z, 5));
    }

    @Override // X.InterfaceC855150Xgf
    public void vG1(int i) {
        M5(i);
    }

    @Override // X.InterfaceC855150Xgf
    public PermissionConfigure wH1(boolean z, String str) {
        return new PermissionConfigure(hu0(), k5(), new PostBtnConfigure(z, ""), str);
    }
}
