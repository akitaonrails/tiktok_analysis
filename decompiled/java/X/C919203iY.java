package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.api.PaymentApi;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.03iY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentResultProcess$toMall$mallDeferred$1", f = "PaymentResultProcess.kt", l = {3830, 3830}, m = "invokeSuspend")
public final class C919203iY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super n>, Object> {
    public int LL;
    public final /* synthetic */ AnonymousClass0957<n> LLILLJJLI;
    public final /* synthetic */ C897703f5 LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C919203iY(AnonymousClass0957<n> anonymousClass0957, C897703f5 c897703f5, String str, String str2, InterfaceC1364105Vn<? super C919203iY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = anonymousClass0957;
        this.LLILLL = c897703f5;
        this.LLILZ = str;
        this.LLILZIL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C919203iY(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Uri uri;
        boolean z;
        n nVar;
        h hVarLJJIIZI;
        Object next;
        Type type;
        C1C7U.LIZ("PaymentResultProcess@6ad4.toMall$mallDeferred$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z2 = true;
        if (i != 0) {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AnonymousClass0957<n> anonymousClass0957 = this.LLILLJJLI;
            if (anonymousClass0957 != null) {
                this.LL = 1;
                obj = anonymousClass0957.LJLIIIL(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("PaymentResultProcess@6ad4.toMall$mallDeferred$1");
                    return objLJFF;
                }
            } else {
                C877403bo c877403bo = PaymentApi.LIZ;
                C897703f5 c897703f5 = this.LLILLL;
                this.LL = 2;
                obj = c877403bo.LJFF(c897703f5, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("PaymentResultProcess@6ad4.toMall$mallDeferred$1");
                    return objLJFF;
                }
            }
        }
        n nVar2 = (n) obj;
        n nVarLJJIJ = null;
        if (nVar2 == null) {
            C1C7U.LIZIZ("PaymentResultProcess@6ad4.toMall$mallDeferred$1");
            return null;
        }
        String str = this.LLILZ;
        String str2 = this.LLILZIL;
        try {
            String strLIZJ = C2399609ak.LIZJ(nVar2.LJJIJ("data"), "shop_tab_schema");
            if (strLIZJ != null && (uri = UriProtector.parse(strLIZJ)) != null) {
                String strLIZLLL = C1976807ok.LIZLLL(uri, "pop_up_schema");
                if (strLIZLLL == null || a0.LJJJIL(strLIZLLL)) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    C1257480ipO.LIZ.storeString(str2, strLIZLLL);
                }
                if (str == null) {
                    C1C7U.LIZIZ("PaymentResultProcess@6ad4.toMall$mallDeferred$1");
                    return null;
                }
                String strLIZLLL2 = C1976807ok.LIZLLL(uri, "diversion_config");
                try {
                    Gson gsonLJFF = C1741890vQh.LJFF();
                    C1120604Zw.LIZ.getClass();
                    C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                    if (c1121904a9LIZIZ == null || !c1121904a9LIZIZ.LJII) {
                        z2 = false;
                    }
                    if (!z2) {
                        type = new TypeToken<n>() { // from class: X.03iZ
                        }.getType();
                    } else {
                        type = C2371409Qy.LIZJ(C13LE.LJ(n.class));
                    }
                    Object objLJIIIIZZ = gsonLJFF.LJIIIIZZ(strLIZLLL2, type);
                    if (!(objLJIIIIZZ instanceof n)) {
                        objLJIIIIZZ = null;
                    }
                    nVar = (n) objLJIIIIZZ;
                } catch (s e) {
                    TryCatchGuardChecker.doCheck(e);
                    nVar = null;
                }
                if (nVar != null && (hVarLJJIIZI = nVar.LJJIIZI("diversion_target_resources")) != null) {
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(hVarLJJIIZI, 10));
                    Iterator<k> it2 = hVarLJJIIZI.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(it2.next().LJIILIIL());
                    }
                    Iterator it3 = arrayList.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next = it3.next();
                            if (Intrinsics.LJFF(C2399609ak.LIZJ((n) next, "name"), "back_to_previous_page")) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    n nVar3 = (n) next;
                    if (nVar3 != null) {
                        nVarLJJIJ = nVar3.LJJIJ("config");
                    }
                }
            } else {
                C1C7U.LIZIZ("PaymentResultProcess@6ad4.toMall$mallDeferred$1");
                return null;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        C1C7U.LIZIZ("PaymentResultProcess@6ad4.toMall$mallDeferred$1");
        return nVarLJJIJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super n> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
