package X;

import com.ss.android.ugc.aweme.slash.cell.arc.ComposeConfig;
import com.ss.android.ugc.aweme.slash.cell.arc.SlashCellModel;
import com.ss.android.ugc.aweme.slash.component.compose.SlashComposeComponent;
import com.ss.android.ugc.aweme.slash.component.compose.SlashComposeComponentModel;
import java.util.List;

/* JADX INFO: renamed from: X.0hYz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C1208870hYz implements InterfaceC781210Ukh {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC781210Ukh
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void run$0(C1208870hYz c1208870hYz) {
        C1161040gJq c1161040gJq = (C1161040gJq) ((C259800zU) c1208870hYz.l0).element;
        if (c1161040gJq != null) {
            ((C09AJ) c1208870hYz.l1).onNext(C1161040gJq.LIZLLL(c1161040gJq, null, true, null, false, null, null, 125));
        }
        ((C09AJ) c1208870hYz.l1).onComplete();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void run$1(C1208870hYz c1208870hYz) {
        C1161040gJq c1161040gJq = (C1161040gJq) ((C259800zU) c1208870hYz.l0).element;
        if (c1161040gJq != null) {
            ((C09AJ) c1208870hYz.l1).onNext(C1161040gJq.LIZLLL(c1161040gJq, null, true, null, false, null, null, 125));
        }
        ((C09AJ) c1208870hYz.l1).onComplete();
    }

    public static final void run$2(C1208870hYz c1208870hYz) {
        List<SlashCellModel> list;
        SlashComposeComponent slashComposeComponent = (SlashComposeComponent) c1208870hYz.l0;
        ComposeConfig composeConfig = ((SlashComposeComponentModel) c1208870hYz.l1).composeConfig;
        if (composeConfig != null) {
            list = composeConfig.cells;
        } else {
            list = null;
        }
        slashComposeComponent.lp(list);
    }

    public static final void run$3(C1208870hYz c1208870hYz) {
        InterfaceC1181380gqe interfaceC1181380gqe;
        if (!((C013C) c1208870hYz.l0).element && (interfaceC1181380gqe = (InterfaceC1181380gqe) c1208870hYz.l1) != null) {
            interfaceC1181380gqe.onSuccess(null);
        }
    }

    public C1208870hYz(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
