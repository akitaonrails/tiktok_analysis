package X;

import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.PreviewBulletinEditWidget;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01Pk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C329001Pk extends C09AY implements Function1<Map<String, ? extends String>, Unit> {
    public final /* synthetic */ PreviewBulletinEditWidget LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C329001Pk(PreviewBulletinEditWidget previewBulletinEditWidget) {
        super(1);
        this.LL = previewBulletinEditWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Map<String, ? extends String> map) {
        Map<String, ? extends String> map2 = map;
        if (map2 != null && !map2.isEmpty()) {
            PreviewBulletinEditWidget previewBulletinEditWidget = this.LL;
            previewBulletinEditWidget.LLJILJILJ = false;
            String str = map2.get("show_entrance");
            if (str == null && (str = map2.get("enter_from")) == null) {
                str = this.LL.LLJ;
            }
            previewBulletinEditWidget.LLJ = str;
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LL), null, null, new C328801Pi(this.LL, map2, null), 3);
        }
        return Unit.LIZ;
    }
}
