package X;

import android.view.View;
import java.util.Map;

/* JADX INFO: renamed from: X.0i7C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1230080i7C {
    public final EnumC1230500i7s LIZ;
    public final EnumC1229960i70 LIZIZ;
    public final C1229500i6G LIZJ;
    public final String LIZLLL;
    public final Map<String, String> LJ;
    public final boolean LJFF;
    public final View LJI;
    public final boolean LJII;
    public final InterfaceC1229620i6S LJIIIIZZ;

    public C1230080i7C(EnumC1230500i7s enumC1230500i7s, EnumC1229960i70 enumC1229960i70, C1229500i6G c1229500i6G, String str, Map<String, String> map, boolean z, View view, boolean z2, InterfaceC1229620i6S interfaceC1229620i6S) {
        this.LIZ = enumC1230500i7s;
        this.LIZIZ = enumC1229960i70;
        this.LIZJ = c1229500i6G;
        this.LIZLLL = str;
        this.LJ = map;
        this.LJFF = z;
        this.LJI = view;
        this.LJII = z2;
        this.LJIIIIZZ = interfaceC1229620i6S;
    }

    public /* synthetic */ C1230080i7C(EnumC1230500i7s enumC1230500i7s, EnumC1229960i70 enumC1229960i70, C1229500i6G c1229500i6G, String str, Map map, boolean z, View view, boolean z2, InterfaceC1229620i6S interfaceC1229620i6S, int i) {
        this(enumC1230500i7s, enumC1229960i70, c1229500i6G, str, (i & 16) != 0 ? C2097608Jq.LJ() : map, (i & 32) != 0 ? true : z, (i & 64) != 0 ? null : view, (i & 128) != 0 ? true : z2, (i & 256) == 0 ? interfaceC1229620i6S : null);
    }
}
