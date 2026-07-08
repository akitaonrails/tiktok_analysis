package X;

import com.ss.android.ugc.aweme.services.audio.IAudioParams;
import com.ss.android.ugc.aweme.services.audio.IAudioService;
import com.ss.android.ugc.aweme.services.audio.IAudioServiceFactory;
import com.ss.android.ugc.aweme.services.user.AudioUserPortraitServiceFactory;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.11eL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19550711eL {
    public static final Map<String, IAudioServiceFactory<?>> LIZ;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZ = linkedHashMap;
        linkedHashMap.put(C1446560nkM.class.getName(), new IAudioServiceFactory<C349280Dmg>() { // from class: X.0nkM
            @Override // com.ss.android.ugc.aweme.services.audio.IAudioServiceFactory
            public final IAudioService getAudioService(IAudioParams iAudioParams) {
                return new C349230Dmb((C349280Dmg) iAudioParams);
            }
        });
        linkedHashMap.put(C19550911eN.class.getName(), new C19550911eN());
        linkedHashMap.put(C2376609Sy.class.getName(), new C2376609Sy());
        linkedHashMap.put(AudioUserPortraitServiceFactory.class.getName(), new AudioUserPortraitServiceFactory());
        linkedHashMap.put(C19550611eK.class.getName(), new IAudioServiceFactory<C19550811eM>() { // from class: X.11eK
            @Override // com.ss.android.ugc.aweme.services.audio.IAudioServiceFactory
            public final IAudioService getAudioService(IAudioParams iAudioParams) {
                return new C19555211f4((C19550811eM) iAudioParams);
            }
        });
    }

    public static IAudioServiceFactory LIZ(String str) {
        return (IAudioServiceFactory) ((LinkedHashMap) LIZ).get(str);
    }
}
