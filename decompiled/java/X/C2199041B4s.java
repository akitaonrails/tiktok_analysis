package X;

import android.os.Handler;
import android.os.Message;
import com.ss.android.ugc.aweme.tablet.impl.business.login.QRCodeLoginViewModel;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.1B4s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tablet.impl.business.login.QRCodeLoginViewModel$checkStatus$1", f = "QRCodeLoginViewModel.kt", l = {232}, m = "invokeSuspend")
public final class C2199041B4s extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C05XL<Unit> LLILLJJLI;
    public final /* synthetic */ QRCodeLoginViewModel LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2199041B4s(C05XL<Unit> c05xl, QRCodeLoginViewModel qRCodeLoginViewModel, String str, InterfaceC1364105Vn<? super C2199041B4s> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c05xl;
        this.LLILLL = qRCodeLoginViewModel;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2199041B4s(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Object next;
        String msg;
        int iIntValue;
        Integer errorCode;
        C1C7U.LIZ("QRCodeLoginViewModel@3062.checkStatus$1");
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
            C05XL<Unit> c05xl = this.LLILLJJLI;
            this.LL = 1;
            if (c05xl.LJLIIIL(this) == objLJFF) {
                C1C7U.LIZIZ("QRCodeLoginViewModel@3062.checkStatus$1");
                return objLJFF;
            }
        }
        HashMap<String, EnumC2199071B4v> map = this.LLILLL.LLJI;
        EnumC2199071B4v enumC2199071B4v = EnumC2199071B4v.CONFIRMED;
        if (map.containsValue(enumC2199071B4v)) {
            this.LLILLL.LLILLJJLI.postValue(enumC2199071B4v);
        } else {
            HashMap<String, EnumC2199071B4v> map2 = this.LLILLL.LLJI;
            EnumC2199071B4v enumC2199071B4v2 = EnumC2199071B4v.EXPIRED;
            if (!map2.containsValue(enumC2199071B4v2) && !this.LLILLL.LLJI.containsValue(EnumC2199071B4v.REFUSED)) {
                HashMap<String, EnumC2199071B4v> map3 = this.LLILLL.LLJI;
                EnumC2199071B4v enumC2199071B4v3 = EnumC2199071B4v.SCANNED;
                if (map3.containsValue(enumC2199071B4v3) && !((ConcurrentHashSet) this.LLILLL.LLIZ.getValue()).contains(this.LLILZ)) {
                    this.LLILLL.LLILLJJLI.postValue(enumC2199071B4v3);
                    ((ConcurrentHashSet) this.LLILLL.LLIZ.getValue()).add(this.LLILZ);
                    Handler handler = (Handler) this.LLILLL.LLILZLL.getValue();
                    Message messageObtain = Message.obtain();
                    String str2 = this.LLILZ;
                    messageObtain.what = 2000;
                    messageObtain.obj = str2;
                    Boolean.valueOf(handler.sendMessageDelayed(messageObtain, 2000L));
                } else {
                    HashMap<String, EnumC2199071B4v> map4 = this.LLILLL.LLJI;
                    EnumC2199071B4v enumC2199071B4v4 = EnumC2199071B4v.ERROR;
                    if (map4.containsValue(enumC2199071B4v4)) {
                        this.LLILLL.LLILLJJLI.postValue(enumC2199071B4v4);
                        Iterator<T> it2 = this.LLILLL.LLJI.values().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (Intrinsics.LJFF(((EnumC2199071B4v) next).getValue(), EnumC2199071B4v.ERROR.getValue())) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        EnumC2199071B4v enumC2199071B4v5 = (EnumC2199071B4v) next;
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LJIIIIZZ("platform", "qr_code");
                        c2344009Gk.LJIIIIZZ("login_panel_type", C19252910Tv.LIZIZ.LIZLLL().LJIJ().LIZ());
                        if (enumC2199071B4v5 == null || (msg = enumC2199071B4v5.getMsg()) == null) {
                            msg = "";
                        }
                        c2344009Gk.LJIIIIZZ("error_desc", msg);
                        if (enumC2199071B4v5 != null && (errorCode = enumC2199071B4v5.getErrorCode()) != null) {
                            iIntValue = errorCode.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        c2344009Gk.LIZJ(iIntValue, "error_code");
                        C20684815ws.LJIILLIIL("login_failure", c2344009Gk.LIZ);
                    } else {
                        Handler handler2 = (Handler) this.LLILLL.LLILZLL.getValue();
                        Message messageObtain2 = Message.obtain();
                        String str3 = this.LLILZ;
                        messageObtain2.what = 2000;
                        messageObtain2.obj = str3;
                        Boolean.valueOf(handler2.sendMessageDelayed(messageObtain2, 1100L));
                    }
                }
            } else {
                this.LLILLL.LLILLJJLI.postValue(enumC2199071B4v2);
                if (this.LLILLL.LLJI.containsValue(enumC2199071B4v2)) {
                    str = "qr_code_expired";
                } else {
                    str = "qr_code_refused";
                }
                C2344009Gk c2344009Gk2 = new C2344009Gk();
                c2344009Gk2.LJIIIIZZ("platform", "qr_code");
                c2344009Gk2.LJIIIIZZ("login_panel_type", C19252910Tv.LIZIZ.LIZLLL().LJIJ().LIZ());
                c2344009Gk2.LJIIIIZZ("error_desc", str);
                C20684815ws.LJIILLIIL("login_failure", c2344009Gk2.LIZ);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("QRCodeLoginViewModel@3062.checkStatus$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
