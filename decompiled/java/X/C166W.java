package X;

import X.InterfaceC340040DUs;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.powerlist.PowerCell;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.166W, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C166W<A extends PowerCell<?>, T extends InterfaceC340040DUs> extends C166U<A, T> {
    public C166W(Function1<? super A, ? extends T> function1) {
        super(function1);
    }

    @Override // X.C166U
    public final boolean LIZIZ(Object obj) {
        if (((RecyclerView.ViewHolder) obj).itemView != null) {
            return true;
        }
        return false;
    }

    @Override // X.C166U
    public final /* bridge */ /* synthetic */ String LIZJ(Object obj) {
        return "in ViewBinding.onBind PowerCell's view is null, make sure viewbinding is accessed after onCreateItemView";
    }
}
