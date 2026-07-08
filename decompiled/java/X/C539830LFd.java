package X;

import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LFd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.ugctemplate.v2t.nle.CameraNLEPlayerForTemplateScene$initVEVideoPlayer$1$1", f = "CameraNLEPlayerForTemplateScene.kt", l = {288, 311}, m = "invokeSuspend")
public final class C539830LFd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ List<C539860LFg> LLILLJJLI;
    public final /* synthetic */ C539910LFl LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C539830LFd(List<C539860LFg> list, C539910LFl c539910LFl, String str, InterfaceC1364105Vn<? super C539830LFd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = c539910LFl;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C539830LFd(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objLJI = obj;
        C1C7U.LIZ("CameraNLEPlayerForTemplateScene@f18f.initVEVideoPlayer$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLJI);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("CameraNLEPlayerForTemplateScene@f18f.initVEVideoPlayer$1$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(objLJI);
        } else {
            C155000ia.LIZIZ(objLJI);
            C1DFB c1dfb = C0PEM.LIZJ;
            C539820LFc c539820LFc = new C539820LFc(this.LLILLJJLI, this.LLILLL, this.LLILZ, null);
            this.LL = 1;
            objLJI = C23250099c.LJI(this, c1dfb, c539820LFc);
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("CameraNLEPlayerForTemplateScene@f18f.initVEVideoPlayer$1$1");
                return objLJFF;
            }
        }
        Pair pair = (Pair) objLJI;
        String[] strArr = (String[]) pair.getFirst();
        String[] strArr2 = (String[]) pair.getSecond();
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C539930LFn c539930LFn = new C539930LFn(this.LLILLL, this.LLILLJJLI, strArr, strArr2, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c539930LFn) == objLJFF) {
            C1C7U.LIZIZ("CameraNLEPlayerForTemplateScene@f18f.initVEVideoPlayer$1$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("CameraNLEPlayerForTemplateScene@f18f.initVEVideoPlayer$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
