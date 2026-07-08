package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.ui.reuseaudio.ReuseAudioApi;
import java.util.List;

/* JADX INFO: renamed from: X.13Uu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20019813Uu {
    public final String LIZ;
    public AnonymousClass0956 LIZIZ;
    public InterfaceC20019613Us LIZJ;
    public String LIZLLL;
    public Aweme LJ;
    public UrlModel LJFF;
    public final String LJI = C1490520otG.LJFF().LIZ();

    public C20019813Uu(String str) {
        this.LIZ = str;
    }

    public static Aweme LIZ(String str) {
        ReuseAudioApi.LIZ.getClass();
        ReuseAudioApi.IReuseAudioApi iReuseAudioApi = ReuseAudioApi.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append(str);
        sbLIZ.append(']');
        List<Aweme> list = iReuseAudioApi.queryBatchAweme(C2188811AlT.LIZIZ(sbLIZ), 3).execute().LIZIZ.items;
        if (list != null) {
            return (Aweme) ListProtector.get(list, 0);
        }
        return null;
    }
}
