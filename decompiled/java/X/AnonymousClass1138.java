package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.1138, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class AnonymousClass1138 extends AbstractC683590Qrd<EffectModel> {
    public final C113D LL;
    public final C113G LLILLJJLI;
    public C113A LLILLL;
    public int LLILZ;

    @Override // X.AbstractC438050HFr
    public final int getBasicItemViewType(int i) {
        return 1;
    }

    public AnonymousClass1138(C113D c113d, C113G c113g) {
        super(false);
        this.LL = c113d;
        this.LLILLJJLI = c113g;
        this.LLILZ = c113g.LJIIJ ? 0 : -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00c5  */
    @Override // X.AbstractC438050HFr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindBasicViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r11, int r12) {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1138.onBindBasicViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC438050HFr
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        return new AnonymousClass1139(this, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.by6, viewGroup, false), this.LL);
    }
}
