package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0bHQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C967340bHQ extends C09AY implements Function2<LinkUser, LinkUser, LinkUser> {
    public C967340bHQ() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final LinkUser invoke(LinkUser linkUser, LinkUser linkUser2) {
        LinkUser linkUser3 = linkUser;
        LinkUser linkUser4 = linkUser2;
        if (linkUser4 != null) {
            linkUser3.setAudioSwitchOn(linkUser4.audioSwitchOn);
            linkUser3.setVideoSwitchOn(linkUser4.videoSwitchOn);
            linkUser3.setAudioOccupied(linkUser4.audioOccupied);
            linkUser3.setLinkUserType(linkUser4.linkUserType);
        }
        return linkUser3;
    }
}
