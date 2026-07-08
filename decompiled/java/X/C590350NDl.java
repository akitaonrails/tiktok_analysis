package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.ImageInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.util.List;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: renamed from: X.0NDl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C590350NDl {
    public static final List<String> LJIIZILJ = C1697810uHb.LJIIJJI("rec_click_comment_model_score", "rec_comment", "rec_dislike", "rec_finish", "rec_follow", "rec_head", "rec_like_model_score", "rec_share", "rec_skip");
    public final C590280NDe LIZ;
    public final Aweme LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final Integer LJ;
    public final Integer LJFF;
    public final float LJI;
    public final Long LJII;
    public final Integer LJIIIIZZ;
    public final EnumC590340NDk LJIIIZ;
    public final EnumC590300NDg LJIIJ;
    public final C01GW LJIIJJI = C452501pT.LIZIZ(new AwS553S0100000_9(this, 901));
    public final C01GW LJIIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 899));
    public final C01GW LJIILIIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 903));
    public final C01GW LJIILJJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 904));
    public final C01GW LJIILL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 902));
    public final C01GW LJIILLIIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 900));

    public final double LIZ() {
        if (this.LJFF != null) {
            return r0.intValue();
        }
        return 0.0d;
    }

    public final double LIZIZ() {
        Video video;
        int duration;
        AnonymousClass0213 anonymousClass0213;
        Integer num;
        Integer num2 = this.LJ;
        if (num2 != null) {
            duration = num2.intValue();
        } else {
            C590280NDe c590280NDe = this.LIZ;
            if (c590280NDe == null || c590280NDe.LIZLLL == null) {
                Aweme aweme = this.LIZIZ;
                if (aweme == null || (video = aweme.getVideo()) == null) {
                    return 0.0d;
                }
                duration = video.getDuration();
            } else {
                C5186020i c5186020i = c590280NDe.LIZLLL;
                if (c5186020i == null || (anonymousClass0213 = c5186020i.video) == null || (num = anonymousClass0213.duration) == null) {
                    return 0.0d;
                }
                duration = num.intValue();
            }
        }
        return duration;
    }

    public final int LIZJ() {
        List<ImageInfo> imageInfos;
        C026X c026x;
        List<C5309025b> list;
        if (LIZLLL()) {
            return 0;
        }
        C590280NDe c590280NDe = this.LIZ;
        if (c590280NDe == null || c590280NDe.LIZLLL == null) {
            Aweme aweme = this.LIZIZ;
            if (aweme == null || (imageInfos = aweme.getImageInfos()) == null) {
                return 0;
            }
            return imageInfos.size();
        }
        C5186020i c5186020i = c590280NDe.LIZLLL;
        if (c5186020i == null || (c026x = c5186020i.image_post_info) == null || (list = c026x.images) == null) {
            return 0;
        }
        return list.size();
    }

    public final boolean LIZLLL() {
        return LIZIZ() > 0.0d || LIZ() > 0.0d;
    }

    public static long LJ(Long l) {
        if (l != null) {
            long jLongValue = l.longValue();
            if (jLongValue >= 0) {
                return jLongValue;
            }
        }
        return 0L;
    }

    public C590350NDl(C590280NDe c590280NDe, Aweme aweme, String str, String str2, Integer num, Integer num2, float f, Long l, Integer num3, EnumC590340NDk enumC590340NDk, EnumC590300NDg enumC590300NDg) {
        this.LIZ = c590280NDe;
        this.LIZIZ = aweme;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = num;
        this.LJFF = num2;
        this.LJI = f;
        this.LJII = l;
        this.LJIIIIZZ = num3;
        this.LJIIIZ = enumC590340NDk;
        this.LJIIJ = enumC590300NDg;
    }
}
