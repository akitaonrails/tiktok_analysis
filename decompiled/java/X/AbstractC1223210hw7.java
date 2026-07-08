package X;

import Y.ARunnableS119S0100000_19;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.0hw7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public abstract class AbstractC1223210hw7 {
    public static final ExecutorService LIZ = C823050WQl.LJFF();

    public static String LIZJ(boolean z) {
        return z ? "1" : CardStruct.IStatusCode.DEFAULT;
    }

    public abstract String LIZ();

    public abstract Map<String, String> LIZIZ();

    public final void LIZLLL(String str) {
        LIZ.execute(new ARunnableS119S0100000_19(this, str, 153));
    }
}
