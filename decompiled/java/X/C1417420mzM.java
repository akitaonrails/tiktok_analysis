package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mzM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.autocut.preload.musicandnle.PreloadMusicAndNLETask$requestNLEModel$1", f = "PreloadMusicAndNLETask.kt", l = {}, m = "invokeSuspend")
public final class C1417420mzM extends C09AX implements Function2<C096H, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1417350mzF LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1417420mzM(C1417350mzF c1417350mzF, int i, String str, String str2, String str3, InterfaceC1364105Vn<? super C1417420mzM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1417350mzF;
        this.LLILLL = i;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1417420mzM c1417420mzM = new C1417420mzM(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c1417420mzM.LL = obj;
        return c1417420mzM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PreloadMusicAndNLETask@c943.requestNLEModel$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C096H c096h = (C096H) this.LL;
        if (c096h instanceof C095T) {
            this.LLILLJJLI.LJII.LJIIIIZZ = C1418020n0K.LIZLLL(((C095T) c096h).LIZ);
        } else if (c096h instanceof C1417890n07) {
            C1417350mzF c1417350mzF = this.LLILLJJLI;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("requestNLEModel onTemplateFailure: code=");
            sbLIZ.append(c096h);
            sbLIZ.append(".code,subCode=");
            C1417890n07 c1417890n07 = (C1417890n07) c096h;
            sbLIZ.append(c1417890n07.LIZIZ);
            sbLIZ.append(", msg=");
            sbLIZ.append(c1417890n07.LIZJ);
            C2188811AlT.LIZIZ(sbLIZ);
            c1417350mzF.getClass();
            this.LLILLJJLI.LIZJ(C2286608xc.LJ(8), C2286608xc.LJ(c1417890n07.LIZIZ), c1417890n07.LIZJ);
        } else if (c096h instanceof C096G) {
            C096G c096g = (C096G) c096h;
            if (c096g.LIZIZ != 6) {
                C1417350mzF c1417350mzF2 = this.LLILLJJLI;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("requestNLEModel onFailure: code=");
                sbLIZ2.append(c096g.LIZIZ);
                sbLIZ2.append(", msg=");
                sbLIZ2.append(c096g.LIZJ);
                sbLIZ2.append(", extraParams=");
                sbLIZ2.append(c096g.LIZLLL);
                C2188811AlT.LIZIZ(sbLIZ2);
                c1417350mzF2.getClass();
                this.LLILLJJLI.LIZJ(C2286608xc.LJ(c096g.LIZIZ), Integer.MIN_VALUE, c096g.LIZJ);
            } else {
                C1417710mzp.LJIJI("source_preload", c096g.LIZ, 6, c096g.LIZJ, c096g.LIZLLL, null);
            }
        } else if (c096h instanceof C23149095f) {
            C371410EhH.LIZJ(new C1417430mzN(this.LLILLJJLI, c096h, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PreloadMusicAndNLETask@c943.requestNLEModel$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C096H c096h, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c096h, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
