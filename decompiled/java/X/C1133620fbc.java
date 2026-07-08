package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0fbc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.GiftAnchorPanelEventTracker$postScroll$1", f = "GiftAnchorPanelEventTracker.kt", l = {}, m = "invokeSuspend")
public final class C1133620fbc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1133630fbd LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ List<InterfaceC1891350zJl> LLIZLLLIL;
    public final /* synthetic */ int LLJ;
    public final /* synthetic */ int LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1133620fbc(C1133630fbd c1133630fbd, String str, boolean z, int i, int i2, int i3, int i4, List<? extends InterfaceC1891350zJl> list, int i5, int i6, InterfaceC1364105Vn<? super C1133620fbc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1133630fbd;
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = i;
        this.LLILZIL = i2;
        this.LLILZLL = i3;
        this.LLIZ = i4;
        this.LLIZLLLIL = list;
        this.LLJ = i5;
        this.LLJI = i6;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1133620fbc(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        int i;
        int i2;
        int iAbs;
        C1C7U.LIZ("GiftAnchorPanelEventTracker@8b36.postScroll$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1133630fbd c1133630fbd = this.LL;
        String str2 = this.LLILLJJLI;
        String str3 = "click";
        if (this.LLILLL) {
            str = "click";
        } else {
            str = "draw";
        }
        int i3 = this.LLILZ;
        int i4 = this.LLILZIL;
        int i5 = this.LLILZLL;
        int i6 = this.LLIZ;
        List<InterfaceC1891350zJl> list = this.LLIZLLLIL;
        c1133630fbd.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("logScrollEnded actionType(");
        sbLIZ.append(str);
        sbLIZ.append(") fv(");
        sbLIZ.append(i3);
        sbLIZ.append(") lv(");
        sbLIZ.append(i4);
        sbLIZ.append(") lfv(");
        sbLIZ.append(i5);
        sbLIZ.append(") llv(");
        sbLIZ.append(i6);
        sbLIZ.append(')');
        C20441214yg.LIZIZ("GiftAnchorPanelEventTracker", C2188811AlT.LIZIZ(sbLIZ));
        if (C13LP.LJJJLL(list) instanceof C1146360fwA) {
            i = ((i6 - 1) / 4) + 1;
            i2 = ((i4 - 1) / 4) + 1;
            iAbs = Math.abs(i2 - i);
        } else {
            i = (i6 / 4) + 1;
            i2 = (i4 / 4) + 1;
            iAbs = Math.abs(i2 - i);
        }
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() - c1133630fbd.LJIIJJI);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_creator_gift_panel_scroll");
        C1133640fbe.LIZ(c474500IjALIZ);
        c474500IjALIZ.LJJII(str2, "gift_enter_from");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "start_row_location");
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "end_row_location");
        c474500IjALIZ.LJJII(Integer.valueOf(iCurrentTimeMillis), "scroll_duration");
        c474500IjALIZ.LJJII(Integer.valueOf(iAbs), "scroll_rows");
        c474500IjALIZ.LIZ();
        C1133630fbd c1133630fbd2 = this.LL;
        String str4 = this.LLILLJJLI;
        if (!this.LLILLL) {
            str3 = "draw";
        }
        c1133630fbd2.LIZIZ(str4, str3, this.LLILZ, this.LLILZIL, this.LLJ, this.LLJI, this.LLIZLLLIL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GiftAnchorPanelEventTracker@8b36.postScroll$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
