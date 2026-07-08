package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.1CkB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public abstract class AbstractC2238971CkB {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZLLL;
    public final long LJ;
    public long LJFF;
    public long LJI;
    public long LJII;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIILIIL;
    public final boolean LIZJ = true;
    public final ConcurrentHashMap<String, Long> LJIIIIZZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, String> LJIIIZ = new ConcurrentHashMap<>();
    public String LJIIL = "";

    public String LIZLLL(boolean z) {
        return "";
    }

    public final void LIZIZ() {
        if (this.LJIILIIL) {
            return;
        }
        if (this.LJFF > 0) {
            long j = this.LJI;
            if (j > 0) {
                long j2 = this.LJII;
                if (j2 > 0) {
                    this.LJIILIIL = true;
                    long j3 = j2 - j;
                    if (j3 < 0) {
                        j3 = 0;
                    }
                    boolean z = j3 > this.LJ;
                    this.LJIIJJI = z;
                    this.LJIIL = LIZLLL(z);
                    Pair[] pairArr = new Pair[6];
                    pairArr[0] = new Pair("room_id", this.LIZ);
                    pairArr[1] = new Pair("anchor_id", this.LIZIZ);
                    pairArr[2] = new Pair("is_in_room", this.LIZJ ? "1" : CardStruct.IStatusCode.DEFAULT);
                    pairArr[3] = new Pair("biz_name", this.LIZLLL);
                    pairArr[4] = new Pair("is_flick", this.LJIIJJI ? "1" : CardStruct.IStatusCode.DEFAULT);
                    long j4 = this.LJI - this.LJFF;
                    pairArr[5] = new Pair("first_frame_duration", String.valueOf(j4 >= 0 ? j4 : 0L));
                    Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
                    LIZ(mapLJIIJ);
                    if (this.LJIIL.length() > 0) {
                        mapLJIIJ.put("flick_reason", this.LJIIL);
                    }
                    mapLJIIJ.putAll(this.LJIIIZ);
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_guest_audience_flick");
                    c474500IjALIZ.LJJIIZI(mapLJIIJ);
                    c474500IjALIZ.LIZ();
                }
            }
        }
    }

    public void LIZ(Map<String, String> map) {
        long jLongValue;
        long jLongValue2;
        String strValueOf;
        Long l = this.LJIIIIZZ.get("sei");
        long j = 0;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        Long l2 = this.LJIIIIZZ.get("room_enter");
        if (l2 != null) {
            jLongValue2 = l2.longValue();
        } else {
            jLongValue2 = 0;
        }
        String strValueOf2 = "-1";
        if (jLongValue <= 0) {
            strValueOf = "-1";
        } else {
            long j2 = jLongValue - this.LJFF;
            if (j2 < 0) {
                j2 = 0;
            }
            strValueOf = String.valueOf(j2);
        }
        map.put("sei_receive_duration", strValueOf);
        if (jLongValue2 > 0) {
            long j3 = jLongValue2 - this.LJFF;
            if (j3 >= 0) {
                j = j3;
            }
            strValueOf2 = String.valueOf(j);
        }
        map.put("room_enter_duration", strValueOf2);
    }

    public final void LIZJ(long j, String str) {
        if (this.LJFF > 0 && !this.LJIILIIL && !this.LJIIIIZZ.containsKey(str)) {
            this.LJIIIIZZ.put(str, Long.valueOf(j));
        }
    }

    public AbstractC2238971CkB(long j, String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZLLL = str3;
        this.LJ = j;
    }
}
