package X;

import com.bytedance.android.livesdk.broadcast.PreviewBlockInfoChannel;
import com.bytedance.android.livesdk.dataChannel.BlockVisibilityChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0UOK, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UOK {
    public final long LIZ;
    public final int LIZIZ;
    public final C771740UPc LIZJ;
    public final String LIZLLL;

    /* JADX WARN: Multi-variable type inference failed */
    public C0UOK() {
        this(0L, 0, null, 0 == true ? 1 : 0, 31);
    }

    public final void LIZ(DataChannel dataChannel) {
        if (dataChannel != null) {
            dataChannel.zW(PreviewBlockInfoChannel.class, this);
        }
        C770220UJg c770220UJg = C770220UJg.LIZ;
        C770220UJg.LIZLLL(C13LE.LIZ(BlockVisibilityChannel.class));
    }

    public C0UOK(long j, long j2, int i, C771740UPc c771740UPc) {
        String strLJJIFFI;
        this.LIZ = j2;
        this.LIZIZ = i;
        this.LIZJ = c771740UPc;
        if (j == -1) {
            strLJJIFFI = C497740JfY.LJIJI(2131842874);
        } else {
            Date date = new Date(j * ((long) LSPassThroughRecordSizeConfig.DEFAULT));
            String strLJIJI = C497740JfY.LJIJI(2131842875);
            Locale locale = Locale.ENGLISH;
            strLJJIFFI = u.LJJIFFI(u.LJJIFFI(strLJIJI, "{0}", new SimpleDateFormat("HH:mm", locale).format(date), false), "{1}", new SimpleDateFormat("dd-MM-yyyy", locale).format(date), false);
        }
        this.LIZLLL = strLJJIFFI == null ? "" : strLJJIFFI;
    }

    public /* synthetic */ C0UOK(long j, int i, String str, C771740UPc c771740UPc, int i2) {
        this((i2 & 1) != 0 ? 0L : j, 0L, (i2 & 4) != 0 ? 2 : i, (i2 & 16) != 0 ? null : c771740UPc);
    }
}
