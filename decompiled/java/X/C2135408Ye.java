package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.story.InboxGroupChatSocialStatusViewModelImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08Ye, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.InboxGroupChatSocialStatusViewModelImpl$onGroupIdListChange$1", f = "InboxGroupChatSocialStatusViewModelImpl.kt", l = {}, m = "invokeSuspend")
public final class C2135408Ye extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<String> LL;
    public final /* synthetic */ InboxGroupChatSocialStatusViewModelImpl LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2135408Ye(List<String> list, InboxGroupChatSocialStatusViewModelImpl inboxGroupChatSocialStatusViewModelImpl, InterfaceC1364105Vn<? super C2135408Ye> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = inboxGroupChatSocialStatusViewModelImpl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2135408Ye(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("InboxGroupChatSocialStatusViewModelImpl@9cd5.onGroupIdListChange$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<String> list = this.LL;
        InboxGroupChatSocialStatusViewModelImpl inboxGroupChatSocialStatusViewModelImpl = this.LLILLJJLI;
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            String str2 = str;
            inboxGroupChatSocialStatusViewModelImpl.getClass();
            if (C0ZFW.LIZ.LJIIIZ(C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str2))) {
                synchronized (inboxGroupChatSocialStatusViewModelImpl.LL) {
                    try {
                        z = !inboxGroupChatSocialStatusViewModelImpl.LL.containsKey(str2);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                if (z) {
                    arrayList.add(str);
                }
            }
        }
        List listLL = C13LP.LL(arrayList, ((Number) C18006073k.LIZ.getValue()).intValue());
        InboxGroupChatSocialStatusViewModelImpl inboxGroupChatSocialStatusViewModelImpl2 = this.LLILLJJLI;
        Iterator it2 = listLL.iterator();
        while (it2.hasNext()) {
            inboxGroupChatSocialStatusViewModelImpl2.vQ2((String) it2.next(), false);
        }
        this.LLILLJJLI.zQ2();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InboxGroupChatSocialStatusViewModelImpl@9cd5.onGroupIdListChange$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
