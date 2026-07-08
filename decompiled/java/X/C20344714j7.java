package X;

import android.content.SharedPreferences;
import com.aweme.kvstorage.spi.ISharedPreferencesProvider;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: renamed from: X.14j7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20344714j7 implements InterfaceC20344814j8 {
    public static final ISharedPreferencesProvider LJI = (ISharedPreferencesProvider) PluggableExtentionKt.pluggableSpi$default(ISharedPreferencesProvider.class, false, false, false, 14, null);
    public final String LIZ;
    public final String LIZIZ;
    public final C589160N8w LIZJ;
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1536));
    public final SharedPreferences LJ;
    public final SharedPreferences.Editor LJFF;

    public final C20344714j7 LJIIJ() {
        this.LJFF.apply();
        return this;
    }

    @Override // X.InterfaceC20344814j8
    public final EnumC20429814wq LJ() {
        return EnumC20429814wq.SP;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C20344714j7(int r4, X.C589160N8w r5, java.lang.String r6, java.lang.String r7) {
        /*
            r3 = this;
            r3.<init>()
            r3.LIZ = r6
            r3.LIZIZ = r7
            r3.LIZJ = r5
            kotlin.jvm.internal.AwS575S0100000_31 r1 = new kotlin.jvm.internal.AwS575S0100000_31
            r0 = 1536(0x600, float:2.152E-42)
            r1.<init>(r3, r0)
            X.01GW r0 = X.C452501pT.LIZIZ(r1)
            r3.LIZLLL = r0
            X.14wq r0 = X.EnumC20429814wq.SP
            java.lang.String r0 = X.C2192411ArH.LIZIZ(r7, r5, r0, r6)
            if (r0 == 0) goto L1f
            r6 = r0
        L1f:
            com.aweme.kvstorage.spi.ISharedPreferencesProvider r2 = X.C20344714j7.LJI
            r1 = 0
            if (r2 == 0) goto L2f
            android.content.Context r0 = X.C2188841AlW.LIZ
            if (r0 != 0) goto L29
            r0 = r1
        L29:
            android.content.SharedPreferences r0 = r2.LIZ(r0, r4, r6)
            if (r0 != 0) goto L38
        L2f:
            android.content.Context r0 = X.C2188841AlW.LIZ
            if (r0 == 0) goto L34
            r1 = r0
        L34:
            android.content.SharedPreferences r0 = X.C810670Vr7.LIZJ(r1, r4, r6)
        L38:
            r3.LJ = r0
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r3.LJFF = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20344714j7.<init>(int, X.0N8w, java.lang.String, java.lang.String):void");
    }
}
