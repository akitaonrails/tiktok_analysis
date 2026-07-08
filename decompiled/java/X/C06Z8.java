package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.06Z8, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06Z8 extends FrameLayout {
    public final TuxIconView LL;
    public final View LLILLJJLI;
    public final C0I7D LLILLL;
    public final C427870Gq9 LLILZ;

    public final C427870Gq9 getAvatar() {
        return this.LLILZ;
    }

    public final View getEditBox() {
        return this.LLILLJJLI;
    }

    public final C0I7D getEditText() {
        return this.LLILLL;
    }

    public final TuxIconView getSendButton() {
        return this.LL;
    }

    public C06Z8(Context context, AttributeSet attributeSet) {
        String avatarUrl;
        super(context, attributeSet, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.ags, this, true);
        TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.up_);
        this.LL = tuxIconView;
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(100));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.ob);
        tuxIconView.setBackground(c384050F3z.LIZ(getContext()));
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
        c419910GdJ.LIZ = R.raw.icon_arrow_up_bold;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a0o);
        tuxIconView.setTuxIcon(c419910GdJ);
        View viewFindViewById = findViewById(R.id.ma7);
        this.LLILLJJLI = viewFindViewById;
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(22));
        c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a03);
        viewFindViewById.setBackground(c384050F3z2.LIZ(getContext()));
        this.LLILLL = (C0I7D) findViewById(R.id.grz);
        this.LLILZ = (C427870Gq9) findViewById(R.id.bh2);
        IAccountUserService iAccountUserService = (IAccountUserService) PluggableExtentionKt.pluggableSpi$default(IAccountUserService.class, false, false, false, 14, null);
        if (iAccountUserService != null && (avatarUrl = iAccountUserService.getAvatarUrl()) != null) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C06Z9(avatarUrl, this, null), 3);
        }
    }
}
