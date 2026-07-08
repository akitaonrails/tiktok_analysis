package X;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05BC, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.util.GroupMemberUtil$updateRecentMentionsAndNotify$2", f = "GroupMemberUtil.kt", l = {299}, m = "invokeSuspend")
public final class C05BC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05BC(String str, InterfaceC1364105Vn<? super C05BC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05BC(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        CopyOnWriteArraySet<C05QR> copyOnWriteArraySet;
        C1C7U.LIZ("GroupMemberUtil@7ee8.updateRecentMentionsAndNotify$2");
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
            C1461005nk c1461005nk = C1461005nk.LIZ;
            String str = this.LLILLJJLI;
            c1461005nk.getClass();
            Set<String> setLJII = C1461005nk.LJII(str);
            C05B9 c05b9 = C05B9.LIZ;
            String str2 = this.LLILLJJLI;
            this.LL = 1;
            obj = c05b9.LIZJ(str2, setLJII, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("GroupMemberUtil@7ee8.updateRecentMentionsAndNotify$2");
                return objLJFF;
            }
        }
        if (((Boolean) obj).booleanValue() && (copyOnWriteArraySet = C1461005nk.LIZIZ.get(this.LLILLJJLI)) != null) {
            String str3 = this.LLILLJJLI;
            Iterator<C05QR> it2 = copyOnWriteArraySet.iterator();
            while (it2.hasNext()) {
                it2.next().WB2(str3);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GroupMemberUtil@7ee8.updateRecentMentionsAndNotify$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
