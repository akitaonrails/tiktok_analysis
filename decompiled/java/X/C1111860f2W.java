package X;

import com.bytedance.android.livesdk.livesetting.performance.LivePublicScreenVisibleLogSetting;

/* JADX INFO: renamed from: X.0f2W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1111860f2W {
    public AbstractC1111810f2R<? extends InterfaceC1112060f2q, ? extends AbstractC1111020f1A<? extends InterfaceC1112060f2q>> LIZ;

    public final void LIZ(int i) {
        int iV0;
        AbstractC1111810f2R<? extends InterfaceC1112060f2q, ? extends AbstractC1111020f1A<? extends InterfaceC1112060f2q>> abstractC1111810f2R = this.LIZ;
        if (abstractC1111810f2R != null) {
            if (LivePublicScreenVisibleLogSetting.INSTANCE.getValue() && (abstractC1111810f2R instanceof C1111580f24)) {
                abstractC1111810f2R.LIZJ = i;
                AbstractC1111020f1A abstractC1111020f1A = abstractC1111810f2R.LJ;
                if (abstractC1111020f1A != null) {
                    iV0 = abstractC1111020f1A.V0();
                } else {
                    iV0 = 0;
                }
                abstractC1111810f2R.LIZLLL = iV0;
            }
            abstractC1111810f2R.LJIIJJI().LJIIJJI.LJJIJ(abstractC1111810f2R);
        }
    }
}
