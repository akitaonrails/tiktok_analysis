package X;

import android.content.Context;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS261S0000000_22;

/* JADX INFO: renamed from: X.0nIM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1429200nIM extends AbstractC1429240nIQ {
    public final C1429160nII LIZIZ;
    public final InterfaceC1428880nHq LIZJ;
    public final Map<EnumC1429270nIT, List<EnumC1429270nIT>> LIZLLL;
    public Map<EnumC1429270nIT, InterfaceC1429290nIV> LJ;

    @Override // X.InterfaceC1429290nIV
    public final boolean LIZIZ() {
        return false;
    }

    public final void LJI() {
        for (InterfaceC1429290nIV interfaceC1429290nIV : ((LinkedHashMap) this.LJ).values()) {
            if (interfaceC1429290nIV.getTaskStatus() == EnumC1429260nIS.EXECUTING) {
                interfaceC1429290nIV.cancel();
            }
        }
    }

    @Override // X.AbstractC1429240nIQ, X.InterfaceC1429290nIV
    public final void cancel() {
        this.LIZ = EnumC1429260nIS.CANCELED;
        LJI();
    }

    @Override // X.InterfaceC1429290nIV
    public final EnumC1429270nIT getTaskType() {
        return EnumC1429270nIT.DOWNLOAD_MUSIC;
    }

    @Override // X.AbstractC1429240nIQ
    public final void LIZJ(InterfaceC1429300nIW interfaceC1429300nIW) {
        AVMusic aVMusic;
        String musicId;
        AbstractC1429240nIQ c1429190nIL;
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start DownloadMusicTask: musicId = ");
        sbLIZ.append(this.LIZIZ.LIZIZ);
        sbLIZ.append(", musicUrl = ");
        sbLIZ.append(this.LIZIZ.LIZJ);
        sbLIZ.append(", musicPostUnavailable = ");
        sbLIZ.append(this.LIZIZ.LJ);
        sbLIZ.append(", avMusic = ");
        AVMusic aVMusic2 = this.LIZIZ.LIZLLL;
        String musicId2 = null;
        if (aVMusic2 != null) {
            musicId2 = aVMusic2.getMusicId();
        }
        sbLIZ.append(musicId2);
        C201955140j.LJIILJJIL(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1429300nIW interfaceC1429300nIW2 = new InterfaceC1429300nIW() { // from class: X.0nIN
            @Override // X.InterfaceC1429300nIW
            public final void LIZIZ(EnumC1429270nIT enumC1429270nIT) {
                InterfaceC1428880nHq interfaceC1428880nHq;
                InterfaceC1428880nHq interfaceC1428880nHq2;
                if (enumC1429270nIT == EnumC1429270nIT.FETCH_MUSIC && (interfaceC1428880nHq2 = this.LIZ.LIZJ) != null) {
                    interfaceC1428880nHq2.LJIIIIZZ();
                }
                if (enumC1429270nIT == EnumC1429270nIT.DOWNLOAD_MUSIC_FROM_URL && (interfaceC1428880nHq = this.LIZ.LIZJ) != null) {
                    interfaceC1428880nHq.LJ();
                }
            }

            @Override // X.InterfaceC1429300nIW
            public final void LIZJ(EnumC1429270nIT enumC1429270nIT) {
                InterfaceC1428880nHq interfaceC1428880nHq;
                C1429200nIM c1429200nIM;
                InterfaceC1428880nHq interfaceC1428880nHq2;
                if (enumC1429270nIT == EnumC1429270nIT.FETCH_MUSIC && (interfaceC1428880nHq2 = (c1429200nIM = this.LIZ).LIZJ) != null) {
                    interfaceC1428880nHq2.LIZLLL(c1429200nIM.LIZIZ.LIZLLL);
                }
                if ((enumC1429270nIT == EnumC1429270nIT.DOWNLOAD_MUSIC_FROM_URL || enumC1429270nIT == EnumC1429270nIT.DOWNLOAD_MUSIC_FROM_MODEL) && (interfaceC1428880nHq = this.LIZ.LIZJ) != null) {
                    interfaceC1428880nHq.LJI();
                }
                if (enumC1429270nIT == EnumC1429270nIT.DOWNLOAD_MUSIC) {
                    C1429200nIM c1429200nIM2 = this.LIZ;
                    C1429160nII c1429160nII = c1429200nIM2.LIZIZ;
                    String str = c1429160nII.LJFF;
                    AVMusic aVMusic3 = c1429160nII.LIZLLL;
                    Boolean bool = c1429160nII.LJ;
                    if (str != null && aVMusic3 != null && bool != null) {
                        InterfaceC1428880nHq interfaceC1428880nHq3 = c1429200nIM2.LIZJ;
                        if (interfaceC1428880nHq3 != null) {
                            interfaceC1428880nHq3.LJFF(aVMusic3, str, c1429160nII.LJI, bool.booleanValue());
                            return;
                        }
                        return;
                    }
                    c1429200nIM2.LIZLLL(this, true);
                    return;
                }
                C1429200nIM c1429200nIM3 = this.LIZ;
                List<? extends InterfaceC1429290nIV> listLIZ = C1429250nIR.LIZ(c1429200nIM3.LIZLLL, c1429200nIM3.LJ);
                C1398350mUb c1398350mUb2 = C1398350mUb.LIZIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onTaskSuccess: tasksToRun: ");
                sbLIZ2.append(C13LP.LJJLIIIJ(listLIZ, null, null, null, 0, null, AFwS261S0000000_22.get$arr$(356), 31));
                sbLIZ2.append("\ntasks = ");
                sbLIZ2.append(C13LP.LJJLIIIJ(((LinkedHashMap) this.LIZ.LJ).values(), null, null, null, 0, null, AFwS261S0000000_22.get$arr$(357), 31));
                C201955140j.LJIILJJIL(c1398350mUb2, C2188811AlT.LIZIZ(sbLIZ2));
                if (this.LIZ.LJII(listLIZ)) {
                    Collection collectionValues = ((LinkedHashMap) this.LIZ.LJ).values();
                    if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                        Iterator it2 = collectionValues.iterator();
                        while (it2.hasNext()) {
                            if (((InterfaceC1429290nIV) it2.next()).getTaskStatus() == EnumC1429260nIS.NONE) {
                                this.LIZ.LIZLLL(this, true);
                                return;
                            }
                        }
                    }
                    this.LIZ.LJFF(this);
                    return;
                }
                Iterator it3 = ((ArrayList) listLIZ).iterator();
                while (it3.hasNext()) {
                    ((InterfaceC1429290nIV) it3.next()).LIZ(this);
                }
            }

            @Override // X.InterfaceC1429300nIW
            public final void LIZ(EnumC1429270nIT enumC1429270nIT, boolean z) {
                InterfaceC1428880nHq interfaceC1428880nHq;
                EnumC1429260nIS taskStatus;
                C1429200nIM c1429200nIM;
                InterfaceC1428880nHq interfaceC1428880nHq2;
                C1429200nIM c1429200nIM2;
                InterfaceC1428880nHq interfaceC1428880nHq3;
                EnumC1429270nIT enumC1429270nIT2 = EnumC1429270nIT.FETCH_MUSIC;
                if (enumC1429270nIT == enumC1429270nIT2 && (interfaceC1428880nHq3 = (c1429200nIM2 = this.LIZ).LIZJ) != null) {
                    interfaceC1428880nHq3.LIZIZ(c1429200nIM2.LIZIZ.LJIIIZ);
                }
                if ((enumC1429270nIT == EnumC1429270nIT.DOWNLOAD_MUSIC_FROM_URL || enumC1429270nIT == EnumC1429270nIT.DOWNLOAD_MUSIC_FROM_MODEL) && (interfaceC1428880nHq = this.LIZ.LIZJ) != null) {
                    interfaceC1428880nHq.LIZJ();
                }
                if (enumC1429270nIT != EnumC1429270nIT.DOWNLOAD_MUSIC && !z) {
                    C1429200nIM c1429200nIM3 = this.LIZ;
                    List<? extends InterfaceC1429290nIV> listLIZ = C1429250nIR.LIZ(c1429200nIM3.LIZLLL, c1429200nIM3.LJ);
                    C1398350mUb c1398350mUb2 = C1398350mUb.LIZIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onTaskFailure: tasksToRun: ");
                    sbLIZ2.append(C13LP.LJJLIIIJ(listLIZ, null, null, null, 0, null, AFwS261S0000000_22.get$arr$(354), 31));
                    sbLIZ2.append("\ntasks = ");
                    sbLIZ2.append(C13LP.LJJLIIIJ(((LinkedHashMap) this.LIZ.LJ).values(), null, null, null, 0, null, AFwS261S0000000_22.get$arr$(355), 31));
                    C201955140j.LJII(c1398350mUb2, C2188811AlT.LIZIZ(sbLIZ2));
                    if (this.LIZ.LJII(listLIZ)) {
                        this.LIZ.LIZLLL(this, true);
                        return;
                    }
                    Iterator it2 = ((ArrayList) listLIZ).iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC1429290nIV) it2.next()).LIZ(this);
                    }
                    return;
                }
                C1398350mUb c1398350mUb3 = C1398350mUb.LIZIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("onTaskFailure final: ");
                sbLIZ3.append(this.LIZ.LIZIZ.LJII);
                sbLIZ3.append(" - ");
                sbLIZ3.append(this.LIZ.LIZIZ.LJIIIIZZ);
                C201955140j.LJII(c1398350mUb3, C2188811AlT.LIZIZ(sbLIZ3));
                this.LIZ.LJI();
                InterfaceC1429290nIV interfaceC1429290nIV = (InterfaceC1429290nIV) ((LinkedHashMap) this.LIZ.LJ).get(enumC1429270nIT2);
                if (interfaceC1429290nIV != null) {
                    taskStatus = interfaceC1429290nIV.getTaskStatus();
                } else {
                    taskStatus = null;
                }
                if (taskStatus == EnumC1429260nIS.FAILED && (interfaceC1428880nHq2 = (c1429200nIM = this.LIZ).LIZJ) != null) {
                    interfaceC1428880nHq2.LIZIZ(c1429200nIM.LIZIZ.LJIIIZ);
                }
                C1429200nIM c1429200nIM4 = this.LIZ;
                InterfaceC1428880nHq interfaceC1428880nHq4 = c1429200nIM4.LIZJ;
                if (interfaceC1428880nHq4 != null) {
                    C1429160nII c1429160nII = c1429200nIM4.LIZIZ;
                    interfaceC1428880nHq4.LIZ(c1429160nII.LJII, c1429160nII.LJIIIIZZ);
                }
            }
        };
        String str = this.LIZIZ.LIZIZ;
        if ((str == null || str.length() == 0) && ((aVMusic = this.LIZIZ.LIZLLL) == null || (musicId = aVMusic.getMusicId()) == null || musicId.length() == 0)) {
            LIZLLL(interfaceC1429300nIW2, true);
            return;
        }
        Map<EnumC1429270nIT, List<EnumC1429270nIT>> map = this.LIZLLL;
        final C1429160nII c1429160nII = this.LIZIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (EnumC1429270nIT enumC1429270nIT : map.keySet()) {
            int i = C1429280nIU.LIZ[enumC1429270nIT.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            c1429190nIL = new AbstractC1429240nIQ(c1429160nII) { // from class: X.0nIG
                                public final C1429160nII LIZIZ;

                                @Override // X.InterfaceC1429290nIV
                                public final boolean LIZIZ() {
                                    return false;
                                }

                                @Override // X.InterfaceC1429290nIV
                                public final EnumC1429270nIT getTaskType() {
                                    return EnumC1429270nIT.BUILD_MUSIC_MODEL;
                                }

                                {
                                    this.LIZIZ = c1429160nII;
                                }

                                @Override // X.AbstractC1429240nIQ
                                public final void LIZJ(InterfaceC1429300nIW interfaceC1429300nIW3) {
                                    String str2;
                                    UrlModel playUrl;
                                    List<String> urlList;
                                    UrlModel playUrl2;
                                    List<String> urlList2;
                                    UrlModel playUrl3;
                                    C1398350mUb c1398350mUb2 = C1398350mUb.LIZIZ;
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("start BuildMusicModelTask: musicId = ");
                                    sbLIZ2.append(this.LIZIZ.LIZIZ);
                                    sbLIZ2.append(", musicUrl = ");
                                    sbLIZ2.append(this.LIZIZ.LIZJ);
                                    sbLIZ2.append(", musicPostUnavailable = ");
                                    sbLIZ2.append(this.LIZIZ.LJ);
                                    sbLIZ2.append(", avMusic = ");
                                    AVMusic aVMusic3 = this.LIZIZ.LIZLLL;
                                    if (aVMusic3 != null) {
                                        str2 = aVMusic3.musicName;
                                    } else {
                                        str2 = null;
                                    }
                                    sbLIZ2.append(str2);
                                    sbLIZ2.append(", musicPath = ");
                                    sbLIZ2.append(this.LIZIZ.LJFF);
                                    C201955140j.LJIILJJIL(c1398350mUb2, C2188811AlT.LIZIZ(sbLIZ2));
                                    C1429160nII c1429160nII2 = this.LIZIZ;
                                    AVMusic aVMusic4 = c1429160nII2.LIZLLL;
                                    String str3 = c1429160nII2.LJFF;
                                    if (str3 != null && str3.length() != 0) {
                                        if (!C2286708xd.LIZJ(str3)) {
                                            this.LIZIZ.LJII = -10003;
                                            this.LIZIZ.LJIIIIZZ = "musicFile not exist";
                                            if (interfaceC1429300nIW3 != null) {
                                                LIZLLL(interfaceC1429300nIW3, true);
                                                return;
                                            }
                                            return;
                                        }
                                        C1429160nII c1429160nII3 = this.LIZIZ;
                                        if (c1429160nII3.LJ == null) {
                                            c1429160nII3.LJ = Boolean.TRUE;
                                        }
                                        if (aVMusic4 == null) {
                                            C1428920nHu c1428920nHu = C1428920nHu.LIZ;
                                            String str4 = c1429160nII3.LIZIZ;
                                            Context context = c1429160nII3.LIZ;
                                            c1428920nHu.getClass();
                                            AVMusic aVMusicLIZ = C1428920nHu.LIZ(context, str3, str4, null);
                                            if (aVMusicLIZ == null) {
                                                this.LIZIZ.LJII = -10006;
                                                this.LIZIZ.LJIIIIZZ = "build music model failed";
                                                if (interfaceC1429300nIW3 != null) {
                                                    LIZLLL(interfaceC1429300nIW3, true);
                                                    return;
                                                }
                                                return;
                                            }
                                            LJI(aVMusicLIZ, this.LIZIZ.LIZIZ);
                                            this.LIZIZ.LIZLLL = aVMusicLIZ;
                                            if (interfaceC1429300nIW3 != null) {
                                                LJFF(interfaceC1429300nIW3);
                                                return;
                                            }
                                            return;
                                        }
                                        C1428920nHu.LIZ.getClass();
                                        if (C1428920nHu.LIZJ(aVMusic4)) {
                                            C201955140j.LJIILJJIL(c1398350mUb2, "BuildMusicModelTask: isPrivateClipInFullSong");
                                            C1429160nII c1429160nII4 = this.LIZIZ;
                                            AVMusic aVMusicLIZ2 = C1428920nHu.LIZ(c1429160nII4.LIZ, str3, c1429160nII4.LIZIZ, aVMusic4.musicName);
                                            if (aVMusicLIZ2 == null) {
                                                this.LIZIZ.LJII = -10007;
                                                this.LIZIZ.LJIIIIZZ = "build music model failed";
                                                if (interfaceC1429300nIW3 != null) {
                                                    LIZLLL(interfaceC1429300nIW3, true);
                                                    return;
                                                }
                                                return;
                                            }
                                            LJI(aVMusicLIZ2, this.LIZIZ.LIZIZ);
                                            this.LIZIZ.LIZLLL = aVMusicLIZ2;
                                            if (interfaceC1429300nIW3 != null) {
                                                LJFF(interfaceC1429300nIW3);
                                                return;
                                            }
                                            return;
                                        }
                                        String str5 = this.LIZIZ.LIZJ;
                                        if (str5 != null && str5.length() > 0) {
                                            if (C0C64.LJIILLIIL().LJIIIZ(31744, "fix_cc_template_music_urllist_crash", true, true)) {
                                                AVMusic aVMusic5 = this.LIZIZ.LIZLLL;
                                                if (aVMusic5 != null && (playUrl3 = aVMusic5.getPlayUrl()) != null) {
                                                    playUrl3.setUrlList(C1697810uHb.LJ(str5));
                                                }
                                            } else {
                                                AVMusic aVMusic6 = this.LIZIZ.LIZLLL;
                                                if (aVMusic6 != null && (playUrl2 = aVMusic6.getPlayUrl()) != null && (urlList2 = playUrl2.getUrlList()) != null) {
                                                    urlList2.clear();
                                                }
                                                AVMusic aVMusic7 = this.LIZIZ.LIZLLL;
                                                if (aVMusic7 != null && (playUrl = aVMusic7.getPlayUrl()) != null && (urlList = playUrl.getUrlList()) != null) {
                                                    urlList.add(str5);
                                                }
                                            }
                                        }
                                        if (interfaceC1429300nIW3 != null) {
                                            LJFF(interfaceC1429300nIW3);
                                            return;
                                        }
                                        return;
                                    }
                                    this.LIZIZ.LJII = -10001;
                                    this.LIZIZ.LJIIIIZZ = "musicPath is empty";
                                    if (interfaceC1429300nIW3 != null) {
                                        LIZLLL(interfaceC1429300nIW3, true);
                                    }
                                }

                                public static void LJI(AVMusic aVMusic3, String str2) {
                                    if (C301650Bs3.LIZ()) {
                                        long jLongValue = 0;
                                        if (aVMusic3.id < 0 && str2 != null && str2.length() != 0) {
                                            aVMusic3.setMusicId(str2);
                                            Long lLJIILIIL = C2095008Iq.LJIILIIL(str2);
                                            if (lLJIILIIL != null) {
                                                jLongValue = lLJIILIIL.longValue();
                                            }
                                            aVMusic3.setLocalMusicId(jLongValue);
                                        }
                                    }
                                }
                            };
                        }
                    } else {
                        c1429190nIL = new C1429220nIO(c1429160nII);
                    }
                } else {
                    c1429190nIL = new C1429150nIH(c1429160nII);
                }
            } else {
                c1429190nIL = new C1429190nIL(c1429160nII);
            }
            linkedHashMap.put(enumC1429270nIT, c1429190nIL);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        this.LJ = linkedHashMap2;
        Iterator it2 = ((ArrayList) C1429250nIR.LIZ(this.LIZLLL, linkedHashMap2)).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1429290nIV) it2.next()).LIZ(interfaceC1429300nIW2);
        }
    }

    public final boolean LJII(List<? extends InterfaceC1429290nIV> list) {
        if (!((ArrayList) list).isEmpty()) {
            return false;
        }
        Collection collectionValues = ((LinkedHashMap) this.LJ).values();
        if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
            Iterator it2 = collectionValues.iterator();
            while (it2.hasNext()) {
                if (((InterfaceC1429290nIV) it2.next()).getTaskStatus() == EnumC1429260nIS.EXECUTING) {
                    return false;
                }
            }
        }
        return true;
    }

    public C1429200nIM(C1429160nII c1429160nII, InterfaceC1428880nHq interfaceC1428880nHq) {
        this.LIZIZ = c1429160nII;
        this.LIZJ = interfaceC1428880nHq;
        EnumC1429270nIT enumC1429270nIT = EnumC1429270nIT.DOWNLOAD_MUSIC_FROM_URL;
        C13BV c13bv = C13BV.INSTANCE;
        EnumC1429270nIT enumC1429270nIT2 = EnumC1429270nIT.FETCH_MUSIC;
        EnumC1429270nIT enumC1429270nIT3 = EnumC1429270nIT.DOWNLOAD_MUSIC_FROM_MODEL;
        this.LIZLLL = C2097608Jq.LJIIIIZZ(new Pair(enumC1429270nIT, c13bv), new Pair(enumC1429270nIT2, c13bv), new Pair(enumC1429270nIT3, Collections.singletonList(enumC1429270nIT2)), new Pair(EnumC1429270nIT.BUILD_MUSIC_MODEL, C1697810uHb.LJIIJJI(enumC1429270nIT, enumC1429270nIT3)));
        this.LJ = new LinkedHashMap();
    }
}
