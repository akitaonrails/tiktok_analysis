package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0eoe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1103260eoe extends C09AY implements InterfaceC1631620sYq<String, JSONObject, Map<String, ? extends String>, Unit> {
    public final /* synthetic */ AbstractC1103270eof LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1103260eoe(AbstractC1103270eof abstractC1103270eof) {
        super(3);
        this.LL = abstractC1103270eof;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(String str, JSONObject jSONObject, Map<String, ? extends String> map) {
        List<String> list;
        if (this.LL.LJ().containsKey(str) && (list = this.LL.LJ().get(str)) != null) {
            AbstractC1103270eof abstractC1103270eof = this.LL;
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                abstractC1103270eof.LIZLLL(1, it2.next());
            }
        }
        return Unit.LIZ;
    }
}
