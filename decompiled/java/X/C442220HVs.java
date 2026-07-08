package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HVs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.prop.mobileefffect.edit.EffectEditIconV2Assem$showIconTipSheet$1$bgFetchRet$1", f = "EffectEditIconV2Assem.kt", l = {584}, m = "invokeSuspend")
public final class C442220HVs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C442220HVs(String str, InterfaceC1364105Vn<? super C442220HVs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C442220HVs(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("EffectEditIconV2Assem@faf6.showIconTipSheet$1$bgFetchRet$1");
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
            Uri uri = UriProtector.parse(this.LLILLJJLI);
            EnumC1331380kka enumC1331380kka = EnumC1331380kka.IMMEDIATE;
            this.LL = 1;
            obj = C23250099c.LJI(this, C0PEM.LIZJ, new C442190HVp(uri, enumC1331380kka, null));
            if (obj == objLJFF) {
                C1C7U.LIZIZ("EffectEditIconV2Assem@faf6.showIconTipSheet$1$bgFetchRet$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("EffectEditIconV2Assem@faf6.showIconTipSheet$1$bgFetchRet$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
