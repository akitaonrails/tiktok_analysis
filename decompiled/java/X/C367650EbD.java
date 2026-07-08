package X;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0EbD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C367650EbD extends AbstractC368550Ecf<C367610Eb9> implements LifecycleOwner {
    public static final int LLILZLL = C0FU0.LIZ(1.0f);
    public static final float LLIZ = C0FU0.LIZ(4.0f);
    public static final float LLIZLLLIL = C0FU0.LIZ(2.0f);
    public static final float LLJ = C0FU0.LIZ(8.0f);
    public static final float LLJI = C0FU0.LIZ(8.0f);
    public static final float LLJIJIL = C0FU0.LIZ(12.0f);
    public static final float LLJILJIL = C0FU0.LIZ(13.0f);
    public final C367610Eb9 LLILLL;
    public String LLILZ;
    public final C01GW LLILZIL;

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return (Lifecycle) this.LLILZIL.getValue();
    }

    @Override // X.AbstractC368550Ecf
    public final /* bridge */ /* synthetic */ View LJIIIZ() {
        return this.LLILLL;
    }

    @Override // X.AbstractC368550Ecf, X.InterfaceC368720Ecw
    public final void setSegment(NLETrackSlot nLETrackSlot) {
        String extra = nLETrackSlot.getExtra("audio_stick_points");
        if (!extra.equals(this.LLILZ)) {
            this.LLILLL.setAllStickPoints(C122600dM.LIZ(extra));
            this.LLILZ = extra;
        }
        super.setSegment(nLETrackSlot);
    }

    public C367650EbD(C19EG c19eg, InterfaceC367590Eb7 interfaceC367590Eb7) {
        super(c19eg);
        C367610Eb9 c367610Eb9 = new C367610Eb9(c19eg);
        c367610Eb9.setTrackViewModelCompat(interfaceC367590Eb7);
        this.LLILLL = c367610Eb9;
        this.LLILZ = "";
        this.LLILZIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1));
    }
}
