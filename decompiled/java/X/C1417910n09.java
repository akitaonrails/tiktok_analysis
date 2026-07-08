package X;

import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model.MetaExt;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0n09, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1417910n09 {
    public static final List<MetaExt> LIZIZ(List<AutoCutMediaModel> list) {
        String str;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (AutoCutMediaModel autoCutMediaModel : list) {
            MetaExt metaExt = new MetaExt(0, null, null, null, null, 0, 0L, 0L, 0, false, 0L, false, 4095, null);
            String str2 = "";
            if (C2286708xd.LIZJ(autoCutMediaModel.filePath)) {
                str = autoCutMediaModel.filePath;
            } else {
                str = autoCutMediaModel.fileUriPath;
                if (str == null) {
                    str = "";
                }
            }
            metaExt.setPath(str);
            metaExt.setWidth(autoCutMediaModel.width);
            metaExt.setHeight(autoCutMediaModel.height);
            metaExt.setVideo(autoCutMediaModel.isVideoType);
            metaExt.setDuration(autoCutMediaModel.duration);
            String str3 = autoCutMediaModel.fileUriPath;
            if (str3 != null) {
                str2 = str3;
            }
            metaExt.setFileUriPath(str2);
            arrayList2.add(metaExt);
        }
        arrayList.addAll(arrayList2);
        C1418000n0I.LIZ.getClass();
        C2295408z2.LIZ.getClass();
        C2295408z2.LIZLLL(arrayList);
        return arrayList;
    }

    public static final String LIZ(String str, List<String> list) {
        boolean z;
        String strLJZL;
        Object obj;
        boolean z2;
        String str2;
        boolean z3;
        boolean z4 = false;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        int size = -1;
        if (!z && !Intrinsics.LJFF(str, "not_set")) {
            try {
                String strOptString = new JSONObject(str).optString("lyric_cover_uri");
                if (strOptString.length() <= 0) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (!z3) {
                    strOptString = null;
                }
                C189200o6.m2constructorimpl(strOptString);
                obj = strOptString;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C098200Yq c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
                obj = c098200Yq;
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(obj);
            if (thM5exceptionOrNullimpl != null) {
                C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("FAIL JSON parse error err=");
                sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
                sbLIZ.append(" extra=");
                sbLIZ.append(C13LN.LJZL(120, str));
                C1426005i6.LIZJ(c1398350mUb, "ComposeLyricCoverUrl", C2188811AlT.LIZIZ(sbLIZ));
                return null;
            }
            boolean zM7isFailureimpl = C189200o6.m7isFailureimpl(obj);
            Object obj2 = obj;
            if (zM7isFailureimpl) {
                obj2 = null;
            }
            String str3 = (String) obj2;
            if (str3 != null && str3.length() != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                C1398350mUb c1398350mUb2 = C1398350mUb.LIZIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("FAIL no lyric_cover_uri in extra extra=");
                sbLIZ2.append(C13LN.LJZL(120, str));
                C1426005i6.LIZJ(c1398350mUb2, "ComposeLyricCoverUrl", C2188811AlT.LIZIZ(sbLIZ2));
                return null;
            }
            if (list != null) {
                str2 = (String) C13LP.LJJJLL(list);
            } else {
                str2 = null;
            }
            if (str2 == null || str2.length() == 0) {
                z4 = true;
            }
            if (z4) {
                C1398350mUb c1398350mUb3 = C1398350mUb.LIZIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("FAIL urlPrefix missing relativeUri=");
                sbLIZ3.append(str3);
                sbLIZ3.append(" urlPrefixSize=");
                if (list != null) {
                    size = list.size();
                }
                sbLIZ3.append(size);
                C1426005i6.LIZJ(c1398350mUb3, "ComposeLyricCoverUrl", C2188811AlT.LIZIZ(sbLIZ3));
                return null;
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(str2);
            sbLIZ4.append(str3);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
            C1398350mUb c1398350mUb4 = C1398350mUb.LIZIZ;
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("OK url=");
            sbLIZ5.append(strLIZIZ);
            C1426005i6.LIZ(c1398350mUb4, "ComposeLyricCoverUrl", C2188811AlT.LIZIZ(sbLIZ5));
            return strLIZIZ;
        }
        C1398350mUb c1398350mUb5 = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("FAIL extra empty/STRING_NOT_SET extra=");
        if (str != null) {
            strLJZL = C13LN.LJZL(80, str);
        } else {
            strLJZL = null;
        }
        sbLIZ6.append(strLJZL);
        sbLIZ6.append(" urlPrefixSize=");
        if (list != null) {
            size = list.size();
        }
        sbLIZ6.append(size);
        C1426005i6.LIZJ(c1398350mUb5, "ComposeLyricCoverUrl", C2188811AlT.LIZIZ(sbLIZ6));
        return null;
    }

    public static final void LIZJ(NLETemplateModel nLETemplateModel, Function1<? super NLETrackSlot, Unit> function1) {
        if (nLETemplateModel == null) {
            return;
        }
        Iterator<NLETrack> it2 = nLETemplateModel.getTracks().iterator();
        while (it2.hasNext()) {
            VecNLETrackSlotSPtr sortedSlots = it2.next().getSortedSlots();
            ArrayList arrayList = new ArrayList();
            for (NLETrackSlot nLETrackSlot : sortedSlots) {
                if (NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment()) != null) {
                    arrayList.add(nLETrackSlot);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                function1.invoke(it3.next());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0268  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.aweme.creative.model.AutoCutThemeData LIZLLL(com.ss.android.ugc.aweme.cutsame.CutsameDataItem r57, X.C0MJ9 r58, int r59, kotlin.jvm.functions.Function1<? super com.ss.android.ugc.aweme.shortvideo.model.MusicModel, com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel> r60, boolean r61) {
        /*
            Method dump skipped, instruction units count: 720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1417910n09.LIZLLL(com.ss.android.ugc.aweme.cutsame.CutsameDataItem, X.0MJ9, int, kotlin.jvm.functions.Function1, boolean):com.ss.android.ugc.aweme.creative.model.AutoCutThemeData");
    }
}
