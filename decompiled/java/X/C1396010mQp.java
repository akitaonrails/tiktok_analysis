package X;

import android.R;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.Window;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0mQp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1396010mQp extends C214906198m {
    public final Activity LL;
    public final View LLILLJJLI;
    public final List<InterfaceC1396020mQq> LLILLL;
    public View LLILZ;
    public long LLILZIL;
    public boolean LLILZLL;
    public int LLIZ;

    public final void LJJIIJ() throws Throwable {
        C1396030mQr c1396030mQr = C1396030mQr.LIZ;
        Activity activity = this.LL;
        c1396030mQr.getClass();
        int iLIZJ = C1396030mQr.LIZJ(activity);
        if (C14KZ.LJ(this.LL) == EnumC1153710g81.RET_FAIL) {
            this.LLILZLL = true;
            return;
        }
        Rect rect = new Rect();
        View view = this.LLILZ;
        if (view != null) {
            view.getWindowVisibleDisplayFrame(rect);
        }
        int i = C20642515q3.LJFF().getConfiguration().orientation;
        int iLIZIZ = (iLIZJ - rect.bottom) - C1396030mQr.LIZIZ(this.LL);
        if (C08BW.LIZ()) {
            if (iLIZIZ == 0) {
                iLIZIZ = 120;
            } else if (Math.abs(iLIZIZ - this.LLIZ) < 20) {
                return;
            }
        } else if (Math.abs(iLIZIZ - this.LLIZ) < 20) {
            return;
        }
        if (this.LLIZ != Math.abs(iLIZIZ) || System.currentTimeMillis() - this.LLILZIL >= 100) {
            this.LLIZ = Math.abs(iLIZIZ);
            if (i == 1) {
                Iterator it2 = ((ArrayList) this.LLILLL).iterator();
                while (it2.hasNext()) {
                    ((InterfaceC1396020mQq) it2.next()).Si(iLIZIZ);
                }
            } else {
                Iterator it3 = ((ArrayList) this.LLILLL).iterator();
                while (it3.hasNext()) {
                    ((InterfaceC1396020mQq) it3.next()).Si(iLIZIZ);
                }
            }
            this.LLILZIL = System.currentTimeMillis();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1396010mQp(C19EG c19eg) {
        View viewFindViewById;
        super(c19eg);
        Window window = c19eg.getWindow();
        if (window != null) {
            viewFindViewById = window.getDecorView();
        } else {
            viewFindViewById = c19eg.findViewById(R.id.content);
        }
        this.LL = c19eg;
        this.LLILLJJLI = viewFindViewById;
        this.LLILLL = new ArrayList();
    }
}
