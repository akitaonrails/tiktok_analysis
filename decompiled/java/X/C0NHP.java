package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* JADX INFO: renamed from: X.0NHP, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NHP extends C591330NHf {
    public final List<Aweme> LIZIZ;
    public final String LIZJ;
    public final Integer LIZLLL;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C0NHP(List<? extends Aweme> list, String str, Integer num) {
        boolean z;
        if (list != 0 && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        super(true ^ z);
        this.LIZIZ = list;
        this.LIZJ = str;
        this.LIZLLL = num;
    }
}
