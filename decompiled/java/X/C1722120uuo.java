package X;

import android.text.InputFilter;
import android.widget.EditText;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.api.IAppContextManagerService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.AFwS268S0000000_26;

/* JADX INFO: renamed from: X.0uuo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1722120uuo {
    public static final int LIZ(int i) {
        return C341940Daq.LIZ(i);
    }

    public static final float LIZIZ(float f) {
        return (((IAppContextManagerService) ServiceManager.get().getService(IAppContextManagerService.class)).getApplicationContext().getResources().getDisplayMetrics().density * f) + 0.5f;
    }

    public static final int LIZJ(int i) {
        return (int) LIZIZ(i);
    }

    public static final String LIZLLL(String str) {
        if (str == null) {
            return null;
        }
        try {
            if (str.length() < 2) {
                return null;
            }
            return str.substring(str.length() - 2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public static final void LJ(EditText editText, int i) {
        InputFilter[] inputFilterArr;
        if (editText != null && i >= 0) {
            if (editText.getFilters().length == 0) {
                inputFilterArr = new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(i)};
            } else {
                inputFilterArr = (InputFilter[]) C09RB.LJJII(C09RB.LJIJJLI(C09RB.LJIIIZ(C13LQ.LJIIJJI(editText.getFilters()), AFwS268S0000000_26.get$arr$(781)), new InputFilter.LengthFilter(i))).toArray(new InputFilter[0]);
            }
            editText.setFilters(inputFilterArr);
        }
    }
}
