package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0FA9, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FA9 extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final Context LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public Function1<? super C385490F9n, Unit> LLILZ;
    public final ArrayList<C385490F9n> LLILZIL = new ArrayList<>();
    public final int LLILZLL;
    public final int LLIZ;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILZIL.size();
    }

    public final int LLLFZ() {
        if (C293810BfP.LIZ()) {
            return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf((C418440Gaw.LJFF(this.LLILZLL, this.LL) - ((this.LLILZIL.size() - 1) * 4)) / this.LLILZIL.size())));
        }
        return this.LLILZLL <= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(320)) ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)) : this.LLILZLL > C814420VxA.LIZIZ(C418440Gaw.LIZIZ(320)) && this.LLILZLL <= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(360)) ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)) : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d3  */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r9, int r10) {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0FA9.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C0FAA c0faa = new C0FAA(C786410Ut5.Td(C786410Ut5.ne(this.LL), R.layout.fsj, viewGroup, false), this.LLIZ, LLLFZ(), this.LLILLJJLI, this.LLILLL);
        try {
            View view = c0faa.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0faa.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0faa.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0FAA.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0faa.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0faa.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0FAA.class.getName();
        return c0faa;
    }

    public C0FA9(int i, int i2, Context context) {
        int i3;
        this.LL = context;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        int iLIZLLL = C418440Gaw.LIZLLL(context);
        this.LLILZLL = iLIZLLL;
        if (iLIZLLL <= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(320))) {
            i3 = 20;
        } else {
            i3 = 24;
        }
        this.LLIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i3)));
    }
}
