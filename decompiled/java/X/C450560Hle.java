package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewpager.widget.PagerAdapter;
import com.ss.android.ugc.aweme.comment.multipanel.EmojiInputViewImplV2;
import com.ss.android.ugc.aweme.comment.multipanel.InputViewDelegate;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0Hle, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C450560Hle extends PagerAdapter {
    public final InterfaceC450680Hlq LLILLJJLI;
    public final C117T LLILLL;
    public final C449530Hjz LLILZ;
    public final LifecycleOwner LLILZIL;
    public final int LLILZLL = R.attr.a1b;
    public final InputViewDelegate LLIZ;
    public final HashMap<Integer, C450570Hlf> LLIZLLLIL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIJJ(Object obj) {
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJJIFFI(View view, Object obj) {
        return view == obj;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return ((ArrayList) this.LLILZ.LLILZIL.LIZJ).size();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019d  */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.0Hlh, X.0HmB] */
    @Override // androidx.viewpager.widget.PagerAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJI(int r30, android.view.ViewGroup r31) {
        /*
            Method dump skipped, instruction units count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C450560Hle.LJJI(int, android.view.ViewGroup):java.lang.Object");
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIZILJ(ViewGroup viewGroup, int i, Object obj) {
        C786410Ut5.LJJJLZIJ((View) obj, viewGroup);
    }

    public C450560Hle(EmojiInputViewImplV2 emojiInputViewImplV2, C117T c117t, C449530Hjz c449530Hjz, LifecycleOwner lifecycleOwner) {
        this.LLILLJJLI = emojiInputViewImplV2;
        this.LLILLL = c117t;
        this.LLILZ = c449530Hjz;
        this.LLILZIL = lifecycleOwner;
        c117t.getContext();
        this.LLIZ = new InputViewDelegate(emojiInputViewImplV2);
        this.LLIZLLLIL = new LinkedHashMap();
    }
}
