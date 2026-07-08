package X;

import com.ss.android.ugc.aweme.comment.plus.assem.CommentPlusPanelAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0lBo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class C1348260lBo extends C2217421BqW implements Function2<InterfaceC1348290lBr, C0T4M, Unit> {
    public C1348260lBo(Object obj) {
        super(2, obj, CommentPlusPanelAssem.class, "dispatchClick", "dispatchClick(Lcom/ss/android/ugc/aweme/comment/plus/Button;Lcom/ss/android/ugc/aweme/comment/plus/ButtonContext;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1348290lBr interfaceC1348290lBr, C0T4M c0t4m) {
        InterfaceC1348290lBr interfaceC1348290lBr2 = interfaceC1348290lBr;
        this.receiver.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dispatchClick id=");
        sbLIZ.append(interfaceC1348290lBr2.getId());
        C1344030l4z.LIZJ("CommentPlusPanelAssem", C2188811AlT.LIZIZ(sbLIZ));
        interfaceC1348290lBr2.LIZJ(c0t4m);
        return Unit.LIZ;
    }
}
