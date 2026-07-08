package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.shortvideo.mediaselector.aicontentprotocol.AlbumAiContentRepository;
import com.ss.android.ugc.aweme.shortvideo.mediaselector.aicontentprotocol.AlbumAiContentService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0Kqo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C530200Kqo {
    public static AlbumAiContentRepository LIZIZ() {
        AlbumAiContentService.LIZ.getClass();
        AlbumAiContentService albumAiContentServiceLIZ = C523440Kfu.LIZ();
        if (albumAiContentServiceLIZ == null || !albumAiContentServiceLIZ.isEnable()) {
            return null;
        }
        AlbumAiContentRepository.LIZ.getClass();
        return (AlbumAiContentRepository) PluggableExtentionKt.pluggableSpi$default(AlbumAiContentRepository.class, false, false, false, 14, null);
    }

    public static Object LIZ(C11NZ c11nz, C13BV c13bv) {
        if (C07J6.LIZ()) {
            return c11nz.LJLJI(3000L, TimeUnit.MILLISECONDS).LJJLIIIIJ(new C517301zv(c13bv, 10)).LJ(c13bv);
        }
        return c11nz.LIZLLL();
    }
}
