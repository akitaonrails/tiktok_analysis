package X;

import com.ss.android.ugc.aweme.creative.model.FusedMusic;
import com.ss.android.ugc.aweme.creative.model.MusicInfo;
import com.ss.android.ugc.aweme.creative.model.UgcTemplateData;
import com.ss.android.ugc.aweme.shortvideo.model.TemplateSlot;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Ksx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C531530Ksx {
    public static final C531740KtI LIZ = new C531740KtI("prefetchMusic", C0PEM.LIZJ, new C319401Ls(new C526780KlI(null), null));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    public static final Pair<String, List<String>> LIZ(String str, UgcTemplateData ugcTemplateData, String str2) {
        String source;
        MusicInfo musicInfo;
        Object arrayList;
        MusicInfo musicInfo2;
        List<FusedMusic> fusedMusics;
        MusicInfo musicInfo3;
        C536310L1p.LIZ.getClass();
        String musicId = null;
        if (C536310L1p.LJII(ugcTemplateData, str2)) {
            if (ugcTemplateData != null && (musicInfo3 = ugcTemplateData.awemeMusicInfo) != null) {
                musicId = musicInfo3.getMusicId();
            }
            return new Pair<>(musicId, C13BV.INSTANCE);
        }
        if (C536310L1p.LJFF(ugcTemplateData, str2)) {
            if (ugcTemplateData != null && (musicInfo2 = ugcTemplateData.awemeMusicInfo) != null && (fusedMusics = musicInfo2.getFusedMusics()) != null) {
                arrayList = new ArrayList();
                Iterator<FusedMusic> it2 = fusedMusics.iterator();
                while (it2.hasNext()) {
                    String musicId2 = it2.next().getMusicId();
                    if (musicId2 != null) {
                        arrayList.add(musicId2);
                    }
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            return new Pair<>(null, arrayList);
        }
        C531550Ksz c531550KszLIZ = C0FQK.LIZ(str);
        if (c531550KszLIZ == null) {
            return new Pair<>(null, C13BV.INSTANCE);
        }
        List<String> list = c531550KszLIZ.LIZLLL.fusionMusicIds;
        if (!list.isEmpty()) {
            return new Pair<>(null, list);
        }
        String musicId3 = c531550KszLIZ.LIZJ.LJIIIIZZ;
        if ((musicId3 == null || musicId3.length() <= 0) && (ugcTemplateData == null || (((musicId3 = ugcTemplateData.musicId) == null || musicId3.length() <= 0) && ((musicInfo = ugcTemplateData.templateMusicInfo) == null || !musicInfo.getFusedMusics().isEmpty() || (musicId3 = musicInfo.getMusicId()) == null || musicId3.length() <= 0)))) {
            TemplateSlot templateSlot = c531550KszLIZ.LIZLLL.audioSlot;
            if (templateSlot != null) {
                source = templateSlot.getSource();
            } else {
                source = null;
            }
            String strLIZ = C0LE0.LIZ(source);
            if (strLIZ != null && C123100dR.LIZ(strLIZ)) {
                musicId = strLIZ;
            }
            musicId3 = musicId;
        }
        return new Pair<>(musicId3, C13BV.INSTANCE);
    }
}
