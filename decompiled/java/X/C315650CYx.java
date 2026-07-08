package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.mention.viewmodel.MentionPanelViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CYx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.mention.viewmodel.MentionPanelViewModel$refresh$1", f = "MentionPanelViewModel.kt", l = {}, m = "invokeSuspend")
public final class C315650CYx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MentionPanelViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C315650CYx(MentionPanelViewModel mentionPanelViewModel, InterfaceC1364105Vn<? super C315650CYx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = mentionPanelViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C315650CYx(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        ArrayList arrayList;
        C1C7U.LIZ("MentionPanelViewModel@8242.refresh$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        MentionPanelViewModel mentionPanelViewModel = this.LL;
        C2252321DDq c2252321DDq = mentionPanelViewModel.LLJ;
        do {
            value = c2252321DDq.getValue();
            List<IMUser> listWQ2 = mentionPanelViewModel.wQ2();
            arrayList = new ArrayList(C15438062q.LJIJJ(listWQ2, 10));
            Iterator<IMUser> it2 = listWQ2.iterator();
            while (it2.hasNext()) {
                arrayList.add(new C1388670mEz(mentionPanelViewModel.LLJJI.size(), it2.next(), true));
            }
        } while (!c2252321DDq.compareAndSet(value, arrayList));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MentionPanelViewModel@8242.refresh$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
