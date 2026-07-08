package X;

import com.ss.android.ugc.aweme.vibefeed.feed.viewmodel.VibeFeedEntranceViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS36S0001000_24;
import njp.a;

/* JADX INFO: renamed from: X.0r58, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.vibefeed.feed.viewmodel.VibeFeedEntranceViewModel$fetchEntranceRedDot$1", f = "VibeFeedEntranceViewModel.kt", l = {148}, m = "invokeSuspend")
public final class C1574760r58 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ VibeFeedEntranceViewModel LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1574760r58(String str, VibeFeedEntranceViewModel vibeFeedEntranceViewModel, String str2, InterfaceC1364105Vn<? super C1574760r58> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = vibeFeedEntranceViewModel;
        this.LLILZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1574760r58(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VibeFeedEntranceViewModel@aaa3.fetchEntranceRedDot$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            String strLIZ = C1575440r6E.LIZ();
            if (strLIZ == null) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("VibeFeedEntranceViewModel@aaa3.fetchEntranceRedDot$1");
                return unit;
            }
            if (this.LLILLJJLI == null) {
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("VibeFeedEntranceViewModel@aaa3.fetchEntranceRedDot$1");
                return unit2;
            }
            C0P3A c0p3a = (C0P3A) this.LLILLL.LLILZ.getValue().getOperator();
            String str = this.LLILLJJLI;
            String strValueOf = String.valueOf(this.LLILZ);
            EnumC629350OmL enumC629350OmL = EnumC629350OmL.SCENE_PREVIEW;
            EnumC912680ZrG enumC912680ZrG = this.LLILLL.LLJIJIL;
            this.LL = 1;
            obj = c0p3a.LJJLIIIJILLIZJL(strLIZ, str, strValueOf, enumC629350OmL, enumC912680ZrG, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("VibeFeedEntranceViewModel@aaa3.fetchEntranceRedDot$1");
                return objLJFF;
            }
        }
        int iIntValue = ((Number) obj).intValue();
        C1575210r5r c1575210r5r = C1575210r5r.LLILLJJLI;
        EnumC897860ZKe enumC897860ZKe = EnumC897860ZKe.CHAT_PAGE;
        String str2 = this.LLILZ;
        if (str2 == null) {
            str2 = "";
        }
        if (iIntValue != 1) {
            z = false;
        }
        c1575210r5r.LJI(enumC897860ZKe, str2, z);
        this.LLILLL.setState(new AwS36S0001000_24(iIntValue, 6));
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("VibeFeedEntranceViewModel@aaa3.fetchEntranceRedDot$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
