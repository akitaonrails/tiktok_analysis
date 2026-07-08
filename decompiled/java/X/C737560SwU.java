package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0SwU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C737560SwU extends ConstraintLayout {
    public static final /* synthetic */ int LLILZ = 0;
    public TuxIconView LL;
    public C197039127h LLILLJJLI;
    public String LLILLL;

    public final TuxIconView getVideoTagIntroCloseButtonFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.video_tag_intro_close_button);
            this.LL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final C197039127h getVideoTagIntroCtaFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.video_tag_intro_cta);
            this.LLILLJJLI = (C197039127h) callbackFindViewById;
        }
        return (C197039127h) callbackFindViewById;
    }

    public final String getCloseType() {
        return this.LLILLL;
    }

    public final void setCloseType(String str) {
        this.LLILLL = str;
    }

    public final void setVideoTagIntroCloseButtonFromXml(TuxIconView tuxIconView) {
        this.LL = tuxIconView;
    }

    public final void setVideoTagIntroCtaFromXml(C197039127h c197039127h) {
        this.LLILLJJLI = c197039127h;
    }

    public C737560SwU(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C786410Ut5.LJLLJ(context, R.layout.dlq, this);
        this.LLILLL = "other";
    }
}
