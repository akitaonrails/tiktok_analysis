package X;

import com.ss.android.ugc.aweme.compliance.business.fundraiser.p006native.pages.fundraiser.FundraiserPageFragment;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0zpX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.business.fundraiser.native.pages.fundraiser.FundraiserPageFragment$onCreateView$1$1$1", f = "FundraiserPageFragment.kt", l = {}, m = "invokeSuspend")
public final class C1911050zpX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ FundraiserPageFragment LL;
    public final /* synthetic */ C05P1<C1674170tfT> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1911050zpX(FundraiserPageFragment fundraiserPageFragment, C05P1<C1674170tfT> c05p1, InterfaceC1364105Vn<? super C1911050zpX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = fundraiserPageFragment;
        this.LLILLJJLI = c05p1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1911050zpX(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FundraiserPageFragment@2c9d.onCreateView$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!this.LLILLJJLI.getValue().LJIJI) {
            C1911060zpY c1911060zpYVQ2 = this.LL.MR().vQ2();
            c1911060zpYVQ2.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String str = c1911060zpYVQ2.LIZ;
            if (str != null) {
                linkedHashMap.put("user_type", str);
            }
            String str2 = c1911060zpYVQ2.LIZIZ;
            if (str2 != null) {
                linkedHashMap.put("enter_from", str2);
            }
            String str3 = c1911060zpYVQ2.LIZJ;
            if (str3 != null) {
                linkedHashMap.put("enter_method", str3);
            }
            String str4 = c1911060zpYVQ2.LIZLLL;
            if (str4 != null) {
                linkedHashMap.put("ngo_name", str4);
            }
            String str5 = c1911060zpYVQ2.LJ;
            if (str5 != null) {
                linkedHashMap.put("fundraiser_id", str5);
            }
            String str6 = c1911060zpYVQ2.LJFF;
            if (str6 != null) {
                linkedHashMap.put("fundraiser_owner_id", str6);
            }
            String str7 = c1911060zpYVQ2.LJI;
            if (str7 != null) {
                linkedHashMap.put("from_user_id", str7);
            }
            String str8 = c1911060zpYVQ2.LJII;
            if (str8 != null) {
                linkedHashMap.put("donation_show_amt", str8);
            }
            String str9 = c1911060zpYVQ2.LJIIIIZZ;
            if (str9 != null) {
                linkedHashMap.put("donor_show_cnt", str9);
            }
            C20684815ws.LJIILLIIL("donation_panel_show", linkedHashMap);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FundraiserPageFragment@2c9d.onCreateView$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
