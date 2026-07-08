package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.view.KeyEvent;
import androidx.lifecycle.Lifecycle;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.RecordPageOptionalConfig;
import com.ss.android.ugc.aweme.shortvideo.model.PageType;
import com.ss.android.ugc.aweme.shortvideo.model.ReturnEcommercePhotoSearchModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaState;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.effectmanager.common.utils.NetworkUtils;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.text.u;
import lth.o;

/* JADX INFO: renamed from: X.0LEo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C539680LEo extends AbstractC2255721DQs<C0LGN> implements C0LGN, InterfaceC379610EuV, InterfaceC362610EJn {
    public static final C539780LEy LLJLILLLLZIIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLL;
    public static final int LLJLLIL;
    public final C19A3 LL;
    public final int LLILLJJLI;
    public final C1DRG LLILLL;
    public final ShortVideoContextViewModel LLJ;
    public final ChooseMediaViewModel LLJILJILJ;
    public InterfaceC524950KiL LLJJ;
    public boolean LLJJI;
    public C0LG5 LLJJIII;
    public ProgressDialogC1399790mWv LLJJIJIIJIL;
    public long LLJJIJIL;
    public long LLJJJ;
    public final C539750LEv LLJJJIL;
    public final Integer LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public boolean LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public Runnable LLJL;
    public InterfaceC420801kM LLJLIL;
    public final C0LGN LLILZ = this;
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1650230t2r.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648570t0B.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1630630sXF.class, null);
    public final InterfaceC1731706qJ LLJI = C1664770tQJ.LIZ(getDiContainer(), C0MGL.class, null);
    public final InterfaceC1731706qJ LLJIJIL = C1664770tQJ.LIZ(getDiContainer(), a.class, null);
    public final InterfaceC1731706qJ LLJILJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648020szI.class, null);
    public final InterfaceC1731706qJ LLJILLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC535720Kzi.class, null);
    public final C539580LEe LLJJIJI = new C539580LEe(C1664590tQ1.LJII(this), getShortVideoContext(), new C539620LEi(this));

    /* JADX WARN: Type inference failed for: r0v16, types: [X.0LEy] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C539680LEo.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLJLL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C539680LEo.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new C2217381BqS(C539680LEo.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new C2217381BqS(C539680LEo.class, "controlProgressApiComponent", "getControlProgressApiComponent()Lcom/ss/android/ugc/gamora/recorder/progress/LighteningControlProgressApiComponent;", 0), new C2217381BqS(C539680LEo.class, "exitApiComponent", "getExitApiComponent()Lcom/ss/android/ugc/gamora/recorder/exit/ExitApiComponent;", 0), new C2217381BqS(C539680LEo.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0), new C2217381BqS(C539680LEo.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0), new C2217381BqS(C539680LEo.class, "extendAlbumApiComponent", "getExtendAlbumApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/mvtemplate/choosemedia/ecom/search/ExtendAlbumApiComponent;", 0)};
        LLJLILLLLZIIL = new Object() { // from class: X.0LEy
        };
        LLJLLIL = 8;
    }

    private final void B3() {
        InterfaceC524950KiL interfaceC524950KiL = this.LLJJ;
        if (interfaceC524950KiL != null) {
            interfaceC524950KiL.b8(this);
        }
        getCameraApiComponent().IU1().LIZIZ(EnumC545560LaU.EXTERIOR_PREVIEW_SCENE, C1DPV.LIZIZ.LIZIZ(C1DPW.OPEN_CAMERA_ECOMMERCE, EnumC2249681D3m.SHOOT), Boolean.FALSE);
    }

    private final C0MGL G2() {
        return (C0MGL) this.LLJI.getValue(this, LLJLL[4]);
    }

    private final void O3() {
        Runnable runnable = this.LLJL;
        if (runnable != null) {
            c3().removeCallbacks(runnable);
        }
    }

    private final InterfaceC1648020szI Op() {
        return (InterfaceC1648020szI) this.LLJILJIL.getValue(this, LLJLL[6]);
    }

    private final TuxTextView W2() {
        return (TuxTextView) this.LLJJJJLIIL.getValue();
    }

    private final Handler c3() {
        return (Handler) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    private final InterfaceC1650230t2r getCameraApiComponent() {
        return (InterfaceC1650230t2r) this.LLILZIL.getValue(this, LLJLL[0]);
    }

    private final a getPlanCUIApiComponent() {
        return (a) this.LLJIJIL.getValue(this, LLJLL[5]);
    }

    private final InterfaceC1648570t0B getRecordControlApi() {
        return (InterfaceC1648570t0B) this.LLILZLL.getValue(this, LLJLL[1]);
    }

    private final void v3() {
        InterfaceC524950KiL interfaceC524950KiL = this.LLJJ;
        if (interfaceC524950KiL != null) {
            interfaceC524950KiL.kF(this);
        }
        getCameraApiComponent().IU1().LIZLLL(EnumC545560LaU.EXTERIOR_PREVIEW_SCENE, C1DPV.LIZIZ.LIZJ(C1DPX.CLOSE_CAMERA_ECOMMERCE_VIDEO_PREVIEW, EnumC1641610sox.PAGE_INVISIBLE));
    }

    private final InterfaceC1630630sXF w2() {
        return (InterfaceC1630630sXF) this.LLIZLLLIL.getValue(this, LLJLL[3]);
    }

    public final InterfaceC535720Kzi H2() {
        return (InterfaceC535720Kzi) this.LLJILLL.getValue(this, LLJLL[7]);
    }

    public final AbstractBinderC539700LEq T2() {
        return (AbstractBinderC539700LEq) this.LLJJJJJIL.getValue();
    }

    public final void Z1() {
        ProgressDialogC1399790mWv progressDialogC1399790mWv = this.LLJJIJIIJIL;
        if (progressDialogC1399790mWv != null) {
            C0FNV.LIZ(progressDialogC1399790mWv);
        }
    }

    public final void e4() {
        C530750Krh.LJFF.LIZLLL(1, 8, 0, false, new InterfaceC535290Kz1() { // from class: X.0Kzh
            @Override // X.InterfaceC535290Kz1
            public final void LIZ(boolean z, int i, List<MediaModel> list, AbstractC530360Kr4 abstractC530360Kr4) {
                if (list != null && !list.isEmpty() && !C1664590tQ1.LJII(this.LL).isFinishing() && !C1664590tQ1.LJII(this.LL).isDestroyed() && this.LL.getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
                    this.LL.H2().Vd2().setValue(list);
                }
            }
        });
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLIZ.getValue(this, LLJLL[2]);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a8  */
    @Override // X.AbstractC2255721DQs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate() {
        /*
            r6 = this;
            super.onCreate()
            X.1DRG r1 = r6.getDiContainer()
            java.lang.Class<X.0KiL> r0 = X.InterfaceC524950KiL.class
            r5 = 0
            java.lang.Object r0 = r1.LJII(r0, r5)
            X.0KiL r0 = (X.InterfaceC524950KiL) r0
            r6.LLJJ = r0
            java.lang.Integer r2 = r6.LLJJJJ
            X.0LG8 r0 = X.C0LG8.PHOTO_SEARCH
            int r1 = r0.getType()
            if (r2 == 0) goto L79
            int r0 = r2.intValue()
            if (r0 != r1) goto L79
            com.bytedance.tux.input.TuxTextView r0 = r6.W2()
            r3 = 0
            if (r0 == 0) goto L2c
            X.C786410Ut5.LLLLZLL(r0, r3)
        L2c:
            java.lang.String r4 = "ecom_photo_search"
            com.bytedance.keva.Keva r1 = com.bytedance.keva.Keva.getRepo(r4)
            java.lang.String r2 = "is_first_toast"
            if (r1 == 0) goto Lb5
            r0 = 1
            boolean r0 = r1.getBoolean(r2, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L3f:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto La8
            X.0Bx6 r0 = X.C304780Bx6.LIZ
            r0.getClass()
            X.01GW r0 = X.C304780Bx6.LIZJ
            java.lang.Object r1 = r0.getValue()
            java.util.HashMap r1 = (java.util.HashMap) r1
            if (r1 == 0) goto L5c
            java.lang.String r0 = "first_time_tips_key"
            java.lang.Object r5 = r1.get(r0)
        L5c:
            java.lang.String r0 = "picture_search_legal"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r0)
            if (r0 == 0) goto La8
            com.bytedance.keva.Keva r0 = com.bytedance.keva.Keva.getRepo(r4)
            if (r0 == 0) goto L6d
            r0.storeBoolean(r2, r3)
        L6d:
            com.bytedance.tux.input.TuxTextView r1 = r6.W2()
            if (r1 == 0) goto L79
            r0 = 2131840046(0x7f114c2e, float:1.931336E38)
            r1.setText(r0)
        L79:
            X.0t0B r2 = r6.getRecordControlApi()
            java.lang.Class<X.0LF1> r1 = X.C0LF1.class
            X.0LEs r0 = new X.0LEs
            r0.<init>()
            r2.kZ1(r1, r0)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel r3 = r6.LLJILJILJ
            X.0KzT r2 = new X.C2217381BqS() { // from class: X.0KzT
                static {
                    /*
                        X.0KzT r0 = new X.0KzT
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0KzT) X.0KzT.LL X.0KzT
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C535570KzT.<clinit>():void");
                }

                {
                    /*
                        r4 = this;
                        java.lang.Class<com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaState> r3 = com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaState.class
                        java.lang.String r2 = "getGoNextMediaState()Lcom/ss/android/ugc/aweme/shortvideo/mvtemplate/choosemedia/MediaListState;"
                        r1 = 0
                        java.lang.String r0 = "goNextMediaState"
                        r4.<init>(r3, r0, r2, r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C535570KzT.<init>():void");
                }

                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final java.lang.Object get(java.lang.Object r2) {
                    /*
                        r1 = this;
                        com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaState r2 = (com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaState) r2
                        com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaListState r0 = r2.getGoNextMediaState()
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C535570KzT.get(java.lang.Object):java.lang.Object");
                }
            }
            kotlin.jvm.internal.AwS587S0100000_8 r1 = new kotlin.jvm.internal.AwS587S0100000_8
            r0 = 115(0x73, float:1.61E-43)
            r1.<init>(r6, r0)
            com.bytedance.jedi.arch.BaseJediViewModel.iR2(r3, r6, r2, r1)
            X.0t2r r0 = r6.getCameraApiComponent()
            androidx.lifecycle.LiveData r2 = r0.qF1()
            Y.AObserverS212S0100000_8 r1 = new Y.AObserverS212S0100000_8
            r0 = 35
            r1.<init>(r6, r0)
            r2.observe(r6, r1)
            return
        La8:
            com.bytedance.tux.input.TuxTextView r1 = r6.W2()
            if (r1 == 0) goto L79
            r0 = 2131839856(0x7f114b70, float:1.9312975E38)
            r1.setText(r0)
            goto L79
        Lb5:
            r1 = r5
            goto L3f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C539680LEo.onCreate():void");
    }

    public final void q3() {
        if (C533930Kwp.LIZJ()) {
            e4();
        } else {
            this.LLJLIL = BaseJediViewModel.iR2(this.LLJILJILJ, this, new C2217381BqS() { // from class: X.0KzS
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((ChooseMediaState) obj).getClosingChooseMediaPageState();
                }
            }, new AwS587S0100000_8(this, 114));
        }
    }

    public final void rZ() {
        AbstractBinderC539700LEq abstractBinderC539700LEqT2 = T2();
        if (abstractBinderC539700LEqT2 != null) {
            abstractBinderC539700LEqT2.LIZLLL();
        }
        C0LG5 c0lg5 = this.LLJJIII;
        if (c0lg5 != null) {
            C1447800nmM.LIZIZ(this.LL).remove(c0lg5);
            B3();
        }
        if (this.LLJJI) {
            getRecordControlApi().yF2(true);
            getCameraApiComponent().pw0().mWorkspace.LL.hH();
        } else {
            Op().showBottomTab(true);
            getPlanCUIApiComponent().eP2(true);
        }
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLL;
    }

    public final C19A3 getParentScene() {
        return this.LL;
    }

    public C0LGN o2() {
        return this.LLILZ;
    }

    public final void E3(String str) {
        Integer numValueOf;
        String str2;
        RecordPageOptionalConfig recordPageOptionalConfig = getShortVideoContext().creativeModel.initialModel.recordPageOptionalConfig;
        if (recordPageOptionalConfig != null) {
            numValueOf = Integer.valueOf(recordPageOptionalConfig.exteriorRecordPageType);
        } else {
            numValueOf = null;
        }
        int type = C0LG8.ECOMMERCE_COMMENT.getType();
        if (numValueOf != null && numValueOf.intValue() == type) {
            ShortVideoContext shortVideoContext = getShortVideoContext();
            boolean z = this.LLJJI;
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("shoot_way", shortVideoContext.shootWay);
            c0lab.LJ("creation_id", shortVideoContext.getCreationId());
            c0lab.LJ("content_source", "shoot");
            String str3 = "video";
            if (z) {
                c0lab.LJ("content_type", "video");
            } else {
                c0lab.LJ("content_type", "photo");
            }
            RecordPageOptionalConfig recordPageOptionalConfig2 = shortVideoContext.creativeModel.initialModel.recordPageOptionalConfig;
            if (recordPageOptionalConfig2 != null) {
                str2 = recordPageOptionalConfig2.previousPage;
            } else {
                str2 = null;
            }
            c0lab.LJ("previous_page", str2);
            C20684815ws.LJIILLIIL("video_shoot_next", c0lab.LIZ);
            Q3("shoot");
            this.LLJJIJI.LIZ();
            this.LLJJIJIL = System.currentTimeMillis();
            this.LLJJL = false;
            if (this.LLJJI) {
                W1(str, "video", EnumC539610LEh.RECORD_VIDEO_PROCESS_TIMEOUT, "shoot");
            } else {
                W1(str, "photo", EnumC539610LEh.RECORD_PHOTO_PROCESS_TIMEOUT, "shoot");
                str3 = "photo";
            }
            C539630LEj.LJ(this.LLJJJJ, C0L9X.START, C0LEQ.COMPRESS_SAVE, str3, null, 0L, 0);
            C539580LEe c539580LEe = this.LLJJIJI;
            boolean z2 = this.LLJJI;
            c539580LEe.getClass();
            c539580LEe.LJIIL = System.currentTimeMillis();
            c539580LEe.LJIIIZ = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0LEZ(z2, c539580LEe, str, null), 3);
            return;
        }
        int type2 = C0LG8.AIGC.getType();
        if (numValueOf != null && numValueOf.intValue() == type2) {
            AbstractBinderC539700LEq abstractBinderC539700LEqT2 = T2();
            if (abstractBinderC539700LEqT2 == null) {
                return;
            }
            abstractBinderC539700LEqT2.LIZIZ(C1664590tQ1.LJII(this), str, new AwS587S0100000_8(this, 116));
            return;
        }
        AbstractBinderC539700LEq abstractBinderC539700LEqT22 = T2();
        if (abstractBinderC539700LEqT22 == null) {
            return;
        }
        abstractBinderC539700LEqT22.LIZIZ(C1664590tQ1.LJII(this), str, null);
    }

    @Override // X.C0LGN
    public void EA0(String str) {
        Integer numValueOf;
        this.LLJ.ko0(false);
        if (!C2286708xd.LIZJ(str)) {
            return;
        }
        Integer num = this.LLJJJJ;
        int type = C0LG8.PHOTO_SEARCH.getType();
        if (num != null && num.intValue() == type) {
            if (!NetworkUtils.isNetworkAvailable(C1664590tQ1.LJII(this))) {
                Activity activityLJII = C1664590tQ1.LJII(this);
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.messageRes(2131835933);
                creativeToastBuilder.isTuxToast(true);
                C1390380mHk.LIZ(activityLJII, 6001, creativeToastBuilder);
                return;
            }
            i3(str, PageType.TAKE_PHOTO, null, null);
            return;
        }
        this.LLJJI = u.LJIIZILJ(str, ".mp4", true);
        RecordPageOptionalConfig recordPageOptionalConfig = getShortVideoContext().creativeModel.initialModel.recordPageOptionalConfig;
        if (recordPageOptionalConfig != null) {
            numValueOf = Integer.valueOf(recordPageOptionalConfig.exteriorRecordPageType);
        } else {
            numValueOf = null;
        }
        C0LG8 c0lg8 = C0LG8.AIGC;
        int type2 = c0lg8.getType();
        if (numValueOf == null || numValueOf.intValue() != type2) {
            c0lg8 = C0LG8.ECOMMERCE_COMMENT;
        }
        RecordPageOptionalConfig recordPageOptionalConfig2 = getShortVideoContext().creativeModel.initialModel.recordPageOptionalConfig;
        if (recordPageOptionalConfig2 != null && recordPageOptionalConfig2.showPreviewAfterRecord) {
            if (!this.LLJJI) {
                Op().showBottomTab(false);
                getPlanCUIApiComponent().eP2(false);
            }
            C0LG5 c0lg5 = new C0LG5(this.LLJJI, getPlanCUIApiComponent().sK0(), str, c0lg8, this.LLJJJIL);
            this.LLJJIII = c0lg5;
            NavigationScene navigationSceneLIZIZ = C1447800nmM.LIZIZ(this.LL);
            navigationSceneLIZIZ.LLJJJ = true;
            navigationSceneLIZIZ.LLJJIJIL = null;
            C1447800nmM.LIZIZ(this.LL).LLLLLLLLLL(c0lg5, null);
            v3();
            AbstractBinderC539700LEq abstractBinderC539700LEqT2 = T2();
            if (abstractBinderC539700LEqT2 != null) {
                abstractBinderC539700LEqT2.LJ();
                return;
            }
            return;
        }
        E3(str);
    }

    public final long H3(long j) {
        return j - this.LLJJIJIL;
    }

    public final void Q3(final String str) {
        this.LLJJIJIIJIL = C576210Mip.LIZ(C1664590tQ1.LJII(this), EnumC1399820mWy.VISIBLE_AFTER_5S, new InterfaceC1399800mWw() { // from class: X.0LEX
            @Override // X.InterfaceC1399800mWw
            public final void LIZ() {
                C539680LEo c539680LEo = this.LIZ;
                C539630LEj.LJ(c539680LEo.LLJJJJ, C0L9X.CANCELLED, C0LEQ.COMPRESS_SAVE, "", null, c539680LEo.H3(System.currentTimeMillis()), 0);
                this.LIZ.X1(str, new C539570LEd(false, true, false), null);
                this.LIZ.Z1();
            }
        });
        ProgressDialogC1399790mWv progressDialogC1399790mWv = this.LLJJIJIIJIL;
        if (progressDialogC1399790mWv != null) {
            progressDialogC1399790mWv.setMessage(C1664590tQ1.LJII(this).getResources().getString(R.string.txr));
        }
        ProgressDialogC1399790mWv progressDialogC1399790mWv2 = this.LLJJIJIIJIL;
        if (progressDialogC1399790mWv2 != null) {
            C786410Ut5.O4(progressDialogC1399790mWv2);
        }
    }

    @Override // X.InterfaceC362610EJn
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        rZ();
        return true;
    }

    public C539680LEo(C19A3 c19a3, int i, C1DRG c1drg) {
        this.LL = c19a3;
        this.LLILLJJLI = i;
        this.LLILLL = c1drg;
        this.LLJ = (ShortVideoContextViewModel) C1659630tI1.LJIIIIZZ(c19a3, null, null, 6).get(ShortVideoContextViewModel.class);
        this.LLJILJILJ = (ChooseMediaViewModel) C1659640tI2.LIZLLL(c19a3).LIZ(ChooseMediaViewModel.class);
        C539750LEv c539750LEv = new C539750LEv();
        c539750LEv.LIZ = getShortVideoContext();
        c539750LEv.LIZJ = new C539740LEu(this);
        c539750LEv.LIZIZ = new C539730LEt(this);
        this.LLJJJIL = c539750LEv;
        RecordPageOptionalConfig recordPageOptionalConfig = getShortVideoContext().creativeModel.initialModel.recordPageOptionalConfig;
        this.LLJJJJ = recordPageOptionalConfig != null ? Integer.valueOf(recordPageOptionalConfig.exteriorRecordPageType) : null;
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 190));
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 191));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(131));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void X1(java.lang.String r22, X.C539570LEd r23, java.util.List<com.ss.android.ugc.aweme.shortvideo.model.ReturnEcommerceCommentModel> r24) {
        /*
            Method dump skipped, instruction units count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C539680LEo.X1(java.lang.String, X.0LEd, java.util.List):void");
    }

    public final void W1(final String str, final String str2, final EnumC539610LEh enumC539610LEh, final String str3) {
        Runnable runnable = new Runnable() { // from class: X.0LEW
            public final void LIZ() {
                C539680LEo c539680LEo = this.LL;
                if (c539680LEo.LLJJL) {
                    return;
                }
                C539630LEj.LIZJ(c539680LEo.getShortVideoContext(), str, str2, enumC539610LEh, str3, this.LL.H3(System.currentTimeMillis()), "");
                this.LL.X1(str3, new C539570LEd(false, true, true), null);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ExteriorRecordStageFinishLogicComponent@5ecc.addTimeOutRunnable$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ExteriorRecordStageFinishLogicComponent@5ecc.addTimeOutRunnable$1");
            }
        };
        this.LLJL = runnable;
        C786410Ut5.LJLIIL(60000L, c3(), runnable);
    }

    public final void i3(String str, PageType pageType, TikTokMediaModel tikTokMediaModel, String str2) {
        boolean z;
        String str3 = str2;
        String strLJIJ = str;
        PageType pageType2 = PageType.ALBUM;
        if (pageType == pageType2) {
            ChooseMediaViewModel chooseMediaViewModel = this.LLJILJILJ;
            C529130Kp5 c529130Kp5 = new C529130Kp5(true);
            chooseMediaViewModel.getClass();
            chooseMediaViewModel.yR2(new AwS587S0100000_8(c529130Kp5, 192));
        }
        Intent intent = new Intent();
        if (o.LJJ.LJ().LJFF(C1664590tQ1.LJII(this)) == 0) {
            z = true;
        } else {
            z = false;
        }
        boolean zLIZJ = C533930Kwp.LIZJ();
        if (pageType == pageType2) {
            strLJIJ = C2471909mP.LJIJ(tikTokMediaModel);
        }
        if (str3 == null) {
            str3 = "";
        }
        intent.putExtra("return_ecommerce_photo_search_model", new ReturnEcommercePhotoSearchModel(pageType, strLJIJ, zLIZJ, z, str3));
        AbstractBinderC539700LEq abstractBinderC539700LEqT2 = T2();
        if (abstractBinderC539700LEqT2 != null) {
            abstractBinderC539700LEqT2.LIZJ(C1664590tQ1.LJII(this), 0, intent);
        }
    }
}
