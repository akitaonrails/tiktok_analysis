package X;

import android.os.Message;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: renamed from: X.0Okz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C628510Okz {
    public static final C01GW<C0O4P<Object>> LIZLLL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(248));
    public static final C01GW<C0O4P<MusicDetail>> LJ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(247));
    public final Function1<Message, Unit> LIZ;
    public final Function1<MusicDetail, Unit> LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(249));

    /* JADX WARN: Multi-variable type inference failed */
    public C628510Okz(Function1<? super Message, Unit> function1, Function1<? super MusicDetail, Unit> function12) {
        this.LIZ = function1;
        this.LIZIZ = function12;
    }
}
