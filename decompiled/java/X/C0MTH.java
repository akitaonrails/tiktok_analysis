package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.ISkylightOutBridge;
import com.ss.android.ugc.aweme.story.celebration.StoryCelebrationInboxParam;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MTH, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.inbox.view.StoryCelebrationEntranceInterceptor$onClickIntercept$2$1", f = "StoryCelebrationEntranceInterceptor.kt", l = {}, m = "invokeSuspend")
public final class C0MTH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0MTI LL;
    public final /* synthetic */ C0MTL LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MTH(C0MTI c0mti, C0MTL c0mtl, InterfaceC1364105Vn<? super C0MTH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0mti;
        this.LLILLJJLI = c0mtl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0MTH(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Context context;
        LifecycleOwner lifecycleOwnerLIZIZ;
        InterfaceC1891350zJl interfaceC1891350zJl;
        InterfaceC1891350zJl next;
        StoryCelebrationInboxParam storyCelebrationInboxParamLIZ;
        Integer num;
        C1C7U.LIZ("StoryCelebrationEntranceInterceptor@4e21.onClickIntercept$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0MTI c0mti = this.LL;
        View view = this.LLILLJJLI.LIZIZ;
        int i = c0mti.LIZJ;
        String str = c0mti.LIZIZ;
        if (view != null && (context = view.getContext()) != null && (lifecycleOwnerLIZIZ = C0SY5.LIZIZ(context)) != null) {
            InterfaceC1600130rk3 interfaceC1600130rk3LIZLLL = ((ISkylightOutBridge) ServiceManager.get().getService(ISkylightOutBridge.class)).LIZLLL(lifecycleOwnerLIZIZ);
            List<InterfaceC1891350zJl> listI00 = interfaceC1600130rk3LIZLLL.i00();
            String str2 = null;
            if (listI00 != null) {
                Iterator<InterfaceC1891350zJl> it2 = listI00.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        InterfaceC1891350zJl interfaceC1891350zJl2 = next;
                        if ((interfaceC1891350zJl2 instanceof C1598150rgr) && (storyCelebrationInboxParamLIZ = C0MTJ.LIZ(((C1598150rgr) interfaceC1891350zJl2).LL)) != null && (num = storyCelebrationInboxParamLIZ.celebrationType) != null && num.intValue() == i) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                interfaceC1891350zJl = next;
            } else {
                interfaceC1891350zJl = null;
            }
            if (interfaceC1891350zJl != null && (interfaceC1891350zJl instanceof C1598150rgr)) {
                interfaceC1600130rk3LIZLLL.C02(interfaceC1891350zJl);
                StoryCelebrationInboxParam storyCelebrationInboxParamLIZ2 = C0MTJ.LIZ(((C1598150rgr) interfaceC1891350zJl).LL);
                if (storyCelebrationInboxParamLIZ2 != null) {
                    str2 = storyCelebrationInboxParamLIZ2.uniqueId;
                }
                if (i != 2) {
                    C0MTE c0mte = C0MTE.LIZ;
                    String[] strArr = (String[]) ((ArrayList) C13LQ.LJIJI(new String[]{str, str2})).toArray(new String[0]);
                    c0mte.getClass();
                    C0MTE.LIZJ(i, strArr);
                }
            } else if (i != 2) {
                C0MTE c0mte2 = C0MTE.LIZ;
                String[] strArr2 = (String[]) ((ArrayList) C13LQ.LJIJI(new String[]{str})).toArray(new String[0]);
                c0mte2.getClass();
                C0MTE.LIZJ(i, strArr2);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryCelebrationEntranceInterceptor@4e21.onClickIntercept$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
