package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VVR, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VVR {
    public final String LJII;
    public volatile EnumC1271350jBl LIZ = EnumC1271350jBl.IDLE;
    public final AtomicInteger LIZIZ = new AtomicInteger(0);
    public final AtomicLong LIZJ = new AtomicLong(0);
    public final AtomicLong LIZLLL = new AtomicLong(0);
    public volatile int LJ = 0;
    public volatile int LJFF = 0;
    public volatile long LJI = 0;
    public final LinkedList<Long> LJIIIIZZ = new LinkedList<>();
    public volatile float LJIIIZ = 0.0f;

    public final synchronized void LIZ() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LIZIZ.incrementAndGet();
        this.LJI = jCurrentTimeMillis;
        LIZLLL(jCurrentTimeMillis);
    }

    public final synchronized void LIZIZ() {
        this.LIZ = EnumC1271350jBl.IDLE;
        this.LIZIZ.set(0);
        this.LIZJ.set(0L);
        this.LIZLLL.set(0L);
        this.LJ = 0;
        this.LJFF = 0;
        this.LJI = 0L;
        this.LJIIIIZZ.clear();
        this.LJIIIZ = 0.0f;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final JSONObject LIZJ() {
        JSONObject jSONObject = new JSONObject();
        try {
            try {
                jSONObject.put("fps", this.LJIIIZ);
                try {
                    try {
                        try {
                            jSONObject.put("frame_count", this.LIZIZ.get());
                            try {
                                try {
                                    try {
                                        jSONObject.put("position", this.LIZJ.get());
                                        try {
                                            try {
                                                try {
                                                    jSONObject.put("duration", this.LIZLLL.get());
                                                    try {
                                                        try {
                                                            try {
                                                                jSONObject.put("state", this.LIZ.name());
                                                                try {
                                                                    try {
                                                                        jSONObject.put("width", this.LJ);
                                                                        try {
                                                                            try {
                                                                                jSONObject.put("height", this.LJFF);
                                                                                return jSONObject;
                                                                            } catch (JSONException e) {
                                                                                e = e;
                                                                                TryCatchGuardChecker.doCheck(e);
                                                                                return jSONObject;
                                                                            }
                                                                        } catch (JSONException e2) {
                                                                            e = e2;
                                                                        }
                                                                    } catch (JSONException e3) {
                                                                        e = e3;
                                                                    }
                                                                } catch (JSONException e4) {
                                                                    e = e4;
                                                                }
                                                            } catch (JSONException e5) {
                                                                e = e5;
                                                            }
                                                        } catch (JSONException e6) {
                                                            e = e6;
                                                        }
                                                    } catch (JSONException e7) {
                                                        e = e7;
                                                    }
                                                } catch (JSONException e8) {
                                                    e = e8;
                                                }
                                            } catch (JSONException e9) {
                                                e = e9;
                                            }
                                        } catch (JSONException e10) {
                                            e = e10;
                                        }
                                    } catch (JSONException e11) {
                                        e = e11;
                                    }
                                } catch (JSONException e12) {
                                    e = e12;
                                }
                            } catch (JSONException e13) {
                                e = e13;
                            }
                        } catch (JSONException e14) {
                            e = e14;
                        }
                    } catch (JSONException e15) {
                        e = e15;
                    }
                } catch (JSONException e16) {
                    e = e16;
                }
            } catch (JSONException e17) {
                e = e17;
            }
        } catch (JSONException e18) {
            e = e18;
        }
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MediaPlayerInfo{mStreamId='");
        sbLIZ.append(this.LJII);
        sbLIZ.append('\'');
        sbLIZ.append(", mPlayState=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", mVideoFrameCount=");
        sbLIZ.append(this.LIZIZ.get());
        sbLIZ.append(", mCurrentPosition=");
        sbLIZ.append(this.LIZJ.get());
        sbLIZ.append(", mDuration=");
        sbLIZ.append(this.LIZLLL.get());
        sbLIZ.append(", mCurrentFps=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(", mVideoWidth=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", mVideoHeight=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", mLastFrameTimestamp=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", mErrorCode=");
        sbLIZ.append(0);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0VVR(String str) {
        this.LJII = str;
    }

    public final void LIZLLL(long j) {
        this.LJIIIIZZ.addLast(Long.valueOf(j));
        long j2 = j - 1000;
        while (!this.LJIIIIZZ.isEmpty() && this.LJIIIIZZ.peekFirst().longValue() < j2) {
            this.LJIIIIZZ.removeFirst();
        }
        if (!this.LJIIIIZZ.isEmpty()) {
            long jLongValue = j - this.LJIIIIZZ.peekFirst().longValue();
            if (jLongValue > 0) {
                this.LJIIIZ = (this.LJIIIIZZ.size() * 1000.0f) / jLongValue;
            }
        }
    }
}
