package X;

import com.bytedance.android.live.broadcast.SchemaMirrorCameraEvent;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.01zV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC514701zV implements Runnable {
    public final int $t;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        try {
            C0VSJ c0vsj = new C0VSJ(this.s0);
            if (c0vsj.exists() && c0vsj.isFile()) {
                c0vsj.delete();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("delete crop image fail:");
            sbLIZ.append(th.getMessage());
            C20441214yg.LJ("GenerateTask", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LIZ$1() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("tag", this.s0);
        c2344009Gk.LJFF("type", "timeout");
        C20684815ws.LJIILLIIL("rd_feed_component_downgrade_event", c2344009Gk.LIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tag: ");
        sbLIZ.append(this.s0);
        sbLIZ.append(" timeout not recovery");
        C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public RunnableC514701zV(int i) {
        this.$t = i;
        this.s0 = "homepage_explore";
    }

    public static final void run$0(RunnableC514701zV runnableC514701zV) {
        boolean zLIZ;
        C1C7U.LIZ("MockImageVideoWidget@8b2f.showToastOnUiThread$1");
        try {
            C766270U4b.LJIIJJI(runnableC514701zV.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MockImageVideoWidget@8b2f.showToastOnUiThread$1");
    }

    public static final void run$1(RunnableC514701zV runnableC514701zV) {
        boolean zLIZ;
        C1C7U.LIZ("GenerateTask@b0b7.deleteCropFile$1");
        try {
            runnableC514701zV.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GenerateTask@b0b7.deleteCropFile$1");
    }

    public static final void run$2(RunnableC514701zV runnableC514701zV) {
        boolean zLIZ;
        C1C7U.LIZ("ToastHelp@4be3.showToastLater$1");
        try {
            C766270U4b.LJIIJJI(runnableC514701zV.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ToastHelp@4be3.showToastLater$1");
    }

    public static final void run$3(RunnableC514701zV runnableC514701zV) {
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("GiftQueue client disconnected: ");
            sbLIZ.append(runnableC514701zV.s0);
            C766270U4b.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public static final void run$4(RunnableC514701zV runnableC514701zV) {
        boolean zLIZ;
        C1C7U.LIZ("DowngradeExtKt@9b6.mobDowngradeTimeout$1");
        try {
            runnableC514701zV.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DowngradeExtKt@9b6.mobDowngradeTimeout$1");
    }

    public static final void run$5(RunnableC514701zV runnableC514701zV) {
        boolean zLIZ;
        C1C7U.LIZ("SetCameraSchemaDispatcher@b4b.setCamera$2$1");
        try {
            DataChannelGlobal.LLILZ.FQ2(SchemaMirrorCameraEvent.class, Boolean.valueOf(!Intrinsics.LJFF(runnableC514701zV.s0, CardStruct.IStatusCode.DEFAULT)));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SetCameraSchemaDispatcher@b4b.setCamera$2$1");
    }

    public static final void run$6(RunnableC514701zV runnableC514701zV) {
        boolean zLIZ;
        C1C7U.LIZ("ClientAIConfigCenterImpl@4163.monitorConfig$1");
        try {
            C20684815ws.LJIJ("ml_scene_run", new JSONObject().put(Scene.SCENE_SERVICE, runnableC514701zV.s0).put("error_code", -1));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ClientAIConfigCenterImpl@4163.monitorConfig$1");
    }

    public static final void run$7(RunnableC514701zV runnableC514701zV) {
        boolean zLIZ;
        C1C7U.LIZ("ExploreMobUtils@18af.logShowText2Image$1");
        try {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", runnableC514701zV.s0);
            C20684815ws.LJIILLIIL("ttexp_text2image_post_quick_entrance_show", c2344009Gk.LIZ);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ExploreMobUtils@18af.logShowText2Image$1");
    }

    public RunnableC514701zV(String str, int i) {
        this.$t = i;
        this.s0 = str;
    }
}
