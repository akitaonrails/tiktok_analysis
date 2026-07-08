package X;

import android.content.Context;
import java.io.File;

/* JADX INFO: renamed from: X.08nA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2221808nA extends AbstractC2220208mu {
    public final File LJII;
    public final String LJIIIIZZ;

    public C2221808nA(Context context, String str, C0VSJ c0vsj) {
        super(context, str);
        this.LJII = c0vsj;
        this.LJIIIIZZ = "^lib/([^/]+)/([^/]+\\.so)$";
    }
}
