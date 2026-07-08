package X;

import X.C11JF;
import Y.AUListenerS0S1210001_29;
import android.animation.ValueAnimator;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.keva.Keva;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerTopicRepoApi;
import java.util.List;
import kotlin.jvm.internal.AwS423S0200000_22;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0oE4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1464980oE4 implements InterfaceC1647770syt, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final Context LL;
    public final LifecycleOwner LLILLJJLI;
    public final C1DRG LLILLL;
    public final VideoPublishEditModel LLILZ;
    public final C1664740tQG LLILZIL;
    public final C1664740tQG LLILZLL;
    public boolean LLIZ;
    public final C01GW LLIZLLLIL;
    public final MutableLiveData<List<AddYoursStickerTopicRepoApi.AddYoursTopicRecommendInfo>> LLJ;
    public C11JF LLJI;
    public final C01GW LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1464980oE4.class, "infiniStickerApi", "getInfiniStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/newengine/EditorInfiniStickerApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1464980oE4.class, "imageGlobalStickerApi", "getImageGlobalStickerApi()Lcom/ss/android/ugc/aweme/image/sticker/newengine/GlobalEditStickerNewEngineApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1464980oE4.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1464980oE4.class, "editAddYoursStickerApi", "getEditAddYoursStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/addyours/EditAddYoursStickerApi;", 0);
        c09r3.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    @Override // X.InterfaceC1647770syt
    public final C1464990oE5 LIZ() {
        return (C1464990oE5) this.LLJIJIL.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        if (r2 != 0) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel LJFF() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r4.LLILZ
            boolean r0 = X.C1428470nHB.LJLIIL(r0)
            r3 = 0
            if (r0 == 0) goto L3a
            X.0oE2 r1 = r4.LJIIIIZZ()
            if (r1 == 0) goto L48
            X.0oFx r0 = X.EnumC1466150oFx.ADD_YOURS
            java.util.List r1 = r1.LLLLLZ(r0)
            if (r1 == 0) goto L48
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r2.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L26:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L49
            java.lang.Object r0 = r1.next()
            X.0FTJ r0 = (X.C0FTJ) r0
            com.ss.android.ugc.aweme.tools.sticker.core.StickerModel r0 = r0.LJLI()
            r2.add(r0)
            goto L26
        L3a:
            X.0FVq r1 = r4.LJIIIZ()
            if (r1 == 0) goto L48
            X.0oFx r0 = X.EnumC1466150oFx.ADD_YOURS
            java.util.List r2 = r1.LLLILZLLLI(r0)
            if (r2 != 0) goto L49
        L48:
            return r3
        L49:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L50
            return r3
        L50:
            r0 = 0
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r2, r0)
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel
            if (r0 == 0) goto L5c
            r3 = r1
            com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel r3 = (com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel) r3
        L5c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1464980oE4.LJFF():com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel");
    }

    public final InterfaceC1464960oE2 LJIIIIZZ() {
        return (InterfaceC1464960oE2) this.LLILZLL.getValue(this, LLJILJIL[1]);
    }

    public final InterfaceC391240FVq LJIIIZ() {
        return (InterfaceC391240FVq) this.LLILZIL.getValue(this, LLJILJIL[0]);
    }

    @Override // X.InterfaceC1647770syt
    public final MutableLiveData LIZIZ() {
        return this.LLJ;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLILLL;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008e  */
    @Override // X.InterfaceC1647770syt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(java.lang.Long r9) {
        /*
            r8 = this;
            X.0nIg r5 = X.C1429400nIg.LIZ
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r8.LLILZ
            r5.getClass()
            boolean r0 = X.C1429400nIg.LIZ(r0)
            if (r0 != 0) goto Le
            return
        Le:
            if (r9 == 0) goto L90
            long r2 = r9.longValue()
        L14:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r7 = r8.LLILZ
            Y.AfS191S0100000_22 r4 = new Y.AfS191S0100000_22
            r0 = 26
            r4.<init>(r8, r0)
            r5.getClass()
            X.0nIc r1 = X.C1429400nIg.LJ
            if (r1 == 0) goto L3d
            long r5 = r1.LIZ
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 != 0) goto L3d
            X.11NZ<com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerTopicRepoApi$AddYoursTopicRecommendResp> r1 = r1.LIZIZ
            X.11RO r0 = X.C1701940uOG.LIZIZ()
            X.11O8 r0 = r1.LJJJLZIJ(r0)
            X.01kM r0 = r0.LJJLJLI(r4)
        L38:
            X.11JF r0 = (X.C11JF) r0
            r8.LLJI = r0
            return
        L3d:
            X.0nlB r0 = X.C1403010mc7.LIZ
            com.ss.android.ugc.aweme.port.in.IAnotherMusicService r0 = r0.getMusicService()
            r0.al()
            X.11PQ r6 = new X.11PQ
            r6.<init>()
            X.11NZ r5 = X.C2275708vr.LJ()
            if (r5 == 0) goto L8e
            X.0nIc r1 = new X.0nIc
            X.11Hn r0 = new X.11Hn
            r0.<init>(r6)
            r1.<init>(r2, r0)
            X.C1429400nIg.LJ = r1
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r7.creativeModel
            com.ss.android.ugc.aweme.creative.model.stickers.StickerNewEngineModel r1 = r0.stickerModel
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r1.tosTimeStampForAyCommend = r0
            X.11RO r0 = X.C1701940uOG.LIZIZ()
            X.11O8 r2 = r5.LJJJLZIJ(r0)
            Y.AfS175S0100000_6 r1 = new Y.AfS175S0100000_6
            r0 = 8
            r1.<init>(r6, r0)
            r2.LJJLJLI(r1)
            X.0nIc r0 = X.C1429400nIg.LJ
            if (r0 == 0) goto L8e
            X.11NZ<com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerTopicRepoApi$AddYoursTopicRecommendResp> r1 = r0.LIZIZ
            if (r1 == 0) goto L8e
            X.11RO r0 = X.C1701940uOG.LIZIZ()
            X.11O8 r0 = r1.LJJJLZIJ(r0)
            X.01kM r0 = r0.LJJLJLI(r4)
            goto L38
        L8e:
            r0 = 0
            goto L38
        L90:
            long r2 = java.lang.System.currentTimeMillis()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r8.LLILZ
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            com.ss.android.ugc.aweme.creative.model.stickers.StickerNewEngineModel r1 = r0.stickerModel
            java.lang.Long r0 = r1.tosTimeStampForAyCommend
            if (r0 != 0) goto L14
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r1.tosTimeStampForAyCommend = r0
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1464980oE4.LIZJ(java.lang.Long):void");
    }

    @Override // X.InterfaceC1647770syt
    public final void LJ(AddYoursStickerModel addYoursStickerModel) {
        C1429400nIg c1429400nIg = C1429400nIg.LIZ;
        VideoPublishEditModel videoPublishEditModel = this.LLILZ;
        c1429400nIg.getClass();
        if (!C1429400nIg.LIZ(videoPublishEditModel) || this.LLIZ || this.LLILZ.creativeModel.stickerModel.addYoursStickerModels.size() > 0) {
            return;
        }
        if (C565160MEo.LIZIZ(this.LLILZ) && C0C64.LJIILLIIL().LJIIIZ(31744, "studio_story_ai_live_photo_editor_ban_ay", true, false)) {
            return;
        }
        c1429400nIg.getClass();
        C1429360nIc c1429360nIc = C1429400nIg.LJ;
        if (c1429360nIc != null && c1429360nIc.LIZJ) {
            return;
        }
        if (C1428470nHB.LJLIIL(this.LLILZ)) {
            InterfaceC1464960oE2 interfaceC1464960oE2LJIIIIZZ = LJIIIIZZ();
            if (interfaceC1464960oE2LJIIIIZZ != null) {
                interfaceC1464960oE2LJIIIIZZ.f4(addYoursStickerModel);
            }
            InterfaceC1464960oE2 interfaceC1464960oE2LJIIIIZZ2 = LJIIIIZZ();
            if (interfaceC1464960oE2LJIIIIZZ2 != null) {
                interfaceC1464960oE2LJIIIIZZ2.wQ0(addYoursStickerModel);
            }
        } else {
            InterfaceC391240FVq interfaceC391240FVqLJIIIZ = LJIIIZ();
            if (interfaceC391240FVqLJIIIZ != null) {
                interfaceC391240FVqLJIIIZ.HL2(new AwS423S0200000_22(this, addYoursStickerModel, 61));
            }
        }
        VideoPublishEditModel videoPublishEditModel2 = this.LLILZ;
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C0LAB c0lab = new C0LAB();
        C1403900mdY.LIZ.getClass();
        C1403900mdY.LJ(videoPublishEditModel2, c0lab);
        c0lab.LJ("add_yours_title", addYoursStickerModel.getTopicText());
        Long topicID = addYoursStickerModel.getTopicID();
        if (topicID != null) {
            c0lab.LIZIZ(topicID.longValue(), "add_yours_id");
        }
        C2341909Fp.LIZ("creation_add_yours_card_show", c0lab.LIZ);
        C1429360nIc c1429360nIc2 = C1429400nIg.LJ;
        if (c1429360nIc2 != null) {
            c1429360nIc2.LIZJ = true;
        }
    }

    @Override // X.InterfaceC1647770syt
    public final void LIZLLL(String str, boolean z) {
        AddYoursStickerModel addYoursStickerModelLJFF = LJFF();
        if (addYoursStickerModelLJFF == null || addYoursStickerModelLJFF.isNotEmptyModel()) {
            return;
        }
        if (C1428470nHB.LJLIIL(this.LLILZ)) {
            InterfaceC1464960oE2 interfaceC1464960oE2LJIIIIZZ = LJIIIIZZ();
            if (interfaceC1464960oE2LJIIIIZZ != null) {
                interfaceC1464960oE2LJIIIIZZ.Rd1(addYoursStickerModelLJFF.getId(), null);
            }
        } else {
            if (!C1428470nHB.LJZL(this.LLILZ)) {
                return;
            }
            InterfaceC391240FVq interfaceC391240FVqLJIIIZ = LJIIIZ();
            if (interfaceC391240FVqLJIIIZ != null) {
                interfaceC391240FVqLJIIIZ.XJ(addYoursStickerModelLJFF.getId(), null, EnumC356070Dxd.COMMIT);
            }
        }
        if (z) {
            C1429400nIg.LIZ.getClass();
            C01GW c01gw = C1429400nIg.LIZIZ;
            ((Keva) c01gw.getValue()).storeInt("key_cancel_count", ((Keva) c01gw.getValue()).getInt("key_cancel_count", 0) + 1);
        }
        if (str.length() > 0) {
            C1403910mdZ.LIZ(this.LLILZ, addYoursStickerModelLJFF, str);
        }
    }

    public C1464980oE4(Context context, AbstractC2255721DQs abstractC2255721DQs, C1DRG c1drg, VideoPublishEditModel videoPublishEditModel) {
        this.LL = context;
        this.LLILLJJLI = abstractC2255721DQs;
        this.LLILLL = c1drg;
        this.LLILZ = videoPublishEditModel;
        this.LLILZIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC391240FVq.class, null);
        this.LLILZLL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1464960oE2.class, null);
        C1664770tQJ.LIZIZ(c1drg, InterfaceC1455860nzM.class, null);
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 710));
        this.LLIZLLLIL = c01gwLIZIZ;
        if (C1428470nHB.LJLIIL(videoPublishEditModel)) {
            InterfaceC1464960oE2 interfaceC1464960oE2LJIIIIZZ = LJIIIIZZ();
            if (interfaceC1464960oE2LJIIIIZZ != null) {
                interfaceC1464960oE2LJIIIIZZ.LJJZZI((C1465000oE6) c01gwLIZIZ.getValue());
            }
        } else {
            InterfaceC391240FVq interfaceC391240FVqLJIIIZ = LJIIIZ();
            if (interfaceC391240FVqLJIIIZ != null) {
                interfaceC391240FVqLJIIIZ.LJJZZI((C1465000oE6) c01gwLIZIZ.getValue());
            }
        }
        abstractC2255721DQs.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.gamora.editor.sticker.addyours.AddYoursRecommend$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                C11JF c11jf;
                if (event.getTargetState() == Lifecycle.State.DESTROYED && (c11jf = this.LL.LLJI) != null && (!c11jf.isDisposed())) {
                    c11jf.dispose();
                }
            }
        });
        this.LLJ = new MutableLiveData<>(null);
        C1664770tQJ.LIZIZ(c1drg, InterfaceC1465010oE7.class, null);
        this.LLJIJIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 709));
    }

    public static ValueAnimator LJI(TuxTextView tuxTextView, float f, String str, C1664680tQA c1664680tQA, boolean z) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.setInterpolator(C1619980sG4.LIZJ());
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS0S1210001_29(tuxTextView, str, f, z, c1664680tQA, 1));
        return valueAnimatorOfFloat;
    }

    public static final ValueAnimator LJII(TuxTextView tuxTextView, float f, String str, C1664680tQA<BaseStickerModel> c1664680tQA, boolean z, long j) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.setInterpolator(C1619980sG4.LJIILIIL());
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS0S1210001_29(tuxTextView, str, f, z, c1664680tQA, 0));
        return valueAnimatorOfFloat;
    }
}
