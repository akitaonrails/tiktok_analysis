package X;

import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.MusicSong;

/* JADX INFO: renamed from: X.0Twq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C763260Twq {
    public static AbstractC765580U1k LIZIZ;
    public static int LIZJ;
    public static boolean LIZLLL;
    public static MusicSong LJ;
    public static String LJFF;
    public static long LJI;
    public static boolean LJIIIIZZ;
    public static boolean LJIIIZ;
    public static boolean LJIIJ;
    public static boolean LJIIJJI;
    public static boolean LJIIL;
    public static boolean LJIILIIL;
    public static MusicSong LJIILJJIL;
    public static String LJIILL;
    public static boolean LJIILLIIL;
    public static boolean LJIIZILJ;
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(289));
    public static long LJII = 1;

    public static AbstractC765580U1k LIZIZ() {
        AbstractC765580U1k abstractC765580U1kLJII = LIZIZ;
        if (abstractC765580U1kLJII == null) {
            InterfaceC769940UIe interfaceC769940UIe = (InterfaceC769940UIe) DataChannelGlobal.LLILZ.gg0(C930890aKd.class);
            if (interfaceC769940UIe == null || (abstractC765580U1kLJII = interfaceC769940UIe.LJII()) == null) {
                return null;
            }
            abstractC765580U1kLJII.LLJIJIL(new InterfaceC765610U1n() { // from class: X.0Twr
                @Override // X.InterfaceC765600U1m
                public final void start() {
                    if (Intrinsics.LJFF(DataChannelGlobal.LLILZ.gg0(C930730aKN.class), Boolean.FALSE)) {
                        C763260Twq.LJIIZILJ = true;
                        C763260Twq.LJII(true);
                        C763230Twn.LIZLLL();
                        C473410IhP.LIZIZ(new Runnable() { // from class: X.0Tws
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("BGMPlayerManager@3090.getAudioFilterManager$1$1$start$1");
                                try {
                                    Iterator it2 = C763260Twq.LIZJ().iterator();
                                    while (it2.hasNext()) {
                                        ((InterfaceC763330Twx) it2.next()).WE();
                                    }
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("BGMPlayerManager@3090.getAudioFilterManager$1$1$start$1");
                            }
                        });
                        C1276840jKc.LIZ.getClass();
                        C1276840jKc.LJJJI(true);
                    }
                }

                @Override // X.InterfaceC765600U1m
                public final void stop() {
                    if (C763260Twq.LIZJ != 0) {
                        C763230Twn.LIZJ(C763260Twq.LIZJ, "1");
                    }
                    C763260Twq.LIZJ = 0;
                    C763260Twq.LJII(false);
                    C473410IhP.LIZIZ(new Runnable() { // from class: X.0Twu
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("BGMPlayerManager@3090.getAudioFilterManager$1$1$stop$1");
                            try {
                                Iterator it2 = C763260Twq.LIZJ().iterator();
                                while (it2.hasNext()) {
                                    ((InterfaceC763330Twx) it2.next()).zk();
                                }
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("BGMPlayerManager@3090.getAudioFilterManager$1$1$stop$1");
                        }
                    });
                    C1276840jKc.LIZ.getClass();
                    C1276840jKc.LJJJI(false);
                    C486790J7d.LIZLLL(new Runnable() { // from class: X.0Tww
                        public static void LIZ() {
                            if (C763260Twq.LJIIJ) {
                                C768300UBw.LJIIJJI(Long.valueOf(C763260Twq.LJI), Long.valueOf(System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)), 2L, null);
                            } else {
                                C768300UBw.LJIIJJI(Long.valueOf(C763260Twq.LJI), Long.valueOf(System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)), 1L, null);
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("BGMPlayerManager@3090.getAudioFilterManager$1$1$stop$2");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("BGMPlayerManager@3090.getAudioFilterManager$1$1$stop$2");
                        }
                    }, null, 300L);
                    C763260Twq.LJIIJ = false;
                }

                @Override // X.InterfaceC765600U1m
                public final void onProgress(long j) {
                    C763260Twq.LIZJ = (int) (j / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                }

                @Override // X.InterfaceC765610U1n
                public final void J(int i, Exception exc) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("BGM-onError: ");
                    sbLIZ.append(i);
                    sbLIZ.append(", ");
                    sbLIZ.append(exc.getMessage());
                    C20441214yg.LJ("BGMPlayerManager", C2188811AlT.LIZIZ(sbLIZ));
                }
            });
            abstractC765580U1kLJII.LLJJ();
            abstractC765580U1kLJII.LLJILJIL(InterfaceC766480U4w.LJJIJIIJIL.LIZIZ().floatValue());
            abstractC765580U1kLJII.LLJJI(true);
            abstractC765580U1kLJII.LLJILJILJ();
            abstractC765580U1kLJII.LLIZLLLIL();
            LIZIZ = abstractC765580U1kLJII;
        }
        return abstractC765580U1kLJII;
    }

    public static Set LIZJ() {
        return (Set) LIZ.getValue();
    }

    public static void LIZ(InterfaceC763330Twx interfaceC763330Twx) {
        LIZJ().add(interfaceC763330Twx);
    }

    public static void LJI(boolean z) {
        if (!z) {
            if (LIZLLL) {
                return;
            }
        } else {
            LIZLLL = false;
        }
        AbstractC765580U1k abstractC765580U1kLIZIZ = LIZIZ();
        if (abstractC765580U1kLIZIZ != null) {
            abstractC765580U1kLIZIZ.setEnable(true);
            abstractC765580U1kLIZIZ.resume();
        }
        LJII(true);
        C473410IhP.LIZIZ(new Runnable() { // from class: X.0Twv
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("BGMPlayerManager@3090.resume$2");
                try {
                    Iterator it2 = C763260Twq.LIZJ().iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC763330Twx) it2.next()).WE();
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("BGMPlayerManager@3090.resume$2");
            }
        });
        LJI = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getBroadcastScene();
        if (Intrinsics.LJFF(DataChannelGlobal.LLILZ.gg0(C930730aKN.class), Boolean.FALSE) && !LJIIJJI) {
            LJII = 2L;
        }
        C768300UBw.LJIIJJI(Long.valueOf(LJI), null, null, Long.valueOf(LJII));
        LJII = 1L;
        if (InterfaceC766480U4w.LJIILL.LIZIZ().booleanValue() && LIZJ == 0) {
            C763230Twn.LIZLLL();
        }
    }

    public static void LJII(boolean z) {
        boolean z2 = LJIIIZ;
        if (!z && !z2) {
            ConcurrentHashSet<C0U3Q> concurrentHashSet = C0U3P.LIZ;
            C0U3P.LJ(C0U3Q.BGM);
        } else {
            ConcurrentHashSet<C0U3Q> concurrentHashSet2 = C0U3P.LIZ;
            C0U3P.LIZLLL(C0U3Q.BGM);
        }
        LJIIL = z;
    }

    public static void LIZLLL(boolean z, boolean z2) {
        if (!LJIIL) {
            return;
        }
        if (z && !z2) {
            LIZLLL = true;
        }
        AbstractC765580U1k abstractC765580U1kLIZIZ = LIZIZ();
        if (abstractC765580U1kLIZIZ != null) {
            abstractC765580U1kLIZIZ.pause();
        }
        LJII(false);
        C473410IhP.LIZIZ(new Runnable() { // from class: X.0Two
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("BGMPlayerManager@3090.pause$1");
                try {
                    Iterator it2 = C763260Twq.LIZJ().iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC763330Twx) it2.next()).onPlayerPause();
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("BGMPlayerManager@3090.pause$1");
            }
        });
        if (z && !LJIIIIZZ) {
            LJII = 2L;
            C768300UBw.LJIIJJI(Long.valueOf(LJI), Long.valueOf(System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)), 4L, null);
        }
        if (LJIIJ) {
            C768300UBw.LJIIJJI(Long.valueOf(LJI), Long.valueOf(System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)), 2L, null);
        }
    }

    public static void LJFF(MusicSong musicSong, String str) {
        Long lValueOf;
        Long lValueOf2;
        String str2;
        String str3;
        String str4;
        Long lValueOf3;
        Long lValueOf4;
        if (!LJIIL) {
            MusicSong musicSong2 = LJ;
            if (musicSong2 != null) {
                lValueOf3 = Long.valueOf(musicSong2.id);
            } else {
                lValueOf3 = null;
            }
            if (musicSong != null) {
                lValueOf4 = Long.valueOf(musicSong.id);
            } else {
                lValueOf4 = null;
            }
            if (!Intrinsics.LJFF(lValueOf3, lValueOf4) && LIZLLL) {
                C768300UBw.LJIIJJI(Long.valueOf(LJI), Long.valueOf(System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)), 2L, null);
            }
        }
        MusicSong musicSong3 = LJ;
        if (musicSong3 != null) {
            Long lValueOf5 = Long.valueOf(musicSong3.id);
            if (musicSong != null) {
                lValueOf = Long.valueOf(musicSong.id);
            } else {
                lValueOf = null;
            }
            if (!Intrinsics.LJFF(lValueOf5, lValueOf)) {
                if (LIZJ != 0) {
                    MusicSong musicSong4 = LJ;
                    int i = LIZJ;
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_ksong_play_duration");
                    c474500IjALIZ.LJIL();
                    c474500IjALIZ.LJJII(CardStruct.IStatusCode.DEFAULT, "is_finish");
                    if (musicSong4 != null) {
                        lValueOf2 = Long.valueOf(musicSong4.id);
                    } else {
                        lValueOf2 = null;
                    }
                    c474500IjALIZ.LJJII(lValueOf2, "music_id");
                    if (musicSong4 != null) {
                        str2 = musicSong4.title;
                    } else {
                        str2 = null;
                    }
                    c474500IjALIZ.LJJII(str2, "music_name");
                    if (musicSong4 != null) {
                        str3 = musicSong4.author;
                    } else {
                        str3 = null;
                    }
                    c474500IjALIZ.LJJII(str3, "artist_name");
                    if (musicSong4 != null) {
                        str4 = musicSong4.previewUrl;
                    } else {
                        str4 = null;
                    }
                    c474500IjALIZ.LJJII(str4, "music_url");
                    c474500IjALIZ.LJJII(C763230Twn.LIZIZ, "select_scene");
                    c474500IjALIZ.LJJII(Integer.valueOf(i), "duration");
                    c474500IjALIZ.LIZ();
                }
                LIZJ = 0;
                LIZLLL = false;
            }
        }
        LJ = musicSong;
        LJFF = str;
        AbstractC765580U1k abstractC765580U1kLIZIZ = LIZIZ();
        if (abstractC765580U1kLIZIZ != null) {
            abstractC765580U1kLIZIZ.setEnable(true);
            abstractC765580U1kLIZIZ.LLJ(str);
            if (!LJIIL && !Intrinsics.LJFF(DataChannelGlobal.LLILZ.gg0(C930730aKN.class), Boolean.TRUE)) {
                abstractC765580U1kLIZIZ.resume();
                LJII(true);
                C473410IhP.LIZIZ(new Runnable() { // from class: X.0Twt
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("BGMPlayerManager@3090.play$1$2");
                        try {
                            Iterator it2 = C763260Twq.LIZJ().iterator();
                            while (it2.hasNext()) {
                                ((InterfaceC763330Twx) it2.next()).WE();
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("BGMPlayerManager@3090.play$1$2");
                    }
                });
                LJI = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                LJII = 1L;
                C768300UBw.LJIIJJI(Long.valueOf(LJI), null, null, Long.valueOf(LJII));
                LJIIJ = false;
                return;
            }
            abstractC765580U1kLIZIZ.pause();
            LJII(false);
            C473410IhP.LIZIZ(new Runnable() { // from class: X.0Twp
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("BGMPlayerManager@3090.play$1$1");
                    try {
                        Iterator it2 = C763260Twq.LIZJ().iterator();
                        while (it2.hasNext()) {
                            ((InterfaceC763330Twx) it2.next()).onPlayerPause();
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("BGMPlayerManager@3090.play$1$1");
                }
            });
        }
    }
}
