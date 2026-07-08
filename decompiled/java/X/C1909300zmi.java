package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0zmi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1909300zmi {
    public static InterfaceC1909280zmg LJIILIIL;
    public final Keva LIZ;
    public final String LIZIZ;
    public long LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public String LJFF;
    public String LJI;
    public long LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;
    public int LJIIJ;
    public long LJIIJJI;
    public final String LJIIL;

    public final long LIZ() {
        long j = this.LJIIJJI;
        if (j != 0) {
            return j;
        }
        Keva keva = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append("key_today_play_time");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.LJIIL);
        sbLIZ2.append("__0");
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(keva.getString(strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2)), new String[]{"__"}, 0, 6);
        if (Intrinsics.LJFF(ListProtector.get(listLJJLIIIJILLIZJL, 0), this.LJIIL)) {
            long j2 = CastLongProtector.parseLong((String) ListProtector.get(listLJJLIIIJILLIZJL, 1));
            this.LJIIJJI = j2;
            return j2;
        }
        Keva keva2 = this.LIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(this.LIZIZ);
        sbLIZ3.append("key_today_play_time");
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(this.LJIIL);
        sbLIZ4.append("__0");
        keva2.storeString(strLIZIZ2, C2188811AlT.LIZIZ(sbLIZ4));
        this.LJIIJJI = 0L;
        return 0L;
    }

    public C1909300zmi(EnumC1909250zmd enumC1909250zmd) {
        Keva repo = Keva.getRepo("praise_keva");
        this.LIZ = repo;
        String string = enumC1909250zmd.toString();
        this.LIZIZ = string;
        this.LJFF = "";
        this.LJI = "";
        this.LJIIL = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date());
        LIZIZ(repo.getLong("key_app_first_open_time", 0L));
        long j = repo.getLong("key_app_last_open_time", 0L);
        this.LJIIIIZZ = j;
        repo.storeLong("key_app_last_open_time", j);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(string);
        sbLIZ.append("key_last_dialog_show_time");
        long j2 = repo.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L);
        this.LIZJ = j2;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(string);
        sbLIZ2.append("key_last_dialog_show_time");
        repo.storeLong(C2188811AlT.LIZIZ(sbLIZ2), j2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(string);
        sbLIZ3.append("key_is_clicked_feedback");
        boolean z = repo.getBoolean(C2188811AlT.LIZIZ(sbLIZ3), false);
        this.LIZLLL = z;
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(string);
        sbLIZ4.append("key_is_clicked_feedback");
        repo.storeBoolean(C2188811AlT.LIZIZ(sbLIZ4), z);
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append(string);
        sbLIZ5.append("key_is_clicked_submit");
        boolean z2 = repo.getBoolean(C2188811AlT.LIZIZ(sbLIZ5), false);
        this.LJ = z2;
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append(string);
        sbLIZ6.append("key_is_clicked_submit");
        repo.storeBoolean(C2188811AlT.LIZIZ(sbLIZ6), z2);
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append(string);
        sbLIZ7.append("key_last_show_version");
        String string2 = repo.getString(C2188811AlT.LIZIZ(sbLIZ7), "");
        this.LJFF = string2;
        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
        sbLIZ8.append(string);
        sbLIZ8.append("key_last_show_version");
        repo.storeString(C2188811AlT.LIZIZ(sbLIZ8), string2);
        StringBuilder sbLIZ9 = C2188811AlT.LIZ();
        sbLIZ9.append(string);
        sbLIZ9.append("key_last_try_show_time");
        long j3 = repo.getLong(C2188811AlT.LIZIZ(sbLIZ9), 0L);
        this.LJIIIZ = j3;
        StringBuilder sbLIZ10 = C2188811AlT.LIZ();
        sbLIZ10.append(string);
        sbLIZ10.append("key_last_try_show_time");
        repo.storeLong(C2188811AlT.LIZIZ(sbLIZ10), j3);
        StringBuilder sbLIZ11 = C2188811AlT.LIZ();
        sbLIZ11.append(string);
        sbLIZ11.append("key_last_2_try_show_time");
        long j4 = repo.getLong(C2188811AlT.LIZIZ(sbLIZ11), 0L);
        StringBuilder sbLIZ12 = C2188811AlT.LIZ();
        sbLIZ12.append(string);
        sbLIZ12.append("key_last_2_try_show_time");
        repo.storeLong(C2188811AlT.LIZIZ(sbLIZ12), j4);
        repo.storeBoolean("key_debug_open", repo.getBoolean("key_debug_open", false));
        int i = repo.getInt("key_popup_show_times", 0);
        this.LJIIJ = i;
        repo.storeInt("key_popup_show_times", i);
    }

    public final void LIZIZ(long j) {
        if (this.LJII == 0) {
            this.LJII = j;
            this.LIZ.storeLong("key_app_first_open_time", j);
        }
    }
}
