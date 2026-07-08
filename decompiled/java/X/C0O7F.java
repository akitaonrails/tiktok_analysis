package X;

/* JADX INFO: renamed from: X.0O7F, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O7F {
    public static final EnumC614130O6x LIZJ(C0O8O c0o8o) {
        EnumC614130O6x enumC614130O6x;
        C0O8I c0o8i = (C0O8I) c0o8o.LIZ(C0O8I.LIZJ);
        if (c0o8i == null || (enumC614130O6x = c0o8i.LIZIZ) == null) {
            return EnumC614130O6x.Net;
        }
        return enumC614130O6x;
    }

    public static final C0O3U LIZLLL(C0O8O c0o8o) throws C614090O6t {
        C0O3U c0o3u;
        C0O8J c0o8j = (C0O8J) c0o8o.LIZ(C0O8J.LIZJ);
        if (c0o8j != null && (c0o3u = c0o8j.LIZIZ) != null) {
            return c0o3u;
        }
        throw new C614090O6t("Please specific the retrofitBuilder in globalContext or MotaCall");
    }

    public static final void LIZ(C613960O6g c613960O6g, AbstractC614210O7f abstractC614210O7f) {
        c613960O6g.LIZ(new C0O8F(abstractC614210O7f));
    }

    public static final void LIZIZ(C613960O6g c613960O6g, C0O3P c0o3p) {
        c613960O6g.LIZ(new C0O8G(c0o3p));
    }

    public static final void LJ(C613960O6g c613960O6g, InterfaceC613660O5c interfaceC613660O5c) {
        c613960O6g.LIZ(new C0O8B(interfaceC613660O5c));
    }

    public static final void LJFF(C613960O6g c613960O6g, C0O3E c0o3e) {
        c613960O6g.LIZ(new C0O8C(c0o3e));
    }

    public static final void LJI(C613960O6g c613960O6g, C0O3U c0o3u) {
        c613960O6g.LIZ(new C0O8J(c0o3u));
    }

    public static final void LJII(C613960O6g c613960O6g, C613690O5f c613690O5f) {
        c613960O6g.LIZ(new C0O8K(c613690O5f));
    }
}
