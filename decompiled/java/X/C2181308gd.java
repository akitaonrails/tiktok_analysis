package X;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08gd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.cut_ui_impl.newplayer.CutPlayerActivity$launchCompile$1", f = "CutPlayerActivity.kt", l = {639}, m = "invokeSuspend")
public final class C2181308gd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AbstractActivityC559670LxF LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2181308gd(AbstractActivityC559670LxF abstractActivityC559670LxF, InterfaceC1364105Vn<? super C2181308gd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = abstractActivityC559670LxF;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2181308gd(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [T, java.lang.String] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("CutPlayerActivity@2b06.launchCompile$1");
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
            C259800zU c259800zU = new C259800zU();
            new C013C();
            int i2 = 5;
            do {
                i2--;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("compile_");
                sbLIZ.append(new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date()));
                sbLIZ.append(".mp4");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(C08OW.LIZIZ(this.LLILLJJLI, EnumC23090092y.OUTPUT));
                sbLIZ2.append('/');
                sbLIZ2.append(strLIZIZ);
                c259800zU.element = C2188811AlT.LIZIZ(sbLIZ2);
                boolean zExists = new C0VSJ((String) c259800zU.element).exists();
                z = !zExists;
                if (!zExists) {
                    break;
                }
            } while (i2 > 0);
            if (z) {
                C1DFB c1dfb = C0PEM.LIZJ;
                C557070Lt3 c557070Lt3 = new C557070Lt3(this.LLILLJJLI, c259800zU, null);
                this.LL = 1;
                if (C23250099c.LJI(this, c1dfb, c557070Lt3) == objLJFF) {
                    C1C7U.LIZIZ("CutPlayerActivity@2b06.launchCompile$1");
                    return objLJFF;
                }
            } else {
                this.LLILLJJLI.LLLZ(-1, "can not create file for compile");
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CutPlayerActivity@2b06.launchCompile$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
