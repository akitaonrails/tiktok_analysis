package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.087T, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C087T implements C087U {
    public final Keva LIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeatureInfo(kevaMap=");
        sbLIZ.append(this.LIZ.getAll());
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C087T(Keva keva) {
        this.LIZ = keva;
    }

    @Override // X.C087U
    public final Number addFeature(String str, Number number, boolean z) {
        if (number != null) {
            float fFloatValue = number.floatValue();
            if (z && fFloatValue <= 0.0f) {
                return C1923007g4.LIZIZ(this.LIZ.getString(str, null));
            }
            Number numberLIZIZ = C1923007g4.LIZIZ(this.LIZ.getString(str, null));
            if (numberLIZIZ != null) {
                fFloatValue += numberLIZIZ.floatValue();
            }
            this.LIZ.storeString(str, String.valueOf(fFloatValue));
            return Float.valueOf(fFloatValue);
        }
        return C1923007g4.LIZIZ(this.LIZ.getString(str, null));
    }

    @Override // X.C087U
    public final void setFeature(String str, Number number, boolean z) {
        if (number != null) {
            float fFloatValue = number.floatValue();
            if (z && fFloatValue < 0.0f) {
                return;
            }
            this.LIZ.storeString(str, String.valueOf(fFloatValue));
            return;
        }
        this.LIZ.erase(str);
    }
}
