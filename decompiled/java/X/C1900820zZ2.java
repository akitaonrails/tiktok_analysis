package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.Comparator;

/* JADX INFO: renamed from: X.0zZ2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1900820zZ2<T> implements Comparator {
    public static final C1900820zZ2<T> LL = new C1900820zZ2<>();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        BaseNotice baseNotice = (BaseNotice) obj;
        BaseNotice baseNotice2 = (BaseNotice) obj2;
        int i = baseNotice2.priority;
        int i2 = baseNotice.priority;
        int i3 = i - i2;
        if (i2 == i) {
            if (baseNotice2.createTime - baseNotice.createTime <= 0) {
                return -1;
            }
        } else if (i3 <= 0) {
            if (i3 < 0) {
                return -1;
            }
            return 0;
        }
        return 1;
    }
}
