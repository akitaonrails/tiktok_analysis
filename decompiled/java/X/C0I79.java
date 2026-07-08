package X;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0I79, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I79 {
    public static InputConnection LIZ(final InputConnection inputConnection, EditorInfo editorInfo, final C0I77 c0i77) {
        String[] stringArray;
        if (editorInfo != null) {
            if (Build.VERSION.SDK_INT >= 25) {
                return new InputConnectionWrapper(inputConnection) { // from class: X.0I76
                    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
                    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
                        C0I70 c0i70;
                        C0I77 c0i772 = c0i77;
                        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
                            c0i70 = new C0I70(new C0I71(inputContentInfo));
                        } else {
                            c0i70 = null;
                        }
                        if (c0i772.LIZ(c0i70, i, bundle)) {
                            return true;
                        }
                        return super.commitContent(inputContentInfo, i, bundle);
                    }
                };
            }
            String[] strArr = C1695010uD5.LIZ;
            Bundle bundle = editorInfo.extras;
            if (bundle != null && ((stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES")) != null || (stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES")) != null)) {
                strArr = stringArray;
            }
            if (strArr.length == 0) {
                return inputConnection;
            }
            return new InputConnectionWrapper(inputConnection) { // from class: X.0I78
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r6v3, types: [android.os.ResultReceiver] */
                /* JADX WARN: Type inference failed for: r8v0 */
                /* JADX WARN: Type inference failed for: r8v1, types: [int] */
                /* JADX WARN: Type inference failed for: r8v3 */
                /* JADX WARN: Type inference failed for: r8v4 */
                @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
                public final boolean performPrivateCommand(String str, Bundle bundle2) throws Throwable {
                    boolean z;
                    String str2;
                    String str3;
                    String str4;
                    String str5;
                    String str6;
                    String str7;
                    C0I77 c0i772 = c0i77;
                    ?? LIZ = 0;
                    LIZ = 0;
                    if (bundle2 != null) {
                        if (TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                            z = false;
                        } else if (TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                            z = true;
                        }
                        ResultReceiver resultReceiver = null;
                        try {
                            if (!z) {
                                str2 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
                            } else {
                                str2 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
                            }
                        } catch (Throwable th) {
                            th = th;
                        }
                        try {
                            ?? r6 = (ResultReceiver) bundle2.getParcelable(str2);
                            if (!z) {
                                str3 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";
                            } else {
                                str3 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";
                            }
                            Uri uri = (Uri) bundle2.getParcelable(str3);
                            if (z) {
                                str4 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
                            } else {
                                str4 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
                            }
                            ClipDescription clipDescription = (ClipDescription) bundle2.getParcelable(str4);
                            if (z) {
                                str5 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
                            } else {
                                str5 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
                            }
                            Uri uri2 = (Uri) bundle2.getParcelable(str5);
                            if (z) {
                                str6 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
                            } else {
                                str6 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
                            }
                            int i = bundle2.getInt(str6);
                            if (z) {
                                str7 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
                            } else {
                                str7 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
                            }
                            Bundle bundle3 = (Bundle) bundle2.getParcelable(str7);
                            if (uri != null && clipDescription != null) {
                                LIZ = c0i772.LIZ(new C0I70(uri, clipDescription, uri2), i, bundle3);
                            }
                            if (r6 != 0) {
                                r6.send(LIZ, null);
                            }
                            if (LIZ != 0) {
                                return true;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            TryCatchGuardChecker.doCheck(th);
                            if (0 != 0) {
                                resultReceiver.send(0, null);
                            }
                            throw th;
                        }
                    }
                    return super.performPrivateCommand(str, bundle2);
                }
            };
        }
        throw new NullPointerException("editorInfo must be non-null");
    }
}
