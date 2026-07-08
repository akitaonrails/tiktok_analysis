package X;

import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.11rV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19632311rV {
    public final InterfaceC1212360hec<User> LIZ;
    public final InterfaceC19632811ra LIZIZ;
    public final int LIZJ;
    public final InterfaceC19632511rX LIZLLL;
    public final C11NJ LJ;
    public C19633011rc LJFF;

    public C19632311rV(InterfaceC1212360hec<User> interfaceC1212360hec, InterfaceC19632811ra interfaceC19632811ra, int i) {
        this.LIZ = interfaceC1212360hec;
        this.LIZIZ = interfaceC19632811ra;
        this.LIZJ = i;
        InterfaceC19632511rX.LIZ.getClass();
        this.LIZLLL = (InterfaceC19632511rX) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.LIZ).create(InterfaceC19632511rX.class);
        this.LJ = new C11NJ();
        this.LJFF = new C19633011rc(0, false);
    }

    public final void LIZ(List<User> list, C19633011rc c19633011rc, boolean z) {
        C19632711rZ c19632711rZ;
        C19632711rZ c19632711rZ2;
        if (z) {
            if (C086I.LIZIZ(list)) {
                return;
            }
            InterfaceC19632811ra interfaceC19632811ra = this.LIZIZ;
            if (interfaceC19632811ra == null || (c19632711rZ2 = interfaceC19632811ra.LJ()) == null) {
                c19632711rZ2 = new C19632711rZ(0);
            }
            if (this.LIZJ == 0) {
                if (c19632711rZ2.LIZ == null) {
                    c19632711rZ2.LIZ = new ArrayList();
                }
                List<User> list2 = c19632711rZ2.LIZ;
                if (list2 != null) {
                    list2.addAll(list);
                }
                c19632711rZ2.LIZIZ = c19633011rc;
            } else {
                if (c19632711rZ2.LIZJ == null) {
                    c19632711rZ2.LIZJ = new ArrayList();
                }
                List<User> list3 = c19632711rZ2.LIZJ;
                if (list3 != null) {
                    list3.addAll(list);
                }
                c19632711rZ2.LIZLLL = c19633011rc;
            }
            InterfaceC19632811ra interfaceC19632811ra2 = this.LIZIZ;
            if (interfaceC19632811ra2 != null) {
                interfaceC19632811ra2.LIZLLL(c19632711rZ2);
                return;
            }
            return;
        }
        if (C086I.LIZIZ(list)) {
            return;
        }
        InterfaceC19632811ra interfaceC19632811ra3 = this.LIZIZ;
        if (interfaceC19632811ra3 == null || (c19632711rZ = interfaceC19632811ra3.LJ()) == null) {
            c19632711rZ = new C19632711rZ(0);
        }
        if (this.LIZJ == 0) {
            c19632711rZ.LIZ = list;
            c19632711rZ.LIZIZ = c19633011rc;
        } else {
            c19632711rZ.LIZJ = list;
            c19632711rZ.LIZLLL = c19633011rc;
        }
        InterfaceC19632811ra interfaceC19632811ra4 = this.LIZIZ;
        if (interfaceC19632811ra4 != null) {
            interfaceC19632811ra4.LIZLLL(c19632711rZ);
        }
    }
}
