package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0M17, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M17 extends FrameLayout {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public C0M1S LLILZ;

    private final TuxTextView getBtn1() {
        return (TuxTextView) this.LL.getValue();
    }

    private final TuxTextView getBtn2() {
        return (TuxTextView) this.LLILLJJLI.getValue();
    }

    private final TuxTextView getBtn3() {
        return (TuxTextView) this.LLILLL.getValue();
    }

    public final Map<String, Boolean> getSelectedFilterTypes() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        TuxTextView btn1 = getBtn1();
        linkedHashMap.put("filter_type_file_size", Boolean.valueOf(btn1 != null && LIZIZ(btn1)));
        TuxTextView btn2 = getBtn2();
        linkedHashMap.put("filter_type_effect", Boolean.valueOf(btn2 != null && LIZIZ(btn2)));
        TuxTextView btn3 = getBtn3();
        linkedHashMap.put("filter_type_template", Boolean.valueOf(btn3 != null && LIZIZ(btn3)));
        return linkedHashMap;
    }

    public final void LIZ() {
        TuxTextView btn1 = getBtn1();
        if (btn1 != null) {
            LIZJ(btn1, false);
        }
        TuxTextView btn2 = getBtn2();
        if (btn2 != null) {
            LIZJ(btn2, false);
        }
        TuxTextView btn3 = getBtn3();
        if (btn3 != null) {
            LIZJ(btn3, false);
        }
        setUncheckedBg(getBtn1());
        setUncheckedBg(getBtn2());
        setUncheckedBg(getBtn3());
        C0M1S c0m1s = this.LLILZ;
        if (c0m1s != null) {
            c0m1s.LIZ("filter_type_all_clear", false);
        }
    }

    public C0M17(Context context) {
        super(context, null, 0);
        this.LL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 896));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS552S0100000_8(this, 897));
        this.LLILLL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 898));
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.bnp, this, true);
        setUncheckedBg(getBtn1());
        setUncheckedBg(getBtn2());
        setUncheckedBg(getBtn3());
        final TuxTextView btn1 = getBtn1();
        if (btn1 != null) {
            final String str = "filter_type_file_size";
            C786410Ut5.h9(btn1, new View.OnClickListener() { // from class: X.0M1E
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.LL.getClass();
                    C0M17 c0m17 = this.LL;
                    TuxTextView tuxTextView = btn1;
                    c0m17.getClass();
                    if (C0M17.LIZIZ(tuxTextView)) {
                        C0M17 c0m172 = this.LL;
                        TuxTextView tuxTextView2 = btn1;
                        c0m172.getClass();
                        C0M17.LIZJ(tuxTextView2, false);
                        this.LL.setUncheckedBg(btn1);
                        C0M1S c0m1s = this.LL.LLILZ;
                        if (c0m1s != null) {
                            c0m1s.LIZ(str, false);
                            return;
                        }
                        return;
                    }
                    C0M17 c0m173 = this.LL;
                    TuxTextView tuxTextView3 = btn1;
                    c0m173.getClass();
                    C0M17.LIZJ(tuxTextView3, true);
                    this.LL.setCheckedBg(btn1);
                    C0M1S c0m1s2 = this.LL.LLILZ;
                    if (c0m1s2 == null) {
                        return;
                    }
                    c0m1s2.LIZ(str, true);
                }
            });
        }
        final TuxTextView btn2 = getBtn2();
        if (btn2 != null) {
            final String str2 = "filter_type_effect";
            C786410Ut5.h9(btn2, new View.OnClickListener() { // from class: X.0M1E
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.LL.getClass();
                    C0M17 c0m17 = this.LL;
                    TuxTextView tuxTextView = btn2;
                    c0m17.getClass();
                    if (C0M17.LIZIZ(tuxTextView)) {
                        C0M17 c0m172 = this.LL;
                        TuxTextView tuxTextView2 = btn2;
                        c0m172.getClass();
                        C0M17.LIZJ(tuxTextView2, false);
                        this.LL.setUncheckedBg(btn2);
                        C0M1S c0m1s = this.LL.LLILZ;
                        if (c0m1s != null) {
                            c0m1s.LIZ(str2, false);
                            return;
                        }
                        return;
                    }
                    C0M17 c0m173 = this.LL;
                    TuxTextView tuxTextView3 = btn2;
                    c0m173.getClass();
                    C0M17.LIZJ(tuxTextView3, true);
                    this.LL.setCheckedBg(btn2);
                    C0M1S c0m1s2 = this.LL.LLILZ;
                    if (c0m1s2 == null) {
                        return;
                    }
                    c0m1s2.LIZ(str2, true);
                }
            });
        }
        final TuxTextView btn3 = getBtn3();
        if (btn3 != null) {
            final String str3 = "filter_type_template";
            C786410Ut5.h9(btn3, new View.OnClickListener() { // from class: X.0M1E
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.LL.getClass();
                    C0M17 c0m17 = this.LL;
                    TuxTextView tuxTextView = btn3;
                    c0m17.getClass();
                    if (C0M17.LIZIZ(tuxTextView)) {
                        C0M17 c0m172 = this.LL;
                        TuxTextView tuxTextView2 = btn3;
                        c0m172.getClass();
                        C0M17.LIZJ(tuxTextView2, false);
                        this.LL.setUncheckedBg(btn3);
                        C0M1S c0m1s = this.LL.LLILZ;
                        if (c0m1s != null) {
                            c0m1s.LIZ(str3, false);
                            return;
                        }
                        return;
                    }
                    C0M17 c0m173 = this.LL;
                    TuxTextView tuxTextView3 = btn3;
                    c0m173.getClass();
                    C0M17.LIZJ(tuxTextView3, true);
                    this.LL.setCheckedBg(btn3);
                    C0M1S c0m1s2 = this.LL.LLILZ;
                    if (c0m1s2 == null) {
                        return;
                    }
                    c0m1s2.LIZ(str3, true);
                }
            });
        }
    }

    public static boolean LIZIZ(TuxTextView tuxTextView) {
        Boolean bool;
        Object tag = tuxTextView.getTag(R.id.g68);
        if ((tag instanceof Boolean) && (bool = (Boolean) tag) != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final void setCheckedBg(TuxTextView tuxTextView) {
        int iIntValue;
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZ = C1308910kAL.LIZ(R.attr.j0, getContext());
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(6));
        tuxTextView.setBackground(c384050F3z.LIZ(getContext()));
        Integer numLIZ = C1308910kAL.LIZ(R.attr.j1, getContext());
        if (numLIZ != null) {
            iIntValue = numLIZ.intValue();
        } else {
            iIntValue = 0;
        }
        tuxTextView.setTextColor(iIntValue);
    }

    public final void setFilterSelectListener(C0M1S c0m1s) {
        this.LLILZ = c0m1s;
    }

    public final void setSelectedFilterTypes(Map<String, Boolean> map) {
        Boolean bool = map.get("filter_type_file_size");
        Boolean bool2 = Boolean.TRUE;
        boolean zLJFF = Intrinsics.LJFF(bool, bool2);
        boolean zLJFF2 = Intrinsics.LJFF(map.get("filter_type_effect"), bool2);
        boolean zLJFF3 = Intrinsics.LJFF(map.get("filter_type_template"), bool2);
        TuxTextView btn1 = getBtn1();
        if (btn1 != null) {
            LIZJ(btn1, zLJFF);
            if (zLJFF) {
                setCheckedBg(btn1);
            } else {
                setUncheckedBg(btn1);
            }
        }
        TuxTextView btn2 = getBtn2();
        if (btn2 != null) {
            LIZJ(btn2, zLJFF2);
            if (zLJFF2) {
                setCheckedBg(btn2);
            } else {
                setUncheckedBg(btn2);
            }
        }
        TuxTextView btn3 = getBtn3();
        if (btn3 != null) {
            LIZJ(btn3, zLJFF3);
            if (zLJFF3) {
                setCheckedBg(btn3);
            } else {
                setUncheckedBg(btn3);
            }
        }
    }

    public final void setUncheckedBg(TuxTextView tuxTextView) {
        if (tuxTextView != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZ = C1308910kAL.LIZ(R.attr.a03, getContext());
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(6));
            tuxTextView.setBackground(c384050F3z.LIZ(getContext()));
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, getContext());
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            if (tuxTextView != null) {
                tuxTextView.setTextColor(iIntValue);
            }
        }
    }

    public static void LIZJ(TuxTextView tuxTextView, boolean z) {
        tuxTextView.setTag(R.id.g68, Boolean.valueOf(z));
    }
}
