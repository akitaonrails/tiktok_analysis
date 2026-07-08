package X;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.android.live.effect.StickerSelectChannel;
import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS626S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UAP, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UAP extends PagerAdapter {
    public final DataChannel LLILLJJLI;
    public final String LLILLL;
    public final InterfaceC769000UEo LLILZ;
    public final StickerEffectViewModel LLILZIL;
    public final List<C0UBH> LLILZLL = new ArrayList();
    public C0UA6 LLIZ;
    public LiveEffect LLIZLLLIL;
    public C767980UAq LLJ;
    public C767850UAd LLJI;
    public C767940UAm LLJIJIL;
    public final List<AbstractC767840UAc> LLJILJIL;
    public AbstractC767840UAc LLJILJILJ;
    public Integer LLJILLL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIJJ(Object obj) {
        return -2;
    }

    public final void LJJIJL() {
        for (AbstractC767840UAc abstractC767840UAc : this.LLJILJIL) {
            abstractC767840UAc.LIZJ.LLLLZLLLI();
            C781710UlV c781710UlV = abstractC767840UAc.LJIILL;
            if (c781710UlV != null) {
                c781710UlV.LIZIZ();
            }
        }
    }

    public final void LJJIJLIJ() {
        for (AbstractC767840UAc abstractC767840UAc : this.LLJILJIL) {
            abstractC767840UAc.LIZ();
            abstractC767840UAc.LIZJ.LLJILLL = false;
            abstractC767840UAc.LJFF = false;
        }
    }

    public final void LJJIL() {
        for (AbstractC767840UAc abstractC767840UAc : this.LLJILJIL) {
            abstractC767840UAc.LIZJ.LLLZ();
            C781710UlV c781710UlV = abstractC767840UAc.LJIILL;
            if (c781710UlV != null) {
                c781710UlV.LIZJ(true);
            }
        }
    }

    public final void LJJJ() {
        List<LiveEffect> listQr;
        InterfaceC769000UEo interfaceC769000UEo = this.LLILZ;
        this.LLIZLLLIL = (interfaceC769000UEo == null || (listQr = interfaceC769000UEo.qr(this.LLILLL)) == null) ? null : (LiveEffect) C13LP.LJJJLL(listQr);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return ((ArrayList) this.LLILZLL).size();
    }

    public final void LJJIJIL(LiveEffect liveEffect) {
        C0UA6 c0ua6 = this.LLIZ;
        if (c0ua6 != null) {
            c0ua6.LIZ(this.LLIZLLLIL, liveEffect);
        }
        this.LLIZLLLIL = liveEffect;
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            if (liveEffect == null) {
                liveEffect = C0U7C.LIZIZ(EnumC767550U8z.NONE);
            }
            dataChannel.zW(StickerSelectChannel.class, liveEffect);
        }
    }

    public final void LJJIZ(int i) {
        AbstractC767840UAc abstractC767840UAc;
        Object next;
        Boolean boolValueOf;
        AbstractC767840UAc abstractC767840UAc2;
        String str;
        Integer num;
        Integer num2 = null;
        if (i >= ((ArrayList) this.LLILZLL).size()) {
            HashMap map = new HashMap();
            map.put("error_type", "onPanelSelected_IndexOutOfBoundsException");
            HashMap map2 = new HashMap();
            map2.put("position", Integer.valueOf(i));
            map2.put("dataList", C13LP.LJJLIIIJ(this.LLILZLL, ",", null, null, 0, null, null, 62));
            map2.put("error_stack", Log.getStackTraceString(new Exception()));
            C1CC2.LIZLLL("ttlive_quality_stability_error", map, null, map2);
            return;
        }
        AbstractC767840UAc abstractC767840UAc3 = this.LLJILJILJ;
        int i2 = 0;
        if ((abstractC767840UAc3 == null || (num = abstractC767840UAc3.LJ) == null || num.intValue() != i) && (abstractC767840UAc = this.LLJILJILJ) != null) {
            if (abstractC767840UAc.LJII) {
                abstractC767840UAc.LJII = false;
                C781710UlV c781710UlV = abstractC767840UAc.LJIILL;
                if (c781710UlV != null) {
                    c781710UlV.LIZIZ();
                }
                abstractC767840UAc.LIZJ.LLLLZLLLI();
            }
            abstractC767840UAc.LJ = null;
        }
        Iterator it2 = ((ArrayList) this.LLJILJIL).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                C0UBH c0ubh = ((AbstractC767840UAc) next).LJI;
                if (c0ubh != null) {
                    str = c0ubh.LIZIZ;
                } else {
                    str = null;
                }
                if (Intrinsics.LJFF(str, ((C0UBH) ListProtector.get(this.LLILZLL, i)).LIZIZ)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        this.LLJILJILJ = (AbstractC767840UAc) next;
        this.LLJILLL = Integer.valueOf(i);
        AbstractC767840UAc abstractC767840UAc4 = this.LLJILJILJ;
        if (abstractC767840UAc4 != null) {
            boolValueOf = Boolean.valueOf(abstractC767840UAc4.LJFF);
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJIFFI(boolValueOf) && (abstractC767840UAc2 = this.LLJILJILJ) != null) {
            abstractC767840UAc2.LJFF();
        }
        AbstractC767840UAc abstractC767840UAc5 = this.LLJILJILJ;
        if (abstractC767840UAc5 != null) {
            num2 = abstractC767840UAc5.LJ;
        }
        if (!Intrinsics.LJFF(num2, this.LLJILLL)) {
            AbstractC767840UAc abstractC767840UAc6 = this.LLJILJILJ;
            if (abstractC767840UAc6 != null && !abstractC767840UAc6.LJII) {
                abstractC767840UAc6.LIZLLL();
                abstractC767840UAc6.LJII = true;
                C781710UlV c781710UlV2 = abstractC767840UAc6.LJIILL;
                if (c781710UlV2 != null) {
                    c781710UlV2.LIZJ(true);
                }
                abstractC767840UAc6.LIZJ.LLLZ();
                Context context = abstractC767840UAc6.LIZ.getContext();
                do {
                    C01GW c01gw = C485950J3x.LIZ;
                    C485950J3x.LIZLLL(R.layout.gey, context);
                    i2++;
                } while (i2 < 30);
            }
            AbstractC767840UAc abstractC767840UAc7 = this.LLJILJILJ;
            if (abstractC767840UAc7 != null) {
                abstractC767840UAc7.LJ = Integer.valueOf(i);
            }
        }
    }

    public final void setData(List<C0UBH> list) {
        ((ArrayList) this.LLILZLL).clear();
        ((ArrayList) this.LLILZLL).addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJJI(int i, final ViewGroup viewGroup) {
        AbstractC767840UAc c767860UAe;
        C0UBH c0ubh = (C0UBH) ListProtector.get(this.LLILZLL, i);
        if (Intrinsics.LJFF(c0ubh.LIZ, "search")) {
            c767860UAe = this.LLJI;
            if (c767860UAe == null) {
                final DataChannel dataChannel = this.LLILLJJLI;
                final InterfaceC769000UEo interfaceC769000UEo = this.LLILZ;
                final StickerEffectViewModel stickerEffectViewModel = this.LLILZIL;
                c767860UAe = new C767850UAd(viewGroup, interfaceC769000UEo, stickerEffectViewModel, dataChannel) { // from class: X.0UAT
                    {
                        super(viewGroup, dataChannel, interfaceC769000UEo, stickerEffectViewModel, new C0U9T(false, dataChannel, stickerEffectViewModel, null), new GridLayoutManager(5, 1, viewGroup.getContext(), false));
                        this.LJIIIZ.LJ(C0U4C.EFFECT_SEARCH_STICKER, true, null);
                    }
                };
            }
        } else if (Intrinsics.LJFF(c0ubh.LIZ, "favorite")) {
            c767860UAe = this.LLJ;
            if (c767860UAe == null) {
                DataChannel dataChannel2 = this.LLILLJJLI;
                c767860UAe = new C767980UAq(viewGroup, this.LLILZ, this.LLILZIL, dataChannel2);
            }
        } else if (Intrinsics.LJFF(c0ubh.LIZIZ, "Recents")) {
            c767860UAe = this.LLJIJIL;
            if (c767860UAe == null) {
                DataChannel dataChannel3 = this.LLILLJJLI;
                c767860UAe = new C767940UAm(viewGroup, this.LLILZ, this.LLILZIL, dataChannel3);
            }
        } else {
            c767860UAe = new C767860UAe(viewGroup, this.LLILZ, this.LLILZIL, this.LLILLJJLI);
        }
        C0U9B c0u9b = c767860UAe.LIZJ;
        Intrinsics.LJFF(c0ubh.LIZ, "search");
        c0u9b.getClass();
        c767860UAe.LIZJ.LLLZIL();
        c767860UAe.LJI(c0ubh, C767250U7v.LJIIIZ(c0ubh.LIZIZ), this.LLILLL, new AwS626S0100000_12(this, 42));
        viewGroup.addView(c767860UAe.LJIIIIZZ);
        if (!((ArrayList) this.LLJILJIL).contains(c767860UAe)) {
            ((ArrayList) this.LLJILJIL).add(c767860UAe);
        }
        Integer num = this.LLJILLL;
        if (num != null && i == num.intValue()) {
            LJJIZ(i);
        }
        return c767860UAe;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJJIFFI(View view, Object obj) {
        if (obj instanceof AbstractC767840UAc) {
            return Intrinsics.LJFF(((AbstractC767840UAc) obj).LJIIIIZZ, view);
        }
        return false;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIZILJ(ViewGroup viewGroup, int i, Object obj) {
        if (obj instanceof AbstractC767840UAc) {
            AbstractC767840UAc abstractC767840UAc = (AbstractC767840UAc) obj;
            abstractC767840UAc.LIZJ();
            abstractC767840UAc.LIZJ.LLLZLL();
            C786410Ut5.LJJJLZIJ(abstractC767840UAc.LJIIIIZZ, viewGroup);
        }
        if (obj instanceof C767860UAe) {
            ((ArrayList) this.LLJILJIL).remove(obj);
            return;
        }
        if (obj instanceof C767980UAq) {
            this.LLJ = (C767980UAq) obj;
        } else if (obj instanceof C767940UAm) {
            this.LLJIJIL = (C767940UAm) obj;
        } else {
            if (!(obj instanceof C767850UAd)) {
                return;
            }
            this.LLJI = (C767850UAd) obj;
        }
    }

    public C0UAP(DataChannel dataChannel, String str, InterfaceC769000UEo interfaceC769000UEo, StickerEffectViewModel stickerEffectViewModel) {
        LiveEffect liveEffect;
        List<LiveEffect> listQr;
        this.LLILLJJLI = dataChannel;
        this.LLILLL = str;
        this.LLILZ = interfaceC769000UEo;
        this.LLILZIL = stickerEffectViewModel;
        if (interfaceC769000UEo != null && (listQr = interfaceC769000UEo.qr(str)) != null) {
            liveEffect = (LiveEffect) C13LP.LJJJLL(listQr);
        } else {
            liveEffect = null;
        }
        this.LLIZLLLIL = liveEffect;
        this.LLJILJIL = new ArrayList();
    }
}
