package X;

import com.bytedance.android.livesdk.broadcast.GetProgressiveResultsChannel;
import com.bytedance.android.livesdk.broadcast.OpenProbeForKeyUserChannel;
import com.bytedance.android.livesdk.broadcast.PreScheduleStreamChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Uoi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.preview.speedtest.LiveSpeedTestAdapter$handlePreScheduleRequest$1$2", f = "LiveSpeedTestAdapter.kt", l = {}, m = "invokeSuspend")
public final class C783700Uoi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C2250021D4u LL;
    public final /* synthetic */ C328040CtW LLILLJJLI;
    public final /* synthetic */ C783710Uoj LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ C327950CtN LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C783700Uoi(C2250021D4u c2250021D4u, C328040CtW c328040CtW, C783710Uoj c783710Uoj, long j, C327950CtN c327950CtN, InterfaceC1364105Vn<? super C783700Uoi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c2250021D4u;
        this.LLILLJJLI = c328040CtW;
        this.LLILLL = c783710Uoj;
        this.LLILZ = j;
        this.LLILZIL = c327950CtN;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C783700Uoi(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        int i;
        C1C7U.LIZ("LiveSpeedTestAdapter@58e5.handlePreScheduleRequest$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC783690Uoh interfaceC783690UohLIZ = this.LL.LIZIZ().LIZ();
        if (interfaceC783690UohLIZ != null) {
            C328040CtW c328040CtW = this.LLILLJJLI;
            if (c328040CtW != null) {
                i = c328040CtW.LIZJ;
            } else {
                i = -1;
            }
            ((C2250051D4x) interfaceC783690UohLIZ).LIZ.put(EnumC2250061D4y.SPEED_TEST_RESPONSE_INFO_CODE, String.valueOf(i));
        }
        if (this.LLILLJJLI == null) {
            this.LL.LIZIZ().LIZJ(EnumC2239251Ckd.API_ERROR);
        } else {
            C2250021D4u c2250021D4u = this.LL;
            C783710Uoj c783710Uoj = this.LLILLL;
            c2250021D4u.LIZIZ = c783710Uoj;
            if (c783710Uoj == null) {
                c2250021D4u.LJFF(this.LLILZ, "4");
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("LiveSpeedTestAdapter@58e5.handlePreScheduleRequest$1$2");
                return unit;
            }
            c2250021D4u.LIZJ();
            this.LL.LIZLLL(this.LLILZ, this.LLILLL, this.LLILZIL);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("preScheduleStream api result: logid=");
            sbLIZ.append(this.LLILLJJLI.LIZIZ);
            sbLIZ.append(" recommend level=");
            sbLIZ.append(this.LLILLL.LIZ.recommendStreamResolution);
            sbLIZ.append("  url=");
            sbLIZ.append(this.LLILLL.LIZ.speedProbeUrl);
            C20441214yg.LIZIZ("LiveSpeedTestAdapter", C2188811AlT.LIZIZ(sbLIZ));
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_golive_speedtest_url");
            c474500IjALIZ.LJIJJLI(this.LL.LIZLLL);
            String str = this.LLILLL.LIZ.speedProbeUrl;
            if (str != null && str.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            c474500IjALIZ.LJJII(C2286608xc.LJ(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0), "is_url_empty");
            c474500IjALIZ.LIZ();
            DataChannel dataChannel = this.LL.LIZLLL;
            if (dataChannel != null) {
                dataChannel.zW(PreScheduleStreamChannel.class, this.LLILLL.LIZ);
            }
            DataChannel dataChannel2 = this.LL.LIZLLL;
            if (dataChannel2 != null) {
                dataChannel2.zW(OpenProbeForKeyUserChannel.class, Boolean.valueOf(this.LLILLL.LIZIZ.LIZ));
            }
            DataChannel dataChannel3 = this.LL.LIZLLL;
            if (dataChannel3 != null) {
                dataChannel3.zW(GetProgressiveResultsChannel.class, Boolean.valueOf(this.LLILLL.LIZIZ.LIZIZ));
            }
            C20441214yg.LJIIIZ("LiveSpeedTestAdapter", "ProbeCache startSpeedTest after subscribe PreScheduleStreamChannel data-->");
            this.LL.LJIIJJI();
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("LiveSpeedTestAdapter@58e5.handlePreScheduleRequest$1$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
