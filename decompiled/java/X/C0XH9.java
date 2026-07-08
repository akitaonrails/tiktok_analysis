package X;

import android.os.Handler;
import android.os.Message;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XH9, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.user.presenter.UserApiPresenter$uploadFile$1$1", f = "UserApiPresenter.kt", l = {}, m = "invokeSuspend")
public final class C0XH9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ List<C2259691DcV> LLILZIL;
    public final /* synthetic */ Handler LLILZLL;
    public final /* synthetic */ int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0XH9(String str, int i, String str2, List<? extends C2259691DcV> list, Handler handler, int i2, InterfaceC1364105Vn<? super C0XH9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = i;
        this.LLILZ = str2;
        this.LLILZIL = list;
        this.LLILZLL = handler;
        this.LLIZ = i2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0XH9 c0xh9 = new C0XH9(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c0xh9.LL = obj;
        return c0xh9;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        Message messageObtainMessage;
        AvatarUri avatarUri;
        Message messageObtainMessage2;
        C1C7U.LIZ("UserApiPresenter@8386.uploadFile$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str = this.LLILLJJLI;
        int i = this.LLILLL;
        String str2 = this.LLILZ;
        List<C2259691DcV> list = this.LLILZIL;
        Handler handler = this.LLILZLL;
        int i2 = this.LLIZ;
        try {
            C848040XOo.LIZ.getClass();
            c098200Yq = null;
            if (C848040XOo.LIZJ != null) {
                C0XPY.LIZ.getClass();
                C0XHA c0xha = C0XPY.LIZJ;
                if (c0xha == null) {
                    c0xha = null;
                }
                avatarUri = (AvatarUri) c0xha.LIZ(str, i, str2, AvatarUri.class, "data", list);
            } else {
                avatarUri = null;
            }
            if (handler != null && (messageObtainMessage2 = handler.obtainMessage(i2)) != null) {
                messageObtainMessage2.obj = avatarUri;
                messageObtainMessage2.sendToTarget();
                c098200Yq = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Handler handler2 = this.LLILZLL;
        int i3 = this.LLIZ;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null && handler2 != null && (messageObtainMessage = handler2.obtainMessage(i3)) != null) {
            messageObtainMessage.obj = thM5exceptionOrNullimpl;
            messageObtainMessage.sendToTarget();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UserApiPresenter@8386.uploadFile$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
