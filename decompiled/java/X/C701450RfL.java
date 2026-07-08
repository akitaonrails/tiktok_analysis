package X;

import com.ss.android.ugc.feed.platform.cell.interact.next.ability.FcpAbilityKt$createFcpComponentProtocol$1;
import com.ss.android.ugc.feed.platform.cell.interact.next.ability.StandardPriorityProtocol;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RfL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C701450RfL extends C09AY implements Function1<String, StandardPriorityProtocol> {
    public final /* synthetic */ C701490RfP LL;
    public final /* synthetic */ C704830Rkn LLILLJJLI;
    public final /* synthetic */ C701470RfN LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C701480RfO LLILZIL;
    public final /* synthetic */ C701670Rfh LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C701450RfL(C701490RfP c701490RfP, C704830Rkn c704830Rkn, C701470RfN c701470RfN, String str, C701480RfO c701480RfO, C701670Rfh c701670Rfh) {
        super(1);
        this.LL = c701490RfP;
        this.LLILLJJLI = c704830Rkn;
        this.LLILLL = c701470RfN;
        this.LLILZ = str;
        this.LLILZIL = c701480RfO;
        this.LLILZLL = c701670Rfh;
    }

    @Override // kotlin.jvm.functions.Function1
    public final StandardPriorityProtocol invoke(String str) {
        InterfaceC702540Rh6 interfaceC702540Rh6;
        String str2 = str;
        C701500RfQ c701500RfQ = this.LL.LLILLL;
        WeakReference weakReference = new WeakReference(this.LLILLJJLI);
        c701500RfQ.getClass();
        C701510RfR.LIZ.getClass();
        Function1 function1 = (Function1) ((ConcurrentHashMap) C701510RfR.LIZIZ).get(str2);
        if (function1 != null) {
            interfaceC702540Rh6 = (InterfaceC702540Rh6) function1.invoke(weakReference);
        } else {
            interfaceC702540Rh6 = null;
        }
        if (interfaceC702540Rh6 != null) {
            interfaceC702540Rh6.D6(this.LLILLL.LJIIIIZZ.LIZ());
        }
        String str3 = this.LLILZ;
        return new FcpAbilityKt$createFcpComponentProtocol$1(this.LLILZLL.invoke(str2), this.LLILLL, this.LLILZIL, interfaceC702540Rh6, str2, str3);
    }
}
