package X;

import com.bytedance.android.livesdk.livesetting.feed.LiveCardComponentReversalConfigSetting;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0c6w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C999280c6w {
    public static final void LIZ(EnumC999300c6y enumC999300c6y, Function0<Unit> function0) {
        if (!LiveCardComponentReversalConfigSetting.reversalComponent(enumC999300c6y.getComponentName().getValue())) {
            function0.invoke();
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reversalCheck componentName: ");
        sbLIZ.append(enumC999300c6y.getComponentName().getValue());
        C20441214yg.LJIIIZ("ComponentDescriptor", C2188811AlT.LIZIZ(sbLIZ));
    }
}
