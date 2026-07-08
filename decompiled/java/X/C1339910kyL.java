package X;

import Y.ALAdapterS17S0100000_21;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.service.IPostModeService;
import java.util.List;

/* JADX INFO: renamed from: X.0kyL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1339910kyL implements InterfaceC1339630kxt {
    public final C1353360lK2 LIZ;
    public final Context LIZIZ;
    public final LifecycleOwner LIZJ;
    public AnimatorSet LIZLLL;

    public final LifecycleOwner LIZLLL() {
        Fragment fragmentLIZ;
        LifecycleOwner lifecycleOwner = this.LIZJ;
        if (lifecycleOwner != null) {
            return lifecycleOwner;
        }
        ComponentCallbacks2 componentCallbacks2LIZ = C1388190mED.LIZ(this.LIZIZ);
        return (componentCallbacks2LIZ == null || (fragmentLIZ = ((IDetailFeedSafService) ServiceManager.get().getService(IDetailFeedSafService.class)).LIZ(this.LIZ)) == null) ? ((IPostModeService) ServiceManager.get().getService(IPostModeService.class)).LJJ() ? SAFExtensionKt.LJJ(this.LIZ) : (LifecycleOwner) componentCallbacks2LIZ : fragmentLIZ;
    }

    public static void LIZIZ(final C1353360lK2 c1353360lK2) {
        final int height;
        if (!C017O.LIZ() || c1353360lK2 == null || (height = c1353360lK2.getHeight()) <= c1353360lK2.getResources().getDisplayMetrics().heightPixels / 2) {
            return;
        }
        C786410Ut5.y3(c1353360lK2.getViewTreeObserver(), new ViewTreeObserver.OnPreDrawListener() { // from class: X.0HF1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                RecyclerView recyclerView;
                C786410Ut5.D3(c1353360lK2.getViewTreeObserver(), this);
                int height2 = c1353360lK2.getHeight() - height;
                if (Math.abs(height2) <= 100) {
                    return true;
                }
                View view = c1353360lK2;
                View view2 = null;
                if (view != null) {
                    for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                        if (parent instanceof RecyclerView) {
                            recyclerView = (RecyclerView) parent;
                            break;
                        }
                    }
                    recyclerView = null;
                } else {
                    recyclerView = null;
                }
                View view3 = c1353360lK2;
                if (view3 != null) {
                    if (recyclerView != null) {
                        ViewParent parent2 = view3.getParent();
                        while (true) {
                            if (parent2 == null) {
                                break;
                            }
                            if (parent2 != recyclerView) {
                                view3 = parent2;
                                parent2 = parent2.getParent();
                            } else if (parent2 == recyclerView) {
                                view2 = view3;
                            }
                        }
                    }
                } else if (recyclerView != null) {
                    if (view2 != null && view2.getTop() < 0) {
                        recyclerView.scrollBy(0, height2);
                    }
                }
                return true;
            }
        });
    }

    public C1339910kyL(Context context, C1353360lK2 c1353360lK2, Fragment fragment) {
        this.LIZIZ = context;
        this.LIZ = c1353360lK2;
        this.LIZJ = fragment;
    }

    @Override // X.InterfaceC1339630kxt
    public final void LIZ(Comment comment, CharSequence charSequence, List<TextExtraStruct> list, Boolean bool, C1353740lKe c1353740lKe) {
        LIZJ(comment, charSequence, list, bool, null, c1353740lKe);
    }

    public final void LJ(Comment comment, CharSequence charSequence, List list, String str, C1353740lKe c1353740lKe) throws Throwable {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentViewWrapper setCommentTranslatedText, awemeId: ");
        sbLIZ.append(comment.getAwemeId());
        sbLIZ.append(", cid: ");
        sbLIZ.append(comment.getCid());
        sbLIZ.append(", translatedDesc: ");
        sbLIZ.append((Object) charSequence);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C01GW<AbstractC1604130rqV> c01gw = C207128163i.LJ;
        C0SZC.LIZIZ(strLIZIZ);
        if (this.LIZ != null) {
            if (C1339540kxk.LIZ(comment)) {
                this.LIZ.LJJLIIIIJ(charSequence, null, str, comment, false, c1353740lKe);
                C746760TRa.LIZ().LJJJJZI(comment.getAwemeId(), comment.getCid());
            } else if (charSequence != null && charSequence.length() > 0) {
                this.LIZ.LJJLIIIIJ(charSequence, list, str, comment, false, c1353740lKe);
                C746760TRa.LIZ().LJJJJZI(comment.getAwemeId(), comment.getCid());
            }
        }
        C439870HMr.LIZJ(this.LIZ, null);
        LIZIZ(this.LIZ);
    }

    public final void LIZJ(final Comment comment, final CharSequence charSequence, final List<TextExtraStruct> list, final Boolean bool, final String str, final C1353740lKe c1353740lKe) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.LIZ, "alpha", 0.0f).setDuration(100L);
        duration.setInterpolator(new C21388418n4());
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.LIZ, "alpha", 0.0f, 1.0f).setDuration(100L);
        duration2.setInterpolator(new C21388418n4());
        duration.addListener(new AnimatorListenerAdapter(comment, charSequence, list, bool, str, c1353740lKe) { // from class: X.0kyJ
            public final /* synthetic */ Comment LL;
            public final /* synthetic */ CharSequence LLILLJJLI;
            public final /* synthetic */ List LLILLL;
            public final /* synthetic */ String LLILZ;
            public final /* synthetic */ C1353740lKe LLILZIL;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) throws Throwable {
                this.LLILZLL.LJ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL);
            }

            {
                this.LLILZ = str;
                this.LLILZIL = c1353740lKe;
            }
        });
        AnimatorSet animatorSet = this.LIZLLL;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.LIZLLL = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.LIZLLL = animatorSet2;
        animatorSet2.addListener(new ALAdapterS17S0100000_21(this, 4));
        this.LIZLLL.playSequentially(duration, duration2);
        this.LIZLLL.start();
    }
}
