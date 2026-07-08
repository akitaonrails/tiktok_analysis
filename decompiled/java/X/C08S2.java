package X;

import com.bytedance.retrofit2.mime.TypedString;

/* JADX INFO: renamed from: X.08S2, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08S2 {
    /* JADX WARN: Type inference failed for: r0v1, types: [X.08S1] */
    public static final C08S1 LIZ(final String str) {
        if (str != null) {
            return new TypedString(str) { // from class: X.08S1
                @Override // com.bytedance.retrofit2.mime.TypedByteArray, com.bytedance.retrofit2.mime.AbsTypedOutput, com.bytedance.retrofit2.mime.TypedOutput
                public final String mimeType() {
                    return "text/plain; charset=UTF-8";
                }

                {
                    super(str == null ? "" : str);
                }
            };
        }
        return null;
    }
}
