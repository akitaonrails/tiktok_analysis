package X;

import com.bytedance.im.core.proto.Response;

/* JADX INFO: renamed from: X.0Ztc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class C914140Ztc implements InterfaceC594300NSq {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC594300NSq
    public final void onFailure(C0X9S<Response> c0x9s, Throwable th) {
        switch (this.$t) {
            case 0:
                onFailure$0(this, c0x9s, th);
                break;
            case 1:
                onFailure$1(this, c0x9s, th);
                break;
        }
    }

    @Override // X.InterfaceC594300NSq
    public final void onResponse(C0X9S<Response> c0x9s, C0X52<Response> c0x52) {
        switch (this.$t) {
            case 0:
                onResponse$0(this, c0x9s, c0x52);
                break;
            case 1:
                onResponse$1(this, c0x9s, c0x52);
                break;
        }
    }

    public C914140Ztc(C914120Zta c914120Zta, int i) {
        this.$t = i;
        this.l0 = c914120Zta;
    }

    public static final void onFailure$0(C914140Ztc c914140Ztc, C0X9S c0x9s, Throwable th) {
        InterfaceC863600XuI interfaceC863600XuI = (InterfaceC863600XuI) c914140Ztc.l0;
        C0Z64.LIZ.getClass();
        interfaceC863600XuI.LIZIZ(C0Z64.LIZIZ(th));
    }

    public static final void onFailure$1(C914140Ztc c914140Ztc, C0X9S c0x9s, Throwable th) {
        InterfaceC863600XuI interfaceC863600XuI = (InterfaceC863600XuI) c914140Ztc.l0;
        C0Z64.LIZ.getClass();
        interfaceC863600XuI.LIZIZ(C0Z64.LIZIZ(th));
    }

    public static final void onResponse$0(C914140Ztc c914140Ztc, C0X9S c0x9s, C0X52 c0x52) {
        ((InterfaceC863600XuI) c914140Ztc.l0).onSuccess(c0x52.LIZIZ);
    }

    public static final void onResponse$1(C914140Ztc c914140Ztc, C0X9S c0x9s, C0X52 c0x52) {
        ((InterfaceC863600XuI) c914140Ztc.l0).onSuccess(c0x52.LIZIZ);
    }
}
