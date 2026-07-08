package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.billboard.ui.page.BasicPageVH;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0epk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1103940epk extends AbstractC21673619ry<AbstractC1103960epm> {
    public final InterfaceC1103990epp LL;
    public final C2172981A2m<C2757014x> LLILLJJLI = new C2172981A2m<>(this, new AbstractC339510DSr<C2757014x>() { // from class: X.0epl
        @Override // X.AbstractC339510DSr
        public final boolean LIZ(C2757014x c2757014x, C2757014x c2757014x2) {
            return Intrinsics.LJFF(c2757014x, c2757014x2);
        }

        @Override // X.AbstractC339510DSr
        public final boolean LIZIZ(C2757014x c2757014x, C2757014x c2757014x2) {
            return Intrinsics.LJFF(c2757014x.LIZ.boardId, c2757014x2.LIZ.boardId);
        }

        @Override // X.AbstractC339510DSr
        public final Object LIZJ(C2757014x c2757014x, C2757014x c2757014x2) {
            if (!Intrinsics.LJFF(c2757014x, c2757014x2)) {
                return "CONTENT_CHANGED";
            }
            return null;
        }
    });

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI.LJFF.size();
    }

    public C1103940epk(InterfaceC1103990epp interfaceC1103990epp) {
        this.LL = interfaceC1103990epp;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (((C2757014x) ListProtector.get(this.LLILLJJLI.LJFF, i)).LIZIZ != null) {
            return 1;
        }
        return 0;
    }

    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        ((AbstractC1103960epm) viewHolder).onAttach();
    }

    @Override // X.AbstractC21673619ry
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        ((AbstractC1103960epm) viewHolder).onDetach();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        ((AbstractC1103960epm) viewHolder).I5((C2757014x) ListProtector.get(this.LLILLJJLI.LJFF, i), i);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder basicPageVH;
        if (i == 1) {
            int i2 = C1103970epn.LLIZLLLIL;
            InterfaceC1103990epp interfaceC1103990epp = this.LL;
            FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
            C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(-1, -1));
            basicPageVH = new C1103970epn(frameLayout, interfaceC1103990epp);
        } else {
            int i3 = BasicPageVH.LLIZ;
            basicPageVH = new BasicPageVH(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.g08, viewGroup, false), this.LL);
        }
        try {
            View view = basicPageVH.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        basicPageVH.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (basicPageVH.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(basicPageVH.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) basicPageVH.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(basicPageVH.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = basicPageVH.getClass().getName();
        return basicPageVH;
    }
}
