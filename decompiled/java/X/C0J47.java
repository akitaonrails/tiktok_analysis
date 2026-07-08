package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0J47, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public class C0J47 extends LayoutInflater {
    public static final String[] LIZ = {"android.widget.", "android.webkit.", "android.app."};

    public C0J47(Context context) {
        super(context);
    }

    @Override // android.view.LayoutInflater
    public final LayoutInflater cloneInContext(Context context) {
        return new C0J47(context);
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
}
