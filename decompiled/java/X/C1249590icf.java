package X;

import Y.AComparatorS28S0000000_9;
import android.content.Context;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.profile.business.profile.menu.business.content.search.SearchActionComponent;
import com.ss.android.ugc.profile.business.profile.menu.viewmodel.ProfileMenuViewModel;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import njp.a;

/* JADX INFO: renamed from: X.0icf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.profile.menu.business.content.search.SearchActionComponent$initSearchEntrance$1$3$onTextChanged$1$1", f = "SearchActionComponent.kt", l = {}, m = "invokeSuspend")
public final class C1249590icf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C259800zU<C1249660icm> LL;
    public final /* synthetic */ SearchActionComponent LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1249590icf(C259800zU<C1249660icm> c259800zU, SearchActionComponent searchActionComponent, String str, InterfaceC1364105Vn<? super C1249590icf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c259800zU;
        this.LLILLJJLI = searchActionComponent;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1249590icf(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, X.0icm] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List listLJLLLL;
        EnumC1249630icj enumC1249630icj;
        C1C7U.LIZ("SearchActionComponent@3a4.initSearchEntrance$1$3$onTextChanged$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C259800zU<C1249660icm> c259800zU = this.LL;
        ProfileMenuViewModel profileMenuViewModelIp = this.LLILLJJLI.Ip();
        String str = this.LLILLL;
        C596300Na8 c596300Na8 = profileMenuViewModelIp.LL;
        if (str != null) {
            LinkedHashSet<C1249580ice> linkedHashSet = c596300Na8.LIZ;
            ArrayList arrayList = new ArrayList();
            for (C1249580ice c1249580ice : linkedHashSet) {
                C1249580ice c1249580ice2 = c1249580ice;
                if (a0.LJJIIZI(c1249580ice2.LLILLL, str, true) || a0.LJJIIZI(u.LJJIFFI(c1249580ice2.LLILLL, " ", "", false), str, true)) {
                    arrayList.add(c1249580ice);
                }
            }
            listLJLLLL = C13LP.LJLLLL(new AComparatorS28S0000000_9(12), arrayList);
        } else {
            c596300Na8.getClass();
            listLJLLLL = C13BV.INSTANCE;
        }
        C365090ETb.LIZIZ();
        ArrayList arrayList2 = new ArrayList();
        int size = listLJLLLL.size();
        String str2 = null;
        for (int i = 0; i < size; i++) {
            C1249580ice c1249580ice3 = (C1249580ice) ListProtector.get(listLJLLLL, i);
            EnumC1249570icd enumC1249570icd = c1249580ice3.LL;
            String str3 = c1249580ice3.LLILLJJLI;
            String str4 = c1249580ice3.LLILLL;
            Object obj2 = c1249580ice3.LLILZ;
            InterfaceC1631620sYq<Context, View, String, Unit> interfaceC1631620sYq = c1249580ice3.LLILZIL;
            String str5 = c1249580ice3.LLILZLL;
            C1249580ice c1249580ice4 = new C1249580ice(enumC1249570icd, str3, str4, obj2, interfaceC1631620sYq, str5, c1249580ice3.LLIZ, c1249580ice3.LLIZLLLIL, c1249580ice3.LLJ, c1249580ice3.LLJI);
            c1249580ice4.LLJ = str;
            if (!Intrinsics.LJFF(str5, str2)) {
                str2 = ((C1249580ice) ListProtector.get(listLJLLLL, i)).LLILZLL;
                if (i == 0) {
                    c1249580ice4.LL = EnumC1249570icd.FIRST_GROUP;
                } else {
                    c1249580ice4.LL = EnumC1249570icd.GROUP;
                }
            } else {
                c1249580ice4.LL = EnumC1249570icd.ITEM;
            }
            arrayList2.add(c1249580ice4);
        }
        if (listLJLLLL.isEmpty()) {
            enumC1249630icj = EnumC1249630icj.FAIL;
        } else {
            enumC1249630icj = EnumC1249630icj.SUCCESS;
        }
        c259800zU.element = new C1249660icm(enumC1249630icj, str, arrayList2);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchActionComponent@3a4.initSearchEntrance$1$3$onTextChanged$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
