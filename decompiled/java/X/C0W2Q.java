package X;

import android.content.Context;
import com.ss.android.ugc.aweme.relation.storage.db.RelationDatabase;
import com.ss.android.ugc.aweme.relation.storage.experiment.RelationStorageConfig;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.0W2Q, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W2Q {
    public static final C0W2S LJFF = new Object() { // from class: X.0W2S
    };
    public static volatile C0W2Q LJI;
    public final String LIZ;
    public final C0W2U LIZIZ;
    public final RelationStorageConfig LIZJ;
    public final RelationDatabase LIZLLL;
    public final C01GW LJ;

    public final boolean LIZ() {
        C0W2U c0w2u = this.LIZIZ;
        Long l = this.LIZJ.maxValidityPeriod;
        long jLIZ = c0w2u.LIZ();
        return (jLIZ == -1 || l == null || System.currentTimeMillis() - jLIZ > l.longValue()) ? false : true;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StorageContext(uid:");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", status:");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", config: ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0W2Q(String str) {
        C0W2U c0w2u = new C0W2U(str);
        RelationStorageConfig relationStorageConfigLIZIZ = C816930W2x.LIZIZ();
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("relation_database_");
        sbLIZ.append(str);
        C796500VMi c796500VMiLIZ = C0OGG.LIZ(contextLIZ, RelationDatabase.class, C2188811AlT.LIZIZ(sbLIZ));
        c796500VMiLIZ.LJIIIIZZ = EnumC611420NyW.WRITE_AHEAD_LOGGING;
        RelationDatabase relationDatabase = (RelationDatabase) c796500VMiLIZ.LIZIZ();
        this.LIZ = str;
        this.LIZIZ = c0w2u;
        this.LIZJ = relationStorageConfigLIZIZ;
        this.LIZLLL = relationDatabase;
        this.LJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1436));
    }
}
