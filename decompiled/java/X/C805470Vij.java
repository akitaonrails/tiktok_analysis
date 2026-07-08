package X;

import android.database.sqlite.SQLiteDatabase;
import com.ss.android.ugc.aweme.im.contacts.impl.data.base.IMContactDatabase;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Vij, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C805470Vij extends C09AY implements Function0<Unit> {
    public C805470Vij() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        IMContactDatabase.LL.getClass();
        C0I0B.LJFF.LIZJ();
        SQLiteDatabase.deleteDatabase(C894660Z7w.LIZ().getDatabasePath(C0VQO.LIZIZ(true)));
        return Unit.LIZ;
    }
}
