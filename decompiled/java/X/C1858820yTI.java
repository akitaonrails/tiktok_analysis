package X;

import android.view.View;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPlaceholderSource;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS293S0000000_10;

/* JADX INFO: renamed from: X.0yTI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1858820yTI implements InterfaceC689490R2t, InterfaceC1587906Jp {
    public final /* synthetic */ List<TakoVideoItem> LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ TakoPlaceholderSource LLILZ;

    @Override // X.InterfaceC689490R2t
    public final boolean LJIILIIL() {
        return true;
    }

    @Override // X.InterfaceC689490R2t
    public final C1861010yWp LJJLIIIJ() {
        return null;
    }

    @Override // X.InterfaceC689490R2t
    public final boolean LLJZIJLIL() {
        return false;
    }

    @Override // X.InterfaceC689490R2t
    public final Message getMsg() {
        return null;
    }

    @Override // X.InterfaceC689490R2t
    public final Function2<View, InterfaceC665370Q7z, Unit> LJJ() {
        return AFwS293S0000000_10.get$arr$(56);
    }

    @Override // X.InterfaceC689490R2t
    public final C689590R3d LJJIJL() {
        return this.LLILZ.LIZ;
    }

    @Override // X.InterfaceC689490R2t
    public final Integer LLJI() {
        return Integer.valueOf(this.LLILLL + C1859250yTz.LJI());
    }

    @Override // X.InterfaceC689490R2t
    public final String LJIIIIZZ() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC689490R2t
    public final List<TakoVideoItem> getVideoList() {
        return this.LL;
    }

    public C1858820yTI(List<TakoVideoItem> list, String str, int i, TakoPlaceholderSource takoPlaceholderSource) {
        this.LL = list;
        this.LLILLJJLI = str;
        this.LLILLL = i;
        this.LLILZ = takoPlaceholderSource;
    }
}
