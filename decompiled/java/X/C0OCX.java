package X;

import Y.AgS290S0100000_9;
import com.ss.android.ugc.aweme.aiportrait.detail.model.AIPortraitDetailHeaderModel;
import com.ss.android.ugc.aweme.aiportrait.detail.model.AIPortraitDetailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AFwS292S0000000_9;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0OCX, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aiportrait.detail.model.AIPortraitDetailViewModel$fetchTemplateDetail$2", f = "AIPortraitDetailViewModel.kt", l = {118}, m = "invokeSuspend")
public final class C0OCX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ AIPortraitDetailViewModel LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OCX(String str, String str2, String str3, boolean z, AIPortraitDetailViewModel aIPortraitDetailViewModel, InterfaceC1364105Vn<? super C0OCX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = z;
        this.LLILZLL = aIPortraitDetailViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0OCX(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0O3P c0o3p;
        C1C7U.LIZ("AIPortraitDetailViewModel@daa2.fetchTemplateDetail$2");
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
            C0OCU c0ocu = C0OCT.LIZ;
            String str = this.LLILLJJLI;
            String str2 = this.LLILLL;
            String str3 = this.LLILZ;
            boolean z = this.LLILZIL;
            c0ocu.getClass();
            C613960O6g c613960O6gLIZIZ = C613940O6e.LIZ().LIZIZ(new C0OCV(str, str2, str3));
            C0O4P<AIPortraitDetailHeaderModel> value = C0OCU.LIZIZ.getValue();
            AFwS292S0000000_9 aFwS292S0000000_9 = AFwS292S0000000_9.get$arr$(65);
            AFwS240S0000000_9 aFwS240S0000000_9 = AFwS240S0000000_9.get$arr$(908);
            Intrinsics.LJFF(AIPortraitDetailHeaderModel.class, C0OCZ.class);
            c613960O6gLIZIZ.LIZ(new C0O8D(new C0O70(value, aFwS292S0000000_9, aFwS240S0000000_9, C0OCZ.class, AIPortraitDetailHeaderModel.class)));
            if (!z) {
                c0o3p = C0O3P.NetWhenCacheMiss;
            } else {
                c0o3p = C0O3P.NetworkOnly;
            }
            C0O7F.LIZIZ(c613960O6gLIZIZ, c0o3p);
            InterfaceC346201Wa interfaceC346201WaLIZIZ = c613960O6gLIZIZ.LIZIZ();
            AgS290S0100000_9 agS290S0100000_9 = new AgS290S0100000_9(this.LLILZLL, 6);
            this.LL = 1;
            if (interfaceC346201WaLIZIZ.collect(agS290S0100000_9, this) == objLJFF) {
                C1C7U.LIZIZ("AIPortraitDetailViewModel@daa2.fetchTemplateDetail$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIPortraitDetailViewModel@daa2.fetchTemplateDetail$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
