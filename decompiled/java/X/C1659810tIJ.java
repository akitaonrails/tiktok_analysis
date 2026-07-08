package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ability.IOpenTextToImageService;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;

/* JADX INFO: renamed from: X.0tIJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1659810tIJ implements InterfaceC1660130tIp<C1659950tIX>, InterfaceC379610EuV {
    public final C1DRG LL;
    public final C19EG LLILLJJLI;
    public final ShortVideoContext LLILLL;
    public final AnonymousClass0951 LLILZ = C09IC.LIZIZ(C1BNE.LIZ(new InterfaceC1461640o8g<C1659950tIX>() { // from class: X.0tIK
    }));

    @Override // X.InterfaceC1660130tIp
    public final void LIZIZ() {
        IOpenTextToImageService iOpenTextToImageServiceOpenTextToImageService;
        if (((Number) C0BWR.LIZ.getValue()).intValue() == 2) {
            IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
            if (iExternalService != null && (iOpenTextToImageServiceOpenTextToImageService = iExternalService.openTextToImageService()) != null) {
                C19EG c19eg = this.LLILLJJLI;
                ShortVideoContext shortVideoContext = this.LLILLL;
                Bundle bundle = new Bundle();
                bundle.putInt("origin", 1);
                C786410Ut5.LJJJI("entrance", "story_record_page", bundle);
                IOpenTextToImageService.DefaultImpls.openTextToImageWithShortVideoContext$default(iOpenTextToImageServiceOpenTextToImageService, c19eg, shortVideoContext, 0, bundle, null, 16, null);
            }
            ServiceManager.get().getService(IExternalService.class);
        } else {
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).openTextNextService().openTextModeCanvasV2(this.LLILLJJLI, this.LLILLL);
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("creation_id", this.LLILLL.getCreationId());
        c2344009Gk.LJIIIIZZ("shoot_way", this.LLILLL.shootWay);
        c2344009Gk.LJIIIIZZ("enter_from", "video_shoot_page");
        C20684815ws.LJIILLIIL("click_text_mode_entrance", c2344009Gk.LIZ);
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC1660130tIp
    public final C05YD<C1659820tIK> getState() {
        return this.LLILZ;
    }

    public C1659810tIJ(C1DRG c1drg) {
        this.LL = c1drg;
        this.LLILLJJLI = (C19EG) c1drg.LJII(C19EG.class, null);
        this.LLILLL = (ShortVideoContext) c1drg.LJII(ShortVideoContext.class, null);
    }

    @Override // X.InterfaceC1660130tIp
    public final void LIZ(InterfaceC1660090tIl interfaceC1660090tIl) {
        C1660080tIk.LIZ(this, interfaceC1660090tIl);
    }
}
