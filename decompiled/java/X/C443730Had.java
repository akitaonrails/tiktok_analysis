package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0Had, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C443730Had extends C443910Hav {
    public static final C443730Had LIZIZ = new C443730Had();

    @Override // X.InterfaceC444050Hb9
    public final int LIZJ() {
        return 7;
    }

    @Override // X.C443910Hav, X.InterfaceC444050Hb9
    public final int LIZLLL() {
        return 0;
    }

    @Override // X.C443910Hav, X.InterfaceC444050Hb9
    public final List<C451030HmP> LIZ() {
        return C13BV.INSTANCE;
    }

    @Override // X.C443910Hav, X.InterfaceC444050Hb9
    public final Drawable LJFF(Context context) {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_star_light;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
        return c419910GdJ.LIZ(context);
    }
}
