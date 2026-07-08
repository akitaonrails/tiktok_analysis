package X;

import Y.ACallableS412S0100000_4;
import android.app.Dialog;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.commercialize.sticker.service.CommerceLockStickerServiceImpl;
import com.ss.android.ugc.aweme.commercialize.sticker.service.ICommerceLockStickerService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mob.record.IRecordMobService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerListBean;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: renamed from: X.11iD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19574711iD implements IEffectDownloadProgressListener {
    public final /* synthetic */ C19574811iE LIZ;

    public C19574711iD(C19574811iE c19574811iE) {
        this.LIZ = c19574811iE;
    }

    public final boolean LIZJ(C15O7<NewFaceStickerListBean> c15o7) {
        List<? extends NewFaceStickerBean> list;
        if (!c15o7.LJIILIIL() && !c15o7.LJIILL() && c15o7.LJIIL() != null && (list = c15o7.LJIIL().mStickers) != null && list.size() != 0) {
            ICommerceLockStickerService iCommerceLockStickerServiceLIZJ = CommerceLockStickerServiceImpl.LIZJ();
            NewFaceStickerBean newFaceStickerBean = (NewFaceStickerBean) ListProtector.get(list, 0);
            if (iCommerceLockStickerServiceLIZJ != null && iCommerceLockStickerServiceLIZJ.LIZ(newFaceStickerBean)) {
                iCommerceLockStickerServiceLIZJ.LIZIZ(this.LIZ.LJIIJ, newFaceStickerBean, "homepage_hot");
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
        this.LIZ.LJJIJLIJ = 0L;
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(Effect effect) {
        Map<String, Map<String, String>> mobParams;
        Map<String, String> map;
        Effect effect2 = effect;
        C19574811iE c19574811iE = this.LIZ;
        if (!c19574811iE.LJJLIIIJILLIZJL) {
            c19574811iE.LJJJIL = null;
            c19574811iE.LIZIZ = true;
            c19574811iE.LJJIJIIJIL = effect2;
            c19574811iE.LIZLLL(100);
            CreativeDialogWrapper creativeDialogWrapper = this.LIZ.LJII;
            if (creativeDialogWrapper != null) {
                creativeDialogWrapper.dismiss();
                this.LIZ.LJII = null;
            }
            Dialog dialog = this.LIZ.LJFF;
            if (dialog != null) {
                C0FNV.LIZ(dialog);
                this.LIZ.LJIILJJIL(C0MVY.DISMISS);
            }
            C19574811iE c19574811iE2 = this.LIZ;
            c19574811iE2.LJIIIZ = false;
            ProgressDialogC1399760mWs progressDialogC1399760mWs = c19574811iE2.LJIIIIZZ;
            if (progressDialogC1399760mWs != null) {
                C0FNV.LIZ(progressDialogC1399760mWs);
            }
            if (TextUtils.isEmpty(this.LIZ.LJIIJJI)) {
                this.LIZ.LJIIJJI = UUID.randomUUID().toString();
            }
            C19574811iE c19574811iE3 = this.LIZ;
            InterfaceC19340210lU interfaceC19340210lU = c19574811iE3.LJJII;
            if (interfaceC19340210lU != null) {
                interfaceC19340210lU.LIZ(effect2, c19574811iE3.LJIIJJI);
            } else {
                String str = "homepage_hot";
                String strJoin = "";
                if (c19574811iE3.LJIILIIL.equals("green_screen")) {
                    if (effect2.getEffectLabel() != null) {
                        strJoin = TextUtils.join(",", effect2.getEffectLabel().getV2Tags());
                    }
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("content_type", "video");
                    c2344009Gk.LJIIIIZZ("content_source", "shoot");
                    if (!TextUtils.isEmpty(this.LIZ.LJIJ)) {
                        str = this.LIZ.LJIJ;
                    }
                    c2344009Gk.LJIIIIZZ("enter_from", str);
                    c2344009Gk.LJIIIIZZ("creation_id", this.LIZ.LJIIJJI);
                    c2344009Gk.LJIIIIZZ("group_id", this.LIZ.LJIIZILJ);
                    c2344009Gk.LJIIIIZZ("giphy_id", this.LIZ.LIZLLL);
                    c2344009Gk.LIZJ(C1443560nfW.LJIIIIZZ, "from_aigc_theme_status");
                    c2344009Gk.LJFF("prop_category", strJoin);
                    ((IRecordMobService) ServiceManager.get().getService(IRecordMobService.class)).LIZ(c2344009Gk.LIZ);
                } else if (!TextUtils.equals(this.LIZ.LJJIIZI, "prop_panel_discover")) {
                    if (effect2.getEffectLabel() != null) {
                        strJoin = TextUtils.join(",", effect2.getEffectLabel().getV2Tags());
                    }
                    C2344009Gk c2344009Gk2 = new C2344009Gk();
                    c2344009Gk2.LJIIIIZZ("creation_id", this.LIZ.LJIIJJI);
                    c2344009Gk2.LJIIIIZZ("shoot_way", this.LIZ.LJIILIIL);
                    c2344009Gk2.LJIIIIZZ("prop_id", effect2.getEffectId());
                    c2344009Gk2.LJIIIIZZ("giphy_id", this.LIZ.LIZLLL);
                    if (!TextUtils.isEmpty(this.LIZ.LJIJ)) {
                        str = this.LIZ.LJIJ;
                    }
                    c2344009Gk2.LJIIIIZZ("enter_from", str);
                    c2344009Gk2.LJIIIIZZ("panel_source", this.LIZ.LJJI);
                    c2344009Gk2.LJIIIIZZ("tt_template_id", this.LIZ.LJIL);
                    c2344009Gk2.LJIIIIZZ("tt_template_type", this.LIZ.LJJ);
                    c2344009Gk2.LIZLLL(((IExternalService) ServiceManager.get().getService(IExternalService.class)).infoService().getDurationSinceAppForeground(this.LIZ.LJIIJJI), "time_elapsed_since_launch_app");
                    c2344009Gk2.LJFF("prop_category", strJoin);
                    this.LIZ.LIZIZ(c2344009Gk2, effect2);
                    C19574811iE c19574811iE4 = this.LIZ;
                    String str2 = c19574811iE4.LJJJJZ;
                    if (str2 == null && (str2 = c19574811iE4.LJIJI) == null) {
                        str2 = "click_prop_publish";
                    }
                    c2344009Gk2.LJFF("enter_method", str2);
                    C651970Phj.LLILLL.getClass();
                    Map<String, String> mapLIZJ = C651980Phk.LIZJ();
                    C0Q1Q.LIZ(c2344009Gk2, mapLIZJ);
                    C1ER1 c1er1 = C1ER1.LIZIZ;
                    c2344009Gk2.LJII(c1er1.LJJZZI(mapLIZJ));
                    c1er1.LJJIIJZLJL().LJIJI(effect2.getEffectId());
                    c2344009Gk2.LJFF("prop_list", effect2.getEffectId());
                    c2344009Gk2.LIZJ(C1443560nfW.LJIIIIZZ, "from_aigc_theme_status");
                    ShootExtraData shootExtraData = this.LIZ.LJ;
                    if (shootExtraData != null && (mobParams = shootExtraData.getMobParams()) != null && (map = mobParams.get("shoot")) != null) {
                        c2344009Gk2.LJI(new HashMap(map));
                    }
                    ((IRecordMobService) ServiceManager.get().getService(IRecordMobService.class)).LIZ(c2344009Gk2.LIZ);
                }
            }
            ShootExtraData shootExtraData2 = this.LIZ.LJ;
            if (shootExtraData2 != null && shootExtraData2.getFollowupSquareActionPosition() != null && !this.LIZ.LJ.getFollowupSquareActionPosition().isEmpty()) {
                FaceStickerBean.sCurPropSource = "followup_square";
            } else if (TextUtils.equals(this.LIZ.LJJIIZI, "prop_page")) {
                FaceStickerBean.sCurPropSource = "prop_page";
            } else if (TextUtils.equals(this.LIZ.LJJIIZI, "prop_page_discover")) {
                FaceStickerBean.sCurPropSource = "prop_page_discover";
            } else if (TextUtils.equals(this.LIZ.LJJIIZI, "homepage_prop_anchor")) {
                FaceStickerBean.sCurPropSource = "homepage_prop_anchor";
            }
            if (((IExternalService) ServiceManager.get().getService(IExternalService.class)).infoService().stickerInfo().isLockSticker(effect2) && ((TextUtils.equals(this.LIZ.LJJIIZI, "prop_reuse") || TextUtils.equals(this.LIZ.LJJIIZI, "prop_page")) && !C10EU.LJIIIIZZ())) {
                if (effect2.isBusiness()) {
                    C15O7.LIZJ(new ACallableS412S0100000_4(effect2, 13)).LJ(new C19774412Yk(this, effect2, 7), C15O7.LJIIIIZZ, null);
                } else {
                    C19574811iE c19574811iE5 = this.LIZ;
                    c19574811iE5.LJ(effect2, c19574811iE5.LJIIJJI);
                }
            } else if (!TextUtils.equals(this.LIZ.LJJIIZI, "prop_panel_discover")) {
                C19574811iE c19574811iE6 = this.LIZ;
                c19574811iE6.LJIIL(effect2, c19574811iE6.LJIIJJI, false);
            }
            InterfaceC19576611iW interfaceC19576611iW = this.LIZ.LJJIII;
            if (interfaceC19576611iW != null) {
                interfaceC19576611iW.LIZ(0, effect2);
            }
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).infoService().endDownloadEffectAlog(effect2, this.LIZ.LJJIJLIJ, System.currentTimeMillis() - this.LIZ.LJJIJL, 0, null);
        }
    }

    public final void LIZ(Effect effect, String str) {
        String strJoin;
        if (TextUtils.isEmpty(str)) {
            onFail(effect, new ExceptionResult(-1));
            return;
        }
        C19574811iE c19574811iE = this.LIZ;
        Effect effect2 = c19574811iE.LJJJIL;
        c19574811iE.LJJJIL = null;
        if (effect != null) {
            effect2 = effect;
        } else if (effect2 == null) {
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).abilityService().effectService().buildEffectPlatform(this.LIZ.LJIIJ, new C19575311iJ(this, str, effect), null);
            return;
        }
        c19574811iE.LJIIIZ = false;
        ProgressDialogC1399760mWs progressDialogC1399760mWs = c19574811iE.LJIIIIZZ;
        if (progressDialogC1399760mWs != null) {
            C0FNV.LIZ(progressDialogC1399760mWs);
        }
        if (TextUtils.isEmpty(this.LIZ.LJIIJJI)) {
            this.LIZ.LJIIJJI = UUID.randomUUID().toString();
        }
        C19574811iE c19574811iE2 = this.LIZ;
        InterfaceC19340210lU interfaceC19340210lU = c19574811iE2.LJJII;
        if (interfaceC19340210lU != null) {
            interfaceC19340210lU.LIZ(effect2, c19574811iE2.LJIIJJI);
        } else {
            String str2 = "homepage_hot";
            if (c19574811iE2.LJIILIIL.equals("green_screen")) {
                IRecordMobService iRecordMobService = (IRecordMobService) ServiceManager.get().getService(IRecordMobService.class);
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("content_type", "video");
                c2344009Gk.LJIIIIZZ("content_source", "shoot");
                if (!TextUtils.isEmpty(this.LIZ.LJIJ)) {
                    str2 = this.LIZ.LJIJ;
                }
                c2344009Gk.LJIIIIZZ("enter_from", str2);
                c2344009Gk.LJIIIIZZ("creation_id", this.LIZ.LJIIJJI);
                c2344009Gk.LJIIIIZZ("group_id", this.LIZ.LJIIZILJ);
                c2344009Gk.LJIIIIZZ("giphy_id", this.LIZ.LIZLLL);
                c2344009Gk.LIZJ(C1443560nfW.LJIIIIZZ, "from_aigc_theme_status");
                iRecordMobService.LIZ(c2344009Gk.LIZ);
            } else {
                if (effect.getEffectLabel() != null) {
                    strJoin = TextUtils.join(",", effect.getEffectLabel().getV2Tags());
                } else {
                    strJoin = "";
                }
                C2344009Gk c2344009Gk2 = new C2344009Gk();
                this.LIZ.LIZIZ(c2344009Gk2, effect);
                c2344009Gk2.LJFF("prop_category", strJoin);
                IRecordMobService iRecordMobService2 = (IRecordMobService) ServiceManager.get().getService(IRecordMobService.class);
                c2344009Gk2.LJIIIIZZ("creation_id", this.LIZ.LJIIJJI);
                c2344009Gk2.LJIIIIZZ("shoot_way", this.LIZ.LJIILIIL);
                c2344009Gk2.LJIIIIZZ("prop_id", str);
                c2344009Gk2.LJIIIIZZ("giphy_id", this.LIZ.LIZLLL);
                c2344009Gk2.LJIIIIZZ("tt_template_id", this.LIZ.LJIL);
                c2344009Gk2.LJIIIIZZ("tt_template_type", this.LIZ.LJJ);
                if (!TextUtils.isEmpty(this.LIZ.LJIJ)) {
                    str2 = this.LIZ.LJIJ;
                }
                c2344009Gk2.LJIIIIZZ("enter_from", str2);
                c2344009Gk2.LIZLLL(((IExternalService) ServiceManager.get().getService(IExternalService.class)).infoService().getDurationSinceAppForeground(this.LIZ.LJIIJJI), "time_elapsed_since_launch_app");
                c2344009Gk2.LIZJ(C1443560nfW.LJIIIIZZ, "from_aigc_theme_status");
                iRecordMobService2.LIZ(c2344009Gk2.LIZ);
            }
        }
        if (TextUtils.equals(this.LIZ.LJJIIZI, "prop_page")) {
            FaceStickerBean.sCurPropSource = "prop_page";
        } else if (TextUtils.equals(this.LIZ.LJJIIZI, "prop_page_discover")) {
            FaceStickerBean.sCurPropSource = "prop_page_discover";
        } else if (TextUtils.equals(this.LIZ.LJJIIZI, "homepage_prop_anchor")) {
            FaceStickerBean.sCurPropSource = "homepage_prop_anchor";
        }
        if (((IExternalService) ServiceManager.get().getService(IExternalService.class)).infoService().stickerInfo().isLockSticker(effect2) && ((TextUtils.equals(this.LIZ.LJJIIZI, "prop_reuse") || TextUtils.equals(this.LIZ.LJJIIZI, "prop_page")) && !C10EU.LJIIIIZZ())) {
            if (effect2.isBusiness()) {
                C15O7.LIZJ(new ACallableS412S0100000_4(effect2, 12)).LJ(new C19774412Yk(this, effect2, 6), C15O7.LJIIIIZZ, null);
            } else {
                C19574811iE c19574811iE3 = this.LIZ;
                c19574811iE3.LJ(effect2, c19574811iE3.LJIIJJI);
            }
        } else {
            C19574811iE c19574811iE4 = this.LIZ;
            c19574811iE4.LJIIL(effect2, c19574811iE4.LJIIJJI, true);
        }
        InterfaceC19576611iW interfaceC19576611iW = this.LIZ.LJJIII;
        if (interfaceC19576611iW != null) {
            interfaceC19576611iW.LIZ(0, effect);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:95:0x0284  */
    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onFail(com.ss.android.ugc.effectmanager.effect.model.Effect r13, com.ss.android.ugc.effectmanager.common.task.ExceptionResult r14) {
        /*
            Method dump skipped, instruction units count: 984
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19574711iD.onFail(com.ss.android.ugc.effectmanager.effect.model.Effect, com.ss.android.ugc.effectmanager.common.task.ExceptionResult):void");
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
    public final void onProgress(Effect effect, int i, long j) {
        this.LIZ.LJJLIIIIJ = i;
        if (!C297830Blt.LIZ() && ((Number) C280640AzG.LIZ.getValue()).intValue() == -1) {
            if (C1632180sZk.LIZ) {
                C19574811iE c19574811iE = this.LIZ;
                c19574811iE.LJJLIIIJ = true;
                int i2 = c19574811iE.LJJLI;
                c19574811iE.LIZLLL((int) (((((double) ((100 - i2) * i)) * 1.0d) / 100.0d) + ((double) i2)));
            } else {
                this.LIZ.LIZLLL(i);
            }
        } else {
            CreativeDialogWrapper creativeDialogWrapper = this.LIZ.LJII;
            if (creativeDialogWrapper != null) {
                creativeDialogWrapper.updateProgress(i, false);
            }
        }
        C19574811iE c19574811iE2 = this.LIZ;
        if (c19574811iE2.LJJIJLIJ == 0) {
            c19574811iE2.LJJIJLIJ = j;
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).infoService().startDownloadEffectAlog(effect, j);
        }
    }
}
