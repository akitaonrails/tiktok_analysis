package X;

import com.bytedance.retrofit2.client.Request;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.BaseResponse;

/* JADX INFO: renamed from: X.0pYl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1516250pYl<R> implements C0X9S<R> {
    public final C0X9S<R> LL;

    @Override // X.C0X9S
    public final void cancel() {
        this.LL.cancel();
    }

    @Override // X.C0X9S
    public final boolean isCanceled() {
        return this.LL.isCanceled();
    }

    @Override // X.C0X9S
    public final boolean isExecuted() {
        return this.LL.isExecuted();
    }

    @Override // X.C0X9S
    public final Request request() {
        return this.LL.request();
    }

    @Override // X.C0X9S
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final C0X9S<R> m57clone() {
        return new C1516250pYl(this.LL.m57clone());
    }

    @Override // X.C0X9S
    public final C0X52<R> execute() {
        C0X52<R> c0x52Execute = this.LL.execute();
        LIZ(c0x52Execute);
        return c0x52Execute;
    }

    public C1516250pYl(C0X9S<R> c0x9s) {
        this.LL = c0x9s;
    }

    public final void LIZ(C0X52<R> c0x52) {
        R r;
        if (c0x52 != null) {
            r = c0x52.LIZIZ;
        } else {
            r = (R) null;
        }
        if (r instanceof BaseResponse) {
            BaseResponse baseResponse = r;
            if (!baseResponse.isSuccess()) {
                Request request = this.LL.request();
                String host = request.getHost();
                String str = "";
                if (host == null) {
                    host = "";
                }
                String path = request.getPath();
                if (path != null) {
                    str = path;
                }
                new C335000DBi(C2097608Jq.LJ(), new Object[0]).logAd(C2249531D2x.LIZ, "", "", null, new C2249521D2w(host, str, baseResponse.getStatusCode(), baseResponse.getMessage()));
            }
        }
    }

    @Override // X.C0X9S
    public final void enqueue(final InterfaceC594300NSq<R> interfaceC594300NSq) {
        this.LL.enqueue(new InterfaceC594300NSq<R>(this) { // from class: X.0pYk
            public final /* synthetic */ C1516250pYl<R> LL;

            {
                this.LL = this;
            }

            @Override // X.InterfaceC594300NSq
            public final void onFailure(C0X9S<R> c0x9s, Throwable th) {
                InterfaceC594300NSq<R> interfaceC594300NSq2 = interfaceC594300NSq;
                if (interfaceC594300NSq2 != null) {
                    interfaceC594300NSq2.onFailure(c0x9s, th);
                }
            }

            @Override // X.InterfaceC594300NSq
            public final void onResponse(C0X9S<R> c0x9s, C0X52<R> c0x52) {
                this.LL.LIZ(c0x52);
                InterfaceC594300NSq<R> interfaceC594300NSq2 = interfaceC594300NSq;
                if (interfaceC594300NSq2 != null) {
                    interfaceC594300NSq2.onResponse(c0x9s, c0x52);
                }
            }
        });
    }
}
