package X;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.1134, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class AnonymousClass1134 extends AbstractC1640250sml {
    public final /* synthetic */ AnonymousClass1136 LLILZ;

    @Override // X.AbstractC1640250sml
    public final void LLLII(RecyclerView.ViewHolder viewHolder) {
        C19352010nO c19352010nO;
        TextView textView;
        if ((viewHolder instanceof C19352010nO) && (c19352010nO = (C19352010nO) viewHolder) != null && (textView = c19352010nO.LL) != null) {
            AnonymousClass1136 anonymousClass1136 = this.LLILZ;
            if (anonymousClass1136.LIZ().LJIIIZ || !anonymousClass1136.LIZ().LJIIIIZZ || (!C113I.LJ(anonymousClass1136.LL) && !anonymousClass1136.LJII())) {
                C786410Ut5.LLIL(textView, 8);
            } else {
                textView.setText(anonymousClass1136.LIZLLL());
            }
        }
    }

    @Override // X.AbstractC1640250sml
    public final RecyclerView.ViewHolder LLLIIIIL(ViewGroup viewGroup) {
        return new C19352010nO(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.by7, viewGroup, false));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass1134(AnonymousClass1136 anonymousClass1136, AbstractC683590Qrd abstractC683590Qrd) {
        super(abstractC683590Qrd);
        this.LLILZ = anonymousClass1136;
    }
}
