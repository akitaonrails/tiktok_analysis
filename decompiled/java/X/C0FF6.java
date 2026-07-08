package X;

import Y.AComparatorS24S0000000_5;
import android.content.Context;
import android.graphics.RectF;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStyleModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FF6, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FF6 extends AbstractC388880FMo<TextStickerModel> {
    public final InterfaceC388760FMc LJII;
    public final C0FTH LJIIIIZZ;
    public final List<C0FTJ<StickerModel>> LJIIIZ;
    public final List<C0FTB> LJIIJ;
    public final C0FUK LJIIJJI;
    public final C01GW LJIIL;
    public final C01GW LJIILIIL;

    public final C0FF8 LJIIIIZZ() {
        return (C0FF8) this.LJIILIIL.getValue();
    }

    @Override // X.AbstractC388880FMo
    public final C0FEF LIZIZ() {
        C0FF8 c0ff8LJIIIIZZ = LJIIIIZZ();
        if (c0ff8LJIIIIZZ != null) {
            return c0ff8LJIIIIZZ.LJII();
        }
        return null;
    }

    @Override // X.AbstractC388880FMo
    public final EnumC1466150oFx LIZLLL() {
        return EnumC1466150oFx.TEXT;
    }

    @Override // X.AbstractC388880FMo
    public final RectF LJ(StickerModel stickerModel) {
        TextStickerModel textStickerModel;
        BaseStickerModel baseModel = stickerModel.getBaseModel();
        RectF visibleRectWithoutRotation = baseModel.getVisibleRectWithoutRotation();
        if (!(stickerModel instanceof TextStickerModel) || (textStickerModel = (TextStickerModel) stickerModel) == null) {
            return null;
        }
        if (textStickerModel.getMode() != 2 && !textStickerModel.getTextTemplateModel().enableTextTemplate && textStickerModel.getMode() != 3) {
            TextStyleModel textStyle = textStickerModel.getTextStyle();
            if (textStyle == null || textStyle.background == null) {
                return BaseStickerModel.copy$default(baseModel, 0, 0, null, 0, 0, 0.0f, 0.0f, baseModel.getWidth() - (((int) C11VU.LIZIZ(12.0f, this.LIZ)) * 2), baseModel.getHeight() - (((int) C11VU.LIZIZ(8.0f, this.LIZ)) * 2), 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -385, 15, null).getVisibleRectWithoutRotation();
            }
            return visibleRectWithoutRotation;
        }
        return visibleRectWithoutRotation;
    }

    @Override // X.AbstractC388880FMo
    public final StickerModel LIZJ(StickerModel stickerModel, int i) {
        int containerWidth;
        int containerHeight;
        boolean z;
        C0FK0 c0fk0LJIILLIIL;
        TextStickerModel textStickerModel = (TextStickerModel) stickerModel;
        BaseStickerModel baseModel = textStickerModel.getBaseModel();
        if (!C385630FAb.LIZJ(textStickerModel.getBaseStickerModel())) {
            C0FF8 c0ff8LJIIIIZZ = LJIIIIZZ();
            if (c0ff8LJIIIIZZ != null && (c0fk0LJIILLIIL = c0ff8LJIIIIZZ.LJIILLIIL()) != null && c0fk0LJIILLIIL.LJIJI) {
                C385630FAb.LJ(textStickerModel.getBaseStickerModel(), this.LJII.LJI());
            } else {
                C385630FAb.LIZLLL(textStickerModel.getBaseStickerModel(), this.LJII.LJ(), this.LJII.LJI());
            }
        }
        float centerX = baseModel.getCenterX();
        float centerY = baseModel.getCenterY();
        if (baseModel.getCenterX() == 0.0f || baseModel.getCenterY() == 0.0f) {
            centerX = this.LIZIZ.getWidth() / 2.0f;
            centerY = this.LIZIZ.getHeight() / 2.0f;
        }
        BaseStickerModel baseStickerModel = textStickerModel.getBaseStickerModel();
        if (baseModel.getContainerWidth() == 0) {
            containerWidth = this.LIZIZ.getWidth();
        } else {
            containerWidth = baseModel.getContainerWidth();
        }
        if (baseModel.getContainerHeight() == 0) {
            containerHeight = this.LIZIZ.getHeight();
        } else {
            containerHeight = baseModel.getContainerHeight();
        }
        if (!stickerModel.isVERenderSticker() && textStickerModel.getBaseModel().getStartTime() > 0.0f) {
            z = false;
        } else {
            z = true;
        }
        return TextStickerModel.copy$default(textStickerModel, BaseStickerModel.copy$default(baseStickerModel, i, 0, null, 0, 0, centerX, centerY, 0, 0, 0, 0, containerWidth, containerHeight, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, z, 0.0f, null, null, null, false, -1073748066, 15, null), null, null, null, null, 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -2, 65535, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0075  */
    @Override // X.AbstractC388880FMo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Integer LJII(int r8, int r9) {
        /*
            r7 = this;
            X.0FMc r0 = r7.LJII
            X.0FF8 r0 = r0.LIZ()
            r1 = 1
            if (r0 == 0) goto Lc3
            X.0FK0 r0 = r0.LJIILLIIL()
            if (r0 == 0) goto Lc3
            boolean r0 = r0.LJJIJIIJI
            if (r0 != r1) goto Lc3
            X.01GW r0 = r7.LJIIL
            java.lang.Object r0 = r0.getValue()
            X.0FT9 r0 = (X.C0FT9) r0
            kotlin.jvm.functions.Function1<X.0oFx, java.util.List<X.0FTJ<com.ss.android.ugc.aweme.tools.sticker.core.StickerModel>>> r1 = r0.LJ
            X.0oFx r0 = X.EnumC1466150oFx.TEXT
            java.lang.Object r4 = r1.invoke(r0)
            java.util.List r4 = (java.util.List) r4
            r6 = 0
            if (r4 == 0) goto L75
            java.util.Iterator r2 = r4.iterator()
        L2c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L73
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.0FTJ r0 = (X.C0FTJ) r0
            int r0 = r0.getStickerId()
            if (r0 != r8) goto L2c
        L3f:
            X.0FTJ r1 = (X.C0FTJ) r1
            if (r1 == 0) goto L75
            com.ss.android.ugc.aweme.tools.sticker.core.StickerModel r1 = r1.LJLI()
        L47:
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel
            if (r0 == 0) goto L7c
            com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel r1 = (com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel) r1
            if (r1 == 0) goto L7c
            com.ss.android.ugc.aweme.tools.sticker.core.text.model.CaptionModel r0 = r1.getCaptionModel()
            if (r0 == 0) goto L77
            com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel r0 = r1.getBaseStickerModel()
            float r3 = r0.getStartTime()
            com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel r0 = r1.getBaseStickerModel()
            float r2 = r0.getEndTime()
            float r1 = (float) r9
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L7c
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 > 0) goto L7c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            return r0
        L73:
            r1 = r6
            goto L3f
        L75:
            r1 = r6
            goto L47
        L77:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            return r0
        L7c:
            if (r4 == 0) goto Lc2
            java.util.Iterator r5 = r4.iterator()
        L82:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto Lc2
            java.lang.Object r4 = r5.next()
            X.0FTJ r4 = (X.C0FTJ) r4
            com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel r0 = r4.LJJIIJZLJL()
            float r3 = r0.getStartTime()
            com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel r0 = r4.LJJIIJZLJL()
            float r2 = r0.getEndTime()
            float r1 = (float) r9
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L82
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 > 0) goto L82
            com.ss.android.ugc.aweme.tools.sticker.core.StickerModel r1 = r4.LJLI()
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel
            if (r0 == 0) goto L82
            com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel r1 = (com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel) r1
            if (r1 == 0) goto L82
            com.ss.android.ugc.aweme.tools.sticker.core.text.model.CaptionModel r0 = r1.getCaptionModel()
            if (r0 == 0) goto L82
            int r0 = r4.getStickerId()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        Lc2:
            return r6
        Lc3:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0FF6.LJII(int, int):java.lang.Integer");
    }

    @Override // X.AbstractC388880FMo
    public final C0FFE<TextStickerModel> LIZ(StickerModel stickerModel, C0FFO c0ffo, LifecycleOwner lifecycleOwner) {
        return new C0FFC(this.LIZ, (TextStickerModel) stickerModel, this.LIZIZ, c0ffo, lifecycleOwner, this.LJFF, this.LJ);
    }

    @Override // X.AbstractC388880FMo
    public final void LJFF(EnumC1466150oFx enumC1466150oFx, List<? extends StickerModel> list, String str, Function0<Unit> function0, Function0<Unit> function02) {
        InterfaceC386690FEd interfaceC386690FEdLIZIZ;
        NLEEditor nLEEditorLJI;
        C0FFP c0ffpLJJIL;
        StickerModel next;
        boolean z;
        if (enumC1466150oFx != EnumC1466150oFx.TEXT) {
            return;
        }
        List<C0FTJ<StickerModel>> list2 = this.LJIIIZ;
        ArrayList arrayList = new ArrayList();
        for (C0FTJ<StickerModel> c0ftj : list2) {
            C0FTJ<StickerModel> c0ftj2 = c0ftj;
            if (c0ftj2 instanceof C0FFC) {
                C0FFC c0ffc = (C0FFC) c0ftj2;
                if (c0ffc.getStickerType() == EnumC1466150oFx.TEXT && !C0F8Y.LJII(c0ffc.LJLI())) {
                    arrayList.add(c0ftj);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add((C0FTJ) it2.next());
        }
        Iterator it3 = arrayList2.iterator();
        while (true) {
            TextStickerModel textStickerModel = null;
            if (!it3.hasNext()) {
                break;
            }
            C0FFC c0ffc2 = (C0FFC) it3.next();
            this.LJIIJJI.LJJIJIL(c0ffc2.LJJIJIIJIL());
            C0FFP c0ffpLJJIL2 = c0ffc2.LJJIL();
            TextStickerModel textStickerModelLJLI = c0ffc2.LJLI();
            Iterator<? extends StickerModel> it4 = list.iterator();
            while (true) {
                if (it4.hasNext()) {
                    next = it4.next();
                    StickerModel stickerModel = next;
                    if ((stickerModel instanceof TextStickerModel) && Intrinsics.LJFF(((TextStickerModel) stickerModel).getUuid(), textStickerModelLJLI.getUuid())) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            if (next instanceof TextStickerModel) {
                textStickerModel = (TextStickerModel) next;
            }
            boolean z2 = c0ffpLJJIL2 instanceof C0ERI;
            if (z2) {
                ((C0ERI) c0ffpLJJIL2).LJIIJ = false;
            }
            if (textStickerModel != null && Intrinsics.LJFF(textStickerModel.getTtsModel(), textStickerModelLJLI.getTtsModel())) {
                textStickerModelLJLI = TextStickerModel.copy$default(textStickerModelLJLI, null, null, null, null, null, 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -32769, 65535, null);
            }
            if (z2 && textStickerModel != null) {
                z = false;
            } else {
                z = true;
            }
            c0ffc2.LLD(z);
            this.LJIIIZ.remove(c0ffc2);
            List<C0FTB> list3 = this.LJIIJ;
            ArrayList arrayList3 = new ArrayList();
            for (C0FTB c0ftb : list3) {
                if (C13LQ.LJIILLIIL(EnumC1466150oFx.TEXT, c0ftb.LJJIJIL())) {
                    arrayList3.add(c0ftb);
                }
            }
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                ((C0FTB) it5.next()).LJIIJ(textStickerModelLJLI, str);
            }
        }
        function0.invoke();
        ArrayList<C0ERI> arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        for (StickerModel stickerModel2 : list) {
            StickerModel stickerModel3 = stickerModel2;
            if ((stickerModel3 instanceof TextStickerModel) && !C0F8Y.LJII((TextStickerModel) stickerModel3)) {
                arrayList5.add(stickerModel2);
            }
        }
        Iterator it6 = C13LP.LJLLLL(new AComparatorS24S0000000_5(138), arrayList5).iterator();
        while (it6.hasNext()) {
            C0FFE<StickerModel> c0ffeInvoke = C390410FSl.LIZ(this.LJFF).LJFF.invoke((StickerModel) it6.next());
            if (c0ffeInvoke != null) {
                c0ffpLJJIL = c0ffeInvoke.LJJIL();
            } else {
                c0ffpLJJIL = null;
            }
            if (c0ffpLJJIL instanceof C0ERI) {
                ((C0ERI) c0ffpLJJIL).LIZLLL();
                arrayList4.add(c0ffpLJJIL);
            }
        }
        if ((!arrayList4.isEmpty()) && (interfaceC386690FEdLIZIZ = this.LJII.LIZIZ()) != null && (nLEEditorLJI = interfaceC386690FEdLIZIZ.LJI()) != null) {
            nLEEditorLJI.commit();
        }
        for (C0ERI c0eri : arrayList4) {
            c0eri.LJIIJ = true;
            c0eri.LIZIZ();
        }
        function02.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000e  */
    @Override // X.AbstractC388880FMo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(X.C0FTJ r82, X.C388340FKm r83, X.C390370FSh r84, java.lang.String r85, kotlin.jvm.functions.Function1 r86) {
        /*
            Method dump skipped, instruction units count: 1407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0FF6.LJI(X.0FTJ, X.0FKm, X.0FSh, java.lang.String, kotlin.jvm.functions.Function1):void");
    }

    public C0FF6(Context context, FrameLayout frameLayout, FrameLayout frameLayout2, LifecycleOwner lifecycleOwner, C0FUH c0fuh, C390420FSm c390420FSm) {
        super(context, frameLayout, frameLayout2, lifecycleOwner, c0fuh, c390420FSm);
        this.LJII = (InterfaceC388760FMc) c390420FSm.LIZIZ(C13LE.LIZ(InterfaceC388760FMc.class));
        C0FTH c0fth = (C0FTH) c390420FSm.LIZIZ(C13LE.LIZ(C0FTH.class));
        this.LJIIIIZZ = c0fth;
        this.LJIIIZ = C390410FSl.LIZLLL(c390420FSm);
        this.LJIIJ = C390410FSl.LIZJ(c390420FSm);
        this.LJIIJJI = (C0FUK) c390420FSm.LIZIZ(C13LE.LIZ(C0FUK.class));
        this.LJIIL = C452501pT.LIZIZ(new AwS549S0100000_5(c390420FSm, 1502));
        this.LJIILIIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1503));
        C390790FTx c390790FTxLIZIZ = c0fth.LIZIZ();
        ((ArrayList) c390790FTxLIZIZ.LLJJI).add(new C0FU7() { // from class: X.0FK1
            @Override // X.C0FU7
            public final EnumC1466150oFx getStickerType() {
                return EnumC1466150oFx.TEXT;
            }

            @Override // X.C0FU7
            public final List<C0FU6> LIZIZ(int i) {
                Integer numValueOf;
                C0FTJ<StickerModel> next;
                StickerModel stickerModelLJLI;
                TextStickerModel textStickerModel;
                C0FK0 c0fk0LJIILLIIL;
                boolean z;
                C0FFO next2;
                List list;
                Function0<Boolean> function0;
                C0FU6 c0fu6;
                String string;
                Integer numValueOf2;
                Function0<Boolean> function02;
                C0FF6 c0ff6 = this.LIZ;
                Iterator<C0FTJ<StickerModel>> it2 = c0ff6.LJIIIZ.iterator();
                while (true) {
                    numValueOf = null;
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (next.getStickerId() == i) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C0FTJ<StickerModel> c0ftj = next;
                if (c0ftj != null) {
                    stickerModelLJLI = c0ftj.LJLI();
                } else {
                    stickerModelLJLI = null;
                }
                if ((stickerModelLJLI instanceof TextStickerModel) && (textStickerModel = (TextStickerModel) stickerModelLJLI) != null) {
                    C0FF8 c0ff8LJIIIIZZ = c0ff6.LJIIIIZZ();
                    if (c0ff8LJIIIIZZ != null) {
                        c0fk0LJIILLIIL = c0ff8LJIIIIZZ.LJIILLIIL();
                    } else {
                        c0fk0LJIILLIIL = null;
                    }
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    if (C0F8Y.LJII(textStickerModel) && c0fk0LJIILLIIL != null && (c0fk0LJIILLIIL.LJJII || c0fk0LJIILLIIL.LJJIII)) {
                        linkedHashSet.add(new C0FU6(6, R.drawable.c3d, c0ff6.LIZ.getString(2131820742), null, null, 24));
                    }
                    C0FF8 c0ff8LJIIIIZZ2 = c0ff6.LJIIIIZZ();
                    if (c0ff8LJIIIIZZ2 != null && c0ff8LJIIIIZZ2.LIZLLL()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        Iterator it3 = C1697810uHb.LJ(2, 1).iterator();
                        while (it3.hasNext()) {
                            linkedHashSet.add(c0ff6.LJIIIIZZ.LIZIZ().LJJJ(((Number) it3.next()).intValue(), null, null, null));
                        }
                        return C13LP.LLIIII(linkedHashSet);
                    }
                    if (textStickerModel.getCaptionModel() != null) {
                        if (c0fk0LJIILLIIL == null || (function02 = c0fk0LJIILLIIL.LJIILIIL) == null || !function02.invoke().booleanValue()) {
                            linkedHashSet.add(new C0FU6(5, R.drawable.a_r, c0ff6.LIZ.getString(2131826896), null, null, 24));
                        }
                        C390790FTx c390790FTxLIZIZ2 = c0ff6.LJIIIIZZ.LIZIZ();
                        if (c0fk0LJIILLIIL != null && c0fk0LJIILLIIL.LJJIJIIJI) {
                            string = c0ff6.LIZ.getString(2131840048);
                        } else {
                            string = null;
                        }
                        if (c0fk0LJIILLIIL != null && c0fk0LJIILLIIL.LJJIJIIJI) {
                            numValueOf2 = Integer.valueOf(R.raw.icon_eye_slash);
                        } else {
                            numValueOf2 = null;
                        }
                        if (c0fk0LJIILLIIL != null && c0fk0LJIILLIIL.LJJIJIIJI) {
                            numValueOf = Integer.valueOf(R.attr.ee);
                        }
                        linkedHashSet.add(c390790FTxLIZIZ2.LJJJ(1, numValueOf2, numValueOf, string));
                        return C13LP.LLIIII(linkedHashSet);
                    }
                    if (c0fk0LJIILLIIL != null && (function0 = c0fk0LJIILLIIL.LIZ) != null && function0.invoke().booleanValue()) {
                        if (c0fk0LJIILLIIL.LIZIZ && C0F8Y.LJI(textStickerModel)) {
                            c0fu6 = new C0FU6(4, R.drawable.c8b, c0ff6.LIZ.getString(2131850138), null, AFwS234S0000000_5.get$arr$(521), 8);
                        } else {
                            boolean z2 = c0fk0LJIILLIIL.LIZIZ;
                            if (z2 && c0fk0LJIILLIIL.LJIIL) {
                                c0fu6 = new C0FU6(4, R.drawable.c8c, c0ff6.LIZ.getString(2131850139), null, AFwS234S0000000_5.get$arr$(517), 8);
                            } else {
                                int i2 = 2131829877;
                                if (z2) {
                                    Context context2 = c0ff6.LIZ;
                                    if (((Boolean) C265200AaM.LIZ.getValue()).booleanValue()) {
                                        i2 = 2131829880;
                                    }
                                    c0fu6 = new C0FU6(4, R.drawable.c8c, context2.getString(i2), null, AFwS234S0000000_5.get$arr$(518), 8);
                                } else if (C0F8Y.LJI(textStickerModel)) {
                                    c0fu6 = new C0FU6(4, R.drawable.a_t, c0ff6.LIZ.getString(2131829878), null, AFwS234S0000000_5.get$arr$(519), 8);
                                } else {
                                    c0fu6 = new C0FU6(4, R.drawable.a_t, c0ff6.LIZ.getString(2131829877), null, AFwS234S0000000_5.get$arr$(520), 8);
                                }
                            }
                        }
                        linkedHashSet.add(c0fu6);
                    }
                    Iterator<C0FFO> it4 = c0ff6.LJ.LJIIIZ.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            next2 = it4.next();
                            if (next2.LIZ == EnumC1466150oFx.TEXT) {
                                break;
                            }
                        } else {
                            next2 = null;
                            break;
                        }
                    }
                    C0FFO c0ffo = next2;
                    if (c0ffo == null || (list = c0ffo.LJIIIIZZ) == null) {
                        list = C13BV.INSTANCE;
                    }
                    if ((!C0F8Y.LJII(textStickerModel) || c0fk0LJIILLIIL == null || ((!c0fk0LJIILLIIL.LJJII && (!c0fk0LJIILLIIL.LJJIII || !C295910Bin.LIZ())) || !list.contains(3))) && list.contains(3)) {
                        linkedHashSet.add(c0ff6.LJIIIIZZ.LIZIZ().LJJJ(3, null, null, null));
                    }
                    linkedHashSet.add(c0ff6.LJIIIIZZ.LIZIZ().LJJJ(2, null, null, null));
                    if (list.contains(1)) {
                        linkedHashSet.add(c0ff6.LJIIIIZZ.LIZIZ().LJJJ(1, null, null, null));
                    }
                    return C13LP.LLIIII(linkedHashSet);
                }
                return C13BV.INSTANCE;
            }

            @Override // X.C0FU7
            public final boolean LIZ(int i, EnumC1466150oFx enumC1466150oFx, int i2) {
                C0FK0 c0fk0LJIILLIIL;
                EnumC1466150oFx enumC1466150oFx2;
                TextStickerModel textStickerModel;
                TextStickerModel textStickerModel2;
                C0FF8 c0ff8LIZ = this.LIZ.LJII.LIZ();
                if (c0ff8LIZ != null && (c0fk0LJIILLIIL = c0ff8LIZ.LJIILLIIL()) != null && c0fk0LJIILLIIL.LJJIJIIJI && enumC1466150oFx == (enumC1466150oFx2 = EnumC1466150oFx.TEXT)) {
                    C0FTJ c0ftjLIZ = C0FKU.LIZ(i, this.LIZ.LJIIIZ);
                    StickerModel stickerModelLJLI = null;
                    if (c0ftjLIZ != null) {
                        stickerModelLJLI = c0ftjLIZ.LJLI();
                    }
                    if ((stickerModelLJLI instanceof TextStickerModel) && (textStickerModel = (TextStickerModel) stickerModelLJLI) != null && textStickerModel.getCaptionModel() != null) {
                        List<C0FTJ<StickerModel>> listInvoke = ((C0FT9) this.LIZ.LJIIL.getValue()).LJ.invoke(enumC1466150oFx2);
                        if (listInvoke != null) {
                            for (C0FTJ<StickerModel> c0ftj : listInvoke) {
                                float startTime = c0ftj.LJJIIJZLJL().getStartTime();
                                float endTime = c0ftj.LJJIIJZLJL().getEndTime();
                                float f = i2;
                                if (startTime <= f && f <= endTime) {
                                    StickerModel stickerModelLJLI2 = c0ftj.LJLI();
                                    if ((stickerModelLJLI2 instanceof TextStickerModel) && (textStickerModel2 = (TextStickerModel) stickerModelLJLI2) != null && textStickerModel2.getCaptionModel() != null) {
                                        return false;
                                    }
                                }
                            }
                        }
                        return true;
                    }
                }
                return false;
            }
        });
    }
}
