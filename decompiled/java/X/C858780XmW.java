package X;

import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: X.0XmW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C858780XmW {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(List list, boolean z) {
        if (z) {
            Collections.sort(list, new Comparator<AVTextExtraStruct>() { // from class: X.0XmV
                @Override // java.util.Comparator
                public final int compare(AVTextExtraStruct aVTextExtraStruct, AVTextExtraStruct aVTextExtraStruct2) {
                    AVTextExtraStruct aVTextExtraStruct3 = aVTextExtraStruct;
                    AVTextExtraStruct aVTextExtraStruct4 = aVTextExtraStruct2;
                    int i = aVTextExtraStruct3.start;
                    int i2 = aVTextExtraStruct4.start;
                    if (i == i2) {
                        if (!aVTextExtraStruct3.isTransient()) {
                            if (!aVTextExtraStruct4.isTransient()) {
                                return 0;
                            }
                            return 1;
                        }
                        return -1;
                    }
                    if (i < i2) {
                        return -1;
                    }
                    return 1;
                }
            });
        } else {
            Collections.sort(list, new Comparator<AVTextExtraStruct>() { // from class: X.0XmX
                @Override // java.util.Comparator
                public final int compare(AVTextExtraStruct aVTextExtraStruct, AVTextExtraStruct aVTextExtraStruct2) {
                    int i = aVTextExtraStruct.start;
                    int i2 = aVTextExtraStruct2.start;
                    if (i == i2) {
                        return 0;
                    }
                    if (i < i2) {
                        return -1;
                    }
                    return 1;
                }
            });
        }
    }
}
