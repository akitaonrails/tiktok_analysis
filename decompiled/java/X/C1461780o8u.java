package X;

import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.edit.EditSaveLocalModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0o8u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1461780o8u implements InterfaceC1436400nTy {
    public CreativeModel LLILLJJLI;
    public final C2252321DDq LL = C1BNE.LIZ(new C1461790o8v(0, false));
    public Function0<Boolean> LLILLL = AFwS210S0000000_22.get$arr$(524);

    @Override // X.InterfaceC1436400nTy
    public final void LJIIJ(String str) {
        if (this.LLILLL.invoke().booleanValue()) {
            return;
        }
        z8(0, str);
    }

    @Override // X.InterfaceC1436400nTy
    public final void LJJJLIIL(String str) {
        if (this.LLILLL.invoke().booleanValue()) {
            return;
        }
        this.LL.setValue(new C1461790o8v(0, false));
    }

    @Override // X.InterfaceC1436400nTy
    public final void e4(Integer num, String str) {
        CreativeModel creativeModel;
        EditSaveLocalModel editSaveLocalModel;
        int i;
        if (!this.LLILLL.invoke().booleanValue() && (creativeModel = this.LLILLJJLI) != null && (editSaveLocalModel = creativeModel.editSaveLocalModel) != null && (i = editSaveLocalModel.saveLocalProgress) >= 0) {
            z8(i, str);
        }
    }

    @Override // X.InterfaceC1436400nTy
    public final void z8(int i, String str) {
        String str2;
        EditSaveLocalModel editSaveLocalModel;
        EditSaveLocalModel editSaveLocalModel2;
        if (this.LLILLL.invoke().booleanValue()) {
            return;
        }
        CreativeModel creativeModel = this.LLILLJJLI;
        if (creativeModel != null && (editSaveLocalModel2 = creativeModel.editSaveLocalModel) != null) {
            str2 = editSaveLocalModel2.flowId;
        } else {
            str2 = null;
        }
        if (Intrinsics.LJFF(str2, str)) {
            CreativeModel creativeModel2 = this.LLILLJJLI;
            if (creativeModel2 != null && (editSaveLocalModel = creativeModel2.editSaveLocalModel) != null) {
                editSaveLocalModel.saveLocalProgress = i;
            }
            this.LL.setValue(new C1461790o8v(i, true));
            return;
        }
        this.LL.setValue(new C1461790o8v(0, false));
    }

    public final void LIZ(Lifecycle lifecycle, CreativeModel creativeModel, Function0<Boolean> function0) {
        this.LLILLJJLI = creativeModel;
        this.LLILLL = function0;
        C0CHQ.LIZ().getPublishService().LJJJJL(lifecycle, this);
        this.LL.setValue(new C1461790o8v(0, false));
    }
}
