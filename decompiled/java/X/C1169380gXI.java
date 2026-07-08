package X;

import Y.ACListenerS153S0100000_18;
import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mix.model.MixListResponse;
import com.ss.android.ugc.aweme.mix.model.MixStatisStruct;
import com.ss.android.ugc.aweme.mix.model.MixStruct;
import com.ss.android.ugc.aweme.mix.profile.entry.PlayListNameAddCell;
import com.ss.android.ugc.aweme.mix.profile.entry.PlayListNameCell;
import com.ss.android.ugc.aweme.mix.profile.entry.PlayListShowAllCell;
import com.ss.android.ugc.aweme.mix.profile.entry.PlaylistShowManageCell;
import com.ss.android.ugc.aweme.mix.services.IMixFeedService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS562S0100000_18;
import u4.q0;

/* JADX INFO: renamed from: X.0gXI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1169380gXI extends RecyclerView.ViewHolder implements InterfaceC653650PkR, InterfaceC487330J9f {
    public static int LLJLIL;
    public static boolean LLJLL;
    public static int LLJLLIL;
    public static int LLJLLL;
    public final View LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;
    public final String LLILZ;
    public final InterfaceC1169410gXL LLILZIL;
    public final ArrayList<MixStruct> LLILZLL;
    public String LLIZ;
    public String LLIZLLLIL;
    public final int LLJ;
    public final int LLJI;
    public int LLJIJIL;
    public final InterfaceC625970Ogt LLJILJIL;
    public final ViewOnAttachStateChangeListenerC20604515jv LLJILJILJ;
    public final ConstraintLayout LLJILLL;
    public final TextView LLJJ;
    public final FrameLayout LLJJI;
    public final FrameLayout LLJJIII;
    public final View LLJJIJI;
    public MixListResponse LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public static int LLJJJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
    public static final int LLJJJIL = C341940Daq.LIZ(4.0d);
    public static final int LLJJJJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public static int LLJJJJJIL = C341940Daq.LIZ(40.5d);
    public static final int LLJJJJLIIL = C341940Daq.LIZ(44.5d);
    public static int LLJJL = C341940Daq.LIZ(88.0d);
    public static final int LLJJLIIIJLLLLLLLZ = C341940Daq.LIZ(102.0d);
    public static final int LLJL = C341940Daq.LIZ(82.0d);
    public static boolean LLJLILLLLZIIL = true;
    public static int LLJZ = -1;

    public final List<InterfaceC1891350zJl> I5(List<MixStruct> list) {
        Integer numValueOf;
        String keyWord;
        String searchId;
        String searchResultId;
        String str;
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            try {
                int i = 0;
                for (MixStruct mixStruct : list) {
                    C1169370gXH c1169370gXH = new C1169370gXH(0);
                    c1169370gXH.LL = mixStruct.getIcon();
                    MixStatisStruct statis = mixStruct.getStatis();
                    String searchType = null;
                    if (statis != null) {
                        numValueOf = Integer.valueOf(statis.getTotal());
                    } else {
                        numValueOf = null;
                    }
                    c1169370gXH.LLILLJJLI = numValueOf;
                    c1169370gXH.LLILLL = mixStruct.getMixName();
                    c1169370gXH.LLILZ = mixStruct.mixId;
                    c1169370gXH.LLILZLL = this.LLIZ;
                    c1169370gXH.LLIZ = this.LLIZLLLIL;
                    c1169370gXH.LLJI = this.LLILLL;
                    MixListResponse mixListResponse = this.LLJJIJIIJIL;
                    if (mixListResponse != null) {
                        keyWord = mixListResponse.getKeyWord();
                    } else {
                        keyWord = null;
                    }
                    c1169370gXH.LLJIJIL = keyWord;
                    MixListResponse mixListResponse2 = this.LLJJIJIIJIL;
                    if (mixListResponse2 != null) {
                        searchId = mixListResponse2.getSearchId();
                    } else {
                        searchId = null;
                    }
                    c1169370gXH.LLJILJIL = searchId;
                    MixListResponse mixListResponse3 = this.LLJJIJIIJIL;
                    if (mixListResponse3 != null) {
                        searchResultId = mixListResponse3.getSearchResultId();
                    } else {
                        searchResultId = null;
                    }
                    c1169370gXH.LLJILJILJ = searchResultId;
                    c1169370gXH.LLIZLLLIL = this.LLILZ;
                    if (this.LLILLL) {
                        str = "click_search_card";
                    } else {
                        str = "click_profile_card";
                    }
                    c1169370gXH.LLJ = str;
                    c1169370gXH.LLJJ = mixStruct.getMixLabel();
                    c1169370gXH.LLJJI = this.LLILZIL;
                    MixListResponse mixListResponse4 = this.LLJJIJIIJIL;
                    if (mixListResponse4 != null) {
                        searchType = mixListResponse4.getSearchType();
                    }
                    c1169370gXH.LLJILLL = searchType;
                    boolean z2 = true;
                    if (list.size() <= 5) {
                        if (i == list.size() - 1) {
                            z = true;
                        }
                        z = false;
                    } else if (i == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c1169370gXH.LLJJIII = z;
                    if (i != 0) {
                        z2 = false;
                    }
                    c1169370gXH.LLJJIJI = z2;
                    c1169370gXH.LLJJIJIIJIL = this.LLILLJJLI;
                    i++;
                    arrayList.add(c1169370gXH);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return arrayList;
    }

    public final void L5(int i, Integer num) {
        int iLJIILLIIL;
        int i2;
        if (num == null) {
            L5(i, Integer.valueOf(LLJZ));
            return;
        }
        LLJZ = num.intValue();
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        if (c19252910Tv.LIZLLL().LJI().LLLII() && i == 2) {
            iLJIILLIIL = c19252910Tv.LIZLLL().LJI().LJLLJ(C0SXF.LJIILLIIL(C1388190mED.LIZ(this.LL.getContext())));
        } else {
            iLJIILLIIL = C0SXF.LJIILLIIL(C1388190mED.LIZ(this.LL.getContext()));
        }
        LLJLLL = iLJIILLIIL;
        LLJLLIL = num.intValue() + (this.LLILLJJLI ? 1 : 0);
        if (num.intValue() == 0) {
            return;
        }
        int i3 = (LLJLLL - (LLJJJ * (this.LLILLJJLI ? 1 : 0))) - this.LLJ;
        boolean z = true;
        int iIntValue = num.intValue() - (!this.LLILLJJLI ? 1 : 0);
        if (this.LLILLL) {
            i2 = LLJJJJ;
        } else {
            i2 = LLJJJIL;
        }
        int iIntValue2 = ((i3 - (iIntValue * i2)) - this.LLJI) / num.intValue();
        LLJLIL = iIntValue2;
        if (iIntValue2 <= LLJJL) {
            z = false;
        }
        LLJLILLLLZIIL = z;
        LLJLL = false;
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        int i = LLJZ;
        if (i != -1) {
            L5(configuration.orientation, Integer.valueOf(i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0031 A[PHI: r6
      0x0031: PHI (r6v2 java.util.List<com.ss.android.ugc.aweme.mix.model.MixStruct>) = 
      (r6v1 java.util.List<com.ss.android.ugc.aweme.mix.model.MixStruct>)
      (r6v3 java.util.List<com.ss.android.ugc.aweme.mix.model.MixStruct>)
     binds: [B:17:0x002f, B:12:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC653650PkR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W4(com.ss.android.ugc.aweme.mix.model.MixListResponse r9, java.lang.String r10, java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1169380gXI.W4(com.ss.android.ugc.aweme.mix.model.MixListResponse, java.lang.String, java.lang.String):void");
    }

    public C1169380gXI(View view, boolean z, boolean z2, String str, C653630PkP c653630PkP) {
        float fLIZIZ;
        float fLIZIZ2;
        int iHashCode;
        int iLIZ;
        super(view);
        this.LL = view;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = str;
        this.LLILZIL = c653630PkP;
        this.LLILZLL = new ArrayList<>();
        this.LLIZ = "";
        this.LLIZLLLIL = "";
        if (C268330AfP.LJI()) {
            fLIZIZ = C418440Gaw.LIZIZ(16);
        } else if (z2) {
            fLIZIZ = C418440Gaw.LIZIZ(8);
        } else {
            fLIZIZ = C418440Gaw.LIZIZ(12);
        }
        int iLIZIZ = C814420VxA.LIZIZ(fLIZIZ);
        this.LLJ = iLIZIZ;
        if (C268330AfP.LJI()) {
            fLIZIZ2 = C418440Gaw.LIZIZ(16);
        } else if (z2) {
            fLIZIZ2 = C418440Gaw.LIZIZ(8);
        } else {
            fLIZIZ2 = C418440Gaw.LIZIZ(12);
        }
        this.LLJI = C814420VxA.LIZIZ(fLIZIZ2);
        this.LLJIJIL = 5;
        this.LLJILJIL = C2192401ArG.LIZ(C589170N8x.LIZ("pgc", "playlist"), "profile_page_playlist_manage_icon_description_ttkv_repo");
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.rn0);
        this.LLJILJILJ = viewOnAttachStateChangeListenerC20604515jv;
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.qn3);
        this.LLJILLL = constraintLayout;
        ConstraintLayout constraintLayout2 = (ConstraintLayout) view.findViewById(R.id.qn0);
        TextView textView = (TextView) view.findViewById(R.id.qn2);
        this.LLJJ = textView;
        TextView textView2 = (TextView) view.findViewById(R.id.qmz);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.a0p);
        this.LLJJI = frameLayout;
        FrameLayout frameLayout2 = (FrameLayout) view.findViewById(R.id.jux);
        this.LLJJIII = frameLayout2;
        View viewFindViewById = view.findViewById(R.id.moq);
        this.LLJJIJI = viewFindViewById;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2536));
        this.LLJJIJIL = c01gwLIZIZ;
        Activity activityLIZ = C1388190mED.LIZ(view.getContext());
        if (activityLIZ != null) {
            iHashCode = activityLIZ.hashCode();
        } else {
            iHashCode = -1;
        }
        C487280J9a.LIZ(iHashCode, this);
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(PlayListNameCell.class, PlayListNameAddCell.class, PlayListShowAllCell.class, PlaylistShowManageCell.class);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(view.getContext());
        linearLayoutManager.setOrientation(0);
        viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(linearLayoutManager);
        C786410Ut5.O7(frameLayout2, new ACListenerS153S0100000_18(this, 166));
        q0.LJIJ(frameLayout2, new C20094213jo() { // from class: X.0Jf3
            @Override // X.C20094213jo
            public final void onInitializeAccessibilityNodeInfo(View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setClassName(Button.class.getName());
                accessibilityNodeInfoCompat.setContentDescription(C20642515q3.LJI(2131823301));
            }
        });
        C786410Ut5.O7(frameLayout, new View.OnClickListener() { // from class: X.0gXJ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ((IMixFeedService) ServiceManager.get().getService(IMixFeedService.class)).LIZLLL(false);
                C1440005kM.LIZ(new C2036607yO());
            }
        });
        C786410Ut5.Y7(constraintLayout, new ACListenerS153S0100000_18(this, 167));
        C786410Ut5.Y7(constraintLayout2, new View.OnClickListener() { // from class: X.07wo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SmartRouter.buildRoute(view2.getContext(), "//account/setting").open();
            }
        });
        ImageView imageView = (ImageView) view.findViewById(R.id.a0l);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.h1y);
        Drawable drawable = view.getContext().getResources().getDrawable(R.drawable.d0b);
        drawable.setAutoMirrored(true);
        imageView.setImageDrawable(drawable);
        imageView2.setImageDrawable(drawable);
        viewOnAttachStateChangeListenerC20604515jv.setPaddingRelative(iLIZIZ, 0, 0, 0);
        viewOnAttachStateChangeListenerC20604515jv.addItemDecoration(new C1208650hYd(this, 0));
        textView2.setMaxWidth(C12ES.LJIIJ(view.getContext()) - LLJL);
        textView.setMaxWidth(C12ES.LJIIJ(view.getContext()) - LLJJLIIIJLLLLLLLZ);
        viewOnAttachStateChangeListenerC20604515jv.LJIIL((AbstractC329610Cw3) c01gwLIZIZ.getValue());
        C786410Ut5.LJLLLLLL(8, viewFindViewById);
        if (z2) {
            iLIZ = C341940Daq.LIZ(109.0d);
        } else {
            iLIZ = C341940Daq.LIZ(88.0d);
        }
        LLJJL = iLIZ;
        LLJJJJJIL = C341940Daq.LIZ(40.5d);
    }
}
