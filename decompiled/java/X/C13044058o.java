package X;

import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.music.service.IMediaPlayerManagerService;

/* JADX INFO: renamed from: X.058o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C13044058o {
    public static /* synthetic */ Object LIZ(IMediaPlayerManagerService iMediaPlayerManagerService, MusicBuzModel musicBuzModel, String str, boolean z, InterfaceC1364105Vn interfaceC1364105Vn, int i) {
        boolean z2 = z;
        String str2 = str;
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return iMediaPlayerManagerService.LIZIZ(musicBuzModel, str2, z2, false, interfaceC1364105Vn);
    }
}
