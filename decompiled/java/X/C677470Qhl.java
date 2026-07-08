package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Qhl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C677470Qhl extends AbstractC677840QiM implements C14NM {
    public final int LLILZIL;

    @Override // X.C14NM
    public final int getContentType() {
        return this.LLILZIL;
    }

    public C677470Qhl(int i) {
        this.LLILZIL = i;
    }

    @Override // X.AbstractC677840QiM, X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C677470Qhl) {
            return Intrinsics.LJFF(interfaceC1891350zJl, this);
        }
        return false;
    }

    @Override // X.AbstractC677840QiM, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        Integer numValueOf;
        Integer numValueOf2;
        String str;
        String str2;
        boolean z = false;
        if (interfaceC1891350zJl instanceof C677470Qhl) {
            AbstractC677840QiM abstractC677840QiM = (AbstractC677840QiM) interfaceC1891350zJl;
            AbstractC677870QiP abstractC677870QiP = abstractC677840QiM.LL;
            Integer numValueOf3 = null;
            if (abstractC677870QiP != null) {
                numValueOf = Integer.valueOf(abstractC677870QiP.LIZIZ);
            } else {
                numValueOf = null;
            }
            AbstractC677870QiP abstractC677870QiP2 = this.LL;
            if (abstractC677870QiP2 != null) {
                numValueOf2 = Integer.valueOf(abstractC677870QiP2.LIZIZ);
            } else {
                numValueOf2 = null;
            }
            if (Intrinsics.LJFF(numValueOf, numValueOf2)) {
                AbstractC677870QiP abstractC677870QiP3 = abstractC677840QiM.LL;
                if (abstractC677870QiP3 != null) {
                    str = abstractC677870QiP3.LIZJ;
                } else {
                    str = null;
                }
                AbstractC677870QiP abstractC677870QiP4 = this.LL;
                if (abstractC677870QiP4 != null) {
                    str2 = abstractC677870QiP4.LIZJ;
                } else {
                    str2 = null;
                }
                if (Intrinsics.LJFF(str, str2)) {
                    z = true;
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("areItemTheSame: value=");
            sbLIZ.append(z);
            sbLIZ.append("; type=");
            AbstractC677870QiP abstractC677870QiP5 = abstractC677840QiM.LL;
            if (abstractC677870QiP5 != null) {
                numValueOf3 = Integer.valueOf(abstractC677870QiP5.LIZIZ);
            }
            sbLIZ.append(numValueOf3);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        return z;
    }

    @Override // X.AbstractC677840QiM, X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return new Object();
    }
}
