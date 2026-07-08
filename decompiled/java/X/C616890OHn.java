package X;

import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBoardInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS107S0400000_9;
import njp.a;

/* JADX INFO: renamed from: X.0OHn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel$startDCSync$1", f = "BulletinProfileViewModel.kt", l = {428}, m = "invokeSuspend")
public final class C616890OHn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0OI4 LLILLJJLI;
    public final /* synthetic */ BulletinProfileViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C616890OHn(C0OI4 c0oi4, BulletinProfileViewModel bulletinProfileViewModel, InterfaceC1364105Vn<? super C616890OHn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0oi4;
        this.LLILLL = bulletinProfileViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C616890OHn(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinProfileViewModel@3b06.startDCSync$1");
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
            C455501px<C616900OHo<EnumC617060OIe, EnumC617480OJu, EnumC617010OHz, BulletinBoardInfo>> c455501px = this.LLILLJJLI.LJII;
            this.LL = 1;
            obj = c455501px.LIZ(15000L, "bulletin_profile_first_load", this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BulletinProfileViewModel@3b06.startDCSync$1");
                return objLJFF;
            }
        }
        C616900OHo c616900OHo = (C616900OHo) obj;
        if (c616900OHo != null) {
            EnumC617060OIe enumC617060OIe = (EnumC617060OIe) c616900OHo.LIZ;
            EnumC617480OJu enumC617480OJu = (EnumC617480OJu) c616900OHo.LIZIZ;
            EnumC617010OHz enumC617010OHz = (EnumC617010OHz) c616900OHo.LIZJ;
            this.LLILLL.setState(new AwS107S0400000_9(enumC617060OIe, (BulletinBoardInfo) c616900OHo.LIZLLL, enumC617010OHz, enumC617480OJu, 5));
            ((C605820NpU) this.LLILLL.LLJLIL.getValue()).LIZ.setValue(enumC617060OIe);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("BBArch [ProfileVM] fullReadyGate batch sync done: identity=");
            sbLIZ.append(enumC617060OIe);
            sbLIZ.append(", channelType=");
            sbLIZ.append(enumC617480OJu);
            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        } else {
            C0OPX.LJII("BBArch [ProfileVM] fullReadyGate timeout — falling back to incremental sync");
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinProfileViewModel@3b06.startDCSync$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
