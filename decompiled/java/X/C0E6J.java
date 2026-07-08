package X;

import android.content.Intent;
import com.ss.ugc.android.editor.components.base.api.IAlbumService;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0E6J, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E6J {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(308));

    public static List LIZ(C19EG c19eg, Intent intent, Integer num) {
        IAlbumService iAlbumService = (IAlbumService) LIZ.getValue();
        if (iAlbumService != null) {
            return iAlbumService.parseIntentData(c19eg, intent, num);
        }
        return null;
    }

    public static void LIZIZ(C19EG c19eg, C0E48 c0e48, AwS549S0100000_5 awS549S0100000_5) {
        IAlbumService iAlbumService = (IAlbumService) LIZ.getValue();
        if (iAlbumService != null) {
            iAlbumService.startSelectMedia(c19eg, c0e48, 3011, new C0LJQ(1, null, C0E6K.CANVASBG, false, true, 1, false, false, 788), awS549S0100000_5);
        }
    }

    public static void LIZJ(C19EG c19eg, C0E48 c0e48, long j, boolean z, boolean z2, Function0 function0) {
        IAlbumService iAlbumService = (IAlbumService) LIZ.getValue();
        if (iAlbumService != null) {
            iAlbumService.startSelectMedia(c19eg, c0e48, 3008, new C0LJQ(1, Long.valueOf(j), C0E6K.REPLACE, z, false, 0, z2, false, 720), function0);
        }
    }
}
