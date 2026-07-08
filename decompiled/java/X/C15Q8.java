package X;

import com.ss.android.ugc.aweme.services.external.ui.DuetConfig;
import com.ss.android.vesdk.VEUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.15Q8, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.external.ui.RecordServiceBaseImpl$startDuet$2", f = "RecordServiceBaseImpl.kt", l = {}, m = "invokeSuspend")
public final class C15Q8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ DuetConfig LLILLJJLI;
    public final /* synthetic */ C15Q6 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15Q8(boolean z, DuetConfig duetConfig, C15Q6 c15q6, InterfaceC1364105Vn<? super C15Q8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = duetConfig;
        this.LLILLL = c15q6;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15Q8(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecordServiceBaseImpl@d40c.startDuet$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        int i = 1280;
        int i2 = 720;
        if (this.LL) {
            DuetConfig duetConfig = this.LLILLJJLI;
            duetConfig.setMp4Path(duetConfig.getOriginVideo());
            DuetConfig duetConfig2 = this.LLILLJJLI;
            duetConfig2.setWavPath(duetConfig2.getOriginVideo());
            VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(this.LLILLJJLI.getMp4Path());
            C15Q6 c15q6 = this.LLILLL;
            if (videoFileInfo != null) {
                i2 = videoFileInfo.width;
                i = videoFileInfo.height;
            }
            c15q6.onSuccess(i2, i);
        } else {
            if (C1383720m70.LIZ().reuseLocalPath) {
                DuetConfig duetConfig3 = this.LLILLJJLI;
                duetConfig3.setMp4Path(duetConfig3.getOriginVideo());
            } else if (!C2354709Kn.LIZIZ(this.LLILLJJLI.getMp4Path())) {
                C2286708xd.LJFF(this.LLILLJJLI.getOriginVideo(), this.LLILLJJLI.getMp4Path());
            }
            VEUtils.VEVideoFileInfo videoFileInfo2 = VEUtils.getVideoFileInfo(this.LLILLJJLI.getMp4Path());
            DuetConfig duetConfig4 = this.LLILLJJLI;
            duetConfig4.setWavPath(duetConfig4.getMp4Path());
            C15Q6 c15q62 = this.LLILLL;
            if (videoFileInfo2 != null) {
                i2 = videoFileInfo2.width;
                i = videoFileInfo2.height;
            }
            c15q62.onSuccess(i2, i);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RecordServiceBaseImpl@d40c.startDuet$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
