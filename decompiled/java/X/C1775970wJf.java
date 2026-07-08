package X;

import android.app.Activity;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.comp.api.pcs.ui.form.input.countrylistpage.PcsCountrySelectFragment;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.account.login.ui.MusCountryListActivity;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.address.identity.AddressIdentityAssem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfoOption;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfoPanel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0wJf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1775970wJf implements TextWatcher {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void afterTextChanged$2(C1775970wJf c1775970wJf, Editable editable) {
    }

    public static final void afterTextChanged$3(C1775970wJf c1775970wJf, Editable editable) {
    }

    public static final void beforeTextChanged$0(C1775970wJf c1775970wJf, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$1(C1775970wJf c1775970wJf, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$2(C1775970wJf c1775970wJf, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$3(C1775970wJf c1775970wJf, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$4(C1775970wJf c1775970wJf, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$0(C1775970wJf c1775970wJf, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$1(C1775970wJf c1775970wJf, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$4(C1775970wJf c1775970wJf, CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.$t) {
            case 0:
                afterTextChanged$0(this, editable);
                break;
            case 1:
                afterTextChanged$1(this, editable);
                break;
            case 2:
                afterTextChanged$2(this, editable);
                break;
            case 3:
                afterTextChanged$3(this, editable);
                break;
            case 4:
                afterTextChanged$4(this, editable);
                break;
            case 5:
                afterTextChanged$5(this, editable);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.$t) {
            case 0:
                beforeTextChanged$0(this, charSequence, i, i2, i3);
                break;
            case 1:
                beforeTextChanged$1(this, charSequence, i, i2, i3);
                break;
            case 2:
                beforeTextChanged$2(this, charSequence, i, i2, i3);
                break;
            case 3:
                beforeTextChanged$3(this, charSequence, i, i2, i3);
                break;
            case 4:
                beforeTextChanged$4(this, charSequence, i, i2, i3);
                break;
            case 5:
                beforeTextChanged$5(this, charSequence, i, i2, i3);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.$t) {
            case 0:
                onTextChanged$0(this, charSequence, i, i2, i3);
                break;
            case 1:
                onTextChanged$1(this, charSequence, i, i2, i3);
                break;
            case 2:
                onTextChanged$2(this, charSequence, i, i2, i3);
                break;
            case 3:
                onTextChanged$3(this, charSequence, i, i2, i3);
                break;
            case 4:
                onTextChanged$4(this, charSequence, i, i2, i3);
                break;
            case 5:
                onTextChanged$5(this, charSequence, i, i2, i3);
                break;
        }
    }

    public static final void afterTextChanged$0(C1775970wJf c1775970wJf, Editable editable) {
        String hint;
        C1749190vcT c1749190vcTJo = ((AddressIdentityAssem) c1775970wJf.l0).Jo();
        if (c1749190vcTJo != null) {
            c1749190vcTJo.LJFF(false);
        }
        C1748440vbG c1748440vbG = ((AddressIdentityAssem) c1775970wJf.l0).LLJILLL;
        if (c1748440vbG != null) {
            c1748440vbG.setValidationStatus(0);
        }
        if (editable == null || editable.length() == 0) {
            C1748440vbG c1748440vbG2 = ((AddressIdentityAssem) c1775970wJf.l0).LLJILLL;
            if (c1748440vbG2 != null) {
                if (C0C17.LIZ()) {
                    hint = ((IdentityInfoPanel) c1775970wJf.l1).getPlaceholderText();
                } else {
                    IdentityInfoOption identityInfoOption = ((AddressIdentityAssem) c1775970wJf.l0).LLJJ;
                    if (identityInfoOption == null || (hint = identityInfoOption.getHint()) == null) {
                        hint = "";
                    }
                }
                c1748440vbG2.setPlaceholderText(hint);
            }
            C1748440vbG c1748440vbG3 = ((AddressIdentityAssem) c1775970wJf.l0).LLJILLL;
            if (c1748440vbG3 != null) {
                C1748720vbi.LIZLLL(c1748440vbG3, new C049Y(), new AwS605S0100000_26((AddressIdentityAssem) c1775970wJf.l0, 553));
            }
        }
    }

    public static final void afterTextChanged$1(C1775970wJf c1775970wJf, Editable editable) {
        boolean z;
        AbstractC21673619ry adapter;
        ((ArrayList) ((PcsCountrySelectFragment) c1775970wJf.l0).LLJZ).clear();
        String lowerCase = editable.toString().toLowerCase(Locale.ROOT);
        Iterator it2 = ((ArrayList) ((PcsCountrySelectFragment) c1775970wJf.l0).LLJLLL).iterator();
        while (true) {
            z = false;
            if (!it2.hasNext()) {
                break;
            }
            C1727970v4F c1727970v4F = (C1727970v4F) it2.next();
            if (a0.LJJIIZI(c1727970v4F.LIZ.toLowerCase(Locale.ROOT), lowerCase, false)) {
                ((ArrayList) ((PcsCountrySelectFragment) c1775970wJf.l0).LLJZ).add(c1727970v4F);
            }
        }
        C21630819l4 c21630819l4 = ((PcsCountrySelectFragment) c1775970wJf.l0).LLLFFI;
        if (c21630819l4 != null) {
            if (lowerCase.length() == 0) {
                z = true;
            }
            C500260Jjc.LJLJLJ(c21630819l4, z);
        }
        RecyclerView recyclerView = ((PcsCountrySelectFragment) c1775970wJf.l0).LLLF;
        if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null) {
            adapter.notifyDataSetChanged();
        }
        TuxTextView tuxTextView = (TuxTextView) c1775970wJf.l1;
        if (tuxTextView != null) {
            C500260Jjc.LJLJLJ(tuxTextView, ((ArrayList) ((PcsCountrySelectFragment) c1775970wJf.l0).LLJZ).isEmpty());
        }
    }

    public static final void afterTextChanged$4(C1775970wJf c1775970wJf, Editable editable) {
        if (editable != null) {
            DialogC1738430vL7 dialogC1738430vL7 = (DialogC1738430vL7) c1775970wJf.l0;
            C1748470vbJ c1748470vbJ = (C1748470vbJ) c1775970wJf.l1;
            TuxTextView tuxTextView = dialogC1738430vL7.LLJJJJJIL;
            if (tuxTextView != null) {
                if (editable.length() > 25) {
                    editable.delete(editable.length() - 1, editable.length());
                    c1748470vbJ.LJIILIIL(editable.toString());
                    C420260Gds c420260Gds = dialogC1738430vL7.LLJJI;
                    if (c420260Gds != null) {
                        c420260Gds.LIZ(true);
                    }
                    tuxTextView.setText(C20642515q3.LJI(2131821230));
                    C420260Gds c420260Gds2 = dialogC1738430vL7.LLJJI;
                    if (c420260Gds2 != null) {
                        c420260Gds2.setFooterFieldView(tuxTextView);
                    }
                    tuxTextView.setTextColorRes(R.attr.zs);
                    C786410Ut5.LLLLZLL(tuxTextView, 0);
                    c1748470vbJ.getEditText().setSelection(editable.length());
                } else if (editable.length() <= 2) {
                    Activity activityLIZ = C0FNT.LIZ(c1748470vbJ.getContext());
                    if (activityLIZ != null) {
                        C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                        c1389890mGx.LJIIIZ(2131826530);
                        c1389890mGx.LJIIJJI();
                    }
                    TuxNavBar tuxNavBar = (TuxNavBar) dialogC1738430vL7.findViewById(R.id.gpn);
                    if (tuxNavBar != null) {
                        C0OM1 c0om1 = new C0OM1();
                        C1250250idj c1250250idj = new C1250250idj();
                        c1250250idj.LIZJ = C20642515q3.LJI(2131833194);
                        c0om1.LIZJ = c1250250idj;
                        C1251150ifB c1251150ifB = new C1251150ifB();
                        C419910GdJ c419910GdJ = new C419910GdJ();
                        c419910GdJ.LIZ = R.raw.icon_tick_fill_small;
                        c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
                        c1251150ifB.LIZLLL();
                        c1251150ifB.LJ = c419910GdJ;
                        c1251150ifB.LIZLLL = false;
                        c0om1.LIZIZ(c1251150ifB);
                        c0om1.LIZLLL = true;
                        tuxNavBar.setNavActions(c0om1);
                    }
                } else {
                    dialogC1738430vL7.LJLI();
                    C420260Gds c420260Gds3 = dialogC1738430vL7.LLJJI;
                    if (c420260Gds3 != null) {
                        c420260Gds3.LIZ(false);
                    }
                    C786410Ut5.LLLLZLL(tuxTextView, 8);
                }
                dialogC1738430vL7.LLJJIJIIJIL = editable.toString();
            }
        }
    }

    public static final void afterTextChanged$5(C1775970wJf c1775970wJf, Editable editable) {
        String strLIZ;
        if (((C1748440vbG) c1775970wJf.l0).LLLIIIL != null) {
            String strValueOf = String.valueOf(editable);
            ((C1748440vbG) c1775970wJf.l0).getClass();
            strLIZ = C823380WRs.LIZ(strValueOf);
        } else {
            strLIZ = "";
        }
        ((TextWatcher) c1775970wJf.l1).afterTextChanged(new SpannableStringBuilder(strLIZ));
    }

    public C1775970wJf(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void beforeTextChanged$5(C1775970wJf c1775970wJf, CharSequence charSequence, int i, int i2, int i3) {
        String strLIZ;
        if (((C1748440vbG) c1775970wJf.l0).LLLIIIL != null) {
            String strValueOf = String.valueOf(charSequence);
            ((C1748440vbG) c1775970wJf.l0).getClass();
            strLIZ = C823380WRs.LIZ(strValueOf);
        } else {
            strLIZ = null;
        }
        ((TextWatcher) c1775970wJf.l1).beforeTextChanged(strLIZ, i, i2, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onTextChanged$2(X.C1775970wJf r17, java.lang.CharSequence r18, int r19, int r20, int r21) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1775970wJf.onTextChanged$2(X.0wJf, java.lang.CharSequence, int, int, int):void");
    }

    public static final void onTextChanged$3(C1775970wJf c1775970wJf, CharSequence charSequence, int i, int i2, int i3) {
        String str;
        int i4;
        ((MusCountryListActivity) c1775970wJf.l1).LLILZ.clear();
        String lowerCase = charSequence.toString().toLowerCase();
        MusCountryListActivity musCountryListActivity = (MusCountryListActivity) c1775970wJf.l1;
        musCountryListActivity.getClass();
        char[] charArray = lowerCase.toCharArray();
        int length = charArray.length;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i6 < length) {
                if (Character.isDigit(charArray[i6])) {
                    str = "code";
                    break;
                }
                i6++;
            } else {
                str = "country_name";
                break;
            }
        }
        musCountryListActivity.LLJI = str;
        if (!((MusCountryListActivity) c1775970wJf.l1).LLILZLL.booleanValue()) {
            MusCountryListActivity musCountryListActivity2 = (MusCountryListActivity) c1775970wJf.l1;
            String str2 = musCountryListActivity2.LLIZ;
            String str3 = musCountryListActivity2.LLIZLLLIL;
            String str4 = musCountryListActivity2.LLJI;
            C853660XeG.LIZ.getClass();
            C0XGR c0xgr = new C0XGR();
            if (str2 != null) {
                c0xgr.LIZJ("login_panel_type", str2);
            }
            if (str3 != null) {
                c0xgr.LIZJ("page", str3);
            }
            c0xgr.LIZJ("input_type", str4);
            C20684815ws.LJIILLIIL("start_region_code_typing", c0xgr.LIZ);
            ((MusCountryListActivity) c1775970wJf.l1).LLILZLL = Boolean.TRUE;
        }
        for (C2280601EOk c2280601EOk : ((MusCountryListActivity) c1775970wJf.l1).LLILZIL) {
            if (c2280601EOk.LJ.toLowerCase().contains(lowerCase) || ((MusCountryListActivity) c1775970wJf.l1).getString(c2280601EOk.LIZ).toLowerCase().contains(lowerCase) || c2280601EOk.LIZLLL.contains(lowerCase)) {
                ((MusCountryListActivity) c1775970wJf.l1).LLILZ.add(c2280601EOk);
            }
        }
        C21630519l1 c21630519l1 = ((MusCountryListActivity) c1775970wJf.l1).LLILLJJLI;
        if (charSequence.length() == 0) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        int visibility = c21630519l1.getVisibility();
        c21630519l1.setVisibility(i4);
        C1602160rnK.LIZIZ(visibility, i4, c21630519l1);
        MusCountryListActivity musCountryListActivity3 = (MusCountryListActivity) c1775970wJf.l1;
        TuxTextView tuxTextView = musCountryListActivity3.LLILLL;
        if (!musCountryListActivity3.LLILZ.isEmpty()) {
            i5 = 8;
        }
        C786410Ut5.LLLLZLL(tuxTextView, i5);
        ((C1748570vbT) c1775970wJf.l0).notifyDataSetChanged();
    }

    public static final void onTextChanged$5(C1775970wJf c1775970wJf, CharSequence charSequence, int i, int i2, int i3) {
        String strLIZ;
        if (((C1748440vbG) c1775970wJf.l0).LLLIIIL != null) {
            String strValueOf = String.valueOf(charSequence);
            ((C1748440vbG) c1775970wJf.l0).getClass();
            strLIZ = C823380WRs.LIZ(strValueOf);
        } else {
            strLIZ = null;
        }
        ((TextWatcher) c1775970wJf.l1).onTextChanged(strLIZ, i, i2, i3);
    }
}
