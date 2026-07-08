package X;

import com.ss.android.ugc.aweme.topic.book.detail.videos.BookVideoListAssem;
import com.ss.android.ugc.aweme.topic.movie.detail.videos.MovieVideoListAssem;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0P48, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public class C0P48 extends AbstractC214823195h {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractC214823195h
    public final int LJFF(int i) {
        switch (this.$t) {
            case 0:
                return LJFF$0(this, i);
            case 1:
                return LJFF$1(this, i);
            default:
                return super.LJFF(i);
        }
    }

    public static final int LJFF$0(C0P48 c0p48, int i) {
        List<InterfaceC1891350zJl> listLJII = ((BookVideoListAssem) c0p48.l0).mp().getState().LJII();
        int headerCount = ((BookVideoListAssem) c0p48.l0).mp().getHeaderCount();
        if (i >= headerCount && i < headerCount + ((ArrayList) listLJII).size()) {
            return 1;
        }
        return ((WrapGridLayoutManager) c0p48.l1).LLILLJJLI;
    }

    public static final int LJFF$1(C0P48 c0p48, int i) {
        List<InterfaceC1891350zJl> listLJII = ((MovieVideoListAssem) c0p48.l0).mp().getState().LJII();
        int headerCount = ((MovieVideoListAssem) c0p48.l0).mp().getHeaderCount();
        if (i >= headerCount && i < headerCount + ((ArrayList) listLJII).size()) {
            return 1;
        }
        return ((WrapGridLayoutManager) c0p48.l1).LLILLJJLI;
    }

    public C0P48(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
