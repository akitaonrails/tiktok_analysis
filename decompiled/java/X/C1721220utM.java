package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0utM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1721220utM extends LinearLayout implements InterfaceC1092590eXR {
    public final List<C1721230utN> LL;
    public int LLILLJJLI;
    public boolean LLILLL;

    public C1721220utM(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = new ArrayList();
        setOrientation(0);
        C1092580eXQ.LIZ("MSG_TYPE_LOTTIE_STATUS_UPDATE", this);
    }

    @Override // X.InterfaceC1092590eXR
    public final void LIZLLL(Object obj, String str) {
        if (Intrinsics.LJFF(str, "MSG_TYPE_LOTTIE_STATUS_UPDATE") && (obj instanceof EnumC1721270utR) && this.LLILLL) {
            int i = C1721260utQ.LIZ[((EnumC1721270utR) obj).ordinal()];
            if (i != 1 && i != 2 && i != 3) {
                throw new C1954807lC();
            }
            ValueAnimator valueAnimator = ((C1721230utN) ListProtector.get(this.LL, this.LLILLJJLI)).LL;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                return;
            }
            try {
                ((C1721230utN) ((ArrayList) this.LL).get(this.LLILLJJLI)).LIZIZ();
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    public final void LIZ(int i, boolean z, boolean z2) {
        this.LLILLL = z;
        if (i >= 0 && i < this.LL.size()) {
            int i2 = 0;
            if (z) {
                int size = this.LL.size();
                while (i2 < size) {
                    if (i2 >= i) {
                        ((C1721230utN) ListProtector.get(this.LL, i2)).setProgress(EnumC1721240utO.ZERO);
                    } else {
                        ((C1721230utN) ListProtector.get(this.LL, i2)).setProgress(EnumC1721240utO.FINISH);
                    }
                    i2++;
                }
                if (!z2) {
                    ((C1721230utN) ListProtector.get(this.LL, i)).LIZIZ();
                }
            } else {
                int size2 = this.LL.size();
                while (i2 < size2) {
                    if (i2 == i) {
                        ((C1721230utN) ListProtector.get(this.LL, i2)).setProgress(EnumC1721240utO.FINISH);
                    } else {
                        ((C1721230utN) ListProtector.get(this.LL, i2)).setProgress(EnumC1721240utO.ZERO);
                    }
                    i2++;
                }
            }
            this.LLILLJJLI = i;
        }
    }
}
