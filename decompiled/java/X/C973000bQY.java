package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicBackgroundSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicVoiceBackgroundSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bQY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C973000bQY extends C09AY implements Function0<Boolean> {
    public final /* synthetic */ C1276910jKj LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C973000bQY(C1276910jKj c1276910jKj) {
        super(0);
        this.LL = c1276910jKj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        C1276910jKj c1276910jKj;
        int i;
        Room room;
        LiveMode streamType;
        boolean z = false;
        if (LinkMicBackgroundSetting.opt() && (((i = (c1276910jKj = this.LL).LLILLL) == 4 || i == 0) && ((room = c1276910jKj.LL) == null || (streamType = room.getStreamType()) == null || !C354201Zc.LIZJ(streamType) || LinkMicVoiceBackgroundSetting.INSTANCE.enable()))) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
