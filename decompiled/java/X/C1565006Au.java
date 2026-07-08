package X;

import android.util.LruCache;
import com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLocalExtHelper;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.06Au, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1565006Au extends C09AY implements Function0<LruCache<String, StreakLocalExtHelper.StreakInlineMsgHolder>> {
    public C1565006Au() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final LruCache<String, StreakLocalExtHelper.StreakInlineMsgHolder> invoke() {
        if (C1565106Av.LIZJ) {
            return new LruCache<>(200);
        }
        return null;
    }
}
