package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.port.in.IAVSettingService;
import com.ss.android.ugc.aweme.property.AVSettingsWrapper;

/* JADX INFO: renamed from: X.0XiC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C856100XiC {
    public static boolean LIZ() {
        if (!AVSettingsWrapper.enableSaveUploadVideo() || ((IAVSettingService) ServiceManager.get().getService(IAVSettingService.class)).getSaveAtPost()) {
            return false;
        }
        try {
            return C0CLW.LIZIZ.LIZ.getSilentShareConfigurable().booleanValue();
        } catch (C316660CbA e) {
            TryCatchGuardChecker.doCheck(e);
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3) {
        /*
            r2 = 0
            if (r3 == 0) goto L11
            boolean r0 = r3.hasOriginalSound()
            if (r0 == 0) goto La
            return r2
        La:
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r3.creativeModel
            if (r0 == 0) goto L11
            com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel r0 = r0.musicBuzModel
            goto L12
        L11:
            r0 = 0
        L12:
            com.ss.android.ugc.aweme.creative.model.music.AVMusic r1 = com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt.extractAVMusic(r0)
            if (r1 == 0) goto L25
            boolean r0 = r1.isCommerceMusic()
            if (r0 != 0) goto L25
            boolean r0 = r1.isOriginalSound()
            if (r0 != 0) goto L25
            r2 = 1
        L25:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C856100XiC.LIZIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):boolean");
    }
}
