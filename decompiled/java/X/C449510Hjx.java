package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.viewpager.widget.PagerAdapter;
import com.ss.android.ugc.aweme.feed.model.CommentPersonalizedEmoji;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0Hjx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C449510Hjx extends PagerAdapter {
    public final InterfaceC449820HkS LLILLJJLI;
    public final InterfaceC449500Hjw LLILLL;
    public final C450940HmG LLILZ = new C450940HmG();

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
        Iterator it2 = ((ArrayList) this.LLILLL.LIZIZ().LIZJ).iterator();
        int iAl = 0;
        while (it2.hasNext()) {
            iAl += ((InterfaceC444050Hb9) it2.next()).Al();
        }
        return iAl;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [X.0HkQ] */
    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJJI(int i, ViewGroup viewGroup) {
        List<C451030HmP> arrayList;
        int i2;
        C450940HmG c450940HmG = this.LLILZ;
        InterfaceC449500Hjw interfaceC449500Hjw = this.LLILLL;
        ?? r5 = new InterfaceC450890HmB() { // from class: X.0HkQ
            @Override // X.InterfaceC450890HmB
            public final void LIZIZ(StickerItem stickerItem, Rect rect) {
            }

            @Override // X.InterfaceC450890HmB
            public final void LIZJ() {
            }

            @Override // X.InterfaceC450890HmB
            public final void LIZLLL() {
            }

            @Override // X.InterfaceC450890HmB
            public final void LJFF(InterfaceC449850HkV interfaceC449850HkV, Rect rect) {
            }

            @Override // X.InterfaceC450890HmB
            public final void Op() {
            }

            @Override // X.InterfaceC450890HmB
            public final void ji(String str, boolean z, boolean z2) {
            }

            @Override // X.InterfaceC450890HmB
            public final void LJ() {
                this.LIZ.LLILLJJLI.Id();
            }

            @Override // X.InterfaceC450890HmB
            public final void LJI(String str) {
                this.LIZ.LLILLJJLI.Jd(1, 0, str);
            }

            @Override // X.InterfaceC450890HmB
            public final void zm(CommentPersonalizedEmoji commentPersonalizedEmoji) {
                this.LIZ.LLILLJJLI.Kd(commentPersonalizedEmoji, 1, 0);
            }

            @Override // X.InterfaceC450890HmB
            public final void LIZ(View view, C451030HmP c451030HmP) {
                this.LIZ.LLILLJJLI.LIZ(view, c451030HmP);
            }
        };
        c450940HmG.getClass();
        C449450Hjr c449450HjrLIZIZ = interfaceC449500Hjw.LIZIZ();
        if (i < 0) {
            c449450HjrLIZIZ.getClass();
        } else {
            Iterator it2 = ((ArrayList) c449450HjrLIZIZ.LIZJ).iterator();
            int iAl = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                InterfaceC444050Hb9 interfaceC444050Hb9 = (InterfaceC444050Hb9) it2.next();
                iAl += interfaceC444050Hb9.Al();
                if (i < iAl) {
                    if (interfaceC444050Hb9.LJII()) {
                        if (i < 0) {
                            arrayList = new ArrayList<>();
                        } else {
                            Iterator it3 = ((ArrayList) c449450HjrLIZIZ.LIZJ).iterator();
                            int iAl2 = 0;
                            while (true) {
                                if (it3.hasNext()) {
                                    InterfaceC444050Hb9 interfaceC444050Hb92 = (InterfaceC444050Hb9) it3.next();
                                    if (i < interfaceC444050Hb92.Al() + iAl2) {
                                        arrayList = interfaceC444050Hb92.LIZIZ(i - iAl2);
                                        break;
                                    }
                                    iAl2 += interfaceC444050Hb92.Al();
                                } else {
                                    arrayList = new ArrayList<>();
                                    break;
                                }
                            }
                            int iAl3 = 0;
                            for (InterfaceC444050Hb9 interfaceC444050Hb93 : (ArrayList) c449450HjrLIZIZ.LIZJ) {
                                if (i < interfaceC444050Hb93.Al() + iAl3) {
                                    i2 = i - iAl3;
                                    break;
                                }
                                iAl3 += interfaceC444050Hb93.Al();
                            }
                        }
                        i2 = 0;
                        String strJ4 = C786410Ut5.j4(c450940HmG.LIZ, new Object[]{interfaceC444050Hb9.LJ(), String.valueOf(i2)});
                        C450960HmI c450960HmIRemove = c450940HmG.LIZIZ.remove(strJ4);
                        if (c450960HmIRemove != null) {
                            c450940HmG.LIZIZ.put(strJ4, c450960HmIRemove);
                            View view = c450960HmIRemove.LIZIZ;
                            ViewParent parent = view.getParent();
                            if (parent instanceof ViewGroup) {
                                C786410Ut5.LJJJLZIJ(view, (ViewGroup) parent);
                            }
                            if (viewGroup.indexOfChild(view) < 0) {
                                viewGroup.addView(view);
                            }
                            C450940HmG.LIZ(c450960HmIRemove, arrayList, r5, c449450HjrLIZIZ, i);
                            return view;
                        }
                        C450960HmI c450960HmI = new C450960HmI(interfaceC444050Hb9.LIZJ(), viewGroup);
                        c450940HmG.LIZIZ.put(strJ4, c450960HmI);
                        View view2 = c450960HmI.LIZIZ;
                        if (viewGroup.indexOfChild(view2) < 0) {
                            viewGroup.addView(view2);
                        }
                        C450940HmG.LIZ(c450960HmI, arrayList, r5, c449450HjrLIZIZ, i);
                        return view2;
                    }
                }
            }
        }
        new C450760Hly();
        View viewLIZ = C450760Hly.LIZ(viewGroup);
        if (viewGroup.indexOfChild(viewLIZ) < 0) {
            viewGroup.addView(viewLIZ);
        }
        return viewLIZ;
    }

    public C449510Hjx(InterfaceC449820HkS interfaceC449820HkS, InterfaceC449500Hjw interfaceC449500Hjw, C117T c117t) {
        this.LLILLJJLI = interfaceC449820HkS;
        this.LLILLL = interfaceC449500Hjw;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIZILJ(ViewGroup viewGroup, int i, Object obj) {
        C786410Ut5.LJJJLZIJ((View) obj, viewGroup);
    }
}
