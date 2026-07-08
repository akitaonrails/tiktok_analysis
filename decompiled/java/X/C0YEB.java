package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0YEB, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YEB implements InterfaceC863600XuI<Object> {
    public final /* synthetic */ C871610YHf LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ int LIZJ;
    public final /* synthetic */ Integer LIZLLL;

    @Override // X.InterfaceC863600XuI
    public final void LIZIZ(C0YMW c0ymw) {
        Integer num = this.LIZLLL;
        if (num != null) {
            ((ConcurrentHashMap) this.LIZ.LIZJ).put(this.LIZIZ, num);
        }
        C882400YjW.LIZ.getClass();
        C882400YjW.LIZLLL();
        C882690Yjz.LJIIIZ("UnreadCountModelImpl", "Report unread count failed");
    }

    @Override // X.InterfaceC863600XuI
    public final void onSuccess(Object obj) {
        C882400YjW.LIZ.getClass();
        C882400YjW.LIZLLL();
        C882690Yjz.LJIIIZ("UnreadCountModelImpl", "Report unread count succesfull");
        ((ConcurrentHashMap) this.LIZ.LIZJ).put(this.LIZIZ, Integer.valueOf(this.LIZJ));
    }

    public C0YEB(C871610YHf c871610YHf, String str, int i, Integer num) {
        this.LIZ = c871610YHf;
        this.LIZIZ = str;
        this.LIZJ = i;
        this.LIZLLL = num;
    }
}
