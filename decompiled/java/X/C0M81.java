package X;

import Y.ARunnableS108S0100000_8;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.IEditorShareHelper;
import com.ss.android.ugc.aweme.aime.IAIMEServices;
import com.ss.android.ugc.aweme.creative.model.draft.DraftInfoModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.sharepanel.api.util.IDMSendToFriendMenuActionHelper;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS126S0110000_8;
import kotlin.jvm.internal.AwS409S0200000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS7S0211000_8;
import kotlin.jvm.internal.AwS91S0210000_8;
import l5a.a;

/* JADX INFO: renamed from: X.0M81, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M81 {
    public final AbstractC214814194y LIZ;
    public View LIZIZ;
    public final VideoPublishEditModel LIZJ;
    public final InterfaceC578380MmK LIZLLL;
    public final InterfaceC1446740nke LJ;
    public final InterfaceC559500Lwy LJFF;
    public final ArrayList<C443090HZb> LJI;
    public final ArrayList<String> LJII;
    public final C19GS LJIIIIZZ;
    public final C0M82 LJIIIZ;
    public boolean LJIIJ;
    public final C0M83 LJIIJJI;
    public C0P0T LJIIL;

    public final void LIZLLL() {
        LJI(false, true, true, "clickPopupFromEdit", new AwS126S0110000_8(this, 4), new AwS552S0100000_8(this, 626));
    }

    public final void LIZ() throws Throwable {
        VideoPublishEditModel videoPublishEditModel = this.LIZJ;
        int i = videoPublishEditModel.mDraftToEditFrom;
        if (i == 7 || i == 8) {
            LIZIZ();
            return;
        }
        if (videoPublishEditModel.creativeModel.draftInfoModel.isDraft && !videoPublishEditModel.isFromCrash()) {
            if (this.LIZJ.isPostDraftPrompt()) {
                ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().finishAllCreativeActivity(this.LJIIIIZZ);
                return;
            } else {
                LJ();
                return;
            }
        }
        if (u4.LJJJI(this.LIZJ)) {
            C1B4F c1b4f = C1B4F.LJIILLIIL;
            C560380LyO.LIZ.getClass();
            C560380LyO.LJIIIZ("return_to_third_party_app", true);
            C1403010mc7.LIZ.getBridgeService().LJIIIZ(this.LJIIIIZZ, this.LIZJ, c1b4f);
            return;
        }
        if (C123100dR.LIZ(this.LIZJ.creativeModel.initialModel.highLightVideoParametersModel.fragmentId)) {
            Intent intent = new Intent();
            C19GS c19gs = this.LJIIIIZZ;
            ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getApplicationService();
            intent.setClass(c19gs, C19221910Hx.LIZJ());
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().changeIntentToHighlightIfNeed(this.LJIIIIZZ, intent, this.LIZJ);
            intent.addFlags(603979776);
            C19GS c19gs2 = this.LJIIIIZZ;
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(c19gs2, intent, "Context_startActivity_1");
            C1701330uNH.LIZ(intent, c19gs2);
            C2204961BRm.LLJJI(c19gs2, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF384cWghZ6StZ5ba0yD0GY8VZDzxtQ9zE5SqTWHvRIRppHAcXC4x25lRL5I=", null));
            return;
        }
        if (C564030MAf.LIZ(this.LIZJ.creativeModel.postLandingModel)) {
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().finishAllCreativeActivity(this.LJIIIIZZ);
            return;
        }
        if (!this.LIZJ.creativeModel.aiSelfModel.isUltraFastModelCreation) {
            LIZIZ();
            return;
        }
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
            C19GS c19gs3 = this.LJIIIIZZ;
            String str = this.LIZJ.mShootWay;
            if (!C123100dR.LIZ(str) || str == null) {
                str = "other_aime";
            }
            iAIMEServices.LJFF(c19gs3, "video_edit_page", str, null);
        }
        C1438840nXu c1438840nXu = C1438840nXu.LIZ;
        C1438980nY8 c1438980nY8 = new C1438980nY8(this.LIZ, null);
        c1438840nXu.getClass();
        C1438840nXu.LIZ(c1438980nY8);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() throws java.lang.Throwable {
        /*
            r5 = this;
            X.0LyO r0 = X.C560380LyO.LIZ
            r0.getClass()
            java.lang.String r0 = "back_to_feed"
            r1 = 1
            X.C560380LyO.LJIIIZ(r0, r1)
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            java.lang.String r0 = "com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_DRAFT"
            r4.putExtra(r0, r1)
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
            if (r0 == 0) goto L8c
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVServiceProxy> r0 = com.ss.android.ugc.aweme.services.IAVServiceProxy.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.services.IAVServiceProxy r0 = (com.ss.android.ugc.aweme.services.IAVServiceProxy) r0
            r0.getApplicationService()
            X.19GS r1 = r5.LJIIIIZZ
            r0 = 0
            X.19EG r0 = X.C19221910Hx.LIZLLL(r1, r0)
            if (r0 != 0) goto L8c
            r0 = 268468224(0x10008000, float:2.5342157E-29)
            r4.addFlags(r0)
        L53:
            X.19GS r2 = r5.LJIIIIZZ
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVServiceProxy> r0 = com.ss.android.ugc.aweme.services.IAVServiceProxy.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.services.IAVServiceProxy r0 = (com.ss.android.ugc.aweme.services.IAVServiceProxy) r0
            r0.getApplicationService()
            java.lang.Class r0 = X.C19221910Hx.LIZJ()
            r4.setClass(r2, r0)
            java.lang.String r0 = "SaveDraft to Feed page"
            X.C201955140j.LIZ(r0)
            X.19GS r3 = r5.LJIIIIZZ
            com.bytedance.router.monitor.RouterPageMonitor r0 = com.bytedance.router.monitor.RouterPageMonitor.INSTANCE
            com.bytedance.router.monitor.page.IRouterPageEventDispatcher r1 = r0.getDispatcher()
            java.lang.String r0 = "Context_startActivity_1"
            r1.dispatchActivityOpReached(r3, r4, r0)
            X.C1701330uNH.LIZ(r4, r3)
            X.0WZX r2 = new X.0WZX
            java.lang.String r1 = "dzBzEhEpEcvSUUUuTBbKc9NnF384cWghZ6StZ5ba0yD0GY8VZDzxtQ9zE5SqTWHvRIRppHAcXC4x25lRL5I="
            r0 = 0
            r2.<init>(r1, r0)
            X.C2204961BRm.LLJJI(r3, r4, r2)
            return
        L8c:
            r0 = 335544320(0x14000000, float:6.4623485E-27)
            r4.addFlags(r0)
            goto L53
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0M81.LIZIZ():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ() {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0M81.LJ():void");
    }

    public final void LJII() {
        AbstractC214814194y abstractC214814194y = this.LIZ;
        if (abstractC214814194y instanceof VideoEditContainerScene) {
            ((VideoEditContainerScene) abstractC214814194y).LLLILZLLLI.LLLLILI(new Runnable() { // from class: X.0M84
                @Override // java.lang.Runnable
                public final void run() {
                    C1C7U.LIZ("UnitedEditExitController@e758.shareToDM$1");
                    C1C7U.LIZIZ("UnitedEditExitController@e758.shareToDM$1");
                }
            }, new ARunnableS108S0100000_8(this, 80));
            return;
        }
        IEditorShareHelper.LIZ.getClass();
        IEditorShareHelper value = C0M87.LIZIZ.getValue();
        if (value != null) {
            value.LIZ(this.LIZJ, this.LJIIIIZZ, this.LJ, AFwS239S0000000_8.get$arr$(199));
        }
    }

    public final void LJIIL() {
        int i = C365940EWi.LIZJ(this.LIZJ) ? 2131834074 : 2131846552;
        C19GS c19gs = this.LJIIIIZZ;
        if (c19gs != null) {
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(i);
            creativeToastBuilder.acrossActivities(true);
            C1390380mHk.LIZ(c19gs, 1007, creativeToastBuilder);
        }
    }

    public final void LJFF(int i, boolean z) {
        this.LJIIJ = false;
        C1402930mbz.LJFF(this.LIZJ, C1402930mbz.LIZJ(i), z);
    }

    public final void LJIIIZ(Function0 function0, Function0 function02, boolean z) {
        String string;
        String string2;
        Context contextLIZIZ;
        C0P0T c0p0t;
        C0P0T c0p0t2 = this.LJIIL;
        if (c0p0t2 != null && c0p0t2.isShowing() && (c0p0t = this.LJIIL) != null) {
            c0p0t.dismiss();
        }
        this.LJI.clear();
        this.LJII.clear();
        if (C568750MSj.LIZIZ(this.LIZJ)) {
            string = this.LJIIIIZZ.getString(2131846549);
        } else {
            string = this.LJIIIIZZ.getString(2131846554);
        }
        this.LJI.add(new C443090HZb(string, new AwS409S0200000_8(this, (C0M81) function0, (Function0<Unit>) 89), R.raw.icon_trash_bin, null, 0, null, 1, false, false, null, 952));
        this.LJII.add(C1402930mbz.LIZJ(2131846554));
        if (C568750MSj.LIZIZ(this.LIZJ)) {
            string2 = this.LJIIIIZZ.getString(2131846551);
        } else {
            string2 = this.LJIIIIZZ.getString(2131846553);
        }
        this.LJI.add(new C443090HZb(string2, new AwS91S0210000_8(this, function02, 7), R.raw.icon_draft, null, 0, null, 0, false, false, null, 1016));
        this.LJII.add(C1402930mbz.LIZJ(2131846553));
        Context contextLIZIZ2 = C545820Lau.LIZIZ(this.LIZ);
        C0P0T c0p0tLIZIZ = null;
        if (contextLIZIZ2 != null) {
            IDMSendToFriendMenuActionHelper.LIZ.getClass();
            IDMSendToFriendMenuActionHelper iDMSendToFriendMenuActionHelperLIZ = C380260EvY.LIZ();
            if (iDMSendToFriendMenuActionHelperLIZ != null && iDMSendToFriendMenuActionHelperLIZ.LIZIZ() && z) {
                this.LJI.add(iDMSendToFriendMenuActionHelperLIZ.LIZ(contextLIZIZ2, new AwS552S0100000_8(this, 636)));
                this.LJII.add(C1402930mbz.LIZJ(2131831535));
            }
        }
        View view = this.LIZIZ;
        if (view != null && (contextLIZIZ = C545820Lau.LIZIZ(this.LIZ)) != null) {
            C0HWQ c0hwq = new C0HWQ(contextLIZIZ);
            c0hwq.LJIIL(Collections.singletonList(this.LJI));
            c0hwq.LLJ = true;
            C1391600mJi c1391600mJi = c0hwq.LLILLJJLI;
            c1391600mJi.LIZIZ = view;
            c1391600mJi.LJIJJ = true;
            c1391600mJi.LJIIL = false;
            c1391600mJi.LIZLLL = EnumC1235690iGF.BOTTOM;
            c1391600mJi.LJJIFFI = this.LJIIIZ;
            c1391600mJi.LJJI = this.LJIIJJI;
            c0p0tLIZIZ = c0hwq.LIZIZ();
        }
        this.LJIIL = c0p0tLIZIZ;
        if (c0p0tLIZIZ != null) {
            c0p0tLIZIZ.show();
        }
    }

    public static void LIZJ(C0M81 c0m81, String str, final Function0 function0, int i) {
        String str2;
        if ((i & 1) != 0) {
            str2 = "video_edit_page";
        } else {
            str2 = null;
        }
        if ((i & 2) != 0) {
            str = "click_save_draft_popup";
        }
        c0m81.getClass();
        if (!C0CHQ.LIZ().getAccountService().isLogin()) {
            C1655820tBs.LIZ(c0m81.LJIIIIZZ, str2, str, new InterfaceC1655960tC6() { // from class: X.0M85
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

    public final void LJIIIIZZ(Function0 function0, Function0 function02, boolean z, boolean z2) {
        C0P0T c0p0tLIZIZ;
        Context contextLIZIZ;
        C0P0T c0p0t;
        C0P0T c0p0t2 = this.LJIIL;
        if (c0p0t2 != null && c0p0t2.isShowing() && (c0p0t = this.LJIIL) != null) {
            c0p0t.dismiss();
        }
        this.LJI.clear();
        this.LJII.clear();
        this.LJI.add(new C443090HZb(this.LJIIIIZZ.getString(2131846549), new AwS7S0211000_8(this, z, function0, 1), R.raw.icon_trash_bin, null, 0, null, 1, false, false, null, 952));
        this.LJII.add(C1402930mbz.LIZJ(2131846549));
        if (z2) {
            this.LJI.add(new C443090HZb(this.LJIIIIZZ.getString(2131846551), new AwS91S0210000_8(this, (C0M81) z, (boolean) function02, (Function0<Unit>) 4), R.raw.icon_draft, null, 0, null, 0, false, false, null, 1016));
            this.LJII.add(C1402930mbz.LIZJ(2131846551));
        }
        View view = this.LIZIZ;
        if (view != null && (contextLIZIZ = C545820Lau.LIZIZ(this.LIZ)) != null) {
            C0HWQ c0hwq = new C0HWQ(contextLIZIZ);
            c0hwq.LJIIL(Collections.singletonList(this.LJI));
            c0hwq.LLJ = true;
            C1391600mJi c1391600mJi = c0hwq.LLILLJJLI;
            c1391600mJi.LIZIZ = view;
            c1391600mJi.LJIJJ = true;
            c1391600mJi.LJIIL = false;
            c1391600mJi.LIZLLL = EnumC1235690iGF.BOTTOM;
            c1391600mJi.LJJIFFI = this.LJIIIZ;
            c1391600mJi.LJJI = this.LJIIJJI;
            c0p0tLIZIZ = c0hwq.LIZIZ();
        } else {
            c0p0tLIZIZ = null;
        }
        this.LJIIL = c0p0tLIZIZ;
        if (c0p0tLIZIZ != null) {
            c0p0tLIZIZ.show();
        }
    }

    public final void LJIIJ(int i, Function0 function0, Function0 function02, boolean z, boolean z2) {
        LJIIJJI(true, z, i, function0, function02, z2);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0M82] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.0M83] */
    public C0M81(AbstractC214814194y abstractC214814194y, VideoPublishEditModel videoPublishEditModel, InterfaceC578380MmK interfaceC578380MmK, InterfaceC1446740nke interfaceC1446740nke, InterfaceC559500Lwy interfaceC559500Lwy, int i) {
        interfaceC578380MmK = (i & 8) != 0 ? null : interfaceC578380MmK;
        interfaceC1446740nke = (i & 16) != 0 ? null : interfaceC1446740nke;
        interfaceC559500Lwy = (i & 32) != 0 ? null : interfaceC559500Lwy;
        this.LIZ = abstractC214814194y;
        this.LIZIZ = null;
        this.LIZJ = videoPublishEditModel;
        this.LIZLLL = interfaceC578380MmK;
        this.LJ = interfaceC1446740nke;
        this.LJFF = interfaceC559500Lwy;
        this.LJI = new ArrayList<>();
        this.LJII = new ArrayList<>();
        this.LJIIIIZZ = abstractC214814194y.requireAppCompatActivity();
        this.LJIIIZ = new InterfaceC1391650mJn() { // from class: X.0M82
            @Override // X.InterfaceC1391650mJn
            public final void onShow() {
                C0M81 c0m81 = this.LIZ;
                C1402930mbz.LJIIIIZZ(c0m81.LIZJ, "video_edit_page", c0m81.LJII);
            }
        };
        this.LJIIJ = true;
        this.LJIIJJI = new InterfaceC1340660kzY() { // from class: X.0M83
            @Override // X.InterfaceC1340660kzY
            public final void LIZ(AbstractC1391670mJp abstractC1391670mJp) {
                C0M81 c0m81 = this.LIZ;
                if (c0m81.LJIIJ) {
                    C1402930mbz.LJFF(c0m81.LIZJ, "cancel", true);
                }
                this.LIZ.LJIIJ = true;
            }
        };
    }

    public final void LJI(final boolean z, final boolean z2, boolean z3, String str, final Function0<Unit> function0, final Function0<Unit> function02) {
        InterfaceC559500Lwy interfaceC559500Lwy;
        if (C301780BsG.LIZ() && (interfaceC559500Lwy = this.LJFF) != null) {
            interfaceC559500Lwy.Rm2();
        }
        if (!z) {
            DraftInfoModel draftInfoModel = this.LIZJ.creativeModel.draftInfoModel;
            draftInfoModel.fromDraftPopup = z3;
            draftInfoModel.saveDraftScene = str;
        }
        InterfaceC578380MmK interfaceC578380MmK = this.LIZLLL;
        if (interfaceC578380MmK != null) {
            interfaceC578380MmK.ou(new Runnable() { // from class: X.0LHt
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("UnitedEditExitController@e758.saveDraftAndQuit$1");
                    try {
                        C0M81 c0m81 = this.LL;
                        boolean z4 = z;
                        boolean z5 = z2;
                        Function0<Unit> function03 = function0;
                        Function0<Unit> function04 = function02;
                        c0m81.getClass();
                        C0M81.LIZJ(c0m81, "click_save_draft_popup", new C540490LHr(c0m81, function03, function04, z4, z5), 1);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("UnitedEditExitController@e758.saveDraftAndQuit$1");
                }
            });
        }
        rlf.a.LIZ.LIZJ(this.LIZJ, "save_draft");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(boolean r18, boolean r19, int r20, kotlin.jvm.functions.Function0 r21, kotlin.jvm.functions.Function0 r22, boolean r23) {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0M81.LJIIJJI(boolean, boolean, int, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean):void");
    }
}
