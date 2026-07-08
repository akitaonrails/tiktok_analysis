package X;

import Y.ACListenerS111S0200000_7;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0IlK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C475840IlK extends AbstractC21673619ry<C475850IlL> {
    public final ArrayList<C475860IlM> LL = new ArrayList<>();
    public Function1<? super C475860IlM, Unit> LLILLJJLI;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition != -1) {
            C475860IlM c475860IlM = (C475860IlM) ListProtector.get(this.LL, bindingAdapterPosition);
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_bottombar_live_rec_show");
            c474500IjALIZ.LJJIIZI(c475860IlM.LJFF);
            String str = "1";
            c474500IjALIZ.LJJII("1", "is_in_more_list");
            if (!c475860IlM.LIZLLL) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c474500IjALIZ.LJJII(str, "is_select");
            c474500IjALIZ.LIZ();
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C475850IlL c475850IlL = (C475850IlL) viewHolder;
        C475860IlM c475860IlM = (C475860IlM) ListProtector.get(this.LL, i);
        c475850IlL.LLILLJJLI.setText(c475860IlM.LIZIZ);
        c475850IlL.LLILLL.setText(c475860IlM.LIZIZ);
        String str = c475860IlM.LIZJ;
        ImageView imageView = c475850IlL.LL;
        C1324610kZf url = C1819620xS4.LIZ().setUrl(str);
        url.LJIL = true;
        url.LJJI(imageView);
        if (c475860IlM.LIZLLL) {
            C786410Ut5.LJLLLLLL(0, c475850IlL.LLILZIL);
            C786410Ut5.LJLLLLLL(0, c475850IlL.LLILZ);
            C786410Ut5.LLIL(c475850IlL.LLILLJJLI, 4);
            C786410Ut5.LLIL(c475850IlL.LLILLL, 0);
        } else {
            C786410Ut5.LJLLLLLL(4, c475850IlL.LLILZIL);
            C786410Ut5.LJLLLLLL(4, c475850IlL.LLILZ);
            C786410Ut5.LLIL(c475850IlL.LLILLJJLI, 0);
            C786410Ut5.LLIL(c475850IlL.LLILLL, 4);
        }
        C786410Ut5.I7(new ACListenerS111S0200000_7(this, c475860IlM, 67), c475850IlL.itemView);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C475850IlL c475850IlL = new C475850IlL(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.fzg, viewGroup, false));
        try {
            View view = c475850IlL.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c475850IlL.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c475850IlL.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C475850IlL.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c475850IlL.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c475850IlL.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C475850IlL.class.getName();
        return c475850IlL;
    }
}
