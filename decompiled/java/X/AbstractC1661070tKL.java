package X;

import Y.AkS468S0100000_3;
import Y.AkS486S0100000_25;
import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.service.IMusicExternalService;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tiktok.tools.performance.api.settings.MusicStreamConfig;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tKL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1661070tKL {
    public final Context LIZ;
    public String LIZIZ;
    public final MusicModel LIZJ;
    public final C202033143j LIZLLL;
    public Effect LJ;
    public C11JF LJFF;
    public C11JF LJI;
    public C1661090tKN LJII;

    public abstract void LIZIZ(InterfaceC1661080tKM interfaceC1661080tKM);

    public abstract boolean LIZLLL();

    public boolean LJ() {
        return false;
    }

    public abstract C09JN<C1661140tKS> LJI();

    public abstract C09JN<C1661050tKJ> LJII();

    public final void LIZ() {
        C1661090tKN c1661090tKN = this.LJII;
        if (c1661090tKN != null) {
            c1661090tKN.LJFF(null);
        }
    }

    public final void LIZJ() {
        C11JF c11jf = this.LJFF;
        if (c11jf != null && (!c11jf.isDisposed())) {
            c11jf.dispose();
        }
        C11JF c11jf2 = this.LJI;
        if (c11jf2 != null && (!c11jf2.isDisposed())) {
            c11jf2.dispose();
        }
        LIZ();
    }

    public final String LJFF() {
        MusicModel musicModel = this.LIZJ;
        if (musicModel != null) {
            return musicModel.getDownloadUrl();
        }
        return null;
    }

    public AbstractC1661070tKL(Context context, String str, MusicModel musicModel, C202033143j c202033143j) {
        this.LIZ = context;
        this.LIZIZ = str;
        this.LIZJ = musicModel;
        this.LIZLLL = c202033143j;
    }

    public final void LJIIIIZZ(final Map<String, String> map, InterfaceC1661080tKM interfaceC1661080tKM, boolean z, String str, final boolean z2, final boolean z3) {
        String id;
        InterfaceC420801kM interfaceC420801kMLJJLJLI;
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null) {
            creativeToolsPluginService.LIZ();
        }
        C20684815ws.LJIJI("music_detail_trace", new Pair("start_music_with_effect_download", "stage"));
        if (this.LJII != null && interfaceC1661080tKM == null) {
            this.LIZIZ = str;
            return;
        }
        if (this.LJFF != null && this.LJI != null && Intrinsics.LJFF(this.LIZIZ, str)) {
            this.LIZIZ = str;
            C11JF c11jf = this.LJI;
            if (c11jf != null && c11jf.isDisposed()) {
                C1661090tKN c1661090tKN = this.LJII;
                if (c1661090tKN != null) {
                    c1661090tKN.LJFF(interfaceC1661080tKM);
                }
                this.LJFF = null;
                this.LJI = null;
                return;
            }
            if (interfaceC1661080tKM != null && z) {
                C1661090tKN c1661090tKN2 = this.LJII;
                if (c1661090tKN2 != null) {
                    c1661090tKN2.LJFF(interfaceC1661080tKM);
                }
                C11JF c11jf2 = this.LJFF;
                if (c11jf2 != null) {
                    c11jf2.dispose();
                }
                C11JF c11jf3 = this.LJI;
                if (c11jf3 != null) {
                    c11jf3.dispose();
                }
                this.LJFF = null;
                this.LJI = null;
                interfaceC1661080tKM.LIZIZ(null, this.LIZIZ);
                return;
            }
            LIZIZ(interfaceC1661080tKM);
            return;
        }
        Effect effect = this.LJ;
        if (effect != null) {
            id = effect.getId();
        } else {
            id = null;
        }
        if (!TextUtils.equals(id, str)) {
            this.LJ = null;
        }
        this.LIZIZ = str;
        this.LJII = new C1661090tKN(interfaceC1661080tKM);
        if (z) {
            C11RK c11rk = new C11RK();
            this.LJFF = (C11JF) c11rk.LJJLJLI(LJI());
            this.LJI = (C11JF) C11NZ.LJIJJLI(new C1632000sZS(this.LIZ, this.LJ, c11rk, this.LIZIZ, map)).LJJJJZI(new AkS486S0100000_25(this, 30)).LJJLJLI(LJII());
            return;
        }
        final C11RK c11rk2 = new C11RK();
        this.LJFF = (C11JF) c11rk2.LJJLJLI(LJI());
        if (C1632180sZk.LIZ && LJ()) {
            C259800zU c259800zU = new C259800zU();
            final C202033143j c202033143j = this.LIZLLL;
            final MusicModel musicModel = this.LIZJ;
            final boolean z4 = !LJ();
            C11NZ c11nzLJJJJZI = C11NZ.LJJJLL(C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0tKV
                @Override // X.InterfaceC1478005qU
                public final void subscribe(C09AJ<C1661050tKJ> c09aj) {
                    Pair pair;
                    IMusicExternalService iMusicExternalService;
                    InterfaceC1662290tMJ interfaceC1662290tMJLIZJ;
                    String strLJIIL;
                    Map<String, String> creationMusicIdToLocalPathMap;
                    C1C7U.LIZ("MusicAndEffectDownload__MusicAndEffectDownloadExtensionKt@e9f6.provideMusicDownloadObservable$1");
                    if (musicModel == null) {
                        c09aj.onNext(new C1661050tKJ(null, null, -103, null, null, null, null, null, 251));
                        c09aj.onComplete();
                        C1C7U.LIZIZ("MusicAndEffectDownload__MusicAndEffectDownloadExtensionKt@e9f6.provideMusicDownloadObservable$1");
                        return;
                    }
                    if (z3) {
                        IMusicService iMusicService = (IMusicService) ServiceManager.get().getService(IMusicService.class);
                        MusicModel musicModel2 = musicModel;
                        int musicType = musicModel2.getMusicType();
                        String str2 = null;
                        boolean z5 = true;
                        if (musicType != 1 && musicType != 2) {
                            strLJIIL = null;
                        } else {
                            strLJIIL = ((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJIIL(musicModel2);
                        }
                        if (!C123100dR.LIZ(strLJIIL) || !C1487190ont.LIZ(strLJIIL)) {
                            z5 = false;
                        }
                        if (z5) {
                            c09aj.onNext(new C1661050tKJ(iMusicService.LJIIL(musicModel), null, 100, null, null, null, null, null, 250));
                            c09aj.onComplete();
                            C1C7U.LIZIZ("MusicAndEffectDownload__MusicAndEffectDownloadExtensionKt@e9f6.provideMusicDownloadObservable$1");
                            return;
                        } else if (((Boolean) C280680AzK.LIZ.getValue()).booleanValue()) {
                            com.ss.android.ugc.aweme.port.in.IMusicService iMusicService2 = (com.ss.android.ugc.aweme.port.in.IMusicService) PluggableExtentionKt.pluggableSpi$default(com.ss.android.ugc.aweme.port.in.IMusicService.class, false, false, false, 14, null);
                            if (iMusicService2 != null && (creationMusicIdToLocalPathMap = iMusicService2.getCreationMusicIdToLocalPathMap()) != null) {
                                str2 = creationMusicIdToLocalPathMap.get(musicModel.getMusicId());
                            }
                            if (C123100dR.LIZ(str2) && C1487190ont.LIZ(str2)) {
                                c09aj.onNext(new C1661050tKJ(str2, null, 100, null, null, null, null, null, 250));
                                c09aj.onComplete();
                                C1C7U.LIZIZ("MusicAndEffectDownload__MusicAndEffectDownloadExtensionKt@e9f6.provideMusicDownloadObservable$1");
                                return;
                            }
                        }
                    }
                    if (!C1661270tKf.LIZ() && !C1661280tKg.LIZ()) {
                        C1661040tKI.LIZ(c202033143j, musicModel, c09aj, c11rk2, z2);
                    } else {
                        final MusicModel musicModel3 = musicModel;
                        final C202033143j c202033143j2 = c202033143j;
                        final C11PR<C1661140tKS> c11pr = c11rk2;
                        final boolean z6 = z2;
                        if (z4) {
                            C01GW c01gw = C1661270tKf.LIZIZ;
                            pair = new Pair(Float.valueOf(((MusicStreamConfig) c01gw.getValue()).startPlayProgress), Integer.valueOf(((MusicStreamConfig) c01gw.getValue()).netLevelThreshold));
                        } else {
                            C01GW c01gw2 = C1661280tKg.LIZIZ;
                            pair = new Pair(Float.valueOf(((MusicStreamConfig) c01gw2.getValue()).startPlayProgress), Integer.valueOf(((MusicStreamConfig) c01gw2.getValue()).netLevelThreshold));
                        }
                        final C19482611Ke c19482611Ke = (C19482611Ke) c09aj;
                        C202045143v.LJ(musicModel3, false, false, new AbstractC1661230tKb() { // from class: X.0tKa
                        }, new InterfaceC202048143y() { // from class: X.0sZw
                            @Override // X.InterfaceC202048143y
                            public final void LJJJLIIL(String str3) {
                            }

                            @Override // X.InterfaceC202048143y
                            public final void LIZIZ() {
                                C1661040tKI.LIZ(c202033143j2, musicModel3, c19482611Ke, c11pr, z6);
                            }

                            @Override // X.InterfaceC202048143y
                            public final void LIZ(int i, String str3) {
                                c19482611Ke.onNext(new C1661050tKJ(null, null, -103, null, null, null, null, Boolean.TRUE, 123));
                                c19482611Ke.onComplete();
                            }

                            @Override // X.InterfaceC202048143y
                            public final void LIZJ(String str3, boolean z7) {
                                c19482611Ke.onNext(new C1661050tKJ(str3, null, 100, null, null, null, null, Boolean.TRUE, 122));
                                c19482611Ke.onComplete();
                            }
                        }, ((Number) pair.getFirst()).floatValue(), ((Number) pair.getSecond()).intValue());
                        String downloadUrl = musicModel3.getDownloadUrl();
                        if (downloadUrl != null && (iMusicExternalService = (IMusicExternalService) PluggableExtentionKt.pluggableSpi$default(IMusicExternalService.class, false, false, false, 14, null)) != null && (interfaceC1662290tMJLIZJ = iMusicExternalService.LIZJ()) != null) {
                            interfaceC1662290tMJLIZJ.LIZLLL(downloadUrl);
                        }
                    }
                    C1C7U.LIZIZ("MusicAndEffectDownload__MusicAndEffectDownloadExtensionKt@e9f6.provideMusicDownloadObservable$1");
                }
            }), C1632070sZZ.LIZIZ(this.LIZ, this.LIZIZ, this.LJ, c11rk2, map, LIZLLL()).LJJJJZI(new AkS486S0100000_25(this, 28))).LJJIL(new C1698300uIO(c259800zU, 4)).LJJJJZI(new AkS468S0100000_3(c259800zU, 17));
            if (LIZLLL()) {
                final int i = 0;
                c11nzLJJJJZI = c11nzLJJJJZI.LJJIIJZLJL(new InterfaceC781210Ukh(this, map, i) { // from class: X.0uIH
                    public final int $t;
                    public Object l0;
                    public Object l1;

                    @Override // X.InterfaceC781210Ukh
                    public final void run() {
                        switch (this.$t) {
                            case 0:
                                run$0(this);
                                break;
                            case 1:
                                run$1(this);
                                break;
                        }
                    }

                    public static final void run$0(C1698230uIH c1698230uIH) {
                        Effect effect2;
                        AbstractC1661070tKL abstractC1661070tKL = (AbstractC1661070tKL) c1698230uIH.l0;
                        String effectId = abstractC1661070tKL.LIZIZ;
                        if (effectId == null && ((effect2 = abstractC1661070tKL.LJ) == null || (effectId = effect2.getEffectId()) == null)) {
                            return;
                        }
                        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1632110sZd(effectId, (AbstractC1661070tKL) c1698230uIH.l0, (Map) c1698230uIH.l1, null), 3);
                    }

                    public static final void run$1(C1698230uIH c1698230uIH) {
                        Effect effect2;
                        AbstractC1661070tKL abstractC1661070tKL = (AbstractC1661070tKL) c1698230uIH.l0;
                        String effectId = abstractC1661070tKL.LIZIZ;
                        if (effectId == null && ((effect2 = abstractC1661070tKL.LJ) == null || (effectId = effect2.getEffectId()) == null)) {
                            return;
                        }
                        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1632120sZe(effectId, (AbstractC1661070tKL) c1698230uIH.l0, (Map) c1698230uIH.l1, null), 3);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        this.$t = i;
                        this.l0 = this;
                        this.l1 = map;
                    }
                });
            }
            interfaceC420801kMLJJLJLI = c11nzLJJJJZI.LJJLJLI(LJII());
        } else {
            final C202033143j c202033143j2 = this.LIZLLL;
            final MusicModel musicModel2 = this.LIZJ;
            final boolean z5 = !LJ();
            C11NZ c11nzLJLLILLLL = C11NZ.LJLLILLLL(C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0tKV
                @Override // X.InterfaceC1478005qU
                public final void subscribe(C09AJ<C1661050tKJ> c09aj) {
                    Pair pair;
                    IMusicExternalService iMusicExternalService;
                    InterfaceC1662290tMJ interfaceC1662290tMJLIZJ;
                    String strLJIIL;
                    Map<String, String> creationMusicIdToLocalPathMap;
                    C1C7U.LIZ("MusicAndEffectDownload__MusicAndEffectDownloadExtensionKt@e9f6.provideMusicDownloadObservable$1");
                    if (musicModel2 == null) {
                        c09aj.onNext(new C1661050tKJ(null, null, -103, null, null, null, null, null, 251));
                        c09aj.onComplete();
                        C1C7U.LIZIZ("MusicAndEffectDownload__MusicAndEffectDownloadExtensionKt@e9f6.provideMusicDownloadObservable$1");
                        return;
                    }
                    if (z3) {
                        IMusicService iMusicService = (IMusicService) ServiceManager.get().getService(IMusicService.class);
                        MusicModel musicModel22 = musicModel2;
                        int musicType = musicModel22.getMusicType();
                        String str2 = null;
                        boolean z52 = true;
                        if (musicType != 1 && musicType != 2) {
                            strLJIIL = null;
                        } else {
                            strLJIIL = ((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJIIL(musicModel22);
                        }
                        if (!C123100dR.LIZ(strLJIIL) || !C1487190ont.LIZ(strLJIIL)) {
                            z52 = false;
                        }
                        if (z52) {
                            c09aj.onNext(new C1661050tKJ(iMusicService.LJIIL(musicModel2), null, 100, null, null, null, null, null, 250));
                            c09aj.onComplete();
                            C1C7U.LIZIZ("MusicAndEffectDownload__MusicAndEffectDownloadExtensionKt@e9f6.provideMusicDownloadObservable$1");
                            return;
                        } else if (((Boolean) C280680AzK.LIZ.getValue()).booleanValue()) {
                            com.ss.android.ugc.aweme.port.in.IMusicService iMusicService2 = (com.ss.android.ugc.aweme.port.in.IMusicService) PluggableExtentionKt.pluggableSpi$default(com.ss.android.ugc.aweme.port.in.IMusicService.class, false, false, false, 14, null);
                            if (iMusicService2 != null && (creationMusicIdToLocalPathMap = iMusicService2.getCreationMusicIdToLocalPathMap()) != null) {
                                str2 = creationMusicIdToLocalPathMap.get(musicModel2.getMusicId());
                            }
                            if (C123100dR.LIZ(str2) && C1487190ont.LIZ(str2)) {
                                c09aj.onNext(new C1661050tKJ(str2, null, 100, null, null, null, null, null, 250));
                                c09aj.onComplete();
                                C1C7U.LIZIZ("MusicAndEffectDownload__MusicAndEffectDownloadExtensionKt@e9f6.provideMusicDownloadObservable$1");
                                return;
                            }
                        }
                    }
                    if (!C1661270tKf.LIZ() && !C1661280tKg.LIZ()) {
                        C1661040tKI.LIZ(c202033143j2, musicModel2, c09aj, c11rk2, z2);
                    } else {
                        final MusicModel musicModel3 = musicModel2;
                        final C202033143j c202033143j22 = c202033143j2;
                        final C11PR c11pr = c11rk2;
                        final boolean z6 = z2;
                        if (z5) {
                            C01GW c01gw = C1661270tKf.LIZIZ;
                            pair = new Pair(Float.valueOf(((MusicStreamConfig) c01gw.getValue()).startPlayProgress), Integer.valueOf(((MusicStreamConfig) c01gw.getValue()).netLevelThreshold));
                        } else {
                            C01GW c01gw2 = C1661280tKg.LIZIZ;
                            pair = new Pair(Float.valueOf(((MusicStreamConfig) c01gw2.getValue()).startPlayProgress), Integer.valueOf(((MusicStreamConfig) c01gw2.getValue()).netLevelThreshold));
                        }
                        final C19482611Ke c19482611Ke = (C19482611Ke) c09aj;
                        C202045143v.LJ(musicModel3, false, false, new AbstractC1661230tKb() { // from class: X.0tKa
                        }, new InterfaceC202048143y() { // from class: X.0sZw
                            @Override // X.InterfaceC202048143y
                            public final void LJJJLIIL(String str3) {
                            }

                            @Override // X.InterfaceC202048143y
                            public final void LIZIZ() {
                                C1661040tKI.LIZ(c202033143j22, musicModel3, c19482611Ke, c11pr, z6);
                            }

                            @Override // X.InterfaceC202048143y
                            public final void LIZ(int i2, String str3) {
                                c19482611Ke.onNext(new C1661050tKJ(null, null, -103, null, null, null, null, Boolean.TRUE, 123));
                                c19482611Ke.onComplete();
                            }

                            @Override // X.InterfaceC202048143y
                            public final void LIZJ(String str3, boolean z7) {
                                c19482611Ke.onNext(new C1661050tKJ(str3, null, 100, null, null, null, null, Boolean.TRUE, 122));
                                c19482611Ke.onComplete();
                            }
                        }, ((Number) pair.getFirst()).floatValue(), ((Number) pair.getSecond()).intValue());
                        String downloadUrl = musicModel3.getDownloadUrl();
                        if (downloadUrl != null && (iMusicExternalService = (IMusicExternalService) PluggableExtentionKt.pluggableSpi$default(IMusicExternalService.class, false, false, false, 14, null)) != null && (interfaceC1662290tMJLIZJ = iMusicExternalService.LIZJ()) != null) {
                            interfaceC1662290tMJLIZJ.LIZLLL(downloadUrl);
                        }
                    }
                    C1C7U.LIZIZ("MusicAndEffectDownload__MusicAndEffectDownloadExtensionKt@e9f6.provideMusicDownloadObservable$1");
                }
            }), C1632070sZZ.LIZIZ(this.LIZ, this.LIZIZ, this.LJ, c11rk2, map, LIZLLL()).LJJJJZI(new AkS486S0100000_25(this, 29)), new InterfaceC500500Jk0() { // from class: X.0tKK
                @Override // X.InterfaceC500500Jk0
                public final Object apply(Object obj, Object obj2) {
                    return C1661040tKI.LIZIZ((C1661050tKJ) obj, (C1661050tKJ) obj2);
                }
            });
            if (((Number) C298000BmA.LIZ.getValue()).intValue() == 2 && !LJ()) {
                final int i2 = 1;
                c11nzLJLLILLLL = c11nzLJLLILLLL.LJJIIJZLJL(new InterfaceC781210Ukh(this, map, i2) { // from class: X.0uIH
                    public final int $t;
                    public Object l0;
                    public Object l1;

                    @Override // X.InterfaceC781210Ukh
                    public final void run() {
                        switch (this.$t) {
                            case 0:
                                run$0(this);
                                break;
                            case 1:
                                run$1(this);
                                break;
                        }
                    }

                    public static final void run$0(C1698230uIH c1698230uIH) {
                        Effect effect2;
                        AbstractC1661070tKL abstractC1661070tKL = (AbstractC1661070tKL) c1698230uIH.l0;
                        String effectId = abstractC1661070tKL.LIZIZ;
                        if (effectId == null && ((effect2 = abstractC1661070tKL.LJ) == null || (effectId = effect2.getEffectId()) == null)) {
                            return;
                        }
                        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1632110sZd(effectId, (AbstractC1661070tKL) c1698230uIH.l0, (Map) c1698230uIH.l1, null), 3);
                    }

                    public static final void run$1(C1698230uIH c1698230uIH) {
                        Effect effect2;
                        AbstractC1661070tKL abstractC1661070tKL = (AbstractC1661070tKL) c1698230uIH.l0;
                        String effectId = abstractC1661070tKL.LIZIZ;
                        if (effectId == null && ((effect2 = abstractC1661070tKL.LJ) == null || (effectId = effect2.getEffectId()) == null)) {
                            return;
                        }
                        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1632120sZe(effectId, (AbstractC1661070tKL) c1698230uIH.l0, (Map) c1698230uIH.l1, null), 3);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        this.$t = i2;
                        this.l0 = this;
                        this.l1 = map;
                    }
                });
            }
            interfaceC420801kMLJJLJLI = c11nzLJLLILLLL.LJJLJLI(LJII());
        }
        this.LJI = (C11JF) interfaceC420801kMLJJLJLI;
    }
}
