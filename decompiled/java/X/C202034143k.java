package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.143k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C202034143k {
    public static C202041143r LIZ(MusicModel musicModel, InterfaceC202028143e interfaceC202028143e, String str, String str2) {
        String str3;
        List listLJJLIIIJILLIZJL;
        String musicId = musicModel.getMusicId();
        String uri = musicModel.getUri();
        if (uri == null || (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(uri, new String[]{"/"}, 0, 6)) == null || (str3 = (String) C13LP.LJJJLZIJ(2, listLJJLIIIJILLIZJL)) == null) {
            str3 = "";
        }
        return new C202041143r(musicId, str3, interfaceC202028143e, str, str2);
    }
}
