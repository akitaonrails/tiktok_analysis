package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideoAnimation;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoAnimation;
import com.bytedance.ies.nle.editor_jni.VecNLEVideoAnimationSPtr;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.PUgcTemplateData;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AwS132S0201000_5;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.AwS59S0210000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EBQ, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EBQ extends C0EBW {
    public final ViewGroup LIZ;
    public final Activity LIZIZ;
    public final C0E48 LIZJ;
    public final boolean LIZLLL;
    public final String LJ;
    public final boolean LJFF;
    public View LJI;
    public C0EDF LJII;
    public C0ED1 LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public AwS371S0200000_5 LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public final C01GW LJIILLIIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1232));

    public final void LJ() {
        C361100EDs resourceListAdapter;
        ResourceItem resourceItem;
        LinearLayoutManager linearLayoutManager;
        RecyclerView recyclerView;
        LinearLayoutManager linearLayoutManager2;
        RecyclerView recyclerView2;
        NLETrackSlot nLETrackSlotLLLLLLIL;
        C0EDF c0edfInvoke;
        NLEVideoAnimation next;
        NLESegmentVideoAnimation segment;
        C0EDF c0edfInvoke2;
        C361100EDs resourceListAdapter2;
        ResourceItem resourceItem2;
        LinearLayoutManager linearLayoutManager3;
        RecyclerView recyclerView3;
        LinearLayoutManager linearLayoutManager4;
        RecyclerView recyclerView4;
        this.LJIILL = false;
        LIZJ().LIZJ();
        C0E1C c0e1cLIZJ = LIZJ();
        NLEResourceNode effectSDKVideoAnimation = null;
        if (!((ArrayList) c0e1cLIZJ.LJIIJ).isEmpty()) {
            C0EDF c0edfInvoke3 = c0e1cLIZJ.LIZ.invoke();
            RecyclerView.LayoutManager layoutManager = (c0edfInvoke3 == null || (recyclerView4 = c0edfInvoke3.getRecyclerView()) == null) ? null : recyclerView4.getLayoutManager();
            int iFindFirstVisibleItemPosition = (!(layoutManager instanceof LinearLayoutManager) || (linearLayoutManager4 = (LinearLayoutManager) layoutManager) == null) ? 0 : linearLayoutManager4.findFirstVisibleItemPosition();
            C0EDF c0edfInvoke4 = c0e1cLIZJ.LIZ.invoke();
            RecyclerView.LayoutManager layoutManager2 = (c0edfInvoke4 == null || (recyclerView3 = c0edfInvoke4.getRecyclerView()) == null) ? null : recyclerView3.getLayoutManager();
            int iFindLastVisibleItemPosition = (!(layoutManager2 instanceof LinearLayoutManager) || (linearLayoutManager3 = (LinearLayoutManager) layoutManager2) == null) ? 0 : linearLayoutManager3.findLastVisibleItemPosition();
            Iterator it2 = ((ArrayList) c0e1cLIZJ.LJIIJ).iterator();
            while (it2.hasNext()) {
                int iIntValue = ((Number) it2.next()).intValue();
                C0EDF c0edfInvoke5 = c0e1cLIZJ.LIZ.invoke();
                if (c0edfInvoke5 != null && (resourceListAdapter2 = c0edfInvoke5.getResourceListAdapter()) != null && (resourceItem2 = (ResourceItem) C13LP.LJJJLZIJ(iIntValue, resourceListAdapter2.LLLFZ())) != null && iFindFirstVisibleItemPosition <= iIntValue && iIntValue <= iFindLastVisibleItemPosition) {
                    c0e1cLIZJ.LIZLLL(resourceItem2, iIntValue);
                }
            }
            ((ArrayList) c0e1cLIZJ.LJIIJ).clear();
        } else {
            C0EDF c0edfInvoke6 = c0e1cLIZJ.LIZ.invoke();
            RecyclerView.LayoutManager layoutManager3 = (c0edfInvoke6 == null || (recyclerView2 = c0edfInvoke6.getRecyclerView()) == null) ? null : recyclerView2.getLayoutManager();
            int iFindFirstVisibleItemPosition2 = (!(layoutManager3 instanceof LinearLayoutManager) || (linearLayoutManager2 = (LinearLayoutManager) layoutManager3) == null) ? 0 : linearLayoutManager2.findFirstVisibleItemPosition();
            C0EDF c0edfInvoke7 = c0e1cLIZJ.LIZ.invoke();
            RecyclerView.LayoutManager layoutManager4 = (c0edfInvoke7 == null || (recyclerView = c0edfInvoke7.getRecyclerView()) == null) ? null : recyclerView.getLayoutManager();
            int iFindLastVisibleItemPosition2 = (!(layoutManager4 instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager4) == null) ? 0 : linearLayoutManager.findLastVisibleItemPosition();
            if (iFindFirstVisibleItemPosition2 <= iFindLastVisibleItemPosition2) {
                while (true) {
                    C0EDF c0edfInvoke8 = c0e1cLIZJ.LIZ.invoke();
                    if (c0edfInvoke8 != null && (resourceListAdapter = c0edfInvoke8.getResourceListAdapter()) != null && (resourceItem = (ResourceItem) C13LP.LJJJLZIJ(iFindFirstVisibleItemPosition2, resourceListAdapter.LLLFZ())) != null) {
                        c0e1cLIZJ.LIZLLL(resourceItem, iFindFirstVisibleItemPosition2);
                    }
                    if (iFindFirstVisibleItemPosition2 == iFindLastVisibleItemPosition2) {
                        break;
                    } else {
                        iFindFirstVisibleItemPosition2++;
                    }
                }
            }
        }
        C0E1C c0e1cLIZJ2 = LIZJ();
        C0E48 c0e48 = c0e1cLIZJ2.LJII;
        if (c0e48 != null && (nLETrackSlotLLLLLLIL = c0e48.LLLLLLIL()) != null) {
            if (C351220Dpo.LLLLIL(nLETrackSlotLLLLLLIL)) {
                String strLJIILLIIL = C351220Dpo.LJIILLIIL(nLETrackSlotLLLLLLIL);
                if (strLJIILLIIL == null || (c0edfInvoke2 = c0e1cLIZJ2.LIZ.invoke()) == null) {
                    return;
                }
                C0EDF.LJIIL(c0edfInvoke2, strLJIILLIIL, C0E17.DIRECT_SCROLL, 8);
                return;
            }
            if (nLETrackSlotLLLLLLIL != null && C351220Dpo.LLIIJI(nLETrackSlotLLLLLLIL)) {
                VecNLEVideoAnimationSPtr videoAnims = nLETrackSlotLLLLLLIL.getVideoAnims();
                if (videoAnims != null) {
                    Iterator<NLEVideoAnimation> it3 = videoAnims.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it3.next();
                            if (Intrinsics.LJFF(C351220Dpo.LJIJ(next), c0e1cLIZJ2.LIZJ.invoke())) {
                                break;
                            }
                        }
                    }
                    NLEVideoAnimation nLEVideoAnimation = next;
                    if (nLEVideoAnimation != null && (segment = nLEVideoAnimation.getSegment()) != null) {
                        effectSDKVideoAnimation = segment.getEffectSDKVideoAnimation();
                    }
                }
                String strLIZIZ = C0E37.LIZIZ(effectSDKVideoAnimation);
                if (strLIZIZ == null || (c0edfInvoke = c0e1cLIZJ2.LIZ.invoke()) == null) {
                    return;
                }
                C0EDF.LJIIL(c0edfInvoke, strLIZIZ, C0E17.DIRECT_SCROLL, 8);
                return;
            }
        }
        C0EDF c0edfInvoke9 = c0e1cLIZJ2.LIZ.invoke();
        if (c0edfInvoke9 != null) {
            C0EDF.LJIIJ(c0edfInvoke9, "", C0E17.DIRECT_SCROLL, 2);
        }
    }

    @Override // X.C0EBW
    public final View LIZ() {
        View view = this.LJI;
        if (view != null) {
            return view;
        }
        throw new RuntimeException("you must call initView first!");
    }

    public final C0E1C LIZJ() {
        return (C0E1C) this.LJIILLIIL.getValue();
    }

    public final View LIZLLL() {
        ViewGroup.LayoutParams layoutParams;
        FrameLayout.LayoutParams layoutParams2;
        RecyclerView recyclerView;
        CreativeModel creativeModel;
        PUgcTemplateData pUgcTemplateData;
        FrameLayout.LayoutParams layoutParams3;
        boolean z = false;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LIZ.getContext()), R.layout.c31, this.LIZ, false);
        this.LJI = viewTd;
        this.LJII = (C0EDF) viewTd.findViewById(R.id.td4);
        this.LJIIIIZZ = (C0ED1) viewTd.findViewById(R.id.video_anim_item_loading);
        if (C357780E0y.LIZ()) {
            C0EDF c0edf = this.LJII;
            layoutParams = c0edf != null ? c0edf.getLayoutParams() : null;
            if ((layoutParams instanceof FrameLayout.LayoutParams) && (layoutParams3 = (FrameLayout.LayoutParams) layoutParams) != null) {
                layoutParams3.topMargin = C354870Dvh.LIZ(7);
            }
        } else {
            C0EDF c0edf2 = this.LJII;
            layoutParams = c0edf2 != null ? c0edf2.getLayoutParams() : null;
            if ((layoutParams instanceof FrameLayout.LayoutParams) && (layoutParams2 = (FrameLayout.LayoutParams) layoutParams) != null) {
                layoutParams2.topMargin = C354870Dvh.LIZ(16);
                layoutParams2.bottomMargin = C354870Dvh.LIZ(16);
            }
        }
        this.LIZ.addView(viewTd);
        C0E1C c0e1cLIZJ = LIZJ();
        c0e1cLIZJ.getClass();
        VideoPublishEditModel videoPublishEditModelLIZIZ = C0E1C.LIZIZ();
        if (videoPublishEditModelLIZIZ != null && (creativeModel = videoPublishEditModelLIZIZ.creativeModel) != null && (pUgcTemplateData = creativeModel.pugcTemplateData) != null && pUgcTemplateData.isFromCreateTemplate) {
            z = true;
        }
        String string = C351230Dpp.LJ(Boolean.valueOf(z)) ? c0e1cLIZJ.LJFF.invoke().getString(2131834008) : c0e1cLIZJ.LJFF.invoke().getString(2131832505);
        String string2 = C351230Dpp.LJ(Boolean.valueOf(z)) ? c0e1cLIZJ.LJFF.invoke().getString(2131832504) : c0e1cLIZJ.LJFF.invoke().getString(2131834004);
        C0ED1 c0ed1Invoke = c0e1cLIZJ.LIZIZ.invoke();
        if (c0ed1Invoke != null) {
            c0ed1Invoke.setLoadingTip(string);
            c0ed1Invoke.setErrorTip(string2);
            c0ed1Invoke.setOnRetryClick(new AwS584S0100000_5(c0e1cLIZJ, 969));
            c0ed1Invoke.LIZJ();
        }
        final C0E1C c0e1cLIZJ2 = LIZJ();
        final AwS549S0100000_5 awS549S0100000_5 = new AwS549S0100000_5(this, 1244);
        c0e1cLIZJ2.getClass();
        InterfaceC21676519sR interfaceC21676519sR = new InterfaceC21676519sR() { // from class: X.0EBR
            @Override // X.InterfaceC21676519sR
            public final void m3(View view) {
            }

            @Override // X.InterfaceC21676519sR
            public final void g5(View view) {
                RecyclerView recyclerView2;
                C361100EDs resourceListAdapter;
                ResourceItem resourceItem;
                C0EDF c0edfInvoke = c0e1cLIZJ2.LIZ.invoke();
                if (c0edfInvoke != null && (recyclerView2 = c0edfInvoke.getRecyclerView()) != null) {
                    int childAdapterPosition = recyclerView2.getChildAdapterPosition(view);
                    if (awS549S0100000_5.invoke().booleanValue()) {
                        C0EDF c0edfInvoke2 = c0e1cLIZJ2.LIZ.invoke();
                        if (c0edfInvoke2 != null && (resourceListAdapter = c0edfInvoke2.getResourceListAdapter()) != null && (resourceItem = (ResourceItem) C13LP.LJJJLZIJ(childAdapterPosition, resourceListAdapter.LLLFZ())) != null) {
                            C354270Duj.LIZ(0L, new AwS132S0201000_5(c0e1cLIZJ2, childAdapterPosition, resourceItem, 9));
                            return;
                        }
                        return;
                    }
                    ((ArrayList) c0e1cLIZJ2.LJIIJ).add(Integer.valueOf(childAdapterPosition));
                }
            }
        };
        c0e1cLIZJ2.getClass();
        C0EDF c0edfInvoke = c0e1cLIZJ2.LIZ.invoke();
        if (c0edfInvoke != null && (recyclerView = c0edfInvoke.getRecyclerView()) != null) {
            recyclerView.addOnChildAttachStateChangeListener(interfaceC21676519sR);
        }
        final C0E1C c0e1cLIZJ3 = LIZJ();
        C0EDF c0edfInvoke2 = c0e1cLIZJ3.LIZ.invoke();
        if (c0edfInvoke2 != null) {
            c0edfInvoke2.setResourceListMobListener(new C0EDT() { // from class: X.0E2z
                @Override // X.C0EDT
                public final void LIZ(boolean z2, boolean z3, long j, Exception exc, Integer num, ResourceItem resourceItem) {
                    String message;
                    C0EU5.LIZIZ(c0e1cLIZJ3.LJII, "video_anim_panel", resourceItem.getEffectId(), z3);
                    C0EFE c0efe = C0EFE.LIZ;
                    if (exc == null || (message = exc.getMessage()) == null) {
                        message = "";
                    }
                    String effectId = resourceItem.getEffectId();
                    String name = resourceItem.getName();
                    String strInvoke = c0e1cLIZJ3.LIZJ.invoke();
                    c0efe.getClass();
                    int i = !z2 ? 1 : 0;
                    C0LAB c0lab = new C0LAB();
                    c0lab.LIZ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
                    c0lab.LIZIZ(j, "duration");
                    c0lab.LJ("resource_id", effectId);
                    c0lab.LJ("resource_name", name);
                    c0lab.LJ("animation_type", strInvoke);
                    c0lab.LIZ(z3 ? 1 : 0, "use_cache");
                    if (!z2 && num != null) {
                        c0lab.LIZ(num.intValue(), "error_code");
                        c0lab.LJ("error_domain", message);
                    }
                    C20684815ws.LJIILLIIL("download_animation", c0lab.LIZ);
                }

                @Override // X.C0EDT
                public final void LIZIZ(boolean z2, long j, boolean z3, Exception exc, Integer num, boolean z4) {
                    InterfaceC360730ECh editorProResourceProvider;
                    C0EDF c0edfInvoke3 = c0e1cLIZJ3.LIZ.invoke();
                    if (c0edfInvoke3 != null && (editorProResourceProvider = c0edfInvoke3.getEditorProResourceProvider()) != null) {
                        String strInvoke = c0e1cLIZJ3.LIZJ.invoke();
                        InterfaceC1635390sev.LJJLIIIIJ.getClass();
                        editorProResourceProvider.LIZLLL(1, "editor_pro_video_anim", strInvoke, new AwS59S0210000_5(z2, num, exc, 9));
                    }
                }
            });
        }
        return viewTd;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0232  */
    @Override // X.C0EBW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(boolean r22) {
        /*
            Method dump skipped, instruction units count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EBQ.LIZIZ(boolean):void");
    }

    public C0EBQ(ViewGroup viewGroup, C19EG c19eg, C0E48 c0e48, boolean z, String str, boolean z2) {
        this.LIZ = viewGroup;
        this.LIZIZ = c19eg;
        this.LIZJ = c0e48;
        this.LIZLLL = z;
        this.LJ = str;
        this.LJFF = z2;
    }
}
