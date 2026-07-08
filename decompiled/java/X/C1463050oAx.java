package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.services.IFoundationAVService;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.StickPointGetVideoFrameManager;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS0S0331000_22;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0oAx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1463050oAx implements InterfaceC1463300oBM {
    public final C19EG LIZ;
    public final InterfaceC1463240oBG LIZIZ;
    public final C1DRG LIZJ;
    public final Scene LIZLLL;
    public boolean LJ;
    public AVMusic LJFF;
    public volatile boolean LJI;
    public long LJII;
    public VideoPublishEditModel LJIIJ;
    public boolean LJIIL;
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(138));
    public final C01GW LJIIIZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(139));
    public final C01GW LJIIJJI = C452501pT.LIZIZ(new AwS566S0100000_22(this, 305));

    @Override // X.InterfaceC1463300oBM
    public final void LIZ() {
    }

    @Override // X.InterfaceC1463300oBM
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC1463300oBM
    public final List<VideoSegment> LIZJ() {
        return this.LIZIZ.R8();
    }

    public final C1463030oAv LJII() {
        return (C1463030oAv) this.LJIIIIZZ.getValue();
    }

    public final StickPointGetVideoFrameManager LJIIIZ() {
        return (StickPointGetVideoFrameManager) this.LJIIIZ.getValue();
    }

    public final List<VideoSegment> LJIIIIZZ() {
        List<VideoSegment> listLIZJ = LIZJ();
        if (C580130Mp9.LIZ(listLIZJ)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (VideoSegment videoSegment : listLIZJ) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            VideoSegment videoSegment2 = videoSegment;
            if (!videoSegment2.isDeleted && !videoSegment2.isGetVideoFrame) {
                HashSet<String> hashSet = LJIIIZ().LJIIJJI;
                String strLJFF = videoSegment2.LJFF(false);
                strLJFF.toString();
                if (!hashSet.contains(strLJFF)) {
                    C533730KwV c533730KwV = C533730KwV.LIZ;
                    String strLJFF2 = videoSegment2.LJFF(false);
                    c533730KwV.getClass();
                    if (!C533730KwV.LJIIJ(strLJFF2)) {
                        arrayList.add(videoSegment2);
                    }
                }
            }
            i = i2;
        }
        return arrayList;
    }

    @Override // X.InterfaceC1463300oBM
    public final void LIZLLL(List<Integer> list) {
        this.LIZIZ.LJJJ(list);
    }

    public final void LJIIJ(AVMusic aVMusic) {
        this.LJFF = aVMusic;
        LJII().LIZJ = aVMusic;
    }

    @Override // X.InterfaceC1463300oBM
    public final void LJ(int i, boolean z) {
        LJII().getClass();
        if (i != 6 && i != 7) {
            this.LIZIZ.a(LIZJ(), z);
        }
    }

    public final void LJFF(int i, int i2) {
        boolean z;
        C1463170oB9 c1463170oB9 = AbstractC1463010oAt.LLLII;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("changeMusicStartAndEnd,isMusicValid:");
        if (this.LJFF != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(",trimIn:");
        sbLIZ.append(i);
        sbLIZ.append(",trimOut:");
        sbLIZ.append(i2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1463170oB9.getClass();
        C1463170oB9.LIZ(strLIZIZ);
        if (this.LJFF == null) {
            return;
        }
        this.LIZIZ.LLLZI(true, false);
        LJII().LIZJ(this.LJFF, i, 2, false, new InterfaceC358010E1v() { // from class: X.0oBd
            @Override // X.InterfaceC358010E1v
            public final void onFailed() {
                this.LIZ.LIZIZ.LLILLL(false, true, true, false);
            }

            @Override // X.InterfaceC358010E1v
            public final void LIZ(int i3) {
                this.LIZ.LIZIZ.LLILLL(true, true, true, false);
                this.LIZ.LIZIZ.LLLLLLJ();
            }
        });
    }

    public C1463050oAx(C19EG c19eg, C1463020oAu c1463020oAu, C1DRG c1drg, C19A3 c19a3) {
        this.LIZ = c19eg;
        this.LIZIZ = c1463020oAu;
        this.LIZJ = c1drg;
        this.LIZLLL = c19a3;
    }

    public final void LJI(AVMusic aVMusic, final int i, final boolean z, final boolean z2, final boolean z3, final long j, final C557050Lt1 c557050Lt1, final Function1<? super Boolean, Unit> function1) {
        AbstractC1463010oAt.LLLII.getClass();
        C1463170oB9.LIZ("downloadMusicFile");
        if (c557050Lt1 != null && c557050Lt1.LIZIZ()) {
            this.LIZIZ.LLILLL(false, true, true, z3);
            if (function1 != null) {
                function1.invoke(Boolean.FALSE);
                return;
            }
            return;
        }
        C1420960n54 c1420960n54 = C1420960n54.LIZ;
        C19EG c19eg = this.LIZ;
        InterfaceC1420890n4x interfaceC1420890n4x = new InterfaceC1420890n4x() { // from class: X.0oB4
            @Override // X.InterfaceC1420890n4x
            public final void LIZ() {
            }

            @Override // X.InterfaceC1420890n4x
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC1420890n4x
            public final void LIZJ(AVMusic aVMusic2, boolean z4) {
                if (!z4) {
                    this.LIZ.LIZIZ.LLILLL(false, true, true, z3);
                    Function1<Boolean, Unit> function12 = function1;
                    if (function12 != null) {
                        function12.invoke(Boolean.FALSE);
                    }
                }
            }

            @Override // X.InterfaceC1420890n4x
            public final void LIZLLL(AVMusic aVMusic2, boolean z4) {
                C557050Lt1 c557050Lt12;
                if (!z4 || ((c557050Lt12 = c557050Lt1) != null && c557050Lt12.LIZIZ())) {
                    this.LIZ.LIZIZ.LLILLL(false, true, true, z3);
                    Function1<Boolean, Unit> function12 = function1;
                    if (function12 != null) {
                        function12.invoke(Boolean.FALSE);
                        return;
                    }
                    return;
                }
                AbstractC1463010oAt.LLLII.getClass();
                C1463170oB9.LIZ("startDefaultStickPoint");
                C1463050oAx c1463050oAx = this.LIZ;
                long j2 = j;
                AwS0S0331000_22 awS0S0331000_22 = new AwS0S0331000_22(c1463050oAx, aVMusic2, i, z3, function1, z, z2, 0);
                c1463050oAx.getClass();
                if (j2 < 0) {
                    awS0S0331000_22.invoke();
                    return;
                }
                long jCurrentTimeMillis = j2 - System.currentTimeMillis();
                if (jCurrentTimeMillis < 0) {
                    awS0S0331000_22.invoke();
                } else {
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C01TU(jCurrentTimeMillis, awS0S0331000_22, null), 3);
                }
            }
        };
        c1420960n54.getClass();
        C1420960n54.LIZJ(c19eg, aVMusic, interfaceC1420890n4x);
    }

    public static void LJIIJJI(final C1463050oAx c1463050oAx, AVMusic aVMusic, int i, boolean z, boolean z2, long j, C557050Lt1 c557050Lt1, Function1 function1, int i2) {
        boolean z3;
        boolean z4;
        CreativeModel creativeModel;
        boolean z5;
        boolean soundSyncFromAnchor;
        boolean shouldSkipMusicSync;
        float musicVolume;
        InterfaceC1463300oBM interfaceC1463300oBM;
        List<VideoSegment> listLIZJ;
        final Function1 function12 = function1;
        long j2 = j;
        final boolean z6 = z2;
        boolean z7 = z;
        C557050Lt1 c557050Lt12 = c557050Lt1;
        int i3 = i;
        if ((i2 & 2) != 0) {
            i3 = 0;
        }
        if ((i2 & 4) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((i2 & 8) != 0) {
            z7 = true;
        }
        if ((i2 & 16) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if ((i2 & 32) != 0) {
            z6 = false;
        }
        if ((i2 & 64) != 0) {
            j2 = -1;
        }
        if ((i2 & 128) != 0) {
            c557050Lt12 = null;
        }
        if ((i2 & 256) != 0) {
            function12 = null;
        }
        c1463050oAx.getClass();
        VideoPublishEditModel videoPublishEditModel = c1463050oAx.LJIIJ;
        if (videoPublishEditModel != null) {
            creativeModel = videoPublishEditModel.creativeModel;
        } else {
            creativeModel = null;
        }
        if (!C0L0X.LIZ(creativeModel)) {
            C1463170oB9 c1463170oB9 = AbstractC1463010oAt.LLLII;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("startMusicSync,isMusicValid:");
            if (aVMusic != null) {
                z5 = true;
            } else {
                z5 = false;
            }
            sbLIZ.append(z5);
            sbLIZ.append(",start:");
            sbLIZ.append(i3);
            sbLIZ.append(",updateAlgorithm:");
            sbLIZ.append(z3);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c1463170oB9.getClass();
            C1463170oB9.LIZ(strLIZIZ);
            VideoPublishEditModel videoPublishEditModel2 = c1463050oAx.LJIIJ;
            if (videoPublishEditModel2 != null) {
                soundSyncFromAnchor = videoPublishEditModel2.getSoundSyncFromAnchor();
            } else {
                soundSyncFromAnchor = false;
            }
            VideoPublishEditModel videoPublishEditModel3 = c1463050oAx.LJIIJ;
            if (videoPublishEditModel3 != null) {
                shouldSkipMusicSync = videoPublishEditModel3.getShouldSkipMusicSync();
            } else {
                shouldSkipMusicSync = true;
            }
            if (soundSyncFromAnchor && shouldSkipMusicSync) {
                c1463050oAx.LJIIJ(aVMusic);
                c1463050oAx.LIZIZ.LLILLL(true, z7, z4, z6);
                c1463050oAx.LJ(2, z6);
                VideoPublishEditModel videoPublishEditModel4 = c1463050oAx.LJIIJ;
                if (videoPublishEditModel4 != null) {
                    videoPublishEditModel4.setShouldSkipMusicSync(false);
                }
                if (function12 != null) {
                    function12.invoke(Boolean.TRUE);
                }
                c1463050oAx.LIZIZ.LLLLLLJ();
                return;
            }
            if (aVMusic == null) {
                C1463170oB9.LIZ("cancelMusicSync");
                c1463050oAx.LJIIJ(null);
                VideoPublishEditModel videoPublishEditModel5 = c1463050oAx.LJIIJ;
                if (videoPublishEditModel5 != null) {
                    musicVolume = videoPublishEditModel5.getMusicVolume();
                } else {
                    musicVolume = 1.0f;
                }
                c1463050oAx.LJII().LIZIZ(musicVolume);
                C1463030oAv c1463030oAvLJII = c1463050oAx.LJII();
                c1463030oAvLJII.getClass();
                C533730KwV.LIZ.getClass();
                if (C1444820nhY.LIZIZ && (interfaceC1463300oBM = c1463030oAvLJII.LJI) != null && (listLIZJ = interfaceC1463300oBM.LIZJ()) != null) {
                    for (VideoSegment videoSegment : listLIZJ) {
                        C533730KwV c533730KwV = C533730KwV.LIZ;
                        String strLJFF = videoSegment.LJFF(false);
                        c533730KwV.getClass();
                        if (C533730KwV.LJIIJ(strLJFF)) {
                            videoSegment.duration = 3000L;
                        }
                    }
                }
                c1463050oAx.LJ = false;
                if (function12 == null) {
                    return;
                }
                function12.invoke(Boolean.TRUE);
                return;
            }
            if (z6) {
                c1463050oAx.LJIIL = true;
            }
            if (c557050Lt12 != null && c557050Lt12.LIZIZ()) {
                if (function12 == null) {
                    return;
                }
                function12.invoke(Boolean.FALSE);
            } else {
                final C1463130oB5 c1463130oB5 = new C1463130oB5(c557050Lt12, c1463050oAx, z6, function12, aVMusic, z3, i3, z7, z4, j2);
                c1463050oAx.LIZIZ.LLLZI(z7, z6);
                if (C1444820nhY.LIZ) {
                    c1463130oB5.invoke();
                } else {
                    C1660660tJg.LIZ().LIZIZ(new IFoundationAVService.IFetchResourcesListener() { // from class: X.0oBE
                        @Override // com.ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
                        public final void onFailed(Exception exc) {
                            C201955140j.LIZ("downloadResourceFinderModelFile failed when start music sync");
                            Function1<Boolean, Unit> function13 = function12;
                            if (function13 != null) {
                                function13.invoke(Boolean.FALSE);
                            }
                            c1463050oAx.LIZIZ.LLILLL(false, true, true, z6);
                        }

                        @Override // com.ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
                        public final void onSuccess(String[] strArr) {
                            c1463130oB5.invoke();
                        }
                    });
                }
            }
        }
    }
}
