package X;

import X.InterfaceC1891350zJl;
import java.util.List;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.18Ul, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21292918Ul<T extends InterfaceC1891350zJl> implements InterfaceC607860Nsm {
    public static final C21292918Ul<T> LIZ = new C21292918Ul<>();

    @Override // X.InterfaceC607860Nsm
    public final InterfaceC1891350zJl LIZ(List list, C869590Y9l c869590Y9l, int i, String str) {
        String strLJ;
        C21291018Ts c21291018TsLIZ = C21290118Tj.LIZ(c869590Y9l);
        if (c21291018TsLIZ != null) {
            strLJ = c21291018TsLIZ.LIZ;
        } else {
            strLJ = null;
        }
        String uuid = c869590Y9l.getUuid();
        if (strLJ == null) {
            strLJ = C21291518Tx.LJ(EnumC21291418Tw.REGENERATE_TITLE_TEXT, new Object[0]);
        }
        return new C910280ZnO(uuid, strLJ, new C1622006Ws(C452501pT.LIZIZ(new AwS576S0100000_32(c869590Y9l, 904))), new C909930Zmp(c869590Y9l));
    }
}
