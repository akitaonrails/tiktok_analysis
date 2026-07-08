package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.performance.MediaUploadPerformanceMonitor;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1DUh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2256651DUh implements InterfaceC1435230nS5 {
    public final String LIZIZ;
    public Long LIZJ;
    public Long LIZLLL;
    public final ConcurrentHashMap<String, String> LJ = new ConcurrentHashMap<>();

    @Override // X.InterfaceC1435230nS5
    public final void LIZ() {
        Long l = this.LIZLLL;
        if (l != null) {
            this.LJ.put("total_time_cost", String.valueOf(System.currentTimeMillis() - l.longValue()));
        }
        Long l2 = this.LIZJ;
        if (l2 != null) {
            this.LJ.put("total_time_cost_include_wait_time", String.valueOf(System.currentTimeMillis() - l2.longValue()));
        }
        if ((this.LJ.containsKey("is_prepublish") && Intrinsics.LJFF(this.LJ.get("is_prepublish"), "1")) && C294750Bgv.LIZIZ) {
            ConcurrentHashMap<String, String> concurrentHashMap = this.LJ;
            String str = concurrentHashMap.get("result");
            if (str == null) {
                str = "1";
            }
            concurrentHashMap.put("result", str);
            ConcurrentHashMap<String, String> concurrentHashMap2 = this.LJ;
            String str2 = concurrentHashMap2.get("upload_time_cost");
            if (str2 == null) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            concurrentHashMap2.put("upload_time_cost", str2);
            ConcurrentHashMap<String, String> concurrentHashMap3 = this.LJ;
            String state = concurrentHashMap3.get("fail_state");
            if (state == null) {
                state = EnumC1435490nSV.NONE.getState();
            }
            concurrentHashMap3.put("fail_state", state);
        }
        C0I0B.LJFF.LIZIZ();
        boolean z = !Intrinsics.LJFF(this.LJ.get("result"), CardStruct.IStatusCode.DEFAULT);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dm_camera_upload ");
        sbLIZ.append(this.LJ);
        C21682519tP.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), z);
        C20684815ws.LJIILLIIL("dm_camera_upload", this.LJ);
        if (this.LJ.containsKey("is_prepublish") && Intrinsics.LJFF(this.LJ.get("is_prepublish"), "1")) {
            return;
        }
        MediaUploadPerformanceMonitor.LIZJ.remove(this.LIZIZ);
    }

    @Override // X.InterfaceC1435230nS5
    public final InterfaceC1435230nS5 LJIIL() {
        this.LIZLLL = Long.valueOf(System.currentTimeMillis());
        return this;
    }

    @Override // X.InterfaceC1435230nS5
    public final InterfaceC1435230nS5 start() {
        this.LIZJ = Long.valueOf(System.currentTimeMillis());
        return this;
    }

    public C2256651DUh(String str) {
        this.LIZIZ = str;
    }

    @Override // X.InterfaceC1435230nS5
    public final InterfaceC1435230nS5 LIZIZ(C18ZL c18zl) {
        this.LJ.put(Scene.SCENE_SERVICE, c18zl.getScene());
        return this;
    }

    @Override // X.InterfaceC1435230nS5
    public final InterfaceC1435230nS5 LIZJ(int i) {
        this.LJ.put("error_code", String.valueOf(i));
        return this;
    }

    @Override // X.InterfaceC1435230nS5
    public final InterfaceC1435230nS5 LIZLLL(boolean z) {
        String str;
        ConcurrentHashMap<String, String> concurrentHashMap = this.LJ;
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        concurrentHashMap.put("skip_compile", str);
        return this;
    }

    @Override // X.InterfaceC1435230nS5
    public final InterfaceC1435230nS5 LJ(boolean z) {
        String str;
        ConcurrentHashMap<String, String> concurrentHashMap = this.LJ;
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        concurrentHashMap.put("result", str);
        return this;
    }

    @Override // X.InterfaceC1435230nS5
    public final InterfaceC1435230nS5 LJFF(long j) {
        this.LJ.put("upload_time_cost", String.valueOf(j));
        return this;
    }

    @Override // X.InterfaceC1435230nS5
    public final InterfaceC1435230nS5 LJI(EnumC1446110njd enumC1446110njd) {
        this.LJ.put("media_type", enumC1446110njd.getType());
        return this;
    }

    @Override // X.InterfaceC1435230nS5
    public final InterfaceC1435230nS5 LJII(boolean z) {
        String str;
        ConcurrentHashMap<String, String> concurrentHashMap = this.LJ;
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        concurrentHashMap.put("is_preheat_used", str);
        return this;
    }

    @Override // X.InterfaceC1435230nS5
    public final InterfaceC1435230nS5 LJIIIIZZ(long j) {
        this.LJ.put("video_duration", String.valueOf(j));
        return this;
    }

    @Override // X.InterfaceC1435230nS5
    public final InterfaceC1435230nS5 LJIIIZ(String str) {
        this.LJ.put("fail_reason", str);
        return this;
    }

    @Override // X.InterfaceC1435230nS5
    public final InterfaceC1435230nS5 LJIIJ(boolean z) {
        String str;
        ConcurrentHashMap<String, String> concurrentHashMap = this.LJ;
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        concurrentHashMap.put("is_prepublish_used", str);
        return this;
    }

    @Override // X.InterfaceC1435230nS5
    public final InterfaceC1435230nS5 LJIIJJI(EnumC1435490nSV enumC1435490nSV) {
        this.LJ.put("fail_state", enumC1435490nSV.getState());
        return this;
    }

    @Override // X.InterfaceC1435230nS5
    public final InterfaceC1435230nS5 LJIILIIL(long j) {
        this.LJ.put("upload_file_size", String.valueOf(j));
        return this;
    }

    @Override // X.InterfaceC1435230nS5
    public final InterfaceC1435230nS5 LJIILJJIL(boolean z) {
        String str;
        ConcurrentHashMap<String, String> concurrentHashMap = this.LJ;
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        concurrentHashMap.put("from_record", str);
        return this;
    }

    @Override // X.InterfaceC1435230nS5
    public final InterfaceC1435230nS5 LJIILL(long j) {
        this.LJ.put("cover_extract_time_cost", String.valueOf(j));
        return this;
    }

    @Override // X.InterfaceC1435230nS5
    public final InterfaceC1435230nS5 LJIILLIIL(boolean z) {
        String str;
        ConcurrentHashMap<String, String> concurrentHashMap = this.LJ;
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        concurrentHashMap.put("is_prepublish", str);
        return this;
    }

    @Override // X.InterfaceC1435230nS5
    public final InterfaceC1435230nS5 LJIIZILJ(long j) {
        this.LJ.put("auth_time_cost", String.valueOf(j));
        return this;
    }

    @Override // X.InterfaceC1435230nS5
    public final InterfaceC1435230nS5 LJIJ(long j) {
        this.LJ.put("compile_time_cost", String.valueOf(j));
        return this;
    }

    @Override // X.InterfaceC1435230nS5
    public final InterfaceC1435230nS5 LJIJI(long j) {
        this.LJ.put("file_size", String.valueOf(j));
        return this;
    }

    public final InterfaceC1435230nS5 LJIJJ(String str) {
        if (str != null && str.length() != 0) {
            this.LJ.put("content_source", str);
        }
        return this;
    }

    public final InterfaceC1435230nS5 LJIJJLI(String str) {
        this.LJ.put("media_task_id", str);
        return this;
    }

    public final InterfaceC1435230nS5 LJIL(String str) {
        if (str != null && str.length() != 0) {
            this.LJ.put("effect_handler_type", str);
        }
        return this;
    }

    public final InterfaceC1435230nS5 LJJ(String str) {
        if (str != null && str.length() != 0) {
            this.LJ.put("effect_handler_type_active", str);
        }
        return this;
    }

    public final InterfaceC1435230nS5 LJJI(String str) {
        if (str != null && str.length() != 0) {
            this.LJ.put("enter_method", str);
        }
        return this;
    }

    public final InterfaceC1435230nS5 LJJIFFI(String str) {
        if (str != null && str.length() != 0) {
            this.LJ.put("prop_id", str);
        }
        return this;
    }
}
