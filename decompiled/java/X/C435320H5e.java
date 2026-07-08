package X;

import android.view.View;
import com.bytedance.assem.arch.core.UIAssem;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0H5e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C435320H5e extends C09AY implements Function2<UIAssem, List<C493820JYe>, Unit> {
    public final /* synthetic */ View LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C435320H5e(View view) {
        super(2);
        this.LL = view;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, List<C493820JYe> list) {
        List<C493820JYe> list2 = list;
        if (!list2.isEmpty()) {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) this.LL.findViewById(R.id.evr);
            viewOnAttachStateChangeListenerC20604515jv.getState().LJFF(null);
            viewOnAttachStateChangeListenerC20604515jv.getState().LIZLLL(list2, null);
        }
        return Unit.LIZ;
    }
}
