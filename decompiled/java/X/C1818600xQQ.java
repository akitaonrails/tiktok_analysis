package X;

import android.view.View;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.layout.imageselector.SceneryLayoutSelectorAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xQQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1818600xQQ extends C09AY implements Function0<View> {
    public final /* synthetic */ SceneryLayoutSelectorAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1818600xQQ(SceneryLayoutSelectorAssem sceneryLayoutSelectorAssem) {
        super(0);
        this.LL = sceneryLayoutSelectorAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final View invoke() {
        return this.LL.LJJIJL().findViewById(R.id.g02);
    }
}
