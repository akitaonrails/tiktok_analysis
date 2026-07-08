package X;

import Y.ACListenerS50S0101000_6;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerTopicRepoApi;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: renamed from: X.0H2v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C434710H2v extends AbstractC21673619ry<C421040Gf8> {
    public final Function1<Integer, Unit> LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(562));

    public final List<AddYoursStickerTopicRepoApi.AddYoursAutoSuggestTopicForText> LLLFZ() {
        return (List) this.LLILLJJLI.getValue();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return LLLFZ().size();
    }

    public C434710H2v(C19642611tA c19642611tA) {
        this.LL = c19642611tA;
    }

    public final void setData(List<AddYoursStickerTopicRepoApi.AddYoursAutoSuggestTopicForText> list) {
        LLLFZ().clear();
        LLLFZ().addAll(list);
        notifyDataSetChanged();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C421040Gf8 c421040Gf8 = (C421040Gf8) viewHolder;
        if (LLLFZ().size() > i) {
            AddYoursStickerTopicRepoApi.AddYoursAutoSuggestTopicForText addYoursAutoSuggestTopicForText = (AddYoursStickerTopicRepoApi.AddYoursAutoSuggestTopicForText) ListProtector.get(LLLFZ(), i);
            c421040Gf8.getClass();
            if (addYoursAutoSuggestTopicForText.text != null) {
                ((TextView) c421040Gf8.LLILLJJLI.getValue()).setText(addYoursAutoSuggestTopicForText.text);
            }
            C786410Ut5.I7(new ACListenerS50S0101000_6(this, i, 4), c421040Gf8.LL);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C421040Gf8 c421040Gf8 = new C421040Gf8(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.vt, viewGroup, false));
        try {
            View view = c421040Gf8.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c421040Gf8.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c421040Gf8.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C421040Gf8.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c421040Gf8.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c421040Gf8.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C421040Gf8.class.getName();
        return c421040Gf8;
    }
}
