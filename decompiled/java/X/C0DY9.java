package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0DY9, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DY9 extends AbstractC1588960rS2<Aweme, C0DYB> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public final LifecycleOwner LL;
    public final C0DYB LLILLJJLI;
    public volatile C09U0 LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0DY9.class, "dispatchers", "getDispatchers()Lcom/ss/android/ugc/aweme/utils/dispatchers/TTDispatchers;", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.AbstractC666100QAu
    public final boolean checkParams(Object... objArr) {
        return true;
    }

    @Override // X.AbstractC1255880imo
    public final void refreshList(Object... objArr) {
    }

    @Override // X.AbstractC1255880imo
    public final List<Aweme> getItems() {
        return new ArrayList(this.LLILLJJLI.getAwemeList());
    }

    @Override // X.AbstractC1255880imo
    public final boolean isHasMore() {
        return this.LLILLJJLI.getHasMore();
    }

    @Override // X.AbstractC1255880imo
    public final void loadMoreList(Object... objArr) {
        LifecycleOwner lifecycleOwner = this.LL;
        C09U0 c09u0 = this.LLILLL;
        if (c09u0 == null) {
            synchronized (this) {
                c09u0 = this.LLILLL;
                if (c09u0 == null) {
                    c09u0 = (C09U0) C1807670x8n.p();
                    this.LLILLL = c09u0;
                }
            }
        }
        C948503nH.LJ(lifecycleOwner, c09u0.LIZJ, new C0DY8(this, null));
    }

    public C0DY9(Fragment fragment, C0DYA c0dya) {
        this.LL = fragment;
        this.LLILLJJLI = c0dya;
    }
}
