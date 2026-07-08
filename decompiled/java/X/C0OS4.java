package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommentAbility;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinStyleTextModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import wh6.AbS691S0100000_9;

/* JADX INFO: renamed from: X.0OS4, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OS4 extends LinearLayout {
    public final TuxTextView LL;
    public int LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public Boolean LLILZIL;
    public BulletinCommentAbility LLILZLL;

    public final BulletinCommentAbility getCommentAbility() {
        return this.LLILZLL;
    }

    public C0OS4(Context context) {
        super(context);
        this.LLILLJJLI = -1;
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        setGravity(16);
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        C786410Ut5.R6(tuxTextView, new LinearLayout.LayoutParams(-2, -2));
        tuxTextView.setMaxLines(1);
        tuxTextView.setTuxFont(62);
        this.LL = tuxTextView;
        addView(tuxTextView);
        C786410Ut5.I7(new AbS691S0100000_9(this, 50), this);
    }

    public final void setCommentAbility(BulletinCommentAbility bulletinCommentAbility) {
        this.LLILZLL = bulletinCommentAbility;
    }

    public final void LIZ(C619590ORx c619590ORx, BulletinCommentAbility bulletinCommentAbility, boolean z) {
        String str;
        this.LLILZLL = bulletinCommentAbility;
        BulletinStyleTextModel bulletinStyleTextModel = c619590ORx.LLILLL;
        String strLJJIFFI = null;
        if (bulletinStyleTextModel != null) {
            str = bulletinStyleTextModel.color;
        } else {
            str = null;
        }
        String str2 = c619590ORx.LLILLJJLI;
        if (c619590ORx.LL == this.LLILLJJLI && Intrinsics.LJFF(str, this.LLILLL) && Intrinsics.LJFF(str2, this.LLILZ) && Intrinsics.LJFF(Boolean.valueOf(z), this.LLILZIL)) {
            return;
        }
        this.LLILLJJLI = c619590ORx.LL;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = Boolean.valueOf(z);
        TuxTextView tuxTextView = this.LL;
        Resources resources = getContext().getResources();
        int i = c619590ORx.LL;
        String quantityString = resources.getQuantityString(2131755116, i, Integer.valueOf(i));
        if (quantityString != null) {
            strLJJIFFI = u.LJJIFFI(quantityString, "{num}", String.valueOf(c619590ORx.LL), false);
        }
        tuxTextView.setText(strLJJIFFI);
        if (str != null) {
            C624550Oeb.LIZLLL(this.LL, str);
        } else if (z && Intrinsics.LJFF(str2, "text")) {
            this.LL.setTextColorRes(R.attr.zi);
        } else {
            this.LL.setTextColorRes(R.attr.a1h);
        }
    }
}
