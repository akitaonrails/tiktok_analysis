package X;

import com.ss.android.ugc.aweme.feed.model.IAdTranslatableData;

/* JADX INFO: renamed from: X.0c4T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C997750c4T {
    public static final C997700c4O LIZ(IAdTranslatableData iAdTranslatableData) {
        if (iAdTranslatableData instanceof C997700c4O) {
            return (C997700c4O) iAdTranslatableData;
        }
        if (iAdTranslatableData instanceof C997740c4S) {
            return (C997700c4O) ((C997740c4S) iAdTranslatableData).LJ.getValue();
        }
        return null;
    }
}
