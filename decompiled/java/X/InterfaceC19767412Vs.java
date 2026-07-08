package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import java.util.List;

/* JADX INFO: renamed from: X.12Vs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public interface InterfaceC19767412Vs {
    void LIZ(List<VideoSegment> list);

    void LIZIZ();

    boolean LIZJ(LifecycleOwner lifecycleOwner, ViewModelProvider viewModelProvider, CutMultiVideoViewModel cutMultiVideoViewModel, String str);

    void LIZLLL(C0WIY<Float, Float> c0wiy, List<VideoSegment> list);

    void LJ();

    boolean LJFF();

    void LJI(LifecycleOwner lifecycleOwner, ViewModelProvider viewModelProvider, CutMultiVideoViewModel cutMultiVideoViewModel, VideoEditViewModel videoEditViewModel, List list, int i);

    void LJII(LifecycleOwner lifecycleOwner, ViewModelProvider viewModelProvider, CutMultiVideoViewModel cutMultiVideoViewModel, List list);

    void LJIIIIZZ();

    void LJIIIZ(boolean z);

    int getCurrentRotate();

    float getCurrentSpeed();

    long getLeftSeekingValue();

    long getMaxCutDuration();

    long getMultiSeekTime();

    C0WIY<Long, Long> getPlayBoundary();

    long getRightSeekingValue();

    float getSelectedTime();

    long getSingleSeekTime();
}
