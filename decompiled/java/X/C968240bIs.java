package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0bIs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C968240bIs extends C09AY implements Function0<C967380bHU> {
    public C968240bIs() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0bHU] */
    @Override // kotlin.jvm.functions.Function0
    public final C967380bHU invoke() {
        return new Function2<LinkUser, LinkUser, LinkUser>() { // from class: X.0bHU
            @Override // kotlin.jvm.functions.Function2
            public final LinkUser invoke(LinkUser linkUser, LinkUser linkUser2) {
                LinkUser linkUser3 = linkUser;
                LinkUser linkUser4 = linkUser2;
                if (linkUser4 != null) {
                    linkUser4.setAudioSwitchOn(linkUser3.audioSwitchOn);
                    linkUser4.setVideoSwitchOn(linkUser3.videoSwitchOn);
                    linkUser4.setAudioOccupied(linkUser3.audioOccupied);
                    linkUser4.setLinkUserType(linkUser3.linkUserType);
                    return linkUser4;
                }
                return linkUser3;
            }
        };
    }
}
