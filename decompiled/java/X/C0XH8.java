package X;

import android.os.Handler;
import android.os.Message;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.profile.model.TcmImage;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XH8, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.user.presenter.UserApiPresenter$uploadFile$2$1", f = "UserApiPresenter.kt", l = {}, m = "invokeSuspend")
public final class C0XH8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ List<C2259691DcV> LLILZLL;
    public final /* synthetic */ Handler LLIZ;
    public final /* synthetic */ int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0XH8(String str, int i, String str2, String str3, List<? extends C2259691DcV> list, Handler handler, int i2, InterfaceC1364105Vn<? super C0XH8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = i;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = list;
        this.LLIZ = handler;
        this.LLIZLLLIL = i2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0XH8 c0xh8 = new C0XH8(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c0xh8.LL = obj;
        return c0xh8;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        Message messageObtainMessage;
        TcmImage tcmImage;
        Message messageObtainMessage2;
        C1C7U.LIZ("UserApiPresenter@8386.uploadFile$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str = this.LLILLJJLI;
        int i = this.LLILLL;
        String str2 = this.LLILZ;
        String str3 = this.LLILZIL;
        List<C2259691DcV> list = this.LLILZLL;
        Handler handler = this.LLIZ;
        int i2 = this.LLIZLLLIL;
        try {
            C848040XOo.LIZ.getClass();
            c098200Yq = null;
            if (C848040XOo.LIZJ != null) {
                C0XPY.LIZ.getClass();
                C0XHA c0xha = C0XPY.LIZJ;
                if (c0xha == null) {
                    c0xha = null;
                }
                tcmImage = (TcmImage) c0xha.LIZ(str, i, str2, TcmImage.class, str3, list);
            } else {
                tcmImage = null;
            }
            if (handler != null && (messageObtainMessage2 = handler.obtainMessage(i2)) != null) {
                messageObtainMessage2.obj = tcmImage;
                messageObtainMessage2.sendToTarget();
                c098200Yq = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Handler handler2 = this.LLIZ;
        int i3 = this.LLIZLLLIL;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null && handler2 != null && (messageObtainMessage = handler2.obtainMessage(i3)) != null) {
            messageObtainMessage.obj = thM5exceptionOrNullimpl;
            messageObtainMessage.sendToTarget();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UserApiPresenter@8386.uploadFile$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
