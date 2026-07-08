package X;

import android.content.Context;
import android.text.Editable;
import android.widget.EditText;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.pipo.cashier.common.address.DistrictsDTO;
import com.ss.android.ugc.aweme.pipo.cashier.common.address.Region;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.Element;
import com.zhiliaoapp.musically.R;
import irm.AkS93S0100000_26;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS427S0200000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ud1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1711090ud1 extends C1711910ueL implements InterfaceC1548890qPP {
    public C1711080ud0 LLJILJIL;
    public Function1<? super String, Unit> LLJILJILJ;
    public Function1<? super List<Region>, Unit> LLJILLL;
    public Function1<? super String, Unit> LLJJ;
    public String LLJJI;

    @Override // X.C1711910ueL
    public final void LIZIZ() {
        C1711080ud0 c1711080ud0 = this.LLJILJIL;
        if (c1711080ud0 != null) {
            getEditText().removeTextChangedListener(c1711080ud0);
        }
        this.LLJILJIL = null;
        new C1548870qPN().LJI("pipo_district_panel_changed", this);
        C1748440vbG contentView = getContentView();
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(contentView);
        }
        contentView.setOnClickListener(null);
        C786410Ut5.d9(getContentView().LLJLILLLLZIIL, null);
        super.LIZIZ();
        this.LLJILJILJ = AFwS268S0000000_26.get$arr$(542);
        this.LLJILLL = AFwS268S0000000_26.get$arr$(543);
        this.LLJJ = AFwS268S0000000_26.get$arr$(544);
        this.LLJJI = null;
    }

    public final String getValue() {
        return C2204961BRm.LLJILLL(getEditText(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqhc5CA3zMRkEGe2F3/FRz8DHtueHA4i57+swHAT/GA9lW1CFXaxMPvdCxUsD3W3ojfhvyd9pCj3OfudQ==", null)).toString();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        new C1548870qPN().LJI("pipo_district_panel_changed", this);
    }

    public final Function1<String, Unit> getAfterValueChanged() {
        return this.LLJJ;
    }

    public final Function1<List<Region>, Unit> getOnSelectFinish() {
        return this.LLJILLL;
    }

    public final Function1<String, Unit> getOnValueChange() {
        return this.LLJILJILJ;
    }

    public final String getPrefilledValue() {
        return this.LLJJI;
    }

    public C1711090ud1(Context context) {
        super(context, null, 0);
        this.LLJILJILJ = AFwS268S0000000_26.get$arr$(546);
        this.LLJILLL = AFwS268S0000000_26.get$arr$(545);
        this.LLJJ = AFwS268S0000000_26.get$arr$(541);
    }

    public final void setAfterValueChanged(Function1<? super String, Unit> function1) {
        this.LLJJ = function1;
    }

    public final void setOnSelectFinish(Function1<? super List<Region>, Unit> function1) {
        this.LLJILLL = function1;
    }

    public final void setOnValueChange(Function1<? super String, Unit> function1) {
        this.LLJILJILJ = function1;
    }

    public final void setPrefilledValue(String str) {
        this.LLJJI = str;
    }

    @Override // X.InterfaceC1548890qPP
    public final void onEvent(String str, String str2) {
        if (Intrinsics.LJFF(str, "pipo_district_panel_changed")) {
            try {
                C1227904rF.LIZ.getClass();
                DistrictsDTO districtsDTO = (DistrictsDTO) C1227904rF.LIZIZ(str2, DistrictsDTO.class);
                StringBuilder sb = new StringBuilder();
                List<Region> list = districtsDTO.districts;
                if (list != null) {
                    int i = 0;
                    for (Region region : list) {
                        int i2 = i + 1;
                        if (i >= 0) {
                            Region region2 = region;
                            if (i != 0) {
                                sb.append("/");
                            }
                            sb.append(region2.name);
                            i = i2;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                }
                List<Region> list2 = districtsDTO.districts;
                if (list2 != null) {
                    this.LLJILLL.invoke(list2);
                }
                getOnVerify().invoke(sb.toString());
                getEditText().setText(sb);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0ud0] */
    @Override // X.C1711910ueL
    public final void LIZ(Element element, C1709570uaZ c1709570uaZ, String str, int i) {
        super.LIZ(element, c1709570uaZ, str, i);
        C1711080ud0 c1711080ud0 = this.LLJILJIL;
        if (c1711080ud0 != null) {
            getEditText().removeTextChangedListener(c1711080ud0);
        }
        EditText editText = getEditText();
        String str2 = this.LLJJI;
        if (str2 == null) {
            str2 = "";
        }
        editText.setText(str2);
        this.LLJILJIL = new C1710740ucS() { // from class: X.0ud0
            @Override // X.C1710740ucS, android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                this.LL.getAfterValueChanged().invoke(this.LL.getValue());
                C1708710uZB.LIZ("Cashier").LIZ(4, "BillingStateView afterValueChanged");
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                this.LL.getOnValueChange().invoke(this.LL.getValue());
                if (C1533950q1J.LJ(this.LL.getValue())) {
                    this.LL.findFocus();
                }
                C1708710uZB.LIZ("Cashier").LIZ(4, "BillingStateView onValueChanged");
            }
        };
        getEditText().addTextChangedListener(this.LLJILJIL);
        new C1548870qPN().LJI("pipo_district_panel_changed", this);
        AwS427S0200000_26 awS427S0200000_26 = new AwS427S0200000_26(this, c1709570uaZ, 68);
        C1748440vbG contentView = getContentView();
        TuxIconView tuxIconView = new TuxIconView(getContext(), null, 0, 6, null);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C1722120uuo.LIZJ(20);
        c419910GdJ.LIZJ = C1722120uuo.LIZJ(20);
        c419910GdJ.LIZ = R.raw.icon_chevron_down_small_fill;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
        tuxIconView.setTuxIcon(c419910GdJ);
        C786410Ut5.I7(new AkS93S0100000_26(awS427S0200000_26, 7), tuxIconView);
        contentView.LJFF(tuxIconView);
        new C1548870qPN().LJFF("pipo_district_panel_changed", this);
        C786410Ut5.I7(new AkS93S0100000_26(awS427S0200000_26, 6), getContentView());
        C0I7D c0i7d = getContentView().LLJLILLLLZIIL;
        c0i7d.setFocusableInTouchMode(false);
        C786410Ut5.I7(new AkS93S0100000_26(awS427S0200000_26, 8), c0i7d);
    }
}
