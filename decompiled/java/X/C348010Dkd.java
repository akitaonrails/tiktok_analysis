package X;

import com.bytedance.ies.nle.editor_jni.NLESegmentInfoSticker;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Dkd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C348010Dkd extends AbstractC348060Dki {
    public final C348460DlM LIZIZ;
    public final Boolean LIZJ;

    public /* synthetic */ C348010Dkd(C348460DlM c348460DlM) {
        this(c348460DlM, Boolean.FALSE);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x015c  */
    @Override // X.AbstractC348060Dki
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(com.bytedance.ies.nle.editor_jni.NLEEditor r11) {
        /*
            Method dump skipped, instruction units count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C348010Dkd.LIZJ(com.bytedance.ies.nle.editor_jni.NLEEditor):void");
    }

    public C348010Dkd(C348460DlM c348460DlM, Boolean bool) {
        this.LIZIZ = c348460DlM;
        this.LIZJ = bool;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" 0.init ");
        sbLIZ.append(c348460DlM);
        LJFF(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LJII(JSONObject jSONObject, NLETrackSlot nLETrackSlot, NLESegmentInfoSticker nLESegmentInfoSticker) {
        if (jSONObject != null) {
            double dOptDouble = jSONObject.optDouble("pos_x", Double.MAX_VALUE);
            if (dOptDouble != Double.MAX_VALUE) {
                nLETrackSlot.setTransformX((float) dOptDouble);
            }
            double dOptDouble2 = jSONObject.optDouble("pos_y", Double.MAX_VALUE);
            if (dOptDouble2 != Double.MAX_VALUE) {
                nLETrackSlot.setTransformY((float) dOptDouble2);
            }
            double dOptDouble3 = jSONObject.optDouble("rotate", Double.MAX_VALUE);
            if (dOptDouble3 != Double.MAX_VALUE) {
                nLETrackSlot.setRotation((float) dOptDouble3);
            }
            double dOptDouble4 = jSONObject.optDouble("alpha", Double.MAX_VALUE);
            if (dOptDouble4 != Double.MAX_VALUE) {
                nLESegmentInfoSticker.setAlpha((float) dOptDouble4);
            }
            nLETrackSlot.setMirror_X(jSONObject.optBoolean("flip_x", false));
            nLETrackSlot.setMirror_Y(jSONObject.optBoolean("flip_y", false));
        }
    }
}
