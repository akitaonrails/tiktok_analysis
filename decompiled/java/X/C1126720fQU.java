package X;

import android.util.LongSparseArray;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fQU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1126720fQU {
    public static final /* synthetic */ int LJ = 0;
    public long LIZ;
    public long LIZIZ;
    public final LongSparseArray<Long> LIZJ = new LongSparseArray<>();
    public int LIZLLL;

    public final void LIZLLL() {
        if (this.LIZ == 0) {
            return;
        }
        long jLIZ = C158B.LIZ() - this.LIZIZ;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("gift_dynamic_preview_success");
        c474500IjALIZ.LJJII(Long.valueOf(jLIZ), "zip_show_duration");
        c474500IjALIZ.LJJII(Long.valueOf(this.LIZ), "gift_id");
        c474500IjALIZ.LJJII(C1130430fWT.LIZ.LIZ ? "call" : "click", "show_type");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
        this.LIZ = 0L;
    }

    public final void LIZ(long j) {
        this.LIZJ.put(j, Long.valueOf(C158B.LIZ()));
        this.LIZ = j;
        this.LIZIZ = C158B.LIZ();
        this.LIZLLL = 0;
    }

    public static void LIZIZ(long j, String str) {
        String str2;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("gift_dynamic_preview_fail");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(Long.valueOf(j), "gift_id");
        if (C1130430fWT.LIZ.LIZ) {
            str2 = "call";
        } else {
            str2 = "click";
        }
        c474500IjALIZ.LJJII(str2, "show_type");
        c474500IjALIZ.LJJII(str, "error_code");
        c474500IjALIZ.LIZ();
    }

    public final void LIZJ(long j, Boolean bool) {
        String str;
        String str2;
        long jLIZ = C158B.LIZ();
        long jLongValue = jLIZ - this.LIZJ.get(j, Long.valueOf(jLIZ)).longValue();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("gift_zip_load_time");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(Long.valueOf(j), "gift_id");
        c474500IjALIZ.LJJII(Long.valueOf(jLongValue), "zip_load_time");
        if (C1130430fWT.LIZ.LIZ) {
            str = "call";
        } else {
            str = "click";
        }
        c474500IjALIZ.LJJII(str, "show_type");
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            str2 = "1";
        } else if (Intrinsics.LJFF(bool, Boolean.FALSE)) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        } else if (bool == null) {
            str2 = "-1";
        } else {
            throw new C1954807lC();
        }
        c474500IjALIZ.LJJII(str2, "is_zip_local");
        c474500IjALIZ.LIZ();
    }
}
