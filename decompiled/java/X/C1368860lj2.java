package X;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS34S0010000_21;
import kotlin.jvm.internal.AwS387S0200000_21;
import kotlin.jvm.internal.AwS600S0100000_21;

/* JADX INFO: renamed from: X.0lj2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1368860lj2 implements InterfaceC1368960ljC {
    public final List<InterfaceC1368960ljC> LL;

    @Override // X.InterfaceC1364650lcF
    public final void TU0(int i, boolean z) {
    }

    @Override // X.InterfaceC1368960ljC
    public final void onDestroy() {
        LIZ(AFwS259S0000000_21.get$arr$(395));
    }

    @Override // X.InterfaceC1368960ljC
    public final void onStart() {
        LIZ(AFwS259S0000000_21.get$arr$(396));
    }

    @Override // X.InterfaceC1368960ljC
    public final void onStop() {
        LIZ(AFwS259S0000000_21.get$arr$(397));
    }

    @Override // X.InterfaceC1368960ljC
    public final void E3(SharePackage sharePackage) {
        LIZ(new AwS600S0100000_21(sharePackage, 327));
    }

    @Override // X.InterfaceC1364650lcF
    public final void Ew(boolean z) {
        LIZ(new AwS34S0010000_21(z, 12));
    }

    public final void LIZ(Function1<? super InterfaceC1368960ljC, Unit> function1) {
        Iterator<InterfaceC1368960ljC> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            function1.invoke(it2.next());
        }
    }

    @Override // X.InterfaceC1364650lcF
    public final void N9(boolean z) {
        LIZ(new AwS34S0010000_21(z, 14));
    }

    @Override // X.InterfaceC1364650lcF
    public final void bd(boolean z) {
        LIZ(new AwS34S0010000_21(z, 15));
    }

    @Override // X.InterfaceC1368960ljC
    public final void onCreate(Bundle bundle) {
        LIZ(new AwS600S0100000_21(bundle, 326));
    }

    @Override // X.InterfaceC1364650lcF
    public final void z51(boolean z) {
        LIZ(new AwS34S0010000_21(z, 13));
    }

    @Override // X.InterfaceC1368960ljC
    public final void onViewCreated(View view, Bundle bundle) {
        LIZ(new AwS387S0200000_21(view, bundle, 85));
        TextView textView = (TextView) view.findViewById(R.id.title);
        if (textView != null) {
            textView.setText(view.getContext().getString(2131831535));
        }
    }

    public C1368860lj2(C1368870lj3 c1368870lj3, Map<String, String> map, Map<String, String> map2) {
        this.LL = C1697810uHb.LJIILJJIL(new C1368710lin(c1368870lj3), new C1368790liv(c1368870lj3, map, map2), new C1368810lix(c1368870lj3), new C1368930lj9(c1368870lj3));
    }
}
