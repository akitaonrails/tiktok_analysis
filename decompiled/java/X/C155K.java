package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS221S0000000_31;

/* JADX INFO: renamed from: X.155K, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C155K {
    public final C155H LIZ;
    public final EnumC1654750tA9 LIZIZ;
    public final AbstractC204621154x LIZJ;
    public final C155W LIZLLL;
    public final C01GW LJ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(518));
    public C129G LJFF;

    public final boolean LIZ() {
        String strLIZJ = C1429680nJ8.LIZJ(this.LIZLLL.zt().LIZIZ());
        List<String> list = this.LIZ.LIZIZ;
        if (list == null || !list.contains(strLIZJ)) {
            return this.LIZ.LJIIL.LIZIZ();
        }
        return false;
    }

    public final void LIZIZ(int i) {
        C129G c129g;
        List<MusicModel> data;
        MusicModel musicModel;
        if (i >= 0 && (c129g = this.LJFF) != null && (data = c129g.getData()) != null && (musicModel = (MusicModel) ListProtector.get(data, i)) != null) {
            this.LIZJ.LJJIJIIJI(this.LJFF, musicModel, null);
        }
    }

    public final void LIZJ(int i) {
        if (i < 0) {
            return;
        }
        this.LIZJ.LL.LJIIJ(Unit.LIZ);
        this.LIZ.LJIIL.LIZ(this.LIZIZ.getStringValue());
        this.LIZ.LJIILIIL.LJI(this.LIZJ.LJIL(), this.LIZIZ.getStringValue(), null);
    }

    public C155K(C155H c155h, EnumC1654750tA9 enumC1654750tA9, AbstractC204621154x abstractC204621154x, C155W c155w) {
        this.LIZ = c155h;
        this.LIZIZ = enumC1654750tA9;
        this.LIZJ = abstractC204621154x;
        this.LIZLLL = c155w;
    }
}
