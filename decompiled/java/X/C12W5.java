package X;

import Y.ACListenerS131S0200000_29;
import Y.ACListenerS163S0100000_29;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.12W5, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12W5 extends C12W6 {
    public C19767912Vx LLJ;
    public boolean LLJI;

    public final boolean LLLJL() {
        boolean z = C1444820nhY.LIZ;
        return C0C64.LJIILLIIL().LJIIIZ(31744, "enable_music_smart_stick_point", true, false) && !C0CHQ.LIZ().getAccountService().LIZ() && this.LLJI;
    }

    @Override // X.C12W6, X.AbstractC21673619ry
    public final int getItemCount() {
        return LLLJL() ? super.getItemCount() + 1 : super.getItemCount();
    }

    @Override // X.C12W6
    public final void LLLI(View view) throws Throwable {
        C19767912Vx c19767912Vx = this.LLJ;
        if (c19767912Vx != null) {
            c19767912Vx.LLLIL();
        }
    }

    @Override // X.C12W6
    public final C12W7 LLLIILIL(int i) {
        if (!LLLJL()) {
            return super.LLLIILIL(i);
        }
        if (getItemViewType(i) != 10002) {
            return null;
        }
        return (C12W7) ListProtector.get(this.LL, LLLJIL(i));
    }

    public final int LLLJIL(int i) {
        if (LLLJL()) {
            return i - 1;
        }
        return i;
    }

    @Override // X.C12W6, X.AbstractC21673619ry
    public final long getItemId(int i) {
        if (!LLLJL()) {
            return super.getItemId(i);
        }
        if (getItemViewType(i) == 10001) {
            return 10001L;
        }
        if (getItemViewType(i) == 10003) {
            return 10003L;
        }
        return ((C12W7) ListProtector.get(this.LL, LLLJIL(i))).LIZ;
    }

    @Override // X.C12W6, X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (!LLLJL()) {
            return super.getItemViewType(i);
        }
        if (i == 0) {
            return 10001;
        }
        if (LLLJIL(i) < ((ArrayList) this.LL).size()) {
            return 10002;
        }
        return 10003;
    }

    @Override // X.C12W6, X.C12WD
    public final void LJLZ(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        if (!LLLJL()) {
            super.LJLZ(viewHolder, viewHolder2);
            return;
        }
        int iLLLJIL = LLLJIL(viewHolder.getAdapterPosition());
        int iLLLJIL2 = LLLJIL(viewHolder2.getAdapterPosition());
        if (iLLLJIL < ((ArrayList) this.LL).size() && iLLLJIL2 < ((ArrayList) this.LL).size()) {
            int i = ((C19765612Va) viewHolder).LLILLJJLI.videoIndex;
            int i2 = ((C19765612Va) viewHolder2).LLILLJJLI.videoIndex;
            LLLILZLLLI(i, i2);
            ListProtector.add(this.LL, iLLLJIL2, ListProtector.remove(this.LL, iLLLJIL));
            notifyItemMoved(viewHolder.getAdapterPosition(), viewHolder2.getAdapterPosition());
            CutMultiVideoViewModel cutMultiVideoViewModel = this.LLILZLL;
            cutMultiVideoViewModel.LLJIJIL.setValue(new C574920Mgk(1, i, i2));
        }
    }

    @Override // X.C12W6
    public final int LLLIIIIL(RecyclerView recyclerView, int i) {
        if (LLLJL()) {
            i++;
        }
        return super.LLLIIIIL(recyclerView, i);
    }

    @Override // X.C12W6, X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder instanceof C995270c0T) {
            C995270c0T c995270c0T = (C995270c0T) viewHolder;
            C786410Ut5.I7(new ACListenerS163S0100000_29(c995270c0T.LL, 295), c995270c0T.itemView);
        } else if (viewHolder instanceof C12W4) {
            ((C19765612Va) viewHolder).I5(LLLIILIL(i), (C19765612Va) viewHolder);
        }
        super.onBindViewHolder(viewHolder, i);
    }

    @Override // X.C12W6, X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(final ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c995270c0T;
        if (i != 10001) {
            if (i != 10002) {
                c995270c0T = super.onCreateViewHolder(viewGroup, i);
            } else {
                c995270c0T = new C19765612Va(viewGroup) { // from class: X.12W4
                    @Override // X.C19765612Va
                    public final void L5(C19765612Va c19765612Va) {
                        C786410Ut5.I7(new ACListenerS131S0200000_29(this.LLILZLL, c19765612Va, 55), this.itemView);
                    }
                };
            }
        } else {
            c995270c0T = new C995270c0T(this, viewGroup);
        }
        try {
            View view = c995270c0T.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c995270c0T.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c995270c0T.itemView.getParent() != null) {
                boolean zLIZ = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    zLIZ = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (zLIZ) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c995270c0T.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c995270c0T.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c995270c0T.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c995270c0T.getClass().getName();
        return c995270c0T;
    }

    public C12W5(VideoEditViewModel videoEditViewModel, CutMultiVideoViewModel cutMultiVideoViewModel, List<? extends VideoSegment> list) {
        super(videoEditViewModel, cutMultiVideoViewModel, list);
    }
}
