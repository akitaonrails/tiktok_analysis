package X;

import android.content.Context;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.StringBadge;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Kc2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C521040Kc2 extends AbstractC498530Jgp<C521070Kc5> implements InterfaceC1110900f0y {
    public final int LIZIZ;
    public final BadgeStruct LIZJ;
    public final Context LIZLLL;

    @Override // X.AbstractC498530Jgp
    public final AbstractC521080Kc6 LJ() {
        String str;
        StringBadge stringBadge;
        Context context = this.LIZLLL;
        C521070Kc5 c521070Kc5 = new C521070Kc5(context);
        BadgeStruct badgeStruct = this.LIZJ;
        if (badgeStruct == null || (stringBadge = badgeStruct.stringBadge) == null || (str = stringBadge.contentStr) == null) {
            str = "";
        }
        c521070Kc5.LJIIIZ = str;
        c521070Kc5.LJIIJ = -1;
        c521070Kc5.LJI = C20736316Cj.LIZIZ(R.attr.fx_, context);
        c521070Kc5.LJII = (int) C497740JfY.LIZIZ(4.0f);
        c521070Kc5.LJIIIIZZ = (int) C497740JfY.LIZIZ(6.0f);
        c521070Kc5.LIZLLL = 11;
        c521070Kc5.LJIIL = 500;
        return c521070Kc5;
    }

    @Override // X.InterfaceC1110900f0y
    public final BadgeStruct LIZIZ() {
        return this.LIZJ;
    }

    @Override // X.AbstractC498530Jgp
    public final int LIZLLL() {
        return this.LIZIZ;
    }

    public C521040Kc2(int i, BadgeStruct badgeStruct, Context context) {
        this.LIZIZ = i;
        this.LIZJ = badgeStruct;
        this.LIZLLL = context;
    }
}
