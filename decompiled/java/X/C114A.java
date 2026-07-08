package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.114A, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C114A {
    public final Context LIZ;
    public final C114C LIZIZ;
    public final AnonymousClass1149 LIZJ;
    public final C0FMR LIZLLL;
    public final View LJ;
    public final int LJFF;
    public final Function0<VideoPublishEditModel> LJI;
    public C194428114w LJII;
    public final ArrayList<C114D> LJIIIIZZ = new ArrayList<>();
    public View LJIIIZ;
    public View LJIIJ;
    public TextView LJIIJJI;
    public RecyclerView LJIIL;
    public C1749280vcc LJIILIIL;

    public final void LIZ() {
        if (this.LJII == null) {
            View view = this.LJIIIZ;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
            C1749280vcc c1749280vcc = this.LJIILIIL;
            if (c1749280vcc != null) {
                C786410Ut5.LLLZLZ(c1749280vcc, 8);
            }
            C1749280vcc c1749280vcc2 = this.LJIILIIL;
            if (c1749280vcc2 != null) {
                C786410Ut5.LLLZLZ(c1749280vcc2, 0);
            }
            C1749280vcc c1749280vcc3 = this.LJIILIIL;
            if (c1749280vcc3 != null) {
                c1749280vcc3.LJ();
            }
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        C1633850scR.LIZ(C0CHQ.LIZ, null).sg(this.LIZLLL.LIZIZ ? "photo_text_new_text_template" : "tiktok_text_template", this.LIZJ.LIZIZ, 0, 0, 0, null, new IFetchCategoryEffectListener() { // from class: X.114B
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
            public final void onFail(ExceptionResult exceptionResult) {
                this.LIZ.LIZJ();
                VideoPublishEditModel videoPublishEditModelInvoke = this.LIZ.LJI.invoke();
                if (videoPublishEditModelInvoke != null) {
                    long j = jCurrentTimeMillis;
                    C114A c114a = this.LIZ;
                    C1402910mbx c1402910mbx = C1402910mbx.LIZ;
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - j;
                    String str = c114a.LIZJ.LIZ;
                    boolean z = c114a.LIZLLL.LIZIZ;
                    c1402910mbx.getClass();
                    C1402910mbx.LJ(videoPublishEditModelInvoke, false, jCurrentTimeMillis2, str, "", z);
                }
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(CategoryPageModel categoryPageModel) {
                CategoryEffectModel categoryEffects;
                List<Effect> effects;
                CategoryPageModel categoryPageModel2 = categoryPageModel;
                ArrayList<C114D> arrayList = new ArrayList<>();
                if (categoryPageModel2 != null && (categoryEffects = categoryPageModel2.getCategoryEffects()) != null && (effects = categoryEffects.getEffects()) != null) {
                    C114A c114a = this.LIZ;
                    Iterator<Effect> it2 = effects.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(new C114D(it2.next()));
                        c114a.LIZLLL.LIZJ.put(c114a.LJFF, arrayList);
                    }
                }
                VideoPublishEditModel videoPublishEditModelInvoke = this.LIZ.LJI.invoke();
                if (videoPublishEditModelInvoke != null) {
                    long j = jCurrentTimeMillis;
                    C114A c114a2 = this.LIZ;
                    C1402910mbx c1402910mbx = C1402910mbx.LIZ;
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - j;
                    String str = c114a2.LIZJ.LIZIZ;
                    boolean z = c114a2.LIZLLL.LIZIZ;
                    c1402910mbx.getClass();
                    C1402910mbx.LJ(videoPublishEditModelInvoke, true, jCurrentTimeMillis2, str, "", z);
                }
                if (!arrayList.isEmpty()) {
                    C114A c114a3 = this.LIZ;
                    c114a3.LJIIIIZZ.clear();
                    c114a3.LJIIIIZZ.addAll(arrayList);
                    C194428114w c194428114w = new C194428114w(c114a3.LIZLLL, c114a3.LIZIZ);
                    c114a3.LJII = c194428114w;
                    c194428114w.LLILLL = c114a3.LJFF;
                    c194428114w.setData(new ArrayList(c114a3.LJIIIIZZ));
                    View view2 = c114a3.LJIIIZ;
                    if (view2 != null) {
                        C786410Ut5.LJLLLLLL(8, view2);
                    }
                    C1749280vcc c1749280vcc4 = c114a3.LJIILIIL;
                    if (c1749280vcc4 != null) {
                        C786410Ut5.LLLZLZ(c1749280vcc4, 8);
                    }
                    GridLayoutManager gridLayoutManager = new GridLayoutManager(c114a3.LIZ, 3);
                    RecyclerView recyclerView = c114a3.LJIIL;
                    if (recyclerView != null) {
                        recyclerView.setLayoutManager(gridLayoutManager);
                    }
                    RecyclerView recyclerView2 = c114a3.LJIIL;
                    if (recyclerView2 != null) {
                        recyclerView2.setAdapter(c114a3.LJII);
                    }
                    RecyclerView recyclerView3 = c114a3.LJIIL;
                    if (recyclerView3 != null) {
                        recyclerView3.setItemAnimator(null);
                    }
                    RecyclerView recyclerView4 = c114a3.LJIIL;
                    if (recyclerView4 != null) {
                        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                        recyclerView4.addItemDecoration(new C0DXR(iLIZIZ) { // from class: X.10wP
                            public final int LL;

                            {
                                this.LL = iLIZIZ;
                            }

                            @Override // X.C0DXR
                            public final void LIZIZ(Rect rect, View view3, RecyclerView recyclerView5, C21673919s1 c21673919s1) {
                                int childAdapterPosition = recyclerView5.getChildAdapterPosition(view3) % 3;
                                int i = this.LL;
                                rect.left = (childAdapterPosition * i) / 3;
                                rect.right = i - (((childAdapterPosition + 1) * i) / 3);
                                rect.top = i;
                            }
                        });
                    }
                    c114a3.LIZIZ();
                    C114D c114d = (C114D) C13LP.LJJJLL(c114a3.LJIIIIZZ);
                    if (c114d != null) {
                        c114a3.LIZIZ.LIZIZ(c114a3.LJFF, c114d);
                        return;
                    }
                    return;
                }
                this.LIZ.LIZJ();
                VideoPublishEditModel videoPublishEditModelInvoke2 = this.LIZ.LJI.invoke();
                if (videoPublishEditModelInvoke2 == null) {
                    return;
                }
                long j2 = jCurrentTimeMillis;
                C114A c114a4 = this.LIZ;
                C1402910mbx c1402910mbx2 = C1402910mbx.LIZ;
                long jCurrentTimeMillis3 = System.currentTimeMillis() - j2;
                String str2 = c114a4.LIZJ.LIZ;
                boolean z2 = c114a4.LIZLLL.LIZIZ;
                c1402910mbx2.getClass();
                C1402910mbx.LJ(videoPublishEditModelInvoke2, false, jCurrentTimeMillis3, str2, "", z2);
            }
        });
    }

    public final void LIZIZ() {
        RecyclerView recyclerView;
        AbstractC21673619ry adapter;
        RecyclerView recyclerView2;
        if (this.LJIIL != null) {
            int i = 0;
            int i2 = 0;
            for (C114D c114d : this.LJIIIIZZ) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                C114D c114d2 = c114d;
                if (c114d2.LIZJ == 2) {
                    c114d2.LIZJ = 1;
                }
                i2 = i3;
            }
            C194428114w c194428114w = this.LJII;
            if (c194428114w != null) {
                c194428114w.notifyDataSetChanged();
            }
            Iterator<C114D> it2 = this.LJIIIIZZ.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    i = -1;
                    break;
                }
                C114D next = it2.next();
                int i4 = i + 1;
                if (i < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                if (Intrinsics.LJFF(this.LIZLLL.LIZ, next.LIZ.getEffectId())) {
                    break;
                } else {
                    i = i4;
                }
            }
            C0FMR c0fmr = this.LIZLLL;
            if ((c0fmr.LIZ(c0fmr.LIZ) && this.LJFF != 0) || i == -1 || (recyclerView = this.LJIIL) == null || (adapter = recyclerView.getAdapter()) == null || i >= adapter.getItemCount() - 1 || (recyclerView2 = this.LJIIL) == null) {
                return;
            }
            recyclerView2.scrollToPosition(i);
        }
    }

    public final void LIZJ() {
        C194428114w c194428114w = this.LJII;
        if (c194428114w != null) {
            c194428114w.clearData();
        }
        C1749280vcc c1749280vcc = this.LJIILIIL;
        if (c1749280vcc != null) {
            C786410Ut5.LLLZLZ(c1749280vcc, 8);
        }
        View view = this.LJIIIZ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        View view2 = this.LJIIJ;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
        }
        TextView textView = this.LJIIJJI;
        if (textView != null) {
            textView.setText(2131829437);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C114A(Context context, C114C c114c, AnonymousClass1149 anonymousClass1149, C0FMR c0fmr, View view, int i, Function0<? extends VideoPublishEditModel> function0) {
        this.LIZ = context;
        this.LIZIZ = c114c;
        this.LIZJ = anonymousClass1149;
        this.LIZLLL = c0fmr;
        this.LJ = view;
        this.LJFF = i;
        this.LJI = function0;
        new C11NJ();
    }
}
