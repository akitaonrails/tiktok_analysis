package Y;

import X.C09JN;
import X.C11PQ;
import X.C1458410o3T;
import X.C1C7U;
import X.C204607154j;

/* JADX INFO: loaded from: classes23.dex */
public class AfS6S0000100_22 implements C09JN {
    public final int $t;
    public long j0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public AfS6S0000100_22(long j, int i) {
        this.$t = i;
        this.j0 = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$0(Y.AfS6S0000100_22 r14, java.lang.Object r15) {
        /*
            java.lang.String r4 = "AIChooseMusicManager@73c4.preloadAIMusic$1"
            X.C1C7U.LIZ(r4)
            com.ss.android.ugc.aweme.shortvideo.model.SuggestMusicList r15 = (com.ss.android.ugc.aweme.shortvideo.model.SuggestMusicList) r15
            X.0o3T r0 = X.C1458410o3T.LIZ
            r0.getClass()
            X.11PQ<X.154j> r1 = X.C1458410o3T.LIZLLL
            if (r1 == 0) goto L3a
            X.154j r5 = new X.154j
            java.util.List<com.ss.android.ugc.aweme.shortvideo.model.MusicModel> r6 = r15.musicList
            long r7 = java.lang.System.currentTimeMillis()
            long r2 = r14.j0
            long r7 = r7 - r2
            java.lang.Integer r0 = r15.musicType
            if (r0 == 0) goto L3e
            int r0 = r0.intValue()
            r9 = 2
            if (r0 != r9) goto L3e
        L26:
            int r10 = r15.cursor
            boolean r11 = r15.hasMore
            java.lang.Boolean r0 = r15.fromRecommend
            boolean r12 = r0.booleanValue()
            r13 = 0
            r15 = 448(0x1c0, float:6.28E-43)
            r14 = r13
            r5.<init>(r6, r7, r9, r10, r11, r12, r13, r14, r15)
            r1.onNext(r5)
        L3a:
            X.C1C7U.LIZIZ(r4)
            return
        L3e:
            r9 = 3
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS6S0000100_22.accept$0(Y.AfS6S0000100_22, java.lang.Object):void");
    }

    public static final void accept$1(AfS6S0000100_22 afS6S0000100_22, Object obj) {
        C1C7U.LIZ("AIChooseMusicManager@73c4.preloadAIMusic$2");
        C1458410o3T.LIZ.getClass();
        C11PQ<C204607154j> c11pq = C1458410o3T.LIZLLL;
        if (c11pq != null) {
            c11pq.onNext(new C204607154j(null, System.currentTimeMillis() - afS6S0000100_22.j0, 1, 0, false, false, null, null, 504));
        }
        C1C7U.LIZIZ("AIChooseMusicManager@73c4.preloadAIMusic$2");
    }
}
