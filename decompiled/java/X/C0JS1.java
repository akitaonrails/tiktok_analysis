package X;

import com.bytedance.android.livesdkapi.subscribe.subonlyvideo.SubOnlyVideoOpenParams;

/* JADX INFO: renamed from: X.0JS1, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JS1 {
    public final EnumC492180JRw LIZ;
    public final EnumC492200JRy LIZIZ;
    public final String LIZJ;
    public final Object LIZLLL;
    public final Boolean LJ;
    public final Integer LJFF;
    public final Integer LJI;
    public final SubOnlyVideoOpenParams LJII;

    public C0JS1(EnumC492180JRw enumC492180JRw, EnumC492200JRy enumC492200JRy, String str, Object obj, Boolean bool, Integer num, SubOnlyVideoOpenParams subOnlyVideoOpenParams, int i) {
        str = (i & 4) != 0 ? "" : str;
        obj = (i & 8) != 0 ? null : obj;
        bool = (i & 16) != 0 ? null : bool;
        num = (i & 64) != 0 ? null : num;
        subOnlyVideoOpenParams = (i & 128) != 0 ? null : subOnlyVideoOpenParams;
        this.LIZ = enumC492180JRw;
        this.LIZIZ = enumC492200JRy;
        this.LIZJ = str;
        this.LIZLLL = obj;
        this.LJ = bool;
        this.LJFF = null;
        this.LJI = num;
        this.LJII = subOnlyVideoOpenParams;
    }
}
