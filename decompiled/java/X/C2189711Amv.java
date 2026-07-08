package X;

import android.widget.FrameLayout;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;

/* JADX INFO: renamed from: X.1Amv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C2189711Amv implements InterfaceC781210Ukh {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC781210Ukh
    public final void run() throws JSONException {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
        }
    }

    public static final void run$0(C2189711Amv c2189711Amv) {
        ((Function0) c2189711Amv.l0).invoke();
        ((C2176991AHx) c2189711Amv.l1).LIZ();
    }

    public static final void run$1(C2189711Amv c2189711Amv) throws JSONException {
        ((C1AF3) c2189711Amv.l0).LJIJI((FrameLayout) c2189711Amv.l1);
    }

    public static final void run$2(C2189711Amv c2189711Amv) throws JSONException {
        ((C1AF3) c2189711Amv.l0).LJIJI((FrameLayout) c2189711Amv.l1);
    }

    public C2189711Amv(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
