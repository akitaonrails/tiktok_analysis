package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PCq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C641100PCq {
    /* JADX WARN: Multi-variable type inference failed */
    public static final SearchServiceCenter$AutoPlayAbility LIZ(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof InterfaceC713360RyY) {
            return (SearchServiceCenter$AutoPlayAbility) C1558520qew.LIZ(C1558420qem.LIZIZ((InterfaceC713360RyY) viewHolder), SearchServiceCenter$AutoPlayAbility.class, null);
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558360qeg.LJIIL(viewHolder.itemView, null, 3);
        if (interfaceC665370Q7zLJIIL == null) {
            return null;
        }
        return (SearchServiceCenter$AutoPlayAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL, SearchServiceCenter$AutoPlayAbility.class, null);
    }

    public static final InterfaceC665370Q7z LIZIZ(View view) {
        while (!Intrinsics.LJFF(view.getTag(R.id.u74), Unit.LIZ)) {
            Object parent = view.getParent();
            if (!(parent instanceof View) || (view = (View) parent) == null) {
                return null;
            }
        }
        return C1558360qeg.LJ(view, null);
    }
}
