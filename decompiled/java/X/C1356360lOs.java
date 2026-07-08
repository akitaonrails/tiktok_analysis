package X;

import Y.ACListenerS155S0100000_21;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.experiment.CommentLongPressConfig;
import com.ss.android.ugc.aweme.comment.longpresspanel.ui.CommentLongPressFragment;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.service.analytics.ILogger;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0lOs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1356360lOs extends FrameLayout implements LifecycleOwner, InterfaceC1356390lOv, InterfaceC1363760lao, InterfaceC1363370laB {
    public InterfaceC1356400lOw LL;
    public InterfaceC1356370lOt LLILLJJLI;
    public InterfaceC1356390lOv LLILLL;
    public RecyclerView LLILZ;
    public SharePackage LLILZIL;
    public String LLILZLL;
    public InterfaceC1362600lYw LLIZ;
    public InterfaceC1354710lMD LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public boolean LLJIJIL;

    @Override // X.InterfaceC1356390lOv
    public final void DX1(Throwable th, List list) {
    }

    @Override // X.InterfaceC1356390lOv
    public final void GW(IMContact iMContact) {
    }

    @Override // X.InterfaceC1363760lao
    public final void LJLJJLL() {
    }

    @Override // X.InterfaceC1356390lOv
    public final boolean dE(IMContact iMContact, boolean z, Fragment fragment) {
        return false;
    }

    public final void setAwmeme(Aweme aweme) {
    }

    public final void setComment(Comment comment) {
    }

    private final C897520ZIw getActivityStatusClient() {
        return (C897520ZIw) this.LLJI.getValue();
    }

    private final Fragment getHostFragment() {
        FragmentManager childFragmentManager;
        String str = CommentLongPressFragment._pnsPageId;
        Fragment fragmentLIZIZ = C2393909Zp.LIZIZ(getContext());
        if (fragmentLIZIZ == null || (childFragmentManager = fragmentLIZIZ.getChildFragmentManager()) == null) {
            return null;
        }
        return childFragmentManager.LJJJJZI("sheet_content_fragment");
    }

    private final LifecycleRegistry getLifecycleRegistry() {
        return (LifecycleRegistry) this.LLJ.getValue();
    }

    @Override // X.InterfaceC1363370laB
    public C0ZE7 getActivityStatusParams() {
        C0ZE7 c0ze7 = new C0ZE7(this);
        c0ze7.LIZIZ(EnumC1910440zoY.SHARE_PANEL);
        c0ze7.LIZLLL = this.LLILZLL;
        return c0ze7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int i;
        boolean z;
        FragmentManager childFragmentManager;
        Fragment fragmentLJJJJZI;
        SharePackage sharePackage;
        InterfaceC1362600lYw interfaceC1362600lYw;
        InterfaceC1356370lOt interfaceC1356370lOt;
        C1214170hhX c1214170hhXLJFF;
        InterfaceC1356370lOt interfaceC1356370lOt2;
        TuxTextView tuxTextView;
        FrameLayout.LayoutParams layoutParams;
        FrameLayout.LayoutParams layoutParams2;
        super.onAttachedToWindow();
        if (this.LLJIJIL) {
            i = 8;
            z = 0;
        } else {
            IInternalShareApi.LIZ.getClass();
            InterfaceC1364710lcL interfaceC1364710lcLLIZIZ = C1370970lmR.LIZ().LIZIZ();
            SharePackage sharePackage2 = this.LLILZIL;
            C897520ZIw activityStatusClient = getActivityStatusClient();
            C1362230lYL c1362230lYL = new C1362230lYL();
            C1354990lMf.LIZ.getClass();
            c1362230lYL.LJIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C1354990lMf.LIZJ() ? 48 : 56)));
            c1362230lYL.LJIIJJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C1354990lMf.LIZJ() ? 64 : 76));
            c1362230lYL.LJIILL = Integer.valueOf(R.attr.a1e);
            i = 8;
            Pair<InterfaceC1356400lOw, InterfaceC1356370lOt> pairLJJJJL = interfaceC1364710lcLLIZIZ.LJJJJL(sharePackage2, this, false, false, false, this, this, new C1363630lab(false, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C1354990lMf.LIZJ() ? 64 : 76)), 2, true, EnumC1364050lbH.MASK_WITH_CHECK_MARK), true, c1362230lYL, activityStatusClient, this, null);
            InterfaceC1356400lOw first = pairLJJJJL.getFirst();
            InterfaceC1356370lOt second = pairLJJJJL.getSecond();
            this.LL = first;
            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.ebq);
            recyclerView.setItemAnimator(null);
            InterfaceC1356400lOw interfaceC1356400lOw = this.LL;
            recyclerView.setAdapter(interfaceC1356400lOw instanceof AbstractC21673619ry ? (AbstractC21673619ry) interfaceC1356400lOw : null);
            z = 0;
            z = 0;
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
            this.LLILZ = recyclerView;
            this.LLILLJJLI = second;
            if (second != null) {
                second.refresh();
            }
            RecyclerView recyclerView2 = this.LLILZ;
            if (recyclerView2 != null) {
                recyclerView2.addItemDecoration(new C424780GlA(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C1354990lMf.LIZJ() ? 8 : 6))), 0));
            }
        }
        if (!this.LLJIJIL) {
            ViewGroup viewGroup = (ViewGroup) findViewById(R.id.ebr);
            C1354990lMf.LIZ.getClass();
            if (C1354990lMf.LIZIZ()) {
                if (C1354990lMf.LIZJ()) {
                    ViewGroup.LayoutParams layoutParams3 = viewGroup.getLayoutParams();
                    if ((layoutParams3 instanceof FrameLayout.LayoutParams) && (layoutParams2 = (FrameLayout.LayoutParams) layoutParams3) != null) {
                        layoutParams2.topMargin = z;
                    }
                } else {
                    ViewGroup.LayoutParams layoutParams4 = viewGroup.getLayoutParams();
                    if ((layoutParams4 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams4) != null) {
                        layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                    }
                }
            }
            SharePackage sharePackage3 = this.LLILZIL;
            if (sharePackage3 != null && sharePackage3.extras != null && (interfaceC1356370lOt = this.LLILLJJLI) != null && (c1214170hhXLJFF = interfaceC1356370lOt.LJFF()) != null && (interfaceC1356370lOt2 = this.LLILLJJLI) != null && interfaceC1356370lOt2.LIZJ(c1214170hhXLJFF)) {
                IInternalShareApi.LIZ.getClass();
                C1214160hhW c1214160hhWLJIIIIZZ = C1370970lmR.LIZ().LIZIZ().LJIIIIZZ(getContext(), null, null, c1214170hhXLJFF, z, z);
                if (c1214160hhWLJIIIIZZ instanceof ViewGroup) {
                    View childAt = c1214160hhWLJIIIIZZ.getChildAt(z);
                    if (childAt != 0) {
                        childAt.setBackgroundColor(z);
                        C426750GoL.LJIIL(childAt, null, null, null, 0, 23);
                        if (C1354990lMf.LIZIZ()) {
                            C426750GoL.LJIIL(childAt, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)))), 23);
                            if (C1354990lMf.LIZJ()) {
                                C426750GoL.LJIIL(childAt, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), null, null, 29);
                            } else {
                                C426750GoL.LJIIL(childAt, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), null, null, 29);
                            }
                        }
                    }
                    if (C1354990lMf.LIZIZ() && childAt != 0 && (tuxTextView = (TuxTextView) childAt.findViewById(R.id.xyf)) != null) {
                        tuxTextView.setTuxFont(71);
                        tuxTextView.setTextColorRes(R.attr.a1k);
                    }
                }
                LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
                if (C1354990lMf.LIZIZ()) {
                    viewGroup.addView((View) c1214160hhWLJIIIIZZ, (int) z, (ViewGroup.LayoutParams) layoutParams5);
                } else {
                    viewGroup.addView(c1214160hhWLJIIIIZZ, layoutParams5);
                }
            }
        }
        View viewFindViewById = findViewById(R.id.ebs);
        if (viewFindViewById != null) {
            C1354990lMf.LIZ.getClass();
            if (C1354990lMf.LIZJ()) {
                C786410Ut5.LJLLLLLL(i, viewFindViewById);
            } else {
                C786410Ut5.LJLLLLLL(z, viewFindViewById);
            }
            C786410Ut5.I7(new ACListenerS155S0100000_21(viewFindViewById, 185), viewFindViewById);
        }
        String str = CommentLongPressFragment._pnsPageId;
        Fragment fragmentLIZIZ = C2393909Zp.LIZIZ(getContext());
        if (fragmentLIZIZ != null && (childFragmentManager = fragmentLIZIZ.getChildFragmentManager()) != null && (fragmentLJJJJZI = childFragmentManager.LJJJJZI("sheet_content_fragment")) != null && (sharePackage = this.LLILZIL) != null && (interfaceC1362600lYw = this.LLIZ) != null) {
            IInternalShareApi.LIZ.getClass();
            this.LLILLL = C1370970lmR.LIZ().LIZIZ().LJJIJIIJI(fragmentLJJJJZI, sharePackage, C13BV.INSTANCE, interfaceC1362600lYw, this.LLILLJJLI);
        }
        getLifecycleRegistry().setCurrentState(Lifecycle.State.STARTED);
        C897520ZIw activityStatusClient2 = getActivityStatusClient();
        if (activityStatusClient2 != null) {
            activityStatusClient2.LJ();
        }
        InterfaceC1354710lMD interfaceC1354710lMD = this.LLIZLLLIL;
        if (interfaceC1354710lMD != null) {
            interfaceC1354710lMD.LIZJ(this.LLILZ);
        }
        C1354990lMf.LIZ.getClass();
        if (C1354990lMf.LIZ() != null) {
            this.LLJIJIL = true;
        }
    }

    public final void LIZ() {
        getLifecycleRegistry().setCurrentState(Lifecycle.State.DESTROYED);
        C897520ZIw activityStatusClient = getActivityStatusClient();
        if (activityStatusClient != null) {
            activityStatusClient.destroy();
        }
        RecyclerView recyclerView = this.LLILZ;
        if (recyclerView != null) {
            C2211751BhN.LIZIZ(recyclerView);
        }
        this.LLJIJIL = false;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return getLifecycleRegistry();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C897520ZIw activityStatusClient = getActivityStatusClient();
        if (activityStatusClient != null) {
            activityStatusClient.LJII();
        }
        C1354990lMf.LIZ.getClass();
        if (C1354990lMf.LIZ() == null) {
            getLifecycleRegistry().setCurrentState(Lifecycle.State.DESTROYED);
            C897520ZIw activityStatusClient2 = getActivityStatusClient();
            if (activityStatusClient2 != null) {
                activityStatusClient2.destroy();
            }
            RecyclerView recyclerView = this.LLILZ;
            if (recyclerView != null) {
                C2211751BhN.LIZIZ(recyclerView);
            }
        }
    }

    public C1356360lOs(Context context) {
        super(context, null);
        this.LLILZLL = "";
        this.LLJ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1340));
        this.LLJI = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(498));
        FrameLayout.inflate(context, R.layout.a3w, this);
    }

    @Override // X.InterfaceC1363760lao
    public final void Sc(IMContact iMContact) {
        InterfaceC1356370lOt interfaceC1356370lOt;
        if (((iMContact instanceof IMUser) || (iMContact instanceof IMConversation)) && (interfaceC1356370lOt = this.LLILLJJLI) != null) {
            interfaceC1356370lOt.LIZ(iMContact);
        }
    }

    @Override // X.InterfaceC1356390lOv
    public final void jR(List<? extends IMContact> list) {
        int i;
        C897520ZIw activityStatusClient = getActivityStatusClient();
        if (activityStatusClient != null) {
            activityStatusClient.LJIIJJI(new C1356420lOy(list, null));
        }
        CommentLongPressConfig commentLongPressConfig = (CommentLongPressConfig) C1339940kyO.LIZ.getValue();
        if (commentLongPressConfig != null) {
            i = commentLongPressConfig.maxContactCount;
        } else {
            i = 15;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadComplete: list: ");
        sbLIZ.append(list.size());
        sbLIZ.append("  config maxContactCount = ");
        sbLIZ.append(i);
        C1344030l4z.LIZJ("CommentIShareView", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1356400lOw interfaceC1356400lOw = this.LL;
        if (interfaceC1356400lOw != null) {
            if (list.size() > i) {
                list = list.subList(0, i);
            }
            getContext();
            interfaceC1356400lOw.LLJILJILJ(this, list);
        }
    }

    public final void setCallBack(InterfaceC1362600lYw interfaceC1362600lYw) {
        this.LLIZ = interfaceC1362600lYw;
    }

    public final void setCommentShareCallback(InterfaceC1354710lMD interfaceC1354710lMD) {
        this.LLIZLLLIL = interfaceC1354710lMD;
    }

    public final void setEnterFrom(String str) {
        this.LLILZLL = str;
    }

    public final void setSharePackage(SharePackage sharePackage) {
        this.LLILZIL = sharePackage;
    }

    @Override // X.InterfaceC1356390lOv
    public final void Pu0(List<? extends IMContact> list, List<? extends IMContact> list2) {
        boolean z;
        Set<IMContact> setLIZIZ;
        InterfaceC1356390lOv interfaceC1356390lOv = this.LLILLL;
        if (interfaceC1356390lOv != null) {
            interfaceC1356390lOv.Pu0(list, list2);
        }
        InterfaceC1356400lOw interfaceC1356400lOw = this.LL;
        if (interfaceC1356400lOw != null) {
            interfaceC1356400lOw.LJLL(this.LLILZ, list);
        }
        InterfaceC1354710lMD interfaceC1354710lMD = this.LLIZLLLIL;
        if (interfaceC1354710lMD != null) {
            InterfaceC1356370lOt interfaceC1356370lOt = this.LLILLJJLI;
            if (interfaceC1356370lOt != null && (setLIZIZ = interfaceC1356370lOt.LIZIZ()) != null) {
                z = !setLIZIZ.isEmpty();
            } else {
                z = false;
            }
            interfaceC1354710lMD.LIZIZ(z);
        }
    }

    @Override // X.InterfaceC1356390lOv
    public final boolean eJ2(IMContact iMContact, boolean z) {
        Set<IMContact> setLIZIZ;
        SharePackage sharePackage;
        String strLJ;
        SharePackage sharePackage2;
        Bundle bundle;
        Set<IMContact> setLIZIZ2 = null;
        boolean z2 = false;
        if (iMContact instanceof C1363150lZp) {
            String str = CommentLongPressFragment._pnsPageId;
            C2393909Zp.LIZ(getContext());
            Activity activityLIZ = C1388190mED.LIZ(getContext());
            if (activityLIZ != null && (sharePackage = this.LLILZIL) != null) {
                C786410Ut5.LJJJI("cancel_toast", "false", sharePackage.extras);
                InterfaceC1356370lOt interfaceC1356370lOt = this.LLILLJJLI;
                if (interfaceC1356370lOt != null && (strLJ = interfaceC1356370lOt.LJ()) != null && C123100dR.LIZ(strLJ) && (sharePackage2 = this.LLILZIL) != null && (bundle = sharePackage2.extras) != null) {
                    C786410Ut5.LJJJI("default_edit_text_msg", strLJ, bundle);
                }
                IInternalShareApi.LIZ.getClass();
                InterfaceC1364710lcL interfaceC1364710lcLLIZIZ = C1370970lmR.LIZ().LIZIZ();
                InterfaceC1356370lOt interfaceC1356370lOt2 = this.LLILLJJLI;
                if (interfaceC1356370lOt2 != null) {
                    setLIZIZ2 = interfaceC1356370lOt2.LIZIZ();
                }
                getHostFragment();
                interfaceC1364710lcLLIZIZ.LJFF(activityLIZ, sharePackage, null, setLIZIZ2, false, null, false, null, false, true, null, false, true, null);
                ((ILogger) ServiceManager.get().getService(ILogger.class)).LJ(sharePackage, "long_press", C0I0B.LJFF.LIZIZ());
            }
            return false;
        }
        InterfaceC1356390lOv interfaceC1356390lOv = this.LLILLL;
        if (interfaceC1356390lOv != null && !interfaceC1356390lOv.dE(iMContact, z, getHostFragment())) {
            return false;
        }
        if (z) {
            InterfaceC1356370lOt interfaceC1356370lOt3 = this.LLILLJJLI;
            if (interfaceC1356370lOt3 != null) {
                setLIZIZ2 = interfaceC1356370lOt3.LIZIZ();
            }
            if (C19719512Dh.LJIIIIZZ(setLIZIZ2) && setLIZIZ2 != null) {
                setLIZIZ2.add(iMContact);
            }
        } else {
            InterfaceC1356370lOt interfaceC1356370lOt4 = this.LLILLJJLI;
            if (interfaceC1356370lOt4 != null) {
                setLIZIZ2 = interfaceC1356370lOt4.LIZIZ();
            }
            if (C19719512Dh.LJIIIIZZ(setLIZIZ2) && setLIZIZ2 != null) {
                setLIZIZ2.remove(iMContact);
            }
        }
        InterfaceC1354710lMD interfaceC1354710lMD = this.LLIZLLLIL;
        if (interfaceC1354710lMD != null) {
            InterfaceC1356370lOt interfaceC1356370lOt5 = this.LLILLJJLI;
            if (interfaceC1356370lOt5 != null && (setLIZIZ = interfaceC1356370lOt5.LIZIZ()) != null) {
                z2 = !setLIZIZ.isEmpty();
            }
            interfaceC1354710lMD.LIZIZ(z2);
        }
        InterfaceC1356390lOv interfaceC1356390lOv2 = this.LLILLL;
        if (interfaceC1356390lOv2 != null) {
            interfaceC1356390lOv2.eJ2(iMContact, z);
            return true;
        }
        return true;
    }
}
