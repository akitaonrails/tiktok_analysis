package X;

import Y.AComparatorS24S0000000_5;
import android.text.TextUtils;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentEmojiSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentImageSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentInfoSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker;
import com.bytedance.ies.nle.editor_jni.NLEStyStickerAnim;
import com.bytedance.ies.nle.editor_jni.NLEStyText;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0DkU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C347920DkU implements C0FW6 {
    public final INLEMediaSession LIZ;
    public final Function1<AbstractC348060Dki, Unit> LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(861));
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(860));
    public final C01GW LJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(862));
    public final C01GW LJFF = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(863));
    public final C01GW LJI = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(859));
    public Boolean LJII = Boolean.FALSE;
    public final HashMap<String, C348460DlM> LJIIIIZZ = new HashMap<>();
    public final HashMap<String, C348450DlL> LJIIIZ = new HashMap<>();
    public final HashMap<String, C356730Dyh> LJIIJ = new HashMap<>();
    public final HashMap<String, C347950DkX> LJIIJJI = new HashMap<>();
    public final C01GW LJIIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1089));

    @Override // X.C0FW6
    public final C121D LIZ() {
        return (C121D) this.LJIIL.getValue();
    }

    @Override // X.C0FW6
    public final void LIZLLL(C348440DlK c348440DlK) {
        if (c348440DlK instanceof C348460DlM) {
            this.LIZIZ.invoke(new C347910DkT((C348460DlM) c348440DlK));
            return;
        }
        if (c348440DlK instanceof C348450DlL) {
            this.LIZIZ.invoke(new C347900DkS((C348450DlL) c348440DlK));
            return;
        }
        if (c348440DlK instanceof C347950DkX) {
            final C347950DkX c347950DkX = (C347950DkX) c348440DlK;
            this.LIZIZ.invoke(new AbstractC348060Dki(c347950DkX) { // from class: X.0DkR
                public final C347950DkX LIZIZ;

                {
                    this.LIZIZ = c347950DkX;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(" 0.init ");
                    sbLIZ.append(c347950DkX);
                    LJFF(C2188811AlT.LIZIZ(sbLIZ));
                }

                @Override // X.AbstractC348060Dki
                public final void LIZJ(NLEEditor nLEEditor) {
                    NLETrackSlot nLETrackSlotLIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(" 1.executeNLE ");
                    sbLIZ.append(this.LIZIZ);
                    LJFF(C2188811AlT.LIZIZ(sbLIZ));
                    String str = this.LIZIZ.LIZIZ;
                    if (str != null && !a0.LJJJIL(str) && (nLETrackSlotLIZ = C14LJ.LIZ(nLEEditor.getModel(), this.LIZIZ.LIZIZ)) != null) {
                        new C347970DkZ(this.LIZIZ).LJII(nLETrackSlotLIZ);
                    }
                }
            });
        } else if (c348440DlK instanceof C356730Dyh) {
            final C356730Dyh c356730Dyh = (C356730Dyh) c348440DlK;
            this.LIZIZ.invoke(new AbstractC348060Dki(c356730Dyh) { // from class: X.0DkQ
                public final C356730Dyh LIZIZ;

                {
                    this.LIZIZ = c356730Dyh;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(" 0.init ");
                    sbLIZ.append(c356730Dyh);
                    LJFF(C2188811AlT.LIZIZ(sbLIZ));
                }

                @Override // X.AbstractC348060Dki
                public final void LIZJ(NLEEditor nLEEditor) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(" 1.executeNLE ");
                    sbLIZ.append(this.LIZIZ);
                    LJFF(C2188811AlT.LIZIZ(sbLIZ));
                    NLETrackSlot nLETrackSlotLIZ = C14LJ.LIZ(nLEEditor.getModel(), this.LIZIZ.LIZIZ);
                    if (nLETrackSlotLIZ != null) {
                        NLESegmentTextSticker nLESegmentTextStickerDynamicCast = NLESegmentTextSticker.dynamicCast((NLENode) nLETrackSlotLIZ.getMainSegment());
                        if (nLESegmentTextStickerDynamicCast != null && !Intrinsics.LJFF(nLESegmentTextStickerDynamicCast.toEffectJson(), this.LIZIZ.LJIIL)) {
                            nLESegmentTextStickerDynamicCast.setEffectSDKJsonString(this.LIZIZ.LJIIL);
                        }
                        new C347970DkZ(this.LIZIZ).LJII(nLETrackSlotLIZ);
                    }
                }
            });
        } else {
            this.LIZIZ.invoke(new C347970DkZ(c348440DlK));
        }
    }

    @Override // X.InterfaceC347190DjJ
    public final void LJIIJJI(NLEModel nLEModel) {
        String resourceFile;
        String resourceFile2;
        String resourceFile3;
        String resourceFile4;
        AbstractC348050Dkh<LinkedList<C348440DlK>> abstractC348050Dkh = new AbstractC348050Dkh<LinkedList<C348440DlK>>() { // from class: X.0Dka
            public static void LIZIZ(C348440DlK c348440DlK, NLETrackSlot nLETrackSlot) {
                c348440DlK.LIZJ = nLETrackSlot.getLayer();
                long startTime = nLETrackSlot.getStartTime();
                long j = LSPassThroughRecordSizeConfig.DEFAULT;
                c348440DlK.LIZLLL = startTime / j;
                long endTime = -2;
                if (nLETrackSlot.getEndTime() != -2) {
                    endTime = nLETrackSlot.getEndTime() / j;
                }
                c348440DlK.LJ = endTime;
                c348440DlK.LJFF = C348000Dkc.LIZ(nLETrackSlot.getTransformX());
                c348440DlK.LJI = C348000Dkc.LIZIZ(nLETrackSlot.getTransformY());
                c348440DlK.LJII = nLETrackSlot.getRotation();
                c348440DlK.LJIIJ = nLETrackSlot.getScale();
                NLESegmentSticker nLESegmentStickerDynamicCast = NLESegmentSticker.dynamicCast(nLETrackSlot.getMainSegment());
                if (nLESegmentStickerDynamicCast != null) {
                    c348440DlK.LJIIIIZZ = nLESegmentStickerDynamicCast.getAlpha();
                    if (nLESegmentStickerDynamicCast.getAnimation() == null) {
                        c348440DlK.LJIIJJI = null;
                    } else {
                        NLEStyStickerAnim animation = nLESegmentStickerDynamicCast.getAnimation();
                        if (animation != null) {
                            if (c348440DlK.LJIIJJI == null) {
                                c348440DlK.LJIIJJI = new C347990Dkb();
                            }
                            C347990Dkb c347990Dkb = c348440DlK.LJIIJJI;
                            if (c347990Dkb != null) {
                                c347990Dkb.LIZJ = Integer.valueOf(animation.getInDuration() / LSPassThroughRecordSizeConfig.DEFAULT);
                                c347990Dkb.LJ = Integer.valueOf(animation.getOutDuration() / LSPassThroughRecordSizeConfig.DEFAULT);
                                c347990Dkb.LIZ = animation.getLoop();
                                NLEResourceNode inAnim = animation.getInAnim();
                                if (inAnim != null) {
                                    c347990Dkb.LIZIZ = inAnim.getResourceFile();
                                }
                                NLEResourceNode outAnim = animation.getOutAnim();
                                if (outAnim != null) {
                                    c347990Dkb.LIZLLL = outAnim.getResourceFile();
                                }
                            }
                        }
                    }
                }
                c348440DlK.LIZIZ = nLETrackSlot.getUUID();
            }
        };
        abstractC348050Dkh.LIZ("fetchFromNLE:");
        LinkedList<C348440DlK> linkedList = new LinkedList();
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList<NLETrack> arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (!TextUtils.isEmpty(C348350DlB.LJIIJ(nLETrack))) {
                arrayList.add(nLETrack);
            }
        }
        for (NLETrack nLETrack2 : arrayList) {
            String strLJIIJ = C348350DlB.LJIIJ(nLETrack2);
            for (NLETrackSlot nLETrackSlot : nLETrack2.getSlots()) {
                NLESegmentInfoSticker nLESegmentInfoStickerDynamicCast = NLESegmentInfoSticker.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
                String resourceFile5 = null;
                if (nLESegmentInfoStickerDynamicCast != null) {
                    C348460DlM c348460DlM = new C348460DlM(EnumC356050Dxb.valueOf(strLJIIJ));
                    NLEResourceNode effectSDKFile = nLESegmentInfoStickerDynamicCast.getEffectSDKFile();
                    if (effectSDKFile != null) {
                        resourceFile5 = effectSDKFile.getResourceFile();
                    }
                    c348460DlM.LJIIL = resourceFile5;
                    c348460DlM.LJIILL = C348350DlB.LJIIIZ(nLETrackSlot);
                    NLEResourceNode pinAlgorithmFile = nLETrackSlot.getPinAlgorithmFile();
                    if (pinAlgorithmFile != null && (resourceFile2 = pinAlgorithmFile.getResourceFile()) != null) {
                        c348460DlM.LJIJ = resourceFile2;
                    }
                    NLEResourceNode pinMappingAlgorithmFile = nLETrackSlot.getPinMappingAlgorithmFile();
                    if (pinMappingAlgorithmFile != null && (resourceFile = pinMappingAlgorithmFile.getResourceFile()) != null) {
                        c348460DlM.LJIJI = resourceFile;
                    }
                    C347980Dka.LIZIZ(c348460DlM, nLETrackSlot);
                    linkedList.add(c348460DlM);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("infoStickerParams ");
                    sbLIZ.append(c348460DlM);
                    abstractC348050Dkh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    NLESegmentEmojiSticker nLESegmentEmojiStickerDynamicCast = NLESegmentEmojiSticker.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
                    if (nLESegmentEmojiStickerDynamicCast != null) {
                        C348460DlM c348460DlM2 = new C348460DlM(EnumC356050Dxb.valueOf(strLJIIJ));
                        c348460DlM2.LJIILL = "-1";
                        c348460DlM2.LJIJJ = nLESegmentEmojiStickerDynamicCast.getutf8Code();
                        C347980Dka.LIZIZ(c348460DlM2, nLETrackSlot);
                        linkedList.add(c348460DlM2);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("emojiStickerParams ");
                        sbLIZ2.append(c348460DlM2);
                        abstractC348050Dkh.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                    } else {
                        NLESegmentImageSticker nLESegmentImageStickerDynamicCast = NLESegmentImageSticker.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
                        if (nLESegmentImageStickerDynamicCast != null) {
                            C348450DlL c348450DlL = new C348450DlL(false, 15);
                            c348450DlL.LJIIL = nLESegmentImageStickerDynamicCast.getImageFile().getResourceFile();
                            c348450DlL.LJIILIIL = nLETrackSlot.getRelativeWidth();
                            c348450DlL.LJIILJJIL = nLETrackSlot.getRelativeHeight();
                            NLEResourceNode pinAlgorithmFile2 = nLETrackSlot.getPinAlgorithmFile();
                            if (pinAlgorithmFile2 != null && (resourceFile4 = pinAlgorithmFile2.getResourceFile()) != null) {
                                c348450DlL.LJIILLIIL = resourceFile4;
                            }
                            NLEResourceNode pinMappingAlgorithmFile2 = nLETrackSlot.getPinMappingAlgorithmFile();
                            if (pinMappingAlgorithmFile2 != null && (resourceFile3 = pinMappingAlgorithmFile2.getResourceFile()) != null) {
                                c348450DlL.LJIIZILJ = resourceFile3;
                            }
                            C347980Dka.LIZIZ(c348450DlL, nLETrackSlot);
                            linkedList.add(c348450DlL);
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("imageStickerParams ");
                            sbLIZ3.append(c348450DlL);
                            abstractC348050Dkh.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
                        } else {
                            NLESegmentTextSticker nLESegmentTextStickerDynamicCast = NLESegmentTextSticker.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
                            if (nLESegmentTextStickerDynamicCast != null) {
                                C356730Dyh c356730Dyh = new C356730Dyh(null);
                                c356730Dyh.LJIIL = nLESegmentTextStickerDynamicCast.toEffectJson();
                                NLEStyText style = nLESegmentTextStickerDynamicCast.getStyle();
                                if (style != null) {
                                    c356730Dyh.LJIILIIL.setValue(c356730Dyh, C356730Dyh.LJIILJJIL[0], Integer.valueOf((int) style.getTextColor()));
                                }
                                C347980Dka.LIZIZ(c356730Dyh, nLETrackSlot);
                                linkedList.add(c356730Dyh);
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append("textStickerParams ");
                                sbLIZ4.append(c356730Dyh);
                                abstractC348050Dkh.LIZ(C2188811AlT.LIZIZ(sbLIZ4));
                            }
                        }
                    }
                }
            }
        }
        for (C348440DlK c348440DlK : linkedList) {
            if (c348440DlK instanceof C348460DlM) {
                this.LJIIIIZZ.put(c348440DlK.LIZIZ, (C348460DlM) c348440DlK);
            } else if (c348440DlK instanceof C348450DlL) {
                this.LJIIIZ.put(c348440DlK.LIZIZ, (C348450DlL) c348440DlK);
            } else if (c348440DlK instanceof C356730Dyh) {
                this.LJIIJ.put(c348440DlK.LIZIZ, (C356730Dyh) c348440DlK);
            }
        }
    }

    @Override // X.C0FW6
    public final String LJIIL(C348460DlM c348460DlM) {
        this.LIZIZ.invoke(new C348010Dkd(c348460DlM, this.LJII));
        this.LJIIIIZZ.put(c348460DlM.LIZIZ, c348460DlM);
        return c348460DlM.LIZIZ;
    }

    @Override // X.C0FW6
    public final int LJIILJJIL(String str) {
        final C348440DlK c348440DlKLJJIIJZLJL = LJJIIJZLJL(str);
        if (c348440DlKLJJIIJZLJL != null) {
            this.LIZIZ.invoke(new AbstractC348060Dki(c348440DlKLJJIIJZLJL) { // from class: X.0DkN
                public final C348440DlK LIZIZ;

                {
                    this.LIZIZ = c348440DlKLJJIIJZLJL;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(" 0.init ");
                    sbLIZ.append(c348440DlKLJJIIJZLJL);
                    LJFF(C2188811AlT.LIZIZ(sbLIZ));
                }

                @Override // X.AbstractC348060Dki
                public final void LIZJ(NLEEditor nLEEditor) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(" 1.executeNLE ");
                    sbLIZ.append(this.LIZIZ);
                    LJFF(C2188811AlT.LIZIZ(sbLIZ));
                    Pair<NLETrack, NLETrackSlot> pairLIZIZ = C14LJ.LIZIZ(nLEEditor.getModel(), this.LIZIZ.LIZIZ);
                    if (pairLIZIZ != null) {
                        pairLIZIZ.getFirst().removeSlot(pairLIZIZ.getSecond());
                        if (pairLIZIZ.getFirst().getSlots().size() <= 0) {
                            nLEEditor.getModel().removeTrack(pairLIZIZ.getFirst());
                        }
                    }
                }
            });
            this.LJIIIIZZ.remove(str);
            this.LJIIIZ.remove(str);
            this.LJIIJ.remove(str);
            this.LJIIJJI.remove(str);
            return 0;
        }
        return -1;
    }

    @Override // X.C0FW6
    public final String LJJII(C348460DlM c348460DlM) {
        this.LIZIZ.invoke(new C347930DkV(c348460DlM, this.LJII));
        HashMap<String, C348460DlM> map = this.LJIIIIZZ;
        String str = c348460DlM.LIZIZ;
        if (str != null) {
            map.put(str, c348460DlM);
            String str2 = c348460DlM.LIZIZ;
            if (str2 != null) {
                return str2;
            }
            "Required value was null.".toString();
            throw new IllegalStateException("Required value was null.");
        }
        "Required value was null.".toString();
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.C0FW6
    public final C348440DlK LJJIIJZLJL(String str) {
        C348460DlM c348460DlM = this.LJIIIIZZ.get(str);
        if (c348460DlM != null) {
            return c348460DlM;
        }
        C348450DlL c348450DlL = this.LJIIIZ.get(str);
        if (c348450DlL != null) {
            return c348450DlL;
        }
        C356730Dyh c356730Dyh = this.LJIIJ.get(str);
        if (c356730Dyh != null) {
            return c356730Dyh;
        }
        C347950DkX c347950DkX = this.LJIIJJI.get(str);
        if (c347950DkX != null) {
            return c347950DkX;
        }
        return null;
    }

    @Override // X.InterfaceC347190DjJ
    public final void LJJIJLIJ(NLEEditor nLEEditor) {
        LJIIJJI(nLEEditor.getModel());
    }

    @Override // X.C0FW6
    public final String LJJJJI(final C348450DlL c348450DlL) {
        Function1<AbstractC348060Dki, Unit> function1 = this.LIZIZ;
        final Boolean bool = this.LJII;
        function1.invoke(new AbstractC348060Dki(c348450DlL, bool) { // from class: X.0DkW
            public final C348450DlL LIZIZ;
            public final Boolean LIZJ;

            @Override // X.AbstractC348060Dki
            public final void LIZJ(NLEEditor nLEEditor) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(" 1.executeNLE ");
                sbLIZ.append(this.LIZIZ);
                LJFF(C2188811AlT.LIZIZ(sbLIZ));
                NLETrack nLETrack = new NLETrack();
                nLETrack.setExtraTrackType(NLETrackType.STICKER);
                boolean z = true;
                nLETrack.setEnable(true);
                nLETrack.setExtra("StickerTrackType", this.LIZIZ.LIZ.name());
                if (!Intrinsics.LJFF(this.LIZJ, Boolean.TRUE) || !C1452960nug.LJIIIIZZ) {
                    z = false;
                }
                nLETrack.setExtra("follow_max", String.valueOf(z));
                if (C348020Dke.LIZ(nLETrack)) {
                    nLETrack.setRewind(nLEEditor.getModel().getRewind());
                }
                if (this.LIZIZ.LJIILL) {
                    nLETrack.setExtra("StickerTrackName", "attribution_link");
                }
                NLETrackSlot nLETrackSlot = new NLETrackSlot();
                nLETrackSlot.setExtra("previewIconPath", this.LIZIZ.LJIIL);
                NLESegmentImageSticker nLESegmentImageSticker = new NLESegmentImageSticker();
                NLEResourceNode nLEResourceNode = new NLEResourceNode();
                nLEResourceNode.setResourceFile(this.LIZIZ.LJIIL);
                nLEResourceNode.setResourceType(NLEResType.IMAGE_STICKER);
                nLESegmentImageSticker.setImageFile(nLEResourceNode);
                nLETrackSlot.setMainSegment(nLESegmentImageSticker);
                nLETrackSlot.setRelativeWidth(this.LIZIZ.LJIILIIL);
                nLETrackSlot.setRelativeHeight(this.LIZIZ.LJIILJJIL);
                new C347900DkS(this.LIZIZ).LJII(nLETrackSlot);
                nLETrack.addSlot(nLETrackSlot);
                nLEEditor.getModel().addTrack(nLETrack);
                this.LIZIZ.LIZIZ = nLETrackSlot.getUUID();
            }

            {
                this.LIZIZ = c348450DlL;
                this.LIZJ = bool;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(" 0.init ");
                sbLIZ.append(c348450DlL);
                LJFF(C2188811AlT.LIZIZ(sbLIZ));
            }
        });
        this.LJIIIZ.put(c348450DlL.LIZIZ, c348450DlL);
        return c348450DlL.LIZIZ;
    }

    @Override // X.C0FW6
    public final String LJJJJZI(final C347950DkX c347950DkX) {
        Function1<AbstractC348060Dki, Unit> function1 = this.LIZIZ;
        final long duration = this.LIZ.getPlayerApi().getDuration();
        function1.invoke(new AbstractC348060Dki(c347950DkX, duration) { // from class: X.0DkY
            public final C347950DkX LIZIZ;
            public final long LIZJ;

            public static List LJII(NLEModel nLEModel) {
                VecNLETrackSPtr tracks = nLEModel.getTracks();
                ArrayList arrayList = new ArrayList();
                for (NLETrack nLETrack : tracks) {
                    NLETrack nLETrack2 = nLETrack;
                    if (nLETrack2.getEnable() && C347830DkL.LIZ(nLETrack2) == NLETrackType.STICKER) {
                        arrayList.add(nLETrack);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (Intrinsics.LJFF(C348350DlB.LJIIJ((NLETrack) obj), "TEXT")) {
                        arrayList2.add(obj);
                    }
                }
                return arrayList2;
            }

            @Override // X.AbstractC348060Dki
            public final void LIZJ(NLEEditor nLEEditor) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(" 1.executeNLE ");
                sbLIZ.append(this.LIZIZ);
                LJFF(C2188811AlT.LIZIZ(sbLIZ));
                String str = this.LIZIZ.LIZIZ;
                int iIntValue = 0;
                if (str != null && !a0.LJJJIL(str) && C14LJ.LIZ(nLEEditor.getModel(), this.LIZIZ.LIZIZ) != null) {
                    return;
                }
                NLETrackSlot nLETrackSlot = new NLETrackSlot();
                nLETrackSlot.setMainSegment(new NLESegmentTextSticker());
                nLETrackSlot.setStartTime(0L);
                nLETrackSlot.setEndTime(this.LIZJ);
                ArrayList<NLETrack> arrayList = new ArrayList(LJII(nLEEditor.getModel()));
                if (arrayList.size() > 1) {
                    C08XD.LJJ(arrayList, new AComparatorS24S0000000_5(110));
                }
                for (NLETrack nLETrack : arrayList) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.addAll(nLETrack.getSlots());
                    if (arrayList2.size() > 1) {
                        C08XD.LJJ(arrayList2, new AComparatorS24S0000000_5(111));
                    }
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        NLETimeSpaceNode nLETimeSpaceNode = (NLETimeSpaceNode) ListProtector.get(arrayList2, i);
                        if (arrayList2.size() == 1 && (nLETimeSpaceNode.getEndTime() < nLETrackSlot.getStartTime() || nLETimeSpaceNode.getStartTime() > nLETrackSlot.getEndTime())) {
                            nLETrack.addSlot(nLETrackSlot);
                            if (((Boolean) C0A6D.LIZ.getValue()).booleanValue()) {
                                this.LIZIZ.LIZIZ = nLETrackSlot.getUUID();
                                return;
                            }
                            return;
                        }
                        if (i == arrayList2.size() - 1) {
                            if (nLETimeSpaceNode.getEndTime() < nLETrackSlot.getStartTime()) {
                                nLETrack.addSlot(nLETrackSlot);
                                if (((Boolean) C0A6D.LIZ.getValue()).booleanValue()) {
                                    this.LIZIZ.LIZIZ = nLETrackSlot.getUUID();
                                    return;
                                }
                                return;
                            }
                        } else {
                            NLETimeSpaceNode nLETimeSpaceNode2 = (NLETimeSpaceNode) ListProtector.get(arrayList2, i + 1);
                            if (nLETimeSpaceNode.getEndTime() < nLETrackSlot.getStartTime() && nLETrackSlot.getEndTime() < nLETimeSpaceNode2.getStartTime()) {
                                nLETrack.addSlot(nLETrackSlot);
                                if (((Boolean) C0A6D.LIZ.getValue()).booleanValue()) {
                                    this.LIZIZ.LIZIZ = nLETrackSlot.getUUID();
                                    return;
                                }
                                return;
                            }
                        }
                    }
                }
                NLETrack nLETrack2 = new NLETrack();
                nLETrack2.setExtra("track_type", "sticker");
                nLETrack2.setExtra("StickerTrackType", "TEXT");
                nLETrack2.setExtra("follow_max", String.valueOf(C1452960nug.LJIIIIZZ));
                List listLJII = LJII(nLEEditor.getModel());
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(listLJII, 10));
                Iterator it2 = ((ArrayList) listLJII).iterator();
                while (it2.hasNext()) {
                    arrayList3.add(Integer.valueOf(((NLETimeSpaceNode) it2.next()).getLayer()));
                }
                Iterator it3 = arrayList3.iterator();
                if (it3.hasNext()) {
                    Integer numValueOf = Integer.valueOf(((Number) it3.next()).intValue());
                    while (it3.hasNext()) {
                        Integer numValueOf2 = Integer.valueOf(((Number) it3.next()).intValue());
                        if (numValueOf.compareTo(numValueOf2) < 0) {
                            numValueOf = numValueOf2;
                        }
                    }
                    if (numValueOf != null) {
                        iIntValue = numValueOf.intValue() + 1;
                    }
                }
                nLETrack2.setLayer(iIntValue);
                nLETrack2.setExtraTrackType(NLETrackType.STICKER);
                nLETrack2.addSlot(nLETrackSlot);
                nLEEditor.getModel().addTrack(nLETrack2);
                this.LIZIZ.LIZIZ = nLETrackSlot.getUUID();
            }

            {
                this.LIZIZ = c347950DkX;
                this.LIZJ = duration;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(" 0.init ");
                sbLIZ.append(c347950DkX);
                LJFF(C2188811AlT.LIZIZ(sbLIZ));
            }
        });
        String str = c347950DkX.LIZIZ;
        if (str != null) {
            this.LJIIJJI.put(str, c347950DkX);
            return str;
        }
        return "";
    }

    @Override // X.C0FW6
    public final void Pe(Boolean bool) {
        this.LJII = bool;
    }

    public C347920DkU(INLEMediaSession iNLEMediaSession, AwS584S0100000_5 awS584S0100000_5) {
        this.LIZ = iNLEMediaSession;
        this.LIZIZ = awS584S0100000_5;
    }

    @Override // X.C0FW6
    public final void LJJIL(final List list, final float f) {
        this.LIZIZ.invoke(new AbstractC348060Dki(list, f) { // from class: X.0DiT
            public final List<String> LIZIZ;
            public final float LIZJ;
            public final boolean LIZLLL = true;
            public final String LJ = NLEEditorJniJNI.NLEInstantMode_Key_get();
            public final String LJFF = NLEEditorJniJNI.NLEInstantMode_InstantStickerScale_get();

            @Override // X.AbstractC348060Dki
            public final void LIZJ(NLEEditor nLEEditor) {
                VecNLETrackSPtr tracks = nLEEditor.getModel().getTracks();
                ArrayList arrayList = new ArrayList();
                for (NLETrack nLETrack : tracks) {
                    if (true ^ TextUtils.isEmpty(C348350DlB.LJIIJ(nLETrack))) {
                        arrayList.add(nLETrack);
                    }
                }
                Iterator it2 = arrayList.iterator();
                boolean z = false;
                while (it2.hasNext()) {
                    for (NLETrackSlot nLETrackSlot : ((NLETrack) it2.next()).getSlots()) {
                        if (this.LIZIZ.contains(nLETrackSlot.getUUID())) {
                            nLETrackSlot.setScale(this.LIZJ);
                            if (this.LIZLLL) {
                                nLETrackSlot.setTransientExtra(this.LJ, this.LJFF);
                            }
                            z = true;
                        }
                    }
                }
                if (this.LIZLLL && z) {
                    nLEEditor.getModel().setTransientExtra(this.LJ, this.LJFF);
                }
            }

            {
                this.LIZIZ = list;
                this.LIZJ = f;
            }
        });
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            C348440DlK c348440DlKLJJIIJZLJL = LJJIIJZLJL((String) it2.next());
            if (c348440DlKLJJIIJZLJL != null) {
                c348440DlKLJJIIJZLJL.LJIIJ = f;
            }
        }
    }

    @Override // X.C0FW6
    public final void LJFF(final Float f, final Float f2, final String str) {
        this.LIZIZ.invoke(new AbstractC348060Dki(f, f2, str) { // from class: X.0Dk2
            public final String LIZIZ;
            public final Float LIZJ;
            public final Float LIZLLL;

            @Override // X.AbstractC348060Dki
            public final void LIZJ(NLEEditor nLEEditor) {
                NLETrackSlot nLETrackSlotLIZ = C14LJ.LIZ(nLEEditor.getModel(), this.LIZIZ);
                if (nLETrackSlotLIZ != null) {
                    Float f3 = this.LIZJ;
                    if (f3 != null) {
                        nLETrackSlotLIZ.setTransformX((f3.floatValue() - 0.5f) * 2);
                    }
                    Float f4 = this.LIZLLL;
                    if (f4 != null) {
                        nLETrackSlotLIZ.setTransformY((0.5f - f4.floatValue()) * 2);
                    }
                }
            }

            {
                this.LIZIZ = str;
                this.LIZJ = f;
                this.LIZLLL = f2;
            }
        });
        C348440DlK c348440DlKLJJIIJZLJL = LJJIIJZLJL(str);
        if (c348440DlKLJJIIJZLJL != null) {
            if (f != null) {
                c348440DlKLJJIIJZLJL.LJFF = f.floatValue();
            }
            if (f2 != null) {
                c348440DlKLJJIIJZLJL.LJI = f2.floatValue();
            }
        }
    }

    @Override // X.C0FW6
    public final void LJJIJIIJI(final List<String> list, final Float f, final Float f2) {
        this.LIZIZ.invoke(new AbstractC348060Dki(list, f, f2) { // from class: X.0DiS
            public final List<String> LIZIZ;
            public final Float LIZJ;
            public final Float LIZLLL;
            public final boolean LJ = false;
            public final String LJFF = NLEEditorJniJNI.NLEInstantMode_Key_get();
            public final String LJI = NLEEditorJniJNI.NLEInstantMode_InstantStickerTransform_get();

            @Override // X.AbstractC348060Dki
            public final void LIZJ(NLEEditor nLEEditor) {
                VecNLETrackSPtr tracks = nLEEditor.getModel().getTracks();
                ArrayList arrayList = new ArrayList();
                for (NLETrack nLETrack : tracks) {
                    if (true ^ TextUtils.isEmpty(C348350DlB.LJIIJ(nLETrack))) {
                        arrayList.add(nLETrack);
                    }
                }
                Iterator it2 = arrayList.iterator();
                boolean z = false;
                while (it2.hasNext()) {
                    for (NLETrackSlot nLETrackSlot : ((NLETrack) it2.next()).getSlots()) {
                        if (this.LIZIZ.contains(nLETrackSlot.getUUID())) {
                            Float f3 = this.LIZJ;
                            if (f3 != null) {
                                nLETrackSlot.setTransformX((f3.floatValue() - 0.5f) * 2);
                            }
                            Float f4 = this.LIZLLL;
                            if (f4 != null) {
                                nLETrackSlot.setTransformY((0.5f - f4.floatValue()) * 2);
                            }
                            if (this.LJ) {
                                nLETrackSlot.setTransientExtra(this.LJFF, this.LJI);
                            }
                            z = true;
                        }
                    }
                }
                if (this.LJ && z) {
                    nLEEditor.getModel().setTransientExtra(this.LJFF, this.LJI);
                }
            }

            {
                this.LIZIZ = list;
                this.LIZJ = f;
                this.LIZLLL = f2;
            }
        });
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            C348440DlK c348440DlKLJJIIJZLJL = LJJIIJZLJL((String) it2.next());
            if (c348440DlKLJJIIJZLJL != null) {
                if (f != null) {
                    c348440DlKLJJIIJZLJL.LJFF = f.floatValue();
                }
                if (f2 != null) {
                    c348440DlKLJJIIJZLJL.LJI = f2.floatValue();
                }
            }
        }
    }
}
