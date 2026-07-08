package com.bytedance.android.live.liveinteract.multiguestv3.main.guest.randommatch;

import X.AbstractC948890anf;
import X.C1143680frq;
import X.C1295960jpS;
import X.C16F5;
import X.C16FS;
import X.C20441214yg;
import X.C2188811AlT;
import X.C426750GoL;
import X.C466310IQj;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C934690aQl;
import X.C945370ahz;
import X.C947520alS;
import X.C948850anb;
import X.EnumC948930anj;
import X.InterfaceC1296230jpt;
import Y.AObserverS219S0100000_15;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.randommatch.model.JoinOtherRoomByRandomMatchEvent;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS29S0200100_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS80S0100100_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class RandomMatchFragment extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2HELIOSOzE6emE+KSwiZygmLTY4Zz0yJiEjJCIyPCYkZx0yJiEjJAIyPCYkDz0yLygpJzs=";
    public final DataChannel LLJLLL;
    public final int LLJZ;
    public final RandomMatchGuestViewModel LLJZIJLIL;
    public final Function0<Unit> LLL;
    public final Function0<Unit> LLLF;
    public final AbstractC948890anf LLLFF;
    public AwS559S0100000_15 LLLFFI;
    public View LLLFZ;
    public View LLLI;
    public C16F5 LLLII;
    public C1295960jpS LLLIIII;
    public C16F5 LLLIIIIL;
    public C16F5 LLLIIIL;
    public C466310IQj LLLIIL;
    public EnumC948930anj LLLIILIL;
    public EnumC948930anj LLLIL;
    public C16FS LLLILZ;
    public boolean LLLILZJ;
    public boolean LLLILZLLLI;
    public boolean LLLIZZ;
    public long LLLJ;
    public boolean LLLJIL;
    public AwS29S0200100_15 LLLJL;

    public final void BS() {
        C1295960jpS c1295960jpS;
        try {
            C948850anb value = this.LLJZIJLIL.LLILLJJLI.getValue();
            if ((value != null ? value.LIZ : null) == EnumC948930anj.SUCCESS && C934690aQl.LIZ.LIZJ(uS()) && (c1295960jpS = this.LLLIIII) != null) {
                c1295960jpS.updateBitmap("match_user", C934690aQl.LIZ(uS(), false));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateBitmap error, msg=");
            sbLIZ.append(th.getMessage());
            C20441214yg.LJ("RandomMatchFragment", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void ES() {
        C1295960jpS c1295960jpS;
        try {
            if (!C934690aQl.LIZ.LIZJ("user") || (c1295960jpS = this.LLLIIII) == null) {
                return;
            }
            c1295960jpS.updateBitmap("user", C934690aQl.LIZ("user", false));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateBitmap error, msg=");
            sbLIZ.append(th.getMessage());
            C20441214yg.LJ("RandomMatchFragment", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void FS() {
        /*
            r6 = this;
            android.view.View r2 = r6.LLLI
            int r1 = r6.LLJZ
            r3 = 0
            r5 = 0
            r4 = 1
            if (r1 == r4) goto Lc
            r0 = 2
            if (r1 != r0) goto L16
        Lc:
            X.0anf r1 = r6.LLLFF
            X.0ahz r0 = X.C945370ahz.LIZIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L9d
        L16:
            com.bytedance.android.live.liveinteract.multiguestv3.main.guest.randommatch.RandomMatchGuestViewModel r0 = r6.LLJZIJLIL
            androidx.lifecycle.MutableLiveData<X.0anb> r0 = r0.LLILLJJLI
            java.lang.Object r0 = r0.getValue()
            X.0anb r0 = (X.C948850anb) r0
            if (r0 == 0) goto L9b
            X.0anj r1 = r0.LIZ
        L24:
            X.0anj r0 = X.EnumC948930anj.MATCHING
            if (r1 == r0) goto L9d
            r0 = 1
        L29:
            X.C500260Jjc.LJLJLJ(r2, r0)
            X.16F5 r2 = r6.LLLII
            com.bytedance.android.live.liveinteract.multiguestv3.main.guest.randommatch.RandomMatchGuestViewModel r0 = r6.LLJZIJLIL
            androidx.lifecycle.MutableLiveData<X.0anb> r0 = r0.LLILLJJLI
            java.lang.Object r0 = r0.getValue()
            X.0anb r0 = (X.C948850anb) r0
            if (r0 == 0) goto L3c
            X.0anj r3 = r0.LIZ
        L3c:
            X.0anj r0 = X.EnumC948930anj.MATCHING
            if (r3 != r0) goto L99
            X.0anf r1 = r6.LLLFF
            X.0ahz r0 = X.C945370ahz.LIZIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L99
            r0 = 1
        L4b:
            X.C500260Jjc.LJLJLJ(r2, r0)
            X.16F5 r0 = r6.LLLII
            boolean r0 = X.C500260Jjc.LJJJJIZL(r0)
            java.lang.String r3 = "show"
            java.lang.String r2 = "opy_out"
            if (r0 == 0) goto L75
            boolean r0 = r6.LLLILZLLLI
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.C500260Jjc.LJJIFFI(r0)
            if (r0 == 0) goto L75
            r6.LLLILZJ = r5
            r6.LLLILZLLLI = r4
            java.lang.String r1 = r6.wS()
            X.0anf r0 = r6.LLLFF
            java.lang.String r0 = r0.LIZ
            X.C947520alS.LIZIZ(r1, r2, r3, r0)
        L75:
            android.view.View r0 = r6.LLLI
            boolean r0 = X.C500260Jjc.LJJJJIZL(r0)
            if (r0 == 0) goto L98
            boolean r0 = r6.LLLILZJ
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.C500260Jjc.LJJIFFI(r0)
            if (r0 == 0) goto L98
            r6.LLLILZJ = r4
            r6.LLLILZLLLI = r5
            java.lang.String r1 = r6.wS()
            X.0anf r0 = r6.LLLFF
            java.lang.String r0 = r0.LIZ
            X.C947520alS.LIZIZ(r1, r2, r3, r0)
        L98:
            return
        L99:
            r0 = 0
            goto L4b
        L9b:
            r1 = r3
            goto L24
        L9d:
            r0 = 0
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.guest.randommatch.RandomMatchFragment.FS():void");
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final void nS() {
        Function0<Unit> function0 = this.LLLF;
        if (function0 != null) {
            function0.invoke();
        }
        super.nS();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String wS() {
        /*
            r5 = this;
            com.bytedance.android.live.liveinteract.multiguestv3.main.guest.randommatch.RandomMatchGuestViewModel r0 = r5.LLJZIJLIL
            androidx.lifecycle.MutableLiveData<X.0anb> r0 = r0.LLILLJJLI
            java.lang.Object r0 = r0.getValue()
            X.0anb r0 = (X.C948850anb) r0
            if (r0 == 0) goto L29
            X.0anj r1 = r0.LIZ
        Le:
            X.0anj r0 = X.EnumC948930anj.IDLE
            java.lang.String r4 = "randmatch_apply_auto"
            java.lang.String r3 = "randmatch_click"
            r2 = 2
            if (r1 != r0) goto L1f
            int r1 = r5.LLJZ
            r0 = 1
            if (r1 == r0) goto L1e
            if (r1 != r2) goto L2b
        L1e:
            return r3
        L1f:
            com.bytedance.android.live.liveinteract.multiguestv3.main.guest.randommatch.RandomMatchGuestViewModel r0 = r5.LLJZIJLIL
            int r1 = r0.LLILZ
            if (r1 == r2) goto L1e
            r0 = 3
            if (r1 != r0) goto L2b
            return r3
        L29:
            r1 = 0
            goto Le
        L2b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.guest.randommatch.RandomMatchFragment.wS():java.lang.String");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C466310IQj c466310IQj = this.LLLIIL;
        if (c466310IQj != null) {
            c466310IQj.LIZ();
        }
        this.LLLIIL = null;
        this.LLLJIL = true;
        this.LLLJL = null;
        AwS559S0100000_15 awS559S0100000_15 = this.LLLFFI;
        if (awS559S0100000_15 != null) {
            awS559S0100000_15.invoke();
        }
        C1295960jpS c1295960jpS = this.LLLIIII;
        if (c1295960jpS != null) {
            c1295960jpS.cancelAnimation();
        }
        C1295960jpS c1295960jpS2 = this.LLLIIII;
        if (c1295960jpS2 != null) {
            c1295960jpS2.removeAllLottieOnCompositionLoadedListener();
        }
        C948850anb value = this.LLJZIJLIL.LLILLJJLI.getValue();
        if ((value != null ? value.LIZ : null) == EnumC948930anj.FAIL) {
            this.LLJZIJLIL.zQ2("failToIdleWhenRandomMatchDestroy");
            return;
        }
        C948850anb value2 = this.LLJZIJLIL.LLILLJJLI.getValue();
        if ((value2 != null ? value2.LIZ : null) == EnumC948930anj.SUCCESS) {
            if (!this.LLLIZZ) {
                C948850anb value3 = this.LLJZIJLIL.LLILLJJLI.getValue();
                C947520alS.LIZ(C500260Jjc.LJJJI(value3 != null ? Boolean.valueOf(value3.LJI) : null) ? "randmatch_apply_refuse" : "randmatch_invite_refuse");
            }
            this.LLJZIJLIL.zQ2("successToIdleWhenRandomMatchDestroy");
        }
    }

    public final String uS() {
        User user;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("match_user_");
        C948850anb value = this.LLJZIJLIL.LLILLJJLI.getValue();
        sbLIZ.append((value == null || (user = value.LJ) == null) ? null : Long.valueOf(user.getId()));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void zS(RandomMatchFragment randomMatchFragment) {
        EnumC948930anj enumC948930anj;
        C948850anb value = randomMatchFragment.LLJZIJLIL.LLILLJJLI.getValue();
        if (value != null) {
            enumC948930anj = value.LIZ;
        } else {
            enumC948930anj = null;
        }
        if (enumC948930anj != EnumC948930anj.MATCHING) {
            return;
        }
        randomMatchFragment.yS("live_mg_random_matching_loading.zip", new AwS559S0100000_15(randomMatchFragment, 268));
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(0, null);
        sheetOptions.draggable = false;
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void x1(int i) {
        if (i == 2) {
            C947520alS.LIZIZ(wS(), "opy_out", "click", this.LLLFF.LIZ);
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Boolean boolValueOf;
        super.onViewCreated(view, bundle);
        this.LLLFZ = view.findViewById(R.id.sq0);
        this.LLLI = view.findViewById(R.id.spv);
        this.LLLII = (C16F5) view.findViewById(R.id.spy);
        this.LLLIIII = (C1295960jpS) view.findViewById(R.id.spz);
        Context context = getContext();
        if (context != null) {
            boolValueOf = Boolean.valueOf(C426750GoL.LIZLLL(context));
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            C1295960jpS c1295960jpS = this.LLLIIII;
            if (c1295960jpS != null) {
                C786410Ut5.Wb(c1295960jpS, -1.0f);
            }
        } else {
            C1295960jpS c1295960jpS2 = this.LLLIIII;
            if (c1295960jpS2 != null) {
                C786410Ut5.Wb(c1295960jpS2, 1.0f);
            }
        }
        this.LLLIIIIL = (C16F5) view.findViewById(R.id.sq1);
        this.LLLIIIL = (C16F5) view.findViewById(R.id.spx);
        C16FS c16fs = (C16FS) view.findViewById(R.id.spu);
        this.LLLILZ = c16fs;
        if (c16fs != null) {
            C500260Jjc.LJLIIIL(500L, c16fs, new AwS594S0100000_15(this, 323));
        }
        C1295960jpS c1295960jpS3 = this.LLLIIII;
        if (c1295960jpS3 != null) {
            c1295960jpS3.removeAllLottieOnCompositionLoadedListener();
        }
        C1295960jpS c1295960jpS4 = this.LLLIIII;
        if (c1295960jpS4 != null) {
            c1295960jpS4.addLottieOnCompositionLoadedListener(new InterfaceC1296230jpt() { // from class: X.0anr
                @Override // X.InterfaceC1296230jpt
                public final void LIZ(C1294720jnS c1294720jnS) {
                    this.LL.ES();
                    this.LL.BS();
                }
            });
        }
        View view2 = this.LLLFZ;
        if (view2 != null) {
            int i = this.LLJZ;
            boolean z = true;
            if ((i != 1 && i != 2) || !Intrinsics.LJFF(this.LLLFF, C945370ahz.LIZIZ)) {
                z = false;
            }
            C500260Jjc.LJLJLJ(view2, z);
        }
        if (C500260Jjc.LJJJJIZL(this.LLLFZ)) {
            C947520alS.LIZIZ(wS(), "back", "show", this.LLLFF.LIZ);
        }
        FS();
        View view3 = this.LLLFZ;
        if (view3 != null) {
            C500260Jjc.LJLIIIL(500L, view3, new AwS594S0100000_15(this, 324));
        }
        View view4 = this.LLLI;
        if (view4 != null) {
            C500260Jjc.LJLIIIL(500L, view4, new AwS594S0100000_15(this, 325));
        }
        C16F5 c16f5 = this.LLLII;
        if (c16f5 != null) {
            C500260Jjc.LJLIIIL(500L, c16f5, new AwS594S0100000_15(this, 326));
        }
        this.LLJZIJLIL.LLILLJJLI.observe(this, new AObserverS219S0100000_15(this, 13));
        this.LLJLLL.BQ2(this, JoinOtherRoomByRandomMatchEvent.class, new AwS594S0100000_15(this, 327));
    }

    public final void yS(String str, Function0<Unit> function0) {
        User user;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadResource geckoFileName=");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ("RandomMatchFragment", C2188811AlT.LIZIZ(sbLIZ));
        long j = this.LLLJ + 1;
        this.LLLJ = j;
        this.LLLJL = new AwS29S0200100_15(this, (RandomMatchFragment) function0, (Function0<Unit>) j, 0L);
        EnumC948930anj enumC948930anj = null;
        C1143680frq.LJIILIIL(this.LLLIIII, "tiktok_live_interaction_normal_3", str, "images", false, null, Boolean.FALSE, null, new WeakReference(this.LLLJL));
        C948850anb value = this.LLJZIJLIL.LLILLJJLI.getValue();
        ImageModel avatarThumb = null;
        if (value != null) {
            enumC948930anj = value.LIZ;
        }
        if (enumC948930anj == EnumC948930anj.SUCCESS) {
            C948850anb value2 = this.LLJZIJLIL.LLILLJJLI.getValue();
            if (value2 != null && (user = value2.LJ) != null) {
                avatarThumb = user.getAvatarThumb();
            }
            C934690aQl.LJFF(avatarThumb, uS(), 240.0f, false, C497740JfY.LJJ(), new AwS80S0100100_15(j, this, 0));
        }
        C934690aQl.LJFF(UserService.getInstance().user().LJIJJLI().getAvatarThumb(), "user", 180.0f, false, C497740JfY.LJJ(), new AwS80S0100100_15(j, this, 1));
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.hbe, viewGroup, false);
    }

    public RandomMatchFragment(DataChannel dataChannel, int i, RandomMatchGuestViewModel randomMatchGuestViewModel, Function0<Unit> function0, Function0<Unit> function02, AbstractC948890anf abstractC948890anf) {
        this.LLJLLL = dataChannel;
        this.LLJZ = i;
        this.LLJZIJLIL = randomMatchGuestViewModel;
        this.LLL = function0;
        this.LLLF = function02;
        this.LLLFF = abstractC948890anf;
    }
}
