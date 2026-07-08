package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.ss.android.ugc.aweme.im.streak.api.StreakResDebugInfo;
import kotlin.Pair;

/* JADX INFO: renamed from: X.06GZ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public interface C06GZ {
    StreakResDebugInfo LIZ();

    void LIZIZ();

    Pair<Integer, Integer> LIZJ(int i, EnumC1578706Gb enumC1578706Gb, Context context);

    Pair<Integer, String> LIZLLL(int i, boolean z);

    Pair<Integer, Uri> LJ(int i, EnumC1578706Gb enumC1578706Gb);

    Object LJFF(int i, C1578806Gc c1578806Gc);

    Pair<Integer, Drawable> LJI(int i, EnumC1578706Gb enumC1578706Gb);

    String LJII();

    void LJIIJ();

    int isAvailable();

    void onColdStartFinish();
}
