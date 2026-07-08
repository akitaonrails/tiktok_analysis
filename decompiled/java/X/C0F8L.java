package X;

import android.graphics.Color;
import android.graphics.RectF;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLEStickerRuntime;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEMediaUtil;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLERectF;
import com.bytedance.ies.nle.editor_jni.NLESegmentTemplate;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.PairIntInt;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.SubTemplateInfo;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextTemplateModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.util.Content;
import com.ss.android.ugc.aweme.tools.sticker.core.text.util.Fill;
import com.ss.android.ugc.aweme.tools.sticker.core.text.util.Font;
import com.ss.android.ugc.aweme.tools.sticker.core.text.util.NLETextRichContent;
import com.ss.android.ugc.aweme.tools.sticker.core.text.util.NewTextTemplateRichText;
import com.ss.android.ugc.aweme.tools.sticker.core.text.util.Solid;
import com.ss.android.ugc.aweme.tools.sticker.core.text.util.Stroke;
import com.ss.android.ugc.aweme.tools.sticker.core.text.util.Style;
import com.ss.android.vesdk.VESize;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS0S0006003_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0F8L, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F8L extends C0ERI {
    public final InterfaceC386690FEd LJIIJJI;
    public final VESize LJIIL;
    public final C1664680tQA<TextStickerModel> LJIILIIL;
    public final C1664680tQA<BaseStickerModel> LJIILJJIL;
    public final LifecycleOwner LJIILL;
    public final FrameLayout LJIILLIIL;
    public final InterfaceC388760FMc LJIIZILJ;
    public final NLEEditor LJIJ;
    public String LJIJI;
    public final int LJIJJ;

    @Override // X.C0ERI, X.C0FFP
    public final void LIZLLL() {
        List<NLESegmentTextSticker> listLIZLLL;
        String textStr;
        Style style;
        Stroke stroke;
        Solid solid;
        Solid solid2;
        Content content;
        Solid solid3;
        Content content2;
        Solid solid4;
        C0FF8 c0ff8LIZ;
        NLETrack next;
        TextStickerModel textStickerModel = this.LJIILIIL.LIZ;
        char c = 0;
        if (!Intrinsics.LJFF(this.LJIJI, textStickerModel.getTextTemplateModel().templateEffectId)) {
            this.LJIJI = textStickerModel.getTextTemplateModel().templateEffectId;
            TextStickerModel textStickerModel2 = this.LJIILIIL.LIZ;
            NLEModel model = this.LJIJ.getModel();
            if (model != null) {
                Iterator<NLETrack> it2 = model.getTracks().iterator();
                loop0: while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    VecNLETrackSlotSPtr slots = next.getSlots();
                    if (!(slots instanceof Collection) || !slots.isEmpty()) {
                        Iterator<NLETrackSlot> it3 = slots.iterator();
                        while (it3.hasNext()) {
                            if (Intrinsics.LJFF(it3.next().getUUID(), textStickerModel2.getTextTemplateModel().templateuuid)) {
                                break loop0;
                            }
                        }
                    }
                }
                NLETrack nLETrack = next;
                if (nLETrack != null) {
                    model.removeTrack(nLETrack);
                }
            }
            LJIIJJI();
        }
        NLETrackSlot nLETrackSlotLJII = LJII();
        if (nLETrackSlotLJII == null || (listLIZLLL = C347080Dj8.LIZLLL(nLETrackSlotLJII)) == null) {
            return;
        }
        InterfaceC388760FMc interfaceC388760FMc = this.LJIIZILJ;
        if (interfaceC388760FMc != null && (c0ff8LIZ = interfaceC388760FMc.LIZ()) != null) {
            c0ff8LIZ.LJIIL();
        }
        int i = 0;
        for (Object obj : (ArrayList) listLIZLLL) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            NLESegmentTextSticker nLESegmentTextSticker = (NLESegmentTextSticker) obj;
            if (textStickerModel.getTextTemplateModel().isGroupTextTemplates) {
                SubTemplateInfo subTemplateInfo = (SubTemplateInfo) C13LP.LJJJLZIJ(i, textStickerModel.getCompatModel().getSubTemplates());
                if (subTemplateInfo == null || (textStr = subTemplateInfo.text) == null) {
                    textStr = "";
                }
            } else {
                textStr = textStickerModel.getTextStr();
            }
            int iLIZJ = C0F8Y.LIZJ(textStickerModel, i);
            TextFontModel textFontModelLIZLLL = C0F8Y.LIZLLL(textStickerModel, i);
            int iLIZIZ = C0F8Y.LIZIZ(textStickerModel, i);
            C0F8O c0f8o = C0F8M.LJJIJ;
            String richContent = nLESegmentTextSticker.getRichContent();
            c0f8o.getClass();
            C0F8M c0f8mLIZ = C0F8O.LIZ(richContent);
            NewTextTemplateRichText newTextTemplateRichText = c0f8mLIZ.LJJIIZI;
            if (newTextTemplateRichText != null) {
                newTextTemplateRichText.text = textStr;
                List<Style> list = newTextTemplateRichText.styles;
                if (list != null && (style = (Style) C13LP.LJJJLL(list)) != null) {
                    Integer[] numArr = new Integer[2];
                    numArr[c] = 0;
                    numArr[1] = Integer.valueOf(textStr.length());
                    style.range = C1697810uHb.LJIIJJI(numArr);
                    if (!C0FAS.LIZLLL(textStickerModel.getTextTemplateModel(), i)) {
                        Pair pairLIZLLL = C0F9I.LIZLLL(iLIZJ, 4);
                        int iIntValue = ((Number) pairLIZLLL.getFirst()).intValue();
                        Fill fill = style.fill;
                        if (fill != null && (content2 = fill.content) != null && (solid4 = content2.solid) != null) {
                            solid4.color = C1697810uHb.LJIIJJI(Float.valueOf(Color.red(iIntValue) / 255.0f), Float.valueOf(Color.green(iIntValue) / 255.0f), Float.valueOf(Color.blue(iIntValue) / 255.0f));
                        }
                        Fill fill2 = style.fill;
                        if (fill2 != null && (content = fill2.content) != null && (solid3 = content.solid) != null) {
                            solid3.alpha = Float.valueOf(Color.alpha(iIntValue) / 255.0f);
                        }
                        int iIntValue2 = ((Number) pairLIZLLL.getSecond()).intValue();
                        List<Stroke> list2 = style.strokes;
                        if (list2 != null && (stroke = (Stroke) C13LP.LJJJLL(list2)) != null) {
                            Content content3 = stroke.content;
                            if (content3 != null && (solid2 = content3.solid) != null) {
                                solid2.color = C1697810uHb.LJIIJJI(Float.valueOf(Color.red(iIntValue2) / 255.0f), Float.valueOf(Color.green(iIntValue2) / 255.0f), Float.valueOf(Color.blue(iIntValue2) / 255.0f));
                            }
                            Content content4 = stroke.content;
                            if (content4 != null && (solid = content4.solid) != null) {
                                solid.alpha = Float.valueOf(Color.alpha(iIntValue2) / 255.0f);
                            }
                        }
                    }
                    if (!C0FAS.LJ(textStickerModel.getTextTemplateModel(), i)) {
                        style.font = new Font(null, textFontModelLIZLLL.localPath);
                    }
                }
            }
            if (!C0FAS.LIZJ(this.LJIILIIL.LIZ.getTextTemplateModel(), i)) {
                c0f8mLIZ.LIZLLL(Integer.valueOf(iLIZIZ - 1));
                c0f8mLIZ.LJ(0);
            }
            NLETextRichContent.Companion.getClass();
            c0f8mLIZ.LJIIZILJ.setValue(c0f8mLIZ, C0F8M.LJJIJIIJI[18], new JSONArray((Collection) C0F8B.LIZIZ("")));
            nLESegmentTextSticker.setRichContent(c0f8mLIZ.LJFF());
            i = i2;
            c = 0;
        }
        this.LJIJ.commit();
    }

    @Override // X.C0ERI
    public final NLETrackSlot LJII() {
        NLEModel model;
        VecNLETrackSPtr tracks;
        String str = this.LJIILIIL.LIZ.getTextTemplateModel().templateuuid;
        if (!(str.length() == 0) && (model = this.LJIJ.getModel()) != null && (tracks = model.getTracks()) != null) {
            ArrayList arrayList = new ArrayList();
            for (NLETrack nLETrack : tracks) {
                if (C385050F7v.LJIIL(nLETrack)) {
                    arrayList.add(nLETrack);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                VecNLETrackSlotSPtr slots = ((NLETrack) it2.next()).getSlots();
                if (slots != null) {
                    for (NLETrackSlot nLETrackSlot : slots) {
                        if (Intrinsics.LJFF(nLETrackSlot.getUUID(), str)) {
                            return nLETrackSlot;
                        }
                    }
                }
            }
        }
        return null;
    }

    public final void LJIIJJI() {
        Integer num;
        InterfaceC1452170ntP interfaceC1452170ntPLJII;
        NLEModel nLEModelLIZ;
        VESize initSize;
        VecNLETrackSlotSPtr childElementLists;
        InterfaceC1452170ntP interfaceC1452170ntPLJII2;
        NLEModel nLEModelLIZ2;
        VESize initSize2;
        NLEModel model = this.LJIJ.getModel();
        if (model == null) {
            return;
        }
        BaseStickerModel baseStickerModel = this.LJIILIIL.LIZ.getBaseStickerModel();
        TextTemplateModel textTemplateModel = this.LJIILIIL.LIZ.getTextTemplateModel();
        Integer numLJ = C348350DlB.LJ(this.LJIJ.getModel());
        int iIntValue = 0;
        int iIntValue2 = numLJ != null ? numLJ.intValue() : 0;
        int canvasRatio = (int) (iIntValue2 / this.LJIJ.getModel().getCanvasRatio());
        String str = textTemplateModel.templatePath;
        String str2 = textTemplateModel.dependResourcesJson;
        if (!(str2.length() > 0)) {
            str2 = "{}";
        }
        NLETrackSlot nLETrackSlotCreateNLESegmentTemplateWithResourceFolderPath = NLEMediaUtil.createNLESegmentTemplateWithResourceFolderPath(str, str2, new PairIntInt(iIntValue2, canvasRatio));
        if (nLETrackSlotCreateNLESegmentTemplateWithResourceFolderPath != null) {
            nLETrackSlotCreateNLESegmentTemplateWithResourceFolderPath.setEnable(true);
            nLETrackSlotCreateNLESegmentTemplateWithResourceFolderPath.setRotation((-baseStickerModel.getRotation()) % 360);
            int i = this.LJIIL.height;
            if (i == 0) {
                InterfaceC386690FEd interfaceC386690FEd = this.LJIIJJI;
                i = (interfaceC386690FEd == null || (initSize2 = interfaceC386690FEd.getInitSize()) == null) ? 0 : initSize2.height;
            }
            InterfaceC386690FEd interfaceC386690FEd2 = this.LJIIJJI;
            long maxTargetEnd = (interfaceC386690FEd2 == null || (interfaceC1452170ntPLJII2 = interfaceC386690FEd2.LJII()) == null || (nLEModelLIZ2 = C352130DrH.LIZ(interfaceC1452170ntPLJII2)) == null) ? ((long) 10000) * 1000 : nLEModelLIZ2.getMaxTargetEnd();
            baseStickerModel.setUiStartTime(0.0f);
            float f = maxTargetEnd / 1000.0f;
            baseStickerModel.setUiEndTime(f);
            baseStickerModel.setStartTime(0.0f);
            baseStickerModel.setEndTime(f);
            nLETrackSlotCreateNLESegmentTemplateWithResourceFolderPath.setDuration(maxTargetEnd);
            nLETrackSlotCreateNLESegmentTemplateWithResourceFolderPath.setEndTime(maxTargetEnd);
            NLESegmentTemplate nLESegmentTemplateDynamicCast = NLESegmentTemplate.dynamicCast(nLETrackSlotCreateNLESegmentTemplateWithResourceFolderPath.getMainSegment());
            if (nLESegmentTemplateDynamicCast != null && (childElementLists = nLESegmentTemplateDynamicCast.getChildElementLists()) != null) {
                Iterator<NLETrackSlot> it2 = childElementLists.iterator();
                while (it2.hasNext()) {
                    NLETrackSlot nLETrackSlotDynamicCast = NLETrackSlot.dynamicCast((NLENode) it2.next());
                    if (nLETrackSlotDynamicCast != null && nLETrackSlotDynamicCast.getStartTime() == 0 && nLETrackSlotDynamicCast.getEndTime() != maxTargetEnd) {
                        nLETrackSlotDynamicCast.setEndTime(maxTargetEnd);
                        nLETrackSlotDynamicCast.setDuration(maxTargetEnd);
                    }
                }
            }
            int i2 = this.LJIIL.width;
            if (i2 == 0) {
                InterfaceC386690FEd interfaceC386690FEd3 = this.LJIIJJI;
                i2 = (interfaceC386690FEd3 == null || (initSize = interfaceC386690FEd3.getInitSize()) == null) ? 0 : initSize.width;
            }
            if (i != 0) {
                nLETrackSlotCreateNLESegmentTemplateWithResourceFolderPath.setTransformY(((-2) * baseStickerModel.getTranslateY()) / i);
            }
            if (i2 != 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("create translateX: ");
                sbLIZ.append(baseStickerModel.getTranslateX());
                C0F8J.LIZ("inspiration-translateX", C2188811AlT.LIZIZ(sbLIZ));
                nLETrackSlotCreateNLESegmentTemplateWithResourceFolderPath.setTransformX((2 * baseStickerModel.getTranslateX()) / i2);
            }
            nLETrackSlotCreateNLESegmentTemplateWithResourceFolderPath.setScale(baseStickerModel.getScale());
            NLEModel model2 = this.LJIJ.getModel();
            if (model2 == null) {
                return;
            }
            NLETrack nLETrack = new NLETrack();
            nLETrack.setEnable(true);
            InterfaceC386690FEd interfaceC386690FEd4 = this.LJIIJJI;
            long maxTargetEnd2 = (interfaceC386690FEd4 == null || (interfaceC1452170ntPLJII = interfaceC386690FEd4.LJII()) == null || (nLEModelLIZ = C352130DrH.LIZ(interfaceC1452170ntPLJII)) == null) ? 1000 * ((long) 10000) : nLEModelLIZ.getMaxTargetEnd();
            nLETrack.setDuration(maxTargetEnd2);
            nLETrack.setEndTime(maxTargetEnd2);
            nLETrack.setExtra("StickerTrackType", "TEXT");
            nLETrack.setExtra("track_type", "sticker");
            nLETrack.setExtraTrackType(NLETrackType.STICKER);
            List<NLETrack> listLJIIIIZZ = C385050F7v.LJIIIIZZ(model2);
            if (nLETrack.getLayer() == 0) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) listLJIIIIZZ;
                for (Object obj : arrayList2) {
                    if (((NLETimeSpaceNode) obj).getLayer() == 0) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.size() > 1) {
                    ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(listLJIIIIZZ, 10));
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(Integer.valueOf(((NLETimeSpaceNode) it3.next()).getLayer()));
                    }
                    Iterator it4 = arrayList3.iterator();
                    if (it4.hasNext()) {
                        Integer numValueOf = Integer.valueOf(((Number) it4.next()).intValue());
                        loop3: while (true) {
                            num = numValueOf;
                            while (it4.hasNext()) {
                                numValueOf = Integer.valueOf(((Number) it4.next()).intValue());
                                if (num.compareTo(numValueOf) < 0) {
                                    break;
                                }
                            }
                        }
                        if (num != null) {
                            iIntValue = num.intValue() + 1;
                        }
                    }
                    nLETrack.setLayer(iIntValue);
                }
            }
            nLETrack.addSlot(nLETrackSlotCreateNLESegmentTemplateWithResourceFolderPath);
            model.addTrack(nLETrack);
            TextStickerModel textStickerModel = this.LJIILIIL.LIZ;
            textStickerModel.getTextTemplateModel().templateuuid = nLETrackSlotCreateNLESegmentTemplateWithResourceFolderPath.getUUID();
            textStickerModel.setUuid(nLETrackSlotCreateNLESegmentTemplateWithResourceFolderPath.getUUID());
        }
    }

    public final void LJIIL() {
        if (!C123100dR.LIZ(this.LJIILIIL.LIZ.getTextTemplateModel().templateuuid)) {
            LJIIJJI();
        }
        super.LJIIIIZZ();
        this.LJIILIIL.LIZ(new C2217371BqR() { // from class: X.0F8N
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((TextStickerModel) obj).getVisible());
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((TextStickerModel) obj).setVisible(((Boolean) obj2).booleanValue());
            }
        }).LJIIIZ(this.LJIILL, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 957));
        this.LJIILIIL.LIZ(new C2217371BqR() { // from class: X.0ERe
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((TextStickerModel) obj).getEnable());
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((TextStickerModel) obj).setEnable(((Boolean) obj2).booleanValue());
            }
        }).LJIIIZ(this.LJIILL, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 958));
    }

    public final void LJIILJJIL() {
        INLEMediaSession iNLEMediaSessionF1;
        INLEStickerRuntime stickerApi;
        if (this.LJIIJ) {
            int left = this.LJIILLIIL.getLeft();
            int top = this.LJIILLIIL.getTop();
            int width = this.LJIILLIIL.getWidth() > 0 ? this.LJIILLIIL.getWidth() : this.LJIILLIIL.getLayoutParams().width;
            int height = this.LJIILLIIL.getHeight() > 0 ? this.LJIILLIIL.getHeight() : this.LJIILLIIL.getLayoutParams().height;
            NLETrackSlot nLETrackSlotLJII = LJII();
            if (nLETrackSlotLJII == null) {
                return;
            }
            float rotation = nLETrackSlotLJII.getRotation();
            InterfaceC386690FEd interfaceC386690FEd = this.LJIIJJI;
            if (interfaceC386690FEd == null || (iNLEMediaSessionF1 = interfaceC386690FEd.f1()) == null || (stickerApi = iNLEMediaSessionF1.getStickerApi()) == null) {
                return;
            }
            NLERectF newTextTemplateBoundingBox = stickerApi.getNewTextTemplateBoundingBox(nLETrackSlotLJII);
            if (newTextTemplateBoundingBox.getLeft() >= newTextTemplateBoundingBox.getRight() || newTextTemplateBoundingBox.getTop() <= newTextTemplateBoundingBox.getBottom()) {
                return;
            }
            float scale = this.LJIILJJIL.LIZ.getScale();
            RectF rectF = new RectF();
            rectF.left = C363400EMo.LIZJ(newTextTemplateBoundingBox.getLeft() / scale);
            rectF.top = C363400EMo.LIZLLL(newTextTemplateBoundingBox.getTop() / scale);
            rectF.right = C363400EMo.LIZJ(newTextTemplateBoundingBox.getRight() / scale);
            rectF.bottom = C363400EMo.LIZLLL(newTextTemplateBoundingBox.getBottom() / scale);
            float f = rectF.left;
            float f2 = width;
            float f3 = height;
            this.LJIILJJIL.LIZLLL(new AwS0S0006003_5(width, height, f * f2, rectF.top * f3, (int) Math.abs((rectF.right - f) * f2), (int) Math.abs((rectF.bottom - rectF.top) * f3), left, top, rotation, 0), true);
        }
    }

    @Override // X.C0ERI, X.C0FFP
    public final void LIZIZ() {
        LJIILJJIL();
        if (this.LJIILLIIL.getLeft() == 0 && this.LJIILLIIL.getTop() == 0) {
            this.LJIILLIIL.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC391530FWt(this, 13));
        }
    }

    @Override // X.C0ERI
    public final int LJFF() {
        return this.LJIJJ;
    }

    public static final void LJIILIIL(C0F8L c0f8l, boolean z) {
        NLETrackSlot nLETrackSlotLJII = c0f8l.LJII();
        if (nLETrackSlotLJII == null || !c0f8l.LJIILIIL.LIZ.getTextTemplateModel().enableTextTemplate || nLETrackSlotLJII.getEnable() == z) {
            return;
        }
        nLETrackSlotLJII.setEnable(z);
        c0f8l.LJ();
    }

    public C0F8L(InterfaceC386690FEd interfaceC386690FEd, VESize vESize, C1664680tQA<TextStickerModel> c1664680tQA, C1664680tQA<BaseStickerModel> c1664680tQA2, LifecycleOwner lifecycleOwner, FrameLayout frameLayout, InterfaceC388760FMc interfaceC388760FMc) {
        NLEEditor nLEEditorLJI;
        super(interfaceC386690FEd, vESize, c1664680tQA2, lifecycleOwner, frameLayout, interfaceC388760FMc);
        this.LJIIJJI = interfaceC386690FEd;
        this.LJIIL = vESize;
        this.LJIILIIL = c1664680tQA;
        this.LJIILJJIL = c1664680tQA2;
        this.LJIILL = lifecycleOwner;
        this.LJIILLIIL = frameLayout;
        this.LJIIZILJ = interfaceC388760FMc;
        this.LJIJ = (interfaceC386690FEd == null || (nLEEditorLJI = interfaceC386690FEd.LJI()) == null) ? C346630DiP.LIZ() : nLEEditorLJI;
        this.LJIJI = c1664680tQA.LIZ.getTextTemplateModel().templateEffectId;
        this.LJIJJ = 2000;
    }
}
