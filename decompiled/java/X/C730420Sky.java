package X;

import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS4S0210100_11;
import njp.a;

/* JADX INFO: renamed from: X.0Sky, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM$handleDiggClickFailed$1", f = "VideoDiggVM.kt", l = {}, m = "invokeSuspend")
public final class C730420Sky extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ VideoDiggVM LL;
    public final /* synthetic */ Aweme LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C730420Sky(VideoDiggVM videoDiggVM, Aweme aweme, InterfaceC1364105Vn<? super C730420Sky> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = videoDiggVM;
        this.LLILLJJLI = aweme;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C730420Sky(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("VideoDiggVM@76c8.handleDiggClickFailed$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        VideoDiggVM videoDiggVM = this.LL;
        if (!videoDiggVM.LLILLJJLI) {
            videoDiggVM.LL++;
            z = true;
        } else {
            z = false;
            videoDiggVM.LL--;
        }
        long jSQ2 = videoDiggVM.SQ2(this.LLILLJJLI, z);
        VideoDiggVM videoDiggVM2 = this.LL;
        videoDiggVM2.setState(new AwS4S0210100_11(videoDiggVM2, jSQ2, this.LLILLJJLI, z, 2));
        C1440005kM.LIZ(new C730120SkU(this.LLILLJJLI.getAid(), jSQ2, z ? 1 : 0, EnumC730430Skz.ICON));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VideoDiggVM@76c8.handleDiggClickFailed$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
