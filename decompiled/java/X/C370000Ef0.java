package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0Ef0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C370000Ef0 extends AbstractC1664490tPr<C0E3P, InterfaceC370120EfC> {
    public C370010Ef1 LLJJJIL;
    public C370190EfJ LLJJJJ;
    public boolean LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final int LLJJL;
    public final int LLJJLIIIJLLLLLLLZ;
    public final float LLJL;
    public final float LLJLIL;
    public final int LLJLILLLLZIIL;
    public float LLJLL;

    public final NLETrackSlot LLLLLJIL() {
        C370190EfJ c370190EfJ = this.LLJJJJ;
        long videoSelectFrameStartTime = c370190EfJ != null ? c370190EfJ.getVideoSelectFrameStartTime() : 0L;
        C370190EfJ c370190EfJ2 = this.LLJJJJ;
        long videoSelectFrameEndTime = c370190EfJ2 != null ? c370190EfJ2.getVideoSelectFrameEndTime() : 0L;
        C370010Ef1 c370010Ef1 = this.LLJJJIL;
        long audioSelectFrameStartTime = c370010Ef1 != null ? c370010Ef1.getAudioSelectFrameStartTime() : 0L;
        C370010Ef1 c370010Ef12 = this.LLJJJIL;
        return LLLLIL().LIZJ(new C0E3H(videoSelectFrameStartTime, videoSelectFrameEndTime, audioSelectFrameStartTime, c370010Ef12 != null ? c370010Ef12.getAudioSelectFrameEndTime() : 0L, 16));
    }

    public C370000Ef0() {
        System.currentTimeMillis();
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 379));
        this.LLJJL = C0FU0.LIZ(34.0f);
        this.LLJJLIIIJLLLLLLLZ = C0FU0.LIZ(42.0f);
        this.LLJL = C0FU0.LIZ(34.0f) / 1000.0f;
        this.LLJLIL = C0FU0.LIZ(15.0f);
        this.LLJLILLLLZIIL = C0FU0.LIZJ(C0EHL.LIZ());
        this.LLJLL = C0FU0.LIZ(15.0f);
    }

    public final void LLLLLJLJLL() {
        Context contextLIZIZ = C545820Lau.LIZIZ(this);
        if (contextLIZIZ != null) {
            new C0ZDN(contextLIZIZ).LIZ(3);
        }
    }

    public final long LLLLLL() {
        C0E48 c0e48LIZ = LLLLIL().LIZ();
        if (c0e48LIZ == null) {
            return 0L;
        }
        NLETrack mainTrack = C350870DpF.LJI(c0e48LIZ).getMainTrack();
        return (mainTrack != null ? mainTrack.getMaxEnd() : 0L) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onDestroyView() {
        C369970Eex audioTrackFromXml;
        C368910EdF c368910EdF;
        C370920EgU c370920EgU;
        super.onDestroyView();
        C370190EfJ c370190EfJ = this.LLJJJJ;
        if (c370190EfJ != null && (c368910EdF = c370190EfJ.LLIZ) != null && (c370920EgU = c368910EdF.LLILZ) != null) {
            C23250099c.LIZLLL(c370920EgU, c370920EgU.LLJILJIL, null, new C358350E3d(c370920EgU, c368910EdF.LLILLJJLI, null), 2);
        }
        C370010Ef1 c370010Ef1 = this.LLJJJIL;
        if (c370010Ef1 == null || (audioTrackFromXml = c370010Ef1.getAudioTrackFromXml()) == null) {
            return;
        }
        audioTrackFromXml.fling(0);
    }

    public final void LLLLLLIL(NLETrackSlot nLETrackSlot) {
        float videoFrameScale;
        final float f;
        C369970Eex audioTrackFromXml;
        float fLIZ;
        int audioTrackTotalPadding;
        float fFloatValue;
        Pair<Float, Float> audioSelectFramePosition;
        Pair<Float, Float> audioSelectFramePosition2;
        C368910EdF videoFrameTrack$tools_camera_edit_release;
        NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment());
        if (nLESegmentAudioDynamicCast != null) {
            C370190EfJ c370190EfJ = this.LLJJJJ;
            float fFloatValue2 = 0.0f;
            if (c370190EfJ != null && (videoFrameTrack$tools_camera_edit_release = c370190EfJ.getVideoFrameTrack$tools_camera_edit_release()) != null) {
                videoFrameScale = videoFrameTrack$tools_camera_edit_release.getVideoFrameScale();
            } else {
                videoFrameScale = 0.0f;
            }
            float timeClipStart = (nLESegmentAudioDynamicCast.getTimeClipStart() / nLESegmentAudioDynamicCast.getAbsSpeed()) / LSPassThroughRecordSizeConfig.DEFAULT;
            if (((Boolean) this.LLJJJJLIIL.getValue()).booleanValue()) {
                C370010Ef1 c370010Ef1 = this.LLJJJIL;
                if (c370010Ef1 != null) {
                    fLIZ = c370010Ef1.LIZ(videoFrameScale);
                } else {
                    fLIZ = 0.0f;
                }
                C370010Ef1 c370010Ef12 = this.LLJJJIL;
                if (c370010Ef12 != null) {
                    audioTrackTotalPadding = c370010Ef12.getAudioTrackTotalPadding();
                } else {
                    audioTrackTotalPadding = 0;
                }
                float f2 = fLIZ - audioTrackTotalPadding;
                C370010Ef1 c370010Ef13 = this.LLJJJIL;
                if (c370010Ef13 != null && (audioSelectFramePosition2 = c370010Ef13.getAudioSelectFramePosition()) != null) {
                    fFloatValue = audioSelectFramePosition2.getFirst().floatValue();
                } else {
                    fFloatValue = 0.0f;
                }
                C370010Ef1 c370010Ef14 = this.LLJJJIL;
                if (c370010Ef14 != null && (audioSelectFramePosition = c370010Ef14.getAudioSelectFramePosition()) != null) {
                    fFloatValue2 = audioSelectFramePosition.getSecond().floatValue();
                }
                f = ((f2 + fFloatValue) - fFloatValue2) - (timeClipStart * videoFrameScale);
            } else {
                f = timeClipStart * videoFrameScale;
            }
            C370010Ef1 c370010Ef15 = this.LLJJJIL;
            if (c370010Ef15 != null) {
                float fFloatValue3 = c370010Ef15.getAudioSelectFramePosition().getFirst().floatValue();
                float fFloatValue4 = c370010Ef15.LLILZLL - c370010Ef15.getAudioSelectFramePosition().getSecond().floatValue();
                C369970Eex audioTrackFromXml2 = c370010Ef15.getAudioTrackFromXml();
                if (audioTrackFromXml2 != null) {
                    audioTrackFromXml2.LLILLL.setPadding((int) fFloatValue3, 0, (int) fFloatValue4, 0);
                }
                c370010Ef15.getAudioTrackFromXml().LIZ(c370010Ef15.getAudioSelectFrameFromXml().getSelectFrameRect().left, c370010Ef15.getAudioSelectFrameFromXml().getSelectFrameRect().width(), c370010Ef15.getAudioTrackLeftPadding());
            }
            C370010Ef1 c370010Ef16 = this.LLJJJIL;
            if (c370010Ef16 != null) {
                if (c370010Ef16.isLaidOut() && !c370010Ef16.isLayoutRequested()) {
                    C370010Ef1 c370010Ef17 = this.LLJJJIL;
                    if (c370010Ef17 != null && (audioTrackFromXml = c370010Ef17.getAudioTrackFromXml()) != null) {
                        audioTrackFromXml.scrollTo((int) f, 0);
                        return;
                    }
                    return;
                }
                c370010Ef16.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.0EfA
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                        C369970Eex audioTrackFromXml3;
                        view.removeOnLayoutChangeListener(this);
                        C370010Ef1 c370010Ef18 = this.LL.LLJJJIL;
                        if (c370010Ef18 != null && (audioTrackFromXml3 = c370010Ef18.getAudioTrackFromXml()) != null) {
                            audioTrackFromXml3.scrollTo((int) f, 0);
                        }
                    }
                });
            }
        }
    }

    public final void LLLLLLJ(NLETrackSlot nLETrackSlot) {
        C0E48 c0e48LIZ = LLLLIL().LIZ();
        if (c0e48LIZ == null) {
            return;
        }
        double maxEnd = c0e48LIZ.Rn().getMaxEnd();
        double d = maxEnd - 8000.0d;
        double d2 = maxEnd + 8000.0d;
        double duration = nLETrackSlot.getDuration();
        if (d <= duration && duration <= d2) {
            C370190EfJ c370190EfJ = this.LLJJJJ;
            if (c370190EfJ != null) {
                c370190EfJ.LIZIZ(true);
                return;
            }
            return;
        }
        C370190EfJ c370190EfJ2 = this.LLJJJJ;
        if (c370190EfJ2 == null) {
            return;
        }
        C370190EfJ.LJIIIIZZ(c370190EfJ2);
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C786410Ut5.LJLLLLLL(4, view);
        LLLLJI(LLLLILI(), new C2217371BqR() { // from class: X.0E3R
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0E3P) obj).LIZ;
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C0E3P) obj).LIZ = (NLETrackSlot) obj2;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 334));
        LLLLJI(LLLLILI(), new C2217371BqR() { // from class: X.09mZ
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((C0E3P) obj).LIZIZ);
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C0E3P) obj).LIZIZ = ((Number) obj2).floatValue();
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 335));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0E3S
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0E3P) obj).LIZJ;
            }
        }, new AwS584S0100000_5(this, 336));
        if (C293810BfP.LIZ()) {
            C370010Ef1 c370010Ef1 = this.LLJJJIL;
            if (c370010Ef1 != null) {
                ViewGroup.LayoutParams layoutParams = c370010Ef1.getLayoutParams();
                if (layoutParams != null) {
                    C1546210qL5.LIZ.getClass();
                    layoutParams.height = C814420VxA.LIZIZ(C1546210qL5.LIZ(82));
                    C786410Ut5.W5(c370010Ef1, layoutParams);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
            C370010Ef1 c370010Ef12 = this.LLJJJIL;
            if (c370010Ef12 != null) {
                C1546210qL5.LIZ.getClass();
                C426750GoL.LJIIIZ(c370010Ef12, null, Integer.valueOf(C814420VxA.LIZIZ(C1546210qL5.LIZ(20))), null, null, false, 29);
            }
            C370190EfJ c370190EfJ = this.LLJJJJ;
            if (c370190EfJ != null) {
                C1546210qL5.LIZ.getClass();
                C426750GoL.LJIIIZ(c370190EfJ, null, Integer.valueOf(C814420VxA.LIZIZ(C1546210qL5.LIZ(5))), null, Integer.valueOf(C814420VxA.LIZIZ(C1546210qL5.LIZ(0))), false, 21);
            }
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewLIZIZ = C21146717pB.LIZIZ(requireSceneContext(), R.layout.c29, viewGroup, false);
        System.currentTimeMillis();
        C370190EfJ c370190EfJ = (C370190EfJ) viewLIZIZ.findViewById(R.id.vqa);
        c370190EfJ.setEditorContext(LLLLIL().LIZ());
        this.LLJJJJ = c370190EfJ;
        this.LLJJJIL = (C370010Ef1) viewLIZIZ.findViewById(R.id.vq_);
        C370190EfJ c370190EfJ2 = this.LLJJJJ;
        if (c370190EfJ2 != null) {
            c370190EfJ2.LIZIZ(false);
        }
        return (ViewGroup) viewLIZIZ;
    }
}
