package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.gift.model.MusicGiftMood;
import com.bytedance.android.livesdk.gift.model.MusicGiftMoodColor;
import com.bytedance.android.livesdk.model.Gift;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0fxI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1147060fxI {
    public final C1147020fxE LIZ;
    public final List<Gift> LIZIZ;
    public final Map<Long, MusicGiftMood> LIZJ;
    public final C1142100fpI LIZLLL;
    public final Set<Long> LJ;

    public final C1147350fxl LIZ() {
        Gift next;
        C1142100fpI c1142100fpI;
        Gift.MusicGiftInfo musicGiftInfo;
        long j = this.LIZ.LIZ;
        Iterator<Gift> it2 = this.LIZIZ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (next.id == j) {
                break;
            }
        }
        Gift gift = next;
        if (gift == null || (musicGiftInfo = gift.musicInfo) == null) {
            if ((j != this.LIZ.LIZ && ((c1142100fpI = this.LIZLLL) == null || j != c1142100fpI.LIZ)) || j <= 0) {
                return null;
            }
            C1142100fpI c1142100fpI2 = this.LIZLLL;
            return new C1147350fxl(j, 0L, "Music Gift", null, (c1142100fpI2 == null || c1142100fpI2.LIZ != j) ? null : LIZIZ(c1142100fpI2), null, null, this.LJ.contains(Long.valueOf(j)));
        }
        C1142100fpI c1142100fpI3 = this.LIZLLL;
        C1147070fxJ c1147070fxJLIZIZ = (c1142100fpI3 == null || c1142100fpI3.LIZ != gift.id) ? null : LIZIZ(c1142100fpI3);
        long j2 = gift.id;
        long j3 = gift.diamondCount;
        String str = musicGiftInfo.songName;
        if (a0.LJJJIL(str)) {
            str = gift.describe;
            if (str == null) {
                str = "";
            }
            if (a0.LJJJIL(str)) {
                str = gift.name;
            }
        }
        String str2 = musicGiftInfo.artistName;
        C1147410fxr c1147410fxr = (!(a0.LJJJIL(str2) ^ true) || str2 == null) ? null : new C1147410fxr(0L, str2, null);
        Gift.MusicGiftInfo.AudioResource audioResource = musicGiftInfo.resource;
        if (audioResource != null) {
            c1147070fxJLIZIZ = new C1147070fxJ(audioResource.audioUrl, audioResource.lyricsUrl, audioResource.snippetId);
        }
        ImageModel imageModel = gift.image;
        return new C1147350fxl(j2, j3, str, c1147410fxr, c1147070fxJLIZIZ, imageModel, imageModel, this.LJ.contains(Long.valueOf(gift.id)));
    }

    public static C1147070fxJ LIZIZ(C1142100fpI c1142100fpI) {
        String str;
        String str2;
        if (c1142100fpI.LIZLLL <= 0 && (((str = c1142100fpI.LJ) == null || a0.LJJJIL(str)) && ((str2 = c1142100fpI.LJFF) == null || a0.LJJJIL(str2)))) {
            return null;
        }
        String str3 = c1142100fpI.LJ;
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        String str5 = c1142100fpI.LJFF;
        if (str5 != null) {
            str4 = str5;
        }
        return new C1147070fxJ(str3, str4, c1142100fpI.LIZLLL);
    }

    public static C1147390fxp LIZJ(MusicGiftMood musicGiftMood, long j) {
        boolean z;
        String str;
        Long lValueOf = Long.valueOf(musicGiftMood.moodId);
        if (lValueOf.longValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        String str2 = null;
        if (!z) {
            lValueOf = Long.valueOf(j);
            if (lValueOf.longValue() <= 0) {
                return null;
            }
        }
        long jLongValue = lValueOf.longValue();
        ImageModel imageModel = musicGiftMood.icon;
        ImageModel imageModel2 = musicGiftMood.disc;
        String str3 = musicGiftMood.name;
        String str4 = musicGiftMood.title;
        MusicGiftMoodColor musicGiftMoodColor = musicGiftMood.color;
        if (musicGiftMoodColor != null) {
            str2 = musicGiftMoodColor.giftListHex;
        }
        String str5 = "";
        if (str2 == null) {
            str2 = "";
        }
        if (musicGiftMoodColor != null && (str = musicGiftMoodColor.secondaryPageHex) != null) {
            str5 = str;
        }
        return new C1147390fxp(jLongValue, imageModel, imageModel2, str3, str4, str2, str5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1147060fxI(C1147020fxE c1147020fxE, List<? extends Gift> list, Map<Long, MusicGiftMood> map, C1142100fpI c1142100fpI, Set<Long> set) {
        this.LIZ = c1147020fxE;
        this.LIZIZ = list;
        this.LIZJ = map;
        this.LIZLLL = c1142100fpI;
        this.LJ = set;
    }
}
