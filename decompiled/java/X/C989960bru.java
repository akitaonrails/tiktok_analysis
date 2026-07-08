package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bru, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C989960bru extends AbstractC21321718cJ {
    public final /* synthetic */ Function1<AbstractC989950brt, Unit> LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C989960bru(Function1<? super AbstractC989950brt, Unit> function1) {
        this.LIZ = function1;
    }

    @Override // X.AbstractC21321718cJ
    public final void LIZ(final int i, final String str) {
        AbstractC989950brt abstractC989950brt;
        Function1<AbstractC989950brt, Unit> function1 = this.LIZ;
        if (i == 0) {
            abstractC989950brt = new AbstractC989950brt() { // from class: X.0brw
            };
        } else {
            abstractC989950brt = new AbstractC989950brt(i, str) { // from class: X.0brp
                public final int LIZ;
                public final String LIZIZ;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C989910brp)) {
                        return false;
                    }
                    C989910brp c989910brp = (C989910brp) obj;
                    return this.LIZ == c989910brp.LIZ && Intrinsics.LJFF(this.LIZIZ, c989910brp.LIZIZ);
                }

                public final int hashCode() {
                    int i2 = this.LIZ * 31;
                    String str2 = this.LIZIZ;
                    return i2 + (str2 == null ? 0 : str2.hashCode());
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("ExpressionFailed(errorCode=");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append(", message=");
                    sbLIZ.append(this.LIZIZ);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                {
                    this.LIZ = i;
                    this.LIZIZ = str;
                }
            };
        }
        function1.invoke(abstractC989950brt);
    }

    @Override // X.AbstractC21321718cJ
    public final void LIZIZ(int i, String str, String str2, String str3) {
        AbstractC989950brt c989930brr;
        Function1<AbstractC989950brt, Unit> function1 = this.LIZ;
        if (i == 0) {
            c989930brr = new C989920brq(str, str2);
        } else {
            c989930brr = new C989930brr(i, str, str2, str3);
        }
        function1.invoke(c989930brr);
    }

    @Override // X.AbstractC21321718cJ
    public final void LIZJ(int i, final String str, final String str2, final String str3, String str4) {
        AbstractC989950brt c989940brs;
        Function1<AbstractC989950brt, Unit> function1 = this.LIZ;
        if (i == 0) {
            c989940brs = new AbstractC989950brt(str, str2, str3) { // from class: X.0brv
                public final String LIZ;
                public final String LIZIZ;
                public final String LIZJ;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C989970brv)) {
                        return false;
                    }
                    C989970brv c989970brv = (C989970brv) obj;
                    return Intrinsics.LJFF(this.LIZ, c989970brv.LIZ) && Intrinsics.LJFF(this.LIZIZ, c989970brv.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c989970brv.LIZJ);
                }

                public final int hashCode() {
                    String str5 = this.LIZ;
                    int iHashCode = (str5 == null ? 0 : str5.hashCode()) * 31;
                    String str6 = this.LIZIZ;
                    int iHashCode2 = (iHashCode + (str6 == null ? 0 : str6.hashCode())) * 31;
                    String str7 = this.LIZJ;
                    return iHashCode2 + (str7 != null ? str7.hashCode() : 0);
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("TemplateLoaded(templateName=");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append(", templateUrl=");
                    sbLIZ.append(this.LIZIZ);
                    sbLIZ.append(", origin=");
                    sbLIZ.append(this.LIZJ);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                {
                    this.LIZ = str;
                    this.LIZIZ = str2;
                    this.LIZJ = str3;
                }
            };
        } else {
            c989940brs = new C989940brs(i, str, str2, str4);
        }
        function1.invoke(c989940brs);
    }
}
