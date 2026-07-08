package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxPageViewModel;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0M14, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M14 implements C0M1L {
    public FrameLayout LIZ;
    public DraftBoxPageViewModel LIZIZ;
    public C0M17 LIZJ;
    public boolean LIZLLL;

    public final void LIZIZ() {
        ViewParent parent;
        ViewGroup viewGroup;
        this.LIZLLL = false;
        FrameLayout frameLayout = this.LIZ;
        if (frameLayout != null && (parent = frameLayout.getParent()) != null && (parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            C786410Ut5.LJLZ(8, viewGroup);
        }
        C0M1W.LIZ(C2097608Jq.LJ());
    }

    @Override // X.C0M1L
    public final void onDestroy() {
    }

    public static void LIZJ(String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("from_filter_by", str);
        c2344009Gk.LJIIIIZZ("to_filter_by", str2);
        C20684815ws.LJIILLIIL("draft_apply_filter", c2344009Gk.LIZ);
    }

    @Override // X.C0M1L
    public final void LIZ(View view, DraftBoxPageViewModel draftBoxPageViewModel, InterfaceC561590M0v interfaceC561590M0v) {
        FrameLayout frameLayout;
        Context context;
        FrameLayout frameLayout2;
        if (view instanceof FrameLayout) {
            frameLayout = (FrameLayout) view;
        } else {
            frameLayout = null;
        }
        this.LIZ = frameLayout;
        if (!C306790C0v.LIZ()) {
            LIZIZ();
            return;
        }
        this.LIZIZ = draftBoxPageViewModel;
        if (view != null && (context = view.getContext()) != null) {
            if (this.LIZJ == null) {
                this.LIZJ = new C0M17(context);
            }
            C0M17 c0m17 = this.LIZJ;
            if (c0m17 != null && (frameLayout2 = this.LIZ) != null) {
                frameLayout2.addView(c0m17);
            }
        }
        C0M17 c0m172 = this.LIZJ;
        if (c0m172 != null) {
            c0m172.setFilterSelectListener(new C0M1S() { // from class: X.0M15
                @Override // X.C0M1S
                public final void LIZ(String str, boolean z) {
                    Map<String, Boolean> mapLJ;
                    String str2;
                    String str3;
                    String str4;
                    String str5;
                    MutableLiveData<Map<String, Boolean>> mutableLiveData;
                    C0M17 c0m173 = this.LIZ.LIZJ;
                    if (c0m173 == null || (mapLJ = c0m173.getSelectedFilterTypes()) == null) {
                        mapLJ = C2097608Jq.LJ();
                    }
                    this.LIZ.getClass();
                    C0M1W.LIZ(mapLJ);
                    DraftBoxPageViewModel draftBoxPageViewModel2 = this.LIZ.LIZIZ;
                    if (draftBoxPageViewModel2 != null && (mutableLiveData = draftBoxPageViewModel2.LLJIJIL) != null) {
                        AnonymousClass0880.LIZ(mutableLiveData, mapLJ);
                    }
                    if (Intrinsics.LJFF(str, "filter_type_file_size")) {
                        if (z) {
                            this.LIZ.getClass();
                            C2344009Gk c2344009Gk = new C2344009Gk();
                            c2344009Gk.LJIIIIZZ("from_sort_by", "creation_date_desc");
                            c2344009Gk.LJIIIIZZ("to_sort_by", "size_desc");
                            C20684815ws.LJIILLIIL("draft_apply_sort", c2344009Gk.LIZ);
                        } else {
                            this.LIZ.getClass();
                            C2344009Gk c2344009Gk2 = new C2344009Gk();
                            c2344009Gk2.LJIIIIZZ("from_sort_by", "size_desc");
                            c2344009Gk2.LJIIIIZZ("to_sort_by", "creation_date_desc");
                            C20684815ws.LJIILLIIL("draft_apply_sort", c2344009Gk2.LIZ);
                        }
                    }
                    String str6 = "with_template";
                    String str7 = "no_filter";
                    if (Intrinsics.LJFF(str, "filter_type_effect")) {
                        boolean zLJFF = Intrinsics.LJFF(mapLJ.get("filter_type_template"), Boolean.TRUE);
                        if (z) {
                            if (zLJFF) {
                                str4 = "with_template";
                                str5 = "with_effect,with_template";
                            } else {
                                str4 = "no_filter";
                                str5 = "with_effect";
                            }
                            this.LIZ.getClass();
                            C0M14.LIZJ(str4, str5);
                        } else {
                            if (zLJFF) {
                                str2 = "with_template";
                                str3 = "with_effect,with_template";
                            } else {
                                str2 = "no_filter";
                                str3 = "with_effect";
                            }
                            this.LIZ.getClass();
                            C0M14.LIZJ(str3, str2);
                        }
                    }
                    if (Intrinsics.LJFF(str, "filter_type_template")) {
                        boolean zLJFF2 = Intrinsics.LJFF(mapLJ.get("filter_type_effect"), Boolean.TRUE);
                        if (z) {
                            if (zLJFF2) {
                                str6 = "with_effect,with_template";
                                str7 = "with_effect";
                            }
                            this.LIZ.getClass();
                            C0M14.LIZJ(str7, str6);
                            return;
                        }
                        if (zLJFF2) {
                            str6 = "with_effect,with_template";
                            str7 = "with_effect";
                        }
                        this.LIZ.getClass();
                        C0M14.LIZJ(str6, str7);
                    }
                }
            });
        }
        this.LIZLLL = true;
    }
}
