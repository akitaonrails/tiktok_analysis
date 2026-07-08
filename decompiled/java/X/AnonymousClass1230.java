package X;

import android.graphics.PointF;
import android.view.View;
import com.ss.android.ugc.aweme.creative.model.publish.PublishCustomCoverModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.EffectTextEffectExtra;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextLayoutConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSVoiceModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1230, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class AnonymousClass1230 extends C122P {
    public final C19EG LLLILZJ;
    public final C123W LLLILZLLLI;
    public final AnonymousClass1249 LLLIZZ;
    public C123N LLLJ;
    public String LLLJIL;
    public String LLLJL;
    public TextFontStyleData LLLL;
    public String LLLLII;
    public String LLLLIIIILLL;
    public String LLLLIIL;
    public PublishCustomCoverModel LLLLIILL;
    public String LLLLIILLL;
    public InnerEffectTextLayoutConfig LLLLIL;
    public C11UK LLLLILI;
    public C123V LLLLJ;
    public AnonymousClass1248 LLLLJI;

    @Override // X.C122P
    public final void LJJIJ() {
        C196925122x c196925122x = this.LLJJJJ;
        if (c196925122x != null) {
            c196925122x.setOnEffectTextGestureListener(new InterfaceC196951123x() { // from class: X.123I
                @Override // X.InterfaceC196951123x
                public final void LIZ() {
                    C196927122z c196927122z = (C196927122z) this.LIZ.LLJJJJ;
                    if (c196927122z != null) {
                        c196927122z.LJJIJIL(true);
                    }
                }

                @Override // X.InterfaceC196951123x
                public final void LIZIZ() {
                    AnonymousClass1230 anonymousClass1230 = this.LIZ;
                    anonymousClass1230.LJJJI(false, anonymousClass1230.LLLLIILL);
                }

                @Override // X.InterfaceC196951123x
                public final void LIZJ() {
                    C196927122z c196927122z = (C196927122z) this.LIZ.LLJJJJ;
                    if (c196927122z != null) {
                        c196927122z.LJJIJIL(false);
                    }
                }

                @Override // X.InterfaceC196951123x
                public final void LJII() {
                    C196927122z c196927122z = (C196927122z) this.LIZ.LLJJJJ;
                    if (c196927122z != null) {
                        c196927122z.LJJIJIL(true);
                    }
                }
            });
        }
    }

    @Override // X.C122P
    public final int LJIIJ() {
        return (int) ((C0FI2.LJIJJ().LJII() > 0 ? C0FI2.LJIJJ().LJII() : 28) * this.LLLLJ.LIZ());
    }

    @Override // X.C122P
    public final void LJIILL() {
        super.LJIILL();
        this.LLLILZLLLI.setTextStickerInputMobListener(new AbstractC1462810oAZ() { // from class: X.123B
            @Override // X.AbstractC1462810oAZ, X.InterfaceC387610FHr
            public final void LJII(int i, String str, String str2, String str3, String str4) {
                C123N c123n = this.LIZ.LLLJ;
                if (c123n != null) {
                    c123n.LIZJ(str);
                }
            }

            @Override // X.AbstractC1462810oAZ, X.InterfaceC387610FHr
            public final void LJFF(String str, int i, String str2, String str3, int i2, String str4) {
                this.LIZ.LLLJL = Integer.toHexString(i);
                C123N c123n = this.LIZ.LLLJ;
                if (c123n != null) {
                    c123n.LJI(i);
                }
            }

            @Override // X.AbstractC1462810oAZ, X.InterfaceC387610FHr
            public final void LJ(String str, int i, int i2, String str2, String str3, String str4, String str5, String str6) {
                this.LIZ.LLLJIL = String.valueOf(i);
                C123N c123n = this.LIZ.LLLJ;
                if (c123n != null) {
                    c123n.LJIIIIZZ(i);
                }
            }

            @Override // X.AbstractC1462810oAZ, X.InterfaceC387610FHr
            public final void LJIIIIZZ(TextFontStyleData textFontStyleData, int i, String str, String str2, boolean z, String str3, String str4, String str5) {
                this.LIZ.LLLLII = textFontStyleData.LJ.getEffectId();
                AnonymousClass1230 anonymousClass1230 = this.LIZ;
                String str6 = textFontStyleData.title;
                anonymousClass1230.LLLLIIIILLL = str6;
                C123N c123n = anonymousClass1230.LLLJ;
                if (c123n != null) {
                    c123n.LIZ(str6);
                }
            }
        });
    }

    @Override // X.C122P
    public final void LJIIZILJ() {
        String effectId;
        String str;
        Effect effect;
        super.LJIIZILJ();
        TextFontStyleData textFontStyleDataLJIIJ = C0FI2.LJIJJ().LJIIJ(0);
        this.LLLL = textFontStyleDataLJIIJ;
        String str2 = "";
        if (textFontStyleDataLJIIJ == null || (effect = textFontStyleDataLJIIJ.LJ) == null || (effectId = effect.getEffectId()) == null) {
            effectId = "";
        }
        this.LLLLII = effectId;
        TextFontStyleData textFontStyleData = this.LLLL;
        if (textFontStyleData != null && (str = textFontStyleData.title) != null) {
            str2 = str;
        }
        this.LLLLIIIILLL = str2;
    }

    @Override // X.C122P
    public final void LJIJ() {
        InterfaceC1453600nvi interfaceC1453600nvi = C123O.LIZJ().LIZJ;
        InterfaceC1453510nvZ interfaceC1453510nvZLIZ = interfaceC1453600nvi != null ? interfaceC1453600nvi.LIZ(0, this.LLLILZJ) : null;
        this.LLJIJIL = interfaceC1453510nvZLIZ;
        if (interfaceC1453510nvZLIZ != null) {
            interfaceC1453510nvZLIZ.setEnableFakeFeedView(false);
        }
        InterfaceC1453510nvZ interfaceC1453510nvZ = this.LLJIJIL;
        if (interfaceC1453510nvZ != null) {
            this.LLILZ.addView(interfaceC1453510nvZ.getContentView());
            C14K9.LJJ(interfaceC1453510nvZ.getContentView(), Float.MAX_VALUE);
        }
    }

    public final boolean LJJJ() {
        Iterator<TextStickerTextWrap> it2 = LJIILIIL().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            TextStickerTextWrap next = it2.next();
            String text = next.getText();
            if (text != null && text.length() != 0) {
                if (next != null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.C122P
    public final C196925122x LJIIIZ(TextStickerData textStickerData) {
        Object parent = this.LLILZ.getParent();
        if (parent != null) {
            View view = (View) parent;
            if (view.getTag() instanceof C123V) {
                C123V c123v = (C123V) view.getTag();
                if (!Intrinsics.LJFF(this.LLLLJ, c123v)) {
                    this.LLLLJ = c123v;
                    this.LLLILZLLLI.setScaleInfo(this.LLLLJ);
                }
            }
        }
        C196927122z c196927122z = new C196927122z(this.LLLILZJ, LJIIJJI(), textStickerData, this.LLLLJ, this.LLLIZZ);
        int visibility = c196927122z.getVisibility();
        c196927122z.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, c196927122z);
        c196927122z.setNotNeedVerifyDirection(false);
        return c196927122z;
    }

    @Override // X.C122P
    public final void LJIL(TTSVoiceModel tTSVoiceModel) {
        int i;
        int i2;
        String text;
        EffectTextEffectExtra effectTextEffectExtra;
        int i3;
        int i4;
        String text2;
        EffectTextEffectExtra effectTextEffectExtra2;
        LIZJ(LJIILIIL(), tTSVoiceModel);
        this.LLLFZ = false;
        String str = "";
        if (this.LLLILZLLLI.getInnerLayoutConfig() == null) {
            C123N c123n = this.LLLJ;
            if (c123n != null) {
                String str2 = this.LLLLIILLL;
                if (str2 != null) {
                    str = str2;
                }
                String str3 = this.LLLLII;
                String str4 = this.LLLLIIIILLL;
                String str5 = this.LLLJL;
                String str6 = this.LLLJIL;
                C11UK c11uk = this.LLLLILI;
                if (c11uk != null && (effectTextEffectExtra2 = c11uk.LLILLL) != null && effectTextEffectExtra2.ifStandard) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                String str7 = this.LLLLIIL;
                C196925122x c196925122x = this.LLJJJJ;
                if (c196925122x != null && (text2 = c196925122x.getText()) != null && text2.length() > 0) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                c123n.LJFF(new C1462850oAd(false, str, str3, str4, str5, str6, 0, 0, 0, i3, str7, i4, 0, 0, 0, 0, null, 127425));
                return;
            }
            return;
        }
        C123N c123n2 = this.LLLJ;
        if (c123n2 == null) {
            return;
        }
        String str8 = this.LLLLIILLL;
        if (str8 != null) {
            str = str8;
        }
        String str9 = this.LLLLIIL;
        C11UK c11uk2 = this.LLLLILI;
        if (c11uk2 != null && (effectTextEffectExtra = c11uk2.LLILLL) != null && effectTextEffectExtra.ifStandard) {
            i = 1;
        } else {
            i = 0;
        }
        C196925122x c196925122x2 = this.LLJJJJ;
        if (c196925122x2 != null && (text = c196925122x2.getText()) != null && text.length() > 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        c123n2.LJFF(new C1462850oAd(false, str, null, null, null, null, 0, 0, 0, i, str9, i2, 0, 0, 0, 0, null, 127485));
    }

    @Override // X.C122P
    public final void LJJIIZI(C196925122x c196925122x) {
        C196925122x c196925122x2 = this.LLJJJJ;
        if (c196925122x2 != null) {
            c196925122x2.setOnEditClickListener(new InterfaceC196910122i() { // from class: X.122Y
                @Override // X.InterfaceC196910122i
                public final void LIZJ(C196925122x c196925122x3) {
                }

                @Override // X.InterfaceC196910122i
                public final void LJ(C196925122x c196925122x3, boolean z, Integer num) {
                }

                @Override // X.InterfaceC196910122i
                public final void LJFF(C196925122x c196925122x3) {
                }

                @Override // X.InterfaceC196910122i
                public final void LJI(C196925122x c196925122x3, C196931123d c196931123d) {
                }

                @Override // X.InterfaceC196910122i
                public final void LJII(C196925122x c196925122x3) {
                }

                @Override // X.InterfaceC196910122i
                public final void LJIIIIZZ(C196925122x c196925122x3) {
                }

                @Override // X.InterfaceC196910122i
                public final float LIZ(float f) {
                    InterfaceC1453510nvZ interfaceC1453510nvZ = this.LIZ.LLJIJIL;
                    if (interfaceC1453510nvZ != null) {
                        return interfaceC1453510nvZ.LIZ(f);
                    }
                    return 0.0f;
                }

                @Override // X.InterfaceC196910122i
                public final PointF LIZIZ(C196925122x c196925122x3, float f, float f2) {
                    PointF pointFLIZJ;
                    PointF[] anglePointList = c196925122x3.getAnglePointList();
                    C089E c089e = new C089E(anglePointList);
                    while (c089e.hasNext()) {
                        PointF pointF = (PointF) c089e.next();
                        pointF.x += f;
                        pointF.y += f2;
                    }
                    InterfaceC1453510nvZ interfaceC1453510nvZ = this.LIZ.LLJIJIL;
                    if (interfaceC1453510nvZ == null || (pointFLIZJ = interfaceC1453510nvZ.LIZJ(anglePointList, f, f2)) == null) {
                        return new PointF(0.0f, 0.0f);
                    }
                    return pointFLIZJ;
                }

                @Override // X.InterfaceC196910122i
                public final int LIZLLL(C196925122x c196925122x3, boolean z, boolean z2) {
                    if (z) {
                        InterfaceC1453510nvZ interfaceC1453510nvZ = this.LIZ.LLJIJIL;
                        if (interfaceC1453510nvZ != null) {
                            interfaceC1453510nvZ.LJ();
                        }
                        return -1;
                    }
                    InterfaceC1453510nvZ interfaceC1453510nvZ2 = this.LIZ.LLJIJIL;
                    if (interfaceC1453510nvZ2 == null) {
                        return -1;
                    }
                    return interfaceC1453510nvZ2.LIZIZ(c196925122x3.getAnglePointListForBlock(), z2, false);
                }
            });
        }
    }

    @Override // X.C122P
    public final void LJJIL(TextStickerData textStickerData) {
        if (textStickerData != null) {
            textStickerData.setEffectTextLayoutConfig(this.LLLILZLLLI.getInnerLayoutConfig());
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LJJJIL(C11UK c11uk) {
        InnerEffectTextLayoutConfig innerEffectTextLayoutConfigLIZ;
        List<InnerEffectTextConfig> textConfigs;
        this.LLLLIILLL = c11uk.effect.getEffectId();
        this.LLLLIL = c11uk.LL;
        this.LLLLILI = c11uk;
        float fLIZ = this.LLLLJ.LIZ();
        InnerEffectTextLayoutConfig innerEffectTextLayoutConfig = c11uk.LL;
        InnerEffectTextLayoutConfig effectTextLayoutConfig = null;
        if (innerEffectTextLayoutConfig != null) {
            if (fLIZ == 0.0f) {
                fLIZ = 1.0f;
            }
            innerEffectTextLayoutConfigLIZ = C12K4.LIZ(innerEffectTextLayoutConfig, fLIZ);
        } else {
            innerEffectTextLayoutConfigLIZ = null;
        }
        C196925122x c196925122x = this.LLJJJJ;
        if (c196925122x != null) {
            TextStickerData data = c196925122x.getData();
            if (data != null) {
                data.setEffectTextLayoutConfig(innerEffectTextLayoutConfigLIZ);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(LJIILIIL());
            if (innerEffectTextLayoutConfigLIZ != null) {
                int size = innerEffectTextLayoutConfigLIZ.getTextConfigs().size();
                for (int size2 = arrayList.size(); size2 < size; size2++) {
                    arrayList.add(C123P.LIZIZ("", false));
                }
            }
            c196925122x.LJJIIJ(this.LLLILZLLLI.getCurTxtMode(), this.LLLILZLLLI.getCurColor(), this.LLLILZLLLI.getAlignTxt(), C0FI2.LJIJJ().LJI);
            c196925122x.setFontSize(LJIIJ());
            TextStickerData data2 = c196925122x.getData();
            if (data2 != null) {
                effectTextLayoutConfig = data2.getEffectTextLayoutConfig();
            }
            c196925122x.LJJIIZI(effectTextLayoutConfig, arrayList);
            return;
        }
        TextStickerData textStickerData = new TextStickerData("", this.LLLILZLLLI.getCurTxtMode(), this.LLLILZLLLI.getCurColor(), this.LLLILZLLLI.getAlignTxt(), C0FI2.LJIJJ().LJI, null, 0, 0, 0, 0, null, null, false, null, 0L, 0L, 0.0f, 0.0f, 0L, false, false, false, null, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -32, -1, -1, 4095, null);
        textStickerData.setEffectTextLayoutConfig(innerEffectTextLayoutConfigLIZ);
        textStickerData.setEditCenterPoint(this.LLLILZLLLI.getEditInputScreenCenterPoint());
        ArrayList arrayList2 = new ArrayList();
        InnerEffectTextLayoutConfig effectTextLayoutConfig2 = textStickerData.getEffectTextLayoutConfig();
        if (effectTextLayoutConfig2 != null && (textConfigs = effectTextLayoutConfig2.getTextConfigs()) != null) {
            Iterator<InnerEffectTextConfig> it2 = textConfigs.iterator();
            while (it2.hasNext()) {
                it2.next();
                arrayList2.add(C123P.LIZIZ("", false));
            }
        } else {
            arrayList2.add(C123P.LIZIZ("", false));
        }
        textStickerData.setTextWrapList(arrayList2);
        textStickerData.setFontSize(LJIIJ());
        LIZIZ(textStickerData, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0067 A[PHI: r5
      0x0067: PHI (r5v1 int) = (r5v0 int), (r5v7 int) binds: [B:31:0x0064, B:8:0x000c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b A[PHI: r3 r5
      0x006b: PHI (r3v1 int) = (r3v0 int), (r3v5 int) binds: [B:34:0x0068, B:11:0x0011] A[DONT_GENERATE, DONT_INLINE]
      0x006b: PHI (r5v2 int) = (r5v1 int), (r5v6 int) binds: [B:34:0x0068, B:11:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006f A[PHI: r2 r3 r5
      0x006f: PHI (r2v1 int) = (r2v0 int), (r2v3 int) binds: [B:37:0x006c, B:14:0x0016] A[DONT_GENERATE, DONT_INLINE]
      0x006f: PHI (r3v2 int) = (r3v1 int), (r3v4 int) binds: [B:37:0x006c, B:14:0x0016] A[DONT_GENERATE, DONT_INLINE]
      0x006f: PHI (r5v3 int) = (r5v2 int), (r5v5 int) binds: [B:37:0x006c, B:14:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIZ(boolean r26, com.ss.android.ugc.aweme.creative.model.publish.PublishCustomCoverModel r27) {
        /*
            r25 = this;
            r6 = 1
            r4 = r27
            if (r4 == 0) goto L63
            int r0 = r4.isCoverUpload
            if (r0 != r6) goto L63
            r5 = 1
        La:
            int r0 = r4.isCoverCrop
            if (r0 != r6) goto L67
            r3 = 1
        Lf:
            int r0 = r4.isCoverAddText
            if (r0 != r6) goto L6b
            r2 = 1
        L14:
            int r0 = r4.isCoverChangeFrame
            if (r0 != r6) goto L6f
            r1 = 1
        L19:
            if (r5 == r6) goto L60
            if (r3 == r6) goto L60
            if (r2 == r6) goto L60
            if (r1 == r6) goto L60
            r22 = 0
        L23:
            r0 = r25
            X.123N r0 = r0.LLLJ
            r15 = r26
            if (r0 == 0) goto L4c
            X.0oAd r6 = new X.0oAd
            r7 = 0
            r8 = 0
            r24 = 67327(0x106ff, float:9.4345E-41)
            r9 = r8
            r10 = r8
            r11 = r8
            r12 = r8
            r13 = r7
            r14 = r7
            r16 = r7
            r17 = r8
            r21 = r1
            r23 = r8
            r19 = r5
            r20 = r3
            r18 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r0.LIZIZ(r6)
        L4c:
            if (r15 == 0) goto L5f
            r0 = 0
            if (r4 == 0) goto L5f
            r4.isCoverAddText = r0
            r4.isCoverUpload = r0
            r4.isCoverCrop = r0
            r4.isCoverEdit = r0
            r4.isCoverChangeFrame = r0
            java.lang.String r0 = "select_type"
            r4.enterMethod = r0
        L5f:
            return
        L60:
            r22 = 1
            goto L23
        L63:
            r5 = 0
            if (r4 == 0) goto L67
            goto La
        L67:
            r3 = 0
            if (r4 == 0) goto L6b
            goto Lf
        L6b:
            r2 = 0
            if (r4 == 0) goto L6f
            goto L14
        L6f:
            r1 = 0
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1230.LJJIZ(boolean, com.ss.android.ugc.aweme.creative.model.publish.PublishCustomCoverModel):void");
    }

    public final void LJJJI(boolean z, PublishCustomCoverModel publishCustomCoverModel) {
        InnerEffectTextLayoutConfig effectTextLayoutConfig;
        TextStickerData data;
        C123W c123w = this.LLLILZLLLI;
        C196925122x c196925122x = this.LLJJJJ;
        if (c196925122x != null && (data = c196925122x.getData()) != null) {
            effectTextLayoutConfig = data.getEffectTextLayoutConfig();
        } else {
            effectTextLayoutConfig = null;
        }
        c123w.setInnerLayoutConfig(effectTextLayoutConfig);
        LJJIJIIJIL(this.LLJJJJ, null);
        this.LLLLIIL = "select_type";
        if (z) {
            this.LLLLIIL = "click_cover";
            if (publishCustomCoverModel != null) {
                publishCustomCoverModel.enterMethod = "click_cover";
            }
        } else if (publishCustomCoverModel != null) {
            publishCustomCoverModel.enterMethod = "select_type";
        }
        this.LLLLIILL = publishCustomCoverModel;
        C123N c123n = this.LLLJ;
        if (c123n != null) {
            String str = this.LLLLIILLL;
            if (str == null) {
                str = "";
            }
            c123n.LJII(new C1462850oAd(false, str, null, null, null, null, 0, 0, 0, 0, this.LLLLIIL, 0, 0, 0, 0, 0, null, 130045));
        }
    }

    public AnonymousClass1230(C19EG c19eg, C19740512Lj c19740512Lj, C123W c123w, AnonymousClass1249 anonymousClass1249) {
        super(c19eg, c19740512Lj, null, c19740512Lj.LIZLLL, c123w, null, null, null, 1, null, false, null, null, null, null, null, 130788);
        this.LLLILZJ = c19eg;
        this.LLLILZLLLI = c123w;
        this.LLLIZZ = anonymousClass1249;
        this.LLLJIL = CardStruct.IStatusCode.DEFAULT;
        this.LLLJL = Integer.toHexString(-1);
        this.LLLLII = "";
        this.LLLLIIIILLL = "";
        this.LLLLIIL = "select_type";
        this.LLLLJ = new C123V(0);
        new Pair(null, null);
    }
}
