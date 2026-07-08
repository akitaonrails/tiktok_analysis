package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.0cHt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class C1006070cHt extends C2217421BqW implements InterfaceC1631620sYq<Integer, String, Boolean, Unit> {
    public C1006070cHt(C1630020sWG c1630020sWG) {
        super(3, c1630020sWG, C1630020sWG.class, "setLoadingViewProgress", "setLoadingViewProgress(ILjava/lang/String;Z)V", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(Integer num, String str, Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        ((C1630020sWG) this.receiver).LLLZIIL(num.intValue(), str, zBooleanValue);
        return Unit.LIZ;
    }
}
