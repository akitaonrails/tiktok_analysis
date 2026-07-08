package X;

import com.ss.android.vesdk.VEUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Dql, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.asve.editor.nlepro.NLEMusicManagerImpl$setBgm$1", f = "NLEMusicManagerImpl.kt", l = {130}, m = "invokeSuspend")
public final class C351810Dql extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C347660Dk4 LLILLJJLI;
    public final /* synthetic */ C347770DkF LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C351810Dql(C347770DkF c347770DkF, C347660Dk4 c347660Dk4, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c347660Dk4;
        this.LLILLL = c347770DkF;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C351810Dql(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("NLEMusicManagerImpl@358d.setBgm$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C347660Dk4 c347660Dk4 = this.LLILLJJLI;
            if (c347660Dk4 != null && (str = c347660Dk4.LIZIZ) != null) {
                VEUtils.getAudioFileInfo(str);
            }
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C351800Dqk c351800Dqk = new C351800Dqk(this.LLILLL, this.LLILLJJLI, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c351800Dqk) == objLJFF) {
                C1C7U.LIZIZ("NLEMusicManagerImpl@358d.setBgm$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NLEMusicManagerImpl@358d.setBgm$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
