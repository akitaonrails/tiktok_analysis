package X;

import android.content.Context;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftMultiplePlayerSetting;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.io.File;

/* JADX INFO: renamed from: X.0fjr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1138730fjr implements InterfaceC1138850fk3 {
    public static final String LIZLLL = LiveGiftMultiplePlayerSetting.INSTANCE.getBatchResourcesCacheDir();
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    @Override // X.InterfaceC1138850fk3
    public final String LIZ() {
        return this.LIZ;
    }

    public C1138730fjr(Context context) {
        this.LIZ = context.getDir("assets", 0).getAbsolutePath();
        this.LIZIZ = context.getDir(LIZLLL, 0).getAbsolutePath();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C786410Ut5.w2(context).getAbsolutePath());
        sbLIZ.append(File.separator);
        sbLIZ.append("gift_assets");
        this.LIZJ = C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1138850fk3
    public final String LIZIZ(C1139230fkf c1139230fkf) {
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        ConcurrentHashSet<Long> concurrentHashSet = C1138790fjx.LIZ;
        if (C1138790fjx.LIZ(c1139230fkf.LIZIZ)) {
            str = this.LIZIZ;
        } else {
            str = this.LIZ;
        }
        sbLIZ.append(str);
        String str2 = File.separator;
        sbLIZ.append(str2);
        sbLIZ.append(c1139230fkf.LJ);
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
