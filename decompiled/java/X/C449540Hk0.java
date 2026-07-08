package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0Hk0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C449540Hk0 extends C443910Hav {
    public List<Emoji> LIZIZ;

    @Override // X.InterfaceC444050Hb9
    public final int LIZJ() {
        return 2;
    }

    @Override // X.C443910Hav, X.InterfaceC444050Hb9
    public final int LIZLLL() {
        return 0;
    }

    @Override // X.C443910Hav, X.InterfaceC444050Hb9
    public final Drawable LJFF(Context context) {
        return null;
    }

    @Override // X.C443910Hav, X.InterfaceC444050Hb9
    public final List<C451030HmP> LIZ() {
        Emoji emoji;
        ArrayList arrayList = new ArrayList(8);
        for (int i = 0; i < this.LIZIZ.size(); i++) {
            C451030HmP c451030HmP = new C451030HmP();
            if (i >= 0 && i < this.LIZIZ.size() && (emoji = (Emoji) ListProtector.get(this.LIZIZ, i)) != null) {
                c451030HmP.LIZIZ = C454580Hs8.LIZIZ(emoji);
                c451030HmP.LIZJ = emoji;
            }
            arrayList.add(c451030HmP);
        }
        return arrayList;
    }

    @Override // X.C443910Hav, X.InterfaceC444050Hb9
    public final boolean LJII() {
        List<Emoji> list = this.LIZIZ;
        return list != null && list.size() > 0;
    }

    @Override // X.C443910Hav, X.InterfaceC444050Hb9
    public final int Al() {
        if (LJII()) {
            return ((this.LIZIZ.size() - 1) / 8) + 1;
        }
        return 1;
    }

    @Override // X.C443910Hav, X.InterfaceC444050Hb9
    public final String LJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(2);
        sbLIZ.append("-");
        throw null;
    }

    @Override // X.C443910Hav
    public final int LJIIL() {
        return LJII() ? 8 : 1;
    }

    @Override // X.C443910Hav, X.InterfaceC444050Hb9
    public final String getIconUrl() {
        throw null;
    }

    @Override // X.C443910Hav, X.InterfaceC444050Hb9
    public final String getName() {
        throw null;
    }

    @Override // X.C443910Hav, X.InterfaceC444050Hb9
    public final List<C451030HmP> LIZIZ(int i) {
        Emoji emoji;
        ArrayList arrayList = new ArrayList(8);
        for (int i2 = i * 8; i2 < (i + 1) * 8; i2++) {
            C451030HmP c451030HmP = new C451030HmP();
            if (i2 >= 0 && i2 < this.LIZIZ.size() && (emoji = (Emoji) ListProtector.get(this.LIZIZ, i2)) != null) {
                c451030HmP.LIZIZ = C454580Hs8.LIZIZ(emoji);
                c451030HmP.LIZJ = emoji;
            }
            arrayList.add(c451030HmP);
        }
        return arrayList;
    }
}
