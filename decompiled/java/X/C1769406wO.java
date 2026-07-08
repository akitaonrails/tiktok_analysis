package X;

import com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewAssem;
import com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewItem;

/* JADX INFO: renamed from: X.06wO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1769406wO implements InterfaceC1680560tpm {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1680560tpm
    public final void dispose() {
        switch (this.$t) {
            case 0:
                dispose$0(this);
                break;
            case 1:
                dispose$1(this);
                break;
            case 2:
                dispose$2(this);
                break;
        }
    }

    public static final void dispose$0(C1769406wO c1769406wO) {
        InterfaceC1361305Ul interfaceC1361305Ul = (InterfaceC1361305Ul) c1769406wO.l0;
        if (interfaceC1361305Ul != null) {
            interfaceC1361305Ul.Of(((TakoContentPreviewItem.Image) c1769406wO.l1).itemUUID, true);
        }
    }

    public static final void dispose$1(C1769406wO c1769406wO) {
        for (TakoContentPreviewItem takoContentPreviewItem : ((C05UN) c1769406wO.l0).LIZLLL().LL) {
            InterfaceC1361305Ul interfaceC1361305UlNo = ((TakoContentPreviewAssem) c1769406wO.l1).No();
            if (interfaceC1361305UlNo != null) {
                interfaceC1361305UlNo.Of(takoContentPreviewItem.Ic(), true);
            }
        }
    }

    public static final void dispose$2(C1769406wO c1769406wO) {
        if (((C1677480tko) c1769406wO.l0).LJ()) {
            C23250099c.LIZLLL((InterfaceC497601wk) c1769406wO.l1, null, null, new C05S8((C1677480tko) c1769406wO.l0, null), 3);
        }
    }

    public C1769406wO(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
