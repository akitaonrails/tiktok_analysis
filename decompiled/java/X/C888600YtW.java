package X;

import java.util.LinkedHashMap;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0YtW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C888600YtW implements C06AS {
    @Override // X.C06AS
    public final void clear() {
    }

    @Override // X.C06AS
    public final Unit LIZIZ() {
        if (C0BBN.LIZ() == 2 || C0BBN.LIZ() == 3) {
            C888590YtV.LIZ.getClass();
            C888590YtV.LIZ("click_inbox");
        }
        return Unit.LIZ;
    }

    @Override // X.C06AS
    public final Unit LIZLLL() {
        if (C0BBN.LIZ() == 3) {
            C0CN5.LIZLLL(C2286608xc.LJFF(500L), "enter_inbox", new Runnable() { // from class: X.0YtY
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ChatListViewHolderPreloadTask@6ee2.onInboxWorkerHire$2");
                    try {
                        C888590YtV.LIZ.getClass();
                        C888590YtV.LIZ("preload_worker_hire");
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ChatListViewHolderPreloadTask@6ee2.onInboxWorkerHire$2");
                }
            });
        }
        return Unit.LIZ;
    }

    @Override // X.C06AS
    public final Unit LIZ() {
        return Unit.LIZ;
    }

    @Override // X.C06AS
    public final Unit init() {
        return Unit.LIZ;
    }

    @Override // X.C06AS
    public final Unit LIZJ(C885880Yp8 c885880Yp8) {
        return Unit.LIZ;
    }

    @Override // X.C06AS
    public final Object LJ(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return Unit.LIZ;
    }

    @Override // X.C06AS
    public final Unit LJFF(C1619080sEc c1619080sEc) {
        Integer num = (Integer) ((LinkedHashMap) c1619080sEc.LIZ).get(29999);
        if (num != null && num.intValue() != 0) {
            if (C0BBN.LIZ() == 1 || C0BBN.LIZ() == 2 || C0BBN.LIZ() == 3) {
                C0CN5.LIZLLL(C2286608xc.LJFF(500L), "enter_inbox", new Runnable() { // from class: X.0YtZ
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("ChatListViewHolderPreloadTask@6ee2.onUnreadCountUpdate$2");
                        try {
                            C888590YtV.LIZ.getClass();
                            C888590YtV.LIZ("red_dot_show");
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("ChatListViewHolderPreloadTask@6ee2.onUnreadCountUpdate$2");
                    }
                });
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }
}
