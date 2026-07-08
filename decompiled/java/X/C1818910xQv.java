package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.operationbtm.SceneryBtmOperationAssem;
import com.bytedance.assem.arch.core.UIAssem;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0xQv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1818910xQv extends C09AY implements Function2<UIAssem, C291001Au<? extends Bitmap>, Unit> {
    public final /* synthetic */ SceneryBtmOperationAssem LL;
    public final /* synthetic */ View LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1818910xQv(SceneryBtmOperationAssem sceneryBtmOperationAssem, View view) {
        super(2);
        this.LL = sceneryBtmOperationAssem;
        this.LLILLJJLI = view;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, C291001Au<? extends Bitmap> c291001Au) {
        boolean z;
        C291001Au<? extends Bitmap> c291001Au2 = c291001Au;
        LiveIconView liveIconViewLo = this.LL.Lo();
        if (c291001Au2.LIZ != 0) {
            z = true;
        } else {
            z = false;
        }
        liveIconViewLo.setEnabled(z);
        Context contextLJIIIIZZ = C1834150xpV.LJIIIIZZ(this.LLILLJJLI.getContext());
        if (c291001Au2.LIZ != 0) {
            this.LL.Lo().setIconTint(C20736316Cj.LIZIZ(R.attr.exp, contextLJIIIIZZ));
        } else {
            this.LL.Lo().setIconTint(C20736316Cj.LIZIZ(R.attr.ez3, contextLJIIIIZZ));
        }
        return Unit.LIZ;
    }
}
