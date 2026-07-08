package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.mention.viewmodel.MentionPanelViewModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CYu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.mention.viewmodel.MentionPanelViewModel$onClickUser$1$1$1", f = "MentionPanelViewModel.kt", l = {229, 230}, m = "invokeSuspend")
public final class C315620CYu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MentionPanelViewModel LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ IMUser LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C315620CYu(MentionPanelViewModel mentionPanelViewModel, String str, IMUser iMUser, InterfaceC1364105Vn<? super C315620CYu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = mentionPanelViewModel;
        this.LLILLL = str;
        this.LLILZ = iMUser;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C315620CYu(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MentionPanelViewModel@8242.onClickUser$1$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("MentionPanelViewModel@8242.onClickUser$1$1$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C2252331DDr c2252331DDr = this.LLILLJJLI.LLJIJIL;
            String str = this.LLILLL;
            String displayName = this.LLILZ.getDisplayName();
            if (displayName == null) {
                displayName = "";
            }
            Pair pair = new Pair(str, displayName);
            this.LL = 1;
            if (c2252331DDr.emit(pair, this) == objLJFF) {
                C1C7U.LIZIZ("MentionPanelViewModel@8242.onClickUser$1$1$1");
                return objLJFF;
            }
        }
        C2252331DDr c2252331DDr2 = this.LLILLJJLI.LLJILJIL;
        Unit unit2 = Unit.LIZ;
        this.LL = 2;
        if (c2252331DDr2.emit(unit2, this) == objLJFF) {
            C1C7U.LIZIZ("MentionPanelViewModel@8242.onClickUser$1$1$1");
            return objLJFF;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("MentionPanelViewModel@8242.onClickUser$1$1$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
