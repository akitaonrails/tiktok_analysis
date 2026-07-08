package X;

import android.os.Bundle;
import com.google.gson.n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: renamed from: X.0cL8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1008080cL8 {
    public final Bundle LIZ;
    public final String LIZIZ;
    public final InterfaceC1020440cf4 LIZJ;
    public final Function1<n, n> LIZLLL;
    public final String LJ;

    public /* synthetic */ C1008080cL8(Bundle bundle, String str, InterfaceC1020440cf4 interfaceC1020440cf4, AwS595S0100000_16 awS595S0100000_16, int i) {
        this((i & 1) != 0 ? null : bundle, (i & 2) != 0 ? null : str, interfaceC1020440cf4, (i & 8) != 0 ? null : awS595S0100000_16, (String) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1008080cL8(Bundle bundle, String str, InterfaceC1020440cf4 interfaceC1020440cf4, Function1<? super n, n> function1, String str2) {
        this.LIZ = bundle;
        this.LIZIZ = str;
        this.LIZJ = interfaceC1020440cf4;
        this.LIZLLL = function1;
        this.LJ = str2;
    }
}
