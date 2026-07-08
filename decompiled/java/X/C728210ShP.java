package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ShP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C728210ShP {
    public final C01GW LIZ = C452501pT.LIZIZ(new C728220ShQ());
    public final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public final CopyOnWriteArrayList<C0SPF> LIZJ = new CopyOnWriteArrayList<>(new ArrayList());
    public final ConcurrentHashMap<String, CopyOnWriteArrayList<Function1<List<C0SPF>, Unit>>> LIZLLL = new ConcurrentHashMap<>();
    public final C01GW LJ = C452501pT.LIZIZ(new C728230ShR());
    public final C01GW LJFF = C452501pT.LIZIZ(new C728240ShS());

    public final CopyOnWriteArrayList<Aweme> LIZIZ() {
        return (CopyOnWriteArrayList) this.LIZ.getValue();
    }

    public static boolean LIZLLL(Aweme aweme) {
        boolean z;
        Story story;
        Story story2;
        if (aweme.getStory() != null && (story = aweme.getStory()) != null && !story.isFaked() && (story2 = aweme.getStory()) != null && !story2.isPublishing() && !TextUtils.isEmpty(aweme.getAid())) {
            z = true;
        } else {
            z = false;
        }
        if (C729510SjV.LJJIJIL(aweme) && z) {
            return true;
        }
        return false;
    }

    public final Aweme LIZ(String str) {
        Aweme next;
        Iterator<Aweme> it2 = LIZIZ().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (TextUtils.equals(str, AwemeBizExtKt.getScheduleId(next))) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return next;
    }

    public final C0SPF LIZJ(String str) {
        int i = 0;
        for (C0SPF c0spf : this.LIZJ) {
            int i2 = i + 1;
            if (i >= 0) {
                C0SPF c0spf2 = c0spf;
                if (TextUtils.equals(str, c0spf2.LIZ.creationId)) {
                    return c0spf2;
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return null;
    }
}
