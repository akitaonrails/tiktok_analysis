package X;

import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.model.utils.adapter.BooleanTypeAdapter;
import com.bytedance.android.livesdk.model.utils.adapter.FeedItemTypeAdapter;
import com.bytedance.android.livesdk.model.utils.adapter.RoomTypeAdapter;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.google.gson.Gson;
import com.google.gson.c;
import com.google.gson.e;

/* JADX INFO: renamed from: X.12Ol, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19748512Ol {
    public static final e LIZ;
    public static final Gson LIZIZ;
    public static final Gson LIZJ;

    static {
        e eVar = new e();
        eVar.LIZJ = c.LOWER_CASE_WITH_UNDERSCORES;
        eVar.LIZJ(new RoomTypeAdapter(), Room.class);
        eVar.LIZJ(new FeedItemTypeAdapter(), FeedItem.class);
        eVar.LIZJ(new BooleanTypeAdapter(), Boolean.class);
        eVar.LIZJ(new BooleanTypeAdapter(), Boolean.TYPE);
        LIZ = eVar;
        LIZIZ = eVar.LIZ();
        LIZJ = new Gson();
    }
}
