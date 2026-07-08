package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.shortvideo.cover.VEMultiEditVideoCoverGeneratorImpl;
import com.ss.android.ugc.aweme.shortvideo.cover.VEVideoCoverGeneratorImpl;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.vechoosecover.MvEffectVideoCoverGeneratorImpl;
import com.ss.android.vesdk.VEEditor;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.Intrinsics;
import lth.o;

/* JADX INFO: renamed from: X.1DsA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2269401DsA extends C09AY implements Function0<C1446610nkR> {
    public C2269401DsA() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0nkR] */
    @Override // kotlin.jvm.functions.Function0
    public final C1446610nkR invoke() {
        return new C0MZB() { // from class: X.0nkR
            @Override // X.C0MZB
            public final C1455290nyR LJFF() {
                return new C1455290nyR();
            }

            @Override // X.C0MZB
            public final boolean LJ() {
                return C256050A1r.LIZ();
            }

            @Override // X.C0MZB
            public final void LIZJ(C1457050o1H c1457050o1H) {
                C1457060o1I.LIZIZ(c1457050o1H);
            }

            @Override // X.C0MZB
            public final VideoPublishEditModel LJII(AwemeDraft awemeDraft) {
                new C1438570nXT("convert");
                return C1438570nXT.LIZJ(awemeDraft, false);
            }

            @Override // X.C0MZB
            public final boolean LJIIIIZZ(VideoPublishEditModel videoPublishEditModel, int i) {
                return C0MH8.LIZ.LJ(videoPublishEditModel, i);
            }

            @Override // X.C0MZB
            public final String LJIIIZ(VideoPublishEditModel videoPublishEditModel, int i) {
                C0MH8.LIZ.getClass();
                return C0MH8.LJI(videoPublishEditModel, i);
            }

            /* JADX WARN: Removed duplicated region for block: B:23:0x00ab  */
            @Override // X.C0MZB
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.InterfaceC1452170ntP LIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r12, android.content.Context r13, androidx.lifecycle.LifecycleOwner r14) {
                /*
                    Method dump skipped, instruction units count: 225
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1446610nkR.LIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, android.content.Context, androidx.lifecycle.LifecycleOwner):X.0ntP");
            }

            @Override // X.C0MZB
            public final Object LIZIZ(String str, VideoPublishEditModel videoPublishEditModel, InterfaceC1364105Vn interfaceC1364105Vn) {
                if (C493401w4.LIZ()) {
                    videoPublishEditModel.generateVideoCoverPath(true, -2);
                    C0MH8.LIZ.getClass();
                    Object objLIZJ = C0MH8.LIZJ(videoPublishEditModel, str, null, interfaceC1364105Vn);
                    if (objLIZJ == C099R.LJFF()) {
                        return objLIZJ;
                    }
                    return Unit.LIZ;
                }
                videoPublishEditModel.setVideoCoverPath(str);
                return Unit.LIZ;
            }

            @Override // X.C0MZB
            public final void LIZLLL(VideoPublishEditModel videoPublishEditModel, int i, C0MBZ c0mbz) {
                boolean zLJFF;
                String key;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(videoPublishEditModel.getEffectList());
                EffectPointModel timeEffect = videoPublishEditModel.getTimeEffect();
                if (timeEffect != null) {
                    arrayList.add(timeEffect);
                    EffectPointModel timeEffect2 = videoPublishEditModel.getTimeEffect();
                    if (timeEffect2 != null) {
                        key = timeEffect2.getKey();
                    } else {
                        key = null;
                    }
                    zLJFF = Intrinsics.LJFF(key, "1");
                } else {
                    zLJFF = false;
                }
                videoPublishEditModel.generateVideoCoverPath(C493401w4.LIZ(), -2);
                C1428470nHB.LJ(videoPublishEditModel, o.LJIL.LJJIL().LIZIZ()).getFilterFolder();
                videoPublishEditModel.getSelectedFilterIntensity();
                C1446630nkT.LIZIZ(i, zLJFF, videoPublishEditModel.getPreviewInfo(), videoPublishEditModel.getVideoCoverPath(), c0mbz);
            }

            @Override // X.C0MZB
            public final void LJIIJ(int i, VideoPublishEditModel videoPublishEditModel, String str, AwS587S0100000_8 awS587S0100000_8) {
                C0MH8.LIZ.getClass();
                C23250099c.LIZLLL(C0MH8.LIZJ, null, null, new C469901sH(videoPublishEditModel, i, str, awS587S0100000_8, null), 3);
            }

            @Override // X.C0MZB
            public final InterfaceC1447630nm5 LJI(VideoPublishEditModel videoPublishEditModel, InterfaceC1452170ntP interfaceC1452170ntP, LifecycleOwner lifecycleOwner, int i, int i2) {
                VEEditor.GET_FRAMES_FLAGS get_frames_flags;
                if (C1446620nkS.LIZ()) {
                    get_frames_flags = VEEditor.GET_FRAMES_FLAGS.GET_FRAMES_MODE_NORMAL;
                } else {
                    get_frames_flags = VEEditor.GET_FRAMES_FLAGS.GET_FRAMES_MODE_NOEFFECT;
                }
                if (videoPublishEditModel.isMvThemeVideoType() && !((Boolean) C277630AuP.LIZ.getValue()).booleanValue()) {
                    interfaceC1452170ntP.getDuration();
                    return new MvEffectVideoCoverGeneratorImpl();
                }
                if (videoPublishEditModel.isMultiVideoEdit()) {
                    int duration = interfaceC1452170ntP.getDuration();
                    if (duration >= 3000) {
                        duration = LivePreCreateNextRoomPlayer.ENABLE;
                    }
                    return new VEMultiEditVideoCoverGeneratorImpl(interfaceC1452170ntP, lifecycleOwner, i2, duration, i, get_frames_flags, 0);
                }
                return new VEVideoCoverGeneratorImpl(interfaceC1452170ntP, lifecycleOwner, i2, get_frames_flags, "choose_cover");
            }
        };
    }
}
