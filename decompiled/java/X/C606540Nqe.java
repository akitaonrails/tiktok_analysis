package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0Nqe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C606540Nqe extends C606550Nqf {
    public final List<Aweme> LIZJ;
    public final int LIZLLL;

    public C606540Nqe(int i, int i2, Aweme aweme, String str) {
        List<Aweme> listSingletonList;
        super(i2, str);
        if (aweme == null) {
            listSingletonList = C13BV.INSTANCE;
        } else {
            listSingletonList = Collections.singletonList(aweme);
        }
        this.LIZJ = listSingletonList;
        this.LIZLLL = i;
    }

    public C606540Nqe(int i, String str, int i2, int i3, List list) {
        super(i3, str);
        this.LIZJ = list;
        this.LIZLLL = i;
    }
}
