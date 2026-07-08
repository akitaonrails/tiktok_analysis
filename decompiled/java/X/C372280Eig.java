package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Eig, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C372280Eig extends C2217421BqW implements InterfaceC1631620sYq<NLEModel, Boolean, Boolean, Unit> {
    public C372280Eig(C372050EiJ c372050EiJ) {
        super(3, c372050EiJ, C372050EiJ.class, "onNLEModelDoneNodeChanged", "onNLEModelDoneNodeChanged(Lcom/bytedance/ies/nle/editor_jni/NLEModel;ZZ)V", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(NLEModel nLEModel, Boolean bool, Boolean bool2) {
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        ((C372050EiJ) this.receiver).s7(nLEModel, zBooleanValue, zBooleanValue2);
        return Unit.LIZ;
    }
}
