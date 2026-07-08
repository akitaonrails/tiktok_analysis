package X;

import com.ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0lTi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1359360lTi {
    public final C1359460lTs LIZ;
    public boolean LIZIZ;

    public C1359360lTi(C1359460lTs c1359460lTs) {
        this.LIZ = c1359460lTs;
    }

    public final void LIZ(String str, List<? extends TextExtraStruct> list) {
        boolean z;
        if (this.LIZIZ) {
            return;
        }
        this.LIZIZ = true;
        boolean z2 = false;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("publish textAdded -> enterMethodOverride=auto_after_repost (enterMethod=");
            sbLIZ.append(this.LIZ.LIZIZ);
            sbLIZ.append("); exit handled in doPublish");
            C429430Gsf.LIZ("RepostTextEncourageInputPublisher", C2188811AlT.LIZIZ(sbLIZ));
            InterfaceC1631620sYq<? super String, ? super List<? extends TextExtraStruct>, ? super String, Unit> interfaceC1631620sYq = this.LIZ.LIZJ;
            if (interfaceC1631620sYq != null) {
                interfaceC1631620sYq.invoke(str, list, "auto_after_repost");
                return;
            }
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("publish skip (empty text) -> recordPopupSkip (enterMethod=");
        sbLIZ2.append(this.LIZ.LIZIZ);
        sbLIZ2.append(')');
        C429430Gsf.LIZ("RepostTextEncourageInputPublisher", C2188811AlT.LIZIZ(sbLIZ2));
        if (C263720AVe.LIZ()) {
            C1358720lSg.LIZ.getClass();
            int i = C1358720lSg.LIZIZ().getInt(C1358720lSg.LIZ("tt_repost_text_encourage_skip_count"), 0) + 1;
            C1358720lSg.LIZIZ().storeInt(C1358720lSg.LIZ("tt_repost_text_encourage_skip_count"), i);
            int iIntValue = ((Number) C0B0Q.LIZ.getValue()).intValue();
            if (i >= iIntValue) {
                z2 = true;
                C1358720lSg.LIZIZ().storeBoolean(C1358720lSg.LIZ("tt_repost_text_encourage_exit_flag_v2"), true);
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("recordPopupSkip skip=");
            sbLIZ3.append(i);
            sbLIZ3.append(", limit=");
            sbLIZ3.append(iIntValue);
            sbLIZ3.append(", setExit=");
            sbLIZ3.append(z2);
            C429430Gsf.LIZ("RepostTextEncourageExit", C2188811AlT.LIZIZ(sbLIZ3));
        }
        InterfaceC1631620sYq<? super String, ? super List<? extends TextExtraStruct>, ? super String, Unit> interfaceC1631620sYq2 = this.LIZ.LIZJ;
        if (interfaceC1631620sYq2 == null) {
            return;
        }
        interfaceC1631620sYq2.invoke(null, null, null);
    }
}
