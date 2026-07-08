package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0t8g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.record.viewmodel.tabs.TabRepository$activeTopTab$1", f = "TabRepository.kt", l = {}, m = "invokeSuspend")
public final class C1653840t8g extends C09AX implements InterfaceC1631620sYq<Integer, Integer, InterfaceC1364105Vn<? super EnumC1653870t8j>, Object> {
    public /* synthetic */ int LL;
    public /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ C1653860t8i LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1653840t8g(C1653860t8i c1653860t8i, InterfaceC1364105Vn<? super C1653840t8g> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLL = c1653860t8i;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TabRepository@4123.activeTopTab$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        int i = this.LL;
        EnumC1653870t8j enumC1653870t8j = ((C1657380tEO) ListProtector.get(((C1654080t94) ListProtector.get(this.LLILLL.LIZ.LIZ.LIZ.LIZ, i)).LIZJ, this.LLILLJJLI)).LIZIZ;
        C1C7U.LIZIZ("TabRepository@4123.activeTopTab$1");
        return enumC1653870t8j;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Integer num, Integer num2, InterfaceC1364105Vn<? super EnumC1653870t8j> interfaceC1364105Vn) {
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        C1653840t8g c1653840t8g = new C1653840t8g(this.LLILLL, interfaceC1364105Vn);
        c1653840t8g.LL = iIntValue;
        c1653840t8g.LLILLJJLI = iIntValue2;
        return c1653840t8g.invokeSuspend(Unit.LIZ);
    }
}
