package X;

import Y.ARunnableS103S0100000_3;
import Y.ARunnableS119S0100000_19;
import Y.ARunnableS129S0100000_29;
import android.content.Context;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.aicover.AICoverInfo;
import com.ss.android.ugc.aweme.creative.model.edit.aicover.AICoverItem;
import com.ss.android.ugc.aweme.image.aicover.AICoverPluginService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS582S0100000_3;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.12G1, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12G1 extends AbstractC1664490tPr<C12G7, C1461890o95> {
    public static final /* synthetic */ int LLLILZ = 0;
    public RecyclerView LLJJJIL;
    public View LLJJJJ;
    public TuxIconView LLJJJJJIL;
    public TuxIconView LLJJJJLIIL;
    public C1295960jpS LLJJL;
    public ConstraintLayout LLJJLIIIJLLLLLLLZ;
    public GestureDetector LLJL;
    public View LLJLIL;
    public TuxTextView LLJLILLLLZIIL;
    public C19726412Fy LLJLL;
    public InterfaceC19726212Fw LLJLLIL;
    public boolean LLJLLL;
    public boolean LLJZ;
    public C12G3 LLJZIJLIL;
    public String LLL;
    public AnonymousClass0956 LLLF;
    public C0P0T LLLFF;
    public C054G LLLFFI;
    public boolean LLLFZ;
    public boolean LLLI;
    public final C1461820o8y LLLII;
    public boolean LLLIIII;
    public Boolean LLLIIIIL;
    public int LLLIIIL;
    public final C01GW LLLIIL;
    public C0P0T LLLIILIL;
    public final C21688219uK LLLIL;

    public final View LLLLLJLJLL() {
        View view = this.LLJLIL;
        if ((!C1454030nwP.LIZJ(LLLLLLIL()) || view == null) && (view = this.LLJJJIL) == null) {
            return null;
        }
        return view;
    }

    public final C12GJ LLLLLL() {
        return (C12GJ) this.LLLIIL.getValue();
    }

    public final void LLLLLZ() {
        Object c098200Yq;
        try {
            c098200Yq = this.mView;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        View view = (View) c098200Yq;
        if (view != null) {
            C1389880mGw c1389880mGw = new C1389880mGw(view);
            c1389880mGw.LJIIIIZZ(2131821390);
            c1389880mGw.LJIIJ();
        }
    }

    public C12G1() {
        C23119094b c23119094bLIZ = C2296908zH.LIZ();
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLLFFI = C2296808zG.LIZ(C09A1.LIZLLL(c23119094bLIZ, C2107308Nj.LIZ.LLIILII()));
        this.LLLII = C1461820o8y.LIZ;
        C418440Gaw.LIZIZ(69);
        this.LLLIIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(125));
        this.LLLIIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 137));
        this.LLLIL = new C21688219uK(new C12G2(this));
    }

    public final VideoPublishEditModel LLLLLLIL() {
        return LLLLILI().LIZ.LIZIZ;
    }

    public final boolean LLLLZ() {
        int i = LLLLILI().LIZ.LIZ.isSingleWhenInit() ? 1 : C12GK.LLJJJ;
        if (((ArrayList) LLLLLL().LLILZ).size() - 1 > i) {
            return false;
        }
        LLLLLZL(i);
        return true;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        C19726412Fy c19726412Fy = this.LLJLL;
        if (c19726412Fy != null) {
            HandlerHook.viewPost(c19726412Fy.LIZLLL, new ARunnableS129S0100000_29(c19726412Fy, 51));
            C1216510hlJ.LIZ().storeBoolean("image_collage_expand_keva", true);
        }
        AnonymousClass0956 anonymousClass0956 = this.LLLF;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLLF = null;
        C2296808zG.LIZJ(this.LLLFFI, null);
        C23119094b c23119094bLIZ = C2296908zH.LIZ();
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLLFFI = C2296808zG.LIZ(C09A1.LIZLLL(c23119094bLIZ, C2107308Nj.LIZ.LLIILII()));
        String str = this.LLL;
        if (str != null) {
            AICoverPluginService.LIZ.getClass();
            AICoverPluginService aICoverPluginServiceLIZ = C1446770nkh.LIZ();
            if (aICoverPluginServiceLIZ != null) {
                aICoverPluginServiceLIZ.LIZJ(LLLLLLIL(), str);
            }
        }
        this.LLL = null;
        this.LLJZIJLIL = null;
        InterfaceC19726212Fw interfaceC19726212Fw = this.LLJLLIL;
        if (interfaceC19726212Fw != null) {
            interfaceC19726212Fw.release();
        }
        this.LLJLLIL = null;
        C0P0T c0p0t = this.LLLFF;
        if (c0p0t != null) {
            c0p0t.dismiss();
        }
        this.LLLFF = null;
    }

    @Override // X.AbstractC1664490tPr, com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
        if (this.LLLI) {
            this.LLLI = false;
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C2352809Ju(C778450UgF.LIZ(requireSceneContext()), LLLLILI().LIZ.LIZIZ, this, null), 3);
        }
    }

    public static final boolean LLLLLLLLL(SingleImageData singleImageData) {
        if (!singleImageData.isAICover() || singleImageData.getCollageInfo() != null) {
            return false;
        }
        return true;
    }

    public final void LLLLLJIL(RecyclerView.ViewHolder viewHolder) {
        if (C297370Bl9.LIZ()) {
            if (viewHolder != null) {
                Integer numValueOf = Integer.valueOf(viewHolder.getBindingAdapterPosition());
                if (numValueOf.intValue() > 0) {
                    LLLLIL().LJIIL.invoke(Integer.valueOf(numValueOf.intValue() - 1));
                    return;
                }
                return;
            }
            return;
        }
        if (viewHolder == null) {
            return;
        }
        LLLLIL().LJIIL.invoke(Integer.valueOf(viewHolder.getBindingAdapterPosition() - 1));
    }

    public final boolean LLLLLLL(ImageAlbumData imageAlbumData) {
        List<SingleImageData> imageList;
        String strLIZLLL = C1454030nwP.LIZLLL(LLLLLLIL());
        if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null && !imageList.isEmpty()) {
            Iterator<SingleImageData> it2 = imageList.iterator();
            int i = 0;
            while (it2.hasNext()) {
                if (C1454030nwP.LIZIZ(it2.next(), strLIZLLL) && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
            if (i > 1) {
                return false;
            }
        }
        return true;
    }

    public final boolean LLLLLLLLLL(RecyclerView.ViewHolder viewHolder) {
        float f;
        View view;
        int i = C12GK.LLJJJ;
        if (viewHolder != null && (view = viewHolder.itemView) != null) {
            f = C1428310nGv.LIZLLL(view).bottom;
        } else {
            f = 0.0f;
        }
        View view2 = this.LLJJJJ;
        if (view2 == null) {
            view2 = null;
        }
        if (f > C1428310nGv.LIZLLL(view2).top && ((ArrayList) LLLLLL().LLILZ).size() - 1 > i) {
            return true;
        }
        return false;
    }

    public final void LLLLLLLZIL(boolean z) {
        int i;
        View view = this.LLJJJJ;
        C1295960jpS c1295960jpS = null;
        if (view == null) {
            view = null;
        }
        int iIntValue = 0;
        if (view.getVisibility() != 0) {
            View view2 = this.LLJJJJ;
            if (view2 == null) {
                view2 = null;
            }
            C337180DJs.LIZJ(view2);
        }
        LLLLIL().LJIIJ.invoke(Boolean.TRUE);
        if (this.LLLFZ == z) {
            return;
        }
        this.LLLFZ = z;
        View view3 = this.LLJJJJ;
        if (view3 == null) {
            view3 = null;
        }
        Context context = view3.getContext();
        if (z) {
            i = R.attr.zs;
        } else {
            i = R.attr.e5;
        }
        Integer numLIZJ = C1308910kAL.LIZJ(i, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        }
        View view4 = this.LLJJJJ;
        if (view4 == null) {
            view4 = null;
        }
        view4.setBackgroundColor(iIntValue);
        if (z) {
            C1295960jpS c1295960jpS2 = this.LLJJL;
            if (c1295960jpS2 == null) {
                c1295960jpS2 = null;
            }
            c1295960jpS2.setMinAndMaxProgress(0.0f, 0.44615385f);
            C1295960jpS c1295960jpS3 = this.LLJJL;
            if (c1295960jpS3 != null) {
                c1295960jpS = c1295960jpS3;
            }
            c1295960jpS.playAnimation();
            return;
        }
        C1295960jpS c1295960jpS4 = this.LLJJL;
        if (c1295960jpS4 != null) {
            c1295960jpS = c1295960jpS4;
        }
        c1295960jpS.setMinAndMaxProgress(0.0f, 0.0f);
    }

    public final void LLLLLLZ(AICoverInfo aICoverInfo) {
        boolean z;
        AICoverInfo aICoverInfo2;
        Object c098200Yq;
        List<SingleImageData> imageList;
        List<SingleImageData> imageList2;
        InterfaceC19726212Fw interfaceC19726212Fw = this.LLJLLIL;
        if (interfaceC19726212Fw == null) {
            return;
        }
        View view = interfaceC19726212Fw.getView();
        ImageAlbumData imageAlbumData = LLLLLLIL().getImageAlbumData();
        if (this.LLJLLL) {
            if (imageAlbumData != null && (imageList2 = imageAlbumData.getImageList()) != null && !imageList2.isEmpty()) {
                Iterator<SingleImageData> it2 = imageList2.iterator();
                while (it2.hasNext()) {
                    if (it2.next().isAICover()) {
                        C786410Ut5.LJLLLLLL(8, view);
                        return;
                    }
                }
            }
            this.LLJLLL = false;
        }
        if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null && !imageList.isEmpty()) {
            Iterator<SingleImageData> it3 = imageList.iterator();
            while (it3.hasNext()) {
                if (it3.next().isAICover()) {
                    C786410Ut5.LJLLLLLL(8, view);
                    return;
                }
            }
        }
        C786410Ut5.LJLLLLLL(0, view);
        View view2 = interfaceC19726212Fw.getView();
        Object obj = null;
        if (LLLLLLL(imageAlbumData)) {
            view2.setEnabled(true);
            C786410Ut5.T4(view2, 0.4f);
            interfaceC19726212Fw.LIZ(null);
            return;
        }
        if (C1454030nwP.LJFF(LLLLLLIL())) {
            view2.setEnabled(true);
            C786410Ut5.T4(view2, 0.4f);
            interfaceC19726212Fw.LIZ(null);
            return;
        }
        view2.setEnabled(true);
        C786410Ut5.T4(view2, 1.0f);
        if (aICoverInfo != null && aICoverInfo.isConfirmed()) {
            z = true;
            aICoverInfo2 = aICoverInfo;
        } else {
            z = false;
            aICoverInfo2 = null;
        }
        interfaceC19726212Fw.LIZ(aICoverInfo2);
        if (!LLLLLLZZ(z, aICoverInfo)) {
            this.LLJZ = false;
        }
        if (!LLLLLLZZ(z, aICoverInfo) || this.LLJZ) {
            return;
        }
        this.LLJZ = true;
        try {
            c098200Yq = this.mView;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        View view3 = (View) obj;
        if (view3 == null) {
            return;
        }
        HandlerHook.viewPost(view3, new ARunnableS103S0100000_3(this, 36));
    }

    public final void LLLLLZL(int i) {
        C1454040nwQ c1454040nwQ = C1454040nwQ.LIZ;
        VideoPublishEditModel videoPublishEditModelLLLLLLIL = LLLLLLIL();
        c1454040nwQ.getClass();
        C20684815ws.LJIILLIIL("photo_delete_reach_min_popup", C1454040nwQ.LIZJ(videoPublishEditModelLLLLLLIL, "video_edit_page").LIZ);
        String strJ4 = C786410Ut5.j4(getString(2131826404), Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
        C1389890mGx c1389890mGx = new C1389890mGx(this.mView);
        c1389890mGx.LJIIJ(strJ4);
        c1389890mGx.LJIIJJI();
    }

    public final void LLLLZIL(Function1<? super Boolean, Unit> function1) {
        C1461820o8y c1461820o8y = this.LLLII;
        VideoPublishEditModel videoPublishEditModelLLLLLLIL = LLLLLLIL();
        c1461820o8y.getClass();
        if (C1461820o8y.LIZ(videoPublishEditModelLLLLLLIL)) {
            C1397580mTM c1397580mTM = new C1397580mTM(requireSceneContext());
            c1397580mTM.LIZ(2131826405);
            C985403tE.LIZ(c1397580mTM, new AwS582S0100000_3(function1, (Function1<? super Boolean, Unit>) 41));
            c1397580mTM.LJIIIIZZ = false;
            new C1397510mTF(c1397580mTM).LIZLLL();
            this.LLLII.getClass();
            C1461820o8y.LIZIZ.storeBoolean("discard_dialog_has_shown", true);
            return;
        }
        function1.invoke(Boolean.TRUE);
    }

    public final void LLLLZLL(boolean z) {
        boolean z2 = false;
        TuxIconView tuxIconView = null;
        if (C1441980ncy.LIZIZ(LLLLLLIL())) {
            if (!z) {
                TuxIconView tuxIconView2 = this.LLJJJJLIIL;
                if (tuxIconView2 == null) {
                    tuxIconView2 = null;
                }
                if (tuxIconView2.getVisibility() == 0) {
                    z2 = true;
                }
            }
            boolean z3 = !this.LLLIIII;
            if (z) {
                C337180DJs.LIZJ(LLLLLJLJLL());
                TuxIconView tuxIconView3 = this.LLJJJJJIL;
                if (tuxIconView3 == null) {
                    tuxIconView3 = null;
                }
                C337180DJs.LIZ(tuxIconView3);
                if (z3) {
                    TuxIconView tuxIconView4 = this.LLJJJJLIIL;
                    if (tuxIconView4 != null) {
                        tuxIconView = tuxIconView4;
                    }
                    C337180DJs.LIZJ(tuxIconView);
                }
                if (!z2) {
                    return;
                }
            } else {
                C337180DJs.LIZIZ(LLLLLJLJLL());
                if (!z2) {
                    return;
                }
                TuxIconView tuxIconView5 = this.LLJJJJLIIL;
                if (tuxIconView5 != null) {
                    tuxIconView = tuxIconView5;
                }
                C337180DJs.LIZ(tuxIconView);
            }
            C12WG.LIZLLL(this, new ARunnableS119S0100000_19(this, 72), 800L);
            return;
        }
        if (!z) {
            TuxIconView tuxIconView6 = this.LLJJJJLIIL;
            if (tuxIconView6 == null) {
                tuxIconView6 = null;
            }
            if (tuxIconView6.getVisibility() == 0) {
                z2 = true;
            }
        }
        boolean z4 = !this.LLLIIII;
        if (z) {
            C12C5.LIZLLL(LLLLLJLJLL(), 300L, C418440Gaw.LIZIZ(64), 0.0f, null, new AwS573S0100000_29(this, 134), 24);
            TuxIconView tuxIconView7 = this.LLJJJJJIL;
            if (tuxIconView7 == null) {
                tuxIconView7 = null;
            }
            C337180DJs.LIZ(tuxIconView7);
            if (z4) {
                float fLIZIZ = C418440Gaw.LIZIZ(19);
                TuxIconView tuxIconView8 = this.LLJJJJLIIL;
                if (tuxIconView8 == null) {
                    tuxIconView8 = null;
                }
                C12C5.LIZLLL(tuxIconView8, 300L, fLIZIZ, 0.0f, null, null, 56);
            }
            if (!z2) {
                return;
            }
        } else {
            C12C5.LJ(LLLLLJLJLL(), 300L, C418440Gaw.LIZIZ(64), null, new AwS573S0100000_29(this, 135), 24);
            if (!z2) {
                return;
            }
            TuxIconView tuxIconView9 = this.LLJJJJLIIL;
            if (tuxIconView9 == null) {
                tuxIconView9 = null;
            }
            C12C5.LJ(tuxIconView9, 300L, C418440Gaw.LIZIZ(19), null, new AwS573S0100000_29(this, 136), 24);
        }
        C12WG.LIZLLL(this, new ARunnableS119S0100000_19(this, 71), 800L);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLZLLIL(java.lang.String r6) {
        /*
            r5 = this;
            X.0nwS r4 = X.C1454060nwS.LIZ
            X.0tQB r0 = r5.LLLLILI()
            STATE r0 = r0.LIZ
            X.12G7 r0 = (X.C12G7) r0
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r0.LIZIZ
            X.0nkg r0 = X.C1446760nkg.LIZ
            r0.getClass()
            boolean r0 = X.C1446760nkg.LIZJ()
            java.lang.String r2 = "change_style"
            r1 = 0
            if (r0 == 0) goto L7c
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r6, r2)
            if (r0 == 0) goto L58
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r5.LLLLLLIL()
            com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData r0 = r0.getImageAlbumData()
            boolean r0 = r5.LLLLLLL(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L30:
            r4.getClass()
            X.C1454060nwS.LIZ(r3, r0)
            boolean r0 = X.C1446760nkg.LIZJ()
            if (r0 == 0) goto L7e
            X.12Fw r0 = r5.LLJLLIL
            if (r0 != 0) goto L46
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r6, r2)
            if (r0 == 0) goto L7e
        L46:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r5.LLLLLLIL()
            com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData r0 = r0.getImageAlbumData()
            boolean r0 = r5.LLLLLLL(r0)
            if (r0 == 0) goto L7e
            r5.LLLLLZ()
            return
        L58:
            X.12Fw r0 = r5.LLJLLIL
            if (r0 == 0) goto L7c
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r5.LLLLLLIL()
            com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData r0 = r0.getImageAlbumData()
            boolean r0 = r5.LLLLLLL(r0)
            if (r0 != 0) goto L7a
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r5.LLLLLLIL()
            boolean r0 = X.C1454030nwP.LJFF(r0)
            if (r0 != 0) goto L7a
            r0 = 0
        L75:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L30
        L7a:
            r0 = 1
            goto L75
        L7c:
            r0 = 0
            goto L30
        L7e:
            r5.LLJZ = r1
            boolean r0 = X.C1446760nkg.LIZJ()
            if (r0 == 0) goto L98
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r5.LLLLLLIL()
            com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData r0 = r0.getImageAlbumData()
            boolean r0 = r5.LLLLLLL(r0)
            if (r0 == 0) goto L98
            r5.LLLLLZ()
            return
        L98:
            java.lang.Object r0 = r5.LLLLIL()
            X.0o95 r0 = (X.C1461890o95) r0
            kotlin.jvm.functions.Function2<kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit>, java.lang.String, kotlin.Unit> r2 = r0.LJIILIIL
            kotlin.jvm.internal.AwS608S0100000_29 r1 = new kotlin.jvm.internal.AwS608S0100000_29
            r0 = 120(0x78, float:1.68E-43)
            r1.<init>(r5, r0)
            r2.invoke(r1, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12G1.LLLLZLLIL(java.lang.String):void");
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.12GC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C12G7) obj).LIZLLL;
            }
        }, new AwS608S0100000_29(this, 128));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.12GG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C12G7) obj).LJ;
            }
        }, new AwS608S0100000_29(this, 129));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.12GH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C12G7) obj).LJFF;
            }
        }, new AwS608S0100000_29(this, 130));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.12G4
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C12G7) obj).LJI;
            }
        }, new AwS608S0100000_29(this, 117));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.12G5
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C12G7) obj).LJII;
            }
        }, new AwS608S0100000_29(this, 118));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.12G6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C12G7) obj).LJIIIIZZ;
            }
        }, new AwS608S0100000_29(this, 119));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.12G8
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C12G7) obj).LJIIJ;
            }
        }, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 121));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.12G9
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C12G7) obj).LJIIIZ;
            }
        }, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 122));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.12GA
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C12G7) obj).LJIILJJIL;
            }
        }, new AwS608S0100000_29(this, 123));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.12GB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C12G7) obj).LIZJ;
            }
        }, new AwS608S0100000_29(this, 124));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.12GD
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C12G7) obj).LJIIJJI;
            }
        }, new AwS608S0100000_29(this, 125));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.12GE
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C12G7) obj).LJIIL;
            }
        }, new AwS608S0100000_29(this, 126));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.12GF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C12G7) obj).LJIILIIL;
            }
        }, new AwS608S0100000_29(this, 127));
    }

    public static boolean LLLLLLZZ(boolean z, AICoverInfo aICoverInfo) {
        AICoverItem next;
        if (!z || aICoverInfo == null) {
            return false;
        }
        if (!aICoverInfo.getSkipReorderOnTerminal()) {
            return aICoverInfo.isAllFailed();
        }
        String selectedCoverId = aICoverInfo.getSelectedCoverId();
        if (selectedCoverId == null) {
            return false;
        }
        Iterator<AICoverItem> it2 = aICoverInfo.getCovers().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.getSubTaskId(), selectedCoverId)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        AICoverItem aICoverItem = next;
        if (aICoverItem == null || !aICoverItem.isFinished() || aICoverItem.isReady()) {
            return false;
        }
        return true;
    }

    public final void LLLLLLJ(View view, View view2, TuxTextView tuxTextView) {
        this.LLJLILLLLZIIL = tuxTextView;
        RecyclerView recyclerView = this.LLJJJIL;
        if (recyclerView == null) {
            recyclerView = null;
        }
        C19726412Fy c19726412Fy = new C19726412Fy(view, view2, tuxTextView, recyclerView);
        this.LLJLL = c19726412Fy;
        c19726412Fy.LJFF = LLLLLLIL();
        C337180DJs.LIZJ(view2);
        view2.setOnTouchListener(new View.OnTouchListener() { // from class: X.12GT
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view3, MotionEvent motionEvent) {
                return false;
            }
        });
        c19726412Fy.LJI = (((C497820Jfg.LIZIZ(view2.getContext()) - C12GK.LLJILLL) / 2) - C19726412Fy.LJIIL) - C19726412Fy.LJIILIIL;
        View view3 = c19726412Fy.LIZIZ;
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = c19726412Fy.LJI;
            C786410Ut5.W5(view3, layoutParams);
            c19726412Fy.LIZJ();
            HandlerHook.viewPost(c19726412Fy.LIZLLL, new ARunnableS129S0100000_29(c19726412Fy, 50));
            View view4 = c19726412Fy.LIZ;
            if (view4 != null) {
                HandlerHook.viewPost(view4, new ARunnableS129S0100000_29(c19726412Fy, 49));
            }
            C1454060nwS c1454060nwS = C1454060nwS.LIZ;
            VideoPublishEditModel videoPublishEditModel = LLLLILI().LIZ.LIZIZ;
            c1454060nwS.getClass();
            C1454060nwS.LIZLLL(videoPublishEditModel);
            C19726412Fy c19726412Fy2 = this.LLJLL;
            if (c19726412Fy2 != null) {
                c19726412Fy2.LIZLLL();
            }
            C786410Ut5.I7(new C12Y7(this, 4), tuxTextView);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0203  */
    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.ViewGroup onCreateView(android.view.LayoutInflater r18, android.view.ViewGroup r19, android.os.Bundle r20) {
        /*
            Method dump skipped, instruction units count: 825
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12G1.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.ViewGroup");
    }
}
