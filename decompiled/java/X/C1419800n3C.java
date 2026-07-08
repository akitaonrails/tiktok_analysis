package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.music.model.MatchedPGCSoundInfo;
import java.util.List;

/* JADX INFO: renamed from: X.0n3C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1419800n3C {
    public static final String LIZ(AVMusic aVMusic) {
        UrlModel urlModel;
        List<String> urlList;
        if (aVMusic.musicType == 2) {
            urlModel = aVMusic.reuseAudioPlayUrl;
        } else {
            urlModel = aVMusic.playUrl;
        }
        if (urlModel != null && (urlList = urlModel.getUrlList()) != null) {
            return (String) C13LP.LJJJLL(urlList);
        }
        return null;
    }

    public static final String LIZIZ(C19EG c19eg, AVMusic aVMusic) {
        String title;
        int i = C1419680n30.LIZ[C1418630n1J.LIZ(aVMusic).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return c19eg.getString(2131839043, aVMusic.authorName);
                }
                throw new C1954807lC();
            }
            MatchedPGCSoundInfo matchedPGCSoundInfo = aVMusic.getMatchedPGCSoundInfo();
            if (matchedPGCSoundInfo != null && (title = matchedPGCSoundInfo.getTitle()) != null) {
                return title;
            }
            return "";
        }
        return aVMusic.musicName;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LIZJ(com.ss.android.ugc.aweme.shortvideo.model.MusicModel r6, com.ss.android.ugc.aweme.shortvideo.model.MusicModel r7) {
        /*
            java.util.List r1 = r6.getMergedMusicList()
            java.util.ArrayList r3 = new java.util.ArrayList
            r5 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r5)
            r3.<init>(r0)
            java.util.Iterator r2 = r1.iterator()
        L13:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2b
            java.lang.Object r0 = r2.next()
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r0 = (com.ss.android.ugc.aweme.shortvideo.model.MusicModel) r0
            long r0 = r0.getId()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.add(r0)
            goto L13
        L2b:
            java.util.List r0 = X.C13LP.LJJJJI(r3)
            long[] r4 = X.C13LP.LLIIIILZ(r0)
            if (r7 == 0) goto L60
            java.util.List r1 = r7.getMergedMusicList()
            if (r1 == 0) goto L60
            java.util.ArrayList r3 = new java.util.ArrayList
            int r0 = X.C15438062q.LJIJJ(r1, r5)
            r3.<init>(r0)
            java.util.Iterator r2 = r1.iterator()
        L48:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L62
            java.lang.Object r0 = r2.next()
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r0 = (com.ss.android.ugc.aweme.shortvideo.model.MusicModel) r0
            long r0 = r0.getId()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.add(r0)
            goto L48
        L60:
            r0 = 0
            goto L6c
        L62:
            java.util.List r0 = X.C13LP.LJJJJI(r3)
            if (r0 == 0) goto L60
            long[] r0 = X.C13LP.LLIIIILZ(r0)
        L6c:
            boolean r0 = java.util.Arrays.equals(r4, r0)
            r2 = 0
            if (r0 == 0) goto L80
            if (r7 == 0) goto L80
            boolean r1 = r6.isMultiMusicFromTemplate()
            boolean r0 = r7.isMultiMusicFromTemplate()
            if (r1 != r0) goto L80
            r2 = 1
        L80:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1419800n3C.LIZJ(com.ss.android.ugc.aweme.shortvideo.model.MusicModel, com.ss.android.ugc.aweme.shortvideo.model.MusicModel):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LIZLLL(com.ss.android.ugc.aweme.creative.model.music.AVMusic r5, com.ss.android.ugc.aweme.creative.model.music.AVMusic r6) {
        /*
            java.util.List r1 = r5.getMergedMusicList()
            java.util.ArrayList r3 = new java.util.ArrayList
            r5 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r5)
            r3.<init>(r0)
            java.util.Iterator r2 = r1.iterator()
        L13:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L29
            java.lang.Object r0 = r2.next()
            com.ss.android.ugc.aweme.creative.model.music.AVMusic r0 = (com.ss.android.ugc.aweme.creative.model.music.AVMusic) r0
            long r0 = r0.id
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.add(r0)
            goto L13
        L29:
            java.util.List r0 = X.C13LP.LJJJJI(r3)
            long[] r4 = X.C13LP.LLIIIILZ(r0)
            if (r6 == 0) goto L5c
            java.util.List r1 = r6.getMergedMusicList()
            if (r1 == 0) goto L5c
            java.util.ArrayList r3 = new java.util.ArrayList
            int r0 = X.C15438062q.LJIJJ(r1, r5)
            r3.<init>(r0)
            java.util.Iterator r2 = r1.iterator()
        L46:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L5e
            java.lang.Object r0 = r2.next()
            com.ss.android.ugc.aweme.creative.model.music.AVMusic r0 = (com.ss.android.ugc.aweme.creative.model.music.AVMusic) r0
            long r0 = r0.id
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.add(r0)
            goto L46
        L5c:
            r0 = 0
            goto L68
        L5e:
            java.util.List r0 = X.C13LP.LJJJJI(r3)
            if (r0 == 0) goto L5c
            long[] r0 = X.C13LP.LLIIIILZ(r0)
        L68:
            boolean r0 = java.util.Arrays.equals(r4, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1419800n3C.LIZLLL(com.ss.android.ugc.aweme.creative.model.music.AVMusic, com.ss.android.ugc.aweme.creative.model.music.AVMusic):boolean");
    }
}
