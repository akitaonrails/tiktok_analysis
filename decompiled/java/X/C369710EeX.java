package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.ugc.android.editor.track.viewmodels.FrameCacheViewModel;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0EeX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C369710EeX extends AbstractC1664490tPr<C07WN, C369750Eeb> {
    public C370190EfJ LLJJJIL;
    public final int LLJJJJ = C0FU0.LIZJ(C0EHL.LIZ());
    public final int LLJJJJJIL = C0FU0.LIZ(16.0f);
    public final int LLJJJJLIIL = C0FU0.LIZ(34.0f);

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        C370190EfJ c370190EfJ;
        C368910EdF videoFrameTrack$tools_camera_edit_release;
        super.onActivityCreated(bundle);
        C370190EfJ c370190EfJ2 = (C370190EfJ) this.mView.findViewById(R.id.yh6);
        this.LLJJJIL = c370190EfJ2;
        if (c370190EfJ2 != null) {
            c370190EfJ2.LIZIZ(false);
        }
        ConcurrentHashMap<String, InterfaceC364230EPt> concurrentHashMap = C364210EPr.LIZ;
        FrameCacheViewModel frameCacheViewModel = (FrameCacheViewModel) C364210EPr.LIZLLL(FrameCacheViewModel.class);
        if (frameCacheViewModel != null && (c370190EfJ = this.LLJJJIL) != null && (videoFrameTrack$tools_camera_edit_release = c370190EfJ.getVideoFrameTrack$tools_camera_edit_release()) != null) {
            C369030EdR.LIZJ(videoFrameTrack$tools_camera_edit_release.LL, 0, 0, 0, 0);
            videoFrameTrack$tools_camera_edit_release.LLILLJJLI.LJFF = 0;
            NLETrack nLETrackInvoke = LLLLIL().LIZJ.invoke();
            if (nLETrackInvoke != null) {
                videoFrameTrack$tools_camera_edit_release.LIZIZ(nLETrackInvoke.getSortedSlots(), frameCacheViewModel.wQ2());
                int i = this.LLJJJJ - (this.LLJJJJJIL * 2);
                NLETrackSlot nLETrackSlot = nLETrackInvoke.getSortedSlots().get(0);
                float fLLLLLLL = i / C351220Dpo.LLLLLLL(nLETrackSlot.getDuration());
                videoFrameTrack$tools_camera_edit_release.LIZJ((int) (20 * ((this.LLJJJJLIIL / fLLLLLLL) / 1000.0f)));
                videoFrameTrack$tools_camera_edit_release.setVideoFrameWidth(this.LLJJJJLIIL);
                videoFrameTrack$tools_camera_edit_release.setVideoFrameScale(fLLLLLLL);
                videoFrameTrack$tools_camera_edit_release.setEnableScroll(false);
                C370190EfJ c370190EfJ3 = this.LLJJJIL;
                if (c370190EfJ3 != null) {
                    c370190EfJ3.LIZLLL();
                    c370190EfJ3.LIZJ(nLETrackSlot.getStartTime(), nLETrackSlot.getDuration());
                    c370190EfJ3.LIZ();
                }
                C368250EcB c368250EcB = videoFrameTrack$tools_camera_edit_release.LLILLL;
                if (c368250EcB != null) {
                    c368250EcB.requestLayout();
                }
                C368250EcB c368250EcB2 = videoFrameTrack$tools_camera_edit_release.LLILLL;
                if (c368250EcB2 != null) {
                    c368250EcB2.invalidate();
                }
            }
        }
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.08rH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((C07WN) obj).LIZ);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 902));
        C370190EfJ c370190EfJ4 = this.LLJJJIL;
        if (c370190EfJ4 != null) {
            c370190EfJ4.setVideoCursorTouchListener(new InterfaceC370200EfK() { // from class: X.0EeY
                @Override // X.InterfaceC370200EfK
                public final void LIZIZ() {
                    this.LIZ.LLLLIL().LIZ.invoke();
                }

                @Override // X.InterfaceC370200EfK
                public final void LIZJ() {
                    this.LIZ.LLLLIL().LIZ.invoke();
                }

                @Override // X.InterfaceC370200EfK
                public final void LIZ(float f, float f2, long j) {
                    this.LIZ.LLLLIL().LIZ.invoke();
                    this.LIZ.LLLLIL().LIZIZ.invoke(Long.valueOf(j));
                }
            });
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setTheme(R.style.y0);
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.c0n, viewGroup, false);
    }
}
