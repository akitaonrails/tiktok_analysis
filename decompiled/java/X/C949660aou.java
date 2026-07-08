package X;

import android.view.View;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0aou, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C949660aou extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ C949690aox LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C949660aou(C949690aox c949690aox) {
        super(1);
        this.LL = c949690aox;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        C949690aox c949690aox = this.LL;
        InterfaceC937090aUd interfaceC937090aUd = c949690aox.LL;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C949720ap0(2, c949690aox.itemView.getContext().getString(2131854068)));
        arrayList.add(new C949720ap0(3, c949690aox.itemView.getContext().getString(2131853920)));
        arrayList.add(new C949720ap0(6, c949690aox.itemView.getContext().getString(2131854020)));
        arrayList.add(new C949720ap0(5, c949690aox.itemView.getContext().getString(2131843568)));
        arrayList.add(new C949720ap0(8, c949690aox.itemView.getContext().getString(2131852903)));
        arrayList.add(new C949720ap0(1, c949690aox.itemView.getContext().getString(2131852495)));
        interfaceC937090aUd.pe(arrayList);
        return Unit.LIZ;
    }
}
