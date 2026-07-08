package X;

import X.AbstractC1774570wHP;
import Y.ACListenerS128S0200000_26;

/* JADX INFO: renamed from: X.0wHH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public abstract class AbstractC1774490wHH<VH extends AbstractC1774570wHP> extends AbstractC21673619ry<VH> {
    public C1774560wHO LL;
    public boolean LLILLJJLI = true;
    public int LLILLL = -1;

    @Override // X.AbstractC21673619ry
    /* JADX INFO: renamed from: LLLFZ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(VH vh, int i) {
        boolean z;
        C786410Ut5.I7(new ACListenerS128S0200000_26(this, vh, 14), vh.itemView);
        if (i == this.LLILLL) {
            z = true;
        } else {
            z = false;
        }
        vh.LL = z;
    }
}
