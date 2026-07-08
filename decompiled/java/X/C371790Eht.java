package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.vesdk.VEEditor;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Eht, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.preview.BaseTTEditPreviewComponent$onCreate$4", f = "TiktokEditPreviewComponent.kt", l = {1642}, m = "invokeSuspend")
public final class C371790Eht extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1452090ntH<T> LLILLJJLI;
    public final /* synthetic */ NLEModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C371790Eht(C1452090ntH<T> c1452090ntH, NLEModel nLEModel, InterfaceC1364105Vn<? super C371790Eht> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1452090ntH;
        this.LLILLL = nLEModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C371790Eht(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC1452170ntP interfaceC1452170ntPLJJ;
        C1463670oBx c1463670oBx;
        C1C7U.LIZ("BaseTTEditPreviewComponent@89f0.onCreate$4");
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
            AbstractC1452680nuE abstractC1452680nuEGc = this.LLILLJJLI.gc();
            if (abstractC1452680nuEGc != null) {
                interfaceC1452170ntPLJJ = abstractC1452680nuEGc.LJJ();
            } else {
                interfaceC1452170ntPLJJ = null;
            }
            if ((interfaceC1452170ntPLJJ instanceof C1463670oBx) && (c1463670oBx = (C1463670oBx) interfaceC1452170ntPLJJ) != null) {
                NLEModel nLEModel = this.LLILLL;
                C1452090ntH<T> c1452090ntH = this.LLILLJJLI;
                if (nLEModel != null) {
                    nLEModel.addToStage(0L);
                    C1463860oCG c1463860oCG = c1463670oBx.LJI;
                    if (c1463860oCG == null) {
                        c1463860oCG = null;
                    }
                    c1463860oCG.setDataSource(nLEModel);
                }
                c1463670oBx.nf(0, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
                C563650M8t c563650M8t = C563650M8t.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("updateDataSource async finish: state ");
                sbLIZ.append(c1463670oBx.getState());
                sbLIZ.append(' ');
                C201955140j.LIZLLL(c563650M8t, "lazy_opt-cost", C2188811AlT.LIZIZ(sbLIZ));
                C1DFH c1dfh = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                C371800Ehu c371800Ehu = new C371800Ehu(c1463670oBx, c1452090ntH, null);
                this.LL = 1;
                if (C23250099c.LJI(this, abstractC2238408pq, c371800Ehu) == objLJFF) {
                    C1C7U.LIZIZ("BaseTTEditPreviewComponent@89f0.onCreate$4");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseTTEditPreviewComponent@89f0.onCreate$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
