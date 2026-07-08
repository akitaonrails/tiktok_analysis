package X;

import android.content.Context;
import android.view.View;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0txb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1685410txb implements Function1<Context, View> {
    public final int LL;
    public C20247014Ke LLILLJJLI;

    public final C20247014Ke LIZ() {
        C20247014Ke c20247014Ke = this.LLILLJJLI;
        if (c20247014Ke != null) {
            return c20247014Ke;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AndroidView has not created a container for ");
        sbLIZ.append(this.LL);
        sbLIZ.append(" yet");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalStateException(strLIZIZ);
    }

    public C1685410txb(int i) {
        this.LL = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final View invoke(Context context) {
        C20247014Ke c20247014Ke = new C20247014Ke(context);
        c20247014Ke.setId(this.LL);
        this.LLILLJJLI = c20247014Ke;
        return c20247014Ke;
    }
}
