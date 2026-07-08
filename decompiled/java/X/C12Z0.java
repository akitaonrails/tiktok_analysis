package X;

import com.ss.android.ugc.aweme.topic.book.info.BookInfoPage;
import com.ss.android.ugc.aweme.topic.movie.info.MovieInfoPage;

/* JADX INFO: renamed from: X.12Z0, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C12Z0 extends AbstractC1542200qEc {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC1537870q7d
    public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
        switch (this.$t) {
            case 0:
                LJLIIIL$0(this, interfaceC1541990qEH);
                break;
            case 1:
                LJLIIIL$1(this, interfaceC1541990qEH);
                break;
            case 2:
                LJLIIIL$2(this, interfaceC1541990qEH);
                break;
            default:
                super.LJLIIIL(interfaceC1541990qEH);
                break;
        }
    }

    public C12Z0(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJLIIIL$0(C12Z0 c12z0, InterfaceC1541990qEH interfaceC1541990qEH) {
        ((BookInfoPage) c12z0.l0).LLJI = interfaceC1541990qEH;
    }

    public static final void LJLIIIL$1(C12Z0 c12z0, InterfaceC1541990qEH interfaceC1541990qEH) {
        ((MovieInfoPage) c12z0.l0).LLJI = interfaceC1541990qEH;
    }

    public static final void LJLIIIL$2(C12Z0 c12z0, InterfaceC1541990qEH interfaceC1541990qEH) {
        C197039127h c197039127h = ((C11VM) c12z0.l0).LLIZ;
        if (c197039127h == null) {
            c197039127h = null;
        }
        c197039127h.setEnabled(true);
    }
}
