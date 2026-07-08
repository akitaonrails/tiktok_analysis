package X;

import Y.ACListenerS76S0300000_9;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: renamed from: X.0OEw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C616200OEw extends LinearLayout {
    public final boolean LL;
    public C197039127h LLILLJJLI;
    public ConstraintLayout LLILLL;
    public RecyclerView LLILZ;
    public C21578619ce LLILZIL;
    public View LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public Aweme LLJ;
    public boolean LLJI;

    public final ConstraintLayout getContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.eqx);
            this.LLILLL = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final View getDividerFromXml() {
        View view = this.LLILZLL;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.fz3);
        this.LLILZLL = viewFindViewById;
        return viewFindViewById;
    }

    public final RecyclerView getHashtagsFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.jhg);
            this.LLILZ = (RecyclerView) callbackFindViewById;
        }
        return (RecyclerView) callbackFindViewById;
    }

    public final C635500OwG getMAdapter() {
        return (C635500OwG) this.LLIZ.getValue();
    }

    public final Aweme getMAweme() {
        Aweme aweme = this.LLJ;
        if (aweme != null) {
            return aweme;
        }
        return null;
    }

    public final C596430NaL getMPresenter() {
        return (C596430NaL) this.LLIZLLLIL.getValue();
    }

    public final C21578619ce getScrollFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.u2i);
            this.LLILZIL = (C21578619ce) callbackFindViewById;
        }
        return (C21578619ce) callbackFindViewById;
    }

    public final C197039127h getSubmitFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.whe);
            this.LLILLJJLI = (C197039127h) callbackFindViewById;
        }
        return (C197039127h) callbackFindViewById;
    }

    public final boolean getShouldDislike() {
        return this.LL;
    }

    public final void setContainerFromXml(ConstraintLayout constraintLayout) {
        this.LLILLL = constraintLayout;
    }

    public final void setDividerFromXml(View view) {
        this.LLILZLL = view;
    }

    public final void setHashtagsFromXml(RecyclerView recyclerView) {
        this.LLILZ = recyclerView;
    }

    public final void setMAweme(Aweme aweme) {
        this.LLJ = aweme;
    }

    public final void setScrollFromXml(C21578619ce c21578619ce) {
        this.LLILZIL = c21578619ce;
    }

    public final void setSubmitFromXml(C197039127h c197039127h) {
        this.LLILLJJLI = c197039127h;
    }

    public C616200OEw(Context context, AFwS240S0000000_9 aFwS240S0000000_9, boolean z) {
        super(context, null, 0);
        this.LL = z;
        this.LLIZ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1747));
        this.LLIZLLLIL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(478));
        C786410Ut5.LJLLJ(context, R.layout.bd5, this);
        if (z) {
            ConstraintLayout containerFromXml = getContainerFromXml();
            ViewGroup.LayoutParams layoutParams = getContainerFromXml().getLayoutParams();
            layoutParams.height = C814420VxA.LIZIZ(C12ES.LJIIIIZZ(context) * 0.5f) - C341940Daq.LIZ(52.0d);
            C786410Ut5.m6(containerFromXml, layoutParams);
        }
        RecyclerView hashtagsFromXml = getHashtagsFromXml();
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(context, 0);
        flexboxLayoutManager.LJJII(1);
        flexboxLayoutManager.LJJIFFI(0);
        flexboxLayoutManager.LJJI(4);
        flexboxLayoutManager.LJJIII(0);
        hashtagsFromXml.setLayoutManager(flexboxLayoutManager);
        getHashtagsFromXml().setAdapter(getMAdapter());
        getSubmitFromXml().setEnabled(false);
        C786410Ut5.U8(getSubmitFromXml(), new ACListenerS76S0300000_9(this, context, aFwS240S0000000_9, 7));
    }
}
