package X;

import com.ss.android.ugc.aweme.im.common.setting.IMImageShowEventSamplingRateSetting;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0ZaU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C902280ZaU {
    public static final AbstractC1492605sq LIZ(final String str, String str2) {
        final float fFloatValue;
        IMImageShowEventSamplingRateSetting.LIZ.getClass();
        Map<String, Float> map = ((IMImageShowEventSamplingRateSetting.IMImageCacheSizeConfig) IMImageShowEventSamplingRateSetting.LIZJ.getValue()).sampRateMap;
        Iterator<T> it2 = map.keySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            String str3 = (String) it2.next();
            if (u.LJJIIJZLJL(str2, str3, false)) {
                Float f = map.get(str3);
                if (f != null) {
                    fFloatValue = f.floatValue();
                    if (fFloatValue == 1.0f) {
                        return new AbstractC1492605sq(str) { // from class: X.0Hmk
                            public final String LJ;

                            public final boolean equals(Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                return (obj instanceof C451240Hmk) && Intrinsics.LJFF(this.LJ, ((C451240Hmk) obj).LJ);
                            }

                            public final int hashCode() {
                                return this.LJ.hashCode();
                            }

                            @Override // X.AbstractC1492605sq
                            public final String toString() {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("ImageShowEventWithoutSampleKey(imageId=");
                                sbLIZ.append(this.LJ);
                                sbLIZ.append(')');
                                return C2188811AlT.LIZIZ(sbLIZ);
                            }

                            {
                                super("aweme_im_image_show_full_report", str, EnumC1492905st.TEA, 4);
                                this.LJ = str;
                            }
                        };
                    }
                }
            }
        }
        fFloatValue = 0.1f;
        return new AbstractC1492605sq(str, fFloatValue) { // from class: X.05yT
            public final String LJ;
            public final float LJFF;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1527505yT)) {
                    return false;
                }
                C1527505yT c1527505yT = (C1527505yT) obj;
                return Intrinsics.LJFF(this.LJ, c1527505yT.LJ) && Float.compare(this.LJFF, c1527505yT.LJFF) == 0;
            }

            @Override // X.AbstractC1492605sq
            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ImageShowEventKey(imageId=");
                sbLIZ.append(this.LJ);
                sbLIZ.append(", samplingRate=");
                sbLIZ.append(this.LJFF);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            public final int hashCode() {
                return (this.LJ.hashCode() * 31) + Float.floatToIntBits(this.LJFF);
            }

            @Override // X.AbstractC1492605sq
            public final float LIZ() {
                return this.LJFF;
            }

            {
                super("aweme_im_image_show", str, fFloatValue, EnumC1492905st.TEA);
                this.LJ = str;
                this.LJFF = fFloatValue;
            }
        };
    }
}
