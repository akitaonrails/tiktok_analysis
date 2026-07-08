package X;

import com.bytedance.tux.picker.TuxWheelPickerFragment;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0rC8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1579100rC8 {
    public Integer LIZ;
    public Long LIZIZ;
    public Long LIZJ;
    public Long LIZLLL;
    public Function1<? super Long, Unit> LJ;
    public Integer LJFF;
    public String LJI;
    public String LJII;

    public final C1390920mIc LIZ() {
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        TuxWheelPickerFragment tuxWheelPickerFragment = new TuxWheelPickerFragment();
        tuxWheelPickerFragment.LL = this;
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJLLL = false;
        tuxSheet.LLJLILLLLZIIL = false;
        tuxSheet.LLJJIJI = tuxWheelPickerFragment;
        return c1390920mIc;
    }

    public final void LIZIZ(long j) {
        this.LIZLLL = Long.valueOf(j);
    }

    public final void LIZJ(int i) {
        this.LIZ = Integer.valueOf(i);
    }

    public final void LIZLLL(long j, long j2) {
        this.LIZIZ = Long.valueOf(j);
        this.LIZJ = Long.valueOf(j2);
    }
}
