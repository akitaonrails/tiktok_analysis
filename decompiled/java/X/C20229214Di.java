package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.quickconversion.aipdp.model.AiPdpEnterParams;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.14Di, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20229214Di extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final List<AbstractC20229814Do> LL;
    public final AiPdpEnterParams LLILLJJLI;
    public final C20230514Dv LLILLL = new C20230514Dv();
    public final C20230614Dw LLILZ = new Object() { // from class: X.14Dw
    };
    public final C20230714Dx LLILZIL = new Object() { // from class: X.14Dx
    };
    public Function2<? super EnumC20229514Dl, ? super Integer, Unit> LLILZLL;
    public Function1<? super Integer, Unit> LLIZ;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (i >= 0 && i < this.LL.size()) {
            return ((AbstractC20229814Do) ListProtector.get(this.LL, i)).LIZ.ordinal();
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.14Dw] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.14Dx] */
    public C20229214Di(List<? extends AbstractC20229814Do> list, AiPdpEnterParams aiPdpEnterParams) {
        this.LL = list;
        this.LLILLJJLI = aiPdpEnterParams;
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:287:? A[RETURN, SYNTHETIC] */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r36, final int r37) {
        /*
            Method dump skipped, instruction units count: 1223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20229214Di.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolder;
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(viewGroup.getContext());
        int i2 = C20229414Dk.LIZ[EnumC20229514Dl.values()[i].ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    final View viewTd = C786410Ut5.Td(layoutInflaterNe, R.layout.akg, viewGroup, false);
                    viewHolder = new RecyclerView.ViewHolder(viewTd) { // from class: X.14Dr
                    };
                } else {
                    throw new C1954807lC();
                }
            } else {
                final View viewTd2 = C786410Ut5.Td(layoutInflaterNe, R.layout.aki, viewGroup, false);
                viewHolder = new RecyclerView.ViewHolder(viewTd2) { // from class: X.14Dq
                };
            }
        } else {
            final View viewTd3 = C786410Ut5.Td(layoutInflaterNe, R.layout.akf, viewGroup, false);
            viewHolder = new RecyclerView.ViewHolder(viewTd3) { // from class: X.14Dp
            };
        }
        try {
            View view = viewHolder.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        viewHolder.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(viewHolder.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(viewHolder.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = viewHolder.getClass().getName();
        return viewHolder;
    }
}
