package X;

import Y.ACListenerS143S0100000_8;
import Y.ARunnableS108S0100000_8;
import Y.ARunnableS13S0101000_1;
import Y.ARunnableS17S0400000_8;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.autopick.api.AutoPickServiceApi;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.AutoPickModel;
import com.ss.android.ugc.aweme.creative.model.CreativeFlowData;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeInitialModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.HighLightVideoParametersModel;
import com.ss.android.ugc.aweme.creative.model.PUgcTemplateData;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import com.ss.android.ugc.aweme.creative.model.edit.EditPhotoModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel;
import com.ss.android.ugc.aweme.creative.model.event.EventData;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.mediachoose.helper.LivePhotoInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.service.ITemplateDebugService;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.album.SelectMaterialScene;
import com.ss.android.ugc.aweme.shortvideo.album.api.config.AlbumNextButtonConfig;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.ab.CCDiversionEntConfig;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AutoCutStyleNextBtnConfig;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaState;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChoosePhotoPreviewPageConfig;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.onthisday.material.MaterialSelectScene;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.PreviewVideoScene;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.widget.HorizontalCenterLayoutManager;
import com.ss.android.ugc.tools.IAiChatFeatureService;
import com.ss.android.vesdk.VEEditor;
import com.zhiliaoapp.musically.R;
import irm.AkS80S0100000_8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS217S0300000_8;
import kotlin.jvm.internal.AwS23S0010000_8;
import kotlin.jvm.internal.AwS374S0200000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.AwS58S0210000_4;
import kotlin.jvm.internal.AwS93S1200000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KlV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C526910KlV extends C19A3 implements InterfaceC568490MRj, InterfaceC484050IyZ, InterfaceC362610EJn {
    public InterfaceC524950KiL LLJJI;
    public C527270Km5 LLJJIJI;
    public C527400KmI LLJJIJIIJIL;
    public C525530KjH LLJJIJIL;
    public TextView LLJJJ;
    public ImageView LLJJJIL;
    public TextView LLJJJJ;
    public ChooseMediaViewModel LLJJJJJIL;
    public ViewGroup LLJJJJLIIL;
    public RecyclerView LLJJL;
    public TextView LLJJLIIIJLLLLLLLZ;
    public TextView LLJL;
    public ViewTreeObserverOnGlobalLayoutListenerC526930KlX LLJLIL;
    public View LLJLILLLLZIIL;
    public View LLJLL;
    public View LLJLLIL;
    public View LLJLLL;
    public TextView LLJZ;
    public ImageView LLJZIJLIL;
    public TuxTextView LLL;
    public View LLLF;
    public TextView LLLFF;
    public TextView LLLFFI;
    public View LLLFZ;
    public C538480L9y LLLI;
    public C0L0H LLLII;
    public C197039127h LLLIIII;
    public C197039127h LLLIIIIL;
    public C527360KmE LLLIIIL;
    public C197039127h LLLIIL;
    public C526940KlY LLLIILIL;
    public C197039127h LLLIL;
    public AbstractC529520Kpi LLLILZ;
    public C09AY LLLILZJ;
    public C09AY LLLILZLLLI;
    public C09AY LLLIZZ;
    public int LLLJ;
    public ShortVideoContext LLLJIL;
    public boolean LLLJL;
    public C525090KiZ LLLL;
    public boolean LLLLII;
    public List<TikTokMediaModel> LLLLIIIILLL;
    public long LLLLIIL;
    public boolean LLLLIILLL;
    public boolean LLLLIL;
    public C0P0T LLLLL;
    public AVMusic LLLLLIL;
    public String LLLLLILLIL;
    public int LLLLLJIL;
    public int LLLLLJLJLL;
    public MediaModel LLLLLL;
    public boolean LLLLLLIL;
    public int LLLLLLJ;
    public long LLLLLLL;
    public long LLLLLLLLL;
    public final SafeHandler LLLLLLLLLL;
    public final int LLLLLLLZIL;
    public boolean LLLLLLZ;
    public boolean LLLLLLZZ;
    public boolean LLLLLZ;
    public boolean LLLLLZIL;
    public boolean LLLLLZL;
    public final C01GW LLLLZ;
    public final C01GW LLLLZI;
    public InterfaceC526970Klb LLLLZIL;
    public C09AY LLLLZLL;
    public C09AY LLLLZLLIL;
    public final List<TikTokMediaModel> LLLLZLLLI;
    public boolean LLLZ;
    public boolean LLJILLL = true;
    public boolean LLJJ = true;
    public int LLJJIII = -1;
    public ChoosePhotoPreviewPageConfig LLLLIILL = new ChoosePhotoPreviewPageConfig(0);
    public final float LLLLILI = 76.0f;
    public final float LLLLJ = 52.0f;
    public final float LLLLJI = 64.0f;

    @Override // X.InterfaceC568490MRj
    public final void LJII() {
        this.LLJILLL = false;
    }

    @Override // X.InterfaceC568490MRj
    public final void b() {
        LLLZZ(true);
    }

    @Override // X.InterfaceC568490MRj
    public final void onScaleBegin() {
        LLLZZ(false);
    }

    @Override // X.InterfaceC568490MRj
    public final View LIZJ() {
        C527400KmI c527400KmI = this.LLJJIJIIJIL;
        if (c527400KmI == null) {
            c527400KmI = null;
        }
        List<TikTokMediaModel> list = c527400KmI.LLJIJIL;
        C527270Km5 c527270Km5 = this.LLJJIJI;
        if (c527270Km5 == null) {
            c527270Km5 = null;
        }
        TikTokMediaModel tikTokMediaModel = (TikTokMediaModel) C13LP.LJJJLZIJ(c527270Km5.getCurrentItem(), list);
        InterfaceC526970Klb interfaceC526970Klb = this.LLLLZIL;
        if (interfaceC526970Klb != null) {
            return interfaceC526970Klb.LJFF(tikTokMediaModel);
        }
        return null;
    }

    public final void LLLLIIIILLL() {
        Context sceneContext;
        C197039127h c197039127h;
        if (!this.LLLLIILL.isFromAutoCutAgent || !C0C1J.LIZ() || (sceneContext = getSceneContext()) == null || (c197039127h = this.LLLIIL) == null) {
            return;
        }
        c197039127h.setText(sceneContext.getString(R.string.m6n));
        c197039127h.LJJLI(true);
        c197039127h.setButtonVariant(0);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zi, sceneContext);
        c197039127h.setTextColor(numLIZJ != null ? numLIZJ.intValue() : -1);
    }

    public final C1417720mzq LLLLLIL() {
        return new C1417720mzq(0, 0, C0L1J.LIZ(this.LLLLIILL.chooseSceneMode, ""), C0L1J.LIZIZ(this.LLLLIILL.chooseSceneMode, ""), 3);
    }

    public final PreviewVideoScene LLLLLILLIL() {
        C527400KmI c527400KmI = this.LLJJIJIIJIL;
        if (c527400KmI == null) {
            c527400KmI = null;
        }
        C527270Km5 c527270Km5 = this.LLJJIJI;
        if (c527270Km5 == null) {
            c527270Km5 = null;
        }
        InterfaceC525540KjI interfaceC525540KjILJJIZ = c527400KmI.LJJIZ(c527270Km5.getCurrentItem());
        if (interfaceC525540KjILJJIZ instanceof PreviewVideoScene) {
            return (PreviewVideoScene) interfaceC525540KjILJJIZ;
        }
        return null;
    }

    public final TikTokMediaModel LLLLLJIL() {
        C527400KmI c527400KmI;
        List<TikTokMediaModel> list;
        C527270Km5 c527270Km5 = this.LLJJIJI;
        if (c527270Km5 == null) {
            c527270Km5 = null;
        }
        PagerAdapter adapter = c527270Km5.getAdapter();
        if (!(adapter instanceof C527400KmI) || (c527400KmI = (C527400KmI) adapter) == null || (list = c527400KmI.LLJIJIL) == null) {
            return null;
        }
        C527270Km5 c527270Km52 = this.LLJJIJI;
        return (TikTokMediaModel) C13LP.LJJJLZIJ((c527270Km52 != null ? c527270Km52 : null).getCurrentItem(), list);
    }

    public final TextView LLLLLJLJLL() {
        if (this.LLLLIILL.isFromAutoCutAgent && C0C1J.LIZ()) {
            return this.LLLIIL;
        }
        ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfig = this.LLLLIILL;
        return (choosePhotoPreviewPageConfig.showAutoCutBtn || choosePhotoPreviewPageConfig.showEditorProBtn || choosePhotoPreviewPageConfig.showUseEffectBtn) ? this.LLLIIL : this.LLLFF;
    }

    public final void LLLLLLIL() {
        C527400KmI c527400KmI;
        List<TikTokMediaModel> list;
        ArrayList<TikTokMediaModel> arrayList;
        ArrayList<TikTokMediaModel> arrayList2;
        ArrayList<TikTokMediaModel> arrayList3;
        InterfaceC526970Klb interfaceC526970Klb;
        ArrayList<TikTokMediaModel> arrayList4;
        C527270Km5 c527270Km5 = this.LLJJIJI;
        objValueOf = null;
        Object objValueOf = null;
        if (c527270Km5 == null) {
            c527270Km5 = null;
        }
        PagerAdapter adapter = c527270Km5.getAdapter();
        if (!(adapter instanceof C527400KmI) || (c527400KmI = (C527400KmI) adapter) == null || (list = c527400KmI.LLJIJIL) == null) {
            return;
        }
        C527270Km5 c527270Km52 = this.LLJJIJI;
        if (c527270Km52 == null) {
            c527270Km52 = null;
        }
        TikTokMediaModel tikTokMediaModel = (TikTokMediaModel) C13LP.LJJJLZIJ(c527270Km52.getCurrentItem(), list);
        if (tikTokMediaModel != null) {
            C533790Kwb c533790Kwb = C533790Kwb.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AutoPickPreview [handleSelectIconClick] curItem id=");
            sbLIZ.append(((MediaModel) tikTokMediaModel).id);
            sbLIZ.append(", selectIndex=");
            sbLIZ.append(tikTokMediaModel.selectIndex);
            sbLIZ.append(", mediaIndex=");
            sbLIZ.append(tikTokMediaModel.mediaIndex);
            sbLIZ.append(", vpCurrentItem=");
            C527270Km5 c527270Km53 = this.LLJJIJI;
            if (c527270Km53 == null) {
                c527270Km53 = null;
            }
            sbLIZ.append(c527270Km53.getCurrentItem());
            sbLIZ.append(", vpDataSize=");
            C527400KmI c527400KmI2 = this.LLJJIJIIJIL;
            if (c527400KmI2 == null) {
                c527400KmI2 = null;
            }
            sbLIZ.append(c527400KmI2.LLJIJIL.size());
            sbLIZ.append(", dockSize=");
            AbstractC529520Kpi abstractC529520Kpi = this.LLLILZ;
            sbLIZ.append((abstractC529520Kpi == null || (arrayList4 = abstractC529520Kpi.LL) == null) ? null : Integer.valueOf(arrayList4.size()));
            sbLIZ.append(", isFromAutoCutAgent=");
            sbLIZ.append(this.LLLLIILL.isFromAutoCutAgent);
            C201955140j.LJIILJJIL(c533790Kwb, C2188811AlT.LIZIZ(sbLIZ));
            InterfaceC526970Klb interfaceC526970Klb2 = this.LLLLZIL;
            boolean z = true;
            if (interfaceC526970Klb2 != null && !interfaceC526970Klb2.LJ(tikTokMediaModel)) {
                C201955140j.LJIILJJIL(c533790Kwb, "AutoPickPreview [handleSelectIconClick] isCheckMediaLegal=false, return");
                return;
            }
            if (this.LLLLIILL.supportRepeatSelect && (interfaceC526970Klb = this.LLLLZIL) != null && interfaceC526970Klb.LIZ()) {
                InterfaceC526970Klb interfaceC526970Klb3 = this.LLLLZIL;
                if (interfaceC526970Klb3 != null) {
                    interfaceC526970Klb3.LJIIIIZZ();
                    return;
                }
                return;
            }
            if (tikTokMediaModel.selectIndex < 0 || this.LLLLIILL.supportRepeatSelect) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("AutoPickPreview [handleSelectIconClick] SELECT (not unselect) curItem id=");
                sbLIZ2.append(((MediaModel) tikTokMediaModel).id);
                sbLIZ2.append(", selectIndex=");
                sbLIZ2.append(tikTokMediaModel.selectIndex);
                sbLIZ2.append(", mediaIndex=");
                sbLIZ2.append(tikTokMediaModel.mediaIndex);
                C201955140j.LJIILJJIL(c533790Kwb, C2188811AlT.LIZIZ(sbLIZ2));
                ShortVideoContext shortVideoContext = this.LLLJIL;
                if (shortVideoContext != null) {
                    shortVideoContext.isAutoSelectedAlbumPreview = false;
                }
                ChooseMediaViewModel chooseMediaViewModel = this.LLJJJJJIL;
                (chooseMediaViewModel != null ? chooseMediaViewModel : null).Kw2(tikTokMediaModel);
                return;
            }
            if (LLLLLLZ()) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("AutoPickPreview [handleSelectIconClick] block unselect by min-count, id=");
                sbLIZ3.append(((MediaModel) tikTokMediaModel).id);
                sbLIZ3.append(", vpSize=");
                C527400KmI c527400KmI3 = this.LLJJIJIIJIL;
                if (c527400KmI3 == null) {
                    c527400KmI3 = null;
                }
                sbLIZ3.append(c527400KmI3.LLJIJIL.size());
                sbLIZ3.append(", dockSize=");
                AbstractC529520Kpi abstractC529520Kpi2 = this.LLLILZ;
                if (abstractC529520Kpi2 != null && (arrayList3 = abstractC529520Kpi2.LL) != null) {
                    objValueOf = Integer.valueOf(arrayList3.size());
                }
                sbLIZ3.append(objValueOf);
                C201955140j.LJIILJJIL(c533790Kwb, C2188811AlT.LIZIZ(sbLIZ3));
                LLLZLL();
                return;
            }
            C527400KmI c527400KmI4 = this.LLJJIJIIJIL;
            if (c527400KmI4 == null) {
                c527400KmI4 = null;
            }
            int size = c527400KmI4.LLJIJIL.size();
            AbstractC529520Kpi abstractC529520Kpi3 = this.LLLILZ;
            int size2 = -1;
            int size3 = (abstractC529520Kpi3 == null || (arrayList2 = abstractC529520Kpi3.LL) == null) ? -1 : arrayList2.size();
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("AutoPickPreview [handleSelectIconClick] UNSELECT curItem id=");
            sbLIZ4.append(((MediaModel) tikTokMediaModel).id);
            sbLIZ4.append(", mediaIndex=");
            sbLIZ4.append(tikTokMediaModel.mediaIndex);
            sbLIZ4.append(", vpCurrentItem=");
            C527270Km5 c527270Km54 = this.LLJJIJI;
            if (c527270Km54 == null) {
                c527270Km54 = null;
            }
            sbLIZ4.append(c527270Km54.getCurrentItem());
            sbLIZ4.append(", vpSize=");
            sbLIZ4.append(size);
            sbLIZ4.append(", dockSize=");
            sbLIZ4.append(size3);
            C201955140j.LJIILJJIL(c533790Kwb, C2188811AlT.LIZIZ(sbLIZ4));
            LLZLL(tikTokMediaModel);
            C527400KmI c527400KmI5 = this.LLJJIJIIJIL;
            if (c527400KmI5 == null) {
                c527400KmI5 = null;
            }
            int size4 = c527400KmI5.LLJIJIL.size();
            AbstractC529520Kpi abstractC529520Kpi4 = this.LLLILZ;
            if (abstractC529520Kpi4 != null && (arrayList = abstractC529520Kpi4.LL) != null) {
                size2 = arrayList.size();
            }
            boolean z2 = size4 < size || size2 < size3;
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("AutoPickPreview [handleSelectIconClick] post-unselect: vpSize=");
            sbLIZ5.append(size4);
            sbLIZ5.append(", dockSize=");
            sbLIZ5.append(size2);
            sbLIZ5.append(", likelyDeleted=");
            sbLIZ5.append(z2);
            C201955140j.LJIILJJIL(c533790Kwb, C2188811AlT.LIZIZ(sbLIZ5));
            ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfig = this.LLLLIILL;
            if (!choosePhotoPreviewPageConfig.isFromAutoCutAgent && !choosePhotoPreviewPageConfig.isFromAutoPickAddMedia) {
                z = false;
            }
            if (!z2 && z) {
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("AutoPickPreview [handleSelectIconClick] skip notifyUnselectMediaFromCheckBox: nothing deleted in AutoPick flow, id=");
                sbLIZ6.append(((MediaModel) tikTokMediaModel).id);
                C201955140j.LJIILJJIL(c533790Kwb, C2188811AlT.LIZIZ(sbLIZ6));
                return;
            }
            ChooseMediaViewModel chooseMediaViewModel2 = this.LLJJJJJIL;
            if (chooseMediaViewModel2 == null) {
                chooseMediaViewModel2 = null;
            }
            chooseMediaViewModel2.getClass();
            chooseMediaViewModel2.yR2(new AwS587S0100000_8(tikTokMediaModel, 209));
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("AutoPickPreview [handleSelectIconClick] notifyUnselectMediaFromCheckBox called, id=");
            sbLIZ7.append(((MediaModel) tikTokMediaModel).id);
            sbLIZ7.append(", likelyDeleted=");
            sbLIZ7.append(z2);
            C201955140j.LJIILJJIL(c533790Kwb, C2188811AlT.LIZIZ(sbLIZ7));
            C2344009Gk c2344009Gk = new C2344009Gk();
            ShortVideoContext shortVideoContext2 = this.LLLJIL;
            c2344009Gk.LJIIIIZZ("creation_id", shortVideoContext2 != null ? shortVideoContext2.getCreationId() : null);
            ShortVideoContext shortVideoContext3 = this.LLLJIL;
            c2344009Gk.LJIIIIZZ("shoot_way", shortVideoContext3 != null ? shortVideoContext3.shootWay : null);
            ShortVideoContext shortVideoContext4 = this.LLLJIL;
            c2344009Gk.LJIIIIZZ("enter_from", shortVideoContext4 != null ? shortVideoContext4.enterFrom : null);
            c2344009Gk.LIZJ(tikTokMediaModel.type, "content_type");
            c2344009Gk.LIZJ(C527210Klz.LIZIZ(tikTokMediaModel) ? 1 : 0, "is_adjust_clip");
            C20684815ws.LJIILLIIL("cancel_chosen_content", c2344009Gk.LIZ);
            ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfig2 = this.LLLLIILL;
            if (choosePhotoPreviewPageConfig2.isUgcTemplate || choosePhotoPreviewPageConfig2.isEditorProReplace) {
                ViewTreeObserverOnGlobalLayoutListenerC526930KlX viewTreeObserverOnGlobalLayoutListenerC526930KlX = this.LLJLIL;
                C786410Ut5.J0(viewTreeObserverOnGlobalLayoutListenerC526930KlX != null ? viewTreeObserverOnGlobalLayoutListenerC526930KlX : null, 8);
            }
        }
    }

    public final void LLLLLLJ() {
        C526940KlY c526940KlY = this.LLLIILIL;
        if (c526940KlY == null) {
            c526940KlY = null;
        }
        c526940KlY.setExtractMusicRootBackground(null);
        C526940KlY c526940KlY2 = this.LLLIILIL;
        if (c526940KlY2 == null) {
            c526940KlY2 = null;
        }
        C786410Ut5.F0(c526940KlY2, 0);
        C526940KlY c526940KlY3 = this.LLLIILIL;
        if (c526940KlY3 == null) {
            c526940KlY3 = null;
        }
        c526940KlY3.setOnExtractClick(new ACListenerS143S0100000_8(this, 67));
        RecyclerView recyclerView = this.LLJJL;
        if (recyclerView == null) {
            recyclerView = null;
        }
        C786410Ut5.LLIZLLLIL(recyclerView, 8);
        LLLZIL(8);
        View view = this.LLLF;
        C786410Ut5.LJLLLLLL(8, view != null ? view : null);
    }

    public final void LLLLLLL() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        TuxTextView tuxTextView;
        InterfaceC1429470nIn interfaceC1429470nInLJFF;
        InterfaceC528120KnS interfaceC528120KnSLIZIZ;
        CreativeModel creativeModel;
        PUgcTemplateData pUgcTemplateData;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        TuxTextView tuxTextView2;
        TuxTextView tuxTextView3;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        Integer numLIZJ;
        Integer numLIZJ2;
        Integer numLIZJ3;
        ViewGroup.LayoutParams layoutParams3;
        Integer numLIZJ4;
        C197039127h c197039127h;
        Activity activity;
        Window window;
        if (getSceneContext() != null && (activity = this.mActivity) != null && (window = activity.getWindow()) != null) {
            Integer numLIZJ5 = C1308910kAL.LIZJ((C522930Kf5.LIZIZ(this.LLLLIILL.chooseSceneMode) || C522930Kf5.LIZ(this.LLLLIILL.chooseSceneMode)) ? R.attr.zh : R.attr.e1, requireSceneContext());
            window.setNavigationBarColor(numLIZJ5 != null ? numLIZJ5.intValue() : -16777216);
        }
        this.LLJLL = requireViewById(R.id.rq4);
        this.LLJLLIL = requireViewById(R.id.ccw);
        this.LLJLLL = findViewById(R.id.cbz);
        ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfig = this.LLLLIILL;
        if (choosePhotoPreviewPageConfig.showAutoCutBtn || choosePhotoPreviewPageConfig.showEditorProBtn) {
            LLLZIIL(this.LLLLILI);
        }
        this.LLJJLIIIJLLLLLLLZ = (TextView) requireViewById(R.id.vcj);
        this.LLJLILLLLZIIL = requireViewById(R.id.oph);
        this.LLJL = (TextView) requireViewById(R.id.opf);
        this.LLJJL = (RecyclerView) requireViewById(R.id.o5e);
        ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfig2 = this.LLLLIILL;
        if (choosePhotoPreviewPageConfig2.isSoundSync || choosePhotoPreviewPageConfig2.isUgcTemplate || choosePhotoPreviewPageConfig2.isEditorProReplace || choosePhotoPreviewPageConfig2.isAutoCutSoundSyncMode || choosePhotoPreviewPageConfig2.forceHideMediaRecyclerView || C529980KqS.LIZJ(choosePhotoPreviewPageConfig2.chooseSceneMode)) {
            RecyclerView recyclerView = this.LLJJL;
            if (recyclerView == null) {
                recyclerView = null;
            }
            C786410Ut5.LLIZLLLIL(recyclerView, 8);
        }
        RecyclerView recyclerView2 = this.LLJJL;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        recyclerView2.setLayoutManager(new HorizontalCenterLayoutManager(getSceneContext()));
        RecyclerView recyclerView3 = this.LLJJL;
        if (recyclerView3 == null) {
            recyclerView3 = null;
        }
        C423520Gj8 c423520Gj8 = new C423520Gj8();
        c423520Gj8.LLILLL = 250L;
        c423520Gj8.LLILZ = 250L;
        c423520Gj8.LLILZIL = 250L;
        c423520Gj8.LLILZLL = 250L;
        recyclerView3.setItemAnimator(c423520Gj8);
        this.LLJZ = (TextView) requireViewById(R.id.keq);
        this.LLJZIJLIL = (ImageView) requireViewById(R.id.p5u);
        TuxTextView tuxTextView4 = (TuxTextView) findViewById(R.id.rsg);
        this.LLL = tuxTextView4;
        if (tuxTextView4 != null) {
            tuxTextView4.setSelected(true);
            tuxTextView4.setHorizontalFadingEdgeEnabled(true);
            tuxTextView4.setFadingEdgeLength(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
        }
        ImageView imageView = this.LLJZIJLIL;
        if (imageView == null) {
            imageView = null;
        }
        C786410Ut5.Q7(imageView, new ACListenerS143S0100000_8(this, 70));
        View viewRequireViewById = requireViewById(R.id.ul1);
        this.LLLF = viewRequireViewById;
        if (viewRequireViewById == null) {
            viewRequireViewById = null;
        }
        C786410Ut5.I7(new AkS80S0100000_8(this, 7), viewRequireViewById);
        if (this.LLLLIILL.isEditorProReplace) {
            View view = this.LLLF;
            if (view == null) {
                view = null;
            }
            C786410Ut5.LJLLLLLL(8, view);
        }
        this.LLLFF = (TextView) requireViewById(R.id.p8l);
        this.LLLFZ = requireViewById(R.id.cx2);
        this.LLLI = (C538480L9y) requireViewById(R.id.bdo);
        C0L0H c0l0h = (C0L0H) requireViewById(R.id.dk2);
        this.LLLII = c0l0h;
        if (c0l0h != null) {
            EnumC380250EvX enumC380250EvX = EnumC380250EvX.MATERIAL;
            AwS552S0100000_8 awS552S0100000_8 = new AwS552S0100000_8(this, 320);
            c0l0h.LL = enumC380250EvX;
            c0l0h.LLILLJJLI = awS552S0100000_8;
        }
        this.LLLIIII = (C197039127h) findViewById(R.id.aou);
        this.LLLIIIIL = (C197039127h) findViewById(R.id.be1);
        C527360KmE c527360KmE = (C527360KmE) requireViewById(R.id.gti);
        c527360KmE.LIZIZ("preview_page");
        this.LLLIIIL = c527360KmE;
        C197039127h c197039127h2 = (C197039127h) requireViewById(R.id.p8m);
        this.LLLIIL = c197039127h2;
        if (c197039127h2 != null) {
            c197039127h2.setBackgroundRadius(200);
        }
        if (this.LLLLIILL.isFromAutoCutAgent && (c197039127h = this.LLLIIL) != null) {
            C786410Ut5.LLLLLLJ(c197039127h, 8);
        }
        Bundle bundle = this.mArguments;
        if (bundle != null && bundle.getBoolean("from_eoy_entry")) {
            ImageView imageView2 = this.LLJZIJLIL;
            if (imageView2 == null) {
                imageView2 = null;
            }
            ViewGroup.LayoutParams layoutParams4 = imageView2.getLayoutParams();
            C19ME c19me = layoutParams4 instanceof C19ME ? (C19ME) layoutParams4 : null;
            if (c19me != null) {
                c19me.topToTop = R.id.yc9;
                ImageView imageView3 = this.LLJZIJLIL;
                if (imageView3 == null) {
                    imageView3 = null;
                }
                C786410Ut5.c6(imageView3, c19me);
            }
            View viewFindViewById = findViewById(R.id.yc9);
            if (viewFindViewById != null) {
                C1383370m6R.LJIILJJIL(-2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52)), viewFindViewById);
            }
            ViewGroup viewGroup = this.LLJJJJLIIL;
            if (viewGroup == null) {
                viewGroup = null;
            }
            C1383370m6R.LIZIZ(viewGroup, AFwS239S0000000_8.get$arr$(104));
            ImageView imageView4 = this.LLJZIJLIL;
            if (imageView4 == null) {
                imageView4 = null;
            }
            C1383370m6R.LIZIZ(imageView4, AFwS239S0000000_8.get$arr$(100));
            ChooseMediaViewModel chooseMediaViewModel = this.LLJJJJJIL;
            if (chooseMediaViewModel == null) {
                chooseMediaViewModel = null;
            }
            BaseJediViewModel.iR2(chooseMediaViewModel, this, new C2217381BqS() { // from class: X.0Kld
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((ChooseMediaState) obj).getPreviewNextBtnState();
                }
            }, new AwS587S0100000_8(this, 214));
        }
        this.LLLIL = (C197039127h) findViewById(R.id.use_effect_btn);
        LLLLLLLLL();
        C538480L9y c538480L9y = this.LLLI;
        if (c538480L9y == null) {
            c538480L9y = null;
        }
        c538480L9y.setBackground(C527200Kly.LIZ(requireSceneContext(), true));
        C0L0H c0l0h2 = this.LLLII;
        if (c0l0h2 != null) {
            c0l0h2.setBackground(C527200Kly.LIZ(requireSceneContext(), true));
        }
        C527360KmE c527360KmE2 = this.LLLIIIL;
        if (c527360KmE2 == null) {
            c527360KmE2 = null;
        }
        c527360KmE2.setBackground(C527200Kly.LIZ(requireSceneContext(), true));
        if (this.LLLLIILL.isEnabledLayoutMode) {
            C538480L9y c538480L9y2 = this.LLLI;
            if (c538480L9y2 == null) {
                c538480L9y2 = null;
            }
            c538480L9y2.setContentAlpha(0.34f);
            C527360KmE c527360KmE3 = this.LLLIIIL;
            if (c527360KmE3 == null) {
                c527360KmE3 = null;
            }
            c527360KmE3.setContentAlpha(0.34f);
        }
        Context sceneContext = getSceneContext();
        if (sceneContext != null && (numLIZJ4 = C1308910kAL.LIZJ(R.attr.z_, sceneContext)) != null) {
            int iIntValue = numLIZJ4.intValue();
            C538480L9y c538480L9y3 = this.LLLI;
            if (c538480L9y3 == null) {
                c538480L9y3 = null;
            }
            c538480L9y3.setTextColor(iIntValue);
            C0L0H c0l0h3 = this.LLLII;
            if (c0l0h3 != null) {
                c0l0h3.setTextColor(iIntValue);
            }
            C527360KmE c527360KmE4 = this.LLLIIIL;
            if (c527360KmE4 == null) {
                c527360KmE4 = null;
            }
            c527360KmE4.setTextColor(iIntValue);
        }
        AutoCutStyleNextBtnConfig autoCutStyleNextBtnConfig = this.LLLLIILL.autoCutStyleNextBtnConfig;
        if (autoCutStyleNextBtnConfig != null) {
            C197039127h c197039127h3 = this.LLLIIL;
            if (c197039127h3 != null) {
                c197039127h3.setTextSize(autoCutStyleNextBtnConfig.textSize);
            }
            C197039127h c197039127h4 = this.LLLIIL;
            if (c197039127h4 != null && (layoutParams3 = c197039127h4.getLayoutParams()) != null) {
                layoutParams3.height = autoCutStyleNextBtnConfig.height;
            }
            View view2 = this.LLLFZ;
            if (view2 == null) {
                view2 = null;
            }
            ViewGroup.LayoutParams layoutParams5 = view2.getLayoutParams();
            if (layoutParams5 != null) {
                layoutParams5.height = autoCutStyleNextBtnConfig.height;
            }
        }
        TextView textView = this.LLLFF;
        if (textView != null) {
            textView.setBackground(LLLLZ(true));
        }
        if (C522930Kf5.LIZIZ(this.LLLLIILL.chooseSceneMode)) {
            TextView textView2 = this.LLLFF;
            if (textView2 != null) {
                C1383370m6R.LJIILJJIL(-2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)), textView2);
            }
            TextView textView3 = this.LLLFF;
            if (textView3 != null) {
                textView3.setMinWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(88)));
            }
            TextView textView4 = this.LLLFF;
            if (textView4 != null) {
                C1383370m6R.LIZIZ(textView4, AFwS239S0000000_8.get$arr$(101));
            }
            TextView textView5 = this.LLLFF;
            if (textView5 != null) {
                textView5.setTextColor(LLLLZIL());
            }
            View view3 = this.LLLF;
            if (view3 == null) {
                view3 = null;
            }
            C1383370m6R.LJIILJJIL(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(94)), view3);
            View view4 = this.LLJLLIL;
            if (view4 == null) {
                view4 = null;
            }
            C1383370m6R.LJIILJJIL(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(94)), view4);
            Context sceneContext2 = getSceneContext();
            if (sceneContext2 != null && (numLIZJ3 = C1308910kAL.LIZJ(R.attr.zh, sceneContext2)) != null) {
                view4.setBackgroundColor(numLIZJ3.intValue());
            }
            TextView textView6 = this.LLJZ;
            if (textView6 == null) {
                textView6 = null;
            }
            Context sceneContext3 = getSceneContext();
            textView6.setText(sceneContext3 != null ? sceneContext3.getString(2131825296) : null);
            TextView textView7 = this.LLJZ;
            if (textView7 == null) {
                textView7 = null;
            }
            C1383370m6R.LJIILJJIL(-2, -2, textView7);
            TextView textView8 = this.LLJZ;
            if (textView8 == null) {
                textView8 = null;
            }
            textView8.setMinHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)));
            TextView textView9 = this.LLJZ;
            if (textView9 == null) {
                textView9 = null;
            }
            textView9.setMaxWidth(C1415610mwR.LIZIZ() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120)));
            TextView textView10 = this.LLJZ;
            if (textView10 == null) {
                textView10 = null;
            }
            textView10.setSingleLine(false);
            TextView textView11 = this.LLJZ;
            if (textView11 == null) {
                textView11 = null;
            }
            C1383370m6R.LIZIZ(textView11, AFwS239S0000000_8.get$arr$(102));
            TextView textView12 = this.LLJZ;
            if (textView12 == null) {
                textView12 = null;
            }
            C786410Ut5.S4(0.6f, textView12);
            TextView textView13 = this.LLJZ;
            if (textView13 == null) {
                textView13 = null;
            }
            textView13.setTextSize(13.0f);
            TextView textView14 = this.LLJZ;
            if (textView14 == null) {
                textView14 = null;
            }
            Context sceneContext4 = getSceneContext();
            textView14.setTextColor((sceneContext4 == null || (numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1k, sceneContext4)) == null) ? -1 : numLIZJ2.intValue());
            TextView textView15 = this.LLJJLIIIJLLLLLLLZ;
            if (textView15 == null) {
                textView15 = null;
            }
            C436180H8m.LIZIZ(textView15);
            View view5 = this.LLJLILLLLZIIL;
            if (view5 == null) {
                view5 = null;
            }
            C436180H8m.LIZIZ(view5);
            TextView textView16 = this.LLJL;
            if (textView16 != null) {
                C786410Ut5.LJLLLLLL(8, textView16);
            }
        }
        if (C522930Kf5.LIZ(this.LLLLIILL.chooseSceneMode)) {
            TextView textView17 = this.LLLFF;
            if (textView17 != null) {
                C1383370m6R.LJIILJJIL(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)), textView17);
            }
            TextView textView18 = this.LLLFF;
            ViewGroup.LayoutParams layoutParams6 = textView18 != null ? textView18.getLayoutParams() : null;
            if (layoutParams6 instanceof C19ME) {
                marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams6;
                if (marginLayoutParams2 != null) {
                    marginLayoutParams2.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                    marginLayoutParams2.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                }
            } else {
                marginLayoutParams2 = null;
            }
            TextView textView19 = this.LLLFF;
            if (textView19 != null) {
                C786410Ut5.g6(textView19, marginLayoutParams2);
            }
            TextView textView20 = this.LLLFF;
            if (textView20 != null) {
                textView20.setMinWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(88)));
            }
            TextView textView21 = this.LLLFF;
            if (textView21 != null) {
                C1383370m6R.LIZIZ(textView21, AFwS239S0000000_8.get$arr$(103));
            }
            TextView textView22 = this.LLLFF;
            if (textView22 != null) {
                textView22.setTextColor(LLLLZIL());
            }
            View view6 = this.LLLF;
            if (view6 == null) {
                view6 = null;
            }
            C1383370m6R.LJIILJJIL(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(94)), view6);
            View view7 = this.LLJLLIL;
            if (view7 == null) {
                view7 = null;
            }
            C1383370m6R.LJIILJJIL(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(94)), view7);
            Context sceneContext5 = getSceneContext();
            if (sceneContext5 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.zh, sceneContext5)) != null) {
                view7.setBackgroundColor(numLIZJ.intValue());
            }
            TextView textView23 = this.LLJZ;
            if (textView23 == null) {
                textView23 = null;
            }
            C786410Ut5.LLIL(textView23, 8);
            TextView textView24 = this.LLJJLIIIJLLLLLLLZ;
            if (textView24 == null) {
                textView24 = null;
            }
            C436180H8m.LIZIZ(textView24);
            View view8 = this.LLJLILLLLZIIL;
            if (view8 == null) {
                view8 = null;
            }
            C436180H8m.LIZIZ(view8);
            TextView textView25 = this.LLJL;
            if (textView25 != null) {
                C786410Ut5.LJLLLLLL(8, textView25);
            }
        }
        TextView textView26 = (TextView) requireViewById(R.id.rpw);
        this.LLLFFI = textView26;
        if (textView26 != null) {
            C786410Ut5.LLIL(textView26, 8);
        }
        TextView textView27 = this.LLLFFI;
        if (textView27 != null) {
            C786410Ut5.T7(textView27, new ACListenerS143S0100000_8(this, 68));
        }
        TextView textView28 = this.LLLFFI;
        if (textView28 != null) {
            TextView textView29 = this.LLLFF;
            textView28.setBackground(textView29 != null ? textView29.getBackground() : null);
        }
        if (C529980KqS.LIZJ(this.LLLLIILL.chooseSceneMode)) {
            TextView textView30 = this.LLLFF;
            if (textView30 != null) {
                C426750GoL.LJIIL(textView30, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 16);
            }
            TextView textView31 = this.LLLFFI;
            if (textView31 != null) {
                C426750GoL.LJIIL(textView31, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 16);
            }
            TextView textView32 = this.LLLFF;
            if ((textView32 instanceof TuxTextView) && (tuxTextView3 = (TuxTextView) textView32) != null) {
                tuxTextView3.setTuxFont(102);
            }
            TextView textView33 = this.LLLFFI;
            if ((textView33 instanceof TuxTextView) && (tuxTextView2 = (TuxTextView) textView33) != null) {
                tuxTextView2.setTuxFont(102);
            }
            TextView textView34 = this.LLLFF;
            if (textView34 != null && (layoutParams2 = textView34.getLayoutParams()) != null) {
                layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                TextView textView35 = this.LLLFF;
                if (textView35 != null) {
                    C786410Ut5.g6(textView35, layoutParams2);
                }
            }
            TextView textView36 = this.LLLFFI;
            if (textView36 != null && (layoutParams = textView36.getLayoutParams()) != null) {
                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                TextView textView37 = this.LLLFFI;
                if (textView37 != null) {
                    C786410Ut5.g6(textView37, layoutParams);
                }
            }
            View view9 = this.LLJLLIL;
            if (view9 == null) {
                view9 = null;
            }
            ViewGroup.LayoutParams layoutParams7 = view9.getLayoutParams();
            if (layoutParams7 != null) {
                layoutParams7.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
                View view10 = this.LLJLLIL;
                if (view10 == null) {
                    view10 = null;
                }
                C786410Ut5.W5(view10, layoutParams7);
            }
        } else if (this.LLLLIILL.enableBottomBarRefactory) {
            TextView textView38 = this.LLLFF;
            if (textView38 != null) {
                C426750GoL.LJIIL(textView38, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), 16);
            }
            TextView textView39 = this.LLLFF;
            if ((textView39 instanceof TuxTextView) && (tuxTextView = (TuxTextView) textView39) != null) {
                tuxTextView.setTuxFont(102);
            }
            TextView textView40 = this.LLLFF;
            ViewGroup.LayoutParams layoutParams8 = textView40 != null ? textView40.getLayoutParams() : null;
            if ((layoutParams8 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams8) != null) {
                marginLayoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
                marginLayoutParams.leftMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                marginLayoutParams.rightMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                marginLayoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                TextView textView41 = this.LLLFF;
                if (textView41 != null) {
                    C786410Ut5.g6(textView41, marginLayoutParams);
                }
            }
            RecyclerView recyclerView4 = this.LLJJL;
            if (recyclerView4 == null) {
                recyclerView4 = null;
            }
            recyclerView4.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        }
        AkS80S0100000_8 akS80S0100000_8 = new AkS80S0100000_8(this, 8);
        TextView textView42 = this.LLLFF;
        if (textView42 != null) {
            C786410Ut5.T7(textView42, akS80S0100000_8);
        }
        C197039127h c197039127h5 = this.LLLIIL;
        if (c197039127h5 != null) {
            C786410Ut5.U8(c197039127h5, akS80S0100000_8);
        }
        if (this.LLLLIILL.LIZ() || this.LLLLIILL.LIZIZ()) {
            View view11 = this.LLLF;
            if (view11 == null) {
                view11 = null;
            }
            C786410Ut5.LJLLLLLL(8, view11);
            LLLZIL(8);
            View view12 = this.LLLFZ;
            if (view12 == null) {
                view12 = null;
            }
            C786410Ut5.LJLLLLLL(0, view12);
            C197039127h c197039127h6 = this.LLLIIII;
            if (c197039127h6 != null) {
                C786410Ut5.LLLLLLJ(c197039127h6, 0);
                C786410Ut5.U8(c197039127h6, akS80S0100000_8);
                ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfig3 = this.LLLLIILL;
                if (choosePhotoPreviewPageConfig3.chooseSceneMode == 60) {
                    c197039127h6.setText(R.string.m6n);
                } else if (choosePhotoPreviewPageConfig3.LIZ()) {
                    c197039127h6.setText(C0MED.LIZ(C0MEB.ALBUM_BOTTOM_SECTION_CTA_GENERATE, new Object[0]));
                } else if (this.LLLLIILL.LIZIZ()) {
                    IAiChatFeatureService iAiChatFeatureService = (IAiChatFeatureService) PluggableExtentionKt.pluggableSpi$default(IAiChatFeatureService.class, false, false, false, 14, null);
                    c197039127h6.setText((iAiChatFeatureService == null || (interfaceC1429470nInLJFF = iAiChatFeatureService.LJFF()) == null || (interfaceC528120KnSLIZIZ = interfaceC1429470nInLJFF.LIZIZ()) == null) ? null : interfaceC528120KnSLIZIZ.LIZIZ());
                }
            }
        }
        ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfig4 = this.LLLLIILL;
        if (choosePhotoPreviewPageConfig4.showAutoCutBtn || choosePhotoPreviewPageConfig4.showEditorProBtn) {
            View view13 = this.LLLF;
            if (view13 == null) {
                view13 = null;
            }
            C786410Ut5.LJLLLLLL(8, view13);
            LLLZIL(8);
            View view14 = this.LLLFZ;
            if (view14 == null) {
                view14 = null;
            }
            C786410Ut5.LJLLLLLL(0, view14);
            C538480L9y c538480L9y4 = this.LLLI;
            if (c538480L9y4 == null) {
                c538480L9y4 = null;
            }
            c538480L9y4.setAnimListener(new InterfaceC538470L9x() { // from class: X.0KlZ
                @Override // X.InterfaceC538470L9x
                public final void LIZIZ() {
                }

                @Override // X.InterfaceC538470L9x
                public final void LIZJ() {
                }

                @Override // X.InterfaceC538470L9x
                public final void LIZLLL() {
                    C0P0T c0p0t = this.LIZ.LLLLL;
                    if (c0p0t != null) {
                        c0p0t.dismiss();
                    }
                }

                @Override // X.InterfaceC538470L9x
                public final void LIZ(boolean z) {
                    if (((Boolean) C0BTO.LIZ.getValue()).booleanValue()) {
                        C527950KnB.LIZ.getClass();
                        if (C527950KnB.LJ() && z) {
                            C526910KlV c526910KlV = this.LIZ;
                            Context contextRequireSceneContext = c526910KlV.requireSceneContext();
                            C526910KlV c526910KlV2 = this.LIZ;
                            C538480L9y c538480L9y5 = c526910KlV2.LLLI;
                            if (c538480L9y5 == null) {
                                c538480L9y5 = null;
                            }
                            c526910KlV.LLLLL = C0L4U.LJIIIZ(contextRequireSceneContext, c538480L9y5, "preview_page", c526910KlV2.LLLJIL);
                        }
                    }
                }
            });
            C1419810n3D.LIZJ(null);
            LLLZ();
            C527360KmE c527360KmE5 = this.LLLIIIL;
            if (c527360KmE5 == null) {
                c527360KmE5 = null;
            }
            C786410Ut5.va(c527360KmE5, new ACListenerS143S0100000_8(this, 69));
            ShortVideoContext shortVideoContext = this.LLLJIL;
            final boolean z = (shortVideoContext == null || (creativeModel = shortVideoContext.creativeModel) == null || (pUgcTemplateData = creativeModel.pugcTemplateData) == null || !pUgcTemplateData.isFromCreateTemplate) ? false : true;
            C538480L9y c538480L9y5 = this.LLLI;
            if (c538480L9y5 == null) {
                c538480L9y5 = null;
            }
            C786410Ut5.xa(c538480L9y5, new C19IN() { // from class: X.0KjF
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r4v0, types: [X.13BV] */
                /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Iterable, java.util.Collection, java.util.List] */
                /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList] */
                @Override // X.C19IN
                public final void LIZ(View view15) {
                    ?? arrayList;
                    CreativeInitialModel creativeInitialModel;
                    HighLightVideoParametersModel highLightVideoParametersModel;
                    CreativeInitialModel creativeInitialModel2;
                    HighLightVideoParametersModel highLightVideoParametersModel2;
                    CreativeModel creativeModel2;
                    CreativeInitialModel creativeInitialModel3;
                    HighLightVideoParametersModel highLightVideoParametersModel3;
                    CreativeModel creativeModel3;
                    CreativeInitialModel creativeInitialModel4;
                    HighLightVideoParametersModel highLightVideoParametersModel4;
                    ArrayList<TikTokMediaModel> arrayList2;
                    String str;
                    boolean z2;
                    ArrayList<TikTokMediaModel> arrayList3;
                    PreviewVideoScene previewVideoScene;
                    C527400KmI c527400KmI;
                    List<TikTokMediaModel> list;
                    TikTokMediaModel tikTokMediaModel;
                    PreviewVideoScene previewVideoScene2;
                    CreativeInitialModel creativeInitialModel5;
                    HighLightVideoParametersModel highLightVideoParametersModel5;
                    CreativeInitialModel creativeInitialModel6;
                    HighLightVideoParametersModel highLightVideoParametersModel6;
                    CreativeInitialModel creativeInitialModel7;
                    HighLightVideoParametersModel highLightVideoParametersModel7;
                    CreativeInitialModel creativeInitialModel8;
                    HighLightVideoParametersModel highLightVideoParametersModel8;
                    ArrayList<TikTokMediaModel> arrayList4;
                    EditorProModel editorProModel;
                    EventData eventData;
                    ArrayList<TikTokMediaModel> arrayList5;
                    C526910KlV c526910KlV = this.LLILZLL;
                    boolean z3 = false;
                    if (c526910KlV.LLLLIILL.isEnabledLayoutMode) {
                        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                        creativeToastBuilder.messageRes(2131828260);
                        creativeToastBuilder.isTuxToastLegacy(true);
                        C1390380mHk.LIZLLL(view15, 9005, creativeToastBuilder);
                        AbstractC529520Kpi abstractC529520Kpi = this.LLILZLL.LLLILZ;
                        if (abstractC529520Kpi != null && (arrayList5 = abstractC529520Kpi.LL) != null) {
                            if (!arrayList5.isEmpty()) {
                                Iterator<TikTokMediaModel> it2 = arrayList5.iterator();
                                while (it2.hasNext()) {
                                    if (!it2.next().LJIIJ()) {
                                        break;
                                    }
                                }
                                z3 = true;
                            } else {
                                z3 = true;
                            }
                        }
                        C522180Kds.LIZ.getClass();
                        C522180Kds.LIZIZ("preview_page", "autocut", !z3, true);
                        return;
                    }
                    ShortVideoContext shortVideoContext2 = c526910KlV.LLLJIL;
                    if (shortVideoContext2 != null) {
                        CreativeModel creativeModel4 = shortVideoContext2.creativeModel;
                        if (creativeModel4 != null && (eventData = creativeModel4.eventData) != null) {
                            eventData.fromAlbumBottomBtn = "autocut";
                        }
                        CreativeFlowData creativeFlowData = shortVideoContext2.creativeFlowData;
                        if (creativeFlowData != null && (editorProModel = creativeFlowData.getEditorProModel()) != null) {
                            editorProModel.setFromEditorProEntranceInAlbum(false);
                        }
                    }
                    AbstractC529520Kpi abstractC529520Kpi2 = this.LLILZLL.LLLILZ;
                    if (abstractC529520Kpi2 != null && (arrayList4 = abstractC529520Kpi2.LL) != null) {
                        arrayList = new ArrayList();
                        for (TikTokMediaModel tikTokMediaModel2 : arrayList4) {
                            if (tikTokMediaModel2.LJIIL()) {
                                arrayList.add(tikTokMediaModel2);
                            }
                        }
                    } else {
                        arrayList = C13BV.INSTANCE;
                    }
                    if (arrayList.isEmpty()) {
                        ShortVideoContext shortVideoContext3 = this.LLILZLL.LLLJIL;
                        if (shortVideoContext3 != null) {
                            CreativeModel creativeModel5 = shortVideoContext3.creativeModel;
                            if (creativeModel5 != null && (creativeInitialModel8 = creativeModel5.initialModel) != null && (highLightVideoParametersModel8 = creativeInitialModel8.highLightVideoParametersModel) != null) {
                                highLightVideoParametersModel8.albumFragmentIds = C13BV.INSTANCE;
                            }
                            CreativeModel creativeModel6 = shortVideoContext3.creativeModel;
                            if (creativeModel6 != null && (creativeInitialModel7 = creativeModel6.initialModel) != null && (highLightVideoParametersModel7 = creativeInitialModel7.highLightVideoParametersModel) != null) {
                                highLightVideoParametersModel7.albumFragmentTypes = C13BV.INSTANCE;
                            }
                            CreativeModel creativeModel7 = shortVideoContext3.creativeModel;
                            if (creativeModel7 != null && (creativeInitialModel6 = creativeModel7.initialModel) != null && (highLightVideoParametersModel6 = creativeInitialModel6.highLightVideoParametersModel) != null) {
                                highLightVideoParametersModel6.fromLiveRecordingsAlbum = false;
                            }
                            CreativeModel creativeModel8 = shortVideoContext3.creativeModel;
                            if (creativeModel8 != null && (creativeInitialModel5 = creativeModel8.initialModel) != null && (highLightVideoParametersModel5 = creativeInitialModel5.highLightVideoParametersModel) != null) {
                                highLightVideoParametersModel5.publisherIdentity = "";
                            }
                        }
                    } else {
                        ShortVideoContext shortVideoContext4 = this.LLILZLL.LLLJIL;
                        if (shortVideoContext4 != null && (creativeModel3 = shortVideoContext4.creativeModel) != null && (creativeInitialModel4 = creativeModel3.initialModel) != null && (highLightVideoParametersModel4 = creativeInitialModel4.highLightVideoParametersModel) != null) {
                            ArrayList arrayList6 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                            Iterator it3 = arrayList.iterator();
                            while (it3.hasNext()) {
                                arrayList6.add(((MediaModel) it3.next()).id);
                            }
                            highLightVideoParametersModel4.albumFragmentIds = arrayList6;
                        }
                        ShortVideoContext shortVideoContext5 = this.LLILZLL.LLLJIL;
                        if (shortVideoContext5 != null && (creativeModel2 = shortVideoContext5.creativeModel) != null && (creativeInitialModel3 = creativeModel2.initialModel) != null && (highLightVideoParametersModel3 = creativeInitialModel3.highLightVideoParametersModel) != null) {
                            ArrayList arrayList7 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                            Iterator it4 = arrayList.iterator();
                            while (it4.hasNext()) {
                                arrayList7.add(String.valueOf(((MediaModel) it4.next()).liveHighlightType));
                            }
                            highLightVideoParametersModel3.albumFragmentTypes = arrayList7;
                        }
                        ShortVideoContext shortVideoContext6 = this.LLILZLL.LLLJIL;
                        if (shortVideoContext6 != null) {
                            CreativeModel creativeModel9 = shortVideoContext6.creativeModel;
                            if (creativeModel9 != null && (creativeInitialModel2 = creativeModel9.initialModel) != null && (highLightVideoParametersModel2 = creativeInitialModel2.highLightVideoParametersModel) != null) {
                                highLightVideoParametersModel2.fromLiveRecordingsAlbum = true;
                            }
                            CreativeModel creativeModel10 = shortVideoContext6.creativeModel;
                            if (creativeModel10 != null && (creativeInitialModel = creativeModel10.initialModel) != null && (highLightVideoParametersModel = creativeInitialModel.highLightVideoParametersModel) != null) {
                                highLightVideoParametersModel.publisherIdentity = "anchor";
                            }
                        }
                    }
                    RecyclerView recyclerView5 = this.LLILZLL.LLJJL;
                    ArrayList<TikTokMediaModel> arrayList8 = null;
                    String str2 = null;
                    if (recyclerView5 == null) {
                        recyclerView5 = null;
                    }
                    AbstractC21673619ry adapter = recyclerView5.getAdapter();
                    if (adapter != null && adapter.getItemCount() == 0) {
                        C527270Km5 c527270Km5 = this.LLILZLL.LLJJIJI;
                        if (c527270Km5 == null) {
                            c527270Km5 = null;
                        }
                        PagerAdapter adapter2 = c527270Km5.getAdapter();
                        if ((adapter2 instanceof C527400KmI) && (c527400KmI = (C527400KmI) adapter2) != null && (list = c527400KmI.LLJIJIL) != null && (tikTokMediaModel = (TikTokMediaModel) C13LP.LJJJLZIJ(this.LLILZLL.LLLJ, list)) != null) {
                            C526910KlV c526910KlV2 = this.LLILZLL;
                            boolean z4 = z;
                            ChooseMediaViewModel chooseMediaViewModel2 = c526910KlV2.LLJJJJJIL;
                            if (chooseMediaViewModel2 == null) {
                                chooseMediaViewModel2 = null;
                            }
                            InterfaceC526970Klb interfaceC526970Klb = c526910KlV2.LLLLZIL;
                            if (interfaceC526970Klb != null && !interfaceC526970Klb.LJ(tikTokMediaModel)) {
                                return;
                            }
                            chooseMediaViewModel2.Kw2(tikTokMediaModel);
                            C527400KmI c527400KmI2 = c526910KlV2.LLJJIJIIJIL;
                            if (c527400KmI2 == null) {
                                c527400KmI2 = null;
                            }
                            C527270Km5 c527270Km52 = c526910KlV2.LLJJIJI;
                            if (c527270Km52 == null) {
                                c527270Km52 = null;
                            }
                            InterfaceC525540KjI interfaceC525540KjILJJIZ = c527400KmI2.LJJIZ(c527270Km52.getCurrentItem());
                            if ((interfaceC525540KjILJJIZ instanceof PreviewVideoScene) && (previewVideoScene2 = (PreviewVideoScene) interfaceC525540KjILJJIZ) != null) {
                                previewVideoScene2.LLLLLJLJLL();
                            }
                            c526910KlV2.LLLLLZL(null, Collections.singletonList(tikTokMediaModel));
                            C527340KmC c527340KmC = C527340KmC.LIZ;
                            ShortVideoContext shortVideoContext7 = c526910KlV2.LLLJIL;
                            if (shortVideoContext7 != null) {
                                str2 = shortVideoContext7.shootWay;
                            }
                            c527340KmC.getClass();
                            if (C527340KmC.LIZ(c526910KlV2.LLLLIILL.chooseSceneMode, C527340KmC.LIZJ(str2, z4))) {
                                boolean zLJIIJ = tikTokMediaModel.LJIIJ();
                                C522180Kds.LIZ.getClass();
                                C522180Kds.LIZIZ("preview_page", "autocut", !zLJIIJ, false);
                            }
                            c526910KlV2.saveRecordMusic();
                            C345210Dg7 c345210Dg7LIZIZ = C345220Dg8.LIZIZ();
                            if (tikTokMediaModel.LJIIL()) {
                                c345210Dg7LIZIZ.LIZ(new C534440Kxe(c526910KlV2.getSceneContext(), c526910KlV2));
                            }
                            c345210Dg7LIZIZ.LIZ(new C535450KzH());
                            c345210Dg7LIZIZ.LJ(C1697810uHb.LJ(tikTokMediaModel), new AwS587S0100000_8(c526910KlV2, 215));
                            return;
                        }
                        return;
                    }
                    this.LLILZLL.LLLZLZ(true);
                    C526910KlV c526910KlV3 = this.LLILZLL;
                    C527400KmI c527400KmI3 = c526910KlV3.LLJJIJIIJIL;
                    if (c527400KmI3 == null) {
                        c527400KmI3 = null;
                    }
                    C527270Km5 c527270Km53 = c526910KlV3.LLJJIJI;
                    if (c527270Km53 == null) {
                        c527270Km53 = null;
                    }
                    InterfaceC525540KjI interfaceC525540KjILJJIZ2 = c527400KmI3.LJJIZ(c527270Km53.getCurrentItem());
                    if ((interfaceC525540KjILJJIZ2 instanceof PreviewVideoScene) && (previewVideoScene = (PreviewVideoScene) interfaceC525540KjILJJIZ2) != null) {
                        previewVideoScene.LLLLLJLJLL();
                    }
                    C526910KlV c526910KlV4 = this.LLILZLL;
                    AbstractC529520Kpi abstractC529520Kpi3 = c526910KlV4.LLLILZ;
                    if (abstractC529520Kpi3 != null) {
                        arrayList2 = abstractC529520Kpi3.LL;
                    } else {
                        arrayList2 = null;
                    }
                    c526910KlV4.LLLLLZL(null, arrayList2);
                    C527340KmC c527340KmC2 = C527340KmC.LIZ;
                    boolean z5 = z;
                    ShortVideoContext shortVideoContext8 = this.LLILZLL.LLLJIL;
                    if (shortVideoContext8 != null) {
                        str = shortVideoContext8.shootWay;
                    } else {
                        str = null;
                    }
                    c527340KmC2.getClass();
                    if (C527340KmC.LIZ(this.LLILZLL.LLLLIILL.chooseSceneMode, C527340KmC.LIZJ(str, z5))) {
                        AbstractC529520Kpi abstractC529520Kpi4 = this.LLILZLL.LLLILZ;
                        if (abstractC529520Kpi4 != null && (arrayList3 = abstractC529520Kpi4.LL) != null) {
                            if (!arrayList3.isEmpty()) {
                                Iterator<TikTokMediaModel> it5 = arrayList3.iterator();
                                while (it5.hasNext()) {
                                    if (!it5.next().LJIIJ()) {
                                        z2 = false;
                                        break;
                                    }
                                }
                            }
                            z2 = true;
                            C522180Kds.LIZ.getClass();
                            C522180Kds.LIZIZ("preview_page", "autocut", !z2, false);
                        } else {
                            z2 = false;
                            C522180Kds.LIZ.getClass();
                            C522180Kds.LIZIZ("preview_page", "autocut", !z2, false);
                        }
                    }
                    this.LLILZLL.saveRecordMusic();
                    C345210Dg7 c345210Dg7LIZIZ2 = C345220Dg8.LIZIZ();
                    C526910KlV c526910KlV5 = this.LLILZLL;
                    if (!arrayList.isEmpty()) {
                        c345210Dg7LIZIZ2.LIZ(new C534440Kxe(c526910KlV5.getSceneContext(), c526910KlV5));
                    }
                    c345210Dg7LIZIZ2.LIZ(new C535450KzH());
                    C526910KlV c526910KlV6 = this.LLILZLL;
                    AbstractC529520Kpi abstractC529520Kpi5 = c526910KlV6.LLLILZ;
                    if (abstractC529520Kpi5 != null) {
                        arrayList8 = abstractC529520Kpi5.LL;
                    }
                    c345210Dg7LIZIZ2.LJ(arrayList8, new AwS587S0100000_8(c526910KlV6, 216));
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1100, 2);
                }
            });
        }
        ChooseMediaViewModel chooseMediaViewModel2 = this.LLJJJJJIL;
        if (chooseMediaViewModel2 == null) {
            chooseMediaViewModel2 = null;
        }
        BaseJediViewModel.iR2(chooseMediaViewModel2, this, new C2217381BqS() { // from class: X.0Klg
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((ChooseMediaState) obj).getPreviewDockerState();
            }
        }, new AwS587S0100000_8(this, 217));
        this.LLLIILIL = (C526940KlY) requireViewById(R.id.hix);
        InterfaceC526970Klb interfaceC526970Klb = this.LLLLZIL;
        if (interfaceC526970Klb != null && interfaceC526970Klb.LJI() == 5) {
            LLLLLLJ();
        }
        if (this.LLLLIILL.LIZ()) {
            View view15 = this.LLJLLIL;
            C786410Ut5.LJLLLLLL(8, view15 != null ? view15 : null);
        }
        LLLLL(this.LLLFF);
        LLLLL(this.LLLFFI);
    }

    public final void LLLLLLLLL() {
        C197039127h c197039127h;
        if (this.LLLLIILL.showUseEffectBtn && (c197039127h = this.LLLIL) != null) {
            c197039127h.LJJJJL(new AwS583S0100000_4(c197039127h, 121));
            c197039127h.setIconTintColorRes(R.attr.a04);
            c197039127h.setSupportClickWhenDisable(true);
            C786410Ut5.U8(c197039127h, new C580850MqJ(this, 1, 42));
            View view = this.LLLF;
            if (view == null) {
                view = null;
            }
            C786410Ut5.LJLLLLLL(8, view);
            LLLZIL(8);
            View view2 = this.LLLFZ;
            C786410Ut5.LJLLLLLL(0, view2 != null ? view2 : null);
            C197039127h c197039127h2 = this.LLLIIL;
            if (c197039127h2 != null) {
                C786410Ut5.LLLLLLJ(c197039127h2, 0);
            }
            LLZ(C527130Klr.LIZ);
        }
    }

    public final boolean LLLLLLLLLL() {
        List<TikTokMediaModel> listLIZJ;
        InterfaceC526970Klb interfaceC526970Klb = this.LLLLZIL;
        if (interfaceC526970Klb == null || (listLIZJ = interfaceC526970Klb.LIZJ()) == null) {
            listLIZJ = C13BV.INSTANCE;
        }
        if (listLIZJ.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (TikTokMediaModel tikTokMediaModel : listLIZJ) {
            if (tikTokMediaModel.LJIIJ()) {
                arrayList.add(tikTokMediaModel);
            }
        }
        return arrayList.size() == listLIZJ.size();
    }

    public final boolean LLLLLLLZIL() {
        ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfig = this.LLLLIILL;
        return choosePhotoPreviewPageConfig.isFromAutoCutAgent && !choosePhotoPreviewPageConfig.isFromAutoPickAddMedia;
    }

    public final boolean LLLLLLZ() {
        ArrayList<TikTokMediaModel> arrayList;
        AbstractC529520Kpi abstractC529520Kpi = this.LLLILZ;
        int size = (abstractC529520Kpi == null || (arrayList = abstractC529520Kpi.LL) == null) ? 0 : arrayList.size();
        C525090KiZ c525090KiZ = this.LLLL;
        if (c525090KiZ == null || !c525090KiZ.LIZJ()) {
            return false;
        }
        boolean z = size <= 1;
        C533790Kwb c533790Kwb = C533790Kwb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoPickPreview [isAutoPickMinCountReached] reached=");
        sbLIZ.append(z);
        sbLIZ.append(", dockSize=");
        sbLIZ.append(size);
        sbLIZ.append(", isFromAutoCutAgent=");
        sbLIZ.append(c525090KiZ.LIZ.isFromAutoCutAgent);
        sbLIZ.append(", isFromAutoPickAddMedia=");
        sbLIZ.append(c525090KiZ.LIZ.isFromAutoPickAddMedia);
        C201955140j.LJIILJJIL(c533790Kwb, C2188811AlT.LIZIZ(sbLIZ));
        return z;
    }

    public final boolean LLLLLLZZ() {
        return (this.LLLILZ instanceof C529530Kpj) && C0C64.LJIILLIIL().LJIIIZ(31744, "tt_template_select_material_optimization", true, false);
    }

    public final int LLLLZIL() {
        Integer numLIZJ;
        Integer numLIZJ2;
        Integer numLIZJ3;
        ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfig = this.LLLLIILL;
        AlbumNextButtonConfig albumNextButtonConfig = choosePhotoPreviewPageConfig.nextBtnConfig;
        if (albumNextButtonConfig != null) {
            Context sceneContext = getSceneContext();
            if (sceneContext == null || (numLIZJ3 = C1308910kAL.LIZJ(albumNextButtonConfig.nextBtnTitleColor, sceneContext)) == null) {
                return 0;
            }
            return numLIZJ3.intValue();
        }
        if (C522930Kf5.LIZIZ(choosePhotoPreviewPageConfig.chooseSceneMode)) {
            Context sceneContext2 = getSceneContext();
            if (sceneContext2 == null || (numLIZJ2 = C1308910kAL.LIZJ(R.attr.z_, sceneContext2)) == null) {
                return 0;
            }
            return numLIZJ2.intValue();
        }
        Context sceneContext3 = getSceneContext();
        if (sceneContext3 == null || (numLIZJ = C1308910kAL.LIZJ(R.attr.ee, sceneContext3)) == null) {
            return 0;
        }
        return numLIZJ.intValue();
    }

    public final void LLLLZLL() {
        int curPosition;
        C1DOT c1dotLLLLL;
        C1DOT c1dotLLLLL2;
        VEEditor vEEditorLIZIZ;
        if (this.LLLLLLIL) {
            this.LLLLLLLLLL.postAtTime(new ARunnableS108S0100000_8(this, 133), this, SystemClock.uptimeMillis() + ((long) this.LLLLLLLZIL));
            return;
        }
        C527400KmI c527400KmI = this.LLJJIJIIJIL;
        if (c527400KmI == null) {
            c527400KmI = null;
        }
        List<TikTokMediaModel> list = c527400KmI.LLJIJIL;
        C527270Km5 c527270Km5 = this.LLJJIJI;
        if (c527270Km5 == null) {
            c527270Km5 = null;
        }
        TikTokMediaModel tikTokMediaModel = (TikTokMediaModel) C13LP.LJJJLZIJ(c527270Km5.getCurrentItem(), list);
        if (tikTokMediaModel == null) {
            return;
        }
        if (this.LLLLIILL.isEditorProReplace || tikTokMediaModel.selectIndex != -1) {
            C527400KmI c527400KmI2 = this.LLJJIJIIJIL;
            if (c527400KmI2 == null) {
                c527400KmI2 = null;
            }
            C527270Km5 c527270Km52 = this.LLJJIJI;
            if (c527270Km52 == null) {
                c527270Km52 = null;
            }
            InterfaceC525540KjI interfaceC525540KjILJJIZ = c527400KmI2.LJJIZ(c527270Km52.getCurrentItem());
            PreviewVideoScene previewVideoScene = interfaceC525540KjILJJIZ instanceof PreviewVideoScene ? (PreviewVideoScene) interfaceC525540KjILJJIZ : null;
            if (previewVideoScene != null && (c1dotLLLLL = previewVideoScene.LLLLL()) != null && C1452440ntq.LIZ(c1dotLLLLL) && (c1dotLLLLL2 = previewVideoScene.LLLLL()) != null && (vEEditorLIZIZ = c1dotLLLLL2.LIZIZ()) != null) {
                curPosition = vEEditorLIZIZ.LLJLLIL.getCurPosition();
                if (curPosition >= 0) {
                }
                this.LLLLLLLLLL.postAtTime(new ARunnableS108S0100000_8(this, 133), this, SystemClock.uptimeMillis() + ((long) this.LLLLLLLZIL));
            }
            curPosition = 0;
            float f = (((long) curPosition) - ((long) this.LLLLLLJ)) / this.LLLLLLLLL;
            ViewTreeObserverOnGlobalLayoutListenerC526930KlX viewTreeObserverOnGlobalLayoutListenerC526930KlX = this.LLJLIL;
            ViewTreeObserverOnGlobalLayoutListenerC526930KlX viewTreeObserverOnGlobalLayoutListenerC526930KlX2 = viewTreeObserverOnGlobalLayoutListenerC526930KlX != null ? viewTreeObserverOnGlobalLayoutListenerC526930KlX : null;
            if (viewTreeObserverOnGlobalLayoutListenerC526930KlX2.LLILZIL && f <= 1.0f && f >= 0.0f) {
                ViewGroup.MarginLayoutParams marginLayoutParams = viewTreeObserverOnGlobalLayoutListenerC526930KlX2.LLILZLL;
                if (marginLayoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = viewTreeObserverOnGlobalLayoutListenerC526930KlX2.LLIZ;
                    marginLayoutParams.setMarginStart((marginLayoutParams2 != null ? marginLayoutParams2.getMarginStart() : 0) + ((int) (viewTreeObserverOnGlobalLayoutListenerC526930KlX2.getVScollCoverViewFromXml().getWidth() * f)));
                }
                C786410Ut5.c6(viewTreeObserverOnGlobalLayoutListenerC526930KlX2.getIvProgressLineFromXml(), viewTreeObserverOnGlobalLayoutListenerC526930KlX2.LLILZLL);
                viewTreeObserverOnGlobalLayoutListenerC526930KlX2.requestLayout();
            }
            this.LLLLLLLLLL.postAtTime(new ARunnableS108S0100000_8(this, 133), this, SystemClock.uptimeMillis() + ((long) this.LLLLLLLZIL));
        }
    }

    public final void LLLZ() {
        boolean z;
        List<TikTokMediaModel> listLIZJ;
        CreativeModel creativeModel;
        PUgcTemplateData pUgcTemplateData;
        ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfig = this.LLLLIILL;
        if (choosePhotoPreviewPageConfig.isFromAutoCutAgent || choosePhotoPreviewPageConfig.isFromAutoPickAddMedia) {
            z = true;
            C0L0H c0l0h = this.LLLII;
            if (c0l0h != null) {
                c0l0h.LIZIZ();
            }
        } else {
            z = false;
        }
        ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfig2 = this.LLLLIILL;
        if (choosePhotoPreviewPageConfig2.isFromAutoCutAgent || this.LLLI == null || this.LLLIIIL == null) {
            return;
        }
        ShortVideoContext shortVideoContext = this.LLLJIL;
        boolean zLJIIIIZZ = C0L4U.LJIIIIZZ(shortVideoContext, (shortVideoContext == null || (creativeModel = shortVideoContext.creativeModel) == null || (pUgcTemplateData = creativeModel.pugcTemplateData) == null || !pUgcTemplateData.isFromCreateTemplate) ? false : true, choosePhotoPreviewPageConfig2.chooseSceneMode);
        if (!z && zLJIIIIZZ) {
            CCDiversionEntConfig.LIZ.getClass();
            if (CCDiversionEntConfig.LIZIZ()) {
                LLZ(C527100Klo.LIZ);
                return;
            }
        }
        C197039127h c197039127h = this.LLLIIL;
        if (c197039127h != null) {
            C786410Ut5.LLLLLLJ(c197039127h, 0);
        }
        if (LLLLLLLLLL() || LLLLZLLLI()) {
            ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfig3 = this.LLLLIILL;
            if (choosePhotoPreviewPageConfig3.showUseEffectBtn) {
                LLZ(C527130Klr.LIZ);
                return;
            } else if (choosePhotoPreviewPageConfig3.showAutoCutBtn) {
                LLZ(C527090Kln.LIZ);
                return;
            } else {
                LLZ(C527120Klq.LIZ);
                return;
            }
        }
        ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfig4 = this.LLLLIILL;
        if (!choosePhotoPreviewPageConfig4.showEditorProBtn) {
            if (choosePhotoPreviewPageConfig4.showAutoCutBtn) {
                LLZ(C527090Kln.LIZ);
                return;
            }
            C538480L9y c538480L9y = this.LLLI;
            if (c538480L9y == null) {
                c538480L9y = null;
            }
            c538480L9y.LIZJ();
            return;
        }
        if (C0CHQ.LIZ().getAccountService().isLogin()) {
            if (LLLLLJIL() != null) {
                LLZ(C527110Klp.LIZ);
                return;
            }
            return;
        }
        InterfaceC526970Klb interfaceC526970Klb = this.LLLLZIL;
        if (interfaceC526970Klb == null || (listLIZJ = interfaceC526970Klb.LIZJ()) == null) {
            listLIZJ = C13BV.INSTANCE;
        }
        if (!listLIZJ.isEmpty()) {
            if (LLLLLLLLLL()) {
                LLZ(C527120Klq.LIZ);
                return;
            } else {
                LLZ(C527110Klp.LIZ);
                return;
            }
        }
        TikTokMediaModel tikTokMediaModelLLLLLJIL = LLLLLJIL();
        if (tikTokMediaModelLLLLLJIL != null) {
            if (tikTokMediaModelLLLLLJIL.LJIIJ()) {
                LLZ(C527120Klq.LIZ);
            } else if (tikTokMediaModelLLLLLJIL.LJIILJJIL()) {
                LLZ(C527110Klp.LIZ);
            }
        }
    }

    public final void LLLZLL() {
        Context contextLIZIZ;
        if (this.LLLL == null || (contextLIZIZ = C545820Lau.LIZIZ(this)) == null) {
            return;
        }
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.messageRes(2131833394);
        C1390380mHk.LIZJ(contextLIZIZ, 1062, creativeToastBuilder);
    }

    public final void LLLZZIL() {
        TextView textView = this.LLJJJ;
        if (textView == null) {
            textView = null;
        }
        C786410Ut5.LLIL(textView, 0);
        TextView textView2 = this.LLJJJJ;
        C786410Ut5.LLIL(textView2 != null ? textView2 : null, 0);
    }

    public final void LLZLLIL() {
        if (this.LLJLIL == null) {
            return;
        }
        C527400KmI c527400KmI = this.LLJJIJIIJIL;
        if (c527400KmI == null) {
            c527400KmI = null;
        }
        List<TikTokMediaModel> list = c527400KmI.LLJIJIL;
        C527270Km5 c527270Km5 = this.LLJJIJI;
        if (c527270Km5 == null) {
            c527270Km5 = null;
        }
        final TikTokMediaModel tikTokMediaModel = (TikTokMediaModel) C13LP.LJJJLZIJ(c527270Km5.getCurrentItem(), list);
        if (tikTokMediaModel == null) {
            return;
        }
        if (tikTokMediaModel.canClip) {
            ViewTreeObserverOnGlobalLayoutListenerC526930KlX viewTreeObserverOnGlobalLayoutListenerC526930KlX = this.LLJLIL;
            if (viewTreeObserverOnGlobalLayoutListenerC526930KlX == null) {
                viewTreeObserverOnGlobalLayoutListenerC526930KlX = null;
            }
            C786410Ut5.J0(viewTreeObserverOnGlobalLayoutListenerC526930KlX, 0);
        } else {
            ViewTreeObserverOnGlobalLayoutListenerC526930KlX viewTreeObserverOnGlobalLayoutListenerC526930KlX2 = this.LLJLIL;
            if (viewTreeObserverOnGlobalLayoutListenerC526930KlX2 == null) {
                viewTreeObserverOnGlobalLayoutListenerC526930KlX2 = null;
            }
            C786410Ut5.J0(viewTreeObserverOnGlobalLayoutListenerC526930KlX2, 8);
        }
        if (tikTokMediaModel.LJIIJ()) {
            return;
        }
        long j = tikTokMediaModel.duration;
        if (j > 0) {
            this.LLLLLLLLL = tikTokMediaModel.clipDuration;
            this.LLLLLLJ = tikTokMediaModel.startTime;
            this.LLLLLLL = j;
            TikTokMediaModel.Companion.getClass();
            this.LLLLLL = C527240Km2.LIZIZ(tikTokMediaModel);
            if (tikTokMediaModel.selectIndex >= 0 || this.LLLLIILL.isEditorProReplace) {
                String str = ((MediaModel) tikTokMediaModel).id;
                ViewTreeObserverOnGlobalLayoutListenerC526930KlX viewTreeObserverOnGlobalLayoutListenerC526930KlX3 = this.LLJLIL;
                if (viewTreeObserverOnGlobalLayoutListenerC526930KlX3 == null) {
                    viewTreeObserverOnGlobalLayoutListenerC526930KlX3 = null;
                }
                TikTokMediaModel currentSelectTimeMedia = viewTreeObserverOnGlobalLayoutListenerC526930KlX3.getCurrentSelectTimeMedia();
                if (!Intrinsics.LJFF(str, currentSelectTimeMedia != null ? ((MediaModel) currentSelectTimeMedia).id : null)) {
                    ViewTreeObserverOnGlobalLayoutListenerC526930KlX viewTreeObserverOnGlobalLayoutListenerC526930KlX4 = this.LLJLIL;
                    if (viewTreeObserverOnGlobalLayoutListenerC526930KlX4 == null) {
                        viewTreeObserverOnGlobalLayoutListenerC526930KlX4 = null;
                    }
                    viewTreeObserverOnGlobalLayoutListenerC526930KlX4.LLJIJIL = tikTokMediaModel;
                    C531250KsV c531250KsV = viewTreeObserverOnGlobalLayoutListenerC526930KlX4.LLJ;
                    if (c531250KsV == null) {
                        c531250KsV = null;
                    }
                    c531250KsV.LLILZ = tikTokMediaModel;
                    c531250KsV.LLLII(tikTokMediaModel.width, tikTokMediaModel.height);
                    c531250KsV.LLIZ.LIZ();
                    c531250KsV.notifyDataSetChanged();
                    TikTokMediaModel tikTokMediaModel2 = c531250KsV.LLILZ;
                    if (tikTokMediaModel2 != null) {
                        c531250KsV.LLLFZ(tikTokMediaModel2);
                    }
                    Iterator<TikTokMediaModel> it2 = c531250KsV.LLIZLLLIL.iterator();
                    while (it2.hasNext()) {
                        c531250KsV.LLLFZ(it2.next());
                    }
                }
            }
            ViewTreeObserverOnGlobalLayoutListenerC526930KlX viewTreeObserverOnGlobalLayoutListenerC526930KlX5 = this.LLJLIL;
            if (viewTreeObserverOnGlobalLayoutListenerC526930KlX5 == null) {
                viewTreeObserverOnGlobalLayoutListenerC526930KlX5 = null;
            }
            C786410Ut5.x3(viewTreeObserverOnGlobalLayoutListenerC526930KlX5.getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC581020Mqa(this, tikTokMediaModel, 0));
            ViewTreeObserverOnGlobalLayoutListenerC526930KlX viewTreeObserverOnGlobalLayoutListenerC526930KlX6 = this.LLJLIL;
            (viewTreeObserverOnGlobalLayoutListenerC526930KlX6 != null ? viewTreeObserverOnGlobalLayoutListenerC526930KlX6 : null).getScrollCoverView().setOnFrameCoverDragListener(new C0M4Y() { // from class: X.0KlW
                @Override // X.C0M4Y
                public final void LIZ() {
                    C526910KlV c526910KlV = this.LIZ;
                    c526910KlV.LLLLLLIL = true;
                    PreviewVideoScene previewVideoSceneLLLLLILLIL = c526910KlV.LLLLLILLIL();
                    if (previewVideoSceneLLLLLILLIL != null) {
                        previewVideoSceneLLLLLILLIL.LLLLLJLJLL();
                    }
                }

                @Override // X.C0M4Y
                public final void LIZIZ() {
                    C526910KlV c526910KlV = this.LIZ;
                    c526910KlV.LLLLLLIL = false;
                    TikTokMediaModel tikTokMediaModel3 = tikTokMediaModel;
                    int i = c526910KlV.LLLLLLJ;
                    tikTokMediaModel3.startTime = i;
                    tikTokMediaModel3.endTime = (int) (((long) i) + c526910KlV.LLLLLLLLL);
                    ((ArrayList) c526910KlV.LLLLZLLLI).add(tikTokMediaModel3);
                    PreviewVideoScene previewVideoSceneLLLLLILLIL = this.LIZ.LLLLLILLIL();
                    if (previewVideoSceneLLLLLILLIL != null) {
                        previewVideoSceneLLLLLILLIL.LLLLLLLLL(new Pair<>(Integer.valueOf(tikTokMediaModel.startTime), Integer.valueOf(tikTokMediaModel.endTime)));
                    }
                    PreviewVideoScene previewVideoSceneLLLLLILLIL2 = this.LIZ.LLLLLILLIL();
                    if (previewVideoSceneLLLLLILLIL2 != null) {
                        previewVideoSceneLLLLLILLIL2.LLLLLLIL();
                    }
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    ShortVideoContext shortVideoContext = this.LIZ.LLLJIL;
                    c2344009Gk.LJIIIIZZ("creation_id", shortVideoContext != null ? shortVideoContext.getCreationId() : null);
                    ShortVideoContext shortVideoContext2 = this.LIZ.LLLJIL;
                    c2344009Gk.LJIIIIZZ("shoot_way", shortVideoContext2 != null ? shortVideoContext2.shootWay : null);
                    ShortVideoContext shortVideoContext3 = this.LIZ.LLLJIL;
                    c2344009Gk.LJIIIIZZ("enter_from", shortVideoContext3 != null ? shortVideoContext3.enterFrom : null);
                    c2344009Gk.LJIIIIZZ("is_ugc_template", "1");
                    C20684815ws.LJIILLIIL("adjust_clip_previewpage", c2344009Gk.LIZ);
                }

                @Override // X.C0M4Y
                public final void LIZJ(int i, int i2, int i3) {
                    int i4;
                    float f;
                    float scrollRange;
                    int scrollRange2;
                    MediaModel mediaModel;
                    ViewTreeObserverOnGlobalLayoutListenerC526930KlX viewTreeObserverOnGlobalLayoutListenerC526930KlX7 = this.LIZ.LLJLIL;
                    ViewTreeObserverOnGlobalLayoutListenerC526930KlX viewTreeObserverOnGlobalLayoutListenerC526930KlX8 = null;
                    if (viewTreeObserverOnGlobalLayoutListenerC526930KlX7 == null) {
                        viewTreeObserverOnGlobalLayoutListenerC526930KlX7 = null;
                    }
                    boolean zLJ = C426750GoL.LJ(viewTreeObserverOnGlobalLayoutListenerC526930KlX7);
                    ViewTreeObserverOnGlobalLayoutListenerC526930KlX viewTreeObserverOnGlobalLayoutListenerC526930KlX9 = this.LIZ.LLJLIL;
                    if (viewTreeObserverOnGlobalLayoutListenerC526930KlX9 == null) {
                        viewTreeObserverOnGlobalLayoutListenerC526930KlX9 = null;
                    }
                    if (zLJ) {
                        i4 = -i3;
                    } else {
                        i4 = i3;
                    }
                    if (viewTreeObserverOnGlobalLayoutListenerC526930KlX9.LLILZIL) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = viewTreeObserverOnGlobalLayoutListenerC526930KlX9.LLIZ;
                        if (marginLayoutParams != null) {
                            marginLayoutParams.setMarginStart(marginLayoutParams.getMarginStart() + i4);
                        }
                        C0M4X realScrollViewFromXml = viewTreeObserverOnGlobalLayoutListenerC526930KlX9.getRealScrollViewFromXml();
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = viewTreeObserverOnGlobalLayoutListenerC526930KlX9.LLIZ;
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(realScrollViewFromXml);
                        realScrollViewFromXml.setLayoutParams(marginLayoutParams2);
                        viewTreeObserverOnGlobalLayoutListenerC526930KlX9.requestLayout();
                    }
                    if (zLJ) {
                        C526910KlV c526910KlV = this.LIZ;
                        MediaModel mediaModel2 = c526910KlV.LLLLLL;
                        if (mediaModel2 == null) {
                            mediaModel2 = null;
                        }
                        f = mediaModel2.duration;
                        ViewTreeObserverOnGlobalLayoutListenerC526930KlX viewTreeObserverOnGlobalLayoutListenerC526930KlX10 = c526910KlV.LLJLIL;
                        if (viewTreeObserverOnGlobalLayoutListenerC526930KlX10 == null) {
                            viewTreeObserverOnGlobalLayoutListenerC526930KlX10 = null;
                        }
                        scrollRange = viewTreeObserverOnGlobalLayoutListenerC526930KlX10.getScrollRange() - i2;
                        ViewTreeObserverOnGlobalLayoutListenerC526930KlX viewTreeObserverOnGlobalLayoutListenerC526930KlX11 = this.LIZ.LLJLIL;
                        if (viewTreeObserverOnGlobalLayoutListenerC526930KlX11 == null) {
                            viewTreeObserverOnGlobalLayoutListenerC526930KlX11 = null;
                        }
                        scrollRange2 = viewTreeObserverOnGlobalLayoutListenerC526930KlX11.getScrollRange();
                    } else {
                        C526910KlV c526910KlV2 = this.LIZ;
                        MediaModel mediaModel3 = c526910KlV2.LLLLLL;
                        if (mediaModel3 == null) {
                            mediaModel3 = null;
                        }
                        f = mediaModel3.duration;
                        scrollRange = i;
                        ViewTreeObserverOnGlobalLayoutListenerC526930KlX viewTreeObserverOnGlobalLayoutListenerC526930KlX12 = c526910KlV2.LLJLIL;
                        if (viewTreeObserverOnGlobalLayoutListenerC526930KlX12 == null) {
                            viewTreeObserverOnGlobalLayoutListenerC526930KlX12 = null;
                        }
                        scrollRange2 = viewTreeObserverOnGlobalLayoutListenerC526930KlX12.getScrollRange();
                    }
                    C526910KlV c526910KlV3 = this.LIZ;
                    int i5 = (int) (f * (scrollRange / scrollRange2));
                    c526910KlV3.LLLLLLJ = i5;
                    long j2 = i5;
                    MediaModel mediaModel4 = c526910KlV3.LLLLLL;
                    if (mediaModel4 == null) {
                        mediaModel = null;
                    } else {
                        mediaModel = mediaModel4;
                    }
                    long j3 = mediaModel.duration;
                    long j4 = c526910KlV3.LLLLLLLLL;
                    if (j2 >= j3 - j4) {
                        if (mediaModel4 == null) {
                            mediaModel4 = null;
                        }
                        c526910KlV3.LLLLLLJ = (int) (mediaModel4.duration - j4);
                    }
                    ViewTreeObserverOnGlobalLayoutListenerC526930KlX viewTreeObserverOnGlobalLayoutListenerC526930KlX13 = c526910KlV3.LLJLIL;
                    if (viewTreeObserverOnGlobalLayoutListenerC526930KlX13 != null) {
                        viewTreeObserverOnGlobalLayoutListenerC526930KlX8 = viewTreeObserverOnGlobalLayoutListenerC526930KlX13;
                    }
                    if (zLJ) {
                        i3 = -i3;
                    }
                    if (viewTreeObserverOnGlobalLayoutListenerC526930KlX8.LLILZIL) {
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = viewTreeObserverOnGlobalLayoutListenerC526930KlX8.LLILZLL;
                        if (marginLayoutParams3 != null) {
                            marginLayoutParams3.setMarginStart(marginLayoutParams3.getMarginStart() + i3);
                        }
                        C786410Ut5.c6(viewTreeObserverOnGlobalLayoutListenerC526930KlX8.getIvProgressLineFromXml(), viewTreeObserverOnGlobalLayoutListenerC526930KlX8.LLILZLL);
                        viewTreeObserverOnGlobalLayoutListenerC526930KlX8.requestLayout();
                    }
                }
            });
        }
    }

    @Override // X.InterfaceC568490MRj
    public final void LLZZ() {
        View view = this.LLJLLIL;
        if (view == null) {
            view = null;
        }
        LLLZLZ(view.getAlpha() == 0.0f);
    }

    @Override // X.InterfaceC568490MRj
    public final C531250KsV LLZZJLIL() {
        ViewTreeObserverOnGlobalLayoutListenerC526930KlX viewTreeObserverOnGlobalLayoutListenerC526930KlX = this.LLJLIL;
        if (viewTreeObserverOnGlobalLayoutListenerC526930KlX == null) {
            viewTreeObserverOnGlobalLayoutListenerC526930KlX = null;
        }
        return viewTreeObserverOnGlobalLayoutListenerC526930KlX.getPreviewVideoClipAdapter();
    }

    @Override // X.InterfaceC568490MRj
    public final void LLZZZIL() {
        ChooseMediaViewModel chooseMediaViewModel = this.LLJJJJJIL;
        if (chooseMediaViewModel == null) {
            chooseMediaViewModel = null;
        }
        List<TikTokMediaModel> list = this.LLLLZLLLI;
        chooseMediaViewModel.getClass();
        if (list != null) {
            chooseMediaViewModel.yR2(new AwS587S0100000_8(list, (List<MentionDataItem>) 203));
        }
    }

    @Override // X.InterfaceC568490MRj
    public final C531170KsN LLZZZZ() {
        ShortVideoContext shortVideoContext = this.LLLJIL;
        if (shortVideoContext == null) {
            return null;
        }
        return new C531170KsN(shortVideoContext.getCreationId(), shortVideoContext.shootWay, "upload");
    }

    @Override // X.InterfaceC568490MRj
    public final void onExit() {
        C19A3 c19a3;
        LLZL("onExit");
        if (LLLLLZ("onExit")) {
            if (LLLLLLLZIL() && !this.LLLLLZ) {
                this.LLLLLZ = true;
                C525160Kig c525160Kig = C525160Kig.LIZ;
                ShortVideoContext shortVideoContext = this.LLLJIL;
                EnumC538180L8u enumC538180L8u = EnumC538180L8u.CLICK_EXIT;
                c525160Kig.getClass();
                C525160Kig.LIZ(shortVideoContext, enumC538180L8u);
            }
            Scene scene = this.mParentScene;
            if (scene instanceof NavigationScene) {
                NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(this);
                if (navigationSceneLIZ != null) {
                    C560320LyI c560320LyI = new C560320LyI();
                    c560320LyI.LIZ = new C214798194i();
                    navigationSceneLIZ.LLLLLLIL(c560320LyI.LIZ());
                    return;
                }
                return;
            }
            if ((scene instanceof C19A3) && (c19a3 = (C19A3) scene) != null) {
                c19a3.remove(this);
            }
            ChooseMediaViewModel chooseMediaViewModel = this.LLJJJJJIL;
            ChooseMediaViewModel chooseMediaViewModel2 = chooseMediaViewModel != null ? chooseMediaViewModel : null;
            chooseMediaViewModel2.getClass();
            chooseMediaViewModel2.yR2(AFwS239S0000000_8.get$arr$(96));
        }
    }

    public final void saveRecordMusic() {
        CreativeModel creativeModel;
        ShortVideoContext shortVideoContext = this.LLLJIL;
        this.LLLLLIL = MusicBeanUtilKt.extractAVMusic((shortVideoContext == null || (creativeModel = shortVideoContext.creativeModel) == null) ? null : creativeModel.musicBuzModel);
        ShortVideoContext shortVideoContext2 = this.LLLJIL;
        this.LLLLLJIL = shortVideoContext2 != null ? shortVideoContext2.LJIIJ() : 0;
        ShortVideoContext shortVideoContext3 = this.LLLJIL;
        this.LLLLLILLIL = shortVideoContext3 != null ? shortVideoContext3.cameraComponentModel.mMusicPath : null;
        this.LLLLLJLJLL = shortVideoContext3 != null ? shortVideoContext3.cameraComponentModel.mMusicStart : 0;
    }

    public C526910KlV() {
        new C527180Klw();
        this.LLLLLLLLLL = new SafeHandler(this);
        this.LLLLLLLZIL = 16;
        this.LLLLZ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 321));
        this.LLLLZI = C452501pT.LIZIZ(new AwS552S0100000_8(this, 318));
        this.LLLLZLLLI = new ArrayList(C13BV.INSTANCE);
        this.LLLZ = true;
    }

    public final void LLLLZLLIL() {
        if (LLLLLLLZIL() && !this.LLLLLZ) {
            this.LLLLLZ = true;
            C525160Kig c525160Kig = C525160Kig.LIZ;
            ShortVideoContext shortVideoContext = this.LLLJIL;
            EnumC538180L8u enumC538180L8u = EnumC538180L8u.CLICK_EXIT;
            c525160Kig.getClass();
            C525160Kig.LIZ(shortVideoContext, enumC538180L8u);
        }
        Scene scene = this.mParentScene;
        if (!(scene instanceof SelectMaterialScene) && !(scene instanceof MaterialSelectScene)) {
            C1447800nmM.LIZIZ(this).onBackPressed();
            return;
        }
        LLZL("onBackPressed");
        if (LLLLLZ("onBackPressed")) {
            ((C19A3) this.mParentScene).remove(this);
            LLZZZIL();
            ChooseMediaViewModel chooseMediaViewModel = this.LLJJJJJIL;
            if (chooseMediaViewModel == null) {
                chooseMediaViewModel = null;
            }
            chooseMediaViewModel.getClass();
            chooseMediaViewModel.yR2(AFwS239S0000000_8.get$arr$(96));
        }
    }

    public final boolean LLLLZLLLI() {
        List<TikTokMediaModel> listLIZJ;
        TikTokMediaModel tikTokMediaModelLLLLLJIL = LLLLLJIL();
        if (tikTokMediaModelLLLLLJIL == null) {
            return false;
        }
        InterfaceC526970Klb interfaceC526970Klb = this.LLLLZIL;
        if (interfaceC526970Klb == null || (listLIZJ = interfaceC526970Klb.LIZJ()) == null) {
            listLIZJ = C13BV.INSTANCE;
        }
        return listLIZJ.isEmpty() && tikTokMediaModelLLLLLJIL.LJIIJ();
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroy() {
        C527400KmI c527400KmI;
        List<TikTokMediaModel> list;
        Activity activity;
        Window window;
        Integer numLIZJ;
        super.onDestroy();
        InterfaceC524950KiL interfaceC524950KiL = this.LLJJI;
        if (interfaceC524950KiL != null) {
            interfaceC524950KiL.T4(this);
            interfaceC524950KiL.b8(this);
        }
        C527270Km5 c527270Km5 = this.LLJJIJI;
        if (c527270Km5 == null) {
            c527270Km5 = null;
        }
        PagerAdapter adapter = c527270Km5.getAdapter();
        if (!(adapter instanceof C527400KmI) || (c527400KmI = (C527400KmI) adapter) == null || (list = c527400KmI.LLJIJIL) == null) {
            return;
        }
        C527270Km5 c527270Km52 = this.LLJJIJI;
        TikTokMediaModel tikTokMediaModel = (TikTokMediaModel) C13LP.LJJJLZIJ((c527270Km52 != null ? c527270Km52 : null).getCurrentItem(), list);
        if (tikTokMediaModel != null) {
            if (this.LLLLIILL.isEditorProReplace) {
                if (tikTokMediaModel.selectIndex >= 0) {
                    LLZLL(tikTokMediaModel);
                }
                if (tikTokMediaModel.selectIndex >= 0) {
                    C0LAB c0labLIZ = C375070EnB.LIZ((Bundle) this.LLLLZI.getValue(), String.valueOf(this.LLLLLLLLL));
                    if (c0labLIZ != null) {
                        C20684815ws.LJIILLIIL("choose_longer_video_replace_done", c0labLIZ.LIZ);
                        return;
                    }
                    return;
                }
                C0LAB c0labLIZ2 = C375070EnB.LIZ((Bundle) this.LLLLZI.getValue(), String.valueOf(this.LLLLLLLLL));
                if (c0labLIZ2 != null) {
                    C20684815ws.LJIILLIIL("choose_longer_video_replace_exit", c0labLIZ2.LIZ);
                }
            }
            if (!C522930Kf5.LIZIZ(this.LLLLIILL.chooseSceneMode) || (activity = this.mActivity) == null || (window = activity.getWindow()) == null) {
                return;
            }
            Context sceneContext = getSceneContext();
            window.setNavigationBarColor((sceneContext == null || (numLIZJ = C1308910kAL.LIZJ(R.attr.e1, sceneContext)) == null) ? -16777216 : numLIZJ.intValue());
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onPause() {
        super.onPause();
        C538480L9y c538480L9y = this.LLLI;
        if (c538480L9y != null) {
            c538480L9y.LIZ();
        }
        C0P0T c0p0t = this.LLLLL;
        if (c0p0t != null) {
            c0p0t.dismiss();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.0Kpi] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
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
    @Override // com.bytedance.scene.Scene
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C526910KlV.onResume():void");
    }

    @Override // X.InterfaceC568490MRj
    public final boolean LJJI() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC568490MRj
    public final ChoosePhotoPreviewPageConfig LLZZLLIL() {
        return this.LLLLIILL;
    }

    @Override // X.InterfaceC568490MRj
    public final void L1(int i) {
        if (this.LLLZ) {
            this.LLLZ = false;
            Activity activityRequireActivity = requireActivity();
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(i);
            creativeToastBuilder.isTuxToastLegacy(true);
            C1390380mHk.LIZ(activityRequireActivity, 3076, creativeToastBuilder);
            C12WG.LIZLLL(this, new ARunnableS108S0100000_8(this, 49), 2000L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0124  */
    @Override // X.InterfaceC568490MRj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(float r7) {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C526910KlV.LJIIIZ(float):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLIILL(java.util.List<com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel> r18) {
        /*
            Method dump skipped, instruction units count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C526910KlV.LLLLIILL(java.util.List):void");
    }

    public final void LLLLIL(int i) {
        if (i < 0) {
            return;
        }
        RecyclerView recyclerView = this.LLJJL;
        if (recyclerView == null) {
            recyclerView = null;
        }
        int i2 = i - 1;
        if (i2 <= 0) {
            i2 = 0;
        }
        recyclerView.scrollToPosition(i2);
    }

    public final boolean LLLLJ(TikTokMediaModel tikTokMediaModel) {
        boolean z;
        InterfaceC526970Klb interfaceC526970Klb = this.LLLLZIL;
        if (interfaceC526970Klb != null && interfaceC526970Klb.LIZ()) {
            z = true;
        } else {
            z = false;
        }
        InterfaceC526970Klb interfaceC526970Klb2 = this.LLLLZIL;
        if ((((interfaceC526970Klb2 == null || !interfaceC526970Klb2.LJII()) && tikTokMediaModel.selectIndex >= 0) || !z) && !C568500MRk.LIZJ(tikTokMediaModel)) {
            return false;
        }
        return true;
    }

    public final int LLLLJI(TikTokMediaModel tikTokMediaModel) {
        C527400KmI c527400KmI = this.LLJJIJIIJIL;
        if (c527400KmI == null) {
            c527400KmI = null;
        }
        List<TikTokMediaModel> list = c527400KmI.LLJIJIL;
        String str = ((MediaModel) tikTokMediaModel).id;
        if (str != null && str.length() > 0) {
            Iterator<TikTokMediaModel> it2 = list.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (Intrinsics.LJFF(((MediaModel) it2.next()).id, str)) {
                    if (i >= 0) {
                        return i;
                    }
                } else {
                    i++;
                }
            }
        }
        String strLJFF = tikTokMediaModel.LJFF();
        if (strLJFF != null && strLJFF.length() > 0) {
            String strLJIILLIIL = tikTokMediaModel.LJIILLIIL();
            int i2 = 0;
            for (TikTokMediaModel tikTokMediaModel2 : list) {
                if (Intrinsics.LJFF(tikTokMediaModel2.LJFF(), strLJFF) && (strLJIILLIIL == null || strLJIILLIIL.length() == 0 || Intrinsics.LJFF(tikTokMediaModel2.LJIILLIIL(), strLJIILLIIL))) {
                    return i2;
                }
                i2++;
            }
        }
        return -1;
    }

    public final void LLLLL(View view) {
        float fLIZIZ;
        GradientDrawable gradientDrawable;
        if (this.LLLLIILL.chooseSceneMode == 64) {
            fLIZIZ = C418440Gaw.LIZIZ(8);
        } else {
            fLIZIZ = C418440Gaw.LIZIZ(200);
        }
        Drawable background = null;
        if (view != null) {
            background = view.getBackground();
        }
        if ((background instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) background) != null) {
            gradientDrawable.setCornerRadius(fLIZIZ);
        }
    }

    public final boolean LLLLLZ(String str) {
        if (this.LLLLLZIL) {
            C533790Kwb c533790Kwb = C533790Kwb.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AutoPickPreview [PreviewRoot] skip duplicated exit source=");
            sbLIZ.append(str);
            C201955140j.LJIILJJIL(c533790Kwb, C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
        this.LLLLLZIL = true;
        return true;
    }

    public final Drawable LLLLZ(boolean z) {
        int i;
        int i2;
        Context contextRequireSceneContext = requireSceneContext();
        boolean zLIZIZ = C522930Kf5.LIZIZ(this.LLLLIILL.chooseSceneMode);
        AlbumNextButtonConfig albumNextButtonConfig = this.LLLLIILL.nextBtnConfig;
        if (albumNextButtonConfig != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(albumNextButtonConfig.nextBtnColor);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
            return c384050F3z.LIZ(contextRequireSceneContext);
        }
        if (zLIZIZ) {
            Drawable drawable = contextRequireSceneContext.getDrawable(R.drawable.a4a);
            if (drawable != null) {
                if (z) {
                    i2 = 255;
                } else {
                    i2 = 102;
                }
                drawable.setAlpha(i2);
                return drawable;
            }
            return null;
        }
        C384050F3z c384050F3z2 = new C384050F3z();
        if (z) {
            i = R.attr.a04;
        } else {
            i = R.attr.bt;
        }
        c384050F3z2.LIZIZ = Integer.valueOf(i);
        c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
        return c384050F3z2.LIZ(contextRequireSceneContext);
    }

    public final void LLLZI(boolean z) {
        if (getSceneContext() == null) {
            return;
        }
        if (!C529980KqS.LIZJ(this.LLLLIILL.chooseSceneMode) && !this.LLLLIILL.isFromEditorProAnchor) {
            TextView textViewLLLLLJLJLL = LLLLLJLJLL();
            if (textViewLLLLLJLJLL != null) {
                textViewLLLLLJLJLL.setBackground(LLLLZ(!z));
            }
            if (!z) {
                TextView textViewLLLLLJLJLL2 = LLLLLJLJLL();
                if (textViewLLLLLJLJLL2 != null) {
                    textViewLLLLLJLJLL2.setTextColor(LLLLZIL());
                }
            } else {
                TextView textViewLLLLLJLJLL3 = LLLLLJLJLL();
                if (textViewLLLLLJLJLL3 != null) {
                    textViewLLLLLJLJLL3.setTextColor(C960203pA.LIZ(R.attr.eh, requireSceneContext()));
                }
            }
        } else {
            TextView textViewLLLLLJLJLL4 = LLLLLJLJLL();
            if (textViewLLLLLJLJLL4 != null) {
                textViewLLLLLJLJLL4.setBackground(LLLLZ(true));
            }
            TextView textViewLLLLLJLJLL5 = LLLLLJLJLL();
            if (textViewLLLLLJLJLL5 != null) {
                textViewLLLLLJLJLL5.setTextColor(LLLLZIL());
            }
            if (z) {
                TextView textViewLLLLLJLJLL6 = LLLLLJLJLL();
                if (textViewLLLLLJLJLL6 != null) {
                    C786410Ut5.S4(0.5f, textViewLLLLLJLJLL6);
                }
            } else {
                TextView textViewLLLLLJLJLL7 = LLLLLJLJLL();
                if (textViewLLLLLJLJLL7 != null) {
                    C786410Ut5.S4(1.0f, textViewLLLLLJLJLL7);
                }
            }
        }
        LLLLL(LLLLLJLJLL());
        LLLLIIIILLL();
    }

    public final void LLLZIIL(float f) {
        if (LLLLLLZZ() || C522930Kf5.LIZIZ(this.LLLLIILL.chooseSceneMode)) {
            return;
        }
        int iLIZJ = (int) C12ES.LIZJ(f, requireSceneContext());
        View view = this.LLJLLIL;
        ViewGroup.LayoutParams layoutParams = null;
        if (view == null) {
            view = null;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        layoutParams2.height = iLIZJ;
        View view2 = this.LLJLLIL;
        if (view2 == null) {
            view2 = null;
        }
        C786410Ut5.W5(view2, layoutParams2);
        View view3 = this.LLJLLL;
        if (view3 != null && (layoutParams = view3.getLayoutParams()) != null) {
            layoutParams.height = iLIZJ;
        }
        View view4 = this.LLJLLL;
        if (view4 != null) {
            C786410Ut5.W5(view4, layoutParams);
        }
        View view5 = this.LLJLLL;
        if (view5 != null) {
            C786410Ut5.LJLLLLLL(0, view5);
        }
    }

    public final void LLLZIL(int i) {
        TextView textView = this.LLLFF;
        if (textView != null) {
            if (LLLLLLZZ() || this.LLLLIILL.LIZIZ()) {
                i = 8;
            }
            C786410Ut5.LLIL(textView, i);
        }
    }

    public final void LLLZLZ(boolean z) {
        TikTokMediaModel tikTokMediaModel;
        boolean z2;
        ArrayList<TikTokMediaModel> arrayList;
        InterfaceC526970Klb interfaceC526970Klb;
        C527400KmI c527400KmI;
        List<TikTokMediaModel> list;
        C533790Kwb c533790Kwb = C533790Kwb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoPickPreview [PreviewRoot] showOrHideBottomDocker: show=");
        sbLIZ.append(z);
        sbLIZ.append(", forceHideMediaRecyclerView=");
        sbLIZ.append(this.LLLLIILL.forceHideMediaRecyclerView);
        sbLIZ.append(", bottomDockMask.alpha=");
        View view = this.LLJLLIL;
        RecyclerView recyclerView = null;
        if (view == null) {
            view = null;
        }
        sbLIZ.append(view.getAlpha());
        C201955140j.LJIILJJIL(c533790Kwb, C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLLLIILL.forceHideMediaRecyclerView) {
            return;
        }
        View view2 = this.LLJLLIL;
        if (view2 == null) {
            view2 = null;
        }
        C423140GiW.LIZIZ(view2, z);
        C527270Km5 c527270Km5 = this.LLJJIJI;
        if (c527270Km5 == null) {
            c527270Km5 = null;
        }
        PagerAdapter adapter = c527270Km5.getAdapter();
        if ((adapter instanceof C527400KmI) && (c527400KmI = (C527400KmI) adapter) != null && (list = c527400KmI.LLJIJIL) != null) {
            C527270Km5 c527270Km52 = this.LLJJIJI;
            if (c527270Km52 == null) {
                c527270Km52 = null;
            }
            tikTokMediaModel = (TikTokMediaModel) C13LP.LJJJLZIJ(c527270Km52.getCurrentItem(), list);
        } else {
            tikTokMediaModel = null;
        }
        boolean z3 = true;
        if (C529980KqS.LIZJ(this.LLLLIILL.chooseSceneMode) && tikTokMediaModel != null && tikTokMediaModel.canClip) {
            ViewTreeObserverOnGlobalLayoutListenerC526930KlX viewTreeObserverOnGlobalLayoutListenerC526930KlX = this.LLJLIL;
            if (viewTreeObserverOnGlobalLayoutListenerC526930KlX == null) {
                viewTreeObserverOnGlobalLayoutListenerC526930KlX = null;
            }
            if (viewTreeObserverOnGlobalLayoutListenerC526930KlX.getCurrentSelectTimeMedia() != null && tikTokMediaModel.selectIndex > -1) {
                ViewTreeObserverOnGlobalLayoutListenerC526930KlX viewTreeObserverOnGlobalLayoutListenerC526930KlX2 = this.LLJLIL;
                if (viewTreeObserverOnGlobalLayoutListenerC526930KlX2 == null) {
                    viewTreeObserverOnGlobalLayoutListenerC526930KlX2 = null;
                }
                C423140GiW.LIZIZ(viewTreeObserverOnGlobalLayoutListenerC526930KlX2, z);
            }
        }
        AbstractC529520Kpi abstractC529520Kpi = this.LLLILZ;
        if (abstractC529520Kpi == null || (arrayList = abstractC529520Kpi.LL) == null || arrayList.isEmpty() || ((interfaceC526970Klb = this.LLLLZIL) != null && interfaceC526970Klb.LJI() == 5)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!C529980KqS.LIZJ(this.LLLLIILL.chooseSceneMode)) {
            ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfig = this.LLLLIILL;
            if (!choosePhotoPreviewPageConfig.isSoundSync && !choosePhotoPreviewPageConfig.isUgcTemplate && !choosePhotoPreviewPageConfig.LIZJ()) {
                ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfig2 = this.LLLLIILL;
                if (!choosePhotoPreviewPageConfig2.isEditorProReplace && !choosePhotoPreviewPageConfig2.isAutoCutSoundSyncMode) {
                    RecyclerView recyclerView2 = this.LLJJL;
                    if (recyclerView2 != null) {
                        recyclerView = recyclerView2;
                    }
                    if (!z || !z2) {
                        z3 = false;
                    }
                    C423140GiW.LIZIZ(recyclerView, z3);
                }
            }
        }
    }

    public final void LLLZZ(boolean z) {
        View view = null;
        RecyclerView recyclerView = null;
        if (z) {
            View view2 = this.LLJLL;
            if (view2 == null) {
                view2 = null;
            }
            C786410Ut5.LJLLLLLL(0, view2);
            ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfig = this.LLLLIILL;
            if (!choosePhotoPreviewPageConfig.isSoundSync && !choosePhotoPreviewPageConfig.isUgcTemplate && !choosePhotoPreviewPageConfig.LIZJ()) {
                ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfig2 = this.LLLLIILL;
                if (!choosePhotoPreviewPageConfig2.isEditorProReplace && !choosePhotoPreviewPageConfig2.isAutoCutSoundSyncMode && !choosePhotoPreviewPageConfig2.forceHideMediaRecyclerView) {
                    return;
                }
            }
            RecyclerView recyclerView2 = this.LLJJL;
            if (recyclerView2 != null) {
                recyclerView = recyclerView2;
            }
            C786410Ut5.LLIZLLLIL(recyclerView, 8);
            return;
        }
        View view3 = this.LLJLL;
        if (view3 != null) {
            view = view3;
        }
        C786410Ut5.LJLLLLLL(8, view);
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLZ(X.AbstractC527030Klh r15) {
        /*
            Method dump skipped, instruction units count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C526910KlV.LLZ(X.0Klh):void");
    }

    public final void LLZL(String str) {
        String strLIZIZ;
        if (this.LLLLLZL) {
            return;
        }
        this.LLLLLZL = true;
        ChooseMediaViewModel chooseMediaViewModel = null;
        List listLLZIL = LLZIL(this, "preview_exit", null, null, 6);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("previewBackToAlbum=true ");
        if (this.LLLL == null || (strLIZIZ = C525090KiZ.LIZIZ(listLLZIL)) == null) {
            strLIZIZ = "helper=null";
        }
        sbLIZ.append(strLIZIZ);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
        if (this.LLLL != null) {
            C525090KiZ.LIZLLL(str, strLIZIZ2);
        }
        ChooseMediaViewModel chooseMediaViewModel2 = this.LLJJJJJIL;
        if (chooseMediaViewModel2 != null) {
            chooseMediaViewModel = chooseMediaViewModel2;
        }
        chooseMediaViewModel.LLJILJILJ = true;
    }

    public final void LLZLI(List<? extends TikTokMediaModel> list) {
        ViewTreeObserverOnGlobalLayoutListenerC526930KlX viewTreeObserverOnGlobalLayoutListenerC526930KlX;
        ArrayList<MediaModel> arrayList = new ArrayList();
        Integer[] numArr = new Integer[2];
        C527270Km5 c527270Km5 = this.LLJJIJI;
        if (c527270Km5 == null) {
            c527270Km5 = null;
        }
        numArr[0] = Integer.valueOf(c527270Km5.getCurrentItem() - 1);
        C527270Km5 c527270Km52 = this.LLJJIJI;
        if (c527270Km52 == null) {
            c527270Km52 = null;
        }
        numArr[1] = Integer.valueOf(c527270Km52.getCurrentItem() + 1);
        Iterator it2 = C1697810uHb.LJIIJJI(numArr).iterator();
        while (it2.hasNext()) {
            MediaModel mediaModel = (MediaModel) C13LP.LJJJLZIJ(((Number) it2.next()).intValue(), list);
            if (mediaModel != null && mediaModel.LJIILJJIL()) {
                arrayList.add(mediaModel);
            }
        }
        if (!arrayList.isEmpty()) {
            ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfig = this.LLLLIILL;
            if ((choosePhotoPreviewPageConfig.isUgcTemplate || choosePhotoPreviewPageConfig.isEditorProReplace) && (viewTreeObserverOnGlobalLayoutListenerC526930KlX = this.LLJLIL) != null) {
                viewTreeObserverOnGlobalLayoutListenerC526930KlX.getClass();
                for (MediaModel mediaModel2 : arrayList) {
                    if (mediaModel2.LJFF() != null) {
                        C531250KsV c531250KsV = viewTreeObserverOnGlobalLayoutListenerC526930KlX.LLJ;
                        if (c531250KsV == null) {
                            c531250KsV = null;
                        }
                        c531250KsV.LLIZLLLIL.add((TikTokMediaModel) mediaModel2);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLZLL(com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel r12) {
        /*
            Method dump skipped, instruction units count: 732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C526910KlV.LLZLL(com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel):void");
    }

    @Override // X.InterfaceC568490MRj
    public final void a(TikTokMediaModel tikTokMediaModel) {
        ArrayList<TikTokMediaModel> arrayList;
        if (tikTokMediaModel == null) {
            return;
        }
        C527400KmI c527400KmI = this.LLJJIJIIJIL;
        if (c527400KmI == null) {
            c527400KmI = null;
        }
        C525050KiV.LIZIZ(tikTokMediaModel, c527400KmI.LLJIJIL);
        AbstractC529520Kpi abstractC529520Kpi = this.LLLILZ;
        if (abstractC529520Kpi != null && (arrayList = abstractC529520Kpi.LL) != null) {
            C525050KiV.LIZIZ(tikTokMediaModel, arrayList);
        }
        AbstractC529520Kpi abstractC529520Kpi2 = this.LLLILZ;
        if (abstractC529520Kpi2 != null) {
            abstractC529520Kpi2.LLLLIIL(Collections.singletonList(tikTokMediaModel));
        }
        ChooseMediaViewModel chooseMediaViewModel = this.LLJJJJJIL;
        if (chooseMediaViewModel == null) {
            chooseMediaViewModel = null;
        }
        chooseMediaViewModel.zR2(tikTokMediaModel);
        chooseMediaViewModel.yR2(new AwS587S0100000_8(tikTokMediaModel, 205));
        LLZIL(this, "live_photo_state_changed", null, tikTokMediaModel, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        String string;
        boolean z;
        CreativeInfo creativeInfo;
        boolean z2;
        final AbstractC529520Kpi abstractC529520Kpi;
        LinearLayout linearLayout;
        final boolean z3;
        String string2;
        float f;
        int iLIZIZ;
        int i;
        C0L97 c0l97;
        int[] iArr;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i2;
        View view;
        super.onActivityCreated(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || (string = bundle2.getString("preview_title")) == null) {
            string = "";
        }
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            this.LLLJIL = (ShortVideoContext) bundle3.getParcelable("key_short_video_context");
            this.LLLLIILLL = bundle3.getBoolean("from_album_thumbnail");
        }
        C533790Kwb c533790Kwb = C533790Kwb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoPickPreview [PreviewRoot] onActivityCreated: canShowDock=");
        sbLIZ.append(this.LLLLIILL.showDockInPreviewPage);
        sbLIZ.append(", showDockInPreviewPage=");
        sbLIZ.append(this.LLLLIILL.showDockInPreviewPage);
        sbLIZ.append(", isFromAutoCutAgent=");
        sbLIZ.append(this.LLLLIILL.isFromAutoCutAgent);
        sbLIZ.append(", title=");
        sbLIZ.append(string);
        sbLIZ.append(", forceHideMediaRecyclerView=");
        sbLIZ.append(this.LLLLIILL.forceHideMediaRecyclerView);
        C201955140j.LJIILJJIL(c533790Kwb, C2188811AlT.LIZIZ(sbLIZ));
        ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfig = this.LLLLIILL;
        int i3 = 0;
        if (choosePhotoPreviewPageConfig.isFromAutoCutAgent && !choosePhotoPreviewPageConfig.isFromAutoPickAddMedia && string.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        ITemplateDebugService iTemplateDebugService = (ITemplateDebugService) PluggableExtentionKt.pluggableSpi$default(ITemplateDebugService.class, false, false, false, 14, null);
        if (iTemplateDebugService != null) {
            iTemplateDebugService.LJ();
        }
        Activity activityRequireActivity = requireActivity();
        C1654320t9S.LIZIZ(this, AFwS239S0000000_8.get$arr$(334));
        C1664590tQ1.LIZLLL(this, "PreviewRootScene", false, new AwS374S0200000_8(activityRequireActivity, this, 205), 2);
        C1664600tQ2.LIZ(this, "PreviewRootScene", new AwS587S0100000_8(this, 709));
        this.LLJJJ = (TextView) requireViewById(R.id.kkz);
        TextView textView = (TextView) requireViewById(R.id.xyy);
        this.LLJJJJ = textView;
        if (textView == null) {
            textView = null;
        }
        textView.setShadowLayer(C418440Gaw.LIZIZ(3), 0.0f, C418440Gaw.LIZIZ(1), ColorProtector.parseColor("#33000000"));
        ImageView imageView = (ImageView) requireViewById(R.id.bn2);
        this.LLJJJIL = imageView;
        if (imageView == null) {
            imageView = null;
        }
        C786410Ut5.Q7(imageView, new ACListenerS143S0100000_8(this, 66));
        this.LLJJJJLIIL = (ViewGroup) requireViewById(R.id.ul0);
        TextView textView2 = this.LLJJJ;
        if (textView2 == null) {
            textView2 = null;
        }
        int iLIZJ = (int) C12ES.LIZJ(20.0f, requireActivity());
        ViewParent parent = textView2.getParent();
        if ((parent instanceof View) && (view = (View) parent) != null) {
            HandlerHook.viewPost(view, new ARunnableS13S0101000_1(iLIZJ, textView2, 2));
        }
        ViewGroup viewGroup = this.LLJJJJLIIL;
        if (viewGroup == null) {
            viewGroup = null;
        }
        C786410Ut5.K7(viewGroup, new AkS80S0100000_8(this, 5));
        boolean z4 = this.LLLLIILL.showDockInPreviewPage;
        ShortVideoContext shortVideoContext = this.LLLJIL;
        if (shortVideoContext == null || (creativeInfo = shortVideoContext.creativeInfo) == null) {
            creativeInfo = new CreativeInfo(null, i3, null == true ? 1 : 0, 7, null == true ? 1 : 0);
        }
        C527400KmI c527400KmI = new C527400KmI(this, this, z4, creativeInfo);
        c527400KmI.LLJILJIL = this.LLLLZLL;
        c527400KmI.LLJILJILJ = this.LLLLZLLIL;
        this.LLJJIJIIJIL = c527400KmI;
        C527270Km5 c527270Km5 = (C527270Km5) requireViewById(R.id.view_pager);
        this.LLJJIJI = c527270Km5;
        if (c527270Km5 == null) {
            c527270Km5 = null;
        }
        C527400KmI c527400KmI2 = this.LLJJIJIIJIL;
        if (c527400KmI2 == null) {
            c527400KmI2 = null;
        }
        c527270Km5.setAdapter(c527400KmI2);
        this.LLJJJJJIL = (ChooseMediaViewModel) C1659640tI2.LIZLLL(this).LIZ(ChooseMediaViewModel.class);
        ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfig2 = this.LLLLIILL;
        ChooseMediaViewModel chooseMediaViewModel = this.LLJJJJJIL;
        if (chooseMediaViewModel == null) {
            chooseMediaViewModel = null;
        }
        this.LLLL = new C525090KiZ(choosePhotoPreviewPageConfig2, chooseMediaViewModel);
        if (choosePhotoPreviewPageConfig2.showDockInPreviewPage) {
            ImageView imageView2 = this.LLJJJIL;
            if (imageView2 == null) {
                imageView2 = null;
            }
            C786410Ut5.LJZI(8, imageView2);
            if (this.LLLLIILL.LIZIZ()) {
                ViewGroup viewGroup2 = this.LLJJJJLIIL;
                if (viewGroup2 == null) {
                    viewGroup2 = null;
                }
                C786410Ut5.LJLZ(0, viewGroup2);
                LLLZZIL();
            } else {
                ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfig3 = this.LLLLIILL;
                if (!choosePhotoPreviewPageConfig3.showAutoCutBtn && !choosePhotoPreviewPageConfig3.showEditorProBtn && !choosePhotoPreviewPageConfig3.showUseEffectBtn) {
                    TextView textView3 = this.LLJJJ;
                    if (textView3 == null) {
                        textView3 = null;
                    }
                    C786410Ut5.LLIL(textView3, 8);
                    ViewGroup viewGroup3 = this.LLJJJJLIIL;
                    if (viewGroup3 == null) {
                        viewGroup3 = null;
                    }
                    C786410Ut5.LJLZ(8, viewGroup3);
                }
            }
            LLLLLLL();
            if (z) {
                ViewGroup viewGroup4 = this.LLJJJJLIIL;
                if (viewGroup4 == null) {
                    viewGroup4 = null;
                }
                C786410Ut5.LJLZ(8, viewGroup4);
                TuxTextView tuxTextView = this.LLL;
                if (tuxTextView != null) {
                    C786410Ut5.LLLLZLL(tuxTextView, 0);
                }
                TuxTextView tuxTextView2 = this.LLL;
                if (tuxTextView2 != null) {
                    tuxTextView2.setText(string);
                }
            }
            if (this.LLLLIILL.isFromAutoCutAgent) {
                RecyclerView recyclerView = this.LLJJL;
                if (recyclerView == null) {
                    recyclerView = null;
                }
                recyclerView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
                boolean zLIZ = C0C1J.LIZ();
                View view2 = this.LLLF;
                if (view2 == null) {
                    view2 = null;
                }
                C786410Ut5.LJLLLLLL(8, view2);
                LLLZIL(8);
                C0L0H c0l0h = this.LLLII;
                if (c0l0h != null) {
                    c0l0h.LIZIZ();
                }
                C538480L9y c538480L9y = this.LLLI;
                if (c538480L9y == null) {
                    c538480L9y = null;
                }
                c538480L9y.LIZJ();
                C527360KmE c527360KmE = this.LLLIIIL;
                if (c527360KmE == null) {
                    c527360KmE = null;
                }
                c527360KmE.LIZ();
                C197039127h c197039127h = this.LLLIL;
                if (c197039127h != null) {
                    C786410Ut5.LLLLLLJ(c197039127h, 8);
                }
                C197039127h c197039127h2 = this.LLLIIL;
                if (c197039127h2 != null) {
                    if (zLIZ) {
                        i2 = 0;
                    } else {
                        i2 = 8;
                    }
                    C786410Ut5.LLLLLLJ(c197039127h2, i2);
                }
                View view3 = this.LLLFZ;
                if (view3 == null) {
                    view3 = null;
                }
                if ((view3 instanceof LinearLayout) && (linearLayout = (LinearLayout) view3) != null) {
                    C786410Ut5.LJZL(0, linearLayout);
                    ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                    if ((layoutParams instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                        marginLayoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                        marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
                        marginLayoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
                        marginLayoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                    }
                    linearLayout.requestLayout();
                    Context context = linearLayout.getContext();
                    if (zLIZ) {
                        LLLLIIIILLL();
                    }
                    AutoPickServiceApi autoPickServiceApi = (AutoPickServiceApi) PluggableExtentionKt.pluggableSpi$default(AutoPickServiceApi.class, false, false, false, 14, null);
                    if (autoPickServiceApi != null && autoPickServiceApi.LJII()) {
                        z3 = true;
                        Integer numValueOf = Integer.valueOf(C786410Ut5.n3(context.getResources(), "pickForMe_album_pickingModal_ctaAutoCut", "string", context.getPackageName()));
                        if (numValueOf.intValue() == 0 || (string2 = context.getString(numValueOf.intValue())) == null) {
                            string2 = "AI AutoCut";
                        }
                    } else {
                        z3 = false;
                        string2 = context.getString(R.string.creation_autocut_entry_point);
                    }
                    C197039127h c197039127h3 = this.LLLIIIIL;
                    if (c197039127h3 != null) {
                        C786410Ut5.LLLLLLJ(c197039127h3, 0);
                        if (zLIZ) {
                            f = 1.0f;
                        } else {
                            i3 = -1;
                            f = 0.0f;
                        }
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i3, -1, f);
                        if (zLIZ) {
                            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                        } else {
                            iLIZIZ = 0;
                        }
                        layoutParams2.setMarginEnd(iLIZIZ);
                        C786410Ut5.J6(c197039127h3, layoutParams2);
                        c197039127h3.setText(string2);
                        c197039127h3.LJJLI(true);
                        if (z3) {
                            i = R.raw.icon_ai_autocut;
                        } else {
                            i = R.raw.icon_autocut_clapperboard;
                        }
                        c197039127h3.setButtonStartIcon(Integer.valueOf(i));
                        if (z3) {
                            if (zLIZ) {
                                c0l97 = C0L97.GRADIENT_SOFT;
                            } else {
                                c0l97 = C0L97.GRADIENT_LEGACY;
                            }
                        } else if (zLIZ) {
                            c0l97 = C0L97.SECONDARY_AUTO_CUT_BTN;
                        } else {
                            c0l97 = C0L97.PRIMARY_RED;
                        }
                        int i4 = C526960Kla.LIZ[c0l97.ordinal()];
                        int iIntValue = -16777216;
                        if (i4 != 1 && i4 != 2) {
                            if (i4 != 3) {
                                if (i4 == 4) {
                                    c197039127h3.setButtonVariant(0);
                                } else {
                                    throw new C1954807lC();
                                }
                            } else {
                                c197039127h3.LJJJJL(new AwS587S0100000_8(context, 707));
                                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.z_, context);
                                if (numLIZJ != null) {
                                    iIntValue = numLIZJ.intValue();
                                }
                                c197039127h3.setTextColor(iIntValue);
                                c197039127h3.setIconTintColor(-119723);
                            }
                        } else {
                            if (zLIZ) {
                                if (C960203pA.LIZIZ(context)) {
                                    iArr = C527140Kls.LIZJ;
                                } else {
                                    iArr = C527140Kls.LIZIZ;
                                }
                            } else {
                                iArr = C527140Kls.LIZ;
                            }
                            c197039127h3.LJJJJL(new AwS58S0210000_4(context, zLIZ, iArr, 3));
                            c197039127h3.setIconTintColorRes(R.attr.z_);
                            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.asr, context);
                            if (numLIZJ2 != null) {
                                iIntValue = numLIZJ2.intValue();
                            }
                            c197039127h3.setTextColor(iIntValue);
                        }
                        C786410Ut5.U8(c197039127h3, new View.OnClickListener() { // from class: X.0Kif
                            /* JADX WARN: Type inference failed for: r0v28, types: [X.09AY, kotlin.jvm.functions.Function1] */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view4) {
                                String strLIZIZ;
                                String str;
                                String creationId;
                                boolean z5;
                                EnumC538180L8u enumC538180L8u;
                                String creationId2;
                                String str2;
                                CreativeModel creativeModel;
                                AutoPickModel autoPickModel;
                                String str3 = null;
                                List listLLZIL = C526910KlV.LLZIL(this.LL, "preview_ai_autocut", null, null, 6);
                                C526910KlV c526910KlV = this.LL;
                                if (c526910KlV.LLLL == null || (strLIZIZ = C525090KiZ.LIZIZ(listLLZIL)) == null) {
                                    strLIZIZ = "helper=null";
                                }
                                if (c526910KlV.LLLL != null) {
                                    C525090KiZ.LIZLLL("aiAutoCutClick", strLIZIZ);
                                }
                                if (this.LL.LLLLIILL.isFromAutoPickAddMedia) {
                                    str = "upload_preview_page";
                                } else {
                                    str = "aipick_edit_page";
                                }
                                if (z3) {
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("[path=");
                                    sbLIZ2.append(str);
                                    sbLIZ2.append("][source=PreviewRootScene.aiAutoCutBtn] media_count=");
                                    sbLIZ2.append(listLLZIL.size());
                                    sbLIZ2.append(" creation_id=");
                                    ShortVideoContext shortVideoContext2 = this.LL.LLLJIL;
                                    if (shortVideoContext2 != null) {
                                        creationId2 = shortVideoContext2.getCreationId();
                                    } else {
                                        creationId2 = null;
                                    }
                                    sbLIZ2.append(creationId2);
                                    sbLIZ2.append(" shoot_way=");
                                    ShortVideoContext shortVideoContext3 = this.LL.LLLJIL;
                                    if (shortVideoContext3 != null) {
                                        str3 = shortVideoContext3.shootWay;
                                    }
                                    sbLIZ2.append(str3);
                                    C201955140j.LIZIZ("ttcrt_click_ai_autocut", C2188811AlT.LIZIZ(sbLIZ2));
                                    ShortVideoContext shortVideoContext4 = this.LL.LLLJIL;
                                    if (shortVideoContext4 == null || (creativeModel = shortVideoContext4.creativeModel) == null || (autoPickModel = creativeModel.autoPickModel) == null || (str2 = autoPickModel.pickId) == null) {
                                        str2 = "";
                                    }
                                    C525130Kid.LIZIZ(str, shortVideoContext4, str2);
                                } else {
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append("[path=");
                                    sbLIZ3.append(str);
                                    sbLIZ3.append("][source=PreviewRootScene.aiAutoCutBtn] media_count=");
                                    sbLIZ3.append(listLLZIL.size());
                                    sbLIZ3.append(" creation_id=");
                                    ShortVideoContext shortVideoContext5 = this.LL.LLLJIL;
                                    if (shortVideoContext5 != null) {
                                        creationId = shortVideoContext5.getCreationId();
                                    } else {
                                        creationId = null;
                                    }
                                    sbLIZ3.append(creationId);
                                    sbLIZ3.append(" shoot_way=");
                                    ShortVideoContext shortVideoContext6 = this.LL.LLLJIL;
                                    if (shortVideoContext6 != null) {
                                        str3 = shortVideoContext6.shootWay;
                                    }
                                    sbLIZ3.append(str3);
                                    C201955140j.LIZIZ("click_autocut", C2188811AlT.LIZIZ(sbLIZ3));
                                    this.LL.LLLLLZL(str, listLLZIL);
                                }
                                if (this.LL.LLLLLLLZIL()) {
                                    if (z3) {
                                        enumC538180L8u = EnumC538180L8u.CLICK_AI_AUTOCUT;
                                    } else {
                                        enumC538180L8u = EnumC538180L8u.CLICK_AUTOCUT;
                                    }
                                    C525160Kig c525160Kig = C525160Kig.LIZ;
                                    ShortVideoContext shortVideoContext7 = this.LL.LLLJIL;
                                    c525160Kig.getClass();
                                    C525160Kig.LIZ(shortVideoContext7, enumC538180L8u);
                                }
                                C533790Kwb c533790Kwb2 = C533790Kwb.LIZIZ;
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append("AutoPickPreview [PreviewRoot] AI AutoCut clicked, callback=");
                                if (this.LL.LLLILZLLLI != null) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                sbLIZ4.append(z5);
                                sbLIZ4.append(", currentMediaCount=");
                                sbLIZ4.append(listLLZIL.size());
                                C201955140j.LJIILJJIL(c533790Kwb2, C2188811AlT.LIZIZ(sbLIZ4));
                                ?? r0 = this.LL.LLLILZLLLI;
                                if (r0 != 0) {
                                    r0.invoke(listLLZIL);
                                }
                            }
                        });
                    }
                    LLLZIIL(64.0f);
                }
            }
        }
        if (LLLLLLLZIL() && !this.LLLLLLZZ) {
            this.LLLLLLZZ = true;
            C525160Kig c525160Kig = C525160Kig.LIZ;
            ShortVideoContext shortVideoContext2 = this.LLLJIL;
            EnumC538180L8u enumC538180L8u = EnumC538180L8u.SHOW;
            c525160Kig.getClass();
            C525160Kig.LIZ(shortVideoContext2, enumC538180L8u);
        }
        TextView textView4 = this.LLJJJJ;
        if (textView4 == null) {
            textView4 = null;
        }
        textView4.setShadowLayer(C418440Gaw.LIZIZ(3), 0.0f, C418440Gaw.LIZIZ(1), ColorProtector.parseColor("#33000000"));
        C525530KjH c525530KjH = new C525530KjH(this);
        this.LLJJIJIL = c525530KjH;
        C527270Km5 c527270Km52 = this.LLJJIJI;
        if (c527270Km52 == null) {
            c527270Km52 = null;
        }
        c527270Km52.addOnPageChangeListener(c525530KjH);
        C527270Km5 c527270Km53 = this.LLJJIJI;
        if (c527270Km53 == null) {
            c527270Km53 = null;
        }
        c527270Km53.setGestureCallback(new InterfaceC525570KjL() { // from class: X.0KjK
            @Override // X.InterfaceC525570KjL
            public final void LIZ(boolean z5) {
                Integer numValueOf2;
                int i5;
                Integer numValueOf3;
                int i6;
                if (z5) {
                    InterfaceC526970Klb interfaceC526970Klb = this.LIZ.LLLLZIL;
                    if (interfaceC526970Klb != null && (numValueOf3 = Integer.valueOf(interfaceC526970Klb.LJI())) != null) {
                        if (numValueOf3.intValue() != 1 && numValueOf3.intValue() != 4) {
                            if (numValueOf3.intValue() == 2) {
                                i6 = 2131834984;
                            } else if (numValueOf3.intValue() != 3) {
                                return;
                            } else {
                                i6 = 2131834983;
                            }
                        } else {
                            i6 = 2131834985;
                        }
                        this.LIZ.L1(i6);
                        return;
                    }
                    return;
                }
                InterfaceC526970Klb interfaceC526970Klb2 = this.LIZ.LLLLZIL;
                if (interfaceC526970Klb2 == null || (numValueOf2 = Integer.valueOf(interfaceC526970Klb2.LJI())) == null) {
                    return;
                }
                if (numValueOf2.intValue() != 1 && numValueOf2.intValue() != 4) {
                    if (numValueOf2.intValue() == 2) {
                        i5 = 2131834987;
                    } else if (numValueOf2.intValue() != 3) {
                        return;
                    } else {
                        i5 = 2131834986;
                    }
                } else {
                    i5 = 2131834988;
                }
                this.LIZ.L1(i5);
            }
        });
        if (this.LLLLIILL.isEditorProReplace) {
            C527270Km5 c527270Km54 = this.LLJJIJI;
            if (c527270Km54 == null) {
                c527270Km54 = null;
            }
            c527270Km54.setCanScroll(false);
        }
        ChooseMediaViewModel chooseMediaViewModel2 = this.LLJJJJJIL;
        if (chooseMediaViewModel2 == null) {
            chooseMediaViewModel2 = null;
        }
        BaseJediViewModel.iR2(chooseMediaViewModel2, this, new C2217381BqS() { // from class: X.0Klc
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((ChooseMediaState) obj).getMediaListState();
            }
        }, new AwS587S0100000_8(this, 213));
        C1447800nmM.LIZIZ(this).LLLIILIL(this, new C581250Mqx(this, 3));
        if (this.LLLLIILL.showDockInPreviewPage && (abstractC529520Kpi = this.LLLILZ) != null) {
            abstractC529520Kpi.LLILZLL = new InterfaceC528100KnQ() { // from class: X.0KjG
                @Override // X.InterfaceC528100KnQ
                public final void LIZIZ(TikTokMediaModel tikTokMediaModel) {
                    String str;
                    Integer numValueOf2;
                    Integer numValueOf3;
                    int size;
                    ArrayList<TikTokMediaModel> arrayList;
                    ArrayList<TikTokMediaModel> arrayList2;
                    C533790Kwb c533790Kwb2 = C533790Kwb.LIZIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("AutoPickPreview [dock.deleteItem] id=");
                    ChooseMediaViewModel chooseMediaViewModel3 = null;
                    if (tikTokMediaModel != null) {
                        str = ((MediaModel) tikTokMediaModel).id;
                    } else {
                        str = null;
                    }
                    sbLIZ2.append(str);
                    sbLIZ2.append(", mediaIndex=");
                    if (tikTokMediaModel != null) {
                        numValueOf2 = Integer.valueOf(tikTokMediaModel.mediaIndex);
                    } else {
                        numValueOf2 = null;
                    }
                    sbLIZ2.append(numValueOf2);
                    sbLIZ2.append(", selectIndex=");
                    if (tikTokMediaModel != null) {
                        numValueOf3 = Integer.valueOf(tikTokMediaModel.selectIndex);
                    } else {
                        numValueOf3 = null;
                    }
                    sbLIZ2.append(numValueOf3);
                    C201955140j.LJIILJJIL(c533790Kwb2, C2188811AlT.LIZIZ(sbLIZ2));
                    if (this.LLLLLLLZIL()) {
                        C525160Kig c525160Kig2 = C525160Kig.LIZ;
                        ShortVideoContext shortVideoContext3 = this.LLLJIL;
                        EnumC538180L8u enumC538180L8u2 = EnumC538180L8u.CLICK_DELETE_MATERIAL;
                        c525160Kig2.getClass();
                        C525160Kig.LIZ(shortVideoContext3, enumC538180L8u2);
                    }
                    if (tikTokMediaModel != null) {
                        C526910KlV c526910KlV = this;
                        C527400KmI c527400KmI3 = c526910KlV.LLJJIJIIJIL;
                        if (c527400KmI3 == null) {
                            c527400KmI3 = null;
                        }
                        int size2 = c527400KmI3.LLJIJIL.size();
                        AbstractC529520Kpi abstractC529520Kpi2 = c526910KlV.LLLILZ;
                        int size3 = -1;
                        if (abstractC529520Kpi2 != null && (arrayList2 = abstractC529520Kpi2.LL) != null) {
                            size = arrayList2.size();
                        } else {
                            size = -1;
                        }
                        boolean zLLLLLLZ = c526910KlV.LLLLLLZ();
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("AutoPickPreview [dock.deleteItem] BEFORE unselect: vpSize=");
                        sbLIZ3.append(size2);
                        sbLIZ3.append(", dockSize=");
                        sbLIZ3.append(size);
                        sbLIZ3.append(", minCountReached=");
                        sbLIZ3.append(zLLLLLLZ);
                        C201955140j.LJIILJJIL(c533790Kwb2, C2188811AlT.LIZIZ(sbLIZ3));
                        if (zLLLLLLZ) {
                            C201955140j.LJIILJJIL(c533790Kwb2, "AutoPickPreview [dock.deleteItem] blocked by min-count, show toast");
                            c526910KlV.LLLZLL();
                            return;
                        }
                        c526910KlV.LLZLL(tikTokMediaModel);
                        ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfig4 = c526910KlV.LLLLIILL;
                        boolean z5 = false;
                        if (!choosePhotoPreviewPageConfig4.isFromAutoCutAgent && !choosePhotoPreviewPageConfig4.isFromAutoPickAddMedia) {
                            ChooseMediaViewModel chooseMediaViewModel4 = c526910KlV.LLJJJJJIL;
                            if (chooseMediaViewModel4 != null) {
                                chooseMediaViewModel3 = chooseMediaViewModel4;
                            }
                            chooseMediaViewModel3.getClass();
                            chooseMediaViewModel3.yR2(new AwS587S0100000_8((MediaModel) tikTokMediaModel, 143));
                            return;
                        }
                        C527400KmI c527400KmI4 = c526910KlV.LLJJIJIIJIL;
                        if (c527400KmI4 == null) {
                            c527400KmI4 = null;
                        }
                        int size4 = c527400KmI4.LLJIJIL.size();
                        AbstractC529520Kpi abstractC529520Kpi3 = c526910KlV.LLLILZ;
                        if (abstractC529520Kpi3 != null && (arrayList = abstractC529520Kpi3.LL) != null) {
                            size3 = arrayList.size();
                        }
                        if (size4 < size2 || size3 < size) {
                            z5 = true;
                        }
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("AutoPickPreview [dock.deleteItem] AFTER unselect: vpSize=");
                        sbLIZ4.append(size4);
                        sbLIZ4.append(", dockSize=");
                        sbLIZ4.append(size3);
                        sbLIZ4.append(", likelyDeleted=");
                        sbLIZ4.append(z5);
                        C201955140j.LJIILJJIL(c533790Kwb2, C2188811AlT.LIZIZ(sbLIZ4));
                        if (!z5) {
                            return;
                        }
                        ChooseMediaViewModel chooseMediaViewModel5 = c526910KlV.LLJJJJJIL;
                        if (chooseMediaViewModel5 != null) {
                            chooseMediaViewModel3 = chooseMediaViewModel5;
                        }
                        chooseMediaViewModel3.getClass();
                        chooseMediaViewModel3.yR2(new AwS587S0100000_8((MediaModel) tikTokMediaModel, 143));
                    }
                }

                @Override // X.InterfaceC528100KnQ
                public final void LIZ(int i5, int i6) {
                    boolean z5;
                    boolean z6 = true;
                    if (i5 >= 0 && i5 < abstractC529520Kpi.LL.size()) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (i6 < 0 || i6 >= abstractC529520Kpi.LL.size()) {
                        z6 = false;
                    }
                    if (z5 && z6) {
                        TikTokMediaModel tikTokMediaModel = (TikTokMediaModel) ListProtector.get(abstractC529520Kpi.LL, i6);
                        ChooseMediaViewModel chooseMediaViewModel3 = this.LLJJJJJIL;
                        if (chooseMediaViewModel3 == null) {
                            chooseMediaViewModel3 = null;
                        }
                        chooseMediaViewModel3.getClass();
                        chooseMediaViewModel3.yR2(new C529090Kp1(i5, i6));
                        C118300cf c118300cf = new C118300cf();
                        c118300cf.element = tikTokMediaModel.mediaIndex;
                        C526910KlV c526910KlV = this;
                        if (c526910KlV.LLLLIILLL) {
                            C527400KmI c527400KmI3 = c526910KlV.LLJJIJIIJIL;
                            if (c527400KmI3 == null) {
                                c527400KmI3 = null;
                            }
                            if (i5 < c527400KmI3.LLJIJIL.size() && i5 >= 0 && i6 < c527400KmI3.LLJIJIL.size() && i6 >= 0) {
                                ((LinkedHashMap) c527400KmI3.LLIZLLLIL).clear();
                                ListProtector.add(c527400KmI3.LLJIJIL, i6, ListProtector.remove(c527400KmI3.LLJIJIL, i5));
                                c527400KmI3.LJJJ();
                                c527400KmI3.LJJJI();
                                c527400KmI3.notifyDataSetChanged();
                            }
                            c118300cf.element = i6;
                        }
                        C526910KlV c526910KlV2 = this;
                        C527270Km5 c527270Km55 = c526910KlV2.LLJJIJI;
                        if (c527270Km55 == null) {
                            c527270Km55 = null;
                        }
                        HandlerHook.viewPostDelay(c527270Km55, new ARunnableS17S0400000_8(c526910KlV2, c118300cf, this, tikTokMediaModel, abstractC529520Kpi, 2), 100L);
                    }
                }

                @Override // X.InterfaceC528100KnQ
                public final void LIZJ(TikTokMediaModel tikTokMediaModel, View view4) {
                    Integer numLLLLJ;
                    if (tikTokMediaModel != null) {
                        C526910KlV c526910KlV = this;
                        int iLLLLJI = c526910KlV.LLLLJI(tikTokMediaModel);
                        C527270Km5 c527270Km55 = c526910KlV.LLJJIJI;
                        if (c527270Km55 == null) {
                            c527270Km55 = null;
                        }
                        if (iLLLLJI == c527270Km55.getCurrentItem()) {
                            return;
                        }
                        Integer numValueOf2 = Integer.valueOf(iLLLLJI);
                        if (numValueOf2.intValue() >= 0) {
                            int iIntValue2 = numValueOf2.intValue();
                            C527270Km5 c527270Km56 = c526910KlV.LLJJIJI;
                            if (c527270Km56 == null) {
                                c527270Km56 = null;
                            }
                            c527270Km56.setCurrentItem(iIntValue2, false);
                            AbstractC529520Kpi abstractC529520Kpi2 = c526910KlV.LLLILZ;
                            if (abstractC529520Kpi2 != null && (numLLLLJ = abstractC529520Kpi2.LLLLJ(tikTokMediaModel)) != null) {
                                c526910KlV.LLLLIL(numLLLLJ.intValue() + 1);
                                if (Unit.LIZ != null) {
                                    return;
                                }
                            }
                        }
                        c526910KlV.L1(2131830080);
                    }
                }
            };
            ChooseMediaViewModel chooseMediaViewModel3 = this.LLJJJJJIL;
            if (chooseMediaViewModel3 == null) {
                chooseMediaViewModel3 = null;
            }
            BaseJediViewModel.iR2(chooseMediaViewModel3, this, new C2217381BqS() { // from class: X.0Kli
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((ChooseMediaState) obj).getPreviewDockerInitMediaList();
                }
            }, new AwS587S0100000_8(this, 705));
            ChooseMediaViewModel chooseMediaViewModel4 = this.LLJJJJJIL;
            if (chooseMediaViewModel4 == null) {
                chooseMediaViewModel4 = null;
            }
            C527050Klj c527050Klj = new C2217381BqS() { // from class: X.0Klj
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((ChooseMediaState) obj).getPreviewDockerDelMediaState();
                }
            };
            C1765020w20 c1765020w20 = new C1765020w20();
            c1765020w20.LIZ = true;
            AwS374S0200000_8 awS374S0200000_8 = new AwS374S0200000_8(abstractC529520Kpi, this, 203);
            chooseMediaViewModel4.getClass();
            chooseMediaViewModel4.jR2(this, c527050Klj, c1765020w20, new AwS587S0100000_8((Function1) awS374S0200000_8, 636));
            ChooseMediaViewModel chooseMediaViewModel5 = this.LLJJJJJIL;
            if (chooseMediaViewModel5 == null) {
                chooseMediaViewModel5 = null;
            }
            C527060Klk c527060Klk = new C2217381BqS() { // from class: X.0Klk
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((ChooseMediaState) obj).getPreviewDockerAddMediaState();
                }
            };
            C1765020w20 c1765020w202 = new C1765020w20();
            c1765020w202.LIZ = true;
            AwS374S0200000_8 awS374S0200000_82 = new AwS374S0200000_8(abstractC529520Kpi, this, 204);
            chooseMediaViewModel5.getClass();
            chooseMediaViewModel5.jR2(this, c527060Klk, c1765020w202, new AwS587S0100000_8((Function1) awS374S0200000_82, 636));
            ChooseMediaViewModel chooseMediaViewModel6 = this.LLJJJJJIL;
            if (chooseMediaViewModel6 == null) {
                chooseMediaViewModel6 = null;
            }
            BaseJediViewModel.iR2(chooseMediaViewModel6, this, new C2217381BqS() { // from class: X.0Klf
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((ChooseMediaState) obj).getPreviewNextBtnState();
                }
            }, new AwS587S0100000_8(this, 706));
            ChooseMediaViewModel chooseMediaViewModel7 = this.LLJJJJJIL;
            if (chooseMediaViewModel7 == null) {
                chooseMediaViewModel7 = null;
            }
            BaseJediViewModel.iR2(chooseMediaViewModel7, this, new C2217381BqS() { // from class: X.0Kll
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((ChooseMediaState) obj).getPreviewAutoCutBtnState();
                }
            }, new AwS587S0100000_8(this, 711));
            ChooseMediaViewModel chooseMediaViewModel8 = this.LLJJJJJIL;
            if (chooseMediaViewModel8 == null) {
                chooseMediaViewModel8 = null;
            }
            BaseJediViewModel.iR2(chooseMediaViewModel8, this, new C2217381BqS() { // from class: X.0Klm
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((ChooseMediaState) obj).getPreviewEditProBtnState();
                }
            }, new AwS587S0100000_8(this, 701));
        }
        InterfaceC526970Klb interfaceC526970Klb = this.LLLLZIL;
        if (interfaceC526970Klb != null && interfaceC526970Klb.LJFF(null) != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.LLLLII = !z2;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("AutoPickPreview [PreviewRoot] onActivityCreated END: transViewNull=");
        sbLIZ2.append(z2);
        sbLIZ2.append(", canShowDock=");
        sbLIZ2.append(this.LLLLIILL.showDockInPreviewPage);
        C201955140j.LJIILJJIL(c533790Kwb, C2188811AlT.LIZIZ(sbLIZ2));
        if (z2) {
            C201955140j.LJIILJJIL(c533790Kwb, "AutoPickPreview [PreviewRoot] posting manual onAlphaChange(1.0f) and firstEnter=false");
            View view4 = this.mView;
            if (view4 != null) {
                HandlerHook.viewPost(view4, new ARunnableS108S0100000_8(this, 50));
            }
        }
    }

    public final void LLLLILI(List<? extends TikTokMediaModel> list, Function1<? super Boolean, Unit> function1) {
        C527270Km5 c527270Km5 = this.LLJJIJI;
        if (c527270Km5 == null) {
            c527270Km5 = null;
        }
        TikTokMediaModel tikTokMediaModel = (TikTokMediaModel) C13LP.LJJJLZIJ(c527270Km5.getCurrentItem(), list);
        if (tikTokMediaModel == null) {
            return;
        }
        AwS217S0300000_8 awS217S0300000_8 = new AwS217S0300000_8(this, (C526910KlV) tikTokMediaModel, (TikTokMediaModel) function1, (Function1<? super Boolean, Unit>) 16);
        if (C530690Krb.LIZIZ(tikTokMediaModel)) {
            awS217S0300000_8.invoke(Boolean.TRUE);
        } else {
            C525490KjD.LIZ(tikTokMediaModel, true, awS217S0300000_8);
        }
    }

    public final void LLLLLZL(String str, List list) {
        ArrayList arrayList;
        String str2;
        String creationId;
        String strLJIJJLI;
        String musicId;
        String strLJIIJJI = null;
        if (list != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                MediaModel mediaModel = (MediaModel) it2.next();
                C526710KlB c526710KlB = AutoCutMediaModel.Companion;
                Context sceneContext = getSceneContext();
                c526710KlB.getClass();
                arrayList.add(C526710KlB.LIZ(sceneContext, mediaModel));
            }
        } else {
            arrayList = null;
        }
        ShortVideoContext shortVideoContext = this.LLLJIL;
        if (shortVideoContext != null) {
            str2 = shortVideoContext.shootWay;
            creationId = shortVideoContext.getCreationId();
        } else {
            str2 = null;
            creationId = null;
        }
        ShortVideoContext shortVideoContext2 = this.LLLJIL;
        if (shortVideoContext2 != null) {
            strLJIJJLI = shortVideoContext2.LJIJJLI();
        } else {
            strLJIJJLI = null;
        }
        ShortVideoContext shortVideoContext3 = this.LLLJIL;
        if (shortVideoContext3 != null) {
            musicId = shortVideoContext3.getMusicId();
        } else {
            musicId = null;
        }
        ShortVideoContext shortVideoContext4 = this.LLLJIL;
        if (shortVideoContext4 != null) {
            strLJIIJJI = shortVideoContext4.LJIIJJI();
        }
        C1417710mzp.LJIIZILJ(arrayList, "preview_page", str2, creationId, false, strLJIJJLI, 0, musicId, strLJIIJJI, null, false, null, null, null, false, 0, false, null, 0, null, 0, false, false, false, false, LLLLLIL(), new AwS93S1200000_8(this, (C526910KlV) str, (String) list, (List<? extends TikTokMediaModel>) 7), 33552896);
    }

    @Override // X.InterfaceC362610EJn
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            C201955140j.LIZ("PreviewRootScene -> onKeyDown");
            LLLLZLLIL();
            return true;
        }
        return false;
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        TuxImmersionBar tuxImmersionBarLJ = C1766560w4U.LJ((C19EG) requireActivity());
        tuxImmersionBarLJ.LIZIZ.LJIIL();
        tuxImmersionBarLJ.LIZLLL();
        if (Build.VERSION.SDK_INT >= 35) {
            C14K9.LJIJJ(view, new C0TVI() { // from class: X.0Lyx
                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                    C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(2);
                    view2.setPadding(c20244914JjLIZ.LIZ, 0, c20244914JjLIZ.LIZJ, c20244914JjLIZ.LIZLLL);
                    return C20246014Ju.LIZIZ;
                }
            });
        }
    }

    @Override // X.InterfaceC484050IyZ
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        C0L4W c0l4w;
        CreativeModel creativeModel;
        if (i == 12347) {
            ShortVideoContext shortVideoContext = this.LLLJIL;
            if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null) {
                creativeModel.autoCutModel = new AutoCutModel(null, null, null, null, 0, 0, false, false, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, 0, null, false, null, 0, 0, null, false, false, null, null, -1, 7, null);
            }
            C1DRG c1drgLJIIIZ = C1664600tQ2.LJIIIZ(this);
            if (c1drgLJIIIZ != null && (c0l4w = (C0L4W) c1drgLJIIIZ.LJIIL(null, C0L4W.class)) != null) {
                c0l4w.exit();
            }
            ShortVideoContext shortVideoContext2 = this.LLLJIL;
            if (shortVideoContext2 != null) {
                C0L4U.LIZ(shortVideoContext2, this.LLLLLIL, this.LLLLLILLIL, this.LLLLLJLJLL, Integer.valueOf(this.LLLLLJIL));
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int iIntValue;
        ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfig;
        InterfaceC524950KiL interfaceC524950KiLLIZ = C0MWZ.LIZ(this);
        this.LLJJI = interfaceC524950KiLLIZ;
        if (interfaceC524950KiLLIZ != null) {
            interfaceC524950KiLLIZ.Qh(this);
            interfaceC524950KiLLIZ.AH(this);
        }
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && (choosePhotoPreviewPageConfig = (ChoosePhotoPreviewPageConfig) bundle2.getParcelable("PREVIEW_CONFIG")) != null) {
            this.LLLLIILL = choosePhotoPreviewPageConfig;
            this.LLLJL = choosePhotoPreviewPageConfig.nextRuleAdjustment;
        }
        AlbumNextButtonConfig albumNextButtonConfig = this.LLLLIILL.nextBtnConfig;
        if (albumNextButtonConfig != null && albumNextButtonConfig.nextBtnColor != R.attr.a04) {
            setTheme(R.style.z4);
        }
        ViewGroup viewGroup2 = (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.er5, viewGroup, false);
        ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfig2 = this.LLLLIILL;
        if (choosePhotoPreviewPageConfig2.isFromAutoCutAgent && !choosePhotoPreviewPageConfig2.isFromAutoPickAddMedia && C0C64.LJIILLIIL().LJIIIZ(31744, "autopick_cover_preview_opaque_root", true, true)) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.e1, viewGroup2.getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = -16777216;
            }
            viewGroup2.setBackgroundColor(iIntValue);
        }
        return viewGroup2;
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    public static void LLLLLL(C526910KlV c526910KlV, boolean z, boolean z2, int i) {
        Object next;
        InterfaceC526970Klb interfaceC526970Klb;
        List<TikTokMediaModel> listLIZJ;
        ?? r4;
        boolean z3;
        ChooseMediaViewModel chooseMediaViewModel;
        C527400KmI c527400KmI;
        List<TikTokMediaModel> list;
        TikTokMediaModel tikTokMediaModel;
        Float fValueOf;
        CreativeFlowData creativeFlowData;
        EditorProModel editorProModel;
        CreativeModel creativeModel;
        EditPhotoModel editPhotoModel;
        boolean z4 = z2;
        boolean z5 = z;
        if ((i & 1) != 0) {
            z5 = false;
        }
        if ((i & 2) != 0) {
            z4 = false;
        }
        c526910KlV.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - c526910KlV.LLLLIIL;
        if (1 <= jCurrentTimeMillis && jCurrentTimeMillis < 500) {
            return;
        }
        c526910KlV.LLLLIIL = System.currentTimeMillis();
        ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfig = c526910KlV.LLLLIILL;
        if (choosePhotoPreviewPageConfig.isFromAutoCutAgent || choosePhotoPreviewPageConfig.isFromAutoPickAddMedia) {
            List listLLZIL = LLZIL(c526910KlV, "preview_next", null, null, 6);
            C525090KiZ c525090KiZ = c526910KlV.LLLL;
            if (c525090KiZ != null) {
                Context sceneContext = c526910KlV.getSceneContext();
                if (c525090KiZ.LIZJ() && sceneContext != null) {
                    Iterator it2 = listLLZIL.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            MediaModel mediaModel = (MediaModel) next;
                            if (mediaModel.LJIILJJIL() && C0L0K.LIZIZ(sceneContext, C2471909mP.LJIJ(mediaModel), "video_upload", false, 24)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    MediaModel mediaModel2 = (MediaModel) next;
                    if (mediaModel2 != null) {
                        C533790Kwb c533790Kwb = C533790Kwb.LIZIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("AutoPickPreview [");
                        sbLIZ.append("video_upload");
                        sbLIZ.append("] abort: contains kids-mode video, blockedMediaId=");
                        sbLIZ.append(mediaModel2.id);
                        C201955140j.LJII(c533790Kwb, C2188811AlT.LIZIZ(sbLIZ));
                        return;
                    }
                }
            }
        }
        if ((c526910KlV.LLLLIILL.LIZ() || C522930Kf5.LIZIZ(c526910KlV.LLLLIILL.chooseSceneMode) || C522930Kf5.LIZ(c526910KlV.LLLLIILL.chooseSceneMode)) && (interfaceC526970Klb = c526910KlV.LLLLZIL) != null && (listLIZJ = interfaceC526970Klb.LIZJ()) != null) {
            Iterator it3 = new ArrayList(listLIZJ).iterator();
            while (it3.hasNext()) {
                c526910KlV.LLZLL((TikTokMediaModel) it3.next());
            }
        }
        if (C529980KqS.LIZ(c526910KlV.LLLLIILL.chooseSceneMode)) {
            c526910KlV.saveRecordMusic();
        }
        ShortVideoContext shortVideoContext = c526910KlV.LLLJIL;
        if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null && (editPhotoModel = creativeModel.editPhotoModel) != null) {
            editPhotoModel.isFromEditPhoto = false;
        }
        ChooseMediaViewModel chooseMediaViewModel2 = c526910KlV.LLJJJJJIL;
        if (chooseMediaViewModel2 == null) {
            chooseMediaViewModel2 = null;
        }
        chooseMediaViewModel2.getClass();
        chooseMediaViewModel2.yR2(new AwS23S0010000_8(z4, 5));
        ShortVideoContext shortVideoContext2 = c526910KlV.LLLJIL;
        if (shortVideoContext2 != null && (creativeFlowData = shortVideoContext2.creativeFlowData) != null) {
            if (creativeFlowData.getEditorProModel() == null) {
                creativeFlowData.setEditorProModel(new EditorProModel(false, null, false, false, "", false, 0L, null, null, false, new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), false, false, false, 0, false, false, false, false, 0, false, false, null, false, new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), z5, -1, -1, "", false, false, null, null, new ArrayList(), null, new ArrayList(), new ArrayList(), new ArrayList(), new LinkedHashMap(), new ArrayList(), new ArrayList(), new ArrayList(), null, null, new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), null, new ArrayList(), new ConcurrentHashMap(), new ArrayList(), false, false, "", false, -1L, false, null));
            } else {
                EditorProModel editorProModel2 = creativeFlowData.getEditorProModel();
                if (editorProModel2 != null) {
                    editorProModel2.setFromEditorProEntranceInAlbum(z5);
                }
            }
            if (z5 && (editorProModel = creativeFlowData.getEditorProModel()) != null) {
                r4 = 1;
                editorProModel.setFromAlbumType(1);
            } else {
                r4 = 1;
            }
        } else {
            r4 = 1;
        }
        ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfig2 = c526910KlV.LLLLIILL;
        if (choosePhotoPreviewPageConfig2.stickerMultiPhotosMode) {
            TextView textViewLLLLLJLJLL = c526910KlV.LLLLLJLJLL();
            if (textViewLLLLLJLJLL != null) {
                fValueOf = Float.valueOf(textViewLLLLLJLJLL.getAlpha());
            } else {
                fValueOf = null;
            }
            if (!Intrinsics.LIZLLL(fValueOf, 1.0f)) {
                return;
            }
            c526910KlV.LLLZLZ(r4);
            ChooseMediaViewModel chooseMediaViewModel3 = c526910KlV.LLJJJJJIL;
            if (chooseMediaViewModel3 == null) {
                chooseMediaViewModel3 = null;
            }
            chooseMediaViewModel3.getClass();
            chooseMediaViewModel3.yR2(AFwS239S0000000_8.get$arr$(92));
            return;
        }
        if (z4 && choosePhotoPreviewPageConfig2.maxUseEffectPhotoCount < r4) {
            z3 = false;
        } else {
            z3 = true;
        }
        RecyclerView recyclerView = c526910KlV.LLJJL;
        if (recyclerView == null) {
            recyclerView = null;
        }
        AbstractC21673619ry adapter = recyclerView.getAdapter();
        if (adapter != null && adapter.getItemCount() == 0 && c526910KlV.LLLJ >= 0 && c526910KlV.LLLJL && z3) {
            InterfaceC526970Klb interfaceC526970Klb2 = c526910KlV.LLLLZIL;
            if (interfaceC526970Klb2 != null && interfaceC526970Klb2.LIZ() == r4 && C0C64.LJIILLIIL().LJIIIZ(31744, "select_single_video_from_preview_killswitch", r4, r4)) {
                c526910KlV.LLLZLZ(r4);
                ChooseMediaViewModel chooseMediaViewModel4 = c526910KlV.LLJJJJJIL;
                if (chooseMediaViewModel4 == null) {
                    chooseMediaViewModel4 = null;
                }
                chooseMediaViewModel4.getClass();
                chooseMediaViewModel4.yR2(AFwS239S0000000_8.get$arr$(92));
                c526910KlV.LLLLZLLIL();
            }
            C527270Km5 c527270Km5 = c526910KlV.LLJJIJI;
            if (c527270Km5 == null) {
                c527270Km5 = null;
            }
            PagerAdapter adapter2 = c527270Km5.getAdapter();
            if (!(adapter2 instanceof C527400KmI) || (c527400KmI = (C527400KmI) adapter2) == null || (list = c527400KmI.LLJIJIL) == null || (tikTokMediaModel = (TikTokMediaModel) C13LP.LJJJLZIJ(c526910KlV.LLLJ, list)) == null) {
                return;
            }
            ChooseMediaViewModel chooseMediaViewModel5 = c526910KlV.LLJJJJJIL;
            if (chooseMediaViewModel5 == null) {
                chooseMediaViewModel5 = null;
            }
            InterfaceC526970Klb interfaceC526970Klb3 = c526910KlV.LLLLZIL;
            if (interfaceC526970Klb3 != null && !interfaceC526970Klb3.LJ(tikTokMediaModel)) {
                return;
            }
            ShortVideoContext shortVideoContext3 = c526910KlV.LLLJIL;
            if (shortVideoContext3 != null) {
                shortVideoContext3.isAutoSelectedAlbumPreview = r4;
            }
            chooseMediaViewModel5.LLJJ = tikTokMediaModel;
            chooseMediaViewModel5.LLJILLL = r4;
            chooseMediaViewModel5.Kw2(tikTokMediaModel);
            return;
        }
        ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfig3 = c526910KlV.LLLLIILL;
        if (choosePhotoPreviewPageConfig3.isFromAutoCutAgent && !choosePhotoPreviewPageConfig3.isFromAutoPickAddMedia) {
            chooseMediaViewModel = null;
            LLZIL(c526910KlV, "preview_next", null, null, 6);
        } else {
            chooseMediaViewModel = null;
        }
        c526910KlV.LLLZLZ(r4);
        ChooseMediaViewModel chooseMediaViewModel6 = c526910KlV.LLJJJJJIL;
        if (chooseMediaViewModel6 == null) {
            chooseMediaViewModel6 = chooseMediaViewModel;
        }
        chooseMediaViewModel6.getClass();
        chooseMediaViewModel6.yR2(AFwS239S0000000_8.get$arr$(92));
    }

    public static List LLZIL(C526910KlV c526910KlV, String str, List list, TikTokMediaModel tikTokMediaModel, int i) {
        List<? extends TikTokMediaModel> listLLIIII;
        LivePhotoInfo livePhotoInfo;
        String str2;
        C13BV c13bv;
        if ((i & 2) != 0) {
            list = null;
        }
        if ((i & 4) != 0) {
            tikTokMediaModel = null;
        }
        C525090KiZ c525090KiZ = c526910KlV.LLLL;
        if (c525090KiZ != null) {
            AwS552S0100000_8 awS552S0100000_8 = new AwS552S0100000_8(c526910KlV, 1051);
            AwS552S0100000_8 awS552S0100000_82 = new AwS552S0100000_8(c526910KlV, 1052);
            boolean z = false;
            if (!c525090KiZ.LIZJ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("skip source=");
                sbLIZ.append(str);
                sbLIZ.append(" notAutoPickFlow hasInput=");
                if (list != null) {
                    z = true;
                }
                sbLIZ.append(z);
                C525090KiZ.LIZLLL("syncAutoPickSelectedMediasToSharedState", C2188811AlT.LIZIZ(sbLIZ));
                if (list == null) {
                    c13bv = C13BV.INSTANCE;
                } else {
                    return list;
                }
            } else {
                if (list == null || !(!list.isEmpty()) || (listLLIIII = C13LP.LLIIII(list)) == null) {
                    List list2 = (List) awS552S0100000_8.invoke();
                    if (list2 != null && (!list2.isEmpty())) {
                        listLLIIII = C13LP.LLIIII(list2);
                    } else {
                        listLLIIII = C13LP.LLIIII((Iterable) awS552S0100000_82.invoke());
                    }
                }
                if (listLLIIII.isEmpty()) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("skip empty source=");
                    sbLIZ2.append(str);
                    C525090KiZ.LIZLLL("syncAutoPickSelectedMediasToSharedState", C2188811AlT.LIZIZ(sbLIZ2));
                    c13bv = C13BV.INSTANCE;
                } else {
                    if (tikTokMediaModel != null && tikTokMediaModel.LJIIJJI() && tikTokMediaModel.livePhotoInfo != null) {
                        C525050KiV.LIZIZ(tikTokMediaModel, listLLIIII);
                    } else {
                        tikTokMediaModel = null;
                    }
                    ArrayList<TikTokMediaModel> arrayListNR2 = c525090KiZ.LIZIZ.nR2();
                    ArrayList arrayList = new ArrayList();
                    for (TikTokMediaModel tikTokMediaModel2 : arrayListNR2) {
                        TikTokMediaModel tikTokMediaModel3 = tikTokMediaModel2;
                        if (tikTokMediaModel3.LJIIJJI() && (livePhotoInfo = tikTokMediaModel3.livePhotoInfo) != null && livePhotoInfo.getHasUserClickedIcon()) {
                            String str3 = ((MediaModel) tikTokMediaModel3).id;
                            if (tikTokMediaModel != null) {
                                str2 = ((MediaModel) tikTokMediaModel).id;
                            } else {
                                str2 = null;
                            }
                            if (!Intrinsics.LJFF(str3, str2)) {
                                arrayList.add(tikTokMediaModel2);
                            }
                        }
                    }
                    int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList, 10));
                    if (iLIZIZ < 16) {
                        iLIZIZ = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
                    for (Object obj : arrayList) {
                        linkedHashMap.put(((MediaModel) obj).id, obj);
                    }
                    Iterator<? extends TikTokMediaModel> it2 = listLLIIII.iterator();
                    while (it2.hasNext()) {
                        TikTokMediaModel tikTokMediaModel4 = (TikTokMediaModel) linkedHashMap.get(((MediaModel) it2.next()).id);
                        if (tikTokMediaModel4 != null) {
                            C525050KiV.LIZIZ(tikTokMediaModel4, listLLIIII);
                        }
                    }
                    c525090KiZ.LIZIZ.vR2(listLLIIII);
                    ArrayList<TikTokMediaModel> arrayListNR22 = c525090KiZ.LIZIZ.nR2();
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("source=");
                    sbLIZ3.append(str);
                    sbLIZ3.append(" fromAutoCut=");
                    sbLIZ3.append(c525090KiZ.LIZ.isFromAutoCutAgent);
                    sbLIZ3.append(" fromAddMedia=");
                    sbLIZ3.append(c525090KiZ.LIZ.isFromAutoPickAddMedia);
                    sbLIZ3.append(" current=");
                    sbLIZ3.append(C525090KiZ.LIZIZ(listLLIIII));
                    sbLIZ3.append(" shared=");
                    sbLIZ3.append(C525090KiZ.LIZIZ(arrayListNR22));
                    sbLIZ3.append(" currentIds=");
                    sbLIZ3.append(C525090KiZ.LIZ(listLLIIII));
                    sbLIZ3.append(" sharedIds=");
                    sbLIZ3.append(C525090KiZ.LIZ(arrayListNR22));
                    C525090KiZ.LIZLLL("syncAutoPickSelectedMediasToSharedState", C2188811AlT.LIZIZ(sbLIZ3));
                    C533790Kwb c533790Kwb = C533790Kwb.LIZIZ;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("AutoPickPreview [");
                    sbLIZ4.append(str);
                    sbLIZ4.append("] sync latest medias count=");
                    sbLIZ4.append(arrayListNR22.size());
                    C201955140j.LJIILJJIL(c533790Kwb, C2188811AlT.LIZIZ(sbLIZ4));
                    return arrayListNR22;
                }
            }
            if (c13bv != null) {
                return c13bv;
            }
        }
        if (list == null) {
            return C13BV.INSTANCE;
        }
        return list;
    }
}
