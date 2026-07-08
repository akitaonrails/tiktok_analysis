package X;

import Y.ARunnableS29S0101000_18;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.post.tag.TagBarLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS667S0100000_18;

/* JADX INFO: renamed from: X.0h4K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1189860h4K extends FrameLayout {
    public static final /* synthetic */ int LLILZLL = 0;
    public final RecyclerView LL;
    public final C1189910h4P LLILLJJLI;
    public InterfaceC1631620sYq<? super Integer, ? super PoiListApi.PostTag, ? super Boolean, Unit> LLILLL;
    public EnumC1189880h4M LLILZ;
    public List<PoiListApi.PostTag> LLILZIL;

    public C1189860h4K(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void LIZLLL() {
        int i;
        TagBarLayoutManager tagBarLayoutManager;
        int iLJ;
        int size = this.LLILZIL.size();
        int i2 = C1189870h4L.LIZ[this.LLILZ.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new C1954807lC();
                }
            }
        } else {
            i = size > 6 ? 2 : 1;
        }
        int iLJ2 = C13LZ.LJ(i, 1, 2);
        RecyclerView.LayoutManager layoutManager = this.LL.getLayoutManager();
        if ((layoutManager instanceof TagBarLayoutManager) && (tagBarLayoutManager = (TagBarLayoutManager) layoutManager) != null && tagBarLayoutManager.LLILZ != (iLJ = C13LZ.LJ(iLJ2, 1, 2))) {
            tagBarLayoutManager.LLILZ = iLJ;
            tagBarLayoutManager.LJIJ();
            tagBarLayoutManager.requestLayout();
        }
        this.LL.requestLayout();
    }

    public final int getHorizontalScrollOffset() {
        return this.LL.computeHorizontalScrollOffset();
    }

    public final InterfaceC1631620sYq<Integer, PoiListApi.PostTag, Boolean, Unit> getOnTagClick() {
        return this.LLILLL;
    }

    public final void LIZIZ(int i) {
        TagBarLayoutManager tagBarLayoutManager;
        if (i >= 0 && i < this.LLILZIL.size()) {
            RecyclerView.LayoutManager layoutManager = this.LL.getLayoutManager();
            if ((layoutManager instanceof TagBarLayoutManager) && (tagBarLayoutManager = (TagBarLayoutManager) layoutManager) != null && i != -1) {
                tagBarLayoutManager.LLJJIJIL = i;
                tagBarLayoutManager.requestLayout();
            }
        }
    }

    public final void setClickEnabled(boolean z) {
        ViewParent parent;
        C1189910h4P c1189910h4P = this.LLILLJJLI;
        c1189910h4P.LLILZ = z;
        int size = c1189910h4P.LLILLJJLI.size();
        C1189890h4N c1189890h4N = C1189890h4N.LIZ;
        RecyclerView recyclerView = c1189910h4P.LLILZLL;
        if (recyclerView != null) {
            parent = recyclerView.getParent();
        } else {
            parent = null;
        }
        if (parent != null) {
            c1189910h4P.notifyItemRangeChanged(0, size, c1189890h4N);
        } else {
            c1189910h4P.LLIZ = true;
        }
    }

    public final void setDoubleLineEnabled(boolean z) {
        EnumC1189880h4M enumC1189880h4M;
        if (z) {
            enumC1189880h4M = EnumC1189880h4M.DOUBLE;
        } else {
            enumC1189880h4M = EnumC1189880h4M.SINGLE;
        }
        setLineMode(enumC1189880h4M);
    }

    public final void setLineMode(EnumC1189880h4M enumC1189880h4M) {
        if (this.LLILZ == enumC1189880h4M) {
            return;
        }
        this.LLILZ = enumC1189880h4M;
        LIZLLL();
    }

    public final void setOnTagClick(InterfaceC1631620sYq<? super Integer, ? super PoiListApi.PostTag, ? super Boolean, Unit> interfaceC1631620sYq) {
        this.LLILLL = interfaceC1631620sYq;
    }

    public final void setSelectedPosition(int i) {
        C1189910h4P c1189910h4P = this.LLILLJJLI;
        int i2 = c1189910h4P.LLILLL;
        if (i != i2) {
            c1189910h4P.LLILLL = i;
            if (i2 != -1) {
                C1189900h4O c1189900h4O = C1189900h4O.LIZ;
                RecyclerView recyclerView = c1189910h4P.LLILZLL;
                if (recyclerView != null && recyclerView.getParent() != null) {
                    c1189910h4P.notifyItemChanged(i2, c1189900h4O);
                } else {
                    c1189910h4P.LLIZ = true;
                }
            }
            int i3 = c1189910h4P.LLILLL;
            if (i3 != -1) {
                C1189900h4O c1189900h4O2 = C1189900h4O.LIZ;
                RecyclerView recyclerView2 = c1189910h4P.LLILZLL;
                if (recyclerView2 != null && recyclerView2.getParent() != null) {
                    c1189910h4P.notifyItemChanged(i3, c1189900h4O2);
                } else {
                    c1189910h4P.LLIZ = true;
                }
            }
        }
    }

    public static void LIZ(C1189860h4K c1189860h4K, int i) {
        TagBarLayoutManager tagBarLayoutManager;
        if (i >= 0 && i < c1189860h4K.LLILZIL.size()) {
            RecyclerView.LayoutManager layoutManager = c1189860h4K.LL.getLayoutManager();
            if ((layoutManager instanceof TagBarLayoutManager) && (tagBarLayoutManager = (TagBarLayoutManager) layoutManager) != null) {
                if (c1189860h4K.LL.isAttachedToWindow() && c1189860h4K.LL.getWidth() > 0) {
                    int iLJIILIIL = tagBarLayoutManager.LJIILIIL(i);
                    if (Math.abs(iLJIILIIL) > 2) {
                        c1189860h4K.LL.smoothScrollBy(iLJIILIIL, 0);
                        return;
                    }
                    return;
                }
                if (i == -1) {
                    return;
                }
                tagBarLayoutManager.LLJJIJIL = i;
                tagBarLayoutManager.requestLayout();
            }
        }
    }

    public C1189860h4K(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        C1189910h4P c1189910h4P = new C1189910h4P(new AwS667S0100000_18(this, 15));
        this.LLILLJJLI = c1189910h4P;
        this.LLILZ = EnumC1189880h4M.AUTO;
        this.LLILZIL = C13BV.INSTANCE;
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.e9e, this, true);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rdo);
        this.LL = recyclerView;
        recyclerView.setClipToPadding(false);
        recyclerView.setPaddingRelative(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), 0);
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(c1189910h4P);
        recyclerView.setLayoutManager(new TagBarLayoutManager(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))));
        C339190DRl.LIZIZ(this);
    }

    public final void LIZJ(List<PoiListApi.PostTag> list, int i, Function2<? super PoiListApi.PostTag, ? super Integer, Unit> function2, boolean z) {
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            C13BV c13bv = C13BV.INSTANCE;
            this.LLILZIL = c13bv;
            C1189910h4P c1189910h4P = this.LLILLJJLI;
            c1189910h4P.LLILLJJLI = c13bv;
            c1189910h4P.LLILLL = -1;
            c1189910h4P.LLIZLLLIL = null;
            c1189910h4P.LLJ.clear();
            RecyclerView recyclerView = c1189910h4P.LLILZLL;
            if (recyclerView != null && recyclerView.getParent() != null) {
                c1189910h4P.notifyDataSetChanged();
            } else {
                c1189910h4P.LLIZ = true;
            }
            C339190DRl.LIZIZ(this.LL);
            C339190DRl.LIZIZ(this);
            return;
        }
        this.LLILZIL = list;
        C339190DRl.LIZLLL(this);
        C339190DRl.LIZLLL(this.LL);
        LIZLLL();
        C1189910h4P c1189910h4P2 = this.LLILLJJLI;
        c1189910h4P2.LLILLJJLI = list;
        c1189910h4P2.LLILLL = i;
        c1189910h4P2.LLIZLLLIL = function2;
        c1189910h4P2.LLJ.clear();
        RecyclerView recyclerView2 = c1189910h4P2.LLILZLL;
        if (recyclerView2 != null && recyclerView2.getParent() != null) {
            c1189910h4P2.notifyDataSetChanged();
        } else {
            c1189910h4P2.LLIZ = true;
        }
        if (z && i >= 0 && i < arrayList.size()) {
            HandlerHook.viewPost(this.LL, new ARunnableS29S0101000_18(i, this, 6));
        }
    }
}
