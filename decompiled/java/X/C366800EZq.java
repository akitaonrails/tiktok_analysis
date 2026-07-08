package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.shortvideo.subtitle.MusicCopyrightApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS547S0100000_3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0EZq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C366800EZq {
    public static C11NJ LIZIZ;
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(63));
    public static final Map<String, Integer> LIZJ = new LinkedHashMap();

    public static boolean LIZJ(NLETrackSlot nLETrackSlot) {
        Integer num;
        if (C277710AuX.LIZ()) {
            return true;
        }
        String strLIZJ = C348350DlB.LIZJ(nLETrackSlot);
        if (strLIZJ == null || !(!a0.LJJJIL(strLIZJ))) {
            if (nLETrackSlot.hasExtra("ep_audio_music_id")) {
                strLIZJ = nLETrackSlot.getExtra("ep_audio_music_id");
            } else {
                strLIZJ = "";
            }
        }
        if (strLIZJ.length() == 0) {
            return false;
        }
        Map<String, Integer> map = LIZJ;
        if (!map.containsKey(strLIZJ)) {
            return false;
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        Integer num2 = (Integer) linkedHashMap.get(strLIZJ);
        if ((num2 != null && num2.intValue() == 1) || ((num = (Integer) linkedHashMap.get(strLIZJ)) != null && num.intValue() == 2)) {
            return true;
        }
        return false;
    }

    public static boolean LIZ(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel) {
        Integer num;
        VecNLETrackSlotSPtr slots;
        VecNLETrackSPtr tracks;
        Integer num2;
        VecNLETrackSlotSPtr slots2;
        VecNLETrackSPtr tracks2;
        if (C289250BVj.LIZ(videoPublishEditModel)) {
            if (videoPublishEditModel != null) {
                if (!videoPublishEditModel.hasMusic()) {
                    if (nLEModel != null && (tracks2 = nLEModel.getTracks()) != null && !tracks2.isEmpty()) {
                        Iterator<NLETrack> it2 = tracks2.iterator();
                        while (it2.hasNext()) {
                            if (C351220Dpo.LLLFF(it2.next())) {
                            }
                        }
                    }
                    return false;
                }
                if (C277710AuX.LIZ()) {
                    return true;
                }
                if (nLEModel != null) {
                    VecNLETrackSPtr tracks3 = nLEModel.getTracks();
                    if (tracks3 != null) {
                        ArrayList<NLETrack> arrayList = new ArrayList();
                        for (NLETrack nLETrack : tracks3) {
                            NLETrack nLETrack2 = nLETrack;
                            if (C351220Dpo.LLILLL(nLETrack2) || C351220Dpo.LLJILLL(nLETrack2)) {
                                arrayList.add(nLETrack);
                            }
                        }
                        boolean z = true;
                        boolean z2 = false;
                        for (NLETrack nLETrack3 : arrayList) {
                            if (nLETrack3 != null && (slots2 = nLETrack3.getSlots()) != null) {
                                for (NLETrackSlot nLETrackSlot : slots2) {
                                    if (!u4.LJJIIZI(nLETrackSlot)) {
                                        z = false;
                                    }
                                    if (LIZJ(nLETrackSlot)) {
                                        z2 = true;
                                    }
                                }
                            }
                        }
                        if (!z) {
                            if (z2) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (videoPublishEditModel.getMusicVolume() == 0.0f) {
                    return false;
                }
                Map<String, Integer> map = LIZJ;
                if (!map.containsKey(videoPublishEditModel.getMusicId())) {
                    return false;
                }
                LinkedHashMap linkedHashMap = (LinkedHashMap) map;
                Integer num3 = (Integer) linkedHashMap.get(videoPublishEditModel.getMusicId());
                if ((num3 != null && num3.intValue() == 1) || ((num2 = (Integer) linkedHashMap.get(videoPublishEditModel.getMusicId())) != null && num2.intValue() == 2)) {
                    return true;
                }
                return false;
            }
        } else if (videoPublishEditModel != null) {
            if (!videoPublishEditModel.hasMusic()) {
                if (nLEModel != null && (tracks = nLEModel.getTracks()) != null && !tracks.isEmpty()) {
                    Iterator<NLETrack> it3 = tracks.iterator();
                    while (it3.hasNext()) {
                        if (C351220Dpo.LLLFF(it3.next())) {
                        }
                    }
                }
                return false;
            }
            if (C277710AuX.LIZ()) {
                return true;
            }
            String musicId = videoPublishEditModel.getMusicId();
            if (musicId == null || musicId.length() == 0) {
                return false;
            }
            if (nLEModel != null) {
                VecNLETrackSPtr tracks4 = nLEModel.getTracks();
                String extra = "";
                if (tracks4 != null) {
                    ArrayList<NLETrack> arrayList2 = new ArrayList();
                    for (NLETrack nLETrack4 : tracks4) {
                        NLETrack nLETrack5 = nLETrack4;
                        if (C351220Dpo.LLILLL(nLETrack5) || C351220Dpo.LLJILLL(nLETrack5)) {
                            arrayList2.add(nLETrack4);
                        }
                    }
                    boolean z3 = true;
                    for (NLETrack nLETrack6 : arrayList2) {
                        if (nLETrack6 != null && (slots = nLETrack6.getSlots()) != null) {
                            for (NLETrackSlot nLETrackSlot2 : slots) {
                                if (!u4.LJJIIZI(nLETrackSlot2)) {
                                    z3 = false;
                                }
                                extra = nLETrackSlot2.getExtra("d_bgmId");
                            }
                        }
                    }
                    if (z3 || !Intrinsics.LJFF(extra, videoPublishEditModel.getMusicId())) {
                        return false;
                    }
                }
                return false;
            }
            if (videoPublishEditModel.getMusicVolume() == 0.0f) {
                return false;
            }
            Map<String, Integer> map2 = LIZJ;
            if (!map2.containsKey(videoPublishEditModel.getMusicId())) {
                return false;
            }
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) map2;
            Integer num4 = (Integer) linkedHashMap2.get(videoPublishEditModel.getMusicId());
            if ((num4 != null && num4.intValue() == 1) || ((num = (Integer) linkedHashMap2.get(videoPublishEditModel.getMusicId())) != null && num.intValue() == 2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void LIZIZ(final String str, final Function1 function1) {
        if (LIZJ.containsKey(str)) {
            C1524805y2.LIZIZ(0L, new AwS547S0100000_3(function1, (Function1<? super Boolean, Unit>) 59));
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        InterfaceC420801kM interfaceC420801kMLJJLL = ((MusicCopyrightApi) LIZ.getValue()).LIZ(str).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.09J0
            @Override // X.C09JN
            public final void accept(Object obj) {
                boolean z;
                int iIntValue;
                C1C7U.LIZ("MusicCopyrightChecker@c404.checkMusicCopyrightIfNeed$disposable$1");
                MusicCopyrightApi.MusicCopyrightCheckResponse musicCopyrightCheckResponse = (MusicCopyrightApi.MusicCopyrightCheckResponse) obj;
                if (musicCopyrightCheckResponse.status_code == 0) {
                    Map<String, Integer> map = C366800EZq.LIZJ;
                    String str2 = str;
                    Integer num = musicCopyrightCheckResponse.musicIdentification;
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    map.put(str2, Integer.valueOf(iIntValue));
                    function1.invoke(Boolean.TRUE);
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("checkMusicCopyright error code: ");
                    sbLIZ.append(musicCopyrightCheckResponse.status_code);
                    sbLIZ.append(", msg: ");
                    sbLIZ.append(musicCopyrightCheckResponse.status_msg);
                    C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
                    function1.invoke(Boolean.FALSE);
                }
                C543670LTx c543670LTx = new C543670LTx();
                c543670LTx.LIZ.put("duration", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                c543670LTx.LIZ.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, Integer.valueOf(musicCopyrightCheckResponse.status_code));
                if (musicCopyrightCheckResponse.status_code == 0) {
                    z = true;
                } else {
                    z = false;
                }
                c543670LTx.LIZ.put("success", Boolean.valueOf(z));
                c543670LTx.LIZ.put("errorCode", Integer.valueOf(musicCopyrightCheckResponse.error_code));
                C1637890six.LJ("music_lyric_copyright_request_info", 0, c543670LTx.LJ());
                C1C7U.LIZIZ("MusicCopyrightChecker@c404.checkMusicCopyrightIfNeed$disposable$1");
            }
        }, new C09JN() { // from class: X.09J1
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("MusicCopyrightChecker@c404.checkMusicCopyrightIfNeed$disposable$2");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("checkMusicCopyright ");
                sbLIZ.append(Unit.LIZ);
                C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
                C1637890six.LJ("music_lyric_copyright_request_info", 1, null);
                C1C7U.LIZIZ("MusicCopyrightChecker@c404.checkMusicCopyrightIfNeed$disposable$2");
            }
        });
        C11NJ c11nj = LIZIZ;
        if (c11nj != null) {
            c11nj.LIZ(interfaceC420801kMLJJLL);
        }
    }
}
