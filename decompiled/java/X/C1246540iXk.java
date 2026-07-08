package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import java.util.Objects;

/* JADX INFO: renamed from: X.0iXk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1246540iXk extends MusNotice {
    @Override // com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.type), Boolean.valueOf(this.isPriority));
    }

    public C1246540iXk(boolean z) {
        super(true, false);
        this.type = 999;
        this.isPriority = z;
        this.nid = String.valueOf(hashCode());
    }

    @Override // com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice, com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1246550iXl)) {
            return false;
        }
        BaseNotice baseNotice = (BaseNotice) obj;
        if (this.type == baseNotice.type && this.isPriority == baseNotice.isPriority) {
            return true;
        }
        return false;
    }
}
