package X;

import android.content.Context;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0cKJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1007570cKJ extends FrameLayout {
    public static final /* synthetic */ int LLJILJILJ = 0;
    public C21279718Pj LL;
    public LinearLayout LLILLJJLI;
    public SmartAvatarImageView LLILLL;
    public TuxTextView LLILZ;
    public RecyclerView LLILZIL;
    public TuxTextView LLILZLL;
    public C197039127h LLIZ;
    public C197039127h LLIZLLLIL;
    public LinearLayout LLJ;
    public C0SUL LLJI;
    public TuxIconView LLJIJIL;
    public TuxActionSheet LLJILJIL;

    public final TuxTextView getAdvertiserDescTvFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.aj8);
            this.LLILZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final SmartAvatarImageView getAdvertiserHeaderIvFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.aja);
            this.LLILLL = (SmartAvatarImageView) callbackFindViewById;
        }
        return (SmartAvatarImageView) callbackFindViewById;
    }

    public final TuxTextView getAdvertiserNicknameTvFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ajc);
            this.LLILZLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final LinearLayout getContentFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.eu1);
            this.LLJ = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final LinearLayout getHeaderNicknameLlFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.jk1);
            this.LLILLJJLI = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxIconView getIvSwipeUpFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.lwm);
            this.LLJIJIL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final C0SUL getLongPressLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.long_press_layout);
            this.LLJI = (C0SUL) callbackFindViewById;
        }
        return (C0SUL) callbackFindViewById;
    }

    public final C197039127h getNoInterestBtnFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.p_f);
            this.LLIZ = (C197039127h) callbackFindViewById;
        }
        return (C197039127h) callbackFindViewById;
    }

    public final RecyclerView getRvCardContentFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tur);
            this.LLILZIL = (RecyclerView) callbackFindViewById;
        }
        return (RecyclerView) callbackFindViewById;
    }

    public final C197039127h getSeeMoreBtnFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.uj4);
            this.LLIZLLLIL = (C197039127h) callbackFindViewById;
        }
        return (C197039127h) callbackFindViewById;
    }

    public final C21279718Pj getSponsorLabelFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.vvi);
            this.LL = (C21279718Pj) callbackFindViewById;
        }
        return (C21279718Pj) callbackFindViewById;
    }

    public C1007570cKJ(Context context) {
        super(context, null, 0);
        C786410Ut5.Sd(R.layout.p8, C786410Ut5.ne(context), this);
    }

    public final void setAdvertiserDescTvFromXml(TuxTextView tuxTextView) {
        this.LLILZ = tuxTextView;
    }

    public final void setAdvertiserHeaderIvFromXml(SmartAvatarImageView smartAvatarImageView) {
        this.LLILLL = smartAvatarImageView;
    }

    public final void setAdvertiserNicknameTvFromXml(TuxTextView tuxTextView) {
        this.LLILZLL = tuxTextView;
    }

    public final void setContentFromXml(LinearLayout linearLayout) {
        this.LLJ = linearLayout;
    }

    public final void setHeaderNicknameLlFromXml(LinearLayout linearLayout) {
        this.LLILLJJLI = linearLayout;
    }

    public final void setIvSwipeUpFromXml(TuxIconView tuxIconView) {
        this.LLJIJIL = tuxIconView;
    }

    public final void setLongPressLayoutFromXml(C0SUL c0sul) {
        this.LLJI = c0sul;
    }

    public final void setNoInterestBtnFromXml(C197039127h c197039127h) {
        this.LLIZ = c197039127h;
    }

    public final void setRvCardContentFromXml(RecyclerView recyclerView) {
        this.LLILZIL = recyclerView;
    }

    public final void setSeeMoreBtnFromXml(C197039127h c197039127h) {
        this.LLIZLLLIL = c197039127h;
    }

    public final void setSponsorLabelFromXml(C21279718Pj c21279718Pj) {
        this.LL = c21279718Pj;
    }
}
