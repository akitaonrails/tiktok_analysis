package X;

import Y.ARunnableS1S3300000_8;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.lifecycle.LiveData;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.aime.IAIMEServices;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.draft.DraftInfoModel;
import com.ss.android.ugc.aweme.creative.model.edit.EditModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.internal.IShareService;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS157S1100000_8;
import kotlin.jvm.internal.AwS16S1110000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS8S1401000_8;
import kotlin.jvm.internal.AwS91S0210000_8;
import kotlin.jvm.internal.Intrinsics;
import l5a.a;

/* JADX INFO: renamed from: X.0M7N, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M7N {
    public final AbstractC214814194y LIZ;
    public View LIZIZ;
    public final VideoPublishEditModel LIZJ;
    public final InterfaceC578380MmK LIZLLL;
    public final InterfaceC1446740nke LJ;
    public final InterfaceC1451050nrb LJFF;
    public final InterfaceC1455010nxz LJI;
    public final InterfaceC1453760nvy LJII;
    public final C0E48 LJIIIIZZ;
    public final boolean LJIIIZ;
    public final int LJIIJ;
    public final ArrayList<C570020MXg> LJIIJJI;
    public final C19GS LJIIL;
    public C1402840mbq LJIILIIL;
    public final C540540LHw LJIILJJIL;
    public C570010MXf LJIILL;

    public final void LIZ() {
        C560380LyO c560380LyO = C560380LyO.LIZ;
        boolean zIsLastScene = this.LIZ.isLastScene();
        c560380LyO.getClass();
        C560380LyO.LJIIIZ("back_to_ai_self_tab", zIsLastScene);
        a.LIZIZ.LIZ(this.LIZJ.getCreationId());
        InterfaceC578380MmK interfaceC578380MmK = this.LIZLLL;
        if (interfaceC578380MmK != null) {
            interfaceC578380MmK.LJJLIIIJJIZ();
        }
        IAIMEServices iAIMEServices = C342770DcB.LIZ() ? (IAIMEServices) PluggableExtentionKt.pluggableSpi$default(IAIMEServices.class, false, false, false, 14, null) : (IAIMEServices) ServiceManager.get().getService(IAIMEServices.class);
        if (iAIMEServices != null) {
            C19GS c19gs = this.LJIIL;
            String str = this.LIZJ.mShootWay;
            if (!C123100dR.LIZ(str) || str == null) {
                str = "other_aime";
            }
            iAIMEServices.LJFF(c19gs, "video_edit_page", str, null);
        }
        C1438840nXu c1438840nXu = C1438840nXu.LIZ;
        C1438980nY8 c1438980nY8 = new C1438980nY8(this.LIZ, null);
        c1438840nXu.getClass();
        C1438840nXu.LIZ(c1438980nY8);
    }

    public final void LJFF() throws Throwable {
        String strTB2;
        Activity activityLIZIZ;
        Scene secondScene;
        Activity activity;
        C1446250njr c1446250njr = C1446250njr.LIZ;
        VideoPublishEditModel videoPublishEditModel = this.LIZJ;
        InterfaceC1455010nxz interfaceC1455010nxz = this.LJI;
        if (interfaceC1455010nxz == null || (strTB2 = interfaceC1455010nxz.tB2()) == null) {
            strTB2 = "";
        }
        c1446250njr.getClass();
        C1446250njr.LIZIZ(videoPublishEditModel, strTB2);
        InterfaceC578380MmK interfaceC578380MmK = this.LIZLLL;
        if (interfaceC578380MmK != null) {
            interfaceC578380MmK.LJJLIIIJJIZ();
        }
        Activity activityLIZ = null;
        if (C0E6V.LIZ != null) {
            C0E6V.LIZ = null;
        }
        if (!C1402930mbz.LJ(this.LIZJ)) {
            C560380LyO c560380LyO = C560380LyO.LIZ;
            boolean zIsLastScene = this.LIZ.isLastScene();
            c560380LyO.getClass();
            C560380LyO.LJIIIZ("close_edit", zIsLastScene);
            C1438840nXu c1438840nXu = C1438840nXu.LIZ;
            C1438980nY8 c1438980nY8 = new C1438980nY8(this.LIZ, this.LIZJ);
            c1438840nXu.getClass();
            C1438840nXu.LIZ(c1438980nY8);
            return;
        }
        if (C298030BmD.LIZ()) {
            CreativeModel creativeModel = this.LIZJ.creativeModel;
            EditModel editModel = creativeModel.editModel;
            if (editModel.isSdkShareClickSaveDraft && !creativeModel.draftInfoModel.isDraft) {
                editModel.isSdkShareClickSaveDraft = false;
                this.LJIILIIL = C1403010mc7.LIZ.getBridgeService().LJ(this.LIZJ);
                ICreativeSAAService iCreativeSAAService = (ICreativeSAAService) PluggableExtentionKt.pluggableSpi$default(ICreativeSAAService.class, false, false, false, 14, null);
                if (iCreativeSAAService == null || (secondScene = iCreativeSAAService.getSecondScene(this.LJIIL)) == null || (activity = secondScene.mActivity) == null) {
                    AbstractC1387200mCc abstractC1387200mCcLIZLLL = C1906580ziK.LIZLLL();
                    if (abstractC1387200mCcLIZLLL != null && (activityLIZIZ = abstractC1387200mCcLIZLLL.LIZIZ()) != null) {
                        activityLIZ = C1388190mED.LIZ(activityLIZIZ);
                    }
                } else {
                    activityLIZ = activity;
                }
                if (activityLIZ == null) {
                    LIZJ(true);
                } else {
                    IShareService iShareService = (IShareService) PluggableExtentionKt.pluggableSpi$default(IShareService.class, false, false, false, 14, null);
                    if (iShareService != null) {
                        iShareService.LIZJ(activityLIZ, this.LJIILIIL);
                    }
                }
                LJII(C1B4F.LJIILL, true);
                return;
            }
        }
        LJII(C1B4F.LJIILL, false);
    }

    public final void LJI() {
        this.LIZJ.setClickNextToPublishPage(false);
        InterfaceC1455860nzM interfaceC1455860nzM = this.LJIIIZ ? this.LJFF : this.LJ;
        InterfaceC1453760nvy interfaceC1453760nvy = this.LJII;
        if ((interfaceC1453760nvy == null || !interfaceC1453760nvy.KB2("video_edit_page", "click_back_from_edit", !this.LIZJ.creativeModel.audioCopyrightDetectModel.getContinueSelected(), null, new AwS552S0100000_8(this, 628))) && interfaceC1455860nzM != null) {
            interfaceC1455860nzM.wi0();
            interfaceC1455860nzM.fA1();
        }
    }

    public static final void LJ(C0M7N c0m7n) {
        if (c0m7n.LIZJ.mDraftToEditFrom == 0) {
            c0m7n.LIZIZ(true);
        } else {
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().finishAllCreativeActivity(c0m7n.LJIIL);
        }
    }

    public final void LIZIZ(boolean z) {
        VideoPublishEditModel videoPublishEditModel;
        int i;
        C560380LyO.LIZ.getClass();
        C560380LyO.LJIIIZ("back_to_draft_box", true);
        a.LIZIZ.LIZ(this.LIZJ.getCreationId());
        InterfaceC578380MmK interfaceC578380MmK = this.LIZLLL;
        if (interfaceC578380MmK != null) {
            interfaceC578380MmK.LJJLIIIJJIZ();
        }
        Intent intent = new Intent();
        if (!C0CHQ.LIZ().getAccountService().LIZ() && (i = (videoPublishEditModel = this.LIZJ).mDraftToEditFrom) != 3) {
            if (i != 10 && i != 11 && i != 12) {
                C1660680tJi.LIZ().LIZ(this.LJIIL, intent, z, this.LIZJ.creativeModel.draftInfoModel.isConvertToNormalDraft);
            } else {
                if (Intrinsics.LJFF("draft_again", videoPublishEditModel.mShootWay)) {
                    C0CHQ.LIZ().LJI().LJIJ(true);
                }
                C201955140j.LJIILJJIL(C0MAY.LIZIZ, "do not open draft box ,just close self");
            }
        }
        C1438840nXu c1438840nXu = C1438840nXu.LIZ;
        C1438980nY8 c1438980nY8 = new C1438980nY8(this.LIZ, null);
        c1438840nXu.getClass();
        C1438840nXu.LIZ(c1438980nY8);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(boolean r6) throws java.lang.Throwable {
        /*
            r5 = this;
            X.0LyO r0 = X.C560380LyO.LIZ
            r0.getClass()
            java.lang.String r0 = "back_to_feed"
            r2 = 1
            X.C560380LyO.LJIIIZ(r0, r2)
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            java.lang.String r0 = "com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_DRAFT"
            r4.putExtra(r0, r2)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r5.LIZJ
            java.lang.String r1 = r0.mShootWay
            java.lang.String r0 = "shoot_way"
            r4.putExtra(r0, r1)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r5.LIZJ
            java.lang.String r1 = r0.getCreationId()
            java.lang.String r0 = "creation_id"
            r4.putExtra(r0, r1)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r5.LIZJ
            java.lang.String r1 = r0.mShootWay
            java.lang.String r0 = "camera_shortcut"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto La0
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVServiceProxy> r0 = com.ss.android.ugc.aweme.services.IAVServiceProxy.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.services.IAVServiceProxy r0 = (com.ss.android.ugc.aweme.services.IAVServiceProxy) r0
            r0.getApplicationService()
            X.19GS r1 = r5.LJIIL
            r0 = 0
            X.19EG r0 = X.C19221910Hx.LIZLLL(r1, r0)
            if (r0 != 0) goto La0
            r0 = 268468224(0x10008000, float:2.5342157E-29)
            r4.addFlags(r0)
        L53:
            boolean r0 = X.C298030BmD.LIZ()
            if (r0 == 0) goto L67
            if (r6 == 0) goto L67
            java.lang.String r1 = "com.ss.android.ugc.aweme.intent.extra.EXTRA_SHOW_OPEN_SHARE_DIALOG"
            X.0mbq r0 = r5.LJIILIIL
            r4.putExtra(r1, r0)
            java.lang.String r0 = "sdk_save_draft_success"
            r4.putExtra(r0, r2)
        L67:
            X.19GS r2 = r5.LJIIL
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVServiceProxy> r0 = com.ss.android.ugc.aweme.services.IAVServiceProxy.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.services.IAVServiceProxy r0 = (com.ss.android.ugc.aweme.services.IAVServiceProxy) r0
            r0.getApplicationService()
            java.lang.Class r0 = X.C19221910Hx.LIZJ()
            r4.setClass(r2, r0)
            java.lang.String r0 = "SaveDraft to Feed page"
            X.C201955140j.LIZ(r0)
            X.19GS r3 = r5.LJIIL
            com.bytedance.router.monitor.RouterPageMonitor r0 = com.bytedance.router.monitor.RouterPageMonitor.INSTANCE
            com.bytedance.router.monitor.page.IRouterPageEventDispatcher r1 = r0.getDispatcher()
            java.lang.String r0 = "Context_startActivity_1"
            r1.dispatchActivityOpReached(r3, r4, r0)
            X.C1701330uNH.LIZ(r4, r3)
            X.0WZX r2 = new X.0WZX
            java.lang.String r1 = "dzBzEhEpEcvSUUUuTBbKc9NnF384cWghZ6StZ5ba0yD0GY8VZDzhvw9zM4iGXUv0qvNOinjzq2A="
            r0 = 0
            r2.<init>(r1, r0)
            X.C2204961BRm.LLJJI(r3, r4, r2)
            return
        La0:
            r0 = 335544320(0x14000000, float:6.4623485E-27)
            r4.addFlags(r0)
            goto L53
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0M7N.LIZJ(boolean):void");
    }

    public final void LJII(C1B4F c1b4f, boolean z) {
        C560380LyO.LIZ.getClass();
        C560380LyO.LJIIIZ("return_to_third_party", true);
        C1403010mc7.LIZ.getBridgeService().LJIIJJI(this.LJIIL, this.LIZJ, Boolean.valueOf(z), c1b4f);
    }

    public final void LJIIIZ(final boolean z, String str, final String str2) {
        DraftInfoModel draftInfoModel = this.LIZJ.creativeModel.draftInfoModel;
        draftInfoModel.fromDraftPopup = z;
        draftInfoModel.saveDraftScene = str;
        InterfaceC578380MmK interfaceC578380MmK = this.LIZLLL;
        if (interfaceC578380MmK != null) {
            interfaceC578380MmK.ou(new Runnable() { // from class: X.0LHp
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("EditExitController@7e76.saveDraftAndQuit$1");
                    try {
                        C0M7N c0m7n = this.LL;
                        boolean z2 = z;
                        String str3 = str2;
                        c0m7n.getClass();
                        C0M7N.LIZLLL(c0m7n, "click_save_draft_popup", new AwS16S1110000_8(c0m7n, z2, str3, 0), 1);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("EditExitController@7e76.saveDraftAndQuit$1");
                }
            });
        }
        rlf.a.LIZ.LIZJ(this.LIZJ, "save_draft");
    }

    public final void LJIIL(int i, int i2, Function0<Unit> function0) {
        NLEModel nLEModelLIZ;
        Context contextLIZIZ;
        LiveData<InterfaceC1452170ntP> liveDataG;
        InterfaceC1452170ntP value;
        C570010MXf c570010MXf;
        C570010MXf c570010MXf2 = this.LJIILL;
        if (c570010MXf2 != null && c570010MXf2.LIZJ() && (c570010MXf = this.LJIILL) != null) {
            c570010MXf.LIZIZ();
        }
        this.LJIIJJI.clear();
        ArrayList<C570020MXg> arrayList = this.LJIIJJI;
        int i3 = this.LJIIJ;
        arrayList.add(new C570020MXg(i, i2, i3, i3, new AwS552S0100000_8(function0, (Function0<Unit>) 629), 176));
        VideoPublishEditModel videoPublishEditModel = this.LIZJ;
        InterfaceC1446740nke interfaceC1446740nke = this.LJ;
        C570010MXf c570010MXf3 = null;
        if (interfaceC1446740nke != null && (liveDataG = interfaceC1446740nke.g()) != null && (value = liveDataG.getValue()) != null) {
            nLEModelLIZ = C352130DrH.LIZ(value);
        } else {
            nLEModelLIZ = null;
        }
        if (!C1440390naP.LIZIZ(videoPublishEditModel, nLEModelLIZ)) {
            this.LJIIJJI.add(new C570020MXg(R.raw.icon_draft, 2131829846, R.attr.a1h, R.attr.a1h, new AwS552S0100000_8(this, 630), 176));
        }
        View view = this.LIZIZ;
        if (view != null && (contextLIZIZ = C545820Lau.LIZIZ(this.LIZ)) != null) {
            c570010MXf3 = new C570010MXf(contextLIZIZ, view, this.LJIIJJI, this.LJIILJJIL, R.attr.a1d, R.attr.a02, 0.4f);
        }
        this.LJIILL = c570010MXf3;
        if (c570010MXf3 != null) {
            c570010MXf3.LIZLLL();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILL(java.lang.String r6, java.lang.String r7, X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C0LDB
            if (r0 == 0) goto L70
            r4 = r8
            X.0LDB r4 = (X.C0LDB) r4
            int r2 = r4.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L70
            int r2 = r2 - r1
            r4.LLILZIL = r2
        L12:
            java.lang.Object r3 = r4.LLILLL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILZIL
            r1 = 1
            if (r0 == 0) goto L50
            if (r0 != r1) goto L76
            com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager r0 = r4.LLILLJJLI
            java.lang.Object r7 = r4.LL
            java.lang.String r7 = (java.lang.String) r7
            X.C155000ia.LIZIZ(r3)
        L28:
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L7e
            java.util.Iterator r4 = r3.iterator()
        L30:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L7e
            java.lang.Object r3 = r4.next()
            X.0LSZ r3 = (X.C0LSZ) r3
            com.ss.android.ugc.aweme.aigc.asynctask.Source r2 = r3.LJIIL
            com.ss.android.ugc.aweme.aigc.asynctask.Source r1 = com.ss.android.ugc.aweme.aigc.asynctask.Source.EDITOR_PRO_AIGC_T2I
            if (r2 == r1) goto L4a
            com.ss.android.ugc.aweme.aigc.asynctask.Source r1 = com.ss.android.ugc.aweme.aigc.asynctask.Source.EDITOR_PRO_AIGC_T2V
            if (r2 == r1) goto L4a
            com.ss.android.ugc.aweme.aigc.asynctask.Source r1 = com.ss.android.ugc.aweme.aigc.asynctask.Source.EDITOR_PRO
            if (r2 != r1) goto L30
        L4a:
            java.lang.String r1 = r3.LIZ
            r0.LJIILLIIL(r1, r7)
            goto L30
        L50:
            X.C155000ia.LIZIZ(r3)
            if (r6 != 0) goto L58
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L58:
            if (r7 != 0) goto L5d
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L5d:
            com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager r0 = X.C09BV.LIZ()
            if (r0 == 0) goto L7e
            r4.LL = r7
            r4.LLILLJJLI = r0
            r4.LLILZIL = r1
            java.lang.Object r3 = r0.LJJIJLIJ(r6, r4)
            if (r3 != r2) goto L28
            return r2
        L70:
            X.0LDB r4 = new X.0LDB
            r4.<init>(r5, r8)
            goto L12
        L76:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L7e:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0M7N.LJIILL(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    public static void LIZLLL(C0M7N c0m7n, String str, final Function0 function0, int i) {
        String str2;
        if ((i & 1) != 0) {
            str2 = "video_edit_page";
        } else {
            str2 = null;
        }
        if ((i & 2) != 0) {
            str = "click_save_draft_popup";
        }
        c0m7n.getClass();
        if (!C0CHQ.LIZ().getAccountService().isLogin()) {
            C1655820tBs.LIZ(c0m7n.LJIIL, str2, str, new InterfaceC1655960tC6() { // from class: X.0M7P
                @Override // X.InterfaceC1655960tC6
                public final void LIZ() {
                }

                @Override // X.InterfaceC1655960tC6
                public final void onSuccess() {
                    function0.invoke();
                }
            });
        } else {
            function0.invoke();
        }
    }

    public final void LJIIJ(String str, Function1 function1, Function1 function12, Function0 function0) {
        String creationId = this.LIZJ.getCreationId();
        String strLIZ = C0DMI.LIZ();
        C0CNO.LIZLLL(0L, new AwS157S1100000_8(strLIZ, function1, 4));
        this.LIZJ.creativeModel.draftInfoModel.saveDraftScene = str;
        InterfaceC578380MmK interfaceC578380MmK = this.LIZLLL;
        if (interfaceC578380MmK != null) {
            interfaceC578380MmK.ou(new ARunnableS1S3300000_8(this, str, strLIZ, creationId, function0, function12, 0));
        }
    }

    public final void LJIILIIL(int i, int i2, Function0<Unit> function0, Function0<Unit> function02) {
        NLEModel nLEModelLIZ;
        Context contextLIZIZ;
        LiveData<InterfaceC1452170ntP> liveDataG;
        InterfaceC1452170ntP value;
        C570010MXf c570010MXf;
        C570010MXf c570010MXf2 = this.LJIILL;
        if (c570010MXf2 != null && c570010MXf2.LIZJ() && (c570010MXf = this.LJIILL) != null) {
            c570010MXf.LIZIZ();
        }
        this.LJIIJJI.clear();
        ArrayList<C570020MXg> arrayList = this.LJIIJJI;
        int i3 = this.LJIIJ;
        arrayList.add(new C570020MXg(i, i2, i3, i3, new AwS552S0100000_8(function0, (Function0<Unit>) 631), 176));
        VideoPublishEditModel videoPublishEditModel = this.LIZJ;
        InterfaceC1446740nke interfaceC1446740nke = this.LJ;
        C570010MXf c570010MXf3 = null;
        if (interfaceC1446740nke != null && (liveDataG = interfaceC1446740nke.g()) != null && (value = liveDataG.getValue()) != null) {
            nLEModelLIZ = C352130DrH.LIZ(value);
        } else {
            nLEModelLIZ = null;
        }
        if (!C1440390naP.LIZIZ(videoPublishEditModel, nLEModelLIZ)) {
            this.LJIIJJI.add(new C570020MXg(R.raw.icon_draft, 2131829846, 0, 0, new AwS552S0100000_8(function02, (Function0<Unit>) 632), 188));
        }
        if (C545820Lau.LIZIZ(this.LIZ) != null) {
            View view = this.LIZIZ;
            if (view != null && (contextLIZIZ = C545820Lau.LIZIZ(this.LIZ)) != null) {
                c570010MXf3 = new C570010MXf(contextLIZIZ, view, this.LJIIJJI, this.LJIILJJIL, 112);
            }
            this.LJIILL = c570010MXf3;
        }
        C570010MXf c570010MXf4 = this.LJIILL;
        if (c570010MXf4 != null) {
            c570010MXf4.LIZLLL();
        }
    }

    public final void LJIIIIZZ(final String str, final int i, final Function0<Unit> function0, final Function0<Unit> function02, final Function0<Unit> function03) {
        this.LIZJ.creativeModel.draftInfoModel.saveDraftScene = str;
        InterfaceC578380MmK interfaceC578380MmK = this.LIZLLL;
        if (interfaceC578380MmK != null) {
            interfaceC578380MmK.ou(new Runnable() { // from class: X.0LHq
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("EditExitController@7e76.saveDraft$1");
                    try {
                        C0M7N c0m7n = this.LL;
                        C0M7N.LIZLLL(c0m7n, null, new AwS8S1401000_8(c0m7n, (C0M7N) str, (String) i, (int) function0, function02, function03, (Function0<Unit>) 0), 3);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("EditExitController@7e76.saveDraft$1");
                }
            });
        }
    }

    public final void LJIIJJI(final String str, final boolean z, final String str2, final Function0<Unit> function0, final Function0<Unit> function02) {
        InterfaceC578380MmK interfaceC578380MmK = this.LIZLLL;
        if (interfaceC578380MmK != null) {
            interfaceC578380MmK.ou(new Runnable() { // from class: X.0LIT
                public final void LIZ() {
                    C0M7N c0m7n = this.LL;
                    String str3 = str;
                    boolean z2 = z;
                    String str4 = str2;
                    Function0<Unit> function03 = function0;
                    Function0<Unit> function04 = function02;
                    c0m7n.getClass();
                    final C540520LHu c540520LHu = new C540520LHu(c0m7n, str4, str3, function04, function03, z2);
                    final AwS552S0100000_8 awS552S0100000_8 = new AwS552S0100000_8(function04, (Function0<Unit>) 635);
                    if (C0CHQ.LIZ().getAccountService().isLogin()) {
                        c540520LHu.invoke();
                    } else {
                        C1655820tBs.LIZ(c0m7n.LJIIL, str3, "click_save_draft_popup", new InterfaceC1655960tC6() { // from class: X.0LIU
                            @Override // X.InterfaceC1655960tC6
                            public final void LIZ() {
                                awS552S0100000_8.invoke();
                            }

                            @Override // X.InterfaceC1655960tC6
                            public final void onSuccess() {
                                c540520LHu.invoke();
                            }
                        });
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("EditExitController@7e76.saveDraftWithNewCreationIdAndQuit$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("EditExitController@7e76.saveDraftWithNewCreationIdAndQuit$1");
                }
            });
        }
        rlf.a.LIZ.LIZJ(this.LIZJ, "save_draft");
    }

    public final void LJIILJJIL(int i, int i2, Function0 function0, Function0 function02, boolean z) {
        C570010MXf c570010MXf;
        Context contextLIZIZ;
        C570010MXf c570010MXf2;
        C570010MXf c570010MXf3 = this.LJIILL;
        if (c570010MXf3 != null && c570010MXf3.LIZJ() && (c570010MXf2 = this.LJIILL) != null) {
            c570010MXf2.LIZIZ();
        }
        this.LJIIJJI.clear();
        ArrayList<C570020MXg> arrayList = this.LJIIJJI;
        int i3 = this.LJIIJ;
        arrayList.add(new C570020MXg(R.raw.icon_x_mark_circle, 2131829834, i3, i3, new AwS552S0100000_8(function02, (Function0<Unit>) 625), 176));
        this.LJIIJJI.add(new C570020MXg(i2, i, 0, 0, new AwS91S0210000_8(z, (boolean) function0, (Function0<Unit>) this, (C0M7N) 3), 188));
        View view = this.LIZIZ;
        if (view != null && (contextLIZIZ = C545820Lau.LIZIZ(this.LIZ)) != null) {
            c570010MXf = new C570010MXf(contextLIZIZ, view, this.LJIIJJI, this.LJIILJJIL, 112);
        } else {
            c570010MXf = null;
        }
        this.LJIILL = c570010MXf;
        if (c570010MXf != null) {
            c570010MXf.LIZLLL();
        }
    }

    /* JADX WARN: Type inference failed for: r13v0, types: [X.0LHw, X.0MXh] */
    public C0M7N(AbstractC214814194y abstractC214814194y, VideoPublishEditModel videoPublishEditModel, InterfaceC578380MmK interfaceC578380MmK, InterfaceC1446740nke interfaceC1446740nke, InterfaceC1451050nrb interfaceC1451050nrb, InterfaceC1455010nxz interfaceC1455010nxz, InterfaceC1453760nvy interfaceC1453760nvy, C0E48 c0e48, boolean z, int i) {
        Context sceneContext;
        InterfaceC1446740nke interfaceC1446740nke2 = interfaceC1446740nke;
        InterfaceC1455010nxz interfaceC1455010nxz2 = interfaceC1455010nxz;
        InterfaceC1451050nrb interfaceC1451050nrb2 = interfaceC1451050nrb;
        C0E48 c0e482 = c0e48;
        InterfaceC1453760nvy interfaceC1453760nvy2 = interfaceC1453760nvy;
        boolean z2 = z;
        C570010MXf c570010MXf = null;
        InterfaceC578380MmK interfaceC578380MmK2 = (i & 8) != 0 ? null : interfaceC578380MmK;
        interfaceC1446740nke2 = (i & 16) != 0 ? null : interfaceC1446740nke2;
        interfaceC1451050nrb2 = (i & 32) != 0 ? null : interfaceC1451050nrb2;
        interfaceC1455010nxz2 = (i & 64) != 0 ? null : interfaceC1455010nxz2;
        interfaceC1453760nvy2 = (i & 128) != 0 ? null : interfaceC1453760nvy2;
        c0e482 = (i & 256) != 0 ? null : c0e482;
        z2 = (i & 512) != 0 ? false : z2;
        this.LIZ = abstractC214814194y;
        this.LIZIZ = null;
        this.LIZJ = videoPublishEditModel;
        this.LIZLLL = interfaceC578380MmK2;
        this.LJ = interfaceC1446740nke2;
        this.LJFF = interfaceC1451050nrb2;
        this.LJI = interfaceC1455010nxz2;
        this.LJII = interfaceC1453760nvy2;
        this.LJIIIIZZ = c0e482;
        this.LJIIIZ = z2;
        this.LJIIJ = R.attr.a1m;
        ArrayList<C570020MXg> arrayList = new ArrayList<>();
        this.LJIIJJI = arrayList;
        this.LJIIL = abstractC214814194y.requireAppCompatActivity();
        ?? r13 = new InterfaceC570030MXh() { // from class: X.0LHw
            @Override // X.InterfaceC570030MXh
            public final void onCancel() {
                C1402930mbz.LJI(this.LIZ.LIZJ, "video_edit_page", "cancel");
            }

            @Override // X.InterfaceC570030MXh
            public final void onShow() {
                C1402930mbz.LJII(this.LIZ.LIZJ, "");
            }

            @Override // X.InterfaceC570030MXh
            public final void LIZ(int i2) {
                C1402930mbz.LJI(this.LIZ.LIZJ, "video_edit_page", C1402930mbz.LIZJ(i2));
            }
        };
        this.LJIILJJIL = r13;
        View view = this.LIZIZ;
        if (view != null && (sceneContext = abstractC214814194y.getSceneContext()) != null) {
            c570010MXf = new C570010MXf(sceneContext, view, arrayList, r13, 112);
        }
        this.LJIILL = c570010MXf;
    }
}
