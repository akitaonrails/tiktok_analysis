package X;

import com.ss.android.ugc.aweme.captionsheet.CaptionsPanelFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS12S0120000_31;
import njp.a;

/* JADX INFO: renamed from: X.15yy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.captionsheet.CaptionsPanelFragment$initDoNotTranslateRow$2", f = "CaptionsPanelFragment.kt", l = {}, m = "invokeSuspend")
public final class C20697815yy extends C09AX implements Function2<List<? extends String>, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ CaptionsPanelFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20697815yy(CaptionsPanelFragment captionsPanelFragment, InterfaceC1364105Vn<? super C20697815yy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = captionsPanelFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C20697815yy c20697815yy = new C20697815yy(this.LLILLJJLI, interfaceC1364105Vn);
        c20697815yy.LL = obj;
        return c20697815yy;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Aweme aweme;
        InterfaceC20698115z1 interfaceC20698115z1;
        InterfaceC20698115z1 interfaceC20698115z12;
        C1C7U.LIZ("CaptionsPanelFragment@ac5.initDoNotTranslateRow$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List list = (List) this.LL;
        CaptionsPanelFragment captionsPanelFragment = this.LLILLJJLI;
        captionsPanelFragment.LLJJ = (String[]) list.toArray(new String[0]);
        captionsPanelFragment.wS(captionsPanelFragment.LLJJ);
        AbstractC1604130rqV abstractC1604130rqVHS = this.LLILLJJLI.hS();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CaptionsPanelFragment onDoNotTransCodeChanged: ");
        Aweme aweme2 = null;
        sbLIZ.append(C13LP.LJJLIIIJ(list, null, null, null, 0, null, null, 63));
        abstractC1604130rqVHS.LJ(C2188811AlT.LIZIZ(sbLIZ));
        if (C305370By3.LIZ) {
            CaptionsPanelFragment captionsPanelFragment2 = this.LLILLJJLI;
            C20698415z4 c20698415z4 = captionsPanelFragment2.LLILLJJLI;
            if (c20698415z4 != null && (interfaceC20698115z12 = c20698415z4.LIZ) != null) {
                aweme = interfaceC20698115z12.getAweme();
            } else {
                aweme = null;
            }
            boolean zLJJI = C20703515zt.LJJI(aweme);
            C20703515zt c20703515zt = C20703515zt.LIZ;
            C20698415z4 c20698415z42 = this.LLILLJJLI.LLILLJJLI;
            if (c20698415z42 != null && (interfaceC20698115z1 = c20698415z42.LIZ) != null) {
                aweme2 = interfaceC20698115z1.getAweme();
            }
            c20703515zt.getClass();
            boolean zLJIL = C20703515zt.LJIL(aweme2);
            C19292910dr c19292910dr = captionsPanelFragment2.LLJIJIL;
            if (c19292910dr != null) {
                c19292910dr.LJI(new AwS12S0120000_31(captionsPanelFragment2, zLJJI, zLJIL, 2));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CaptionsPanelFragment@ac5.initDoNotTranslateRow$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends String> list, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(list, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
