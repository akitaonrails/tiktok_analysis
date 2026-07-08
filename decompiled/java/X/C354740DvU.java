package X;

import android.graphics.RectF;
import android.text.TextUtils;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.nle.editor_jni.INLEBrushRuntime;
import com.bytedance.ies.nle.editor_jni.INLEMediaRuntime;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESeekFlag;
import com.bytedance.ies.nle.editor_jni.NLESegmentBrushSticker;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.PairIntInt;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.comment.image.brush.data.CommentImageBrushParams;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import com.ss.android.vesdk.VEConfigCenter;
import com.ss.ugc.android.editor.core.model.CircleParams;
import com.ss.ugc.android.editor.core.model.CutoutBrushParams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS549S0100000_5;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0DvU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C354740DvU implements InterfaceC19678211yu {
    public final LiveData<InterfaceC1452170ntP> LIZ;
    public final C19571411hg LIZIZ;
    public PthreadTimer LIZJ;
    public String LJFF;
    public String LJI;
    public final MutableLiveData<Boolean> LJIIJ;
    public final MutableLiveData<Boolean> LJIIJJI;
    public final MutableLiveData<Boolean> LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;
    public int LJIILL;
    public NLESegmentBrushSticker LJIILLIIL;
    public final Boolean LJIIZILJ;
    public final C01GW LJIJ;
    public final C01GW LJIJI;
    public final C01GW LJIJJ;
    public final List<Float> LIZLLL = new ArrayList();
    public final CircleParams LJ = new CircleParams(0, 0, false, 0.0f, 0.0f, null, null, 127, null);
    public String LJII = "#0BE09B";
    public EnumC356110Dxh LJIIIIZZ = EnumC356110Dxh.NORMAL;
    public float LJIIIZ = 16.0f;

    @Override // X.InterfaceC19678211yu
    public final boolean LIZ() {
        return this.LJIILJJIL > 0;
    }

    public final C1463670oBx LIZLLL() {
        return (C1463670oBx) this.LJIJJ.getValue();
    }

    public final INLEMediaSession LJ() {
        return (INLEMediaSession) this.LJIJI.getValue();
    }

    @Override // X.InterfaceC19678211yu
    public final void LJIILL() {
        this.LJIILJJIL += this.LJIILIIL;
        this.LJIILIIL = 0;
        this.LJIILL = 0;
        PthreadTimer pthreadTimer = this.LIZJ;
        if (pthreadTimer != null) {
            pthreadTimer.cancel();
        }
        this.LIZJ = null;
    }

    @Override // X.InterfaceC19678211yu
    public final boolean Q2() {
        return this.LJIILJJIL > 0;
    }

    @Override // X.InterfaceC19678211yu
    public final void LJIIL() {
        INLEPlayer playerApi;
        INLEMediaSession iNLEMediaSessionLJ = LJ();
        if (iNLEMediaSessionLJ != null && (playerApi = iNLEMediaSessionLJ.getPlayerApi()) != null) {
            playerApi.seekTime(0L, NLESeekFlag.EDITOR_SEEK_FLAG_LastSeek);
        }
        C1463670oBx c1463670oBxLIZLLL = LIZLLL();
        if (c1463670oBxLIZLLL != null) {
            c1463670oBxLIZLLL.refreshCurrentFrame();
        }
    }

    @Override // X.InterfaceC19678211yu
    public final Pair<Integer, Integer> getCanvasSize() {
        INLEMediaRuntime mediaRuntimeApi;
        PairIntInt canvasSize;
        INLEMediaSession iNLEMediaSessionLJ = LJ();
        if (iNLEMediaSessionLJ == null || (mediaRuntimeApi = iNLEMediaSessionLJ.getMediaRuntimeApi()) == null || (canvasSize = mediaRuntimeApi.getCanvasSize()) == null) {
            return null;
        }
        return new Pair<>(Integer.valueOf(canvasSize.getFirst()), Integer.valueOf(canvasSize.getSecond()));
    }

    @Override // X.InterfaceC19678211yu
    public final /* bridge */ /* synthetic */ MutableLiveData LJIIIZ() {
        return this.LJIIL;
    }

    @Override // X.InterfaceC19678211yu
    public final /* bridge */ /* synthetic */ MutableLiveData LJIILLIIL() {
        return this.LJIIJJI;
    }

    public final void LIZIZ(C354800Dva c354800Dva) {
        Pair pair;
        float width = c354800Dva.LIZLLL.getWidth();
        float f = 1.0f;
        if (width < 1.0f) {
            width = 1.0f;
        }
        float height = c354800Dva.LIZLLL.getHeight();
        if (height < 1.0f) {
            height = 1.0f;
        }
        float f2 = c354800Dva.LJ;
        if (f2 <= 0.0f) {
            f2 = 1.0f;
        }
        float f3 = height * f2;
        float f4 = c354800Dva.LJFF;
        if (f4 <= 0.0f) {
            f4 = 1.0f;
        }
        float x = c354800Dva.LIZJ.getX();
        float y = c354800Dva.LIZJ.getY();
        if (f4 > f2) {
            pair = new Pair(Float.valueOf(f3), Float.valueOf(f3 / f4));
        } else {
            pair = new Pair(Float.valueOf(f4 * height), Float.valueOf(height));
        }
        float fFloatValue = ((Number) pair.getFirst()).floatValue();
        float fFloatValue2 = ((Number) pair.getSecond()).floatValue();
        if (fFloatValue < 1.0f) {
            fFloatValue = 1.0f;
        }
        if (fFloatValue2 >= 1.0f) {
            f = fFloatValue2;
        }
        float f5 = 2;
        float f6 = fFloatValue / f5;
        float f7 = f / f5;
        float f8 = width / 2.0f;
        float f9 = height / 2.0f;
        RectF rectF = new RectF(f8 - f6, f9 - f7, f8 + f6, f9 + f7);
        Pair pair2 = new Pair(Float.valueOf(C13LZ.LIZLLL(x, rectF.left, rectF.right)), Float.valueOf(C13LZ.LIZLLL(y, rectF.top, rectF.bottom)));
        Pair pair3 = new Pair(Float.valueOf((((Number) pair2.getFirst()).floatValue() - rectF.left) / fFloatValue), Float.valueOf((((Number) pair2.getSecond()).floatValue() - rectF.top) / f));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bachBrushData ");
        sbLIZ.append(((Number) pair3.getFirst()).floatValue());
        sbLIZ.append(' ');
        sbLIZ.append(((Number) pair3.getSecond()).floatValue());
        C355090Dw3.LJ("CommentImageBrushEditorImpl", C2188811AlT.LIZIZ(sbLIZ));
        ((ArrayList) this.LIZLLL).add(pair3.getFirst());
        ((ArrayList) this.LIZLLL).add(pair3.getSecond());
    }

    @Override // X.InterfaceC19678211yu
    public final void LJII(NLETrackSlot nLETrackSlot) {
        int i;
        C348100Dkm c348100DkmLIZLLL;
        INLEMediaSession iNLEMediaSession;
        INLEBrushRuntime brushApi;
        if (nLETrackSlot == null || (i = this.LJIILL) <= 0) {
            return;
        }
        this.LJIILIIL++;
        int i2 = i - 1;
        this.LJIILL = i2;
        if (i2 <= 0) {
            this.LJIIL.setValue(Boolean.FALSE);
        }
        this.LJIIJ.setValue(Boolean.TRUE);
        C1463670oBx c1463670oBxLIZLLL = LIZLLL();
        if (c1463670oBxLIZLLL != null && (c348100DkmLIZLLL = c1463670oBxLIZLLL.LIZLLL()) != null && (iNLEMediaSession = c348100DkmLIZLLL.LIZIZ) != null && (brushApi = iNLEMediaSession.getBrushApi()) != null) {
            brushApi.redo2DBrush(nLETrackSlot.getUUID());
        }
        C1463670oBx c1463670oBxLIZLLL2 = LIZLLL();
        if (c1463670oBxLIZLLL2 != null) {
            c1463670oBxLIZLLL2.refreshCurrentFrame();
        }
        LIZJ(this, EnumC356070Dxd.COMMIT);
    }

    @Override // X.InterfaceC19678211yu
    public final void LJIIJ(NLETrackSlot nLETrackSlot) {
        C348100Dkm c348100DkmLIZLLL;
        INLEMediaSession iNLEMediaSession;
        INLEBrushRuntime brushApi;
        if (nLETrackSlot == null) {
            return;
        }
        for (int iAbs = Math.abs(this.LJIILIIL); iAbs > 0; iAbs--) {
            C1463670oBx c1463670oBxLIZLLL = LIZLLL();
            if (c1463670oBxLIZLLL != null && (c348100DkmLIZLLL = c1463670oBxLIZLLL.LIZLLL()) != null && (iNLEMediaSession = c348100DkmLIZLLL.LIZIZ) != null && (brushApi = iNLEMediaSession.getBrushApi()) != null) {
                brushApi.undo2DBrush(nLETrackSlot.getUUID());
            }
        }
        this.LJIILIIL = 0;
        this.LJIILL = 0;
        this.LJIIL.setValue(Boolean.FALSE);
        PthreadTimer pthreadTimer = this.LIZJ;
        if (pthreadTimer != null) {
            pthreadTimer.cancel();
        }
        this.LIZJ = null;
        C1463670oBx c1463670oBxLIZLLL2 = LIZLLL();
        if (c1463670oBxLIZLLL2 != null) {
            c1463670oBxLIZLLL2.refreshCurrentFrame();
        }
        LIZJ(this, EnumC356070Dxd.COMMIT);
    }

    @Override // X.InterfaceC19678211yu
    public final void LJIIJJI(C354800Dva c354800Dva) {
        float fFloatValue;
        Pair pair;
        INLEPlayer playerApi;
        C348100Dkm c348100DkmLIZLLL;
        INLEMediaSession iNLEMediaSession;
        INLEBrushRuntime brushApi;
        C348100Dkm c348100DkmLIZLLL2;
        INLEMediaSession iNLEMediaSession2;
        INLEBrushRuntime brushApi2;
        C348100Dkm c348100DkmLIZLLL3;
        INLEMediaSession iNLEMediaSession3;
        INLEBrushRuntime brushApi3;
        INLEPlayer playerApi2;
        C348100Dkm c348100DkmLIZLLL4;
        INLEMediaSession iNLEMediaSession4;
        INLEBrushRuntime brushApi4;
        C348100Dkm c348100DkmLIZLLL5;
        INLEMediaSession iNLEMediaSession5;
        INLEBrushRuntime brushApi5;
        INLEPlayer playerApi3;
        C348100Dkm c348100DkmLIZLLL6;
        INLEMediaSession iNLEMediaSession6;
        INLEBrushRuntime brushApi6;
        INLEMediaRuntime mediaRuntimeApi;
        PairIntInt canvasSize;
        Float fValueOf;
        NLETrackSlot nLETrackSlot = c354800Dva.LIZIZ;
        if (nLETrackSlot == null) {
            return;
        }
        float width = c354800Dva.LIZLLL.getWidth();
        float f = 1.0f;
        if (width < 1.0f) {
            width = 1.0f;
        }
        float height = c354800Dva.LIZLLL.getHeight();
        if (height < 1.0f) {
            height = 1.0f;
        }
        float f2 = c354800Dva.LJ;
        if (f2 <= 0.0f) {
            f2 = 1.0f;
        }
        float f3 = height * f2;
        INLEMediaSession iNLEMediaSessionLJ = LJ();
        if (iNLEMediaSessionLJ != null && (mediaRuntimeApi = iNLEMediaSessionLJ.getMediaRuntimeApi()) != null && (canvasSize = mediaRuntimeApi.getCanvasSize()) != null && canvasSize.getSecond() != 0 && (fValueOf = Float.valueOf(canvasSize.getFirst() / canvasSize.getSecond())) != null) {
            fFloatValue = fValueOf.floatValue();
        } else {
            fFloatValue = c354800Dva.LJFF;
        }
        if (fFloatValue <= 0.0f) {
            fFloatValue = 1.0f;
        }
        float x = c354800Dva.LIZJ.getX();
        float y = c354800Dva.LIZJ.getY();
        if (fFloatValue > f2) {
            pair = new Pair(Float.valueOf(f3), Float.valueOf(f3 / fFloatValue));
        } else {
            pair = new Pair(Float.valueOf(fFloatValue * height), Float.valueOf(height));
        }
        float fFloatValue2 = ((Number) pair.getFirst()).floatValue();
        float fFloatValue3 = ((Number) pair.getSecond()).floatValue();
        if (fFloatValue2 < 1.0f) {
            fFloatValue2 = 1.0f;
        }
        if (fFloatValue3 >= 1.0f) {
            f = fFloatValue3;
        }
        float f4 = 2;
        float f5 = fFloatValue2 / f4;
        float f6 = f / f4;
        float f7 = width / 2.0f;
        float f8 = height / 2.0f;
        RectF rectF = new RectF(f7 - f5, f8 - f6, f7 + f5, f8 + f6);
        Pair pair2 = new Pair(Float.valueOf(C13LZ.LIZLLL(x, rectF.left, rectF.right)), Float.valueOf(C13LZ.LIZLLL(y, rectF.top, rectF.bottom)));
        Pair pair3 = new Pair(Float.valueOf((((Number) pair2.getFirst()).floatValue() - f7) / f5), Float.valueOf((((Number) pair2.getSecond()).floatValue() - f8) / f6));
        float fFloatValue4 = ((Number) pair3.getFirst()).floatValue();
        float fFloatValue5 = ((Number) pair3.getSecond()).floatValue();
        int action = c354800Dva.LIZJ.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return;
                    }
                } else {
                    C1463670oBx c1463670oBxLIZLLL = LIZLLL();
                    if (c1463670oBxLIZLLL != null && (c348100DkmLIZLLL6 = c1463670oBxLIZLLL.LIZLLL()) != null && (iNLEMediaSession6 = c348100DkmLIZLLL6.LIZIZ) != null && (brushApi6 = iNLEMediaSession6.getBrushApi()) != null) {
                        brushApi6.processPanEvent(nLETrackSlot.getUUID(), fFloatValue4, fFloatValue5, 0.0f, 0.0f, 0.0f);
                    }
                    LIZIZ(c354800Dva);
                    INLEMediaSession iNLEMediaSessionLJ2 = LJ();
                    if (iNLEMediaSessionLJ2 == null || (playerApi3 = iNLEMediaSessionLJ2.getPlayerApi()) == null) {
                        return;
                    }
                    playerApi3.seekTime(0L, NLESeekFlag.EDITOR_SEEK_FLAG_LastSeek);
                    return;
                }
            }
            LIZIZ(c354800Dva);
            if (this.LJIIZILJ.booleanValue()) {
                C1463670oBx c1463670oBxLIZLLL2 = LIZLLL();
                if (c1463670oBxLIZLLL2 != null && (c348100DkmLIZLLL5 = c1463670oBxLIZLLL2.LIZLLL()) != null && (iNLEMediaSession5 = c348100DkmLIZLLL5.LIZIZ) != null && (brushApi5 = iNLEMediaSession5.getBrushApi()) != null) {
                    brushApi5.processTouchUpEvent2(nLETrackSlot.getUUID(), fFloatValue4, fFloatValue5, 0.0f, 0.0f, 0.0f);
                }
            } else {
                C1463670oBx c1463670oBxLIZLLL3 = LIZLLL();
                if (c1463670oBxLIZLLL3 != null && (c348100DkmLIZLLL3 = c1463670oBxLIZLLL3.LIZLLL()) != null && (iNLEMediaSession3 = c348100DkmLIZLLL3.LIZIZ) != null && (brushApi3 = iNLEMediaSession3.getBrushApi()) != null) {
                    brushApi3.processTouchUpEvent(nLETrackSlot.getUUID(), fFloatValue4, fFloatValue5, 0.0f, 0.0f, 0.0f);
                }
            }
            C1463670oBx c1463670oBxLIZLLL4 = LIZLLL();
            if (c1463670oBxLIZLLL4 != null && (c348100DkmLIZLLL4 = c1463670oBxLIZLLL4.LIZLLL()) != null && (iNLEMediaSession4 = c348100DkmLIZLLL4.LIZIZ) != null && (brushApi4 = iNLEMediaSession4.getBrushApi()) != null) {
                brushApi4.end2DBrush(nLETrackSlot.getUUID());
            }
            INLEMediaSession iNLEMediaSessionLJ3 = LJ();
            if (iNLEMediaSessionLJ3 != null && (playerApi2 = iNLEMediaSessionLJ3.getPlayerApi()) != null) {
                playerApi2.seekTime(0L, NLESeekFlag.EDITOR_SEEK_FLAG_LastSeek);
            }
            PthreadTimer pthreadTimer = this.LIZJ;
            if (pthreadTimer != null) {
                pthreadTimer.cancel();
            }
            this.LIZJ = null;
            return;
        }
        ((ArrayList) this.LIZLLL).clear();
        C1463670oBx c1463670oBxLIZLLL5 = LIZLLL();
        if (c1463670oBxLIZLLL5 != null && (c348100DkmLIZLLL2 = c1463670oBxLIZLLL5.LIZLLL()) != null && (iNLEMediaSession2 = c348100DkmLIZLLL2.LIZIZ) != null && (brushApi2 = iNLEMediaSession2.getBrushApi()) != null) {
            brushApi2.begin2DBrush(nLETrackSlot.getUUID());
        }
        C1463670oBx c1463670oBxLIZLLL6 = LIZLLL();
        if (c1463670oBxLIZLLL6 != null && (c348100DkmLIZLLL = c1463670oBxLIZLLL6.LIZLLL()) != null && (iNLEMediaSession = c348100DkmLIZLLL.LIZIZ) != null && (brushApi = iNLEMediaSession.getBrushApi()) != null) {
            brushApi.processTouchDownEvent(nLETrackSlot.getUUID(), fFloatValue4, fFloatValue5, 0.0f, 0.0f, 0.0f);
        }
        INLEMediaSession iNLEMediaSessionLJ4 = LJ();
        if (iNLEMediaSessionLJ4 != null && (playerApi = iNLEMediaSessionLJ4.getPlayerApi()) != null) {
            playerApi.seekTime(0L, NLESeekFlag.EDITOR_SEEK_FLAG_LastSeek);
        }
        this.LJIILL = 0;
        this.LJIIL.setValue(Boolean.FALSE);
        this.LJIIJJI.setValue(Boolean.TRUE);
        this.LJIILIIL++;
        LIZIZ(c354800Dva);
        if (this.LIZJ != null) {
            return;
        }
        PthreadTimer pthreadTimer2 = new PthreadTimer("CommentImageBrushEditorImpl");
        pthreadTimer2.schedule(new C391480FWo(this, 1), 0L, 33L);
        this.LIZJ = pthreadTimer2;
    }

    @Override // X.InterfaceC19678211yu
    public final void LJIILJJIL(NLETrackSlot nLETrackSlot) {
        C348100Dkm c348100DkmLIZLLL;
        INLEMediaSession iNLEMediaSession;
        INLEBrushRuntime brushApi;
        if (nLETrackSlot == null) {
            return;
        }
        int i = this.LJIILIIL;
        if (this.LJIILJJIL + i <= 0) {
            this.LJIIJJI.setValue(Boolean.FALSE);
            return;
        }
        int i2 = this.LJIILL + 1;
        this.LJIILL = i2;
        this.LJIILIIL = i - 1;
        if (i2 > 0) {
            this.LJIIL.setValue(Boolean.TRUE);
        }
        if (this.LJIILIIL + this.LJIILJJIL <= 0) {
            this.LJIIJJI.setValue(Boolean.FALSE);
        }
        C1463670oBx c1463670oBxLIZLLL = LIZLLL();
        if (c1463670oBxLIZLLL != null && (c348100DkmLIZLLL = c1463670oBxLIZLLL.LIZLLL()) != null && (iNLEMediaSession = c348100DkmLIZLLL.LIZIZ) != null && (brushApi = iNLEMediaSession.getBrushApi()) != null) {
            brushApi.undo2DBrush(nLETrackSlot.getUUID());
        }
        C1463670oBx c1463670oBxLIZLLL2 = LIZLLL();
        if (c1463670oBxLIZLLL2 != null) {
            c1463670oBxLIZLLL2.refreshCurrentFrame();
        }
        LIZJ(this, EnumC356070Dxd.COMMIT);
    }

    @Override // X.InterfaceC19678211yu
    public final void Za(boolean z) {
        if (z) {
            this.LJIILL = 0;
            this.LJIILJJIL = 0;
            MutableLiveData<Boolean> mutableLiveData = this.LJIIL;
            Boolean bool = Boolean.FALSE;
            mutableLiveData.setValue(bool);
            this.LJIIJJI.setValue(bool);
            this.LJIILIIL = 0;
        }
    }

    public C354740DvU(LiveData<InterfaceC1452170ntP> liveData, C19571411hg c19571411hg) {
        this.LIZ = liveData;
        this.LIZIZ = c19571411hg;
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        this.LJIIJ = mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>();
        this.LJIIJJI = mutableLiveData;
        this.LJIIL = mutableLiveData2;
        this.LJIILLIIL = new NLESegmentBrushSticker();
        this.LJIIZILJ = VEConfigCenter.getInstance().getValue("ve_optimize_custom_matting", false);
        this.LJIJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1205));
        this.LJIJI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1206));
        this.LJIJJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1204));
    }

    public static void LIZJ(C354740DvU c354740DvU, EnumC356070Dxd enumC356070Dxd) {
        C0E9H c0e9h;
        C0E9H c0e9h2;
        c354740DvU.getClass();
        if (enumC356070Dxd != null) {
            int i = C354770DvX.LIZIZ[enumC356070Dxd.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new C1954807lC();
                    }
                    return;
                }
                C1463670oBx c1463670oBxLIZLLL = c354740DvU.LIZLLL();
                if (c1463670oBxLIZLLL != null && (c0e9h2 = c1463670oBxLIZLLL.LJ) != null) {
                    C350410DoV.LIZLLL(c0e9h2, true, null, false, true);
                    return;
                }
                return;
            }
            C1463670oBx c1463670oBxLIZLLL2 = c354740DvU.LIZLLL();
            if (c1463670oBxLIZLLL2 != null && (c0e9h = c1463670oBxLIZLLL2.LJ) != null) {
                c0e9h.commit();
            }
        }
    }

    @Override // X.InterfaceC19678211yu
    public final NLETrackSlot LJI(C354810Dvb c354810Dvb, EnumC356070Dxd enumC356070Dxd) {
        List listLIZ;
        String str = c354810Dvb.LIZLLL;
        this.LJFF = c354810Dvb.LJFF;
        this.LJI = c354810Dvb.LJ;
        NLETrackSlot nLETrackSlot = c354810Dvb.LIZ;
        if (nLETrackSlot == null) {
            return null;
        }
        this.LJIIIIZZ = c354810Dvb.LIZJ;
        NLETrackSlot nLETrackSlot2 = new NLETrackSlot();
        NLESegmentBrushSticker nLESegmentBrushSticker = new NLESegmentBrushSticker();
        nLESegmentBrushSticker.setBrushCachePath(str);
        nLESegmentBrushSticker.setBrushPath(this.LJI);
        int i = C354770DvX.LIZ[this.LJIIIIZZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                listLIZ = C08G0.LIZ("#0BE09B");
            } else {
                listLIZ = C08G0.LIZ(C786410Ut5.j4("#%08X", Arrays.copyOf(new Object[]{Integer.valueOf((C191000oO.LIZ("#0BE09B") & 16777215) | Integer.MIN_VALUE)}, 1)));
            }
        } else {
            listLIZ = C08G0.LIZ("#FFFFFFFF");
        }
        nLESegmentBrushSticker.setBrushParam(GsonProtectorUtils.toJson(new Gson(), new CommentImageBrushParams(c354810Dvb.LIZIZ.getWidth(), c354810Dvb.LIZIZ.getHeight(), listLIZ, this.LJIIIZ, 1.0f, c354810Dvb.LIZIZ.getWidth())));
        this.LJIILLIIL = nLESegmentBrushSticker;
        nLETrackSlot2.setMainSegment(nLESegmentBrushSticker);
        nLETrackSlot2.setStartTime(nLETrackSlot.getStartTime());
        nLETrackSlot2.setEndTime(nLETrackSlot.getEndTime());
        nLETrackSlot2.setExtra("ep_cutout_brush_type", this.LJIIIIZZ.name());
        NLETrack nLETrack = new NLETrack();
        nLETrack.addSlot(nLETrackSlot2);
        nLETrack.setExtra("track_type", "track_brush_sticker");
        NLEModel nLEModel = (NLEModel) this.LJIJ.getValue();
        if (nLEModel != null) {
            nLEModel.addTrack(nLETrack);
        }
        LIZJ(this, enumC356070Dxd);
        return nLETrackSlot2;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d A[PHI: r10
      0x007d: PHI (r10v1 java.lang.String) = (r10v0 java.lang.String), (r10v5 java.lang.String) binds: [B:21:0x006d, B:26:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC19678211yu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL(X.C354820Dvc r15, X.EnumC356070Dxd r16) {
        /*
            Method dump skipped, instruction units count: 593
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C354740DvU.LJIILIIL(X.0Dvc, X.0Dxd):void");
    }

    @Override // X.InterfaceC19678211yu
    public final void LJFF(NLETrackSlot nLETrackSlot, NLETrackSlot nLETrackSlot2, float f, EnumC356070Dxd enumC356070Dxd) {
        ArrayList arrayList;
        List listLIZ;
        this.LJIIIZ = f;
        NLESegmentBrushSticker nLESegmentBrushStickerDynamicCast = NLESegmentBrushSticker.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
        if (nLESegmentBrushStickerDynamicCast != null) {
            String brushParam = nLESegmentBrushStickerDynamicCast.getBrushParam();
            if (!TextUtils.isEmpty(brushParam)) {
                JSONObject jSONObject = new JSONObject(brushParam);
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("brush_color");
                if (jSONArrayOptJSONArray != null) {
                    arrayList = new ArrayList();
                    int length = jSONArrayOptJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        arrayList.add(Float.valueOf((float) jSONArrayOptJSONArray.optDouble(i)));
                    }
                } else {
                    arrayList = null;
                }
                float fOptDouble = (float) jSONObject.optDouble("brush_hardness");
                int iOptInt = jSONObject.optInt("canvas_width");
                int iOptInt2 = jSONObject.optInt("canvas_height");
                if (arrayList == null || (listLIZ = C13LP.LLIIII(arrayList)) == null) {
                    listLIZ = C08G0.LIZ(this.LJII);
                }
                nLESegmentBrushStickerDynamicCast.setBrushParam(new CutoutBrushParams(iOptInt, iOptInt2, listLIZ, f, fOptDouble, iOptInt).LIZ());
                this.LJ.strokeCircleDiameter = f;
                C1463670oBx c1463670oBxLIZLLL = LIZLLL();
                if (c1463670oBxLIZLLL != null) {
                    c1463670oBxLIZLLL.refreshCurrentFrame();
                }
                LIZJ(this, enumC356070Dxd);
            }
        }
    }

    @Override // X.InterfaceC19678211yu
    public final void LJIIIIZZ(NLETrackSlot nLETrackSlot, String str, EnumC356110Dxh enumC356110Dxh, EnumC356070Dxd enumC356070Dxd) {
        float f;
        List listLIZ;
        this.LJIIIIZZ = enumC356110Dxh;
        this.LJII = str;
        EnumC356110Dxh enumC356110Dxh2 = EnumC356110Dxh.ERASER;
        if (enumC356110Dxh == enumC356110Dxh2) {
            f = 36.0f;
        } else if (enumC356110Dxh == EnumC356110Dxh.HIGHLIGHT) {
            f = this.LJIIIZ;
        } else {
            f = 6.0f;
        }
        NLESegmentBrushSticker nLESegmentBrushStickerDynamicCast = NLESegmentBrushSticker.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
        if (nLESegmentBrushStickerDynamicCast != null) {
            String brushParam = nLESegmentBrushStickerDynamicCast.getBrushParam();
            if (!TextUtils.isEmpty(brushParam)) {
                JSONObject jSONObject = new JSONObject(brushParam);
                float fOptDouble = (float) jSONObject.optDouble("brush_hardness");
                float f2 = f * 2.0f;
                int iOptInt = jSONObject.optInt("canvas_width");
                int iOptInt2 = jSONObject.optInt("canvas_height");
                int i = C354770DvX.LIZ[enumC356110Dxh.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        listLIZ = C08G0.LIZ(str);
                    } else {
                        listLIZ = C08G0.LIZ(C786410Ut5.j4("#%08X", Arrays.copyOf(new Object[]{Integer.valueOf((C191000oO.LIZ(str) & 16777215) | Integer.MIN_VALUE)}, 1)));
                    }
                } else {
                    listLIZ = C08G0.LIZ("#FFFFFFFF");
                }
                nLESegmentBrushStickerDynamicCast.setBrushParam(new CutoutBrushParams(iOptInt, iOptInt2, listLIZ, f2, fOptDouble, iOptInt).LIZ());
                if (enumC356110Dxh == enumC356110Dxh2 && !TextUtils.isEmpty(this.LJFF)) {
                    nLESegmentBrushStickerDynamicCast.setBrushPath(this.LJFF);
                } else {
                    nLESegmentBrushStickerDynamicCast.setBrushPath(this.LJI);
                }
                LIZJ(this, enumC356070Dxd);
            }
        }
        nLETrackSlot.setExtra("ep_cutout_brush_type", enumC356110Dxh.name());
        LIZJ(this, enumC356070Dxd);
    }
}
