package X;

import android.content.Context;
import android.view.KeyEvent;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0iQ3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1241770iQ3 extends LinearLayout {
    public TuxTextView LL;
    public LinearLayout LLILLJJLI;
    public TuxIconView LLILLL;
    public C427660Gpo LLILZ;
    public TuxIconView LLILZIL;

    public final TuxIconView getInboxSearchUserFilterArrowIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.kjv);
            this.LLILLL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final LinearLayout getInboxSearchUserFilterContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.kjx);
            this.LLILLJJLI = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxIconView getInboxSearchUserFilterDeleteIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.kjy);
            this.LLILZIL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final C427660Gpo getInboxSearchUserFilterHeadFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.kjz);
            this.LLILZ = (C427660Gpo) callbackFindViewById;
        }
        return (C427660Gpo) callbackFindViewById;
    }

    public final TuxTextView getInboxSearchUserFilterNameFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.kk2);
            this.LL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final LinearLayout getContainer() {
        return getInboxSearchUserFilterContainerFromXml();
    }

    public final TuxIconView getDeleteIcon() {
        return getInboxSearchUserFilterDeleteIconFromXml();
    }

    public C1241770iQ3(Context context) {
        super(context, null);
        LinearLayout.inflate(context, R.layout.a_i, this);
        getInboxSearchUserFilterNameFromXml().setMaxWidth((C14KQ.LJIIIIZZ(context) / 2) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(115)));
    }

    public final void setInboxSearchUserFilterArrowIconFromXml(TuxIconView tuxIconView) {
        this.LLILLL = tuxIconView;
    }

    public final void setInboxSearchUserFilterContainerFromXml(LinearLayout linearLayout) {
        this.LLILLJJLI = linearLayout;
    }

    public final void setInboxSearchUserFilterDeleteIconFromXml(TuxIconView tuxIconView) {
        this.LLILZIL = tuxIconView;
    }

    public final void setInboxSearchUserFilterHeadFromXml(C427660Gpo c427660Gpo) {
        this.LLILZ = c427660Gpo;
    }

    public final void setInboxSearchUserFilterNameFromXml(TuxTextView tuxTextView) {
        this.LL = tuxTextView;
    }
}
