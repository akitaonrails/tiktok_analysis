package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.viewmodel.SearchRefreshPredictMobCanShowVM;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS411S0200000_10;
import kotlin.jvm.internal.AwS659S0100000_10;

/* JADX INFO: renamed from: X.0Prq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C658240Prq extends RecyclerView.ViewHolder {
    public final InterfaceC656470Poz LL;
    public final InterfaceC1631620sYq<View, Integer, Aweme, Unit> LLILLJJLI;
    public final View LLILLL;
    public final SmartImageView LLILZ;
    public Aweme LLILZIL;
    public int LLILZLL;
    public SearchRefreshPredictMobCanShowVM LLIZ;
    public boolean LLIZLLLIL;

    public C658240Prq(View view, InterfaceC656470Poz interfaceC656470Poz, AwS659S0100000_10 awS659S0100000_10) {
        super(view);
        this.LL = interfaceC656470Poz;
        this.LLILLJJLI = awS659S0100000_10;
        this.LLILLL = view;
        this.LLILZ = (SmartImageView) view.findViewById(R.id.cover);
        view.addOnAttachStateChangeListener(new C0R45(this, 44));
        C1524805y2.LIZIZ(0L, new AwS411S0200000_10(this, view, 105));
    }
}
