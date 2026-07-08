package Y;

import X.AbstractC1585810rMx;
import X.AbstractC20634115oh;
import X.AbstractC21673619ry;
import X.C0O0R;
import X.C13LP;
import X.C1A3P;
import X.C1A3Q;
import X.C1AHS;
import X.C1AHW;
import X.C21645019nM;
import X.C21648419nu;
import X.C21689319uV;
import X.C21695119vR;
import X.C2176871AHl;
import X.C2188811AlT;
import X.C793770VBv;
import X.EnumC20674115v9;
import X.EnumC21696919vj;
import X.InterfaceC21682219tM;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.viewerwishestmp.queue.ViewerWishesQueuePage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsV3PhotoListScrollConfig;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.photo.CustomPageLimitLinearLayoutManager;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.photo.FriendV3PhotoAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3NavHideOnScrollAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3PageStateComponent;
import com.ss.android.ugc.aweme.story.feed.ui.gallery.StoryGalleryLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS612S0100000_33;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public class AsS58S0100000_33 extends AbstractC1585810rMx {
    public final int $t;
    public Object l0;

    public static final void LJJIIZI$3(AsS58S0100000_33 asS58S0100000_33, RecyclerView recyclerView, int i, int i2) {
    }

    public static final void LJJIIZI$7(AsS58S0100000_33 asS58S0100000_33, RecyclerView recyclerView, int i, int i2) {
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        switch (this.$t) {
            case 2:
                LJJIIJ$0(this, recyclerView, i);
                break;
            case 3:
                LJJIIJ$1(this, recyclerView, i);
                break;
            case 4:
                LJJIIJ$2(this, recyclerView, i);
                break;
            case 5:
                LJJIIJ$3(this, recyclerView, i);
                break;
            case 6:
                LJJIIJ$4(this, recyclerView, i);
                break;
            case 7:
                LJJIIJ$5(this, recyclerView, i);
                break;
            case 8:
                LJJIIJ$6(this, recyclerView, i);
                break;
            default:
                super.LJJIIJ(recyclerView, i);
                break;
        }
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        switch (this.$t) {
            case 0:
                LJJIIZI$0(this, recyclerView, i, i2);
                break;
            case 1:
                LJJIIZI$1(this, recyclerView, i, i2);
                break;
            case 2:
                LJJIIZI$2(this, recyclerView, i, i2);
                break;
            case 3:
                LJJIIZI$3(this, recyclerView, i, i2);
                break;
            case 4:
                LJJIIZI$4(this, recyclerView, i, i2);
                break;
            case 5:
                LJJIIZI$5(this, recyclerView, i, i2);
                break;
            case 6:
                LJJIIZI$6(this, recyclerView, i, i2);
                break;
            case 7:
                LJJIIZI$7(this, recyclerView, i, i2);
                break;
            default:
                super.LJJIIZI(recyclerView, i, i2);
                break;
        }
    }

    public AsS58S0100000_33(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJJIIJ$0(AsS58S0100000_33 asS58S0100000_33, RecyclerView recyclerView, int i) {
        String str;
        FriendV3PhotoAssem friendV3PhotoAssem = (FriendV3PhotoAssem) asS58S0100000_33.l0;
        if (friendV3PhotoAssem.LLLIIIIL == 0) {
            friendV3PhotoAssem.LLLIIIIL = System.currentTimeMillis() - friendV3PhotoAssem.LLLIIII;
        }
        if (i == 1) {
            ((FriendV3PhotoAssem) asS58S0100000_33.l0).LLLII = true;
            return;
        }
        if (i != 0) {
            return;
        }
        FriendV3PhotoAssem friendV3PhotoAssem2 = (FriendV3PhotoAssem) asS58S0100000_33.l0;
        if (!friendV3PhotoAssem2.LLLII) {
            return;
        }
        int i2 = -1;
        if (Intrinsics.LJFF(friendV3PhotoAssem2.LLJLLIL, "left")) {
            ((FriendV3PhotoAssem) asS58S0100000_33.l0).getClass();
            int left = recyclerView.getLeft();
            int right = recyclerView.getRight();
            int childCount = recyclerView.getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = recyclerView.getChildAt(i3);
                if (!C13LP.LJJL(new IntRange(left, right), new IntRange(childAt.getLeft(), childAt.getRight())).isEmpty()) {
                    i2 = i3;
                    break;
                }
                i3++;
            }
        } else if (Intrinsics.LJFF(((FriendV3PhotoAssem) asS58S0100000_33.l0).LLJLLIL, "right")) {
            ((FriendV3PhotoAssem) asS58S0100000_33.l0).getClass();
            int left2 = recyclerView.getLeft();
            int right2 = recyclerView.getRight();
            int childCount2 = recyclerView.getChildCount() - 1;
            while (true) {
                if (-1 >= childCount2) {
                    break;
                }
                View childAt2 = recyclerView.getChildAt(childCount2);
                if (!C13LP.LJJL(new IntRange(left2, right2), new IntRange(childAt2.getLeft(), childAt2.getRight())).isEmpty()) {
                    i2 = childCount2;
                    break;
                }
                childCount2--;
            }
        }
        FriendV3PhotoAssem friendV3PhotoAssem3 = (FriendV3PhotoAssem) asS58S0100000_33.l0;
        if (friendV3PhotoAssem3.LLLII) {
            str = "manual_click";
        } else {
            str = "auto";
        }
        friendV3PhotoAssem3.Fp(i2 + 1, friendV3PhotoAssem3.LLJLLIL, str);
        ((FriendV3PhotoAssem) asS58S0100000_33.l0).LLLII = false;
    }

    public static final void LJJIIJ$1(AsS58S0100000_33 asS58S0100000_33, RecyclerView recyclerView, int i) {
        CustomPageLimitLinearLayoutManager customPageLimitLinearLayoutManager;
        CustomPageLimitLinearLayoutManager customPageLimitLinearLayoutManager2;
        RecyclerView.LayoutManager layoutManager = null;
        if (i != 0) {
            if (i != 1 && i != 2) {
                return;
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = ((FriendV3PhotoAssem) asS58S0100000_33.l0).LLJLL;
            if (viewOnAttachStateChangeListenerC20604515jv != null) {
                layoutManager = viewOnAttachStateChangeListenerC20604515jv.getLayoutManager();
            }
            if (!(layoutManager instanceof CustomPageLimitLinearLayoutManager) || (customPageLimitLinearLayoutManager2 = (CustomPageLimitLinearLayoutManager) layoutManager) == null) {
                return;
            }
            customPageLimitLinearLayoutManager2.LL = ((FriendsV3PhotoListScrollConfig) C21695119vR.LIZIZ.getValue()).scrollingExtraLayoutSpaceFactor;
            return;
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = ((FriendV3PhotoAssem) asS58S0100000_33.l0).LLJLL;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
            layoutManager = viewOnAttachStateChangeListenerC20604515jv2.getLayoutManager();
        }
        if (!(layoutManager instanceof CustomPageLimitLinearLayoutManager) || (customPageLimitLinearLayoutManager = (CustomPageLimitLinearLayoutManager) layoutManager) == null) {
            return;
        }
        customPageLimitLinearLayoutManager.LL = ((FriendsV3PhotoListScrollConfig) C21695119vR.LIZIZ.getValue()).idleExtraLayoutSpaceFactor;
    }

    public static final void LJJIIJ$2(AsS58S0100000_33 asS58S0100000_33, RecyclerView recyclerView, int i) {
        boolean z;
        C21648419nu c21648419nu = ((FriendsV3NavHideOnScrollAssem) asS58S0100000_33.l0).LLJI;
        if (c21648419nu != null && c21648419nu.LIZLLL) {
            c21648419nu.LJ = i;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        c21648419nu.LJIIJ = SystemClock.uptimeMillis();
                        return;
                    }
                    return;
                } else {
                    AwS577S0100000_33 awS577S0100000_33 = c21648419nu.LJIILJJIL;
                    if (awS577S0100000_33 != null) {
                        awS577S0100000_33.invoke();
                    }
                    c21648419nu.LIZ();
                    c21648419nu.LJIIIZ = false;
                    c21648419nu.LJIIJ = SystemClock.uptimeMillis();
                    return;
                }
            }
            float fLIZIZ = c21648419nu.LIZIZ();
            float f = 0.0f;
            if (fLIZIZ <= 0.0f) {
                return;
            }
            float f2 = c21648419nu.LIZJ;
            float f3 = 1.0f;
            if (f2 >= 0.98f) {
                c21648419nu.LJ(1.0f, true);
                c21648419nu.LJIIIZ = false;
                c21648419nu.LJIIIIZZ = c21648419nu.LJI + c21648419nu.LJFF;
                return;
            }
            if (f2 <= 0.02f) {
                c21648419nu.LJ(0.0f, true);
                c21648419nu.LJIIIZ = false;
                c21648419nu.LJIIIIZZ = 0.0f;
                return;
            }
            if (!c21648419nu.LJIIIZ && f2 < 0.5f) {
                z = false;
            } else {
                z = true;
            }
            if (c21648419nu.LJI + c21648419nu.LJFF <= fLIZIZ) {
                AwS612S0100000_33 awS612S0100000_33 = c21648419nu.LJIILIIL;
                if (awS612S0100000_33 != null) {
                    awS612S0100000_33.invoke(Boolean.valueOf(z));
                }
                c21648419nu.LJIIIZ = false;
                return;
            }
            c21648419nu.LIZ();
            if (!z) {
                f3 = 0.0f;
            }
            float f4 = c21648419nu.LIZJ;
            if (f4 == f3) {
                if (z) {
                    f = c21648419nu.LJI + c21648419nu.LJFF;
                }
                c21648419nu.LJIIIIZZ = f;
                c21648419nu.LJIIIZ = false;
                return;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f4, f3);
            valueAnimatorOfFloat.setDuration(c21648419nu.LIZIZ.snapAnimDurationMs);
            valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS280S0100000_33(c21648419nu, 33));
            valueAnimatorOfFloat.addListener(new ALAdapterS14S0110000_33(c21648419nu, z, 3));
            valueAnimatorOfFloat.start();
            c21648419nu.LJIIL = valueAnimatorOfFloat;
        }
    }

    public static final void LJJIIJ$3(AsS58S0100000_33 asS58S0100000_33, RecyclerView recyclerView, int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("newState=");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        ((FriendsV3PageStateComponent) asS58S0100000_33.l0).LLJJLIIIJLLLLLLLZ = i;
        if (i != 0) {
            if (i == 1) {
                C0O0R.LIZ.getClass();
                C0O0R.LJIIIZ++;
                return;
            }
            return;
        }
        ((FriendsV3PageStateComponent) asS58S0100000_33.l0).So(EnumC21696919vj.VERTICAL_IDLE);
    }

    public static final void LJJIIJ$4(AsS58S0100000_33 asS58S0100000_33, RecyclerView recyclerView, int i) {
        Iterator it2 = ((List) ((StoryGalleryLayoutManager) asS58S0100000_33.l0).LLILZ.getValue()).iterator();
        while (it2.hasNext()) {
            ((InterfaceC21682219tM) it2.next()).LIZ(i);
        }
    }

    public static final void LJJIIJ$5(AsS58S0100000_33 asS58S0100000_33, RecyclerView recyclerView, int i) {
        JSONObject jSONObject;
        if (i == 0) {
            C21689319uV c21689319uV = (C21689319uV) asS58S0100000_33.l0;
            c21689319uV.LLILLJJLI = false;
            long j = c21689319uV.LLILZ;
            if (j != 0) {
                long j2 = c21689319uV.LLILZIL;
                if (j2 != 0 && (jSONObject = c21689319uV.LL) != null) {
                    try {
                        jSONObject.put("average", (j2 * 1000) / j);
                        c21689319uV.LL.put("Max", c21689319uV.LLJ);
                        c21689319uV.LL.put("GT16", ((long) (c21689319uV.LLILZLL * 100)) / c21689319uV.LLILZIL);
                        c21689319uV.LL.put("GT32", ((long) (c21689319uV.LLIZ * 100)) / c21689319uV.LLILZIL);
                        c21689319uV.LL.put("GT64", ((long) (c21689319uV.LLIZLLLIL * 100)) / c21689319uV.LLILZIL);
                        String str = c21689319uV.LLJI;
                        JSONObject jSONObject2 = c21689319uV.LL;
                        if (jSONObject2 == null) {
                            jSONObject2 = new JSONObject();
                        }
                        try {
                            if (!TextUtils.isEmpty(str)) {
                                jSONObject2.put("service", str);
                            }
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        C793770VBv.LJ("aweme_fps_data", jSONObject2);
                    } catch (JSONException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                    c21689319uV.LLILZ = 0L;
                    c21689319uV.LLILZIL = 0L;
                    c21689319uV.LLILLL = -1L;
                    c21689319uV.LLILZLL = 0;
                    c21689319uV.LLIZ = 0;
                    c21689319uV.LLIZLLLIL = 0;
                    c21689319uV.LLJ = Long.MIN_VALUE;
                    return;
                }
                return;
            }
            return;
        }
        ((C21689319uV) asS58S0100000_33.l0).LLILLJJLI = true;
    }

    public static final void LJJIIJ$6(AsS58S0100000_33 asS58S0100000_33, RecyclerView recyclerView, int i) {
        LinearLayoutManager linearLayoutManager;
        if (i == 0) {
            RecyclerView.LayoutManager layoutManager = ((C1A3Q) asS58S0100000_33.l0).LLILZ.getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                AbstractC21673619ry adapter = ((C1A3Q) asS58S0100000_33.l0).LLILZ.getAdapter();
                if (adapter != null && adapter.getItemCount() == iFindLastVisibleItemPosition + 1 && ((C1A3Q) asS58S0100000_33.l0).LLILLJJLI.LJIILIIL.getHasMore()) {
                    C1A3Q c1a3q = (C1A3Q) asS58S0100000_33.l0;
                    C1A3P c1a3p = c1a3q.LLILLJJLI.LJIIIZ;
                    c1a3q.LLILLL.zQ2(c1a3q.LL.getContext(), c1a3q.LLILLJJLI, new C1A3P(c1a3p.LIZIZ + c1a3p.LIZ, 0, 6, 0), true, null);
                }
            }
        }
    }

    public static final void LJJIIZI$0(AsS58S0100000_33 asS58S0100000_33, RecyclerView recyclerView, int i, int i2) {
        boolean z;
        boolean z2;
        C21645019nM c21645019nM = (C21645019nM) asS58S0100000_33.l0;
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        int iComputeVerticalScrollRange = c21645019nM.LLJJIJIIJIL.computeVerticalScrollRange();
        int i3 = c21645019nM.LLJJIJI;
        if (iComputeVerticalScrollRange - i3 > 0 && i3 >= c21645019nM.LL) {
            z = true;
        } else {
            z = false;
        }
        c21645019nM.LLJJIJIL = z;
        int iComputeHorizontalScrollRange = c21645019nM.LLJJIJIIJIL.computeHorizontalScrollRange();
        int i4 = c21645019nM.LLJJIII;
        if (iComputeHorizontalScrollRange - i4 > 0 && i4 >= c21645019nM.LL) {
            z2 = true;
        } else {
            z2 = false;
        }
        c21645019nM.LLJJJ = z2;
        boolean z3 = c21645019nM.LLJJIJIL;
        if (!z3 && !z2) {
            if (c21645019nM.LLJJJIL != 0) {
                c21645019nM.LJI(0);
                return;
            }
            return;
        }
        if (z3) {
            float f = i3;
            c21645019nM.LLJILJIL = (int) ((f * (iComputeVerticalScrollOffset + (f / 2.0f))) / iComputeVerticalScrollRange);
            c21645019nM.LLJIJIL = Math.min(i3, (i3 * i3) / iComputeVerticalScrollRange);
        }
        if (c21645019nM.LLJJJ) {
            float f2 = i4;
            c21645019nM.LLJJ = (int) ((f2 * (iComputeHorizontalScrollOffset + (f2 / 2.0f))) / iComputeHorizontalScrollRange);
            c21645019nM.LLJILLL = Math.min(i4, (i4 * i4) / iComputeHorizontalScrollRange);
        }
        int i5 = c21645019nM.LLJJJIL;
        if (i5 != 0 && i5 != 1) {
            return;
        }
        c21645019nM.LJI(1);
    }

    public static final void LJJIIZI$1(AsS58S0100000_33 asS58S0100000_33, RecyclerView recyclerView, int i, int i2) {
        if (!((ViewerWishesQueuePage) asS58S0100000_33.l0).uS() && !recyclerView.canScrollVertically(1)) {
            ViewerWishesQueuePage viewerWishesQueuePage = (ViewerWishesQueuePage) asS58S0100000_33.l0;
            if (!viewerWishesQueuePage.LLLILZ && i2 > 0) {
                viewerWishesQueuePage.LLLILZ = true;
                C1AHS c1ahs = viewerWishesQueuePage.LLL;
                if (c1ahs != null) {
                    List<C1AHW> listLLLFZ = c1ahs.LLLFZ();
                    ((ArrayList) listLLLFZ).add(new C1AHW(-1L, null, null, 62));
                    c1ahs.LLLI(listLLLFZ, null);
                }
                ViewerWishesQueuePage viewerWishesQueuePage2 = (ViewerWishesQueuePage) asS58S0100000_33.l0;
                C2176871AHl c2176871AHl = viewerWishesQueuePage2.LLJLLL;
                if (c2176871AHl != null) {
                    AwS612S0100000_33 awS612S0100000_33 = new AwS612S0100000_33(viewerWishesQueuePage2, 32);
                    AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33((ViewerWishesQueuePage) asS58S0100000_33.l0, 328);
                    AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((ViewerWishesQueuePage) asS58S0100000_33.l0, 329);
                    if (c2176871AHl.LJ) {
                        awS577S0100000_33.invoke();
                    } else {
                        c2176871AHl.LIZ(EnumC20674115v9.LOAD_MORE, awS612S0100000_33, awS577S0100000_33, awS577S0100000_332);
                    }
                }
            }
        }
    }

    public static final void LJJIIZI$2(AsS58S0100000_33 asS58S0100000_33, RecyclerView recyclerView, int i, int i2) {
        String str;
        FriendV3PhotoAssem friendV3PhotoAssem = (FriendV3PhotoAssem) asS58S0100000_33.l0;
        if (i > 0) {
            str = "right";
        } else if (i < 0) {
            str = "left";
        } else {
            str = friendV3PhotoAssem.LLJLLIL;
        }
        friendV3PhotoAssem.LLJLLIL = str;
    }

    public static final void LJJIIZI$4(AsS58S0100000_33 asS58S0100000_33, RecyclerView recyclerView, int i, int i2) {
        float f;
        C21648419nu c21648419nu = ((FriendsV3NavHideOnScrollAssem) asS58S0100000_33.l0).LLJI;
        if (c21648419nu != null && c21648419nu.LIZLLL) {
            int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            if (iComputeVerticalScrollOffset < 0) {
                iComputeVerticalScrollOffset = 0;
            }
            c21648419nu.LJFF = iComputeVerticalScrollOffset;
            long jUptimeMillis = SystemClock.uptimeMillis();
            long j = c21648419nu.LJIIJ;
            long j2 = jUptimeMillis - j;
            float f2 = 0.0f;
            if (j != 0 && j2 > 0) {
                f = ((i2 / j2) * 1000.0f) / c21648419nu.LJIIJJI;
            } else {
                f = 0.0f;
            }
            c21648419nu.LJIIJ = jUptimeMillis;
            if (!c21648419nu.LJIIIZ && c21648419nu.LJ == 2 && i2 < 0 && (-f) >= c21648419nu.LIZIZ.downwardRestoreThresholdDpPerSec) {
                c21648419nu.LJIIIZ = true;
                AwS577S0100000_33 awS577S0100000_33 = c21648419nu.LJIILJJIL;
                if (awS577S0100000_33 != null) {
                    awS577S0100000_33.invoke();
                }
                c21648419nu.LIZ();
                float fLIZIZ = (c21648419nu.LJI + c21648419nu.LJFF) - ((1.0f - c21648419nu.LIZJ) * c21648419nu.LIZIZ());
                if (fLIZIZ >= 0.0f) {
                    f2 = fLIZIZ;
                }
                c21648419nu.LJIIIIZZ = f2;
            }
            c21648419nu.LJFF();
        }
    }

    public static final void LJJIIZI$5(AsS58S0100000_33 asS58S0100000_33, RecyclerView recyclerView, int i, int i2) {
        ((FriendsV3PageStateComponent) asS58S0100000_33.l0).LLJL = i2;
        ((FriendsV3PageStateComponent) asS58S0100000_33.l0).So(EnumC21696919vj.VERTICAL_SCROLL);
    }

    public static final void LJJIIZI$6(AsS58S0100000_33 asS58S0100000_33, RecyclerView recyclerView, int i, int i2) {
        View viewLJFF = ((AbstractC20634115oh) ((StoryGalleryLayoutManager) asS58S0100000_33.l0).LLILLL.getValue()).LJFF((StoryGalleryLayoutManager) asS58S0100000_33.l0);
        if (viewLJFF == null) {
            return;
        }
        int position = ((StoryGalleryLayoutManager) asS58S0100000_33.l0).getPosition(viewLJFF);
        StoryGalleryLayoutManager storyGalleryLayoutManager = (StoryGalleryLayoutManager) asS58S0100000_33.l0;
        if (position == storyGalleryLayoutManager.LLILZLL) {
            return;
        }
        View view = storyGalleryLayoutManager.LLJ;
        if (view != null) {
            view.setSelected(false);
            view.setTransitionName(null);
        }
        ((StoryGalleryLayoutManager) asS58S0100000_33.l0).LLJ = viewLJFF;
        viewLJFF.setSelected(true);
        StoryGalleryLayoutManager storyGalleryLayoutManager2 = (StoryGalleryLayoutManager) asS58S0100000_33.l0;
        storyGalleryLayoutManager2.LLILZLL = position;
        Iterator it2 = ((List) storyGalleryLayoutManager2.LLILZ.getValue()).iterator();
        while (it2.hasNext()) {
            ((InterfaceC21682219tM) it2.next()).LJLJJI(position);
        }
    }
}
