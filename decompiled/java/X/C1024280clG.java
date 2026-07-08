package X;

import com.ss.android.ugc.aweme.translation.model.BatchTranslatableItem;

/* JADX INFO: renamed from: X.0clG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1024280clG {
    public String LIZ;

    public final BatchTranslatableItem LIZ() {
        String str = this.LIZ;
        if (str != null) {
            return new BatchTranslatableItem(str, null, null);
        }
        "srcContent is null".toString();
        throw new IllegalArgumentException("srcContent is null");
    }
}
