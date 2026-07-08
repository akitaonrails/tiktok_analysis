package X;

import Y.ARunnableS82S0200000_13;
import com.google.gson.k;
import com.ss.android.ugc.aweme.legoImp.task.dm.ldp.URLUploadResponseBody;

/* JADX INFO: renamed from: X.0Xg1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C854750Xg1 implements InterfaceC594300NSq {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC594300NSq
    public final void onFailure(C0X9S<k> c0x9s, Throwable th) {
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
    public final void onResponse(C0X9S<k> c0x9s, C0X52<k> c0x52) {
        switch (this.$t) {
            case 0:
                onResponse$0(this, c0x9s, c0x52);
                break;
            case 1:
                onResponse$1(this, c0x9s, c0x52);
                break;
        }
    }

    public C854750Xg1(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onFailure$0(C854750Xg1 c854750Xg1, C0X9S c0x9s, Throwable th) {
        if (C0XPR.LJ) {
            C823050WQl.LIZIZ().submit(new Runnable() { // from class: X.0XPQ
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("TTSettingDataManager@a031.getTTSettingDataFromNet$1$onFailure$1");
                    try {
                        C0XPR.LIZ.getClass();
                        C0XPR.LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("TTSettingDataManager@a031.getTTSettingDataFromNet$1$onFailure$1");
                }
            });
        } else {
            C0XPR.LIZ.getClass();
            C0XPR.LIZ();
        }
    }

    public static final void onFailure$1(C854750Xg1 c854750Xg1, C0X9S c0x9s, Throwable th) {
        ((InterfaceC823620WSq) c854750Xg1.l0).LIZ("network failed", false);
    }

    public static final void onResponse$0(C854750Xg1 c854750Xg1, C0X9S c0x9s, C0X52 c0x52) {
        C823050WQl.LIZIZ().submit(new ARunnableS82S0200000_13((C259800zU) c854750Xg1.l0, c0x52, 43));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onResponse$1(C854750Xg1 c854750Xg1, C0X9S c0x9s, C0X52 c0x52) {
        if (((URLUploadResponseBody) c0x52.LIZIZ).code != 0) {
            ((InterfaceC823620WSq) c854750Xg1.l0).LIZ("code not zero", false);
        } else {
            ((InterfaceC823620WSq) c854750Xg1.l0).LIZ("success", true);
        }
    }
}
