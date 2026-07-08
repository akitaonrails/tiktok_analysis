package X;

import android.view.ViewStub;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.15Me, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20507015Me {
    public final C424470Gkf LIZ;

    public C20507015Me(ViewStub viewStub) {
        if (viewStub.getParent() != null) {
            viewStub.setLayoutResource(R.layout.aof);
            viewStub.setInflatedId(R.id.oxd);
            this.LIZ = (C424470Gkf) C786410Ut5.LJLLLL(viewStub);
            return;
        }
        this.LIZ = (C424470Gkf) viewStub.findViewById(R.id.oxd);
    }
}
