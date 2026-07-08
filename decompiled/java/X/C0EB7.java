package X;

import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;

/* JADX INFO: renamed from: X.0EB7, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EB7 {
    public static final C350130Do3 LIZ(MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData, TimeSpeedModelExtension timeSpeedModelExtension) {
        return new C350130Do3(multiEditVideoSegmentRecordData.videoPath, multiEditVideoSegmentRecordData.audioPath, multiEditVideoSegmentRecordData.videoLength / ((long) LSPassThroughRecordSizeConfig.DEFAULT), 0L, Long.valueOf(multiEditVideoSegmentRecordData.getEndTime()), Integer.valueOf(multiEditVideoSegmentRecordData.width), Integer.valueOf(multiEditVideoSegmentRecordData.height), timeSpeedModelExtension);
    }

    public static final void LIZIZ(InterfaceC360800ECo interfaceC360800ECo, boolean z, boolean z2) {
        Float fValueOf;
        float f;
        EnumC373450EkZ[] enumC373450EkZArr = {EnumC373450EkZ.PLAY_PAUSE, EnumC373450EkZ.FULL_SCREEN, EnumC373450EkZ.UNDO, EnumC373450EkZ.REDO, EnumC373450EkZ.KEY_FRAME};
        Boolean boolValueOf = Boolean.valueOf(z);
        if (z2) {
            if (z) {
                f = 1.0f;
            } else {
                f = 0.34f;
            }
            fValueOf = Float.valueOf(f);
        } else {
            fValueOf = null;
        }
        C0EB4.LIZIZ(interfaceC360800ECo, enumC373450EkZArr, null, boolValueOf, fValueOf, null, 18);
    }
}
