package X;

import com.ss.android.ugc.aweme.search.pages.result.topsearch.rs.core.model.RelatedWord;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: X.0H47, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H47 implements Serializable {
    public static final int $stable = 8;
    public final List<RelatedWord> relatedWords;
    public final C0HBA rsMobModel;

    public C0H47() {
        this(null, null, 3, null);
    }

    public int hashCode() {
        int iHashCode = this.relatedWords.hashCode() * 31;
        C0HBA c0hba = this.rsMobModel;
        return iHashCode + (c0hba == null ? 0 : c0hba.hashCode());
    }

    public C0H47(List<RelatedWord> list, C0HBA c0hba) {
        this.relatedWords = list;
        this.rsMobModel = c0hba;
    }

    public C0H47(List list, C0HBA c0hba, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? null : c0hba);
    }
}
