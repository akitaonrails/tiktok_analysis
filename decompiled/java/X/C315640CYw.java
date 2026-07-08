package X;

import com.ss.android.ugc.aweme.mention.viewmodel.MentionPanelViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0CYw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.mention.viewmodel.MentionPanelViewModel$getSortedMemberList$1", f = "MentionPanelViewModel.kt", l = {303}, m = "invokeSuspend")
public final class C315640CYw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MentionPanelViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C315640CYw(MentionPanelViewModel mentionPanelViewModel, InterfaceC1364105Vn<? super C315640CYw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = mentionPanelViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C315640CYw(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MentionPanelViewModel@8242.getSortedMemberList$1");
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
            String str = this.LLILLJJLI.LL;
            this.LL = 1;
            obj = C05B9.LIZ(str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MentionPanelViewModel@8242.getSortedMemberList$1");
                return objLJFF;
            }
        }
        List<String> list = (List) obj;
        if (!Intrinsics.LJFF(list, this.LLILLJJLI.LLJJIJI)) {
            MentionPanelViewModel mentionPanelViewModel = this.LLILLJJLI;
            mentionPanelViewModel.LLJJIJI = list;
            mentionPanelViewModel.refresh();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MentionPanelViewModel@8242.getSortedMemberList$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
