package X;

import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0n0G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.autocut.AutoCutComponent$requestNLEModel$3", f = "AutoCutComponent.kt", l = {}, m = "invokeSuspend")
public final class C1417980n0G extends C09AX implements Function2<C096H, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1418150n0X LLILLJJLI;
    public final /* synthetic */ C1418250n0h LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1417980n0G(C1418150n0X c1418150n0X, C1418250n0h c1418250n0h, InterfaceC1364105Vn<? super C1417980n0G> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1418150n0X;
        this.LLILLL = c1418250n0h;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1417980n0G c1417980n0G = new C1417980n0G(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c1417980n0G.LL = obj;
        return c1417980n0G;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC1418410n0x interfaceC1418410n0x;
        NLETrack mainTrack;
        C1C7U.LIZ("AutoCutComponent@2715.requestNLEModel$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C096H c096h = (C096H) this.LL;
        if (c096h instanceof C23152095i) {
            C23152095i c23152095i = (C23152095i) c096h;
            this.LLILLJJLI.H4(c23152095i.LIZ, c23152095i.LIZIZ, this.LLILLL);
        } else if (c096h instanceof C23146095c) {
            this.LLILLJJLI.F4(((C23146095c) c096h).LIZ, this.LLILLL);
        } else if (c096h instanceof C23145095b) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AutoCutComponent requestNLEModel onFetchProgress: progress = ");
            sbLIZ.append(((C23145095b) c096h).LIZ);
            C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ));
        } else if (c096h instanceof C095T) {
            this.LLILLJJLI.o4(((C095T) c096h).LIZ, this.LLILLL);
        } else if (c096h instanceof C1417890n07) {
            C1417890n07 c1417890n07 = (C1417890n07) c096h;
            this.LLILLJJLI.E3(c1417890n07.LIZ, C2286608xc.LJ(c1417890n07.LIZIZ), c1417890n07.LIZJ, null, null);
        } else if (c096h instanceof C096G) {
            C096G c096g = (C096G) c096h;
            this.LLILLJJLI.z4(c096g.LIZ, c096g.LIZIZ, c096g.LIZJ, c096g.LIZLLL, this.LLILLL);
        } else if (c096h instanceof C23156095m) {
            C23156095m c23156095m = (C23156095m) c096h;
            this.LLILLJJLI.e4(c23156095m.LIZ, this.LLILLL);
            C1417710mzp c1417710mzp = C1417710mzp.LIZ;
            C1418100n0S c1418100n0S = this.LLILLL.LJIJ;
            String str = c1418100n0S.LIZLLL;
            String str2 = c1418100n0S.LJ;
            String str3 = c1418100n0S.LJFF;
            String str4 = c23156095m.LIZIZ;
            c1417710mzp.getClass();
            C1417710mzp.LJIIIIZZ(str, str2, str3, str4);
        } else if (c096h instanceof C23149095f) {
            C23149095f c23149095f = (C23149095f) c096h;
            NLEModel nLEModel = c23149095f.LIZ;
            if (nLEModel != null && (mainTrack = nLEModel.getMainTrack()) != null) {
                mainTrack.setExtra("async_render", "async_render");
            }
            this.LLILLJJLI.K4(c23149095f.LIZ, this.LLILLL, c23149095f.LIZIZ);
        } else if (c096h instanceof C096I) {
            InterfaceC1418410n0x interfaceC1418410n0x2 = this.LLILLL.LJIILLIIL;
            if (interfaceC1418410n0x2 != null) {
                interfaceC1418410n0x2.LIZLLL("compress");
            }
        } else if (c096h instanceof C096J) {
            InterfaceC1418410n0x interfaceC1418410n0x3 = this.LLILLL.LJIILLIIL;
            if (interfaceC1418410n0x3 != null) {
                interfaceC1418410n0x3.LIZLLL("download_effect");
            }
        } else if (c096h instanceof C096L) {
            InterfaceC1418410n0x interfaceC1418410n0x4 = this.LLILLL.LJIILLIIL;
            if (interfaceC1418410n0x4 != null) {
                interfaceC1418410n0x4.LIZLLL("fill_media");
            }
        } else if ((c096h instanceof C096K) && (interfaceC1418410n0x = this.LLILLL.LJIILLIIL) != null) {
            interfaceC1418410n0x.LJIILLIIL("fill_media");
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AutoCutComponent@2715.requestNLEModel$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C096H c096h, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c096h, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
