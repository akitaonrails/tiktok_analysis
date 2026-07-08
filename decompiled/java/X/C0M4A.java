package X;

import android.database.Cursor;
import android.database.CursorWindow;
import android.database.sqlite.SQLiteBlobTooBigException;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.tools.draft.db.SQLiteHelper;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS106S0400000_8;
import kotlin.jvm.internal.AwS217S0300000_8;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: renamed from: X.0M4A, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M4A {
    public static final void LJIIIIZZ() {
        if (C0C64.LJIILLIIL().LJIJ(31744, -1, "studio_size_of_cursor_window", true) <= 0) {
            return;
        }
        int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, -1, "studio_size_of_cursor_window", true) * 1024 * 1024;
        try {
            Field declaredField = CursorWindow.class.getDeclaredField("sCursorWindowSize");
            declaredField.setAccessible(true);
            int iIntValue = ((Integer) declaredField.get(null)).intValue();
            if (iIntValue == iLJIJ) {
                return;
            }
            declaredField.set(null, Integer.valueOf(iLJIJ));
            C0MAY c0may = C0MAY.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("DraftDBExt -> Resize cursor window size successful! Resize form :");
            sbLIZ.append(iIntValue);
            sbLIZ.append("to ");
            sbLIZ.append(iLJIJ);
            C201955140j.LIZJ(c0may, C2188811AlT.LIZIZ(sbLIZ));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C0MAY c0may2 = C0MAY.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("DraftDBExt -> refect resize cursor error:");
            sbLIZ2.append(Log.getStackTraceString(e));
            C201955140j.LJII(c0may2, C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public static final int LIZ(Cursor cursor) {
        try {
            return cursor.getCount();
        } catch (SQLiteBlobTooBigException e) {
            TryCatchGuardChecker.doCheck(e);
            LJIIIIZZ();
            return cursor.getCount();
        }
    }

    public static final boolean LIZIZ(Cursor cursor) {
        try {
            return cursor.moveToNext();
        } catch (SQLiteBlobTooBigException e) {
            TryCatchGuardChecker.doCheck(e);
            LJIIIIZZ();
            return cursor.moveToNext();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final AwemeDraft LIZJ(C0M4B c0m4b) {
        C259800zU c259800zU = new C259800zU();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" where video_path = '");
        sbLIZ.append(c0m4b.LIZ.getCreationId());
        sbLIZ.append('\'');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (c0m4b.LIZIZ) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(" and user_id = '");
            sbLIZ2.append(C0CHQ.LIZ().getAccountService().getCurrentUserID());
            sbLIZ2.append('\'');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        if (!c0m4b.LIZJ.isEmpty()) {
            String strLJIIJ = C0M4D.LJIIJ(c0m4b.LIZJ);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(strLIZIZ);
            sbLIZ3.append(" and video_path not in ");
            sbLIZ3.append(strLJIIJ);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        }
        if (c0m4b.LIZLLL) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(strLIZIZ);
            sbLIZ4.append(" and ");
            sbLIZ4.append("((is_published = 0 or is_published is null) and visible_to_user = 1)");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("select * from local_draft");
        sbLIZ5.append(strLIZIZ);
        LJII(C2188811AlT.LIZIZ(sbLIZ5), new AwS587S0100000_8(c259800zU, (C259800zU<MentionDataItem>) 731));
        return (AwemeDraft) c259800zU.element;
    }

    public static final int LIZLLL(C0M4E c0m4e) {
        if (c0m4e.LJIIIIZZ) {
            return ((ArrayList) LJ(c0m4e, AFwS239S0000000_8.get$arr$(360))).size();
        }
        C118300cf c118300cf = new C118300cf();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("select count(video_path) from local_draft");
        sbLIZ.append(C0M4D.LJII(c0m4e, C0M4D.LJI(c0m4e)));
        LJII(C2188811AlT.LIZIZ(sbLIZ), new AwS587S0100000_8(c118300cf, 732));
        return c118300cf.element;
    }

    public static final long LJI(C0M4E c0m4e) {
        C238400w2 c238400w2 = new C238400w2();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("select sum(free_up_space) from local_draft");
        sbLIZ.append(C0M4D.LJII(c0m4e, C0M4D.LJI(c0m4e)));
        LJII(C2188811AlT.LIZIZ(sbLIZ), new AwS587S0100000_8(c238400w2, 733));
        return c238400w2.element;
    }

    public static final List<AwemeDraft> LJ(C0M4E c0m4e, Function1<? super AwemeDraft, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        String strLIZJ = C0M4D.LIZJ(c0m4e);
        C0M4H.LIZ(c0m4e);
        LJII(strLIZJ, new AwS217S0300000_8(c0m4e, (C0M4E) function1, (Function1<? super AwemeDraft, Boolean>) arrayList, (List<AwemeDraft>) 49));
        return arrayList;
    }

    public static final Pair<List<AwemeDraft>, Long> LJFF(C0M4E c0m4e, Function1<? super AwemeDraft, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        C238400w2 c238400w2 = new C238400w2();
        String strLIZJ = C0M4D.LIZJ(c0m4e);
        C0M4H.LIZ(c0m4e);
        LJII(strLIZJ, new AwS106S0400000_8(c0m4e, (C0M4E) function1, (Function1<? super AwemeDraft, Boolean>) c238400w2, (C238400w2) arrayList, (List<AwemeDraft>) 10));
        return new Pair<>(arrayList, Long.valueOf(c238400w2.element));
    }

    public static final <T> void LJII(String str, Function1<? super Cursor, ? extends T> function1) {
        try {
            LJIIIZ(SQLiteHelper.getInstance().getReadableDatabase().rawQuery(str, null), function1);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJIIJ(C0MAY.LIZIZ, "DraftDBExt", e);
            if (e instanceof SQLiteBlobTooBigException) {
                LJIIIIZZ();
            }
        }
    }

    public static final <T> void LJIIIZ(Cursor cursor, Function1<? super Cursor, ? extends T> function1) {
        if (cursor == null) {
            C201955140j.LJIIJ(C0MAY.LIZIZ, "DraftDBExt", new RuntimeException("cursor is null !!!"));
            return;
        }
        if (LIZ(cursor) <= 0) {
            C201955140j.LJIIJ(C0MAY.LIZIZ, "DraftDBExt", new RuntimeException("cursor's count is <= 0 !!!"));
            cursor.close();
            return;
        }
        try {
            try {
                function1.invoke(cursor);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C201955140j.LJIIJ(C0MAY.LIZIZ, "DraftDBExt", e);
                if (e instanceof SQLiteBlobTooBigException) {
                    LJIIIIZZ();
                }
            }
            cursor.close();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            cursor.close();
            throw th;
        }
    }
}
