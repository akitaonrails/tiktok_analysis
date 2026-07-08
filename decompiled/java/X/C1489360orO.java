package X;

import android.icu.text.AlphabeticIndex;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.contacts.api.util.ContactLocaleUtilBase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: X.0orO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1489360orO implements ContactLocaleUtilBase {
    public final AlphabeticIndex.ImmutableIndex<?> LIZ;
    public final int LIZIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C1489360orO(List<Locale> list) {
        AlphabeticIndex maxLabelCount = new AlphabeticIndex((Locale) ListProtector.get(list, 0)).setMaxLabelCount(100);
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            maxLabelCount.addLabels(it2.next());
        }
        AlphabeticIndex.ImmutableIndex<?> immutableIndexBuildImmutableIndex = maxLabelCount.buildImmutableIndex();
        this.LIZ = immutableIndexBuildImmutableIndex;
        this.LIZIZ = immutableIndexBuildImmutableIndex.getBucketCount();
    }

    @Override // com.ss.android.ugc.aweme.im.contacts.api.util.ContactLocaleUtilBase
    public final String LIZ(String str) {
        boolean z;
        int iLIZLLL;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int i2 = 0;
        do {
            if (i2 < str.length()) {
                iLIZLLL = LIZLLL(i2, str);
                if (iLIZLLL >= 10) {
                    if (iLIZLLL == 99) {
                        i2++;
                    }
                }
                sb.append(String.valueOf(iLIZLLL));
                i++;
                i2++;
            } else {
                iLIZLLL = 0;
            }
            sb.append(CardStruct.IStatusCode.DEFAULT);
            sb.append(String.valueOf(iLIZLLL));
            i++;
            i2++;
        } while (i < 12);
        return sb.toString();
    }

    @Override // com.ss.android.ugc.aweme.im.contacts.api.util.ContactLocaleUtilBase
    public final String LIZIZ(String str) {
        int iLIZJ;
        if ((str != null && C1489350orN.LIZLLL(str)) || (iLIZJ = LIZJ(str)) < 0 || iLIZJ >= this.LIZIZ + 1) {
            return "#";
        }
        return this.LIZ.getBucket(iLIZJ).getLabel();
    }

    public int LIZJ(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return -1;
        }
        try {
            int bucketIndex = this.LIZ.getBucketIndex(str);
            if (this.LIZ.getBucket(bucketIndex).getLabelType() != AlphabeticIndex.Bucket.LabelType.NORMAL) {
                return -1;
            }
            return bucketIndex;
        } catch (ArrayIndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
            return -1;
        }
    }

    public int LIZLLL(int i, String str) {
        int iLIZJ = LIZJ(str.substring(i, i + 1));
        if (iLIZJ == -1) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt)) {
                return ((this.LIZIZ + 1) + cCharAt) - 65;
            }
            if (Character.isLowerCase(cCharAt)) {
                return (((this.LIZIZ + 1) + cCharAt) - 97) + 26;
            }
            if (Character.isDigit(cCharAt)) {
                return (((this.LIZIZ + 1) + cCharAt) - 48) + 52;
            }
            if (C1489350orN.LJFF(cCharAt)) {
                return this.LIZIZ + 1 + 62;
            }
            if (C1489350orN.LIZLLL(str.substring(i))) {
                return 99;
            }
            return this.LIZIZ + 1 + 63;
        }
        return iLIZJ;
    }
}
