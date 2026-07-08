package com.bytedance.android.live.liveinteract.cohost.ui.dialog;

import X.C1602160rnK;
import X.C16F5;
import X.C16FS;
import X.C20744116Fj;
import X.C500980Jkm;
import X.C786410Ut5;
import X.C915980Zwa;
import X.C925600aC6;
import X.C925640aCA;
import X.C955540ayO;
import X.C973660bRc;
import X.C973890bRz;
import X.C974450bSt;
import X.C986950bn3;
import X.EnumC964170bCJ;
import Y.ACListenerS150S0100000_15;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Space;
import android.widget.TextView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes16.dex */
public final class InteractDisconnectDialog extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyHELIOSw8ICo/PWEmIWsoIC4/JyJiACEnLTctKjsXITYvJiE9LSY4DSYyJCor";
    public C16FS LL;
    public C16FS LLILLJJLI;
    public Space LLILLL;
    public C16F5 LLILZ;
    public C16F5 LLILZIL;
    public View LLILZLL;
    public C20744116Fj LLIZ;
    public String LLIZLLLIL;
    public String LLJ;
    public int LLJI;
    public String LLJIJIL;
    public String LLJILJIL;
    public boolean LLJILJILJ;
    public int LLJILLL;
    public Function0<Unit> LLJJ;
    public Function0<Unit> LLJJI;

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final boolean adaptEdgeToEdge() {
        return true;
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    public final C16FS MR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.p4j) : null;
            this.LL = (C16FS) viewFindViewById;
        }
        return (C16FS) viewFindViewById;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.ggf);
        c500980Jkm.LIZJ = R.style.ahb;
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIJ = -2;
        c500980Jkm.LJ = false;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        String str;
        EnumC964170bCJ enumC964170bCJLJLIL;
        super.onViewCreated(view, bundle);
        View viewFindViewById = this.LLILZ;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.tv_title);
            } else {
                viewFindViewById = null;
            }
            this.LLILZ = (C16F5) viewFindViewById;
        }
        ((TextView) viewFindViewById).setText(this.LLIZLLLIL);
        View viewFindViewById3 = this.LLILZIL;
        if (viewFindViewById3 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById3 = view3.findViewById(R.id.zhz);
            } else {
                viewFindViewById3 = null;
            }
            this.LLILZIL = (C16F5) viewFindViewById3;
        }
        ((TextView) viewFindViewById3).setText(this.LLJ);
        boolean z2 = false;
        if (C915980Zwa.LJI().LIZ().LJIILLIIL().LIZ == 1) {
            z = true;
        } else {
            z = false;
        }
        if (!z && this.LLJI == 1) {
            View viewFindViewById4 = this.LLILZLL;
            if (viewFindViewById4 == null) {
                View view4 = getView();
                if (view4 != null) {
                    viewFindViewById4 = view4.findViewById(R.id.view_line);
                } else {
                    viewFindViewById4 = null;
                }
                this.LLILZLL = viewFindViewById4;
            }
            C786410Ut5.LJLLLLLL(0, viewFindViewById4);
            View viewFindViewById5 = this.LLIZ;
            if (viewFindViewById5 == null) {
                View view5 = getView();
                if (view5 != null) {
                    viewFindViewById5 = view5.findViewById(R.id.dji);
                } else {
                    viewFindViewById5 = null;
                }
                this.LLIZ = (C20744116Fj) viewFindViewById5;
            }
            int visibility = viewFindViewById5.getVisibility();
            viewFindViewById5.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, viewFindViewById5);
        } else {
            View viewFindViewById6 = this.LLILZLL;
            if (viewFindViewById6 == null) {
                View view6 = getView();
                if (view6 != null) {
                    viewFindViewById6 = view6.findViewById(R.id.view_line);
                } else {
                    viewFindViewById6 = null;
                }
                this.LLILZLL = viewFindViewById6;
            }
            C786410Ut5.LJLLLLLL(8, viewFindViewById6);
            View viewFindViewById7 = this.LLIZ;
            if (viewFindViewById7 == null) {
                View view7 = getView();
                if (view7 != null) {
                    viewFindViewById7 = view7.findViewById(R.id.dji);
                } else {
                    viewFindViewById7 = null;
                }
                this.LLIZ = (C20744116Fj) viewFindViewById7;
            }
            int visibility2 = viewFindViewById7.getVisibility();
            viewFindViewById7.setVisibility(8);
            C1602160rnK.LIZIZ(visibility2, 8, viewFindViewById7);
        }
        MR().setText(this.LLJILJIL);
        View viewFindViewById8 = this.LLILLJJLI;
        if (viewFindViewById8 == null) {
            View view8 = getView();
            if (view8 != null) {
                viewFindViewById8 = view8.findViewById(R.id.rik);
            } else {
                viewFindViewById8 = null;
            }
            this.LLILLJJLI = (C16FS) viewFindViewById8;
        }
        ((C16FS) viewFindViewById8).setText(this.LLJIJIL);
        C786410Ut5.h8(MR(), new ACListenerS150S0100000_15(this, 29));
        View view9 = this.LLILLJJLI;
        if (view9 == null) {
            View view10 = getView();
            if (view10 != null) {
                viewFindViewById2 = view10.findViewById(R.id.rik);
            }
            this.LLILLJJLI = (C16FS) viewFindViewById2;
            view9 = viewFindViewById2;
        }
        C786410Ut5.h8((C16FS) view9, new ACListenerS150S0100000_15(this, 30));
        C786410Ut5.z7((C20744116Fj) view.findViewById(R.id.dji), new C986950bn3(this, 0));
        HashMap map = new HashMap();
        if (C915980Zwa.LJI().LIZ().LJIILLIIL() == C955540ayO.LIZJ) {
            str = "mutual_follow";
        } else {
            str = "recommend";
        }
        map.put("invitee_list", str);
        C974450bSt c974450bSt = C973890bRz.LIZ;
        if (c974450bSt.LJLIL() != EnumC964170bCJ.NONE) {
            z2 = true;
        }
        if (!z2) {
            map.put("connection_type", "anchor");
        } else {
            map.put("connection_type", "manual_pk");
        }
        C925600aC6.LJJIJLIJ("cancel_connection_popup", map);
        int i = this.LLJI;
        if (i == 3 || i == 2) {
            if (this.LLJILJILJ) {
                enumC964170bCJLJLIL = C973890bRz.LIZIZ.LJLIL();
            } else {
                enumC964170bCJLJLIL = c974450bSt.LJLIL();
            }
            if (enumC964170bCJLJLIL == EnumC964170bCJ.INVITED) {
                boolean z3 = this.LLJILJILJ;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                C925640aCA.LIZIZ(linkedHashMap, z3);
                C925640aCA.LIZLLL(linkedHashMap);
                if (!TextUtils.isEmpty(C915980Zwa.LJI().LJIIJ().LJJIJIIJI())) {
                    linkedHashMap.put("request_from", C915980Zwa.LJI().LJIIJ().LJJIJIIJI());
                }
                C925640aCA.LIZ(linkedHashMap);
                linkedHashMap.put("sub_match_type", "1v1");
                C973660bRc.LJIJ(C973660bRc.LIZ, linkedHashMap, z3, false, false, 12);
                C925640aCA.LJJI("livesdk_pk_invite_withdraw_page_show", linkedHashMap, true);
            }
        }
    }
}
