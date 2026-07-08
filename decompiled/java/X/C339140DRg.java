package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.model.AdDislikeReasonModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS583S0100000_4;

/* JADX INFO: renamed from: X.0DRg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C339140DRg extends AbstractC21673619ry<C339160DRi> {
    public final Context LL;
    public final List<AdDislikeReasonModel> LLILLJJLI;
    public final Function2<String, Integer, Unit> LLILLL;
    public final Function2<String, Integer, Unit> LLILZ;
    public final Function0<Unit> LLILZIL;
    public final List<Boolean> LLILZLL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI.size();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        final C197039127h c197039127h = ((C339160DRi) viewHolder).LL;
        final AdDislikeReasonModel adDislikeReasonModel = (AdDislikeReasonModel) ListProtector.get(this.LLILLJJLI, i);
        c197039127h.setText(adDislikeReasonModel.reason);
        c197039127h.LJJJJL(new AwS583S0100000_4(this, 316));
        C786410Ut5.U8(c197039127h, new View.OnClickListener() { // from class: X.0DRh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean zBooleanValue = ((Boolean) ListProtector.get(this.LL.LLILZLL, i)).booleanValue();
                String str = "";
                if (!zBooleanValue) {
                    c197039127h.LJJJJL(new AwS583S0100000_4(this.LL, 314));
                    Function2<String, Integer, Unit> function2 = this.LL.LLILLL;
                    String str2 = adDislikeReasonModel.key;
                    if (str2 != null) {
                        str = str2;
                    }
                    function2.invoke(str, Integer.valueOf(i));
                } else {
                    c197039127h.LJJJJL(new AwS583S0100000_4(this.LL, 315));
                    Function2<String, Integer, Unit> function22 = this.LL.LLILZ;
                    String str3 = adDislikeReasonModel.key;
                    if (str3 != null) {
                        str = str3;
                    }
                    function22.invoke(str, Integer.valueOf(i));
                }
                ListProtector.set(this.LL.LLILZLL, i, Boolean.valueOf(!zBooleanValue));
                this.LL.LLILZIL.invoke();
            }
        });
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C339160DRi c339160DRi = new C339160DRi(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bmf, viewGroup, false));
        try {
            View view = c339160DRi.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c339160DRi.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c339160DRi.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C339160DRi.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c339160DRi.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c339160DRi.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C339160DRi.class.getName();
        return c339160DRi;
    }

    public C339140DRg(C19EG c19eg, List list, C1064940doq c1064940doq, C1064950dor c1064950dor, C1064960dos c1064960dos) {
        this.LL = c19eg;
        this.LLILLJJLI = list;
        this.LLILLL = c1064940doq;
        this.LLILZ = c1064950dor;
        this.LLILZIL = c1064960dos;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(Boolean.FALSE);
        }
        this.LLILZLL = arrayList;
    }
}
