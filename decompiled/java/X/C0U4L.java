package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.base.model.UrlModel;
import com.bytedance.android.live.effect.countdown.CountDownEffectDownloadNumberSetting;
import com.bytedance.android.live.effect.countdown.CountDownEffectViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0U4L, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U4L implements ViewModelProvider.Factory {
    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
        return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
        return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0U4N] */
    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> cls) {
        if (cls.isAssignableFrom(CountDownEffectViewModel.class)) {
            return new CountDownEffectViewModel(new C0UMB(C0UD4.LIZJ), new C0U5H() { // from class: X.0U4N
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
}
