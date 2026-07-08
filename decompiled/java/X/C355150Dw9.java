package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.gamora.editorpro.capabilities.audio.beats.logic.BeatInfo;
import com.ss.android.ugc.gamora.editorpro.capabilities.audio.beats.logic.MergedBeatsData;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Dw9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C355150Dw9 extends C2217421BqW implements Function1<String, List<? extends BeatInfo>> {
    public C355150Dw9(Object obj) {
        super(1, obj, C355240DwI.class, "parseMergedBeatsFile", "parseMergedBeatsFile(Ljava/lang/String;)Ljava/util/List;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final List<? extends BeatInfo> invoke(String str) {
        int iIntValue;
        float fFloatValue;
        String str2 = str;
        C355240DwI c355240DwI = (C355240DwI) this.receiver;
        c355240DwI.getClass();
        if (str2 == null) {
            return C13BV.INSTANCE;
        }
        String strLIZIZ = C2112908Pn.LIZIZ(str2);
        if (strLIZIZ == null) {
            return C13BV.INSTANCE;
        }
        MergedBeatsData mergedBeatsData = (MergedBeatsData) GsonProtectorUtils.fromJson((Gson) c355240DwI.LIZLLL.getValue(), strLIZIZ, MergedBeatsData.class);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Integer num : mergedBeatsData.time) {
            int i2 = i + 1;
            if (i >= 0) {
                int iIntValue2 = num.intValue();
                Integer num2 = (Integer) C13LP.LJJJLZIJ(i, mergedBeatsData.value);
                if (num2 != null) {
                    iIntValue = num2.intValue();
                } else {
                    iIntValue = -1;
                }
                Float f = (Float) C13LP.LJJJLZIJ(i, mergedBeatsData.energy);
                if (f != null) {
                    fFloatValue = f.floatValue();
                } else {
                    fFloatValue = 0.0f;
                }
                arrayList.add(new BeatInfo(iIntValue2, iIntValue, fFloatValue, 1));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        if (!(!arrayList.isEmpty())) {
            return arrayList;
        }
        C0E5P c0e5p = C0E5P.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("parseMergedBeatsFile: success: file path:");
        sbLIZ.append(str2);
        C356530DyN.LIZ(c0e5p, C2188811AlT.LIZIZ(sbLIZ));
        return arrayList;
    }
}
