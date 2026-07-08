package X;

import android.widget.EditText;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.18p5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21400918p5 extends C21401118p7 {
    public final EditText LIZ;
    public final C21401418pA LIZIZ;

    public C21400918p5(EditText editText) {
        this.LIZ = editText;
        C21401418pA c21401418pA = new C21401418pA(editText);
        this.LIZIZ = c21401418pA;
        editText.addTextChangedListener(c21401418pA);
        if (C21400818p4.LIZIZ == null) {
            synchronized (C21400818p4.LIZ) {
                try {
                    if (C21400818p4.LIZIZ == null) {
                        C21400818p4.LIZIZ = new C21400818p4();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        editText.setEditableFactory(C21400818p4.LIZIZ);
    }
}
