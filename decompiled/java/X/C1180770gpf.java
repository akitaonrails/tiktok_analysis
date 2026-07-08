package X;

import com.google.gson.h;
import com.google.gson.n;

/* JADX INFO: renamed from: X.0gpf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1180770gpf implements InterfaceC736910SvR<Object> {
    public final C1180780gpg LL = new InterfaceC149400hg() { // from class: X.0gpg
    };

    @Override // X.InterfaceC736910SvR
    public final void release() {
    }

    static {
        n nVar = new n();
        Boolean bool = Boolean.TRUE;
        nVar.LJJII(bool, "is_event");
        nVar.LJJIIJ("page_id", "123123123");
        h hVar = new h();
        n nVar2 = new n();
        nVar2.LJJIIJ("node", "product_shelf");
        nVar2.LJJII(bool, "need_rule");
        hVar.LJJIFFI(nVar2);
        nVar.LJJIFFI("node_update_list", hVar);
        nVar.toString();
    }

    @Override // X.InterfaceC736910SvR
    public final /* bridge */ /* synthetic */ InterfaceC149400hg getOperator() {
        return this.LL;
    }
}
