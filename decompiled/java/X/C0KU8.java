package X;

import com.ss.android.ugc.aweme.services.draft.IDraftListener;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0KU8, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KU8 implements InterfaceC557100Lt6 {
    public static final C0KU8 LIZ = new C0KU8();
    public static final List<IDraftListener> LIZIZ = new ArrayList();

    @Override // X.InterfaceC557100Lt6
    public final void registerListener(IDraftListener iDraftListener) {
        List<IDraftListener> list = LIZIZ;
        if (!((ArrayList) list).contains(iDraftListener)) {
            ((ArrayList) list).add(iDraftListener);
        }
    }

    @Override // X.InterfaceC557100Lt6
    public final void unregisterListener(IDraftListener iDraftListener) {
        ((ArrayList) LIZIZ).remove(iDraftListener);
    }
}
