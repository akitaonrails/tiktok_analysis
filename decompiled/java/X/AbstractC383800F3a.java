package X;

import android.view.MotionEvent;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;

/* JADX INFO: renamed from: X.0F3a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC383800F3a extends AbstractC385780FAq {
    public abstract boolean LJJIJL(NLETrack nLETrack, NLETrackSlot nLETrackSlot, MotionEvent motionEvent);

    public abstract boolean LJJIJLIJ(NLETrack nLETrack, NLETrackSlot nLETrackSlot, MotionEvent motionEvent);

    public abstract boolean LJJIL(NLETrack nLETrack, NLETrackSlot nLETrackSlot);

    public abstract C0ELW LJJIZ();

    public abstract void LJJJ(long j);

    public abstract void LJJJI(NLEModel nLEModel);

    public abstract void LJJJIL(NLETrackSlot nLETrackSlot);

    @Override // X.AbstractC385780FAq
    public final int getPriority() {
        return 100;
    }
}
