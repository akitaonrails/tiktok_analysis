package com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.ui.settings;

import X.C011Z;
import X.C01JX;
import X.C0U40;
import X.C0U45;
import X.C0U4R;
import X.C1161920gLG;
import X.C1291820jim;
import X.C12ES;
import X.C1320810kTX;
import X.C1322200kVm;
import X.C1324610kZf;
import X.C1324720kZq;
import X.C1325700kbQ;
import X.C1329360khK;
import X.C13LP;
import X.C16F5;
import X.C16FS;
import X.C1819620xS4;
import X.C20326414gA;
import X.C20326714gD;
import X.C20341014iW;
import X.C20414614uO;
import X.C2188811AlT;
import X.C319501Lt;
import X.C417850GZz;
import X.C439101nJ;
import X.C497740JfY;
import X.C500260Jjc;
import X.C5185020h;
import X.C766270U4b;
import X.C767250U7v;
import X.C767770U9v;
import X.C781520UlC;
import X.C916490ZxP;
import X.C924810aAp;
import X.C927560aFG;
import X.EnumC311901Iv;
import X.EnumC993760by2;
import X.InterfaceC20340914iV;
import X.InterfaceC915240ZvO;
import Y.ARunnableS112S0100000_12;
import Y.ARunnableS131S0100000_31;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.liveinteract.api.MultiGuestAnchorSelfVideoChangedEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.ui.BaseSheetFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.ui.settings.CountDownForAllV2EffectPreviewDialog;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTryingEffectDisableList;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.AwS645S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class CountDownForAllV2EffectPreviewDialog extends BaseSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+KSwiZz8/KTxiKiAmJjEoHELIOSJjg9Lio+KCM/PndiKiA+JSoiZzo6ZjYpPTs6JiI/Zww8PSs4DSAkJgMjOw4/JBN+DCk1LSY4GT02PiwpPgs6KSkjLg==";
    public final String LLL;
    public final boolean LLLF;
    public final Function2<String, LiveEffect, Unit> LLLFF;
    public final MultiGuestDataHolder LLLFFI;
    public C1324720kZq LLLFZ;
    public ImageView LLLI;
    public RecyclerView LLLII;
    public C16FS LLLIIII;
    public C16F5 LLLIIIIL;
    public C16F5 LLLIIIL;
    public C20414614uO LLLIIL;
    public C0U40 LLLIILIL;
    public LiveEffect LLLIL;
    public ConstraintLayout LLLILZ;
    public FrameLayout LLLILZJ;
    public SurfaceView LLLILZLLLI;
    public LiveIconView LLLIZZ;
    public LiveIconView LLLJ;
    public boolean LLLJIL;
    public InterfaceC20340914iV LLLJL;
    public final C20326714gD LLLL;
    public EnumC311901Iv LLLLII;
    public C20341014iW LLLLIIIILLL;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.ui.BaseSheetFragment
    public final int layoutId() {
        return R.layout.g90;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.LLLLIIIILLL = null;
        super.onDestroy();
    }

    public final boolean BS() {
        MultiGuestDataHolder multiGuestDataHolder = this.LLLFFI;
        return multiGuestDataHolder != null && multiGuestDataHolder.LJIIJ;
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [REQUEST, X.0kbR] */
    /* JADX WARN: Type inference failed for: r0v31, types: [REQUEST, X.0kbR] */
    public final void FS() {
        List urls;
        LiveMode liveMode;
        if (this.LLLJIL) {
            MultiGuestDataHolder multiGuestDataHolder = this.LLLFFI;
            char c = ((multiGuestDataHolder != null && multiGuestDataHolder.LJJIFFI == 0) || (multiGuestDataHolder != null && multiGuestDataHolder.LJIILIIL == 0)) ? (char) 0 : BS() ? (char) 1 : (char) 2;
            DataChannel dataChannel = this.LLJLLL;
            if ((dataChannel == null || (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) == null || !C781520UlC.LJ(liveMode)) ? false : true) {
                LiveIconView liveIconView = this.LLLIZZ;
                if (liveIconView != null) {
                    C12ES.LJIILL(4, liveIconView);
                }
            } else {
                LiveIconView liveIconView2 = this.LLLIZZ;
                if (liveIconView2 != null) {
                    C12ES.LJIILL(0, liveIconView2);
                    if (c == 0) {
                        liveIconView2.setIconAttr(R.attr.emc);
                        liveIconView2.setIconTintAttr(R.attr.ez3);
                    } else if (c != 1) {
                        liveIconView2.setIconAttr(R.attr.emt);
                        liveIconView2.setIconTintAttr(R.attr.eyv);
                    } else {
                        liveIconView2.setIconAttr(R.attr.emc);
                        liveIconView2.setIconTintAttr(R.attr.eyv);
                    }
                }
            }
            if (BS()) {
                LiveIconView liveIconView3 = this.LLLJ;
                if (liveIconView3 != null) {
                    liveIconView3.setIconTintAttr(R.attr.eyv);
                }
            } else {
                LiveIconView liveIconView4 = this.LLLJ;
                if (liveIconView4 != null) {
                    liveIconView4.setIconTintAttr(R.attr.ez3);
                }
            }
            if (c != 2 && !C927560aFG.LIZJ()) {
                FrameLayout frameLayout = this.LLLILZJ;
                if (frameLayout != null) {
                    C12ES.LJIILL(0, frameLayout);
                }
                SurfaceView surfaceView = this.LLLILZLLLI;
                if (surfaceView != null) {
                    C12ES.LJIILL(0, surfaceView);
                }
                RecyclerView recyclerView = this.LLLII;
                if (recyclerView != null) {
                    C12ES.LJIILL(0, recyclerView);
                }
                C16F5 c16f5 = this.LLLIIIIL;
                if (c16f5 != null) {
                    C439101nJ.LJI(c16f5);
                }
                C16FS c16fs = this.LLLIIII;
                if (c16fs != null) {
                    C12ES.LJIILL(0, c16fs);
                }
                C1324720kZq c1324720kZq = this.LLLFZ;
                if (c1324720kZq != null) {
                    C12ES.LJIILL(4, c1324720kZq);
                }
                ImageView imageView = this.LLLI;
                if (imageView != null) {
                    C12ES.LJIILL(4, imageView);
                    return;
                }
                return;
            }
            FrameLayout frameLayout2 = this.LLLILZJ;
            if (frameLayout2 != null) {
                C12ES.LJIILL(4, frameLayout2);
            }
            SurfaceView surfaceView2 = this.LLLILZLLLI;
            if (surfaceView2 != null) {
                C12ES.LJIILL(4, surfaceView2);
            }
            RecyclerView recyclerView2 = this.LLLII;
            if (recyclerView2 != null) {
                C12ES.LJIILL(4, recyclerView2);
            }
            C16F5 c16f52 = this.LLLIIIIL;
            if (c16f52 != null) {
                C12ES.LJIILL(0, c16f52);
            }
            C16FS c16fs2 = this.LLLIIII;
            if (c16fs2 != null) {
                C12ES.LJIILL(4, c16fs2);
            }
            C1324720kZq c1324720kZq2 = this.LLLFZ;
            if (c1324720kZq2 != null) {
                C12ES.LJIILL(0, c1324720kZq2);
                String str = null;
                c1324720kZq2.setBackground(null);
                c1324720kZq2.setForeground(new ColorDrawable(C497740JfY.LIZLLL(R.attr.eos, c1324720kZq2.getContext())));
                c1324720kZq2.setTag(null);
                ImageModel avatarThumb = UserService.getInstance().user().getCurrentUser().getAvatarThumb();
                C1291820jim c1291820jim = new C1291820jim(5);
                if (C1819620xS4.LIZLLL(avatarThumb)) {
                    if (avatarThumb != null && (urls = avatarThumb.getUrls()) != null) {
                        str = (String) C13LP.LJJJLL(urls);
                    }
                    C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(UriProtector.parse(str));
                    c1325700kbQLIZLLL.LJIILIIL = c1291820jim;
                    ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
                    imageDecodeOptionsBuilder.setBitmapConfig(Bitmap.Config.ARGB_8888);
                    imageDecodeOptionsBuilder.getClass();
                    c1325700kbQLIZLLL.LJFF = new C1329360khK(imageDecodeOptionsBuilder);
                    ?? LIZ = c1325700kbQLIZLLL.LIZ();
                    C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
                    c1320810kTXLIZJ.LIZLLL = LIZ;
                    c1320810kTXLIZJ.LJIILJJIL = c1324720kZq2.getController();
                    c1324720kZq2.setController(c1320810kTXLIZJ.LIZ());
                } else {
                    C1325700kbQ c1325700kbQLIZJ = C1325700kbQ.LIZJ(R.drawable.el_);
                    c1325700kbQLIZJ.LJIILIIL = c1291820jim;
                    ?? LIZ2 = c1325700kbQLIZJ.LIZ();
                    C1320810kTX c1320810kTXLIZJ2 = C1322200kVm.LIZJ();
                    c1320810kTXLIZJ2.LIZLLL = LIZ2;
                    c1320810kTXLIZJ2.LJIILJJIL = c1324720kZq2.getController();
                    c1324720kZq2.setController(c1320810kTXLIZJ2.LIZ());
                }
            }
            ImageView imageView2 = this.LLLI;
            if (imageView2 != null) {
                C12ES.LJIILL(0, imageView2);
                C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(UserService.getInstance().user().getCurrentUser().getAvatarThumb());
                c1324610kZfLJIIIZ.LJIIIZ = R.drawable.el_;
                int iLIZIZ = (int) C497740JfY.LIZIZ(52.0f);
                int iLIZIZ2 = (int) C497740JfY.LIZIZ(52.0f);
                c1324610kZfLJIIIZ.LJ = iLIZIZ;
                c1324610kZfLJIIIZ.LJFF = iLIZIZ2;
                c1324610kZfLJIIIZ.LJIILIIL = Boolean.TRUE;
                c1324610kZfLJIIIZ.LJJI(imageView2);
            }
        }
    }

    public final String zS() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("is_video_on=");
        sbLIZ.append(BS() ? 1 : 0);
        sbLIZ.append("&has_preview_window=");
        sbLIZ.append(this.LLLJIL ? 1 : 0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void ES(List<C20326414gA> list) {
        if (!list.isEmpty() && isVisible()) {
            C20414614uO c20414614uO = new C20414614uO(getContext(), list, new AwS610S0100000_31(this, 31), new AwS645S0100000_31(this, 12));
            String str = this.LLL;
            int size = c20414614uO.LL.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                if (Intrinsics.LJFF(((C20326414gA) ListProtector.get(c20414614uO.LL, i)).LIZ.getResourceId(), str)) {
                    if (i >= 0 && i < c20414614uO.LL.size()) {
                        c20414614uO.LLILZ = str;
                        Function2<LiveEffect, EnumC993760by2, Unit> function2 = c20414614uO.LLILLL;
                        if (function2 != null) {
                            function2.invoke(((C20326414gA) ListProtector.get(c20414614uO.LL, i)).LIZ, EnumC993760by2.SET_SELECT_EFFECT);
                        }
                        c20414614uO.notifyItemChanged(c20414614uO.LLILZIL);
                        c20414614uO.notifyItemChanged(i);
                        c20414614uO.LLILZIL = i;
                    }
                } else {
                    i++;
                }
            }
            this.LLLIIL = c20414614uO;
            RecyclerView recyclerView = this.LLLII;
            if (recyclerView != null) {
                recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
                recyclerView.setAdapter(this.LLLIIL);
                int iIntValue = ((Number) C500260Jjc.LJI(list, new AwS610S0100000_31(this, 32)).getSecond()).intValue();
                if (iIntValue > 0) {
                    recyclerView.scrollToPosition(iIntValue);
                }
            }
        }
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, X.InterfaceC513210KAt
    public final int getThemeOverlay(Context context) {
        return C011Z.LIZ.LJIIIZ();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.ui.BaseSheetFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        List<String> listLLJJ;
        List<LiveEffect> listLL;
        LiveEffect liveEffect;
        SheetOptions sheetOptionsIS = super.iS(context);
        int i = 1;
        if (!this.LLLF) {
            this.LLLJIL = false;
        } else {
            ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveEffectHelper();
            for (LiveEffect liveEffect2 : (ArrayList) C767770U9v.LIZ()) {
                if (!C767250U7v.LIZLLL(liveEffect2) || (listLL = liveEffect2.LL()) == null || (liveEffect = (LiveEffect) C13LP.LJJJLL(listLL)) == null || (listLLJJ = liveEffect.LLJJ()) == null) {
                    listLLJJ = liveEffect2.LLJJ();
                }
                if (LiveBroadcastTryingEffectDisableList.disableTryingEffect(listLLJJ)) {
                    this.LLLJIL = false;
                }
            }
            this.LLLJIL = true;
            sheetOptionsIS.LIZ(i, null);
            return sheetOptionsIS;
        }
        i = 3;
        sheetOptionsIS.LIZ(i, null);
        return sheetOptionsIS;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.ui.BaseSheetFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void x1(int i) {
        String strLJIIJJI;
        if (this.LLLLII != EnumC311901Iv.BOTTOM_BUTTON) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("resource_id=");
            LiveEffect liveEffect = this.LLLIL;
            if (liveEffect != null) {
                strLJIIJJI = C01JX.LJIIJJI(liveEffect);
            } else {
                strLJIIJJI = this.LLL;
            }
            sbLIZ.append(strLJIIJJI);
            sbLIZ.append('&');
            sbLIZ.append(zS());
            C319501Lt.LIZIZ("close", C2188811AlT.LIZIZ(sbLIZ));
        }
        super.x1(i);
        LiveIconView liveIconView = this.LLLIZZ;
        if (liveIconView != null) {
            C500260Jjc.LJIILLIIL(liveIconView);
        }
        LiveIconView liveIconView2 = this.LLLJ;
        if (liveIconView2 != null) {
            C500260Jjc.LJIILLIIL(liveIconView2);
        }
        FrameLayout frameLayout = this.LLLILZJ;
        if (frameLayout != null) {
            C500260Jjc.LJIILLIIL(frameLayout);
        }
        SurfaceView surfaceView = this.LLLILZLLLI;
        if (surfaceView != null) {
            C500260Jjc.LJIILLIIL(surfaceView);
        }
        InterfaceC20340914iV interfaceC20340914iV = this.LLLJL;
        if (interfaceC20340914iV != null) {
            interfaceC20340914iV.LIZ();
        }
        C924810aAp.LJ().LJIILIIL(this.LLLL);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.ui.BaseSheetFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLLIILIL = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveEffectDataProvider();
        if (C927560aFG.LIZJ()) {
            MultiGuestDataHolder multiGuestDataHolder = this.LLLFFI;
            if (multiGuestDataHolder != null) {
                multiGuestDataHolder.LJIILIIL = 0;
            }
        } else {
            MultiGuestDataHolder multiGuestDataHolder2 = this.LLLFFI;
            if (multiGuestDataHolder2 != null) {
                if (multiGuestDataHolder2.LJJIFFI >= 1 && multiGuestDataHolder2.LJIIJ) {
                    this.LLLFFI.LJIILIIL = 1;
                } else {
                    MultiGuestDataHolder multiGuestDataHolder3 = this.LLLFFI;
                    if (multiGuestDataHolder3.LJJIFFI >= 1 && !multiGuestDataHolder3.LJIIJ) {
                        this.LLLFFI.LJIILIIL = 2;
                    }
                }
            }
        }
        this.LLLILZ = (ConstraintLayout) view.findViewById(R.id.rsr);
        this.LLLFZ = (C1324720kZq) view.findViewById(R.id.bhn);
        this.LLLI = (ImageView) view.findViewById(R.id.bh2);
        this.LLLII = (RecyclerView) view.findViewById(R.id.w73);
        this.LLLIIIIL = (C16F5) view.findViewById(R.id.desc);
        this.LLLIIIL = (C16F5) view.findViewById(R.id.tv_sub_title);
        View viewFindViewById = view.findViewById(R.id.p2d);
        if (viewFindViewById != null) {
            C500260Jjc.LJLIIIL(500L, viewFindViewById, new AwS610S0100000_31(this, 322));
        }
        C16FS c16fs = (C16FS) view.findViewById(R.id.cuk);
        this.LLLIIII = c16fs;
        if (c16fs != null) {
            C500260Jjc.LJLIIIL(500L, c16fs, new AwS610S0100000_31(this, 323));
        }
        RecyclerView recyclerView = this.LLLII;
        if (recyclerView != null) {
            HandlerHook.viewPost(recyclerView, new ARunnableS112S0100000_12(this, 292));
        }
        if (this.LLLJIL) {
            this.LLLILZJ = (FrameLayout) view.findViewById(R.id.ylr);
            this.LLLILZLLLI = (SurfaceView) view.findViewById(R.id.ylq);
            LiveIconView liveIconView = (LiveIconView) view.findViewById(R.id.video_switch);
            this.LLLIZZ = liveIconView;
            if (liveIconView != null) {
                C500260Jjc.LJLIIIL(500L, liveIconView, new AwS594S0100000_15(this, 672));
            }
            LiveIconView liveIconView2 = (LiveIconView) view.findViewById(R.id.d_m);
            this.LLLJ = liveIconView2;
            if (liveIconView2 != null) {
                C500260Jjc.LJLIIIL(500L, liveIconView2, AFwS250S0000000_15.get$arr$(154));
            }
            InterfaceC20340914iV liveEffectPreviewHelper = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveEffectPreviewHelper(this.LLLILZJ, this.LLLILZLLLI);
            this.LLLJL = liveEffectPreviewHelper;
            if (liveEffectPreviewHelper != null) {
                LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
                LiveEffect liveEffectLIZ = this.LLLIL;
                if (liveEffectLIZ == null) {
                    liveEffectLIZ = C767250U7v.LIZ();
                }
                liveEffectPreviewHelper.LIZJ(viewLifecycleOwner, liveEffectLIZ, new AwS575S0100000_31(this, 1350));
            }
        } else {
            if (this.LLLF) {
                C0U4R c0u4r = new C0U4R();
                c0u4r.LJFF = true;
                c0u4r.LIZLLL = 2131851950;
                c0u4r.LIZJ = "ttlive_countdownForAll_settings_effectPreviewPanel_effectConflictToast";
                c0u4r.LJII = this.LLJLLL;
                C766270U4b.LJIIJ(c0u4r);
            }
            C500260Jjc.LJIILIIL(this.LLLILZ);
            C500260Jjc.LJIILIIL(this.LLLIIIL);
        }
        C1324720kZq c1324720kZq = this.LLLFZ;
        if (c1324720kZq != null) {
            C417850GZz.LIZ((int) C497740JfY.LIZIZ(8.0f), c1324720kZq);
        }
        FrameLayout frameLayout = this.LLLILZJ;
        if (frameLayout != null) {
            C417850GZz.LIZ((int) C497740JfY.LIZIZ(8.0f), frameLayout);
        }
        SurfaceView surfaceView = this.LLLILZLLLI;
        if (surfaceView != null) {
            C417850GZz.LIZ((int) C497740JfY.LIZIZ(8.0f), surfaceView);
        }
        DataChannel dataChannel = this.LLJLLL;
        if (dataChannel != null) {
            dataChannel.BQ2(this, MultiGuestAnchorSelfVideoChangedEvent.class, new AwS610S0100000_31(this, 33));
        }
        C924810aAp.LJ().LJFF(this.LLLL);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("resource_id=");
        sbLIZ.append(this.LLL);
        sbLIZ.append('&');
        sbLIZ.append(zS());
        C319501Lt.LIZIZ("preview_dialog_show", C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.14gD] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.14iW] */
    public CountDownForAllV2EffectPreviewDialog(DataChannel dataChannel, String str, boolean z, C5185020h c5185020h) {
        super(dataChannel);
        this.LLL = str;
        this.LLLF = z;
        this.LLLFF = c5185020h;
        this.LLLFFI = C916490ZxP.LIZJ();
        this.LLLJIL = true;
        this.LLLL = new InterfaceC915240ZvO() { // from class: X.14gD
            @Override // X.InterfaceC915240ZvO
            public final void LIZ(int i) {
                MultiGuestDataHolder multiGuestDataHolder;
                if (i > 0) {
                    CountDownForAllV2EffectPreviewDialog countDownForAllV2EffectPreviewDialog = this.LIZ;
                    if (countDownForAllV2EffectPreviewDialog.LLLJIL && (multiGuestDataHolder = countDownForAllV2EffectPreviewDialog.LLLFFI) != null && multiGuestDataHolder.LJIILIIL == 0) {
                        C486790J7d.LIZLLL(new ARunnableS131S0100000_31(countDownForAllV2EffectPreviewDialog, 127), null, 300L);
                    }
                }
            }
        };
        this.LLLLII = EnumC311901Iv.OTHER;
        this.LLLLIIIILLL = new C0U45() { // from class: X.14iW
            @Override // X.C0U45
            public final void LIZ(LiveEffect liveEffect) {
                int iLLLFZ;
                String resourceId;
                C20441214yg.LIZIZ("CountDownForAllV2EffectPreviewDialog", "[downloadSticker] onDownloadSuccess");
                if (liveEffect != null) {
                    LiveEffect liveEffect2 = this.LIZ.LLLIL;
                    if (liveEffect2 != null) {
                        resourceId = liveEffect2.getResourceId();
                    } else {
                        resourceId = null;
                    }
                    if (Intrinsics.LJFF(resourceId, liveEffect.getResourceId())) {
                        CountDownForAllV2EffectPreviewDialog countDownForAllV2EffectPreviewDialog = this.LIZ;
                        countDownForAllV2EffectPreviewDialog.getClass();
                        if (liveEffect.LJJIJIIJI()) {
                            InterfaceC20340914iV interfaceC20340914iV = countDownForAllV2EffectPreviewDialog.LLLJL;
                            if (interfaceC20340914iV != null) {
                                interfaceC20340914iV.LIZLLL();
                            }
                        } else {
                            InterfaceC20340914iV interfaceC20340914iV2 = countDownForAllV2EffectPreviewDialog.LLLJL;
                            if (interfaceC20340914iV2 != null) {
                                interfaceC20340914iV2.LIZIZ(liveEffect);
                            }
                        }
                    }
                }
                C20414614uO c20414614uO = this.LIZ.LLLIIL;
                if (c20414614uO != null && (iLLLFZ = c20414614uO.LLLFZ(liveEffect)) >= 0 && iLLLFZ < c20414614uO.LL.size()) {
                    C20326414gA c20326414gA = (C20326414gA) ListProtector.get(c20414614uO.LL, iLLLFZ);
                    c20326414gA.LIZ.LJLILLLLZI(false);
                    c20326414gA.LIZ.LJJLIL(true);
                    c20414614uO.notifyItemChanged(iLLLFZ);
                }
            }

            @Override // X.C0U45
            public final void LIZJ(LiveEffect liveEffect) {
                C20441214yg.LIZIZ("CountDownForAllV2EffectPreviewDialog", "[downloadSticker] onDownloadStart");
                C20414614uO c20414614uO = this.LIZ.LLLIIL;
                if (c20414614uO != null) {
                    c20414614uO.LLLI(0, liveEffect);
                }
            }

            @Override // X.C0U45
            public final void LJ(LiveEffect liveEffect, ExceptionResult exceptionResult) {
                int iLLLFZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[downloadSticker] onDownloadFail. result: ");
                sbLIZ.append(exceptionResult);
                C20441214yg.LIZIZ("CountDownForAllV2EffectPreviewDialog", C2188811AlT.LIZIZ(sbLIZ));
                C20414614uO c20414614uO = this.LIZ.LLLIIL;
                if (c20414614uO != null && (iLLLFZ = c20414614uO.LLLFZ(liveEffect)) >= 0 && iLLLFZ < c20414614uO.LL.size()) {
                    ((C20326414gA) ListProtector.get(c20414614uO.LL, iLLLFZ)).LIZ.LJLILLLLZI(false);
                    c20414614uO.notifyItemChanged(iLLLFZ);
                }
            }

            @Override // X.C0U45
            public final void LIZIZ(LiveEffect liveEffect, int i, long j) {
                C20441214yg.LIZIZ("CountDownForAllV2EffectPreviewDialog", "[downloadSticker] onDownloading");
                C20414614uO c20414614uO = this.LIZ.LLLIIL;
                if (c20414614uO != null) {
                    c20414614uO.LLLI(i, liveEffect);
                }
            }
        };
    }
}
