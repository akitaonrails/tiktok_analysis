package X;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.android.live.layer.BaseLayeredElementManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0eDz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1080530eDz extends AbstractC1080560eE2 {
    public final int LJIIL;
    public final int LJIILIIL;
    public final List<Function1<Boolean, Unit>> LJIILJJIL;
    public final List<Function1<Boolean, Unit>> LJIILL;

    @Override // X.AbstractC1080560eE2
    public final int LIZ() {
        return 0;
    }

    @Override // com.bytedance.ies.sdk.widgets.LayeredElementContext
    public final boolean isAnchor() {
        return false;
    }

    public C1080530eDz(Context context, ViewGroup viewGroup, DataChannel dataChannel, BaseLayeredElementManager<C1080530eDz> baseLayeredElementManager) {
        super(context, viewGroup, dataChannel, baseLayeredElementManager);
        this.LJIIL = context.getResources().getDimensionPixelSize(R.dimen.as3);
        this.LJIILIIL = this.LJI + this.LIZLLL;
        this.LJIILJJIL = new ArrayList();
        this.LJIILL = new ArrayList();
    }
}
