package X;

import Y.ARunnableS122S0100000_22;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;

/* JADX INFO: renamed from: X.0nZF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1439670nZF {
    public final C19EG LIZ;
    public final AwemeDraft LIZIZ;
    public final C1439700nZI LIZJ;
    public final InterfaceC729580Sjc LIZLLL = C0CHQ.LIZ().getPublishService().LJIIL();

    public final void LIZ() {
        if (((Number) C287030BMv.LIZ.getValue()).intValue() == 2) {
            C0CN5.LIZIZ(Long.valueOf(((Number) C280490Az1.LIZ.getValue()).longValue()), new ARunnableS122S0100000_22(this, 124));
        } else {
            LIZIZ();
        }
    }

    public final void LIZIZ() {
        CreativeToolsPluginService creativeToolsPluginService;
        if (((Boolean) C283410B8x.LIZ.getValue()).booleanValue() && C299090Bnv.LIZ() && ((creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null)) == null || !creativeToolsPluginService.LJI(this.LIZ))) {
            C201955140j.LJIIL("Publish | auto retry skipped: VE plugin not ready");
            return;
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", this.LIZIZ.LIZ());
        c0lab.LJ("shoot_way", this.LIZIZ.LJJJJIZL.shootWay);
        c0lab.LJ("content_source", C0MZ9.LIZIZ(this.LIZIZ));
        c0lab.LJ("content_type", C0MZ9.LIZJ(this.LIZIZ));
        c0lab.LIZIZ((System.currentTimeMillis() - this.LIZIZ.lastEditTime) / ((long) LSPassThroughRecordSizeConfig.DEFAULT), "diff_duration");
        C20684815ws.LJIILLIIL("auto_retry_start", c0lab.LIZ);
        C1439650nZD c1439650nZD = C1439650nZD.LIZ;
        C1439650nZD.LIZIZ = true;
        if (this.LIZLLL.LIZLLL().size() >= 2) {
            C1439650nZD.LIZLLL = true;
        }
        InterfaceC729580Sjc interfaceC729580Sjc = this.LIZLLL;
        interfaceC729580Sjc.LIZIZ(interfaceC729580Sjc.LIZLLL());
        this.LIZLLL.LIZJ();
        C1444780nhU.LIZ();
        C201955140j.LJIIL("Publish | remove recover path by dismiss panel");
        c1439650nZD.LIZJ(true);
        AwemeDraft awemeDraft = this.LIZIZ;
        awemeDraft.LIZ.transientPostPageModel.LJJJJLI = true;
        this.LIZLLL.LJFF(this.LIZ, awemeDraft, null);
        C1439700nZI c1439700nZI = this.LIZJ;
        if (c1439700nZI != null) {
            c1439700nZI.LIZLLL.execute(new ARunnableS122S0100000_22(c1439700nZI, 125));
        }
    }

    public C1439670nZF(C19EG c19eg, AwemeDraft awemeDraft) {
        this.LIZ = c19eg;
        this.LIZIZ = awemeDraft;
        C1439700nZI c1439700nZI = new C1439700nZI(c19eg, awemeDraft.LIZJ());
        this.LIZJ = c1439700nZI;
        c1439700nZI.LIZJ = c1439700nZI.LIZLLL.submit(CallableC535380KzA.LL);
    }
}
