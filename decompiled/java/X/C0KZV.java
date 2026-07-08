package X;

import com.bytedance.android.livesdk.api.revenue.enigma.IEnigmaService;
import com.bytedance.android.livesdk.impl.revenue.enigma.widget.EnigmaWidget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;

/* JADX INFO: renamed from: X.0KZV, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KZV extends AbstractC1081700eFs<Object> {
    public final RecyclableWidgetManager LIZ;

    @Override // X.AbstractC1081700eFs
    public final Object LIZIZ() {
        EnigmaWidget enigmaWidgetNX1 = ((IEnigmaService) C1161920gLG.LIZJ(IEnigmaService.class)).nX1();
        if (enigmaWidgetNX1 == null) {
            return null;
        }
        this.LIZ.load(enigmaWidgetNX1);
        return null;
    }

    public C0KZV(RecyclableWidgetManager recyclableWidgetManager) {
        this.LIZ = recyclableWidgetManager;
    }
}
