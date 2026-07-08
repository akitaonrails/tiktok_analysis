package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.creative.model.stickers.PovItemInfo;
import com.ss.android.ugc.aweme.shortvideo.model.ShortVideoCommonParams;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: renamed from: X.0n5Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1421180n5Q extends AbstractC1664490tPr<C1421230n5V, C1421210n5T> {
    public ViewGroup LLJJJIL;
    public C1421110n5J LLJJJJ;
    public final Set<String> LLJJJJJIL = new LinkedHashSet();
    public final C1466910oHB LLJJJJLIIL = new C1466910oHB(this, 5);

    @Override // X.AbstractC1664490tPr
    public final void onHide() {
        View view;
        C1421110n5J c1421110n5J = this.LLJJJJ;
        if (c1421110n5J != null && (view = c1421110n5J.LLIZLLLIL) != null && view.getVisibility() == 0) {
            c1421110n5J.LIZ();
        }
        C1447800nmM.LIZIZ(this).LLLLLLLZIL(this.LLJJJJLIIL);
    }

    @Override // X.AbstractC1664490tPr
    public final void onShow() {
        C1447800nmM.LIZIZ(this).LLLIILIL(this, this.LLJJJJLIIL);
    }

    public static List LLLLLJIL(List list) {
        boolean zBooleanValue;
        ArrayList<PovItemInfo> arrayList = new ArrayList();
        for (Object obj : list) {
            if (C1533950q1J.LJ(((PovItemInfo) obj).getText())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        for (PovItemInfo povItemInfo : arrayList) {
            String text = povItemInfo.getText();
            if (text == null) {
                text = "";
            }
            Boolean boolIsStar = povItemInfo.isStar();
            if (boolIsStar != null) {
                zBooleanValue = boolIsStar.booleanValue();
            } else {
                zBooleanValue = false;
            }
            arrayList2.add(new C1421170n5P(text, zBooleanValue));
        }
        return arrayList2;
    }

    public final void LLLLLJLJLL(String str) {
        if (!this.LLJJJJJIL.contains(str)) {
            C1421570n63 c1421570n63 = C1421570n63.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mob pov text:");
            sbLIZ.append(str);
            C201955140j.LIZJ(c1421570n63, C2188811AlT.LIZIZ(sbLIZ));
            this.LLJJJJJIL.add(str);
            ShortVideoCommonParams shortVideoCommonParams = (ShortVideoCommonParams) LLLLILI().LIZ(new C2217381BqS() { // from class: X.0n5c
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1421230n5V) obj).LIZLLL;
                }
            }).LIZJ();
            if (shortVideoCommonParams != null) {
                C1421430n5p.LIZ.getClass();
                C0LAB c0lab = new C0LAB();
                c0lab.LJ("enter_from", "video_edit_page");
                c0lab.LJ("shoot_way", shortVideoCommonParams.shootWay);
                c0lab.LJ("creation_id", shortVideoCommonParams.creationId);
                c0lab.LJ("content_source", shortVideoCommonParams.contentSource);
                c0lab.LJ("content_type", shortVideoCommonParams.contentType);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("POV: ");
                sbLIZ2.append(str);
                c0lab.LJ("pov_text", C2188811AlT.LIZIZ(sbLIZ2));
                C20684815ws.LJIILLIIL("pov_panel_text_show", c0lab.LIZ);
            }
        }
    }

    public final void LLLLLL(boolean z) {
        ShortVideoCommonParams shortVideoCommonParams = (ShortVideoCommonParams) LLLLILI().LIZ(new C2217381BqS() { // from class: X.0n5b
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1421230n5V) obj).LIZLLL;
            }
        }).LIZJ();
        if (shortVideoCommonParams != null) {
            C1421430n5p.LIZ.getClass();
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("enter_from", "video_edit_page");
            c0lab.LJ("shoot_way", shortVideoCommonParams.shootWay);
            c0lab.LJ("creation_id", shortVideoCommonParams.creationId);
            c0lab.LJ("content_source", shortVideoCommonParams.contentSource);
            c0lab.LJ("content_type", shortVideoCommonParams.contentType);
            c0lab.LIZ(z ? 1 : 0, "is_pov_chosen");
            C20684815ws.LJIILLIIL("pov_panel_save", c0lab.LIZ);
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.LLJJJJ = (C1421110n5J) requireViewById(R.id.rmr);
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0n5U
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1421230n5V) obj).LIZ);
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(this, 516));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0n5X
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1421230n5V) obj).LIZIZ;
            }
        }, new AwS601S0100000_22(this, 517));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0n5W
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1421230n5V) obj).LIZJ;
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(this, 518));
        C1421110n5J c1421110n5J = this.LLJJJJ;
        if (c1421110n5J != null) {
            c1421110n5J.setPovPanelClickListener(new InterfaceC1421120n5K() { // from class: X.0n5R
                @Override // X.InterfaceC1421120n5K
                public final void LIZJ() {
                    this.LIZ.LLLLIL().LJFF.invoke();
                }

                @Override // X.InterfaceC1421120n5K
                public final void LJFF() {
                    this.LIZ.LLLLIL().LJI.invoke();
                    ShortVideoCommonParams shortVideoCommonParams = (ShortVideoCommonParams) this.LIZ.LLLLILI().LIZ(new C2217381BqS() { // from class: X.0n5Z
                        @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                        public final Object get(Object obj) {
                            return ((C1421230n5V) obj).LIZLLL;
                        }
                    }).LIZJ();
                    if (shortVideoCommonParams != null) {
                        C1421430n5p.LIZ.getClass();
                        C0LAB c0lab = new C0LAB();
                        c0lab.LJ("enter_from", "video_edit_page");
                        c0lab.LJ("shoot_way", shortVideoCommonParams.shootWay);
                        c0lab.LJ("creation_id", shortVideoCommonParams.creationId);
                        c0lab.LJ("content_source", shortVideoCommonParams.contentSource);
                        c0lab.LJ("content_type", shortVideoCommonParams.contentType);
                        C20684815ws.LJIILLIIL("pov_panel_load_more", c0lab.LIZ);
                    }
                }

                @Override // X.InterfaceC1421120n5K
                public final void LIZ(boolean z) {
                    this.LIZ.LLLLLL(z);
                    this.LIZ.LLLLIL().LJ.invoke(Boolean.valueOf(z));
                }

                @Override // X.InterfaceC1421120n5K
                public final void LIZIZ(boolean z) {
                    ShortVideoCommonParams shortVideoCommonParams = (ShortVideoCommonParams) this.LIZ.LLLLILI().LIZ(new C2217381BqS() { // from class: X.0n5Y
                        @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                        public final Object get(Object obj) {
                            return ((C1421230n5V) obj).LIZLLL;
                        }
                    }).LIZJ();
                    if (shortVideoCommonParams != null) {
                        C1421430n5p.LIZ.getClass();
                        C0LAB c0lab = new C0LAB();
                        c0lab.LJ("enter_from", "video_edit_page");
                        c0lab.LJ("shoot_way", shortVideoCommonParams.shootWay);
                        c0lab.LJ("creation_id", shortVideoCommonParams.creationId);
                        c0lab.LJ("content_source", shortVideoCommonParams.contentSource);
                        c0lab.LJ("content_type", shortVideoCommonParams.contentType);
                        c0lab.LIZ(z ? 1 : 0, "is_pov_chosen");
                        C20684815ws.LJIILLIIL("pov_panel_cancel", c0lab.LIZ);
                    }
                    this.LIZ.LLLLIL().LIZLLL.invoke(Boolean.valueOf(z));
                }

                @Override // X.InterfaceC1421120n5K
                public final void LIZLLL(boolean z) {
                    this.LIZ.LLLLLL(z);
                    this.LIZ.LLLLIL().LIZIZ.invoke(Boolean.valueOf(z));
                }

                @Override // X.InterfaceC1421120n5K
                public final void LJ(String str, boolean z) {
                    this.LIZ.LLLLLJLJLL(str);
                }

                @Override // X.InterfaceC1421120n5K
                public final void LJI(String str, boolean z) {
                    String str2;
                    String str3;
                    Function1<String, Unit> function1 = this.LIZ.LLLLIL().LIZJ;
                    if (z) {
                        str2 = str;
                    } else {
                        str2 = "";
                    }
                    function1.invoke(str2);
                    ShortVideoCommonParams shortVideoCommonParams = (ShortVideoCommonParams) this.LIZ.LLLLILI().LIZ(new C2217381BqS() { // from class: X.0n5a
                        @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                        public final Object get(Object obj) {
                            return ((C1421230n5V) obj).LIZLLL;
                        }
                    }).LIZJ();
                    if (shortVideoCommonParams != null) {
                        C1421430n5p c1421430n5p = C1421430n5p.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("POV: ");
                        sbLIZ.append(str);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        c1421430n5p.getClass();
                        C0LAB c0lab = new C0LAB();
                        c0lab.LJ("enter_from", "video_edit_page");
                        c0lab.LJ("shoot_way", shortVideoCommonParams.shootWay);
                        c0lab.LJ("creation_id", shortVideoCommonParams.creationId);
                        c0lab.LJ("content_source", shortVideoCommonParams.contentSource);
                        c0lab.LJ("content_type", shortVideoCommonParams.contentType);
                        c0lab.LJ("pov_text", strLIZIZ);
                        if (z) {
                            str3 = "on";
                        } else {
                            str3 = "off";
                        }
                        c0lab.LJ("to_status", str3);
                        C20684815ws.LJIILLIIL("pov_panel_text_click", c0lab.LIZ);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.eom, viewGroup, false);
        this.LLJJJIL = viewGroup2;
        return viewGroup2;
    }
}
