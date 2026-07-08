package X;

import android.content.Context;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Ccx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C317770Ccx {
    public static final /* synthetic */ int LIZ = 0;

    public static final String LIZ(Context context, Integer num) {
        if (context != null && num != null) {
            if (num.intValue() == 1) {
                return context.getResources().getString(R.string.jqm);
            }
            if (num.intValue() == 2) {
                return context.getResources().getString(R.string.hz7);
            }
        }
        return "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0020, code lost:
    
        if (r4.equals("following") != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(android.content.Context r3, java.lang.String r4) {
        /*
            java.lang.String r2 = ""
            if (r3 != 0) goto L5
            return r2
        L5:
            if (r4 == 0) goto L22
            int r1 = r4.hashCode()
            r0 = -600094315(0xffffffffdc3b4995, float:-2.108669E17)
            if (r1 == r0) goto L23
            r0 = 301801488(0x11fd2010, float:3.9936122E-28)
            if (r1 == r0) goto L33
            r0 = 765915793(0x2da6f291, float:1.8979736E-11)
            if (r1 != r0) goto L22
            java.lang.String r0 = "following"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L3c
        L22:
            return r2
        L23:
            java.lang.String r0 = "friends"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L22
            r0 = 2131832369(0x7f112e31, float:1.929779E38)
            java.lang.String r0 = r3.getString(r0)
            return r0
        L33:
            java.lang.String r0 = "followed"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L3c
            return r2
        L3c:
            r0 = 2131834790(0x7f1137a6, float:1.93027E38)
            java.lang.String r0 = r3.getString(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C317770Ccx.LIZIZ(android.content.Context, java.lang.String):java.lang.String");
    }
}
