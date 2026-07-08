package X;

import com.bytedance.android.livesdk.browser.jsbridge.newmethods.ChooseImageMethod;
import com.bytedance.hybrid.spark.SparkContext;

/* JADX INFO: renamed from: X.0dkO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1062180dkO extends AbstractC1062170dkN {
    @Override // X.AbstractC1059610dgF
    public final InterfaceC1059630dgH LIZ(final SparkContext sparkContext) {
        return new InterfaceC1059630dgH() { // from class: X.0dkP
            @Override // X.InterfaceC1059630dgH
            public final AbstractC1835360xrS LIZ() {
                return new ChooseImageMethod(sparkContext);
            }
        };
    }
}
