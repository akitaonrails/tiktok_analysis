package com.bytedance.android.btm.impl.setting;

import X.C09CT;
import X.C13BV;
import X.C1972007ny;
import com.ss.android.ugc.aweme.lazydata.LazyDataBase;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class BtmListInLogger extends LazyDataBase {

    @C09CT("btm_page_show_allowlist")
    public final List<String> btmPageShowAllowList;

    @C09CT("btm_page_show_blocklist")
    public final List<String> btmPageShowBlockList;

    @C09CT("btm_page_show_default_send")
    public final int btmPageShowDefaultSend;

    @C09CT("btm_page_show_double_report")
    public final int btmPageShowDoubleReport;

    @C09CT("btm_page_show_switch")
    public final int btmPageShowSwitch;

    @C09CT("event_allowlist")
    public final List<String> eventAllowList;

    @C09CT("event_blocklist")
    public final List<String> eventBlockList;

    @C09CT("event_default_send")
    public final int eventDefaultSend;

    @C09CT("event_double_report")
    public final int eventDoubleReport;

    @C09CT("event_switch")
    public final int eventSwitch;

    @C09CT("length")
    public final int length = 20;

    public final List<String> LIZ() {
        ArrayList arrayListLIZ = C1972007ny.LIZ(this, this.btmPageShowAllowList, String.class, "btm_page_show_allowlist");
        this.btmPageShowAllowList = arrayListLIZ;
        return arrayListLIZ;
    }

    public final List<String> LIZIZ() {
        ArrayList arrayListLIZ = C1972007ny.LIZ(this, this.btmPageShowBlockList, String.class, "btm_page_show_blocklist");
        this.btmPageShowBlockList = arrayListLIZ;
        return arrayListLIZ;
    }

    public final int LIZJ() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "btm_page_show_default_send", Integer.valueOf(this.btmPageShowDefaultSend));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.btmPageShowDefaultSend;
        this.btmPageShowDefaultSend = iIntValue;
        return iIntValue;
    }

    public final int LIZLLL() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "btm_page_show_double_report", Integer.valueOf(this.btmPageShowDoubleReport));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.btmPageShowDoubleReport;
        this.btmPageShowDoubleReport = iIntValue;
        return iIntValue;
    }

    public final int LJ() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "btm_page_show_switch", Integer.valueOf(this.btmPageShowSwitch));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.btmPageShowSwitch;
        this.btmPageShowSwitch = iIntValue;
        return iIntValue;
    }

    public final List<String> LJFF() {
        ArrayList arrayListLIZ = C1972007ny.LIZ(this, this.eventAllowList, String.class, "event_allowlist");
        this.eventAllowList = arrayListLIZ;
        return arrayListLIZ;
    }

    public final List<String> LJI() {
        ArrayList arrayListLIZ = C1972007ny.LIZ(this, this.eventBlockList, String.class, "event_blocklist");
        this.eventBlockList = arrayListLIZ;
        return arrayListLIZ;
    }

    public final int LJII() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "event_default_send", Integer.valueOf(this.eventDefaultSend));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.eventDefaultSend;
        this.eventDefaultSend = iIntValue;
        return iIntValue;
    }

    public final int LJIIIIZZ() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "event_double_report", Integer.valueOf(this.eventDoubleReport));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.eventDoubleReport;
        this.eventDoubleReport = iIntValue;
        return iIntValue;
    }

    public final int LJIIIZ() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "event_switch", Integer.valueOf(this.eventSwitch));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.eventSwitch;
        this.eventSwitch = iIntValue;
        return iIntValue;
    }

    public final int LJIIJ() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "length", Integer.valueOf(this.length));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.length;
        this.length = iIntValue;
        return iIntValue;
    }

    public BtmListInLogger() {
        C13BV c13bv = C13BV.INSTANCE;
        this.btmPageShowAllowList = c13bv;
        this.btmPageShowBlockList = c13bv;
        this.eventAllowList = c13bv;
        this.eventBlockList = c13bv;
    }
}
