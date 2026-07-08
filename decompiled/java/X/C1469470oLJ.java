package X;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttvideoengine.TTVideoEngine;
import fyo.e;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oLJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1469470oLJ extends C1469760oLm {
    public static boolean LLJI = true;
    public boolean LLILLL;
    public long LLILZ;
    public String LLILZIL;
    public Map<String, Object> LLILZLL;
    public long LLIZ;
    public boolean LLIZLLLIL;
    public InterfaceC1284280jWc LLJ;

    @Override // X.C1469760oLm, X.InterfaceC1472290oPr
    public final void LJIILIIL() {
        this.LLILLL = true;
    }

    @Override // X.C1469760oLm, X.InterfaceC1472290oPr
    public final void LJIJ() {
        this.LLILLL = false;
        LLJI = false;
        this.LLIZLLLIL = false;
    }

    @Override // X.C1469760oLm, X.InterfaceC1472290oPr
    public final void LJJIIZI() {
        this.LLIZLLLIL = false;
    }

    @Override // X.C1469760oLm, X.InterfaceC1472290oPr
    public final void LJJI() {
        C1472150oPd player = this.LLILLJJLI.getPlayer();
        if (player == null) {
            return;
        }
        player.LLJJJJJIL(new InterfaceC1469360oL8() { // from class: X.0oLK
            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LIZIZ(TTVideoEngine tTVideoEngine) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LIZJ(TTVideoEngine tTVideoEngine, int i) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJFF(int i, EnumC2281151EQn enumC2281151EQn) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJI(e eVar) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIIIIZZ(TTVideoEngine tTVideoEngine) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIIIZ(TTVideoEngine tTVideoEngine) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIIJJI(TTVideoEngine tTVideoEngine, int i, int i2) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIIL(TTVideoEngine tTVideoEngine, int i) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIILL(TTVideoEngine tTVideoEngine) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIJ(TTVideoEngine tTVideoEngine, int i) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIJI(TTVideoEngine tTVideoEngine, int i) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIJJ(int i) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIJJLI(int i) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIL(TTVideoEngine tTVideoEngine, int i) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJII(int i, int i2) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJIIJ(int i, int i2) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJIJ(Map map) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJJJJ(TTVideoEngine tTVideoEngine, int i) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJJJJL(TTVideoEngine tTVideoEngine, int i, long j, long j2, Map map) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJJJLL(TTVideoEngine tTVideoEngine) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJJLIIL(int i, int i2, int i3) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJJLZIJ(TTVideoEngine tTVideoEngine, int i, C1467860oIi c1467860oIi) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJL(e eVar, String str) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJLIIIIJ(int i) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJLIIIJJIZ(TTVideoEngine tTVideoEngine) {
            }

            @Override // X.InterfaceC1469360oL8
            public final void LJ(TTVideoEngine tTVideoEngine) {
                if (C1469470oLJ.LLJI) {
                    C1469470oLJ.LLJI = false;
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    C1469470oLJ c1469470oLJ = this.LL;
                    long j = jElapsedRealtime - c1469470oLJ.LLILZ;
                    InterfaceC1284280jWc interfaceC1284280jWc = c1469470oLJ.LLJ;
                    if (interfaceC1284280jWc != null) {
                        interfaceC1284280jWc.getClass();
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("duration", j);
                            C1475000oUE.LIZJ().onEvent("nor_on_render_start_time", jSONObject);
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }
                this.LL.LLIZLLLIL = true;
            }

            @Override // X.InterfaceC1469360oL8
            public final void LJIILIIL(TTVideoEngine tTVideoEngine) {
                if (C1469470oLJ.LLJI) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    C1469470oLJ c1469470oLJ = this.LL;
                    long j = jElapsedRealtime - c1469470oLJ.LLILZ;
                    InterfaceC1284280jWc interfaceC1284280jWc = c1469470oLJ.LLJ;
                    if (interfaceC1284280jWc != null) {
                        interfaceC1284280jWc.getClass();
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("duration", j);
                            C1475000oUE.LIZJ().onEvent("nor_on_prepared_time", jSONObject);
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }
            }
        });
        player.LJIJJ.LIZLLL(new InterfaceC1467780oIa() { // from class: X.0oLG
            @Override // X.InterfaceC1467780oIa
            public final void LJJJIL(C1467470oI5 c1467470oI5) {
                Object obj;
                long jLongValue;
                if (!C1474810oTv.LLIILZL()) {
                    String sourceId = this.LL.LLILLJJLI.getSourceId();
                    int iIntValue = 0;
                    if (this.LL.LLJ != null && c1467470oI5 != null && "firstframe_split".equals(c1467470oI5.LIZ)) {
                        String str = c1467470oI5.LJFF;
                        Object obj2 = c1467470oI5.LIZJ;
                        if (obj2 != null && (obj2 instanceof JSONObject)) {
                            C1284270jWb c1284270jWb = (C1284270jWb) this.LL.LLJ;
                            c1284270jWb.getClass();
                            try {
                                synchronized (c1284270jWb.LIZ) {
                                    try {
                                        if (!TextUtils.isEmpty(str)) {
                                            if (c1284270jWb.LIZJ.size() > 5) {
                                                c1284270jWb.LIZJ.remove(0);
                                            }
                                            c1284270jWb.LIZJ.add(new Pair<>(str, obj2));
                                        }
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        throw th;
                                    }
                                }
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                if (C1475000oUE.LIZIZ() != null && C1475000oUE.LIZIZ().isDebug()) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }
                    }
                    if (this.LL.LLJ != null && c1467470oI5 != null && !TextUtils.isEmpty(sourceId)) {
                        if ("outsyncStartInfos".equals(c1467470oI5.LIZ) || "outsyncEndInfos".equals(c1467470oI5.LIZ)) {
                            C1469470oLJ c1469470oLJ = this.LL;
                            if (!c1469470oLJ.LLIZLLLIL) {
                                return;
                            }
                            if (!TextUtils.equals(c1469470oLJ.LLILZIL, sourceId)) {
                                C1469470oLJ c1469470oLJ2 = this.LL;
                                c1469470oLJ2.LLILZIL = sourceId;
                                c1469470oLJ2.LLILZLL = new HashMap();
                            }
                            if (this.LL.LLILZLL == null) {
                                return;
                            }
                            if ("outsyncStartInfos".equals(c1467470oI5.LIZ)) {
                                Object obj3 = c1467470oI5.LIZJ;
                                if (obj3 != null && (obj3 instanceof Map)) {
                                    this.LL.LLIZ = System.currentTimeMillis();
                                    return;
                                }
                                return;
                            }
                            if (!"outsyncEndInfos".equals(c1467470oI5.LIZ) || (obj = c1467470oI5.LIZJ) == null || !(obj instanceof Map)) {
                                return;
                            }
                            Map map = (Map) obj;
                            if (this.LL.LLILZLL.isEmpty()) {
                                this.LL.LLILZLL.put("min_out_sync_begin_pos", map.get("begin_pos"));
                            }
                            if (this.LL.LLILZLL.get("min_out_sync_end_pos") == null) {
                                this.LL.LLILZLL.put("min_out_sync_end_pos", map.get("end_pos"));
                            }
                            if (this.LL.LLILZLL.get("out_sync_video_origin_fps") == null) {
                                this.LL.LLILZLL.put("out_sync_video_origin_fps", map.get("container_fps"));
                            }
                            if (this.LL.LLILZLL.get("out_sync_video_render_fps") == null) {
                                this.LL.LLILZLL.put("out_sync_video_render_fps", map.get("video_out_fps"));
                            }
                            if (this.LL.LLILZLL.get("out_sync_total_count") instanceof Integer) {
                                iIntValue = ((Integer) this.LL.LLILZLL.get("out_sync_total_count")).intValue();
                            }
                            this.LL.LLILZLL.put("out_sync_total_count", Integer.valueOf(iIntValue + 1));
                            C1469470oLJ c1469470oLJ3 = this.LL;
                            if (c1469470oLJ3.LLIZ >= 0) {
                                if (c1469470oLJ3.LLILZLL.get("out_sync_total_duration") instanceof Long) {
                                    jLongValue = ((Long) this.LL.LLILZLL.get("out_sync_total_duration")).longValue();
                                } else {
                                    jLongValue = 0;
                                }
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                C1469470oLJ c1469470oLJ4 = this.LL;
                                long j = jCurrentTimeMillis - c1469470oLJ4.LLIZ;
                                c1469470oLJ4.LLIZ = -1L;
                                if (j > 0) {
                                    c1469470oLJ4.LLILZLL.put("out_sync_total_duration", Long.valueOf(jLongValue + j));
                                }
                            }
                            if (this.LL.LLILZLL.get("out_sync_max_decode_time") == null && (map.get("decode_time") instanceof Long)) {
                                this.LL.LLILZLL.put("out_sync_max_decode_time", map.get("decode_time"));
                            } else if (this.LL.LLILZLL.get("out_sync_max_decode_time") instanceof Long) {
                                long jLongValue2 = ((Long) this.LL.LLILZLL.get("out_sync_max_decode_time")).longValue();
                                if ((map.get("decode_time") instanceof Long) && ((Long) map.get("decode_time")).longValue() > jLongValue2) {
                                    this.LL.LLILZLL.put("out_sync_max_decode_time", map.get("decode_time"));
                                }
                            }
                            if (this.LL.LLILZLL.get("out_sync_clock_diff") == null && (map.get("clock_diff") instanceof Long)) {
                                this.LL.LLILZLL.put("out_sync_clock_diff", map.get("clock_diff"));
                            } else if (this.LL.LLILZLL.get("out_sync_clock_diff") instanceof Long) {
                                long jLongValue3 = ((Long) this.LL.LLILZLL.get("out_sync_clock_diff")).longValue();
                                if ((map.get("clock_diff") instanceof Long) && ((Long) map.get("clock_diff")).longValue() < jLongValue3) {
                                    this.LL.LLILZLL.put("out_sync_clock_diff", map.get("clock_diff"));
                                }
                            }
                            if (this.LL.LLILZLL.get("out_sync_video_total_drop_count") == null && (map.get("render_drop_cnt") instanceof Integer)) {
                                this.LL.LLILZLL.put("out_sync_video_total_drop_count", map.get("render_drop_cnt"));
                            } else if (this.LL.LLILZLL.get("out_sync_video_total_drop_count") instanceof Integer) {
                                int iIntValue2 = ((Integer) this.LL.LLILZLL.get("out_sync_video_total_drop_count")).intValue();
                                if (map.get("render_drop_cnt") instanceof Integer) {
                                    this.LL.LLILZLL.put("out_sync_video_total_drop_count", Integer.valueOf(iIntValue2 + ((Integer) map.get("render_drop_cnt")).intValue()));
                                }
                            }
                            C1469470oLJ c1469470oLJ5 = this.LL;
                            ((C1284270jWb) c1469470oLJ5.LLJ).LIZIZ(sourceId, c1469470oLJ5.LLILZLL);
                        }
                    }
                }
            }
        });
    }

    public C1469470oLJ(InterfaceC1471960oPK interfaceC1471960oPK) {
        super(interfaceC1471960oPK);
    }

    @Override // X.C1469760oLm, X.InterfaceC1472290oPr
    public final void LJJIIJZLJL(Map<String, Object> map) {
        if (this.LLILLL) {
            LLJI = false;
        }
        if (LLJI) {
            this.LLILZ = SystemClock.elapsedRealtime();
        }
        this.LLILLL = false;
    }
}
