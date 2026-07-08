package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.ClickSearchWord;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0PVR, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PVR extends RecyclerView.ViewHolder implements View.OnAttachStateChangeListener {
    public static final int LLIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public static final float LLIZLLLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
    public static final int LLJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
    public final TuxTextView LL;
    public ISearchContextAbility LLILLJJLI;
    public C653660PkS LLILLL;
    public C0PUB LLILZ;
    public ClickSearchWord LLILZIL;
    public String LLILZLL;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    public C0PVR(TuxTextView tuxTextView) {
        super(tuxTextView);
        C0Q72.LIZ(tuxTextView, LLIZLLLIL);
        tuxTextView.addOnAttachStateChangeListener(this);
        this.LL = (TuxTextView) tuxTextView.findViewById(R.id.ua_);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Word word;
        ClickSearchWord clickSearchWord = this.LLILZIL;
        if (clickSearchWord != null && (word = clickSearchWord.wordRecord) != null) {
            C645860PUy.LIZJ(word, this.LLILLJJLI, this.LLILLL, this.LLILZLL, this.LLILZ);
        }
    }
}
