package X;

import Y.AUListenerS258S0100000_8;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.aikit.api.create.MentionService;
import com.ss.android.ugc.aweme.creative.model.common.InputBlock;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS291S0000000_8;
import kotlin.jvm.internal.AwS374S0200000_8;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: renamed from: X.0Lnp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C553830Lnp extends AbstractC1664510tPt<InterfaceC549200LgM> implements InterfaceC549200LgM {
    public static final C553980Lo4 LLJJL = new Object() { // from class: X.0Lo4
    };
    public final C549480Lgo LLJILJIL;
    public final InterfaceC549200LgM LLJILJILJ;
    public final int LLJILLL;
    public InterfaceC550010Lhf LLJJ;
    public InterfaceC551450Ljz LLJJI;
    public C19A3 LLJJIII;
    public InterfaceC551280Lji LLJJIJI;
    public InterfaceC551310Ljl LLJJIJIIJIL;
    public View LLJJIJIL;
    public Context LLJJJ;
    public String LLJJJIL;
    public final MentionService LLJJJJ;
    public final MutableLiveData<Float> LLJJJJJIL;
    public final ViewTreeObserver.OnGlobalLayoutListener LLJJJJLIIL;

    public final Drawable K4() {
        AFwS291S0000000_8 aFwS291S0000000_8 = AFwS291S0000000_8.get$arr$(5);
        C553850Lnr c553850Lnr = new C553850Lnr();
        c553850Lnr.strokeWidth(C418440Gaw.LIZIZ(1));
        c553850Lnr.cornerRadius(C418440Gaw.LIZIZ(26));
        c553850Lnr.colors(new int[]{-7895161, -12566464, -7895161, -12566464, -7895161});
        c553850Lnr.dynamicPositionCalculate(aFwS291S0000000_8);
        c553850Lnr.build();
        C553860Lns c553860Lns = new C553860Lns();
        c553850Lnr.build();
        c553860Lns.LIZ = c553850Lnr;
        if (c553850Lnr.getAnimate$tools_ai_uikit_df_release()) {
            ValueAnimator valueAnimator = c553860Lns.LIZJ;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
            valueAnimatorOfFloat.setDuration(c553860Lns.LIZ.getAnimationDuration$tools_ai_uikit_df_release());
            valueAnimatorOfFloat.setRepeatCount(-1);
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS258S0100000_8(c553860Lns, 9));
            valueAnimatorOfFloat.start();
            c553860Lns.LIZJ = valueAnimatorOfFloat;
        }
        C0F7G c0f7g = new C0F7G();
        c553860Lns.LIZ(c0f7g);
        return c0f7g;
    }

    private final List<MentionDataItem> P4() {
        List<MentionDataItem> listLIZ;
        C550000Lhe<List<MentionDataItem>> initFollowPathUserInfos$tools_ai_uikit_df_release = this.LLJILJIL.getInitFollowPathUserInfos$tools_ai_uikit_df_release();
        return (initFollowPathUserInfos$tools_ai_uikit_df_release == null || (listLIZ = initFollowPathUserInfos$tools_ai_uikit_df_release.LIZ()) == null) ? C13BV.INSTANCE : listLIZ;
    }

    @Override // X.InterfaceC549200LgM
    public LiveData<C549360Lgc> Ij() {
        LiveData<C549360Lgc> liveDataIj;
        InterfaceC551450Ljz interfaceC551450Ljz = this.LLJJI;
        if (interfaceC551450Ljz == null || (liveDataIj = interfaceC551450Ljz.Ij()) == null) {
            throw new IllegalStateException("inputLogicApi is null");
        }
        return liveDataIj;
    }

    @Override // X.InterfaceC549200LgM
    public LiveData<MediaModel> LLLLIIL() {
        LiveData<MediaModel> liveDataLLLLIIL;
        InterfaceC550010Lhf interfaceC550010Lhf = this.LLJJ;
        if (interfaceC550010Lhf == null || (liveDataLLLLIIL = interfaceC550010Lhf.LLLLIIL()) == null) {
            throw new IllegalStateException("choosePhotoApi is null");
        }
        return liveDataLLLLIIL;
    }

    @Override // X.InterfaceC549200LgM
    public C11RK<List<InputBlock>> O0() {
        C11RK<List<InputBlock>> c11rkO0;
        InterfaceC551280Lji interfaceC551280Lji = this.LLJJIJI;
        if (interfaceC551280Lji == null || (c11rkO0 = interfaceC551280Lji.O0()) == null) {
            throw new IllegalStateException("mentionEditUiComponent is null");
        }
        return c11rkO0;
    }

    @Override // X.InterfaceC549200LgM
    public LiveData<C551290Ljj> Xa() {
        LiveData<C551290Ljj> liveDataXa;
        InterfaceC551450Ljz interfaceC551450Ljz = this.LLJJI;
        if (interfaceC551450Ljz == null || (liveDataXa = interfaceC551450Ljz.Xa()) == null) {
            throw new IllegalStateException("inputLogicApi is null");
        }
        return liveDataXa;
    }

    @Override // X.InterfaceC549200LgM
    public LiveData<C537550L6j> u5() {
        LiveData<C537550L6j> liveDataU5;
        InterfaceC551450Ljz interfaceC551450Ljz = this.LLJJI;
        if (interfaceC551450Ljz == null || (liveDataU5 = interfaceC551450Ljz.u5()) == null) {
            throw new IllegalStateException("inputLogicApi is null");
        }
        return liveDataU5;
    }

    @Override // X.InterfaceC549200LgM
    public LiveData<C548260Leq> vs() {
        LiveData<C548260Leq> liveDataVs;
        InterfaceC551450Ljz interfaceC551450Ljz = this.LLJJI;
        if (interfaceC551450Ljz == null || (liveDataVs = interfaceC551450Ljz.vs()) == null) {
            throw new IllegalStateException("inputLogicApi is null");
        }
        return liveDataVs;
    }

    @Override // X.AbstractC1664510tPt, X.AbstractC2255721DQs
    public void onDestroy() {
        View view;
        ViewTreeObserver viewTreeObserver;
        super.onDestroy();
        C19A3 c19a3 = this.LLJJIII;
        if (c19a3 == null || (view = c19a3.mView) == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.LLJJJJLIIL;
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        C2187701Ajg.LIZIZ(viewTreeObserver, onGlobalLayoutListener, ViewTreeObserver.OnGlobalLayoutListener.class);
    }

    public InterfaceC549200LgM O4() {
        return this.LLJILJILJ;
    }

    public MutableLiveData<Float> T4() {
        return this.LLJJJJJIL;
    }

    @Override // X.InterfaceC549200LgM
    public /* bridge */ /* synthetic */ LiveData XV() {
        return this.LLJJJJJIL;
    }

    @Override // X.AbstractC1664510tPt, X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1664510tPt
    public int q3() {
        return this.LLJILLL;
    }

    private final void Z4(C19A3 c19a3) {
        View viewFindViewById = c19a3.findViewById(R.id.ksg);
        if (viewFindViewById == null) {
            return;
        }
        this.LLJJIJIL = viewFindViewById;
        Context sceneContext = c19a3.getSceneContext();
        if (sceneContext == null) {
            return;
        }
        this.LLJJJ = sceneContext;
        viewFindViewById.setForeground(K4());
    }

    public final void H4(EnumC553970Lo3 enumC553970Lo3) {
        int i = C553960Lo2.LIZ[enumC553970Lo3.ordinal()];
        ViewGroup.LayoutParams layoutParams = null;
        if (i != 1) {
            if (i == 2) {
                InterfaceC551280Lji interfaceC551280Lji = this.LLJJIJI;
                if (interfaceC551280Lji != null) {
                    interfaceC551280Lji.ka(false);
                }
                View view = this.LLJJIJIL;
                if (view != null) {
                    view.setBackground(null);
                }
                View view2 = this.LLJJIJIL;
                if (view2 != null) {
                    view2.setForeground(null);
                }
                View view3 = this.LLJJIJIL;
                if (view3 != null) {
                    ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
                    if (layoutParams2 != null) {
                        layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52));
                        layoutParams = layoutParams2;
                    }
                    C786410Ut5.W5(view3, layoutParams);
                    return;
                }
                return;
            }
            throw new C1954807lC();
        }
        InterfaceC551280Lji interfaceC551280Lji2 = this.LLJJIJI;
        if (interfaceC551280Lji2 != null) {
            interfaceC551280Lji2.ka(true);
        }
        View view4 = this.LLJJIJIL;
        if (view4 != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(26));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.zg);
            Context context = this.LLJJJ;
            if (context == null) {
                return;
            } else {
                view4.setBackground(c384050F3z.LIZ(context));
            }
        }
        View view5 = this.LLJJIJIL;
        if (view5 != null) {
            view5.setForeground(K4());
        }
        View view6 = this.LLJJIJIL;
        if (view6 == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams3 = view6.getLayoutParams();
        if (layoutParams3 != null) {
            layoutParams3.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(138));
            layoutParams = layoutParams3;
        }
        C786410Ut5.W5(view6, layoutParams);
    }

    @Override // X.AbstractC1664510tPt
    public void o2(C19A3 c19a3) {
        View view;
        ViewTreeObserver viewTreeObserver;
        this.LLJJIII = c19a3;
        if (c19a3 != null && (view = c19a3.mView) != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.LLJJJJLIIL;
            viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
            C2187701Ajg.LIZ(viewTreeObserver, onGlobalLayoutListener, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        this.LLJJIJI = z4(c19a3, R.id.kqv);
        this.LLJJIJIIJIL = F4(c19a3, R.id.o7f);
        T2("AICreationInputComponent", new AwS587S0100000_8(this, 35));
        X1("AICreationInputComponent", new AwS374S0200000_8(this, c19a3, 9));
        Z4(c19a3);
    }

    private final C554020Lo8 F4(C19A3 c19a3, int i) {
        Map<MentionDataItem, MentionDataItem> mapLIZ;
        C553900Lnw c553900Lnw = new C553900Lnw(this);
        C553990Lo5 c553990Lo5 = new C553990Lo5();
        c553990Lo5.mentionLimit(this.LLJILJIL.getMentionEditConfig$tools_ai_uikit_df_release().getMentionLimit$tools_ai_uikit_df_release());
        List<MentionDataItem> listP4 = P4();
        C550000Lhe<Map<MentionDataItem, MentionDataItem>> initUserSwitchInfos$tools_ai_uikit_df_release = this.LLJILJIL.getInitUserSwitchInfos$tools_ai_uikit_df_release();
        List<MentionDataItem> listLIZ = null;
        if (initUserSwitchInfos$tools_ai_uikit_df_release != null) {
            mapLIZ = initUserSwitchInfos$tools_ai_uikit_df_release.LIZ();
        } else {
            mapLIZ = null;
        }
        c553990Lo5.followPathMode(listP4, mapLIZ);
        c553990Lo5.dataSource(c553900Lnw);
        c553990Lo5.toolTipOperator(this.LLJILJIL.getMentionEditConfig$tools_ai_uikit_df_release().getTooltipOperator$tools_ai_uikit_df_release());
        C550000Lhe<List<MentionDataItem>> insertItemList$tools_ai_uikit_df_release = this.LLJILJIL.getInsertItemList$tools_ai_uikit_df_release();
        if (insertItemList$tools_ai_uikit_df_release != null) {
            listLIZ = insertItemList$tools_ai_uikit_df_release.LIZ();
        }
        c553990Lo5.forceInsertRecommendItem(listLIZ);
        c553990Lo5.mentionTextConfig(this.LLJILJIL.getMentionEditConfig$tools_ai_uikit_df_release().getUiTextConfig$tools_ai_uikit_df_release());
        if (c19a3.mActivity instanceof InterfaceC20597015ii) {
            c553990Lo5.lifecycleOwnerSetter(new AwS587S0100000_8(c19a3, 36));
        }
        C554020Lo8 c554020Lo8 = new C554020Lo8();
        c554020Lo8.LIZ = c553990Lo5;
        c19a3.add(i, c554020Lo8.LIZ(), "mention_list_scene_tag");
        return c554020Lo8;
    }

    private final InterfaceC551280Lji z4(C19A3 c19a3, int i) {
        C553800Lnm c553800Lnm = new C553800Lnm(this);
        C553890Lnv c553890Lnv = new C553890Lnv(this);
        C557380LtY c557380LtY = new C557380LtY();
        C553840Lnq c553840Lnq = new C553840Lnq();
        c553840Lnq.from(this.LLJILJIL.getMentionEditConfig$tools_ai_uikit_df_release());
        c553840Lnq.mentionPanelSearchHandler(c553800Lnm);
        c553840Lnq.inputBoxEventHandler(c553890Lnv);
        c553840Lnq.inputBoxBackgroundDrawableCreator(new C553880Lnu(this));
        c557380LtY.LIZ = c553840Lnq;
        c19a3.add(i, c557380LtY.LIZ(), "MentionEditGroupScene");
        return c557380LtY;
    }

    @Override // X.InterfaceC549200LgM
    public void t2(List<MentionDataItem> list, boolean z) {
        InterfaceC551310Ljl interfaceC551310Ljl = this.LLJJIJIIJIL;
        if (interfaceC551310Ljl != null) {
            interfaceC551310Ljl.t2(list, z);
        }
    }

    public C553830Lnp(C549480Lgo c549480Lgo, C19A3 c19a3, C1DRG c1drg) {
        super(c19a3, c1drg);
        this.LLJILJIL = c549480Lgo;
        this.LLJILJILJ = this;
        this.LLJILLL = R.layout.nx;
        this.LLJJJJ = c549480Lgo.getMentionService$tools_ai_uikit_df_release();
        this.LLJJJJJIL = new MutableLiveData<>();
        this.LLJJJJLIIL = new ViewTreeObserverOnGlobalLayoutListenerC581000MqY(this, 0);
    }
}
