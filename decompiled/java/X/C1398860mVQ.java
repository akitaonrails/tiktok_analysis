package X;

import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0mVQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1398860mVQ extends C09AY implements Function2<VideoMusicCoverAssem, C291001Au<? extends C0R9E>, Unit> {
    public C1398860mVQ() {
        super(2);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke(com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverAssem r6, X.C291001Au<? extends X.C0R9E> r7) {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverAssem r6 = (com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverAssem) r6
            if (r7 == 0) goto L5f
            boolean r0 = X.C1398490mUp.LIZ()
            r4 = 0
            if (r0 == 0) goto L31
            r6.Up()
            android.animation.AnimatorSet r0 = r6.LLLLL
            if (r0 == 0) goto L64
            boolean r1 = r0.isRunning()
            r0 = 1
            if (r1 != r0) goto L64
        L19:
            X.0Nzd r0 = X.C612110Nzd.LIZ
            r0.getClass()
            java.lang.String r0 = "music_marquee_strategy_repo"
            com.bytedance.keva.Keva r3 = com.bytedance.keva.Keva.getRepo(r0)
            java.lang.String r0 = "key_music_cover_animation_show_time"
            java.lang.String r2 = X.C612110Nzd.LIZ(r0)
            long r0 = java.lang.System.currentTimeMillis()
            r3.storeLong(r2, r0)
        L31:
            boolean r0 = X.C690950R8j.LIZIZ
            if (r0 != 0) goto L55
            com.ss.android.ugc.aweme.search.copyrightmute.ISearchCopyrightMuteService r2 = r6.Ep()
            X.0Sb3 r0 = r6.LLJI
            r1 = 0
            if (r0 == 0) goto L62
            java.lang.Object r0 = r0.LL
        L40:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            r0.getAweme()
            X.0Sb3 r0 = r6.LLJI
            if (r0 == 0) goto L4b
            java.lang.Object r1 = r0.LL
        L4b:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r1 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r1
            java.lang.String r0 = r1.mEventType
            boolean r0 = r2.LIZLLL(r0)
            if (r0 == 0) goto L5c
        L55:
            r6.LLLLLZ = r4
            java.lang.String r0 = "holder_unselect"
            r6.pq(r0)
        L5c:
            r6.Vp()
        L5f:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L62:
            r0 = r1
            goto L40
        L64:
            boolean r0 = r6.LLLLJI
            if (r0 == 0) goto L31
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1398860mVQ.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
