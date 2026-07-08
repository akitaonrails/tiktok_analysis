package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.broadcast.api.PreviewCoverEditVisibilityChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import kotlin.jvm.internal.AFwS245S0000000_12;

/* JADX INFO: renamed from: X.0UOw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C771680UOw implements InterfaceC771710UOz {
    public static final C771680UOw LIZ = new C771680UOw();
    public static DataChannel LIZIZ;
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static String LJ;
    public static String LJFF;
    public static String LJI;
    public static String LJII;
    public static String LJIIIIZZ;
    public static boolean LJIIIZ;
    public static String LJIIJ;
    public static String LJIIJJI;
    public static InterfaceC771690UOx LJIIL;
    public static InterfaceC771700UOy LJIILIIL;

    public static void LIZ(LifecycleOwner lifecycleOwner, DataChannel dataChannel) {
        String uri;
        ImageModel cover;
        List urls;
        LIZIZ = dataChannel;
        Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel);
        if (roomLJJLIIIIJ == null || (cover = roomLJJLIIIIJ.getCover()) == null || ((uri = cover.getUri()) == null && ((urls = cover.getUrls()) == null || (uri = (String) C13LP.LJJJLL(urls)) == null))) {
            uri = "";
        }
        LJIIJJI = uri;
        dataChannel.BQ2(lifecycleOwner, PreviewCoverEditVisibilityChannel.class, AFwS245S0000000_12.get$arr$(104));
    }
}
