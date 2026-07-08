package X;

import android.app.Dialog;
import android.os.Build;
import android.util.LongSparseArray;
import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.15Dp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20484715Dp {
    public final LongSparseArray<C20484615Do> LIZ = new LongSparseArray<>();
    public final List<C20484615Do> LIZIZ = new ArrayList();
    public final Set<InterfaceC20484915Dr> LIZJ = new CopyOnWriteArraySet();

    public final C20484615Do LIZ() {
        if (((ArrayList) this.LIZIZ).isEmpty()) {
            return null;
        }
        return (C20484615Do) ListProtector.get(this.LIZIZ, ((ArrayList) r1).size() - 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x0159, code lost:
    
        r1 = X.C011Z.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x015d, code lost:
    
        if (r1.LJ != null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0161, code lost:
    
        if (r1.LJJI == null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0163, code lost:
    
        r1.LJJI.getClass();
        r0 = (com.bytedance.android.livesdkapi.host.IHostResource) X.C1161920gLG.LIZJ(com.bytedance.android.livesdkapi.host.IHostResource.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0170, code lost:
    
        if (r0 == null) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0172, code lost:
    
        r9 = r0.Qm2();
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0176, code lost:
    
        r1.LJ = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0178, code lost:
    
        r1 = r1.LJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x017a, code lost:
    
        if (r1 != null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x017c, code lost:
    
        r4.LL = 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ() {
        /*
            Method dump skipped, instruction units count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20484715Dp.LJ():void");
    }

    public final void LJFF() {
        Dialog dialog;
        InterfaceC20484815Dq interfaceC20484815DqLIZLLL;
        Fragment fragment;
        int iL5;
        if (((ArrayList) this.LIZIZ).isEmpty()) {
            return;
        }
        C20484615Do c20484615Do = (C20484615Do) ListProtector.get(this.LIZIZ, ((ArrayList) r1).size() - 1);
        if (c20484615Do.LJIIL || (dialog = c20484615Do.LIZLLL.getDialog()) == null || dialog.getWindow() == null || (interfaceC20484815DqLIZLLL = c20484615Do.LIZLLL()) == null || (fragment = interfaceC20484815DqLIZLLL.getFragment()) == null || fragment.getView() == null) {
            return;
        }
        View view = fragment.getView();
        Object tag = view.getTag(R.id.n66);
        if (tag != null) {
            iL5 = ((Integer) tag).intValue();
        } else {
            iL5 = interfaceC20484815DqLIZLLL.l5(new ContextThemeWrapper(view.getContext(), interfaceC20484815DqLIZLLL.getThemeOverlay(view.getContext())));
            view.setTag(R.id.n66, Integer.valueOf(iL5));
        }
        C19322510id c19322510id = c20484615Do.LIZLLL.LLILZLL;
        if (c19322510id != null) {
            c19322510id.setColor(iL5);
        }
    }

    public final void LJI() {
        if (((ArrayList) this.LIZIZ).isEmpty()) {
            return;
        }
        C20484615Do c20484615Do = (C20484615Do) ListProtector.get(this.LIZIZ, ((ArrayList) r1).size() - 1);
        View view = c20484615Do.LIZLLL.getView();
        if (view == null) {
            return;
        }
        InterfaceC20484815Dq interfaceC20484815DqLIZLLL = c20484615Do.LIZLLL();
        int systemUiVisibility = view.getSystemUiVisibility();
        int i = (interfaceC20484815DqLIZLLL == null || interfaceC20484815DqLIZLLL.iw() == null) ? systemUiVisibility : (!interfaceC20484815DqLIZLLL.fv() || interfaceC20484815DqLIZLLL.xB()) ? systemUiVisibility & (-8193) : systemUiVisibility | 8192;
        if (Build.VERSION.SDK_INT >= 26) {
            i = interfaceC20484815DqLIZLLL instanceof C0JDJ ? i & (-17) : i | 16;
        }
        if (i != systemUiVisibility) {
            view.setSystemUiVisibility(i);
        }
    }

    public final boolean LIZIZ(long j) {
        if (((ArrayList) this.LIZIZ).isEmpty()) {
            return false;
        }
        for (int i = 0; i < ((ArrayList) this.LIZIZ).size(); i++) {
            if (((C20484615Do) ListProtector.get(this.LIZIZ, i)).LJIIIZ == j) {
                return true;
            }
        }
        return false;
    }

    public final void LIZLLL(InterfaceC20484815Dq interfaceC20484815Dq) {
        C1119850fFP c1119850fFP = C011Z.LIZ;
        if (c1119850fFP.LJJI != null) {
            c1119850fFP.LJJI.getClass();
            ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).aj0();
            C1099170ei3 c1099170ei3 = C1099170ei3.LIZ;
            if (c1099170ei3 != null) {
                c1099170ei3.LIZ(interfaceC20484815Dq);
            }
        }
        Iterator it2 = ((CopyOnWriteArraySet) this.LIZJ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC20484915Dr) it2.next()).LIZ(interfaceC20484815Dq);
        }
    }

    public final void LIZJ(InterfaceC20484815Dq interfaceC20484815Dq, int i) {
        C1119850fFP c1119850fFP = C011Z.LIZ;
        if (c1119850fFP.LJJI != null) {
            c1119850fFP.LJJI.getClass();
            ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).aj0();
            C1099170ei3 c1099170ei3 = C1099170ei3.LIZ;
            if (c1099170ei3 != null) {
                c1099170ei3.LIZIZ(interfaceC20484815Dq, i);
            }
        }
        Iterator it2 = ((CopyOnWriteArraySet) this.LIZJ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC20484915Dr) it2.next()).LIZIZ(interfaceC20484815Dq, i);
        }
    }
}
