package X;

import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.archive.settings.ArchiveSettingPageCell;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.archive.settings.ArchiveSettingPageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YuE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.feature.archive.settings.ArchiveSettingPageCell$onBindItemView$1$1$1$1", f = "ArchiveSettingPageCell.kt", l = {53, 54}, m = "invokeSuspend")
public final class C889040YuE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ArchiveSettingPageCell LLILLJJLI;
    public final /* synthetic */ C888970Yu7 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C889040YuE(ArchiveSettingPageCell archiveSettingPageCell, C888970Yu7 c888970Yu7, InterfaceC1364105Vn<? super C889040YuE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = archiveSettingPageCell;
        this.LLILLL = c888970Yu7;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C889040YuE(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ArchiveSettingPageCell@4817.onBindItemView$1$1$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("ArchiveSettingPageCell@4817.onBindItemView$1$1$1$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AssemVMLazy assemVMLazy = this.LLILLJJLI.LLILLJJLI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = ArchiveSettingPageCell.LLILZLL;
            ArchiveSettingPageViewModel archiveSettingPageViewModel = (ArchiveSettingPageViewModel) assemVMLazy.getValue();
            C888970Yu7 c888970Yu7 = this.LLILLL;
            this.LL = 1;
            obj = archiveSettingPageViewModel.wQ2(c888970Yu7, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ArchiveSettingPageCell@4817.onBindItemView$1$1$1$1");
                return objLJFF;
            }
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C889050YuF c889050YuF = new C889050YuF(this.LLILLJJLI, zBooleanValue, this.LLILLL, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c889050YuF) == objLJFF) {
            C1C7U.LIZIZ("ArchiveSettingPageCell@4817.onBindItemView$1$1$1$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ArchiveSettingPageCell@4817.onBindItemView$1$1$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
