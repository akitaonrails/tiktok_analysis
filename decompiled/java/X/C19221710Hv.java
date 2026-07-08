package X;

import com.ss.android.ugc.aweme.assem.TikTokToolsAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.10Hv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19221710Hv extends C09AY implements Function0<Unit> {
    public final /* synthetic */ TikTokToolsAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19221710Hv(TikTokToolsAssem tikTokToolsAssem) {
        super(0);
        this.LL = tikTokToolsAssem;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0093  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke() {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.assem.TikTokToolsAssem r2 = r6.LL
            r2.getClass()
            X.19EG r5 = X.C724240Sb0.LIZ(r2)
            r4 = 0
            if (r5 == 0) goto L24
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.edit.IReplaceMusicService> r0 = com.ss.android.ugc.aweme.services.edit.IReplaceMusicService.class
            java.lang.Object r3 = r1.getService(r0)
            com.ss.android.ugc.aweme.services.edit.IReplaceMusicService r3 = (com.ss.android.ugc.aweme.services.edit.IReplaceMusicService) r3
            boolean r0 = r3.getClickPost()
            if (r0 != 0) goto L40
            com.ss.android.ugc.aweme.services.edit.StripMusicPostType r0 = r3.getStripPostClicked()
            if (r0 != 0) goto L40
        L24:
            com.ss.android.ugc.aweme.assem.TikTokToolsAssem r1 = r6.LL
            r1.getClass()
            com.ss.android.ugc.aweme.services.edit.IBatchReplaceBannerService r0 = com.ss.android.ugc.gamora.editor.music.batchreplace.BatchReplaceBannerServiceImpl.LIZ()
            boolean r0 = r0.getClickPost()
            if (r0 == 0) goto L3d
            r1.bo()
            com.ss.android.ugc.aweme.services.edit.IBatchReplaceBannerService r0 = com.ss.android.ugc.gamora.editor.music.batchreplace.BatchReplaceBannerServiceImpl.LIZ()
            r0.setClickPost(r4)
        L3d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L40:
            r2.bo()
            boolean r0 = r3.getClickPost()
            r2 = 0
            if (r0 == 0) goto L8d
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.promote.replace.IPromoteReplaceMusicService> r0 = com.ss.android.ugc.aweme.commercialize.promote.replace.IPromoteReplaceMusicService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.commercialize.promote.replace.IPromoteReplaceMusicService r0 = (com.ss.android.ugc.aweme.commercialize.promote.replace.IPromoteReplaceMusicService) r0
            X.0zqU r0 = r0.LIZ()
            r0.getClass()
            boolean r0 = X.C1911640zqU.LJI
            if (r0 != 0) goto L24
            r3.setClickPost(r4)
            X.0mGx r1 = new X.0mGx
            r1.<init>(r5)
            r0 = 2131826773(0x7f111855, float:1.928644E38)
            r1.LJIIIZ(r0)
            r1.LJIIJJI()
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVServiceProxy> r0 = com.ss.android.ugc.aweme.services.IAVServiceProxy.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.services.IAVServiceProxy r0 = (com.ss.android.ugc.aweme.services.IAVServiceProxy) r0
            r0.getApplicationService()
            X.C19221910Hx.LJ(r5, r2)
            com.ss.android.ugc.aweme.services.edit.StripMusicRequest r0 = r3.getReplaceMusicWithStrippedSoundRequest()
            if (r0 == 0) goto Lb2
            r3.doReeditRequestV2(r5, r0)
        L8d:
            com.ss.android.ugc.aweme.services.edit.StripMusicPostType r0 = r3.getStripPostClicked()
            if (r0 == 0) goto L24
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVServiceProxy> r0 = com.ss.android.ugc.aweme.services.IAVServiceProxy.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.services.IAVServiceProxy r0 = (com.ss.android.ugc.aweme.services.IAVServiceProxy) r0
            r0.getApplicationService()
            X.C19221910Hx.LJ(r5, r2)
            com.ss.android.ugc.aweme.services.edit.StripMusicRequest r1 = r3.getStripMusicRequest()
            r0 = 1
            r3.doReeditRequest(r5, r1, r0)
            r3.setStripPostClicked(r2)
            goto L24
        Lb2:
            java.lang.String r1 = r3.getCover()
            com.ss.android.ugc.aweme.services.edit.ReplaceMusicRequest r0 = r3.getReplaceMusicRequest()
            r3.doRequest(r1, r0, r5)
            goto L8d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19221710Hv.invoke():java.lang.Object");
    }
}
