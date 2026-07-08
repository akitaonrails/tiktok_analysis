package X;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0RbH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C698930RbH extends TouchDelegate {
    public final View LIZ;
    public final C698910RbF LIZIZ;
    public AbstractC700550Rdt LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;

    public final void LIZ(AbstractC700550Rdt abstractC700550Rdt) {
        C698910RbF c698910RbF = this.LIZIZ;
        c698910RbF.getClass();
        try {
            if (abstractC700550Rdt instanceof C700530Rdr) {
                ((ArrayList) c698910RbF.LIZ).remove(abstractC700550Rdt);
            } else if (abstractC700550Rdt instanceof C700520Rdq) {
                ((ArrayList) c698910RbF.LIZJ).remove(abstractC700550Rdt);
            } else if (abstractC700550Rdt instanceof C700540Rds) {
                ((CopyOnWriteArrayList) c698910RbF.LIZIZ).remove(abstractC700550Rdt);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
        abstractC700550Rdt.LIZ.setTag(R.id.el1, null);
        if (this.LIZJ == abstractC700550Rdt) {
            this.LIZJ = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000e, code lost:
    
        if (r1 != 3) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
    @Override // android.view.TouchDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C698930RbH.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public C698930RbH(View view, C698910RbF c698910RbF) {
        super(new Rect(), view);
        this.LIZ = view;
        this.LIZIZ = c698910RbF;
    }
}
