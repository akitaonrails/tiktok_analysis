package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import com.ss.android.ugc.aweme.comment.multipanel.EmojiInputViewImplV2;
import com.ss.android.ugc.aweme.emoji.common.emojichoose.model.Resources;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import com.ss.android.ugc.aweme.systembigemoji.IStickerResourceManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0Hjz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C449530Hjz extends AbstractC444180HbM implements InterfaceC449500Hjw, InterfaceC449620Hk8 {
    public static final /* synthetic */ int LLJI = 0;
    public final InterfaceC450680Hlq LLILLJJLI;
    public final LifecycleOwner LLILLL;
    public final LinearLayoutManager LLILZ;
    public final C449430Hjp LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public int LLJ;

    @Override // X.InterfaceC449500Hjw
    public final C449450Hjr LIZIZ() {
        return null;
    }

    public final C117T LIZLLL() {
        return (C117T) this.LLILZLL.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0086 A[PHI: r4
      0x0086: PHI (r4v3 boolean) = (r4v1 boolean), (r4v1 boolean), (r4v1 boolean), (r4v4 boolean), (r4v4 boolean), (r4v4 boolean) binds: [B:26:0x006f, B:27:0x0071, B:29:0x0083, B:15:0x003a, B:16:0x003c, B:18:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ() {
        /*
            r5 = this;
            int r1 = r5.LLJ
            X.0Hjp r0 = r5.LLILZIL
            int r0 = r0.LIZLLL
            if (r1 == r0) goto L59
            X.01GW r0 = r5.LLIZ
            java.lang.Object r0 = r0.getValue()
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            X.19ry r0 = r0.getAdapter()
            if (r0 == 0) goto L19
            r0.notifyDataSetChanged()
        L19:
            X.0Hjp r0 = r5.LLILZIL
            int r1 = r0.LIZLLL
            r0 = -1
            r4 = 0
            if (r1 == r0) goto L53
            int r0 = r5.LLJ
            r3 = 1
            if (r1 >= r0) goto L5a
            androidx.recyclerview.widget.LinearLayoutManager r0 = r5.LLILZ
            int r2 = r0.findFirstVisibleItemPosition()
            int r0 = r5.LLJ
            if (r2 != r0) goto L31
            r4 = 1
        L31:
            androidx.recyclerview.widget.LinearLayoutManager r0 = r5.LLILZ
            android.view.View r1 = r0.findViewByPosition(r2)
            int r0 = r5.LLJ
            int r0 = r0 - r3
            if (r2 != r0) goto L86
            if (r1 == 0) goto L86
            int r0 = r1.getLeft()
            if (r0 >= 0) goto L86
        L44:
            X.01GW r0 = r5.LLIZ
            java.lang.Object r1 = r0.getValue()
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            X.0Hjp r0 = r5.LLILZIL
            int r0 = r0.LIZLLL
            r1.scrollToPosition(r0)
        L53:
            X.0Hjp r0 = r5.LLILZIL
            int r0 = r0.LIZLLL
            r5.LLJ = r0
        L59:
            return
        L5a:
            androidx.recyclerview.widget.LinearLayoutManager r0 = r5.LLILZ
            int r2 = r0.findLastVisibleItemPosition()
            int r0 = r5.LLJ
            if (r2 != r0) goto L65
            r4 = 1
        L65:
            androidx.recyclerview.widget.LinearLayoutManager r0 = r5.LLILZ
            android.view.View r1 = r0.findViewByPosition(r2)
            int r0 = r5.LLJ
            int r0 = r0 + 1
            if (r2 != r0) goto L86
            if (r1 == 0) goto L86
            int r1 = r1.getRight()
            X.01GW r0 = r5.LLIZ
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            int r0 = r0.getWidth()
            if (r1 <= r0) goto L86
            goto L44
        L86:
            if (r4 == 0) goto L53
            goto L44
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C449530Hjz.LJ():void");
    }

    public final void LIZJ(int i) {
        boolean z;
        C449430Hjp c449430Hjp = this.LLILZIL;
        if (c449430Hjp.LIZLLL == -1) {
            z = true;
        } else {
            z = false;
        }
        c449430Hjp.LIZIZ(i);
        LIZLLL().setCurrentItem(this.LLILZIL.LIZLLL, false);
        if (z) {
            LJ();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC449620Hk8
    public final void LIZ(Resources resources, List<? extends Emoji> list) {
        if (list != 0 && !list.isEmpty()) {
            int size = ((ArrayList) this.LLILZIL.LIZJ).size();
            for (int i = 0; i < size; i++) {
                InterfaceC444050Hb9 interfaceC444050Hb9LIZ = this.LLILZIL.LIZ(i);
                if (interfaceC444050Hb9LIZ != null && interfaceC444050Hb9LIZ.LIZJ() == 2) {
                    C449540Hk0 c449540Hk0 = (C449540Hk0) interfaceC444050Hb9LIZ;
                    if (Intrinsics.LJFF(null, resources)) {
                        c449540Hk0.LIZIZ = list;
                        C449430Hjp c449430Hjp = this.LLILZIL;
                        c449430Hjp.LIZIZ(c449430Hjp.LIZLLL);
                        PagerAdapter adapter = LIZLLL().getAdapter();
                        if (adapter != null) {
                            adapter.notifyDataSetChanged();
                        }
                        LIZLLL().setCurrentItem(this.LLILZIL.LIZLLL, false);
                        return;
                    }
                }
            }
        }
    }

    public C449530Hjz(EmojiInputViewImplV2 emojiInputViewImplV2, C449490Hjv c449490Hjv, LifecycleOwner lifecycleOwner, ViewGroup viewGroup) {
        int i;
        Context context;
        View view;
        super(viewGroup, R.layout.a2r);
        this.LLILLJJLI = emojiInputViewImplV2;
        this.LLILLL = lifecycleOwner;
        int i2 = c449490Hjv.LJ;
        if (i2 > 0) {
            C1351950lHl.LJIJI(i2, this.LL);
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.LL.getContext(), 0, false);
        this.LLILZ = linearLayoutManager;
        C2296808zG.LIZ(new C2502509rL(CoroutineExceptionHandler.LJJLIL, 9));
        this.LLILZIL = new C449430Hjp(c449490Hjv);
        this.LLILZLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1296));
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1297));
        this.LLIZ = c01gwLIZIZ;
        C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1298));
        this.LLIZLLLIL = c01gwLIZIZ2;
        C360660ECa c360660ECa = new C360660ECa() { // from class: X.0Hk1
            @Override // X.C360660ECa, X.InterfaceC469360Ias
            public final void onPageSelected(int i3) {
                this.LL.LLILZIL.LIZIZ(i3);
                this.LL.LJ();
                InterfaceC444050Hb9 interfaceC444050Hb9 = this.LL.LLILZIL.LIZ;
                if (interfaceC444050Hb9 != null) {
                    Integer numValueOf = Integer.valueOf(interfaceC444050Hb9.LIZJ());
                    if (numValueOf.intValue() == 2 && 1 != 0) {
                        numValueOf.intValue();
                        if (!interfaceC444050Hb9.LJII()) {
                            Map<String, String> map = C449580Hk4.LL;
                            IStickerResourceManager.LJJJJJL.getClass();
                            IStickerResourceManager value = C449570Hk3.LIZIZ.getValue();
                            if (value != null) {
                                value.LIZJ(null);
                            }
                        }
                    }
                }
            }
        };
        LIZLLL().setAdapter(new C450560Hle(emojiInputViewImplV2, LIZLLL(), this, lifecycleOwner));
        ((RecyclerView) c01gwLIZIZ.getValue()).setLayoutManager(linearLayoutManager);
        ((RecyclerView) c01gwLIZIZ.getValue()).setAdapter(new C444070HbB(this));
        LIZLLL().addOnPageChangeListener(c360660ECa);
        LinearLayout linearLayout = (LinearLayout) c01gwLIZIZ2.getValue();
        if (c449490Hjv.LIZJ) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJZL(i, linearLayout);
        View view2 = (View) c01gwLIZIZ2.getValue();
        if (view2 != null && (context = view2.getContext()) != null && (view = (View) c01gwLIZIZ2.getValue()) != null) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1b, context);
            view.setBackgroundColor(numLIZJ != null ? numLIZJ.intValue() : 0);
        }
        PagerAdapter adapter = LIZLLL().getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        if (c449490Hjv.LIZ) {
            ArrayList arrayList = (ArrayList) C449580Hk4.LLILZIL;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
        }
    }
}
