package X;

import android.app.Activity;
import android.content.ComponentName;
import com.bytedance.ies.powerlist.PowerAdapter;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15jh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20603115jh extends C09AY implements Function0<String> {
    public final /* synthetic */ PowerAdapter LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20603115jh(PowerAdapter powerAdapter) {
        super(0);
        this.LL = powerAdapter;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        ComponentName componentName;
        String string;
        String str;
        PowerAdapter powerAdapter = this.LL;
        C20603715jn c20603715jn = powerAdapter.LLJJJ;
        if (c20603715jn != null && (str = c20603715jn.LJIIIZ) != null) {
            return str;
        }
        Activity activity = (Activity) powerAdapter.LLJILJILJ.getValue();
        return (activity == null || (componentName = activity.getComponentName()) == null || (string = componentName.toString()) == null) ? "power-default-list" : string;
    }
}
