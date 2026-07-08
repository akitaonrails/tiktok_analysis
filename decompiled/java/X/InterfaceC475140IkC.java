package X;

import android.content.Context;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.livesdk.model.FeedItem;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0IkC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC475140IkC {
    public static final C473340IhI LIZ = C473340IhI.LIZ;

    long LIZ();

    C11JF LIZIZ(int i, EnumC471720Ieg enumC471720Ieg, Function2 function2);

    boolean LIZJ(C19EG c19eg);

    void LIZLLL(Context context, EnumC471720Ieg enumC471720Ieg, EnumC473310IhF enumC473310IhF, String str, String str2, boolean z);

    void LJ(Observer<Pair<Integer, BaseListResponse<FeedItem, FeedExtra>>> observer);

    void LJFF(Observer<Pair<Integer, BaseListResponse<FeedItem, FeedExtra>>> observer);

    void LJI(String str);

    void LJII();

    BaseListResponse<FeedItem, FeedExtra> LJIIIIZZ();

    boolean LJIIIZ();
}
