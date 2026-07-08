package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.AlbumAigc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.140C, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C140C {
    public static final String LIZJ(AIGCInfo aIGCInfo) {
        return GsonProtectorUtils.toJson(new Gson(), aIGCInfo);
    }

    public static final void LIZ(AIGCInfo aIGCInfo, AIGCInfo aIGCInfo2) {
        aIGCInfo2.setType(aIGCInfo.getType());
        aIGCInfo2.setEtMap(aIGCInfo.getEtMap());
        aIGCInfo2.setC2paPath(aIGCInfo.getC2paPath());
        aIGCInfo2.setErrorCode(aIGCInfo.getErrorCode());
        aIGCInfo2.setContainFormatList(aIGCInfo.getContainFormatList());
        aIGCInfo2.setFullyAIGC(aIGCInfo.isFullyAIGC());
        aIGCInfo2.setMinorEdit(aIGCInfo.isMinorEdit());
        List<AlbumAigc> albumAigc = aIGCInfo.getAlbumAigc();
        if (albumAigc != null && !albumAigc.isEmpty()) {
            aIGCInfo2.setAlbumAigc(aIGCInfo.getAlbumAigc());
        }
        aIGCInfo2.setV2Format(aIGCInfo.isV2Format());
    }

    public static final void LIZIZ(AIGCInfo aIGCInfo, AIGCInfo... aIGCInfoArr) {
        List<AlbumAigc> albumAigc;
        HashMap<String, String> extraElementC2pas;
        for (AIGCInfo aIGCInfo2 : aIGCInfoArr) {
            if (aIGCInfo2 != null && (extraElementC2pas = aIGCInfo.getExtraElementC2pas()) != null) {
                extraElementC2pas.put(aIGCInfo2.getBucketTaskId(), aIGCInfo2.getC2paPath());
            }
        }
        ArrayList arrayList = new ArrayList();
        for (AIGCInfo aIGCInfo3 : aIGCInfoArr) {
            if (aIGCInfo3 != null && (albumAigc = aIGCInfo3.getAlbumAigc()) != null) {
                arrayList.add(albumAigc);
            }
        }
        List<AlbumAigc> listLJIJJLI = C15438062q.LJIJJLI(arrayList);
        if (!((ArrayList) listLJIJJLI).isEmpty()) {
            List<AlbumAigc> albumAigc2 = aIGCInfo.getAlbumAigc();
            if (albumAigc2 != null) {
                listLJIJJLI = C13LP.LJLIL(listLJIJJLI, albumAigc2);
            }
            aIGCInfo.setAlbumAigc(listLJIJJLI);
        }
    }
}
