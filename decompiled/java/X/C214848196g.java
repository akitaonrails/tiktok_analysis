package X;

import Y.ACListenerS134S0200000_32;
import Y.ACListenerS166S0100000_32;
import Y.ACallableS23S2100000_22;
import Y.ACallableS58S1100000_3;
import Y.ATListenerS464S0100000_32;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.EditPostModel;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.SrcLiveVideoInfo;
import com.ss.android.ugc.aweme.creative.model.edit.SubOnlyPhotoPreviewInfo;
import com.ss.android.ugc.aweme.creative.model.edit.aicover.AICoverInfo;
import com.ss.android.ugc.aweme.creative.model.edit.aicover.AICoverItem;
import com.ss.android.ugc.aweme.creative.model.publish.EditDescMobModel;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.image.aicover.AICoverPluginService;
import com.ss.android.ugc.aweme.services.publish.IAVPublishPageUIRefactorService;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.image.ExpandTextViewModel;
import com.ss.android.ugc.aweme.shortvideo.image.ExpandedTitleModule;
import com.ss.android.ugc.aweme.shortvideo.image.airewrite.AIRewriteModule;
import com.ss.android.ugc.aweme.shortvideo.image.voiceinput.api.IVoiceInputController;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.SoftKeyBoardListener;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AFwS278S0000000_32;
import kotlin.jvm.internal.AwS276S0300000_32;
import kotlin.jvm.internal.AwS433S0200000_32;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.AwS599S0100000_20;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.AwS646S0100000_32;
import kotlin.jvm.internal.AwS98S1200000_14;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.196g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214848196g {
    public static final int[] LJJJJZ = {R.id.dat, R.id.qdm, R.id.whg, R.id.fn3, R.id.y1c};
    public VideoPublishEditModel LIZ;
    public final Scene LIZIZ;
    public final View LIZJ;
    public final InterfaceC214845196d LIZLLL;
    public final Function0<Boolean> LJ;
    public final List<C19223110Ij> LJFF;
    public final boolean LJI;
    public final Function0<Unit> LJII;
    public final C19EG LJIIIIZZ;
    public final ViewGroupOverlay LJIIIZ;
    public boolean LJIIJ;
    public ViewGroup LJIIJJI;
    public C196S LJIIL;
    public ExpandedTitleModule LJIILIIL;
    public View LJIILJJIL;
    public C0I7D LJIILL;
    public C0ZI0 LJIILLIIL;
    public TextView LJIIZILJ;
    public FrameLayout LJIJ;
    public C19659811vw LJIJI;
    public View LJIJJ;
    public LinearLayout LJIJJLI;
    public C1295960jpS LJIL;
    public TuxTextView LJJ;
    public final List<RunnableC1432010nMt> LJJI;
    public final LinkedBlockingQueue<Runnable> LJJIFFI;
    public final C01GW LJJII;
    public final C11NJ LJJIII;
    public boolean LJJIIJ;
    public boolean LJJIIJZLJL;
    public ExpandTextViewModel LJJIIZ;
    public final int LJJIIZI;
    public int LJJIJ;
    public final C054G LJJIJIIJI;
    public C12G3 LJJIJIIJIL;
    public AnonymousClass0956 LJJIJIL;
    public AnonymousClass0956 LJJIJL;
    public boolean LJJIJLIJ;
    public boolean LJJIL;
    public boolean LJJIZ;
    public SoftKeyBoardListener LJJJ;
    public final C856990Xjd LJJJI;
    public final C857010Xjf LJJJIL;
    public boolean LJJJJ;
    public final C214851196j LJJJJI;
    public boolean LJJJJIZL;
    public boolean LJJJJJ;
    public IVoiceInputController LJJJJJL;
    public Function1<? super Boolean, Unit> LJJJJL;
    public boolean LJJJJLI;
    public C1162810gMh LJJJJLL;

    public final View LJIJJLI() {
        int[] iArr = {R.id.bmy, R.id.e1v};
        int i = 0;
        do {
            View viewFindViewById = this.LIZJ.findViewById(iArr[i]);
            if (viewFindViewById != null && viewFindViewById.isShown()) {
                return viewFindViewById;
            }
            i++;
        } while (i < 2);
        return null;
    }

    public final C12G3 LIZ() {
        String creationId;
        C12G3 c12g3LJ;
        C1446760nkg.LIZ.getClass();
        if (!C1446760nkg.LIZJ()) {
            return null;
        }
        C12G3 c12g3 = this.LJJIJIIJIL;
        if (c12g3 != null) {
            return c12g3;
        }
        ImageAlbumData imageAlbumData = this.LIZ.getImageAlbumData();
        if (imageAlbumData == null || imageAlbumData.getAiCoverInfo() == null || (creationId = this.LIZ.getCreationId()) == null || !(!a0.LJJJIL(creationId))) {
            return null;
        }
        AICoverPluginService.LIZ.getClass();
        AICoverPluginService aICoverPluginServiceLIZ = C1446770nkh.LIZ();
        if (aICoverPluginServiceLIZ == null || (c12g3LJ = aICoverPluginServiceLIZ.LJ(this.LIZ, creationId)) == null) {
            return null;
        }
        this.LJJIJIIJIL = c12g3LJ;
        return c12g3LJ;
    }

    public final AICoverInfo LIZJ() {
        ImageAlbumData imageAlbumData;
        AICoverInfo aiCoverInfo;
        AnonymousClass0951 anonymousClass0951LIZJ;
        List<SingleImageData> imageList;
        C1446760nkg.LIZ.getClass();
        if (!C1446760nkg.LIZJ()) {
            return null;
        }
        ImageAlbumData imageAlbumData2 = this.LIZ.getImageAlbumData();
        if (imageAlbumData2 != null && (imageList = imageAlbumData2.getImageList()) != null && !imageList.isEmpty()) {
            Iterator<SingleImageData> it2 = imageList.iterator();
            while (it2.hasNext()) {
                if (it2.next().isAICover()) {
                    return null;
                }
            }
        }
        C12G3 c12g3 = this.LJJIJIIJIL;
        if (((c12g3 == null || (anonymousClass0951LIZJ = c12g3.LIZJ()) == null || (aiCoverInfo = (AICoverInfo) anonymousClass0951LIZJ.getValue()) == null) && ((imageAlbumData = this.LIZ.getImageAlbumData()) == null || (aiCoverInfo = imageAlbumData.getAiCoverInfo()) == null)) || !aiCoverInfo.isConfirmed()) {
            return null;
        }
        return aiCoverInfo;
    }

    public final String LJI() {
        ExpandedTitleModule expandedTitleModule = this.LJIILIIL;
        if (expandedTitleModule != null) {
            return expandedTitleModule.LJJIIZ();
        }
        return null;
    }

    public final boolean LJIIJ() {
        VideoPublishEditModel videoPublishEditModel = this.LIZ;
        return (videoPublishEditModel.creativeModel.editPostModel == null && !C1428470nHB.LJZ(videoPublishEditModel) && (C295670BiP.LIZ() || !this.LIZ.isLivePhotoEdit())) || C123100dR.LIZ(this.LIZ.creativeModel.text2ImageModel.text);
    }

    public final boolean LJIIL() {
        ExpandedTitleModule expandedTitleModule = this.LJIILIIL;
        return expandedTitleModule != null && expandedTitleModule.LJJIJL();
    }

    public final boolean LJIILIIL() {
        IVoiceInputController iVoiceInputController = this.LJJJJJL;
        if (iVoiceInputController != null && iVoiceInputController.onHostBackPressed()) {
            return true;
        }
        ExpandedTitleModule expandedTitleModule = this.LJIILIIL;
        if (expandedTitleModule == null) {
            return false;
        }
        if (expandedTitleModule.LJJIJIIJI()) {
            expandedTitleModule.LJJIIZI();
        } else {
            if (expandedTitleModule.LLLZIIL != 5) {
                return false;
            }
            expandedTitleModule.LJIJJ(1, false);
        }
        return true;
    }

    public final void LJIILLIIL() {
        String creationId;
        AnonymousClass0956 anonymousClass0956 = this.LJJIJIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LJJIJIL = null;
        AnonymousClass0956 anonymousClass09562 = this.LJJIJL;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        this.LJJIJL = null;
        boolean z = this.LJJIJIIJIL != null;
        this.LJJIJIIJIL = null;
        if (z && (creationId = this.LIZ.getCreationId()) != null && (true ^ a0.LJJJIL(creationId))) {
            AICoverPluginService.LIZ.getClass();
            AICoverPluginService aICoverPluginServiceLIZ = C1446770nkh.LIZ();
            if (aICoverPluginServiceLIZ != null) {
                aICoverPluginServiceLIZ.LIZJ(this.LIZ, creationId);
            }
        }
        this.LJJIII.LJ();
        SoftKeyBoardListener softKeyBoardListener = this.LJJJ;
        if (softKeyBoardListener != null) {
            softKeyBoardListener.LIZ();
        }
        this.LJJJ = null;
        C1162810gMh c1162810gMh = this.LJJJJLL;
        if (c1162810gMh != null) {
            ((LinkedHashMap) c1162810gMh.LIZIZ).clear();
            ((LinkedHashMap) c1162810gMh.LIZJ).clear();
            c1162810gMh.LIZLLL = EnumC1159920gI2.LL;
            c1162810gMh.LJ = false;
            c1162810gMh.LJFF = false;
        }
        this.LJJJJLL = null;
    }

    public final void LJIIZILJ() {
        ViewGroup viewGroup;
        C197039127h c197039127h;
        ExpandedTitleModule expandedTitleModule;
        C0ZI0 c0zi0;
        if (!this.LJJIIJZLJL) {
            ViewGroup viewGroup2 = this.LJIIJJI;
            C0ZI0 c0zi02 = viewGroup2 != null ? (C0ZI0) viewGroup2.findViewById(R.id.guf) : (C0ZI0) this.LIZJ.findViewById(R.id.guf);
            this.LJIILLIIL = c0zi02;
            if (c0zi02 != null) {
                c0zi02.setLineSpacing(0.0f, 1.4f);
            }
            C0ZI0 c0zi03 = this.LJIILLIIL;
            if (c0zi03 != null) {
                c0zi03.setFocusChangeListener(new ViewOnFocusChangeListenerC21523319Lb(this, 1));
            }
            this.LJJIIJZLJL = true;
        }
        if (!this.LJJJJIZL || this.LJJJJJ || (viewGroup = this.LJIIJJI) == null || (c197039127h = (C197039127h) viewGroup.findViewById(R.id.voice_input_icon)) == null || (expandedTitleModule = this.LJIILIIL) == null || (c0zi0 = this.LJIILLIIL) == null) {
            return;
        }
        C1702620uPM c1702620uPM = C1702620uPM.LIZ;
        Scene scene = this.LIZIZ;
        VideoPublishEditModel videoPublishEditModel = this.LIZ;
        ViewGroup viewGroup3 = this.LJIIJJI;
        if (viewGroup3 == null) {
            View view = this.LIZJ;
            if (!(view instanceof ViewGroup) || (viewGroup3 = (ViewGroup) view) == null) {
                return;
            }
        }
        View view2 = this.LIZJ;
        C214855196n c214855196n = new C214855196n(new AwS576S0100000_32(this, 487), new AwS576S0100000_32(this, 488), new AwS576S0100000_32(this, 489), new AwS276S0300000_32(c197039127h, expandedTitleModule, this, 11), new AwS558S0100000_14(this, 1317), new AwS646S0100000_32(this, 20), new AwS576S0100000_32(this, 490), new AwS611S0100000_32(this, 257), new AwS433S0200000_32(this, c197039127h, 44));
        final AwS576S0100000_32 awS576S0100000_32 = new AwS576S0100000_32(expandedTitleModule, 497);
        final AwS576S0100000_32 awS576S0100000_322 = new AwS576S0100000_32(this, 498);
        final AwS576S0100000_32 awS576S0100000_323 = new AwS576S0100000_32(expandedTitleModule, 499);
        IVoiceInputController iVoiceInputControllerLIZ = c1702620uPM.LIZ(scene, videoPublishEditModel, viewGroup3, view2, c0zi0, c214855196n, new C1989407qm(EnumC1989307ql.PHOTO, AFwS190S0000000_4.get$arr$(3024), AFwS190S0000000_4.get$arr$(3025), AFwS190S0000000_4.get$arr$(3026), new AwS558S0100000_14(this, 1318), new AwS576S0100000_32(this, 492), new AwS576S0100000_32(this, 493), new AwS576S0100000_32(this, 494), new AwS599S0100000_20(this, 31)), new InterfaceC1702650uPP(awS576S0100000_32, awS576S0100000_322, awS576S0100000_323) { // from class: X.197E
            public final Function0<AIRewriteModule> LIZ;
            public final Function0<Unit> LIZIZ;
            public final Function0<Unit> LIZJ;

            @Override // X.InterfaceC1702650uPP
            public final boolean LIZ() {
                return true;
            }

            @Override // X.InterfaceC1702650uPP
            public final void LJIIJ() {
            }

            @Override // X.InterfaceC1702650uPP
            public final boolean LJIIJJI() {
                return true;
            }

            @Override // X.InterfaceC1702650uPP
            public final void LJFF() {
                AIRewriteModule aIRewriteModuleInvoke = this.LIZ.invoke();
                if (aIRewriteModuleInvoke != null) {
                    aIRewriteModuleInvoke.LJIJJLI();
                }
            }

            @Override // X.InterfaceC1702650uPP
            public final boolean LJI() {
                AIRewriteModule aIRewriteModuleInvoke = this.LIZ.invoke();
                if (aIRewriteModuleInvoke == null) {
                    return false;
                }
                if (aIRewriteModuleInvoke.LJIILL()) {
                    this.LIZJ.invoke();
                }
                EnumC1779820wPs enumC1779820wPs = aIRewriteModuleInvoke.LLJJI.getVisibility() == 0 ? EnumC1779820wPs.LL : aIRewriteModuleInvoke.LLJJJ.getVisibility() == 0 ? EnumC1779820wPs.LLILLJJLI : aIRewriteModuleInvoke.LLJJIJIIJIL.getVisibility() == 0 ? EnumC1779820wPs.LLILLL : EnumC1779820wPs.LL;
                aIRewriteModuleInvoke.LLJZ = enumC1779820wPs;
                if (enumC1779820wPs == EnumC1779820wPs.LL) {
                    aIRewriteModuleInvoke.LIZLLL();
                    return false;
                }
                aIRewriteModuleInvoke.LJIILJJIL();
                aIRewriteModuleInvoke.LJ(false);
                aIRewriteModuleInvoke.LJIJJ(true);
                return true;
            }

            @Override // X.InterfaceC1702650uPP
            public final void LJII() {
                AIRewriteModule aIRewriteModuleInvoke = this.LIZ.invoke();
                if (aIRewriteModuleInvoke != null) {
                    aIRewriteModuleInvoke.LIZLLL();
                }
            }

            @Override // X.InterfaceC1702650uPP
            public final void LJIIIZ() {
                AIRewriteModule aIRewriteModuleInvoke = this.LIZ.invoke();
                if (aIRewriteModuleInvoke != null) {
                    aIRewriteModuleInvoke.LJJ();
                }
            }

            @Override // X.InterfaceC1702650uPP
            public final void LJIILJJIL() {
                AIRewriteModule aIRewriteModuleInvoke = this.LIZ.invoke();
                if (aIRewriteModuleInvoke != null) {
                    int iOrdinal = aIRewriteModuleInvoke.LLJZ.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1) {
                            aIRewriteModuleInvoke.LJII();
                            aIRewriteModuleInvoke.LJ(true);
                            aIRewriteModuleInvoke.LJIILJJIL();
                            C337180DJs.LIZJ(aIRewriteModuleInvoke.LLJJJ);
                            aIRewriteModuleInvoke.LJIJJLI();
                            aIRewriteModuleInvoke.LJIJJ(true);
                        } else {
                            if (iOrdinal != 2) {
                                throw new C1954807lC();
                            }
                            aIRewriteModuleInvoke.LJII();
                            aIRewriteModuleInvoke.LJ(true);
                            aIRewriteModuleInvoke.LJIILJJIL();
                            C337180DJs.LIZJ(aIRewriteModuleInvoke.LLJJIJIIJIL);
                            aIRewriteModuleInvoke.LJIJJ(true);
                        }
                    }
                    aIRewriteModuleInvoke.LLJZ = EnumC1779820wPs.LL;
                }
            }

            @Override // X.InterfaceC1702650uPP
            public final void LJIILL() {
                AIRewriteModule aIRewriteModuleInvoke = this.LIZ.invoke();
                if (aIRewriteModuleInvoke != null) {
                    if (C0CHX.LIZIZ(aIRewriteModuleInvoke.LLILLJJLI) == 2) {
                        C337180DJs.LIZ(aIRewriteModuleInvoke.LLJJJ);
                        C337180DJs.LIZJ(aIRewriteModuleInvoke.LLJJJJLIIL);
                    } else {
                        aIRewriteModuleInvoke.LJ(false);
                        aIRewriteModuleInvoke.LJIILJJIL();
                    }
                    aIRewriteModuleInvoke.LJIJJ(true);
                }
            }

            @Override // X.InterfaceC1702650uPP
            public final boolean LLIIIL() {
                AIRewriteModule aIRewriteModuleInvoke = this.LIZ.invoke();
                if (aIRewriteModuleInvoke != null) {
                    return aIRewriteModuleInvoke.LJIILL();
                }
                return false;
            }

            @Override // X.InterfaceC1702650uPP
            public final boolean isLoading() {
                AIRewriteModule aIRewriteModuleInvoke = this.LIZ.invoke();
                return aIRewriteModuleInvoke != null && aIRewriteModuleInvoke.LLJJI.getVisibility() == 0;
            }

            @Override // X.InterfaceC1702650uPP
            public final void LIZIZ(Function0<Boolean> function0) {
                AIRewriteModule aIRewriteModuleInvoke = this.LIZ.invoke();
                if (aIRewriteModuleInvoke != null) {
                    aIRewriteModuleInvoke.LLJJJJ = function0;
                    aIRewriteModuleInvoke.LJIJJLI();
                }
            }

            @Override // X.InterfaceC1702650uPP
            public final void LIZJ(String str) {
                AIRewriteModule aIRewriteModuleInvoke = this.LIZ.invoke();
                if (aIRewriteModuleInvoke != null) {
                    aIRewriteModuleInvoke.LLJLLL = "auto";
                    C856190XiL c856190XiL = C856190XiL.LIZ;
                    VideoPublishEditModel videoPublishEditModel2 = aIRewriteModuleInvoke.LLILLJJLI;
                    int iLJIIL = aIRewriteModuleInvoke.LJIIL();
                    c856190XiL.getClass();
                    C856190XiL.LIZIZ(iLJIIL, videoPublishEditModel2, "enter", "auto");
                    aIRewriteModuleInvoke.LJ(true);
                    aIRewriteModuleInvoke.LJII();
                    aIRewriteModuleInvoke.LJJIIJ(C197H.ENHANCE, false);
                }
            }

            @Override // X.InterfaceC1702650uPP
            public final void LIZLLL(Function0<Unit> function0) {
                AIRewriteModule aIRewriteModuleInvoke = this.LIZ.invoke();
                if (aIRewriteModuleInvoke != null) {
                    aIRewriteModuleInvoke.LLLILZ = function0;
                }
            }

            @Override // X.InterfaceC1702650uPP
            public final void LJIIL(InterfaceC1702660uPQ interfaceC1702660uPQ) {
                AwS576S0100000_32 awS576S0100000_324;
                AIRewriteModule aIRewriteModuleInvoke = this.LIZ.invoke();
                if (aIRewriteModuleInvoke != null) {
                    if (interfaceC1702660uPQ != null) {
                        awS576S0100000_324 = new AwS576S0100000_32(interfaceC1702660uPQ, 572);
                    } else {
                        awS576S0100000_324 = null;
                    }
                    aIRewriteModuleInvoke.LLLIL = awS576S0100000_324;
                }
            }

            @Override // X.InterfaceC1702650uPP
            public final void LJIILIIL(boolean z) {
                if (!z) {
                    return;
                }
                C214861196t.LIZ.storeBoolean("has_shown_button_text_ai_rewrite", true);
                this.LIZIZ.invoke();
            }

            {
                this.LIZ = awS576S0100000_32;
                this.LIZIZ = awS576S0100000_322;
                this.LIZJ = awS576S0100000_323;
            }

            @Override // X.InterfaceC1702650uPP
            public final void LJ(String str, Function0 function0, Function1 function1) {
                AIRewriteModule aIRewriteModuleInvoke = this.LIZ.invoke();
                if (aIRewriteModuleInvoke == null) {
                    function0.invoke();
                    return;
                }
                aIRewriteModuleInvoke.LLJLLL = "auto";
                C856190XiL c856190XiL = C856190XiL.LIZ;
                VideoPublishEditModel videoPublishEditModel2 = aIRewriteModuleInvoke.LLILLJJLI;
                int iLJIIL = aIRewriteModuleInvoke.LJIIL();
                c856190XiL.getClass();
                C856190XiL.LIZIZ(iLJIIL, videoPublishEditModel2, "enter", "auto");
                C1156050gBn c1156050gBn = new C1156050gBn(str, function0, function1);
                aIRewriteModuleInvoke.LLJLILLLLZIIL = c1156050gBn;
                aIRewriteModuleInvoke.LLJLL = null;
                aIRewriteModuleInvoke.LLJLLIL = String.valueOf(aIRewriteModuleInvoke.LJIIJ());
                aIRewriteModuleInvoke.LLJZ = EnumC1779820wPs.LL;
                C197H c197h = C197H.RANGE_REWRITE;
                C197G c197g = aIRewriteModuleInvoke.LLLIILIL;
                if (c197g != null) {
                    c197g.LJIIIIZZ = c197h.getCode();
                } else {
                    aIRewriteModuleInvoke.LLJLIL = c197h;
                }
                C197G c197g2 = aIRewriteModuleInvoke.LLLIILIL;
                if (c197g2 != null) {
                    c197g2.LIZLLL = false;
                } else {
                    aIRewriteModuleInvoke.LLL = false;
                }
                aIRewriteModuleInvoke.LLLIIII.remove(Integer.valueOf(c197h.getCode()));
                aIRewriteModuleInvoke.LJ(true);
                aIRewriteModuleInvoke.LJII();
                aIRewriteModuleInvoke.LJJIII(true, true);
                aIRewriteModuleInvoke.LJIIIIZZ(c1156050gBn);
            }

            @Override // X.InterfaceC1702650uPP
            public final void LJIIIIZZ(int i, int i2, String str) {
                Editable editableP;
                AIRewriteModule aIRewriteModuleInvoke = this.LIZ.invoke();
                if (aIRewriteModuleInvoke != null && (editableP = C2204961BRm.p(aIRewriteModuleInvoke.LLIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhlc/EjolTCPPq0r++7J3Rw/lmTjByyRYeqwbBw4LCZA==", null))) != null) {
                    int iLJ = C13LZ.LJ(i, 0, editableP.length());
                    int iLJ2 = C13LZ.LJ(i2, iLJ, editableP.length());
                    aIRewriteModuleInvoke.LLIZ.LLLLIL = true;
                    try {
                        editableP.replace(iLJ, iLJ2, str);
                        aIRewriteModuleInvoke.LLIZ.LLLLIL = false;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        aIRewriteModuleInvoke.LLIZ.LLLLIL = false;
                        throw th;
                    }
                }
            }
        }, null);
        if (iVoiceInputControllerLIZ != null) {
            this.LJJJJJL = iVoiceInputControllerLIZ;
            C786410Ut5.U8(c197039127h, new ACListenerS134S0200000_32(expandedTitleModule, iVoiceInputControllerLIZ, 14));
            this.LJJJJJ = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0130 A[EDGE_INSN: B:89:0x0130->B:63:0x0130 BREAK  A[LOOP:2: B:57:0x011c->B:90:0x011c]] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00d7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJ() {
        /*
            Method dump skipped, instruction units count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C214848196g.LJIJ():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.196S] */
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
    public final void LJIJI() {
        ?? arrayList;
        List<SingleImageData> imageList;
        UrlModel urlModel;
        EditPostModel editPostModel = this.LIZ.creativeModel.editPostModel;
        List<PhotoModeImageUrlModel> imageList2 = editPostModel != null ? editPostModel.getImageList() : null;
        C196S c196s = this.LJIIL;
        if (c196s != null) {
            c196s.LIZJ();
        }
        ?? r3 = this.LJIIL;
        if (r3 != 0) {
            ImageAlbumData imageAlbumData = this.LIZ.getImageAlbumData();
            if (imageAlbumData == null || (imageList = imageAlbumData.getImageList()) == null) {
                arrayList = C13BV.INSTANCE;
            } else {
                arrayList = new ArrayList(C15438062q.LJIJJ(imageList, 10));
                int i = 0;
                for (SingleImageData singleImageData : imageList) {
                    int i2 = i + 1;
                    if (i < 0) {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                    SingleImageData singleImageData2 = singleImageData;
                    String strLJFF = LJFF(singleImageData2);
                    int bitmapWidth = singleImageData2.getEditImageInfo().getBitmapWidth();
                    int bitmapHeight = singleImageData2.getEditImageInfo().getBitmapHeight();
                    String remoteUri = singleImageData2.getSrcImageInfo().getRemoteUri();
                    if (imageList2 != null) {
                        for (PhotoModeImageUrlModel photoModeImageUrlModel : imageList2) {
                            UrlModel urlModel2 = photoModeImageUrlModel.displayImageNoWatermark;
                            if (Intrinsics.LJFF(urlModel2 != null ? urlModel2.getUri() : null, remoteUri)) {
                                urlModel = photoModeImageUrlModel.thumbnail;
                                break;
                            }
                        }
                        urlModel = null;
                    } else {
                        urlModel = null;
                    }
                    arrayList.add(new C196X(strLJFF, bitmapWidth, bitmapHeight, urlModel, 0, 0.0f, LJIIIIZZ(singleImageData2), LIZLLL(singleImageData2), LJ(singleImageData2), 112));
                    i = i2;
                }
            }
            r3.LJ(arrayList, LJIIJ(), LIZJ());
        }
    }

    public final void LJIL() {
        boolean z;
        int i;
        boolean z2;
        ViewGroup viewGroup = this.LJIIJJI;
        if (viewGroup != null) {
            TuxTextView tuxTextView = (TuxTextView) viewGroup.findViewById(R.id.b_6);
            TuxTextView tuxTextView2 = (TuxTextView) viewGroup.findViewById(R.id.b_5);
            TuxTextView tuxTextView3 = (TuxTextView) viewGroup.findViewById(R.id.afg);
            TuxTextView tuxTextView4 = (TuxTextView) viewGroup.findViewById(R.id.fnd);
            C197039127h c197039127h = (C197039127h) viewGroup.findViewById(R.id.ar1);
            VideoPublishEditModel videoPublishEditModel = this.LIZ;
            if (C0CHQ.LIZ().getAccountService().isLogin() && videoPublishEditModel.creativeModel.editPostModel == null && C1428470nHB.LJJZZI(videoPublishEditModel) && ((Number) C278910AwT.LIZ.getValue()).intValue() >= 1 && C1852010yIJ.LIZ()) {
                z = true;
                i = 212;
                C1702620uPM.LIZ.getClass();
                if (C1702620uPM.LIZJ == null && !C1702620uPM.LIZLLL) {
                    C20191713zX c20191713zX = C20191713zX.LIZ;
                    c20191713zX.getClass();
                    if (!C20191713zX.LIZ()) {
                        c20191713zX.LIZJ();
                    }
                }
            } else {
                z = false;
                i = 176;
            }
            boolean z3 = z && C1702620uPM.LIZ.isAvailable() && !C21139417o0.LIZ().getBoolean("has_shown_voice_entry_text", false);
            C786410Ut5.LLLLZLL(tuxTextView3, 0);
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            C0ZIO c0zio = C0ZIO.LIZ;
            tuxTextView2.setCompoundDrawablesRelative(C0ZIO.LIZIZ(c0zio, this.LJIIIIZZ, R.raw.icon_at, iLIZIZ, 4), null, null, null);
            tuxTextView.setCompoundDrawablesRelative(C0ZIO.LIZIZ(c0zio, this.LJIIIIZZ, R.raw.icon_number, iLIZIZ, 4), null, null, null);
            tuxTextView3.setCompoundDrawablesRelative(C0ZIO.LIZIZ(c0zio, this.LJIIIIZZ, R.raw.icon_play_circle, iLIZIZ, 4), null, null, null);
            tuxTextView4.setCompoundDrawablesRelative(C0ZIO.LIZIZ(c0zio, this.LJIIIIZZ, R.raw.icon_ai_insight, iLIZIZ, 4), null, null, null);
            tuxTextView4.setTuxFont(62);
            tuxTextView4.setBackgroundResource(R.drawable.ar4);
            if (C0CHY.LIZ(this.LIZ) > 0 || C855980Xi0.LIZIZ(this.LIZ)) {
                C337180DJs.LIZJ(viewGroup.findViewById(R.id.fne));
                C337180DJs.LIZJ(tuxTextView4);
                C995240c0Q.LIZJ(tuxTextView);
                C995240c0Q.LIZJ(tuxTextView2);
                C995240c0Q.LIZJ(tuxTextView3);
                if (z3) {
                    C995240c0Q.LIZJ(tuxTextView4);
                }
                tuxTextView4.setMaxWidth(C12ES.LJIIJ(viewGroup.getContext()) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i))));
            }
            c197039127h.setBackgroundResource(R.drawable.ar4);
            C0HJ9.LIZ(tuxTextView);
            C0HJ9.LIZJ(tuxTextView);
            C0HJ9.LIZ(tuxTextView2);
            C0HJ9.LIZJ(tuxTextView2);
            C0HJ9.LIZ(tuxTextView3);
            C0HJ9.LIZJ(tuxTextView3);
            C0HJ9.LIZ(tuxTextView4);
            C0HJ9.LIZJ(tuxTextView4);
            C0HJ9.LIZIZ(c197039127h);
            if (C0CHX.LIZ(this.LIZ)) {
                tuxTextView.setTuxFont(51);
                tuxTextView2.setTuxFont(51);
                tuxTextView3.setTuxFont(51);
                tuxTextView4.setTuxFont(51);
                c197039127h.setTuxFont(51);
                C995240c0Q.LIZJ(tuxTextView);
                C995240c0Q.LIZJ(tuxTextView2);
                C995240c0Q.LIZJ(tuxTextView3);
                C01GW c01gw = C0AKY.LIZ;
                if (((Number) c01gw.getValue()).intValue() == 1) {
                    LJJII(c197039127h);
                }
                if (z3) {
                    C995240c0Q.LIZJ(c197039127h);
                    C995240c0Q.LIZJ(tuxTextView4);
                } else {
                    Keva keva = C214861196t.LIZ;
                    if (keva.getBoolean("has_shown_button_text_ai_rewrite", false)) {
                        C995240c0Q.LIZJ(c197039127h);
                    } else {
                        C995240c0Q.LIZJ(tuxTextView4);
                        keva.storeBoolean("has_shown_button_text_ai_rewrite", true);
                        if (((Number) c01gw.getValue()).intValue() == 2) {
                            LJJII(c197039127h);
                        }
                    }
                }
                C337180DJs.LIZJ(c197039127h);
                c197039127h.setMaxWidth(C12ES.LJIIJ(viewGroup.getContext()) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i))));
            }
            C426750GoL.LJIIIZ(tuxTextView, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, false, 27);
            C426750GoL.LJIIIZ(tuxTextView2, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, false, 27);
            int iLJIIJ = (C12ES.LJIIJ(viewGroup.getContext()) - ((int) C12ES.LIZJ(88.0f, viewGroup.getContext()))) / 3;
            tuxTextView3.setMaxWidth(iLJIIJ);
            tuxTextView.setMaxWidth(iLJIIJ);
            tuxTextView2.setMaxWidth(iLJIIJ);
            C197039127h c197039127h2 = (C197039127h) viewGroup.findViewById(R.id.voice_input_icon);
            if (z && c197039127h2 != null && C1702620uPM.LIZ.isAvailable()) {
                C0HJ9.LIZIZ(c197039127h2);
                if (C0CHX.LIZ(this.LIZ)) {
                    c197039127h2.setTuxFont(51);
                }
                if (C21139417o0.LIZ().getBoolean("has_shown_voice_entry_text", false)) {
                    C995240c0Q.LIZJ(c197039127h2);
                    z2 = true;
                } else {
                    z2 = true;
                    C21139417o0.LIZ().storeBoolean("has_shown_voice_entry_text", true);
                }
                C337180DJs.LIZJ(c197039127h2);
                c197039127h2.setEnabled(z2);
                this.LJJJJIZL = z2;
            }
        }
    }

    public final void LJJIIZ() {
        List<SingleImageData> imageList;
        List<SingleImageData> imageList2;
        SingleImageData singleImageData;
        String synthesisPathAsPossible;
        EffectTextModel effectTextModel;
        PhotoModeImageUrlModel photoModeImageUrlModel;
        EditPostModel editPostModel = this.LIZ.creativeModel.editPostModel;
        List<PhotoModeImageUrlModel> imageList3 = editPostModel != null ? editPostModel.getImageList() : null;
        ImageAlbumData imageAlbumData = this.LIZ.getImageAlbumData();
        if (imageAlbumData == null || (imageList = imageAlbumData.getImageList()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(imageList, 10));
        int i = 0;
        for (SingleImageData singleImageData2 : imageList) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            SingleImageData singleImageData3 = singleImageData2;
            String strLJFF = LJFF(singleImageData3);
            if (strLJFF.length() <= 0) {
                strLJFF = singleImageData3.getSynthesisPathAsPossible();
            }
            arrayList.add(new C196X(strLJFF, singleImageData3.getEditImageInfo().getBitmapWidth(), singleImageData3.getEditImageInfo().getBitmapHeight(), (imageList3 == null || (photoModeImageUrlModel = (PhotoModeImageUrlModel) C13LP.LJJJLZIJ(i, imageList3)) == null) ? null : photoModeImageUrlModel.thumbnail, 0, 0.0f, LJIIIIZZ(singleImageData3), LIZLLL(singleImageData3), LJ(singleImageData3), 112));
            i = i2;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        C196S c196s = this.LJIIL;
        if (c196s != null) {
            c196s.LJ(arrayList2, LJIIJ(), LIZJ());
        }
        CoverPublishModel coverPublishModel = this.LIZ.getCoverPublishModel();
        final int imageCurrentIndex = coverPublishModel != null ? coverPublishModel.getImageCurrentIndex() : 0;
        ImageAlbumData imageAlbumData2 = this.LIZ.getImageAlbumData();
        if (imageAlbumData2 == null || (imageList2 = imageAlbumData2.getImageList()) == null || (singleImageData = (SingleImageData) C13LP.LJJJLZIJ(imageCurrentIndex, imageList2)) == null || (synthesisPathAsPossible = singleImageData.getSynthesisPathAsPossible()) == null) {
            return;
        }
        final String strLJJJJLL = C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJJJLL(this.LIZ.getCreativeInfo());
        CoverPublishModel coverPublishModel2 = this.LIZ.getCoverPublishModel();
        if (coverPublishModel2 == null || (effectTextModel = coverPublishModel2.getEffectTextModel()) == null || !effectTextModel.getHasCoverText()) {
            C15O7.LIZJ(new ACallableS23S2100000_22(this, synthesisPathAsPossible, strLJJJJLL, 0)).LIZLLL(new C914100ZtY(this, strLJJJJLL, 0));
        } else {
            C15O7.LIZJ(new ACallableS58S1100000_3(this, synthesisPathAsPossible, 1)).LJ(new C914100ZtY(this, strLJJJJLL, 1), C15O7.LJI, null).LJ(new InterfaceC2385309Wh() { // from class: X.0Xml
                /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
                @Override // X.InterfaceC2385309Wh
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object then(X.C15O7 r18) {
                    /*
                        r17 = this;
                        java.lang.String r5 = "ImageHeaderModule@1844.updateCoverAfterBackFromAlbum$5"
                        X.C1C7U.LIZ(r5)
                        r4 = r17
                        X.196g r0 = r4.LIZ
                        X.196S r0 = r0.LJIIL
                        if (r0 == 0) goto L8a
                        float r12 = r0.getThumbnailImageSizeMultiple()
                    L11:
                        X.196g r0 = r4.LIZ
                        com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r0.LIZ
                        com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData r0 = r0.getImageAlbumData()
                        if (r0 == 0) goto L88
                        java.util.List r1 = r0.getImageList()
                        if (r1 == 0) goto L88
                        int r0 = r2
                        java.lang.Object r3 = X.C13LP.LJJJLZIJ(r0, r1)
                        com.ss.android.ugc.aweme.creative.model.edit.SingleImageData r3 = (com.ss.android.ugc.aweme.creative.model.edit.SingleImageData) r3
                    L29:
                        X.196g r0 = r4.LIZ
                        X.196S r2 = r0.LJIIL
                        if (r2 == 0) goto L74
                        int r1 = r2
                        X.196X r6 = new X.196X
                        java.lang.String r7 = r3
                        java.lang.Object r0 = r18.LJIIL()
                        android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
                        int r8 = r0.getWidth()
                        java.lang.Object r0 = r18.LJIIL()
                        android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
                        int r9 = r0.getHeight()
                        r10 = 0
                        r11 = 0
                        if (r3 == 0) goto L86
                        X.196g r0 = r4.LIZ
                        r0.getClass()
                        boolean r13 = X.C214848196g.LJIIIIZZ(r3)
                    L56:
                        if (r3 == 0) goto L83
                        X.196g r0 = r4.LIZ
                        r0.getClass()
                        com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode r14 = X.C214848196g.LIZLLL(r3)
                        if (r14 == 0) goto L83
                    L63:
                        X.196g r0 = r4.LIZ
                        r0.getClass()
                        boolean r15 = X.C214848196g.LJ(r3)
                        r16 = 56
                        r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                        r2.LJI(r1, r6)
                    L74:
                        java.lang.Object r0 = r18.LJIIL()
                        android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
                        X.C2475309mx.LJ(r0)
                        kotlin.Unit r0 = kotlin.Unit.LIZ
                        X.C1C7U.LIZIZ(r5)
                        return r0
                    L83:
                        com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode r14 = com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode.STATIC
                        goto L63
                    L86:
                        r13 = 0
                        goto L56
                    L88:
                        r3 = 0
                        goto L29
                    L8a:
                        r12 = 1065353216(0x3f800000, float:1.0)
                        goto L11
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C858930Xml.then(X.15O7):java.lang.Object");
                }
            }, C15O7.LJIIIIZZ, null);
        }
    }

    public final void LJJIIJ() {
        ImageAlbumData imageAlbumData;
        List<SingleImageData> imageList;
        SingleImageData singleImageData;
        if (!C493401w4.LIZ() || (imageAlbumData = this.LIZ.getImageAlbumData()) == null || (imageList = imageAlbumData.getImageList()) == null || (singleImageData = (SingleImageData) C13LP.LJJJLL(imageList)) == null) {
            return;
        }
        String strLJFF = LJFF(singleImageData);
        if (!C2286708xd.LIZJ(strLJFF) || strLJFF == null) {
            return;
        }
        C0MH8.LIZIZ(C0MH8.LIZ, this.LIZ, strLJFF, null, AFwS231S0000000_3.get$arr$(131), 12);
    }

    public static LivePhotoPreviewMode LIZLLL(SingleImageData singleImageData) {
        LivePhotoPreviewMode livePhotoPreviewMode;
        SrcLiveVideoInfo srcLiveInfo = singleImageData.getSrcLiveInfo();
        if (srcLiveInfo == null || (livePhotoPreviewMode = srcLiveInfo.getLivePhotoPreviewMode()) == null) {
            return LivePhotoPreviewMode.STATIC;
        }
        return livePhotoPreviewMode;
    }

    public static boolean LJ(SingleImageData singleImageData) {
        SubOnlyPhotoPreviewInfo subOnlyPhotoPreviewInfo;
        if (singleImageData != null && (subOnlyPhotoPreviewInfo = singleImageData.getSubOnlyPhotoPreviewInfo()) != null && subOnlyPhotoPreviewInfo.isPreview()) {
            return true;
        }
        return false;
    }

    public static boolean LJIIIIZZ(SingleImageData singleImageData) {
        LivePhotoPreviewMode livePhotoPreviewMode = null;
        if (C295810Bid.LIZ()) {
            List listLJIIJJI = C1697810uHb.LJIIJJI(LivePhotoPreviewMode.LIVE_PHOTO, LivePhotoPreviewMode.LOOP);
            SrcLiveVideoInfo srcLiveInfo = singleImageData.getSrcLiveInfo();
            if (srcLiveInfo != null) {
                livePhotoPreviewMode = srcLiveInfo.getLivePhotoPreviewMode();
            }
            return C13LP.LJJJJ(livePhotoPreviewMode, listLJIIJJI);
        }
        SrcLiveVideoInfo srcLiveInfo2 = singleImageData.getSrcLiveInfo();
        if (srcLiveInfo2 != null) {
            livePhotoPreviewMode = srcLiveInfo2.getLivePhotoPreviewMode();
        }
        if (livePhotoPreviewMode == LivePhotoPreviewMode.LIVE_PHOTO) {
            return true;
        }
        return false;
    }

    public static boolean LJJIFFI(AICoverInfo aICoverInfo) {
        AICoverItem next;
        if (aICoverInfo.getCovers().isEmpty()) {
            return false;
        }
        if (!aICoverInfo.getSkipReorderOnTerminal()) {
            return aICoverInfo.isAllFailed();
        }
        String selectedCoverId = aICoverInfo.getSelectedCoverId();
        if (selectedCoverId == null) {
            return aICoverInfo.isAllFailed();
        }
        Iterator<AICoverItem> it2 = aICoverInfo.getCovers().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.getSubTaskId(), selectedCoverId)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        AICoverItem aICoverItem = next;
        if (aICoverItem == null) {
            return aICoverInfo.isAllFailed();
        }
        if (!aICoverItem.isFinished() || aICoverItem.isReady()) {
            return false;
        }
        return true;
    }

    public static void LJJII(C197039127h c197039127h) {
        c197039127h.setIconTintColorRes(R.attr.a1t);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(6));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a0b);
        c197039127h.setBackground(c384050F3z.LIZ(c197039127h.getContext()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        return "";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJFF(com.ss.android.ugc.aweme.creative.model.edit.SingleImageData r6) {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r5.LIZ
            boolean r0 = X.C568750MSj.LIZIZ(r0)
            r1 = 0
            if (r0 == 0) goto L44
            r4 = 3
            java.lang.String[] r3 = new java.lang.String[r4]
            com.ss.android.ugc.aweme.creative.model.edit.ImageSynthesisResult r0 = r6.getSynthesisData()
            if (r0 == 0) goto L16
            java.lang.String r1 = r0.getPath()
        L16:
            r0 = 0
            r3[r0] = r1
            com.ss.android.ugc.aweme.creative.model.edit.EditImageInfo r0 = r6.getEditImageInfo()
            java.lang.String r1 = r0.getTempSynthesisPath()
            r0 = 1
            r3[r0] = r1
            com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo r0 = r6.getSrcImageInfo()
            java.lang.String r1 = r0.getPath()
            r0 = 2
            r3[r0] = r1
            r2 = 0
        L30:
            r1 = r3[r2]
            if (r1 == 0) goto L3f
            boolean r0 = kotlin.text.a0.LJJJIL(r1)
            if (r0 != 0) goto L3f
            if (r1 != 0) goto L3e
        L3c:
            java.lang.String r1 = ""
        L3e:
            return r1
        L3f:
            int r2 = r2 + 1
            if (r2 >= r4) goto L3c
            goto L30
        L44:
            boolean r0 = X.C297300Bl2.LIZ()
            if (r0 == 0) goto L69
            com.ss.android.ugc.aweme.creative.model.edit.EditImageInfo r0 = r6.getEditImageInfo()
            java.lang.String r1 = r0.getTempSynthesisPath()
            if (r1 != 0) goto L3e
            com.ss.android.ugc.aweme.creative.model.edit.ImageSynthesisResult r0 = r6.getSynthesisData()
            if (r0 == 0) goto L60
            java.lang.String r1 = r0.getPath()
            if (r1 != 0) goto L3e
        L60:
            com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo r0 = r6.getSrcImageInfo()
            java.lang.String r1 = r0.getPath()
            return r1
        L69:
            com.ss.android.ugc.aweme.creative.model.edit.ImageSynthesisResult r0 = r6.getSynthesisData()
            if (r0 == 0) goto L75
            java.lang.String r1 = r0.getPath()
            if (r1 != 0) goto L3e
        L75:
            com.ss.android.ugc.aweme.creative.model.edit.EditImageInfo r0 = r6.getEditImageInfo()
            java.lang.String r1 = r0.getTempSynthesisPath()
            if (r1 != 0) goto L3e
            com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo r0 = r6.getSrcImageInfo()
            java.lang.String r1 = r0.getPath()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C214848196g.LJFF(com.ss.android.ugc.aweme.creative.model.edit.SingleImageData):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x04f1  */
    /* JADX WARN: Type inference failed for: r5v117, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v97, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v98, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.196S] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(android.view.View r26) {
        /*
            Method dump skipped, instruction units count: 1277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C214848196g.LJII(android.view.View):void");
    }

    public final void LJIIJJI(int i) {
        ExpandTextViewModel expandTextViewModel = this.LJJIIZ;
        if (expandTextViewModel != null) {
            expandTextViewModel.LLJILLL.setValue(Integer.valueOf(i));
        }
    }

    public final void LJIJJ(AICoverInfo aICoverInfo) {
        boolean z;
        List<SingleImageData> imageList;
        C1446760nkg.LIZ.getClass();
        if (!C1446760nkg.LIZJ() || aICoverInfo == null) {
            return;
        }
        ImageAlbumData imageAlbumData = this.LIZ.getImageAlbumData();
        if (imageAlbumData != null) {
            imageAlbumData.setAiCoverInfo(aICoverInfo);
        }
        ImageAlbumData imageAlbumData2 = this.LIZ.getImageAlbumData();
        if (imageAlbumData2 != null && (imageList = imageAlbumData2.getImageList()) != null && !imageList.isEmpty()) {
            Iterator<SingleImageData> it2 = imageList.iterator();
            while (it2.hasNext()) {
                if (it2.next().isAICover()) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        AICoverInfo aICoverInfo2 = null;
        if (!aICoverInfo.isConfirmed()) {
            aICoverInfo = null;
        }
        C196S c196s = this.LJIIL;
        if (c196s != null) {
            if (!z) {
                aICoverInfo2 = aICoverInfo;
            }
            c196s.LJFF(aICoverInfo2);
        }
        if (!z && aICoverInfo != null) {
            if (!LJJIFFI(aICoverInfo)) {
                this.LJJIJLIJ = false;
            }
            if (!this.LJJIJLIJ && LJJIFFI(aICoverInfo)) {
                this.LJJIJLIJ = true;
                C1389890mGx c1389890mGx = new C1389890mGx(this.LJIIIIZZ);
                c1389890mGx.LJIIIZ(2131821394);
                c1389890mGx.LJIIJJI();
            }
        }
    }

    public final void LJJ(boolean z) {
        Function1<? super Boolean, Unit> function1 = this.LJJJJL;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z));
        }
        ExpandedTitleModule expandedTitleModule = this.LJIILIIL;
        if (expandedTitleModule != null) {
            expandedTitleModule.LLLLZLLLI = z;
        }
    }

    public final void LJJI(int i) {
        if (C444960Hcc.LIZJ(this.LJIIIIZZ)) {
            SpannableString spannableString = new SpannableString(C0CHQ.LIZ.getResources().getString(2131839797, Integer.valueOf(this.LJJIIZI), Integer.valueOf(i)));
            if (i > this.LJJIIZI) {
                C786410Ut5.p2(spannableString, new ForegroundColorSpan(C960203pA.LIZ(R.attr.zs, this.LJIIIIZZ)), a0.LJJJ(spannableString, "/", 0, false, 6) + 1, spannableString.length(), 18);
            }
            TextView textView = this.LJIIZILJ;
            if (textView != null) {
                textView.setText(spannableString);
                return;
            }
            return;
        }
        SpannableString spannableString2 = new SpannableString(C0CHQ.LIZ.getResources().getString(2131839797, Integer.valueOf(i), Integer.valueOf(this.LJJIIZI)));
        if (i > this.LJJIIZI) {
            C786410Ut5.p2(spannableString2, new ForegroundColorSpan(C960203pA.LIZ(R.attr.zs, this.LJIIIIZZ)), 0, a0.LJJJ(spannableString2, "/", 0, false, 6), 18);
        }
        TextView textView2 = this.LJIIZILJ;
        if (textView2 == null) {
            return;
        }
        textView2.setText(spannableString2);
    }

    public final void LJJIII(ViewGroup viewGroup) {
        C197039127h c197039127h;
        boolean z;
        boolean zLJIIIIZZ;
        if (this.LJJJJLI || viewGroup == null || C1428470nHB.LJJZZI(this.LIZ)) {
            return;
        }
        VideoPublishEditModel videoPublishEditModel = this.LIZ;
        if (!C0CHQ.LIZ().getAccountService().isLogin() || videoPublishEditModel.creativeModel.editPostModel != null || C1428470nHB.LJJZZI(videoPublishEditModel) || ((Number) C278910AwT.LIZ.getValue()).intValue() != 2 || !C1852010yIJ.LIZ() || (c197039127h = (C197039127h) viewGroup.findViewById(R.id.voice_input_icon)) == null) {
            return;
        }
        C0ZI0 c0zi0 = (C0ZI0) viewGroup.findViewById(R.id.guf);
        if (c0zi0 == null && (c0zi0 = (C0ZI0) this.LIZJ.findViewById(R.id.guf)) == null) {
            return;
        }
        C1702620uPM c1702620uPM = C1702620uPM.LIZ;
        if (!c1702620uPM.isAvailable()) {
            if (C1702620uPM.LIZJ == null && !C1702620uPM.LIZLLL) {
                C20191713zX c20191713zX = C20191713zX.LIZ;
                c20191713zX.getClass();
                if (!C20191713zX.LIZ()) {
                    c20191713zX.LIZJ();
                    return;
                }
                return;
            }
            return;
        }
        if (C21139417o0.LIZ().getBoolean("has_shown_voice_entry_text", false)) {
            c197039127h.LJJLI(false);
            c197039127h.setBackgroundResource(R.drawable.aqn);
            c197039127h.setBackgroundRadius(8);
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
            ViewGroup.LayoutParams layoutParams = c197039127h.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = iLIZIZ;
                layoutParams.height = iLIZIZ;
            } else {
                layoutParams = new ViewGroup.LayoutParams(iLIZIZ, iLIZIZ);
            }
            C786410Ut5.J6(c197039127h, layoutParams);
            c197039127h.setMinimumWidth(iLIZIZ);
            c197039127h.setMinimumHeight(iLIZIZ);
            C995240c0Q.LIZJ(c197039127h);
        } else {
            IAVPublishPageUIRefactorService iAVPublishPageUIRefactorService = (IAVPublishPageUIRefactorService) PluggableExtentionKt.pluggableSpi$default(IAVPublishPageUIRefactorService.class, false, false, false, 14, null);
            if (iAVPublishPageUIRefactorService != null && iAVPublishPageUIRefactorService.enableLargeMentionAndHashTagBtn()) {
                z = true;
            } else {
                z = false;
            }
            c197039127h.LJJLI(false);
            if (z) {
                c197039127h.setBackgroundResource(R.drawable.aqn);
                c197039127h.setBackgroundRadius(8);
                c197039127h.setTuxFont(52);
                ViewGroup.LayoutParams layoutParams2 = c197039127h.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
                } else {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
                }
                C786410Ut5.J6(c197039127h, layoutParams2);
            } else {
                c197039127h.setBackgroundResource(R.drawable.ar5);
                c197039127h.setBackgroundRadius(4);
                c197039127h.setTuxFont(62);
            }
            C21139417o0.LIZ().storeBoolean("has_shown_voice_entry_text", true);
        }
        C337180DJs.LIZJ(c197039127h);
        c197039127h.setEnabled(true);
        if (this.LJJJ == null) {
            SoftKeyBoardListener softKeyBoardListenerLIZ = C0FWN.LIZ(this.LJIIIIZZ);
            softKeyBoardListenerLIZ.LIZIZ(new InterfaceC1391500mJY() { // from class: X.18aC
                @Override // X.InterfaceC1391500mJY
                public final void LLLL(int i) {
                }

                @Override // X.InterfaceC1391500mJY
                public final void LJJIIJ(int i) {
                    this.LL.LJJIL = true;
                }

                @Override // X.InterfaceC1391500mJY
                public final void LJZI(int i) {
                    this.LL.LJJIL = false;
                }
            });
            this.LJJJ = softKeyBoardListenerLIZ;
            C20246014Ju c20246014JuLIZ = C14K4.LIZ(this.LIZJ);
            if (c20246014JuLIZ != null) {
                zLJIIIIZZ = c20246014JuLIZ.LJIIIIZZ(8);
            } else {
                zLJIIIIZZ = this.LJJIL;
            }
            this.LJJIL = zLJIIIIZZ;
        }
        final C1162810gMh c1162810gMh = new C1162810gMh(new AwS576S0100000_32(viewGroup, 329));
        this.LJJJJLL = c1162810gMh;
        Scene scene = this.LIZIZ;
        VideoPublishEditModel videoPublishEditModel2 = this.LIZ;
        View view = this.LIZJ;
        final AwS576S0100000_32 awS576S0100000_32 = new AwS576S0100000_32(c0zi0, 333);
        final AwS576S0100000_32 awS576S0100000_322 = new AwS576S0100000_32(viewGroup, 325);
        final AwS558S0100000_14 awS558S0100000_14 = new AwS558S0100000_14(this, 1108);
        final AwS611S0100000_32 awS611S0100000_32 = new AwS611S0100000_32(this, 167);
        final AwS576S0100000_32 awS576S0100000_323 = new AwS576S0100000_32(this, 326);
        final AwS433S0200000_32 awS433S0200000_32 = new AwS433S0200000_32(this, c197039127h, 23);
        IVoiceInputController iVoiceInputControllerLIZ = c1702620uPM.LIZ(scene, videoPublishEditModel2, viewGroup, view, c0zi0, new InterfaceC1710480uc2(awS576S0100000_32, awS576S0100000_322, c1162810gMh, awS558S0100000_14, awS611S0100000_32, awS576S0100000_323, awS433S0200000_32) { // from class: X.18ZV
            public final Function0<EditText> LIZ;
            public final Function0<ViewGroup> LIZIZ;
            public final C1162810gMh LIZJ;
            public final Function0<List<View>> LIZLLL;
            public final Function1<Boolean, Unit> LJ;
            public final Function0<Boolean> LJFF;
            public final Function0<Unit> LJI;
            public Integer LJII;
            public final Map<View, Float> LJIIIIZZ = new LinkedHashMap();
            public boolean LJIIIZ;
            public int LJIIJ;
            public int LJIIJJI;

            @Override // X.InterfaceC1710480uc2
            public final EditText LIZLLL() {
                return null;
            }

            @Override // X.InterfaceC1710480uc2
            public final void LJ(boolean z2) {
            }

            @Override // X.InterfaceC1710480uc2
            public final void LJFF() {
            }

            @Override // X.InterfaceC1710480uc2
            public final void LIZ() {
                C0ZI0 c0zi02;
                EditText editTextInvoke = this.LIZ.invoke();
                if (!(editTextInvoke instanceof C0ZI0) || (c0zi02 = (C0ZI0) editTextInvoke) == null) {
                    return;
                }
                c0zi02.LJJIFFI();
                c0zi02.setDescLimitToastSuppressed(true);
            }

            @Override // X.InterfaceC1710480uc2
            public final void LIZIZ() {
                C0ZI0 c0zi02;
                EditText editTextInvoke = this.LIZ.invoke();
                if (!(editTextInvoke instanceof C0ZI0) || (c0zi02 = (C0ZI0) editTextInvoke) == null) {
                    return;
                }
                c0zi02.LJIIJJI();
                c0zi02.setDescLimitToastSuppressed(false);
            }

            @Override // X.InterfaceC1710480uc2
            public final void LIZJ() {
                C0ZI0 c0zi02;
                ViewGroup.LayoutParams layoutParams3;
                RelativeLayout.LayoutParams layoutParams4;
                if (this.LJIIIZ) {
                    this.LJIIIZ = false;
                    EditText editTextInvoke = this.LIZ.invoke();
                    if (editTextInvoke != null) {
                        ViewGroup.LayoutParams layoutParams5 = editTextInvoke.getLayoutParams();
                        if ((layoutParams5 instanceof RelativeLayout.LayoutParams) && (layoutParams4 = (RelativeLayout.LayoutParams) layoutParams5) != null) {
                            layoutParams4.removeRule(6);
                            layoutParams4.removeRule(8);
                            layoutParams4.addRule(2, R.id.m86);
                            layoutParams4.topMargin = this.LJIIJ;
                            layoutParams4.bottomMargin = this.LJIIJJI;
                            C786410Ut5.Z5(editTextInvoke, layoutParams4);
                        }
                    }
                }
                Integer num = this.LJII;
                if (num != null) {
                    int iIntValue = num.intValue();
                    this.LJII = null;
                    ViewGroup viewGroupInvoke = this.LIZIZ.invoke();
                    if (viewGroupInvoke != null && (layoutParams3 = viewGroupInvoke.getLayoutParams()) != null) {
                        layoutParams3.height = iIntValue;
                        C786410Ut5.X5(layoutParams3, viewGroupInvoke);
                    }
                }
                for (Map.Entry entry : ((LinkedHashMap) this.LJIIIIZZ).entrySet()) {
                    C786410Ut5.T4((View) entry.getKey(), ((Number) entry.getValue()).floatValue());
                }
                ((LinkedHashMap) this.LJIIIIZZ).clear();
                C1162810gMh c1162810gMh2 = this.LIZJ;
                c1162810gMh2.LJ = false;
                c1162810gMh2.LIZIZ();
                EditText editTextInvoke2 = this.LIZ.invoke();
                if (!(editTextInvoke2 instanceof C0ZI0) || (c0zi02 = (C0ZI0) editTextInvoke2) == null) {
                    return;
                }
                c0zi02.LJJJJJL();
            }

            @Override // X.InterfaceC1710480uc2
            public final void LJI() {
                EditText editTextInvoke;
                InputMethodManager inputMethodManager;
                if (this.LJFF.invoke().booleanValue() && (editTextInvoke = this.LIZ.invoke()) != null) {
                    if (!editTextInvoke.isFocused()) {
                        editTextInvoke.requestFocus();
                    }
                    Object objH2 = C786410Ut5.H2(editTextInvoke.getContext(), "input_method");
                    if (!(objH2 instanceof InputMethodManager) || (inputMethodManager = (InputMethodManager) objH2) == null) {
                        return;
                    }
                    inputMethodManager.showSoftInput(editTextInvoke, 1);
                }
            }

            @Override // X.InterfaceC1710480uc2
            public final void LJIIIIZZ() {
                EditText editTextInvoke;
                ViewGroup viewGroupInvoke;
                View viewFindViewById;
                RelativeLayout.LayoutParams layoutParams3;
                ViewGroup viewGroupInvoke2;
                ViewGroup.LayoutParams layoutParams4;
                int i;
                C0ZI0 c0zi02;
                this.LJI.invoke();
                EditText editTextInvoke2 = this.LIZ.invoke();
                if ((editTextInvoke2 instanceof C0ZI0) && (c0zi02 = (C0ZI0) editTextInvoke2) != null) {
                    c0zi02.LJJJJLL();
                }
                if (this.LJII == null && (viewGroupInvoke2 = this.LIZIZ.invoke()) != null && (layoutParams4 = viewGroupInvoke2.getLayoutParams()) != null && (i = layoutParams4.height) > 0) {
                    this.LJII = Integer.valueOf(i);
                    layoutParams4.height += C814420VxA.LIZIZ(C418440Gaw.LIZIZ(51));
                    C786410Ut5.X5(layoutParams4, viewGroupInvoke2);
                }
                if (!this.LJIIIZ && (editTextInvoke = this.LIZ.invoke()) != null && (viewGroupInvoke = this.LIZIZ.invoke()) != null && (viewFindViewById = viewGroupInvoke.findViewById(R.id.kbf)) != null && viewFindViewById.getVisibility() != 8) {
                    ViewGroup.LayoutParams layoutParams5 = editTextInvoke.getLayoutParams();
                    if ((layoutParams5 instanceof RelativeLayout.LayoutParams) && (layoutParams3 = (RelativeLayout.LayoutParams) layoutParams5) != null) {
                        this.LJIIJ = layoutParams3.topMargin;
                        this.LJIIJJI = layoutParams3.bottomMargin;
                        layoutParams3.removeRule(2);
                        layoutParams3.addRule(6, R.id.kbf);
                        layoutParams3.addRule(8, R.id.kbf);
                        layoutParams3.topMargin = 0;
                        layoutParams3.bottomMargin = 0;
                        C786410Ut5.Z5(editTextInvoke, layoutParams3);
                        this.LJIIIZ = true;
                    }
                }
                ((LinkedHashMap) this.LJIIIIZZ).clear();
                for (View view2 : this.LIZLLL.invoke()) {
                    this.LJIIIIZZ.put(view2, Float.valueOf(view2.getAlpha()));
                    C786410Ut5.T4(view2, 0.34f);
                }
                C1162810gMh c1162810gMh2 = this.LIZJ;
                c1162810gMh2.LJ = true;
                c1162810gMh2.LIZIZ();
            }

            @Override // X.InterfaceC1710480uc2
            public final void LJII(boolean z2) {
                C0ZI0 c0zi02;
                this.LJ.invoke(Boolean.valueOf(z2));
                EditText editTextInvoke = this.LIZ.invoke();
                if ((editTextInvoke instanceof C0ZI0) && (c0zi02 = (C0ZI0) editTextInvoke) != null) {
                    c0zi02.setDescLimitToastSuppressed(z2);
                }
            }

            {
                this.LIZ = awS576S0100000_32;
                this.LIZIZ = awS576S0100000_322;
                this.LIZJ = c1162810gMh;
                this.LIZLLL = awS558S0100000_14;
                this.LJ = awS611S0100000_32;
                this.LJFF = awS576S0100000_323;
                this.LJI = awS433S0200000_32;
            }
        }, new C1989407qm(EnumC1989307ql.VIDEO, AFwS201S0000000_14.get$arr$(302), AFwS201S0000000_14.get$arr$(303), AFwS223S0000000_32.get$arr$(105), new AwS558S0100000_14(c0zi0, 1110), new AwS576S0100000_32(this, 330), new AwS576S0100000_32(this, 331), new AwS576S0100000_32(c0zi0, 332), new AwS593S0100000_14(c0zi0, 148)), null, new AnonymousClass1975(new AwS576S0100000_32(viewGroup, 327), new AwS576S0100000_32(c0zi0, 328), c1162810gMh, new AwS611S0100000_32(this, 169)));
        if (iVoiceInputControllerLIZ == null) {
            return;
        }
        this.LJJJJJL = iVoiceInputControllerLIZ;
        c197039127h.setOnTouchListener(new ATListenerS464S0100000_32(this, 2));
        C786410Ut5.U8(c197039127h, new ACListenerS166S0100000_32(iVoiceInputControllerLIZ, 34));
        this.LJJJJLI = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(boolean r5, boolean r6) {
        /*
            r4 = this;
            com.bytedance.scene.Scene r0 = r4.LIZIZ
            android.content.Context r1 = r0.getSceneContext()
            if (r1 == 0) goto L65
            if (r5 == 0) goto L61
            r0 = 2131100559(0x7f06038f, float:1.7813503E38)
        Ld:
            java.lang.Integer r0 = X.C1308910kAL.LIZJ(r0, r1)
            if (r0 == 0) goto L65
            int r1 = r0.intValue()
        L17:
            android.widget.LinearLayout r0 = r4.LJIJJLI
            if (r0 == 0) goto L1e
            r0.setBackgroundColor(r1)
        L1e:
            if (r5 == 0) goto L5d
            r1 = 2131100592(0x7f0603b0, float:1.781357E38)
        L23:
            com.bytedance.tux.input.TuxTextView r0 = r4.LJJ
            if (r0 == 0) goto L2a
            r0.setTextColorRes(r1)
        L2a:
            com.bytedance.scene.Scene r0 = r4.LIZIZ
            android.content.Context r0 = r0.getSceneContext()
            if (r0 == 0) goto L5a
            java.lang.Integer r0 = X.C1308910kAL.LIZJ(r1, r0)
            if (r0 == 0) goto L5a
            int r1 = r0.intValue()
            X.0jph r0 = new X.0jph
            r0.<init>(r1)
            X.0joY r3 = new X.0joY
            r3.<init>(r0)
            X.0jpS r2 = r4.LJIL
            if (r2 == 0) goto L5a
            X.0jo3 r1 = new X.0jo3
            java.lang.String r0 = "**"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r1.<init>(r0)
            android.graphics.ColorFilter r0 = X.InterfaceC1295080jo2.LJJIJL
            r2.addValueCallback(r1, r0, r3)
        L5a:
            if (r6 == 0) goto L67
            return
        L5d:
            r1 = 2131100626(0x7f0603d2, float:1.7813639E38)
            goto L23
        L61:
            r0 = 2131100570(0x7f06039a, float:1.7813525E38)
            goto Ld
        L65:
            r1 = 0
            goto L17
        L67:
            r2 = 0
            if (r5 == 0) goto L7c
            X.0jpS r1 = r4.LJIL
            if (r1 == 0) goto L74
            r0 = 1055157831(0x3ee46e47, float:0.44615385)
            r1.setMinAndMaxProgress(r2, r0)
        L74:
            X.0jpS r0 = r4.LJIL
            if (r0 == 0) goto L7b
            r0.playAnimation()
        L7b:
            return
        L7c:
            X.0jpS r0 = r4.LJIL
            if (r0 == 0) goto L7b
            r0.setMinAndMaxProgress(r2, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C214848196g.LIZIZ(boolean, boolean):void");
    }

    public final void LJIILL(int i, int i2) {
        this.LJJIJ = i2;
        ExpandedTitleModule expandedTitleModule = this.LJIILIIL;
        if (expandedTitleModule != null) {
            expandedTitleModule.LJJIJLIJ(i, i2);
        }
        ExpandTextViewModel expandTextViewModel = this.LJJIIZ;
        if (expandTextViewModel != null) {
            expandTextViewModel.LLJILJIL.setValue(Boolean.TRUE);
        }
    }

    public static void LJIIIZ(C214848196g c214848196g, String str, Function1 function1, int i) {
        boolean z;
        String str2;
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 4) != 0) {
            function1 = AFwS278S0000000_32.get$arr$(140);
        }
        if (c214848196g.LIZIZ instanceof C1445410niV) {
            str2 = "edit_post_page";
        } else {
            str2 = "video_post_page";
        }
        C0L5F.LIZIZ(c214848196g.LIZ, str, z, str2, new AwS98S1200000_14(function1, (Function1<? super C0LAB, ? extends C0LAB>) c214848196g, (C214848196g) str2, (String) 9));
    }

    public final void LJIILJJIL(VideoPublishEditModel videoPublishEditModel, Bitmap bitmap, boolean z, boolean z2) {
        int imageCurrentIndex;
        EffectTextModel effectTextModel;
        CoverPublishModel coverPublishModel;
        EffectTextModel effectTextModel2;
        List<SingleImageData> imageList;
        if (bitmap == null || this.LJIIL == null) {
            return;
        }
        CoverPublishModel coverPublishModel2 = videoPublishEditModel.getCoverPublishModel();
        boolean hasCoverText = false;
        if (coverPublishModel2 != null) {
            imageCurrentIndex = coverPublishModel2.getImageCurrentIndex();
        } else {
            imageCurrentIndex = 0;
        }
        if (z2 && imageCurrentIndex != 0) {
            C196S c196s = this.LJIIL;
            if (c196s != null) {
                c196s.LIZIZ(imageCurrentIndex);
            }
            ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
            if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
                ArrayList arrayList = new ArrayList(imageList);
                ListProtector.add(arrayList, 0, ListProtector.remove(arrayList, imageCurrentIndex));
                ImageAlbumData imageAlbumData2 = videoPublishEditModel.getImageAlbumData();
                if (imageAlbumData2 != null) {
                    imageAlbumData2.setImageList(arrayList);
                }
                CoverPublishModel coverPublishModel3 = videoPublishEditModel.getCoverPublishModel();
                if (coverPublishModel3 != null) {
                    coverPublishModel3.setImageCurrentIndex(0);
                }
            } else {
                return;
            }
        }
        this.LIZ = videoPublishEditModel;
        ExpandTextViewModel expandTextViewModel = this.LJJIIZ;
        if (expandTextViewModel != null) {
            expandTextViewModel.LL.onNext(videoPublishEditModel);
        }
        boolean z3 = true;
        if (!this.LJJIIJ && ((coverPublishModel = this.LIZ.getCoverPublishModel()) == null || (effectTextModel2 = coverPublishModel.getEffectTextModel()) == null || !effectTextModel2.getHasCoverText())) {
            z3 = false;
        }
        if (C0MH8.LJIIIZ(videoPublishEditModel, C0MH8.LIZ, videoPublishEditModel.getVideoCoverPath()) != null && (z3 || z)) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C858900Xmi(0, bitmap, videoPublishEditModel, this, C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJJJLL(this.LIZ.getCreativeInfo()), null), 3);
        }
        CoverPublishModel coverPublishModel4 = this.LIZ.getCoverPublishModel();
        if (coverPublishModel4 != null && (effectTextModel = coverPublishModel4.getEffectTextModel()) != null) {
            hasCoverText = effectTextModel.getHasCoverText();
        }
        this.LJJIIJ = hasCoverText;
    }

    public final void LJJIIJZLJL(int i, final int i2, final int i3, final String str) {
        final boolean z;
        float thumbnailImageSizeMultiple;
        LivePhotoPreviewMode livePhotoPreviewModeLIZLLL;
        List<SingleImageData> imageList;
        EffectTextModel effectTextModel;
        final String strLIZIZ = C1429320nIY.LIZIZ(this.LIZ);
        boolean z2 = true;
        boolean zLJIIIIZZ = false;
        if (C1429320nIY.LIZJ(this.LIZ) && C1428470nHB.LJJZZI(this.LIZ)) {
            z = true;
        } else {
            z = false;
        }
        CoverPublishModel coverPublishModel = this.LIZ.getCoverPublishModel();
        if (coverPublishModel == null || (effectTextModel = coverPublishModel.getEffectTextModel()) == null || !effectTextModel.getHasCoverText()) {
            z2 = false;
        }
        SingleImageData singleImageData = null;
        if (z2) {
            C15O7.LIZJ(new Callable() { // from class: X.09pB
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bitmap bitmapDecodeFile;
                    EffectTextModel effectTextModel2;
                    Bitmap bitmapMergeCoverText;
                    C1C7U.LIZ("ImageHeaderModule@1844.updateCoverWithCoverText$1");
                    if (u.LJIIZILJ(str, ".raw", false)) {
                        bitmapDecodeFile = C574070MfN.LIZIZ(str, i2, i3);
                        if (bitmapDecodeFile == null) {
                            bitmapDecodeFile = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                        }
                    } else {
                        bitmapDecodeFile = BitmapFactory.decodeFile(str);
                    }
                    if (z) {
                        bitmapDecodeFile = C1443400nfG.LIZIZ(strLIZIZ);
                    }
                    CoverPublishModel coverPublishModel2 = this.LIZ.getCoverPublishModel();
                    if (coverPublishModel2 != null && (effectTextModel2 = coverPublishModel2.getEffectTextModel()) != null && (bitmapMergeCoverText = effectTextModel2.mergeCoverText(bitmapDecodeFile)) != null) {
                        bitmapDecodeFile = bitmapMergeCoverText;
                    }
                    C1C7U.LIZIZ("ImageHeaderModule@1844.updateCoverWithCoverText$1");
                    return bitmapDecodeFile;
                }
            }).LJ(new C2501509rB(this, 13), C15O7.LJIIIIZZ, null);
            return;
        }
        if (z) {
            C23250099c.LIZLLL(this.LJJIJIIJI, null, null, new C09K0(this, strLIZIZ, null, new C259800zU()), 3);
        } else {
            ImageAlbumData imageAlbumData = this.LIZ.getImageAlbumData();
            if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
                singleImageData = (SingleImageData) C13LP.LJJJLZIJ(i, imageList);
            }
            C196S c196s = this.LJIIL;
            if (c196s != null) {
                thumbnailImageSizeMultiple = c196s.getThumbnailImageSizeMultiple();
            } else {
                thumbnailImageSizeMultiple = 1.0f;
            }
            C196S c196s2 = this.LJIIL;
            if (c196s2 != null) {
                if (singleImageData != null) {
                    zLJIIIIZZ = LJIIIIZZ(singleImageData);
                }
                if (singleImageData == null || (livePhotoPreviewModeLIZLLL = LIZLLL(singleImageData)) == null) {
                    livePhotoPreviewModeLIZLLL = LivePhotoPreviewMode.STATIC;
                }
                c196s2.LJI(i, new C196X(str, i2, i3, (UrlModel) null, 0, thumbnailImageSizeMultiple, zLJIIIIZZ, livePhotoPreviewModeLIZLLL, LJ(singleImageData), 56));
            }
        }
        String strLJJJJLL = C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJJJLL(this.LIZ.getCreativeInfo());
        C15O7.LIZJ(new ACallableS23S2100000_22(this, str, strLJJJJLL, 1)).LIZLLL(new C914100ZtY(this, strLJJJJLL, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.0Xjd] */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.196j] */
    public C214848196g(VideoPublishEditModel videoPublishEditModel, Scene scene, View view, InterfaceC214845196d interfaceC214845196d, Function0<Boolean> function0, List<? extends C19223110Ij> list, boolean z, Function0<Unit> function02) {
        this.LIZ = videoPublishEditModel;
        this.LIZIZ = scene;
        this.LIZJ = view;
        this.LIZLLL = interfaceC214845196d;
        this.LJ = function0;
        this.LJFF = list;
        this.LJI = z;
        this.LJII = function02;
        this.LJIIIIZZ = (C19EG) scene.requireActivity();
        this.LJIIIZ = ((ViewGroup) view).getOverlay();
        SettingsManager.LIZLLL().getClass();
        SettingsManager.LIZ("photo_mode_publish_title", false);
        this.LJJI = new ArrayList();
        this.LJJIFFI = new LinkedBlockingQueue<>();
        this.LJJII = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1109));
        this.LJJIII = new C11NJ();
        this.LJJIIZI = C0C64.LJIILLIIL().LJIJ(31744, 50, "photo_mode_title_max_length", true);
        this.LJJIJIIJI = C2296808zG.LIZIZ();
        this.LJJJI = new InputFilter() { // from class: X.0Xjd
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                String string;
                if (Intrinsics.LJFF(charSequence.toString(), "\n")) {
                    C0ZI0 c0zi0 = this.LL.LJIILLIIL;
                    if (c0zi0 != null) {
                        c0zi0.requestFocus();
                    }
                    C0ZI0 c0zi02 = this.LL.LJIILLIIL;
                    if (c0zi02 != null) {
                        c0zi02.setSelection(0);
                    }
                    return "";
                }
                int length = this.LL.LJJIIZI - (spanned.length() - (i4 - i3));
                if (C0C64.LJIILLIIL().LJIJ(31744, 0, "expand_the_character_limit_of_video_caption_from_150_to_500", true) != 1 && C0C64.LJIILLIIL().LJIJ(31744, 0, "expand_the_character_limit_of_video_caption_from_150_to_500", true) != 2 && C0C64.LJIILLIIL().LJIJ(31744, 0, "expand_the_character_limit_of_video_caption_from_150_to_500", true) != 3) {
                    string = C0CHQ.LIZ.getResources().getString(2131847374, Integer.valueOf(this.LL.LJJIIZI));
                } else {
                    string = C0CHQ.LIZ.getResources().getString(2131839801, Integer.valueOf(this.LL.LJJIIZI));
                }
                if (length >= i2 - i) {
                    return null;
                }
                if (length <= 0) {
                    VideoPublishEditModel videoPublishEditModel2 = this.LL.LIZ;
                    EditDescMobModel editDescMobModel = videoPublishEditModel2.creativeModel.commonMobModel.editDescMobModel;
                    if (!editDescMobModel.isMobExceedTitleLimitToastPopUp) {
                        editDescMobModel.isMobExceedTitleLimitToastPopUp = true;
                        List<InterfaceC2342209Fs> list2 = C2341909Fp.LIZ;
                        C2341909Fp.LIZ("exceed_title_limit_toast_pop_up", C0L5F.LIZ(videoPublishEditModel2).LIZ);
                    }
                    C19EG c19eg = this.LL.LJIIIIZZ;
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.isCenterToast(C859340XnQ.LIZIZ());
                    creativeToastBuilder.message(string);
                    creativeToastBuilder.isTuxToastLegacy(true);
                    C1390380mHk.LIZ(c19eg, 2017, creativeToastBuilder);
                    return "";
                }
                VideoPublishEditModel videoPublishEditModel3 = this.LL.LIZ;
                EditDescMobModel editDescMobModel2 = videoPublishEditModel3.creativeModel.commonMobModel.editDescMobModel;
                if (!editDescMobModel2.isMobExceedTitleLimitToastPopUp) {
                    editDescMobModel2.isMobExceedTitleLimitToastPopUp = true;
                    List<InterfaceC2342209Fs> list3 = C2341909Fp.LIZ;
                    C2341909Fp.LIZ("exceed_title_limit_toast_pop_up", C0L5F.LIZ(videoPublishEditModel3).LIZ);
                }
                int i5 = length + i;
                int i6 = i5 - 1;
                if (Character.isHighSurrogate(charSequence.charAt(i6))) {
                    if (i6 == i) {
                        C19EG c19eg2 = this.LL.LJIIIIZZ;
                        CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
                        creativeToastBuilder2.isCenterToast(C859340XnQ.LIZIZ());
                        creativeToastBuilder2.message(string);
                        creativeToastBuilder2.isTuxToastLegacy(true);
                        C1390380mHk.LIZ(c19eg2, 2017, creativeToastBuilder2);
                        return "";
                    }
                    i5 = i6;
                }
                C19EG c19eg3 = this.LL.LJIIIIZZ;
                CreativeToastBuilder creativeToastBuilder3 = new CreativeToastBuilder();
                creativeToastBuilder3.isCenterToast(C859340XnQ.LIZIZ());
                creativeToastBuilder3.message(string);
                creativeToastBuilder3.isTuxToastLegacy(true);
                C1390380mHk.LIZ(c19eg3, 2017, creativeToastBuilder3);
                return charSequence.subSequence(i, i5);
            }
        };
        this.LJJJIL = C857010Xjf.LL;
        this.LJJJJI = new C196N() { // from class: X.196j
            @Override // X.C196N
            public final void LIZ() {
                Integer numLIZJ;
                C337180DJs.LIZJ(this.LIZ.LJIJ);
                LinearLayout linearLayout = this.LIZ.LJIJJLI;
                if (linearLayout != null) {
                    C337180DJs.LIZ(linearLayout);
                }
                C19659811vw c19659811vw = this.LIZ.LJIJI;
                if (c19659811vw != null) {
                    C337180DJs.LIZJ(c19659811vw);
                }
                Context sceneContext = this.LIZ.LIZIZ.getSceneContext();
                if (sceneContext == null || (numLIZJ = C1308910kAL.LIZJ(R.attr.bx, sceneContext)) == null) {
                    return;
                }
                C214848196g c214848196g = this.LIZ;
                int iIntValue = numLIZJ.intValue();
                C19659811vw c19659811vw2 = c214848196g.LJIJI;
                if (c19659811vw2 != null) {
                    c19659811vw2.setStatusBarBackgroundColor(iIntValue);
                }
            }

            @Override // X.C196N
            public final void LIZJ() {
                C1295960jpS c1295960jpS = this.LIZ.LJIL;
                if (c1295960jpS != null) {
                    c1295960jpS.setMinAndMaxProgress(0.46153846f, 1.0f);
                }
                C1295960jpS c1295960jpS2 = this.LIZ.LJIL;
                if (c1295960jpS2 != null) {
                    c1295960jpS2.playAnimation();
                }
            }

            @Override // X.C196N
            public final void LIZIZ(boolean z2) {
                if (z2) {
                    View view2 = this.LIZ.LJIJJ;
                    if (view2 != null) {
                        C337180DJs.LIZJ(view2);
                        return;
                    }
                    return;
                }
                View view3 = this.LIZ.LJIJJ;
                if (view3 == null) {
                    return;
                }
                C337180DJs.LIZ(view3);
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
            @Override // X.C196N
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZLLL(boolean r4) {
                /*
                    r3 = this;
                    X.196g r0 = r3.LIZ
                    android.widget.FrameLayout r0 = r0.LJIJ
                    X.C337180DJs.LIZIZ(r0)
                    X.196g r0 = r3.LIZ
                    android.widget.LinearLayout r0 = r0.LJIJJLI
                    if (r0 == 0) goto L10
                    X.C337180DJs.LIZJ(r0)
                L10:
                    X.196g r0 = r3.LIZ
                    com.bytedance.scene.Scene r0 = r0.LIZIZ
                    android.content.Context r1 = r0.getSceneContext()
                    r2 = 0
                    if (r1 == 0) goto L3e
                    if (r4 == 0) goto L3a
                    r0 = 2131100559(0x7f06038f, float:1.7813503E38)
                L20:
                    java.lang.Integer r0 = X.C1308910kAL.LIZJ(r0, r1)
                    if (r0 == 0) goto L3e
                    int r1 = r0.intValue()
                L2a:
                    X.196g r0 = r3.LIZ
                    X.11vw r0 = r0.LJIJI
                    if (r0 == 0) goto L33
                    r0.setStatusBarBackgroundColor(r1)
                L33:
                    X.196g r1 = r3.LIZ
                    boolean r0 = r1.LJJJJ
                    if (r0 != r4) goto L40
                    return
                L3a:
                    r0 = 2131100570(0x7f06039a, float:1.7813525E38)
                    goto L20
                L3e:
                    r1 = 0
                    goto L2a
                L40:
                    r1.LJJJJ = r4
                    r1.LIZIZ(r4, r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C214851196j.LIZLLL(boolean):void");
            }
        };
    }
}
