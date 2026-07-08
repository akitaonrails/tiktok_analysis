package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS633S0100000_19;

/* JADX INFO: renamed from: X.0HF2, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HF2 extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final Function2<Aweme, Integer, Unit> LL;
    public final List<Aweme> LLILLJJLI = new ArrayList();
    public int LLILLL = -1;
    public boolean LLILZ;

    public final void LLLFZ() {
        if (this.LLILZ) {
            this.LLILZ = false;
            notifyItemRemoved(((ArrayList) this.LLILLJJLI).size());
        }
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILLJJLI).size() + (this.LLILZ ? 1 : 0);
    }

    public C0HF2(AwS633S0100000_19 awS633S0100000_19) {
        this.LL = awS633S0100000_19;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (i == ((ArrayList) this.LLILLJJLI).size() && this.LLILZ) {
            return 1;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r12, int r13) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0HF2.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c0hf3;
        if (i == 1) {
            int i2 = C0HF4.LLILLJJLI;
            FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
            C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56))));
            C1390410mHn c1390410mHn = new C1390410mHn(viewGroup.getContext(), null, 6);
            c1390410mHn.setId(R.id.byg);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
            layoutParams.gravity = 17;
            C786410Ut5.V6(c1390410mHn, layoutParams);
            frameLayout.addView(c1390410mHn);
            c0hf3 = new C0HF4(frameLayout);
        } else {
            c0hf3 = new C0HF3(this, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ebx, viewGroup, false));
        }
        try {
            View view = c0hf3.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0hf3.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0hf3.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c0hf3.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0hf3.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0hf3.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c0hf3.getClass().getName();
        return c0hf3;
    }
}
