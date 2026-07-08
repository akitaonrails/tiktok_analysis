package X;

import Y.AObjectS246S0100000_25;
import Y.AfS194S0100000_25;
import Y.AfS5S0100100_15;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.beauty.config.AddETBeautyFFDExperimentConfig;
import com.ss.android.ugc.effectmanager.common.utils.JsonExtKt;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import lnn.q;
import mn3.e0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0sYj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1631550sYj extends C1663100tNc {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIIIL;
    public static final int LLLIIIL;
    public final Long LLJZ;
    public final InterfaceC1731706qJ LLJZIJLIL;
    public final InterfaceC1731706qJ LLL;
    public final InterfaceC1731706qJ LLLF;
    public final InterfaceC1731706qJ LLLFF;
    public final C11PQ<Boolean> LLLFFI;
    public final C11PQ<Long> LLLFZ;
    public Pair<Long, Boolean> LLLI;
    public Long LLLII;
    public final C11NJ LLLIIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1631550sYj.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1631550sYj.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1631550sYj.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1631550sYj.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        c09r3.getClass();
        LLLIIIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
        LLLIIIL = 8;
    }

    private final void H4() {
        C385670FAf<InterfaceC1644760su2> c385670FAfNn0;
        C11NZ<Pair<Effect, C991780buq>> c11nzWJ0;
        Long l = this.LLJZ;
        if (l != null) {
            l.longValue();
            getCameraApiComponent().xF1().LIZ(this, new AObjectS246S0100000_25(this, 141));
            je().LJ().observe(this, new AObjectS246S0100000_25(this, 142));
            q stickerApiComponent = getStickerApiComponent();
            if (stickerApiComponent != null && (c11nzWJ0 = stickerApiComponent.WJ0()) != null) {
                c11nzWJ0.LJJLJLI(new AfS194S0100000_25(this, 7));
            }
            if (this.LLJJIJI.LIZLLL.invoke().booleanValue()) {
                if (C1651150t4L.LIZ().LIZ()) {
                    this.LLJJJJLIIL.LIZ(this, new AObjectS246S0100000_25(this, 143));
                    o4();
                    return;
                }
                return;
            }
            InterfaceC1647420syK recordAdapterApi = getRecordAdapterApi();
            if (recordAdapterApi != null && (c385670FAfNn0 = recordAdapterApi.nn0()) != null) {
                c385670FAfNn0.LIZ(this, new AObjectS246S0100000_25(this, 144));
            }
            z4();
        }
    }

    private final InterfaceC1647420syK getRecordAdapterApi() {
        return (InterfaceC1647420syK) this.LLJZIJLIL.getValue(this, LLLIIIIL[0]);
    }

    private final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLLFF.getValue(this, LLLIIIIL[3]);
    }

    private final q getStickerApiComponent() {
        return (q) this.LLL.getValue(this, LLLIIIIL[1]);
    }

    private final void o4() {
        Long l = this.LLJZ;
        if (l != null) {
            long jLongValue = l.longValue();
            C11PQ<Long> c11pq = this.LLLFZ;
            c11pq.getClass();
            C19475711Hn c19475711Hn = new C19475711Hn(c11pq);
            C11PQ<Boolean> c11pq2 = this.LLLFFI;
            c11pq2.getClass();
            C371780Ehs.LIZ(this.LLLIIII, new C11IE(C948810anX.LIZ(c19475711Hn, new C19475711Hn(c11pq2)).LJJIL(new InterfaceC19483011Ki() { // from class: X.0a02
                @Override // X.InterfaceC19483011Ki
                public final boolean test(Object obj) {
                    ((Pair) obj).getFirst();
                    return !((Boolean) r2.getSecond()).booleanValue();
                }
            })).LJIILLIIL(new AfS5S0100100_15(jLongValue, this, 3)));
        }
    }

    private final void z4() {
        Long l = this.LLJZ;
        if (l != null) {
            long jLongValue = l.longValue();
            C11PQ<Long> c11pq = this.LLLFZ;
            c11pq.getClass();
            C19475711Hn c19475711Hn = new C19475711Hn(c11pq);
            C11PQ<Boolean> c11pq2 = this.LLLFFI;
            c11pq2.getClass();
            C371780Ehs.LIZ(this.LLLIIII, new C11IE(C11NZ.LJIIJJI(c19475711Hn, new C19475711Hn(c11pq2), C576730Mjf.LJIILIIL(je().mf(), this), C953000auI.LIZ).LJJIL(new InterfaceC19483011Ki() { // from class: X.0a01
                @Override // X.InterfaceC19483011Ki
                public final boolean test(Object obj) {
                    C443120HZe c443120HZe = (C443120HZe) obj;
                    c443120HZe.getFirst();
                    Boolean bool = (Boolean) c443120HZe.getSecond();
                    Integer num = (Integer) c443120HZe.getThird();
                    if (!bool.booleanValue() && num != null && num.intValue() == 0) {
                        return true;
                    }
                    return false;
                }
            })).LJIILLIIL(new AfS5S0100100_15(jLongValue, this, 4)));
        }
    }

    public final e0 getCameraApiComponent() {
        return (e0) this.LLLF.getValue(this, LLLIIIIL[2]);
    }

    @Override // X.C1663100tNc, com.bytedance.creativex.recorder.beauty.q, X.AbstractC2255721DQs
    public void onCreate() {
        InterfaceC1647420syK recordAdapterApi;
        InterfaceC1647420syK recordAdapterApi2;
        C385670FAf<InterfaceC1648020szI> c385670FAfVK0;
        super.onCreate();
        if (this.LLJJIJI.LJJ && (recordAdapterApi2 = getRecordAdapterApi()) != null && (c385670FAfVK0 = recordAdapterApi2.VK0()) != null) {
            c385670FAfVK0.LIZ(this, new AObjectS246S0100000_25(this, 140));
        }
        if (this.LLJJIJI.LJIILLIIL && (recordAdapterApi = getRecordAdapterApi()) != null) {
            recordAdapterApi.oe2(this);
        }
        if (((AddETBeautyFFDExperimentConfig) C1631560sYk.LIZIZ.getValue()).enable && C533930Kwp.LIZLLL("android.permission.CAMERA")) {
            H4();
        }
    }

    @Override // com.bytedance.creativex.recorder.beauty.q, X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        this.LLLIIII.LJ();
    }

    private final void e4(C0LAB c0lab, String str) {
        try {
            for (Map.Entry<String, Object> entry : JsonExtKt.toMap(new JSONObject(str)).entrySet()) {
                c0lab.LIZLLL(entry.getValue(), entry.getKey());
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void F4(long j, Long l, Long l2, long j2) {
        if (l != null) {
            l.longValue();
            if (l2 != null) {
                l2.longValue();
                C0LAB c0lab = new C0LAB();
                c0lab.LIZIZ(j2 - j, "duration");
                c0lab.LIZIZ(j2 - l.longValue(), "set_compose_to_beauty_first_frame");
                c0lab.LIZIZ(j2 - l2.longValue(), "camera_first_frame_to_beauty_first_frame");
                c0lab.LIZIZ(l.longValue() - j, "set_compose_time");
                c0lab.LJ("shoot_way", getShortVideoContext().shootWay);
                c0lab.LJ("enter_from", getShortVideoContext().enterFrom);
                String str = getShortVideoContext().creativeModel.shootEnterFrom;
                if (str == null) {
                    str = getShortVideoContext().enterFrom;
                }
                c0lab.LJ("shoot_enter_from", str);
                String strLJIIJ = getCameraApiComponent().u92().LIZIZ().LJIIJ(4);
                if (strLJIIJ == null) {
                    strLJIIJ = "";
                }
                e4(c0lab, strLJIIJ);
                C1449260noi.LJ("tool_performance_beauty_record_first_frame", c0lab.LIZ);
            }
        }
    }

    public C1631550sYj(C1DRG c1drg, Function0<? extends InterfaceC1635390sev> function0, Function1<? super Boolean, String> function1, Long l, Function1<? super C12IL, Unit> function12) {
        super(c1drg, function0, function1, function12);
        this.LLJZ = l;
        this.LLJZIJLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1647420syK.class, null);
        this.LLL = C1664770tQJ.LIZIZ(getDiContainer(), q.class, null);
        this.LLLF = C1664770tQJ.LIZ(getDiContainer(), e0.class, null);
        this.LLLFF = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
        this.LLLFFI = C11PQ.LJLLLLLL(Boolean.FALSE);
        this.LLLFZ = new C11PQ<>();
        this.LLLIIII = new C11NJ();
    }
}
