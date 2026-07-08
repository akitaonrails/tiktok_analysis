package X;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.Window;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.ss.android.ugc.aweme.commerce.tools.sticker.service.ICommerceToolsStickerService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.sharepanel.api.util.IDMSendToFriendMenuActionHelper;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.recordcontrol.e0;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS147S0201000_25;
import kotlin.jvm.internal.AwS170S0101000_33;
import kotlin.jvm.internal.AwS174S1100000_25;
import kotlin.jvm.internal.AwS399S0200000_33;
import kotlin.jvm.internal.AwS426S0200000_25;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.AwS612S0100000_33;

/* JADX INFO: renamed from: X.1A3p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2173271A3p implements InterfaceC1655780tBo {
    public final C19A3 LIZ;
    public final C19EG LIZIZ;
    public final ShortVideoContext LIZJ;
    public final InterfaceC1648570t0B LIZLLL;
    public final InterfaceC2173351A3x LJ;
    public C570010MXf LJFF;
    public C0P0T LJI;
    public final ArrayList<String> LJII = new ArrayList<>();
    public final C1402960mc2 LJIIIIZZ = new InterfaceC570030MXh() { // from class: X.0mc2
        @Override // X.InterfaceC570030MXh
        public final void onCancel() {
            C1402940mc0.LIZJ(this.LIZ.LIZJ, "cancel");
        }

        @Override // X.InterfaceC570030MXh
        public final void onShow() {
            C1402940mc0.LJ(this.LIZ.LIZJ);
        }

        @Override // X.InterfaceC570030MXh
        public final void LIZ(int i) {
            C201955140j.LIZ("RecordExitController -> click tooltips item");
            C1402940mc0.LIZJ(this.LIZ.LIZJ, C1402930mbz.LIZJ(i));
        }
    };
    public final C1402950mc1 LJIIIZ = new InterfaceC1391650mJn() { // from class: X.0mc1
        @Override // X.InterfaceC1391650mJn
        public final void onShow() {
            C201955140j.LIZ("RecordExitController -> showListener new ");
            if (!C301590Brx.LIZ()) {
                C1402940mc0.LJ(this.LIZ.LIZJ);
                return;
            }
            C2173271A3p c2173271A3p = this.LIZ;
            ShortVideoContext shortVideoContext = c2173271A3p.LIZJ;
            ArrayList<String> arrayList = c2173271A3p.LJII;
            C0LAB c0labLIZ = C1402940mc0.LIZ(shortVideoContext);
            c0labLIZ.LJ("enter_method_popup", C1402940mc0.LIZIZ(shortVideoContext));
            c0labLIZ.LIZ(shortVideoContext.creativeModel.draftInfoModel.isDraft ? 1 : 0, "is_draft");
            c0labLIZ.LJ("shoot_tab_name", shortVideoContext.LJIJJLI());
            c0labLIZ.LIZ(0, "is_from_external");
            if (!arrayList.isEmpty()) {
                c0labLIZ.LJ("options", C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62));
            }
            C20684815ws.LJIILLIIL("show_exit_shoot_popup", c0labLIZ.LIZ);
        }
    };
    public boolean LJIIJ = true;
    public final C2173291A3r LJIIJJI = new InterfaceC1340660kzY() { // from class: X.1A3r
        @Override // X.InterfaceC1340660kzY
        public final void LIZ(AbstractC1391670mJp abstractC1391670mJp) {
            C201955140j.LIZ("RecordExitController -> dismissListener new ");
            if (this.LIZ.LJIIJ) {
                if (C301590Brx.LIZ()) {
                    C1402940mc0.LIZLLL("cancel", this.LIZ.LIZJ, true);
                } else {
                    C1402940mc0.LIZJ(this.LIZ.LIZJ, "cancel");
                }
            }
            this.LIZ.LJIIJ = true;
        }
    };

    @Override // X.InterfaceC1655780tBo
    public final void LIZ() {
        this.LIZLLL.xP1(true, false, true);
    }

    @Override // X.InterfaceC1655780tBo
    public final void LIZLLL() {
        if (C267550Ae9.LIZ()) {
            C0P0T c0p0t = this.LJI;
            if (c0p0t != null) {
                c0p0t.dismiss();
                return;
            }
            return;
        }
        C570010MXf c570010MXf = this.LJFF;
        if (c570010MXf != null) {
            c570010MXf.LIZIZ();
        }
    }

    @Override // X.InterfaceC1655780tBo
    public final void LJII() {
        ((ICommerceToolsStickerService) ServiceManager.get().getService(ICommerceToolsStickerService.class)).LJ(this.LIZJ);
        C560380LyO c560380LyO = C560380LyO.LIZ;
        AbstractC214814194y abstractC214814194yLIZ = C372650EjH.LIZ(this.LIZ);
        boolean zIsLastScene = abstractC214814194yLIZ != null ? abstractC214814194yLIZ.isLastScene() : false;
        c560380LyO.getClass();
        C560380LyO.LJII("close_video_shoot_page", zIsLastScene, true);
        this.LIZLLL.cV0(true);
    }

    @Override // X.InterfaceC1655780tBo
    public final void LJIIIIZZ() {
        ((ICommerceToolsStickerService) ServiceManager.get().getService(ICommerceToolsStickerService.class)).LJ(this.LIZJ);
        C560380LyO c560380LyO = C560380LyO.LIZ;
        AbstractC214814194y abstractC214814194yLIZ = C372650EjH.LIZ(this.LIZ);
        boolean zIsLastScene = abstractC214814194yLIZ != null ? abstractC214814194yLIZ.isLastScene() : false;
        c560380LyO.getClass();
        C560380LyO.LJII("save_draft", zIsLastScene, true);
        this.LIZLLL.rW0();
    }

    @Override // X.InterfaceC1655780tBo
    public final void closeRecording() {
        ((ICommerceToolsStickerService) ServiceManager.get().getService(ICommerceToolsStickerService.class)).LJ(this.LIZJ);
        C560380LyO c560380LyO = C560380LyO.LIZ;
        AbstractC214814194y abstractC214814194yLIZ = C372650EjH.LIZ(this.LIZ);
        boolean zIsLastScene = abstractC214814194yLIZ != null ? abstractC214814194yLIZ.isLastScene() : false;
        c560380LyO.getClass();
        C560380LyO.LJII("close_video_shoot_page", zIsLastScene, false);
        this.LIZLLL.cV0(false);
    }

    @Override // X.InterfaceC1655780tBo
    public final void LJFF(boolean z) {
        C570010MXf c570010MXf;
        if (!C267550Ae9.LIZ() && (c570010MXf = this.LJFF) != null) {
            c570010MXf.LJIIJ = !z;
        }
    }

    @Override // X.InterfaceC1655780tBo
    public final void LJI(AwS174S1100000_25 awS174S1100000_25) {
        Window window;
        C21566919al c21566919al = new C21566919al(this.LIZIZ);
        c21566919al.LIZ(R.string.rrb);
        c21566919al.LJII(R.string.f1_, null, false);
        c21566919al.LJIIJ(R.string.jz7, new DialogInterfaceOnClickListenerC2189611Aml(awS174S1100000_25, 17), false);
        Dialog dialogLJ = new C21566519ah(c21566919al).LJ();
        if (!C2077408Bw.LIZIZ(this.LIZIZ) && dialogLJ != null && (window = dialogLJ.getWindow()) != null) {
            window.setFlags(1024, 1024);
            window.getDecorView().setSystemUiVisibility(4102);
        }
        C786410Ut5.B4(dialogLJ);
    }

    public final void LJIIJJI(int i, boolean z) {
        if (!C267550Ae9.LIZ()) {
            return;
        }
        this.LJIIJ = false;
        C201955140j.LIZ("RecordExitController -> click tooltips item new");
        C1402940mc0.LIZLLL(C1402930mbz.LIZJ(i), this.LIZJ, z);
    }

    @Override // X.InterfaceC1655780tBo
    public final void LIZIZ(AFwS214S0000000_25 aFwS214S0000000_25, AwS174S1100000_25 awS174S1100000_25, AwS569S0100000_25 awS569S0100000_25) {
        try {
            C21560119Zf c21560119Zf = new C21560119Zf(this.LIZIZ, R.style.acf);
            C21560219Zg c21560219Zg = c21560119Zf.LIZ;
            c21560219Zg.LJFF = c21560219Zg.LIZ.getText(2131830042);
            c21560119Zf.LIZIZ(2131834297, new DialogInterfaceOnClickListenerC2189611Aml(aFwS214S0000000_25, 14));
            c21560119Zf.LIZJ(2131830039, new DialogInterfaceOnClickListenerC2189611Aml(awS569S0100000_25, 15));
            DialogInterfaceOnClickListenerC2189611Aml dialogInterfaceOnClickListenerC2189611Aml = new DialogInterfaceOnClickListenerC2189611Aml(awS174S1100000_25, 16);
            C21560219Zg c21560219Zg2 = c21560119Zf.LIZ;
            c21560219Zg2.LJIIJ = c21560219Zg2.LIZ.getText(2131830040);
            c21560119Zf.LIZ.LJIIJJI = dialogInterfaceOnClickListenerC2189611Aml;
            C786410Ut5.D4(c21560119Zf.LIZ());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJIIJ(C201967140v.LIZIZ, "showDiscardVideoDialog error", e);
        }
    }

    @Override // X.InterfaceC1655780tBo
    public final void LIZJ(AFwS214S0000000_25 aFwS214S0000000_25, AwS174S1100000_25 awS174S1100000_25, AwS569S0100000_25 awS569S0100000_25) {
        C1390850mIV c1390850mIV = new C1390850mIV();
        C1247510iZJ c1247510iZJ = new C1247510iZJ();
        c1247510iZJ.LIZIZ(2131826967);
        c1247510iZJ.LIZJ = 1;
        c1247510iZJ.LIZ(new AwS612S0100000_33(awS569S0100000_25, 115));
        C1247510iZJ c1247510iZJ2 = new C1247510iZJ();
        c1247510iZJ2.LIZIZ(R.string.e1d);
        c1247510iZJ2.LIZ(new AwS612S0100000_33(awS174S1100000_25, 116));
        c1390850mIV.LIZIZ(c1247510iZJ, c1247510iZJ2);
        c1390850mIV.LIZLLL(R.string.f1_);
        DialogInterfaceOnCancelListenerC2189601Amk dialogInterfaceOnCancelListenerC2189601Amk = new DialogInterfaceOnCancelListenerC2189601Amk(aFwS214S0000000_25, 1);
        TuxActionSheet tuxActionSheet = c1390850mIV.LIZ;
        tuxActionSheet.LL = dialogInterfaceOnCancelListenerC2189601Amk;
        tuxActionSheet.LLILLJJLI = new DialogInterface.OnDismissListener() { // from class: X.1A3v
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
            }
        };
        c1390850mIV.LIZJ().show(this.LIZIZ.getSupportFragmentManager(), "record action sheet");
    }

    @Override // X.InterfaceC1655780tBo
    public final void LJ(AFwS214S0000000_25 aFwS214S0000000_25, AwS174S1100000_25 awS174S1100000_25, AwS174S1100000_25 awS174S1100000_252) {
        try {
            C19EG c19eg = this.LIZIZ;
            C21566919al c21566919al = new C21566919al(c19eg);
            c21566919al.LIZ(2131830041);
            c21566919al.LJIIJ(2131830038, new DialogInterfaceOnClickListenerC2189611Aml(awS174S1100000_252, 11), false);
            c21566919al.LJII(2131834297, new DialogInterfaceOnClickListenerC2189611Aml(aFwS214S0000000_25, 12), false);
            c21566919al.LJIIJ = new C21566819ak(new DialogInterfaceOnClickListenerC2189611Aml(awS174S1100000_25, 13), c19eg.getText(2131830040), false);
            new C21566519ah(c21566919al).LIZLLL();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJIIJ(C201967140v.LIZIZ, "showBackToTrimDialog error", e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0mc2] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.0mc1] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.1A3r] */
    public C2173271A3p(C19A3 c19a3, C19EG c19eg, ShortVideoContext shortVideoContext, e0 e0Var, C1655790tBp c1655790tBp) {
        this.LIZ = c19a3;
        this.LIZIZ = c19eg;
        this.LIZJ = shortVideoContext;
        this.LIZLLL = e0Var;
        this.LJ = c1655790tBp;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.0C64] */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* JADX WARN: Type inference failed for: r21v7 */
    /* JADX WARN: Type inference failed for: r21v8 */
    /* JADX WARN: Type inference failed for: r21v9 */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r22v4 */
    /* JADX WARN: Type inference failed for: r22v5 */
    /* JADX WARN: Type inference failed for: r22v6 */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r26v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r26v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r31v0 */
    /* JADX WARN: Type inference failed for: r31v1 */
    /* JADX WARN: Type inference failed for: r31v2 */
    /* JADX WARN: Type inference failed for: r33v0 */
    /* JADX WARN: Type inference failed for: r33v1 */
    /* JADX WARN: Type inference failed for: r33v2 */
    /* JADX WARN: Type inference failed for: r34v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r34v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r34v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r35v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r35v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r35v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v10, types: [X.0C64] */
    /* JADX WARN: Type inference failed for: r7v6, types: [X.0C64] */
    /* JADX WARN: Type inference failed for: r9v10, types: [X.0C64] */
    @Override // X.InterfaceC1655780tBo
    public final void LJIIIZ(View view, boolean z, C1655870tBx c1655870tBx, C1655890tBz c1655890tBz, C1655810tBr c1655810tBr) {
        int i;
        boolean z2;
        int i2;
        boolean z3;
        int i3;
        int i4;
        IDMSendToFriendMenuActionHelper iDMSendToFriendMenuActionHelperLIZ;
        int i5;
        ?? r10 = 0;
        if (C0CHW.LIZ()) {
            C570010MXf c570010MXf = this.LJFF;
            if (c570010MXf != null && c570010MXf.LIZJ()) {
                c570010MXf.LIZIZ();
            }
            C0P0T c0p0t = this.LJI;
            if (c0p0t != null && c0p0t.isShowing()) {
                c0p0t.dismiss();
            }
            Context contextLIZIZ = C545820Lau.LIZIZ(this.LIZ);
            if (contextLIZIZ != null) {
                ArrayList arrayList = new ArrayList();
                if (this.LIZJ.cameraComponentModel.mRestoreType == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    i2 = 2131829833;
                } else {
                    i2 = 2131829841;
                }
                arrayList.add(new C570020MXg(R.raw.icon_trash_bin, i2, R.attr.zs, R.attr.zs, new AwS577S0100000_33(this, 3672), 176));
                if (!C1655910tC1.LIZ()) {
                    r10 = 0;
                    arrayList.add(new C570020MXg(R.raw.icon_arrow_turn_left, 2131829848, 0, 0, new AwS577S0100000_33(this, 3673), 188));
                }
                if (z) {
                    if (C2535909wj.LIZ()) {
                        arrayList.add(new C570020MXg(R.raw.icon_draft, 2131829846, r10 == true ? 1 : 0, r10 == true ? 1 : 0, new AwS577S0100000_33(c1655870tBx, 3674), 188));
                    }
                    if (C1385410m9j.LIZ) {
                        IDMSendToFriendMenuActionHelper.LIZ.getClass();
                        IDMSendToFriendMenuActionHelper iDMSendToFriendMenuActionHelperLIZ2 = C380260EvY.LIZ();
                        if (iDMSendToFriendMenuActionHelperLIZ2 != null && iDMSendToFriendMenuActionHelperLIZ2.LIZIZ() && this.LIZJ.LJII() <= 60000) {
                            arrayList.add(new C570020MXg(R.raw.icon_paperplane, 2131831535, r10 == true ? 1 : 0, r10 == true ? 1 : 0, new AwS577S0100000_33(c1655890tBz, 3675), 188));
                        }
                    }
                    if (C0C64.LJIILLIIL().LJIJ(31744, r10, "studio_record_ask_save_draft_type", true) >= 1 && c1655810tBr != null) {
                        arrayList.add(new C570020MXg(R.raw.icon_lock_small, C290030BYj.LIZ(), r10 == true ? 1 : 0, r10 == true ? 1 : 0, new AwS576S0100000_32(c1655810tBr, 351), 188));
                    }
                    if (C1655910tC1.LIZ() && c1655810tBr != null) {
                        arrayList.add(new C570020MXg(R.raw.icon_two_person, 2131844923, r10 == true ? 1 : 0, r10 == true ? 1 : 0, new AwS576S0100000_32(c1655810tBr, 352), 188));
                    }
                }
                this.LJFF = new C570010MXf(contextLIZIZ, view, arrayList, this.LJIIIIZZ, 112);
                C0HWQ c0hwq = new C0HWQ(contextLIZIZ);
                ArrayList arrayList2 = new ArrayList();
                this.LJII.clear();
                if (this.LIZJ.cameraComponentModel.mRestoreType == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                C118300cf c118300cf = new C118300cf();
                if (z3) {
                    i3 = 2131829833;
                } else {
                    i3 = 2131829841;
                }
                c118300cf.element = i3;
                if (C0C64.LJIILLIIL().LJIJ(31744, r10, "studio_record_discard_opt", true) == 2 && !z3) {
                    c118300cf.element = 2131829822;
                    i4 = R.raw.icon_arrow_to_left;
                } else {
                    if (C297750Bll.LIZ()) {
                        c118300cf.element = 2131829842;
                    }
                    i4 = R.raw.icon_trash_bin;
                }
                arrayList2.add(new C443090HZb(contextLIZIZ.getString(c118300cf.element), new C2173281A3q(z3, this, c118300cf), i4, null, r10 == true ? 1 : 0, null, 1, r10, r10, null, 952));
                this.LJII.add(C1402930mbz.LIZJ(c118300cf.element));
                if (!C1655910tC1.LIZ() && C0C64.LJIILLIIL().LJIJ(31744, r10, "studio_record_discard_opt", true) != 1) {
                    arrayList2.add(new C443090HZb(contextLIZIZ.getString(2131829848), new AwS577S0100000_33(this, 3671), R.raw.icon_arrow_turn_left, null, r10 == true ? 1 : 0, null, r10 == true ? 1 : 0, r10, r10, null, 1016));
                    this.LJII.add(C1402930mbz.LIZJ(2131829848));
                }
                if (C2535909wj.LIZ() && z) {
                    if (C301590Brx.LIZ() && z3) {
                        i5 = 2131846551;
                    } else if (C297750Bll.LIZ()) {
                        i5 = 2131829847;
                    } else {
                        i5 = 2131829846;
                    }
                    arrayList2.add(new C443090HZb(contextLIZIZ.getString(i5), new AwS147S0201000_25(c1655870tBx, this, i5, 4), R.raw.icon_draft, null, r10 == true ? 1 : 0, null, r10 == true ? 1 : 0, r10, r10, null, 1016));
                    this.LJII.add(C1402930mbz.LIZJ(i5));
                }
                if (C1385410m9j.LIZ) {
                    IDMSendToFriendMenuActionHelper.LIZ.getClass();
                    IDMSendToFriendMenuActionHelper iDMSendToFriendMenuActionHelperLIZ3 = C380260EvY.LIZ();
                    if (iDMSendToFriendMenuActionHelperLIZ3 != null && iDMSendToFriendMenuActionHelperLIZ3.LIZIZ() && this.LIZJ.LJII() > 1000 && this.LIZJ.LJII() <= 60000 && (iDMSendToFriendMenuActionHelperLIZ = C380260EvY.LIZ()) != null) {
                        arrayList2.add(iDMSendToFriendMenuActionHelperLIZ.LIZ(contextLIZIZ, new AwS434S0200000_33(this, c1655890tBz, 143)));
                        this.LJII.add(C1402930mbz.LIZJ(2131831535));
                    }
                }
                if (z) {
                    if (C0C64.LJIILLIIL().LJIJ(31744, r10, "studio_record_ask_save_draft_type", true) >= 1 && c1655810tBr != null) {
                        int iLIZ = C290030BYj.LIZ();
                        arrayList2.add(new C443090HZb(contextLIZIZ.getString(iLIZ), new AwS147S0201000_25(c1655810tBr, this, iLIZ, 5), R.raw.icon_lock_small, null, r10 == true ? 1 : 0, null, r10 == true ? 1 : 0, r10, r10, null, 1016));
                        this.LJII.add(C1402930mbz.LIZJ(iLIZ));
                    }
                    if (C1655910tC1.LIZ() && c1655810tBr != null) {
                        arrayList2.add(new C443090HZb(contextLIZIZ.getString(2131844923), new AwS426S0200000_25(c1655810tBr, this, 92), R.raw.icon_two_person, null, r10 == true ? 1 : 0, null, r10 == true ? 1 : 0, r10, r10, null, 1016));
                        this.LJII.add(C1402930mbz.LIZJ(2131844923));
                    }
                }
                c0hwq.LJIIL(Collections.singletonList(arrayList2));
                c0hwq.LLJ = true;
                C1391600mJi c1391600mJi = c0hwq.LLILLJJLI;
                c1391600mJi.LIZIZ = view;
                c1391600mJi.LJIJJ = true;
                c1391600mJi.LJIIL = r10;
                c1391600mJi.LIZLLL = EnumC1235690iGF.BOTTOM;
                c1391600mJi.LJJIFFI = this.LJIIIZ;
                c1391600mJi.LJJI = this.LJIIJJI;
                this.LJI = c0hwq.LIZIZ();
            }
            if (C267550Ae9.LIZ()) {
                C0P0T c0p0t2 = this.LJI;
                if (c0p0t2 != null) {
                    c0p0t2.show();
                    return;
                }
                return;
            }
            C570010MXf c570010MXf2 = this.LJFF;
            if (c570010MXf2 == null) {
                return;
            }
            c570010MXf2.LIZLLL();
            return;
        }
        C1402940mc0.LJ(this.LIZJ);
        ArrayList arrayList3 = new ArrayList();
        C1247510iZJ c1247510iZJ = new C1247510iZJ();
        if (this.LIZJ.cameraComponentModel.mRestoreType == 1) {
            i = 2131829833;
        } else {
            i = 2131829841;
        }
        c1247510iZJ.LIZIZ(i);
        c1247510iZJ.LIZ(new AwS601S0100000_22(this, 614));
        arrayList3.add(c1247510iZJ);
        if (!C1655910tC1.LIZ()) {
            C1247510iZJ c1247510iZJ2 = new C1247510iZJ();
            c1247510iZJ2.LIZIZ(2131829848);
            c1247510iZJ2.LIZ(new AwS612S0100000_33(this, 113));
            arrayList3.add(c1247510iZJ2);
        }
        if (z) {
            C1247510iZJ c1247510iZJ3 = new C1247510iZJ();
            c1247510iZJ3.LIZIZ(2131829846);
            c1247510iZJ3.LIZ(new AwS399S0200000_33(this, c1655870tBx, 13));
            arrayList3.add(c1247510iZJ3);
        }
        C1390850mIV c1390850mIV = new C1390850mIV();
        C1247510iZJ[] c1247510iZJArr = (C1247510iZJ[]) arrayList3.toArray(new C1247510iZJ[0]);
        c1390850mIV.LIZIZ((C1247510iZJ[]) Arrays.copyOf(c1247510iZJArr, c1247510iZJArr.length));
        c1390850mIV.LIZ.LL = new DialogInterfaceOnCancelListenerC1466620oGi(this, 0);
        c1390850mIV.LIZJ().show(this.LIZIZ.getSupportFragmentManager(), "Save Draft Dialog");
    }

    @Override // X.InterfaceC1655780tBo
    public final void LJIIJ(View view, boolean z, C1655860tBw c1655860tBw, C1655880tBy c1655880tBy, C1655810tBr c1655810tBr) {
        int i;
        Context context;
        boolean z2;
        int i2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int i6;
        if (C0CHW.LIZ()) {
            C570010MXf c570010MXf = this.LJFF;
            if (c570010MXf != null && c570010MXf.LIZJ()) {
                c570010MXf.LIZIZ();
            }
            C0P0T c0p0t = this.LJI;
            if (c0p0t != null && c0p0t.isShowing()) {
                c0p0t.dismiss();
            }
            AbstractC214814194y abstractC214814194yLIZ = C372650EjH.LIZ(this.LIZ);
            if (abstractC214814194yLIZ != null && (context = abstractC214814194yLIZ.getContext()) != null) {
                ArrayList arrayList = new ArrayList();
                if (this.LIZJ.cameraComponentModel.mRestoreType == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    i2 = 2131829833;
                } else {
                    i2 = 2131829841;
                }
                arrayList.add(new C570020MXg(R.raw.icon_trash_bin, i2, R.attr.zs, R.attr.zs, new AwS577S0100000_33(this, 3676), 176));
                if (!z2 && !C1655910tC1.LIZ()) {
                    arrayList.add(new C570020MXg(R.raw.icon_video_split, 2131829868, 0, 0, new AwS577S0100000_33(this, 3677), 188));
                }
                if (this.LIZJ.LJII() > 0) {
                    if (!C1655910tC1.LIZ()) {
                        arrayList.add(new C570020MXg(R.raw.icon_arrow_turn_left, 2131829870, 0, 0, new AwS577S0100000_33(this, 3678), 188));
                    }
                    if (z) {
                        if (C2535909wj.LIZ()) {
                            arrayList.add(new C570020MXg(R.raw.icon_draft, 2131829846, 0, 0, new AwS577S0100000_33(c1655860tBw, 3679), 188));
                        }
                        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_record_ask_save_draft_type", true) >= 1 && c1655810tBr != null) {
                            arrayList.add(new C570020MXg(R.raw.icon_lock_small, C290030BYj.LIZ(), 0, 0, new AwS576S0100000_32(c1655810tBr, 353), 188));
                        }
                        if (C1655910tC1.LIZ() && c1655810tBr != null) {
                            arrayList.add(new C570020MXg(R.raw.icon_two_person, 2131844923, 0, 0, new AwS576S0100000_32(c1655810tBr, 354), 188));
                        }
                    }
                }
                this.LJFF = new C570010MXf(context, view, arrayList, this.LJIIIIZZ, 112);
                C0HWQ c0hwq = new C0HWQ(context);
                ArrayList arrayList2 = new ArrayList();
                this.LJII.clear();
                if (this.LIZJ.cameraComponentModel.mRestoreType == 1) {
                    z3 = true;
                    i3 = 2131829833;
                } else {
                    z3 = false;
                    i3 = 2131829841;
                }
                arrayList2.add(new C443090HZb(context.getString(i3), new AwS170S0101000_33(this, i3, 2), R.raw.icon_trash_bin, null, 0, null, 1, false, false, null, 952));
                this.LJII.add(C1402930mbz.LIZJ(i3));
                if (!z3 && !C1655910tC1.LIZ()) {
                    if (C297750Bll.LIZ()) {
                        i6 = 2131829869;
                    } else {
                        i6 = 2131829868;
                    }
                    arrayList2.add(new C443090HZb(context.getString(i6), new AwS577S0100000_33(this, 3680), R.raw.icon_video_split, null, 0, null, 0, false, false, null, 1016));
                    this.LJII.add(C1402930mbz.LIZJ(2131829868));
                }
                if (this.LIZJ.LJII() > 0) {
                    if (!C1655910tC1.LIZ()) {
                        if (C297750Bll.LIZ()) {
                            i5 = 2131829871;
                        } else {
                            i5 = 2131829870;
                        }
                        arrayList2.add(new C443090HZb(context.getString(i5), new AwS577S0100000_33(this, 3681), R.raw.icon_arrow_turn_left, null, 0, null, 0, false, false, null, 1016));
                        this.LJII.add(C1402930mbz.LIZJ(2131829870));
                    }
                    if (C2535909wj.LIZ() && z) {
                        if (C301590Brx.LIZ() && z3) {
                            i4 = 2131846551;
                        } else {
                            i4 = 2131829846;
                        }
                        arrayList2.add(new C443090HZb(context.getString(i4), new AwS147S0201000_25(c1655860tBw, this, i4, 6), R.raw.icon_draft, null, 0, null, 0, false, false, null, 1016));
                        this.LJII.add(C1402930mbz.LIZJ(i4));
                    }
                    IDMSendToFriendMenuActionHelper.LIZ.getClass();
                    IDMSendToFriendMenuActionHelper iDMSendToFriendMenuActionHelperLIZ = C380260EvY.LIZ();
                    if (iDMSendToFriendMenuActionHelperLIZ != null && iDMSendToFriendMenuActionHelperLIZ.LIZIZ() && this.LIZJ.LJII() > 1000 && this.LIZJ.LJII() <= 60000) {
                        arrayList2.add(iDMSendToFriendMenuActionHelperLIZ.LIZ(context, new AwS434S0200000_33(this, c1655880tBy, 142)));
                        this.LJII.add(C1402930mbz.LIZJ(2131831535));
                    }
                    if (z) {
                        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_record_ask_save_draft_type", true) >= 1 && c1655810tBr != null) {
                            int iLIZ = C290030BYj.LIZ();
                            arrayList2.add(new C443090HZb(context.getString(iLIZ), new AwS147S0201000_25(c1655810tBr, this, iLIZ, 3), R.raw.icon_lock_small, null, 0, null, 0, false, false, null, 1016));
                            this.LJII.add(C1402930mbz.LIZJ(iLIZ));
                        }
                        if (C1655910tC1.LIZ() && c1655810tBr != null) {
                            arrayList2.add(new C443090HZb(context.getString(2131844923), new AwS426S0200000_25(c1655810tBr, this, 91), R.raw.icon_two_person, null, 0, null, 0, false, false, null, 1016));
                            this.LJII.add(C1402930mbz.LIZJ(2131844923));
                        }
                    }
                }
                c0hwq.LJIIL(Collections.singletonList(arrayList2));
                c0hwq.LLJ = true;
                C1391600mJi c1391600mJi = c0hwq.LLILLJJLI;
                c1391600mJi.LIZIZ = view;
                c1391600mJi.LJIJJ = true;
                c1391600mJi.LJIIL = false;
                c1391600mJi.LIZLLL = EnumC1235690iGF.BOTTOM;
                c1391600mJi.LJJIFFI = this.LJIIIZ;
                c1391600mJi.LJJI = this.LJIIJJI;
                this.LJI = c0hwq.LIZIZ();
            }
            if (C267550Ae9.LIZ()) {
                C0P0T c0p0t2 = this.LJI;
                if (c0p0t2 != null) {
                    c0p0t2.show();
                    return;
                }
                return;
            }
            C570010MXf c570010MXf2 = this.LJFF;
            if (c570010MXf2 == null) {
                return;
            }
            c570010MXf2.LIZLLL();
            return;
        }
        C1402940mc0.LJ(this.LIZJ);
        ArrayList arrayList3 = new ArrayList();
        C1247510iZJ c1247510iZJ = new C1247510iZJ();
        if (this.LIZJ.cameraComponentModel.mRestoreType == 1) {
            i = 2131829833;
        } else {
            i = 2131829841;
        }
        c1247510iZJ.LIZIZ(i);
        c1247510iZJ.LIZ(new AwS601S0100000_22(this, 615));
        arrayList3.add(c1247510iZJ);
        if (this.LIZJ.cameraComponentModel.mRestoreType != 1 && !C1655910tC1.LIZ()) {
            C1247510iZJ c1247510iZJ2 = new C1247510iZJ();
            c1247510iZJ2.LIZIZ(2131829868);
            c1247510iZJ2.LIZ(new AwS601S0100000_22(this, 616));
            arrayList3.add(c1247510iZJ2);
        }
        if (this.LIZJ.LJII() > 0 && !C1655910tC1.LIZ()) {
            C1247510iZJ c1247510iZJ3 = new C1247510iZJ();
            c1247510iZJ3.LIZIZ(2131829870);
            c1247510iZJ3.LIZ(new AwS612S0100000_33(this, 114));
            arrayList3.add(c1247510iZJ3);
        }
        if (z) {
            C1247510iZJ c1247510iZJ4 = new C1247510iZJ();
            c1247510iZJ4.LIZIZ(2131829846);
            c1247510iZJ4.LIZ(new AwS399S0200000_33(this, c1655860tBw, 14));
            arrayList3.add(c1247510iZJ4);
        }
        C1390850mIV c1390850mIV = new C1390850mIV();
        C1247510iZJ[] c1247510iZJArr = (C1247510iZJ[]) arrayList3.toArray(new C1247510iZJ[0]);
        c1390850mIV.LIZIZ((C1247510iZJ[]) Arrays.copyOf(c1247510iZJArr, c1247510iZJArr.length));
        c1390850mIV.LIZ.LL = new DialogInterfaceOnCancelListenerC1466620oGi(this, 1);
        c1390850mIV.LIZJ().show(this.LIZIZ.getSupportFragmentManager(), "Save Draft Dialog For Stitch");
    }
}
