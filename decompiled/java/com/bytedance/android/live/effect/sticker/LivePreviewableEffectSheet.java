package com.bytedance.android.live.effect.sticker;

import X.AnonymousClass0956;
import X.C011Z;
import X.C0DXR;
import X.C0PEM;
import X.C0U60;
import X.C0U9M;
import X.C1119170fEJ;
import X.C1DFB;
import X.C23250099c;
import X.C399801gy;
import X.C417850GZz;
import X.C475510Ikn;
import X.C497740JfY;
import X.C500260Jjc;
import X.C760340Ts8;
import X.C768540UCu;
import X.C768560UCw;
import X.C786410Ut5;
import X.EnumC768480UCo;
import X.InterfaceC768500UCq;
import X.InterfaceC768510UCr;
import X.InterfaceC768520UCs;
import Y.ACListenerS147S0100000_12;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS626S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class LivePreviewableEffectSheet extends LiveSheetFragment implements InterfaceC768520UCs {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiLCk1LSY4ZzHELIOSwnISYnLD19BCw6LB8hLTMlLDgyKikpDCk1LSY4Gic2LTE=";
    public String LLJLLL = "";
    public String LLJZ = "";
    public String LLJZIJLIL = "";
    public String LLL = "";
    public String LLLF = "";
    public C768560UCw LLLFF;
    public FrameLayout LLLFFI;
    public SurfaceView LLLFZ;
    public RecyclerView LLLI;
    public C0U9M LLLII;
    public StickerEffectViewModel LLLIIII;
    public InterfaceC768500UCq LLLIIIIL;
    public InterfaceC768510UCr LLLIIIL;

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final Fragment getFragment() {
        return this;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LIZ(this.LLJLLL);
        c1119170fEJ.LIZIZ = this.LLJZ;
        c1119170fEJ.LJIIIIZZ = null;
        c1119170fEJ.LJIIIZ = null;
        c1119170fEJ.LJIIJ = -1;
        c1119170fEJ.LJ = Collections.singletonList(WR(new ACListenerS147S0100000_12(this, 55)));
        return c1119170fEJ;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        StickerEffectViewModel stickerEffectViewModel = this.LLLIIII;
        if (stickerEffectViewModel != null) {
            stickerEffectViewModel.SQ2(new C399801gy(this.LLJZIJLIL, this.LLL));
        }
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, X.InterfaceC513210KAt
    public final int getThemeOverlay(Context context) {
        return C011Z.LIZ.LJIIIZ();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.isHeaderHidden = false;
        sheetOptions.LIZ(2, null);
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.LLJLLL = arguments.getString("title", "");
            this.LLJZ = arguments.getString("subtitle", "");
            this.LLJZIJLIL = arguments.getString("panel", "");
            this.LLL = arguments.getString("tab", "");
            this.LLLF = arguments.getString("res_id", "");
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void x1(int i) {
        EnumC768480UCo enumC768480UCo;
        C768560UCw c768560UCw = this.LLLFF;
        if (c768560UCw != null) {
            c768560UCw.LIZ();
        }
        InterfaceC768500UCq interfaceC768500UCq = this.LLLIIIIL;
        if (interfaceC768500UCq != null) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        enumC768480UCo = EnumC768480UCo.DISMISS_CAUSE_CLICK_UNKNOWN;
                    } else {
                        enumC768480UCo = EnumC768480UCo.DISMISS_CAUSE_CLICK_BACK;
                    }
                } else {
                    enumC768480UCo = EnumC768480UCo.DISMISS_CAUSE_CLICK_OUTSIDE;
                }
            } else {
                enumC768480UCo = EnumC768480UCo.DISMISS_CAUSE_CLICK_SAVE;
            }
            interfaceC768500UCq.LIZ(enumC768480UCo);
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        AnonymousClass0956 anonymousClass0956;
        AnonymousClass0956 anonymousClass0956LJJJJJ;
        super.onViewCreated(view, bundle);
        this.LLLFFI = (FrameLayout) view.findViewById(R.id.ylr);
        this.LLLFZ = (SurfaceView) view.findViewById(R.id.ylq);
        C768560UCw c768560UCw = new C768560UCw(this.LLLFFI, this.LLLFZ);
        this.LLLFF = c768560UCw;
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AwS556S0100000_12 awS556S0100000_12 = new AwS556S0100000_12(this, 58);
        if (c768560UCw.LIZJ == null && ((anonymousClass0956 = c768560UCw.LIZLLL) == null || !anonymousClass0956.isActive())) {
            if (viewLifecycleOwner != null) {
                anonymousClass0956LJJJJJ = C500260Jjc.LJJJJJ(viewLifecycleOwner, C0PEM.LIZ, new C768540UCu(c768560UCw, awS556S0100000_12, null), 2);
            } else {
                anonymousClass0956LJJJJJ = null;
            }
            c768560UCw.LIZLLL = anonymousClass0956LJJJJJ;
        }
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.w6u);
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
            recyclerView.addItemDecoration(new C0DXR() { // from class: X.0GhO
                public static final int LL = (int) C497740JfY.LIZIZ(5.0f);
                public static final int LLILLJJLI = (int) C497740JfY.LIZIZ(3.0f);

                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView2, C21673919s1 c21673919s1) {
                    int i = LL;
                    rect.left = i;
                    rect.right = i;
                    int i2 = LLILLJJLI;
                    rect.top = i2;
                    rect.bottom = i2;
                }
            });
        } else {
            recyclerView = null;
        }
        this.LLLI = recyclerView;
        FrameLayout frameLayout = this.LLLFFI;
        if (frameLayout != null) {
            C417850GZz.LIZ((int) C497740JfY.LIZIZ(8.0f), frameLayout);
        }
        View viewFindViewById = view.findViewById(R.id.d_m);
        if (viewFindViewById != null) {
            C500260Jjc.LJLIIIL(500L, viewFindViewById, new AwS591S0100000_12(this, 99));
        }
        StickerEffectViewModel stickerEffectViewModelLIZ = C0U60.LIZ();
        this.LLLIIII = stickerEffectViewModelLIZ;
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner());
        C1DFB c1dfb = C0PEM.LIZJ;
        C23250099c.LIZLLL(lifecycleScope, c1dfb, null, new C760340Ts8(this, null), 2);
        C0U9M c0u9m = new C0U9M(C475510Ikn.LJ(this), stickerEffectViewModelLIZ, this.LLLFF);
        c0u9m.LLIZ = new AwS626S0100000_12(this, 6);
        this.LLLII = c0u9m;
        RecyclerView recyclerView2 = this.LLLI;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(c0u9m);
        }
        View viewFindViewById2 = view.findViewById(R.id.cuk);
        if (viewFindViewById2 != null) {
            C786410Ut5.I7(new ACListenerS147S0100000_12(this, 56), viewFindViewById2);
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), c1dfb, null, new C760340Ts8(this, null), 2);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.g3g, viewGroup, false);
    }
}
