package X;

import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIBody;
import j27.s;

/* JADX INFO: renamed from: X.0kxM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1339300kxM implements C092O {
    public final int $t;
    public Object l0;

    @Override // X.C092O
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public C1339300kxM(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void accept$0(C1339300kxM c1339300kxM, Object obj) {
        Exception exc = (Exception) obj;
        s sVar = ((LynxUI) c1339300kxM.l0).mContext;
        if (sVar != null) {
            sVar.handleException(exc);
        }
    }

    public static final void accept$1(C1339300kxM c1339300kxM, Object obj) {
        Exception exc = (Exception) obj;
        s sVar = ((UIBody) c1339300kxM.l0).mContext;
        if (sVar != null) {
            sVar.handleException(exc);
        }
    }
}
