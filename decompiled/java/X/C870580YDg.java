package X;

import java.util.List;

/* JADX INFO: renamed from: X.0YDg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C870580YDg extends AbstractC866690XzH<InterfaceC870590YDh> implements InterfaceC870590YDh {
    public C870580YDg(C0YEF c0yef) {
        super(c0yef, "MsgKvModelProxy");
    }

    @Override // X.InterfaceC870590YDh
    public final boolean LJJZZI(String str) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("deleteByConversationIdAndKey"));
        if (c0yedLIZIZ == null) {
            return false;
        }
        return c0yedLIZIZ.LJIJI().LJIILJJIL().LJJZZI(str);
    }

    @Override // X.InterfaceC870590YDh
    public final List LLILZ(String str) {
        C13BV c13bv = C13BV.INSTANCE;
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("getUuidListByKeyAndConversationId"));
        if (c0yedLIZIZ != null) {
            return c0yedLIZIZ.LJIJI().LJIILJJIL().LLILZ(str);
        }
        return c13bv;
    }

    @Override // X.InterfaceC870590YDh
    public final byte[] LLJ(String str) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("getBinaryValue"));
        if (c0yedLIZIZ == null) {
            return null;
        }
        return c0yedLIZIZ.LJIJI().LJIILJJIL().LLJ(str);
    }

    @Override // X.AbstractC866690XzH
    public final InterfaceC870590YDh LLLJ(C0YED c0yed) {
        return c0yed.LJIJI().LJIILJJIL();
    }

    @Override // X.InterfaceC870590YDh
    public final String LJFF(String str, String str2) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("get"));
        if (c0yedLIZIZ == null) {
            return null;
        }
        return LLLJ(c0yedLIZIZ).LJFF(str, str2);
    }

    @Override // X.InterfaceC870590YDh
    public final boolean LLJJIJI(String str, String str2) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("delete"));
        if (c0yedLIZIZ == null) {
            return false;
        }
        return c0yedLIZIZ.LJIJI().LJIILJJIL().LLJJIJI(str, str2);
    }

    @Override // X.InterfaceC870590YDh
    public final boolean LJJLIIIIJ(String str, String str2, byte[] bArr) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("insertOrUpdateBinaryValue"));
        if (c0yedLIZIZ == null) {
            return false;
        }
        return c0yedLIZIZ.LJIJI().LJIILJJIL().LJJLIIIIJ(str, str2, bArr);
    }

    @Override // X.InterfaceC870590YDh
    public final boolean LLII(String str, String str2, String str3, String str4) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("insertOrUpdate"));
        if (c0yedLIZIZ == null) {
            return false;
        }
        return LLLJ(c0yedLIZIZ).LLII(str, str2, str3, str4);
    }
}
