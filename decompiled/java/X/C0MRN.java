package X;

import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardVideo;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.OnThisDayCardPreviewScene;
import com.ss.ttvideoengine.TTVideoEngine;
import fyo.e;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS409S0200000_8;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0MRN, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public abstract class C0MRN extends AbstractC568240MQk implements InterfaceC568350MQv, C0MRR {
    public final C0MRQ LLJL = new C0MRQ();
    public final boolean LLJLIL;
    public OnThisDayCardPreviewScene LLJLILLLLZIIL;
    public boolean LLJLL;
    public long LLJLLIL;
    public final C01GW LLJLLL;
    public Pair<Integer, String> LLJZ;
    public C0MRT LLJZIJLIL;
    public boolean LLL;

    public void LLLLL() {
    }

    public void LLLLLILLIL(TTVideoEngine tTVideoEngine) {
    }

    public void LLLLILI() {
        if (this.LLL) {
            return;
        }
        this.LLL = true;
        if (LLLLJ()) {
            C0MRQ c0mrq = this.LLJL;
            c0mrq.getClass();
            C0MRS c0mrs = C0MRS.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c0mrq.LIZ);
            sbLIZ.append(" prepare ");
            sbLIZ.append(c0mrq.LIZ.LJJJJJ());
            C201955140j.LJIILJJIL(c0mrs, C2188811AlT.LIZIZ(sbLIZ));
            c0mrq.LIZ.prepare();
            C0MRQ c0mrq2 = this.LLJL;
            c0mrq2.LIZ.LLJILLL(new InterfaceC1469360oL8() { // from class: X.0MRP
                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LIZJ(TTVideoEngine tTVideoEngine, int i) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJ(TTVideoEngine tTVideoEngine) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJFF(int i, EnumC2281151EQn enumC2281151EQn) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIIIIZZ(TTVideoEngine tTVideoEngine) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIIIZ(TTVideoEngine tTVideoEngine) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIIJJI(TTVideoEngine tTVideoEngine, int i, int i2) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIIL(TTVideoEngine tTVideoEngine, int i) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIILL(TTVideoEngine tTVideoEngine) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIJ(TTVideoEngine tTVideoEngine, int i) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIJI(TTVideoEngine tTVideoEngine, int i) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIJJ(int i) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIJJLI(int i) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIL(TTVideoEngine tTVideoEngine, int i) {
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
                public final /* synthetic */ void LJJJJJ(TTVideoEngine tTVideoEngine, int i) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJJJJL(TTVideoEngine tTVideoEngine, int i, long j, long j2, Map map) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJJJLL(TTVideoEngine tTVideoEngine) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJJLIIL(int i, int i2, int i3) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJJLZIJ(TTVideoEngine tTVideoEngine, int i, C1467860oIi c1467860oIi) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJL(e eVar, String str) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJLIIIIJ(int i) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJLIIIJJIZ(TTVideoEngine tTVideoEngine) {
                }

                @Override // X.InterfaceC1469360oL8
                public final void LIZIZ(TTVideoEngine tTVideoEngine) {
                    C01TT.LIZLLL(new AwS552S0100000_8(this.LL, tTVideoEngine, 682));
                }

                @Override // X.InterfaceC1469360oL8
                public final void LJI(e eVar) {
                    MediaModel mediaModel;
                    Integer numValueOf;
                    C0MRS c0mrs2 = C0MRS.LIZIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("engine error ");
                    sbLIZ2.append(eVar);
                    C201955140j.LJII(c0mrs2, C2188811AlT.LIZIZ(sbLIZ2));
                    ForwardMedia forwardMedia = this.LL.LLJJJ;
                    if (forwardMedia != null && (mediaModel = forwardMedia.localMedia) != null) {
                        C0ML7 c0ml7 = C0ML7.LIZ;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        String str = null;
                        if (eVar != null) {
                            numValueOf = Integer.valueOf(eVar.LIZ);
                        } else {
                            numValueOf = null;
                        }
                        sbLIZ3.append(numValueOf);
                        sbLIZ3.append(": ");
                        if (eVar != null) {
                            str = eVar.LIZLLL;
                        }
                        sbLIZ3.append(str);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                        c0ml7.getClass();
                        C0ML7.LJIILIIL("local_video_player_error", strLIZIZ, C1697810uHb.LJ(mediaModel.mimeType));
                    }
                }

                @Override // X.InterfaceC1469360oL8
                public final void LJIILIIL(TTVideoEngine tTVideoEngine) {
                    String strLJJJJJ;
                    C0MRS c0mrs2 = C0MRS.LIZIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(tTVideoEngine);
                    sbLIZ2.append(" onPrepared url: ");
                    if (tTVideoEngine != null) {
                        strLJJJJJ = tTVideoEngine.LJJJJJ();
                    } else {
                        strLJJJJJ = null;
                    }
                    sbLIZ2.append(strLJJJJJ);
                    C201955140j.LJIILJJIL(c0mrs2, C2188811AlT.LIZIZ(sbLIZ2));
                    C01TT.LIZLLL(new AwS409S0200000_8(this.LL, tTVideoEngine, 90));
                }
            });
        }
    }

    public boolean LLLLJ() {
        ForwardVideo forwardVideo;
        List<String> playAddressList;
        ForwardVideo forwardVideo2;
        ForwardMedia forwardMedia = this.LLJJJ;
        if (forwardMedia == null || (forwardVideo = forwardMedia.video) == null || (playAddressList = forwardVideo.getPlayAddressList()) == null || playAddressList.isEmpty()) {
            return false;
        }
        C0MRQ c0mrq = this.LLJL;
        String str = (String) C13LP.LJJLIIIJJI(playAddressList);
        String strLIZIZ = C08F1.LIZIZ((String) C13LP.LJJLIIIJJI(playAddressList));
        ForwardMedia forwardMedia2 = this.LLJJJ;
        c0mrq.LIZ.LJZI(str, strLIZIZ, (forwardMedia2 == null || (forwardVideo2 = forwardMedia2.video) == null) ? null : forwardVideo2.getSourceVID());
        return true;
    }

    public void LLLLJI() {
        C0MRQ c0mrq = this.LLJL;
        ForwardMedia forwardMedia = this.LLJJJ;
        MusicBuzModel musicBuzModel = forwardMedia != null ? C566580MKa.LIZ(forwardMedia).LIZIZ : null;
        c0mrq.getClass();
        if (!C0MRM.LIZ(musicBuzModel) || musicBuzModel == null || !musicBuzModel.enableMusicSound) {
            c0mrq.LIZJ = null;
            c0mrq.LIZ.LJLJJL(c0mrq.LIZLLL);
            ((C20498815Ja) c0mrq.LIZIZ.getValue()).stop();
            ((C20498815Ja) c0mrq.LIZIZ.getValue()).release();
            return;
        }
        c0mrq.LIZJ = musicBuzModel;
        c0mrq.LIZ.LJIIIZ(c0mrq.LIZLLL);
        if (c0mrq.LIZ.LIZ.LJIILL == 1) {
            c0mrq.LIZLLL();
        }
    }

    public C0MRN() {
        this.LLJLIL = ((Number) C0BDU.LIZ.getValue()).intValue() == 2;
        this.LLJLLIL = -1L;
        this.LLJLLL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 681));
    }

    public void LLLLLJIL() {
        if (isVisible()) {
            this.LLJL.LIZJ();
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public void onDestroyView() {
        super.onDestroyView();
        C0MRQ c0mrq = this.LLJL;
        c0mrq.getClass();
        C0MRS c0mrs = C0MRS.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c0mrq.LIZ);
        sbLIZ.append(" release");
        C201955140j.LJIILJJIL(c0mrs, C2188811AlT.LIZIZ(sbLIZ));
        c0mrq.LIZIZ();
        ((C20498815Ja) c0mrq.LIZIZ.getValue()).stop();
        c0mrq.LIZ.release();
        if (this.LLJLLIL > 0) {
            LLLLLIL(2, "");
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onPause() {
        super.onPause();
        this.LLJL.LIZ();
        this.LLJL.LIZ.LJIJJLI(0, null);
    }

    @Override // com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
        LLLLLJIL();
    }

    @Override // com.bytedance.scene.Scene
    public void LLJJL(boolean z) {
        if (z) {
            this.LLJLLL.getValue();
            LLLLILI();
            Pair<Integer, String> pair = this.LLJZ;
            if (pair != null) {
                LLLLLIL(pair.getFirst().intValue(), pair.getSecond());
            }
            LLLLLJIL();
            return;
        }
        this.LLJL.LIZ();
        this.LLJL.LIZ.LJIJJLI(0, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0079  */
    @Override // X.AbstractC568240MQk, com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityCreated(android.os.Bundle r5) {
        /*
            r4 = this;
            super.onActivityCreated(r5)
            X.1DRG r2 = r4.LLJJL
            r0 = 0
            if (r2 == 0) goto L85
            java.lang.Class<com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.OnThisDayCardPreviewScene> r1 = com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.OnThisDayCardPreviewScene.class
            java.lang.Object r1 = r2.LJIIL(r0, r1)
            com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.OnThisDayCardPreviewScene r1 = (com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.OnThisDayCardPreviewScene) r1
        L10:
            r4.LLJLILLLLZIIL = r1
            X.1DRG r2 = r4.LLJJL
            if (r2 == 0) goto L1e
            java.lang.Class<X.0MRT> r1 = X.C0MRT.class
            java.lang.Object r0 = r2.LJII(r1, r0)
            X.0MRT r0 = (X.C0MRT) r0
        L1e:
            r4.LLJZIJLIL = r0
            r0 = 2131397668(0x7f0a8c24, float:1.8416112E38)
            android.view.View r2 = r4.findViewById(r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r3 = 0
            if (r2 == 0) goto L42
            com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia r1 = r4.LLJJJ
            if (r1 == 0) goto L79
            com.ss.android.ugc.aweme.mediachoose.helper.MediaModel r0 = r1.localMedia
            if (r0 == 0) goto L64
            android.content.Context r1 = r4.requireSceneContext()
            r0 = 2131838697(0x7f1146e9, float:1.9310625E38)
            java.lang.String r0 = r1.getString(r0)
        L3f:
            r2.setText(r0)
        L42:
            int r0 = r4.LLJJJJ
            if (r0 != 0) goto L49
            r4.LLLLILI()
        L49:
            boolean r0 = r4.LLJLIL
            if (r0 == 0) goto L63
            r0 = 2131375470(0x7f0a356e, float:1.8371089E38)
            android.view.View r2 = r4.findViewById(r0)
            if (r2 == 0) goto L63
            X.C786410Ut5.LJLLLLLL(r3, r2)
            Y.ACListenerS143S0100000_8 r1 = new Y.ACListenerS143S0100000_8
            r0 = 107(0x6b, float:1.5E-43)
            r1.<init>(r4, r0)
            X.C786410Ut5.I7(r1, r2)
        L63:
            return
        L64:
            if (r1 == 0) goto L79
            boolean r1 = r1.isStory()
            r0 = 1
            if (r1 != r0) goto L79
            android.content.Context r1 = r4.requireSceneContext()
            r0 = 2131838699(0x7f1146eb, float:1.9310629E38)
            java.lang.String r0 = r1.getString(r0)
            goto L3f
        L79:
            android.content.Context r1 = r4.requireSceneContext()
            r0 = 2131838698(0x7f1146ea, float:1.9310627E38)
            java.lang.String r0 = r1.getString(r0)
            goto L3f
        L85:
            r1 = r0
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MRN.onActivityCreated(android.os.Bundle):void");
    }

    public void onStateChanged(boolean z) {
        if (z) {
            this.LLJL.LIZ();
        } else {
            LLLLLJIL();
        }
    }

    public final void LLLLLIL(int i, String str) {
        if (this.LLJLL) {
            return;
        }
        if (this.LLJLLIL < 0) {
            this.LLJZ = new Pair<>(Integer.valueOf(i), str);
            return;
        }
        this.LLJLL = true;
        C0ML7 c0ml7 = C0ML7.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJLLIL;
        String strLLIIL = LLIIL();
        String url = getUrl();
        Integer numLJJJLZIJ = LJJJLZIJ();
        c0ml7.getClass();
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LIZIZ(jCurrentTimeMillis, "duration");
        c0lab.LJ("error_msg", str);
        c0lab.LJ("res_type", strLLIIL);
        c0lab.LJ("url", url);
        if (numLJJJLZIJ != null) {
            c0lab.LIZ(numLJJJLZIJ.intValue(), "asset_duration");
        }
        C20684815ws.LJIILLIIL("tools_performance_on_this_day_preview_post_load", c0lab.LIZ);
    }
}
