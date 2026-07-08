package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.vesdk.VEUtils;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0LwJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC559090LwJ extends C05YF {
    Object Dg0(C0FQS c0fqs, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn);

    NLETrackSlot I20(NLETrackSlot nLETrackSlot, VEUtils.VEVideoFileInfo vEVideoFileInfo, String str);

    Object KM1(C0F1S c0f1s, NLETrackSlot nLETrackSlot, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    void Nv2(NLEModel nLEModel, C0FQS c0fqs);

    Object Vk0(NLEModel nLEModel, C0FQS c0fqs, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    NLEModel qq2(NLEModel nLEModel, boolean z, C0FQS c0fqs);
}
