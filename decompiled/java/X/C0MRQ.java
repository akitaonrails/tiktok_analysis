package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.ttvideoengine.TTVideoEngine;
import fyo.e;
import java.util.Map;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.0MRQ, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MRQ {
    public static final /* synthetic */ int LJ = 0;
    public final TTVideoEngine LIZ;
    public final C01GW LIZIZ;
    public MusicBuzModel LIZJ;
    public final C0MRO LIZLLL;

    public final void LIZ() {
        C0MRS c0mrs = C0MRS.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append(" pause");
        C201955140j.LJIILJJIL(c0mrs, C2188811AlT.LIZIZ(sbLIZ));
        this.LIZ.pause();
        LIZIZ();
    }

    public final void LIZIZ() {
        if (C0MRM.LIZ(this.LIZJ)) {
            ((C20498815Ja) this.LIZIZ.getValue()).pause();
        }
    }

    public final void LIZJ() {
        C0MRS c0mrs = C0MRS.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append(" play ");
        sbLIZ.append(this.LIZ.LJJJJJ());
        C201955140j.LJIILJJIL(c0mrs, C2188811AlT.LIZIZ(sbLIZ));
        this.LIZ.play();
    }

    public final void LIZLLL() {
        UrlModel urlModel;
        MusicBuzModel musicBuzModel = this.LIZJ;
        if (musicBuzModel != null && C0MRM.LIZ(musicBuzModel) && musicBuzModel.enableMusicSound) {
            String str = musicBuzModel.musicPath;
            MusicObject musicObject = musicBuzModel.music;
            String uri = (musicObject == null || (urlModel = musicObject.playUrl) == null) ? null : urlModel.getUri();
            C20498815Ja c20498815Ja = (C20498815Ja) this.LIZIZ.getValue();
            C1485060okS c1485060okS = new C1485060okS();
            c1485060okS.LJI = true;
            if (str == null || str.length() == 0) {
                c1485060okS.LIZIZ = C1697810uHb.LJIILJJIL(uri);
            } else {
                c1485060okS.LIZ = str;
            }
            c1485060okS.LJIIIZ = this.LIZ.LJJJIL();
            c20498815Ja.LIZIZ(c1485060okS);
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0MRO] */
    public C0MRQ() {
        TTVideoEngine tTVideoEngine = new TTVideoEngine(C786410Ut5.M3(C0CHQ.LIZ), 0);
        this.LIZ = tTVideoEngine;
        this.LIZIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(297));
        this.LIZLLL = new InterfaceC1469360oL8() { // from class: X.0MRO
            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LIZIZ(TTVideoEngine tTVideoEngine2) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJ(TTVideoEngine tTVideoEngine2) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJFF(int i, EnumC2281151EQn enumC2281151EQn) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJI(e eVar) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIIIIZZ(TTVideoEngine tTVideoEngine2) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIIIZ(TTVideoEngine tTVideoEngine2) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIIJJI(TTVideoEngine tTVideoEngine2, int i, int i2) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIIL(TTVideoEngine tTVideoEngine2, int i) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIILIIL(TTVideoEngine tTVideoEngine2) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIJ(TTVideoEngine tTVideoEngine2, int i) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIJI(TTVideoEngine tTVideoEngine2, int i) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIJJ(int i) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIJJLI(int i) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIL(TTVideoEngine tTVideoEngine2, int i) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJII(int i, int i2) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJIIJ(int i, int i2) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJIJ(Map map) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJJJJ(TTVideoEngine tTVideoEngine2, int i) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJJJJL(TTVideoEngine tTVideoEngine2, int i, long j, long j2, Map map) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJJJLL(TTVideoEngine tTVideoEngine2) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJJLIIL(int i, int i2, int i3) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJJLZIJ(TTVideoEngine tTVideoEngine2, int i, C1467860oIi c1467860oIi) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJL(e eVar, String str) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJLIIIIJ(int i) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJLIIIJJIZ(TTVideoEngine tTVideoEngine2) {
            }

            @Override // X.InterfaceC1469360oL8
            public final void LJIILL(TTVideoEngine tTVideoEngine2) {
                if (this.LL.LIZ.LJJLIIIJILLIZJL() == 1) {
                    this.LL.LIZLLL();
                }
            }

            @Override // X.InterfaceC1469360oL8
            public final void LIZJ(TTVideoEngine tTVideoEngine2, int i) {
                if (i != 1) {
                    if (i == 2) {
                        this.LL.LIZIZ();
                        return;
                    }
                    return;
                }
                this.LL.LIZLLL();
            }
        };
        tTVideoEngine.LLILZIL("preview");
        tTVideoEngine.setLooping(true);
        tTVideoEngine.LIZJ(160, 1);
        C1473560oRu.LIZ(tTVideoEngine);
    }
}
