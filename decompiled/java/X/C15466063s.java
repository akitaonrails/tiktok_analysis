package X;

import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS581S0100000_2;
import njp.a;

/* JADX INFO: renamed from: X.063s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.common.utils.TakoImageC2PAManager$writeC2PAToFileAwait$2", f = "TakoImageC2PAManager.kt", l = {135, 155}, m = "invokeSuspend")
public final class C15466063s extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15466063s(String str, InterfaceC1364105Vn<? super C15466063s> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15466063s(this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoImageC2PAManager@c341.writeC2PAToFileAwait$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Boolean boolValueOf = Boolean.valueOf(((C15470063w) obj).LIZ);
                    C1C7U.LIZIZ("TakoImageC2PAManager@c341.writeC2PAToFileAwait$2");
                    return boolValueOf;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            String str = this.LLILLL;
            if (str != null && str.length() != 0) {
                File fileLJFF = C2114508Qd.LJFF(new C0VSJ(""), this.LLILLL);
                if (fileLJFF == null) {
                    C1C7U.LIZIZ("TakoImageC2PAManager@c341.writeC2PAToFileAwait$2");
                    return false;
                }
                if (!fileLJFF.exists()) {
                    C1C7U.LIZIZ("TakoImageC2PAManager@c341.writeC2PAToFileAwait$2");
                    return false;
                }
                C15453063f c15453063f = C15453063f.LIZ;
                this.LLILLJJLI = 1;
                obj = c15453063f.LIZ(8000L, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("TakoImageC2PAManager@c341.writeC2PAToFileAwait$2");
                    return objLJFF;
                }
            } else {
                C1C7U.LIZIZ("TakoImageC2PAManager@c341.writeC2PAToFileAwait$2");
                return false;
            }
        }
        if (!((Boolean) obj).booleanValue()) {
            C1C7U.LIZIZ("TakoImageC2PAManager@c341.writeC2PAToFileAwait$2");
            return false;
        }
        String str2 = this.LLILLL;
        this.LL = str2;
        this.LLILLJJLI = 2;
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
        c2252611DEt.LJIJJ();
        C15467063t.LIZIZ(str2, EnumC15469063v.AIGC_CREATE, new AwS581S0100000_2(c2252611DEt, 506), 5);
        obj = c2252611DEt.LJIJ();
        if (obj == C099R.LJFF()) {
            C099Q.LIZJ(this);
        }
        if (obj == objLJFF) {
            C1C7U.LIZIZ("TakoImageC2PAManager@c341.writeC2PAToFileAwait$2");
            return objLJFF;
        }
        Boolean boolValueOf2 = Boolean.valueOf(((C15470063w) obj).LIZ);
        C1C7U.LIZIZ("TakoImageC2PAManager@c341.writeC2PAToFileAwait$2");
        return boolValueOf2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
