package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.UrlModel;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.effect.countdown.CountDownEffectDownloadNumberSetting;
import com.bytedance.android.live.effect.micseatemoji.MicSeatEmojiViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS245S0000000_12;

/* JADX INFO: renamed from: X.0He6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C445880He6 extends FrameLayout {
    public final int LL;
    public final C336201Se LLILLJJLI;
    public final C445960HeE LLILLL;
    public final FrameLayout LLILZ;
    public final C370250EfP LLILZIL;
    public final C054G LLILZLL;
    public boolean LLIZ;
    public Function0<Unit> LLIZLLLIL;

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C054G c054g = this.LLILZLL;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(c054g, C2107308Nj.LIZ, null, new C334701Rp(this, null), 2);
        C23250099c.LIZLLL(this.LLILZLL, null, null, new C334601Ro(this, null), 3);
        final C336201Se c336201Se = this.LLILLJJLI;
        c336201Se.getClass();
        C0U40 liveEffectDataProvider = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveEffectDataProvider();
        InterfaceC445970HeF<LiveEffect> interfaceC445970HeF = new InterfaceC445970HeF<LiveEffect>() { // from class: X.0U3z
            @Override // X.InterfaceC445970HeF
            public final void LIZ(String str) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("fetchMicSeatEmojiList fail, reason: ");
                sbLIZ.append(str);
                C20441214yg.LJ("MicSeatEmojiListViewModel", C2188811AlT.LIZIZ(sbLIZ));
                C766270U4b.LJIIJJI(str);
            }

            @Override // X.InterfaceC445970HeF
            public final void onSuccess(List<? extends LiveEffect> list) {
                UrlModel icon;
                List<String> list2;
                String str;
                List<String> list3;
                C336201Se c336201Se2 = c336201Se;
                ArrayList<LiveEffect> arrayList = new ArrayList();
                for (LiveEffect liveEffect : list) {
                    c336201Se2.getClass();
                    UrlModel icon2 = liveEffect.getIcon();
                    if (icon2 != null) {
                        list3 = icon2.urlList;
                    } else {
                        list3 = null;
                    }
                    if (C500260Jjc.LJJIJIIJI(list3)) {
                        arrayList.add(liveEffect);
                    }
                }
                c336201Se.LIZ.setValue(arrayList);
                C336201Se c336201Se3 = c336201Se;
                for (LiveEffect liveEffect2 : arrayList) {
                    if (!new C0VSJ(c336201Se3.LIZJ.getFullPath(), liveEffect2.getResourceId()).exists() && (icon = liveEffect2.getIcon()) != null && (list2 = icon.urlList) != null && (str = (String) C930540aK4.LJIJ(0, list2)) != null) {
                        C207232167i.LIZIZ(new C207209166l(liveEffect2.getResourceId(), c336201Se3.LIZJ, null, null, str, null, false, 1, true, 236), AFwS245S0000000_12.get$arr$(211));
                    }
                }
            }
        };
        liveEffectDataProvider.getClass();
        MicSeatEmojiViewModel micSeatEmojiViewModel = (MicSeatEmojiViewModel) C0U61.LIZ(new ViewModelProvider.Factory() { // from class: X.0U4H
            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
                return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
                return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [X.0U4O] */
            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final <T extends ViewModel> T create(Class<T> cls) {
                if (cls.isAssignableFrom(MicSeatEmojiViewModel.class)) {
                    return new MicSeatEmojiViewModel(new C0UMB("live_mic_seat_emoticon"), new C0U5H() { // from class: X.0U4O
                        public final C0U6E LIZJ = new C0U6E();

                        @Override // X.C0U3X
                        public final List<C0U74<LiveEffect>> LJI(EffectChannelResponse effectChannelResponse) {
                            return this.LIZJ.LJI(effectChannelResponse);
                        }

                        @Override // X.C0U5H, X.C0U69
                        public final List<C0U74<LiveEffect>> LJIIIZ(List<C0U74<LiveEffect>> list) {
                            Iterator<C0U74<LiveEffect>> it2 = list.iterator();
                            while (it2.hasNext()) {
                                int i = 0;
                                for (LiveEffect liveEffect : it2.next().LIZIZ) {
                                    int i2 = i + 1;
                                    List<String> list2 = null;
                                    if (i >= 0) {
                                        LiveEffect liveEffect2 = liveEffect;
                                        boolean zLJIILLIIL = C766720U5u.LJIILLIIL(liveEffect2);
                                        liveEffect2.LJJLIL(zLJIILLIIL);
                                        if (zLJIILLIIL) {
                                            C0JBN c0jbnLIZ = C1819620xS4.LIZ();
                                            UrlModel icon = liveEffect2.getIcon();
                                            if (icon != null) {
                                                list2 = icon.urlList;
                                            }
                                            c0jbnLIZ.LIZJ(list2).LJJIIJZLJL();
                                        } else if (i2 <= CountDownEffectDownloadNumberSetting.INSTANCE.getValue()) {
                                            LJIIL(liveEffect2, null, false, false, false);
                                        }
                                        i = i2;
                                    } else {
                                        C1697810uHb.LJIJI();
                                        throw null;
                                    }
                                }
                            }
                            return list;
                        }
                    });
                }
                throw new IllegalArgumentException("UnKnown class");
            }
        }).get(MicSeatEmojiViewModel.class);
        micSeatEmojiViewModel.getClass();
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(micSeatEmojiViewModel), C0PEM.LIZJ, null, new C0U4G(micSeatEmojiViewModel, interfaceC445970HeF, null), 2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C2296808zG.LIZJ(this.LLILZLL, null);
    }

    public final Function0<Unit> getOnDialogDismiss() {
        return this.LLIZLLLIL;
    }

    public final void LIZ(int i) {
        ViewGroup.LayoutParams layoutParams = this.LLILZ.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        int i2 = this.LL;
        if (i < i2) {
            i = i2;
        }
        if (layoutParams.width == i) {
            return;
        }
        layoutParams.width = i;
        C786410Ut5.a6(this.LLILZ, layoutParams);
        this.LLILZ.invalidateOutline();
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        float f;
        super.onRtlPropertiesChanged(i);
        if (this.LLILZIL != null) {
            C370250EfP c370250EfP = this.LLILZIL;
            if (i == 1) {
                f = -1.0f;
            } else {
                f = 1.0f;
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c370250EfP);
            c370250EfP.setScaleX(f);
        }
    }

    public final void setOnDialogDismiss(Function0<Unit> function0) {
        this.LLIZLLLIL = function0;
    }

    public C445880He6(Context context, AttributeSet attributeSet) {
        float f;
        super(context, attributeSet, 0);
        this.LL = (int) C497740JfY.LIZIZ(60.0f);
        this.LLILLJJLI = new C336201Se();
        C445960HeE c445960HeE = new C445960HeE(this, new C5183020f(this, 254));
        this.LLILLL = c445960HeE;
        C23119094b c23119094bLIZ = C2296908zH.LIZ();
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLILZLL = C2296808zG.LIZ(C09A1.LIZLLL(c23119094bLIZ, C2107308Nj.LIZ.LLIILII()));
        setMinimumHeight((int) C497740JfY.LIZIZ(72.0f));
        int iLIZIZ = (int) C497740JfY.LIZIZ(16.0f);
        setPadding(iLIZIZ, 0, iLIZIZ, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.h8a, this, true);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.h0a);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.cx_);
        this.LLILZ = frameLayout;
        this.LLILZIL = (C370250EfP) findViewById(R.id.cxe);
        int layoutDirection = getLayoutDirection();
        C370250EfP c370250EfP = this.LLILZIL;
        if (layoutDirection == 1) {
            f = -1.0f;
        } else {
            f = 1.0f;
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c370250EfP);
        c370250EfP.setScaleX(f);
        frameLayout.setOutlineProvider(new C0IDA((int) C497740JfY.LIZIZ(100.0f), 11));
        frameLayout.setClipToOutline(true);
        recyclerView.setAdapter(c445960HeE);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        recyclerView.setItemAnimator(null);
        int iLJIIZILJ = (C497740JfY.LJIIZILJ() - ((int) C497740JfY.LIZIZ(32.0f))) / 6;
        if (iLJIIZILJ > 0 && c445960HeE.LLILLJJLI != iLJIIZILJ) {
            c445960HeE.LLILLJJLI = iLJIIZILJ;
            c445960HeE.notifyDataSetChanged();
        }
    }
}
