package X;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.gamora.editorpro.capabilities.audio.effect.logic.SoundEffectTabModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11en, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19553511en extends PagerAdapter {
    public final C19EG LLILLJJLI;
    public final C0E48 LLILLL;
    public final InterfaceC19556411fG LLILZ;
    public final ArrayList<SoundEffectTabModel> LLILZIL;
    public final SparseArray<C19554311ev> LLILZLL = new SparseArray<>();

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LLILZIL.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJJI(int i, ViewGroup viewGroup) {
        C19554311ev c19554311ev = this.LLILZLL.get(i);
        if (c19554311ev == null) {
            c19554311ev = new C19554311ev(this.LLILLJJLI, this.LLILLL, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.c2_, viewGroup, false), this.LLILZ, (SoundEffectTabModel) ListProtector.get(this.LLILZIL, i), i);
        }
        this.LLILZLL.put(i, c19554311ev);
        viewGroup.addView(c19554311ev.LIZIZ);
        return c19554311ev.LIZIZ;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJJIFFI(View view, Object obj) {
        return Intrinsics.LJFF(view, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIZILJ(ViewGroup viewGroup, int i, Object obj) {
        View view;
        if ((obj instanceof View) && (view = (View) obj) != null) {
            C786410Ut5.LJJJLZIJ(view, viewGroup);
        }
    }

    public final void LJJIJIL(Pair<Integer, Integer> pair, EnumC19554111et enumC19554111et, int i) {
        C19554311ev c19554311ev = this.LLILZLL.get(pair.getFirst().intValue());
        c19554311ev.LJ.LIZJ().LLF(pair.getSecond().intValue(), enumC19554111et, i);
    }

    public C19553511en(C19EG c19eg, C0E48 c0e48, C19552811eg c19552811eg, ArrayList arrayList) {
        this.LLILLJJLI = c19eg;
        this.LLILLL = c0e48;
        this.LLILZ = c19552811eg;
        this.LLILZIL = arrayList;
    }
}
