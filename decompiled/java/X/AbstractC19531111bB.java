package X;

import X.C05YF;
import Y.AObjectS302S0200000_5;
import Y.AObserverS231S0100000_29;
import android.app.Activity;
import android.graphics.RectF;
import android.util.Size;
import android.view.MotionEvent;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.creative.model.music.MemeSoundMusicParam;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.nows.api.AICaptionNetworkModule;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.aicaption.AICaptionTagStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.gamora.editor.services.IMusicEditService;
import com.zhiliaoapp.musically.R;
import ge.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS145S0110000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS5S0410000_5;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.AwS643S0100000_29;
import kotlin.jvm.internal.AwS65S1300000_29;
import kotlin.jvm.internal.AwS678S0100000_29;

/* JADX INFO: renamed from: X.11bB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public abstract class AbstractC19531111bB<API_COMPONENT extends C05YF> extends i<API_COMPONENT, C19531711bH, C19531411bE, C19531611bG> implements InterfaceC379610EuV {
    public static final C391280FVu LLJLLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZ;
    public final C19A3 LLJILJILJ;
    public final C1DRG LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final AICaptionNetworkModule LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public List<String> LLJJJ;
    public List<TTSModel> LLJJJIL;
    public MemeSoundMusicParam LLJJJJ;
    public int LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public C09AE LLJJLIIIJLLLLLLLZ;
    public final List<String> LLJL;
    public final Function0<C19531711bH> LLJLIL;
    public InterfaceC1441305kZ<String> LLJLILLLLZIIL;
    public final Set<String> LLJLL;
    public float LLJLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AbstractC19531111bB.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0);
        C13LE.LIZ.getClass();
        LLJZ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(AbstractC19531111bB.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0), new C2217381BqS(AbstractC19531111bB.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new C2217381BqS(AbstractC19531111bB.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0)};
        LLJLLL = new C391280FVu();
    }

    public boolean P6() {
        return false;
    }

    public boolean S6() {
        return false;
    }

    public int k5() {
        return R.layout.emp;
    }

    public void n7() {
    }

    public final void r8() {
        if (this.LLJJJ.isEmpty()) {
            return;
        }
        if (this.LLJJJJJIL >= this.LLJJJ.size()) {
            this.LLJJJJJIL = 0;
        }
        H4(this, (String) ListProtector.get(this.LLJJJ, this.LLJJJJJIL), (TTSModel) C13LP.LJJJLZIJ(this.LLJJJJJIL, this.LLJJJIL), false, 4, null);
        this.LLJJJJJIL++;
        J8();
    }

    public float u6(BaseStickerModel baseStickerModel) {
        return 0.0f;
    }

    private final void d7() {
        if (this.LLJJJJLIIL) {
            return;
        }
        this.LLJJJJLIIL = true;
        InterfaceC391240FVq interfaceC391240FVqQj = qj();
        if (interfaceC391240FVqQj != null) {
            interfaceC391240FVqQj.LJJZZI(new C0FTB(this) { // from class: X.11b8
                public boolean LL;
                public final /* synthetic */ AbstractC19531111bB<API_COMPONENT> LLILLJJLI;

                @Override // X.C0FTB
                public final void LIZJ(StickerModel stickerModel) {
                }

                @Override // X.C0FTB
                public final void LIZLLL(StickerModel stickerModel) {
                }

                @Override // X.C0FTB
                public final void LJ(StickerModel stickerModel) {
                }

                @Override // X.C0FTB
                public final void LJFF(StickerModel stickerModel) {
                }

                @Override // X.C0FTB
                public final void LJI(StickerModel stickerModel, boolean z) {
                }

                @Override // X.C0FTB
                public final void LJII() {
                }

                @Override // X.C0FTB
                public final void LJIIIIZZ(StickerModel stickerModel) {
                }

                @Override // X.C0FTB
                public final void LJIIIZ(StickerModel stickerModel) {
                }

                @Override // X.C0FTB
                public final void LJIIJJI(StickerModel stickerModel) {
                }

                @Override // X.C0FTB
                public final void LJIIL(StickerModel stickerModel, int i) {
                }

                @Override // X.C0FTB
                public final void LJIILIIL(StickerModel stickerModel) {
                }

                @Override // X.C0FTB
                public final void LJIILJJIL(int i) {
                }

                @Override // X.C0FTB
                public final void LJIILL(StickerModel stickerModel) {
                }

                @Override // X.C0FTB
                public final void LJIILLIIL(int i) {
                }

                @Override // X.C0FTB
                public final void LJIIZILJ(StickerModel stickerModel) {
                }

                @Override // X.C0FTB
                public final void LJIJ(int i) {
                }

                @Override // X.C0FTB
                public final void LJIJI(StickerModel stickerModel) {
                }

                @Override // X.C0FTB
                public final void LJIJJ(StickerModel stickerModel) {
                }

                @Override // X.C0FTB
                public final void LJJ(StickerModel stickerModel) {
                }

                @Override // X.C0FTB
                public final void LJJI(StickerModel stickerModel) {
                }

                @Override // X.C0FTB
                public final void LJJII(StickerModel stickerModel, MotionEvent motionEvent) {
                }

                @Override // X.C0FTB
                public final void LJJIII(StickerModel stickerModel) {
                }

                @Override // X.C0FTB
                public final void LJJIIJ(StickerModel stickerModel) {
                }

                @Override // X.C0FTB
                public final void LJJIIZI(int i) {
                }

                @Override // X.C0FTB
                public final void LJJIJ() {
                }

                @Override // X.C0FTB
                public final void LJJIJIIJI(StickerModel stickerModel) {
                }

                @Override // X.C0FTB
                public final void LJJIJIIJIL(int i) {
                }

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // X.C0FTB
                public final void LJIL() {
                    this.LLILLJJLI.y7(this.LL ? 1 : 0);
                }

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // X.C0FTB
                public final void LJJIIZ() {
                    this.LLILLJJLI.y7(this.LL ? 1 : 0);
                }

                @Override // X.C0FTB
                public final EnumC1466150oFx[] LJJIJIL() {
                    return EnumC1466150oFx.values();
                }

                {
                    this.LLILLJJLI = this;
                }

                @Override // X.C0FTB
                public final void LIZIZ(StickerModel stickerModel) {
                    TextStickerModel textStickerModel;
                    InterfaceC19530911b9 interfaceC19530911b9Sd2;
                    if ((stickerModel instanceof TextStickerModel) && (textStickerModel = (TextStickerModel) stickerModel) != null && C0F8Y.LJII(textStickerModel)) {
                        C390090FRf c390090FRfD5 = this.LLILLJJLI.D5();
                        if (c390090FRfD5 != null) {
                            c390090FRfD5.LJIJ(c390090FRfD5.LJJIIJZLJL(), false);
                            c390090FRfD5.setVisible(false);
                        }
                        InterfaceC391240FVq interfaceC391240FVqQj2 = this.LLILLJJLI.qj();
                        if (interfaceC391240FVqQj2 != null && (interfaceC19530911b9Sd2 = interfaceC391240FVqQj2.sd2()) != null) {
                            interfaceC19530911b9Sd2.LJJIIZI();
                        }
                    }
                }

                @Override // X.C0FTB
                public final void LJIJJLI(StickerModel stickerModel) {
                    TextStickerModel textStickerModel;
                    InterfaceC391240FVq interfaceC391240FVqQj2;
                    InterfaceC19530911b9 interfaceC19530911b9Sd2;
                    if (stickerModel instanceof TextStickerModel) {
                        textStickerModel = (TextStickerModel) stickerModel;
                    } else {
                        textStickerModel = null;
                    }
                    if (textStickerModel != null && C0F8Y.LJII(textStickerModel) && (interfaceC391240FVqQj2 = this.LLILLJJLI.qj()) != null && (interfaceC19530911b9Sd2 = interfaceC391240FVqQj2.sd2()) != null) {
                        interfaceC19530911b9Sd2.LJIIL();
                    }
                    this.LL = false;
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
                @Override // X.C0FTB
                public final void LJJIFFI(int i) {
                    this.LLILLJJLI.s7(i);
                }

                @Override // X.C0FTB
                public final void f4(StickerModel stickerModel) {
                    this.LLILLJJLI.o7(stickerModel);
                }

                /* JADX WARN: Type inference incomplete: some casts might be missing */
                @Override // X.C0FTB
                public final void LIZ(StickerModel stickerModel, boolean z) {
                    TextStickerModel textStickerModel;
                    if ((stickerModel instanceof TextStickerModel) && (textStickerModel = (TextStickerModel) stickerModel) != null && C0F8Y.LJII(textStickerModel)) {
                        AbstractC19531111bB<API_COMPONENT> abstractC19531111bB = this.LLILLJJLI;
                        TextStickerModel textStickerModel2 = (TextStickerModel) stickerModel;
                        this.LLILLJJLI.c9(textStickerModel2, textStickerModel2.getTextStr(), (TTSModel) C13LP.LJJJLZIJ(abstractC19531111bB.LLJJJJJIL, abstractC19531111bB.LLJJJIL), new AwS573S0100000_29(this.LLILLJJLI, 45));
                    }
                }

                @Override // X.C0FTB
                public final void LJIIJ(StickerModel stickerModel, String str) {
                    TextStickerModel textStickerModel;
                    if ((stickerModel instanceof TextStickerModel) && (textStickerModel = (TextStickerModel) stickerModel) != null && C0F8Y.LJII(textStickerModel)) {
                        this.LLILLJJLI.u7(stickerModel, str);
                    }
                }

                @Override // X.C0FTB
                public final void LJJIIJZLJL(StickerModel stickerModel, boolean z, boolean z2) {
                    TextStickerModel textStickerModel;
                    InterfaceC391240FVq interfaceC391240FVqQj2;
                    InterfaceC19530911b9 interfaceC19530911b9Sd2;
                    if (stickerModel instanceof TextStickerModel) {
                        textStickerModel = (TextStickerModel) stickerModel;
                    } else {
                        textStickerModel = null;
                    }
                    if (textStickerModel != null && C0F8Y.LJII(textStickerModel) && (interfaceC391240FVqQj2 = this.LLILLJJLI.qj()) != null && (interfaceC19530911b9Sd2 = interfaceC391240FVqQj2.sd2()) != null) {
                        interfaceC19530911b9Sd2.LJJIIZI();
                    }
                    this.LL = true;
                }
            });
        }
    }

    public final VideoPublishEditModel K6() {
        return (VideoPublishEditModel) this.LLJJIII.getValue(this, LLJZ[2]);
    }

    public final InterfaceC1455850nzL S5() {
        return (InterfaceC1455850nzL) this.LLJJ.getValue(this, LLJZ[0]);
    }

    public final InterfaceC1455860nzM U5() {
        return (InterfaceC1455860nzM) this.LLJJIJI.getValue(this, LLJZ[3]);
    }

    public void W7() {
        C013C c013c = new C013C();
        c013c.element = C0CHQ.LIZ().LJJIIZI().LJJJLIIL(false);
        if (!((Boolean) C286520BKw.LIZ.getValue()).booleanValue() && ((C295910Bin.LIZ() && C295910Bin.LIZJ() == 2) || K6().mIsFromDraft)) {
            c013c.element = false;
        }
        ((C0ETY) getDiContainer().LJII(C0ETY.class, null)).Sd(InterfaceC1460000o62.class, new AwS608S0100000_29(c013c, 49));
        N6(c013c.element);
    }

    public final InterfaceC1460000o62 m6() {
        return (InterfaceC1460000o62) this.LLJJI.getValue(this, LLJZ[1]);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C19531411bE> o2() {
        return AFwS218S0000000_29.get$arr$(35);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C19531611bG> w2() {
        return new AwS573S0100000_29(this, 46);
    }

    public final void y8() {
        List<StickerModel> listLLLILZLLLI;
        StickerModel stickerModel;
        InterfaceC19530911b9 interfaceC19530911b9Sd2;
        List<C0FTJ<StickerModel>> listLLLLLZ;
        C0FTJ<StickerModel> next;
        InterfaceC391240FVq interfaceC391240FVqQj;
        TextStickerModel textStickerModel;
        C09AE c09ae = this.LLJJLIIIJLLLLLLLZ;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        z8();
        InterfaceC391240FVq interfaceC391240FVqQj2 = qj();
        if (interfaceC391240FVqQj2 != null && (listLLLLLZ = interfaceC391240FVqQj2.LLLLLZ(EnumC1466150oFx.TEXT)) != null) {
            Iterator<C0FTJ<StickerModel>> it2 = listLLLLLZ.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                StickerModel stickerModelLJLI = next.LJLI();
                if ((stickerModelLJLI instanceof TextStickerModel) && (textStickerModel = (TextStickerModel) stickerModelLJLI) != null && C0F8Y.LJII(textStickerModel)) {
                    break;
                }
            }
            C0FTJ<StickerModel> c0ftj = next;
            if (c0ftj != null && (interfaceC391240FVqQj = qj()) != null) {
                interfaceC391240FVqQj.XJ(c0ftj.getStickerId(), null, EnumC356070Dxd.COMMIT);
            }
        }
        InterfaceC391240FVq interfaceC391240FVqQj3 = qj();
        if (interfaceC391240FVqQj3 == null || (listLLLILZLLLI = interfaceC391240FVqQj3.LLLILZLLLI(EnumC1466150oFx.AI_CAPTION_TAG)) == null || (stickerModel = (StickerModel) C13LP.LJJJLZIJ(0, listLLLILZLLLI)) == null) {
            return;
        }
        InterfaceC391240FVq interfaceC391240FVqQj4 = qj();
        if (interfaceC391240FVqQj4 != null) {
            interfaceC391240FVqQj4.XJ(stickerModel.getId(), null, EnumC356070Dxd.COMMIT);
        }
        InterfaceC391240FVq interfaceC391240FVqQj5 = qj();
        if (interfaceC391240FVqQj5 == null || (interfaceC19530911b9Sd2 = interfaceC391240FVqQj5.sd2()) == null) {
            return;
        }
        interfaceC19530911b9Sd2.LJJIIZI();
    }

    public final void z8() {
        i3(AFwS273S0000000_29.get$arr$(21));
    }

    private final void J8() {
        K6().creativeModel.stickerModel.aiCaptionShuffleTexts = C13LP.LLIIII(this.LLJJJ);
        K6().creativeModel.stickerModel.aiCaptionShuffleIndex = this.LLJJJJJIL;
        K6().creativeModel.stickerModel.aiCaptionShuffleTTSDatas = C13LP.LLIIII(this.LLJJJIL);
        K6().creativeModel.stickerModel.memeSoundMusicParam = this.LLJJJJ;
    }

    private final String N5() {
        return new C0VSJ(C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJI(K6().getCreativeInfo(), EnumC20228014Cw.SYNTHESISE, "ai_caption_local", true), C1449640npK.LIZ(".png")).getAbsolutePath();
    }

    private final void T6() {
        U5().ww2().observe(this, new AObserverS231S0100000_29(this, 30));
        k7();
    }

    public C390090FRf D5() {
        List<C0FTJ<StickerModel>> listLLLLLZ;
        C0FTJ c0ftj;
        InterfaceC391240FVq interfaceC391240FVqQj = qj();
        if (interfaceC391240FVqQj == null || (listLLLLLZ = interfaceC391240FVqQj.LLLLLZ(EnumC1466150oFx.AI_CAPTION_TAG)) == null || (c0ftj = (C0FTJ) C13LP.LJJJLZIJ(0, listLLLLLZ)) == null || !(c0ftj instanceof C390090FRf)) {
            return null;
        }
        return (C390090FRf) c0ftj;
    }

    public final AICaptionTagStickerModel E5() {
        List<StickerModel> listLLLILZLLLI;
        StickerModel stickerModel;
        InterfaceC391240FVq interfaceC391240FVqQj = qj();
        if (interfaceC391240FVqQj == null || (listLLLILZLLLI = interfaceC391240FVqQj.LLLILZLLLI(EnumC1466150oFx.AI_CAPTION_TAG)) == null || (stickerModel = (StickerModel) C13LP.LJJJLZIJ(0, listLLLILZLLLI)) == null || !(stickerModel instanceof AICaptionTagStickerModel)) {
            return null;
        }
        return (AICaptionTagStickerModel) stickerModel;
    }

    public final AnonymousClass0957<String> L7() {
        return C23250099c.LIZIZ(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C1410440mo6(this, null), 2);
    }

    public final void P4() {
        InterfaceC19530911b9 interfaceC19530911b9Sd2;
        InterfaceC391240FVq interfaceC391240FVqQj = qj();
        if (interfaceC391240FVqQj == null || (interfaceC19530911b9Sd2 = interfaceC391240FVqQj.sd2()) == null) {
            return;
        }
        interfaceC19530911b9Sd2.LJIIL();
    }

    public void P8() {
        if (K6().mIsFromDraft) {
            T8(K6().creativeModel.stickerModel.aiCaptionShuffleTexts, K6().creativeModel.stickerModel.aiCaptionShuffleTTSDatas);
            this.LLJJJJJIL = K6().creativeModel.stickerModel.aiCaptionShuffleIndex;
        }
    }

    public final void W6() {
        C0FVT c0fvtD6 = d6();
        if (c0fvtD6 != null) {
            c0fvtD6.s8().LIZ((LifecycleOwner) c0fvtD6, new AObjectS302S0200000_5(this, c0fvtD6, 0));
        }
    }

    public final C0FVT d6() {
        InterfaceC1461660o8i interfaceC1461660o8iLIZJ = S5().AT().LIZJ();
        if (interfaceC1461660o8iLIZJ != null) {
            return interfaceC1461660o8iLIZJ.kR();
        }
        return null;
    }

    public void k7() {
        ((C0ETY) getDiContainer().LJII(C0ETY.class, null)).Sd(InterfaceC1460000o62.class, new AwS608S0100000_29(this, 48));
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        W7();
        P8();
        T6();
    }

    @Override // X.AbstractC2255721DQs
    public void onStart() {
        super.onStart();
        d7();
    }

    public final InterfaceC391240FVq qj() {
        C0FVT c0fvtD6 = d6();
        if (c0fvtD6 != null) {
            return c0fvtD6.qj();
        }
        return null;
    }

    public final void u8() {
        y8();
        C09AE c09ae = this.LLJJLIIIJLLLLLLLZ;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        i3(AFwS273S0000000_29.get$arr$(19));
        this.LLJJLIIIJLLLLLLLZ = LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new C19531211bC(this, null));
    }

    public final TextStickerModel x5() {
        List<TextStickerModel> listSb;
        C0FVT c0fvtD6 = d6();
        TextStickerModel textStickerModel = null;
        if (c0fvtD6 == null || (listSb = c0fvtD6.Sb()) == null) {
            return null;
        }
        Iterator<TextStickerModel> it2 = listSb.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            TextStickerModel next = it2.next();
            if (C0F8Y.LJII(next)) {
                textStickerModel = next;
                break;
            }
        }
        return textStickerModel;
    }

    @Override // ge.i
    public Function0<C19531711bH> E3() {
        return this.LLJLIL;
    }

    public final List<TTSModel> H5() {
        return this.LLJJJIL;
    }

    public final float J6() {
        return this.LLJLLIL;
    }

    public final MemeSoundMusicParam L6() {
        return this.LLJJJJ;
    }

    public final List<String> M5() {
        return this.LLJJJ;
    }

    public final int R5() {
        return this.LLJJJJJIL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    public final C19A3 getParentScene() {
        return this.LLJILJILJ;
    }

    private final float C5(C0FTJ<? extends StickerModel> c0ftj) {
        BaseStickerModel baseStickerModelLJJIIJZLJL = c0ftj.LJJIIJZLJL();
        RectF stickerBoundingRect = baseStickerModelLJJIIJZLJL.getStickerBoundingRect();
        return ((baseStickerModelLJJIIJZLJL.getTranslateY() + stickerBoundingRect.top) - stickerBoundingRect.centerY()) - C384720F6o.LIZ(8.0d, C1664590tQ1.LJII(this));
    }

    public void K4(boolean z) {
        List<C0FTJ<StickerModel>> listLLLLLZ;
        TextStickerModel textStickerModel;
        List<StickerModel> listLLLILZLLLI;
        StickerModel stickerModel;
        InterfaceC391240FVq interfaceC391240FVqQj = qj();
        if (interfaceC391240FVqQj != null && (listLLLLLZ = interfaceC391240FVqQj.LLLLLZ(EnumC1466150oFx.TEXT)) != null) {
            for (C0FTJ<StickerModel> c0ftj : listLLLLLZ) {
                StickerModel stickerModelLJLI = c0ftj.LJLI();
                if ((stickerModelLJLI instanceof TextStickerModel) && (textStickerModel = (TextStickerModel) stickerModelLJLI) != null && C0F8Y.LJII(textStickerModel)) {
                    if (c0ftj != null) {
                        InterfaceC391240FVq interfaceC391240FVqQj2 = qj();
                        if (interfaceC391240FVqQj2 != null && (listLLLILZLLLI = interfaceC391240FVqQj2.LLLILZLLLI(EnumC1466150oFx.AI_CAPTION_TAG)) != null && (stickerModel = (StickerModel) C13LP.LJJJLZIJ(0, listLLLILZLLLI)) != null) {
                            AICaptionTagStickerModel aICaptionTagStickerModel = (AICaptionTagStickerModel) stickerModel;
                            InterfaceC391240FVq interfaceC391240FVqQj3 = qj();
                            if (interfaceC391240FVqQj3 != null) {
                                interfaceC391240FVqQj3.k3(n5(aICaptionTagStickerModel, z), EnumC356070Dxd.COMMIT);
                            }
                        } else {
                            InterfaceC391240FVq interfaceC391240FVqQj4 = qj();
                            if (interfaceC391240FVqQj4 != null) {
                                interfaceC391240FVqQj4.f3(t5(this, null, false, 3, null), EnumC356070Dxd.COMMIT);
                            }
                        }
                        C391280FVu c391280FVu = LLJLLL;
                        C0FVT c0fvtD6 = d6();
                        InterfaceC391240FVq interfaceC391240FVqQj5 = qj();
                        c391280FVu.getClass();
                        C391280FVu.LIZ(c0fvtD6, interfaceC391240FVqQj5);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public void N6(boolean z) {
        this.LLJJIJIL = z;
        if (this.LLJJL) {
            this.LLJJL = false;
        } else if (z) {
            u8();
        } else {
            y8();
        }
    }

    public final void Z7(List<TTSModel> list) {
        this.LLJJJIL = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0082 A[PHI: r15
      0x0082: PHI (r15v12 java.lang.String) = (r15v1 java.lang.String), (r15v13 java.lang.String) binds: [B:9:0x0080, B:7:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008c A[PHI: r15
      0x008c: PHI (r15v2 java.lang.String) = (r15v1 java.lang.String), (r15v12 java.lang.String), (r15v12 java.lang.String) binds: [B:9:0x0080, B:11:0x0084, B:13:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0090 A[PHI: r15 r16
      0x0090: PHI (r15v11 java.lang.String) = (r15v2 java.lang.String), (r15v12 java.lang.String) binds: [B:15:0x008e, B:13:0x008a] A[DONT_GENERATE, DONT_INLINE]
      0x0090: PHI (r16v10 java.lang.String) = (r16v1 java.lang.String), (r16v11 java.lang.String) binds: [B:15:0x008e, B:13:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009a A[PHI: r15 r16
      0x009a: PHI (r15v3 java.lang.String) = (r15v2 java.lang.String), (r15v11 java.lang.String), (r15v11 java.lang.String) binds: [B:15:0x008e, B:17:0x0092, B:19:0x0098] A[DONT_GENERATE, DONT_INLINE]
      0x009a: PHI (r16v2 java.lang.String) = (r16v1 java.lang.String), (r16v10 java.lang.String), (r16v10 java.lang.String) binds: [B:15:0x008e, B:17:0x0092, B:19:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009e A[PHI: r15 r16 r17
      0x009e: PHI (r15v10 java.lang.String) = (r15v3 java.lang.String), (r15v11 java.lang.String) binds: [B:21:0x009c, B:19:0x0098] A[DONT_GENERATE, DONT_INLINE]
      0x009e: PHI (r16v9 java.lang.String) = (r16v2 java.lang.String), (r16v10 java.lang.String) binds: [B:21:0x009c, B:19:0x0098] A[DONT_GENERATE, DONT_INLINE]
      0x009e: PHI (r17v8 java.lang.String) = (r17v1 java.lang.String), (r17v9 java.lang.String) binds: [B:21:0x009c, B:19:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a2 A[PHI: r15 r16 r17
      0x00a2: PHI (r15v9 java.lang.String) = (r15v3 java.lang.String), (r15v10 java.lang.String) binds: [B:21:0x009c, B:23:0x00a0] A[DONT_GENERATE, DONT_INLINE]
      0x00a2: PHI (r16v8 java.lang.String) = (r16v2 java.lang.String), (r16v9 java.lang.String) binds: [B:21:0x009c, B:23:0x00a0] A[DONT_GENERATE, DONT_INLINE]
      0x00a2: PHI (r17v7 java.lang.String) = (r17v1 java.lang.String), (r17v8 java.lang.String) binds: [B:21:0x009c, B:23:0x00a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a6 A[PHI: r4 r15 r16 r17
      0x00a6: PHI (r4v1 java.lang.String) = (r4v6 java.lang.String), (r4v7 java.lang.String) binds: [B:25:0x00a4, B:23:0x00a0] A[DONT_GENERATE, DONT_INLINE]
      0x00a6: PHI (r15v4 java.lang.String) = (r15v9 java.lang.String), (r15v10 java.lang.String) binds: [B:25:0x00a4, B:23:0x00a0] A[DONT_GENERATE, DONT_INLINE]
      0x00a6: PHI (r16v3 java.lang.String) = (r16v8 java.lang.String), (r16v9 java.lang.String) binds: [B:25:0x00a4, B:23:0x00a0] A[DONT_GENERATE, DONT_INLINE]
      0x00a6: PHI (r17v2 java.lang.String) = (r17v7 java.lang.String), (r17v8 java.lang.String) binds: [B:25:0x00a4, B:23:0x00a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00aa A[PHI: r4 r15 r16 r17
      0x00aa: PHI (r4v5 java.lang.String) = (r4v1 java.lang.String), (r4v6 java.lang.String) binds: [B:27:0x00a8, B:25:0x00a4] A[DONT_GENERATE, DONT_INLINE]
      0x00aa: PHI (r15v8 java.lang.String) = (r15v4 java.lang.String), (r15v9 java.lang.String) binds: [B:27:0x00a8, B:25:0x00a4] A[DONT_GENERATE, DONT_INLINE]
      0x00aa: PHI (r16v7 java.lang.String) = (r16v3 java.lang.String), (r16v8 java.lang.String) binds: [B:27:0x00a8, B:25:0x00a4] A[DONT_GENERATE, DONT_INLINE]
      0x00aa: PHI (r17v6 java.lang.String) = (r17v2 java.lang.String), (r17v7 java.lang.String) binds: [B:27:0x00a8, B:25:0x00a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ae A[PHI: r1 r4 r15 r16 r17
      0x00ae: PHI (r1v3 java.lang.String) = (r1v1 java.lang.String), (r1v4 java.lang.String) binds: [B:27:0x00a8, B:29:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x00ae: PHI (r4v4 java.lang.String) = (r4v1 java.lang.String), (r4v5 java.lang.String) binds: [B:27:0x00a8, B:29:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x00ae: PHI (r15v7 java.lang.String) = (r15v4 java.lang.String), (r15v8 java.lang.String) binds: [B:27:0x00a8, B:29:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x00ae: PHI (r16v6 java.lang.String) = (r16v3 java.lang.String), (r16v7 java.lang.String) binds: [B:27:0x00a8, B:29:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x00ae: PHI (r17v5 java.lang.String) = (r17v2 java.lang.String), (r17v6 java.lang.String) binds: [B:27:0x00a8, B:29:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel d5(java.lang.String r59) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC19531111bB.d5(java.lang.String):com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel");
    }

    public final void d8(List<String> list) {
        this.LLJJJ = list;
    }

    public final void h8(int i) {
        this.LLJJJJJIL = i;
    }

    public void o7(StickerModel stickerModel) {
        TextStickerModel textStickerModel;
        if ((stickerModel instanceof TextStickerModel) && (textStickerModel = (TextStickerModel) stickerModel) != null && C0F8Y.LJII(textStickerModel)) {
            O4(this, false, 1, null);
            P4();
            K6().creativeModel.stickerModel.isAiCaptionAdded = true;
        }
    }

    public final void o8(float f) {
        this.LLJLLIL = f;
    }

    public final void p8(MemeSoundMusicParam memeSoundMusicParam) {
        this.LLJJJJ = memeSoundMusicParam;
    }

    public void s7(int i) {
        TextStickerModel textStickerModelX5 = x5();
        if (textStickerModelX5 != null && textStickerModelX5.getId() == i) {
            O4(this, false, 1, null);
            P4();
            C390090FRf c390090FRfD5 = D5();
            if (c390090FRfD5 != null) {
                c390090FRfD5.LJIJ(c390090FRfD5.LJJIIJZLJL(), true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object v5(InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        String str;
        String strLIZ;
        ArrayList<String> arrayList;
        String str2;
        List<String> list;
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        CanvasVideoData canvasVideoData = K6().getCanvasVideoData();
        if (canvasVideoData == null || (list = canvasVideoData.sourceInfo) == null || (strLIZ = (String) C13LP.LJJJLZIJ(0, list)) == null) {
            Activity activityLJII = C1664590tQ1.LJII(this);
            MvCreateVideoData mvCreateVideoData = K6().getMvCreateVideoData();
            if (mvCreateVideoData != null && (arrayList = mvCreateVideoData.selectMediaList) != null) {
                str = (String) C13LP.LJJJLZIJ(0, arrayList);
            } else {
                str = null;
            }
            strLIZ = C09N5.LIZ(activityLJII, C2471909mP.LJIILIIL(str));
        }
        if (K6().isLivePhotoEdit()) {
            Activity activityLJII2 = C1664590tQ1.LJII(this);
            MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordDataLJJIIJZLJL = C1416310mxZ.LJJIIJZLJL(K6());
            if (multiEditVideoSegmentRecordDataLJJIIJZLJL != null) {
                str2 = multiEditVideoSegmentRecordDataLJJIIJZLJL.videoPath;
            } else {
                str2 = null;
            }
            strLIZ = C09N5.LIZ(activityLJII2, C2471909mP.LJIILIIL(str2));
        }
        if (strLIZ != null && strLIZ.length() != 0) {
            C1432370nNT c1432370nNT = new C1432370nNT(K6());
            int i = c1432370nNT.LJ;
            int i2 = c1432370nNT.LJFF;
            String strN5 = N5();
            int i3 = (int) (320 / 0.75f);
            String str3 = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object objPluggableSpi$default = PluggableExtentionKt.pluggableSpi$default(IMusicEditService.class, false, false, false, 14, null);
            if (objPluggableSpi$default != null) {
                ((IMusicEditService) objPluggableSpi$default).LJIIJ(K6(), new SrcImageInfo(strLIZ, i2, i, str3, objArr2 == true ? 1 : 0, 24, objArr == true ? 1 : 0), new Size(320, i3), strN5, new AwS643S0100000_29(c23260099m, 15), new AwS678S0100000_29(c23260099m, 0), AFwS261S0000000_22.get$arr$(28), AFwS261S0000000_22.get$arr$(29));
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        } else {
            C2243608qg.LIZ(null, c23260099m);
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    public void y7(int i) {
        r8();
    }

    public AbstractC19531111bB(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = c1drg;
        this.LLJJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455850nzL.class, null);
        this.LLJJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1460000o62.class, null);
        this.LLJJIII = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJJIJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
        this.LLJJIJIIJIL = new AICaptionNetworkModule();
        C13BV c13bv = C13BV.INSTANCE;
        this.LLJJJ = c13bv;
        this.LLJJJIL = c13bv;
        this.LLJJL = K6().mIsFromDraft;
        this.LLJL = new ArrayList();
        this.LLJLIL = new AwS573S0100000_29(this, 47);
        this.LLJLL = C13LQ.LJLIIL(new String[]{"7262974879970890242", "6995862875868762626", "6995862032528445953", "6995862417234203138", "6994853774179176962", "6994855474042507778", "6994853055812342273"});
        this.LLJLLIL = -C1919207fS.LJIIJJI();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0105 A[PHI: r28
      0x0105: PHI (r28v1 float) = (r28v0 float), (r28v3 float) binds: [B:29:0x0102, B:24:0x00ae] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.ss.android.ugc.aweme.tools.sticker.core.aicaption.AICaptionTagStickerModel n5(com.ss.android.ugc.aweme.tools.sticker.core.aicaption.AICaptionTagStickerModel r55, boolean r56) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC19531111bB.n5(com.ss.android.ugc.aweme.tools.sticker.core.aicaption.AICaptionTagStickerModel, boolean):com.ss.android.ugc.aweme.tools.sticker.core.aicaption.AICaptionTagStickerModel");
    }

    public void I7(String str, TTSModel tTSModel) {
        if (this.LLJJIJIL && getLifecycle().getCurrentState() == Lifecycle.State.RESUMED) {
            z8();
            TextStickerModel textStickerModelD5 = d5(str);
            C0F7U.LJIIJ(C1664590tQ1.LJIIIZ(this), U5(), "AI caption", C0F7U.LIZJ(textStickerModelD5), new AwS65S1300000_29(textStickerModelD5, (TextStickerModel) tTSModel, (TTSModel) str, (String) this, 0));
        }
    }

    public final void T8(List<String> list, List<TTSModel> list2) {
        this.LLJJJ = list;
        this.LLJJJIL = list2;
    }

    public void u7(StickerModel stickerModel, String str) {
        List<StickerModel> listLLLILZLLLI;
        StickerModel stickerModel2;
        InterfaceC19530911b9 interfaceC19530911b9Sd2;
        InterfaceC391240FVq interfaceC391240FVqQj = qj();
        if (interfaceC391240FVqQj != null && (listLLLILZLLLI = interfaceC391240FVqQj.LLLILZLLLI(EnumC1466150oFx.AI_CAPTION_TAG)) != null && (stickerModel2 = (StickerModel) C13LP.LJJJLZIJ(0, listLLLILZLLLI)) != null) {
            InterfaceC391240FVq interfaceC391240FVqQj2 = qj();
            if (interfaceC391240FVqQj2 != null) {
                interfaceC391240FVqQj2.XJ(stickerModel2.getId(), null, EnumC356070Dxd.COMMIT);
            }
            InterfaceC391240FVq interfaceC391240FVqQj3 = qj();
            if (interfaceC391240FVqQj3 != null && (interfaceC19530911b9Sd2 = interfaceC391240FVqQj3.sd2()) != null) {
                interfaceC19530911b9Sd2.LJJIIZI();
            }
            K6().creativeModel.stickerModel.isAiCaptionAdded = false;
            InterfaceC1460000o62 interfaceC1460000o62M6 = m6();
            if (interfaceC1460000o62M6 != null) {
                interfaceC1460000o62M6.oz(false);
            }
        }
    }

    public final void F4(final String str, final TTSModel tTSModel, boolean z) {
        List<TextStickerModel> listSb;
        C0FVT c0fvtD6 = d6();
        TextStickerModel textStickerModel = null;
        if (c0fvtD6 != null && (listSb = c0fvtD6.Sb()) != null) {
            Iterator<TextStickerModel> it2 = listSb.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                TextStickerModel next = it2.next();
                if (C0F8Y.LJII(next)) {
                    textStickerModel = next;
                    break;
                }
            }
            TextStickerModel textStickerModel2 = textStickerModel;
            if (textStickerModel2 != null) {
                c9(TextStickerModel.copy$default(textStickerModel2, null, null, null, null, null, 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, z, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -1073741825, 65535, null), str, tTSModel, new AwS145S0110000_29((AbstractC19531111bB) this, z, true));
                return;
            }
        }
        if (C0FI2.LJIJJ().LJIIZILJ("BarlowCondensed-Bold.ttf") != null) {
            I7(str, tTSModel);
        } else {
            C0FI2.LJIJJLI("textfont").LIZLLL("Heavy", new C0FI9(this) { // from class: X.11bD
                public final /* synthetic */ AbstractC19531111bB<API_COMPONENT> LIZ;

                @Override // X.C0FI9
                public final void onFail() {
                }

                @Override // X.C0FI9
                public final void onSuccess() {
                }

                @Override // X.C0FI9
                public final void LIZ(Boolean bool) {
                    bool.booleanValue();
                    this.LIZ.I7(str, tTSModel);
                }

                {
                    this.LIZ = this;
                }
            }, Boolean.TRUE);
        }
    }

    public static /* synthetic */ void O4(AbstractC19531111bB abstractC19531111bB, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            abstractC19531111bB.K4(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addOrUpdateAIMemeTagSticker");
    }

    public void T4(TextStickerModel textStickerModel, TTSModel tTSModel, boolean z, Function1<? super TextStickerModel, Unit> function1) {
        C0FWP c0fwpRi;
        C0FVT c0fvtD6 = d6();
        if (c0fvtD6 != null && (c0fwpRi = c0fvtD6.Ri()) != null) {
            TextStickerData textStickerDataLIZJ = C0F7U.LIZJ(textStickerModel);
            C0FWT c0fwt = c0fwpRi.LJII;
            if (c0fwt != null) {
                c0fwt.t81(tTSModel, textStickerDataLIZJ, z, new AwS5S0410000_5(c0fwpRi, (C0FWP) textStickerModel, (TextStickerModel) function1, (Function1<? super TextStickerModel, Unit>) z, (boolean) textStickerDataLIZJ, (TextStickerData) 0));
            }
        }
    }

    public final void c9(TextStickerModel textStickerModel, String str, TTSModel tTSModel, Function0<Unit> function0) {
        TextStickerModel textStickerModelCopy$default = TextStickerModel.copy$default(textStickerModel, null, null, null, str, null, 0, 0, 0, this.LLJLLIL, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -265, 65535, null);
        C0F7U.LJIIJ(C1664590tQ1.LJII(this), U5(), "AI caption", C0F7U.LIZJ(textStickerModelCopy$default), new C391350FWb(textStickerModelCopy$default, this, tTSModel, str, function0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a9(AbstractC19531111bB abstractC19531111bB, List list, List list2, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                list2 = C13BV.INSTANCE;
            }
            abstractC19531111bB.T8(list, list2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateAICaption");
    }

    public static /* synthetic */ AICaptionTagStickerModel t5(AbstractC19531111bB abstractC19531111bB, AICaptionTagStickerModel aICaptionTagStickerModel, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                aICaptionTagStickerModel = null;
            }
            if ((i & 2) != 0) {
                z = false;
            }
            return abstractC19531111bB.n5(aICaptionTagStickerModel, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: genOrUpdateAICaptionTagModel");
    }

    public static /* synthetic */ void H4(AbstractC19531111bB abstractC19531111bB, String str, TTSModel tTSModel, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                tTSModel = null;
            }
            if ((i & 4) != 0) {
                z = false;
            }
            abstractC19531111bB.F4(str, tTSModel, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addOrUpdateAICaptionTextSticker");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void Z4(AbstractC19531111bB abstractC19531111bB, TextStickerModel textStickerModel, TTSModel tTSModel, boolean z, Function1 function1, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                z = true;
            }
            if ((i & 8) != 0) {
                function1 = null;
            }
            abstractC19531111bB.T4(textStickerModel, tTSModel, z, function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addTTSToSticker");
    }
}
