package X;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.ugc.android.editor.track.viewmodels.FrameCacheViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0EeW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C369700EeW extends C0FC9<C07WO, C369760Eec> implements Observer<Long> {
    public C370190EfJ LLJJJJJIL;
    public final int LLJJJJLIIL;
    public final int LLJJL;
    public final int LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onDestroyView() {
        C0E55 player;
        MutableLiveData mutableLiveDataLJ;
        super.onDestroyView();
        C0E48 c0e48LIZIZ = LIZIZ();
        if (c0e48LIZIZ == null || (player = c0e48LIZIZ.getPlayer()) == null || (mutableLiveDataLJ = player.LJ()) == null) {
            return;
        }
        mutableLiveDataLJ.removeObserver(this);
    }

    public C369700EeW(C1DRG c1drg) {
        super(c1drg);
        this.LLJJJJLIIL = C0FU0.LIZJ(C0EHL.LIZ());
        this.LLJJL = C0FU0.LIZ(16.0f);
        this.LLJJLIIIJLLLLLLLZ = C0FU0.LIZ(34.0f);
        this.LLJL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1669));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        C0E55 player;
        MutableLiveData mutableLiveDataLJ;
        C370190EfJ c370190EfJ;
        C368910EdF videoFrameTrack$tools_camera_edit_release;
        super.onActivityCreated(bundle);
        C370190EfJ c370190EfJ2 = (C370190EfJ) this.mView.findViewById(R.id.yh6);
        this.LLJJJJJIL = c370190EfJ2;
        if (c370190EfJ2 != null) {
            c370190EfJ2.LIZIZ(false);
        }
        ConcurrentHashMap<String, InterfaceC364230EPt> concurrentHashMap = C364210EPr.LIZ;
        FrameCacheViewModel frameCacheViewModel = (FrameCacheViewModel) C364210EPr.LIZLLL(FrameCacheViewModel.class);
        if (frameCacheViewModel != null && (c370190EfJ = this.LLJJJJJIL) != null && (videoFrameTrack$tools_camera_edit_release = c370190EfJ.getVideoFrameTrack$tools_camera_edit_release()) != null) {
            C369030EdR.LIZJ(videoFrameTrack$tools_camera_edit_release.LL, 0, 0, 0, 0);
            videoFrameTrack$tools_camera_edit_release.LLILLJJLI.LJFF = 0;
            videoFrameTrack$tools_camera_edit_release.setEnableScroll(false);
            NLETrack nLETrackInvoke = LLLLIL().LIZJ.invoke();
            if (nLETrackInvoke != null) {
                videoFrameTrack$tools_camera_edit_release.LIZIZ(nLETrackInvoke.getSortedSlots(), frameCacheViewModel.wQ2());
                Iterator<NLETrackSlot> it2 = nLETrackInvoke.getSortedSlots().iterator();
                long duration = 0;
                while (it2.hasNext()) {
                    duration += it2.next().getDuration();
                }
                int i = this.LLJJJJLIIL - (this.LLJJL * 2);
                NLETrackSlot nLETrackSlot = nLETrackInvoke.getSortedSlots().get(0);
                float fLLLLLLL = i / C351220Dpo.LLLLLLL(duration);
                videoFrameTrack$tools_camera_edit_release.LIZJ((int) (20 * ((this.LLJJLIIIJLLLLLLLZ / fLLLLLLL) / 1000.0f)));
                videoFrameTrack$tools_camera_edit_release.setVideoFrameWidth(this.LLJJLIIIJLLLLLLLZ);
                videoFrameTrack$tools_camera_edit_release.setVideoFrameScale(fLLLLLLL);
                Rect rect = new Rect();
                rect.set(0, 0, (int) ((Number) this.LLJL.getValue()).floatValue(), videoFrameTrack$tools_camera_edit_release.getMeasuredHeight());
                videoFrameTrack$tools_camera_edit_release.setPreInitRect(rect);
                C370190EfJ c370190EfJ3 = this.LLJJJJJIL;
                if (c370190EfJ3 != null) {
                    c370190EfJ3.LIZLLL();
                    c370190EfJ3.LIZJ(nLETrackSlot.getStartTime(), duration);
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
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.08rG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((C07WO) obj).LIZ);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 1197));
        C0E48 c0e48LIZIZ = LIZIZ();
        if (c0e48LIZIZ != null && (player = c0e48LIZIZ.getPlayer()) != null && (mutableLiveDataLJ = player.LJ()) != null) {
            C0E5X c0e5x = C0E5X.LIZ;
            mutableLiveDataLJ.observe(C0E5X.LIZ(), this);
        }
        C370190EfJ c370190EfJ4 = this.LLJJJJJIL;
        if (c370190EfJ4 != null) {
            c370190EfJ4.setVideoCursorTouchListener(new InterfaceC370200EfK() { // from class: X.0EeZ
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

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Long l) {
        C0E48 c0e48LIZIZ;
        C0E55 player;
        C0E55 player2;
        long jLongValue = l.longValue();
        if (jLongValue >= 0 && (c0e48LIZIZ = LIZIZ()) != null && (player = c0e48LIZIZ.getPlayer()) != null && player.isPlaying()) {
            long millis = TimeUnit.MICROSECONDS.toMillis(jLongValue);
            C0E48 c0e48LIZIZ2 = LIZIZ();
            if (c0e48LIZIZ2 != null && (player2 = c0e48LIZIZ2.getPlayer()) != null) {
                float fQq = player2.qq();
                if (fQq > 0.0f) {
                    float f = millis / fQq;
                    C370190EfJ c370190EfJ = this.LLJJJJJIL;
                    if (c370190EfJ != null) {
                        c370190EfJ.LJI(f);
                        return;
                    }
                    return;
                }
            }
            C370190EfJ c370190EfJ2 = this.LLJJJJJIL;
            if (c370190EfJ2 == null) {
                return;
            }
            c370190EfJ2.LJI(0.0f);
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setTheme(R.style.y0);
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.c4o, viewGroup, false);
    }
}
