package X;

import android.os.Bundle;
import com.bytedance.ies.cutsame.effectfetcher.TemplateSourceConfig;
import com.bytedance.ies.nle.editor_jni.MapStrNLENodeSPtr;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory;
import com.ss.android.ugc.effectmanager.link.model.host.Host;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS119S1000000_35;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nOO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1432940nOO {
    public static final C1432940nOO LIZ = new C1432940nOO();
    public static float LIZIZ = -1.0f;

    public static float LJ() {
        Float f;
        float fFloatValue = 0.0f;
        if (LIZIZ < 0.0f) {
            C212350188e c212350188eLIZJ = C212350188e.LIZJ();
            C0CHQ.LIZ().getApplicationService();
            C09GA c09gaLIZIZ = c212350188eLIZJ.LIZIZ(C19221910Hx.LIZ());
            C1300610jwx c1300610jwx = C1300610jwx.LIZJ;
            C1300610jwx[] c1300610jwxArr = {c1300610jwx};
            Bundle bundle = new Bundle();
            if (c09gaLIZIZ != null) {
                c09gaLIZIZ.LJIILJJIL(c1300610jwxArr, bundle);
            }
            String str = c1300610jwx.LIZ;
            Object obj = null;
            try {
                obj = bundle.get(str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (OutOfMemoryError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            if ((obj instanceof Float) && (f = (Float) obj) != null) {
                fFloatValue = f.floatValue();
            }
            LIZIZ = fFloatValue;
        }
        return LIZIZ;
    }

    public static TemplateSourceConfig LIZLLL() {
        String itemName;
        Host host = (Host) C13LP.LJJJLL(((IEffectPlatformFactory) ServiceManager.get().getService(IEffectPlatformFactory.class)).getHosts());
        if (host == null || (itemName = host.getItemName()) == null) {
            itemName = "";
        }
        return (TemplateSourceConfig) C452501pT.LIZIZ(new AwS119S1000000_35(itemName, 1)).getValue();
    }

    public static boolean LJII() {
        return LJ() >= 8.0f;
    }

    public static boolean LIZIZ(File file) {
        try {
            if (!file.exists()) {
                return true;
            }
            if (file.isDirectory()) {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                    C089E c089e = new C089E(fileArrListFiles);
                    while (c089e.hasNext()) {
                        File file2 = (File) c089e.next();
                        if (file2.isDirectory()) {
                            LIZIZ(file2);
                        } else {
                            file2.delete();
                        }
                    }
                    return file.delete();
                }
                return file.delete();
            }
            return file.delete();
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        } catch (SecurityException e2) {
            TryCatchGuardChecker.doCheck(e2);
            return false;
        }
    }

    public static boolean LJFF(List list) {
        if (!list.contains("UGC_MAGIC_V1") && !list.contains("UGC_MAGIC_V2")) {
            return false;
        }
        return true;
    }

    public static boolean LJI(NLEModel nLEModel) {
        Iterator<NLETrack> it2 = nLEModel.getTracks().iterator();
        while (it2.hasNext()) {
            for (NLETrackSlot nLETrackSlot : it2.next().getSlots()) {
                if (!C351220Dpo.LLJJIJIL(nLETrackSlot) && NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment()) != null && !Intrinsics.LJFF(C348350DlB.LIZIZ(nLETrackSlot), "CUTSAME_MUTE")) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean LJIIIIZZ(AnchorCommonStruct anchorCommonStruct) {
        if (anchorCommonStruct == null) {
            return false;
        }
        if (anchorCommonStruct.getType() != EnumC1430380nKG.ANCHOR_PUGC_TEMPLATE.getTYPE() && anchorCommonStruct.getType() != EnumC1430380nKG.ANCHOR_UGC_TEMPLATE.getTYPE() && anchorCommonStruct.getType() != EnumC1430380nKG.ANCHOR_AUTO_CUT.getTYPE() && anchorCommonStruct.getType() != EnumC1430380nKG.MV_TEMPLATE.getTYPE() && anchorCommonStruct.getType() != EnumC1430380nKG.ANCHOR_AIGT_TEMPLATE.getTYPE() && anchorCommonStruct.getType() != EnumC1430380nKG.ANCHOR_TT_CC_TEMPLATE.getTYPE() && anchorCommonStruct.getType() != EnumC1430380nKG.ANCHOR_PHOTO_MODE_TEMPLATE.getTYPE()) {
            return false;
        }
        return true;
    }

    public static Pair LIZ(int i, NLETrackSlot nLETrackSlot) {
        MapStrNLENodeSPtr children;
        MapStrNLENodeSPtr children2;
        NLETrack nLETrack = new NLETrack();
        nLETrack.setLayer(i + 1);
        nLETrack.setExtra("track_type", "video");
        nLETrack.setMainTrack(false);
        nLETrack.setExtraTrackType(NLETrackType.VIDEO);
        nLETrack.setExtra("track_layer", String.valueOf(nLETrack.getLayer()));
        nLETrack.setExtra("track_extra_pip", "true");
        NLETrackSlot nLETrackSlotDynamicCast = NLETrackSlot.dynamicCast(nLETrackSlot.deepClone(false));
        if (nLETrackSlotDynamicCast != null) {
            long endTime = nLETrackSlotDynamicCast.getEndTime() - nLETrackSlotDynamicCast.getStartTime();
            nLETrackSlotDynamicCast.setStartTime(0L);
            nLETrackSlotDynamicCast.setEndTime(endTime);
            if (endTime < 3000) {
                nLETrackSlotDynamicCast.setEndTime(3000L);
            }
            NLESegment mainSegment = nLETrackSlotDynamicCast.getMainSegment();
            if (mainSegment != null && (children2 = mainSegment.getChildren()) != null) {
                children2.remove((Object) "Crop");
            }
            NLESegment mainSegment2 = nLETrackSlotDynamicCast.getMainSegment();
            if (mainSegment2 != null && (children = mainSegment2.getChildren()) != null) {
                children.remove((Object) "Clip");
            }
            nLETrack.clearVideoEffect();
            nLETrack.addSlot(nLETrackSlotDynamicCast);
        } else {
            nLETrackSlotDynamicCast = null;
        }
        return new Pair(nLETrack, nLETrackSlotDynamicCast);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
    
        if (r2 != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZJ(java.io.File r9, java.util.List r10) {
        /*
            r8 = 0
            boolean r0 = r9.exists()     // Catch: java.lang.Throwable -> L73
            r7 = 1
            if (r0 != 0) goto L9
            return r7
        L9:
            java.lang.String r0 = r9.getAbsolutePath()     // Catch: java.lang.Throwable -> L73
            r6 = r10
            java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch: java.lang.Throwable -> L73
            boolean r2 = r6.contains(r0)     // Catch: java.lang.Throwable -> L73
            if (r2 != 0) goto L6d
            boolean r0 = r9.isDirectory()     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L6e
            java.io.File[] r1 = r9.listFiles()     // Catch: java.lang.Throwable -> L73
            if (r1 == 0) goto L6e
            int r0 = r1.length     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L6e
            X.089E r5 = new X.089E     // Catch: java.lang.Throwable -> L73
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L73
        L2a:
            boolean r0 = r5.hasNext()     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L6b
            java.lang.Object r4 = r5.next()     // Catch: java.lang.Throwable -> L73
            java.io.File r4 = (java.io.File) r4     // Catch: java.lang.Throwable -> L73
            java.lang.String r0 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> L73
            boolean r0 = r6.contains(r0)     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L5d
            X.0mUb r3 = X.C1398350mUb.LIZIZ     // Catch: java.lang.Throwable -> L73
            java.lang.String r2 = "TemplateFeature"
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L73
            java.lang.String r0 = "skip delete file path : "
            r1.append(r0)     // Catch: java.lang.Throwable -> L73
            java.lang.String r0 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> L73
            r1.append(r0)     // Catch: java.lang.Throwable -> L73
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L73
            X.C201955140j.LJIILL(r3, r2, r0)     // Catch: java.lang.Throwable -> L73
            r2 = 1
            goto L2a
        L5d:
            boolean r0 = r4.isDirectory()     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L67
            LIZJ(r4, r10)     // Catch: java.lang.Throwable -> L73
            goto L2a
        L67:
            r4.delete()     // Catch: java.lang.Throwable -> L73
            goto L2a
        L6b:
            if (r2 == 0) goto L6e
        L6d:
            return r7
        L6e:
            boolean r7 = r9.delete()     // Catch: java.lang.Throwable -> L73
            return r7
        L73:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            X.C189200o6.m5exceptionOrNullimpl(r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1432940nOO.LIZJ(java.io.File, java.util.List):boolean");
    }
}
