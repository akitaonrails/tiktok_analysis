package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.game.GameDrawerCategory;

/* JADX INFO: renamed from: X.0ImV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C476570ImV extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final InterfaceC476580ImW LL;
    public final List<GameDrawerCategory> LLILLJJLI = new ArrayList();

    public final void clear() {
        if (((ArrayList) this.LLILLJJLI).isEmpty()) {
            return;
        }
        int size = ((ArrayList) this.LLILLJJLI).size();
        ((ArrayList) this.LLILLJJLI).clear();
        notifyItemRangeRemoved(0, size);
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILLJJLI).size();
    }

    public C476570ImV(C0IUC c0iuc) {
        this.LL = c0iuc;
    }

    public final void LLLFZ(List<GameDrawerCategory> list) {
        int size;
        if (list.isEmpty()) {
            return;
        }
        if (((ArrayList) this.LLILLJJLI).size() - 1 >= 0) {
            size = ((ArrayList) this.LLILLJJLI).size() - 1;
        } else {
            size = 0;
        }
        ((ArrayList) this.LLILLJJLI).addAll(list);
        notifyItemRangeInserted(size, list.size());
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        boolean z = false;
        if (i >= 0 && i < ((ArrayList) this.LLILLJJLI).size()) {
            z = true;
        }
        if (!z || !Intrinsics.LJFF(((GameDrawerCategory) ListProtector.get(this.LLILLJJLI, i)).categoryType, "category_type_no_more")) {
            return LSPassThroughRecordSizeConfig.DEFAULT;
        }
        return 1001;
    }

    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder instanceof C476560ImU) {
            C476560ImU c476560ImU = (C476560ImU) viewHolder;
            if (c476560ImU.LL.Fn()) {
                c476560ImU.L5("show");
            }
            c476560ImU.LLILZ = true;
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewDetachedFromWindow(viewHolder);
        if (viewHolder instanceof C476560ImU) {
            ((C476560ImU) viewHolder).onViewDetachedFromWindow();
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if ((viewHolder instanceof C476560ImU) && i >= 0 && i < ((ArrayList) this.LLILLJJLI).size()) {
            ((C476560ImU) viewHolder).I5((GameDrawerCategory) ListProtector.get(this.LLILLJJLI, i), i);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c476560ImU;
        if (i != 1000) {
            if (i != 1001) {
                c476560ImU = new C476560ImU(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gmi, viewGroup, false), this.LL);
            } else {
                final View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gdb, viewGroup, false);
                c476560ImU = new RecyclerView.ViewHolder(viewTd) { // from class: X.0ImX
                };
            }
        } else {
            final View viewTd2 = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gmi, viewGroup, false);
            final InterfaceC476580ImW interfaceC476580ImW = this.LL;
            c476560ImU = new C476560ImU(viewTd2, interfaceC476580ImW) { // from class: X.0Ima
                public final View LLILZIL;
                public C1324720kZq LLILZLL;
                public C16F5 LLIZ;
                public C16F5 LLIZLLLIL;
                public View LLJ;
                public C476630Imb LLJI;
                public final int LLJIJIL;
                public final int LLJILJIL;
                public final int LLJILJILJ;
                public final int LLJILLL;
                public final int LLJJ;
                public final float LLJJI;

                @Override // X.C476560ImU
                public final void onViewDetachedFromWindow() {
                    ViewGroup viewGroup2;
                    this.LLILZ = false;
                    C476630Imb c476630Imb = this.LLJI;
                    if (c476630Imb != null) {
                        View view = this.LLILZIL;
                        if (!(view instanceof ViewGroup) || (viewGroup2 = (ViewGroup) view) == null) {
                            return;
                        }
                        C786410Ut5.LJJJLZIJ(c476630Imb, viewGroup2);
                    }
                }

                {
                    super(viewTd2, interfaceC476580ImW);
                    this.LLILZIL = viewTd2;
                    this.LLJIJIL = (int) C497740JfY.LIZIZ(16.0f);
                    this.LLJILJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(6.0f)));
                    this.LLJILJILJ = (int) C497740JfY.LIZIZ(113.0f);
                    this.LLJILLL = (int) C497740JfY.LIZIZ(150.0f);
                    C497740JfY.LIZ(190.0f);
                    this.LLJJ = (int) C497740JfY.LIZIZ(8.0f);
                    this.LLJJI = C497740JfY.LIZIZ(4.0f);
                }

                /* JADX WARN: Removed duplicated region for block: B:83:0x0248  */
                /* JADX WARN: Type inference failed for: r0v48, types: [REQUEST, X.0kbR] */
                /* JADX WARN: Type inference failed for: r1v19, types: [X.0Imb] */
                @Override // X.C476560ImU
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void I5(webcast.api.game.GameDrawerCategory r18, int r19) {
                    /*
                        Method dump skipped, instruction units count: 607
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C476620Ima.I5(webcast.api.game.GameDrawerCategory, int):void");
                }
            };
        }
        try {
            View view = c476560ImU.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c476560ImU.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c476560ImU.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c476560ImU.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c476560ImU.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c476560ImU.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c476560ImU.getClass().getName();
        return c476560ImU;
    }
}
