package X;

import Y.ARunnableS108S0100000_8;
import Y.ATListenerS442S0100000_8;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import com.bytedance.scene.group.UserVisibleHintGroupScene;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChoosePhotoPreviewPageConfig;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.vesdk.VEUtils;
import com.ss.ttvideoengine.TTVideoEngine;
import com.zhiliaoapp.musically.R;
import fyo.e;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS552S0100000_8;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0MRc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C568420MRc extends UserVisibleHintGroupScene implements InterfaceC525540KjI {
    public final String LLJJIJIIJIL;
    public int LLJJIJIL;
    public int LLJJJ;
    public String LLJJJIL;
    public EnumC568470MRh LLJJJJ;
    public TikTokMediaModel LLJJJJJIL;
    public InterfaceC568490MRj LLJJJJLIIL;
    public int LLJJL;
    public TTVideoEngine LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public Surface LLJLL;
    public boolean LLJLLIL;
    public boolean LLJLLL;
    public long LLJZ;
    public final C01GW LLJZIJLIL;
    public View LLL;
    public final C01GW LLLF;
    public final C01GW LLLFF;
    public boolean LLLFFI;
    public Function1<? super TikTokMediaModel, Unit> LLLFZ;

    @Override // X.InterfaceC525540KjI
    public final UserVisibleHintGroupScene LJI() {
        return this;
    }

    public static final C21570819bO LLLLIILL() {
        C21570819bO c21570819bO = new C21570819bO();
        c21570819bO.LJ = 220L;
        c21570819bO.LJFF = 220L;
        c21570819bO.LJI = 220L;
        c21570819bO.LJII = 220L;
        Pair<PointF, PointF> pair = C568500MRk.LIZ;
        c21570819bO.LIZ = new InterpolatorC1088790eRJ(pair.getFirst(), pair.getSecond());
        c21570819bO.LIZIZ = new InterpolatorC1088790eRJ(pair.getFirst(), pair.getSecond());
        c21570819bO.LIZJ = new InterpolatorC1088790eRJ(pair.getFirst(), pair.getSecond());
        c21570819bO.LIZLLL = new InterpolatorC1088790eRJ(pair.getFirst(), pair.getSecond());
        return c21570819bO;
    }

    @Override // X.InterfaceC525540KjI
    public final void LJJZZIII() {
        TTVideoEngine tTVideoEngine = this.LLJJLIIIJLLLLLLLZ;
        if (tTVideoEngine != null && tTVideoEngine.LJJLIIIJILLIZJL() == 2) {
            LLLLJ();
        }
        TTVideoEngine tTVideoEngine2 = this.LLJJLIIIJLLLLLLLZ;
        if (tTVideoEngine2 == null || tTVideoEngine2.LIZ.LJIILL != 2) {
            return;
        }
        LLLLJ();
    }

    public final TextureView LLLLIL() {
        return (TextureView) this.LLJZIJLIL.getValue();
    }

    public final void LLLLILI() {
        TTVideoEngine tTVideoEngine;
        TTVideoEngine tTVideoEngine2 = this.LLJJLIIIJLLLLLLLZ;
        if (((tTVideoEngine2 == null || tTVideoEngine2.LIZ.LJIILL != 1) && !(C534210KxH.LIZ() && ((View) this.LLLFF.getValue()).getVisibility() == 0)) || (tTVideoEngine = this.LLJJLIIIJLLLLLLLZ) == null) {
            return;
        }
        tTVideoEngine.pause();
    }

    public final void LLLLJ() {
        TTVideoEngine tTVideoEngine = this.LLJJLIIIJLLLLLLLZ;
        if (tTVideoEngine != null) {
            C786410Ut5.Q4(1.0f, LLLLIL());
            if (!C534210KxH.LIZ()) {
                tTVideoEngine.play();
                return;
            }
            C20736016Cg c20736016Cg = this.LLJILLL;
            if (c20736016Cg.LL == null) {
                c20736016Cg.LL = new LifecycleRegistry(c20736016Cg);
            }
            if (c20736016Cg.LL.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                tTVideoEngine.play();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void exit() {
        /*
            r8 = this;
            X.0MRj r0 = r8.LLJJJJLIIL
            if (r0 == 0) goto L7
            r0.LLZZZIL()
        L7:
            X.0MRj r0 = r8.LLJJJJLIIL
            if (r0 == 0) goto L3d
            android.view.View r0 = r0.LIZJ()
            if (r0 == 0) goto L3d
            X.0MRv r1 = new X.0MRv
            r1.<init>()
            android.view.View r0 = r8.LLL
            X.0MRp r2 = X.C568500MRk.LIZ(r0)
            if (r2 == 0) goto L3d
            android.graphics.Rect r3 = r1.LIZIZ()
            android.graphics.Rect r4 = r1.LIZJ()
            X.19ar r5 = new X.19ar
            r5.<init>()
            X.19bO r6 = LLLLIILL()
            kotlin.jvm.internal.AwS552S0100000_8 r7 = new kotlin.jvm.internal.AwS552S0100000_8
            r0 = 1047(0x417, float:1.467E-42)
            r7.<init>(r8, r0)
            r2.LIZ(r3, r4, r5, r6, r7)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r0 != 0) goto L47
        L3d:
            Y.ARunnableS108S0100000_8 r1 = new Y.ARunnableS108S0100000_8
            r0 = 134(0x86, float:1.88E-43)
            r1.<init>(r8, r0)
            X.C12WG.LIZJ(r8, r1)
        L47:
            X.0LAB r3 = new X.0LAB
            r3.<init>()
            long r4 = java.lang.System.currentTimeMillis()
            long r0 = r8.LLJZ
            long r4 = r4 - r0
            java.lang.String r0 = "duration"
            r3.LIZIZ(r4, r0)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            android.view.TextureView r0 = r8.LLLLIL()
            int r0 = r0.getWidth()
            r1.append(r0)
            r4 = 42
            r1.append(r4)
            android.view.TextureView r0 = r8.LLLLIL()
            int r0 = r0.getHeight()
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "resolution"
            r3.LJ(r0, r1)
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel r0 = r8.LLJJJJJIL
            r1 = 0
            if (r0 == 0) goto Lc4
            int r0 = r0.width
        L8b:
            r2.append(r0)
            r2.append(r4)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel r0 = r8.LLJJJJJIL
            if (r0 == 0) goto L97
            int r1 = r0.width
        L97:
            r2.append(r1)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r2)
            java.lang.String r0 = "original_resolution"
            r3.LJ(r0, r1)
            java.lang.String r1 = "content_cnt"
            int r0 = r8.LLJJL
            r3.LIZ(r0, r1)
            java.lang.String r0 = "fps"
            r1 = -1
            r3.LIZ(r1, r0)
            java.lang.String r0 = "lag_count"
            r3.LIZ(r1, r0)
            java.lang.String r0 = "lag_total_duration"
            r3.LIZ(r1, r0)
            java.util.List<X.09Fs> r0 = X.C2341909Fp.LIZ
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.LIZ
            java.lang.String r0 = "tool_performance_content_preview"
            X.C2341909Fp.LIZ(r0, r1)
            return
        Lc4:
            r0 = 0
            goto L8b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C568420MRc.exit():void");
    }

    @Override // X.InterfaceC525540KjI
    public final void onPageSelected() {
        C12WG.LIZLLL(this, new ARunnableS108S0100000_8(this, 135), 300L);
    }

    public C568420MRc() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreviewRemoteVideoScene");
        sbLIZ.append(hashCode());
        this.LLJJIJIIJIL = C2188811AlT.LIZIZ(sbLIZ);
        this.LLJJIJIL = 2;
        this.LLJJJIL = "";
        this.LLJJJJ = EnumC568470MRh.NONE;
        new CreativeInfo(null, 0, null, 7, null);
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 1049));
        this.LLLF = C452501pT.LIZIZ(new AwS552S0100000_8(this, 1050));
        this.LLLFF = C452501pT.LIZIZ(new AwS552S0100000_8(this, 1048));
        this.LLLFFI = true;
    }

    @Override // X.InterfaceC525540KjI
    public final void LLJ() {
        LLLLILI();
        TTVideoEngine tTVideoEngine = this.LLJJLIIIJLLLLLLLZ;
        if (tTVideoEngine == null || tTVideoEngine.LJJLIIIJILLIZJL() != 1) {
            return;
        }
        tTVideoEngine.pause();
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onDestroyView() throws JSONException {
        super.onDestroyView();
        TTVideoEngine tTVideoEngine = this.LLJJLIIIJLLLLLLLZ;
        if (tTVideoEngine != null) {
            tTVideoEngine.release();
            Surface surface = this.LLJLL;
            if (surface != null) {
                surface.release();
            }
            if (this.LLJL) {
                boolean z = this.LLJLILLLLZIIL;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("is_4k", this.LLJJJJ == EnumC568470MRh.DISABLE_4K ? 1 : 0);
                jSONObject.put("error_code", this.LLJJJ);
                jSONObject.put("error_message", this.LLJJJIL);
                jSONObject.put("display_status", this.LLJJJJ.ordinal());
                jSONObject.put("player_type", this.LLJJIJIL);
                jSONObject.put("video_watched_duration", Float.valueOf((this.LLJJLIIIJLLLLLLLZ != null ? r0.LJJLL() : 0.0f) / LSPassThroughRecordSizeConfig.DEFAULT));
                C1637890six.LJ("tool_performance_preview_video_play_status", z ? 1 : 0, jSONObject);
            }
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onPause() {
        TTVideoEngine tTVideoEngine;
        super.onPause();
        LLLLILI();
        if (this.LLJJ && this.LLJL && (tTVideoEngine = this.LLJJLIIIJLLLLLLLZ) != null) {
            tTVideoEngine.pause();
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
        if (this.LLJJ && this.LLJL) {
            LLLLJ();
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onStop() {
        InterfaceC568490MRj interfaceC568490MRj;
        ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfigLLZZLLIL;
        InterfaceC568490MRj interfaceC568490MRj2;
        C531250KsV c531250KsVLLZZJLIL;
        ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfigLLZZLLIL2;
        super.onStop();
        InterfaceC568490MRj interfaceC568490MRj3 = this.LLJJJJLIIL;
        if (((interfaceC568490MRj3 == null || (choosePhotoPreviewPageConfigLLZZLLIL2 = interfaceC568490MRj3.LLZZLLIL()) == null || !choosePhotoPreviewPageConfigLLZZLLIL2.isUgcTemplate) && ((interfaceC568490MRj = this.LLJJJJLIIL) == null || (choosePhotoPreviewPageConfigLLZZLLIL = interfaceC568490MRj.LLZZLLIL()) == null || !choosePhotoPreviewPageConfigLLZZLLIL.isEditorProReplace)) || (interfaceC568490MRj2 = this.LLJJJJLIIL) == null || (c531250KsVLLZZJLIL = interfaceC568490MRj2.LLZZJLIL()) == null) {
            return;
        }
        c531250KsVLLZZJLIL.LLIZ.LIZJ();
    }

    @Override // X.InterfaceC525540KjI
    public final void onBackPress() {
        exit();
    }

    @Override // X.InterfaceC525540KjI
    public final void LJLILLLLZI(TikTokMediaModel tikTokMediaModel) {
        if (tikTokMediaModel == null) {
            C537680L6w.LIZ(C533790Kwb.LIZIZ, this.LLJJIJIIJIL, "set null mediaModel ", null);
            return;
        }
        this.LLJJJJJIL = tikTokMediaModel;
        C533790Kwb c533790Kwb = C533790Kwb.LIZIZ;
        String str = this.LLJJIJIIJIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setMediaModel ");
        sbLIZ.append(tikTokMediaModel);
        C201955140j.LIZLLL(c533790Kwb, str, C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene
    public final void LLLLIIIILLL(boolean z) {
        super.LLLLIIIILLL(z);
        if (z) {
            Function1<? super TikTokMediaModel, Unit> function1 = this.LLLFZ;
            if (function1 != null) {
                function1.invoke(this.LLJJJJJIL);
            }
        } else {
            InterfaceC568550MRp interfaceC568550MRpLIZ = C568500MRk.LIZ(this.LLL);
            if (interfaceC568550MRpLIZ != null) {
                interfaceC568550MRpLIZ.reset();
            }
        }
        TTVideoEngine tTVideoEngine = this.LLJJLIIIJLLLLLLLZ;
        if (tTVideoEngine != null) {
            if (this.LLJL) {
                if (z) {
                    LLLLJ();
                    return;
                } else {
                    tTVideoEngine.pause();
                    tTVideoEngine.LJIJJLI(0, null);
                    return;
                }
            }
            if (this.LLJLIL || this.LLJLL == null || !z) {
                return;
            }
            LLLLJ();
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        int i;
        String str;
        TikTokMediaModel tikTokMediaModel;
        String strLJFF;
        final View viewLIZJ;
        InterfaceC568490MRj interfaceC568490MRj;
        int i2;
        int i3;
        super.onActivityCreated(bundle);
        this.LLJZ = System.currentTimeMillis();
        C786410Ut5.LLIIIILZ(LLLLIL(), 8);
        C786410Ut5.LLZZLLIL((C1322110kVd) this.LLLF.getValue(), 8);
        TikTokMediaModel tikTokMediaModel2 = this.LLJJJJJIL;
        if (tikTokMediaModel2 != null) {
            i = tikTokMediaModel2.width;
        } else {
            i = 0;
        }
        String str2 = null;
        if ((i <= 0 || (tikTokMediaModel2 != null && tikTokMediaModel2.height <= 0)) && tikTokMediaModel2 != null && (str = tikTokMediaModel2.onlineVideoUrl) != null) {
            C0CHQ.LIZ().LJJIZ();
            VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(str);
            if (videoFileInfo != null && (tikTokMediaModel = this.LLJJJJJIL) != null) {
                tikTokMediaModel.width = videoFileInfo.width;
                tikTokMediaModel.height = videoFileInfo.height;
            }
        }
        if (C568500MRk.LIZJ(this.LLJJJJJIL)) {
            this.LLJJJJ = EnumC568470MRh.DISABLE_4K;
            C786410Ut5.LLZZLLIL((C1322110kVd) this.LLLF.getValue(), 0);
            TikTokMediaModel tikTokMediaModel3 = this.LLJJJJJIL;
            if (tikTokMediaModel3 != null) {
                C1324750kZt.LJIIIZ((C1322110kVd) this.LLLF.getValue(), tikTokMediaModel3.thumbnailOnlineUrl, -1, -1);
            }
        } else {
            this.LLJJJJ = EnumC568470MRh.NORMAL_VIDEO_PLAY;
            C786410Ut5.LLZZLLIL((C1322110kVd) this.LLLF.getValue(), 0);
            TikTokMediaModel tikTokMediaModel4 = this.LLJJJJJIL;
            if (tikTokMediaModel4 != null) {
                C1324750kZt.LJIIIZ((C1322110kVd) this.LLLF.getValue(), tikTokMediaModel4.thumbnailOnlineUrl, -1, -1);
            }
            C786410Ut5.LLIIIILZ(LLLLIL(), 0);
            C533790Kwb c533790Kwb = C533790Kwb.LIZIZ;
            C201955140j.LIZLLL(c533790Kwb, this.LLJJIJIIJIL, "show loading");
            C01GW c01gw = C283690B9z.LIZ;
            if (((Number) c01gw.getValue()).longValue() != -1 && !((Boolean) C536120L0w.LIZ.getValue()).booleanValue()) {
                this.LLLFFI = true;
                C12WG.LIZLLL(this, new ARunnableS108S0100000_8(this, 136), ((Number) c01gw.getValue()).longValue());
            } else {
                C786410Ut5.E1((C1688850u39) this.LLLFF.getValue(), 0);
            }
            this.LLJJIJIL = 0;
            TTVideoEngine tTVideoEngine = new TTVideoEngine(C786410Ut5.L3(requireActivity()), this.LLJJIJIL);
            this.LLJJLIIIJLLLLLLLZ = tTVideoEngine;
            tTVideoEngine.LLILZIL("preview");
            TTVideoEngine tTVideoEngine2 = this.LLJJLIIIJLLLLLLLZ;
            if (tTVideoEngine2 != null) {
                tTVideoEngine2.setLooping(true);
            }
            TTVideoEngine tTVideoEngine3 = this.LLJJLIIIJLLLLLLLZ;
            if (tTVideoEngine3 != null) {
                TikTokMediaModel tikTokMediaModel5 = this.LLJJJJJIL;
                if (tikTokMediaModel5 != null) {
                    str2 = tikTokMediaModel5.onlineVideoUrl;
                }
                tTVideoEngine3.LJIJI(str2);
            }
            if (C2495709qF.LIZ() && C568500MRk.LIZIZ(this.LLJJJJJIL)) {
                TTVideoEngine tTVideoEngine4 = this.LLJJLIIIJLLLLLLLZ;
                if (tTVideoEngine4 != null) {
                    tTVideoEngine4.LIZJ(7, 1);
                }
            } else {
                TikTokMediaModel tikTokMediaModel6 = this.LLJJJJJIL;
                if (tikTokMediaModel6 != null && (strLJFF = tikTokMediaModel6.LJFF()) != null) {
                    C0CHQ.LIZ().LJJIZ();
                    VEUtils.VEVideoFileInfo videoFileInfo2 = VEUtils.getVideoFileInfo(strLJFF);
                    if (videoFileInfo2 != null && videoFileInfo2.bitDepth == 10) {
                        TTVideoEngine tTVideoEngine5 = this.LLJJLIIIJLLLLLLLZ;
                        if (tTVideoEngine5 != null) {
                            tTVideoEngine5.LIZJ(7, 1);
                        }
                        C201955140j.LJIILL(c533790Kwb, this.LLJJIJIIJIL, "enable hardware for 10bit depth video");
                    }
                }
            }
            TTVideoEngine tTVideoEngine6 = this.LLJJLIIIJLLLLLLLZ;
            if (tTVideoEngine6 != null) {
                tTVideoEngine6.LLI(new AbstractC568620MRw() { // from class: X.0MRd
                    @Override // cxo.a4
                    public final void LJ(TTVideoEngine tTVideoEngine7) {
                        Integer numValueOf;
                        C786410Ut5.LLZZLLIL((C1322110kVd) this.LL.LLLF.getValue(), 8);
                        C568420MRc c568420MRc = this.LL;
                        c568420MRc.getClass();
                        C201955140j.LIZLLL(C533790Kwb.LIZIZ, c568420MRc.LLJJIJIIJIL, "dismiss loading");
                        c568420MRc.LLLFFI = false;
                        if (((View) c568420MRc.LLLFF.getValue()).getVisibility() == 0) {
                            C786410Ut5.E1((C1688850u39) c568420MRc.LLLFF.getValue(), 8);
                        }
                        C568420MRc c568420MRc2 = this.LL;
                        c568420MRc2.getClass();
                        C0LAB c0lab = new C0LAB();
                        TikTokMediaModel tikTokMediaModel7 = c568420MRc2.LLJJJJJIL;
                        if (tikTokMediaModel7 != null) {
                            numValueOf = Integer.valueOf(tikTokMediaModel7.type);
                        } else {
                            numValueOf = null;
                        }
                        c0lab.LJ("content_type", String.valueOf(numValueOf));
                        c0lab.LIZIZ(System.currentTimeMillis() - c568420MRc2.LLJZ, "first_frame_duration");
                        c0lab.LIZ(c568420MRc2.LLJJL, "content_cnt");
                        c0lab.LIZ(c568420MRc2.isVisible() ? 1 : 0, "is_visible");
                        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
                        C2341909Fp.LIZ("tool_performance_album_preview_first_frame", c0lab.LIZ);
                    }

                    @Override // cxo.a4
                    public final void LJI(e eVar) {
                        if (eVar != null) {
                            C568420MRc c568420MRc = this.LL;
                            c568420MRc.LLJJJ = eVar.LIZ;
                            c568420MRc.LLJJJIL = eVar.toString();
                        }
                        this.LL.LLJLILLLLZIIL = true;
                    }

                    @Override // cxo.a4
                    public final void LJIILIIL(TTVideoEngine tTVideoEngine7) {
                        TTVideoEngine tTVideoEngine8;
                        C568420MRc c568420MRc = this.LL;
                        c568420MRc.LLJL = true;
                        if (!c568420MRc.LLJJ && (tTVideoEngine8 = c568420MRc.LLJJLIIIJLLLLLLLZ) != null) {
                            tTVideoEngine8.pause();
                        }
                        C568420MRc c568420MRc2 = this.LL;
                        TTVideoEngine tTVideoEngine9 = c568420MRc2.LLJJLIIIJLLLLLLLZ;
                        if (tTVideoEngine9 != null) {
                            int iLJJLJ = tTVideoEngine9.LJJLJ();
                            int iLJJLIIIJLLLLLLLZ = tTVideoEngine9.LJJLIIIJLLLLLLLZ();
                            c568420MRc2.getClass();
                            if (iLJJLJ > 0 && iLJJLIIIJLLLLLLLZ > 0) {
                                int iLJIIIIZZ = C12ES.LJIIIIZZ(c568420MRc2.requireActivity());
                                int iLJIIJ = C12ES.LJIIJ(c568420MRc2.requireActivity());
                                float f = iLJJLIIIJLLLLLLLZ;
                                float f2 = iLJJLJ;
                                float fLJIIJ = (C12ES.LJIIJ(c568420MRc2.requireActivity()) * f) / f2;
                                float f3 = iLJIIIIZZ;
                                if (fLJIIJ >= f3) {
                                    iLJIIJ = (int) ((f3 * f2) / f);
                                } else {
                                    iLJIIIIZZ = (int) fLJIIJ;
                                }
                                C12ES.LJIIZILJ(iLJIIJ, iLJIIIIZZ, c568420MRc2.LLLLIL());
                                C533790Kwb c533790Kwb2 = C533790Kwb.LIZIZ;
                                String str3 = c568420MRc2.LLJJIJIIJIL;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("For Test! update to ");
                                sbLIZ.append(iLJIIJ);
                                sbLIZ.append('*');
                                sbLIZ.append(iLJIIIIZZ);
                                sbLIZ.append(", TextureView Size: ");
                                sbLIZ.append(c568420MRc2.LLLLIL().getWidth());
                                sbLIZ.append('*');
                                sbLIZ.append(c568420MRc2.LLLLIL().getHeight());
                                C201955140j.LJIILL(c533790Kwb2, str3, C2188811AlT.LIZIZ(sbLIZ));
                            }
                        }
                    }
                });
            }
            LLLLIL().setSurfaceTextureListener(new TextureView.SurfaceTextureListener() { // from class: X.0MRl
                @Override // android.view.TextureView.SurfaceTextureListener
                public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                    return true;
                }

                @Override // android.view.TextureView.SurfaceTextureListener
                public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i4, int i5) {
                }

                @Override // android.view.TextureView.SurfaceTextureListener
                public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                }

                @Override // android.view.TextureView.SurfaceTextureListener
                public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i4, int i5) {
                    C568420MRc c568420MRc = this.LL;
                    TTVideoEngine tTVideoEngine7 = c568420MRc.LLJJLIIIJLLLLLLLZ;
                    if (tTVideoEngine7 != null && c568420MRc.LLJLL == null) {
                        Surface surface = new Surface(surfaceTexture);
                        c568420MRc.LLJLL = surface;
                        tTVideoEngine7.setSurface(surface);
                        if (c568420MRc.LLJJ) {
                            c568420MRc.LLJLIL = true;
                            c568420MRc.LLLLJ();
                        }
                    }
                }
            });
        }
        View viewRequireViewById = requireViewById(R.id.iuv);
        this.LLL = viewRequireViewById;
        InterfaceC568550MRp interfaceC568550MRpLIZ = C568500MRk.LIZ(viewRequireViewById);
        if (interfaceC568550MRpLIZ != null) {
            TikTokMediaModel tikTokMediaModel7 = this.LLJJJJJIL;
            if (tikTokMediaModel7 != null) {
                i2 = tikTokMediaModel7.width;
                i3 = tikTokMediaModel7.height;
            } else {
                i2 = 0;
                i3 = 0;
            }
            interfaceC568550MRpLIZ.setVideoSize(i2, i3);
            interfaceC568550MRpLIZ.setGestureListener(new InterfaceC21573019bk() { // from class: X.0MRi
                public float LIZ;

                @Override // X.InterfaceC21571419bU
                public final void LIZ() {
                }

                @Override // X.InterfaceC21571419bU
                public final void LIZIZ() {
                    C568420MRc c568420MRc = this.LIZIZ;
                    if (!c568420MRc.LLJLLIL && !c568420MRc.LLJLLL) {
                        c568420MRc.exit();
                        return;
                    }
                    InterfaceC568490MRj interfaceC568490MRj2 = c568420MRc.LLJJJJLIIL;
                    if (interfaceC568490MRj2 != null) {
                        interfaceC568490MRj2.LLZZ();
                    }
                }

                @Override // X.InterfaceC21571419bU
                public final void onExit() {
                    this.LIZIZ.exit();
                }

                @Override // X.InterfaceC21573019bk
                public final void onScaleBegin() {
                    InterfaceC568490MRj interfaceC568490MRj2 = this.LIZIZ.LLJJJJLIIL;
                    if (interfaceC568490MRj2 != null) {
                        interfaceC568490MRj2.onScaleBegin();
                    }
                }

                @Override // X.InterfaceC21571419bU
                public final void LIZJ(float f) {
                    InterfaceC568490MRj interfaceC568490MRj2 = this.LIZIZ.LLJJJJLIIL;
                    if (interfaceC568490MRj2 != null) {
                        interfaceC568490MRj2.LJIIIZ(f);
                    }
                    C568420MRc c568420MRc = this.LIZIZ;
                    TTVideoEngine tTVideoEngine7 = c568420MRc.LLJJLIIIJLLLLLLLZ;
                    if (tTVideoEngine7 != null) {
                        if (f < 1.0f) {
                            tTVideoEngine7.pause();
                        } else if (f == 1.0f && this.LIZ != f) {
                            c568420MRc.LLLLJ();
                        }
                    }
                    this.LIZ = f;
                }

                @Override // X.InterfaceC21573019bk
                public final void LLLLJI(float f) {
                    InterfaceC568490MRj interfaceC568490MRj2 = this.LIZIZ.LLJJJJLIIL;
                    if (interfaceC568490MRj2 != null) {
                        interfaceC568490MRj2.b();
                    }
                }
            });
            View view = this.LLL;
            if (view != null) {
                view.setOnTouchListener(new ATListenerS442S0100000_8(this, 5));
            }
        }
        InterfaceC568490MRj interfaceC568490MRj2 = this.LLJJJJLIIL;
        if (interfaceC568490MRj2 != null && (viewLIZJ = interfaceC568490MRj2.LIZJ()) != null && (interfaceC568490MRj = this.LLJJJJLIIL) != null && interfaceC568490MRj.LJJI()) {
            InterfaceC568490MRj interfaceC568490MRj3 = this.LLJJJJLIIL;
            if (interfaceC568490MRj3 != null) {
                interfaceC568490MRj3.LJII();
            }
            C0LD6 c0ld6 = new C0LD6() { // from class: X.0MRs
                @Override // X.C0LD6
                public final View LIZ() {
                    return viewLIZJ;
                }
            };
            InterfaceC568550MRp interfaceC568550MRpLIZ2 = C568500MRk.LIZ(this.LLL);
            if (interfaceC568550MRpLIZ2 != null) {
                interfaceC568550MRpLIZ2.LIZIZ(c0ld6.LIZIZ(), c0ld6.LIZJ(), new C21567519ar(), LLLLIILL());
            }
        }
    }

    @Override // X.InterfaceC525540KjI
    public final void LJJJJLI(int i, InterfaceC568490MRj interfaceC568490MRj) {
        this.LLJJL = i;
        this.LLJJJJLIIL = interfaceC568490MRj;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        if (this.LLJLLIL) {
            i = R.layout.er7;
        } else {
            i = R.layout.er6;
        }
        return (ViewGroup) C786410Ut5.Td(layoutInflater, i, viewGroup, false);
    }
}
