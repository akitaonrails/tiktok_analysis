package X;

import com.ss.android.ugc.aweme.inbox.bulletin.setting.BulletinLynxCardCacheSizeItem;
import com.ss.android.ugc.aweme.inbox.bulletin.setting.BulletinLynxViewPreloadConfiguration;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: renamed from: X.0OU9, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OU9 {
    public static final C0OU9 LIZ = new C0OU9();
    public static final BulletinLynxViewPreloadConfiguration LIZIZ = new BulletinLynxViewPreloadConfiguration(0, Integer.valueOf(EnumC665490Q8l.MOST_ON_TASM.id()), Integer.valueOf(C0OU0.NONE.getId()), 0, 0, 99, C1697810uHb.LJIIJJI(new BulletinLynxCardCacheSizeItem("aweme://roma_redirect/?spark_page=social_inbox_bulletin_live_event_card", 6), new BulletinLynxCardCacheSizeItem("aweme://roma_redirect/?spark_page=social_inbox_bulletin_link_card", 8), new BulletinLynxCardCacheSizeItem("aweme://roma_redirect/?spark_page=social_inbox_bulletin_artist_music_card", 5), new BulletinLynxCardCacheSizeItem("aweme://roma_redirect/?spark_page=social_inbox_bulletin_artist_album_card", 5), new BulletinLynxCardCacheSizeItem("aweme://roma_redirect/?spark_page=social_inbox_bulletin_media_card_video_preview", 5)));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(511));

    public static BulletinLynxViewPreloadConfiguration LIZ() {
        return (BulletinLynxViewPreloadConfiguration) LIZJ.getValue();
    }

    public static final int LIZJ() {
        LIZ.getClass();
        Integer num = LIZ().renderThreadStrategy;
        return num != null ? num.intValue() : EnumC665490Q8l.MOST_ON_TASM.id();
    }

    public static final C0OU0 LIZIZ() {
        C0OU0 next;
        Iterator<C0OU0> it2 = C0OU0.getEntries().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            int id = next.getId();
            LIZ.getClass();
            Integer num = LIZ().preloadMethod;
            if (num != null && id == num.intValue()) {
                break;
            }
        }
        C0OU0 c0ou0 = next;
        return c0ou0 == null ? C0OU0.NONE : c0ou0;
    }
}
