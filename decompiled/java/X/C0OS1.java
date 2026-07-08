package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommentAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommonAbility;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinStyleTextModel;
import com.ss.android.ugc.aweme.tux.theme.darkmode.TuxImageModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS691S0100000_9;

/* JADX INFO: renamed from: X.0OS1, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OS1 extends LinearLayout {
    public final C427660Gpo LL;
    public final TuxTextView LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public String LLILZIL;
    public String LLILZLL;
    public String LLIZ;
    public Boolean LLIZLLLIL;
    public C0OS0 LLJ;
    public BulletinCommentAbility LLJI;
    public BulletinCommonAbility LLJIJIL;
    public int LLJILJIL;

    public final void setCreator(boolean z) {
    }

    public final BulletinCommentAbility getCommentAbility() {
        return this.LLJI;
    }

    public final BulletinCommonAbility getCommonAbility() {
        return this.LLJIJIL;
    }

    public final C0OS0 getCurrentItem() {
        return this.LLJ;
    }

    public final int getProfileSubscribeType() {
        return this.LLJILJIL;
    }

    public C0OS1(Context context) {
        super(context);
        setOrientation(0);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        setGravity(16);
        C427660Gpo c427660Gpo = new C427660Gpo(context, null, 6, 0);
        c427660Gpo.setSize(16);
        C786410Ut5.H6(c427660Gpo, new LinearLayout.LayoutParams(-2, -2));
        this.LL = c427660Gpo;
        addView(c427660Gpo);
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
        C786410Ut5.R6(tuxTextView, layoutParams2);
        tuxTextView.setMaxLines(1);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setTuxFont(61);
        this.LLILLJJLI = tuxTextView;
        addView(tuxTextView);
        C786410Ut5.I7(new AbS691S0100000_9(this, 49), this);
        C2211631BhB.LJ(this, new AwS588S0100000_9(this, 505));
    }

    public final void setCommentAbility(BulletinCommentAbility bulletinCommentAbility) {
        this.LLJI = bulletinCommentAbility;
    }

    public final void setCommonAbility(BulletinCommonAbility bulletinCommonAbility) {
        this.LLJIJIL = bulletinCommonAbility;
    }

    public final void setCurrentItem(C0OS0 c0os0) {
        this.LLJ = c0os0;
    }

    public final void setProfileSubscribeType(int i) {
        this.LLJILJIL = i;
    }

    public final void LIZ(C0OS0 c0os0, BulletinCommentAbility bulletinCommentAbility, BulletinCommonAbility bulletinCommonAbility, boolean z, int i) {
        String uri;
        ImageUrlModel imageUrlModelLIZIZ;
        ImageUrlModel imageUrlModel;
        this.LLJI = bulletinCommentAbility;
        this.LLJIJIL = bulletinCommonAbility;
        this.LLJILJIL = i;
        this.LLJ = c0os0;
        TuxImageModel tuxImageModel = c0os0.LLILLL;
        String str = null;
        if (tuxImageModel != null && (imageUrlModel = tuxImageModel.imageUrlLight) != null) {
            uri = imageUrlModel.getUri();
        } else {
            uri = null;
        }
        BulletinStyleTextModel bulletinStyleTextModel = c0os0.LLJI;
        if (bulletinStyleTextModel != null) {
            str = bulletinStyleTextModel.color;
        }
        String str2 = c0os0.LLILZ;
        if (Intrinsics.LJFF(c0os0.LL, this.LLILLL) && Intrinsics.LJFF(c0os0.LLILLJJLI, this.LLILZ) && Intrinsics.LJFF(uri, this.LLILZIL) && Intrinsics.LJFF(str, this.LLILZLL) && Intrinsics.LJFF(str2, this.LLIZ) && Intrinsics.LJFF(Boolean.valueOf(z), this.LLIZLLLIL)) {
            return;
        }
        this.LLILLL = c0os0.LL;
        this.LLILZ = c0os0.LLILLJJLI;
        this.LLILZIL = uri;
        this.LLILZLL = str;
        this.LLIZ = str2;
        this.LLIZLLLIL = Boolean.valueOf(z);
        TuxImageModel tuxImageModel2 = c0os0.LLILLL;
        if (tuxImageModel2 != null && (imageUrlModelLIZIZ = C0OSD.LIZIZ(getContext(), tuxImageModel2)) != null) {
            C427660Gpo.LJIIJJI(this.LL, imageUrlModelLIZIZ, false, null, null, false, false, null, null, C0OS8.LIZ(), null, 766);
        }
        this.LLILLJJLI.setText(c0os0.LLILLJJLI);
        if (str != null) {
            C624550Oeb.LIZLLL(this.LLILLJJLI, str);
        } else if (z && Intrinsics.LJFF(str2, "text")) {
            this.LLILLJJLI.setTextColorRes(R.attr.zi);
        } else {
            this.LLILLJJLI.setTextColorRes(R.attr.a1h);
        }
    }
}
