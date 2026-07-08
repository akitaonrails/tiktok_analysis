package X;

import android.view.View;
import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.1BUY, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BUY {
    public final List<C2205711BUj> LIZ = new ArrayList();

    static {
        PatternProtector.compile("^[a-zA-Z0-9 ]+$");
    }

    public final C2205711BUj LIZ(View view) {
        for (C2205711BUj c2205711BUj : (ArrayList) this.LIZ) {
            if (c2205711BUj.LIZ.get() == view) {
                return c2205711BUj;
            }
        }
        return null;
    }
}
