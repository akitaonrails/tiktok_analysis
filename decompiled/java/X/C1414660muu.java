package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0muu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1414660muu {
    public final C19EG LIZ;
    public final VideoPublishEditModel LIZIZ;
    public final InterfaceC1452170ntP LIZJ;
    public final C356830Dyr LIZLLL;
    public AVMusic LJ;
    public final C01GW LJFF = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(382));

    public static void LIZIZ(String str, VideoPublishEditModel videoPublishEditModel, C356830Dyr c356830Dyr) {
        VecNLETrackSlotSPtr slots;
        AwS566S0100000_22 awS566S0100000_22 = new AwS566S0100000_22(c356830Dyr, 961);
        NLEModel nLEModelDynamicCast = NLEModel.dynamicCast(((NLENode) awS566S0100000_22.invoke()).deepClone());
        NLETrack mainTrack = ((NLEModel) awS566S0100000_22.invoke()).getMainTrack();
        if (mainTrack != null && (slots = mainTrack.getSlots()) != null) {
            for (NLETrackSlot nLETrackSlot : slots) {
                if (Intrinsics.LJFF(C356830Dyr.LJIIZILJ(nLETrackSlot, "nleExtraEffectKey"), str) || Intrinsics.LJFF(C356830Dyr.LJIIIIZZ(nLETrackSlot), str)) {
                    c356830Dyr.LJJI(videoPublishEditModel, nLETrackSlot);
                    c356830Dyr.LJIL(nLEModelDynamicCast, nLETrackSlot);
                }
            }
        }
    }

    public C1414660muu(C19EG c19eg, VideoPublishEditModel videoPublishEditModel, InterfaceC1452170ntP interfaceC1452170ntP, C356830Dyr c356830Dyr) {
        this.LIZ = c19eg;
        this.LIZIZ = videoPublishEditModel;
        this.LIZJ = interfaceC1452170ntP;
        this.LIZLLL = c356830Dyr;
    }

    public static void LIZ(VideoPublishEditModel videoPublishEditModel, InterfaceC1454960nxu interfaceC1454960nxu, String str, Function0 function0) {
        AVMusic aVMusicExtractAVMusic;
        String musicId;
        if (str != null && (aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(videoPublishEditModel.creativeModel.musicBuzModel)) != null && (musicId = aVMusicExtractAVMusic.getMusicId()) != null && Intrinsics.LJFF(str, musicId)) {
            function0.invoke();
            C1452640nuA.LJII(null, false, videoPublishEditModel.creativeModel.musicBuzModel);
            if (interfaceC1454960nxu != null) {
                C1414930mvL.LIZ.getClass();
                interfaceC1454960nxu.lr(C1414930mvL.LJIILIIL());
            }
        }
    }
}
