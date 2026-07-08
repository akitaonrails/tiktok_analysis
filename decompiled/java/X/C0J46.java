package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;

/* JADX INFO: renamed from: X.0J46, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public class C0J46 extends LayoutInflater {
    public static final String[] LIZ = {"android.widget.", "android.webkit.", "android.app."};

    public C0J46(Context context) {
        super(context);
    }

    @Override // android.view.LayoutInflater
    public final LayoutInflater cloneInContext(Context context) {
        LayoutInflater.Factory factory2;
        LayoutInflater.Factory2 factory22;
        C0J46 c0j46 = new C0J46(context);
        if (NxRewordManager.LJIILIIL) {
            factory2 = C0J43.LIZ(this, true);
        } else {
            factory2 = getFactory2();
        }
        if (factory2 != null) {
            if (NxRewordManager.LJIILIIL) {
                factory22 = (LayoutInflater.Factory2) C0J43.LIZ(this, true);
            } else {
                factory22 = getFactory2();
            }
            C786410Ut5.Vd(c0j46, factory22);
        }
        return c0j46;
    }

    @Override // android.view.LayoutInflater
    public final View onCreateView(String str, AttributeSet attributeSet) throws ClassNotFoundException {
        View viewOnCreateView;
        String[] strArr = LIZ;
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                try {
                    viewOnCreateView = createView(str, strArr[i], attributeSet);
                } catch (ClassNotFoundException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (viewOnCreateView != null) {
                    break;
                }
                i++;
            } else {
                viewOnCreateView = super.onCreateView(str, attributeSet);
                break;
            }
        }
        C0J43.LIZJ(viewOnCreateView, str, getContext(), attributeSet);
        return viewOnCreateView;
    }

    @Override // android.view.LayoutInflater
    public final View inflate(int i, ViewGroup viewGroup, boolean z) {
        if (NxRewordManager.LJIILIIL) {
            C0J43.LIZIZ(this);
        }
        C1114110f69.LIZIZ(i);
        View viewInflate = super.inflate(i, viewGroup, z);
        C1114110f69.LIZ(i);
        return viewInflate;
    }
}
