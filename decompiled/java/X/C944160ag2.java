package X;

import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ag2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C944160ag2 {
    public boolean LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LJ;
    public DataChannel LJFF;
    public long LJI;
    public long LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;
    public SeiAppData LJIIJ;
    public SeiAppData LJIIJJI;
    public boolean LJIILLIIL;
    public final AtomicBoolean LIZLLL = new AtomicBoolean(false);
    public String LJIIL = "";
    public String LJIILIIL = "";
    public String LJIILJJIL = "";
    public int LJIILL = 1;

    public final void LIZLLL() {
        if (this.LIZIZ || ((this.LJIIJ == null && !Intrinsics.LJFF(this.LJIIL, "video")) || !this.LJ)) {
            this.LJIILIIL = LIZIZ(this.LJIIJ);
            return;
        }
        this.LJI = System.currentTimeMillis();
        this.LIZIZ = true;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStallStart , seiBeforeStall = ");
        sbLIZ.append(this.LJIIJ);
        C20441214yg.LIZIZ("LinkMicStallHelperV2", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LIZJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("labelStallEnd stallStartHappended:");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", stallEndHappended:");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", seiAfterResume not null:");
        sbLIZ.append(this.LJIIJJI != null);
        sbLIZ.append(", stallEndCallbackHappend:");
        sbLIZ.append(this.LIZ);
        C20441214yg.LIZIZ("LinkMicStallHelperV2", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LIZIZ && !this.LIZJ && this.LIZ) {
            if (this.LIZLLL.get()) {
                this.LJIILJJIL = "exit_room";
                LIZ(this.LJII);
                return;
            }
            SeiAppData seiAppData = this.LJIIJJI;
            if (seiAppData != null) {
                this.LJIILJJIL = LIZIZ(seiAppData);
                LIZ(this.LJII);
            }
        }
    }

    public final void LJFF() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStallEnd stallStartHappended:");
        sbLIZ.append(this.LIZIZ);
        C20441214yg.LIZIZ("LinkMicStallHelperV2", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LIZIZ) {
            this.LIZ = true;
            if (this.LJII <= 0) {
                this.LJII = System.currentTimeMillis() - this.LJI;
            }
            LIZJ();
        }
    }

    public static String LIZIZ(SeiAppData seiAppData) {
        if (seiAppData != null) {
            if (seiAppData.LJIILL()) {
                if (seiAppData.battleId > 0) {
                    return "manual_pk";
                }
                return "anchor";
            }
            if (seiAppData.LJIILLIIL()) {
                return "audience";
            }
            return "normal";
        }
        return "normal";
    }

    public static long LJI(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return 0L;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("ts")) {
                return JSONObjectProtectorUtils.getLong(jSONObject, "ts");
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(long r19) {
        /*
            Method dump skipped, instruction units count: 691
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C944160ag2.LIZ(long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(X.C945320ahu r11) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C944160ag2.LJ(X.0ahu):void");
    }
}
